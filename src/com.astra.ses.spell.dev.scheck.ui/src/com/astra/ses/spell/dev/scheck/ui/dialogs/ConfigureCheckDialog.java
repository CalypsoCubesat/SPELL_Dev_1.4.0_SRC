///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.ui.dialogs
// 
// FILE      : ConfigureCheckDialog.java
//
// DATE      : Apr 28, 2014
//
// Copyright (C) 2008, 2011 SES ENGINEERING, Luxembourg S.A.R.L.
//
// By using this software in any way, you are agreeing to be bound by
// the terms of this license.
//
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// NO WARRANTY
// EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, THE PROGRAM IS PROVIDED
// ON AN "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, EITHER
// EXPRESS OR IMPLIED INCLUDING, WITHOUT LIMITATION, ANY WARRANTIES OR
// CONDITIONS OF TITLE, NON-INFRINGEMENT, MERCHANTABILITY OR FITNESS FOR A
// PARTICULAR PURPOSE. Each Recipient is solely responsible for determining
// the appropriateness of using and distributing the Program and assumes all
// risks associated with its exercise of rights under this Agreement ,
// including but not limited to the risks and costs of program errors,
// compliance with applicable laws, damage to or loss of data, programs or
// equipment, and unavailability or interruption of operations.
//
// DISCLAIMER OF LIABILITY
// EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, NEITHER RECIPIENT NOR ANY
// CONTRIBUTORS SHALL HAVE ANY LIABILITY FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING WITHOUT LIMITATION
// LOST PROFITS), HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
// ARISING IN ANY WAY OUT OF THE USE OR DISTRIBUTION OF THE PROGRAM OR THE
// EXERCISE OF ANY RIGHTS GRANTED HEREUNDER, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGES.
//
// Contributors:
//    SES ENGINEERING - initial API and implementation and/or initial documentation
//
// PROJECT   : SPELL
//
// SUBPROJECT: SPELL DEV
//
///////////////////////////////////////////////////////////////////////////////
package com.astra.ses.spell.dev.scheck.ui.dialogs;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.ModalContext;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import com.astra.ses.spell.dev.database.DatabaseLoadException;
import com.astra.ses.spell.dev.database.DatabaseManager;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.scheck.ISemanticCheckProgress;
import com.astra.ses.spell.dev.scheck.ResourceManager;
import com.astra.ses.spell.dev.scheck.ui.jobs.PerformCheckJob;

public class ConfigureCheckDialog extends TitleAreaDialog implements ISemanticCheckProgress
{

	private java.util.List<IFile>	m_files;
	private ProgressBar	          m_progress;
	private Label	              m_progressLabel;
	private Label	              m_progressCount;
	private AtomicBoolean	      m_cancelled;
	private AtomicBoolean	      m_working;
	private List	              m_progressList;
	private List	              m_resourcesList;
	private int	                  m_fileCount;
	private int	                  m_warningCount;
	private int	                  m_errorCount;
	private Button	              m_selectAll;
	private Button	              m_deselectAll;

	public ConfigureCheckDialog(Shell parentShell, java.util.List<IResource> resources)
	{
		super(parentShell);
		m_files = new LinkedList<IFile>();
		m_working = new AtomicBoolean(false);
		m_cancelled = new AtomicBoolean(false);
		for (IResource rsc : resources)
		{
			ResourceManager.instance().findFiles(rsc, m_files);
		}
	}

	/***************************************************************************
	 * Defines the shell characteristics
	 **************************************************************************/
	@Override
	protected void setShellStyle(int newShellStyle)
	{
		super.setShellStyle(SWT.CLOSE | SWT.MIN | SWT.MAX | SWT.RESIZE);
	}

	/***************************************************************************
	 * Called when the dialog is about to close.
	 * 
	 * @return The superclass return value.
	 **************************************************************************/
	public boolean close()
	{
		return super.close();
	}

