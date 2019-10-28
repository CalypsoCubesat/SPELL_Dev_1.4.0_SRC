///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.hifly.parsers.commanding
//
// FILE      : HiflyCommandReader.java
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
package com.astra.ses.spell.dev.database.hifly.parsers.commanding;

import java.util.HashMap;
import java.util.Map;

import com.astra.ses.spell.dev.database.interfaces.ITelecommand;

/******************************************************************************
 * 
 * HiflyCommandReader class will read single command and single command
 * parameters files
 * 
 *****************************************************************************/
public class HiflyCommandReader
{
	/** Commands collection */
	private Map<String, ITelecommand>	m_commands;

	/**************************************************************************
	 * Constructor
	 * 
	 * @param databaseRootDir
	 *************************************************************************/
	public HiflyCommandReader(String databaseRootDir)
	{
		m_commands = new HashMap<String, ITelecommand>();
		init(databaseRootDir);
	}

	/**************************************************************************
	 * Parse the related files and construct the command elements
	 * 
	 * @param rootDir
	 *************************************************************************/
	private void init(String rootDir)
	{
		// Command definitions
		//long start = System.nanoTime();
		HiflyCCFReader ccfReader = new HiflyCCFReader(rootDir);
		for(String cmdName : ccfReader.getTelecommandNames())
		{
			m_commands.put(cmdName.toUpperCase(), ccfReader.getTelecommand(cmdName));
		}
		//long dur  = System.nanoTime() - start;
		//System.out.println("DB CCF dur: " + (dur / 1000000) + " ms");
		
		//start = System.nanoTime();
		HiflyCCFBuiltinReader ccfBuiltinReader = new HiflyCCFBuiltinReader(rootDir);
		for(String cmdName : ccfBuiltinReader.getTelecommandNames())
		{
			m_commands.put(cmdName.toUpperCase(), ccfBuiltinReader.getTelecommand(cmdName));
		}
		//dur  = System.nanoTime() - start;
		//System.out.println("DB CCF Builtin dur: " + (dur / 1000000) + " ms");
		
	}

	/**************************************************************************
	 * Get telecommands collection
	 * 
	 * @return
	 *************************************************************************/
	public Map<String, ITelecommand> getCommands()
	{
		return m_commands;
	}
}
