package com.astra.ses.spell.code_coverage.ui.commands;

import static com.astra.ses.spell.code_coverage.ui.commands.CodeCoverageAnnotation.ErrorFound;
import static com.astra.ses.spell.code_coverage.ui.commands.CodeCoverageAnnotation.Executed;
import static com.astra.ses.spell.code_coverage.ui.commands.CodeCoverageAnnotation.NotExecuted;
import static com.astra.ses.spell.code_coverage.ui.commands.CodeCoverageAnnotation.PartialExecuted;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.egit.core.project.RepositoryMapping;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jgit.errors.AmbiguousObjectException;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.RevisionSyntaxException;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.python.pydev.core.MisconfigurationException;
import org.python.pydev.editor.codecompletion.revisited.visitors.AbstractVisitor;
import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.jython.ast.FunctionDef;
import org.python.pydev.parser.jython.ast.stmtType;

import com.astra.ses.spell.code_coverage.Activator;
import com.astra.ses.spell.code_coverage.CodeCoverage;
import com.astra.ses.spell.code_coverage.ui.CodeCoveragePreferences;
import com.astra.ses.spell.dev.spelleditor.SpellEditor;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.SftpException;

public class LoadCodeCoverageHandler extends AbstractHandler {
	private IEditorPart lastEditorPart = null;
	public LoadCodeCoverageHandler() {
		setBaseEnabled(false);
	}
	

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		IEditorPart editorPart = HandlerUtil.getActiveEditorChecked(event);
		final String autoUpdate = event.getParameter("autoUpdate");
		final Event trigger = (Event) event.getTrigger();
		if (autoUpdate == null && (trigger == null || trigger.type != 13)) {
			return Status.OK_STATUS;
		}
		
