/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.astra.ses.spell.dev.wizard.importWizards;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.egit.core.RepositoryUtil;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;


public class ImportWizardPage extends WizardPage {
	
	protected CheckboxTableViewer sctableViewer;
	protected String basePath = "N:/git";
	
	@Override
	public void performHelp() {
		// TODO Auto-generated method stub
		super.performHelp();
	}
	
	
	@SuppressWarnings("restriction")
	public ImportWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		setTitle(pageName); //NON-NLS-1
		setDescription("Import a spacecraft project into the workspace"); //NON-NLS-1
		basePath = DefaultScope.INSTANCE.getNode("org.eclipse.egit.ui").get("default_repository_dir", basePath);
		basePath = InstanceScope.INSTANCE.getNode("org.eclipse.egit.ui").get("default_repository_dir", basePath);
		String defaultRepoDir = RepositoryUtil.getDefaultRepositoryDir();
		if (defaultRepoDir != null && !defaultRepoDir.isEmpty()){
			basePath = defaultRepoDir;
		}
		System.out.println("Home directory: " + basePath);
		
	}

	public ArrayList<String> getSpacecraftList() {
		Session session = null;
		Channel channel = null;
		String[] defaultSCnames={ "Empty list" };
		JSch jSch = new JSch();
		String output = "";
		File workdir;
		String sshdir = "";
		String knownhosts = "";
		String idkeys = "";
		String sshkey = "";
		ArrayList<String> scnames = new ArrayList<String>();
		ArrayList<String> scids = new ArrayList<String>();
		byte []buf = new byte[512];
		InputStream inputStream = null;

		
		sshdir = DefaultScope.INSTANCE.getNode("org.eclipse.jsch.core").get("SSH2HOME", sshdir);
		sshdir = InstanceScope.INSTANCE.getNode("org.eclipse.jsch.core").get("SSH2HOME", sshdir);
		knownhosts = sshdir + "/known_hosts";
		idkeys = DefaultScope.INSTANCE.getNode("org.eclipse.jsch.core").get("PRIVATEKEY", idkeys);
		idkeys = InstanceScope.INSTANCE.getNode("org.eclipse.jsch.core").get("PRIVATEKEY", idkeys);
		
		for(String idkey: idkeys.split(",")) {
			workdir = new File(sshdir+"/"+idkey);
		    if (workdir.exists()) {
		    	sshkey = sshdir+"/"+idkey;
		    }			
		}
		
		System.out.println("SSH home directory: " + sshdir);
		System.out.println("SSH key file: " + sshkey);
		System.out.println("known hosts file: " + knownhosts);
		
		try {
			
			
			jSch.setKnownHosts(knownhosts);
			jSch.addIdentity(sshkey); 
			
			session = jSch.getSession("git", "scms.ses");
			session.setConfig("StrictHostKeyChecking", "no");
			session.connect();
			channel = session.openChannel("shell");
			channel.connect();
			inputStream = channel.getInputStream();
			for (int length = 0;(length = inputStream.read(buf)) > 0;){
				output += new String(buf,0,length);
			}
		} catch(JSchException e) {
			System.out.println("Exception: " + e.getMessage());
		} catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		} finally {
			session.disconnect();
		}
		
		String[] repos = output.split("\n");
		
		CharSequence sc = "spacecraft/";
		
		for (String repo : repos ) {
			// TODO extract branch names from repo?
			if(repo.contains(sc)) {
				String[] s = repo.split("/");
				if(!s[1].equals(".*") && !scids.contains(s[1])) {
					scnames.add(s[1] + " SIM");
					scnames.add(s[1] + " OPS");
                    if(s[1] == "NSS06" || s[1] == "NSS07") {
                        scnames.add(s[1] + " SIM_ESCORPIO");
                        scnames.add(s[1] + " OPS_ESCORPIO");
                    }
					scids.add(s[1]);
				}
			}
		}
		
		if (scnames.size() == 0) {
			for(String scname : defaultSCnames) {
				scnames.add(scname);
			}
		}
		
		return scnames;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createAdvancedControls(org.eclipse.swt.widgets.Composite)
	 */	
	public void createControl(Composite parent) {
		Label label;
		File projectFile;
		ArrayList<String> scnames = new ArrayList<String>();		

		scnames = getSpacecraftList();
		
		Composite workArea = new Composite(parent, SWT.NONE);
		setControl(workArea);

		workArea.setLayoutData(new GridData(GridData.FILL_BOTH |
		         GridData.HORIZONTAL_ALIGN_FILL));

		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.makeColumnsEqualWidth = false;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		workArea.setLayout(layout);
		
		label = new Label(workArea, SWT.NONE);
		label.setText("Spacecraft");
		label.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

	    Table sctable = new Table(workArea, SWT.CHECK);
	    sctableViewer = new CheckboxTableViewer(sctable);
	    
	    for(String element: scnames) {
	    	String[] ts = element.split(" ");
			projectFile = new File(basePath + "/" + ts[0]+"_"+ts[1] + "/.project");
		    if (!projectFile.exists()) {
		    	sctableViewer.add(element);
		    } else {
		    	IProjectDescription description;
				try {
					description = ResourcesPlugin.getWorkspace().loadProjectDescription(new Path(basePath + "/" + ts[0]+"_"+ts[1] + "/.project"));
					IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
					if (project == null || !project.exists()){
						sctableViewer.add(element);
					}
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //$NON-NLS-1$ 
				
		    }
	    }
	    
	    GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd.heightHint = 60;
	    sctableViewer.getControl().setLayoutData(gd);
	    
		workArea.moveAbove(null);
	}
	
	 /* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createLinkTarget()
	 */
	protected void createLinkTarget() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#validateLinkedResource()
	 */
	protected IStatus validateLinkedResource() {
		return new Status(IStatus.OK, "com.astra.ses.spell.dev.wizard", IStatus.OK, "", null); //NON-NLS-1 //NON-NLS-2
	}
	
	public Object[] getSpacecrafts() {
		return sctableViewer.getCheckedElements();
	}
	
	public boolean isGrayed(Object item) {
		return sctableViewer.getGrayed(item);
	}
}
