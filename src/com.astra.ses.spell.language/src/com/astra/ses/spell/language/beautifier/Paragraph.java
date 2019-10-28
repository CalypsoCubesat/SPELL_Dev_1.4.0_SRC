///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.language.beautifier
// 
// FILE      : Paragraph.java
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
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.python.pydev.shared_core.string.StringUtils;

import com.google.common.collect.LinkedHashMultimap;

public class Paragraph 
{
	protected ArrayList<Paragraph> foundSpecials = new ArrayList<Paragraph>();
	protected HashMap<String,Paragraph> idMap = new HashMap<String,Paragraph>();
	protected int[] latestID = {0};
	protected String currentID = "";
	protected ArrayList<Paragraph> m_lines;
	protected int indent = 0;
	protected ArrayList<Paragraph> m_prefix;
	protected ArrayList<Paragraph> m_postfix;
	protected ArrayList<Paragraph> m_specials;
	protected ArrayList<ParagraphAligner> m_aligner;
	protected LinkedHashSet<Paragraph> m_linked;
	
	private Map<Object,Object> specialRegistry;
	
	protected boolean shouldUpdateIndent = false;
	protected boolean addAlignmentAfterwards = false;
	protected int order = -1;
	
	public void cleanup(){
		idMap.clear();
		latestID[0] = 0;
	}
	
	public Paragraph(Paragraph parent)
	{
		m_lines = new ArrayList<Paragraph>();
		m_specials = new ArrayList<Paragraph>();
		setM_prefix(new ArrayList<Paragraph>());
		setM_postfix(new ArrayList<Paragraph>());
		m_linked = new LinkedHashSet<Paragraph>();
		m_aligner = new ArrayList<ParagraphAligner>();
		if (parent != null){
			idMap = parent.idMap;
			latestID = parent.latestID;
			foundSpecials = parent.foundSpecials;
			setSpecialRegistry(parent.getSpecialRegistry());
		} else {
			setSpecialRegistry(new IdentityHashMap<Object, Object>());
		}
	}
	
	public static String getIDPattern(){
		return "(\\{!-\\d+-!\\})";
	}
	public String buildID(int latestID){
		return "{!-" + latestID + "-!}";
	}
	
	public ParagraphAligner addAligner(ParagraphAligner aligner){
		m_aligner.add(aligner);
		return aligner;
	}
	
	public Paragraph doChildAlignment(Paragraph related){
		Paragraph oldRelated = related;
		for (ParagraphAligner paragraphAligner : m_aligner) {
			related = oldRelated;
			Paragraph p = paragraphAligner.doAlign(this,related);
			if (p != null)
				related = p;
			while (paragraphAligner.getNext() != null){
				paragraphAligner = paragraphAligner.getNext();
				p = paragraphAligner.doAlign(this,related);
				if (p != null)
					related = p;
			}
			
		}
		return related;
	}
	
	public String getText()
	{
		return toString();
	}
	
	public void addLine( Paragraph line )
	{
		m_lines.add(line);
	}

	public void addLine( int index, Paragraph line )
	{
		m_lines.add(index,line);
		
	}

	public Paragraph addAfter( String text )
	{
		
		TextParagraph textParagraph = new TextParagraph(text,false,this);
		getM_postfix().add(textParagraph);
		return textParagraph;		
	}
	
	public Paragraph addAfter( Paragraph text )
	{
		getM_postfix().add(text);
		return text;
	}

	public Paragraph addBefore( String text, boolean updateIndent )
	{
		TextParagraph textParagraph = new TextParagraph(text,updateIndent,this);
		getM_prefix().add(textParagraph);
		return textParagraph;
		//if (updateIndent){
		//	addIndent(text.length());
		//}
	}
	
	protected int getPrefixIndent(){
		int prefixDeltaIndent = 0;
		for (Paragraph prefix : m_prefix) {
			if (prefix.shouldUpdateIndent){
				prefixDeltaIndent += prefix.getPrefixIndent();
			}
		}
		return prefixDeltaIndent;
	}
	
