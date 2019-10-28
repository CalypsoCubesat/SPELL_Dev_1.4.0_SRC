///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.hifly.parsers.commanding
// 
// FILE      : HiflyCDFBuiltinReader.java
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.astra.ses.spell.dev.database.hifly.parsers.HiflyBuiltinReader;
import com.astra.ses.spell.dev.database.interfaces.CommandFactory;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument;

public class HiflyCDFBuiltinReader extends HiflyBuiltinReader
{

	/** Holds the list of parameter definitions */
	private Map<String,List<ITelecommandArgument>> m_parameters;
	/** Holds the reference to the CPC reader */
	private HiflyCPCReader m_cpc;
	private String m_rootDir;
	
	/**************************************************************************
	 * Constructor
	 * 
	 * @param fileToParse
	 *************************************************************************/
	public HiflyCDFBuiltinReader(String rootDir )
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
		return "cdf";
	}

	/**************************************************************************
	 * Initialize parameters collection
	 *************************************************************************/
	private void init()
	{
		m_parameters = new HashMap<String, List<ITelecommandArgument>>();
		m_cpc = new HiflyCPCReader(m_rootDir);
		
		for(String table : getTables())
		{
			String[] lineFields = getLineFields(table);
			while (lineFields != null)
			{
				try
				{
					// Only editable command elements are considered as arguments
					if (!lineFields[1].equals("E"))
					{
						lineFields = getLineFields(table);
						continue;
					}
					String command = lineFields[0];
					if (!m_parameters.containsKey(command))
					{
						m_parameters.put(command.toUpperCase(), new ArrayList<ITelecommandArgument>());
					}
					TelecommandArgumentCPCDefinition def = m_cpc.getTcParameter(lineFields[6]);
					if (def != null)
					{
						if (lineFields.length>=10)
						{
							ITelecommandArgument arg = CommandFactory.createArgument(def.name, def.description, def.type, lineFields[9], def.radix, def.units, def.calibration, def.optional );
							m_parameters.get(command.toUpperCase()).add(arg);
						}
						else
						{
							System.err.println("[DATABASE HIFLY] Parsing error: not enough fields to process command argument (" + command + ")");
						}
					}
					lineFields = getLineFields(table);
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		}
	}

	public Set<String> getTcParameterNames()
	{
		return m_parameters.keySet();
	}
	
	public List<ITelecommandArgument> getTcParameterList( String commandName )
	{
		return m_parameters.get(commandName.toUpperCase());
	}

}
