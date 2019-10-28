///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.spelleditor
// 
// FILE      : SpellEditor.java
//
// DATE      : 2008-11-21 08:55
//
// Copyright (C) 2008, 2011 SES ENGINEERING, Luxembourg S.A.R.L.
//
// By using this software in any way, you are agreeing to be bound by
// the terms of this license.
//
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// NO WARRANTY
// EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, THE PROGRAM IS PROVIDED
// ON AN "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, EITHER
// EXPRESS OR IMPLIED INCLUDING, WITHOUT LIMITATION, ANY WARRANTIES OR
// CONDITIONS OF TITLE, NON-INFRINGEMENT, MERCHANTABILITY OR FITNESS FOR A
// PARTICULAR PURPOSE. Each Recipient is solely responsible for determining
// the appropriateness of using and distributing the Program and assumes all
// risks associated with its exercise of rights under this Agreement ,
// including but not limited to the risks and costs of program errors,
// compliance with applicable laws, damage to or loss of data, programs or
// equipment, and unavailability or interruption of operations.
//
// DISCLAIMER OF LIABILITY
// EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, NEITHER RECIPIENT NOR ANY
// CONTRIBUTORS SHALL HAVE ANY LIABILITY FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING WITHOUT LIMITATION
// LOST PROFITS), HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
// ARISING IN ANY WAY OUT OF THE USE OR DISTRIBUTION OF THE PROGRAM OR THE
// EXERCISE OF ANY RIGHTS GRANTED HEREUNDER, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGES.
//
// Contributors:
//    SES ENGINEERING - initial API and implementation and/or initial documentation
//
// PROJECT   : SPELL
//
// SUBPROJECT: SPELL DEV
//
///////////////////////////////////////////////////////////////////////////////
package com.astra.ses.spell.dev.spelleditor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.Category;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.IDocumentProviderExtension3;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
import org.eclipse.ui.texteditor.ITextEditorDropTargetListener;
import org.python.pydev.core.IMiscConstants;
import org.python.pydev.editor.PyEdit;
import org.python.pydev.parser.PyParser;
import org.python.pydev.plugin.preferences.PydevPrefs;
import org.python.pydev.shared_core.structure.Tuple;
import org.python.pydev.ui.ColorAndStyleCache;

import com.astra.ses.spell.dev.database.DatabaseManager;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.listener.IWorkingDatabaseListener;
import com.astra.ses.spell.dev.spelleditor.dnd.SpellEditorDropTargetListener;
import com.astra.ses.spell.dev.spelleditor.model.SpellEditorConfiguration;
import com.astra.ses.spell.dev.spelleditor.utils.SpellEditorInfo;

/*******************************************************************************
 * 
 * SpellEditor extends PYEdit adding new features related with the SPELL
 * environment
 *
 ******************************************************************************/
public class SpellEditor extends PyEdit {

	/***************************************************************************
	 * Constructor
	 **************************************************************************/
	public SpellEditor()
	{
		super();
		
		IPreferenceStore pyPrefs = PydevPrefs.getChainedPrefStore();
		ColorAndStyleCache colorCache = new ColorAndStyleCache(PydevPrefs.getChainedPrefStore());
		setSourceViewerConfiguration(new SpellEditorConfiguration(colorCache, this, pyPrefs));
		
		DatabaseManager.getInstance().addDatabaseListener(new IWorkingDatabaseListener() {
			ISpellDatabase lastDb = null;
			@Override
			public void workingDatabaseChanged(ISpellDatabase db) {
				if (db != lastDb)
					SpellEditor.this.reparse();
				lastDb = db;
			}
		});
		
	}
	
