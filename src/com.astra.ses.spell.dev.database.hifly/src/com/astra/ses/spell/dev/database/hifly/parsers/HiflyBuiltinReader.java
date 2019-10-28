///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.hifly.parsers.telemetry
// 
// FILE      : HiflyBuiltinPCFReader.java
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
package com.astra.ses.spell.dev.database.hifly.parsers;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public abstract class HiflyBuiltinReader 
{
	/** Builtins name */
	private static final String	             BUILTIN = "/BUILT-IN";
	/** Collection of file readers */
	private Map<String, BufferedReader>	 m_readers;

	/**************************************************************************
	 * Constructor
	 * 
	 * @param fileToParse
	 *************************************************************************/
	public HiflyBuiltinReader( String rootDir )
	{
		m_readers = new TreeMap<String,BufferedReader>();
		File baseBuiltIn = new File(rootDir + File.separator + BUILTIN);
		if (baseBuiltIn.canRead() && baseBuiltIn.isDirectory())
		{
			FilenameFilter filter = new FilenameFilter()
			{
				@Override
                public boolean accept(File dir, String name)
                {
	                return name.startsWith( getTableName() + ".dat." );
                }
				
			};
			for(File file : baseBuiltIn.listFiles(filter))
			{
				process( file );
			}
		}
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected abstract String getTableName();

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected String[] getTables()
	{
		return m_readers.keySet().toArray( new String[0] );
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	private void process( File file )
	{
		try
		{
			// Open the file that is the first
			// command line parameter
			FileInputStream fileInputStream = new FileInputStream(file);
			// Get the object of DataInputStream
			DataInputStream dataInputStream = new DataInputStream(fileInputStream);
			BufferedReader reader = new BufferedReader(new InputStreamReader(dataInputStream));
			m_readers.put(file.getName(), reader);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**************************************************************************
	 * Read a line and split the line according to the separator list
	 * 
	 * @return
	 *************************************************************************/
	public String[] getLineFields( String table )
	{
		if (m_readers.containsKey(table))
		{
			String strLine = "";
			try
			{
				while (strLine.isEmpty())
				{
					strLine = m_readers.get(table).readLine();
					if (strLine == null)
					{
						m_readers.get(table).close();
						return null;
					}
				}
				return strLine.split("\t");
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		return null;
	}

}
