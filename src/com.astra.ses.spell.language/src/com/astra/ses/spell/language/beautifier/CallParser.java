///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.language.beautifier
// 
// FILE      : CallParser.java
//
// DATE      : 2009-11-23
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
// SUBPROJECT: SPELL Development Environment
//
///////////////////////////////////////////////////////////////////////////////
package com.astra.ses.spell.language.beautifier;

import org.python.pydev.parser.jython.SpecialStr;
import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.Dict;
import org.python.pydev.parser.jython.ast.List;
import org.python.pydev.parser.jython.ast.exprType;
import org.python.pydev.parser.jython.ast.keywordType;


public class CallParser extends MultilineParser
{
	public static Paragraph parse( Call call,int indent, int maxLength,Paragraph parent )
	{
		String funcName = SpellParser.printNode(call.func,indent,parent,true).trim();
		if (call.func.specialsAfter.contains(new SpecialStr("*", 0, 0)) || call.func.specialsAfter.contains(new SpecialStr("**", 0, 0)))
			funcName = funcName.replace("*","");
		if (funcName.endsWith("("))
			funcName = funcName.substring(0,funcName.length() - 1);
		boolean doAlignment = true;
		Paragraph callParagraph = new Paragraph(parent);
		int lastLength = 0;
		addSpecials(call, callParagraph);
		for (int i = 0; i < call.args.length; i++) {
			Paragraph p;
			exprType arg = call.args[i];
			boolean addComma = i != call.args.length - 1;
			if (arg instanceof Call)
			{
				p = CallParser.parse((Call) arg, indent, maxLength,parent);
			}
			else if (arg instanceof Dict)
			{
				p = DictParser.parse( (Dict) arg, indent, maxLength,parent );
			}
			else if (arg instanceof List)
			{
				p = ListParser.parse( (List) arg, indent, maxLength ,true,parent);
			}
			else
			{
				p = SpellParser.getNodeValue(arg,indent,parent,true);
			}
			p.fixLinkage(",");
			addSpecials(arg, p);
			if (p.hasNewline() && callParagraph.m_lines.size() > 0){
				Paragraph prevParagraph = callParagraph.m_lines.get(callParagraph.m_lines.size() - 1);
				if (!prevParagraph.endsWithNewline())
					prevParagraph.addNewLine();
			} 
			if (addComma){
				String r = callParagraph.makeString();
				int currentLength = r.length();
				if (currentLength > 0){
					int lastNewLine = r.substring(0, r.length()-1).lastIndexOf("\n");
					if (lastNewLine > 0){
						r = r.substring(lastNewLine, r.length());
					}
				}
				if (r.length() + p.makeString().length()  < maxLength){
					Paragraph prev = callParagraph.get(-1);
					if (prev != null)
						prev.fixLinkage(", ");
					p.addAfter(", ");
				} else {
					Paragraph prev = callParagraph.get(-1);
					if (prev != null && !prev.endsWithNewline())
						prev.addNewLine();
					p.addAfter(", ");
					//p.addNewLine();
				}
				lastLength = currentLength;
				
			} else {
				String r = callParagraph.makeString();
				int currentLength = r.length();
				if (currentLength > 0){
					int lastNewLine = r.substring(0, r.length()-1).lastIndexOf("\n");
					if (lastNewLine > 0){
						r = r.substring(lastNewLine, r.length());
					}
				}
				if (r.length() + p.makeString().length()  < maxLength){
					Paragraph prev = callParagraph.get(-1);
					if (prev != null)
						prev.fixLinkage(", ");
				}
			}
			callParagraph.addLine(p);
		}
		
		if (call.args.length > 0 && call.keywords.length > 0){
			Paragraph textParagraph = callParagraph.get(callParagraph.size() - 1);
			
			String r = callParagraph.makeString();
			int lastNewLine = r.lastIndexOf("\n");
			if (lastNewLine > 0){
				r = r.substring(lastNewLine, r.length());
			}
			int length = r.length();
			if (length > maxLength || call.keywords.length > 1){
				textParagraph.addAfter(",");
				textParagraph.addNewLine();
			} else {
				if (call.keywords.length == 1){
					keywordType kwd = call.keywords[0];
					Paragraph p = KeywordParser.parse(callParagraph, kwd, indent, maxLength, false );
					addSpecials(kwd, p);
					if (p.makeString().length() > maxLength){
						textParagraph.addAfter(",");
						textParagraph.addNewLine();
					} else {
						textParagraph.addAfter(", ").fixLinkage(",");
					}
				} else {
					textParagraph.addAfter(", ").fixLinkage(",");
				}
				
			}
		}
		
		for (int i = 0; i < call.keywords.length; i++) {
			keywordType kwd = call.keywords[i];
			Paragraph p = KeywordParser.parse(callParagraph, kwd, indent, maxLength, i != call.keywords.length - 1 );
			addSpecials(kwd, p);
			if (p.toString().length() > maxLength || call.keywords.length > 1){
				Paragraph last = callParagraph.get(-1);
				if (last != null && !last.endsWithNewline())
					last.addNewLine();
			}
				
			callParagraph.addLine(p);
			
		}
		if (call.starargs != null) {
			exprType starargs = call.starargs;
			boolean addComma = !callParagraph.getLines().isEmpty();
			Paragraph p;
			if (starargs instanceof Call)
			{
				p = CallParser.parse((Call) starargs, indent, maxLength,parent);
			}
			else if (starargs instanceof Dict)
			{
				p = DictParser.parse( (Dict) starargs, indent, maxLength,parent );
			}
			else if (starargs instanceof List)
			{
				p = ListParser.parse( (List) starargs, indent, maxLength ,true,parent);
			}
			else
			{
				p = SpellParser.getNodeValue(starargs,indent,parent,true);
			}
			p.addBefore("*", false);
			p.fixLinkage(",");
			if (p.hasNewline() && callParagraph.m_lines.size() > 0){
				Paragraph prevParagraph = callParagraph.m_lines.get(callParagraph.m_lines.size() - 1);
				if (!prevParagraph.endsWithNewline())
					prevParagraph.addNewLine();
			} 
			if (addComma){
				String r = callParagraph.makeString();
				int currentLength = r.length();
				if (currentLength > 0){
					int lastNewLine = r.substring(0, r.length()-1).lastIndexOf("\n");
					if (lastNewLine > 0){
						r = r.substring(lastNewLine, r.length());
					}
				}
				if (r.length() + p.makeString().length()  < maxLength){
					Paragraph prev = callParagraph.get(-1);
					if (prev != null)
						prev.fixLinkage(", ");
					p.addAfter(", ");
				} else {
					Paragraph prev = callParagraph.get(-1);
					if (prev != null && !prev.endsWithNewline())
						prev.addNewLine();
					p.addAfter(", ");
					//p.addNewLine();
				}
				lastLength = currentLength;
				
			} else {
				String r = callParagraph.makeString();
				int currentLength = r.length();
				if (currentLength > 0){
					int lastNewLine = r.substring(0, r.length()-1).lastIndexOf("\n");
					if (lastNewLine > 0){
						r = r.substring(lastNewLine, r.length());
					}
				}
				if (r.length() + p.makeString().length()  < maxLength){
					Paragraph prev = callParagraph.get(-1);
					if (prev != null)
						prev.fixLinkage(", ");
				}
			}
			callParagraph.addLine(p);
		}
		if (call.kwargs != null) {
			exprType starargs = call.kwargs;
			boolean addComma = !callParagraph.getLines().isEmpty();
			Paragraph p;
			if (starargs instanceof Call)
			{
				p = CallParser.parse((Call) starargs, indent, maxLength,parent);
			}
			else if (starargs instanceof Dict)
			{
				p = DictParser.parse( (Dict) starargs, indent, maxLength,parent );
			}
			else if (starargs instanceof List)
			{
				p = ListParser.parse( (List) starargs, indent, maxLength ,true,parent);
			}
			else
			{
				p = SpellParser.getNodeValue(starargs,indent,parent,true);
			}
			p.addBefore("**", false);
			p.fixLinkage(",");
			if (p.hasNewline() && callParagraph.m_lines.size() > 0){
				Paragraph prevParagraph = callParagraph.m_lines.get(callParagraph.m_lines.size() - 1);
				if (!prevParagraph.endsWithNewline())
					prevParagraph.addNewLine();
			} 
			if (addComma){
				String r = callParagraph.makeString();
				int currentLength = r.length();
				if (currentLength > 0){
					int lastNewLine = r.substring(0, r.length()-1).lastIndexOf("\n");
					if (lastNewLine > 0){
						r = r.substring(lastNewLine, r.length());
					}
				}
				if (r.length() + p.makeString().length()  < maxLength){
					Paragraph prev = callParagraph.get(-1);
					if (prev != null)
						prev.fixLinkage(", ");
					p.addAfter(", ");
				} else {
					Paragraph prev = callParagraph.get(-1);
					if (prev != null && !prev.endsWithNewline())
						prev.addNewLine();
					p.addAfter(", ");
					//p.addNewLine();
				}
				lastLength = currentLength;
				
			} else {
				String r = callParagraph.makeString();
				int currentLength = r.length();
				if (currentLength > 0){
					int lastNewLine = r.substring(0, r.length()-1).lastIndexOf("\n");
					if (lastNewLine > 0){
						r = r.substring(lastNewLine, r.length());
					}
				}
				if (r.length() + p.makeString().length()  < maxLength){
					Paragraph prev = callParagraph.get(-1);
					if (prev != null)
						prev.fixLinkage(", ");
				}
			}
			callParagraph.addLine(p);
		}
		
		int length = callParagraph.makeString().length();
		// Put all paragraphs together
		if (callParagraph.m_lines.isEmpty() || length < maxLength || !callParagraph.hasNewline()){
			if ("___".equals(funcName)){
				callParagraph.addBefore(funcName, true);
				callParagraph.addBefore("(", true);
			}else{
				callParagraph.addBefore(funcName, true);
				callParagraph.addBefore("(", true);
			}
			callParagraph.addAfter(")");
		}else{
			if ("___".equals(funcName)){
				callParagraph.addBefore(funcName, true);
				callParagraph.addBefore("(", true);
			}else{
				callParagraph.addBefore(funcName, true);
				callParagraph.addBefore("(", true);
			}
			
			callParagraph.addAfter(")");
		}
		callParagraph.linkPrefixParagraphs(" = ", 1, null, true, false);
		callParagraph.constructLinking();
		if (doAlignment){
			callParagraph.addAligner(new ParagraphAligner() {
				
				@Override
				public Paragraph doAlign(Paragraph source,Paragraph related) {
					return source.linkPostParagraphs(",", -1, related, true,true);
				}
			});
			
			callParagraph.doChildAlignment(null);
			callParagraph.constructLinking();
			callParagraph.fixLinkage(",");
		}
//		int p = alignAt(main, "=", 0, indent);
//		p = alignAt(main, "[ [", 0, indent);
		
		return callParagraph;

	}
}
