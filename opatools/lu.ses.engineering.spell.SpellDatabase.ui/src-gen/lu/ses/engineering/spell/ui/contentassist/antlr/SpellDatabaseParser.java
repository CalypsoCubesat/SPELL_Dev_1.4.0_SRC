/*
 * generated by Xtext
 */
package lu.ses.engineering.spell.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import lu.ses.engineering.spell.services.SpellDatabaseGrammarAccess;

public class SpellDatabaseParser extends AbstractContentAssistParser {
	
	@Inject
	private SpellDatabaseGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected lu.ses.engineering.spell.ui.contentassist.antlr.internal.InternalSpellDatabaseParser createParser() {
		lu.ses.engineering.spell.ui.contentassist.antlr.internal.InternalSpellDatabaseParser result = new lu.ses.engineering.spell.ui.contentassist.antlr.internal.InternalSpellDatabaseParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSpellDatabaseAccess().getAlternatives_1(), "rule__SpellDatabase__Alternatives_1");
					put(grammarAccess.getAstriumVariableEntryAccess().getAlternatives(), "rule__AstriumVariableEntry__Alternatives");
					put(grammarAccess.getAstriumVariableEntryAccess().getAlternatives_1_5(), "rule__AstriumVariableEntry__Alternatives_1_5");
					put(grammarAccess.getAstriumHeaderEntryAccess().getAlternatives(), "rule__AstriumHeaderEntry__Alternatives");
					put(grammarAccess.getAstriumHeaderEntryAccess().getAlternatives_1_4(), "rule__AstriumHeaderEntry__Alternatives_1_4");
					put(grammarAccess.getSkipNLAndCommentsAccess().getAlternatives(), "rule__SkipNLAndComments__Alternatives");
					put(grammarAccess.getCSVEntryAccess().getAlternatives(), "rule__CSVEntry__Alternatives");
					put(grammarAccess.getTCValueAccess().getAlternatives(), "rule__TCValue__Alternatives");
					put(grammarAccess.getKeyValueAccess().getAlternatives(), "rule__KeyValue__Alternatives");
					put(grammarAccess.getSpellCommandAccess().getAlternatives(), "rule__SpellCommand__Alternatives");
					put(grammarAccess.getIntOrFloatAccess().getAlternatives(), "rule__IntOrFloat__Alternatives");
					put(grammarAccess.getPosIntOrFloatAccess().getAlternatives(), "rule__PosIntOrFloat__Alternatives");
					put(grammarAccess.getDatabaseValueAccess().getAlternatives(), "rule__DatabaseValue__Alternatives");
					put(grammarAccess.getLambda_Partial_FuncAccess().getAlternatives(), "rule__Lambda_Partial_Func__Alternatives");
					put(grammarAccess.getLambda_Partial_FuncAccess().getAlternatives_0(), "rule__Lambda_Partial_Func__Alternatives_0");
					put(grammarAccess.getComplexValueAccess().getAlternatives(), "rule__ComplexValue__Alternatives");
					put(grammarAccess.getTupleAccess().getValuesAlternatives_2_1_0(), "rule__Tuple__ValuesAlternatives_2_1_0");
					put(grammarAccess.getTupleAccess().getValuesAlternatives_2_3_2_0(), "rule__Tuple__ValuesAlternatives_2_3_2_0");
					put(grammarAccess.getListAccess().getValuesAlternatives_2_1_0(), "rule__List__ValuesAlternatives_2_1_0");
					put(grammarAccess.getListAccess().getValuesAlternatives_2_3_2_0(), "rule__List__ValuesAlternatives_2_3_2_0");
					put(grammarAccess.getDictionaryEntryAccess().getKeyAlternatives_0_0(), "rule__DictionaryEntry__KeyAlternatives_0_0");
					put(grammarAccess.getDictionaryEntryAccess().getValueAlternatives_2_2_0(), "rule__DictionaryEntry__ValueAlternatives_2_2_0");
					put(grammarAccess.getAtomAccess().getAlternatives(), "rule__Atom__Alternatives");
					put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
					put(grammarAccess.getFLOAT_ValAccess().getAlternatives_0(), "rule__FLOAT_Val__Alternatives_0");
					put(grammarAccess.getRELTIMEAccess().getAlternatives_1(), "rule__RELTIME__Alternatives_1");
					put(grammarAccess.getABSTIMEAccess().getAlternatives(), "rule__ABSTIME__Alternatives");
					put(grammarAccess.getABSTIMEAccess().getAlternatives_0_0_2(), "rule__ABSTIME__Alternatives_0_0_2");
					put(grammarAccess.getABSTIMEAccess().getAlternatives_0_1(), "rule__ABSTIME__Alternatives_0_1");
					put(grammarAccess.getABSTIMEAccess().getAlternatives_1_0_2(), "rule__ABSTIME__Alternatives_1_0_2");
					put(grammarAccess.getABSTIMEAccess().getAlternatives_1_1(), "rule__ABSTIME__Alternatives_1_1");
					put(grammarAccess.getSINGLE_VALUEAccess().getAlternatives(), "rule__SINGLE_VALUE__Alternatives");
					put(grammarAccess.getID_STMTAccess().getAlternatives_1(), "rule__ID_STMT__Alternatives_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives_0(), "rule__INTEGER__Alternatives_0");
					put(grammarAccess.getSpellDatabaseAccess().getGroup(), "rule__SpellDatabase__Group__0");
					put(grammarAccess.getSpellDatabaseAccess().getGroup_1_0(), "rule__SpellDatabase__Group_1_0__0");
					put(grammarAccess.getSpellDatabaseAccess().getGroup_1_1(), "rule__SpellDatabase__Group_1_1__0");
					put(grammarAccess.getSpellDatabaseAccess().getGroup_1_1_1(), "rule__SpellDatabase__Group_1_1_1__0");
					put(grammarAccess.getSpellDatabaseAccess().getGroup_1_1_1_1(), "rule__SpellDatabase__Group_1_1_1_1__0");
					put(grammarAccess.getSpellDatabaseAccess().getGroup_1_2(), "rule__SpellDatabase__Group_1_2__0");
					put(grammarAccess.getSpellDatabaseAccess().getGroup_1_2_3(), "rule__SpellDatabase__Group_1_2_3__0");
					put(grammarAccess.getAstriumDatabaseAccess().getGroup(), "rule__AstriumDatabase__Group__0");
					put(grammarAccess.getAstriumDatabaseAccess().getGroup_1(), "rule__AstriumDatabase__Group_1__0");
					put(grammarAccess.getAstriumDatabaseAccess().getGroup_4(), "rule__AstriumDatabase__Group_4__0");
					put(grammarAccess.getAstriumVariableEntryAccess().getGroup_0(), "rule__AstriumVariableEntry__Group_0__0");
					put(grammarAccess.getAstriumVariableEntryAccess().getGroup_1(), "rule__AstriumVariableEntry__Group_1__0");
					put(grammarAccess.getAstriumHeaderEntryAccess().getGroup_0(), "rule__AstriumHeaderEntry__Group_0__0");
					put(grammarAccess.getAstriumHeaderEntryAccess().getGroup_1(), "rule__AstriumHeaderEntry__Group_1__0");
					put(grammarAccess.getSkipNLAndComments2Access().getGroup(), "rule__SkipNLAndComments2__Group__0");
					put(grammarAccess.getCSVCommandAccess().getGroup(), "rule__CSVCommand__Group__0");
					put(grammarAccess.getCSVCommandAccess().getGroup_3(), "rule__CSVCommand__Group_3__0");
					put(grammarAccess.getCSVCommandAccess().getGroup_3_2(), "rule__CSVCommand__Group_3_2__0");
					put(grammarAccess.getCSVCommandAccess().getGroup_3_2_0(), "rule__CSVCommand__Group_3_2_0__0");
					put(grammarAccess.getTCArgsAccess().getGroup(), "rule__TCArgs__Group__0");
					put(grammarAccess.getTCArgsAccess().getGroup_5(), "rule__TCArgs__Group_5__0");
					put(grammarAccess.getTCArgsAccess().getGroup_5_0(), "rule__TCArgs__Group_5_0__0");
					put(grammarAccess.getCSVTelemetryAccess().getGroup(), "rule__CSVTelemetry__Group__0");
					put(grammarAccess.getCSVSpellAccess().getGroup(), "rule__CSVSpell__Group__0");
					put(grammarAccess.getSpellCommandAccess().getGroup_0(), "rule__SpellCommand__Group_0__0");
					put(grammarAccess.getSpellCommandAccess().getGroup_1(), "rule__SpellCommand__Group_1__0");
					put(grammarAccess.getDatabaseEntryAccess().getGroup(), "rule__DatabaseEntry__Group__0");
					put(grammarAccess.getLambda_StmtAccess().getGroup(), "rule__Lambda_Stmt__Group__0");
					put(grammarAccess.getLambda_Partial_FuncAccess().getGroup_1(), "rule__Lambda_Partial_Func__Group_1__0");
					put(grammarAccess.getLambda_VarsAccess().getGroup(), "rule__Lambda_Vars__Group__0");
					put(grammarAccess.getLambda_VarsAccess().getGroup_1(), "rule__Lambda_Vars__Group_1__0");
					put(grammarAccess.getTupleAccess().getGroup(), "rule__Tuple__Group__0");
					put(grammarAccess.getTupleAccess().getGroup_2(), "rule__Tuple__Group_2__0");
					put(grammarAccess.getTupleAccess().getGroup_2_3(), "rule__Tuple__Group_2_3__0");
					put(grammarAccess.getListAccess().getGroup(), "rule__List__Group__0");
					put(grammarAccess.getListAccess().getGroup_2(), "rule__List__Group_2__0");
					put(grammarAccess.getListAccess().getGroup_2_3(), "rule__List__Group_2_3__0");
					put(grammarAccess.getDictionaryAccess().getGroup(), "rule__Dictionary__Group__0");
					put(grammarAccess.getDictionaryAccess().getGroup_2(), "rule__Dictionary__Group_2__0");
					put(grammarAccess.getDictionaryAccess().getGroup_2_3(), "rule__Dictionary__Group_2_3__0");
					put(grammarAccess.getDictionaryEntryAccess().getGroup(), "rule__DictionaryEntry__Group__0");
					put(grammarAccess.getDictionaryEntryAccess().getGroup_2(), "rule__DictionaryEntry__Group_2__0");
					put(grammarAccess.getFLOAT_ValAccess().getGroup(), "rule__FLOAT_Val__Group__0");
					put(grammarAccess.getSkipped_NLAccess().getGroup(), "rule__Skipped_NL__Group__0");
					put(grammarAccess.getRELTIMEAccess().getGroup(), "rule__RELTIME__Group__0");
					put(grammarAccess.getRELTIMEAccess().getGroup_1_0(), "rule__RELTIME__Group_1_0__0");
					put(grammarAccess.getRELTIMEAccess().getGroup_1_1(), "rule__RELTIME__Group_1_1__0");
					put(grammarAccess.getABSTIMEAccess().getGroup_0(), "rule__ABSTIME__Group_0__0");
					put(grammarAccess.getABSTIMEAccess().getGroup_0_0(), "rule__ABSTIME__Group_0_0__0");
					put(grammarAccess.getABSTIMEAccess().getGroup_0_2(), "rule__ABSTIME__Group_0_2__0");
					put(grammarAccess.getABSTIMEAccess().getGroup_0_2_3(), "rule__ABSTIME__Group_0_2_3__0");
					put(grammarAccess.getABSTIMEAccess().getGroup_1(), "rule__ABSTIME__Group_1__0");
					put(grammarAccess.getABSTIMEAccess().getGroup_1_0(), "rule__ABSTIME__Group_1_0__0");
					put(grammarAccess.getABSTIMEAccess().getGroup_1_2(), "rule__ABSTIME__Group_1_2__0");
					put(grammarAccess.getABSTIMEAccess().getGroup_1_2_3(), "rule__ABSTIME__Group_1_2_3__0");
					put(grammarAccess.getID_STMTAccess().getGroup(), "rule__ID_STMT__Group__0");
					put(grammarAccess.getASTRIUM_IDAccess().getGroup(), "rule__ASTRIUM_ID__Group__0");
					put(grammarAccess.getASTRIUM_TIMEAccess().getGroup(), "rule__ASTRIUM_TIME__Group__0");
					put(grammarAccess.getASTRIUM_TIMEAccess().getGroup_0(), "rule__ASTRIUM_TIME__Group_0__0");
					put(grammarAccess.getASTRIUM_TIMEAccess().getGroup_0_0(), "rule__ASTRIUM_TIME__Group_0_0__0");
					put(grammarAccess.getINTEGERAccess().getGroup(), "rule__INTEGER__Group__0");
					put(grammarAccess.getSpellDatabaseAccess().getDatabaseAssignment_1_0_3(), "rule__SpellDatabase__DatabaseAssignment_1_0_3");
					put(grammarAccess.getSpellDatabaseAccess().getDatabaseEntryAssignment_1_1_1_0(), "rule__SpellDatabase__DatabaseEntryAssignment_1_1_1_0");
					put(grammarAccess.getSpellDatabaseAccess().getDatabaseEntryAssignment_1_1_1_1_1(), "rule__SpellDatabase__DatabaseEntryAssignment_1_1_1_1_1");
					put(grammarAccess.getSpellDatabaseAccess().getCsvEntriesAssignment_1_2_1(), "rule__SpellDatabase__CsvEntriesAssignment_1_2_1");
					put(grammarAccess.getSpellDatabaseAccess().getCsvEntriesAssignment_1_2_3_1(), "rule__SpellDatabase__CsvEntriesAssignment_1_2_3_1");
					put(grammarAccess.getAstriumDatabaseAccess().getEntriesAssignment_1_0(), "rule__AstriumDatabase__EntriesAssignment_1_0");
					put(grammarAccess.getAstriumDatabaseAccess().getEntriesAssignment_4_0(), "rule__AstriumDatabase__EntriesAssignment_4_0");
					put(grammarAccess.getAstriumVariableEntryAccess().getCommentAssignment_0_1(), "rule__AstriumVariableEntry__CommentAssignment_0_1");
					put(grammarAccess.getAstriumVariableEntryAccess().getNameAssignment_1_2(), "rule__AstriumVariableEntry__NameAssignment_1_2");
					put(grammarAccess.getAstriumVariableEntryAccess().getAstriumTimeAssignment_1_5_0(), "rule__AstriumVariableEntry__AstriumTimeAssignment_1_5_0");
					put(grammarAccess.getAstriumVariableEntryAccess().getValueAssignment_1_5_1(), "rule__AstriumVariableEntry__ValueAssignment_1_5_1");
					put(grammarAccess.getAstriumVariableEntryAccess().getSimpleValueAssignment_1_5_2(), "rule__AstriumVariableEntry__SimpleValueAssignment_1_5_2");
					put(grammarAccess.getAstriumHeaderEntryAccess().getCommentAssignment_0_1(), "rule__AstriumHeaderEntry__CommentAssignment_0_1");
					put(grammarAccess.getAstriumHeaderEntryAccess().getNameAssignment_1_1(), "rule__AstriumHeaderEntry__NameAssignment_1_1");
					put(grammarAccess.getAstriumHeaderEntryAccess().getAstriumTimeAssignment_1_4_0(), "rule__AstriumHeaderEntry__AstriumTimeAssignment_1_4_0");
					put(grammarAccess.getAstriumHeaderEntryAccess().getValueAssignment_1_4_1(), "rule__AstriumHeaderEntry__ValueAssignment_1_4_1");
					put(grammarAccess.getAstriumHeaderEntryAccess().getSimpleValueAssignment_1_4_2(), "rule__AstriumHeaderEntry__SimpleValueAssignment_1_4_2");
					put(grammarAccess.getCSVCommandAccess().getCommandAssignment_2(), "rule__CSVCommand__CommandAssignment_2");
					put(grammarAccess.getCSVCommandAccess().getArgsAssignment_3_1(), "rule__CSVCommand__ArgsAssignment_3_1");
					put(grammarAccess.getCSVCommandAccess().getArgsAssignment_3_2_0_3(), "rule__CSVCommand__ArgsAssignment_3_2_0_3");
					put(grammarAccess.getTCArgsAccess().getTcNameAssignment_0(), "rule__TCArgs__TcNameAssignment_0");
					put(grammarAccess.getTCArgsAccess().getTcValueAssignment_2(), "rule__TCArgs__TcValueAssignment_2");
					put(grammarAccess.getTCArgsAccess().getTcModAssignment_4(), "rule__TCArgs__TcModAssignment_4");
					put(grammarAccess.getTCArgsAccess().getToleranceAssignment_5_0_1(), "rule__TCArgs__ToleranceAssignment_5_0_1");
					put(grammarAccess.getCSVTelemetryAccess().getTmArgAssignment_3(), "rule__CSVTelemetry__TmArgAssignment_3");
					put(grammarAccess.getCSVSpellAccess().getCmdAssignment_2(), "rule__CSVSpell__CmdAssignment_2");
					put(grammarAccess.getSpellCommandAccess().getValueAssignment_0_3(), "rule__SpellCommand__ValueAssignment_0_3");
					put(grammarAccess.getSpellCommandAccess().getUnitAssignment_0_5(), "rule__SpellCommand__UnitAssignment_0_5");
					put(grammarAccess.getDatabaseEntryAccess().getNameAssignment_0(), "rule__DatabaseEntry__NameAssignment_0");
					put(grammarAccess.getDatabaseEntryAccess().getValueAssignment_4(), "rule__DatabaseEntry__ValueAssignment_4");
					put(grammarAccess.getLambda_StmtAccess().getVariablesAssignment_2(), "rule__Lambda_Stmt__VariablesAssignment_2");
					put(grammarAccess.getLambda_StmtAccess().getValAssignment_4(), "rule__Lambda_Stmt__ValAssignment_4");
					put(grammarAccess.getTupleAccess().getValuesAssignment_2_1(), "rule__Tuple__ValuesAssignment_2_1");
					put(grammarAccess.getTupleAccess().getValuesAssignment_2_3_2(), "rule__Tuple__ValuesAssignment_2_3_2");
					put(grammarAccess.getListAccess().getValuesAssignment_2_1(), "rule__List__ValuesAssignment_2_1");
					put(grammarAccess.getListAccess().getValuesAssignment_2_3_2(), "rule__List__ValuesAssignment_2_3_2");
					put(grammarAccess.getDictionaryAccess().getEntriesAssignment_2_1(), "rule__Dictionary__EntriesAssignment_2_1");
					put(grammarAccess.getDictionaryAccess().getEntriesAssignment_2_3_2(), "rule__Dictionary__EntriesAssignment_2_3_2");
					put(grammarAccess.getDictionaryEntryAccess().getKeyAssignment_0(), "rule__DictionaryEntry__KeyAssignment_0");
					put(grammarAccess.getDictionaryEntryAccess().getValueAssignment_2_2(), "rule__DictionaryEntry__ValueAssignment_2_2");
					put(grammarAccess.getRelDateAccess().getValAssignment(), "rule__RelDate__ValAssignment");
					put(grammarAccess.getDateAccess().getValAssignment(), "rule__Date__ValAssignment");
					put(grammarAccess.getBooleanAccess().getValAssignment(), "rule__Boolean__ValAssignment");
					put(grammarAccess.getStringValueAccess().getValAssignment(), "rule__StringValue__ValAssignment");
					put(grammarAccess.getNumberAccess().getValAssignment_0(), "rule__Number__ValAssignment_0");
					put(grammarAccess.getNumberAccess().getValIntAssignment_1(), "rule__Number__ValIntAssignment_1");
					put(grammarAccess.getNumberAccess().getValStrAssignment_2(), "rule__Number__ValStrAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			lu.ses.engineering.spell.ui.contentassist.antlr.internal.InternalSpellDatabaseParser typedParser = (lu.ses.engineering.spell.ui.contentassist.antlr.internal.InternalSpellDatabaseParser) parser;
			typedParser.entryRuleSpellDatabase();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SpellDatabaseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SpellDatabaseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}