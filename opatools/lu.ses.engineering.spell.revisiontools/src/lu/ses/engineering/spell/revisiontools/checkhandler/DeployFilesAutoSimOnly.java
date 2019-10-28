package lu.ses.engineering.spell.revisiontools.checkhandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import lu.ses.engineering.spell.revisiontools.Activator;
import lu.ses.engineering.spell.revisiontools.IOConsoleThread;
import lu.ses.engineering.spell.revisiontools.abort.AbortScriptCommandHandler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.console.IOConsoleOutputStream;

public class DeployFilesAutoSimOnly extends CheckerAction {
	
	public DeployFilesAutoSimOnly() {
		super();
	}


	/**
	 * @see IActionDelegate#run(IAction)
	 */

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
			
			builder.environment().put("SELECTION_ALGO", "AUTO_HEADER");
			builder.environment().put("SIM_ONLY", "True");
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

