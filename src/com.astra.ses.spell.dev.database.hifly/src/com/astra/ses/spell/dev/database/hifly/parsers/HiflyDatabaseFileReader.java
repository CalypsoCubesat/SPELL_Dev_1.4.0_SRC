///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.hifly.parsers
//
// FILE      : HiflyDatabaseFileReader.java
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
package com.astra.ses.spell.dev.database.hifly.parsers;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/******************************************************************************
 * Hifly database files parser base class
 *****************************************************************************/
public class HiflyDatabaseFileReader
{

	/** Splitter char */
	private static final String	SPLITTER	= "\t";

	/** File to be parsed */
	private File	            m_fileToParse;
	/** Buffered reader to read the file line by line */
	private BufferedReader	    m_bufferedReader;

	/*
	 * What this class basically does is to open a hifly database file and read
	 * it line by line as requested, returning the line splitted with the
	 * SPLITTER String
	 */

	/**************************************************************************
	 * Constructor
	 * 
	 * @param arg0
	 *************************************************************************/
	public HiflyDatabaseFileReader(String fileToParse)
	{
		m_fileToParse = new File(fileToParse);
		if (m_fileToParse.canRead())
		{
			initFileResources();
		}
	}

	/**************************************************************************
	 * Construct the buffered reader
	 *************************************************************************/
	public void initFileResources()
	{
		try
		{
			// Open the file that is the first
			// command line parameter
			FileInputStream fileInputStream = new FileInputStream(m_fileToParse);
			// Get the object of DataInputStream

			m_bufferedReader = new BufferedReader(new InputStreamReader(
					fileInputStream));
		}
		catch (Exception e)
		{// Catch exception if any
			m_bufferedReader = null;
			System.err.println("Error: " + e.getMessage());
		}
	}

	/**************************************************************************
	 * Read a line and split the line according to the separator list
	 * 
	 * @return
	 *************************************************************************/
	public String[] getLineFields()
	{
		if (m_bufferedReader == null){
			return null;
		}
		String strLine = "";
		try
		{
			while (strLine.isEmpty())
			{
				strLine = m_bufferedReader.readLine();
				if (strLine == null)
				{
					m_bufferedReader.close();
					return null;
				}
			}
			return strLine.split(SPLITTER);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
