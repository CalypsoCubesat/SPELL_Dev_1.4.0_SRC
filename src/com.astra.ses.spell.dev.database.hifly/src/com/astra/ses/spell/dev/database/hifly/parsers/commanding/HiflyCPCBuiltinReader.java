///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.hifly.parsers.commanding
// 
// FILE      : HiflyCPCBuiltinReader.java
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

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.astra.ses.spell.dev.database.hifly.parsers.HiflyBuiltinReader;

public class HiflyCPCBuiltinReader extends HiflyBuiltinReader
{

	/** Argument to be ommitted by every loaded command */
	// TODO a better solution would consists of allowing the users to configure
	// the omitted arguments
	private static final String[]	OPTIONAL_ARGS	= { "ACE selector", "CmdMode", "DHE Selector", "Hub Selector" };
	/** Holds the list of parameter definitions */
	private Map<String,TelecommandArgumentCPCDefinition> m_parameters;

	/**************************************************************************
	 * Constructor
	 * 
	 * @param fileToParse
	 *************************************************************************/
	public HiflyCPCBuiltinReader(String rootDir )
	{
		super(rootDir);
		init();
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	@Override
	protected String getTableName()
	{
		return "cpc";
	}

	/**************************************************************************
	 * Initialize parameters collection
	 *************************************************************************/
	private void init()
	{
		m_parameters = new HashMap<String, TelecommandArgumentCPCDefinition>();
		for(String table : getTables())
		{
			String[] lineFields = getLineFields(table);
			while (lineFields != null)
			{
				// If the argument is in the ommitted list it will be skipped
				boolean optional = (Arrays.binarySearch(OPTIONAL_ARGS, lineFields[0]) >= 0);
				TelecommandArgumentCPCDefinition arg = new TelecommandArgumentCPCDefinition(lineFields);
				arg.optional = optional;
				m_parameters.put(lineFields[0].toUpperCase(), arg);
				lineFields = getLineFields(table);
			}
		}
	}

	public Set<String> getTcParameterNames()
	{
		return m_parameters.keySet();
	}
	
	public TelecommandArgumentCPCDefinition getTcParameter( String name )
	{
		return m_parameters.get(name.toUpperCase());
	}

}
