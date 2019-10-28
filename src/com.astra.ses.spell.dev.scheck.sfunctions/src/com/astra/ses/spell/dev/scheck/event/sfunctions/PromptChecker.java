///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.event.sfunctions
// 
// FILE      : PromptChecker.java
//
// DATE      : Jul 10, 2013
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

import java.util.ArrayList;

import org.python.pydev.parser.jython.ast.BinOp;
import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.List;
import org.python.pydev.parser.jython.ast.Name;
import org.python.pydev.parser.jython.ast.exprType;
import org.python.pydev.parser.jython.ast.keywordType;

import com.astra.ses.spell.dev.scheck.interfaces.BaseChecker;
import com.astra.ses.spell.dev.scheck.interfaces.EventType;
import com.astra.ses.spell.dev.scheck.interfaces.IEvent;
import com.astra.ses.spell.dev.scheck.interfaces.IIssueList;

public class PromptChecker extends BaseChecker 
{
	private static java.util.List<String> s_validTypes;
	
	static 
	{
		s_validTypes = new ArrayList<String>();
		s_validTypes.add("OK");
		s_validTypes.add("CANCEL");
		s_validTypes.add("YES");
		s_validTypes.add("NO");
		s_validTypes.add("NUM");
		s_validTypes.add("OK_CANCEL");
		s_validTypes.add("YES_NO");
		s_validTypes.add("LIST");
		s_validTypes.add("COMBO");
		s_validTypes.add("ALPHA");
	};

	
	
	/**************************************************************************
	 * 
	 *************************************************************************/
	public PromptChecker()
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
			if (functionName.equals("Prompt"))
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
	protected void processCall( Call call, IIssueList issues )
	{
		if (call.args.length==0)
		{
			error("Prompt function requires at least one string argument", call, issues, null);
		}
		else
		{
			// Check first argument (prompt message)
			if (!isNonProcessable(call.args[0]))
			{
				if (!isStringLiteral(call.args[0]))
				{
					error("Expected a message string", call.args[0], issues, null);
				}
			}
			// If a second positional argument is given, it shall be the prompt type or a list of options
			if (call.args.length>=2)
			{
				if (call.args[1] instanceof List)
				{
					// If there is a third positional argument, it shall be the prompt type
					if (call.args.length>=3)
					{
						if (call.args[2] instanceof Name || call.args[2] instanceof BinOp)
						{
							if (isValidType(call.args[2]))
							{
								String arg = getStringLiteral(call.args[2]);
								if (!arg.contains("LIST"))
								{
									error("Invalid prompt type when a list of options is given (" + arg + ")", call.args[2], issues, null);
								}
							}
							else
							{
								error("Invalid prompt type " + getStringLiteral(call.args[2]), call.args[2], issues, null);
							}
						}
					}
					// If there is no positional argument, the type shall be provided as keyword
					else if (call.keywords.length == 0)
					{
						error("Prompt LIST type must be provided if a list of prompt options is given", call, issues, null);
					}
					// Ensure that the Type modifier is given
					else 
					{
						boolean typeGiven = false;
						for(keywordType kwd : call.keywords)
						{
							String keyword = getStringLiteral(kwd.arg);
							if (keyword.equals("Type"))
							{
								typeGiven = true;
								if (!isNonProcessable(kwd.value) && isValidType(kwd.value))
								{
									String arg = getStringLiteral(call.args[2]);
									if (!arg.contains("LIST"))
									{
										error("Invalid prompt type when a list of options is given (" + arg + ")", call.args[2], issues, null);
									}
								}
								break;
							}
						}
						if (!typeGiven)
						{
							error("Prompt LIST type must be provided if a list of prompt options is given", call, issues, null);
						}
					}
					
					// Now, check the correctness of the option list
					List optList = (List) call.args[1];
					if (optList.elts.length==0)
					{
						error("Empty list of prompt options given", optList, issues, null);
					}
					else
					for(exprType elem : optList.elts)
					{
						if (!isNonProcessable(elem) && !isStringLiteral(elem))
						{
							error("Invalid prompt option (expected string or variable)", elem, issues, null);
						}
					}
				}
				// Otherwise the second positional argument shall be the prompt type
				else if (!isNonProcessable(call.args[1]))
				{
					if (!isValidType(call.args[1]))
					{
						error("Invalid prompt type " + getStringLiteral(call.args[1]), call.args[1], issues, null);
					}
				}
			}
		}
	}
	
	/**************************************************************************
	 *
	 *************************************************************************/
	private boolean isValidType( exprType type )
	{
		if (type instanceof Name)
		{
			// It will be a list of options if there is a third argument being LIST or a combination of LIST
			String arg = getStringLiteral(type);
			if (s_validTypes.contains(arg)) 
			{
				return true;
			}
		}
		else if (type instanceof BinOp)
		{
			BinOp op = (BinOp) type;
			if (op.op != BinOp.BitOr)
			{
				return false;
			}
			else
			{
				if (!(op.left instanceof Name) || !(op.right instanceof Name))
				{
					return false;
				}
				if (!isValidType(op.left)) 
				{
					return false;
				}
				if (!isValidType(op.right)) 
				{
					return false;
				}
				return true;
			}
		}
		return false;
	}
	
	/**************************************************************************
	 *
	 *************************************************************************/
	@Override
    public String getName()
    {
	    return "Prompt rules";
    }
}
