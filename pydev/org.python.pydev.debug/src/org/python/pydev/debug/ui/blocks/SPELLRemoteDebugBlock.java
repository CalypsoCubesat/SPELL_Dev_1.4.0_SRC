/**
 * Copyright (c) 2005-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package org.python.pydev.debug.ui.blocks;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.python.pydev.core.log.Log;
import org.python.pydev.debug.core.Constants;
import org.python.pydev.editor.preferences.PydevEditorPrefs;
import org.python.pydev.plugin.preferences.PydevPrefs;

/**
 * A control for setting the working directory associated with a launch
 * configuration.
 * 
 * Most of the code comes from JDT's JavaArgumentsTab class.
 */
public class SPELLRemoteDebugBlock extends AbstractLaunchConfigurationTab {

    private Combo serverSelectionCombo;
    private Text remotePortText;
    private Text remoteMissionText;
    private boolean initialized = false;

    /*
     * (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
     */
    @Override
    public void createControl(Composite parent) {
        setDirty(false);
        Font font = parent.getFont();
        Group group = new Group(parent, SWT.NONE);
        group.setText("SPELL Remote Server DB");
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        group.setLayoutData(gd);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        group.setLayout(layout);
        group.setFont(font);

        String controlName = "Available Servers: ";
        group.setText(controlName);
        Label label = new Label(group, SWT.NONE);
        label.setText("Selected Server:");
        gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        label.setLayoutData(gd);
        serverSelectionCombo = new Combo(group, SWT.SINGLE);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        serverSelectionCombo.setLayoutData(gd);
        serverSelectionCombo.setFont(font);
        for (String[] s : new String[][] {
                new String[] { "T2", "spell@10.113.10.13" },
                new String[] { "S2", "spell@10.113.9.12" },
                new String[] { "ZS16(A/B) on S1", "spell@s1anal01.scorpio.eng.ses" },
                new String[] { "ZS16(C/D) on S3", "spell@s3anal02.scorpio.eng.ses" },
                new String[] { "ZS(15/16)(E/F) on S3", "spell@s3anal03.scorpio.eng.ses" },
                new String[] { "ZS(15/16)(G/H) on S3", "spell@s3anal04.scorpio.eng.ses" },
                new String[] { "ZS(15/16)(I/J) on S3", "spell@s3anal05.scorpio.eng.ses" } }) {
            serverSelectionCombo.add(s[0]);
            serverSelectionCombo.setData(s[0], s[1]);
        }
        serverSelectionCombo.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent evt) {
                updateLaunchConfigurationDialog();
            }
        });
        serverSelectionCombo.addSelectionListener(new SelectionListener() {

            public void widgetSelected(SelectionEvent e) {
                updateLaunchConfigurationDialog();
            }

            public void widgetDefaultSelected(SelectionEvent e) {
                updateLaunchConfigurationDialog();
            }
        });
        label = new Label(group, SWT.NONE);
        label.setText("Remote Port:");
        gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        label.setLayoutData(gd);
        remotePortText = new Text(group, SWT.SINGLE | SWT.BORDER);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        remotePortText.setLayoutData(gd);
        remotePortText.setFont(font);
        remotePortText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent evt) {
                updateLaunchConfigurationDialog();
            }
        });
        label = new Label(group, SWT.NONE);
        label.setText("Remote Mission:");
        gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        label.setLayoutData(gd);
        remoteMissionText = new Text(group, SWT.SINGLE | SWT.BORDER);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        remoteMissionText.setLayoutData(gd);
        remoteMissionText.setFont(font);
        remoteMissionText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent evt) {
                updateLaunchConfigurationDialog();
            }
        });

        //        fPrgmArgumentsText = new Text(group, SWT.MULTI | SWT.WRAP | SWT.BORDER | SWT.V_SCROLL);
        //        gd = new GridData(GridData.FILL_BOTH);
        //        gd.heightHint = 40;
        //        gd.widthHint = 100;
        //        fPrgmArgumentsText.setLayoutData(gd);
        //        fPrgmArgumentsText.setFont(font);
        //        fPrgmArgumentsText.addModifyListener(new ModifyListener() {
        //            public void modifyText(ModifyEvent evt) {
        //                updateLaunchConfigurationDialog();
        //            }
        //        });

    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
     */
    public String getName() {
        return "Program arguments";
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
     */
    @Override
    public void initializeFrom(ILaunchConfiguration configuration) {
        try {
            initialized = true;
            setDirty(false);
            String remote_Server_Selected = configuration.getAttribute(Constants.ATTR_REMOTE_SELECTED_ENTRY, "");

            if (remote_Server_Selected.isEmpty()) {
                String host = configuration.getAttribute(Constants.ATTR_REMOTE_SERVER, "");
                String user = configuration.getAttribute(Constants.ATTR_REMOTE_USER, "");
                if (!user.isEmpty()) {
                    remote_Server_Selected = user + "@" + host;
                } else if (!host.isEmpty()) {
                    remote_Server_Selected = host;
                } else {
                    remote_Server_Selected = "";
                }

            }
            serverSelectionCombo.setText(remote_Server_Selected);
            remotePortText.setText(configuration.getAttribute(Constants.ATTR_REMOTE_PORT, ""));
            remoteMissionText.setText(configuration.getAttribute(Constants.ATTR_REMOTE_MISSION, ""));

        } catch (CoreException e) {
            setErrorMessage("Exception occurred reading configuration" + e.getStatus().getMessage());
            Log.log(e);
        }
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
     */
    @Override
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        if (!initialized) {
            return;
        }
        String selected_Server_Info = serverSelectionCombo.getText();
        Object data = serverSelectionCombo.getData(selected_Server_Info);
        if (data != null) {
            selected_Server_Info = (String) data;
        }

        String remote_Server = "";
        String remote_User = "";

        if (selected_Server_Info.contains("@")) {
            String[] split = selected_Server_Info.split("@");
            remote_Server = split[1];
            remote_User = split[0];
        } else {
            remote_Server = selected_Server_Info;
        }
        try {

            if (!configuration.getAttribute(Constants.ATTR_REMOTE_SELECTED_ENTRY, "")
                    .equals(serverSelectionCombo.getText())) {
                configuration.setAttribute(Constants.ATTR_REMOTE_SELECTED_ENTRY, serverSelectionCombo.getText());
                setDirty(true);
            }

            if (!configuration.getAttribute(Constants.ATTR_REMOTE_SERVER, "").equals(remote_Server)) {
                configuration.setAttribute(Constants.ATTR_REMOTE_SERVER, remote_Server);
                setDirty(true);
            }
            if (!configuration.getAttribute(Constants.ATTR_REMOTE_USER, "").equals(remote_User)) {
                configuration.setAttribute(Constants.ATTR_REMOTE_USER, remote_User);
                setDirty(true);
            }
            if (!configuration.getAttribute(Constants.ATTR_REMOTE_PORT, "").equals(remotePortText.getText())) {
                configuration.setAttribute(Constants.ATTR_REMOTE_PORT, remotePortText.getText());
                setDirty(true);
            }
            if (!configuration.getAttribute(Constants.ATTR_REMOTE_MISSION, "").equals(remoteMissionText.getText())) {
                configuration.setAttribute(Constants.ATTR_REMOTE_MISSION, remoteMissionText.getText());
                setDirty(true);
            }

        } catch (CoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
     */
    @Override
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {

        configuration.setAttribute(Constants.ATTR_REMOTE_SERVER, "");
        configuration.setAttribute(Constants.ATTR_REMOTE_USER, "");
        configuration.setAttribute(Constants.ATTR_REMOTE_MISSION, "");
        configuration.setAttribute(Constants.ATTR_REMOTE_PORT,
                "" + PydevPrefs.getPreferences().getInt(PydevEditorPrefs.DEBUG_SPELL_REMOTE_PORT));
        configuration.setAttribute(Constants.ATTR_REMOTE_SELECTED_ENTRY, "");
        configuration.setAttribute(Constants.ATTR_REMOTE_JSON_DB, "");
    }

    @Override
    public boolean isDirty() {
        // TODO Auto-generated method stub
        return super.isDirty();
    }

}
