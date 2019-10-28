package com.astra.ses.spell.code_coverage.ui.commands;

import static com.astra.ses.spell.code_coverage.ui.commands.CodeCoverageAnnotation.Executed;
import static com.astra.ses.spell.code_coverage.ui.commands.CodeCoverageAnnotation.NotExecuted;
import static com.astra.ses.spell.code_coverage.ui.commands.CodeCoverageAnnotation.PartialExecuted;
import static com.astra.ses.spell.code_coverage.ui.commands.CodeCoverageAnnotation.ErrorFound;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

import com.astra.ses.spell.code_coverage.Activator;
import com.astra.ses.spell.code_coverage.CodeCoverage;
import com.astra.ses.spell.dev.spelleditor.SpellEditor;

public class ClearCodeCoverageHandler extends AbstractHandler {

	public ClearCodeCoverageHandler() {
		setBaseEnabled(false);
	}


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editorPart = HandlerUtil.getActiveEditorChecked(event);

		if (editorPart instanceof SpellEditor){
			final SpellEditor spellEditor = (SpellEditor) editorPart;

			Job annotationJob = new Job("Annotation processing Job"){

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
					monitor.beginTask("Clearing Code Coverage Data", 100);
					resetAnnotations(spellEditor);
					monitor.done();
					return Status.OK_STATUS;
				}
			};
			
			annotationJob.schedule();
		}
		CodeCoverage.getInstance().disconnect();
		return Status.OK_STATUS;
	}

	protected void resetAnnotations(SpellEditor spellEditor) {
		spellEditor.resetAnnotation(NotExecuted.getAnnotionType());
		spellEditor.resetAnnotation(Executed.getAnnotionType());
		spellEditor.resetAnnotation(ErrorFound.getAnnotionType());
		spellEditor.resetAnnotation(PartialExecuted.getAnnotionType());
		spellEditor.getAnnotationModel().connect(spellEditor.getDocument());
	}
	
	@Override
	public void setEnabled(Object evaluationContext) {

		if (evaluationContext instanceof IEvaluationContext){
			IEvaluationContext context = (IEvaluationContext) evaluationContext;
			Object activeEditor = context.getVariable("activeEditor");
			if (activeEditor instanceof SpellEditor){
				setBaseEnabled(true);
			} else {
				setBaseEnabled(false);
			}			
		}
		super.setEnabled(evaluationContext);
	}
}
