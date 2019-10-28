///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.language.beautifier
// 
// FILE      : KeywordParser.java
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

import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.Dict;
import org.python.pydev.parser.jython.ast.List;
import org.python.pydev.parser.jython.ast.keywordType;

public class KeywordParser 
{

	public static Paragraph parse(Paragraph parent,keywordType keywd, int indent, int maxLength,boolean addComma) {
		Paragraph keywordParagraph = new Paragraph(parent);
		SimpleNode kname = keywd.arg;
		SimpleNode kvalue = keywd.value;

		String line = SpellParser.printNode(kname,indent,parent,true);

		TextParagraph key = new TextParagraph(line,false,parent);
		keywordParagraph.addBefore(key, true);
		//keywordParagraph.addIndent(3);
		keywordParagraph.addBefore(" = ",true);
		
		if (kvalue instanceof Call) {
			Paragraph kval = CallParser.parse((Call) kvalue, indent, maxLength,parent);
			keywordParagraph.addLine(kval);
			kval.fixLinkage(",");
		} else if (kvalue instanceof List) {
			Paragraph kval = ListParser.parse((List) kvalue, indent, maxLength, true,parent);
			keywordParagraph.addLine(kval);
			kval.fixLinkage(",");
		} else if (kvalue instanceof Dict) {
			Paragraph kval = DictParser.parse((Dict) kvalue, indent, maxLength,parent);
			keywordParagraph.addLine(kval);
			kval.fixLinkage(",");
		} else {
			TextParagraph l = new TextParagraph(SpellParser.printNode(kvalue,indent,parent,true),false,parent);
			keywordParagraph.addLine(l);
		}
		keywordParagraph.getLines().get(0).fixLinkage(".");
		if (addComma){
			String r = parent.makeString();
			int lastNewLine = r.lastIndexOf("\n");
			if (lastNewLine > 0){
				r = r.substring(lastNewLine, r.length());
			}
			if (r.length() + keywordParagraph.makeString().length() < maxLength){
				keywordParagraph.addAfter(", ");
			} else {
				keywordParagraph.addAfter(",");
				keywordParagraph.addNewLine();
			}
		}
		return keywordParagraph;
	}
}
