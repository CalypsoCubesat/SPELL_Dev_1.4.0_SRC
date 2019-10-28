package org.python.pydev.debug.ui;

import java.rmi.AccessException;
import java.rmi.NoSuchObjectException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart3;
import org.eclipse.ui.PlatformUI;
import org.python.pydev.debug.newconsole.DebugInputHelper;

public class JythonUIBridge implements JythonUIBridgeInterface {

    private Registry rmiRegistry;
    private Remote stub;

    public JythonUIBridge(Registry rmiRegistry) {
        this.rmiRegistry = rmiRegistry;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void setNextStep(final String source, final String prevStep, String nextStep) throws RemoteException {
        System.out.println("source: " + source + ", prev: " + prevStep + ", next: " + nextStep);

        Display.getDefault().asyncExec(new Runnable() {

            @Override
            public void run() {
                IViewReference[] viewReferences = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                        .getActivePage().getViewReferences();
                for (IViewReference iViewReference : viewReferences) {
                    String current_step = iViewReference.getPartProperty("CURRENT_STEP_" + source);
                    if (current_step != null) {
                        if (current_step == null || !current_step.equals(prevStep)) {
                            ((IWorkbenchPart3) iViewReference.getPart(false)).setPartProperty(
                                    "CURRENT_STEP_" + source,
                                    prevStep);
                        }
                        ((IWorkbenchPart3) iViewReference.getPart(false)).setPartProperty("CURRENT_STEP_" + source,
                                nextStep);
                    }
                }
                System.out.println(prevStep + " ==> " + nextStep);
            }
        });
    }

    @Override
    public void dispose() throws RemoteException {
        Display.getDefault().asyncExec(new Runnable() {

            @Override
            public void run() {
                try {
                    UnicastRemoteObject.unexportObject(stub, true);
                    try {
                        rmiRegistry.unbind("JythonUIBridge");
                    } catch (AccessException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (RemoteException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (NotBoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    UnicastRemoteObject.unexportObject(rmiRegistry, true);
                } catch (NoSuchObjectException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public String requestInput(String promptText, int promptType, Object[] options) throws RemoteException {
        String answer = DebugInputHelper.requestInput(promptText, promptType, options);
        if (answer == null) {
            answer = "None";
        }

        return answer;
    }

    @Override
    public boolean shouldUseStepFilter() throws RemoteException {
        return DebugUITools.isUseStepFilters();
    }

    @Override
    public boolean requestRun() throws RemoteException {

        return false;
    }

    public void setStub(Remote stub) {
        this.stub = stub;

    }

}
