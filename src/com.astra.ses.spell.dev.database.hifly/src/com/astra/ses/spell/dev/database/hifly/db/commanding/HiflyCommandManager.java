///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.hifly.db.commanding
//
// FILE      : HiflyCommandManager.java
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
package com.astra.ses.spell.dev.database.hifly.db.commanding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.astra.ses.spell.dev.database.hifly.parsers.commanding.HiflyCommandReader;
import com.astra.ses.spell.dev.database.hifly.parsers.commanding.HiflySequenceReader;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandSequence;

/*******************************************************************************
 * 
 * HiflyCommandManager will provide the command elements defined inside hifly
 * database
 * 
 ******************************************************************************/
public class HiflyCommandManager
{

	/** Collection of available telecommands */
	private Map<String, ITelecommand>	      m_commands;
	private Map<String, ITelecommandSequence>	m_sequences;

	/***************************************************************************
	 * Constructor
	 * 
	 * @param databaseRootDir
	 **************************************************************************/
	public HiflyCommandManager(String databaseRootDir)
	{
		init(databaseRootDir);
	}

	/***************************************************************************
	 * Start parsing files
	 * 
	 * @param rootDir
	 **************************************************************************/
	private void init(String rootDir)
	{
		// Simple Commands
		
		//long start = System.nanoTime();
		HiflyCommandReader commandReader = new HiflyCommandReader(rootDir);
		m_commands = commandReader.getCommands();
		//long dur  = System.nanoTime() - start;
		//System.out.println("DB Cmd Reader dur: " + (dur / 1000000) + " ms");
		
		// Sequences
		
		//start = System.nanoTime();
		HiflySequenceReader sequenceReader = new HiflySequenceReader(rootDir, m_commands);
		m_sequences = sequenceReader.getCommandSequences();
		//dur  = System.nanoTime() - start;
		//System.out.println("DB Seq Reader dur: " + (dur / 1000000) + " ms");
	}

	/***************************************************************************
	 * Get Commands defined inside the database
	 * 
	 * @return
	 **************************************************************************/
	public Collection<String> getCommands()
	{
		List<String> all = new ArrayList<String>();
		for (String mnemonic : m_commands.keySet())
			all.add(mnemonic);
		for (String mnemonic : m_sequences.keySet())
			all.add(mnemonic);
		return all;
	}

	/***************************************************************************
	 * Retrieve command information
	 * 
	 * @param name
	 * @return
	 **************************************************************************/
	public ITelecommand getCommand(String name)
	{
		if (m_commands.containsKey(name))
		{
			return m_commands.get(name.toUpperCase());
		}
		else
		{
			return m_sequences.get(name.toUpperCase());
		}
	}

	/***************************************************************************
	 * 
	 **************************************************************************/
	public boolean isCommand(String mnemonic)
	{
		return m_commands.containsKey(mnemonic);
	}

	/***************************************************************************
	 * 
	 **************************************************************************/
	public boolean isSequence(String mnemonic)
	{
		return m_sequences.containsKey(mnemonic);
	}
}
