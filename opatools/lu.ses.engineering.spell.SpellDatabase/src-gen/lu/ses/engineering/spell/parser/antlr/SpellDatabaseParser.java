/*
 * generated by Xtext
 */
package lu.ses.engineering.spell.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import lu.ses.engineering.spell.services.SpellDatabaseGrammarAccess;

public class SpellDatabaseParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SpellDatabaseGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected lu.ses.engineering.spell.parser.antlr.internal.InternalSpellDatabaseParser createParser(XtextTokenStream stream) {
		return new lu.ses.engineering.spell.parser.antlr.internal.InternalSpellDatabaseParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "SpellDatabase";
	}
	
	public SpellDatabaseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SpellDatabaseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
