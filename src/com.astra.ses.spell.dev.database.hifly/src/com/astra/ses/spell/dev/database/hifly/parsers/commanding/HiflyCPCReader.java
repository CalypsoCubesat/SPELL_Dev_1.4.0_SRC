///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.hifly.parsers.commanding
// 
// FILE      : HiflyCPCReader.java
//
// DATE      : Jul 4, 2013
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

import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.astra.ses.spell.dev.database.hifly.parsers.HiflyDatabaseFileReader;

public class HiflyCPCReader extends HiflyDatabaseFileReader
{
	/** Argument to be ommitted by every loaded command */
	// TODO a better solution would consists of allowing the users to configure
	// the omitted arguments
	private static final String[]	OPTIONAL_ARGS	= { "ACE selector", "CmdMode", "DHE Selector", "Hub Selector" };

	/** File name */
	private static final String	FILENAME	= "cpc.dat";
	/** Holds the list of parameter definitions */
	private Map<String,TelecommandArgumentCPCDefinition> m_parameters;

	public HiflyCPCReader(String rootDir)
	{
		super(rootDir + File.separator + FILENAME);
		m_parameters = new TreeMap<String,TelecommandArgumentCPCDefinition>();
		
		String[] lineFields = getLineFields();
		while (lineFields != null)
		{
			// If the argument is in the optional list 
			boolean optional = (Arrays.binarySearch(OPTIONAL_ARGS, lineFields[0]) >= 0);
			TelecommandArgumentCPCDefinition arg = new TelecommandArgumentCPCDefinition(lineFields);
			arg.optional = optional;
			m_parameters.put(lineFields[0].toUpperCase(), arg);
			lineFields = getLineFields();
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
