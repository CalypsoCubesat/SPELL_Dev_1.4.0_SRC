package lu.ses.engineering.spell.revisiontools.checkhandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lu.ses.engineering.spell.revisiontools.Activator;
import lu.ses.engineering.spell.revisiontools.IOConsoleThread;
import lu.ses.engineering.spell.revisiontools.abort.AbortScriptCommandHandler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.internal.resources.Marker;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IHyperlink;
import org.eclipse.ui.console.IHyperlink2;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.part.WorkbenchPart;
import org.eclipse.ui.swt.IFocusService;

public class ReportingConsistencyChecker  extends CheckerAction{
	
	/**
	 * Constructor for Action1.
	 */
	public ReportingConsistencyChecker(){
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
		
		ProcessBuilder builder = createBuilder("Header_Consistency_Checker.py");
		
		String consoleId = "SPELLConsole";

		super.myConsole = findConsole(consoleId);


		try {
			myConsole.activate();
			final IOConsoleOutputStream consoleOut = myConsole.newOutputStream();
			final IOConsoleOutputStream consoleErr = myConsole.newOutputStream();
			consoleErr.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
			myConsole.clearConsole();
			
			consoleOut.write("Starting SPELL Header consistency check and report errors.\n");
			offset = "Starting SPELL Header consistency check and report errors.\n".length();
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
