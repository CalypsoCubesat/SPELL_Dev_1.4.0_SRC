///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.interfaces
// 
// FILE      : BaseChecker.java
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
package com.astra.ses.spell.dev.scheck.interfaces;

import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.jython.ast.BinOp;
import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.ListComp;
import org.python.pydev.parser.jython.ast.Name;
import org.python.pydev.parser.jython.ast.NameTok;
import org.python.pydev.parser.jython.ast.Str;
import org.python.pydev.parser.jython.ast.StrJoin;
import org.python.pydev.parser.jython.ast.Subscript;
import org.python.pydev.parser.jython.ast.Tuple;
import org.python.pydev.parser.jython.ast.exprType;
import org.python.pydev.parser.jython.ast.keywordType;

import com.astra.ses.spell.dev.scheck.QuickFix;

public abstract class BaseChecker extends AbstractEventRuleChecker implements IEventRuleChecker 
{
	/**************************************************************************
	 * 
	 *************************************************************************/
	public BaseChecker()
	{
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	@Override
	public void notifyEvent(IEvent event, IIssueList issues) 
	{
		processEvent(event,issues);
	}
	
	/**************************************************************************
	 * 
	 *************************************************************************/
	protected abstract void processEvent( IEvent event, IIssueList issues );
	
	/**************************************************************************
	 * 
	 *************************************************************************/
	protected void error( String message, SimpleNode node, IIssueList issues, QuickFix qf )
	{
		IIssue issue = IssueFactory.createErrorIssue(message, node);
		if (qf != null)
		{
			issue.setQuickFix(qf);
		}
		issues.addIssue( issue );
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected void warning( String message, SimpleNode node, IIssueList issues, QuickFix qf )
	{
		IIssue issue = IssueFactory.createWarningIssue(message, node);
		if (qf != null)
		{
			issue.setQuickFix(qf);
		}
		issues.addIssue( issue );
	}
	
	/**************************************************************************
	 * 
	 *************************************************************************/
	protected boolean isStringLiteral( SimpleNode node )
	{
		return (node instanceof Str) || (node instanceof StrJoin);
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected boolean isNonProcessable( SimpleNode node )
	{
		return (node instanceof Name) || (node instanceof Call) || (node instanceof Subscript) || (node instanceof BinOp) || (node instanceof ListComp) || (node instanceof Tuple);
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected String getStringLiteral( SimpleNode node )
	{
		String literal = "";
		if (node instanceof Str)
		{
			literal = ((Str)node).s;
		}
		else if (node instanceof StrJoin )
		{
			StrJoin join = (StrJoin) node;
			for( exprType s : join.strs)
			{
				literal += getStringLiteral(s);
			}
		}
		else if (node instanceof Name )
		{
			Name name = (Name) node;
			literal = name.id;
		}
		else if (node instanceof NameTok )
		{
			NameTok name = (NameTok) node;
			literal = name.id;
		}
		else if (node instanceof BinOp )
		{
			BinOp op = (BinOp) node;
			if (op.op == BinOp.BitOr)
			{
				literal = getStringLiteral(op.left) + "|" + getStringLiteral(op.right);
			}
			else if (op.op == BinOp.BitAnd)
			{
				literal = getStringLiteral(op.left) + "&" + getStringLiteral(op.right);
			}
		}
		if (literal.isEmpty())
		{
			System.err.println("UNPARSED LITERAL: " + node);
		}
		return literal;
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected boolean hasModifier( Call call, String name )
	{
		for(keywordType kwd : call.keywords)
		{
			String kname = getStringLiteral(kwd.arg);
			if (kname.equals(name)) return true;
		}
		return false;
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	protected exprType getModifierValue( Call call, String name )
	{
		for(keywordType kwd : call.keywords)
		{
			String kname = getStringLiteral(kwd.arg);
			if (kname.equals(name)) 
			{
				return kwd.value;
			}
		}
		return null;
	}
}
