package com.astra.ses.spell.code_coverage.ui.commands;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringBufferInputStream;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.ExpressionConverter;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.egit.core.RepositoryUtil;
import org.eclipse.egit.core.internal.GitURI;
import org.eclipse.egit.core.project.RepositoryMapping;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.internal.services.EvaluationService;

import com.astra.ses.spell.code_coverage.Activator;
import com.astra.ses.spell.code_coverage.CodeCoverage;
import com.astra.ses.spell.code_coverage.ui.CodeCoveragePreferences;
import com.astra.ses.spell.dev.spelleditor.SpellEditor;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.SftpException;

import static com.astra.ses.spell.code_coverage.ui.commands.CodeCoverageAnnotation.*;

public class StartCodeCoverageHandler extends AbstractHandler {

	public StartCodeCoverageHandler() {
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
					monitor.beginTask("Loading Code Coverage Data", 100);
					CodeCoverage code_Coverage = CodeCoverage.getInstance();
					String host = preferenceStore.getString(CodeCoveragePreferences.CODE_COVERAGE_SERVER);
					String password = null;
					String user = preferenceStore.getString(CodeCoveragePreferences.CODE_COVERAGE_USER);
					String home = preferenceStore.getString(CodeCoveragePreferences.CODE_COVERAGE_SPOOL_FOLDER);
					boolean connect = code_Coverage.connect(user, password, host);
					if (connect){
						ChannelSftp sftpChannel = code_Coverage.openSFTPChannel();
						if (sftpChannel != null){
							try{
								IProject project = spellEditor.getProject();
								RepositoryMapping mapping = RepositoryMapping.getMapping(project);
								Repository repository = mapping.getRepository();
								String refId = "";
								Ref ref = null;
								try {
									ref = repository.getRef("HEAD");
									refId = ref.getObjectId().getName();

								} catch (IOException e2) {
									// TODO Auto-generated catch block
									e2.printStackTrace();
								}

								String sc = code_Coverage.getSCDBEntry(project,"Spacecraft_Short_Name");
								if (sc.startsWith("'")){
									sc = sc.substring(1,sc.length()-1);
								}
								try {
									sftpChannel.cd(home);

								} catch (SftpException e) {
									return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Could not find home directory!",e);
								}
								String spoolFile = "";
								ByteArrayInputStream in = new ByteArrayInputStream(spoolFile.getBytes());
								try {
									sftpChannel.put(in, sc + "-" + refId);
								} catch (SftpException e2) {
									try {
										return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Could not create spool file in directory "+sftpChannel.pwd()+" for latest Revision " + refId.substring(0, 7),e2);
									} catch (SftpException e) {
										return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Error while querying current directory!",e);
									}
								}
								monitor.done();
							} finally {
								sftpChannel.disconnect();
							}
						}
					} else {
						return Status.OK_STATUS;
					}
					return Status.OK_STATUS;
				}
			};
			annotationJob.schedule();
		}

		return Status.OK_STATUS;
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
