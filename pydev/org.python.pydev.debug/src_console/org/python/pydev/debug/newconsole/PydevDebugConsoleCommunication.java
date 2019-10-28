/******************************************************************************
* Copyright (C) 2012-2013  Hussain Bohra and others
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     Hussain Bohra <hussain.bohra@tavant.com> - initial API and implementation
*     Fabio Zadrozny <fabiofz@gmail.com>       - ongoing maintenance
******************************************************************************/
package org.python.pydev.debug.newconsole;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.XmlRpcHandler;
import org.apache.xmlrpc.XmlRpcRequest;
import org.apache.xmlrpc.server.XmlRpcHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcNoSuchHandlerException;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.webserver.WebServer;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart3;
import org.eclipse.ui.PlatformUI;
import org.python.pydev.core.log.Log;
import org.python.pydev.debug.model.PyStackFrame;
import org.python.pydev.debug.model.PyThread;
import org.python.pydev.debug.model.XMLUtils;
import org.python.pydev.shared_core.callbacks.ICallback;
import org.python.pydev.shared_core.string.StringUtils;
import org.python.pydev.shared_core.structure.Tuple;
import org.python.pydev.shared_interactive_console.console.IScriptConsoleCommunication;
import org.python.pydev.shared_interactive_console.console.InterpreterResponse;

/**
 * This class allows console to communicate with python backend by using the existing
 * debug connection.
 *
 * @author hussain.bohra
 * @author Fabio Zadrozny
 */
public class PydevDebugConsoleCommunication implements IScriptConsoleCommunication, XmlRpcHandler {
    /**
     * This is the server responsible for giving input to a raw_input() requested
     * and for opening editors (as a result of %edit in IPython)
     */
    private static Map<Integer, WebServer> webServers = new Hashtable<>();

    private int TIMEOUT = PydevConsoleConstants.CONSOLE_TIMEOUT;

    String EMPTY = StringUtils.EMPTY;

    /**
     * Signals that the next command added should be sent as an input to the server.
     */
    private volatile boolean waitingForInput;

    /**
     * Input that should be sent to the server (waiting for raw_input)
     */
    private volatile String inputReceived;

    /**
     * Helper to keep on busy loop.
     */
    private volatile Object lock = new Object();

    /**
     * Response that should be sent back to the shell.
     */
    private volatile InterpreterResponse nextResponse;

    private final IPyStackFrameProvider consoleFrameProvider;

    private ICallback<Object, Tuple<String, String>> onContentsReceived;

    private boolean bufferedOutput;

    private WebServer webServer;

    private int clientPort;

    public void setBufferedOutput(boolean bufferedOutput) {
        this.bufferedOutput = bufferedOutput;
    }

    public boolean getBufferedOutput() {
        return this.bufferedOutput;
    }

    public PydevDebugConsoleCommunication(boolean bufferedOutput, IPyStackFrameProvider consoleFrameProvider,
            final int clientPort) {
        synchronized (PydevDebugConsoleCommunication.class) {
            this.consoleFrameProvider = consoleFrameProvider;
            this.bufferedOutput = bufferedOutput;
            this.clientPort = clientPort;
            webServer = webServers.get(clientPort);
            if (webServer == null) {
                webServer = new WebServer(clientPort, java.net.InetAddress.getLoopbackAddress());
                webServers.put(clientPort, webServer);
                new Thread() {
                    @Override
                    public void run() {
                        try {
                            webServer.start();
                            System.out
                                    .println("Callback Server started successfully on port " + webServer.getPort()
                                            + "(was "
                                            + clientPort + ").");
                        } catch (Exception e) {

                        }
                    };
                }.start();
            }

            XmlRpcServer serverToHandleRawInput = webServer.getXmlRpcServer();
            serverToHandleRawInput.setHandlerMapping(new XmlRpcHandlerMapping() {

                public XmlRpcHandler getHandler(String handlerName)
                        throws XmlRpcNoSuchHandlerException, XmlRpcException {
                    return PydevDebugConsoleCommunication.this;
                }
            });
        }
    }

    @Override
    public boolean isConnected() {
        return this.consoleFrameProvider.getLastSelectedFrame() != null;
    }

    @Override
    public void setOnContentsReceivedCallback(ICallback<Object, Tuple<String, String>> onContentsReceived) {
        this.onContentsReceived = onContentsReceived;
    }

    @Override
    public void interrupt() {
        //can't interrupt in the debug console for now...
    }

