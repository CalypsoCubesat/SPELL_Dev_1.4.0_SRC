///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.database
//
// FILE      : DatabaseConsistencyChecker.java
//
// DATE      : Feb 21, 2011
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
package com.astra.ses.spell.dev.scheck.database;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import org.python.pydev.parser.jython.ast.BinOp;
import org.python.pydev.parser.jython.ast.Name;
import org.python.pydev.parser.jython.ast.Num;
import org.python.pydev.parser.jython.ast.Str;
import org.python.pydev.parser.jython.ast.StrJoin;
import org.python.pydev.parser.jython.ast.exprType;

import com.astra.ses.spell.dev.database.DatabaseManager;
import com.astra.ses.spell.dev.database.interfaces.CalibrationType;
import com.astra.ses.spell.dev.database.interfaces.ICalibration;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter;
import com.astra.ses.spell.dev.scheck.QuickFix;
import com.astra.ses.spell.dev.scheck.interfaces.BaseChecker;
import com.astra.ses.spell.dev.scheck.interfaces.IEvent;
import com.astra.ses.spell.dev.scheck.interfaces.IIssueList;

public abstract class DatabaseConsistencyChecker extends BaseChecker  
{
	private ISpellDatabase m_currentDatabase;
	private Map<String,ISpellDatabase> m_databases;
	
