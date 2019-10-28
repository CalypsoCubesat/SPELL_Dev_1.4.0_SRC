///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database
// 
// FILE      : DatabaseManager.java
//
// DATE      : 2008-11-21 13:54
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
package com.astra.ses.spell.dev.database;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.core.internal.localstore.IsSynchronizedVisitor;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import com.astra.ses.spell.dev.database.interfaces.ICalibration;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter;
import com.astra.ses.spell.dev.database.jobs.DatabaseLoadJob;
import com.astra.ses.spell.dev.database.listener.IWorkingDatabaseListener;
import com.astra.ses.spell.dev.database.properties.DatabasePropertiesManager;
import com.astra.ses.spell.dev.workspace.IWorkspaceListener;
import com.astra.ses.spell.dev.workspace.exception.WorkspaceException;

/******************************************************************************
 * Class for managing the different databases from the different projects
 *****************************************************************************/
public class DatabaseManager implements IWorkspaceListener
{

	private static final int PERSISTENT_DATABASES_COUNT = 4;
	/** Singleton instance */
	private static DatabaseManager	            s_instance;
	/** Working Database */
	private IProject	                        m_workingProject;
	/** Working Database Listeners */
	private ArrayList<IWorkingDatabaseListener>	m_listeners;
	/** Map between projects and strings */
	private Map<IProject, ISpellDatabase>	    m_projectDatabase;
	private LinkedHashSet<ISpellDatabase> persistentDatbases = new LinkedHashSet<ISpellDatabase>();

	/**************************************************************************
	 * Singleton instance retrieval
	 * 
	 * @return
	 *************************************************************************/
	public static DatabaseManager getInstance()
	{
		if (s_instance == null)
		{
			s_instance = new DatabaseManager();
		}
		return s_instance;
	}

	/**************************************************************************
	 * Constructor
	 *************************************************************************/
	public DatabaseManager()
	{
		m_listeners = new ArrayList<IWorkingDatabaseListener>();
		m_projectDatabase = new WeakHashMap<IProject, ISpellDatabase>();
	}

	/**************************************************************************
	 * Get the database for the given project
	 * 
	 * @return The database instance
	 *************************************************************************/
	public ISpellDatabase getProjectDatabase(IResource resource)
	{
		if (resource == null)
			 return null;
		ISpellDatabase iSpellDatabase = m_projectDatabase.get(resource.getProject());
		if (iSpellDatabase != null){
			persistentDatbases.add(iSpellDatabase);
			while (persistentDatbases.size() > 8){
				Iterator<ISpellDatabase> iterator = persistentDatbases.iterator();
				iterator.next();
				iterator.remove();
			}
		}
		
		return m_projectDatabase.get(resource.getProject());
	}

	/**************************************************************************
	 * Get the database for the given project
	 * 
	 * @return The database instance
	 *************************************************************************/
	public ISpellDatabase getProjectDatabase(String projectName)
	{
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		ISpellDatabase iSpellDatabase = m_projectDatabase.get(project);
		if (iSpellDatabase != null){
			persistentDatbases.add(iSpellDatabase);
			while (persistentDatbases.size() > PERSISTENT_DATABASES_COUNT){
				Iterator<ISpellDatabase> iterator = persistentDatbases.iterator();
				iterator.next();
				iterator.remove();
			}
		}
		return iSpellDatabase;
	}

	/**************************************************************************
	 * Load the database for the given project
	 *************************************************************************/
	public void setDB(IProject project, ISpellDatabase newDB)
	{
		DatabasePropertiesManager manager = new DatabasePropertiesManager(project);
		manager.setDatabasePath(newDB.getDatabasePath());
		m_projectDatabase.put(project, newDB);
		if (project.equals(m_workingProject))
		{
			ISpellDatabase workingDB = m_projectDatabase.get(m_workingProject);
			ISpellDatabase iSpellDatabase = workingDB;
			if (iSpellDatabase != null){
				persistentDatbases.add(iSpellDatabase);
				while (persistentDatbases.size() >PERSISTENT_DATABASES_COUNT){
					Iterator<ISpellDatabase> iterator = persistentDatbases.iterator();
					iterator.next();
					iterator.remove();
				}
			}
			notifyListeners(workingDB);
		}
	}
	public void freeDB(IProject project, ISpellDatabase newDB){
		m_projectDatabase.remove(project);
		persistentDatbases.remove(newDB);
		
	}
	// //////////////////////////////////////////////////////////////////////////
	// WORKSPACE LISTENER METHODS
	// //////////////////////////////////////////////////////////////////////////
	@Override
	public synchronized void procedureOpened(IFile opened, IProgressMonitor monitor) throws WorkspaceException
	{
		if (opened == null)
			return;
		
		IProject resourceProject = opened.getProject();
		// If database has not still been loaded, we need to load it
		if (!m_projectDatabase.containsKey(resourceProject))
		{
			try
			{
				loadProjectdatabase(resourceProject, monitor);
			}
			catch (DatabaseLoadException e)
			{
				notifyListeners(null);
				throw new WorkspaceException(e.getMessage());
			}
		}
	}

