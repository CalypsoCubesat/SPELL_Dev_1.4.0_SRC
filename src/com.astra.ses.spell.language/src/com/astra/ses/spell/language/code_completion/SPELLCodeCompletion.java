package com.astra.ses.spell.language.code_completion;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.python.pydev.core.ICompletionCache;
import org.python.pydev.core.ICompletionState;
import org.python.pydev.core.IDefinition;
import org.python.pydev.core.ILocalScope;
import org.python.pydev.core.IPythonNature;
import org.python.pydev.core.IToken;
import org.python.pydev.core.MisconfigurationException;
import org.python.pydev.core.docutils.PySelection.ActivationTokenAndQual;
import org.python.pydev.core.structure.CompletionRecursionException;
import org.python.pydev.editor.codecompletion.CompletionRequest;
import org.python.pydev.editor.codecompletion.IPyDevCompletionParticipant;
import org.python.pydev.editor.codecompletion.IPyDevCompletionParticipant3;
import org.python.pydev.editor.codecompletion.revisited.visitors.Definition;
import org.python.pydev.shared_ui.proposals.PyCompletionProposal;

public class SPELLCodeCompletion
		implements IPyDevCompletionParticipant, IPyDevCompletionParticipant3 {

	@Override
	public IDefinition findDefinitionForMethodParameter(Definition d, IPythonNature nature,
			ICompletionCache completionCache) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Object> getGlobalCompletions(CompletionRequest request, ICompletionState state)
			throws MisconfigurationException {
		// TODO Auto-generated method stub
		return Collections.EMPTY_LIST;
	}
	protected IFile getDB(IProject project,final String dbName) {
		final IFile[] scdb = { null };
        try {
        	project.accept(new IResourceVisitor() {

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
        return scdb[0];
	}
	protected Collection<Object> getDBEntries(IFile db,final String entry, int fullLength, int offset) {
		InputStream contents;
		Collection<Object> resultList = new ArrayDeque<Object>();
        try {
            contents = db.getContents();

            byte[] buf = new byte[4096];
            StringBuilder result = new StringBuilder();
            for (int length = 0; (length = contents.read(buf)) > 0;) {
                result.append(new String(buf, 0, length, "UTF-8"));
            }
            contents.close();
            String dbContents = result.toString();
            String[] lines = dbContents.split("\n");
            for (int i = 0; i < lines.length; i++) {
            	if (lines[i].trim().isEmpty())
            		continue;
            	if (lines[i].charAt(0) == ' ') {
            		continue;
            	}
            	if (lines[i].charAt(0) == '\t') {
            		continue;
            	}
            	if (lines[i].charAt(0) == '#') {
            		continue;
            	}
                if (lines[i].startsWith(entry)) {
                	String proposal = lines[i].split(" ")[0];
                	PyCompletionProposal pyCompletionProposal = new PyCompletionProposal(proposal, offset,
                            fullLength, proposal.length(),
                            PyCompletionProposal.PRIORITY_DEFAULT);
                	resultList.add(pyCompletionProposal);
                }
            }
        } catch (Exception e) {
        	
		}
        return resultList;
	}
	@Override
	public Collection<Object> getStringGlobalCompletions(CompletionRequest request, ICompletionState state)
			throws MisconfigurationException {
		String partialEntry = request.qualifier;
		String entry = request.fullQualifier;
		int offset = 1;
		String context = "";
		do {
			ITypedRegion partition = ((org.eclipse.jface.text.AbstractDocument) request.doc)
					.getDocumentPartitioner("__PYTHON_PARTITION_TYPE").getPartition(request.getPySelection().getAbsoluteCursorOffset() - offset);
			offset++;
			try {
				context = request.doc.get(partition.getOffset(), partition.getLength());
				if (context.startsWith("'")) {
					context = context.substring(1);
				}
				if (context.endsWith("'")) {
					context = context.substring(0,context.length() - 1);
				}
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		} while (context.isEmpty() || context.equals(entry));
		if (context.contains("SCDB")) {
			IFile db = getDB(request.nature.getProject(),"SCDB");
			return getDBEntries(db, partialEntry,entry.length(),request.documentOffset);
		}
		if (context.contains("GDB")) {
			IFile db = getDB(request.nature.getProject(),"GDB");
			return getDBEntries(db, partialEntry,entry.length(),request.documentOffset);
		}
		System.out.println();
		
		return Collections.EMPTY_LIST;
	}

	@Override
	public Collection<IToken> getCompletionsForMethodParameter(ICompletionState state, ILocalScope localScope,
			Collection<IToken> interfaceForLocal) throws CompletionRecursionException {
		// TODO Auto-generated method stub
		return Collections.EMPTY_LIST;
	}

	@Override
	public Collection<IToken> getCompletionsForTokenWithUndefinedType(ICompletionState state, ILocalScope localScope,
			Collection<IToken> interfaceForLocal) throws CompletionRecursionException {
		// TODO Auto-generated method stub
		return Collections.EMPTY_LIST;
	}

	@Override
	public Collection<Object> getArgsCompletion(ICompletionState state, ILocalScope localScope,
			Collection<IToken> interfaceForLocal) {
		// TODO Auto-generated method stub
		return Collections.EMPTY_LIST;
	}

	@Override
	public Collection<IToken> getCompletionsForType(ICompletionState state) throws CompletionRecursionException {
		// TODO Auto-generated method stub
		return Collections.EMPTY_LIST;
	}


}
