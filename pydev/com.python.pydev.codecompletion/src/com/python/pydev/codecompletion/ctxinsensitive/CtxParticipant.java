/**
 * Copyright (c) 2005-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
/*
 * Created on 07/09/2005
 */
package com.python.pydev.codecompletion.ctxinsensitive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.python.pydev.core.FullRepIterable;
import org.python.pydev.core.ICodeCompletionASTManager;
import org.python.pydev.core.ICompletionCache;
import org.python.pydev.core.ICompletionState;
import org.python.pydev.core.IDefinition;
import org.python.pydev.core.ILocalScope;
import org.python.pydev.core.IModule;
import org.python.pydev.core.IPythonNature;
import org.python.pydev.core.IToken;
import org.python.pydev.core.MisconfigurationException;
import org.python.pydev.core.docutils.PySelection.ActivationTokenAndQual;
import org.python.pydev.core.log.Log;
import org.python.pydev.core.structure.CompletionRecursionException;
import org.python.pydev.editor.codecompletion.CompletionRequest;
import org.python.pydev.editor.codecompletion.IPyDevCompletionParticipant;
import org.python.pydev.editor.codecompletion.IPyDevCompletionParticipant2;
import org.python.pydev.editor.codecompletion.IPyDevCompletionParticipant3;
import org.python.pydev.editor.codecompletion.ProposalsComparator.CompareContext;
import org.python.pydev.editor.codecompletion.PyCodeCompletionPreferencesPage;
import org.python.pydev.editor.codecompletion.PyCodeCompletionUtils;
import org.python.pydev.editor.codecompletion.PyCodeCompletionUtils.IFilter;
import org.python.pydev.editor.codecompletion.revisited.modules.SourceModule;
import org.python.pydev.editor.codecompletion.revisited.modules.SourceToken;
import org.python.pydev.editor.codecompletion.revisited.visitors.AbstractVisitor;
import org.python.pydev.editor.codecompletion.revisited.visitors.Definition;
import org.python.pydev.editor.model.ItemPointer;
import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.FunctionDef;
import org.python.pydev.parser.jython.ast.Name;
import org.python.pydev.parser.jython.ast.Str;
import org.python.pydev.parser.jython.ast.StrJoin;
import org.python.pydev.parser.jython.ast.decoratorsType;
import org.python.pydev.parser.jython.ast.keywordType;
import org.python.pydev.parser.visitors.NodeUtils;
import org.python.pydev.plugin.nature.SystemPythonNature;
import org.python.pydev.shared_core.string.FastStringBuffer;
import org.python.pydev.shared_core.structure.FastStack;
import org.python.pydev.shared_core.structure.LinkedListWarningOnSlowOperations;
import org.python.pydev.shared_interactive_console.console.ui.IScriptConsoleViewer;
import org.python.pydev.shared_ui.proposals.IPyCompletionProposal;
import org.python.pydev.shared_ui.proposals.PyCompletionProposal;

import com.astra.ses.spell.dev.database.DatabaseManager;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument;
import com.python.pydev.analysis.AnalysisPlugin;
import com.python.pydev.analysis.CtxInsensitiveImportComplProposal;
import com.python.pydev.analysis.additionalinfo.AbstractAdditionalTokensInfo;
import com.python.pydev.analysis.additionalinfo.AdditionalProjectInterpreterInfo;
import com.python.pydev.analysis.additionalinfo.AdditionalSystemInterpreterInfo;
import com.python.pydev.analysis.additionalinfo.IInfo;
import com.python.pydev.analysis.ui.AutoImportsPreferencesPage;
import com.python.pydev.codecompletion.ui.CodeCompletionPreferencesPage;

/**
 * Provides the completions in a context-insensitive way for classes and methods (both for the editor or the console).
 *
 * @author Fabio
 */
