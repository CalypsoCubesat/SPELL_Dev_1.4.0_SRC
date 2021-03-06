/*
 * generated by Xtext
 */
package lu.ses.engineering.spell.controlflow.serializer;

import com.google.inject.Inject;
import java.util.List;
import lu.ses.engineering.spell.controlflow.services.SpellGrammarGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractSpellGrammarSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SpellGrammarGrammarAccess grammarAccess;
	protected AbstractElementAlias match_and_test_NLParserRuleCall_1_2_q;
	protected AbstractElementAlias match_arglist_CommaKeyword_2_q;
	protected AbstractElementAlias match_atom_WSTerminalRuleCall_6_1_q;
	protected AbstractElementAlias match_for_stmt_ENDFORTerminalRuleCall_7_0_or_ENDIFTerminalRuleCall_7_1;
	protected AbstractElementAlias match_or_test_NLParserRuleCall_1_2_q;
	protected AbstractElementAlias match_parameters_CommaKeyword_3_q;
	protected AbstractElementAlias match_power_CommaKeyword_0_5_q;
	protected AbstractElementAlias match_power_CommaKeyword_10_4_q;
	protected AbstractElementAlias match_power_CommaKeyword_11_4_q;
	protected AbstractElementAlias match_power_CommaKeyword_1_5_q;
	protected AbstractElementAlias match_power_CommaKeyword_2_4_q;
	protected AbstractElementAlias match_power_CommaKeyword_3_4_q;
	protected AbstractElementAlias match_power_CommaKeyword_4_4_q;
	protected AbstractElementAlias match_power_CommaKeyword_5_4_0_q;
	protected AbstractElementAlias match_power_CommaKeyword_5_5_q;
	protected AbstractElementAlias match_power_CommaKeyword_6_4_0_q;
	protected AbstractElementAlias match_power_CommaKeyword_6_5_q;
	protected AbstractElementAlias match_power_CommaKeyword_7_4_0_q;
	protected AbstractElementAlias match_power_CommaKeyword_7_5_q;
	protected AbstractElementAlias match_simple_stmt_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_subscript___FullStopKeyword_1_0_0_FullStopKeyword_1_0_1_FullStopKeyword_1_0_2__q;
	protected AbstractElementAlias match_trailer_CommaKeyword_0_2_q;
	protected AbstractElementAlias match_try_stmt_ENDTRYTerminalRuleCall_0_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SpellGrammarGrammarAccess) access;
		match_and_test_NLParserRuleCall_1_2_q = new TokenAlias(false, true, grammarAccess.getAnd_testAccess().getNLParserRuleCall_1_2());
		match_arglist_CommaKeyword_2_q = new TokenAlias(false, true, grammarAccess.getArglistAccess().getCommaKeyword_2());
		match_atom_WSTerminalRuleCall_6_1_q = new TokenAlias(false, true, grammarAccess.getAtomAccess().getWSTerminalRuleCall_6_1());
		match_for_stmt_ENDFORTerminalRuleCall_7_0_or_ENDIFTerminalRuleCall_7_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFor_stmtAccess().getENDFORTerminalRuleCall_7_0()), new TokenAlias(false, false, grammarAccess.getFor_stmtAccess().getENDIFTerminalRuleCall_7_1()));
		match_or_test_NLParserRuleCall_1_2_q = new TokenAlias(false, true, grammarAccess.getOr_testAccess().getNLParserRuleCall_1_2());
		match_parameters_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getParametersAccess().getCommaKeyword_3());
		match_power_CommaKeyword_0_5_q = new TokenAlias(false, true, grammarAccess.getPowerAccess().getCommaKeyword_0_5());
		match_power_CommaKeyword_10_4_q = new TokenAlias(false, true, grammarAccess.getPowerAccess().getCommaKeyword_10_4());
		match_power_CommaKeyword_11_4_q = new TokenAlias(false, true, grammarAccess.getPowerAccess().getCommaKeyword_11_4());
		match_power_CommaKeyword_1_5_q = new TokenAlias(false, true, grammarAccess.getPowerAccess().getCommaKeyword_1_5());
		match_power_CommaKeyword_2_4_q = new TokenAlias(false, true, grammarAccess.getPowerAccess().getCommaKeyword_2_4());
		match_power_CommaKeyword_3_4_q = new TokenAlias(false, true, grammarAccess.getPowerAccess().getCommaKeyword_3_4());
		match_power_CommaKeyword_4_4_q = new TokenAlias(false, true, grammarAccess.getPowerAccess().getCommaKeyword_4_4());
		match_power_CommaKeyword_5_4_0_q = new TokenAlias(false, true, grammarAccess.getPowerAccess().getCommaKeyword_5_4_0());
		match_power_CommaKeyword_5_5_q = new TokenAlias(false, true, grammarAccess.getPowerAccess().getCommaKeyword_5_5());
		match_power_CommaKeyword_6_4_0_q = new TokenAlias(false, true, grammarAccess.getPowerAccess().getCommaKeyword_6_4_0());
		match_power_CommaKeyword_6_5_q = new TokenAlias(false, true, grammarAccess.getPowerAccess().getCommaKeyword_6_5());
		match_power_CommaKeyword_7_4_0_q = new TokenAlias(false, true, grammarAccess.getPowerAccess().getCommaKeyword_7_4_0());
		match_power_CommaKeyword_7_5_q = new TokenAlias(false, true, grammarAccess.getPowerAccess().getCommaKeyword_7_5());
		match_simple_stmt_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getSimple_stmtAccess().getSemicolonKeyword_2());
		match_subscript___FullStopKeyword_1_0_0_FullStopKeyword_1_0_1_FullStopKeyword_1_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSubscriptAccess().getFullStopKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getSubscriptAccess().getFullStopKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getSubscriptAccess().getFullStopKeyword_1_0_2()));
		match_trailer_CommaKeyword_0_2_q = new TokenAlias(false, true, grammarAccess.getTrailerAccess().getCommaKeyword_0_2());
		match_try_stmt_ENDTRYTerminalRuleCall_0_3_q = new TokenAlias(false, true, grammarAccess.getTry_stmtAccess().getENDTRYTerminalRuleCall_0_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getENDCLASSRule())
			return getENDCLASSToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDDEFRule())
			return getENDDEFToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDFORRule())
			return getENDFORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDIFRule())
			return getENDIFToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDTRYRule())
			return getENDTRYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDWHILERule())
			return getENDWHILEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDWITHRule())
			return getENDWITHToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNLRule())
			return getNLToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ENDCLASS			:   '#' 'ENDCLASS' !('\n'|'\r')* ;
	 */
	protected String getENDCLASSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#ENDCLASS";
	}
	
	/**
	 * terminal ENDDEF				:   ('#' ('ENDDEF' )   !('\n'|'\r')*) ;
	 */
	protected String getENDDEFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#ENDDEF";
	}
	
	/**
	 * terminal ENDFOR				:   '#' 'ENDFOR'   !('\n'|'\r')*;
	 */
	protected String getENDFORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#ENDFOR";
	}
	
	/**
	 * terminal ENDIF				:   '#' 'ENDIF'  !('\n'|'\r')* ;
	 */
	protected String getENDIFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#ENDIF";
	}
	
	/**
	 * terminal ENDTRY				:   ('#' 'ENDTRY'   !('\n'|'\r')*) 
	 * ;
	 */
	protected String getENDTRYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#ENDTRY";
	}
	
	/**
	 * terminal ENDWHILE			:   '#' 'ENDWHILE' !('\n'|'\r')*;
	 */
	protected String getENDWHILEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#ENDWHILE";
	}
	
	/**
	 * terminal ENDWITH			:   '#' 'ENDWITH'  !('\n'|'\r')* ;
	 */
	protected String getENDWITHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#ENDWITH";
	}
	
	/**
	 * NL returns ecore::EString:
	 * 	'\\' WS
	 * ;
	 */
	protected String getNLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\\ ";
	}
	
	/**
	 * terminal WS			: (' '|'\t'|('\\'? '\r'? '\n'))+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_and_test_NLParserRuleCall_1_2_q.equals(syntax))
				emit_and_test_NLParserRuleCall_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_arglist_CommaKeyword_2_q.equals(syntax))
				emit_arglist_CommaKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_atom_WSTerminalRuleCall_6_1_q.equals(syntax))
				emit_atom_WSTerminalRuleCall_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_for_stmt_ENDFORTerminalRuleCall_7_0_or_ENDIFTerminalRuleCall_7_1.equals(syntax))
				emit_for_stmt_ENDFORTerminalRuleCall_7_0_or_ENDIFTerminalRuleCall_7_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_or_test_NLParserRuleCall_1_2_q.equals(syntax))
				emit_or_test_NLParserRuleCall_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_parameters_CommaKeyword_3_q.equals(syntax))
				emit_parameters_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_power_CommaKeyword_0_5_q.equals(syntax))
				emit_power_CommaKeyword_0_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_power_CommaKeyword_10_4_q.equals(syntax))
				emit_power_CommaKeyword_10_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_power_CommaKeyword_11_4_q.equals(syntax))
				emit_power_CommaKeyword_11_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_power_CommaKeyword_1_5_q.equals(syntax))
				emit_power_CommaKeyword_1_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_power_CommaKeyword_2_4_q.equals(syntax))
				emit_power_CommaKeyword_2_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_power_CommaKeyword_3_4_q.equals(syntax))
				emit_power_CommaKeyword_3_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_power_CommaKeyword_4_4_q.equals(syntax))
				emit_power_CommaKeyword_4_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_power_CommaKeyword_5_4_0_q.equals(syntax))
				emit_power_CommaKeyword_5_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_power_CommaKeyword_5_5_q.equals(syntax))
				emit_power_CommaKeyword_5_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_power_CommaKeyword_6_4_0_q.equals(syntax))
				emit_power_CommaKeyword_6_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_power_CommaKeyword_6_5_q.equals(syntax))
				emit_power_CommaKeyword_6_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_power_CommaKeyword_7_4_0_q.equals(syntax))
				emit_power_CommaKeyword_7_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_power_CommaKeyword_7_5_q.equals(syntax))
				emit_power_CommaKeyword_7_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_simple_stmt_SemicolonKeyword_2_q.equals(syntax))
				emit_simple_stmt_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_subscript___FullStopKeyword_1_0_0_FullStopKeyword_1_0_1_FullStopKeyword_1_0_2__q.equals(syntax))
				emit_subscript___FullStopKeyword_1_0_0_FullStopKeyword_1_0_1_FullStopKeyword_1_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_trailer_CommaKeyword_0_2_q.equals(syntax))
				emit_trailer_CommaKeyword_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_try_stmt_ENDTRYTerminalRuleCall_0_3_q.equals(syntax))
				emit_try_stmt_ENDTRYTerminalRuleCall_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     NL?
	 *
	 * This ambiguous syntax occurs at:
	 *     sign='and' (ambiguity) right=not_test
	 */
	protected void emit_and_test_NLParserRuleCall_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     arguments+=argument (ambiguity) (rule end)
	 *     dot1_arguments+=argument (ambiguity) (rule end)
	 *     dot1_test=test (ambiguity) (rule end)
	 *     dot2_test=test (ambiguity) (rule end)
	 *     optionalComma?=',' (ambiguity) (rule end)
	 */
	protected void emit_arglist_CommaKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     WS?
	 *
	 * This ambiguous syntax occurs at:
	 *     strings+=STRING (ambiguity) ';'? (rule end)
	 *     strings+=STRING (ambiguity) (rule end)
	 *     strings+=STRING (ambiguity) optionalComma?=','
	 *     strings+=STRING (ambiguity) strings+=STRING
	 */
	protected void emit_atom_WSTerminalRuleCall_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDFOR | ENDIF
	 *
	 * This ambiguous syntax occurs at:
	 *     else=suite (ambiguity) (rule end)
	 *     suite=suite (ambiguity) (rule end)
	 */
	protected void emit_for_stmt_ENDFORTerminalRuleCall_7_0_or_ENDIFTerminalRuleCall_7_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     NL?
	 *
	 * This ambiguous syntax occurs at:
	 *     sign='or' (ambiguity) right=and_test
	 */
	protected void emit_or_test_NLParserRuleCall_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '(' (ambiguity) ')' (rule start)
	 *     varargslist=varargslist (ambiguity) ')' (rule end)
	 */
	protected void emit_parameters_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     description=arith_expr (ambiguity) ')' ';'? (rule end)
	 *     description=arith_expr (ambiguity) ')' (rule end)
	 *     description=arith_expr (ambiguity) ')' optionalComma?=','
	 *     id=atom (ambiguity) ')' ';'? (rule end)
	 *     id=atom (ambiguity) ')' (rule end)
	 *     id=atom (ambiguity) ')' optionalComma?=','
	 */
	protected void emit_power_CommaKeyword_0_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     args=arglist (ambiguity) ')' ';'? (rule end)
	 *     args=arglist (ambiguity) ')' (rule end)
	 *     args=arglist (ambiguity) ')' optionalComma?=','
	 *     args=arglist (ambiguity) ')' trailer+=trailer
	 */
	protected void emit_power_CommaKeyword_10_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     args=arglist (ambiguity) ')' ';'? (rule end)
	 *     args=arglist (ambiguity) ')' (rule end)
	 *     args=arglist (ambiguity) ')' optionalComma?=','
	 *     args=arglist (ambiguity) ')' trailer+=trailer
	 */
	protected void emit_power_CommaKeyword_11_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     description=arith_expr (ambiguity) ')' ';'? (rule end)
	 *     description=arith_expr (ambiguity) ')' (rule end)
	 *     description=arith_expr (ambiguity) ')' optionalComma?=','
	 *     id=arith_expr (ambiguity) ')' ';'? (rule end)
	 *     id=arith_expr (ambiguity) ')' (rule end)
	 *     id=arith_expr (ambiguity) ')' optionalComma?=','
	 */
	protected void emit_power_CommaKeyword_1_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     args+=arglist (ambiguity) ')' ';'? (rule end)
	 *     args+=arglist (ambiguity) ')' (rule end)
	 *     args+=arglist (ambiguity) ')' optionalComma?=','
	 */
	protected void emit_power_CommaKeyword_2_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     args+=arglist (ambiguity) ')' ';'? (rule end)
	 *     args+=arglist (ambiguity) ')' (rule end)
	 *     args+=arglist (ambiguity) ')' optionalComma?=','
	 *     args+=arglist (ambiguity) ')' trailer+=trailer
	 */
	protected void emit_power_CommaKeyword_3_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     args+=arglist (ambiguity) ')' ';'? (rule end)
	 *     args+=arglist (ambiguity) ')' (rule end)
	 *     args+=arglist (ambiguity) ')' optionalComma?=','
	 *     args+=arglist (ambiguity) ')' trailer+=trailer
	 */
	protected void emit_power_CommaKeyword_4_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     args+=arglist (ambiguity) args+=arglist
	 *     tm=test (ambiguity) args+=arglist
	 */
	protected void emit_power_CommaKeyword_5_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     args+=arglist (ambiguity) ')' ';'? (rule end)
	 *     args+=arglist (ambiguity) ')' (rule end)
	 *     args+=arglist (ambiguity) ')' optionalComma?=','
	 *     args+=arglist (ambiguity) ')' trailer+=trailer
	 *     tm=test (ambiguity) ')' ';'? (rule end)
	 *     tm=test (ambiguity) ')' (rule end)
	 *     tm=test (ambiguity) ')' optionalComma?=','
	 *     tm=test (ambiguity) ')' trailer+=trailer
	 */
	protected void emit_power_CommaKeyword_5_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     args+=arglist (ambiguity) args+=arglist
	 *     tm=test (ambiguity) args+=arglist
	 */
	protected void emit_power_CommaKeyword_6_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     args+=arglist (ambiguity) ')' ';'? (rule end)
	 *     args+=arglist (ambiguity) ')' (rule end)
	 *     args+=arglist (ambiguity) ')' optionalComma?=','
	 *     args+=arglist (ambiguity) ')' trailer+=trailer
	 *     tm=test (ambiguity) ')' ';'? (rule end)
	 *     tm=test (ambiguity) ')' (rule end)
	 *     tm=test (ambiguity) ')' optionalComma?=','
	 *     tm=test (ambiguity) ')' trailer+=trailer
	 */
	protected void emit_power_CommaKeyword_6_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     args+=arglist (ambiguity) args+=arglist
	 *     tm=test (ambiguity) args+=arglist
	 */
	protected void emit_power_CommaKeyword_7_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     args+=arglist (ambiguity) ')' ';'? (rule end)
	 *     args+=arglist (ambiguity) ')' (rule end)
	 *     args+=arglist (ambiguity) ')' optionalComma?=','
	 *     args+=arglist (ambiguity) ')' trailer+=trailer
	 *     tm=test (ambiguity) ')' ';'? (rule end)
	 *     tm=test (ambiguity) ')' (rule end)
	 *     tm=test (ambiguity) ')' optionalComma?=','
	 *     tm=test (ambiguity) ')' trailer+=trailer
	 */
	protected void emit_power_CommaKeyword_7_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'break' (ambiguity) (rule start)
	 *     (rule start) 'continue' (ambiguity) (rule start)
	 *     (rule start) 'pass' (ambiguity) (rule start)
	 *     (rule start) 'raise' (ambiguity) (rule start)
	 *     (rule start) 'return' (ambiguity) (rule start)
	 *     additionalComma?=',' (ambiguity) (rule end)
	 *     args+=arglist ','? ')' (ambiguity) (rule end)
	 *     args=arglist ')' (ambiguity) (rule end)
	 *     args=arglist ','? ')' (ambiguity) (rule end)
	 *     assers+=test (ambiguity) (rule end)
	 *     assignments+=yield_or_testlist (ambiguity) (rule end)
	 *     comparison=comparison (ambiguity) (rule end)
	 *     curlyBracket?='{' '}' (ambiguity) (rule end)
	 *     description=arith_expr ','? ')' (ambiguity) (rule end)
	 *     dictorsetmaker=dictorsetmaker '}' (ambiguity) (rule end)
	 *     dots2+='.' 'import' '*' (ambiguity) (rule end)
	 *     dotted_as_names=dotted_as_names (ambiguity) (rule end)
	 *     dotted_name=dotted_name 'import' '*' (ambiguity) (rule end)
	 *     expr=expr (ambiguity) (rule end)
	 *     expr=test ')' (ambiguity) (rule end)
	 *     exprlist=exprlist (ambiguity) (rule end)
	 *     factor=factor (ambiguity) (rule end)
	 *     globals+=NAME (ambiguity) (rule end)
	 *     id=arith_expr ','? ')' (ambiguity) (rule end)
	 *     id=atom ','? ')' (ambiguity) (rule end)
	 *     if_else_test=test (ambiguity) (rule end)
	 *     import_as_names=import_as_names ')' (ambiguity) (rule end)
	 *     import_as_names=import_as_names (ambiguity) (rule end)
	 *     listmaker=listmaker ']' (ambiguity) (rule end)
	 *     name=NAME (ambiguity) (rule end)
	 *     name=NumberWithPlusOrMinus (ambiguity) (rule end)
	 *     optionalComma?=',' (ambiguity) (rule end)
	 *     right=and_expr (ambiguity) (rule end)
	 *     right=and_test (ambiguity) (rule end)
	 *     right=arith_expr (ambiguity) (rule end)
	 *     right=expr (ambiguity) (rule end)
	 *     right=factor (ambiguity) (rule end)
	 *     right=not_test (ambiguity) (rule end)
	 *     right=shift_expr (ambiguity) (rule end)
	 *     right=term (ambiguity) (rule end)
	 *     right=xor_expr (ambiguity) (rule end)
	 *     right=yield_or_testlist (ambiguity) (rule end)
	 *     roundBracket?='(' ')' (ambiguity) (rule end)
	 *     squareBracket?='[' ']' (ambiguity) (rule end)
	 *     stmt+=small_stmt (ambiguity) (rule end)
	 *     strings+=STRING WS? (ambiguity) (rule end)
	 *     target=STRING ')' (ambiguity) (rule end)
	 *     test=test (ambiguity) (rule end)
	 *     testlist1=testlist1 '`' (ambiguity) (rule end)
	 *     testlist=testlist (ambiguity) (rule end)
	 *     tests+=test (ambiguity) (rule end)
	 *     tm=test ','? ')' (ambiguity) (rule end)
	 *     trailer+=trailer (ambiguity) (rule end)
	 *     yield_expr=yield_expr (ambiguity) (rule end)
	 *     yield_or_testlist_comp=yield_or_testlist_comp ')' (ambiguity) (rule end)
	 */
	protected void emit_simple_stmt_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('.' '.' '.')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_subscript___FullStopKeyword_1_0_0_FullStopKeyword_1_0_1_FullStopKeyword_1_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     arglist=arglist (ambiguity) ')' (rule end)
	 *     roundBracket?='(' (ambiguity) ')' (rule end)
	 */
	protected void emit_trailer_CommaKeyword_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDTRY?
	 *
	 * This ambiguous syntax occurs at:
	 *     suite=suite (ambiguity) 'finally' ':' finally=suite
	 *     suite=suite (ambiguity) except_clause+=except_clause
	 */
	protected void emit_try_stmt_ENDTRYTerminalRuleCall_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