	@Override
	public void procedureFocused(IFile opened)
	{
		if (opened == null)
			return;
		IProject resourceProject = opened.getProject();
		m_workingProject = resourceProject;
		ISpellDatabase workingDatabase = getProjectDatabase(resourceProject);
		ISpellDatabase iSpellDatabase = workingDatabase;
		if (iSpellDatabase != null){
			persistentDatbases.add(iSpellDatabase);
			while (persistentDatbases.size() > PERSISTENT_DATABASES_COUNT){
				Iterator<ISpellDatabase> iterator = persistentDatbases.iterator();
				iterator.next();
				iterator.remove();
			}
		}
		notifyListeners(workingDatabase);
	}

	@Override
	public void projectClosed(IProject project)
	{
		System.err.println("PROJECT CLOSED");
		// Remove the database
		m_projectDatabase.remove(project);
		if (project.equals(m_workingProject))
		{
			notifyListeners(null);
		}
	}

	@Override
	public void fileFocused()
	{
		/*
		 * Notify the listeners for not to use any database
		 */
		notifyListeners(null);
	}

	/***************************************************************************
	 * Return the current project
	 * 
	 * @return The project reference
	 **************************************************************************/
	public IProject getFocusedProject()
	{
		return m_workingProject;
	}

	/***************************************************************************
	 * Refresh project's database
	 * 
	 * @param project
	 * @throws WorkspaceException
	 **************************************************************************/
	public synchronized void refreshProjectDatabase(IProject project)
	{
		// If the database for the given project has been loaded, then load it
		if (m_projectDatabase.containsKey(project))
		{
			try
			{
				loadProjectdatabase(project, new NullProgressMonitor());
			}
			catch (DatabaseLoadException e)
			{
				notifyListeners(null);
			}
		}
	}

	/***************************************************************************
	 * Load the database for the given project
	 * 
	 * @param project
	 * @throws DatabaseLoadException
	 **************************************************************************/
	public void loadProjectdatabase(IProject project, IProgressMonitor monitor) throws DatabaseLoadException
	{
		DatabasePropertiesManager manager = new DatabasePropertiesManager(project);
		String driver = manager.getDatabaseDriverName();
		String path = manager.getDatabasePath();

		DatabaseLoadJob dbLoad = new DatabaseLoadJob(project, driver, path);
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null)
		{
			/*ProgressMonitorDialog dialog = new ProgressMonitorDialog(window.getShell());
			try
			{
				dialog.setCancelable(false);
				dialog.run(true, false, dbLoad);
				if (dbLoad.result.getSeverity() == IStatus.ERROR) { throw new DatabaseLoadException(dbLoad.result.getMessage()); }
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}*/
			dbLoad.schedule();
		}
		else
		{
			dbLoad.run(monitor);
			if (dbLoad.result.getSeverity() == IStatus.ERROR) { throw new DatabaseLoadException(dbLoad.result.getMessage()); }
		}
	}

	/***************************************************************************
	 * Notify listeners about the current database in use
	 **************************************************************************/
	public void notifyListeners(ISpellDatabase db)
	{
		/*
		 * Notify the listeners for not to use any database
		 */
		for (IWorkingDatabaseListener listener : m_listeners)
		{
			listener.workingDatabaseChanged(db);
		}
	}

	/***************************************************************************
	 * Register a working database listener
	 **************************************************************************/
	public void addDatabaseListener(IWorkingDatabaseListener listener)
	{
		m_listeners.add(listener);
		ISpellDatabase workingDB = m_projectDatabase.get(m_workingProject);
		if (workingDB != null)
		{
			listener.workingDatabaseChanged(workingDB);
		}
	}

	/***************************************************************************
	 * Unregister a working database listener
	 **************************************************************************/
	public void removeDatabaseListener(IWorkingDatabaseListener listener)
	{
		m_listeners.remove(listener);
	}

	public  ArrayList<IWorkingDatabaseListener> getListeners() {
		// TODO Auto-generated method stub
		return m_listeners;
	}
}
