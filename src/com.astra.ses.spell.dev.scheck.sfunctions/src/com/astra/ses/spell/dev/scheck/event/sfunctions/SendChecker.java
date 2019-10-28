///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.event.sfunctions
//
// FILE      : SendChecker.java
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

import java.util.Arrays;

import org.python.pydev.parser.jython.ast.BinOp;
import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.List;
import org.python.pydev.parser.jython.ast.Name;
import org.python.pydev.parser.jython.ast.NameTok;
import org.python.pydev.parser.jython.ast.Num;
import org.python.pydev.parser.jython.ast.Str;
import org.python.pydev.parser.jython.ast.StrJoin;
import org.python.pydev.parser.jython.ast.exprType;
import org.python.pydev.parser.jython.ast.keywordType;

import com.astra.ses.spell.dev.database.interfaces.CalibrationType;
import com.astra.ses.spell.dev.database.interfaces.ICalibration;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument;
import com.astra.ses.spell.dev.scheck.database.UsingRaw;
import com.astra.ses.spell.dev.scheck.interfaces.EventType;
import com.astra.ses.spell.dev.scheck.interfaces.IEvent;
import com.astra.ses.spell.dev.scheck.interfaces.IIssueList;

public class SendChecker extends VerificationStepChecker
{
	/**************************************************************************
	 * 
	 *************************************************************************/
	@Override
	public String getName()
	{
		return "Send function rule";
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	@Override
	protected void processEvent(IEvent event, IIssueList issues)
	{
		if (event.getType().equals(EventType.FUNCTION_CALL))
		{
			Call call = (Call) event.getNode();
			if (!(call.func instanceof Name)) return;
			String functionName = getStringLiteral(call.func);
			if (functionName.equals("Send"))
			{
				processCall(call, issues);
			}
		}
	}

	/**************************************************************************
	 * Process a function call event
	 * 
	 * @param event
	 * @param issues
	 *************************************************************************/
	protected void processCall(Call call, IIssueList issues)
	{
		if (call.keywords.length > 0)
		{
			// Extract arguments if any
			exprType arguments = extractCommandArguments(call);

			// Get the raw condition if any, important for verification steps
			UsingRaw usingRaw = UsingRaw.NOT_SET;
			for (keywordType kwd : call.keywords)
			{
				String nametok = getStringLiteral(kwd.arg);
				if (nametok.equals("ValueFormat"))
				{
					exprType format = kwd.value;
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
							// Config is set in variable, so we dont know
							usingRaw = UsingRaw.DONT_KNOW;
						}
					}
				}
			}
			// Find the keywords for commands, sequences or groups, TM
			// verifications, etc
			for (keywordType kwd : call.keywords)
			{
				String nametok = getStringLiteral(kwd.arg);
				// Process TM verification part
				if (nametok.equals("verify"))
				{
					exprType mainListExpr = kwd.value;
					processVerificationPart(mainListExpr, issues, usingRaw);
				}
				else if (nametok.equals("command"))
				{
					exprType cmdElement = kwd.value;
					processCommandPart(cmdElement, arguments, issues);
				}
				else if (nametok.equals("sequence"))
				{
					exprType seqElement = kwd.value;
					processSequencePart(seqElement, arguments, issues);
				}
				else if (nametok.equals("group"))
				{
					exprType groupList = kwd.value;
					processGroupPart(groupList, issues);
				}
			}
		}
		// The checks for required modifiers/arguments are done at another level
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	private exprType extractCommandArguments(Call call)
	{
		// Search for arguments
		for (keywordType akwd : call.keywords)
		{
			NameTok anametok = (NameTok) akwd.arg;
			if (anametok.id.equals("args")) { return akwd.value; }
		}
		return null;
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	private void processVerificationPart(exprType mainListExpr, IIssueList issues, UsingRaw usingRaw)
	{
		// Ignore the rule if we have a name or binary operation
		if ((mainListExpr instanceof Name) || (mainListExpr instanceof BinOp)) { return; }

		if (!(mainListExpr instanceof List))
		{
			//error("Expected a list as verify argument", mainListExpr, issues, null);
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

	/**************************************************************************
	 * 
	 *************************************************************************/
	private void processCommandPart(exprType cmdElement, exprType arguments, IIssueList issues)
	{
		// Ignore the rule if we have a name(variable) or binary operation
		if ((cmdElement instanceof Name) || (cmdElement instanceof BinOp)) { return; }

		String commandMnemonic = null;

		// Check the command element
		if (isStringLiteral(cmdElement))
		{
			commandMnemonic = checkTelecommandMnemonic(cmdElement, issues);
		}
		else
		{
			// Check that, if a Tc item or BuildTC is being used, TC arguments
			// shall not be given to send
			if (cmdElement instanceof Call)
			{
				Call call = (Call) cmdElement;
				Name name = (Name) call.func;
				if (name.id.equals("BuildTC"))
				{
					if (arguments != null)
					{
						error("Arguments shall not be given if BuildTC is being used to construct a telecommand", arguments, issues, null);
						return;
					}
				}
			}
		}

		// Check the arguments only if we have a known command mnemonic
		if (commandMnemonic == null) return;

		// If we have a mnemonic, no arguments, but the TC needs them:
		if (arguments == null)
		{
			ITelecommand tc = getDatabase().getTelecommandModel(commandMnemonic);
			if (tc.getArguments() != null && !tc.getArguments().isEmpty())
			{
				// If there are NON optional arguments
				boolean someNotOptional = false;
				boolean haveOptional = false;
				for (ITelecommandArgument arg : tc.getArguments())
				{
					if (!arg.isOptional())
					{
						someNotOptional = true;
						break;
					}
					else
					{
						haveOptional = true;
					}
				}
				if (someNotOptional)
				{
					if (haveOptional)
					{
						error("The telecommand '" + commandMnemonic + "' requires at least " + tc.getArguments().size() + " arguments",
								cmdElement, issues, null);
					}
					else
					{
						error("The telecommand '" + commandMnemonic + "' requires exactly " + tc.getArguments().size() + " arguments",
								cmdElement, issues, null);
					}
				}
			}
		}
		// If it is not a list do not worry, the general checker will warn about
		// it
		else if (arguments instanceof List)
		{
			List argList = (List) arguments;
			int argPosition = 0;

			// Check the correct number of arguments
			ITelecommand tc = getDatabase().getTelecommandModel(commandMnemonic);
			java.util.List<ITelecommandArgument> args = tc.getArguments();
			if (args != null)
			{
				if (argList.elts.length != args.size())
				{
					if (!findOtherFlags(argList, issues))
					{
						// If there are NON optional arguments
						int givenArgumentCount = argList.elts.length;
						int minimumArgumentCount = 0;
						int optionalArgumentCount = 0;

						for (ITelecommandArgument arg : args)
						{
							if (!arg.isOptional())
							{
								minimumArgumentCount++;
							}
							else
							{
								optionalArgumentCount++;
							}
						}

						if (givenArgumentCount < minimumArgumentCount)
						{
							if (optionalArgumentCount > 0)
							{
								error("The telecommand '" + commandMnemonic + "' requires at least " + args.size() + " arguments",
								        arguments, issues, null);
							}
							else
							{
								error("The telecommand '" + commandMnemonic + "' requires exactly " + args.size() + " arguments",
								        arguments, issues, null);
							}
						}
					}
				}
			}
			else
			{
				error("The telecommand '" + commandMnemonic + "' accepts no arguments", arguments, issues, null);
				return;
			}

			for (exprType element : argList.elts)
			{
				// Do not process arguments beyond the accepted amount
				if (argPosition >= args.size()) break;

				if (!(element instanceof List))
				{
					error("Expected lists within the argument list", element, issues, null);
				}
				else
				{
					// The argument list may have 2 or 3 elements (3 if includes
					// config dict)
					List argElementList = (List) element;
					if (argElementList.elts.length == 2)
					{
						// In this case the argument name and the argument value
						// are given
						processCommandArgument(commandMnemonic, argElementList, argPosition, issues);
					}
					else if (argElementList.elts.length == 3)
					{
						// In this case the argument name, the argument value
						// and configuration dict are given
						processCommandArgument(commandMnemonic, argElementList, argPosition, issues);
						// TODO processCommandArgumentConfig( commandMnemonic,
						// argElementList, argConfig );
					}
					else if (argElementList.elts.length < 2)
					{
						error("Malformed telecommand argument: expected at least elements in the argument definition list", argElementList,
						        issues, null);
					}
					else
					{
						error("Malformed telecommand argument: expected no more than 3 elements in the list", argElementList, issues, null);
					}
				}
				argPosition++;
			}
		}
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	private boolean findOtherFlags(List argList, IIssueList issues)
	{
		// Raise a warning unless Other_Flags argument is set
		// Traverse the list in reverse direction, as normally Other_Flags is at
		// the end
		for (int idx = argList.elts.length - 1; idx >= 0; idx--)
		{
			List argElementList = (List) argList.elts[idx];
			if (argElementList.elts.length >= 2)
			{
				exprType argName = argElementList.elts[0];
				if (isStringLiteral(argName))
				{
					String aname = getStringLiteral(argName);
					if (aname.equals("Other_Flags"))
					{
						if (idx != argList.elts.length - 1)
						{
							warning("Other_Flags argument should be the last argument in the list", argName, issues, null);
						}
						return true;
					}
				}
			}
			else
			{
				error("Malformed telecommand argument: expected at least elements in the argument definition list", argElementList, issues,
				        null);
			}
		}
		return false;
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	private void processCommandArgument(String commandMnemonic, List argElementList, int argPosition, IIssueList issues)
	{
		exprType argName = argElementList.elts[0];
		exprType argValue = argElementList.elts[1];

		String argumentMnemonic = null;
		// We cannot check the argument name unless it is a string (variables or
		// function results cannot be inspected)
		if (isStringLiteral(argName))
		{
			// Get the list of command arguments for this command
			ITelecommand tc = getDatabase().getTelecommandModel(commandMnemonic);
			java.util.List<ITelecommandArgument> args = tc.getArguments();
			argumentMnemonic = getStringLiteral(argName);
			// IMPORTANT: the order of arguments is not imposed!

			// If Other_Flags is found, the check for completeness is ignored.

			ITelecommandArgument foundArgument = null;
			for (ITelecommandArgument argument : args)
			{
				// Check the name
				if (!argument.getName().equals(argumentMnemonic) && !argumentMnemonic.equals("Other_Flags"))
				{
					// If the name does not match, accept then matching the
					// description
					if (argument.getDescription().equals(argumentMnemonic))
					{
						foundArgument = argument;
						break;
					}
				}
				else
				{
					foundArgument = argument;
					break;
				}
			}

			if (foundArgument == null)
			{
				error("The argument name or description '" + argumentMnemonic + "' was not found in the database", argName, issues, null);
			}
			else if (!argumentMnemonic.equals("Other_Flags"))
			{
				// Check the value now, unless it is a variable or function
				// result
				processTcArgumentValue(foundArgument, argValue, issues);
			}
		}
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	private void processTcArgumentValue(ITelecommandArgument argument, exprType argValue, IIssueList issues)
	{
		// Do not proceed with the check if the value is a variable or function
		// call result
		if (!(argValue instanceof Str) && !(argValue instanceof StrJoin) && !(argValue instanceof Num)) return;

		String calibrationId = argument.getCalibrationId();
		ICalibration cal = null;
		if (calibrationId != null && !calibrationId.isEmpty())
		{
			cal = getDatabase().getCalibrationModel(calibrationId);
			if (cal == null) warning("Cannot find associated calibration '" + calibrationId + "' for the argument", argValue, issues, null);
		}

		switch (argument.getType())
		{
		case REAL:
			if (!(argValue instanceof Num))
			{
				error("Expected an float (real) value", argValue, issues, null);
			}
			break;
		case UNSIGNED_INT:
		case SIGNED_INT:
			if (!(argValue instanceof Num))
			{
				error("Expected an integer value", argValue, issues, null);
			}
			break;
		case ASCII:
			if ((!(argValue instanceof Str)) && (!(argValue instanceof StrJoin)))
			{
				error("Expected a string (status) value", argValue, issues, null);
			}
			else
			{
				if (isStringLiteral(argValue))
				{
					String argumentValue = getStringLiteral(argValue);
					// We can check valid values only if there is a calibration
					if (cal != null)
					{
						if (cal.getType().equals(CalibrationType.STATUS))
						{
							if (!cal.getValidValues().contains(argumentValue))
							{
								String accepted = Arrays.toString(cal.getValidValues().toArray());
								// Remove the square brackets
								accepted = accepted.substring(1, accepted.length() - 1);
								// If exceeds length, truncate
								if (accepted.length() > 15)
								{
									accepted = accepted.substring(0, 12) + "...";
								}
								error("The value '" + argumentValue + "' is not in the list of accepted values for this argument ("
								        + accepted + ")", argValue, issues, null);
							}
						}
						else
						{
							warning("Cannot check argument value: the associated calibration for this argument is not textual", argValue,
							        issues, null);
						}
					}
				}
			}
			break;
		case ABSOLUTE_TIME:
		case DELTA_RELATIVE_TIME:
		case UNKNOWN:
			// Cannot check at this moment
			break;
		}

	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	private void processSequencePart(exprType seqElement, exprType arguments, IIssueList issues)
	{
		// Ignore the rule if we have a name(variable) or binary operation
		if (isNonProcessable(seqElement)) { return; }

		String sequenceMnemonic = null;

		// Check the command element
		if ((seqElement instanceof Str) || (seqElement instanceof StrJoin))
		{
			sequenceMnemonic = checkSequenceMnemonic(seqElement, issues);
		}
		else
		{
			// Check that, if a Tc item or BuildTC is being used, TC arguments
			// shall not be given to send
			if (seqElement instanceof Call)
			{
				Call call = (Call) seqElement;
				Name name = (Name) call.func;
				if (name.id.equals("BuildTC"))
				{
					if (arguments != null)
					{
						error("Sequence arguments shall not be given to Send() call if BuildTC is being used to construct a sequence",
						        arguments, issues, null);
						return;
					}
				}
			}
		}

		// Check the arguments only if we have a known command mnemonic
		if (sequenceMnemonic == null) return;

		// If we have a mnemonic, no arguments, but the TC needs them:
		if (arguments == null)
		{
			ITelecommand tc = getDatabase().getTelecommandModel(sequenceMnemonic);

			if (!tc.getArguments().isEmpty())
			{
				// If there are NON optional arguments
				boolean someNotOptional = false;
				boolean haveOptional = false;
				for (ITelecommandArgument arg : tc.getArguments())
				{
					if (!arg.isOptional())
					{
						someNotOptional = true;
						break;
					}
					else
					{
						haveOptional = true;
					}
				}
				if (someNotOptional)
				{
					if (haveOptional)
					{
						error("The sequence '" + sequenceMnemonic + "' requires at least " + tc.getArguments().size() + " arguments",
						        arguments, issues, null);
					}
					else
					{
						error("The sequence '" + sequenceMnemonic + "' requires exactly " + tc.getArguments().size() + " arguments",
						        arguments, issues, null);
					}
				}
			}
		}
		// If it is not a list do not worry, the general checker will warn about
		// it
		else if (arguments instanceof List)
		{
			List argList = (List) arguments;
			int argPosition = 0;

			// Check the correct number of arguments
			ITelecommand tc = getDatabase().getTelecommandModel(sequenceMnemonic);
			java.util.List<ITelecommandArgument> args = tc.getArguments();
			if (argList.elts.length != args.size())
			{
				if (!findOtherFlags(argList, issues))
				{
					// If there are NON optional arguments
					int givenArgumentCount = argList.elts.length;
					int minimumArgumentCount = 0;
					int optionalArgumentCount = 0;
					for (ITelecommandArgument arg : tc.getArguments())
					{
						if (!arg.isOptional())
						{
							minimumArgumentCount++;
						}
						else
						{
							optionalArgumentCount++;
						}
					}
					if (givenArgumentCount < minimumArgumentCount)
					{
						if (optionalArgumentCount > 0)
						{
							error("The sequence '" + sequenceMnemonic + "' requires at least " + args.size() + " arguments", arguments,
							        issues, null);
						}
						else
						{
							error("The sequence '" + sequenceMnemonic + "' requires exactly " + args.size() + " arguments", arguments,
							        issues, null);
						}
					}
				}
			}

			for (exprType element : argList.elts)
			{
				// Do not process arguments beyond the accepted amount
				if (argPosition >= args.size()) break;

				if (!(element instanceof List))
				{
					error("Expected lists within the argument list", element, issues, null);
				}
				else
				{
					// The argument list may have 2 or 3 elements (3 if includes
					// config dict)
					List argElementList = (List) element;
					if (argElementList.elts.length == 2)
					{
						// In this case the argument name and the argument value
						// are given
						processCommandArgument(sequenceMnemonic, argElementList, argPosition, issues);
					}
					else if (argElementList.elts.length == 3)
					{
						// In this case the argument name, the argument value
						// and configuration dict are given
						processCommandArgument(sequenceMnemonic, argElementList, argPosition, issues);
						// TODO processCommandArgumentConfig( commandMnemonic,
						// argElementList, argConfig );
					}
					else if (argElementList.elts.length < 2)
					{
						error("Malformed sequence argument: expected at least elements in the argument definition list", argElementList,
						        issues, null);
					}
					else
					{
						error("Malformed sequence argument: expected no more than 3 elements in the list", argElementList, issues, null);
					}
				}
				argPosition++;
			}
		}
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	private void processGroupPart(exprType cmdElement, IIssueList issues)
	{
		// Ignore the rule if we have a name(variable) or binary operation
		if ((cmdElement instanceof Name) || (cmdElement instanceof BinOp)) { return; }

		if (cmdElement instanceof List)
		{
			List cmdList = (List) cmdElement;
			if (cmdList.elts.length == 0)
			{
				error("Empty list of commands given", cmdList, issues, null);
			}
			else
			{
				for (exprType cmd : cmdList.elts)
				{
					if (cmd instanceof Str || cmd instanceof StrJoin)
					{
						processCommandPart(cmd, null, issues);
					}
					else
					{
						// These are calls for BuildTC or variables containing
						// items, we cannot check here.
					}
				}
			}
		}
		else
		{
			//error("Expected a list of telecommand items", cmdElement, issues, null);
		}
	}
}
