///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.hifly.parsers.commanding
//
// FILE      : HiflySequenceReader.java
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
import java.util.List;
import java.util.Map;

import com.astra.ses.spell.dev.database.interfaces.CommandFactory;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandSequence;

/******************************************************************************
 * HiflySequenceReader will manage command sequences
 *****************************************************************************/
public class HiflySequenceReader
{
	/** Collection of available telecommands */
	private Map<String, ITelecommandSequence>	m_sequences;

	/***************************************************************************
	 * Constructor
	 **************************************************************************/
	public HiflySequenceReader(String rootDir,
	        Map<String, ITelecommand> availableCommands)
	{
		m_sequences = new HashMap<String, ITelecommandSequence>();
		try
		{
			init(rootDir, availableCommands);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/***************************************************************************
	 * Start parsing the related files
	 * 
	 * @throws Exception
	 **************************************************************************/
	private void init(String rootDir,
	        Map<String, ITelecommand> availableCommands) throws Exception
	{
		// Sequences Characteristics (CSF)
		HiflyCSFReader csfReader = new HiflyCSFReader(rootDir);
		
		// Formal parameters
		HiflyCSPReader cspReader = new HiflyCSPReader(rootDir);
		
		for(String seqName : csfReader.getSequenceNames())
		{
			ITelecommandSequence seq = csfReader.getSequence(seqName);
			List<SequenceArgumentCSPDefinition> parameters = cspReader.getParametersForSequence(seqName); 
			if (parameters != null)
			for(SequenceArgumentCSPDefinition def : parameters)
			{
				ITelecommandArgument arg = CommandFactory.createArgument(def.name, def.description, def.type, def.defaultValue, def.radix, def.units, def.calibration, def.optional);
				seq.getArguments().add(def.order-1,arg);
			}
			m_sequences.put(seqName.toUpperCase(),seq);
		}

		// TODO : process formal parameters
		// Sequences Definition (CSS)
		/*
		 * HiflyCSSReader cssReader = new HiflyCSSReader(rootDir); lineFields =
		 * cssReader.getLineFields(); while (lineFields != null) { String
		 * seqName = lineFields[0]; char elementType = lineFields[3].charAt(0);
		 * String id = lineFields[4]; Telecommand element = null; switch
		 * (elementType) { case 'C': // COMMAND element =
		 * availableCommands.get(id); break; case 'S': // SEQUENCE element =
		 * sequencesMap.get(id); break; case 'F': // Fall through case 'P': //
		 * FORMAL PARAMETER element =
		 * sequencesMap.get(seqName).getFormalParameter(id); break; default :
		 * throw new Exception("Unknown sequence element"); } int order =
		 * Integer.valueOf(lineFields[2]);
		 * sequencesMap.get(seqName).getSequenceCommands()[order - 1] = element;
		 * lineFields = cssReader.getLineFields(); }
		 */

		// HiflySDFReader sdfReader = new HiflySDFReader(rootDir);
	}

	/***************************************************************************
	 * Retrieve command sequences
	 * 
	 * @return
	 **************************************************************************/
	public Map<String, ITelecommandSequence> getCommandSequences()
	{
		return m_sequences;
	}
}