	public void addBefore( Paragraph text, boolean updateIndent )
	{
		getM_prefix().add(text);
		if (updateIndent){
			text.shouldUpdateIndent = updateIndent;
			//addIndent(text.makeString().length());
		}
	}
	
	public void addSpecial( String text )
	{
		m_specials.add(new TextParagraph(text, false, this));
	}
	
	public void set( int index, Paragraph text )
	{
		Paragraph old = m_lines.set(index, text);
		if (old != null){
			text.setIndent(old.indent);
		} 
	}

	public Paragraph get( int index )
	{
		if (index < 0 && m_lines.size() >= -index)
			return m_lines.get(m_lines.size() + index);
		if (index < 0 || index >= m_lines.size())
			return null;
		return m_lines.get(index);
	}

	public int size()
	{
		return m_lines.size();
	}
	
	public ArrayList<Paragraph> getLines()
	{
		return m_lines;
	}
	
	@Override
	public String toString() {
		return makeString();
	}
	
	public String makeString(){
		return makeString(0);
	}

	public void constructLinking(){
		for (Paragraph paragraph : m_prefix) {
			paragraph.constructLinking();
		}
		for (Paragraph paragraph : m_lines) {
			paragraph.constructLinking();
		}
		for (Paragraph paragraph : m_postfix) {
			paragraph.constructLinking();
		}
	}
	public String makeString(int globalIndent){
		globalIndent += getPrefixIndent();
		if (m_lines.isEmpty())
			return getPrefixString(globalIndent) + getPostfixString(globalIndent);
		StringBuilder textBuilder = new StringBuilder();
		textBuilder.append(getPrefixString(globalIndent));
	
		textBuilder.append(m_lines.get(0).makeString(globalIndent + indent));
		Paragraph prevParagraph = m_lines.get(0);
		for (int i = 1; i < m_lines.size(); i++) {
			Paragraph paragraph = m_lines.get(i);
			String line = paragraph.makeString(globalIndent + indent);
			if (line.isEmpty())
				continue;
			if (prevParagraph.endsWithNewline())
				textBuilder.append(getIndentString(globalIndent));
			prevParagraph = paragraph;
			textBuilder.append(line);
		}
		if (!m_specials.isEmpty()){
			foundSpecials.addAll(m_specials);
		}
		textBuilder.append(getPostfixString(globalIndent));
		String result = textBuilder.toString();
		
		return result;
	}
	
	public void addIndent(int addedIndent){
		indent += addedIndent;
	}
	public void setIndent(int addedIndent){
		indent = addedIndent;
	}
	
	protected String getIndentString(int globalIndent){
		return StringUtils.repeatString(" ", indent + globalIndent);
	}
	
	protected String getPrefixString(int globalIndent){
		StringBuilder result = new StringBuilder();
		for (Paragraph prefix : getM_prefix()) {
			result.append(prefix.makeString(globalIndent));
		}
		return result.toString();
	}
	
	protected String getPostfixString(int globalIndent){
		StringBuilder result = new StringBuilder();
		for (Paragraph postfix : getM_postfix()) {
			result.append(postfix.makeString(globalIndent));
		}
		return result.toString();
	}


	public ArrayList<Paragraph> getM_prefix() {
		return m_prefix;
	}


	public void setM_prefix(ArrayList<Paragraph> m_prefix) {
		this.m_prefix = m_prefix;
	}


	public ArrayList<Paragraph> getM_postfix() {
		return m_postfix;
	}


	public void setM_postfix(ArrayList<Paragraph> m_postfix) {
		this.m_postfix = m_postfix;
	}
	
	public boolean suppressNewLine(){
		for (Iterator<Paragraph> iterator = m_lines.iterator(); iterator.hasNext();) {
			Paragraph paragraph = iterator.next();
			if (paragraph.suppressNewLine()) {
				iterator.remove();
			}
		}
		for (Iterator<Paragraph> iterator = m_prefix.iterator(); iterator.hasNext();) {
			Paragraph paragraph = iterator.next();
			if (paragraph.suppressNewLine()) {
				iterator.remove();
			}
		}
		for (Iterator<Paragraph> iterator = m_postfix.iterator(); iterator.hasNext();) {
			Paragraph paragraph = iterator.next();
			if (paragraph.suppressNewLine()) {
				iterator.remove();
			}
		}
		return false;
	}
	
