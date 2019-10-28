package lu.ses.engineering.spell.revisiontools.abort;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.HandlerEvent;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.swt.IFocusService;

public class AbortScriptCommandHandler extends  org.eclipse.core.commands.AbstractHandler{
    public static Queue<WeakReference<AbortScriptCommandHandler>> instance =  new ConcurrentLinkedQueue();
    
	public static Queue<Process> runningProcess = new ConcurrentLinkedQueue();

	
	public static void updateEnabledState(){
		for (Iterator<WeakReference<AbortScriptCommandHandler>> iterator = instance
				.iterator(); iterator.hasNext();) {
			WeakReference<AbortScriptCommandHandler> handlerRef = iterator.next();
			AbortScriptCommandHandler handler = handlerRef.get();
			if (handler != null)
				handler.fireHandlerChanged(new HandlerEvent(handler, true, false));
			else
				iterator.remove();
		}
		
	}
	
	public AbortScriptCommandHandler() {
		instance.add(new WeakReference<AbortScriptCommandHandler>(this));
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		for (Iterator<Process> iterator = runningProcess.iterator(); iterator
				.hasNext();) {
			Process process = iterator.next();
			try {
				process.exitValue();
				iterator.remove();
			} catch (Exception e){
				process.destroy();
				iterator.remove();
				setBaseEnabled(isEnabled());
				updateEnabledState();

				return IStatus.OK;
			}
		}
		setBaseEnabled(isEnabled());
		updateEnabledState();
		return IStatus.OK;
	}

	
	@Override
	public boolean isEnabled() {
		for (Iterator<Process> iterator = runningProcess.iterator(); iterator
				.hasNext();) {
			Process process = iterator.next();
			try {
				process.exitValue();
				iterator.remove();
			} catch (Exception e){
				//setBaseEnabled(true);
				
				return true;
			}
		}
		//setBaseEnabled(false);

		return false;
	}
	
}