    @Override
    public void execInterpreter(final String command, final ICallback<Object, InterpreterResponse> onResponseReceived) {

        nextResponse = null;
        if (waitingForInput) {
            inputReceived = command;
            waitingForInput = false;
            // the thread that we started in the last exec is still alive if we were waiting for an input.
        } else {
            // create a thread that'll keep locked until an answer is received from the server.
            Job job = new Job("PyDev Debug Console Communication") {

                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    PyStackFrame frame = consoleFrameProvider.getLastSelectedFrame();
                    if (frame == null) {
                        if (onContentsReceived != null) {
                            onContentsReceived.call(new Tuple<String, String>(EMPTY,
                                    "[Invalid Frame]: Please select frame to connect the console.\n"));
                        }
                        nextResponse = new InterpreterResponse(false, false);
                        return Status.CANCEL_STATUS;
                    }
                    final EvaluateDebugConsoleExpression evaluateDebugConsoleExpression = new EvaluateDebugConsoleExpression(
                            frame);
                    evaluateDebugConsoleExpression.executeCommand(command, bufferedOutput);
                    String result = evaluateDebugConsoleExpression.waitForCommand();
                    try {
                        if (result.length() == 0) {
                            //timed out
                            if (onContentsReceived != null) {
                                onContentsReceived.call(new Tuple<String, String>(result, EMPTY));
                            }
                            nextResponse = new InterpreterResponse(false, false);
                            return Status.CANCEL_STATUS;

                        } else {
                            EvaluateDebugConsoleExpression.PydevDebugConsoleMessage consoleMessage = XMLUtils
                                    .getConsoleMessage(result);
                            if (onContentsReceived != null) {
                                onContentsReceived.call(new Tuple<String, String>(
                                        consoleMessage.getOutputMessage().toString(),
                                        consoleMessage.getErrorMessage().toString()));
                            }
                            nextResponse = new InterpreterResponse(consoleMessage.isMore(), false);
                        }
                    } catch (CoreException e) {
                        Log.log(e);
                        if (onContentsReceived != null) {
                            onContentsReceived.call(new Tuple<String, String>(result, EMPTY));
                        }
                        nextResponse = new InterpreterResponse(false, false);
                        return Status.CANCEL_STATUS;
                    }

                    return Status.OK_STATUS;
                }
            };
            job.schedule();
        }

        int timeOut = TIMEOUT; //only get contents each 500 millis...
        // busy loop until we have a response
        while (nextResponse == null) {
            synchronized (lock) {
                try {
                    lock.wait(20);
                } catch (InterruptedException e) {
                }
            }
            timeOut -= 20;

            if (timeOut <= 0 && nextResponse == null) {
                timeOut = TIMEOUT / 2; // after the first, get it each 250 millis
            }
        }
        onResponseReceived.call(nextResponse);
    }

    @Override
    public ICompletionProposal[] getCompletions(String text, String actTok, int offset, boolean showForTabCompletion)
            throws Exception {
        ICompletionProposal[] receivedCompletions = {};
        if (waitingForInput) {
            return new ICompletionProposal[0];
        }

        PyStackFrame frame = consoleFrameProvider.getLastSelectedFrame();
        if (frame == null) {
            return new ICompletionProposal[0];
        }

        final EvaluateDebugConsoleExpression evaluateDebugConsoleExpression = new EvaluateDebugConsoleExpression(frame);
        String result = evaluateDebugConsoleExpression.getCompletions(actTok, offset);
        if (result.length() > 0) {
            List<Object[]> fromServer = XMLUtils.convertXMLcompletionsFromConsole(result);
            List<ICompletionProposal> ret = new ArrayList<ICompletionProposal>();
            PydevConsoleCommunication.convertConsoleCompletionsToICompletions(text, actTok, offset, fromServer, ret,
                    false);
            receivedCompletions = ret.toArray(new ICompletionProposal[ret.size()]);
        }
        return receivedCompletions;
    }

    @Override
    public String getDescription(String text) throws Exception {
        return null;
    }

    /**
     * Enable/Disable linking of the debug console with the suspended frame.
     */
    @Override
    public void linkWithDebugSelection(boolean isLinkedWithDebug) {
        consoleFrameProvider.linkWithDebugSelection(isLinkedWithDebug);
    }

    @Override
    public void close() throws Exception {
        synchronized (PydevDebugConsoleCommunication.class) {
            if (webServer != null) {
                webServers.remove(clientPort);
                webServer.shutdown();
                webServer = null;
            }
        }

    }

    @Override
    protected void finalize() throws Throwable {
        close();
    }

    public void fireEvent(DebugEvent event) {
        DebugPlugin manager = DebugPlugin.getDefault();
        if (manager != null) {
            manager.fireDebugEventSet(new DebugEvent[] { event });
        }
    }

    @Override
    public Object execute(XmlRpcRequest request) throws XmlRpcException {
        String methodName = request.getMethodName();
        if ("requestRun".equals(methodName)) {
            try {
                PyStackFrame t = consoleFrameProvider.getLastFrame();
                t.resume();
                t.resume();
                ((PyThread) t.getThread()).setSuspended(false, null);
                fireEvent(new DebugEvent(t, DebugEvent.RESUME, 1090));
            } catch (DebugException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return "FAILURE";
            }
            return "SUCCESS";
        } else if ("shouldUseStepFilter".equals(methodName)) {
            return !DebugUITools.isUseStepFilters();
        } else if ("requestInput".equals(methodName)) {
            String promptText = (String) request.getParameter(0);
            Integer promptType = (Integer) request.getParameter(1);
            Object[] options = new Object[0];
            if (request.getParameter(2) instanceof Object[]) {
                options = (Object[]) request.getParameter(2);
            }
            if (request.getParameter(2) instanceof HashMap) {

            }
            String answer = DebugInputHelper.requestInput(promptText, promptType, options);
            if (answer == null) {
                answer = "None";
            }

            return Base64.getEncoder().encode(answer.getBytes());
        } else if ("dispose".equals(methodName)) {
            Display.getDefault().asyncExec(new Runnable() {

                @Override
                public void run() {
                    try {
                        close();
                        System.out.println("Closing procedure debug RPC connection.");
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });

            return "";
        } else if ("setNextStep".equals(methodName)) {
            final String source = (String) request.getParameter(0);
            final String prevStep = (String) request.getParameter(1);
            final String nextStep = (String) request.getParameter(2);
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

            return "";
        }
        Log.log("Unexpected call to execute for method name: " + methodName);
        return "";
    }

}
