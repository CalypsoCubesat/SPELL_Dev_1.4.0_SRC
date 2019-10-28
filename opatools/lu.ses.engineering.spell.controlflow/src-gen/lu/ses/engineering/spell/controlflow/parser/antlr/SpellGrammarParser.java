/*
 * generated by Xtext
 */
package lu.ses.engineering.spell.controlflow.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import lu.ses.engineering.spell.controlflow.services.SpellGrammarGrammarAccess;

public class SpellGrammarParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SpellGrammarGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected lu.ses.engineering.spell.controlflow.parser.antlr.internal.InternalSpellGrammarParser createParser(XtextTokenStream stream) {
		return new lu.ses.engineering.spell.controlflow.parser.antlr.internal.InternalSpellGrammarParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "file_input";
	}
	
	public SpellGrammarGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SpellGrammarGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