	public boolean endsWithNewline(){
		for (Iterator<Paragraph> iterator = m_postfix.iterator(); iterator.hasNext();) {
			Paragraph paragraph = iterator.next();
			if (paragraph.endsWithNewline()) {
				return true;
			}
		}
		if (!m_lines.isEmpty()){
			
			for (Iterator<Paragraph> iterator = m_lines.get(m_lines.size() - 1).m_postfix.iterator(); iterator.hasNext();) {
				Paragraph paragraph = iterator.next();
				if (paragraph.endsWithNewline()) {
					return true;
				}
			}
		}
		return false;
		
	}
	public boolean hasNewline(){
		for (Iterator<Paragraph> iterator = m_lines.iterator(); iterator.hasNext();) {
			Paragraph paragraph = iterator.next();
			if (paragraph.hasNewline()) {
				return true;
			}
		}
		for (Iterator<Paragraph> iterator = m_prefix.iterator(); iterator.hasNext();) {
			Paragraph paragraph = iterator.next();
			if (paragraph.hasNewline()) {
				return true;
			}
		}
		for (Iterator<Paragraph> iterator = m_postfix.iterator(); iterator.hasNext();) {
			Paragraph paragraph = iterator.next();
			if (paragraph.hasNewline()) {
				return true;
			}
		}
		return false;
		
	}
	public void adjustToWidth(int maxLength){
		
	}


	public void addNewLine() {
		addAfter(TextParagraph.createNewLinePargraph(this));		
	}
	
	public Paragraph linkPrefixParagraphs(String pattern,int depth,Paragraph related,boolean ignoreLinked,boolean alignAfter) {
		Paragraph firstLink = related;
		for (Paragraph paragraph : m_prefix) {
			if (paragraph.shouldLink(pattern)){
				if (firstLink == null){
					firstLink = paragraph;
				} else {
					link(firstLink,paragraph,ignoreLinked,alignAfter);
				}
			}
		}
		if (related == null){
			if (!ignoreLinked || !isLinked(firstLink))
				related = firstLink;
		} 
		if (depth != 0){
			for (Paragraph paragraph : m_lines) {
				Paragraph linkPrefixParagraphs = paragraph.linkPrefixParagraphs(pattern, depth - 1, related,ignoreLinked,alignAfter);
				if (related == null){
					related = linkPrefixParagraphs;
				} else {
					if (linkPrefixParagraphs != null){
						link(related,linkPrefixParagraphs,ignoreLinked,alignAfter);
					}
				}
			}
			if (related != null)
				firstLink = related;
		}
		return firstLink;
	}
	public Paragraph linkPostParagraphs(String pattern,int depth,Paragraph related,boolean ignoreLinked,boolean alignAfter) {
		Paragraph firstLink = related;
		for (Paragraph paragraph : m_postfix) {
			if (paragraph.shouldLink(pattern)){
				if (firstLink == null){
					firstLink = paragraph;
				} else {
					link(firstLink,paragraph,ignoreLinked,alignAfter);
				}
			}
		}
		if (related == null){
			if (!ignoreLinked || !isLinked(firstLink))
				related = firstLink;
		} 
		if (depth != 0){
			for (Paragraph paragraph : m_lines) {
				Paragraph linkPrefixParagraphs = paragraph.linkPostParagraphs(pattern, depth - 1, related,ignoreLinked,alignAfter);
				if (related == null){
					related = linkPrefixParagraphs;
				} else {
					if (linkPrefixParagraphs != null){
						link(related,linkPrefixParagraphs,ignoreLinked,alignAfter);
					}
				}
			}
			if (related != null)
				firstLink = related;
		}
		return firstLink;
	}	
	public Paragraph linkLineParagraphs(String pattern,int depth,Paragraph related,boolean ignoreLinked,boolean alignAfter) {
		Paragraph firstLink = related;
		for (Paragraph paragraph : m_lines) {
			if (paragraph.shouldLink(pattern)){
				if (firstLink == null){
					firstLink = paragraph;
				} else {
					link(firstLink,paragraph,ignoreLinked,alignAfter);
				}
			}
		}
		if (related == null){
			if (!ignoreLinked || !isLinked(firstLink))
				related = firstLink;
		} 
		if (depth != 0){
			for (Paragraph paragraph : m_lines) {
				Paragraph linkPrefixParagraphs = paragraph.linkLineParagraphs(pattern, depth - 1, related,ignoreLinked,alignAfter);
				if (related == null){
					related = linkPrefixParagraphs;
				} else {
					if (linkPrefixParagraphs != null){
						link(related,linkPrefixParagraphs,ignoreLinked,alignAfter);
					}
				}
			}
			if (related != null)
				firstLink = related;
		}
		return firstLink;
	}	
	
