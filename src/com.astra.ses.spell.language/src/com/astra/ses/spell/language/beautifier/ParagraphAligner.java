package com.astra.ses.spell.language.beautifier;

public abstract class ParagraphAligner {
	protected ParagraphAligner next;
	public ParagraphAligner getNext(){
		return this.next;
	}
	public ParagraphAligner setNext(ParagraphAligner next){
		return this.next = next;
	}
	public abstract Paragraph doAlign(Paragraph source,Paragraph related);
}