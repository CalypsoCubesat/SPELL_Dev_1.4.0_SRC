/**
 * Copyright (c) 2005-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
/*
 * Author: atotic
 * Created: Aug 26, 2003
 */
package org.python.pydev.debug.ui.launching;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.python.pydev.core.IInterpreterManager;
import org.python.pydev.debug.core.Constants;
import org.python.pydev.debug.ui.SpellRemoteConnectionTab;
import org.python.pydev.editor.preferences.PydevEditorPrefs;
import org.python.pydev.plugin.PydevPlugin;
import org.python.pydev.plugin.preferences.PydevPrefs;

public class RemoteLaunchShortcut extends AbstractLaunchShortcut {

    @Override
    protected String getLaunchConfigurationType() {
        return Constants.ID_PYTHON_REMOTE_LAUNCH_CONFIGURATION_TYPE;
    }

    @Override
    protected boolean getRequireFile() {
        return true;
    }

    @Override
    protected IInterpreterManager getInterpreterManager(IProject project) {
        return PydevPlugin.getPythonInterpreterManager();
    }

    @Override
    public ILaunchConfiguration createDefaultLaunchConfiguration(FileOrResource[] resources) {
        ILaunchManager manager = org.eclipse.debug.core.DebugPlugin.getDefault().getLaunchManager();
        ILaunchConfigurationType type = manager.getLaunchConfigurationType(getLaunchConfigurationType());
        if (type == null) {
            reportError("SPELL Remote launch configuration not found", null);
            return null;
        }

        StringBuffer buffer = new StringBuffer("SPELL Remote Connection");
        String name = buffer.toString().trim();

        try {

            ILaunchConfigurationWorkingCopy workingCopy = super.createDefaultLaunchConfigurationWithoutSaving(
                    resources);//type.newInstance(null, name);
            workingCopy.setAttribute("mode", "debug");
            // Common Tab Arguments
            CommonTab tab = new CommonTab();
            tab.setDefaults(workingCopy);
            tab.dispose();
            SpellRemoteConnectionTab t = new SpellRemoteConnectionTab(null);
            t.setDefaults(workingCopy);
            t.dispose();
            if (resources[0].resource != null) {
                IProject prj = resources[0].resource.getProject();
                ILaunchConfiguration[] launchConfigurations = manager.getLaunchConfigurations();
                for (ILaunchConfiguration iLaunchConfiguration : launchConfigurations) {
                    if (iLaunchConfiguration.getAttribute(Constants.ATTR_PROJECT, "").equals(prj.getName())
                            && iLaunchConfiguration.getType().equals(workingCopy.getType())) {
                        if (!iLaunchConfiguration.getAttribute(Constants.ATTR_REMOTE_SERVER, "").isEmpty()) {
                            workingCopy.setAttribute(Constants.ATTR_REMOTE_PORT, iLaunchConfiguration.getAttribute(
                                    Constants.ATTR_REMOTE_PORT,
                                    "" + PydevPrefs.getPreferences().getInt(PydevEditorPrefs.DEBUG_SPELL_REMOTE_PORT)));
                            workingCopy.setAttribute(Constants.ATTR_REMOTE_SERVER,
                                    iLaunchConfiguration.getAttribute(Constants.ATTR_REMOTE_SERVER, ""));
                            workingCopy.setAttribute(Constants.ATTR_REMOTE_USER,
                                    iLaunchConfiguration.getAttribute(Constants.ATTR_REMOTE_USER, ""));

                            break;
                        }
                    }
                }
            }
            if (workingCopy.getAttribute(Constants.ATTR_REMOTE_SERVER, "").isEmpty()) {
                int result = DebugUITools.openLaunchConfigurationPropertiesDialog(Display.getCurrent().getActiveShell(),
                        workingCopy,
                        "org.eclipse.debug.ui.launchGroup.debug");
                if (result == Window.CANCEL) {
                    workingCopy.delete();
                    throw new CoreException(Status.OK_STATUS);
                }

            }
            ILaunchConfiguration ret = workingCopy.doSave();
            return ret;
        } catch (CoreException e) {
            reportError(null, e);
            return null;
        }
    }
}