	@Override
	protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles)
	{
		ISourceViewer viewer = super.createSourceViewer(parent, ruler, styles);
		initializeDragAndDrop(viewer);
		return viewer;
	}
	
    @Override
    public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) 
    {
    	if (ITextEditorDropTargetListener.class.equals(adapter))
        {
        	return new SpellEditorDropTargetListener(getSourceViewer());
        }
    	else if (SpellEditorInfo.class.equals(adapter))
    	{
    		return new SpellEditorInfo( getIFile() );
    	}
        return super.getAdapter(adapter);
    }
    
    public IAnnotationModel getAnnotationModel(){
    	if (super.getSourceViewer() != null){
    		return super.getSourceViewer().getAnnotationModel();
    	} 
    	return null;
    }
    
    public Annotation createAndRegisterLineAnnotation(String type,String text,final int line){
    	if (text == null){
    		text = "";
    	}   	
    	Annotation annotation = new Annotation(type,false,text);
    	
    	IAnnotationModel annotationModel = getAnnotationModel();
    	
		try {
			int lineOffset = getDocument().getLineOffset(line);
	    	int lineLength = getDocument().getLineLength(line);
	    	annotationModel.addAnnotation(annotation, new Position(lineOffset, lineLength));
		} catch (BadLocationException e) {
			System.err.println("Failed to create \""+type+"\" annotation on line " + (line));
		}
    	return annotation;
    }
    
    public void resetAnnotation(String type){

    	IAnnotationModel annotationModel = getAnnotationModel();
    	List<Annotation> deleted = new ArrayList<Annotation>();
    	synchronized (annotationModel) {
        	Iterator annotationIterator = annotationModel.getAnnotationIterator();
        	while(annotationIterator.hasNext()){
        		Annotation annotation = (Annotation) annotationIterator.next();
        		if (annotation.getType().equals(type)){
        			annotation.markDeleted(true);
        			deleted.add(annotation);
        		}
        		
        	}
		}
    	
    	for (Annotation annotation : deleted) {
    		annotationModel.removeAnnotation(annotation);
		}
    	
    }
    
    /**
	 * Checks the state of the given editor input.
	 * @param input the editor input whose state is to be checked
	 * @since 2.0
	 */
    @Override
	protected void sanityCheckState(IEditorInput input) {

		IDocumentProvider p= getDocumentProvider();
		if (p == null)
			return;

		if (p instanceof IDocumentProviderExtension3)  {

			IDocumentProviderExtension3 p3= (IDocumentProviderExtension3) p;


			if (!p3.isSynchronized(input))
				handleEditorInputChanged();
		

		}

		updateState(getEditorInput());
		updateStatusField(ITextEditorActionConstants.STATUS_CATEGORY_ELEMENT_STATE);
	}
	@Override
	public void setFocus() {
		super.setFocus();
		ICommandService cmdService = (ICommandService) getSite().getService(
			    ICommandService.class);

		Command command = cmdService.getCommand("com.astra.ses.spell.code_coverage.ui.command.loadCodeCoverage");
		if (command.isDefined() && command.isEnabled()) {
			EvaluationContext evaluationContext = new EvaluationContext(null, false);
			evaluationContext.addVariable("activeEditor", this);
			evaluationContext.addVariable("autoUpdate", "");
			
			try {
				HashMap parameters = new HashMap();
				parameters.put("autoUpdate", "True");
				parameters.put("activeEditor", this);
				
				command.execute(new ExecutionEvent(command, parameters, this, evaluationContext));
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotHandledException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

    public void reparse() {
        try {
            PyParser parser = this.getParser();
            if (parser != null) {
                parser.forceReparse(new Tuple<String, Boolean>(IMiscConstants.ANALYSIS_PARSER_OBSERVER_FORCE, true));
            } else {
                //System.err.println("ERROR: Parser not found!");
            }
        } catch (Exception ex) {
            Job reparseJob = new Job("Reparse Job") {
                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    try {
                        PyParser parser = getParser();
                        if (parser != null) {
                            parser.forceReparse(new Tuple<String, Boolean>(
                                    IMiscConstants.ANALYSIS_PARSER_OBSERVER_FORCE,
                                    true));
                        } else {
                            //System.err.println("ERROR: Parser not found!");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return Status.OK_STATUS;
                }
            };
            reparseJob.schedule(1000);
        }
    }
}