	/**************************************************************************
	 * 
	 *************************************************************************/
	public DatabaseConsistencyChecker()
	{
		m_databases = new TreeMap<String, ISpellDatabase>();
		m_currentDatabase = null;
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	@Override
	public void notifyEvent(IEvent event, IIssueList issues) 
	{
		String project = issues.getResource().getProject().getName();
		checkDatabaseAvailability(project,issues);
		processEvent(event,issues);
	}
	
	/**************************************************************************
	 * 
	 *************************************************************************/
	private void checkDatabaseAvailability( String project, IIssueList issues )
	{
		if (!m_databases.containsKey(project))
		{
			ISpellDatabase db = DatabaseManager.getInstance().getProjectDatabase(project);
			if (db == null)
			{
				m_currentDatabase = null;
			}
			else
			{
				m_databases.put(project, db);
				m_currentDatabase = db;
				if (m_currentDatabase.getTelemetryParameterNames().isEmpty() && m_currentDatabase.getTelecommandNames().isEmpty()){
					m_currentDatabase = new ISpellDatabase() {
						
						@Override
						public boolean isTelemetryParameter(String mnemonic) {
							// TODO Auto-generated method stub
							return false;
						}
						
						@Override
						public boolean isTelecommand(String mnemonic) {
							// TODO Auto-generated method stub
							return false;
						}
						
						@Override
						public boolean isSequence(String mnemonic) {
							// TODO Auto-generated method stub
							return false;
						}
						
						@Override
						public String getVersion() {
							// TODO Auto-generated method stub
							return null;
						}
						
						@Override
						public Collection<String> getTelemetryParameterNames() {
							// TODO Auto-generated method stub
							return Collections.EMPTY_LIST;
						}
						
						@Override
						public ITelemetryParameter getTelemetryModel(String parameterName) {
							// TODO Auto-generated method stub
							return null;
						}
						
						@Override
						public Collection<String> getTelecommandNames() {
							// TODO Auto-generated method stub
							return Collections.EMPTY_LIST;
						}
						
						@Override
						public ITelecommand getTelecommandModel(String commandName) {
							// TODO Auto-generated method stub
							return null;
						}
						
						@Override
						public String getName() {
							// TODO Auto-generated method stub
							return null;
						}
						
						@Override
						public Collection<? extends ITelemetryDisplayDefinition> getDisplays() {
							// TODO Auto-generated method stub
							return Collections.EMPTY_LIST;
						}
						
						@Override
						public String getDatabasePath() {
							// TODO Auto-generated method stub
							return null;
						}
						
						@Override
						public Collection<String> getCalibrationNames() {
							// TODO Auto-generated method stub
							return Collections.EMPTY_LIST;
						}
						
						@Override
						public ICalibration getCalibrationModel(String identifier) {
							// TODO Auto-generated method stub
							return null;
						}
					};
					m_databases.put(project, m_currentDatabase);
				}
			}
		}
		else
		{
			m_currentDatabase = m_databases.get(project);
		}
		
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected ISpellDatabase getDatabase()
	{
		return m_currentDatabase;
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected boolean hasDatabase()
	{
		return (m_currentDatabase!= null);
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected String checkTelemetryMnemonic( String dbName, exprType item, IIssueList issues )
	{
		String mnemonic = null;
		// Check the TM point. The general TM consistency plugin is doing checks,
		// but we need to cover those cases like not using 'T' keyword in the
		// verification steps
		if (hasDatabase())
		{
			String toCheck = null;
			if (dbName != null)
			{
				toCheck = dbName;
			}
			else if (isStringLiteral(item))
			{
				toCheck = getStringLiteral(item);
			}
			
			// Warning if no T prefix used
			if (!toCheck.startsWith("T "))
			{
				warning("Telemetry point names should use the 'T' prefix", item, issues, QuickFix.TM_PREFIX_FIX);
			}
			
			// If no mnemonic directly is used
			
			if (!getDatabase().isTelemetryParameter(toCheck))
			{
				// And it is not starting with the T keyword
				if (!isTmLiteralRelevant(toCheck))
				{
					error("Unknown telemetry point '" + toCheck + "'", item, issues, null);
				}
				// It starts with T, check it in the database
				else
				{
					String[] parts = toCheck.split(" ");
					if (parts.length>=2)
					{
						mnemonic = parts[1];
						if (!getDatabase().isTelemetryParameter(mnemonic))
						{
							
							error("Telemetry point '" + mnemonic + "' not found in database", item, issues, null);
							mnemonic = null;
						}
						// If the mnemonic is fine, check the description
						else
						{
							ITelemetryParameter tm = getDatabase().getTelemetryModel(mnemonic);
							String description = toCheck.replace("T " + mnemonic + " ", "");
							if (!tm.getDescription().isEmpty() && !tm.getDescription().equals(description))
							{
								//warning("The description of the telemetry item '" + description + "' does not match the database ('" + tm.getDescription() + "')", item, issues, QuickFix.TM_ID_FIX);
							}
						}
						
					}							
				}
			}
			else
			{
				mnemonic = toCheck;
			}
		}
		return mnemonic;
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected String checkTelemetryMnemonicAutoExpand( exprType item, IIssueList issues )
	{
		// Automatic expansion with T 1 and T 2
		BinOp op = (BinOp) item;
		if (op.op == BinOp.Add)
		{
			if ((op.left instanceof Name) && isStringLiteral(op.right))
			{
				Name mod = (Name) op.left;
				
				Str strItem = new Str("",Str.SingleDouble,false,false,false,false);
				strItem.beginColumn = op.right.beginColumn;
				strItem.beginLine = op.right.beginLine;
				String right = "";
				if (op.right instanceof Str)
				{
					right = ((Str)op.right).s;
				}
				else
				{
					for(exprType elem : ((StrJoin)op.right).strs)
					{
						right += ((Str)elem).s;
					}
				}
				String dbName = strItem.s;
				if (mod.id.equals("PRI"))
				{
					if (right.split(" ")[0].length() == 4){
						dbName = "T 1" + right.replace("S1/S2", "S1");
					} else {
						dbName = "T " + right.replace("S1/S2", "S1");
					}
					
				}
				else if (mod.id.equals("RED"))
				{
					if (right.split(" ")[0].length() == 4){
						dbName = "T 2" + right.replace("S1/S2", "S2");
					} else {
						dbName = "T " + right.replace("S1/S2", "S2");
					}
					
				}
				else
				{
					error("Automatic expansion of TM mnemonic not possible: unrecognised name '" + mod.id + "'", op.left, issues, null);
					return null;
				}
				return checkTelemetryMnemonic( dbName, op.right, issues );
			}
		}
		return null;
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected String checkTelecommandMnemonic( exprType item, IIssueList issues )
	{
		String mnemonic = null;
		
		// Check the mnemonic. The general consistency plugin is doing checks,
		// but we need to cover those cases like not using 'C' keyword in the
		// command name
		if (hasDatabase())
		{
			// If the TC item is given directly as a string
			if (isStringLiteral(item))
			{
				String literal = getStringLiteral(item);
				
				// Warning if no C prefix used
				if (!literal.startsWith("C "))
				{
					warning("Telecommand names should use the 'C' prefix", item, issues, QuickFix.TC_PREFIX_FIX);
				}
				
				// If the literal is not directly recognised as a TC mnemonic (i.e. just mnemonic without C and description)
				if (!getDatabase().isTelecommand(literal))
				{
					// And it is not starting with the C keyword
					if (!isTcLiteralRelevant(literal))
					{
						error("Unknown telecommand '" + literal + "'", item, issues, null);
					}
					// It starts with C, check the mnemonic in the database
					else
					{
						String[] parts = literal.split(" ");
						if (parts.length>=2)
						{
							mnemonic = parts[1];
							if (!getDatabase().isTelecommand(mnemonic))
							{
								error("Telecommand '" + mnemonic + "' not found in database", item, issues, null);
								mnemonic = null;
							}
							// If the mnemonic is fine, check the description
							else
							{
								ITelecommand tc = getDatabase().getTelecommandModel(mnemonic);
								String description = literal.replace("C " + mnemonic + " ", "");
								if (!tc.getDescription().isEmpty() && !tc.getDescription().equals(description))
								{
									warning("The description of the telecommand '" + description + "' does not match the database ('" + tc.getDescription() + "')", item, issues, QuickFix.TC_ID_FIX);
								}
							}
						}							
					}
				}
				// Otherwise we are good
				else
				{
					mnemonic = literal;
				}
			}
		}
		return mnemonic;
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected String checkSequenceMnemonic( exprType item, IIssueList issues )
	{
		String mnemonic = null;
		
		// Check the mnemonic. The general consistency plugin is doing checks,
		// but we need to cover those cases like not using 'C' keyword in the
		// command name
		if (hasDatabase())
		{
			// If the TC item is given directly as a string
			if (isStringLiteral(item))
			{
				String literal = getStringLiteral(item);
				
				// If the literal is not directly recognised as a TC mnemonic (i.e. just mnemonic without C and description)
				if (!getDatabase().isSequence(literal))
				{
					// And it is not starting with the C keyword
					if (!isTcLiteralRelevant(literal))
					{
						error("Unknown sequence '" + literal + "'", item, issues, null);
					}
					// It starts with C, check the mnemonic part only, in the database
					else
					{
						String[] parts = literal.split(" ");
						if (parts.length>=2)
						{
							mnemonic = parts[1];
							if (!getDatabase().isSequence(mnemonic))
							{
								error("Sequence '" + mnemonic + "' not found in database", item, issues, null);
								mnemonic = null;
							}
							// If the mnemonic is fine, check the description
							else
							{
								ITelecommand tc = getDatabase().getTelecommandModel(mnemonic);
								String description = literal.replace("C " + mnemonic + " ", "");
								if (!tc.getDescription().isEmpty() && !tc.getDescription().equals(description))
								{
									warning("The description of the sequence '" + description + "' does not match the database ('" + tc.getDescription() + "')", item, issues, QuickFix.TC_ID_FIX);
								}
							}
						}							
					}
				}
				// Otherwise we are good
				else
				{
					mnemonic = literal;
				}
			}
		}
		return mnemonic;
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected void checkTelemetryValue( String mnemonic, exprType value, IIssueList issues, UsingRaw usingRaw )
	{
		// Check the value consistency
		if (hasDatabase() && (mnemonic != null))
		{
			ITelemetryParameter param = getDatabase().getTelemetryModel(mnemonic);
			String calibrationId = param.getDefaultCalibrationId();
			ICalibration cal = null;
			if (calibrationId != null && !calibrationId.isEmpty())
			{
				cal = getDatabase().getCalibrationModel(calibrationId);
			}
			
			if (value instanceof Num)
			{
				// If using a number, and not using raw
				//TODO assuming that notset is equivalent to ENG, but this is in configuration defaults!
				if (usingRaw.equals(UsingRaw.NO) || usingRaw.equals(UsingRaw.NOT_SET))
				{
					if ((cal!=null)&&(!cal.getType().equals(CalibrationType.NUMERICAL)))
					{
						error("Expected a status value for this TM point", value, issues, null);
					}
				}
			}
			else if ((value instanceof Str) || (value instanceof StrJoin))
			{
				switch(usingRaw)
				{
				case YES:
					error("Expected numerical value for this TM point, as it is using raw format", value, issues, null);
					break;
				case DONT_KNOW:
					// Cant check
					break;
				case NOT_SET:
				case NO:
					// Wrong type, parameter is not status
					if ((cal!=null)&&(!cal.getType().equals(CalibrationType.STATUS)))
					{
						error("Expected a numerical value for this TM point", value, issues, null);
					}
					// Correct type, parameter is status. Check valid value
					else
					{
						String valStr = getStringLiteral(value);
						if (cal != null)
						{
							if (!cal.isValidValue(valStr))
							{
								error("Wrong value for this TM point calibration, expected " + Arrays.toString(cal.getValidValues().toArray()), value, issues, null);
							}
						}
					}
				}
			}
		}

	}


	/**************************************************************************
	 * 
	 *************************************************************************/
	protected boolean isTmLiteralRelevant( String literal )
	{
		return literal.startsWith("T ");
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected boolean isTcLiteralRelevant( String literal )
	{
		return literal.startsWith("C ");
	}
}
