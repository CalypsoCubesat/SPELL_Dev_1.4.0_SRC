///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.language.beautifier
// 
// FILE      : ListParser.java
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

import java.util.LinkedHashSet;

import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.Dict;
import org.python.pydev.parser.jython.ast.List;
import org.python.pydev.parser.jython.ast.exprType;

public class ListParser extends MultilineParser {
	public static Paragraph parse(List list,int indent, int maxLength, boolean useLineBreak,Paragraph parent) {
		return parse(list, indent, maxLength,useLineBreak,false,parent);
	}
	public static Paragraph parse(List list, int indent, int maxLength, boolean useLineBreak,boolean withinList,Paragraph parent) {
		Paragraph p = new Paragraph(parent);
		
		int totalLength = 0;
		boolean hasList = false;
		boolean doAlignment = false;
		for (int index = 0; index < list.elts.length; index++) {
			exprType element = list.elts[index];
			if (element instanceof List) {
				hasList = true;
				totalLength += addList(p, (List) element, indent, maxLength, (index < list.elts.length - 1),
						true,true,parent);
			} else if (element instanceof Dict) {
				totalLength += addDict(p, (Dict) element, indent, maxLength, (index < list.elts.length - 1),parent);
			} else if (element instanceof Call) {
				totalLength += addCall(p, (Call) element, indent, maxLength, (index < list.elts.length - 1),parent);
			} else {
				totalLength += addElement(p, SpellParser.getNodeValue(element,indent,parent,true),element, (index < list.elts.length - 1));
			}
			
		}
		
		
		if (totalLength < maxLength && !hasList){
			p.addBefore("[", true);
			p.addAfter("]");
			p.suppressNewLine();
		} else {
			if (withinList){
				p.addBefore("[", true);
				
//				if (totalLength > maxLength && hasList){
//					p.m_prefix.remove(p.m_prefix.size() - 1);
//					p.addBefore("[ ", true);
//					p.addAfter(" ]");
//					Paragraph linkPostParagraphs = p.linkPostParagraphs(",", 1, null,false,false);
//					p.linkPostParagraphs("]", 0, linkPostParagraphs, false,false);
//					p.fixLinkage("]");
//					
//					doAlignment = true;
//				} else {
					p.addAfter("]");
					p.suppressNewLine();
//				}
				
			} else {
				p.addBefore("[ ", true);
				p.addAfter(" ]");
				Paragraph linkPostParagraphs = p.linkPostParagraphs(",", 1, null,false,false);
				p.linkPostParagraphs("]", 0, linkPostParagraphs, false,false);
				doAlignment = true;
			}
		}
		p.doChildAlignment(null);
		p.constructLinking();
		//p.linkPostParagraphs(",", -1, null,true);
		
		p.addAligner(new ParagraphAligner() {
			
			@Override
			public Paragraph doAlign(Paragraph source,Paragraph related) {
				source.linkPrefixParagraphs("\\[", 0, source, true,false);
				source.constructLinking();
				return source.linkPrefixParagraphs("\\[", 1, null, true,false);
			}
		});
		p.addAligner(new ParagraphAligner() {
			
			@Override
			public Paragraph doAlign(Paragraph source,Paragraph related) {
				return source.linkPostParagraphs("]", 1, related, true,false);
			}
		});

		if (doAlignment){
			p.addAligner(new ParagraphAligner() {
				
				@Override
				public Paragraph doAlign(Paragraph source,Paragraph related) {
					return source.linkPostParagraphs(",", -1, related, true,true);
				}
			});
			
			p.doChildAlignment(null);
			p.constructLinking();
			
		}
		
		for (Paragraph para : p.m_prefix) {
			if (!para.currentID.isEmpty()){
				para.m_linked.remove(para);
				if (!para.m_linked.isEmpty()){
					Paragraph linked = para.m_linked.iterator().next();
					linked.idMap.put(para.currentID, linked);
				}
				para.m_linked = new LinkedHashSet<Paragraph>();
				para.currentID = "";
			}
		}
		
		
		return p;
	}

	public static Paragraph parse(List list, int indent, int maxLength,Paragraph parent) {
		return parse(list, indent, maxLength, false,parent);
	}

	protected static int addElement(Paragraph listParagraph, Paragraph element, exprType element2, boolean addComma) {
		Paragraph p = element;
		if (addComma){
			p.addAfter(", ");
			p.addNewLine();
		} 
		listParagraph.addLine(p);
		addSpecials(element2, p);
		return element.makeString().length();
	}

	protected static int addList(Paragraph listParagraph, List list, int indent, int maxLength, boolean addComma,
			boolean shouldLineBreak,boolean withinList,Paragraph parent) {
		Paragraph value = parse(list, indent, maxLength, shouldLineBreak,withinList,parent);
		if (addComma) {
			value.addAfter(", ");
			value.addNewLine();
		}
		listParagraph.addLine(value);
		addSpecials(list, value);
		return value.toString().length();
	}

	protected static int addDict(Paragraph listParagraph, Dict dict, int indent, int maxLength, boolean addComma,Paragraph parent) {
		Paragraph value = DictParser.parse(dict, indent, maxLength,parent);
		if (addComma) {
			value.addAfter(", ");
			value.addNewLine();
		}
		listParagraph.addLine(value);
		addSpecials(dict, value);
		return value.toString().length();
	}

	protected static int addCall(Paragraph listParagraph, Call call, int indent, int maxLength, boolean addComma,Paragraph parent) {
		Paragraph value = CallParser.parse(call, indent, maxLength,parent);
		if (addComma) {
			value.addAfter(", ");
			value.addNewLine();
		}
		listParagraph.addLine(value);
		addSpecials(call, value);
		return value.toString().length();
	}
}
