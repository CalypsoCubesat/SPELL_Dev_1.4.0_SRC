package lu.ses.engineering.spell.revisiontools.checkhandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

import lu.ses.engineering.spell.revisiontools.Activator;
import lu.ses.engineering.spell.revisiontools.IOConsoleThread;
import lu.ses.engineering.spell.revisiontools.abort.AbortScriptCommandHandler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public class DeployFilesManually extends CheckerAction {
	
	public DeployFilesManually() {
		super();
	}


	/**
	 * @see IActionDelegate#run(IAction)
	 */

	private String getPlatformString(File f){
		try {
			File scdb_Path_1 = new File(f.getCanonicalPath() + File.separator + "\\InputFiles\\SpacecraftDB\\SCDB.DB");
			File scdb_Path_2 = new File(f.getCanonicalPath() + File.separator + "\\InputFiles\\SPELL_FORMAT\\SpacecraftDB\\SCDB.DB");
			File scdb_Path = null;
			if (scdb_Path_1.exists()){
				scdb_Path = scdb_Path_1;
			} else if (scdb_Path_2.exists()){
				scdb_Path = scdb_Path_2;
			}
			if (scdb_Path == null)
				return "";
			BufferedReader in = new BufferedReader(new FileReader(scdb_Path));
			try {

				for(String line;(line = in.readLine()) != null;){
					if (line.startsWith("PLATFORM")){
						in.close();
						String[] split = line.split("\\s+");
						if (split.length > 1)
							return split[1];
						else
							return "UNK";
					}
				}

			} finally {
				in.close();
			}
		} catch (IOException e) {
			
		}
		return "";
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		ISelection selection = getSelection(event);
		if (selection instanceof TreeSelection){
			TreeSelection s = (TreeSelection) selection;
			selectedProjects = s.toList();

		} else {
			//System.err.println("ERROR: Unknown selection type: " + selection);
		}
		
		ProcessBuilder builder = createBuilder("Deploy_File_To_Sat.py");
		
		String consoleId = "SPELLConsole";

		myConsole = findConsole(consoleId);


		try {
			myConsole.activate();
			final IOConsoleOutputStream consoleOut = myConsole.newOutputStream();
			final IOConsoleOutputStream consoleErr = myConsole.newOutputStream();
			consoleErr.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
			myConsole.clearConsole();
			
			builder.environment().put("SELECTION_ALGO", "MANUAL");
			
			String list = queryProjectList();
			if (list == null)
				return Status.OK_STATUS;
			builder.environment().put("MANUAL_DIRS", list);
			
			myConsole.setWaterMarks(-1, -1);
			consoleOut.write("Starting File Deployment tool\n");
			offset = 1;
			final Process process = builder.start();
			AbortScriptCommandHandler.runningProcess.add(process);
			AbortScriptCommandHandler.updateEnabledState();
			InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            final BufferedReader out = new BufferedReader(isr);
			is = process.getErrorStream();
            isr = new InputStreamReader(is);
            final BufferedReader err = new BufferedReader(isr);

            Thread outThread = new IOConsoleThread(myConsole, process, out, consoleOut);
            Thread errThread = new IOConsoleThread(myConsole, process, err, consoleErr);
            
            outThread.start();
            errThread.start();

		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Status.OK_STATUS;
	}


	private String queryProjectList() {
		ElementListSelectionDialog dlg = new ElementListSelectionDialog(Display.getDefault().getActiveShell(),new LabelProvider(){
			public String getText(Object element) {
				return ((File)element).getName() + " (" + getPlatformString((File)element) + ")";
			}
		});
		dlg.setMultipleSelection(true);
		dlg.setFilter("**");
		dlg.setIgnoreCase(true);
		
		dlg.setMessage("Please select the satellites for deployment of the selected files.");
		File directory = new File("M://Workspace//");
		if (!directory.exists()){
			directory = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
		}
		dlg.setElements(directory.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isDirectory();
			}
		}));/* filter just files if you need to */
		if (dlg.open() != Window.OK){
			return null;
		}
		
		Object[] result = dlg.getResult();
		String list = "";
		for (Object object : result) {
			if (list.isEmpty()){
				list += "['" + object.toString() + "'";
			} else {
				list += ",'" + object.toString() + "'";
			}
		}
		list += "]";
		return list;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof TreeSelection){
			TreeSelection s = (TreeSelection) selection;
			selectedProjects = s.toList();
			
		} else {
			//System.err.println("ERROR: Unknown selection type: " + selection);
		}
		
	}


	
}

