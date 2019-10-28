package com.astra.ses.spell.language.beautifier;

import java.util.regex.Pattern;

public class TextParagraph extends Paragraph {

	
	protected String text = "";
	private boolean newLine = false;
	private boolean fixed = false;
	
	public TextParagraph(String text,boolean shouldUpdateIndent,Paragraph parent)
	{
		super(parent);
		this.shouldUpdateIndent  = shouldUpdateIndent;
		this.text = text;
	}
	
	public static TextParagraph createNewLinePargraph(Paragraph parent){
		TextParagraph textParagraph = new TextParagraph("\n", false,parent);
		textParagraph.setNewLine(true);
		return textParagraph;
	}
	
	@Override
	public void constructLinking(){
		if (!m_linked.isEmpty() && currentID.isEmpty() && !fixed){
			int amount = 0;
			for (Paragraph paragraph : m_linked) {
				if (paragraph instanceof TextParagraph)
					amount++;
			}
			if (amount < 2){
				m_linked.clear();
				return;
			}
			currentID = buildID(latestID[0]);
			latestID[0]++;
			Paragraph put = idMap.put(currentID, this);
			if (put != null){
				this.m_linked.addAll(put.m_linked);
				this.m_linked.add(put);
				put.m_linked = this.m_linked;
				
			}
			outer: while (true){
				for (Paragraph paragraph : m_linked) {
					if (paragraph instanceof TextParagraph)
						paragraph.currentID = currentID;
					if (paragraph.m_linked != this.m_linked){
						for (Paragraph p : paragraph.m_linked) {
							if (p.currentID != currentID){
								p.currentID = currentID;
								m_linked.add(p);
								p.m_linked = m_linked;
								continue outer;
							}
						}
						
					}
				}
				break;
			}
		}
		super.constructLinking();
	}
	@Override
	protected int getPrefixIndent(){
		String[] split = text.split("\n",20000);
		StringBuilder textBuilder = new StringBuilder();
		textBuilder.append(getPrefixString(0));
		if (split.length > 0)
			textBuilder.append(split[0]);
		
		String indent = getIndentString(0);
		for (int i = 1; i < split.length; i++) {
			textBuilder.append("\n");
			if (split[i].isEmpty())
				continue;
			textBuilder.append(indent);
			textBuilder.append(split[i]);
			
		}
		textBuilder.append(getPostfixString(0));
		return textBuilder.toString().length();
	}
	
	@Override
	public String makeString(int globalIndent) {
		
		
		String[] split = text.split("\n",20000);
		StringBuilder textBuilder = new StringBuilder();
		if (text.equals("\n") && !foundSpecials.isEmpty()){
			for (Paragraph special : foundSpecials) {
				textBuilder.append(" ");
				textBuilder.append(special.makeString());
			}
			foundSpecials.clear();
		}
		textBuilder.append(getPrefixString(globalIndent));
//		if (fixed)
//			textBuilder.append("<!>");
		if (split.length > 0)
			textBuilder.append(split[0]);
		
		String indent = getIndentString(globalIndent);
		for (int i = 1; i < split.length; i++) {
			textBuilder.append("\n");
			if (split[i].isEmpty())
				continue;
			textBuilder.append(indent);
			textBuilder.append(split[i]);
			
		}
		textBuilder.append(getPostfixString(globalIndent));
		//if (addAlignmentAfterwards)
		//	return textBuilder.toString() + currentID;
		//else
		return currentID + textBuilder.toString();
	}
	
	@Override
	public boolean suppressNewLine() {
		if (newLine)
			return true;
		return super.suppressNewLine();
	}
	
	public boolean hasNewline(){
		if (newLine)
			return true;
		else 
			return super.hasNewline();
	}
	public boolean endsWithNewline(){
		if (newLine)
			return true;
		else 
			return super.endsWithNewline();
	}
	
	@Override
	public void fixLinkage(String pattern) {
		if (fixed)
			return;
		fixed = shouldLink(pattern);
		super.fixLinkage(pattern);
	}
	
	@Override
	public boolean shouldLink(String pattern){
		if (fixed)
			return false;
		if (text.endsWith("\n")){
			return text.trim().matches(".*" + pattern + ".*");
		} else {
			return text.matches(".*" + pattern + ".*");
		}
		
	}
	public boolean isNewLine() {
		return newLine;
	}
	public void setNewLine(boolean newLine) {
		this.newLine = newLine;
	}
	
	@Override
	public boolean isFixed() {
		// TODO Auto-generated method stub
		return fixed;
	}
	
}