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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalReportGrammarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_NL", "RULE_TAB", "RULE_ANY_OTHER", "'Procedure'", "':'", "'procedure calls the procedures:'", "'procedure is called by:'", "'No Source found for'", "'is called by:'"
    };
    public static final int T__9=9;
    public static final int RULE_ID=4;
    public static final int RULE_WS=5;
    public static final int RULE_TAB=7;
    public static final int RULE_ANY_OTHER=8;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_NL=6;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators


        public InternalReportGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReportGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReportGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g"; }



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



    // $ANTLR start "entryRuleWorkspace"
    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:67:1: entryRuleWorkspace returns [EObject current=null] : iv_ruleWorkspace= ruleWorkspace EOF ;
    public final EObject entryRuleWorkspace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkspace = null;


        try {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:68:2: (iv_ruleWorkspace= ruleWorkspace EOF )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:69:2: iv_ruleWorkspace= ruleWorkspace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkspaceRule()); 
            }
            pushFollow(FOLLOW_ruleWorkspace_in_entryRuleWorkspace75);
            iv_ruleWorkspace=ruleWorkspace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkspace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkspace85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkspace"


    // $ANTLR start "ruleWorkspace"
    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:76:1: ruleWorkspace returns [EObject current=null] : ( ( (lv_procedures_0_0= ruleEStringToLayoutMapEntry ) )* | this_Layout_1= ruleLayout ) ;
    public final EObject ruleWorkspace() throws RecognitionException {
        EObject current = null;

        EObject lv_procedures_0_0 = null;

        EObject this_Layout_1 = null;


         enterRule(); 
            
        try {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:79:28: ( ( ( (lv_procedures_0_0= ruleEStringToLayoutMapEntry ) )* | this_Layout_1= ruleLayout ) )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:80:1: ( ( (lv_procedures_0_0= ruleEStringToLayoutMapEntry ) )* | this_Layout_1= ruleLayout )
            {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:80:1: ( ( (lv_procedures_0_0= ruleEStringToLayoutMapEntry ) )* | this_Layout_1= ruleLayout )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==9||LA2_0==13) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:80:2: ( (lv_procedures_0_0= ruleEStringToLayoutMapEntry ) )*
                    {
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:80:2: ( (lv_procedures_0_0= ruleEStringToLayoutMapEntry ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:81:1: (lv_procedures_0_0= ruleEStringToLayoutMapEntry )
                    	    {
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:81:1: (lv_procedures_0_0= ruleEStringToLayoutMapEntry )
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:82:3: lv_procedures_0_0= ruleEStringToLayoutMapEntry
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getWorkspaceAccess().getProceduresEStringToLayoutMapEntryParserRuleCall_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEStringToLayoutMapEntry_in_ruleWorkspace131);
                    	    lv_procedures_0_0=ruleEStringToLayoutMapEntry();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getWorkspaceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"procedures",
                    	              		lv_procedures_0_0, 
                    	              		"EStringToLayoutMapEntry");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:100:5: this_Layout_1= ruleLayout
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getWorkspaceAccess().getLayoutParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLayout_in_ruleWorkspace160);
                    this_Layout_1=ruleLayout();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Layout_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkspace"


    // $ANTLR start "entryRuleEStringToLayoutMapEntry"
    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:116:1: entryRuleEStringToLayoutMapEntry returns [EObject current=null] : iv_ruleEStringToLayoutMapEntry= ruleEStringToLayoutMapEntry EOF ;
    public final EObject entryRuleEStringToLayoutMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToLayoutMapEntry = null;


        try {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:117:2: (iv_ruleEStringToLayoutMapEntry= ruleEStringToLayoutMapEntry EOF )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:118:2: iv_ruleEStringToLayoutMapEntry= ruleEStringToLayoutMapEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringToLayoutMapEntryRule()); 
            }
            pushFollow(FOLLOW_ruleEStringToLayoutMapEntry_in_entryRuleEStringToLayoutMapEntry195);
            iv_ruleEStringToLayoutMapEntry=ruleEStringToLayoutMapEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStringToLayoutMapEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringToLayoutMapEntry205); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringToLayoutMapEntry"


    // $ANTLR start "ruleEStringToLayoutMapEntry"
    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:125:1: ruleEStringToLayoutMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleLayout ) ) ) ;
    public final EObject ruleEStringToLayoutMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:128:28: ( ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleLayout ) ) ) )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:129:1: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleLayout ) ) )
            {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:129:1: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleLayout ) ) )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:129:2: ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleLayout ) )
            {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:129:2: ( (lv_key_0_0= RULE_ID ) )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:130:1: (lv_key_0_0= RULE_ID )
            {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:130:1: (lv_key_0_0= RULE_ID )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:131:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEStringToLayoutMapEntry247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getEStringToLayoutMapEntryAccess().getKeyIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEStringToLayoutMapEntryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:147:2: ( (lv_value_1_0= ruleLayout ) )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:148:1: (lv_value_1_0= ruleLayout )
            {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:148:1: (lv_value_1_0= ruleLayout )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:149:3: lv_value_1_0= ruleLayout
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEStringToLayoutMapEntryAccess().getValueLayoutParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLayout_in_ruleEStringToLayoutMapEntry273);
            lv_value_1_0=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEStringToLayoutMapEntryRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Layout");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEStringToLayoutMapEntry"


    // $ANTLR start "entryRuleLayout"
    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:173:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:174:2: (iv_ruleLayout= ruleLayout EOF )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:175:2: iv_ruleLayout= ruleLayout EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLayoutRule()); 
            }
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout309);
            iv_ruleLayout=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLayout; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout319); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:182:1: ruleLayout returns [EObject current=null] : ( ( () (otherlv_1= 'Procedure' this_WS_2= RULE_WS ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' this_NL_5= RULE_NL (this_TAB_6= RULE_TAB otherlv_7= 'procedure calls the procedures:' this_NL_8= RULE_NL (this_TAB_9= RULE_TAB this_TAB_10= RULE_TAB ( (otherlv_11= RULE_ID ) ) this_NL_12= RULE_NL )* ) (this_TAB_13= RULE_TAB otherlv_14= 'procedure is called by:' this_NL_15= RULE_NL (this_TAB_16= RULE_TAB this_TAB_17= RULE_TAB ( (otherlv_18= RULE_ID ) ) this_NL_19= RULE_NL )* ) ) ) | ( ( ( ( ( 'No Source found for' ) ) RULE_WS ( ( RULE_ID ) ) ':' RULE_NL ( RULE_TAB 'is called by:' RULE_NL ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )* ) ) )=> ( ( (lv_missing_20_0= 'No Source found for' ) ) this_WS_21= RULE_WS ( (lv_name_22_0= RULE_ID ) ) otherlv_23= ':' this_NL_24= RULE_NL (this_TAB_25= RULE_TAB otherlv_26= 'is called by:' this_NL_27= RULE_NL (this_TAB_28= RULE_TAB this_TAB_29= RULE_TAB ( (otherlv_30= RULE_ID ) ) this_NL_31= RULE_NL )* ) ) ) ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_WS_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token this_NL_5=null;
        Token this_TAB_6=null;
        Token otherlv_7=null;
        Token this_NL_8=null;
        Token this_TAB_9=null;
        Token this_TAB_10=null;
        Token otherlv_11=null;
        Token this_NL_12=null;
        Token this_TAB_13=null;
        Token otherlv_14=null;
        Token this_NL_15=null;
        Token this_TAB_16=null;
        Token this_TAB_17=null;
        Token otherlv_18=null;
        Token this_NL_19=null;
        Token lv_missing_20_0=null;
        Token this_WS_21=null;
        Token lv_name_22_0=null;
        Token otherlv_23=null;
        Token this_NL_24=null;
        Token this_TAB_25=null;
        Token otherlv_26=null;
        Token this_NL_27=null;
        Token this_TAB_28=null;
        Token this_TAB_29=null;
        Token otherlv_30=null;
        Token this_NL_31=null;

         enterRule(); 
            
        try {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:185:28: ( ( ( () (otherlv_1= 'Procedure' this_WS_2= RULE_WS ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' this_NL_5= RULE_NL (this_TAB_6= RULE_TAB otherlv_7= 'procedure calls the procedures:' this_NL_8= RULE_NL (this_TAB_9= RULE_TAB this_TAB_10= RULE_TAB ( (otherlv_11= RULE_ID ) ) this_NL_12= RULE_NL )* ) (this_TAB_13= RULE_TAB otherlv_14= 'procedure is called by:' this_NL_15= RULE_NL (this_TAB_16= RULE_TAB this_TAB_17= RULE_TAB ( (otherlv_18= RULE_ID ) ) this_NL_19= RULE_NL )* ) ) ) | ( ( ( ( ( 'No Source found for' ) ) RULE_WS ( ( RULE_ID ) ) ':' RULE_NL ( RULE_TAB 'is called by:' RULE_NL ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )* ) ) )=> ( ( (lv_missing_20_0= 'No Source found for' ) ) this_WS_21= RULE_WS ( (lv_name_22_0= RULE_ID ) ) otherlv_23= ':' this_NL_24= RULE_NL (this_TAB_25= RULE_TAB otherlv_26= 'is called by:' this_NL_27= RULE_NL (this_TAB_28= RULE_TAB this_TAB_29= RULE_TAB ( (otherlv_30= RULE_ID ) ) this_NL_31= RULE_NL )* ) ) ) ) )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:186:1: ( ( () (otherlv_1= 'Procedure' this_WS_2= RULE_WS ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' this_NL_5= RULE_NL (this_TAB_6= RULE_TAB otherlv_7= 'procedure calls the procedures:' this_NL_8= RULE_NL (this_TAB_9= RULE_TAB this_TAB_10= RULE_TAB ( (otherlv_11= RULE_ID ) ) this_NL_12= RULE_NL )* ) (this_TAB_13= RULE_TAB otherlv_14= 'procedure is called by:' this_NL_15= RULE_NL (this_TAB_16= RULE_TAB this_TAB_17= RULE_TAB ( (otherlv_18= RULE_ID ) ) this_NL_19= RULE_NL )* ) ) ) | ( ( ( ( ( 'No Source found for' ) ) RULE_WS ( ( RULE_ID ) ) ':' RULE_NL ( RULE_TAB 'is called by:' RULE_NL ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )* ) ) )=> ( ( (lv_missing_20_0= 'No Source found for' ) ) this_WS_21= RULE_WS ( (lv_name_22_0= RULE_ID ) ) otherlv_23= ':' this_NL_24= RULE_NL (this_TAB_25= RULE_TAB otherlv_26= 'is called by:' this_NL_27= RULE_NL (this_TAB_28= RULE_TAB this_TAB_29= RULE_TAB ( (otherlv_30= RULE_ID ) ) this_NL_31= RULE_NL )* ) ) ) )
            {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:186:1: ( ( () (otherlv_1= 'Procedure' this_WS_2= RULE_WS ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' this_NL_5= RULE_NL (this_TAB_6= RULE_TAB otherlv_7= 'procedure calls the procedures:' this_NL_8= RULE_NL (this_TAB_9= RULE_TAB this_TAB_10= RULE_TAB ( (otherlv_11= RULE_ID ) ) this_NL_12= RULE_NL )* ) (this_TAB_13= RULE_TAB otherlv_14= 'procedure is called by:' this_NL_15= RULE_NL (this_TAB_16= RULE_TAB this_TAB_17= RULE_TAB ( (otherlv_18= RULE_ID ) ) this_NL_19= RULE_NL )* ) ) ) | ( ( ( ( ( 'No Source found for' ) ) RULE_WS ( ( RULE_ID ) ) ':' RULE_NL ( RULE_TAB 'is called by:' RULE_NL ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )* ) ) )=> ( ( (lv_missing_20_0= 'No Source found for' ) ) this_WS_21= RULE_WS ( (lv_name_22_0= RULE_ID ) ) otherlv_23= ':' this_NL_24= RULE_NL (this_TAB_25= RULE_TAB otherlv_26= 'is called by:' this_NL_27= RULE_NL (this_TAB_28= RULE_TAB this_TAB_29= RULE_TAB ( (otherlv_30= RULE_ID ) ) this_NL_31= RULE_NL )* ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==9) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) && (synpred1_InternalReportGrammar())) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:186:2: ( () (otherlv_1= 'Procedure' this_WS_2= RULE_WS ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' this_NL_5= RULE_NL (this_TAB_6= RULE_TAB otherlv_7= 'procedure calls the procedures:' this_NL_8= RULE_NL (this_TAB_9= RULE_TAB this_TAB_10= RULE_TAB ( (otherlv_11= RULE_ID ) ) this_NL_12= RULE_NL )* ) (this_TAB_13= RULE_TAB otherlv_14= 'procedure is called by:' this_NL_15= RULE_NL (this_TAB_16= RULE_TAB this_TAB_17= RULE_TAB ( (otherlv_18= RULE_ID ) ) this_NL_19= RULE_NL )* ) ) )
                    {
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:186:2: ( () (otherlv_1= 'Procedure' this_WS_2= RULE_WS ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' this_NL_5= RULE_NL (this_TAB_6= RULE_TAB otherlv_7= 'procedure calls the procedures:' this_NL_8= RULE_NL (this_TAB_9= RULE_TAB this_TAB_10= RULE_TAB ( (otherlv_11= RULE_ID ) ) this_NL_12= RULE_NL )* ) (this_TAB_13= RULE_TAB otherlv_14= 'procedure is called by:' this_NL_15= RULE_NL (this_TAB_16= RULE_TAB this_TAB_17= RULE_TAB ( (otherlv_18= RULE_ID ) ) this_NL_19= RULE_NL )* ) ) )
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:186:3: () (otherlv_1= 'Procedure' this_WS_2= RULE_WS ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' this_NL_5= RULE_NL (this_TAB_6= RULE_TAB otherlv_7= 'procedure calls the procedures:' this_NL_8= RULE_NL (this_TAB_9= RULE_TAB this_TAB_10= RULE_TAB ( (otherlv_11= RULE_ID ) ) this_NL_12= RULE_NL )* ) (this_TAB_13= RULE_TAB otherlv_14= 'procedure is called by:' this_NL_15= RULE_NL (this_TAB_16= RULE_TAB this_TAB_17= RULE_TAB ( (otherlv_18= RULE_ID ) ) this_NL_19= RULE_NL )* ) )
                    {
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:186:3: ()
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:187:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLayoutAccess().getLayoutAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:192:2: (otherlv_1= 'Procedure' this_WS_2= RULE_WS ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' this_NL_5= RULE_NL (this_TAB_6= RULE_TAB otherlv_7= 'procedure calls the procedures:' this_NL_8= RULE_NL (this_TAB_9= RULE_TAB this_TAB_10= RULE_TAB ( (otherlv_11= RULE_ID ) ) this_NL_12= RULE_NL )* ) (this_TAB_13= RULE_TAB otherlv_14= 'procedure is called by:' this_NL_15= RULE_NL (this_TAB_16= RULE_TAB this_TAB_17= RULE_TAB ( (otherlv_18= RULE_ID ) ) this_NL_19= RULE_NL )* ) )
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:192:4: otherlv_1= 'Procedure' this_WS_2= RULE_WS ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' this_NL_5= RULE_NL (this_TAB_6= RULE_TAB otherlv_7= 'procedure calls the procedures:' this_NL_8= RULE_NL (this_TAB_9= RULE_TAB this_TAB_10= RULE_TAB ( (otherlv_11= RULE_ID ) ) this_NL_12= RULE_NL )* ) (this_TAB_13= RULE_TAB otherlv_14= 'procedure is called by:' this_NL_15= RULE_NL (this_TAB_16= RULE_TAB this_TAB_17= RULE_TAB ( (otherlv_18= RULE_ID ) ) this_NL_19= RULE_NL )* )
                    {
                    otherlv_1=(Token)match(input,9,FOLLOW_9_in_ruleLayout367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getProcedureKeyword_0_1_0());
                          
                    }
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleLayout378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_2, grammarAccess.getLayoutAccess().getWSTerminalRuleCall_0_1_1()); 
                          
                    }
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:200:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:201:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:201:1: (lv_name_3_0= RULE_ID )
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:202:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayout394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getLayoutAccess().getNameIDTerminalRuleCall_0_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLayoutRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,10,FOLLOW_10_in_ruleLayout411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getLayoutAccess().getColonKeyword_0_1_3());
                          
                    }
                    this_NL_5=(Token)match(input,RULE_NL,FOLLOW_RULE_NL_in_ruleLayout422); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NL_5, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_0_1_4()); 
                          
                    }
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:226:1: (this_TAB_6= RULE_TAB otherlv_7= 'procedure calls the procedures:' this_NL_8= RULE_NL (this_TAB_9= RULE_TAB this_TAB_10= RULE_TAB ( (otherlv_11= RULE_ID ) ) this_NL_12= RULE_NL )* )
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:226:2: this_TAB_6= RULE_TAB otherlv_7= 'procedure calls the procedures:' this_NL_8= RULE_NL (this_TAB_9= RULE_TAB this_TAB_10= RULE_TAB ( (otherlv_11= RULE_ID ) ) this_NL_12= RULE_NL )*
                    {
                    this_TAB_6=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLayout433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TAB_6, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_0_1_5_0()); 
                          
                    }
                    otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleLayout444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getLayoutAccess().getProcedureCallsTheProceduresKeyword_0_1_5_1());
                          
                    }
                    this_NL_8=(Token)match(input,RULE_NL,FOLLOW_RULE_NL_in_ruleLayout455); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NL_8, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_0_1_5_2()); 
                          
                    }
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:238:1: (this_TAB_9= RULE_TAB this_TAB_10= RULE_TAB ( (otherlv_11= RULE_ID ) ) this_NL_12= RULE_NL )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_TAB) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==RULE_TAB) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:238:2: this_TAB_9= RULE_TAB this_TAB_10= RULE_TAB ( (otherlv_11= RULE_ID ) ) this_NL_12= RULE_NL
                    	    {
                    	    this_TAB_9=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLayout466); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_TAB_9, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_0_1_5_3_0()); 
                    	          
                    	    }
                    	    this_TAB_10=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLayout476); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_TAB_10, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_0_1_5_3_1()); 
                    	          
                    	    }
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:246:1: ( (otherlv_11= RULE_ID ) )
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:247:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:247:1: (otherlv_11= RULE_ID )
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:248:3: otherlv_11= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getLayoutRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayout495); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_11, grammarAccess.getLayoutAccess().getCallsLayoutCrossReference_0_1_5_3_2_0()); 
                    	      	
                    	    }

                    	    }


                    	    }

                    	    this_NL_12=(Token)match(input,RULE_NL,FOLLOW_RULE_NL_in_ruleLayout506); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_NL_12, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_0_1_5_3_3()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }

                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:263:4: (this_TAB_13= RULE_TAB otherlv_14= 'procedure is called by:' this_NL_15= RULE_NL (this_TAB_16= RULE_TAB this_TAB_17= RULE_TAB ( (otherlv_18= RULE_ID ) ) this_NL_19= RULE_NL )* )
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:263:5: this_TAB_13= RULE_TAB otherlv_14= 'procedure is called by:' this_NL_15= RULE_NL (this_TAB_16= RULE_TAB this_TAB_17= RULE_TAB ( (otherlv_18= RULE_ID ) ) this_NL_19= RULE_NL )*
                    {
                    this_TAB_13=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLayout520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TAB_13, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_0_1_6_0()); 
                          
                    }
                    otherlv_14=(Token)match(input,12,FOLLOW_12_in_ruleLayout531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getLayoutAccess().getProcedureIsCalledByKeyword_0_1_6_1());
                          
                    }
                    this_NL_15=(Token)match(input,RULE_NL,FOLLOW_RULE_NL_in_ruleLayout542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NL_15, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_0_1_6_2()); 
                          
                    }
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:275:1: (this_TAB_16= RULE_TAB this_TAB_17= RULE_TAB ( (otherlv_18= RULE_ID ) ) this_NL_19= RULE_NL )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_TAB) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:275:2: this_TAB_16= RULE_TAB this_TAB_17= RULE_TAB ( (otherlv_18= RULE_ID ) ) this_NL_19= RULE_NL
                    	    {
                    	    this_TAB_16=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLayout553); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_TAB_16, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_0_1_6_3_0()); 
                    	          
                    	    }
                    	    this_TAB_17=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLayout563); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_TAB_17, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_0_1_6_3_1()); 
                    	          
                    	    }
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:283:1: ( (otherlv_18= RULE_ID ) )
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:284:1: (otherlv_18= RULE_ID )
                    	    {
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:284:1: (otherlv_18= RULE_ID )
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:285:3: otherlv_18= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getLayoutRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayout582); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_18, grammarAccess.getLayoutAccess().getIsCalledLayoutCrossReference_0_1_6_3_2_0()); 
                    	      	
                    	    }

                    	    }


                    	    }

                    	    this_NL_19=(Token)match(input,RULE_NL,FOLLOW_RULE_NL_in_ruleLayout593); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_NL_19, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_0_1_6_3_3()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:301:6: ( ( ( ( ( 'No Source found for' ) ) RULE_WS ( ( RULE_ID ) ) ':' RULE_NL ( RULE_TAB 'is called by:' RULE_NL ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )* ) ) )=> ( ( (lv_missing_20_0= 'No Source found for' ) ) this_WS_21= RULE_WS ( (lv_name_22_0= RULE_ID ) ) otherlv_23= ':' this_NL_24= RULE_NL (this_TAB_25= RULE_TAB otherlv_26= 'is called by:' this_NL_27= RULE_NL (this_TAB_28= RULE_TAB this_TAB_29= RULE_TAB ( (otherlv_30= RULE_ID ) ) this_NL_31= RULE_NL )* ) ) )
                    {
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:301:6: ( ( ( ( ( 'No Source found for' ) ) RULE_WS ( ( RULE_ID ) ) ':' RULE_NL ( RULE_TAB 'is called by:' RULE_NL ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )* ) ) )=> ( ( (lv_missing_20_0= 'No Source found for' ) ) this_WS_21= RULE_WS ( (lv_name_22_0= RULE_ID ) ) otherlv_23= ':' this_NL_24= RULE_NL (this_TAB_25= RULE_TAB otherlv_26= 'is called by:' this_NL_27= RULE_NL (this_TAB_28= RULE_TAB this_TAB_29= RULE_TAB ( (otherlv_30= RULE_ID ) ) this_NL_31= RULE_NL )* ) ) )
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:301:7: ( ( ( ( 'No Source found for' ) ) RULE_WS ( ( RULE_ID ) ) ':' RULE_NL ( RULE_TAB 'is called by:' RULE_NL ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )* ) ) )=> ( ( (lv_missing_20_0= 'No Source found for' ) ) this_WS_21= RULE_WS ( (lv_name_22_0= RULE_ID ) ) otherlv_23= ':' this_NL_24= RULE_NL (this_TAB_25= RULE_TAB otherlv_26= 'is called by:' this_NL_27= RULE_NL (this_TAB_28= RULE_TAB this_TAB_29= RULE_TAB ( (otherlv_30= RULE_ID ) ) this_NL_31= RULE_NL )* ) )
                    {
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:319:17: ( ( (lv_missing_20_0= 'No Source found for' ) ) this_WS_21= RULE_WS ( (lv_name_22_0= RULE_ID ) ) otherlv_23= ':' this_NL_24= RULE_NL (this_TAB_25= RULE_TAB otherlv_26= 'is called by:' this_NL_27= RULE_NL (this_TAB_28= RULE_TAB this_TAB_29= RULE_TAB ( (otherlv_30= RULE_ID ) ) this_NL_31= RULE_NL )* ) )
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:319:18: ( (lv_missing_20_0= 'No Source found for' ) ) this_WS_21= RULE_WS ( (lv_name_22_0= RULE_ID ) ) otherlv_23= ':' this_NL_24= RULE_NL (this_TAB_25= RULE_TAB otherlv_26= 'is called by:' this_NL_27= RULE_NL (this_TAB_28= RULE_TAB this_TAB_29= RULE_TAB ( (otherlv_30= RULE_ID ) ) this_NL_31= RULE_NL )* )
                    {
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:319:18: ( (lv_missing_20_0= 'No Source found for' ) )
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:320:1: (lv_missing_20_0= 'No Source found for' )
                    {
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:320:1: (lv_missing_20_0= 'No Source found for' )
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:321:3: lv_missing_20_0= 'No Source found for'
                    {
                    lv_missing_20_0=(Token)match(input,13,FOLLOW_13_in_ruleLayout690); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_missing_20_0, grammarAccess.getLayoutAccess().getMissingNoSourceFoundForKeyword_1_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLayoutRule());
                      	        }
                             		setWithLastConsumed(current, "missing", true, "No Source found for");
                      	    
                    }

                    }


                    }

                    this_WS_21=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleLayout714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_21, grammarAccess.getLayoutAccess().getWSTerminalRuleCall_1_0_1()); 
                          
                    }
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:338:1: ( (lv_name_22_0= RULE_ID ) )
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:339:1: (lv_name_22_0= RULE_ID )
                    {
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:339:1: (lv_name_22_0= RULE_ID )
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:340:3: lv_name_22_0= RULE_ID
                    {
                    lv_name_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayout730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_22_0, grammarAccess.getLayoutAccess().getNameIDTerminalRuleCall_1_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLayoutRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_22_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_23=(Token)match(input,10,FOLLOW_10_in_ruleLayout747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getLayoutAccess().getColonKeyword_1_0_3());
                          
                    }
                    this_NL_24=(Token)match(input,RULE_NL,FOLLOW_RULE_NL_in_ruleLayout758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NL_24, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_1_0_4()); 
                          
                    }
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:364:1: (this_TAB_25= RULE_TAB otherlv_26= 'is called by:' this_NL_27= RULE_NL (this_TAB_28= RULE_TAB this_TAB_29= RULE_TAB ( (otherlv_30= RULE_ID ) ) this_NL_31= RULE_NL )* )
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:364:2: this_TAB_25= RULE_TAB otherlv_26= 'is called by:' this_NL_27= RULE_NL (this_TAB_28= RULE_TAB this_TAB_29= RULE_TAB ( (otherlv_30= RULE_ID ) ) this_NL_31= RULE_NL )*
                    {
                    this_TAB_25=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLayout769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TAB_25, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_1_0_5_0()); 
                          
                    }
                    otherlv_26=(Token)match(input,14,FOLLOW_14_in_ruleLayout780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getLayoutAccess().getIsCalledByKeyword_1_0_5_1());
                          
                    }
                    this_NL_27=(Token)match(input,RULE_NL,FOLLOW_RULE_NL_in_ruleLayout791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NL_27, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_1_0_5_2()); 
                          
                    }
                    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:376:1: (this_TAB_28= RULE_TAB this_TAB_29= RULE_TAB ( (otherlv_30= RULE_ID ) ) this_NL_31= RULE_NL )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_TAB) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:376:2: this_TAB_28= RULE_TAB this_TAB_29= RULE_TAB ( (otherlv_30= RULE_ID ) ) this_NL_31= RULE_NL
                    	    {
                    	    this_TAB_28=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLayout802); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_TAB_28, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_1_0_5_3_0()); 
                    	          
                    	    }
                    	    this_TAB_29=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLayout812); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_TAB_29, grammarAccess.getLayoutAccess().getTABTerminalRuleCall_1_0_5_3_1()); 
                    	          
                    	    }
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:384:1: ( (otherlv_30= RULE_ID ) )
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:385:1: (otherlv_30= RULE_ID )
                    	    {
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:385:1: (otherlv_30= RULE_ID )
                    	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:386:3: otherlv_30= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getLayoutRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_30=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayout831); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_30, grammarAccess.getLayoutAccess().getIsCalledLayoutCrossReference_1_0_5_3_2_0()); 
                    	      	
                    	    }

                    	    }


                    	    }

                    	    this_NL_31=(Token)match(input,RULE_NL,FOLLOW_RULE_NL_in_ruleLayout842); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_NL_31, grammarAccess.getLayoutAccess().getNLTerminalRuleCall_1_0_5_3_3()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayout"

    // $ANTLR start synpred1_InternalReportGrammar
    public final void synpred1_InternalReportGrammar_fragment() throws RecognitionException {   
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:301:7: ( ( ( ( 'No Source found for' ) ) RULE_WS ( ( RULE_ID ) ) ':' RULE_NL ( RULE_TAB 'is called by:' RULE_NL ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )* ) ) )
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:301:8: ( ( ( 'No Source found for' ) ) RULE_WS ( ( RULE_ID ) ) ':' RULE_NL ( RULE_TAB 'is called by:' RULE_NL ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )* ) )
        {
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:301:8: ( ( ( 'No Source found for' ) ) RULE_WS ( ( RULE_ID ) ) ':' RULE_NL ( RULE_TAB 'is called by:' RULE_NL ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )* ) )
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:301:9: ( ( 'No Source found for' ) ) RULE_WS ( ( RULE_ID ) ) ':' RULE_NL ( RULE_TAB 'is called by:' RULE_NL ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )* )
        {
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:301:9: ( ( 'No Source found for' ) )
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:302:1: ( 'No Source found for' )
        {
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:302:1: ( 'No Source found for' )
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:303:2: 'No Source found for'
        {
        match(input,13,FOLLOW_13_in_synpred1_InternalReportGrammar620); if (state.failed) return ;

        }


        }

        match(input,RULE_WS,FOLLOW_RULE_WS_in_synpred1_InternalReportGrammar630); if (state.failed) return ;
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:307:10: ( ( RULE_ID ) )
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:308:1: ( RULE_ID )
        {
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:308:1: ( RULE_ID )
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:309:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalReportGrammar635); if (state.failed) return ;

        }


        }

        match(input,10,FOLLOW_10_in_synpred1_InternalReportGrammar642); if (state.failed) return ;
        match(input,RULE_NL,FOLLOW_RULE_NL_in_synpred1_InternalReportGrammar646); if (state.failed) return ;
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:313:9: ( RULE_TAB 'is called by:' RULE_NL ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )* )
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:313:11: RULE_TAB 'is called by:' RULE_NL ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )*
        {
        match(input,RULE_TAB,FOLLOW_RULE_TAB_in_synpred1_InternalReportGrammar649); if (state.failed) return ;
        match(input,14,FOLLOW_14_in_synpred1_InternalReportGrammar651); if (state.failed) return ;
        match(input,RULE_NL,FOLLOW_RULE_NL_in_synpred1_InternalReportGrammar655); if (state.failed) return ;
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:314:9: ( RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL )*
        loop7:
        do {
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_TAB) ) {
                alt7=1;
            }


            switch (alt7) {
        	case 1 :
        	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:314:11: RULE_TAB RULE_TAB ( ( RULE_ID ) ) RULE_NL
        	    {
        	    match(input,RULE_TAB,FOLLOW_RULE_TAB_in_synpred1_InternalReportGrammar658); if (state.failed) return ;
        	    match(input,RULE_TAB,FOLLOW_RULE_TAB_in_synpred1_InternalReportGrammar660); if (state.failed) return ;
        	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:314:28: ( ( RULE_ID ) )
        	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:315:1: ( RULE_ID )
        	    {
        	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:315:1: ( RULE_ID )
        	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:316:2: RULE_ID
        	    {
        	    match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalReportGrammar666); if (state.failed) return ;

        	    }


        	    }

        	    match(input,RULE_NL,FOLLOW_RULE_NL_in_synpred1_InternalReportGrammar673); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop7;
            }
        } while (true);


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalReportGrammar

    // Delegated rules

    public final boolean synpred1_InternalReportGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalReportGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleWorkspace_in_entryRuleWorkspace75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkspace85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringToLayoutMapEntry_in_ruleWorkspace131 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleWorkspace160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringToLayoutMapEntry_in_entryRuleEStringToLayoutMapEntry195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringToLayoutMapEntry205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEStringToLayoutMapEntry247 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleEStringToLayoutMapEntry273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleLayout367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleLayout378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayout394 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleLayout411 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NL_in_ruleLayout422 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLayout433 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLayout444 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NL_in_ruleLayout455 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLayout466 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLayout476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayout495 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NL_in_ruleLayout506 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLayout520 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLayout531 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NL_in_ruleLayout542 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLayout553 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLayout563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayout582 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NL_in_ruleLayout593 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_13_in_ruleLayout690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleLayout714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayout730 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleLayout747 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NL_in_ruleLayout758 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLayout769 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLayout780 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NL_in_ruleLayout791 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLayout802 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLayout812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayout831 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NL_in_ruleLayout842 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_13_in_synpred1_InternalReportGrammar620 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WS_in_synpred1_InternalReportGrammar630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalReportGrammar635 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_synpred1_InternalReportGrammar642 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NL_in_synpred1_InternalReportGrammar646 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TAB_in_synpred1_InternalReportGrammar649 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred1_InternalReportGrammar651 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NL_in_synpred1_InternalReportGrammar655 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_TAB_in_synpred1_InternalReportGrammar658 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TAB_in_synpred1_InternalReportGrammar660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalReportGrammar666 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NL_in_synpred1_InternalReportGrammar673 = new BitSet(new long[]{0x0000000000000082L});

}