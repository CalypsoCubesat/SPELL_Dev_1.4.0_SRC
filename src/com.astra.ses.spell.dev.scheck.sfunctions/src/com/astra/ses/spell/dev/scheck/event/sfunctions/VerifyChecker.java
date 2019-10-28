///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.event.sfunctions
//
// FILE      : VerifyChecker.java
//
// DATE      : Feb 15, 2011
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

import org.python.pydev.parser.jython.ast.BinOp;
import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.List;
import org.python.pydev.parser.jython.ast.Name;
import org.python.pydev.parser.jython.ast.Subscript;
import org.python.pydev.parser.jython.ast.exprType;

import com.astra.ses.spell.dev.scheck.database.UsingRaw;
import com.astra.ses.spell.dev.scheck.interfaces.EventType;
import com.astra.ses.spell.dev.scheck.interfaces.IEvent;
import com.astra.ses.spell.dev.scheck.interfaces.IIssueList;

public class VerifyChecker extends VerificationStepChecker 
{
	/**************************************************************************
	 * 
	 *************************************************************************/
	@Override
	public String getName()
	{
		return "Verify function rule";
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	@Override
    protected void processEvent(IEvent event, IIssueList issues)
    {
		if(event.getType().equals(EventType.FUNCTION_CALL))
		{
			Call call = (Call) event.getNode();
			if (!(call.func instanceof Name)) return;
			String functionName = getStringLiteral(call.func);
			if (functionName.equals("Verify"))
			{
				processCall(call,issues);
			}
		}
    }

	/**************************************************************************
	 * Process a function call event
	 * @param event
	 * @param issues
	 *************************************************************************/
	private void processCall( Call call, IIssueList issues )
	{
		UsingRaw usingRaw = UsingRaw.NOT_SET;
		if (call.keywords.length >0)
		{
			// Get the raw condition first, important for verification steps
			if (hasModifier(call,"ValueFormat"))
			{
				exprType format = getModifierValue(call, "ValueFormat");
				if (format instanceof Name)
				{
					String formatName = getStringLiteral(format);
					if (formatName.equals("RAW"))
					{
						usingRaw = UsingRaw.YES;
					}
					else if (formatName.equals("ENG"))
					{
						usingRaw = UsingRaw.NO;
					}
					else
					{
						// Config is in variable so we cannot know
						usingRaw = UsingRaw.DONT_KNOW;
					}
				}
			}
		}
		
		if (call.args.length>0)
		{
			exprType mainListExpr = (exprType) call.args[0];
			
			// Ignore the rule if we have a name or binary operation
			if ((mainListExpr instanceof Name)||(mainListExpr instanceof BinOp)||(mainListExpr instanceof Subscript))
			{
				return;
			}
			
			if (!(mainListExpr instanceof List))
			{
				// Consider the case when only one single verification step is given and not in the form of a list
				if (call.args.length==3 || call.args.length==4)
				{
					if (call.args[1] instanceof Name)
					{
						if (isComparisonOperator(call.args[1]))
						{
							if (call.args.length==3)
							{
								// Item, operator and value
								processVerificationCondition( call.args[0], call.args[1], call.args[2], null, null, usingRaw, issues);
							}
							else if (call.args.length==4)
							{
								if (getIsUnaryOperator(call.args[1]))
								{
									// Item, operator, value and config
									processVerificationCondition( call.args[0], call.args[1], call.args[2], null, call.args[3], usingRaw, issues);
								}
								else
								{
									// Item, operator, value1 and value2
									processVerificationCondition( call.args[0], call.args[1], call.args[2], call.args[3], null, usingRaw, issues);
								}
							}
							else if (call.args.length==5)
							{
								if (getIsUnaryOperator(call.args[1]))
								{
									error("Malformed verification step, too many elements in the step list", call, issues, null);
								}
								else
								{
									// Item, operator, value1, value2 and config
									processVerificationCondition( call.args[0], call.args[1], call.args[2], call.args[3], call.args[4], usingRaw, issues);
								}
							}
						}
						else
						{
							//error("Expected a list, a telemetry condition or a verification step as arguments", call, issues, null);
						}
					}
				}
				else
				{
					//error("Too many arguments for the function", call, issues, null);
				}
			}
			else
			{
				List mainList = (List) mainListExpr;
				if (mainList.elts.length==0)
				{
					error("Verification list cannot be empty", mainList, issues, null);
				}
				for( exprType element : mainList.elts )
				{
					if (!(element instanceof List))
					{
						// Consider the case when only one single verification step is given, therefore this is a list
						// of three (or four) elements, not a list of lists
						if (mainList.elts.length==3 || mainList.elts.length==4)
						{
							if (isComparisonOperator(mainList.elts[1]))
							{
								processVerificationStep(mainList, issues, usingRaw);
								return;
							}
							else
							{
								//error("Expected a list of verification conditions", element, issues, null);
							}
						}
						else
						{
							//error("Expected a list of verification conditions", element, issues, null );
						}
					}
					else
					{
						processVerificationStep( (List) element, issues, usingRaw );
					}
				}
			}
		}
	}
}
