///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.hifly.db
//
// FILE      : HiflyDatabase.java
//
// DATE      : Feb 22, 2011
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
package com.astra.ses.spell.dev.database.hifly.db;

import java.util.Collection;

import com.astra.ses.spell.dev.database.hifly.db.commanding.HiflyCommandManager;
import com.astra.ses.spell.dev.database.hifly.db.telemetry.CalibrationProvider;
import com.astra.ses.spell.dev.database.hifly.db.telemetry.HiflyParameterManager;
import com.astra.ses.spell.dev.database.hifly.parsers.HiflyVDFReader;
import com.astra.ses.spell.dev.database.interfaces.ICalibration;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter;

/******************************************************************************
 * hifly database model used by spell
 *****************************************************************************/
public class HiflyDatabase implements ISpellDatabase
{

	/** Root directory */
	private String	              m_databaseRootDir;
	/** Database name */
	private String	              m_databaseName;
	/** Database version */
	private String	              m_databaseVersion;
	/** Parameter definition reader */
	private HiflyParameterManager	m_parameterManager;
	/** Telecommand definition reader */
	private HiflyCommandManager	  m_commandManager;
	/** Calibration provider */
	private CalibrationProvider	  m_calibrations;

	/**************************************************************************
	 * Root directory
	 * 
	 * @param rootDir
	 *************************************************************************/
	public HiflyDatabase(String rootDir)
	{
		m_databaseRootDir = rootDir;
		initDatabase();
	}

	/**************************************************************************
	 * Init database elements
	 *************************************************************************/
	private void initDatabase()
	{
		//long start = System.nanoTime();
		HiflyVDFReader vdfReader = new HiflyVDFReader(m_databaseRootDir);
		
		m_databaseName = vdfReader.getVDF_NAME();
		m_databaseVersion = vdfReader.getVDF_COMMENT();
		//long dur  = System.nanoTime() - start;
		//System.out.println("DB VDF dur: " + (dur / 1000000) + " ms");
		//start = System.nanoTime();
		m_calibrations = new CalibrationProvider(m_databaseRootDir);
		//dur  = System.nanoTime() - start;
		//System.out.println("DB Calib dur: " + (dur / 1000000) + " ms");
		//start = System.nanoTime();
		m_parameterManager = new HiflyParameterManager(m_databaseRootDir);
		//dur  = System.nanoTime() - start;
		//System.out.println("DB Param dur: " + (dur / 1000000) + " ms");
		//start = System.nanoTime();
		m_commandManager = new HiflyCommandManager(m_databaseRootDir);
		//dur  = System.nanoTime() - start;
		//System.out.println("DB Cmd dur: " + (dur / 1000000) + " ms");
	}

	/**************************************************************************
	 * Database will no longer be used so we can free our resources
	 *************************************************************************/
	public void dispose()
	{
		m_parameterManager = null;
		m_commandManager = null;
		// TODO future resources might be disposed too
	}

	@Override
	public Collection<ITelemetryDisplayDefinition> getDisplays()
	{
		// TODO This feature is not still implemented by hifly driver
		return null;
	}

	@Override
	public String getDatabasePath()
	{
		return m_databaseRootDir;
	}

	@Override
	public String getName()
	{
		return m_databaseName;
	}

	@Override
	public Collection<String> getTelecommandNames()
	{
		return m_commandManager.getCommands();
	}

	@Override
	public Collection<String> getTelemetryParameterNames()
	{
		return m_parameterManager.getTelemetryParameters();
	}

	@Override
	public String getVersion()
	{
		return m_databaseVersion;
	}

	@Override
	public ITelecommand getTelecommandModel(String commandName)
	{
		return m_commandManager.getCommand(commandName.toUpperCase());
	}

	@Override
	public ITelemetryParameter getTelemetryModel(String parameterName)
	{
		return m_parameterManager.getParameter(parameterName.toUpperCase());
	}

	@Override
	public boolean isTelemetryParameter(String mnemonic)
	{
		return m_parameterManager.isParameter(mnemonic.toUpperCase());
	}

	@Override
	public boolean isTelecommand(String mnemonic)
	{
		return m_commandManager.isCommand(mnemonic.toUpperCase());
	}

	@Override
	public boolean isSequence(String mnemonic)
	{
		return m_commandManager.isSequence(mnemonic.toUpperCase());
	}

	@Override
    public Collection<String> getCalibrationNames()
    {
	    return m_calibrations.getCalibrationIdentifiers();
    }

	@Override
    public ICalibration getCalibrationModel(String identifier)
    {
	    return m_calibrations.getCalibration(identifier.toUpperCase());
    }
}
