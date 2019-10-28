///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.hifly.parsers.commanding
// 
// FILE      : HiflyCCFBuiltinReader.java
//
// DATE      : Jul 9, 2013
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
package com.astra.ses.spell.dev.database.hifly.parsers.commanding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.astra.ses.spell.dev.database.hifly.parsers.HiflyBuiltinReader;
import com.astra.ses.spell.dev.database.interfaces.CommandFactory;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument;

public class HiflyCCFBuiltinReader extends HiflyBuiltinReader
{

	/** Collection of available items */
	private Map<String, ITelecommand>	m_commands;
	private HiflyCDFBuiltinReader m_cdf;
	private String m_rootDir;

	/**************************************************************************
	 * Constructor
	 * 
	 * @param fileToParse
	 *************************************************************************/
	public HiflyCCFBuiltinReader(String rootDir)
	{
		super(rootDir);
		m_rootDir = rootDir;
		init();
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	@Override
	protected String getTableName()
	{
		return "ccf";
	}

	/**************************************************************************
	 * Initialize parameters collection
	 *************************************************************************/
	private void init()
	{
		m_commands = new HashMap<String, ITelecommand>();

		// Telecommand parameters
		// CDF and CPC are read inside
		m_cdf = new HiflyCDFBuiltinReader(m_rootDir);

		for(String table : getTables())
		{
			String[] lineFields = getLineFields(table);
			while (lineFields != null)
			{
				String cmdName = lineFields[0];
				List<ITelecommandArgument> args = m_cdf.getTcParameterList(cmdName);
				Boolean critical = Boolean.valueOf(lineFields[4]);
				ITelecommand command = CommandFactory.createCommand(lineFields[0], lineFields[1], critical, args);
				m_commands.put(command.getName().toUpperCase(), command);
				lineFields = getLineFields(table);
			}
		}
	}

	public Set<String> getTelecommandNames()
	{
		return m_commands.keySet();
	}
	
	public ITelecommand getTelecommand( String commandName )
	{
		return m_commands.get(commandName.toUpperCase());
	}
}
