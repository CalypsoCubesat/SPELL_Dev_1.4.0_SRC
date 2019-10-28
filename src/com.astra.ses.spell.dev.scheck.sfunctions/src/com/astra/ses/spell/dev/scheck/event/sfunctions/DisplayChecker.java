///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.event.sfunctions
// 
// FILE      : DisplayChecker.java
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

import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.Name;
import org.python.pydev.parser.jython.ast.keywordType;

import com.astra.ses.spell.dev.scheck.interfaces.BaseChecker;
import com.astra.ses.spell.dev.scheck.interfaces.EventType;
import com.astra.ses.spell.dev.scheck.interfaces.IEvent;
import com.astra.ses.spell.dev.scheck.interfaces.IIssueList;

public class DisplayChecker extends BaseChecker 
{
	/**************************************************************************
	 * 
	 *************************************************************************/
	public DisplayChecker()
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
			if (functionName.equals("Display"))
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
		if (call.args.length>2)
		{
			error("Display function accepts a maximum of two arguments", call, issues, null);
		}
		// We cannot check the first argument as Display accepts anything there.
		// We check the case when severity is given
		else if (call.args.length==2)
		{
			if (!(call.args[1] instanceof Name))
			{
				error("Expected a severity value or a variable", call.args[1], issues, null);
			}
		}
		
		// Check if the severity is given as keyword
		if (call.keywords.length!=0)
		{
			for(keywordType kwd : call.keywords)
			{
				String keyword = getStringLiteral(kwd.arg);
				if (keyword.equals("Severity"))
				{
					if (!(kwd.value instanceof Name))
					{
						error("Invalid severity value", kwd.value, issues, null);
					}
				}
			}
		}
	}
	
	@Override
    public String getName()
    {
	    return "Display rules";
    }
}