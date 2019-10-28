///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.event.sfunctions
// 
// FILE      : SetLimitsChecker.java
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
package com.astra.ses.spell.dev.scheck.event.sfunctions;

import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.Dict;
import org.python.pydev.parser.jython.ast.Name;
import org.python.pydev.parser.jython.ast.Num;
import org.python.pydev.parser.jython.ast.exprType;

import com.astra.ses.spell.dev.database.interfaces.CalibrationType;
import com.astra.ses.spell.dev.database.interfaces.ICalibration;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter;
import com.astra.ses.spell.dev.scheck.database.DatabaseConsistencyChecker;
import com.astra.ses.spell.dev.scheck.interfaces.EventType;
import com.astra.ses.spell.dev.scheck.interfaces.IEvent;
import com.astra.ses.spell.dev.scheck.interfaces.IIssueList;

public class SetLimitsChecker extends DatabaseConsistencyChecker 
{
	/**************************************************************************
	 * 
	 *************************************************************************/
	public SetLimitsChecker()
	{
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	@Override
	protected void processEvent( IEvent event, IIssueList issues )
	{
		if(event.getType().equals(EventType.FUNCTION_CALL))
		{
			Call call = (Call) event.getNode();
			if (!(call.func instanceof Name)) return;
			Name name = (Name) call.func;
			String functionName = name.id;
			if (functionName.equals("SetLimits"))
			{
				processCall(call,issues);
			}
			else if (functionName.equals("SetTMparam"))
			{
				warning("'SetTMparam is deprecated, please use 'SetLimits' instead", call, issues, null);
				processCall(call,issues);
			}
		}
	}

	/**************************************************************************
	 * Process a function call event
	 * @param event
	 * @param issues
	 *************************************************************************/
	protected void processCall( Call call, IIssueList issues )
	{
		if (call.args.length<1)
		{
			error("Must provide at least a telemetry item as argument", call, issues, null);
		}
		else
		{
			String mnemonic = null;
			if (call.args.length >= 1)
			{
				// Check the telemetry point that has to be the first argument
				if (!isNonProcessable(call.args[0]))
				{
					if (!isStringLiteral(call.args[0]))
					{
						error("Expected a telemetry mnemonic", call.args[0], issues, null);
					}
					else if (hasDatabase())
					{
						mnemonic = checkTelemetryMnemonic(null, call.args[0], issues);
					}
				}
				
				if (call.args.length == 2)
				{
					// This element must be a dictionary or a name
					exprType item = call.args[1];
					if (!isNonProcessable(item))
					{
						if (!(item instanceof Dict) && !(item instanceof Name))
						{
							error("Expected a dictionary containing limit definitions", item, issues, null);
						}
					}
				}
				// Too many arguments
				else if (call.args.length>2)
				{
					error("Too many arguments provided", call, issues, null);
				}
				
			}
			
			// Check the arguments
			if (mnemonic != null && hasModifier(call, "Expected"))
			{
				warning("The usage of 'Expected' modifier is deprecated as of SPELL 2.4.1", call, issues, null);
				checkStatusLimitValue(mnemonic, call, getModifierValue(call,"Expected"), issues);
			}

			if (mnemonic != null && hasModifier(call, "Nominal"))
			{
				checkStatusLimitValue(mnemonic, call, getModifierValue(call,"Nominal"), issues);
			}

			if (mnemonic != null && hasModifier(call, "Warning"))
			{
				checkStatusLimitValue(mnemonic, call, getModifierValue(call,"Warning"), issues);
			}

			if (mnemonic != null && hasModifier(call, "Error"))
			{
				checkStatusLimitValue(mnemonic, call, getModifierValue(call,"Error"), issues);
			}

			if (mnemonic != null && hasModifier(call, "Ignore"))
			{
				checkStatusLimitValue(mnemonic, call, getModifierValue(call,"Ignore"), issues);
			}

			if (mnemonic != null && hasModifier(call, "LoRed"))
			{
				checkNumericLimitValue(mnemonic, call, getModifierValue(call, "LoRed"), issues);
			}
					
			if (mnemonic != null && hasModifier(call, "LoYel"))
			{
				checkNumericLimitValue(mnemonic, call, getModifierValue(call, "LoYel"), issues);
			}

			if (mnemonic != null && hasModifier(call, "HiRed"))
			{
				checkNumericLimitValue(mnemonic, call, getModifierValue(call, "HiRed"), issues);
			}

			if (mnemonic != null && hasModifier(call, "HiYel"))
			{
				checkNumericLimitValue(mnemonic, call, getModifierValue(call, "HiYel"), issues);
			}
}
	}
	
	private void checkStatusLimitValue( String mnemonic, Call call, exprType status, IIssueList issues )
	{
		// Ensure that the parameter has a status calibration
		ITelemetryParameter tm = getDatabase().getTelemetryModel(mnemonic);
		if (tm.getDefaultCalibrationId() != null)
		{
			ICalibration cal = getDatabase().getCalibrationModel(tm.getDefaultCalibrationId());
			if (cal != null)
			{
				if (!cal.getType().equals(CalibrationType.STATUS))
				{
					error("The telemetry parameter '" + mnemonic + "' does not have a status calibration", call.args[0], issues, null);
				}
				else
				{
					if (isStringLiteral(status))
					{
						String engValue = getStringLiteral(status);
						if (engValue.contains(","))
						{
							String[] engValues = engValue.split(",");
							for(String ev : engValues)
							{
								if (!cal.isValidValue(ev.trim()))
								{
									error("The value '" + ev.trim() + "' is not in the list of accepted values for this parameter", status, issues, null);
								}
							}
						}
						else if (!cal.isValidValue(engValue))
						{
							error("The value '" + engValue + "' is not in the list of accepted values for this parameter", status, issues, null);
						}
					}
					else if (!isNonProcessable(status))
					{
						error("Invalid value for this modifier", status, issues, null);
					}
				}
			}
			else
			{
				warning("Cannot find associated calibration curve for this parameter: '" + tm.getDefaultCalibrationId() + "'", call.args[0], issues, null);
			}
		}
	}
	
	private boolean checkNumericLimitValue( String mnemonic, Call call, exprType value, IIssueList issues )
	{
		// Ensure that the parameter has a status calibration
		ITelemetryParameter tm = getDatabase().getTelemetryModel(mnemonic);
		if (tm.getDefaultCalibrationId() != null)
		{
			ICalibration cal = getDatabase().getCalibrationModel(tm.getDefaultCalibrationId());
			if (cal != null)
			{
				if (!cal.getType().equals(CalibrationType.NUMERICAL))
				{
					error("The telemetry parameter '" + mnemonic + "' does not have an analog calibration", call.args[0], issues, null);
					return false;
				}
				if (!isNonProcessable(value))
				{
					if (!(value instanceof Num))
					{
						error("Expected a numerical value", value, issues, null);
					}
				}
			}
			else
			{
				warning("Cannot find associated calibration curve for this parameter: '" + tm.getDefaultCalibrationId() + "'", call.args[0], issues, null);
				return false;
			}
		}
		return true;
	}
	
	@Override
    public String getName()
    {
	    return "SetLimits rules";
    }
}
