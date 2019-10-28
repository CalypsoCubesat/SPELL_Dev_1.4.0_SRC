/**
 * Copyright (c) 2005-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
/*
 * Author: atotic
 * Author: fabioz
 * Created: Aug 20, 2003
 */
package org.python.pydev.debug.ui;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.python.pydev.debug.core.Constants;
import org.python.pydev.debug.core.PydevDebugPlugin;
import org.python.pydev.debug.ui.blocks.SPELLRemoteDebugBlock;

/**
 * The main Python debug setup tab.
 * 
 * This tab contains:
 * <ul>
 *   <li>The program arguments block</li> 
 *   <li>The VM Arguments block</li>
 *   <li>The Working directory block</li>
 * </ul>
 */
public class SpellRemoteConnectionTab extends AbstractLaunchConfigurationTab {

    // Widget blocks
    private SPELLRemoteDebugBlock sPELLRemoteDebugBlock;

    public SpellRemoteConnectionTab(MainModuleTab mainModuleTab) {
        sPELLRemoteDebugBlock = createSPELLRemoteDebugBlock(mainModuleTab);
    }

    protected SPELLRemoteDebugBlock createSPELLRemoteDebugBlock(MainModuleTab mainModuleTab) {
        return new SPELLRemoteDebugBlock();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(Composite)
     */
    public void createControl(Composite parent) {
        Composite comp = new Composite(parent, SWT.NONE);
        setControl(comp);
        GridLayout gridLayout = new GridLayout();
        comp.setLayout(gridLayout);

        sPELLRemoteDebugBlock.createControl(comp);
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#isValid(org.eclipse.debug.core.ILaunchConfiguration)
     */
    @Override
    public boolean isValid(ILaunchConfiguration launchConfig) {
        setErrorMessage(null);
        setMessage(null);

        if (!sPELLRemoteDebugBlock.isValid(launchConfig)) {
            return false;
        }

        return true;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
     */
    public String getName() {
        return "SPELL Remote Settings";
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getImage()
     */
    @Override
    public Image getImage() {
        return PydevDebugPlugin.getImageCache().get(Constants.ARGUMENTS_ICON);
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
     */
    public void setDefaults(ILaunchConfigurationWorkingCopy arg0) {
        sPELLRemoteDebugBlock.setDefaults(arg0);
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
     */
    public void initializeFrom(ILaunchConfiguration configuration) {
        sPELLRemoteDebugBlock.initializeFrom(configuration);
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
     */
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        sPELLRemoteDebugBlock.performApply(configuration);
    }

    @Override
    protected boolean isDirty() {
        // TODO Auto-generated method stub
        return sPELLRemoteDebugBlock.isDirty();
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setLaunchConfigurationDialog(ILaunchConfigurationDialog)
     */
    @Override
    public void setLaunchConfigurationDialog(ILaunchConfigurationDialog dialog) {
        super.setLaunchConfigurationDialog(dialog);
        sPELLRemoteDebugBlock.setLaunchConfigurationDialog(dialog);
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getErrorMessage()
     */
    @Override
    public String getErrorMessage() {
        String result = super.getErrorMessage();

        if (result == null) {
            result = sPELLRemoteDebugBlock.getErrorMessage();
        }

        return result;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getMessage()
     */
    @Override
    public String getMessage() {
        String result = super.getMessage();

        if (result == null) {
            result = sPELLRemoteDebugBlock.getMessage();
        }

        return result;
    }
}
