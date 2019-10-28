package org.python.pydev.debug.ui;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface JythonUIBridgeInterface extends Remote {

    public void setNextStep(String file, String prev, String next) throws RemoteException;

    public void dispose() throws RemoteException;

    public String requestInput(String msg, int type, Object[] options) throws RemoteException;

    public boolean shouldUseStepFilter() throws RemoteException;

    public boolean requestRun() throws RemoteException;
}