		if (editorPart instanceof SpellEditor){
			final SpellEditor spellEditor = (SpellEditor) editorPart;

			Job annotationJob = new Job("Annotation processing Job"){

				@Override
				protected IStatus run(IProgressMonitor monitor) {

					synchronized (LoadCodeCoverageHandler.class) {
						if (autoUpdate == null && (trigger == null || trigger.type != 13)) {
							System.err.println();
						}
						IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
						monitor.beginTask("Loading Code Coverage Data", 100);
						CodeCoverage codeCoverage = CodeCoverage.getInstance();
						String host = preferenceStore.getString(CodeCoveragePreferences.CODE_COVERAGE_SERVER);
						
						String user = preferenceStore.getString(CodeCoveragePreferences.CODE_COVERAGE_USER);
						String password = user;
						String home = preferenceStore.getString(CodeCoveragePreferences.CODE_COVERAGE_RESULTS_FOLDER);
						if (autoUpdate != null) {
							if (!codeCoverage.isConnected())
								return new Status(IStatus.INFO, Activator.PLUGIN_ID, "Aborting auto update. Not yet connected.");
							if (lastEditorPart == spellEditor) {
								return new Status(IStatus.INFO, Activator.PLUGIN_ID, "Aborting auto update. Already up-to-date.");
							}
							lastEditorPart = spellEditor;
						}
						
						boolean connect = codeCoverage.connect(user, password, host);
						if (connect){
							ChannelSftp sftpChannel = codeCoverage.openSFTPChannel();
							if (sftpChannel != null){
								Ref ref = null;
								Ref remoteRef = null;
								try {
									IProject project = spellEditor.getProject();
									RepositoryMapping mapping = RepositoryMapping.getMapping(project);
									Repository repository = mapping.getRepository();
									String refId = "";
									
									try {
										String remoteBranch = repository.getConfig().getString("branch", repository.getBranch(),"merge");
										String originName = repository.getConfig().getString("branch", repository.getBranch(),"remote");
										remoteBranch = remoteBranch.replaceFirst("heads", "remotes/" + originName);
										ref = repository.findRef("HEAD");
										refId = ref.getObjectId().getName();
										remoteRef = repository.findRef(remoteBranch);
//										if (!remoteRef.getObjectId().getName().equals(refId)){
//											return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The repository is not up-to-date please push your local changes first, before starting the Code Coverage process.");
//										}
										IStatus returnCode = findFolderAndDoCD(sftpChannel, ref.getObjectId().getName());
										if (returnCode != null){
											returnCode = findFolderAndDoCD(sftpChannel, remoteRef.getObjectId().getName());
											if (returnCode != null){
//												if (returnCode == Status.CANCEL_STATUS){
	//
//													return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Could not find directory for latest Revision " + refId.substring(0, 7));
//												}
//												return returnCode;
											}
										}
									} catch (IOException e2) {
										// TODO Auto-generated catch block
										e2.printStackTrace();
									}

									String sc = codeCoverage.getSCDBEntry(project,"SC");
									if (sc.startsWith("'")){
										sc = sc.substring(1,sc.length()-1);
									}
									if (sc.isEmpty()) {
										sc = codeCoverage.getSCDBEntry(project,"Spacecraft_Short_Name");
										if (sc.startsWith("'")){
											sc = sc.substring(1,sc.length()-1);
										}
									}
									try {
										sftpChannel.cd(home);

									} catch (SftpException e) {
										return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Could not find home directory!",e);
									}
									IStatus returnCode = findFolderAndDoCD(sftpChannel, sc);
									if (returnCode != null){
										if (returnCode == Status.CANCEL_STATUS){

											return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Could not find directory for latest Revision " + refId.substring(0, 7));
										}
										return returnCode;
									}
									
									try {
										sftpChannel.cd("coverage");
									} catch (SftpException e2) {
										try {
											sftpChannel.cd("backup");
											boolean foundBackup = false;
											ObjectId lastId = null;
											try {
												lastId = repository.resolve("HEAD");
											} catch (RevisionSyntaxException e4) {
												// TODO Auto-generated catch block
												e4.printStackTrace();
											} catch (AmbiguousObjectException e4) {
												// TODO Auto-generated catch block
												e4.printStackTrace();
											} catch (IncorrectObjectTypeException e4) {
												// TODO Auto-generated catch block
												e4.printStackTrace();
											} catch (IOException e4) {
												// TODO Auto-generated catch block
												e4.printStackTrace();
											}
											for (int i = 1; i < 11;i++) {
												try {
													ObjectId id = lastId;
													lastId = repository.resolve(lastId.getName() +  "^1");
													try {
														if (id != null)
															sftpChannel.cd("coverage-" + id.getName().substring(0, 7));
													} catch (SftpException e) {
														System.err.println("No backup found for " + id.getName().substring(0, 7));
														continue;
													}
													System.err.println("Found backup with id " + id.getName().substring(0, 7));
													sftpChannel.cd("coverage");
													foundBackup = true;
													break;
												} catch (RevisionSyntaxException e1) {
	
												} catch (AmbiguousObjectException e1) {
	
												} catch (IncorrectObjectTypeException e1) {
	
												} catch (IOException e1) {
	
												} catch (SftpException e3) {

												}
											}
											if (!foundBackup)
												return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Could not find directory for latest Revision " + refId.substring(0, 7));
										} catch (SftpException e3) {
											// TODO Auto-generated catch block
											e3.printStackTrace();
										}
										
									}
									ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
									try {
										sftpChannel.get("../potential-bugs.json", byteArrayOutputStream);
									} catch (SftpException e3) {
										// TODO Auto-generated catch block
										e3.printStackTrace();
									}
									String errorTraces = new String(byteArrayOutputStream.toByteArray());
									try {
										byteArrayOutputStream.close();
									} catch (IOException e3) {
										// TODO Auto-generated catch block
										e3.printStackTrace();
									}
									ScriptEngineManager m = new ScriptEngineManager();
									ScriptEngine scriptEngine = m.getEngineByName("js");
									try {
										Bindings eval = (Bindings) scriptEngine.eval(errorTraces);
										for(int i = 0;i < eval.size();i++) {
											Bindings errorObj = (Bindings) eval.get(i);
											String proc = (String)errorObj.get("proc");
											Bindings locationsList = (Bindings) errorObj.get("locations");
											IFile file = project.getFile(proc);
											if (!file.exists())
												continue;
											IMarker[] markers;
											try {
												markers = file.findMarkers("com.astra.ses.spell.code_coverage.error_found", false, IResource.DEPTH_INFINITE );
											} catch (CoreException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
												markers = new IMarker[0];
											}
											Map<Integer,IMarker> currentMarkers = new HashMap<>();
											for (IMarker iMarker : markers) {
												currentMarkers.put(iMarker.getAttribute(IMarker.LINE_NUMBER, -1), iMarker);
											}
											for (int idx = 0;idx < locationsList.size();idx++) {
												
												Bindings locations = (Bindings)locationsList.get(idx);
												
												try {
													int lineNumber = (int)locations.get("line");
													String procName = proc.substring(proc.lastIndexOf("/")+1).replace(".py", "");
													String desc = (String)locations.get("reason") + getStackTrace(((Bindings)locations.get("stacktrace")));
													int lastIndex = desc.lastIndexOf(procName);
													Pattern pattern = Pattern.compile(procName + ".*py', line (\\d+)");
													Matcher matcher = pattern.matcher(desc.substring(lastIndex));
													if (matcher.find()) {
														String targetLine = matcher.group(1);
														if (!targetLine.isEmpty()) {
															lineNumber = Integer.parseInt(targetLine);
														}
													}
													
													IMarker lastMarker = currentMarkers.get(lineNumber);
													if (lastMarker != null) {
														if (lastMarker.getAttribute(IMarker.MESSAGE, "").equals(desc)) {
															currentMarkers.remove(lineNumber);
															continue;
														}
															
														lastMarker.delete();
													}
													IMarker marker = file.createMarker("com.astra.ses.spell.code_coverage.error_found");
													marker.setAttribute(IMarker.SOURCE_ID, "SPELL-Fuzz");
													marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
													marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
													marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
													marker.setAttribute(IMarker.MESSAGE, desc);
													marker.setAttribute(IMarker.TRANSIENT, false);
													marker.setAttribute(IMarker.USER_EDITABLE, null);
													
													currentMarkers.remove(lineNumber);
													
												} catch (CoreException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											}
											for (IMarker iMarker : currentMarkers.values()) {
												try {
													iMarker.delete();
												} catch (CoreException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											}
										}
									} catch (ScriptException e2) {
										// TODO Auto-generated catch block
										e2.printStackTrace();
									}
									
									
									IPath procedure = spellEditor.getIFile().getFullPath();
									procedure = (IPath) procedure.removeFirstSegments(2);
									while(procedure.segmentCount() > 1){
										String segment = procedure.segment(0);
										procedure = procedure.removeFirstSegments(1);

//										returnCode = findFolderAndDoCD(sftpChannel, segment);
//										if (returnCode != null){
//											return returnCode;
//										}
									}
									String fileName = procedure.segment(0);
//									returnCode = findFolderAndDoCD(sftpChannel, fileName.replaceFirst(".py", "_py") + ".html");
//									if (returnCode != null){
//										return returnCode;
//									}
									try {
										Vector<LsEntry> ls = sftpChannel.ls(".");
										for (LsEntry file : ls) {
											String rmtFileName = file.getFilename();
											if (rmtFileName.matches(".*" + fileName.replace(".py", "_py") + ".html")){
												try {
													byteArrayOutputStream = new ByteArrayOutputStream();
													sftpChannel.get(rmtFileName, byteArrayOutputStream);
													String ccResult = new String(byteArrayOutputStream.toByteArray());
													
													Pattern compile = Pattern.compile("<p id=\"t(\\d+)\" class=\"((?:\\w+| )+)\"");
													Matcher matcher = compile.matcher(ccResult);
													while (matcher.find()) {
														String line = matcher.group(1);
														String types = " " + matcher.group(2) + " ";
														if (types.contains(" stm ")) {
															if (types.contains(" mis ")) {
																createMissAnnotation(spellEditor,line);
																//createErrorAnnotation(spellEditor,line,"missed line");
															} else {
																if (types.contains(" par ")) {
																	Pattern annotateOPattern = Pattern.compile("<span class=\"annotate\" title=\"([^\"]+)\"");
																	Matcher matcher2 = annotateOPattern.matcher(ccResult.subSequence(matcher.end(2),ccResult.length()));
																	String desc = "";
																	if (matcher2.find()) {
																		desc = matcher2.group(1);
																	}
																	createPartialAnnotation(spellEditor,line,desc);
																	
																} else {
																	if (types.contains(" run ")) {
																		createHitAnnotation(spellEditor,line);
																	}
																}
															}
														}
													}
													
//													
//													ScriptEngineManager manager = new ScriptEngineManager();
//													ScriptEngine jsEngine = manager.getEngineByName("JS");
//													resetAnnotations(spellEditor);
//													try {
//														jsEngine.put("manager", LoadCodeCoverageHandler.this);
//														jsEngine.put("spellEditor", spellEditor);
	//
//														Object jsArray = jsEngine.eval("var coverage = " + ccResult + ";\n"
//																+ "coverage = coverage['lines'][Object.keys(coverage['lines'])[0]];\n"
//																+ "coverage.forEach(function(line) {manager.evalLine(spellEditor,line)});");
	//
//													} catch (ScriptException e) {
//														e.printStackTrace();
//													}
//													try {
//														jsEngine.put("manager", this);
//														jsEngine.put("spellEditor", spellEditor);
	//
//														Object jsArray = jsEngine.eval("coverage = " + ccResult + ";\n"
//																+ "coverage = coverage['arcs'][keys(coverage['lines'])[0]];\n");
//														jsEngine.eval("coverage.foreach(function(branch) {manager.evalBranch(spellEditor,branch[0],branch[1])});");
	//
//													} catch (ScriptException e) {
	//
//													}
													
													monitor.done();
													return new Status(IStatus.INFO, Activator.PLUGIN_ID, "Loading CodeCoverage data has been finished.");
													/*Pattern p = Pattern.compile("<p id=\"n(\\d+)\" class=\"([^\"]*)\">");
												Matcher matcher = p.matcher(ccResult);
												while (matcher.find()){
													String line = matcher.group(1);
													String state = matcher.group(2);
													if (state.contains("mis")){
														createMissAnnotation(spellEditor,line);

													} else if (state.contains("run")) {
														createHitAnnotation(spellEditor,line);
													}
													System.out.println("line: " + line + " state: " + state);
												}
													 */

												} catch (SftpException e) {
													try {
														return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Error open file "+sftpChannel.pwd()+"/"+rmtFileName+"!",e);
													} catch (SftpException e1) {
														return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Error while querying current directory!",e1);
													}
												}
											}
										}
									} catch (SftpException e) {
										try {
											return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Error while searching in directory "+sftpChannel.pwd()+"!",e);
										} catch (SftpException e1) {
											return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Error while querying current directory!",e1);
										}
									}
								} finally {
									sftpChannel.disconnect();
								}
							}
						} else {
							return Status.OK_STATUS;
						}


						return Status.OK_STATUS;
					}
					
				}
			};
			annotationJob.schedule();
		}

		return Status.OK_STATUS;
	}
	
	protected String getStackTrace(Bindings bindings) {
		
		StringBuilder result = new StringBuilder();
		for (int i = 0;i < bindings.size();i++) {
			if(result.length() > 0)
				result.append("\n");
			result.append(bindings.get(i));
		}
		return result.toString();
	}


	private IStatus findFolderAndDoCD(ChannelSftp sftpChannel,
			String targetFolder) {
		try {
			sftpChannel.cd(targetFolder);
			return null;
		} catch (Exception e) {
			// TODO: handle exception
		}
		boolean success = false;
		try {
			Vector<LsEntry> ls = sftpChannel.ls(".");
			for (LsEntry folder : ls) {
				String folderName = folder.getFilename();
				if (folderName.matches(".*" + targetFolder + ".*")){
					try {
						sftpChannel.cd(folderName);
						success = true;
					} catch (SftpException e) {
						try {
							return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Error while opening directory "+sftpChannel.pwd()+"/"+folder+"!",e);
						} catch (SftpException e1) {
							return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Error while querying current directory!",e1);
						}
					}

					break;
				}
			}
		} catch (SftpException e) {
			return new Status(IStatus.ERROR,Activator.PLUGIN_ID,"Could not find sc directory for "+targetFolder+"!",e);
		}
		if (!success){
			return Status.CANCEL_STATUS;
		}
		return null;
	}
	
	public void evalLine(SpellEditor spellEditor,int line){
		createHitAnnotation(spellEditor,"" + line);
	}
	public void evalBranch(SpellEditor spellEditor,int from,int to){
		//createHitAnnotation(spellEditor,"" + line);
		System.out.println("TODO: create Branch from line " + from + " to " + to);
	}
	
	protected void resetAnnotations(SpellEditor spellEditor) {
		spellEditor.resetAnnotation(NotExecuted.getAnnotionType());
		spellEditor.resetAnnotation(Executed.getAnnotionType());
		spellEditor.resetAnnotation(PartialExecuted.getAnnotionType());
		spellEditor.resetAnnotation(ErrorFound.getAnnotionType());
	}
	
	protected void createErrorAnnotation(final SpellEditor spellEditor, String line,String errorMessage) {
		final int lineNumber = Integer.parseInt(line) - 1;
		
		int nextLine = findEndLine(spellEditor, lineNumber);
    	IDocument document = spellEditor.getDocument();
    	if (document == null)
    		return;
    	for (int i = lineNumber; i < nextLine; i++) {
			try {
				if (document.getLineInformation(i).getLength() > 0) {
					
					spellEditor.createAndRegisterLineAnnotation(ErrorFound.getAnnotionType(),"Encountered error while executing line!\n\n" + errorMessage,i);
				}
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	protected void createHitAnnotation(final SpellEditor spellEditor, String line) {
		final int lineNumber = Integer.parseInt(line) - 1;
		
		int nextLine = findEndLine(spellEditor, lineNumber);
    	IDocument document = spellEditor.getDocument();
    	if (document == null)
    		return;
    	for (int i = lineNumber; i < nextLine; i++) {
			try {
				if (document.getLineInformation(i).getLength() > 0) {
					spellEditor.createAndRegisterLineAnnotation(Executed.getAnnotionType(),"Line has been executed!",i);
				}
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public int findEndLine(final SpellEditor spellEditor, final int lineNumber) {
		final int[] nextLine = {lineNumber};
    	try {
    		spellEditor.getAST().accept(new AbstractVisitor(spellEditor.getPythonNature()) {
    			int foundEntry = 0;
				@Override
				protected Object unhandled_node(SimpleNode node) throws Exception {
					if (foundEntry > 0 && !(node instanceof FunctionDef)) {
						if (node.beginLine-1 > nextLine[0]) {
							nextLine[0] = node.beginLine-1;
						}
						if (node instanceof stmtType) {
							return "";
						}
					}
					return null;
				}

				@Override
				public void traverse(SimpleNode node) throws Exception {
					if (node.beginLine-1 == lineNumber && !(node instanceof FunctionDef)) {
						foundEntry++;
						node.traverse(this);
						foundEntry--;
					} else {
						
						node.traverse(this);
					}
				}
			});
		} catch (MisconfigurationException e1) {

		} catch (Exception e1) {

		}
    	System.out.println((lineNumber+1) + "==>" + (nextLine[0]+1));
		return lineNumber+1;
	}


	protected void createMissAnnotation(SpellEditor spellEditor, String line) {
		final int lineNumber = Integer.parseInt(line) - 1;
		
    	IDocument document = spellEditor.getDocument();
    	if (document == null)
    		return;
    	int endLine = findEndLine(spellEditor, lineNumber);
		for (int i = lineNumber; i < endLine; i++) {
			try {
				if (document.getLineInformation(i).getLength() > 0) {
					spellEditor.createAndRegisterLineAnnotation(NotExecuted.getAnnotionType(),"Line has not been executed!",i);
				}
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	protected void createPartialAnnotation(SpellEditor spellEditor, String line,String desc) {
		final int lineNumber = Integer.parseInt(line) - 1;
		
    	IDocument document = spellEditor.getDocument();
    	if (document == null)
    		return;
    	int endLine = findEndLine(spellEditor, lineNumber);
		for (int i = lineNumber; i < endLine; i++) {
			try {
				if (document.getLineInformation(i).getLength() > 0) {
					spellEditor.createAndRegisterLineAnnotation(PartialExecuted.getAnnotionType(),desc,i);
				}
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
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