	/***************************************************************************
	 * Creates the dialog contents.
	 * 
	 * @param parent
	 *            The base composite of the dialog
	 * @return The resulting contents
	 **************************************************************************/
	protected Control createContents(Composite parent)
	{
		Control contents = super.createContents(parent);
		setTitle("Semantic check");
		setMessage("Perform the semantic check on the selected resources");
		getShell().setText("Semantic check");
		return contents;
	}

	/***************************************************************************
	 * Create the dialog area contents.
	 * 
	 * @param parent
	 *            The base composite of the dialog
	 * @return The resulting contents
	 **************************************************************************/
	@Override
    protected Control createDialogArea(Composite parent)
    {
        // Main composite of the dialog area -----------------------------------
        Composite top = new Composite(parent, SWT.NONE);
        GridData areaData = new GridData(GridData.FILL_BOTH);
        areaData.widthHint = 800;
        areaData.heightHint = 700;
        top.setLayoutData(areaData);
        GridLayout layout = new GridLayout();
        layout.numColumns = 1;
        layout.verticalSpacing = 10;
        top.setLayout(layout);
        
        
        Group group = new Group(top, SWT.BORDER);
        group.setText("Resources to check");
        group.setLayoutData(new GridData( GridData.FILL_HORIZONTAL ));
        group.setLayout( new GridLayout(1,true) );
        
        final Label lbl = new Label(group, SWT.NONE);
        lbl.setText(m_files.size() + " procedures selected.");
        lbl.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));
        
        m_resourcesList = new List(group,SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.MULTI );
        GridData gd = new GridData( GridData.FILL_HORIZONTAL );
        gd.heightHint = 200;
        m_resourcesList.setLayoutData(gd);
        for(IFile file : m_files)
        {
        	m_resourcesList.add(file.getName());
        }
        m_resourcesList.selectAll();
        m_resourcesList.addSelectionListener( new SelectionAdapter()
		{
			public void widgetSelected( SelectionEvent ev )
			{
				m_selectAll.setEnabled(m_resourcesList.getSelectionCount() != m_resourcesList.getItemCount());
				m_deselectAll.setEnabled(m_resourcesList.getSelectionCount() == m_resourcesList.getItemCount());
				lbl.setText(m_resourcesList.getSelectionCount() + " procedures selected.");
				getButton(IDialogConstants.OK_ID).setEnabled(m_resourcesList.getSelectionCount()>0);
			}
		});

        Composite ctrl = new Composite(group, SWT.NONE);
        ctrl.setLayout(new RowLayout(SWT.HORIZONTAL));
        ctrl.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));
        
        m_selectAll = new Button(ctrl, SWT.PUSH);
        m_deselectAll = new Button(ctrl, SWT.PUSH);
        
        
        m_selectAll.setText("Select all");
        m_selectAll.setEnabled(false);
        m_selectAll.addSelectionListener( new SelectionAdapter()
        {
        	public void widgetSelected( SelectionEvent ev )
        	{
        		m_resourcesList.selectAll();
        		m_selectAll.setEnabled(false);
        		m_deselectAll.setEnabled(true);
				lbl.setText(m_resourcesList.getSelectionCount() + " procedures selected.");
				getButton(IDialogConstants.OK_ID).setEnabled(true);
        	}
        });
        
        m_deselectAll.setText("Deselect all");
        m_deselectAll.setEnabled(true);
        m_deselectAll.addSelectionListener( new SelectionAdapter()
        {
        	public void widgetSelected( SelectionEvent ev )
        	{
        		m_resourcesList.deselectAll();
        		m_selectAll.setEnabled(true);
        		m_deselectAll.setEnabled(false);
				lbl.setText(m_resourcesList.getSelectionCount() + " procedures selected.");
				getButton(IDialogConstants.OK_ID).setEnabled(false);
        	}
        });
        
        Group group2 = new Group(top, SWT.BORDER);
        group2.setText("Operation progress");
        group2.setLayoutData(new GridData( GridData.FILL_BOTH ));
        group2.setLayout( new GridLayout(1,true) );

        m_progressLabel = new Label(group2, SWT.NONE);
        m_progressLabel.setText("(not started)");
        m_progressLabel.setLayoutData(new GridData( GridData.FILL_HORIZONTAL ));
        m_progressLabel.setEnabled(false);
        
        m_progress = new ProgressBar(group2,SWT.BORDER);
        m_progress.setLayoutData(new GridData( GridData.FILL_HORIZONTAL ));
        m_progress.setEnabled(false);

        m_progressCount = new Label(group2, SWT.NONE);
        m_progressCount.setText("0 procedures");
        m_progressCount.setLayoutData(new GridData( GridData.FILL_HORIZONTAL ));
        m_progressCount.setEnabled(false);

        m_progressList = new List(group2,SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.READ_ONLY  );
        m_progressList.setLayoutData(new GridData( GridData.FILL_BOTH ));
        m_progressList.setEnabled(false);
        m_progressList.addMouseListener( new MouseAdapter()
        {
			@Override
            public void mouseDoubleClick(MouseEvent e)
            {
	            IFile file = m_files.get(m_progressList.getSelectionIndex());
	            IWorkbenchWindow dw = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	            if (dw != null) 
	            {
	                IWorkbenchPage page = dw.getActivePage();
	                if (page != null) 
	                {
	                    try
                        {
	                        IDE.openEditor(page, file, true);
                        }
                        catch (PartInitException e1)
                        {
	                        e1.printStackTrace();
                        }
	                }
	            }
            }
        });

        return parent;
    }

	/***************************************************************************
	 * Create the button bar buttons.
	 * 
	 * @param parent
	 *            The Button Bar.
	 **************************************************************************/
	@Override
	protected void createButtonsForButtonBar(Composite parent)
	{
		createButton(parent, IDialogConstants.OK_ID, "Start check", false);
		createButton(parent, IDialogConstants.CANCEL_ID, "Stop", false);
		createButton(parent, IDialogConstants.CLOSE_ID, "Close", true);
		getButton(IDialogConstants.CANCEL_ID).setEnabled(false);
	}

	private void preloadDatabase(int[] selected, java.util.List<IResource> resources)
	{
		boolean haveDatabase = true;

		// Get selected resources
		for (int idx : selected)
		{
			IFile file = m_files.get(idx);
			resources.add(file);
			// Preload the database if needed
			ISpellDatabase db = DatabaseManager.getInstance().getProjectDatabase(file);
			if (db == null)
			{
				try
				{
					m_progressLabel.setText("Loading TM/TC database");
					DatabaseManager.getInstance().loadProjectdatabase(file.getProject(), this);
				}
				catch (DatabaseLoadException e)
				{
					e.printStackTrace();
					haveDatabase = false;
				}
			}
		}

		if (resources.isEmpty()) return;

		if (!haveDatabase)
		{
			MessageDialog.openWarning(getShell(), "Warning", "There is no TM/TC database associated to these resources.\n"
			        + "Many semantic check rules cannot be analyzed without database.");
		}
	}

	/***************************************************************************
	 * Called when one of the buttons of the button bar is pressed.
	 * 
	 * @param buttonId
	 *            The button identifier.
	 **************************************************************************/
	@Override
	protected void buttonPressed(int buttonId)
	{
		if (buttonId == IDialogConstants.OK_ID)
		{
			m_progressLabel.setEnabled(true);
			m_progress.setEnabled(true);
			m_progressList.setEnabled(true);
			m_progressCount.setEnabled(true);

			// Get selected resources
			int[] selected = m_resourcesList.getSelectionIndices();

			if (selected.length == 0) return;

			java.util.List<IResource> resources = new LinkedList<IResource>();
			preloadDatabase(selected, resources);
			final PerformCheckJob job = new PerformCheckJob(resources);

			try
			{
				m_cancelled.set(false);
				m_working.set(true);
				m_progressLabel.setEnabled(true);
				m_progress.setEnabled(true);
				m_progressList.setEnabled(true);
				m_progressCount.setEnabled(true);
				m_progressCount.setText("0 of " + m_files.size() + " procedures done");
				m_fileCount = 0;
				m_warningCount = 0;
				m_errorCount = 0;
				getButton(IDialogConstants.OK_ID).setEnabled(false);
				getButton(IDialogConstants.CANCEL_ID).setEnabled(true);
				getButton(IDialogConstants.CLOSE_ID).setEnabled(false);
				ModalContext.run(job, true, this, getShell().getDisplay());
			}
			catch (Exception e)
			{
				e.printStackTrace();
				m_working.set(false);
				m_progressLabel.setText("Error");
			}
		}
		else if (buttonId == IDialogConstants.CANCEL_ID)
		{
			if (m_working.get())
			{
				setCanceled(true);
				getButton(IDialogConstants.CANCEL_ID).setEnabled(false);
				getButton(IDialogConstants.CLOSE_ID).setEnabled(true);
				m_working.set(false);
			}
		}
		else if (buttonId == IDialogConstants.CLOSE_ID)
		{
			if (!m_working.get())
			{
				close();
			}
		}
	}

	@Override
	public void beginTask(final String name, final int totalWork)
	{
		if (m_cancelled.get() || !m_working.get()) return;
		Display.getDefault().asyncExec(new Runnable()
		{
			public void run()
			{
				m_progressLabel.setText(name);
				m_progress.setMaximum(totalWork);
			}
		});
	}

	@Override
	public void done()
	{
	}

	@Override
	public void internalWorked(double work)
	{
	}

	@Override
	public boolean isCanceled()
	{
		return m_cancelled.get();
	}

	@Override
	public void setCanceled(boolean value)
	{
		m_cancelled.set(value);
		Display.getDefault().asyncExec(new Runnable()
		{
			public void run()
			{
				m_progressLabel.setText("Cancelled");
				m_progress.setSelection(0);
			}
		});
	}

	@Override
	public void setTaskName(final String name)
	{
		subTask(name);
	}

	@Override
	public void subTask(final String name)
	{
		if (m_cancelled.get() || !m_working.get()) return;
		Display.getDefault().asyncExec(new Runnable()
		{
			public void run()
			{
				m_progressLabel.setText(name);
			}
		});

	}

	@Override
	public void worked(final int work)
	{
		if (m_cancelled.get() || !m_working.get()) return;
		Display.getDefault().asyncExec(new Runnable()
		{
			public void run()
			{
				m_progress.setSelection(m_progress.getSelection() + work);
			}
		});
	}

	@Override
	public void fileFinished(final IFile file, final SemanticCheckStatus status, final int numWarnings, final int numErrors)
	{
		Display.getDefault().asyncExec(new Runnable()
		{
			public void run()
			{
				m_warningCount += numWarnings;
				m_errorCount += numErrors;
				String item = file.getName();
				switch (status)
				{
				case FINISHED:
					item += " ( " + numWarnings + " warnings, " + numErrors + " errors )";
					break;
				case PARSER_ERROR:
					item += " ( parse error )";
					break;
				case CANCELLED:
					item += " ( cancelled )";
					break;
				}
				m_progressList.add(item);
				m_fileCount++;
				m_progressCount.setText(m_fileCount + " of " + m_files.size() + " procedures done");
			}
		});
	}

	@Override
	public void checkFinished()
	{
		Display.getDefault().asyncExec(new Runnable()
		{
			public void run()
			{
				m_working.set(false);
				m_progress.setSelection(m_progress.getMaximum());
				m_progressLabel.setText("Finished (" + m_warningCount + " warnings, " + m_errorCount + " errors)");
				getButton(IDialogConstants.CLOSE_ID).setEnabled(true);
				getButton(IDialogConstants.CANCEL_ID).setEnabled(false);
			}
		});
	}
}
