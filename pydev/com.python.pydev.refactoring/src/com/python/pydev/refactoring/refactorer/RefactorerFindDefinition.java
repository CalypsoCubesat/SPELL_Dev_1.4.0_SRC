/**
 * Copyright (c) 2005-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
/*
 * Created on Dec 9, 2006
 * @author Fabio
 */
package com.python.pydev.refactoring.refactorer;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.python.pydev.core.ICodeCompletionASTManager;
import org.python.pydev.core.IDefinition;
import org.python.pydev.core.IPythonNature;
import org.python.pydev.core.MisconfigurationException;
import org.python.pydev.core.docutils.PySelection;
import org.python.pydev.core.docutils.PySelection.ActivationTokenAndQual;
import org.python.pydev.core.log.Log;
import org.python.pydev.core.structure.CompletionRecursionException;
import org.python.pydev.editor.codecompletion.revisited.CompletionCache;
import org.python.pydev.editor.codecompletion.revisited.visitors.Definition;
import org.python.pydev.editor.model.ItemPointer;
import org.python.pydev.editor.refactoring.PyRefactoringFindDefinition;
import org.python.pydev.editor.refactoring.RefactoringRequest;
import org.python.pydev.editor.refactoring.TooManyMatchesException;
import org.python.pydev.shared_core.string.StringUtils;

import com.python.pydev.analysis.AnalysisPlugin;
import com.python.pydev.analysis.additionalinfo.AbstractAdditionalTokensInfo;
import com.python.pydev.analysis.additionalinfo.AdditionalProjectInterpreterInfo;
import com.python.pydev.analysis.additionalinfo.IInfo;

/**
 * Class used to find the definition for some refactoring request.
 *
 * @author Fabio
 */
public class RefactorerFindDefinition {

    /**
     * This function is used to find the definition for some token.
     * It may return a list of ItemPointer because the actual definition may not be
     * easy to find (so, multiple places that could be the definitions for
     * the given token may be returned... and it may be up to the user to actually
     * choose the best match).
     * @throws BadLocationException 
     *
     * @see org.python.pydev.editor.refactoring.IPyRefactoring#findDefinition(org.python.pydev.editor.refactoring.RefactoringRequest)
     */
    public ItemPointer[] findDefinition(RefactoringRequest request) throws BadLocationException {
        try {
            request.getMonitor().beginTask("Find definition", 100);
            List<ItemPointer> pointers = new ArrayList<ItemPointer>();
            CompletionCache completionCache = new CompletionCache();
            ArrayList<IDefinition> selected = new ArrayList<IDefinition>();

            String[] tokenAndQual;
            try {
                tokenAndQual = PyRefactoringFindDefinition.findActualDefinition(request, completionCache, selected);
            } catch (CompletionRecursionException e1) {
                Log.log(e1);
                return new ItemPointer[0];
            }
            String[] prevTokenAndQual = { "", "" };
            try {
                int offset = 1;
                do {
                    prevTokenAndQual = PySelection.getActivationTokenAndQual(request.getDoc(),
                            request.ps.getAbsoluteCursorOffset() - offset, true);
                    offset += 1;
                } while ((tokenAndQual[1].equals(prevTokenAndQual[1]) || prevTokenAndQual[1].isEmpty())
                        && request.ps.getAbsoluteCursorOffset() - offset > 0);

            } catch (Exception e1) {
                Log.log(e1);
            }

            if (tokenAndQual == null) {
                return new ItemPointer[0];
            }
            if (Display.getCurrent() != null) {
                if ("SCDB".equals(tokenAndQual[1])) {
                    openEditorOnDB(request, tokenAndQual, "SCDB");
                } else if ("SCDB".equals(prevTokenAndQual[1])) {
                    openEditorOnDB(request, prevTokenAndQual, "SCDB");
                }
                if ("GDB".equals(tokenAndQual[1])) {
                    openEditorOnDB(request, tokenAndQual, "GDB");
                } else if ("GDB".equals(prevTokenAndQual[1])) {
                    openEditorOnDB(request, prevTokenAndQual, "GDB");
                }
            }

            PyRefactoringFindDefinition.getAsPointers(pointers, selected.toArray(new Definition[0]));

            if (pointers.size() == 0
                    && ((Boolean) request.getAdditionalInfo(
                            RefactoringRequest.FIND_DEFINITION_IN_ADDITIONAL_INFO, true))) {
                String lookForInterface = tokenAndQual[1];
                List<IInfo> tokensEqualTo;
                try {
                    tokensEqualTo = AdditionalProjectInterpreterInfo.getTokensEqualTo(lookForInterface, request.nature,
                            AbstractAdditionalTokensInfo.TOP_LEVEL | AbstractAdditionalTokensInfo.INNER);
                    ICodeCompletionASTManager manager = request.nature.getAstManager();
                    if (manager == null) {
                        return new ItemPointer[0];
                    }
                    if (tokensEqualTo.size() > 50) {
                        //too many matches for that...
                        throw new TooManyMatchesException("Too Many matches (" + tokensEqualTo.size()
                                + ") were found for the requested token:" + lookForInterface, tokensEqualTo.size());
                    }
                    request.communicateWork(StringUtils.format(
                            "Found: %s possible matches.", tokensEqualTo.size()));
                    IPythonNature nature = request.nature;
                    for (IInfo info : tokensEqualTo) {
                        AnalysisPlugin.getDefinitionFromIInfo(pointers, manager, nature, info, completionCache);
                        request.checkCancelled();
                    }
                } catch (MisconfigurationException e) {
                    Log.log(e);
                    return new ItemPointer[0];
                }

            }
            request.communicateWork(StringUtils.format("Found: %s matches.",
                    pointers.size()));

            return pointers.toArray(new ItemPointer[0]);
        } catch (BadLocationException e) {
            throw e;
        } catch (OperationCanceledException e) {
            //that's ok... it was cancelled
            throw e;
        } finally {
            request.getMonitor().done();
        }
    }