public class CtxParticipant
        implements IPyDevCompletionParticipant, IPyDevCompletionParticipant2, IPyDevCompletionParticipant3 {

    private final class ParentVisitor extends AbstractVisitor {
        private final SimpleNode[] result;
        private final int line;
        private final int col;
        SimpleNode parent = null;

        private ParentVisitor(IPythonNature nature, SimpleNode[] result, int line, int col, SimpleNode parent) {
            super(nature);
            this.result = result;
            this.line = line;
            this.col = col;
            this.parent = parent;
        }

        @Override
        protected Object unhandled_node(SimpleNode node) throws Exception {
            node.parent = parent;

            if (node.beginLine <= line && node.beginColumn <= col &&
                    (result[0] == null ||
                            (node.beginLine == result[0].beginLine && node.beginColumn >= result[0].beginColumn) ||
                            (node.beginLine > result[0].beginLine))) {
                result[0] = node;
            }
            return null;
        }

        @Override
        public void traverse(SimpleNode node) throws Exception {
            node.parent = parent;
            node.traverse(new ParentVisitor(nature, result, line, col, node));
        }
    }

    // Console completions ---------------------------------------------------------------------------------------------

    /**
     * IPyDevCompletionParticipant2
     */
    @Override
    public Collection<ICompletionProposal> computeConsoleCompletions(ActivationTokenAndQual tokenAndQual,
            Set<IPythonNature> naturesUsed, IScriptConsoleViewer viewer, int requestOffset) {
        List<ICompletionProposal> completions = new ArrayList<ICompletionProposal>();
        if (tokenAndQual.activationToken != null && tokenAndQual.activationToken.length() > 0) {
            //we only want
            return completions;
        }

        String qual = tokenAndQual.qualifier;
        if (qual.length() >= CodeCompletionPreferencesPage.getCharsForContextInsensitiveGlobalTokensCompletion()
                && naturesUsed != null && naturesUsed.size() > 0) { //at least n characters required...
            boolean addAutoImport = AutoImportsPreferencesPage.doAutoImport();
            int qlen = qual.length();
            boolean useSubstringMatchInCodeCompletion = PyCodeCompletionPreferencesPage
                    .getUseSubstringMatchInCodeCompletion();
            IFilter nameFilter = PyCodeCompletionUtils.getNameFilter(useSubstringMatchInCodeCompletion, qual);

            for (IPythonNature nature : naturesUsed) {
                AbstractAdditionalTokensInfo additionalInfo;
                try {
                    if (nature instanceof SystemPythonNature) {
                        SystemPythonNature systemPythonNature = (SystemPythonNature) nature;
                        additionalInfo = AdditionalSystemInterpreterInfo.getAdditionalSystemInfo(
                                systemPythonNature.getRelatedInterpreterManager(),
                                systemPythonNature.getProjectInterpreter().getExecutableOrJar());

                        fillNatureCompletionsForConsole(viewer, requestOffset, completions, qual, addAutoImport, qlen,
                                nameFilter, nature, additionalInfo, useSubstringMatchInCodeCompletion);

                    } else {
                        additionalInfo = AdditionalProjectInterpreterInfo.getAdditionalInfoForProject(nature);
                        fillNatureCompletionsForConsole(viewer, requestOffset, completions, qual, addAutoImport, qlen,
                                nameFilter, nature, additionalInfo, useSubstringMatchInCodeCompletion);
                    }
                } catch (MisconfigurationException e) {
                    Log.log(e);
                }
            }

        }
        return completions;

    }

    private void fillNatureCompletionsForConsole(IScriptConsoleViewer viewer, int requestOffset,
            List<ICompletionProposal> completions, String qual, boolean addAutoImport, int qlen, IFilter nameFilter,
            IPythonNature nature, AbstractAdditionalTokensInfo additionalInfo,
            boolean useSubstringMatchInCodeCompletion) {
        Collection<IInfo> tokensStartingWith;
        if (useSubstringMatchInCodeCompletion) {
            tokensStartingWith = additionalInfo.getTokensStartingWith("",
                    AbstractAdditionalTokensInfo.TOP_LEVEL);

        } else {
            tokensStartingWith = additionalInfo.getTokensStartingWith(qual,
                    AbstractAdditionalTokensInfo.TOP_LEVEL);
        }

        FastStringBuffer realImportRep = new FastStringBuffer();
        FastStringBuffer displayString = new FastStringBuffer();
        FastStringBuffer tempBuf = new FastStringBuffer();
        boolean doIgnoreImportsStartingWithUnder = AutoImportsPreferencesPage.doIgnoreImportsStartingWithUnder();
        CompareContext compareContext = new CompareContext(nature);
        for (IInfo info : tokensStartingWith) {
            //there always must be a declaringModuleName
            String declaringModuleName = info.getDeclaringModuleName();
            boolean hasInit = false;
            if (declaringModuleName.endsWith(".__init__")) {
                declaringModuleName = declaringModuleName.substring(0, declaringModuleName.length() - 9);//remove the .__init__
                hasInit = true;
            }

            String rep = info.getName();
            if (!nameFilter.acceptName(rep)) {
                continue;
            }

            if (addAutoImport) {
                realImportRep.clear();
                realImportRep.append("from ");
                realImportRep.append(AutoImportsPreferencesPage.removeImportsStartingWithUnderIfNeeded(
                        declaringModuleName, tempBuf, doIgnoreImportsStartingWithUnder));
                realImportRep.append(" import ");
                realImportRep.append(rep);
            }

            displayString.clear();
            displayString.append(rep);
            displayString.append(" - ");
            displayString.append(declaringModuleName);
            if (hasInit) {
                displayString.append(".__init__");
            }

            String displayAsStr = displayString.toString();
            PyConsoleCompletion proposal = new PyConsoleCompletion(rep, requestOffset - qlen, qlen,
                    realImportRep.length(), AnalysisPlugin.getImageForAutoImportTypeInfo(info),
                    displayAsStr, (IContextInformation) null, "",
                    displayAsStr.equals(qual) ? IPyCompletionProposal.PRIORITY_GLOBALS_EXACT
                            : IPyCompletionProposal.PRIORITY_GLOBALS,
                    realImportRep.toString(), viewer, compareContext);

            completions.add(proposal);
        }
    }

    // Editor completions ----------------------------------------------------------------------------------------------

    private Collection<CtxInsensitiveImportComplProposal> getThem(CompletionRequest request, ICompletionState state,
            boolean addAutoImport) throws MisconfigurationException {

        ArrayList<CtxInsensitiveImportComplProposal> completions = new ArrayList<CtxInsensitiveImportComplProposal>();
        if (request.isInCalltip) {
            return completions;
        }

        HashSet<String> importedNames = getImportedNames(state);

        String qual = request.qualifier;
        if (qual.length() >= CodeCompletionPreferencesPage.getCharsForContextInsensitiveGlobalTokensCompletion()) { //at least n characters required...

            IFilter nameFilter = PyCodeCompletionUtils.getNameFilter(request.useSubstringMatchInCodeCompletion, qual);
            String initialModule = request.resolveModule();

            List<IInfo> tokensStartingWith;
            if (request.useSubstringMatchInCodeCompletion) {
                tokensStartingWith = AdditionalProjectInterpreterInfo.getTokensStartingWith("",
                        request.nature, AbstractAdditionalTokensInfo.TOP_LEVEL);
            } else {
                tokensStartingWith = AdditionalProjectInterpreterInfo.getTokensStartingWith(qual,
                        request.nature, AbstractAdditionalTokensInfo.TOP_LEVEL);
            }

            FastStringBuffer realImportRep = new FastStringBuffer();
            FastStringBuffer displayString = new FastStringBuffer();
            FastStringBuffer tempBuf = new FastStringBuffer();

            boolean doIgnoreImportsStartingWithUnder = AutoImportsPreferencesPage.doIgnoreImportsStartingWithUnder();

            for (IInfo info : tokensStartingWith) {
                //there always must be a declaringModuleName
                String declaringModuleName = info.getDeclaringModuleName();
                if (initialModule != null && declaringModuleName != null) {
                    if (initialModule.equals(declaringModuleName)) {
                        continue;
                    }
                }
                boolean hasInit = false;
                if (declaringModuleName.endsWith(".__init__")) {
                    declaringModuleName = declaringModuleName.substring(0, declaringModuleName.length() - 9);//remove the .__init__
                    hasInit = true;
                }

                String rep = info.getName();
                if (!nameFilter.acceptName(rep) || importedNames.contains(rep)) {
                    continue;
                }

                if (addAutoImport) {
                    realImportRep.clear();
                    realImportRep.append("from ");
                    realImportRep.append(AutoImportsPreferencesPage.removeImportsStartingWithUnderIfNeeded(
                            declaringModuleName, tempBuf, doIgnoreImportsStartingWithUnder));
                    realImportRep.append(" import ");
                    realImportRep.append(rep);
                }

                displayString.clear();
                displayString.append(rep);
                displayString.append(" - ");
                displayString.append(declaringModuleName);
                if (hasInit) {
                    displayString.append(".__init__");
                }

                String displayAsStr = displayString.toString();
                CtxInsensitiveImportComplProposal proposal = new CtxInsensitiveImportComplProposal(rep,
                        request.documentOffset - request.qlen, request.qlen, realImportRep.length(),
                        AnalysisPlugin.getImageForAutoImportTypeInfo(info), displayAsStr,
                        (IContextInformation) null, "",
                        displayAsStr.equals(qual) ? IPyCompletionProposal.PRIORITY_GLOBALS_EXACT
                                : IPyCompletionProposal.PRIORITY_GLOBALS,
                        realImportRep.toString(),
                        new CompareContext(info.getNature()));

                completions.add(proposal);
            }

        }
        return completions;
    }

    /**
     * @return the names that are already imported in the current document
     */
    private HashSet<String> getImportedNames(ICompletionState state) {
        List<IToken> tokenImportedModules = state.getTokenImportedModules();
        HashSet<String> importedNames = new HashSet<String>();
        if (tokenImportedModules != null) {
            for (IToken token : tokenImportedModules) {
                importedNames.add(token.getRepresentation());
            }
        }
        return importedNames;
    }

    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Collection getGlobalCompletions(CompletionRequest request, ICompletionState state)
            throws MisconfigurationException {
        return getThem(request, state, AutoImportsPreferencesPage.doAutoImport());
    }

    @Override
    public IDefinition findDefinitionForMethodParameter(Definition d, IPythonNature nature,
            ICompletionCache completionCache) {
        if (d.ast instanceof Name) {
            Name name = (Name) d.ast;
            if (name.ctx == Name.Param) {
                if (d.scope != null && !d.scope.getScopeStack().empty()) {
                    Object peek = d.scope.getScopeStack().peek();
                    if (peek instanceof FunctionDef) {
                        FunctionDef functionDef = (FunctionDef) peek;
                        String representationString = NodeUtils.getRepresentationString(functionDef);
                        if (representationString != null && representationString.startsWith("test")) {
                            ItemPointer itemPointer = findItemPointerFromPyTestFixture(nature, completionCache,
                                    name.id);
                            if (itemPointer != null) {
                                return itemPointer.definition;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private ItemPointer findItemPointerFromPyTestFixture(IPythonNature nature, ICompletionCache completionCache,
            String fixtureName) {
        try {
            ICodeCompletionASTManager astManager = nature.getAstManager();
            if (astManager != null) {
                List<IInfo> tokensEqualTo = AdditionalProjectInterpreterInfo.getTokensEqualTo(
                        fixtureName, nature, AdditionalProjectInterpreterInfo.TOP_LEVEL);
                for (IInfo iInfo : tokensEqualTo) {
                    List<ItemPointer> pointers = new LinkedListWarningOnSlowOperations<>();
                    AnalysisPlugin.getDefinitionFromIInfo(pointers, astManager, nature, iInfo,
                            completionCache);
                    for (ItemPointer itemPointer : pointers) {
                        if (itemPointer.definition.ast instanceof FunctionDef) {
                            FunctionDef functionDef = (FunctionDef) itemPointer.definition.ast;
                            if (functionDef.decs != null) {
                                for (decoratorsType dec : functionDef.decs) {
                                    String decoratorFuncName = NodeUtils.getRepresentationString(dec.func);
                                    if (decoratorFuncName != null) {
                                        if (FIXTURE_PATTERN.matcher(decoratorFuncName).find()
                                                || YIELD_FIXTURE_PATTERN.matcher(decoratorFuncName)
                                                        .find()) {
                                            return itemPointer;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (MisconfigurationException e1) {
            Log.log(e1);
        }
        return null;
    }

    private final static Pattern FIXTURE_PATTERN = Pattern.compile("\\bfixture\\b");
    private final static Pattern YIELD_FIXTURE_PATTERN = Pattern.compile("\\byield_fixture\\b");

    /**
     * IPyDevCompletionParticipant
     * @throws CompletionRecursionException 
     */
    @Override
    public Collection<IToken> getCompletionsForMethodParameter(ICompletionState state, ILocalScope localScope,
            Collection<IToken> interfaceForLocal) throws CompletionRecursionException {
        ArrayList<IToken> ret = new ArrayList<IToken>();
        String qual = state.getQualifier();
        String activationToken = state.getActivationToken();

        FastStack scopeStack = localScope.getScopeStack();
        if (!scopeStack.empty()) {
            Object peek = scopeStack.peek();
            if (peek instanceof FunctionDef) {
                FunctionDef testFuncDef = (FunctionDef) peek;
                String representationString = NodeUtils.getRepresentationString(testFuncDef);
                if (representationString != null && representationString.startsWith("test")) {
                    ICodeCompletionASTManager astManager = state.getNature().getAstManager();
                    if (astManager != null) {
                        ItemPointer itemPointer = findItemPointerFromPyTestFixture(state.getNature(), state,
                                activationToken);
                        if (itemPointer != null) {
                            List<IToken> completionsFromItemPointer = getCompletionsFromItemPointer(state, astManager,
                                    itemPointer);
                            if (completionsFromItemPointer != null && completionsFromItemPointer.size() > 0) {
                                return completionsFromItemPointer;
                            }
                        }
                    }
                }
            }
        }

        if (qual.length() >= CodeCompletionPreferencesPage.getCharsForContextInsensitiveGlobalTokensCompletion()) { //at least n characters

            // if we have a parameter, do code-completion with all available tokens, since we don't know what's the type which
            // may actually be received
            boolean useSubstringMatchInCodeCompletion = PyCodeCompletionPreferencesPage
                    .getUseSubstringMatchInCodeCompletion();
            List<IInfo> tokensStartingWith;
            if (useSubstringMatchInCodeCompletion) {
                IFilter nameFilter = PyCodeCompletionUtils.getNameFilter(useSubstringMatchInCodeCompletion, qual);
                try {
                    tokensStartingWith = AdditionalProjectInterpreterInfo.getTokensStartingWith("", state.getNature(),
                            AbstractAdditionalTokensInfo.INNER);
                } catch (MisconfigurationException e) {
                    Log.log(e);
                    return ret;
                }
                for (IInfo info : tokensStartingWith) {
                    if (nameFilter.acceptName(info.getName())) {
                        ret.add(new SourceToken(null, info.getName(), null, null, info.getDeclaringModuleName(),
                                info.getType(), info.getNature()));
                    }
                }
            } else {
                try {
                    tokensStartingWith = AdditionalProjectInterpreterInfo.getTokensStartingWith(qual, state.getNature(),
                            AbstractAdditionalTokensInfo.INNER);
                } catch (MisconfigurationException e) {
                    Log.log(e);
                    return ret;
                }
                for (IInfo info : tokensStartingWith) {
                    ret.add(new SourceToken(null, info.getName(), null, null, info.getDeclaringModuleName(),
                            info.getType(), info.getNature()));
                }
            }

        }
        return ret;
    }

    private List<IToken> getCompletionsFromItemPointer(ICompletionState state, ICodeCompletionASTManager astManager,
            ItemPointer itemPointer) throws CompletionRecursionException {
        int initialLookingFor = state.getLookingFor();
        try {
            state.setLookingFor(
                    ICompletionState.LOOKING_FOR_INSTANCED_VARIABLE);
            List<IToken> completionFromFuncDefReturn = astManager
                    .getCompletionFromFuncDefReturn(state,
                            itemPointer.definition.module,
                            itemPointer.definition, true);
            if (completionFromFuncDefReturn != null
                    && completionFromFuncDefReturn.size() > 0) {
                return completionFromFuncDefReturn;
            }
        } finally {
            state.setLookingFor(initialLookingFor, true);
        }
        return null;
    }

    /**
     * IPyDevCompletionParticipant
     * @throws MisconfigurationException
     */
    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Collection getStringGlobalCompletions(CompletionRequest request, ICompletionState state)
            throws MisconfigurationException {
        String qualifier = request.qualifier;
        if ("T ".equals(qualifier)) {
            int offset = request.calltipOffset;
            int fullLength = request.offsetForKeywordParam;
            String tm = state.getActivationToken();
            ISpellDatabase projectDatabase = DatabaseManager.getInstance()
                    .getProjectDatabase(request.getNature().getProject());
            if (projectDatabase != null) {
                Collection<String> telecommandNames = projectDatabase.getTelemetryParameterNames();
                tm = tm.replaceAll("\r?\n", "").replaceAll("\\{\\w*\\}", ".*");
                Pattern p = Pattern.compile(tm + ".*");
                Matcher matcher = p.matcher(tm);
                ArrayList<ICompletionProposal> completions = new ArrayList<ICompletionProposal>();

                for (String tmParam : telecommandNames) {
                    matcher.reset(tmParam);
                    if (matcher.find()) {

                        String compl = "T " + tmParam + " "
                                + projectDatabase.getTelemetryModel(tmParam).getDescription();

                        PyCompletionProposal pyCompletionProposal = new PyCompletionProposal(compl, offset,
                                fullLength, compl.length(),
                                PyCompletionProposal.PRIORITY_DEFAULT);

                        completions.add(pyCompletionProposal);
                        request.useSubstringMatchInCodeCompletion = false;
                    }
                }
                try {
                    int line = request.doc.getLineOfOffset(offset);
                    IRegion prevLine = request.doc.getLineInformation(line - 1);
                    String nextLine = request.doc.get(prevLine.getOffset(), prevLine.getLength());

                    Collections.sort(completions, new Comparator<ICompletionProposal>() {

                        @Override
                        public int compare(ICompletionProposal arg0, ICompletionProposal arg1) {
                            // TODO Auto-generated method stub
                            return arg0.getDisplayString().compareTo(arg1.getDisplayString());
                        }
                    });

                    int nextPriority = 0;
                    for (ICompletionProposal iCompletionProposal : completions) {
                        if (nextPriority != 0) {
                            ((PyCompletionProposal) iCompletionProposal).setPriority(nextPriority);
                            nextPriority = 0;
                        }
                        String display = iCompletionProposal.getDisplayString();
                        if (nextLine.contains(display.split(" ")[1])) {
                            nextPriority = -1;
                        }
                    }

                } catch (BadLocationException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                return completions;
            }
        } else if ("C ".equals(qualifier)) {

            int offset = request.calltipOffset;
            String tc = state.getActivationToken();
            int fullLength = request.offsetForKeywordParam;
            ISpellDatabase projectDatabase = DatabaseManager.getInstance()
                    .getProjectDatabase(request.getNature().getProject());
            if (projectDatabase != null) {
                Collection<String> telecommandNames = projectDatabase.getTelecommandNames();
                tc = tc.replaceAll("\r?\n", "").replaceAll("\\{\\w*\\}", ".*");
                Pattern p = Pattern.compile(tc + ".*");
                Matcher matcher = p.matcher(tc);
                ArrayList<ICompletionProposal> completions = new ArrayList<ICompletionProposal>();

                for (String tcParam : telecommandNames) {
                    matcher.reset(tcParam);
                    if (matcher.find()) {
                        String compl = "C " + tcParam + " "
                                + projectDatabase.getTelecommandModel(tcParam).getDescription();
                        PyCompletionProposal pyCompletionProposal = new PyCompletionProposal(compl, offset,
                                fullLength, compl.length(),
                                PyCompletionProposal.PRIORITY_DEFAULT);
                        completions.add(pyCompletionProposal);
                        request.useSubstringMatchInCodeCompletion = false;
                    }
                }

                try {
                    int line = request.doc.getLineOfOffset(offset);
                    IRegion prevLine = request.doc.getLineInformation(line - 1);
                    String nextLine = request.doc.get(prevLine.getOffset(), prevLine.getLength());

                    Collections.sort(completions, new Comparator<ICompletionProposal>() {

                        @Override
                        public int compare(ICompletionProposal arg0, ICompletionProposal arg1) {
                            // TODO Auto-generated method stub
                            return arg0.getDisplayString().compareTo(arg1.getDisplayString());
                        }
                    });

                    int nextPriority = 0;
                    for (ICompletionProposal iCompletionProposal : completions) {
                        if (nextPriority != 0) {
                            ((PyCompletionProposal) iCompletionProposal).setPriority(nextPriority);
                            nextPriority = 0;
                        }
                        String display = iCompletionProposal.getDisplayString();
                        if (nextLine.contains(display.split(" ")[1])) {
                            nextPriority = -1;
                        }
                    }

                } catch (BadLocationException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                return completions;
            }
        }

        ISpellDatabase projectDatabase = DatabaseManager.getInstance()
                .getProjectDatabase(request.getNature().getProject());
        if (projectDatabase != null) {

            int cursor = request.documentOffset;
            try {
                final int line = request.doc.getLineOfOffset(cursor) + 1;
                final int col = cursor - request.doc.getLineOffset(line - 1);
                final SimpleNode[] result = new SimpleNode[] { null };
                SourceModule module = (SourceModule) request.getModule();
                try {
                    module.getAst()
                            .traverse(new ParentVisitor(request.getNature(), result, line, col, module.getAst()));
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (result[0] == null) {
                    return Collections.EMPTY_LIST;
                }
                SimpleNode parent = result[0].parent;
                if (result[0] instanceof Str && parent instanceof org.python.pydev.parser.jython.ast.List &&
                        ((org.python.pydev.parser.jython.ast.List) parent).elts[0].equals(result[0]) &&
                        parent.parent instanceof org.python.pydev.parser.jython.ast.List &&
                        parent.parent.parent instanceof Call) {
                    Call potCall = (Call) parent.parent.parent;
                    String name = potCall.func.toString();
                    if (name.contains("BuildTC") || name.contains("Send")) {
                        for (keywordType kw : potCall.keywords) {
                            String kwName = kw.arg.toString();
                            if (kwName.contains("id=args") && kw.value.equals(parent.parent)) {
                                String cmdName = "";
                                if (potCall.args.length > 0) {

                                    cmdName = ((Str) potCall.args[0]).s;
                                } else {
                                    for (keywordType cmdKw : potCall.keywords) {
                                        kwName = cmdKw.arg.toString();
                                        if (kwName.contains("id=command")) {
                                            if (cmdKw.value instanceof Str) {
                                                cmdName = ((Str) cmdKw.value).s;
                                            } else {
                                                cmdName = ((Str) ((StrJoin) cmdKw.value).strs[0]).s;
                                            }

                                            break;
                                        }
                                    }
                                }
                                if (cmdName.startsWith("C ")) {
                                    cmdName = cmdName.split(" ")[1];
                                }
                                ITelecommand tcModel = projectDatabase.getTelecommandModel(cmdName);
                                if (tcModel != null) {
                                    ArrayList<ICompletionProposal> completions = new ArrayList<ICompletionProposal>();
                                    Pattern p = Pattern.compile(request.qualifier + ".*");
                                    Matcher matcher = p.matcher("");

                                    for (ITelecommandArgument tcArg : tcModel.getArguments()) {
                                        matcher.reset(tcArg.getName());
                                        if (matcher.find()) {
                                            PyCompletionProposal pyCompletionProposal = new PyCompletionProposal(
                                                    tcArg.getName(), cursor - request.qualifier.length(),
                                                    request.fullQualifier.length(), tcArg.getName().length(),
                                                    PyCompletionProposal.PRIORITY_DEFAULT);
                                            completions.add(pyCompletionProposal);
                                        }
                                    }
                                    if (!completions.isEmpty()) {
                                        return completions;
                                    }
                                }
                            }
                        }
                    }
                }

            } catch (BadLocationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return getThem(request, state, false);
    }

    @Override
    public Collection<Object> getArgsCompletion(ICompletionState state, ILocalScope localScope,
            Collection<IToken> interfaceForLocal) {
        throw new RuntimeException("Deprecated");
    }

    @Override
    public Collection<IToken> getCompletionsForTokenWithUndefinedType(ICompletionState state, ILocalScope localScope,
            Collection<IToken> interfaceForLocal) throws CompletionRecursionException {
        return getCompletionsForMethodParameter(state, localScope, interfaceForLocal);
    }

    @Override
    public Collection<IToken> getCompletionsForType(ICompletionState state) throws CompletionRecursionException {
        String activationToken = state.getActivationToken();
        String qual = activationToken;

        String module = null;
        if (activationToken.indexOf('.') != -1) {
            String[] headAndTail = FullRepIterable.headAndTail(activationToken);
            qual = headAndTail[1];
            module = headAndTail[0];
        }

        try {
            IPythonNature nature = state.getNature();
            List<IInfo> tokensStartingWith = AdditionalProjectInterpreterInfo.getTokensEqualTo(qual,
                    nature, AbstractAdditionalTokensInfo.TOP_LEVEL | AbstractAdditionalTokensInfo.INNER);
            int size = tokensStartingWith.size();
            if (size == 0) {
                return null;
            }
            if (size == 1) {
                return getCompletionsForIInfo(state, nature, tokensStartingWith.get(0));
            }
            //If we got here, we have more than 1 choice: let's try to find it given the module.
            if (module != null) {
                for (int i = 0; i < size; i++) {
                    IInfo iInfo = tokensStartingWith.get(i);
                    if (module.equals(iInfo.getDeclaringModuleName())) {
                        List<IToken> ret = getCompletionsForIInfo(state, nature, iInfo);
                        if (ret != null && ret.size() > 0) {
                            return ret; //seems like we found it.
                        }
                    }
                }
            }

            //Couldn't find an exact match: go for the type (prefer classes).
            ArrayList<IInfo> newList = new ArrayList<IInfo>();
            for (int i = 0; i < size; i++) {
                IInfo iInfo = tokensStartingWith.get(i);
                if (iInfo.getType() == IInfo.CLASS_WITH_IMPORT_TYPE) {
                    newList.add(iInfo);
                }
            }
            tokensStartingWith = newList;
            size = tokensStartingWith.size();
            if (size == 0) {
                return null;
            }
            if (size == 1) {
                return getCompletionsForIInfo(state, nature, tokensStartingWith.get(0));
            }
            if (size < 5) { // Don't go for it if we have too many things there!
                List<IToken> ret = new ArrayList<IToken>();
                for (int i = 0; i < size; i++) {
                    IInfo iInfo = tokensStartingWith.get(i);
                    List<IToken> found = getCompletionsForIInfo(state, nature, iInfo);
                    if (found != null) {
                        ret.addAll(found);
                    }
                }
                return ret;
            }
            return null; //Too many matches: skip this one (instead of returning something random).

        } catch (MisconfigurationException e) {
            return null;
        }

    }

    /**
     * Gets completions given a module and related info.
     */
    private List<IToken> getCompletionsForIInfo(ICompletionState state, IPythonNature nature, IInfo iInfo)
            throws CompletionRecursionException {
        ICompletionState copy = state.getCopy();
        String path = iInfo.getPath();
        String act = iInfo.getName();
        if (path != null) {
            act = path + "." + act;
        }

        copy.setActivationToken(act);

        ICodeCompletionASTManager manager = nature.getAstManager();
        IModule mod = manager.getModule(iInfo.getDeclaringModuleName(), nature, true);
        if (mod != null) {

            state.checkFindDefinitionMemory(mod, iInfo.getDeclaringModuleName() + "." + act);
            IToken[] tks = manager.getCompletionsForModule(mod, copy);
            if (tks != null) {
                return Arrays.asList(tks);
            }
        }
        return null;
    }
}