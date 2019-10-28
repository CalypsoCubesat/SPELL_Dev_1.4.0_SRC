///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.interfaces
//
// FILE      : TokenHelper.java
//
// DATE      : Feb 9, 2011
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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.jython.SpecialStr;
import org.python.pydev.parser.jython.ast.Attribute;
import org.python.pydev.parser.jython.ast.BinOp;
import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.Dict;
import org.python.pydev.parser.jython.ast.FunctionDef;
import org.python.pydev.parser.jython.ast.Import;
import org.python.pydev.parser.jython.ast.ImportFrom;
import org.python.pydev.parser.jython.ast.List;
import org.python.pydev.parser.jython.ast.ListComp;
import org.python.pydev.parser.jython.ast.Name;
import org.python.pydev.parser.jython.ast.NameTok;
import org.python.pydev.parser.jython.ast.Num;
import org.python.pydev.parser.jython.ast.Str;
import org.python.pydev.parser.jython.ast.StrJoin;
import org.python.pydev.parser.jython.ast.Subscript;
import org.python.pydev.parser.jython.ast.Tuple;
import org.python.pydev.parser.jython.ast.aliasType;
import org.python.pydev.parser.jython.ast.commentType;
import org.python.pydev.parser.jython.ast.exprType;

import com.astra.ses.spell.dev.scheck.ResourceManager;
import com.astra.ses.spell.language.SpellProgrammingLanguage;

public class TokenHelper  
{
	public static int getStartOffset( IResource resource, SimpleNode node )
	{
		String sourceStr = ResourceManager.instance().getSource( (IFile) resource );
		// The file is forced to be unix
		if (sourceStr == null)
			return 0;
		String[] source = sourceStr.split( "\r?\n" );
		int offset = 0;
		int lengthToBeginLine = 0;
		for( int index = 0; index<node.beginLine-1; index++)
		{
			lengthToBeginLine += source[index].length()+1;
		}
		offset = lengthToBeginLine + node.beginColumn-1;
		if (node instanceof Call)
		{
			Call call = (Call) node;
			if (call.func instanceof Name)
			{
				offset -= ((Name)call.func).id.length();
			}
		}
		else if (node instanceof FunctionDef)
		{
			offset += 4;
		}
		return offset;
	}

	public static int getTokenLength( IResource resource, Object node, boolean addSpecials )
	{
		int length = 0;
		
		if (addSpecials && (node instanceof SimpleNode))
		{
			for( Object obj : ((SimpleNode)node).getSpecialsBefore())
			{
				length += getTokenLength(resource, obj, true);
			}
		}

		if (node instanceof Call)
		{
			Call call = (Call) node;
			if (call.func instanceof Name)
			{
				Name functionName = (Name) call.func;
				length = functionName.id.length();
			}
			else 
			{
				Attribute attr = (Attribute) call.func;
				length = getTokenLength(resource, attr.value, false);
			}
		}
		else if (node instanceof Str)
		{
			Str str = (Str) node;
			length = str.s.length() + 2;
		}
		else if (node instanceof String)
		{
			length = ((String)node).length();
		}
		else if (node instanceof SpecialStr)
		{
			SpecialStr sstr = (SpecialStr) node;
			length = sstr.str.length();
		}
		else if (node instanceof Name)
		{
			Name name = (Name) node;
			length = name.id.length();
		}
		else if (node instanceof NameTok)
		{
			NameTok name = (NameTok) node;
			length = name.id.length();
		}
		else if (node instanceof Num)
		{
			Num num = (Num) node;
			length = num.num.length();
		}
		else if (node instanceof FunctionDef)
		{
			FunctionDef def = (FunctionDef) node;
			length = ((NameTok)def.name).id.length();
		}
		else if (node instanceof StrJoin)
		{
			StrJoin join = (StrJoin) node;
			for( exprType expr : join.strs )
			{
				Str s = (Str) expr;
				length += s.s.length() + 2;
			}
		}
		else if (node instanceof BinOp)
		{
			BinOp op = (BinOp) node;
			if (op.left.beginLine == op.right.beginLine)
			{
				length = op.right.beginColumn + getTokenLength(resource, op.right, true) - op.left.beginColumn;
			}
			else
			{
				length = getStartOffset(resource, op.right) + getTokenLength(resource, op.right, true) - getStartOffset(resource, op.left);
			}
		}
		else if (node instanceof Subscript)
		{
			Subscript sc = (Subscript) node;
			length = getTokenLength(resource, sc.value, true);
		}
		else if (node instanceof List)
		{
			List list = (List) node;
			if (list.elts[0].beginLine == list.elts[list.elts.length-1].beginLine)
			{
				length = list.elts[list.elts.length-1].beginColumn + getTokenLength(resource, list.elts[list.elts.length-1], true) - list.elts[0].beginColumn;
			}
			else
			{
				length = getStartOffset(resource, list.elts[list.elts.length-1]) + getTokenLength(resource, list.elts[list.elts.length-1], true) - getStartOffset(resource, list.elts[0]);
			}
			length += 2;
		}
		else if (node instanceof Dict)
		{
			Dict dict = (Dict) node;
			if (dict.keys[0].beginLine == dict.values[dict.values.length-1].beginLine)
			{
				length = dict.values[dict.values.length-1].beginColumn + getTokenLength(resource, dict.values[dict.values.length-1], true) - dict.keys[0].beginColumn;
			}
			else
			{
				length = getStartOffset(resource, dict.values[dict.values.length-1]) + getTokenLength(resource, dict.values[dict.values.length-1], true) - getStartOffset(resource, dict.keys[0]);
			}
			length += 2;
		}
		else if (node instanceof commentType)
		{
			commentType comment = (commentType) node;
			length = comment.id.length();
		}
		else if (node instanceof ListComp)
		{
			ListComp lcomp = (ListComp) node;
			length = getTokenLength(resource, lcomp.elt, true);
		}
		else if (node instanceof Import)
		{
			Import impt = (Import) node;
			length = 0;
			for(aliasType alias : impt.names)
			{
				length += getTokenLength(resource, alias.name, true);
			}
		}
		else if (node instanceof ImportFrom)
		{
			ImportFrom impt = (ImportFrom) node;
			length = 0;
			for(aliasType alias : impt.names)
			{
				length += getTokenLength(resource, alias.name, true);
			}
		}
		else if (node instanceof Tuple)
		{
			Tuple tuple = (Tuple) node;
			if (tuple.elts[0].beginLine == tuple.elts[tuple.elts.length-1].beginLine)
			{
				length = tuple.elts[tuple.elts.length-1].beginColumn + getTokenLength(resource, tuple.elts[tuple.elts.length-1], true) - tuple.elts[0].beginColumn;
			}
			else
			{
				length = getStartOffset(resource, tuple.elts[tuple.elts.length-1]) + getTokenLength(resource, tuple.elts[tuple.elts.length-1], true) - getStartOffset(resource, tuple.elts[0]);
			}
			length += 2;
		}
		else
		{
			System.err.println("Cannot find token length: " + node);
			length = 2;
		}
		
		if (addSpecials && (node instanceof SimpleNode))
		{
			for( Object obj : ((SimpleNode)node).getSpecialsAfter())
			{
				length += getTokenLength(resource, obj,true);
			}
		}

		return length;
	}
	
