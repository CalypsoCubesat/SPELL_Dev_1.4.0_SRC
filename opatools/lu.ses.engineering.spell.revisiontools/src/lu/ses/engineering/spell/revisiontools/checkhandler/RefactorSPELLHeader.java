package lu.ses.engineering.spell.revisiontools.checkhandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import lu.ses.engineering.spell.revisiontools.Activator;
import lu.ses.engineering.spell.revisiontools.IOConsoleThread;
import lu.ses.engineering.spell.revisiontools.abort.AbortScriptCommandHandler;
import lu.ses.engineering.spell.revisiontools.hyperlinks.CompareHyperlink;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.IParameterValues;
import org.eclipse.core.commands.ParameterValuesException;
import org.eclipse.core.commands.State;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.RegistryToggleState;

public class RefactorSPELLHeader extends CheckerAction {

	/**
	 * Constructor for Action1.
	 */
	public RefactorSPELLHeader() {
		super();
	}


	/**
	 * @see IActionDelegate#run(IAction)Procedure_Revision_Compare
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Object object = event.getApplicationContext();
		IEvaluationContext context = (IEvaluationContext) object;
		ISelection selection = (ISelection) context.getVariable("selection");
		if (selection instanceof TreeSelection){
			TreeSelection s = (TreeSelection) selection;
			selectedProjects = s.toList();
			
		} else {
			//System.err.println("ERROR: Unknown selection type: " + selection);
		}
		CompareHyperlink.idToSelectedFileMapping.clear();
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		ProcessBuilder builder = createBuilder("Refactor_Procedure_Headers.py");

		selectedProjects = Collections.EMPTY_LIST;
		
		String consoleId = "SPELLConsole";

		myConsole = findConsole(consoleId);


		try {
			myConsole.activate();
			final IOConsoleOutputStream consoleOut = myConsole.newOutputStream();
			final IOConsoleOutputStream consoleErr = myConsole.newOutputStream();
			consoleErr.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
			myConsole.clearConsole();
			
			consoleOut.write("Starting SPELL Header refactoring.\n");
			offset = "Starting SPELL Header refactoring.\n".length();
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
	
	@Override
	public boolean isEnabled() {

		return super.isEnabled();
	}
}