	public void fixLinkage(String pattern) {
		for (Paragraph paragraph : m_prefix) {
			paragraph.fixLinkage(pattern);
		}
		for (Paragraph paragraph : m_lines) {
			paragraph.fixLinkage(pattern);
		}
		for (Paragraph paragraph : m_postfix) {
			paragraph.fixLinkage(pattern);
		}
		return;
	}
	
	public boolean shouldLink(String pattern){
		return false;
	}
	protected static boolean isLinked(Paragraph p){
		return p != null && !p.currentID.isEmpty() && !p.isFixed();
	}
	protected static Paragraph link(Paragraph orig,Paragraph link,boolean ignoreLinked,boolean alignAfter){
		if (ignoreLinked && isLinked(link))
			return null;
		orig.m_linked.add(link);
		orig.m_linked.add(orig);
		if(link.m_linked != orig.m_linked){
			for (Paragraph p : link.m_linked) {
				p.m_linked = orig.m_linked;
				p.addAlignmentAfterwards = alignAfter;
			}
			for (Paragraph p : orig.m_linked) {
				p.m_linked = orig.m_linked;
				p.addAlignmentAfterwards = alignAfter;
			}
			link.m_linked = orig.m_linked;
			link.addAlignmentAfterwards = alignAfter;
		}
		orig.addAlignmentAfterwards = alignAfter;
		return orig;
	}
	protected String buildAlignedString(String unalignedString,int globalIndent){
		while (true){
			String[] lines = unalignedString.split("\n",Integer.MAX_VALUE);
			LinkedHashSet<String> workList = new LinkedHashSet<String>();
			HashMap<String,LinkedHashMultimap<Integer, Integer>> lineOffsetMap = new HashMap<String,LinkedHashMultimap<Integer, Integer>>();
			Pattern idPattern = Pattern.compile(getIDPattern());
			for (int lineIdx = 0; lineIdx < lines.length; lineIdx++) {
				int deltaOffset = 0;
				String line = lines[lineIdx];
				Matcher matcher = idPattern.matcher(line);
				while(matcher.find()){
					String id = matcher.group(1);
					if (!workList.contains(id))
						workList.add(id);
					int realOffset = matcher.start(1) - deltaOffset;
					int length = id.length();
					LinkedHashMultimap<Integer, Integer> lineOffsets = lineOffsetMap.get(id);
					if (lineOffsets == null){
						lineOffsets = LinkedHashMultimap.create();
						lineOffsetMap.put(id, lineOffsets);
					}
					lineOffsets.put(lineIdx, realOffset);
					deltaOffset += length;
				}
			}
			if (!workList.isEmpty()){
				//this.toString();
				String id = null;//
				int lowestMaxOffset = Integer.MAX_VALUE;
				for (Entry<String, LinkedHashMultimap<Integer, Integer>> entry : lineOffsetMap.entrySet()) {
					List<Integer> values = new ArrayList<Integer>(entry.getValue().values());
					Collections.sort(values);
					int maxOffset = values.get(0);
					if (maxOffset < lowestMaxOffset){
						lowestMaxOffset = maxOffset;
						id = entry.getKey();
					}

				}
				LinkedHashMultimap<Integer, Integer> offsets = lineOffsetMap.get(id);
				ArrayList<Integer> maxOffsetList = new ArrayList<Integer>();
				ArrayList<Integer> offsetList = new ArrayList<Integer>();
				for (Integer line : offsets.keySet()) {
					Set<Integer> offsetValues = offsets.get(line);
					Integer[] sortedOffsets = offsetValues.toArray(new Integer[0]);
					Arrays.sort(sortedOffsets);
					offsetList.add(null);
					for (int i = 0; i < sortedOffsets.length; i++) {
						offsetList.add(sortedOffsets[i]);
						if (i >= maxOffsetList.size()){
							maxOffsetList.add(sortedOffsets[i]);
						} else if (maxOffsetList.get(i) < sortedOffsets[i]){
							maxOffsetList.set(i, sortedOffsets[i]);
						}
					}
				}
				List<Paragraph> m_linked2 = new ArrayList<Paragraph>(idMap.get(id).m_linked);
				Collections.sort(m_linked2,new Comparator<Paragraph>() {
					@Override
					public int compare(Paragraph o1, Paragraph o2) {
						// TODO Auto-generated method stub
						return o1.getOrder() - o2.getOrder();
					}
				});
				int i = 0;
				int maxOffsetIdx = 0;

				for (Paragraph paragraph : m_linked2) {
//					for (Paragraph p : paragraph.m_linked) {
//						System.out.println(p);
//					}
					if (!(paragraph instanceof TextParagraph))
						paragraph.currentID = "";
					if (paragraph.currentID.equals(id)){
						Integer currentOffset = offsetList.get(i);
						while (currentOffset == null){
							maxOffsetIdx = 0;
							i++;
							currentOffset = offsetList.get(i);
						}
						if (currentOffset < maxOffsetList.get(maxOffsetIdx)){
							int deltaOffset = maxOffsetList.get(maxOffsetIdx) - currentOffset;
							paragraph.addBefore(StringUtils.repeatString(" ", deltaOffset), true);
							for (int j = i + 1; j < offsetList.size(); j++) {
								Integer integer = offsetList.get(j);
								if (integer == null)
									break;
								offsetList.set(j, integer + deltaOffset); 

							}
						}
						paragraph.currentID = "";//"{"+id.substring(3, id.length()-3)+"-"+i+"-"+currentOffset+"}";
						maxOffsetIdx++;

						i++;
					}
				}
				unalignedString = this.makeString(globalIndent);
			} else {
				return this.makeString(globalIndent);
			}		
		}
		
	}
	public String makeAlignedString(int globalIndent){
		this.currentID = "";
		for (Paragraph prefix : m_prefix) {
			prefix.currentID = "";
		}
		String tempResult = this.makeString(globalIndent);
		
		return buildAlignedString(tempResult,globalIndent);
	}
	public int getOrder(){
		return order;
	}
	
	public int buildOrder(int parentOrder){
		for (Paragraph prefix : m_prefix) {
			parentOrder = prefix.buildOrder(parentOrder);
			parentOrder++;
		}
		order = parentOrder;
		parentOrder++;
		for (Paragraph prefix : m_lines) {
			parentOrder = prefix.buildOrder(parentOrder);
			parentOrder++;
		}
		for (Paragraph prefix : m_postfix) {
			parentOrder = prefix.buildOrder(parentOrder);
			parentOrder++;
		}
		return parentOrder;
	}
	
	public boolean isFixed() {
		return false;
	}

	public Map<Object,Object> getSpecialRegistry() {
		return specialRegistry;
	}

	public void setSpecialRegistry(Map<Object,Object> specialRegistry) {
		this.specialRegistry = specialRegistry;
	}
}
