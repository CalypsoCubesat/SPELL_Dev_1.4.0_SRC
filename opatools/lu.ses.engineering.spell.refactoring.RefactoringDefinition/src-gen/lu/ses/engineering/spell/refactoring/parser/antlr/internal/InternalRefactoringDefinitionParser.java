package lu.ses.engineering.spell.refactoring.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lu.ses.engineering.spell.refactoring.services.RefactoringDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRefactoringDefinitionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALUE", "RULE_WS", "RULE_NL"
    };
    public static final int RULE_VALUE=4;
    public static final int RULE_WS=5;
    public static final int RULE_NL=6;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalRefactoringDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRefactoringDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRefactoringDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRefactoringDefinition.g"; }



     	private RefactoringDefinitionGrammarAccess grammarAccess;
     	
        public InternalRefactoringDefinitionParser(TokenStream input, RefactoringDefinitionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Refactorings";	
       	}
       	
       	@Override
       	protected RefactoringDefinitionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRefactorings"
    // InternalRefactoringDefinition.g:67:1: entryRuleRefactorings returns [EObject current=null] : iv_ruleRefactorings= ruleRefactorings EOF ;
    public final EObject entryRuleRefactorings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefactorings = null;


        try {
            // InternalRefactoringDefinition.g:68:2: (iv_ruleRefactorings= ruleRefactorings EOF )
            // InternalRefactoringDefinition.g:69:2: iv_ruleRefactorings= ruleRefactorings EOF
            {
             newCompositeNode(grammarAccess.getRefactoringsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRefactorings=ruleRefactorings();

            state._fsp--;

             current =iv_ruleRefactorings; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleRefactorings"


    // $ANTLR start "ruleRefactorings"
    // InternalRefactoringDefinition.g:76:1: ruleRefactorings returns [EObject current=null] : ( (lv_refactorings_0_0= rulerefactorMapEntry ) )+ ;
    public final EObject ruleRefactorings() throws RecognitionException {
        EObject current = null;

        EObject lv_refactorings_0_0 = null;


         enterRule(); 
            
        try {
            // InternalRefactoringDefinition.g:79:28: ( ( (lv_refactorings_0_0= rulerefactorMapEntry ) )+ )
            // InternalRefactoringDefinition.g:80:1: ( (lv_refactorings_0_0= rulerefactorMapEntry ) )+
            {
            // InternalRefactoringDefinition.g:80:1: ( (lv_refactorings_0_0= rulerefactorMapEntry ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_VALUE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRefactoringDefinition.g:81:1: (lv_refactorings_0_0= rulerefactorMapEntry )
            	    {
            	    // InternalRefactoringDefinition.g:81:1: (lv_refactorings_0_0= rulerefactorMapEntry )
            	    // InternalRefactoringDefinition.g:82:3: lv_refactorings_0_0= rulerefactorMapEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRefactoringsAccess().getRefactoringsRefactorMapEntryParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_refactorings_0_0=rulerefactorMapEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRefactoringsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"refactorings",
            	            		lv_refactorings_0_0, 
            	            		"lu.ses.engineering.spell.refactoring.RefactoringDefinition.refactorMapEntry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefactorings"


    // $ANTLR start "entryRulerefactorMapEntry"
    // InternalRefactoringDefinition.g:106:1: entryRulerefactorMapEntry returns [EObject current=null] : iv_rulerefactorMapEntry= rulerefactorMapEntry EOF ;
    public final EObject entryRulerefactorMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerefactorMapEntry = null;


        try {
            // InternalRefactoringDefinition.g:107:2: (iv_rulerefactorMapEntry= rulerefactorMapEntry EOF )
            // InternalRefactoringDefinition.g:108:2: iv_rulerefactorMapEntry= rulerefactorMapEntry EOF
            {
             newCompositeNode(grammarAccess.getRefactorMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulerefactorMapEntry=rulerefactorMapEntry();

            state._fsp--;

             current =iv_rulerefactorMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulerefactorMapEntry"


    // $ANTLR start "rulerefactorMapEntry"
    // InternalRefactoringDefinition.g:115:1: rulerefactorMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_VALUE ) ) this_WS_1= RULE_WS ( (lv_value_2_0= RULE_VALUE ) ) (this_NL_3= RULE_NL )? ) ;
    public final EObject rulerefactorMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token this_WS_1=null;
        Token lv_value_2_0=null;
        Token this_NL_3=null;

         enterRule(); 
            
        try {
            // InternalRefactoringDefinition.g:118:28: ( ( ( (lv_key_0_0= RULE_VALUE ) ) this_WS_1= RULE_WS ( (lv_value_2_0= RULE_VALUE ) ) (this_NL_3= RULE_NL )? ) )
            // InternalRefactoringDefinition.g:119:1: ( ( (lv_key_0_0= RULE_VALUE ) ) this_WS_1= RULE_WS ( (lv_value_2_0= RULE_VALUE ) ) (this_NL_3= RULE_NL )? )
            {
            // InternalRefactoringDefinition.g:119:1: ( ( (lv_key_0_0= RULE_VALUE ) ) this_WS_1= RULE_WS ( (lv_value_2_0= RULE_VALUE ) ) (this_NL_3= RULE_NL )? )
            // InternalRefactoringDefinition.g:119:2: ( (lv_key_0_0= RULE_VALUE ) ) this_WS_1= RULE_WS ( (lv_value_2_0= RULE_VALUE ) ) (this_NL_3= RULE_NL )?
            {
            // InternalRefactoringDefinition.g:119:2: ( (lv_key_0_0= RULE_VALUE ) )
            // InternalRefactoringDefinition.g:120:1: (lv_key_0_0= RULE_VALUE )
            {
            // InternalRefactoringDefinition.g:120:1: (lv_key_0_0= RULE_VALUE )
            // InternalRefactoringDefinition.g:121:3: lv_key_0_0= RULE_VALUE
            {
            lv_key_0_0=(Token)match(input,RULE_VALUE,FollowSets000.FOLLOW_4); 

            			newLeafNode(lv_key_0_0, grammarAccess.getRefactorMapEntryAccess().getKeyVALUETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefactorMapEntryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"lu.ses.engineering.spell.refactoring.RefactoringDefinition.VALUE");
            	    

            }


            }

            this_WS_1=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_5); 
             
                newLeafNode(this_WS_1, grammarAccess.getRefactorMapEntryAccess().getWSTerminalRuleCall_1()); 
                
            // InternalRefactoringDefinition.g:141:1: ( (lv_value_2_0= RULE_VALUE ) )
            // InternalRefactoringDefinition.g:142:1: (lv_value_2_0= RULE_VALUE )
            {
            // InternalRefactoringDefinition.g:142:1: (lv_value_2_0= RULE_VALUE )
            // InternalRefactoringDefinition.g:143:3: lv_value_2_0= RULE_VALUE
            {
            lv_value_2_0=(Token)match(input,RULE_VALUE,FollowSets000.FOLLOW_6); 

            			newLeafNode(lv_value_2_0, grammarAccess.getRefactorMapEntryAccess().getValueVALUETerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefactorMapEntryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"lu.ses.engineering.spell.refactoring.RefactoringDefinition.VALUE");
            	    

            }


            }

            // InternalRefactoringDefinition.g:159:2: (this_NL_3= RULE_NL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRefactoringDefinition.g:159:3: this_NL_3= RULE_NL
                    {
                    this_NL_3=(Token)match(input,RULE_NL,FollowSets000.FOLLOW_2); 
                     
                        newLeafNode(this_NL_3, grammarAccess.getRefactorMapEntryAccess().getNLTerminalRuleCall_3()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerefactorMapEntry"


    // $ANTLR start "entryRuleargRefactor"
    // InternalRefactoringDefinition.g:173:1: entryRuleargRefactor returns [EObject current=null] : iv_ruleargRefactor= ruleargRefactor EOF ;
    public final EObject entryRuleargRefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleargRefactor = null;


        try {
            // InternalRefactoringDefinition.g:174:2: (iv_ruleargRefactor= ruleargRefactor EOF )
            // InternalRefactoringDefinition.g:175:2: iv_ruleargRefactor= ruleargRefactor EOF
            {
             newCompositeNode(grammarAccess.getArgRefactorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleargRefactor=ruleargRefactor();

            state._fsp--;

             current =iv_ruleargRefactor; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleargRefactor"


    // $ANTLR start "ruleargRefactor"
    // InternalRefactoringDefinition.g:182:1: ruleargRefactor returns [EObject current=null] : ( ( (lv_mnem_0_0= RULE_VALUE ) ) this_WS_1= RULE_WS ( (lv_raw_2_0= RULE_VALUE ) ) ) ;
    public final EObject ruleargRefactor() throws RecognitionException {
        EObject current = null;

        Token lv_mnem_0_0=null;
        Token this_WS_1=null;
        Token lv_raw_2_0=null;

         enterRule(); 
            
        try {
            // InternalRefactoringDefinition.g:185:28: ( ( ( (lv_mnem_0_0= RULE_VALUE ) ) this_WS_1= RULE_WS ( (lv_raw_2_0= RULE_VALUE ) ) ) )
            // InternalRefactoringDefinition.g:186:1: ( ( (lv_mnem_0_0= RULE_VALUE ) ) this_WS_1= RULE_WS ( (lv_raw_2_0= RULE_VALUE ) ) )
            {
            // InternalRefactoringDefinition.g:186:1: ( ( (lv_mnem_0_0= RULE_VALUE ) ) this_WS_1= RULE_WS ( (lv_raw_2_0= RULE_VALUE ) ) )
            // InternalRefactoringDefinition.g:186:2: ( (lv_mnem_0_0= RULE_VALUE ) ) this_WS_1= RULE_WS ( (lv_raw_2_0= RULE_VALUE ) )
            {
            // InternalRefactoringDefinition.g:186:2: ( (lv_mnem_0_0= RULE_VALUE ) )
            // InternalRefactoringDefinition.g:187:1: (lv_mnem_0_0= RULE_VALUE )
            {
            // InternalRefactoringDefinition.g:187:1: (lv_mnem_0_0= RULE_VALUE )
            // InternalRefactoringDefinition.g:188:3: lv_mnem_0_0= RULE_VALUE
            {
            lv_mnem_0_0=(Token)match(input,RULE_VALUE,FollowSets000.FOLLOW_4); 

            			newLeafNode(lv_mnem_0_0, grammarAccess.getArgRefactorAccess().getMnemVALUETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArgRefactorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"mnem",
                    		lv_mnem_0_0, 
                    		"lu.ses.engineering.spell.refactoring.RefactoringDefinition.VALUE");
            	    

            }


            }

            this_WS_1=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_5); 
             
                newLeafNode(this_WS_1, grammarAccess.getArgRefactorAccess().getWSTerminalRuleCall_1()); 
                
            // InternalRefactoringDefinition.g:208:1: ( (lv_raw_2_0= RULE_VALUE ) )
            // InternalRefactoringDefinition.g:209:1: (lv_raw_2_0= RULE_VALUE )
            {
            // InternalRefactoringDefinition.g:209:1: (lv_raw_2_0= RULE_VALUE )
            // InternalRefactoringDefinition.g:210:3: lv_raw_2_0= RULE_VALUE
            {
            lv_raw_2_0=(Token)match(input,RULE_VALUE,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_raw_2_0, grammarAccess.getArgRefactorAccess().getRawVALUETerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArgRefactorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"raw",
                    		lv_raw_2_0, 
                    		"lu.ses.engineering.spell.refactoring.RefactoringDefinition.VALUE");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleargRefactor"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000042L});
    }


}