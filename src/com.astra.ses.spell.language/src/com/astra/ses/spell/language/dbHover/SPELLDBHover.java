package com.astra.ses.spell.language.dbHover;

import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.ITypedRegion;
import org.python.pydev.core.MisconfigurationException;
import org.python.pydev.editor.codefolding.PySourceViewer;
import org.python.pydev.editor.hover.AbstractPyEditorTextHover;

public class SPELLDBHover extends AbstractPyEditorTextHover {

	public SPELLDBHover() {
		// TODO Auto-generated constructor stub
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
	protected String getDBEntry(IFile db,final String entry) {
		InputStream contents;
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
                if (lines[i].trim().startsWith(entry)) {
                    return lines[i];
                }
            }
        } catch (Exception e) {
        	
		}
        return null;
	}
	
	
	@Override
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		ITypedRegion partition = ((org.eclipse.jface.text.AbstractDocument) textViewer.getDocument())
				.getDocumentPartitioner("__PYTHON_PARTITION_TYPE").getPartition(hoverRegion.getOffset());
		if ("__python_singleline_bytes_or_unicode1".equals(partition.getType())) {
			partition = ((org.eclipse.jface.text.AbstractDocument) textViewer.getDocument())
					.getDocumentPartitioner("__PYTHON_PARTITION_TYPE").getPartition(partition.getOffset() - 3);
		}
		try {
			String db = ((org.eclipse.jface.text.AbstractDocument) textViewer.getDocument()).get(partition.getOffset(), partition.getLength());
			if (db.contains("SCDB")) {
				ITypedRegion entryPartition = ((org.eclipse.jface.text.AbstractDocument) textViewer.getDocument())
						.getDocumentPartitioner("__PYTHON_PARTITION_TYPE").getPartition(partition.getOffset()+partition.getLength()+ 2);
				String entry = ((org.eclipse.jface.text.AbstractDocument) textViewer.getDocument()).get(entryPartition.getOffset(), entryPartition.getLength());
				if (entry.startsWith("'")) {
					entry = entry.substring(1,entry.length() - 1);
					
					
					try {
						IFile scdb = getDB(((PySourceViewer)textViewer).getEdit().getPythonNature().getProject(),"SCDB");
						String dbEntry = getDBEntry(scdb,entry);
						return dbEntry;
					} catch (MisconfigurationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			if (db.contains("GDB")) {
				ITypedRegion entryPartition = ((org.eclipse.jface.text.AbstractDocument) textViewer.getDocument())
						.getDocumentPartitioner("__PYTHON_PARTITION_TYPE").getPartition(partition.getOffset()+partition.getLength()+ 2);
				String entry = ((org.eclipse.jface.text.AbstractDocument) textViewer.getDocument()).get(entryPartition.getOffset(), entryPartition.getLength());
				if (entry.startsWith("'")) {
					entry = entry.substring(1,entry.length() - 1);
					
					
					try {
						IFile scdb = getDB(((PySourceViewer)textViewer).getEdit().getPythonNature().getProject(),"GDB");
						String dbEntry = getDBEntry(scdb,entry);
						return dbEntry;
					} catch (MisconfigurationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
		
		} catch (BadLocationException e) {
			return null;
		}
		
		
		return null;
	}

	@Override
	public boolean isContentTypeSupported(String contentType) {
		return true;
	}

}