    protected void openEditorOnDB(RefactoringRequest request, String[] token, String dbName) {
        int offset = 0;
        ActivationTokenAndQual activationTokenAndQual = null;
        do {
            activationTokenAndQual = PySelection.getActivationTokenAndQual(request.getDoc(),
                    request.ps.getAbsoluteCursorOffset() + offset, true, true);
            offset += 1;
        } while (token[1].equals(activationTokenAndQual.qualifier));

        final String entry = activationTokenAndQual.qualifier;
        IFile[] scdb = { null };
        try {
            request.nature.getProject().accept(new IResourceVisitor() {

                @Override
                public boolean visit(IResource resource) throws CoreException {
                    if (resource.getName().startsWith(".")) {
                        return false;
                    }
                    if (resource.getName().startsWith(dbName)) {
                        scdb[0] = (IFile) resource;
                    }
                    return true;
                }
            });
        } catch (CoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (scdb[0] != null && !entry.isEmpty()) {

            Runnable r = new Runnable() {

                @Override
                public void run() {
                    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                    InputStream contents;
                    try {
                        contents = scdb[0].getContents();

                        byte[] buf = new byte[4096];
                        StringBuilder result = new StringBuilder();
                        for (int length = 0; (length = contents.read(buf)) > 0;) {
                            result.append(new String(buf, 0, length, "UTF-8"));
                        }
                        contents.close();
                        String dbContents = result.toString();
                        String[] lines = dbContents.split("\n");
                        int targetLine = -1;
                        for (int i = 0; i < lines.length; i++) {
                            if (lines[i].trim().startsWith(entry)) {
                                targetLine = i;
                                break;
                            }
                        }
                        if (targetLine == -1) {
                            int mostLikelyLine = -1;
                            int mostLikelyMatch = -1;
                            int matchesFound = 0;
                            for (int i = 0; i < lines.length; i++) {
                                String line = lines[i];
                                if (line.startsWith("#")) {
                                    continue;
                                }
                                String possibleEntry = line.substring(0, Math.min(line.length(), entry.length()));
                                int matches = 0;
                                for (int j = 0; j < possibleEntry.length(); j++) {
                                    if (entry.charAt(j) == possibleEntry.charAt(j)) {
                                        matches++;
                                    }
                                }
                                if (matches > mostLikelyMatch) {
                                    mostLikelyMatch = matches;
                                    mostLikelyLine = i;
                                    matchesFound++;
                                }
                            }
                            if (mostLikelyLine > 0) {
                                if (matchesFound == 1
                                        && (lines[mostLikelyLine].startsWith(" ") || lines[mostLikelyLine].isEmpty())) {
                                    mostLikelyLine = lines.length - 1;
                                }
                                result = new StringBuilder();
                                for (int i = 0; i < mostLikelyLine + 1; i++) {
                                    result.append(lines[i]);
                                    result.append('\n');
                                }

                                result.append(entry);
                                String line = lines[mostLikelyLine];
                                boolean foundWS = false;
                                for (int i = entry.length(); i < line.length(); i++) {
                                    if (line.charAt(i) == ' ' || line.charAt(i) == '\t') {
                                        foundWS = true;
                                        result.append(" ");
                                    } else {
                                        if (!foundWS) {
                                            result.append(" ");
                                        } else {
                                            break;
                                        }
                                    }
                                }

                                result.append('\n');
                                for (int i = mostLikelyLine + 1; i < lines.length; i++) {
                                    result.append(lines[i]);
                                    result.append('\n');
                                }
                                Shell shell = new Shell(Display.getDefault().getActiveShell());

                                boolean doUpdate = MessageDialog.openQuestion(shell,
                                        dbName + " entry " + entry + " could not be found",
                                        dbName + " entry " + entry
                                                + " could not be found\nDo you want to create the entry?");
                                shell.dispose();
                                if (doUpdate) {
                                    scdb[0].delete(true, null);
                                    scdb[0].create(new ByteArrayInputStream(result.toString().getBytes()), true, null);
                                    scdb[0].refreshLocal(0, null);
                                    Thread.sleep(150);
                                    targetLine = mostLikelyLine + 1;
                                } else {
                                    targetLine = mostLikelyLine;
                                }
                            }
                        }
                        HashMap<String, Object> map = new HashMap<String, Object>();
                        map.put(IMarker.LINE_NUMBER, targetLine + 1);
                        IMarker marker = null;
                        try {
                            marker = scdb[0].createMarker(IMarker.TEXT);
                            marker.setAttributes(map);
                            IDE.openEditor(page, marker, true);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }

                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            };
            if (Display.getCurrent() == null) {
                Display.getDefault().asyncExec(r);
            } else {
                r.run();
            }
        }
    }

}
