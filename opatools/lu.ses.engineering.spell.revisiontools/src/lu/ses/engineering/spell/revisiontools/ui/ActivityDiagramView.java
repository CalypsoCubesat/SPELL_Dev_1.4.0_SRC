package lu.ses.engineering.spell.revisiontools.ui;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.WeakHashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.texteditor.ITextEditor;

import com.astra.ses.spell.dev.spelleditor.SpellEditor;

import lu.ses.engineering.spell.revisiontools.Activator;
import lu.ses.engineering.spell.revisiontools.SpellFixer;
import lu.ses.engineering.spell.revisiontools.preferences.ExecutePythonScriptAction;
import lu.ses.engineering.spell.revisiontools.preferences.PythonScriptMenuContributionItem;
import lu.ses.engineering.spell.revisiontools.preferences.ScriptMenuBuilder;
import lu.ses.engineering.spell.taskflow.digraph.DiGraphHTMLGenerator;

public class ActivityDiagramView extends ViewPart implements ILinkedWithEditorView {

	public class TaskFlowCreationException extends Exception{
		/**
		 * 
		 */
		private static final long serialVersionUID = 6887183322523196451L;
		
		public TaskFlowCreationException(String errorMsg) {
			super(errorMsg);
		}

		
	}
	
	//private IPartListener2 linkWithEditorPartListener  = new LinkWithEditorPartListener(this);
	//private Action linkWithEditorAction;
	private boolean linkingActive = true;
	private Browser diagramBrowser;
	private IFile currentTarget;
	private IEditorPart activeEditor;
	private WeakHashMap<String, String> cache = new WeakHashMap<String, String>();
	private WeakHashMap<String, HashMap<Integer,Integer>> lineCache = new WeakHashMap<String, HashMap<Integer,Integer>>();
	private DiGraphHTMLGenerator htmlGenerator = new DiGraphHTMLGenerator();
	private File currentPath;
	private File lastPath;
	public ActivityDiagramView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		getSite().getPage().addPartListener(new LinkWithEditorPartListener(this));
		toggleLinking(true);
		diagramBrowser = new Browser(parent, SWT.NONE);
		diagramBrowser.setDragDetect(false);
		diagramBrowser.setJavascriptEnabled(true);
		diagramBrowser.setToolTipText("");;
		try {
			diagramBrowser.setUrl(this.createActivityDiagramHTML(false));
		} catch (Exception e){
			diagramBrowser.setText(e.getMessage());
		}
		final BrowserFunction jumpFunction = new SwitchToElementFunction(this,diagramBrowser, "jumpToLine");
		final BrowserFunction reprFunction = new GetReprElementFunction(this,diagramBrowser, "getRepr");
		final BrowserFunction createFunction = new CreateTaskFlowFunction(this,diagramBrowser, "createTaskFlowDiagram");
		final BrowserFunction openEditorFunction = new OpenEditorFunction(this,diagramBrowser, "openEditor");
		final BrowserFunction saveAnnotationFunction = new SaveAnnotationsFunction(this,diagramBrowser, "saveAnnotations");
		
	}
	
	public String createActivityDiagramHTML(boolean force) throws TaskFlowCreationException{
		if (currentTarget == null){
			throw new TaskFlowCreationException(htmlGenerator.generateErrorMessageDiagramNotFound());
		}

		String locationURI = this.currentTarget.getLocationURI().toString();
		locationURI = locationURI.replace("/Procedures", Activator.getDefault().getPreferenceStore().getString("DotTarget"));
		String baseURI = locationURI.substring(0, locationURI.length() - 2);

		locationURI = this.currentTarget.getLocation().toString();
		locationURI = locationURI.replace("/Procedures", Activator.getDefault().getPreferenceStore().getString("DotTarget"));
		String mapURI = locationURI.substring(0, locationURI.length() - 2);
		File htmlFile = new File(mapURI + "html");
		//if (!force && htmlFile.exists()){
		//	return mapURI + "html";
		//}
		File svgFile = new File(mapURI + "svg");
		if (!svgFile.exists()){
			throw new TaskFlowCreationException(htmlGenerator.generateMappingFileNotFound(svgFile.toString()));
		}
		String timestamp = htmlGenerator.generateTimeStamp(baseURI + "svg", svgFile);
		
		//String cached = cache.get(currentTarget.toString() + currentTarget.getModificationStamp() + timestamp);
		//if (cached != null)
		//	return cached;
		
		String annotations = htmlGenerator.extractAnnotations(htmlFile);
		String html = htmlGenerator.createHTMLPage(svgFile,annotations);
		
		this.setCurrentPath(htmlFile);
		try {
			FileOutputStream out = new FileOutputStream(htmlFile);
			out.write(html.getBytes());
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		cache.put(currentTarget.toString() + currentTarget.getModificationStamp() + timestamp, mapURI + "html");
		return mapURI + "html";
	}

	@Override
	public void editorActivated(IEditorPart activeEditor) {
		if (!isLinkingActive() || !getViewSite().getPage().isPartVisible(this)) {
			return;
		}
		if (this.activeEditor == activeEditor){

			return;
		}
		//	return;
		// do something with content of the editor
		if (activeEditor.getEditorInput().getPersistable() instanceof FileEditorInput){
			FileEditorInput input = (FileEditorInput) activeEditor.getEditorInput().getPersistable();
			if (input.getFile().toString().contains("UserLib")){
				return;
			}
				
			this.activeEditor = activeEditor;			
			setActivityDiagram((IFile) input.getFile()); 
		}

	}

	private boolean isLinkingActive() {
		// TODO Auto-generated method stub
		return linkingActive;
	}

	protected void toggleLinking(boolean checked) {
		this.linkingActive = checked;
		if (checked) {
			editorActivated(getSite().getPage().getActiveEditor());
		}
	}
	
	public void setActivityDiagram(IFile spellFile){
		if (diagramBrowser != null){
			setPartName(spellFile.getName());
			this.currentTarget = spellFile;
			
			try {
				diagramBrowser.setUrl(this.createActivityDiagramHTML(false));
			} catch (Exception e){
				diagramBrowser.setText(e.getMessage());
			}
		} else {
			setPartName(spellFile.getName());
			this.currentTarget = spellFile;
		}
	}

	@Override
	public void setFocus() {
		diagramBrowser.setFocus();

	}

	public int translateLine(int line){
		HashMap<Integer, Integer> cached = lineCache.get(currentTarget.toString() + currentTarget.getModificationStamp());
		if (cached != null){
			Integer origLine = cached.get(line);
			if (origLine != null)
				return origLine;
			else
				return line;
		}
		SpellFixer fixer = new SpellFixer();
		fixer.processFileOnTheFly(currentTarget.getLocation().toString());
		cached = fixer.getLineMappings();
		lineCache.put(currentTarget.toString() + currentTarget.getModificationStamp(), cached);
		Integer origLine = cached.get(line);
		if (origLine != null)
			return origLine;
		else
			return line;
	}
	
	public List<Integer> reverseTranslateLine(int line){
		HashMap<Integer, Integer> cached = lineCache.get(currentTarget.toString() + currentTarget.getModificationStamp());
		if (cached == null){
			SpellFixer fixer = new SpellFixer();
			fixer.processFileOnTheFly(currentTarget.getLocation().toString());
			cached = fixer.getLineMappings();
			lineCache.put(currentTarget.toString() + currentTarget.getModificationStamp(), cached);
		}
		ArrayList<Integer> possibleLines = new ArrayList<>();
		for (Entry<Integer, Integer> entry : cached.entrySet()) {
			if (entry.getValue() == line)
				possibleLines.add(entry.getKey());
		}
		return possibleLines;
	}
	
	public void switchToStep(String step) {
		// TODO Auto-generated method stub
		//System.out.println("Jump to Step on line " + step);
		if (activeEditor instanceof SpellEditor){
			activeEditor.getEditorSite().getPage().bringToTop(activeEditor.getSite().getPart());
			SpellEditor editor = (SpellEditor) activeEditor;
			Iterator<Annotation> iterator = editor.getAnnotationModel().getAnnotationIterator();
			while (iterator.hasNext()){
				Annotation ann = iterator.next();
				if (ann.getText().equals(step)){
					Position position = editor.getAnnotationModel().getPosition(ann);
					goToLine(activeEditor,position);
					return;
				} else if (ann.getText().contains("'" + step + "") ||ann.getText().contains("\"" + step + "")){
					Position position = editor.getAnnotationModel().getPosition(ann);
					goToLine(activeEditor,position);
					return;
				}
			}
		} else {
			
		}
		
	}
	private static void goToLine(IEditorPart editorPart, Position pos) {
		if (!(editorPart instanceof ITextEditor) && pos != null) {
			return;
		}
		
		ITextEditor editor = (ITextEditor) editorPart;
		IDocument document = editor.getDocumentProvider().getDocument(
				editor.getEditorInput());
		if (document != null) {
			editor.selectAndReveal(pos.getOffset(), pos.getLength());
		}
	}

	public void switchToLine(int line) {
		activeEditor.getEditorSite().getPage().bringToTop(activeEditor.getSite().getPart());
		//System.out.println("Jump to line " + translateLine(line) + "(temp:"+line+")");
		goToLine(activeEditor,translateLine(line));
		
	}
	private void goToLine(IEditorPart editorPart, int lineNumber) {
		  if (!(editorPart instanceof ITextEditor) || lineNumber <= 0) {
		    return;
		  }
		  ITextEditor editor = (ITextEditor) editorPart;
		  if (editor.getDocumentProvider() == null){
			  try {
				  editor = (ITextEditor) IDE.openEditor(editor.getSite().getPage(), currentTarget);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		  IDocument document = editor.getDocumentProvider().getDocument(
		    editor.getEditorInput());
		  if (document != null) {
		    IRegion lineInfo = null;
		    try {
		      // line count internaly starts with 0, and not with 1 like in
		      // GUI
		      lineInfo = document.getLineInformation(lineNumber - 1);
		    } catch (BadLocationException e) {
		      // ignored because line number may not really exist in document,
		      // we guess this...
		    }
		    if (lineInfo != null) {
		      editor.selectAndReveal(lineInfo.getOffset(), lineInfo.getLength());
		    }
		  }
		}

	public void createTaskFlowDiagram(boolean force) {
		try {
			ExecutePythonScriptAction action = PythonScriptMenuContributionItem.getAction("Generate Detailed Task Flow From Steps");
			if (action == null){
				ScriptMenuBuilder.cacheAllMenus(null);

				action = PythonScriptMenuContributionItem.getAction("Generate Detailed Task Flow From Steps");
			}
			if (action == null){
				System.err.println("Could not find Task Flow Action!");
			} else {
				action.setSelectionOverride(new StructuredSelection(currentTarget));
				action.run();
				final ExecutePythonScriptAction currentAction = action;
				Job updater = new Job("Task Flow Updater"){
					@Override
					protected org.eclipse.core.runtime.IStatus run(org.eclipse.core.runtime.IProgressMonitor monitor) {
						try {
							currentAction.getProcess().waitFor();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Display.getDefault().asyncExec(new Runnable() {
							
							@Override
							public void run() {
								try {
									diagramBrowser.setUrl(createActivityDiagramHTML(force));
								} catch (Exception e){
									diagramBrowser.setText(e.getMessage());
								}
							}
						});
						
						currentAction.setSelectionOverride(null);
						return Status.OK_STATUS;
					};
				};
				updater.schedule();
				
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public void openEditor(final String editorTarget) {
		try {
			System.out.println("Trying to open editor for " + editorTarget);
			this.currentTarget.getProject().accept(new IResourceVisitor() {

				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (editorTarget.toLowerCase().equals(resource.getName().toLowerCase().substring(0, resource.getName().length() - 3)) && "py".equals(resource.getFileExtension()) && (resource instanceof IFile)){
						if (!(activeEditor instanceof ITextEditor)) {
							return false;
						}
						ITextEditor editor = (ITextEditor) activeEditor;
						try {
							editor = (ITextEditor) IDE.openEditor(editor.getSite().getPage(), (IFile) resource);
						} catch (PartInitException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						return false;
					}
					return true;
				}
			});
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public File getCurrentPath() {
		return currentPath;
	}

	public void setCurrentPath(File currentPath) {
		this.setLastPath(this.currentPath);
		this.currentPath = currentPath;
		
	}

	public File getLastPath() {
		return lastPath;
	}

	public void setLastPath(File lastPath) {
		this.lastPath = lastPath;
	}
	
	protected String getTarget(String step,SpellEditor editor) throws BadLocationException{
		Iterator<Annotation> iterator = editor.getAnnotationModel().getAnnotationIterator();
		while (iterator.hasNext()){
			Annotation ann = iterator.next();
			if (ann.getClass() == Annotation.class){
				if (ann.getText().equals(step)){
					Position position = editor.getAnnotationModel().getPosition(ann);
					return "" + editor.getDocument().getLineOfOffset(position.getOffset());
				} else if (ann.getText().contains("'" + step + "") ||ann.getText().contains("\"" + step + "")){
					Position position = editor.getAnnotationModel().getPosition(ann);
					return "" + editor.getDocument().getLineOfOffset(position.getOffset());
				}
			}
		}
		return "";
	}
	protected WeakHashMap<String,String> stepPropertiesMap = new WeakHashMap<>();
	@Override
	public String getPartProperty(String key) {
		if (key.startsWith("CURRENT_STEP")){
			
			return stepPropertiesMap.getOrDefault(key, "");
		} else {
			return super.getPartProperty(key);
		}		
	}
	
	@Override
	public void setPartProperty(String key, String value) {
		if (key.startsWith("CURRENT_STEP")){
				String old = stepPropertiesMap.put(key, value);
				
				firePartPropertyChanged(key, old, value);
		} else {
			super.setPartProperty(key, value);
		}		
	}
	
	@Override
	protected void firePartPropertyChanged(String key, String oldValue, String newValue) {
		//System.out.println(key);
		if (key.startsWith("CURRENT_STEP") && oldValue != null && newValue != null){
			String file = key.substring("CURRENT_STEP_".length());
			FileEditorInput in = (FileEditorInput) activeEditor.getEditorInput();
			IPath fullPath = in.getFile().getLocation();
			if (!new File(file).equals(new File(fullPath.toString())))
				return;
			if (oldValue.isEmpty() && newValue.isEmpty()){
				Display.getDefault().asyncExec(new Runnable() {
					
					@Override
					public void run() {
						try {
							Object evaluate = diagramBrowser.evaluate("resetNodes('flow_diagram')");
							System.out.println("reset result: " + evaluate);
						} catch (Exception e) {
							
						}
						
					}
				});
				return;
			}
			
			List<String> listOldValues = new ArrayList<>();
			List<String> listNewValues = new ArrayList<>();
			if (activeEditor instanceof SpellEditor){
				SpellEditor editor = (SpellEditor) activeEditor;
				if (oldValue.isEmpty()){
					listOldValues.add( "'node1'");
				} else {
					try {
						String target = getTarget(oldValue, editor);
						int line = Integer.parseInt(target);
						List<Integer> possibleLines = reverseTranslateLine(line);
						if (possibleLines.isEmpty())
							listOldValues.add("null");
						for (Integer l : possibleLines) {
							listOldValues.add("'" + (l+1) +"'");
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if (newValue.isEmpty()){
					listNewValues.add( "'node2'");
				} else {
					try {
						String target = getTarget(newValue, editor);
						int line = Integer.parseInt(target);
						List<Integer> possibleLines = reverseTranslateLine(line);
						if (possibleLines.isEmpty())
							listNewValues.add("null");
						for (Integer l : possibleLines) {
							listNewValues.add("'" + (l+1) +"'");
						}
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			for (String oldVal : listOldValues) {
				for (String newVal : listNewValues) {
					try{
						System.out.println(" " + oldVal + " => " + newVal);
						Object ret = diagramBrowser.evaluate("javascript:highlightNode("+oldVal+","+newVal+");", false);
						System.out.println(ret);
						if (ret != null && ((Boolean)ret)){
							break;
						}
					}catch (Exception ex){
						//ex.printStackTrace();
					}
					
				}
			}

		}
		super.firePartPropertyChanged(key, oldValue, newValue);
	}
	
}
