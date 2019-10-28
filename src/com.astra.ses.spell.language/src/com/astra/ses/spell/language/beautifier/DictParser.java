///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.language.beautifier
// 
// FILE      : DictParser.java
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

import java.util.ArrayList;

import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.Dict;
import org.python.pydev.parser.jython.ast.List;
import org.python.pydev.parser.jython.ast.exprType;

public class DictParser extends MultilineParser {
	public static Paragraph parse(Dict dict, int indent, int maxLength,Paragraph parent) {
		Paragraph p = new Paragraph(parent);
		addSpecials(dict, p);
		p.addBefore("{ ",true);
		ArrayList<String> lines = new ArrayList<String>();
		int totalLength = 0;
		int maxKeyLength = 0;
		for (int index = 0; index < dict.keys.length; index++) {
			String node = SpellParser.printNode(dict.keys[index],indent,parent,true);
			if (node.length() > maxKeyLength)
				maxKeyLength = node.length();
		}
		boolean hasList = false;
		for (int index = 0; index < dict.keys.length; index++) {
			exprType element = dict.keys[index];
			totalLength += addKeyValue(p, SpellParser.getNodeValue(element,indent,parent,true), dict.values[index], indent, maxLength,
					(index < dict.keys.length - 1),maxKeyLength);
			if (dict.values[index] instanceof List)
				hasList = true;
		}
		
		if (totalLength > maxLength){
			ArrayList<Paragraph> paragraphLines = p.getLines();
			for (int i = 0; i < paragraphLines.size() - 1; i++) {
				Paragraph subParagraph = paragraphLines.get(i);
				if (!subParagraph.endsWithNewline())
					subParagraph.addNewLine();
			}
			
		}
		alignOrMerge(lines, p, indent, totalLength, maxLength,hasList);
		Paragraph lastParagraph = p.get( p.size()-1 );
		if (lastParagraph != null) {
			String lastLine = lastParagraph.toString();
			if (!lastLine.isEmpty() && lastLine.charAt(lastLine.length() - 4) == ','){
				lastParagraph.getM_postfix().clear();
			}
		} else {
			p.getM_prefix().clear();
			p.addBefore("{", false);
			p.addAfter("}");
			return p;
		}
		
		p.addAfter(" }");
		Paragraph linkPostParagraphs = p.linkPostParagraphs(",", 1, null,false,false);
		p.linkPostParagraphs(" }", 0, linkPostParagraphs, false,false);
		p.linkPrefixParagraphs(" : ", 1, null,false,false);
		p.constructLinking();
		p.linkPostParagraphs(",", -1, null,true,false);
		return p;
	}

	protected static int addKeyValue(Paragraph dictParagraph, Paragraph key, exprType value, int indent, int maxLength,
			boolean addComma,int maxKeyLength) {
		Paragraph keyValueParagraph = new Paragraph(dictParagraph);
		keyValueParagraph.addBefore(key, true);
		keyValueParagraph.addBefore(" : ", true);
		parseValue(value, keyValueParagraph, indent + maxKeyLength, maxLength - maxKeyLength);
		addSpecials(value, keyValueParagraph);
		if (keyValueParagraph.makeString().length() < maxLength + maxKeyLength){
			keyValueParagraph.suppressNewLine();
		}
		if (addComma){
			keyValueParagraph.addAfter(", ");
			keyValueParagraph.addNewLine();
		}
		addSpecials(value, keyValueParagraph);
		dictParagraph.addLine(keyValueParagraph);
		return keyValueParagraph.toString().length();
	}

	protected static void parseValue(exprType expr, Paragraph keyValueParagraph, int indent, int maxLength) {
		if (expr instanceof Dict) {
			Paragraph dict = parse((Dict) expr, indent, maxLength,keyValueParagraph);
			keyValueParagraph.addLine(dict);
			addSpecials(expr, dict);
		} else if (expr instanceof List) {
			Paragraph list = ListParser.parse((List) expr,indent, maxLength,true,keyValueParagraph);
			keyValueParagraph.addLine(list);
			addSpecials(expr, list);
		} else if (expr instanceof Call) {
			Paragraph list = CallParser.parse((Call) expr,indent, maxLength,keyValueParagraph);
			keyValueParagraph.addLine(list);
			addSpecials(expr, list);
		} else {
			keyValueParagraph.addLine(SpellParser.getNodeValue(expr,indent,keyValueParagraph,true));
			addSpecials(expr, keyValueParagraph);
		}
	}

	protected static void alignOrMerge(ArrayList<String> lines, Paragraph p, int indent, int totalLength,
			int maxLength,boolean hasList) {
//		//if (totalLength < maxLength) {
//		//	mergeLines(lines, p, "{", "}");
//		//} else {p.getLines().clear();
//		
//
//			indentLines(lines, indent, p);
//			p.addBefore("{ ");
//			p.addAfter(" }");
//			alignAt(p, ":", 0, indent);
//			//alignAt(p, "]", 0, indent);
//			int pos = alignByCommas(p, indent);
//			if (hasList)
//				alignAt(p, "]", pos, indent);
//			alignAt(p, ",", pos, indent);
//			alignAt(p, "}", pos, indent);
//		//}
	}
}