	/**************************************************************************
	 * 
	 *************************************************************************/
	public static ValueType getEquivalentType( SimpleNode node )
	{
		ValueType type = ValueType.ANY;
		if (node instanceof Str)
		{
			type = ValueType.STRING;
		}
		else if (node instanceof Num)
		{
			type = ValueType.NUM;
		}
		else if (node instanceof BinOp)
		{
			type = getEquivalentType( ((BinOp)node).left );
		}
		else if (node instanceof StrJoin)
		{
			type = ValueType.STRING;
		}
		else if (node instanceof Name)
		{
			Name name = (Name)node;
			if (name.id.equals("TIME"))
			{
				type = ValueType.TIME;
			}
			else if (name.id.equals("True")||name.id.equals("False"))
			{
				type = ValueType.BOOL;
			}
			else
			{
				type = ValueType.NAME;
			}
		}
		else if (node instanceof List)
		{
			type = ValueType.LIST;
		}
		else if (node instanceof Dict)
		{
			type = ValueType.DICT;
		}
		else if (node instanceof Subscript)
		{
			type = ValueType.NAME;
		}
		else if (node instanceof ListComp)
		{
			type = ValueType.LIST;
		}
		else if (node instanceof Call)
		{
			type = ValueType.ANY;
		}
		else if (node instanceof Tuple)
		{
			Tuple t = (Tuple) node;
			if (t.elts.length!=1)
			{
				type = ValueType.ANY;
			}
			else
			{
				type = getEquivalentType(t.elts[0]);
			}
		}
		else
		{
			System.err.println("Cannot find type for modifier token " + node.getClass().getName() + ": " + node);
		}
		return type;
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	public static String getEquivalentValue( Object node )
	{
		String value = "";
		
		if (node instanceof SimpleNode)
		{
			for( Object obj : ((SimpleNode)node).getSpecialsBefore())
			{
				value += getEquivalentValue(obj);
			}
		}

		if (node instanceof Str)
		{
			value = ((Str)node).s;
		}
		else if (node instanceof Num)
		{
			value = ((Num)node).num;
		}
		else if (node instanceof BinOp)
		{
			BinOp bo = (BinOp) node;
			String operator = "";
			switch(bo.op)
			{
			case BinOp.Add:
				operator = "+";
				break;
			case BinOp.Div:
				operator = "/";
				break;
			case BinOp.Mult:
				operator = "*";
				break;
			case BinOp.Sub:
				operator = "-";
				break;
			case BinOp.BitAnd:
				operator = "&";
				break;
			case BinOp.BitOr:
				operator = "|";
				break;
			case BinOp.BitXor:
				operator = "^";
				break;
			case BinOp.FloorDiv:
				operator = "\\";
				break;
			case BinOp.Mod:
				operator = "%";
				break;
			case BinOp.Pow:
				operator = "**";
				break;
			case BinOp.LShift:
				operator = "<<";
				break;
			case BinOp.RShift:
				operator = ">>";
				break;
			}
			value = getEquivalentValue(bo.left) + operator + getEquivalentValue( ((BinOp)node).right ); 
		}
		else if (node instanceof StrJoin)
		{
			for( exprType s : ((StrJoin)node).strs )
			{
				value += getEquivalentValue( s );
			}
		}
		else if (node instanceof Name)
		{
			String nam = ((Name)node).id;
			if (SpellProgrammingLanguage.getInstance().isSpellConstant(nam))
			{
				value = nam;
			}
			else
			{
				value = "@name";
			}
		}
		else if (node instanceof List)
		{
			value = "@list";
		}
		else if (node instanceof Dict)
		{
			value = "@dict";
		}
		
		if (node instanceof SimpleNode)
		{
			for( Object obj : ((SimpleNode)node).getSpecialsAfter())
			{
				value += getEquivalentValue(obj);
			}
		}

		return value;
	}

}
