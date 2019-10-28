package lu.ses.engineering.spell.revisiontools.hyperlinks;

import java.io.File;
import java.util.HashMap;

import lu.ses.engineering.spell.revisiontools.IOConsoleThread;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IHyperlink2;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

public class ResourceHyperLink implements IHyperlink2 {
	/**
	 * 
	 */
	private final IOConsoleThread ioConsoleThread;
	private final String file;
	String error = "";
	String fileText;
	String line = "";
	long lastId = -1;
	IMarker marker = null;
	IEditorPart openEditor = null;
	private int offset;
	private int localLength;

	public ResourceHyperLink(IOConsoleThread ioConsoleThread, String file) {
		this.ioConsoleThread = ioConsoleThread;
		this.file = file;
		fileText = file;
		error = this.ioConsoleThread.line;
	}

	@Override
	public void linkEntered() {
		// TODO Auto-generated method stub

	}

	@Override
	public void linkExited() {

	}

	@Override
	public void linkActivated() {
		linkActivated(null);
	}

	@Override
	public void linkActivated(
			Event event) {
		try {
			String[] split = fileText.split("\\.(?:(?:py)|(?:DB)).* line ");

			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

			IResource resource = extractResource(split);
			openEditor = page.findEditor(new FileEditorInput((IFile) resource));
			if (openEditor == null){
				openEditor = IDE.openEditor(page,(IFile) resource);
			} else {
				page.activate(openEditor);
			}

			if (!line.isEmpty()){	
				//System.out.println("Line available: " + Arrays.deepToString(split) + "|__|" + fileText);

				marker = null;
				try {
					marker = resource.findMarker(lastId);
					if (marker != null){
						HashMap map = new HashMap();
						map.put(IMarker.LINE_NUMBER, Integer.parseInt(line.trim()));
						map.put(IMarker.MARKER, IMarker.PROBLEM);
						map.put(IMarker.MESSAGE, error);
						map.put(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
						map.put(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
						map.put(IMarker.TRANSIENT, true);
						map.put(IMarker.CHAR_END, -1);
						map.put(IMarker.CHAR_START, -1);
						marker.setAttributes(map);
					}
				} catch (Exception ex){

				}
				if (marker == null){
					marker = resource.createMarker(IMarker.PROBLEM);
					HashMap map = new HashMap();
					map.put(IMarker.LINE_NUMBER, Integer.parseInt(line.trim()));
					map.put(IMarker.MARKER, IMarker.PROBLEM);
					map.put(IMarker.MESSAGE, error);
					map.put(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
					map.put(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
					map.put(IMarker.TRANSIENT, true);
					map.put(IMarker.CHAR_END, -1);
					map.put(IMarker.CHAR_START, -1);

					lastId = marker.getId();
					marker.setAttributes(map);
				}


				//System.out.println(" *DBG* marker exists: " + marker.exists());



				synchronized (this) {
					Thread.sleep(1000);
				}

				IDE.gotoMarker(openEditor, marker);


			} else if (resource instanceof IFile){
				//System.out.println("No line available: " + Arrays.deepToString(split) + "|__|" + fileText);
				IDE.openEditor(page, (IFile) resource);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			synchronized (this) {
				Thread.sleep(1000);
			}
			this.ioConsoleThread.myConsole.activate();
		} catch (Exception e){
			this.ioConsoleThread.myConsole.activate();
		}

	}

	private IResource extractResource(String[] split) {
		if (split.length > 1){
			fileText = split[0] + ".py";
			line = split[1];
		}
		//System.out.println(" *DBG* " + fileText + ":" + line);
		IWorkspace workspace = ResourcesPlugin.getWorkspace();  

	    String workspaceDirectory = workspace.getRoot().getLocation().toFile().getAbsolutePath();
	    workspaceDirectory = workspaceDirectory.replaceAll("\\\\", "/");
		String wsURI = fileText.replaceAll("\\\\", "/").replaceAll("(?i)" + workspaceDirectory, "");
		//System.out.println("*DBG* " + wsURI);
		IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(wsURI);
		if (resource == null){
			if (split.length > 1){
				fileText = split[0] + ".DB";
				line = split[1];
				wsURI = fileText.replaceAll("\\\\", "/").replaceAll("(?i)" + workspaceDirectory, "");
				resource = ResourcesPlugin.getWorkspace().getRoot().findMember(wsURI);
			}
		}
		return resource;
	}
}