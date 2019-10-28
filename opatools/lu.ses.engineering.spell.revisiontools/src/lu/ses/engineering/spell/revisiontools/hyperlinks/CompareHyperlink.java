package lu.ses.engineering.spell.revisiontools.hyperlinks;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareUI;
import org.eclipse.compare.internal.CompareEditor;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.text.IRegion;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IHyperlink2;
import org.eclipse.ui.console.IOConsole;

public class CompareHyperlink implements IHyperlink2 {

	public static ConcurrentHashMap<String, CompareHyperlink> idToSelectedFileMapping = new  ConcurrentHashMap<String, CompareHyperlink>();
	
	private int offset;
	private String fileName;
	private String id;
	private String name;
	private int length;

	private IWorkbenchPage workbenchPage;

	private IOConsole con;

	private IRegion region;

	public CompareHyperlink(IOConsole con, String name,String id,String fileName,int offset,IWorkbenchPage workbenchPage) {
		this.con = con;
		this.workbenchPage = workbenchPage;
		this.setName(name);
		this.setId(id);
		this.setFileName(fileName);
		this.setOffset(offset);
		this.setLength(name.trim().length() + 3); 
	}

	@Override
	public void linkEntered() {
		// TODO Auto-generated method stub

	}

	@Override
	public void linkExited() {
		// TODO Auto-generated method stub

	}

	@Override
	public void linkActivated() {
		// TODO Auto-generated method stub

	}

	@Override
	public void linkActivated(Event event) {
		System.out.println(" *DBG* cmpHyperlink name:" + name + " id:" + id + " length:" + length) ;
		CompareHyperlink lastSelectedItem = idToSelectedFileMapping.get(id);
		if (lastSelectedItem == null){

			idToSelectedFileMapping.put(id, this);
			
			return;
		} 

		idToSelectedFileMapping.remove(id);
		if (lastSelectedItem.equals(this)){
			return;
		}
		
		CompareConfiguration cc = new CompareConfiguration();
		cc.setProperty(CompareEditor.CONFIRM_SAVE_PROPERTY, new Boolean(true));
		ResourceCompareInput input = new ResourceCompareInput(cc);
		IResource res1 =extractResource(lastSelectedItem.fileName);
		IResource res2 =extractResource(fileName);
		if (input.isEnabled(res1,res2)){
			if (input.setSelection(new IResource[]{res1,res2}, false)){
				input.initializeCompareConfiguration();
				CompareUI.openCompareEditorOnPage(input, PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage());
			}
				
		}
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	

	private IResource extractResource(String fileText) {

		IWorkspace workspace = ResourcesPlugin.getWorkspace();  

	    String workspaceDirectory = workspace.getRoot().getLocation().toFile().getAbsolutePath();
	    workspaceDirectory = workspaceDirectory.replaceAll("\\\\", "/");
		String wsURI = fileText.replaceAll("\\\\", "/").replaceAll("(?i)" + workspaceDirectory, "");
		
		//String wsURI = fileText.replaceAll("\\\\", "/").replaceAll("M:/[Ww]orkspace", "");

		IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(wsURI);

		return resource;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CompareHyperlink{* cmpHyperlink name:" + name + " id:" + id + " length:" + length + " file:"+ fileName.substring(fileName.lastIndexOf(File.separator))  +"*}";	}
}
