package lu.ses.engineering.spell.revisiontools.checkhandler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import lu.ses.engineering.spell.revisiontools.Activator;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

public abstract class CheckerAction extends  org.eclipse.core.commands.AbstractHandler{
	protected Shell shell;
	protected List<IProject> selectedProjects;
	protected MessageConsole myConsole;
	protected IWorkbenchPart target;
	protected int offset = 0;
	
	
	
	protected MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);

		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}
	
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		this.target = targetPart;
	}
	
	protected ProcessBuilder createBuilder(String scriptName) {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		ProcessBuilder builder = new ProcessBuilder(store.getString("PYTHON_PATH"),store.getString("SPELL_CHECK_PATH")+File.separator+scriptName);
		String additional_prefs = store.getString("ADDITIONAL_PREFS");
		if (additional_prefs != null){
			String[] split = additional_prefs.split("\\|");
			for (String keyValue : split) {
				if (keyValue.isEmpty() || !keyValue.contains(":")){
					continue;
				}
				String[] keyValuePair = keyValue.split(":");
				if (keyValuePair[0].toLowerCase().equals(scriptName.toLowerCase())){
					String paramName = keyValuePair[1].trim();
					String paramValue = store.getString(paramName);
					builder.environment().put(paramName, paramValue);
				}
			}
		}
		if (store.getBoolean("EXTRACT_CHECKS") || store.getBoolean("UPDATE_CHECKS")){
			File script = new File(store.getString("SPELL_CHECK_PATH")+File.separator+scriptName);
			boolean isOutdated = false;
			long packagedVersion = -1;
			if (script.exists() && store.getBoolean("UPDATE_CHECKS")){
				try {
					packagedVersion = getClass().getResource("/scripts/" + scriptName).openConnection().getLastModified();
					long currentVersion = script.lastModified();
					if (packagedVersion > currentVersion)
						isOutdated = true;
				} catch (Exception e){

				}

			}
			if (!script.exists() || isOutdated){
				InputStream resourceAsStream = getClass().getResourceAsStream("/scripts/" + scriptName);
				byte[] buf = new byte[2048];

				try {
					FileOutputStream out = new FileOutputStream(script);
					for (int length = -1;(length = resourceAsStream.read(buf)) > 0;){
						out.write(buf,0,length);
					}
					out.close();
					resourceAsStream.close();
					if (packagedVersion > 0)
						script.setLastModified(packagedVersion);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			script = new File(store.getString("SPELL_CHECK_PATH")+File.separator+"OPA_Utils.py");
			packagedVersion = -1;
			isOutdated = false;
			if (script.exists() && store.getBoolean("UPDATE_CHECKS")){
				try {
					packagedVersion = getClass().getResource("/scripts/OPA_Utils.py").openConnection().getLastModified();
					long currentVersion = script.lastModified();
					if (packagedVersion > currentVersion)
						isOutdated = true;
				} catch (Exception e){

				}

			}
			if (!script.exists() || script.exists()){
				InputStream resourceAsStream = getClass().getResourceAsStream("/scripts/OPA_Utils.py");
				byte[] buf = new byte[2048];

				try {
					FileOutputStream out = new FileOutputStream(script);
					for (int length = -1;(length = resourceAsStream.read(buf)) > 0;){
						out.write(buf,0,length);
					}
					out.close();
					resourceAsStream.close();
					if (packagedVersion > 0)
						script.setLastModified(packagedVersion);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
		builder.environment().put("WORK_DIR",store.getString("SPELL_CHECK_PATH")+File.separator);
		builder.environment().put("AMOUNT_PROJECTS","" +selectedProjects.size());
	    
		IWorkspace workspace = ResourcesPlugin.getWorkspace();  

	    File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		builder.environment().put("WORKSPACE", workspaceDirectory.getAbsolutePath());
		
		builder.environment().put("USE_EXTERNAL_FORMATTER", "True");
		int idx = 0;
		for (Object selObj : selectedProjects) {
			if (selObj instanceof IProject){
				IProject iProject = (IProject) selObj;
				builder.environment().put("PROJECT" + idx, iProject.getLocation().toString().replaceAll("/", "\\\\"));
			} else if (selObj instanceof IFile){
				IFile iProject = (IFile) selObj;
				builder.environment().put("PROJECT" + idx, iProject.getLocation().toString().replaceAll("/", "\\\\"));
			} else if (selObj instanceof IFolder){
				IFolder iProject = (IFolder) selObj;
				builder.environment().put("PROJECT" + idx, iProject.getLocation().toString().replaceAll("/", "\\\\"));
			}
			idx++;
		}
		
		return builder;
	}

	
	@Override
	public boolean isEnabled() {
		//org.eclipse.ui.menus.MenuUtil. 
		
		return true;
	}
	
	public ISelection getSelection(ExecutionEvent event){
		Object object = event.getApplicationContext();
		 
		IAction action = null;
		if (object instanceof org.eclipse.core.expressions.IEvaluationContext){
			IEvaluationContext context = (IEvaluationContext) object;
			return (ISelection) context.getVariable("selection");

		}
		return null;
	}

}
