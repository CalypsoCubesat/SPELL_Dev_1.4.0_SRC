package lu.ses.engineering.spell.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class SpellHighlightingConfiguration extends DefaultHighlightingConfiguration {

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
		acceptor.acceptDefaultHighlighting(PUNCTUATION_ID, "Punctuation character", punctuationTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle());
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());		
		acceptor.acceptDefaultHighlighting("KEY_NAME", "Dictionary Key values", boldTextStyle());		
		acceptor.acceptDefaultHighlighting("TM_VALUE", "TM values", tmTextStyle());		
		acceptor.acceptDefaultHighlighting("TC_VALUE", "TC values", tcTextStyle());		
		
		
	}
	
	@Override
	public TextStyle numberTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(125, 125, 125));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	

	public TextStyle boldTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 0, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle tmTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 128, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle tcTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 128, 128));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	
	
}
