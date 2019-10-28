/**
 * Copyright (c) 2005-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
/*
 * Created on 14/08/2005
 */
package org.python.pydev.debug.ui.launching;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.python.pydev.core.MisconfigurationException;
import org.python.pydev.core.log.Log;
import org.python.pydev.debug.core.PydevDebugPlugin;

public class JythonLaunchConfigurationDelegate extends AbstractLaunchConfigurationDelegate {

    @Override
    protected String getRunnerConfigRun(ILaunchConfiguration conf, String mode, ILaunch launch) {
        return PythonRunnerConfig.RUN_JYTHON;
    }

    @Override
    public void launch(ILaunchConfiguration conf, String mode, ILaunch launch, IProgressMonitor monitor)
            throws CoreException {

        if (monitor == null) {
            monitor = new NullProgressMonitor();
        }

        monitor.beginTask("Preparing configuration", 3);

        try {
            PythonRunnerConfig runConfig = new PythonRunnerConfig(conf, mode, getRunnerConfigRun(conf, mode, launch));

            monitor.worked(1);
            try {
                JythonRunner.run(runConfig, launch, monitor);
            } catch (IOException e) {
                Log.log(e);
                finishLaunchWithError(launch);
                throw new CoreException(PydevDebugPlugin.makeStatus(IStatus.ERROR,
                        "Unexpected IO Exception in Pydev debugger", null));
            }
        } catch (final InvalidRunException e) {
            handleError(launch, e);
        } catch (final MisconfigurationException e) {
            handleError(launch, e);
        }
    }

}
