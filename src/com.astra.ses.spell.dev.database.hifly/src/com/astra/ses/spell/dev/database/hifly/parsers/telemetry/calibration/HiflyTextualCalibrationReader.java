///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.hifly.parsers.telemetry.calibration
//
// FILE      : HiflyTextualCalibrationReader.java
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
package com.astra.ses.spell.dev.database.hifly.parsers.telemetry.calibration;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.astra.ses.spell.dev.database.hifly.parsers.HiflyDatabaseFileReader;
import com.astra.ses.spell.dev.database.interfaces.CalibrationFactory;
import com.astra.ses.spell.dev.database.interfaces.ICalibration;

/*******************************************************************************
 * HiflyTextualCalibrationReader will parse the textual calibrations file and
 * will provide polynomial calibrations as defined in hifly database
 ******************************************************************************/
public class HiflyTextualCalibrationReader
{

	/***************************************************************************
	 * HiflyTXFReader will parse TXF file and return the calibration curve ids
	 **************************************************************************/
	private class HiflyTXFReader extends HiflyDatabaseFileReader
	{
		/** Curves file name */
		private static final String	CURVES_FILENAME	= "txf.dat";

		/***********************************************************************
		 * Constructor
		 * 
		 * @param rootDir
		 **********************************************************************/
		public HiflyTXFReader(String rootDir)
		{
			super(rootDir + File.separator + CURVES_FILENAME);
		}
	}

	/***************************************************************************
	 * HiflyTXPReader will parse TXP file and return the calibration curve ids
	 **************************************************************************/
	private class HiflyTXPReader extends HiflyDatabaseFileReader
	{
		/** Curves file name */
		private static final String	CURVES_FILENAME	= "txp.dat";

		/***********************************************************************
		 * Constructor
		 * 
		 * @param rootDir
		 **********************************************************************/
		public HiflyTXPReader(String rootDir)
		{
			super(rootDir + File.separator + CURVES_FILENAME);
		}
	}

	/***************************************************************************
	 * HiflyPAFReader will parse PAF file and return the calibration curve ids
	 **************************************************************************/
	private class HiflyPAFReader extends HiflyDatabaseFileReader
	{
		/** Curves file name */
		private static final String	CURVES_FILENAME	= "paf.dat";

		/***********************************************************************
		 * Constructor
		 * 
		 * @param rootDir
		 **********************************************************************/
		public HiflyPAFReader(String rootDir)
		{
			super(rootDir + File.separator + CURVES_FILENAME);
		}
	}

	/***************************************************************************
	 * HiflyPASReader will parse PAS file and return the calibration curve ids
	 **************************************************************************/
	private class HiflyPASReader extends HiflyDatabaseFileReader
	{
		/** Curves file name */
		private static final String	CURVES_FILENAME	= "pas.dat";

		/***********************************************************************
		 * Constructor
		 * 
		 * @param rootDir
		 **********************************************************************/
		public HiflyPASReader(String rootDir)
		{
			super(rootDir + File.separator + CURVES_FILENAME);
		}
	}

	/** Database root directory */
	private String	                  m_rootDir;
	/** Collection of available parameters */
	private Map<String, ICalibration>	m_calMap;

	public HiflyTextualCalibrationReader(String rootDir)
	{
		m_rootDir = rootDir;
		m_calMap = new HashMap<String, ICalibration>();
		init();
	}

	/***************************************************************************
	 * Parse the files
	 **************************************************************************/
	private void init()
	{
		HiflyTXFReader txfReader = new HiflyTXFReader(m_rootDir);
		HiflyTXPReader txpReader = new HiflyTXPReader(m_rootDir);
		HiflyPAFReader pafReader = new HiflyPAFReader(m_rootDir);
		HiflyPASReader pasReader = new HiflyPASReader(m_rootDir);
		/*
		 * Read points definition for each curve
		 */
		Map<String, List<String>> values = new HashMap<String, List<String>>();

		// Extract values from TXF, TXP
		String[] lineFields = txpReader.getLineFields();
		while (lineFields != null)
		{
			String curveId = lineFields[0];
			if (!values.containsKey(curveId))
			{
				values.put(curveId, new ArrayList<String>());
			}
			values.get(curveId).add(lineFields[3]);
			lineFields = txpReader.getLineFields();
		}
		/*
		 * Read curve definition
		 */
		lineFields = txfReader.getLineFields();
		while (lineFields != null)
		{
			String curveId = lineFields[0];
			ICalibration cal = CalibrationFactory.createTextualCalibration(curveId, values.get(curveId));
			m_calMap.put(curveId, cal);
			lineFields = txfReader.getLineFields();
		}

		// Extract values from PAF,PAS
		lineFields = pasReader.getLineFields();
		while (lineFields != null)
		{
			String curveId = lineFields[0];
			if (!values.containsKey(curveId))
			{
				values.put(curveId, new ArrayList<String>());
			}
			values.get(curveId).add(lineFields[1]);
			lineFields = pasReader.getLineFields();
		}
		/*
		 * Read curve definitions
		 */
		lineFields = pafReader.getLineFields();
		while (lineFields != null)
		{
			String curveId = lineFields[0];
			ICalibration cal = CalibrationFactory.createTextualCalibration(curveId, values.get(curveId));
			m_calMap.put(curveId, cal);
			lineFields = pafReader.getLineFields();
		}
	}

	/***************************************************************************
	 * Get textual calibrations defined
	 * 
	 * @return
	 **************************************************************************/
	public Map<String, ICalibration> getCalibrations()
	{
		return m_calMap;
	}
}
