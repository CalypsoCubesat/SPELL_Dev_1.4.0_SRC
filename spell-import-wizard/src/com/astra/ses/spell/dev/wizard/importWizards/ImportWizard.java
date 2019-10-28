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
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobGroup;
import org.eclipse.egit.core.op.CloneOperation;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jgit.transport.URIish;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

@SuppressWarnings("restriction")
public class ImportWizard extends Wizard implements IImportWizard {
	
	ImportWizardPage mainPage;
	
	public ImportWizard() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	public boolean performFinish() {
		Object[] items = mainPage.getSpacecrafts();

		Job job1 = new CloneRepository("Cloning repositories", items) {
			private final int CLONE_TICK_NUMBER = 5000;
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				SubMonitor subMonitor = SubMonitor.convert(monitor, items.length*2*CLONE_TICK_NUMBER);
				try{
					ArrayList<Job> cloneJobs = new ArrayList<>();
					JobGroup cloneJobGroup = new JobGroup("Clone Job Group", 4, items.length);

					for (final Object item: items) {
						Job cloneJob = new Job("Clone Job for " + item.toString()) {
							
							@Override
							protected IStatus run(IProgressMonitor monitor) {
								final SubMonitor subMonitor = SubMonitor.convert(monitor, 2*CLONE_TICK_NUMBER);

								String[] ts;
								URIish uri;
								
								ts = item.toString().split(" ");
								final String scname = ts[0];
								final String branch = ts[1];
								subMonitor.setTaskName("Cloning " + scname + " " + branch);
								final File workdir = new File(mainPage.basePath + "/" + scname + "_" + branch);

								try {
									uri = new URIish("git@scms.ses:spacecraft/" + scname);
								} catch(Exception e) {
									uri = null;
								}

								CloneOperation cloner = new CloneOperation(uri, true, null, workdir, "refs/heads/"+branch, "origin", 10);
								try {
									if (workdir.exists())
										workdir.delete();
									cloner.run(subMonitor.newChild(CLONE_TICK_NUMBER));
								} catch(Exception e) {
									//
									e.printStackTrace();
								}
								if (subMonitor.isCanceled())
									return Status.OK_STATUS;
								subMonitor.setWorkRemaining(CLONE_TICK_NUMBER);
								subMonitor.setTaskName("Importing " + scname + " " + branch);
								
								Display.getDefault().asyncExec(new Runnable() {
									
									@Override
									public void run() {
										IProjectDescription description = null;
										try {
											//String scname = item.toString().split(" ")[0];
											//String branch = item.toString().split(" ")[1];
											synchronized (ImportWizard.class) {
												description = ResourcesPlugin.getWorkspace().loadProjectDescription(new Path(mainPage.basePath + "/" + scname + "_" + branch + "/.project")); //$NON-NLS-1$ 
												IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
												try {
													project.delete(true, null);
												} catch (Exception e) {
													// TODO: handle exception
												}
												project.create(description, null);
												project.open(null);
											}
										} catch (CoreException exception_p) {
											//exception_p.printStackTrace();
											try {
												workdir.delete();
											} catch (Exception ex){
												
											}
										}
									}
								});
								subMonitor.setWorkRemaining(0);

								subMonitor.done();
								return Status.OK_STATUS;
							}
						};
						cloneJob.setJobGroup(cloneJobGroup);
						cloneJob.schedule();
						cloneJobs.add(cloneJob);
					}
					boolean canExit = false;
					while (!canExit && !subMonitor.isCanceled()){
						try {
							canExit = cloneJobGroup.join(1000, subMonitor);
						} catch (OperationCanceledException e) {
							
							canExit = true;
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					return Status.OK_STATUS;
				}finally{
					subMonitor.done();
				}
			} 
		};

		// Start the Job
		job1.schedule();
		
        return true;
	}
	 
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("Spacecraft Project Import Wizard"); //NON-NLS-1
		setNeedsProgressMonitor(true);
		
		mainPage = new ImportWizardPage("Import Spacecraft Project",selection); //NON-NLS-1
	}
	
	/* (non-Javadoc)
     * @see org.eclipse.jface.wizard.IWizard#addPages()
     */
    public void addPages() {
        super.addPages(); 
        addPage(mainPage);
    }

}
