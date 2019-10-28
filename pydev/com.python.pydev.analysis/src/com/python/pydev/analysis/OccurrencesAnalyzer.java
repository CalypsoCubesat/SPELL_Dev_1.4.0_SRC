/**
 * Copyright (c) 2005-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
/*
 * Created on 19/07/2005
 */
package com.python.pydev.analysis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.text.IDocument;
import org.python.pydev.builder.pep8.Pep8Visitor;
import org.python.pydev.core.IIndentPrefs;
import org.python.pydev.core.IPythonNature;
import org.python.pydev.core.docutils.PySelection;
import org.python.pydev.core.log.Log;
import org.python.pydev.editor.codecompletion.revisited.modules.SourceModule;
import org.python.pydev.editor.codecompletion.revisited.modules.SourceToken;
import org.python.pydev.parser.jython.SimpleNode;

import com.astra.ses.spell.dev.scheck.ISemanticCheckProgress;
import com.astra.ses.spell.dev.scheck.SemanticsChecker;
import com.astra.ses.spell.dev.scheck.interfaces.ComparableResource;
import com.astra.ses.spell.dev.scheck.interfaces.IIssue;
import com.astra.ses.spell.dev.scheck.interfaces.IIssueList;
import com.python.pydev.analysis.messages.CompositeMessage;
import com.python.pydev.analysis.messages.IMessage;
import com.python.pydev.analysis.messages.Message;
import com.python.pydev.analysis.tabnanny.TabNanny;
import com.python.pydev.analysis.visitors.OccurrencesVisitor;

/**
 * This class is responsible for starting the analysis of a given module.
 * 
 * @author Fabio
 */
public class OccurrencesAnalyzer {

    private final class ISemanticCheckProgressImplementation implements ISemanticCheckProgress {
        @Override
        public void worked(int work) {
            // TODO Auto-generated method stub

        }

        @Override
        public void subTask(String name) {
            // TODO Auto-generated method stub

        }

        @Override
        public void setTaskName(String name) {
            // TODO Auto-generated method stub

        }

        @Override
        public void setCanceled(boolean value) {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean isCanceled() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void internalWorked(double work) {
            // TODO Auto-generated method stub

        }

        @Override
        public void done() {
            // TODO Auto-generated method stub

        }

        @Override
        public void beginTask(String name, int totalWork) {
            // TODO Auto-generated method stub

        }

        @Override
        public void fileFinished(IFile file, SemanticCheckStatus status, int numWarnings, int numErrors) {
            // TODO Auto-generated method stub

        }

        @Override
        public void checkFinished() {
            // TODO Auto-generated method stub

        }
    }

    public IMessage[] analyzeDocument(IPythonNature nature, final SourceModule module,
            final IAnalysisPreferences prefs,
            final IDocument document, final IProgressMonitor monitor, IIndentPrefs indentPrefs) {

        //Do pep8 in a thread.
        final List<IMessage> pep8Messages = new ArrayList<>();
        Thread t = new Thread() {
            @Override
            public void run() {
                pep8Messages.addAll(new Pep8Visitor().getMessages(module, document, monitor, prefs));
            }
        };
        t.start();
        OccurrencesVisitor visitor = new OccurrencesVisitor(nature, module.getName(), module, prefs, document, monitor);
        try {
            SimpleNode ast = module.getAst();
            if (ast != null) {
                if (nature.startRequests()) {
                    try {
                        ast.accept(visitor);
                    } finally {
                        nature.endRequests();
                    }
                }
            }
        } catch (OperationCanceledException e) {
            throw e;
        } catch (Exception e) {
            Log.log(IStatus.ERROR, ("Error while visiting " + module.getName() + " (" + module.getFile() + ")"), e);
        }

        List<IMessage> messages = new ArrayList<IMessage>();
        if (!monitor.isCanceled()) {
            messages = visitor.getMessages();
            try {
                messages.addAll(TabNanny.analyzeDoc(document, prefs, module.getName(), indentPrefs, monitor));
            } catch (Exception e) {
                Log.log(e); //just to be safe... (could happen if the document changes during the process).
            }
        }

        if (!monitor.isCanceled()) {
            try {
                t.join();
                messages.addAll(pep8Messages);
            } catch (InterruptedException e) {
                //If interrupted keep on going as it is.
            }
        }

        for (Iterator<IMessage> iterator = messages.iterator(); iterator.hasNext();) {
            IMessage iMessage = iterator.next();
            if (iMessage != null && iMessage.getGenerator() != null
                    && iMessage.getGenerator().getLineDefinition() < 0) {
                iterator.remove();
                continue;
            }
            if (iMessage instanceof CompositeMessage) {
                if (((CompositeMessage) iMessage).getGenerator() instanceof SourceToken) {
                    SourceToken token = (SourceToken) ((CompositeMessage) iMessage).getGenerator();

                    if ("math".equals(token.getRepresentation()) || iMessage.getStartLine(document) == -1) {
                        iterator.remove();
                    }

                }

            }
        }
        long start = System.nanoTime();
        SemanticsChecker checker = SemanticsChecker.instance();
        Map<ComparableResource, IIssueList> issues = new HashMap<ComparableResource, IIssueList>();
        checker.check(Arrays.asList((IFile) prefs.getProjectAdaptable()), issues,
                new ISemanticCheckProgressImplementation(), module.getAst());

        for (Entry<ComparableResource, IIssueList> issueList : issues.entrySet()) {
            ComparableResource key = issueList.getKey();
            IIssueList value = issueList.getValue();

            for (IIssue issue : value.getIssues()) {
                IMessage iMessage = getIMessage(issue, prefs);
                String messageToIgnore = prefs.getRequiredMessageToIgnore(iMessage.getType());
                if (messageToIgnore != null) {
                    int startLine = iMessage.getStartLine(document) - 1;
                    String line = PySelection.getLine(document, startLine);
                    if (line.indexOf(messageToIgnore) != -1) {
                        //keep going... nothing to see here...
                        continue;
                    }
                }

                messages.add(iMessage);
            }

        }
        long dur = System.nanoTime() - start;
        System.out.println("Analysis time taken: " + (dur / 1000000) + " ms");
        return messages.toArray(new IMessage[messages.size()]);
    }

    private IMessage getIMessage(IIssue issue, IAnalysisPreferences prefs) {

        int startLine = issue.getLine();
        int startCol = issue.getColStart((IResource) prefs.getProjectAdaptable());
        int endCol = issue.getColEnd((IResource) prefs.getProjectAdaptable());
        int type = IAnalysisPreferences.TYPE_INDENTATION_PROBLEM;

        switch (issue.getSeverity()) {
            case ERROR:
                type = IAnalysisPreferences.TYPE_ERROR;
                break;
            case INFORMATION:
                type = IAnalysisPreferences.TYPE_INFORMATION;
                break;
            case WARNING:
                type = IAnalysisPreferences.TYPE_WARNING;
                break;
        }
        if (startLine < 0) {
            startLine = 0;
        }
        Message msg = new Message(type, issue.getMessage(), startLine,
                startLine,
                startCol, endCol, prefs);
        msg.setQuickFix(issue.getQuickFix());

        return msg;
    }

}
