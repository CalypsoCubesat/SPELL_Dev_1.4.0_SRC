/*
* generated by Xtext
*/
grammar InternalReportGrammar;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.services.ReportGrammarGrammarAccess;

}

@parser::members {

 	private ReportGrammarGrammarAccess grammarAccess;
 	
    public InternalReportGrammarParser(TokenStream input, ReportGrammarGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Workspace";	
   	}
   	
   	@Override
   	protected ReportGrammarGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleWorkspace
entryRuleWorkspace returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getWorkspaceRule()); }
	 iv_ruleWorkspace=ruleWorkspace 
	 { $current=$iv_ruleWorkspace.current; } 
	 EOF 
;

// Rule Workspace
ruleWorkspace returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getWorkspaceAccess().getProceduresEStringToLayoutMapEntryParserRuleCall_0_0()); 
	    }
		lv_procedures_0_0=ruleEStringToLayoutMapEntry		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWorkspaceRule());
	        }
       		add(
       			$current, 
       			"procedures",
        		lv_procedures_0_0, 
        		"EStringToLayoutMapEntry");
	        afterParserOrEnumRuleCall();
	    }

)
)*
    |
    { 
        newCompositeNode(grammarAccess.getWorkspaceAccess().getLayoutParserRuleCall_1()); 
    }
    this_Layout_1=ruleLayout
    { 
        $current = $this_Layout_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEStringToLayoutMapEntry
entryRuleEStringToLayoutMapEntry returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringToLayoutMapEntryRule()); }
	 iv_ruleEStringToLayoutMapEntry=ruleEStringToLayoutMapEntry 
	 { $current=$iv_ruleEStringToLayoutMapEntry.current; } 
	 EOF 
;

// Rule EStringToLayoutMapEntry
ruleEStringToLayoutMapEntry returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_key_0_0=RULE_ID
		{
			newLeafNode(lv_key_0_0, grammarAccess.getEStringToLayoutMapEntryAccess().getKeyIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEStringToLayoutMapEntryRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"key",
        		lv_key_0_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEStringToLayoutMapEntryAccess().getValueLayoutParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleLayout		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEStringToLayoutMapEntryRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"Layout");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleLayout
entryRuleLayout returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLayoutRule()); }
	 iv_ruleLayout=ruleLayout 
	 { $current=$iv_ruleLayout.current; } 
	 EOF 
;

// Rule Layout
ruleLayout returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getLayoutAccess().getLayoutAction_0_0(),
            $current);
    }
)(	otherlv_1='Procedure' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getProcedureKeyword_0_1_0());
    }
this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getLayoutAccess().getWSTerminalRuleCall_0_1_1()); 
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getLayoutAccess().getNameIDTerminalRuleCall_0_1_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLayoutRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4=':' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getLayoutAccess().getColonKeyword_0_1_3());
    }
this_NL_5=RULE_NL
    { 
    newLeafNode(this_NL_5, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_0_1_4()); 
    }
(this_TAB_6=RULE_TAB
    { 
    newLeafNode(this_TAB_6, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_0_1_5_0()); 
    }
	otherlv_7='procedure calls the procedures:' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getLayoutAccess().getProcedureCallsTheProceduresKeyword_0_1_5_1());
    }
this_NL_8=RULE_NL
    { 
    newLeafNode(this_NL_8, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_0_1_5_2()); 
    }
(this_TAB_9=RULE_TAB
    { 
    newLeafNode(this_TAB_9, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_0_1_5_3_0()); 
    }
this_TAB_10=RULE_TAB
    { 
    newLeafNode(this_TAB_10, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_0_1_5_3_1()); 
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLayoutRule());
	        }
        }
	otherlv_11=RULE_ID
	{
		newLeafNode(otherlv_11, grammarAccess.getLayoutAccess().getCallsLayoutCrossReference_0_1_5_3_2_0()); 
	}

)
)this_NL_12=RULE_NL
    { 
    newLeafNode(this_NL_12, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_0_1_5_3_3()); 
    }
)*)(this_TAB_13=RULE_TAB
    { 
    newLeafNode(this_TAB_13, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_0_1_6_0()); 
    }
	otherlv_14='procedure is called by:' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getLayoutAccess().getProcedureIsCalledByKeyword_0_1_6_1());
    }
this_NL_15=RULE_NL
    { 
    newLeafNode(this_NL_15, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_0_1_6_2()); 
    }
(this_TAB_16=RULE_TAB
    { 
    newLeafNode(this_TAB_16, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_0_1_6_3_0()); 
    }
this_TAB_17=RULE_TAB
    { 
    newLeafNode(this_TAB_17, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_0_1_6_3_1()); 
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLayoutRule());
	        }
        }
	otherlv_18=RULE_ID
	{
		newLeafNode(otherlv_18, grammarAccess.getLayoutAccess().getIsCalledLayoutCrossReference_0_1_6_3_2_0()); 
	}

)
)this_NL_19=RULE_NL
    { 
    newLeafNode(this_NL_19, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_0_1_6_3_3()); 
    }
)*)))
    |((((
(
	'No Source found for' 
 

)
)	RULE_WS(
(
RULE_ID

)
)	':' 
	RULE_NL(	RULE_TAB	'is called by:' 
	RULE_NL(	RULE_TAB	RULE_TAB(
(
	RULE_ID

)
)	RULE_NL)*)))=>((
(
		lv_missing_20_0=	'No Source found for' 
    {
        newLeafNode(lv_missing_20_0, grammarAccess.getLayoutAccess().getMissingNoSourceFoundForKeyword_1_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLayoutRule());
	        }
       		setWithLastConsumed($current, "missing", true, "No Source found for");
	    }

)
)this_WS_21=RULE_WS
    { 
    newLeafNode(this_WS_21, grammarAccess.getLayoutAccess().getWSTerminalRuleCall_1_0_1()); 
    }
(
(
		lv_name_22_0=RULE_ID
		{
			newLeafNode(lv_name_22_0, grammarAccess.getLayoutAccess().getNameIDTerminalRuleCall_1_0_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLayoutRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_22_0, 
        		"ID");
	    }

)
)	otherlv_23=':' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getLayoutAccess().getColonKeyword_1_0_3());
    }
this_NL_24=RULE_NL
    { 
    newLeafNode(this_NL_24, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_1_0_4()); 
    }
(this_TAB_25=RULE_TAB
    { 
    newLeafNode(this_TAB_25, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_1_0_5_0()); 
    }
	otherlv_26='is called by:' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getLayoutAccess().getIsCalledByKeyword_1_0_5_1());
    }
this_NL_27=RULE_NL
    { 
    newLeafNode(this_NL_27, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_1_0_5_2()); 
    }
(this_TAB_28=RULE_TAB
    { 
    newLeafNode(this_TAB_28, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_1_0_5_3_0()); 
    }
this_TAB_29=RULE_TAB
    { 
    newLeafNode(this_TAB_29, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_1_0_5_3_1()); 
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLayoutRule());
	        }
        }
	otherlv_30=RULE_ID
	{
		newLeafNode(otherlv_30, grammarAccess.getLayoutAccess().getIsCalledLayoutCrossReference_1_0_5_3_2_0()); 
	}

)
)this_NL_31=RULE_NL
    { 
    newLeafNode(this_NL_31, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_1_0_5_3_3()); 
    }
)*))))
;





RULE_ID : ~(('\t'|' '|'\r'|'\n'))+;

RULE_TAB : '\t'+;

RULE_WS : ' '+;

RULE_NL : ('\r'|'\n')+;

RULE_ANY_OTHER : .;

