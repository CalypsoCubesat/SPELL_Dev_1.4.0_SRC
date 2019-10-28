package lu.ses.engineering.spell.revisiontools.checkhandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;

import lu.ses.engineering.spell.revisiontools.Activator;
import lu.ses.engineering.spell.revisiontools.IOConsoleThread;
import lu.ses.engineering.spell.revisiontools.abort.AbortScriptCommandHandler;
import lu.ses.engineering.spell.revisiontools.hyperlinks.CompareHyperlink;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.State;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.ui.handlers.RegistryToggleState;

public class RevisionChecker extends CheckerAction {
	

	public enum CheckLevel {
		REV,
		REVDATE,
		REVDATECONTENT;
		
	}
	public static CheckLevel currentCheckLevel = CheckLevel.REV;
	
	/**
	 * Constructor for Action1.
	 */
	public RevisionChecker() {
		super();
	}


	/**
	 * @see IActionDelegate#run(IAction)Procedure_Revision_Compare
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//
		if (((Event)event.getTrigger()).widget instanceof MenuItem){
			if (!((MenuItem)((Event)event.getTrigger()).widget).getSelection()){
				return Status.OK_STATUS;
			}
		}
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
		
		ProcessBuilder builder = createBuilder("Procedure_Revision_Compare.py");
		
		String currentCheckLevel = store.getString("CHECK_LEVEL");
		
		String newCheckLevel = event.getParameter("lu.ses.engineering.spell.revisiontools.RevCompareParam");
		if (newCheckLevel != null){
			currentCheckLevel = newCheckLevel;
			store.setValue("CHECK_LEVEL",currentCheckLevel);
		}
		builder.environment().put("CHECK_LEVEL", currentCheckLevel);
	    

		selectedProjects = Collections.EMPTY_LIST;
		
		String consoleId = "SPELLConsole";

		myConsole = findConsole(consoleId);


		try {
			myConsole.activate();
			final IOConsoleOutputStream consoleOut = myConsole.newOutputStream();
			final IOConsoleOutputStream consoleErr = myConsole.newOutputStream();
			consoleErr.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
			myConsole.clearConsole();
			
			consoleOut.write("Starting SPELL Revision Control.\n");
			offset = "Starting SPELL Revision Control.\n".length();
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
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String currentCheckLevel = store.getString("CHECK_LEVEL");
		
	    ICommandService commandService = (ICommandService) PlatformUI.getWorkbench().getService(ICommandService.class); 
	    
	    Command command1 = commandService.getCommand("lu.ses.engineering.spell.revisiontools.RevChecker");  
	    Command command2 = commandService.getCommand("lu.ses.engineering.spell.revisiontools.RevDateChecker");  
	    Command command3 = commandService.getCommand("lu.ses.engineering.spell.revisiontools.RevDateContentChecker"); 
	    
	    State state1 = command1.getState(RegistryToggleState.STATE_ID);
	    State state2 = command2.getState(RegistryToggleState.STATE_ID);
	    State state3 = command3.getState(RegistryToggleState.STATE_ID);
	    
	    if ("REV".equals(currentCheckLevel)) {
	    	state1.setValue(Boolean.TRUE);
	    	state2.setValue(Boolean.FALSE);
	    	state3.setValue(Boolean.FALSE);
	    } else if ("REVDATE".equals(currentCheckLevel)) {
	    	state1.setValue(Boolean.FALSE);
	    	state2.setValue(Boolean.TRUE);
	    	state3.setValue(Boolean.FALSE);
	    } else if ("REVDATECONTENT".equals(currentCheckLevel)) {
	    	state1.setValue(Boolean.FALSE);
	    	state2.setValue(Boolean.FALSE);
	    	state3.setValue(Boolean.TRUE);
	    } else {
	    	state1.setValue(Boolean.TRUE);
	    	state2.setValue(Boolean.FALSE);
	    	state3.setValue(Boolean.FALSE);
	    }

		return super.isEnabled();
	}
}