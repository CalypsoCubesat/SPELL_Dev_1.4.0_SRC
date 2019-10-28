package lu.ses.engineering.B7022SPELL.pages.serializer;

import com.google.inject.Inject;
import java.util.List;
import lu.ses.engineering.B7022SPELL.pages.services.TmDisplayPagesGrammarAccess;
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
public abstract class AbstractTmDisplayPagesSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TmDisplayPagesGrammarAccess grammarAccess;
	protected AbstractElementAlias match_IMP_File_IMP_CMD_EntryParserRuleCall_1_4_a;
	protected AbstractElementAlias match_IMP_File_______CMDKeyword_1_1_0_IMP_CMD_EntryParserRuleCall_1_1_1___or___SPELLKeyword_1_0_0_IMP_CMD_EntryParserRuleCall_1_0_1_____IMP_CMD_EntryParserRuleCall_1_4_a__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TmDisplayPagesGrammarAccess) access;
		match_IMP_File_IMP_CMD_EntryParserRuleCall_1_4_a = new TokenAlias(true, true, grammarAccess.getIMP_FileAccess().getIMP_CMD_EntryParserRuleCall_1_4());
		match_IMP_File_______CMDKeyword_1_1_0_IMP_CMD_EntryParserRuleCall_1_1_1___or___SPELLKeyword_1_0_0_IMP_CMD_EntryParserRuleCall_1_0_1_____IMP_CMD_EntryParserRuleCall_1_4_a__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIMP_FileAccess().getCMDKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getIMP_FileAccess().getIMP_CMD_EntryParserRuleCall_1_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIMP_FileAccess().getSPELLKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getIMP_FileAccess().getIMP_CMD_EntryParserRuleCall_1_0_1()))), new TokenAlias(true, true, grammarAccess.getIMP_FileAccess().getIMP_CMD_EntryParserRuleCall_1_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIMP_CMD_EntryRule())
			return getIMP_CMD_EntryToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNLRule())
			return getNLToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * IMP_CMD_Entry:
	 * 	Note NL
	 * ;
	 */
	protected String getIMP_CMD_EntryToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\r";
	}
	
	/**
	 * terminal NL			: ('\r'|'\n')+;
	 */
	protected String getNLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\r";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_IMP_File_IMP_CMD_EntryParserRuleCall_1_4_a.equals(syntax))
				emit_IMP_File_IMP_CMD_EntryParserRuleCall_1_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IMP_File_______CMDKeyword_1_1_0_IMP_CMD_EntryParserRuleCall_1_1_1___or___SPELLKeyword_1_0_0_IMP_CMD_EntryParserRuleCall_1_0_1_____IMP_CMD_EntryParserRuleCall_1_4_a__a.equals(syntax))
				emit_IMP_File_______CMDKeyword_1_1_0_IMP_CMD_EntryParserRuleCall_1_1_1___or___SPELLKeyword_1_0_0_IMP_CMD_EntryParserRuleCall_1_0_1_____IMP_CMD_EntryParserRuleCall_1_4_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     IMP_CMD_Entry*
	 */
	protected void emit_IMP_File_IMP_CMD_EntryParserRuleCall_1_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((('CMD' IMP_CMD_Entry) | ('SPELL' IMP_CMD_Entry)) IMP_CMD_Entry*)*
	 */
	protected void emit_IMP_File_______CMDKeyword_1_1_0_IMP_CMD_EntryParserRuleCall_1_1_1___or___SPELLKeyword_1_0_0_IMP_CMD_EntryParserRuleCall_1_0_1_____IMP_CMD_EntryParserRuleCall_1_4_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
