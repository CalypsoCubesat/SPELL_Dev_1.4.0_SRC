///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.jobs
// 
// FILE      : DatabaseLoadJob.java
//
// DATE      : 2009-09-14
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
// SUBPROJECT: SPELL Development Environment
//
///////////////////////////////////////////////////////////////////////////////
package com.astra.ses.spell.dev.database.jobs;

import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.CellEditor.LayoutData;
import org.eclipse.swt.widgets.Display;
import org.python.pydev.editor.PyEdit;

import com.astra.ses.spell.dev.database.Activator;
import com.astra.ses.spell.dev.database.DatabaseDriverManager;
import com.astra.ses.spell.dev.database.DatabaseLoadException;
import com.astra.ses.spell.dev.database.DatabaseManager;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabaseDriver;


/**************************************************************************
 * DatabaseLoadJob class will try to retrieve a ISpellDatabase in a 
 * different thread
 *************************************************************************/
public class DatabaseLoadJob extends Job 
{
	/** Current project */
	private IProject m_project;
	/** Driver Name */
	private String m_driverName;
	/** DB path */
	private String m_path;
	/** Job result */
	public IStatus result;
	private PyEdit editor;
	
	/**********************************************************************
	 * Constructor
	 * @param driver
	 * @param path
	 *********************************************************************/
	public DatabaseLoadJob(IProject project, String driver, String path) {
		this(project,driver,path,null);
	}
	
	public DatabaseLoadJob(IProject project, String driver, String path,PyEdit editor) {
		super("DatabaseLoadJob");
		m_project = project;
		m_driverName = driver;
		m_path = path;
		this.editor = editor;
	}
	
	@Override
	public IStatus run(IProgressMonitor monitor) 
	{
		
		monitor.setTaskName("Loading TM/TC database");
		result = Status.OK_STATUS;
		monitor.beginTask("Loading database for project " + m_project.getName(),2);
		try
		{
			ISpellDatabaseDriver driver = DatabaseDriverManager.getInstance().getDriver(m_driverName);
			if ((driver == null)||(monitor.isCanceled()))
			{
				result = Status.CANCEL_STATUS;
				return result;
			}
			boolean correctDb = driver.checkDatabase(m_path);
			if (!correctDb)
			{
				if (m_path == null || m_path.isEmpty()){
					return Status.OK_STATUS;
				}
				String errMessage = "Database for project " + m_project.getName() + " is not accessible";
				result = new Status(IStatus.ERROR, Activator.PLUGIN_ID, errMessage, new DatabaseLoadException(errMessage));
			}
			else
			{
				try 
				{
					final ISpellDatabase loadedDatabase = driver.loadDatabase(m_path, monitor);

					
					if (Display.getCurrent() == null)
					{
//						Thread t1 = new Thread(){
//							public void run() {
//								Collection<String> telecommandNames = loadedDatabase.getTelecommandNames();
//							};
//						};
//						t1.start();
//						Thread t2 = new Thread(){
//							public void run() {
//								Collection<String> telemetryParameterNames = loadedDatabase.getTelemetryParameterNames();
//							};
//						};
//						t2.start();
//						try {
//							t1.join();
//							t2.join();
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
						
						
						Display.getDefault().asyncExec( new Runnable()
						{
							public void run()
							{
								DatabaseManager.getInstance().setDB(m_project, loadedDatabase);
								
								DatabaseManager.getInstance().notifyListeners(loadedDatabase);
							}
							
						});
					}
					else
					{
						DatabaseManager.getInstance().setDB(m_project, loadedDatabase);
						
						DatabaseManager.getInstance().notifyListeners(loadedDatabase);
					}
					
				} 
				catch (DatabaseLoadException e) 
				{
					String errMessage = "Error loading database for project " + m_project.getName();
					result = new Status(IStatus.ERROR, Activator.PLUGIN_ID, errMessage, new DatabaseLoadException(errMessage));
				}
			}
			
			
			
		}
		finally
		{
			monitor.done();
		}
		if (monitor.isCanceled())
		{
			result = Status.CANCEL_STATUS;
		}
		return result;
	}

}
