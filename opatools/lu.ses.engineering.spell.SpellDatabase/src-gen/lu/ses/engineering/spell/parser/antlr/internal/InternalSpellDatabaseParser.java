package lu.ses.engineering.spell.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lu.ses.engineering.spell.services.SpellDatabaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSpellDatabaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ASTRIUM_COMMENT", "RULE_DOLLAR", "RULE_COLON", "RULE_NL", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_CMD", "RULE_STATE_EXPR", "RULE_BIN_HEX_OCT", "RULE_PLUS", "RULE_MINUS", "RULE_FLOAT", "RULE_BOOL_EXPR", "RULE_STRING", "RULE_TM", "RULE_SPELL", "RULE_WAIT", "RULE_TIME_EXPR", "RULE_PAUSE", "RULE_INT", "RULE_LAMBDA", "RULE_ID", "RULE_ANY_OTHER", "'FILE_HEADER'", "'END_FILE_HEADER'", "'='", "','", "'*'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\\\\'", "'/'", "'.'"
    };
    public static final int RULE_BOOL_EXPR=17;
    public static final int RULE_STATE_EXPR=12;
    public static final int RULE_DOLLAR=5;
    public static final int RULE_TM=19;
    public static final int RULE_STRING=18;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_LAMBDA=25;
    public static final int T__38=38;
    public static final int RULE_TIME_EXPR=22;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_PLUS=14;
    public static final int T__36=36;
    public static final int RULE_PAUSE=23;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_BIN_HEX_OCT=13;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=26;
    public static final int RULE_WS=8;
    public static final int RULE_COLON=6;
    public static final int RULE_ANY_OTHER=27;
    public static final int RULE_CMD=11;
    public static final int RULE_MINUS=15;
    public static final int RULE_WAIT=21;
    public static final int T__28=28;
    public static final int RULE_INT=24;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_FLOAT=16;
    public static final int RULE_ASTRIUM_COMMENT=4;
    public static final int RULE_NL=7;
    public static final int T__40=40;
    public static final int RULE_SPELL=20;
    public static final int T__41=41;

    // delegates
    // delegators


        public InternalSpellDatabaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpellDatabaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpellDatabaseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpellDatabase.g"; }



     	private SpellDatabaseGrammarAccess grammarAccess;
     	
        public InternalSpellDatabaseParser(TokenStream input, SpellDatabaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SpellDatabase";	
       	}
       	
       	@Override
       	protected SpellDatabaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSpellDatabase"
    // InternalSpellDatabase.g:69:1: entryRuleSpellDatabase returns [EObject current=null] : iv_ruleSpellDatabase= ruleSpellDatabase EOF ;
    public final EObject entryRuleSpellDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpellDatabase = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ANY_OTHER", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:73:2: (iv_ruleSpellDatabase= ruleSpellDatabase EOF )
            // InternalSpellDatabase.g:74:2: iv_ruleSpellDatabase= ruleSpellDatabase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpellDatabaseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpellDatabase=ruleSpellDatabase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpellDatabase; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSpellDatabase"


    // $ANTLR start "ruleSpellDatabase"
    // InternalSpellDatabase.g:84:1: ruleSpellDatabase returns [EObject current=null] : ( ruleSkipNLAndComments ( ( () otherlv_2= 'FILE_HEADER' ruleSkipNLAndComments ( (lv_database_4_0= ruleAstriumDatabase ) ) ) | ( () ( ( (lv_databaseEntry_6_0= ruleDatabaseEntry ) ) ( ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )? )* ruleSkipNLAndComments ) ) | ( () ( (lv_csvEntries_11_0= ruleCSVEntry ) ) ( ruleSkipNLAndComments2 )? ( ( ruleSkipNLAndComments2 )? ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) ) )* ruleSkipNLAndComments ) ) ) ;
    public final EObject ruleSpellDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_database_4_0 = null;

        EObject lv_databaseEntry_6_0 = null;

        EObject lv_databaseEntry_8_0 = null;

        EObject lv_csvEntries_11_0 = null;

        EObject lv_csvEntries_14_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ANY_OTHER", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:88:28: ( ( ruleSkipNLAndComments ( ( () otherlv_2= 'FILE_HEADER' ruleSkipNLAndComments ( (lv_database_4_0= ruleAstriumDatabase ) ) ) | ( () ( ( (lv_databaseEntry_6_0= ruleDatabaseEntry ) ) ( ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )? )* ruleSkipNLAndComments ) ) | ( () ( (lv_csvEntries_11_0= ruleCSVEntry ) ) ( ruleSkipNLAndComments2 )? ( ( ruleSkipNLAndComments2 )? ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) ) )* ruleSkipNLAndComments ) ) ) )
            // InternalSpellDatabase.g:89:1: ( ruleSkipNLAndComments ( ( () otherlv_2= 'FILE_HEADER' ruleSkipNLAndComments ( (lv_database_4_0= ruleAstriumDatabase ) ) ) | ( () ( ( (lv_databaseEntry_6_0= ruleDatabaseEntry ) ) ( ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )? )* ruleSkipNLAndComments ) ) | ( () ( (lv_csvEntries_11_0= ruleCSVEntry ) ) ( ruleSkipNLAndComments2 )? ( ( ruleSkipNLAndComments2 )? ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) ) )* ruleSkipNLAndComments ) ) )
            {
            // InternalSpellDatabase.g:89:1: ( ruleSkipNLAndComments ( ( () otherlv_2= 'FILE_HEADER' ruleSkipNLAndComments ( (lv_database_4_0= ruleAstriumDatabase ) ) ) | ( () ( ( (lv_databaseEntry_6_0= ruleDatabaseEntry ) ) ( ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )? )* ruleSkipNLAndComments ) ) | ( () ( (lv_csvEntries_11_0= ruleCSVEntry ) ) ( ruleSkipNLAndComments2 )? ( ( ruleSkipNLAndComments2 )? ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) ) )* ruleSkipNLAndComments ) ) )
            // InternalSpellDatabase.g:90:5: ruleSkipNLAndComments ( ( () otherlv_2= 'FILE_HEADER' ruleSkipNLAndComments ( (lv_database_4_0= ruleAstriumDatabase ) ) ) | ( () ( ( (lv_databaseEntry_6_0= ruleDatabaseEntry ) ) ( ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )? )* ruleSkipNLAndComments ) ) | ( () ( (lv_csvEntries_11_0= ruleCSVEntry ) ) ( ruleSkipNLAndComments2 )? ( ( ruleSkipNLAndComments2 )? ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) ) )* ruleSkipNLAndComments ) )
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSpellDatabaseAccess().getSkipNLAndCommentsParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_3);
            ruleSkipNLAndComments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpellDatabase.g:97:1: ( ( () otherlv_2= 'FILE_HEADER' ruleSkipNLAndComments ( (lv_database_4_0= ruleAstriumDatabase ) ) ) | ( () ( ( (lv_databaseEntry_6_0= ruleDatabaseEntry ) ) ( ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )? )* ruleSkipNLAndComments ) ) | ( () ( (lv_csvEntries_11_0= ruleCSVEntry ) ) ( ruleSkipNLAndComments2 )? ( ( ruleSkipNLAndComments2 )? ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) ) )* ruleSkipNLAndComments ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalSpellDatabase.g:97:2: ( () otherlv_2= 'FILE_HEADER' ruleSkipNLAndComments ( (lv_database_4_0= ruleAstriumDatabase ) ) )
                    {
                    // InternalSpellDatabase.g:97:2: ( () otherlv_2= 'FILE_HEADER' ruleSkipNLAndComments ( (lv_database_4_0= ruleAstriumDatabase ) ) )
                    // InternalSpellDatabase.g:97:3: () otherlv_2= 'FILE_HEADER' ruleSkipNLAndComments ( (lv_database_4_0= ruleAstriumDatabase ) )
                    {
                    // InternalSpellDatabase.g:97:3: ()
                    // InternalSpellDatabase.g:98:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSpellDatabaseAccess().getAstriumSpellDatabaseAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSpellDatabaseAccess().getFILE_HEADERKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpellDatabaseAccess().getSkipNLAndCommentsParserRuleCall_1_0_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    ruleSkipNLAndComments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSpellDatabase.g:115:1: ( (lv_database_4_0= ruleAstriumDatabase ) )
                    // InternalSpellDatabase.g:116:1: (lv_database_4_0= ruleAstriumDatabase )
                    {
                    // InternalSpellDatabase.g:116:1: (lv_database_4_0= ruleAstriumDatabase )
                    // InternalSpellDatabase.g:117:3: lv_database_4_0= ruleAstriumDatabase
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSpellDatabaseAccess().getDatabaseAstriumDatabaseParserRuleCall_1_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_database_4_0=ruleAstriumDatabase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSpellDatabaseRule());
                      	        }
                             		set(
                             			current, 
                             			"database",
                              		lv_database_4_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.AstriumDatabase");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:134:6: ( () ( ( (lv_databaseEntry_6_0= ruleDatabaseEntry ) ) ( ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )? )* ruleSkipNLAndComments ) )
                    {
                    // InternalSpellDatabase.g:134:6: ( () ( ( (lv_databaseEntry_6_0= ruleDatabaseEntry ) ) ( ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )? )* ruleSkipNLAndComments ) )
                    // InternalSpellDatabase.g:134:7: () ( ( (lv_databaseEntry_6_0= ruleDatabaseEntry ) ) ( ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )? )* ruleSkipNLAndComments )
                    {
                    // InternalSpellDatabase.g:134:7: ()
                    // InternalSpellDatabase.g:135:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSpellDatabaseAccess().getSpellDatabaseAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpellDatabase.g:140:2: ( ( (lv_databaseEntry_6_0= ruleDatabaseEntry ) ) ( ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )? )* ruleSkipNLAndComments )
                    // InternalSpellDatabase.g:140:3: ( (lv_databaseEntry_6_0= ruleDatabaseEntry ) ) ( ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )? )* ruleSkipNLAndComments
                    {
                    // InternalSpellDatabase.g:140:3: ( (lv_databaseEntry_6_0= ruleDatabaseEntry ) )
                    // InternalSpellDatabase.g:141:1: (lv_databaseEntry_6_0= ruleDatabaseEntry )
                    {
                    // InternalSpellDatabase.g:141:1: (lv_databaseEntry_6_0= ruleDatabaseEntry )
                    // InternalSpellDatabase.g:142:3: lv_databaseEntry_6_0= ruleDatabaseEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSpellDatabaseAccess().getDatabaseEntryDatabaseEntryParserRuleCall_1_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_databaseEntry_6_0=ruleDatabaseEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSpellDatabaseRule());
                      	        }
                             		add(
                             			current, 
                             			"databaseEntry",
                              		lv_databaseEntry_6_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.DatabaseEntry");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpellDatabase.g:158:2: ( ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )? )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_NL) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSpellDatabase.g:159:5: ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )?
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getSpellDatabaseAccess().getSkipNLAndComments2ParserRuleCall_1_1_1_1_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    ruleSkipNLAndComments2();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }
                    	    // InternalSpellDatabase.g:166:1: ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )?
                    	    int alt1=2;
                    	    alt1 = dfa1.predict(input);
                    	    switch (alt1) {
                    	        case 1 :
                    	            // InternalSpellDatabase.g:167:1: (lv_databaseEntry_8_0= ruleDatabaseEntry )
                    	            {
                    	            // InternalSpellDatabase.g:167:1: (lv_databaseEntry_8_0= ruleDatabaseEntry )
                    	            // InternalSpellDatabase.g:168:3: lv_databaseEntry_8_0= ruleDatabaseEntry
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getSpellDatabaseAccess().getDatabaseEntryDatabaseEntryParserRuleCall_1_1_1_1_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_5);
                    	            lv_databaseEntry_8_0=ruleDatabaseEntry();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getSpellDatabaseRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"databaseEntry",
                    	                      		lv_databaseEntry_8_0, 
                    	                      		"lu.ses.engineering.spell.SpellDatabase.DatabaseEntry");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpellDatabaseAccess().getSkipNLAndCommentsParserRuleCall_1_1_1_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSkipNLAndComments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpellDatabase.g:193:6: ( () ( (lv_csvEntries_11_0= ruleCSVEntry ) ) ( ruleSkipNLAndComments2 )? ( ( ruleSkipNLAndComments2 )? ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) ) )* ruleSkipNLAndComments )
                    {
                    // InternalSpellDatabase.g:193:6: ( () ( (lv_csvEntries_11_0= ruleCSVEntry ) ) ( ruleSkipNLAndComments2 )? ( ( ruleSkipNLAndComments2 )? ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) ) )* ruleSkipNLAndComments )
                    // InternalSpellDatabase.g:193:7: () ( (lv_csvEntries_11_0= ruleCSVEntry ) ) ( ruleSkipNLAndComments2 )? ( ( ruleSkipNLAndComments2 )? ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) ) )* ruleSkipNLAndComments
                    {
                    // InternalSpellDatabase.g:193:7: ()
                    // InternalSpellDatabase.g:194:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSpellDatabaseAccess().getCSVFileAction_1_2_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpellDatabase.g:199:2: ( (lv_csvEntries_11_0= ruleCSVEntry ) )
                    // InternalSpellDatabase.g:200:1: (lv_csvEntries_11_0= ruleCSVEntry )
                    {
                    // InternalSpellDatabase.g:200:1: (lv_csvEntries_11_0= ruleCSVEntry )
                    // InternalSpellDatabase.g:201:3: lv_csvEntries_11_0= ruleCSVEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSpellDatabaseAccess().getCsvEntriesCSVEntryParserRuleCall_1_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_csvEntries_11_0=ruleCSVEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSpellDatabaseRule());
                      	        }
                             		add(
                             			current, 
                             			"csvEntries",
                              		lv_csvEntries_11_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.CSVEntry");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpellDatabase.g:217:2: ( ruleSkipNLAndComments2 )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_NL) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSpellDatabase.g:218:5: ruleSkipNLAndComments2
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getSpellDatabaseAccess().getSkipNLAndComments2ParserRuleCall_1_2_2()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_7);
                            ruleSkipNLAndComments2();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // InternalSpellDatabase.g:225:3: ( ( ruleSkipNLAndComments2 )? ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        alt5 = dfa5.predict(input);
                        switch (alt5) {
                    	case 1 :
                    	    // InternalSpellDatabase.g:225:4: ( ruleSkipNLAndComments2 )? ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) )
                    	    {
                    	    // InternalSpellDatabase.g:225:4: ( ruleSkipNLAndComments2 )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==RULE_NL) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // InternalSpellDatabase.g:226:5: ruleSkipNLAndComments2
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                      newCompositeNode(grammarAccess.getSpellDatabaseAccess().getSkipNLAndComments2ParserRuleCall_1_2_3_0()); 
                    	                  
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_3);
                    	            ruleSkipNLAndComments2();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                      afterParserOrEnumRuleCall();
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // InternalSpellDatabase.g:233:3: ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) )
                    	    // InternalSpellDatabase.g:233:4: ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry )
                    	    {
                    	    // InternalSpellDatabase.g:238:1: (lv_csvEntries_14_0= ruleCSVEntry )
                    	    // InternalSpellDatabase.g:239:3: lv_csvEntries_14_0= ruleCSVEntry
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSpellDatabaseAccess().getCsvEntriesCSVEntryParserRuleCall_1_2_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_csvEntries_14_0=ruleCSVEntry();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSpellDatabaseRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"csvEntries",
                    	              		lv_csvEntries_14_0, 
                    	              		"lu.ses.engineering.spell.SpellDatabase.CSVEntry");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpellDatabaseAccess().getSkipNLAndCommentsParserRuleCall_1_2_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSkipNLAndComments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSpellDatabase"


    // $ANTLR start "entryRuleAstriumDatabase"
    // InternalSpellDatabase.g:274:1: entryRuleAstriumDatabase returns [EObject current=null] : iv_ruleAstriumDatabase= ruleAstriumDatabase EOF ;
    public final EObject entryRuleAstriumDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAstriumDatabase = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:278:2: (iv_ruleAstriumDatabase= ruleAstriumDatabase EOF )
            // InternalSpellDatabase.g:279:2: iv_ruleAstriumDatabase= ruleAstriumDatabase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAstriumDatabaseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAstriumDatabase=ruleAstriumDatabase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAstriumDatabase; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAstriumDatabase"


    // $ANTLR start "ruleAstriumDatabase"
    // InternalSpellDatabase.g:289:1: ruleAstriumDatabase returns [EObject current=null] : ( () ( ( (lv_entries_1_0= ruleAstriumHeaderEntry ) ) ruleSkipNLAndComments )* otherlv_3= 'END_FILE_HEADER' ruleSkipNLAndComments ( ( (lv_entries_5_0= ruleAstriumVariableEntry ) ) ruleSkipNLAndComments )* ) ;
    public final EObject ruleAstriumDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_5_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:293:28: ( ( () ( ( (lv_entries_1_0= ruleAstriumHeaderEntry ) ) ruleSkipNLAndComments )* otherlv_3= 'END_FILE_HEADER' ruleSkipNLAndComments ( ( (lv_entries_5_0= ruleAstriumVariableEntry ) ) ruleSkipNLAndComments )* ) )
            // InternalSpellDatabase.g:294:1: ( () ( ( (lv_entries_1_0= ruleAstriumHeaderEntry ) ) ruleSkipNLAndComments )* otherlv_3= 'END_FILE_HEADER' ruleSkipNLAndComments ( ( (lv_entries_5_0= ruleAstriumVariableEntry ) ) ruleSkipNLAndComments )* )
            {
            // InternalSpellDatabase.g:294:1: ( () ( ( (lv_entries_1_0= ruleAstriumHeaderEntry ) ) ruleSkipNLAndComments )* otherlv_3= 'END_FILE_HEADER' ruleSkipNLAndComments ( ( (lv_entries_5_0= ruleAstriumVariableEntry ) ) ruleSkipNLAndComments )* )
            // InternalSpellDatabase.g:294:2: () ( ( (lv_entries_1_0= ruleAstriumHeaderEntry ) ) ruleSkipNLAndComments )* otherlv_3= 'END_FILE_HEADER' ruleSkipNLAndComments ( ( (lv_entries_5_0= ruleAstriumVariableEntry ) ) ruleSkipNLAndComments )*
            {
            // InternalSpellDatabase.g:294:2: ()
            // InternalSpellDatabase.g:295:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAstriumDatabaseAccess().getAstriumDatabaseAction_0(),
                          current);
                  
            }

            }

            // InternalSpellDatabase.g:300:2: ( ( (lv_entries_1_0= ruleAstriumHeaderEntry ) ) ruleSkipNLAndComments )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ASTRIUM_COMMENT||LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSpellDatabase.g:300:3: ( (lv_entries_1_0= ruleAstriumHeaderEntry ) ) ruleSkipNLAndComments
            	    {
            	    // InternalSpellDatabase.g:300:3: ( (lv_entries_1_0= ruleAstriumHeaderEntry ) )
            	    // InternalSpellDatabase.g:301:1: (lv_entries_1_0= ruleAstriumHeaderEntry )
            	    {
            	    // InternalSpellDatabase.g:301:1: (lv_entries_1_0= ruleAstriumHeaderEntry )
            	    // InternalSpellDatabase.g:302:3: lv_entries_1_0= ruleAstriumHeaderEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAstriumDatabaseAccess().getEntriesAstriumHeaderEntryParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_entries_1_0=ruleAstriumHeaderEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAstriumDatabaseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entries",
            	              		lv_entries_1_0, 
            	              		"lu.ses.engineering.spell.SpellDatabase.AstriumHeaderEntry");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getAstriumDatabaseAccess().getSkipNLAndCommentsParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    ruleSkipNLAndComments();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAstriumDatabaseAccess().getEND_FILE_HEADERKeyword_2());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAstriumDatabaseAccess().getSkipNLAndCommentsParserRuleCall_3()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_10);
            ruleSkipNLAndComments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpellDatabase.g:338:1: ( ( (lv_entries_5_0= ruleAstriumVariableEntry ) ) ruleSkipNLAndComments )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ASTRIUM_COMMENT && LA8_0<=RULE_DOLLAR)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSpellDatabase.g:338:2: ( (lv_entries_5_0= ruleAstriumVariableEntry ) ) ruleSkipNLAndComments
            	    {
            	    // InternalSpellDatabase.g:338:2: ( (lv_entries_5_0= ruleAstriumVariableEntry ) )
            	    // InternalSpellDatabase.g:339:1: (lv_entries_5_0= ruleAstriumVariableEntry )
            	    {
            	    // InternalSpellDatabase.g:339:1: (lv_entries_5_0= ruleAstriumVariableEntry )
            	    // InternalSpellDatabase.g:340:3: lv_entries_5_0= ruleAstriumVariableEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAstriumDatabaseAccess().getEntriesAstriumVariableEntryParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_entries_5_0=ruleAstriumVariableEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAstriumDatabaseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entries",
            	              		lv_entries_5_0, 
            	              		"lu.ses.engineering.spell.SpellDatabase.AstriumVariableEntry");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getAstriumDatabaseAccess().getSkipNLAndCommentsParserRuleCall_4_1()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    ruleSkipNLAndComments();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAstriumDatabase"


    // $ANTLR start "entryRuleAstriumVariableEntry"
    // InternalSpellDatabase.g:375:1: entryRuleAstriumVariableEntry returns [EObject current=null] : iv_ruleAstriumVariableEntry= ruleAstriumVariableEntry EOF ;
    public final EObject entryRuleAstriumVariableEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAstriumVariableEntry = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:379:2: (iv_ruleAstriumVariableEntry= ruleAstriumVariableEntry EOF )
            // InternalSpellDatabase.g:380:2: iv_ruleAstriumVariableEntry= ruleAstriumVariableEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAstriumVariableEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAstriumVariableEntry=ruleAstriumVariableEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAstriumVariableEntry; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAstriumVariableEntry"


    // $ANTLR start "ruleAstriumVariableEntry"
    // InternalSpellDatabase.g:390:1: ruleAstriumVariableEntry returns [EObject current=null] : ( ( () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) ) ) | ( () this_DOLLAR_3= RULE_DOLLAR ( (lv_name_4_0= ruleASTRIUM_ID ) ) this_COLON_5= RULE_COLON otherlv_6= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_7_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_8_0= ruleAtom ) ) | ( (lv_simpleValue_9_0= ruleSINGLE_VALUE ) ) )? ) ) ;
    public final EObject ruleAstriumVariableEntry() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token this_DOLLAR_3=null;
        Token this_COLON_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_astriumTime_7_0 = null;

        EObject lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_simpleValue_9_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:394:28: ( ( ( () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) ) ) | ( () this_DOLLAR_3= RULE_DOLLAR ( (lv_name_4_0= ruleASTRIUM_ID ) ) this_COLON_5= RULE_COLON otherlv_6= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_7_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_8_0= ruleAtom ) ) | ( (lv_simpleValue_9_0= ruleSINGLE_VALUE ) ) )? ) ) )
            // InternalSpellDatabase.g:395:1: ( ( () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) ) ) | ( () this_DOLLAR_3= RULE_DOLLAR ( (lv_name_4_0= ruleASTRIUM_ID ) ) this_COLON_5= RULE_COLON otherlv_6= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_7_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_8_0= ruleAtom ) ) | ( (lv_simpleValue_9_0= ruleSINGLE_VALUE ) ) )? ) )
            {
            // InternalSpellDatabase.g:395:1: ( ( () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) ) ) | ( () this_DOLLAR_3= RULE_DOLLAR ( (lv_name_4_0= ruleASTRIUM_ID ) ) this_COLON_5= RULE_COLON otherlv_6= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_7_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_8_0= ruleAtom ) ) | ( (lv_simpleValue_9_0= ruleSINGLE_VALUE ) ) )? ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ASTRIUM_COMMENT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_DOLLAR) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpellDatabase.g:395:2: ( () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) ) )
                    {
                    // InternalSpellDatabase.g:395:2: ( () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) ) )
                    // InternalSpellDatabase.g:395:3: () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) )
                    {
                    // InternalSpellDatabase.g:395:3: ()
                    // InternalSpellDatabase.g:396:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAstriumVariableEntryAccess().getAstriumVariableCommentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpellDatabase.g:401:2: ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) )
                    // InternalSpellDatabase.g:402:1: (lv_comment_1_0= RULE_ASTRIUM_COMMENT )
                    {
                    // InternalSpellDatabase.g:402:1: (lv_comment_1_0= RULE_ASTRIUM_COMMENT )
                    // InternalSpellDatabase.g:403:3: lv_comment_1_0= RULE_ASTRIUM_COMMENT
                    {
                    lv_comment_1_0=(Token)match(input,RULE_ASTRIUM_COMMENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_1_0, grammarAccess.getAstriumVariableEntryAccess().getCommentASTRIUM_COMMENTTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAstriumVariableEntryRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_1_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.ASTRIUM_COMMENT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:420:6: ( () this_DOLLAR_3= RULE_DOLLAR ( (lv_name_4_0= ruleASTRIUM_ID ) ) this_COLON_5= RULE_COLON otherlv_6= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_7_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_8_0= ruleAtom ) ) | ( (lv_simpleValue_9_0= ruleSINGLE_VALUE ) ) )? )
                    {
                    // InternalSpellDatabase.g:420:6: ( () this_DOLLAR_3= RULE_DOLLAR ( (lv_name_4_0= ruleASTRIUM_ID ) ) this_COLON_5= RULE_COLON otherlv_6= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_7_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_8_0= ruleAtom ) ) | ( (lv_simpleValue_9_0= ruleSINGLE_VALUE ) ) )? )
                    // InternalSpellDatabase.g:420:7: () this_DOLLAR_3= RULE_DOLLAR ( (lv_name_4_0= ruleASTRIUM_ID ) ) this_COLON_5= RULE_COLON otherlv_6= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_7_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_8_0= ruleAtom ) ) | ( (lv_simpleValue_9_0= ruleSINGLE_VALUE ) ) )?
                    {
                    // InternalSpellDatabase.g:420:7: ()
                    // InternalSpellDatabase.g:421:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAstriumVariableEntryAccess().getAstriumVariableEntryAction_1_0(),
                                  current);
                          
                    }

                    }

                    this_DOLLAR_3=(Token)match(input,RULE_DOLLAR,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOLLAR_3, grammarAccess.getAstriumVariableEntryAccess().getDOLLARTerminalRuleCall_1_1()); 
                          
                    }
                    // InternalSpellDatabase.g:430:1: ( (lv_name_4_0= ruleASTRIUM_ID ) )
                    // InternalSpellDatabase.g:431:1: (lv_name_4_0= ruleASTRIUM_ID )
                    {
                    // InternalSpellDatabase.g:431:1: (lv_name_4_0= ruleASTRIUM_ID )
                    // InternalSpellDatabase.g:432:3: lv_name_4_0= ruleASTRIUM_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAstriumVariableEntryAccess().getNameASTRIUM_IDParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_name_4_0=ruleASTRIUM_ID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAstriumVariableEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.ASTRIUM_ID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_COLON_5=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_5, grammarAccess.getAstriumVariableEntryAccess().getCOLONTerminalRuleCall_1_3()); 
                          
                    }
                    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAstriumVariableEntryAccess().getEqualsSignKeyword_1_4());
                          
                    }
                    // InternalSpellDatabase.g:456:1: ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_7_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_8_0= ruleAtom ) ) | ( (lv_simpleValue_9_0= ruleSINGLE_VALUE ) ) )?
                    int alt9=4;
                    alt9 = dfa9.predict(input);
                    switch (alt9) {
                        case 1 :
                            // InternalSpellDatabase.g:456:2: ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_7_0= ruleASTRIUM_TIME ) )
                            {
                            // InternalSpellDatabase.g:456:2: ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_7_0= ruleASTRIUM_TIME ) )
                            // InternalSpellDatabase.g:456:3: ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_7_0= ruleASTRIUM_TIME )
                            {
                            // InternalSpellDatabase.g:461:1: (lv_astriumTime_7_0= ruleASTRIUM_TIME )
                            // InternalSpellDatabase.g:462:3: lv_astriumTime_7_0= ruleASTRIUM_TIME
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAstriumVariableEntryAccess().getAstriumTimeASTRIUM_TIMEParserRuleCall_1_5_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_astriumTime_7_0=ruleASTRIUM_TIME();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAstriumVariableEntryRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"astriumTime",
                                      		lv_astriumTime_7_0, 
                                      		"lu.ses.engineering.spell.SpellDatabase.ASTRIUM_TIME");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSpellDatabase.g:479:6: ( ( ( ruleAtom ) )=> (lv_value_8_0= ruleAtom ) )
                            {
                            // InternalSpellDatabase.g:479:6: ( ( ( ruleAtom ) )=> (lv_value_8_0= ruleAtom ) )
                            // InternalSpellDatabase.g:479:7: ( ( ruleAtom ) )=> (lv_value_8_0= ruleAtom )
                            {
                            // InternalSpellDatabase.g:484:1: (lv_value_8_0= ruleAtom )
                            // InternalSpellDatabase.g:485:3: lv_value_8_0= ruleAtom
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAstriumVariableEntryAccess().getValueAtomParserRuleCall_1_5_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_value_8_0=ruleAtom();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAstriumVariableEntryRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_8_0, 
                                      		"lu.ses.engineering.spell.SpellDatabase.Atom");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSpellDatabase.g:502:6: ( (lv_simpleValue_9_0= ruleSINGLE_VALUE ) )
                            {
                            // InternalSpellDatabase.g:502:6: ( (lv_simpleValue_9_0= ruleSINGLE_VALUE ) )
                            // InternalSpellDatabase.g:503:1: (lv_simpleValue_9_0= ruleSINGLE_VALUE )
                            {
                            // InternalSpellDatabase.g:503:1: (lv_simpleValue_9_0= ruleSINGLE_VALUE )
                            // InternalSpellDatabase.g:504:3: lv_simpleValue_9_0= ruleSINGLE_VALUE
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAstriumVariableEntryAccess().getSimpleValueSINGLE_VALUEParserRuleCall_1_5_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_simpleValue_9_0=ruleSINGLE_VALUE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAstriumVariableEntryRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"simpleValue",
                                      		lv_simpleValue_9_0, 
                                      		"lu.ses.engineering.spell.SpellDatabase.SINGLE_VALUE");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAstriumVariableEntry"


    // $ANTLR start "entryRuleAstriumHeaderEntry"
    // InternalSpellDatabase.g:531:1: entryRuleAstriumHeaderEntry returns [EObject current=null] : iv_ruleAstriumHeaderEntry= ruleAstriumHeaderEntry EOF ;
    public final EObject entryRuleAstriumHeaderEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAstriumHeaderEntry = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:535:2: (iv_ruleAstriumHeaderEntry= ruleAstriumHeaderEntry EOF )
            // InternalSpellDatabase.g:536:2: iv_ruleAstriumHeaderEntry= ruleAstriumHeaderEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAstriumHeaderEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAstriumHeaderEntry=ruleAstriumHeaderEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAstriumHeaderEntry; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAstriumHeaderEntry"


    // $ANTLR start "ruleAstriumHeaderEntry"
    // InternalSpellDatabase.g:546:1: ruleAstriumHeaderEntry returns [EObject current=null] : ( ( () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) ) ) | ( () ( (lv_name_3_0= ruleASTRIUM_ID ) ) this_COLON_4= RULE_COLON otherlv_5= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_6_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_7_0= ruleAtom ) ) | ( (lv_simpleValue_8_0= ruleSINGLE_VALUE ) ) )? ) ) ;
    public final EObject ruleAstriumHeaderEntry() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;
        Token this_COLON_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_astriumTime_6_0 = null;

        EObject lv_value_7_0 = null;

        AntlrDatatypeRuleToken lv_simpleValue_8_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:550:28: ( ( ( () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) ) ) | ( () ( (lv_name_3_0= ruleASTRIUM_ID ) ) this_COLON_4= RULE_COLON otherlv_5= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_6_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_7_0= ruleAtom ) ) | ( (lv_simpleValue_8_0= ruleSINGLE_VALUE ) ) )? ) ) )
            // InternalSpellDatabase.g:551:1: ( ( () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) ) ) | ( () ( (lv_name_3_0= ruleASTRIUM_ID ) ) this_COLON_4= RULE_COLON otherlv_5= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_6_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_7_0= ruleAtom ) ) | ( (lv_simpleValue_8_0= ruleSINGLE_VALUE ) ) )? ) )
            {
            // InternalSpellDatabase.g:551:1: ( ( () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) ) ) | ( () ( (lv_name_3_0= ruleASTRIUM_ID ) ) this_COLON_4= RULE_COLON otherlv_5= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_6_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_7_0= ruleAtom ) ) | ( (lv_simpleValue_8_0= ruleSINGLE_VALUE ) ) )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ASTRIUM_COMMENT) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpellDatabase.g:551:2: ( () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) ) )
                    {
                    // InternalSpellDatabase.g:551:2: ( () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) ) )
                    // InternalSpellDatabase.g:551:3: () ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) )
                    {
                    // InternalSpellDatabase.g:551:3: ()
                    // InternalSpellDatabase.g:552:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAstriumHeaderEntryAccess().getAstriumHeaderCommentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpellDatabase.g:557:2: ( (lv_comment_1_0= RULE_ASTRIUM_COMMENT ) )
                    // InternalSpellDatabase.g:558:1: (lv_comment_1_0= RULE_ASTRIUM_COMMENT )
                    {
                    // InternalSpellDatabase.g:558:1: (lv_comment_1_0= RULE_ASTRIUM_COMMENT )
                    // InternalSpellDatabase.g:559:3: lv_comment_1_0= RULE_ASTRIUM_COMMENT
                    {
                    lv_comment_1_0=(Token)match(input,RULE_ASTRIUM_COMMENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_1_0, grammarAccess.getAstriumHeaderEntryAccess().getCommentASTRIUM_COMMENTTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAstriumHeaderEntryRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_1_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.ASTRIUM_COMMENT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:576:6: ( () ( (lv_name_3_0= ruleASTRIUM_ID ) ) this_COLON_4= RULE_COLON otherlv_5= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_6_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_7_0= ruleAtom ) ) | ( (lv_simpleValue_8_0= ruleSINGLE_VALUE ) ) )? )
                    {
                    // InternalSpellDatabase.g:576:6: ( () ( (lv_name_3_0= ruleASTRIUM_ID ) ) this_COLON_4= RULE_COLON otherlv_5= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_6_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_7_0= ruleAtom ) ) | ( (lv_simpleValue_8_0= ruleSINGLE_VALUE ) ) )? )
                    // InternalSpellDatabase.g:576:7: () ( (lv_name_3_0= ruleASTRIUM_ID ) ) this_COLON_4= RULE_COLON otherlv_5= '=' ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_6_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_7_0= ruleAtom ) ) | ( (lv_simpleValue_8_0= ruleSINGLE_VALUE ) ) )?
                    {
                    // InternalSpellDatabase.g:576:7: ()
                    // InternalSpellDatabase.g:577:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAstriumHeaderEntryAccess().getAstriumHeaderEntryAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSpellDatabase.g:582:2: ( (lv_name_3_0= ruleASTRIUM_ID ) )
                    // InternalSpellDatabase.g:583:1: (lv_name_3_0= ruleASTRIUM_ID )
                    {
                    // InternalSpellDatabase.g:583:1: (lv_name_3_0= ruleASTRIUM_ID )
                    // InternalSpellDatabase.g:584:3: lv_name_3_0= ruleASTRIUM_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAstriumHeaderEntryAccess().getNameASTRIUM_IDParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_name_3_0=ruleASTRIUM_ID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAstriumHeaderEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.ASTRIUM_ID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_COLON_4=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getAstriumHeaderEntryAccess().getCOLONTerminalRuleCall_1_2()); 
                          
                    }
                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAstriumHeaderEntryAccess().getEqualsSignKeyword_1_3());
                          
                    }
                    // InternalSpellDatabase.g:608:1: ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_6_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_7_0= ruleAtom ) ) | ( (lv_simpleValue_8_0= ruleSINGLE_VALUE ) ) )?
                    int alt11=4;
                    alt11 = dfa11.predict(input);
                    switch (alt11) {
                        case 1 :
                            // InternalSpellDatabase.g:608:2: ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_6_0= ruleASTRIUM_TIME ) )
                            {
                            // InternalSpellDatabase.g:608:2: ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_6_0= ruleASTRIUM_TIME ) )
                            // InternalSpellDatabase.g:608:3: ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_6_0= ruleASTRIUM_TIME )
                            {
                            // InternalSpellDatabase.g:613:1: (lv_astriumTime_6_0= ruleASTRIUM_TIME )
                            // InternalSpellDatabase.g:614:3: lv_astriumTime_6_0= ruleASTRIUM_TIME
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAstriumHeaderEntryAccess().getAstriumTimeASTRIUM_TIMEParserRuleCall_1_4_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_astriumTime_6_0=ruleASTRIUM_TIME();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAstriumHeaderEntryRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"astriumTime",
                                      		lv_astriumTime_6_0, 
                                      		"lu.ses.engineering.spell.SpellDatabase.ASTRIUM_TIME");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSpellDatabase.g:631:6: ( ( ( ruleAtom ) )=> (lv_value_7_0= ruleAtom ) )
                            {
                            // InternalSpellDatabase.g:631:6: ( ( ( ruleAtom ) )=> (lv_value_7_0= ruleAtom ) )
                            // InternalSpellDatabase.g:631:7: ( ( ruleAtom ) )=> (lv_value_7_0= ruleAtom )
                            {
                            // InternalSpellDatabase.g:636:1: (lv_value_7_0= ruleAtom )
                            // InternalSpellDatabase.g:637:3: lv_value_7_0= ruleAtom
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAstriumHeaderEntryAccess().getValueAtomParserRuleCall_1_4_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_value_7_0=ruleAtom();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAstriumHeaderEntryRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_7_0, 
                                      		"lu.ses.engineering.spell.SpellDatabase.Atom");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSpellDatabase.g:654:6: ( (lv_simpleValue_8_0= ruleSINGLE_VALUE ) )
                            {
                            // InternalSpellDatabase.g:654:6: ( (lv_simpleValue_8_0= ruleSINGLE_VALUE ) )
                            // InternalSpellDatabase.g:655:1: (lv_simpleValue_8_0= ruleSINGLE_VALUE )
                            {
                            // InternalSpellDatabase.g:655:1: (lv_simpleValue_8_0= ruleSINGLE_VALUE )
                            // InternalSpellDatabase.g:656:3: lv_simpleValue_8_0= ruleSINGLE_VALUE
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAstriumHeaderEntryAccess().getSimpleValueSINGLE_VALUEParserRuleCall_1_4_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_simpleValue_8_0=ruleSINGLE_VALUE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAstriumHeaderEntryRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"simpleValue",
                                      		lv_simpleValue_8_0, 
                                      		"lu.ses.engineering.spell.SpellDatabase.SINGLE_VALUE");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAstriumHeaderEntry"


    // $ANTLR start "entryRuleSkipNLAndComments2"
    // InternalSpellDatabase.g:683:1: entryRuleSkipNLAndComments2 returns [String current=null] : iv_ruleSkipNLAndComments2= ruleSkipNLAndComments2 EOF ;
    public final String entryRuleSkipNLAndComments2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSkipNLAndComments2 = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:687:2: (iv_ruleSkipNLAndComments2= ruleSkipNLAndComments2 EOF )
            // InternalSpellDatabase.g:688:2: iv_ruleSkipNLAndComments2= ruleSkipNLAndComments2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSkipNLAndComments2Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSkipNLAndComments2=ruleSkipNLAndComments2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSkipNLAndComments2.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSkipNLAndComments2"


    // $ANTLR start "ruleSkipNLAndComments2"
    // InternalSpellDatabase.g:698:1: ruleSkipNLAndComments2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_NL_0= RULE_NL )+ ( ( ruleSkipNLAndComments )=>this_SkipNLAndComments_1= ruleSkipNLAndComments ) ) ;
    public final AntlrDatatypeRuleToken ruleSkipNLAndComments2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NL_0=null;
        AntlrDatatypeRuleToken this_SkipNLAndComments_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:702:28: ( ( (this_NL_0= RULE_NL )+ ( ( ruleSkipNLAndComments )=>this_SkipNLAndComments_1= ruleSkipNLAndComments ) ) )
            // InternalSpellDatabase.g:703:1: ( (this_NL_0= RULE_NL )+ ( ( ruleSkipNLAndComments )=>this_SkipNLAndComments_1= ruleSkipNLAndComments ) )
            {
            // InternalSpellDatabase.g:703:1: ( (this_NL_0= RULE_NL )+ ( ( ruleSkipNLAndComments )=>this_SkipNLAndComments_1= ruleSkipNLAndComments ) )
            // InternalSpellDatabase.g:703:2: (this_NL_0= RULE_NL )+ ( ( ruleSkipNLAndComments )=>this_SkipNLAndComments_1= ruleSkipNLAndComments )
            {
            // InternalSpellDatabase.g:703:2: (this_NL_0= RULE_NL )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // InternalSpellDatabase.g:703:7: this_NL_0= RULE_NL
            	    {
            	    this_NL_0=(Token)match(input,RULE_NL,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_NL_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NL_0, grammarAccess.getSkipNLAndComments2Access().getNLTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            // InternalSpellDatabase.g:710:3: ( ( ruleSkipNLAndComments )=>this_SkipNLAndComments_1= ruleSkipNLAndComments )
            // InternalSpellDatabase.g:710:4: ( ruleSkipNLAndComments )=>this_SkipNLAndComments_1= ruleSkipNLAndComments
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSkipNLAndComments2Access().getSkipNLAndCommentsParserRuleCall_1()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_SkipNLAndComments_1=ruleSkipNLAndComments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SkipNLAndComments_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSkipNLAndComments2"


    // $ANTLR start "entryRuleSkipNLAndComments"
    // InternalSpellDatabase.g:732:1: entryRuleSkipNLAndComments returns [String current=null] : iv_ruleSkipNLAndComments= ruleSkipNLAndComments EOF ;
    public final String entryRuleSkipNLAndComments() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSkipNLAndComments = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // InternalSpellDatabase.g:736:2: (iv_ruleSkipNLAndComments= ruleSkipNLAndComments EOF )
            // InternalSpellDatabase.g:737:2: iv_ruleSkipNLAndComments= ruleSkipNLAndComments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSkipNLAndCommentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSkipNLAndComments=ruleSkipNLAndComments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSkipNLAndComments.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSkipNLAndComments"


    // $ANTLR start "ruleSkipNLAndComments"
    // InternalSpellDatabase.g:747:1: ruleSkipNLAndComments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WS_0= RULE_WS | this_ML_COMMENT_1= RULE_ML_COMMENT | this_SL_COMMENT_2= RULE_SL_COMMENT | this_NL_3= RULE_NL )* ;
    public final AntlrDatatypeRuleToken ruleSkipNLAndComments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;
        Token this_ML_COMMENT_1=null;
        Token this_SL_COMMENT_2=null;
        Token this_NL_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // InternalSpellDatabase.g:751:28: ( (this_WS_0= RULE_WS | this_ML_COMMENT_1= RULE_ML_COMMENT | this_SL_COMMENT_2= RULE_SL_COMMENT | this_NL_3= RULE_NL )* )
            // InternalSpellDatabase.g:752:1: (this_WS_0= RULE_WS | this_ML_COMMENT_1= RULE_ML_COMMENT | this_SL_COMMENT_2= RULE_SL_COMMENT | this_NL_3= RULE_NL )*
            {
            // InternalSpellDatabase.g:752:1: (this_WS_0= RULE_WS | this_ML_COMMENT_1= RULE_ML_COMMENT | this_SL_COMMENT_2= RULE_SL_COMMENT | this_NL_3= RULE_NL )*
            loop14:
            do {
                int alt14=5;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalSpellDatabase.g:752:6: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getSkipNLAndCommentsAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalSpellDatabase.g:760:10: this_ML_COMMENT_1= RULE_ML_COMMENT
            	    {
            	    this_ML_COMMENT_1=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ML_COMMENT_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ML_COMMENT_1, grammarAccess.getSkipNLAndCommentsAccess().getML_COMMENTTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalSpellDatabase.g:768:10: this_SL_COMMENT_2= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_2=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SL_COMMENT_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SL_COMMENT_2, grammarAccess.getSkipNLAndCommentsAccess().getSL_COMMENTTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalSpellDatabase.g:776:10: this_NL_3= RULE_NL
            	    {
            	    this_NL_3=(Token)match(input,RULE_NL,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_NL_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NL_3, grammarAccess.getSkipNLAndCommentsAccess().getNLTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSkipNLAndComments"


    // $ANTLR start "entryRuleCSVEntry"
    // InternalSpellDatabase.g:794:1: entryRuleCSVEntry returns [EObject current=null] : iv_ruleCSVEntry= ruleCSVEntry EOF ;
    public final EObject entryRuleCSVEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSVEntry = null;


        try {
            // InternalSpellDatabase.g:795:2: (iv_ruleCSVEntry= ruleCSVEntry EOF )
            // InternalSpellDatabase.g:796:2: iv_ruleCSVEntry= ruleCSVEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSVEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCSVEntry=ruleCSVEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSVEntry; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCSVEntry"


    // $ANTLR start "ruleCSVEntry"
    // InternalSpellDatabase.g:803:1: ruleCSVEntry returns [EObject current=null] : (this_CSVCommand_0= ruleCSVCommand | this_CSVTelemetry_1= ruleCSVTelemetry | this_CSVSpell_2= ruleCSVSpell ) ;
    public final EObject ruleCSVEntry() throws RecognitionException {
        EObject current = null;

        EObject this_CSVCommand_0 = null;

        EObject this_CSVTelemetry_1 = null;

        EObject this_CSVSpell_2 = null;


         enterRule(); 
            
        try {
            // InternalSpellDatabase.g:806:28: ( (this_CSVCommand_0= ruleCSVCommand | this_CSVTelemetry_1= ruleCSVTelemetry | this_CSVSpell_2= ruleCSVSpell ) )
            // InternalSpellDatabase.g:807:1: (this_CSVCommand_0= ruleCSVCommand | this_CSVTelemetry_1= ruleCSVTelemetry | this_CSVSpell_2= ruleCSVSpell )
            {
            // InternalSpellDatabase.g:807:1: (this_CSVCommand_0= ruleCSVCommand | this_CSVTelemetry_1= ruleCSVTelemetry | this_CSVSpell_2= ruleCSVSpell )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_CMD:
                {
                alt15=1;
                }
                break;
            case RULE_TM:
                {
                alt15=2;
                }
                break;
            case RULE_SPELL:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSpellDatabase.g:808:5: this_CSVCommand_0= ruleCSVCommand
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSVEntryAccess().getCSVCommandParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CSVCommand_0=ruleCSVCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSVCommand_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:818:5: this_CSVTelemetry_1= ruleCSVTelemetry
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSVEntryAccess().getCSVTelemetryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CSVTelemetry_1=ruleCSVTelemetry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSVTelemetry_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSpellDatabase.g:828:5: this_CSVSpell_2= ruleCSVSpell
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSVEntryAccess().getCSVSpellParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CSVSpell_2=ruleCSVSpell();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSVSpell_2; 
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
    // $ANTLR end "ruleCSVEntry"


    // $ANTLR start "entryRuleCSVCommand"
    // InternalSpellDatabase.g:844:1: entryRuleCSVCommand returns [EObject current=null] : iv_ruleCSVCommand= ruleCSVCommand EOF ;
    public final EObject entryRuleCSVCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSVCommand = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:848:2: (iv_ruleCSVCommand= ruleCSVCommand EOF )
            // InternalSpellDatabase.g:849:2: iv_ruleCSVCommand= ruleCSVCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSVCommandRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCSVCommand=ruleCSVCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSVCommand; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSVCommand"


    // $ANTLR start "ruleCSVCommand"
    // InternalSpellDatabase.g:859:1: ruleCSVCommand returns [EObject current=null] : (this_CMD_0= RULE_CMD otherlv_1= ',' ( (lv_command_2_0= ruleID_STMT ) ) (otherlv_3= ',' ( ( ( ruleTCArgs ) )=> (lv_args_4_0= ruleTCArgs ) ) ( ( ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* ) )=> ( ruleSkipNLAndComments2 otherlv_6= ',' otherlv_7= ',' ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) ) (otherlv_9= ',' )* ) )* )? (otherlv_10= ',' )* ) ;
    public final EObject ruleCSVCommand() throws RecognitionException {
        EObject current = null;

        Token this_CMD_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_command_2_0 = null;

        EObject lv_args_4_0 = null;

        EObject lv_args_8_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:863:28: ( (this_CMD_0= RULE_CMD otherlv_1= ',' ( (lv_command_2_0= ruleID_STMT ) ) (otherlv_3= ',' ( ( ( ruleTCArgs ) )=> (lv_args_4_0= ruleTCArgs ) ) ( ( ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* ) )=> ( ruleSkipNLAndComments2 otherlv_6= ',' otherlv_7= ',' ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) ) (otherlv_9= ',' )* ) )* )? (otherlv_10= ',' )* ) )
            // InternalSpellDatabase.g:864:1: (this_CMD_0= RULE_CMD otherlv_1= ',' ( (lv_command_2_0= ruleID_STMT ) ) (otherlv_3= ',' ( ( ( ruleTCArgs ) )=> (lv_args_4_0= ruleTCArgs ) ) ( ( ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* ) )=> ( ruleSkipNLAndComments2 otherlv_6= ',' otherlv_7= ',' ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) ) (otherlv_9= ',' )* ) )* )? (otherlv_10= ',' )* )
            {
            // InternalSpellDatabase.g:864:1: (this_CMD_0= RULE_CMD otherlv_1= ',' ( (lv_command_2_0= ruleID_STMT ) ) (otherlv_3= ',' ( ( ( ruleTCArgs ) )=> (lv_args_4_0= ruleTCArgs ) ) ( ( ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* ) )=> ( ruleSkipNLAndComments2 otherlv_6= ',' otherlv_7= ',' ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) ) (otherlv_9= ',' )* ) )* )? (otherlv_10= ',' )* )
            // InternalSpellDatabase.g:864:2: this_CMD_0= RULE_CMD otherlv_1= ',' ( (lv_command_2_0= ruleID_STMT ) ) (otherlv_3= ',' ( ( ( ruleTCArgs ) )=> (lv_args_4_0= ruleTCArgs ) ) ( ( ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* ) )=> ( ruleSkipNLAndComments2 otherlv_6= ',' otherlv_7= ',' ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) ) (otherlv_9= ',' )* ) )* )? (otherlv_10= ',' )*
            {
            this_CMD_0=(Token)match(input,RULE_CMD,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CMD_0, grammarAccess.getCSVCommandAccess().getCMDTerminalRuleCall_0()); 
                  
            }
            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCSVCommandAccess().getCommaKeyword_1());
                  
            }
            // InternalSpellDatabase.g:872:1: ( (lv_command_2_0= ruleID_STMT ) )
            // InternalSpellDatabase.g:873:1: (lv_command_2_0= ruleID_STMT )
            {
            // InternalSpellDatabase.g:873:1: (lv_command_2_0= ruleID_STMT )
            // InternalSpellDatabase.g:874:3: lv_command_2_0= ruleID_STMT
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSVCommandAccess().getCommandID_STMTParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_18);
            lv_command_2_0=ruleID_STMT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSVCommandRule());
              	        }
                     		set(
                     			current, 
                     			"command",
                      		lv_command_2_0, 
                      		"lu.ses.engineering.spell.SpellDatabase.ID_STMT");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSpellDatabase.g:890:2: (otherlv_3= ',' ( ( ( ruleTCArgs ) )=> (lv_args_4_0= ruleTCArgs ) ) ( ( ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* ) )=> ( ruleSkipNLAndComments2 otherlv_6= ',' otherlv_7= ',' ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) ) (otherlv_9= ',' )* ) )* )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalSpellDatabase.g:890:4: otherlv_3= ',' ( ( ( ruleTCArgs ) )=> (lv_args_4_0= ruleTCArgs ) ) ( ( ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* ) )=> ( ruleSkipNLAndComments2 otherlv_6= ',' otherlv_7= ',' ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) ) (otherlv_9= ',' )* ) )*
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCSVCommandAccess().getCommaKeyword_3_0());
                          
                    }
                    // InternalSpellDatabase.g:894:1: ( ( ( ruleTCArgs ) )=> (lv_args_4_0= ruleTCArgs ) )
                    // InternalSpellDatabase.g:894:2: ( ( ruleTCArgs ) )=> (lv_args_4_0= ruleTCArgs )
                    {
                    // InternalSpellDatabase.g:899:1: (lv_args_4_0= ruleTCArgs )
                    // InternalSpellDatabase.g:900:3: lv_args_4_0= ruleTCArgs
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSVCommandAccess().getArgsTCArgsParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
                    lv_args_4_0=ruleTCArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSVCommandRule());
                      	        }
                             		add(
                             			current, 
                             			"args",
                              		lv_args_4_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.TCArgs");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSpellDatabase.g:916:2: ( ( ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* ) )=> ( ruleSkipNLAndComments2 otherlv_6= ',' otherlv_7= ',' ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) ) (otherlv_9= ',' )* ) )*
                    loop17:
                    do {
                        int alt17=2;
                        alt17 = dfa17.predict(input);
                        switch (alt17) {
                    	case 1 :
                    	    // InternalSpellDatabase.g:916:3: ( ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* ) )=> ( ruleSkipNLAndComments2 otherlv_6= ',' otherlv_7= ',' ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) ) (otherlv_9= ',' )* )
                    	    {
                    	    // InternalSpellDatabase.g:927:7: ( ruleSkipNLAndComments2 otherlv_6= ',' otherlv_7= ',' ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) ) (otherlv_9= ',' )* )
                    	    // InternalSpellDatabase.g:928:5: ruleSkipNLAndComments2 otherlv_6= ',' otherlv_7= ',' ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) ) (otherlv_9= ',' )*
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getCSVCommandAccess().getSkipNLAndComments2ParserRuleCall_3_2_0_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_16);
                    	    ruleSkipNLAndComments2();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }
                    	    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getCSVCommandAccess().getCommaKeyword_3_2_0_1());
                    	          
                    	    }
                    	    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getCSVCommandAccess().getCommaKeyword_3_2_0_2());
                    	          
                    	    }
                    	    // InternalSpellDatabase.g:943:1: ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) )
                    	    // InternalSpellDatabase.g:943:2: ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs )
                    	    {
                    	    // InternalSpellDatabase.g:948:1: (lv_args_8_0= ruleTCArgs )
                    	    // InternalSpellDatabase.g:949:3: lv_args_8_0= ruleTCArgs
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSVCommandAccess().getArgsTCArgsParserRuleCall_3_2_0_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_20);
                    	    lv_args_8_0=ruleTCArgs();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCSVCommandRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_8_0, 
                    	              		"lu.ses.engineering.spell.SpellDatabase.TCArgs");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSpellDatabase.g:965:2: (otherlv_9= ',' )*
                    	    loop16:
                    	    do {
                    	        int alt16=2;
                    	        alt16 = dfa16.predict(input);
                    	        switch (alt16) {
                    	    	case 1 :
                    	    	    // InternalSpellDatabase.g:965:4: otherlv_9= ','
                    	    	    {
                    	    	    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	          	newLeafNode(otherlv_9, grammarAccess.getCSVCommandAccess().getCommaKeyword_3_2_0_4());
                    	    	          
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop16;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSpellDatabase.g:969:8: (otherlv_10= ',' )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalSpellDatabase.g:969:10: otherlv_10= ','
            	    {
            	    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getCSVCommandAccess().getCommaKeyword_4());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSVCommand"


    // $ANTLR start "entryRuleTCArgs"
    // InternalSpellDatabase.g:984:1: entryRuleTCArgs returns [EObject current=null] : iv_ruleTCArgs= ruleTCArgs EOF ;
    public final EObject entryRuleTCArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTCArgs = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:988:2: (iv_ruleTCArgs= ruleTCArgs EOF )
            // InternalSpellDatabase.g:989:2: iv_ruleTCArgs= ruleTCArgs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTCArgsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTCArgs=ruleTCArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTCArgs; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTCArgs"


    // $ANTLR start "ruleTCArgs"
    // InternalSpellDatabase.g:999:1: ruleTCArgs returns [EObject current=null] : ( ( ( ( ruleTCValue ) )=> (lv_tcName_0_0= ruleTCValue ) ) otherlv_1= ',' ( ( ( ruleTCValue ) )=> (lv_tcValue_2_0= ruleTCValue ) ) otherlv_3= ',' ( ( ( RULE_STATE_EXPR ) )=> (lv_tcMod_4_0= RULE_STATE_EXPR ) ) ( ( ( ',' ( ( rulePosIntOrFloat ) )? ) )=> (otherlv_5= ',' ( (lv_tolerance_6_0= rulePosIntOrFloat ) )? ) )? (otherlv_7= ',' )* ) ;
    public final EObject ruleTCArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_tcMod_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_tcName_0_0 = null;

        AntlrDatatypeRuleToken lv_tcValue_2_0 = null;

        AntlrDatatypeRuleToken lv_tolerance_6_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:1003:28: ( ( ( ( ( ruleTCValue ) )=> (lv_tcName_0_0= ruleTCValue ) ) otherlv_1= ',' ( ( ( ruleTCValue ) )=> (lv_tcValue_2_0= ruleTCValue ) ) otherlv_3= ',' ( ( ( RULE_STATE_EXPR ) )=> (lv_tcMod_4_0= RULE_STATE_EXPR ) ) ( ( ( ',' ( ( rulePosIntOrFloat ) )? ) )=> (otherlv_5= ',' ( (lv_tolerance_6_0= rulePosIntOrFloat ) )? ) )? (otherlv_7= ',' )* ) )
            // InternalSpellDatabase.g:1004:1: ( ( ( ( ruleTCValue ) )=> (lv_tcName_0_0= ruleTCValue ) ) otherlv_1= ',' ( ( ( ruleTCValue ) )=> (lv_tcValue_2_0= ruleTCValue ) ) otherlv_3= ',' ( ( ( RULE_STATE_EXPR ) )=> (lv_tcMod_4_0= RULE_STATE_EXPR ) ) ( ( ( ',' ( ( rulePosIntOrFloat ) )? ) )=> (otherlv_5= ',' ( (lv_tolerance_6_0= rulePosIntOrFloat ) )? ) )? (otherlv_7= ',' )* )
            {
            // InternalSpellDatabase.g:1004:1: ( ( ( ( ruleTCValue ) )=> (lv_tcName_0_0= ruleTCValue ) ) otherlv_1= ',' ( ( ( ruleTCValue ) )=> (lv_tcValue_2_0= ruleTCValue ) ) otherlv_3= ',' ( ( ( RULE_STATE_EXPR ) )=> (lv_tcMod_4_0= RULE_STATE_EXPR ) ) ( ( ( ',' ( ( rulePosIntOrFloat ) )? ) )=> (otherlv_5= ',' ( (lv_tolerance_6_0= rulePosIntOrFloat ) )? ) )? (otherlv_7= ',' )* )
            // InternalSpellDatabase.g:1004:2: ( ( ( ruleTCValue ) )=> (lv_tcName_0_0= ruleTCValue ) ) otherlv_1= ',' ( ( ( ruleTCValue ) )=> (lv_tcValue_2_0= ruleTCValue ) ) otherlv_3= ',' ( ( ( RULE_STATE_EXPR ) )=> (lv_tcMod_4_0= RULE_STATE_EXPR ) ) ( ( ( ',' ( ( rulePosIntOrFloat ) )? ) )=> (otherlv_5= ',' ( (lv_tolerance_6_0= rulePosIntOrFloat ) )? ) )? (otherlv_7= ',' )*
            {
            // InternalSpellDatabase.g:1004:2: ( ( ( ruleTCValue ) )=> (lv_tcName_0_0= ruleTCValue ) )
            // InternalSpellDatabase.g:1004:3: ( ( ruleTCValue ) )=> (lv_tcName_0_0= ruleTCValue )
            {
            // InternalSpellDatabase.g:1009:1: (lv_tcName_0_0= ruleTCValue )
            // InternalSpellDatabase.g:1010:3: lv_tcName_0_0= ruleTCValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTCArgsAccess().getTcNameTCValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_tcName_0_0=ruleTCValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTCArgsRule());
              	        }
                     		set(
                     			current, 
                     			"tcName",
                      		lv_tcName_0_0, 
                      		"lu.ses.engineering.spell.SpellDatabase.TCValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTCArgsAccess().getCommaKeyword_1());
                  
            }
            // InternalSpellDatabase.g:1030:1: ( ( ( ruleTCValue ) )=> (lv_tcValue_2_0= ruleTCValue ) )
            // InternalSpellDatabase.g:1030:2: ( ( ruleTCValue ) )=> (lv_tcValue_2_0= ruleTCValue )
            {
            // InternalSpellDatabase.g:1035:1: (lv_tcValue_2_0= ruleTCValue )
            // InternalSpellDatabase.g:1036:3: lv_tcValue_2_0= ruleTCValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTCArgsAccess().getTcValueTCValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_tcValue_2_0=ruleTCValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTCArgsRule());
              	        }
                     		set(
                     			current, 
                     			"tcValue",
                      		lv_tcValue_2_0, 
                      		"lu.ses.engineering.spell.SpellDatabase.TCValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTCArgsAccess().getCommaKeyword_3());
                  
            }
            // InternalSpellDatabase.g:1056:1: ( ( ( RULE_STATE_EXPR ) )=> (lv_tcMod_4_0= RULE_STATE_EXPR ) )
            // InternalSpellDatabase.g:1056:2: ( ( RULE_STATE_EXPR ) )=> (lv_tcMod_4_0= RULE_STATE_EXPR )
            {
            // InternalSpellDatabase.g:1062:1: (lv_tcMod_4_0= RULE_STATE_EXPR )
            // InternalSpellDatabase.g:1063:3: lv_tcMod_4_0= RULE_STATE_EXPR
            {
            lv_tcMod_4_0=(Token)match(input,RULE_STATE_EXPR,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_tcMod_4_0, grammarAccess.getTCArgsAccess().getTcModSTATE_EXPRTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTCArgsRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"tcMod",
                      		lv_tcMod_4_0, 
                      		"lu.ses.engineering.spell.SpellDatabase.STATE_EXPR");
              	    
            }

            }


            }

            // InternalSpellDatabase.g:1079:2: ( ( ( ',' ( ( rulePosIntOrFloat ) )? ) )=> (otherlv_5= ',' ( (lv_tolerance_6_0= rulePosIntOrFloat ) )? ) )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalSpellDatabase.g:1079:3: ( ( ',' ( ( rulePosIntOrFloat ) )? ) )=> (otherlv_5= ',' ( (lv_tolerance_6_0= rulePosIntOrFloat ) )? )
                    {
                    // InternalSpellDatabase.g:1084:7: (otherlv_5= ',' ( (lv_tolerance_6_0= rulePosIntOrFloat ) )? )
                    // InternalSpellDatabase.g:1084:9: otherlv_5= ',' ( (lv_tolerance_6_0= rulePosIntOrFloat ) )?
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTCArgsAccess().getCommaKeyword_5_0_0());
                          
                    }
                    // InternalSpellDatabase.g:1088:1: ( (lv_tolerance_6_0= rulePosIntOrFloat ) )?
                    int alt20=2;
                    alt20 = dfa20.predict(input);
                    switch (alt20) {
                        case 1 :
                            // InternalSpellDatabase.g:1089:1: (lv_tolerance_6_0= rulePosIntOrFloat )
                            {
                            // InternalSpellDatabase.g:1089:1: (lv_tolerance_6_0= rulePosIntOrFloat )
                            // InternalSpellDatabase.g:1090:3: lv_tolerance_6_0= rulePosIntOrFloat
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTCArgsAccess().getTolerancePosIntOrFloatParserRuleCall_5_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_18);
                            lv_tolerance_6_0=rulePosIntOrFloat();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTCArgsRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"tolerance",
                                      		lv_tolerance_6_0, 
                                      		"lu.ses.engineering.spell.SpellDatabase.PosIntOrFloat");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalSpellDatabase.g:1106:6: (otherlv_7= ',' )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalSpellDatabase.g:1106:8: otherlv_7= ','
            	    {
            	    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getTCArgsAccess().getCommaKeyword_6());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTCArgs"


    // $ANTLR start "entryRuleTCValue"
    // InternalSpellDatabase.g:1121:1: entryRuleTCValue returns [String current=null] : iv_ruleTCValue= ruleTCValue EOF ;
    public final String entryRuleTCValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTCValue = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:1125:2: (iv_ruleTCValue= ruleTCValue EOF )
            // InternalSpellDatabase.g:1126:2: iv_ruleTCValue= ruleTCValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTCValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTCValue=ruleTCValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTCValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTCValue"


    // $ANTLR start "ruleTCValue"
    // InternalSpellDatabase.g:1136:1: ruleTCValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_STMT_0= ruleID_STMT | this_BIN_HEX_OCT_1= RULE_BIN_HEX_OCT | this_PLUS_2= RULE_PLUS | this_MINUS_3= RULE_MINUS | ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER ) | ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT ) | kw= '*' | this_BOOL_EXPR_7= RULE_BOOL_EXPR )+ ;
    public final AntlrDatatypeRuleToken ruleTCValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BIN_HEX_OCT_1=null;
        Token this_PLUS_2=null;
        Token this_MINUS_3=null;
        Token this_FLOAT_5=null;
        Token kw=null;
        Token this_BOOL_EXPR_7=null;
        AntlrDatatypeRuleToken this_ID_STMT_0 = null;

        AntlrDatatypeRuleToken this_INTEGER_4 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:1140:28: ( (this_ID_STMT_0= ruleID_STMT | this_BIN_HEX_OCT_1= RULE_BIN_HEX_OCT | this_PLUS_2= RULE_PLUS | this_MINUS_3= RULE_MINUS | ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER ) | ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT ) | kw= '*' | this_BOOL_EXPR_7= RULE_BOOL_EXPR )+ )
            // InternalSpellDatabase.g:1141:1: (this_ID_STMT_0= ruleID_STMT | this_BIN_HEX_OCT_1= RULE_BIN_HEX_OCT | this_PLUS_2= RULE_PLUS | this_MINUS_3= RULE_MINUS | ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER ) | ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT ) | kw= '*' | this_BOOL_EXPR_7= RULE_BOOL_EXPR )+
            {
            // InternalSpellDatabase.g:1141:1: (this_ID_STMT_0= ruleID_STMT | this_BIN_HEX_OCT_1= RULE_BIN_HEX_OCT | this_PLUS_2= RULE_PLUS | this_MINUS_3= RULE_MINUS | ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER ) | ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT ) | kw= '*' | this_BOOL_EXPR_7= RULE_BOOL_EXPR )+
            int cnt23=0;
            loop23:
            do {
                int alt23=9;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // InternalSpellDatabase.g:1142:5: this_ID_STMT_0= ruleID_STMT
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTCValueAccess().getID_STMTParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    this_ID_STMT_0=ruleID_STMT();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_STMT_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalSpellDatabase.g:1153:10: this_BIN_HEX_OCT_1= RULE_BIN_HEX_OCT
            	    {
            	    this_BIN_HEX_OCT_1=(Token)match(input,RULE_BIN_HEX_OCT,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BIN_HEX_OCT_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BIN_HEX_OCT_1, grammarAccess.getTCValueAccess().getBIN_HEX_OCTTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalSpellDatabase.g:1161:10: this_PLUS_2= RULE_PLUS
            	    {
            	    this_PLUS_2=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PLUS_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PLUS_2, grammarAccess.getTCValueAccess().getPLUSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalSpellDatabase.g:1169:10: this_MINUS_3= RULE_MINUS
            	    {
            	    this_MINUS_3=(Token)match(input,RULE_MINUS,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MINUS_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MINUS_3, grammarAccess.getTCValueAccess().getMINUSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // InternalSpellDatabase.g:1177:6: ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER )
            	    {
            	    // InternalSpellDatabase.g:1177:6: ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER )
            	    // InternalSpellDatabase.g:1177:7: ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTCValueAccess().getINTEGERParserRuleCall_4()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    this_INTEGER_4=ruleINTEGER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_INTEGER_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSpellDatabase.g:1189:6: ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT )
            	    {
            	    // InternalSpellDatabase.g:1189:6: ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT )
            	    // InternalSpellDatabase.g:1189:7: ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT
            	    {
            	    this_FLOAT_5=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_FLOAT_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_FLOAT_5, grammarAccess.getTCValueAccess().getFLOATTerminalRuleCall_5()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalSpellDatabase.g:1198:2: kw= '*'
            	    {
            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTCValueAccess().getAsteriskKeyword_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // InternalSpellDatabase.g:1204:10: this_BOOL_EXPR_7= RULE_BOOL_EXPR
            	    {
            	    this_BOOL_EXPR_7=(Token)match(input,RULE_BOOL_EXPR,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BOOL_EXPR_7);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BOOL_EXPR_7, grammarAccess.getTCValueAccess().getBOOL_EXPRTerminalRuleCall_7()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTCValue"


    // $ANTLR start "entryRuleKeyValue"
    // InternalSpellDatabase.g:1222:1: entryRuleKeyValue returns [String current=null] : iv_ruleKeyValue= ruleKeyValue EOF ;
    public final String entryRuleKeyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyValue = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:1226:2: (iv_ruleKeyValue= ruleKeyValue EOF )
            // InternalSpellDatabase.g:1227:2: iv_ruleKeyValue= ruleKeyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyValue=ruleKeyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleKeyValue"


    // $ANTLR start "ruleKeyValue"
    // InternalSpellDatabase.g:1237:1: ruleKeyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_STMT_0= ruleID_STMT | this_BIN_HEX_OCT_1= RULE_BIN_HEX_OCT | this_PLUS_2= RULE_PLUS | this_MINUS_3= RULE_MINUS | ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER ) | ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT ) | kw= '*' | ( ( RULE_STRING )=>this_STRING_7= RULE_STRING ) | this_BOOL_EXPR_8= RULE_BOOL_EXPR )+ ;
    public final AntlrDatatypeRuleToken ruleKeyValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BIN_HEX_OCT_1=null;
        Token this_PLUS_2=null;
        Token this_MINUS_3=null;
        Token this_FLOAT_5=null;
        Token kw=null;
        Token this_STRING_7=null;
        Token this_BOOL_EXPR_8=null;
        AntlrDatatypeRuleToken this_ID_STMT_0 = null;

        AntlrDatatypeRuleToken this_INTEGER_4 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:1241:28: ( (this_ID_STMT_0= ruleID_STMT | this_BIN_HEX_OCT_1= RULE_BIN_HEX_OCT | this_PLUS_2= RULE_PLUS | this_MINUS_3= RULE_MINUS | ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER ) | ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT ) | kw= '*' | ( ( RULE_STRING )=>this_STRING_7= RULE_STRING ) | this_BOOL_EXPR_8= RULE_BOOL_EXPR )+ )
            // InternalSpellDatabase.g:1242:1: (this_ID_STMT_0= ruleID_STMT | this_BIN_HEX_OCT_1= RULE_BIN_HEX_OCT | this_PLUS_2= RULE_PLUS | this_MINUS_3= RULE_MINUS | ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER ) | ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT ) | kw= '*' | ( ( RULE_STRING )=>this_STRING_7= RULE_STRING ) | this_BOOL_EXPR_8= RULE_BOOL_EXPR )+
            {
            // InternalSpellDatabase.g:1242:1: (this_ID_STMT_0= ruleID_STMT | this_BIN_HEX_OCT_1= RULE_BIN_HEX_OCT | this_PLUS_2= RULE_PLUS | this_MINUS_3= RULE_MINUS | ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER ) | ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT ) | kw= '*' | ( ( RULE_STRING )=>this_STRING_7= RULE_STRING ) | this_BOOL_EXPR_8= RULE_BOOL_EXPR )+
            int cnt24=0;
            loop24:
            do {
                int alt24=10;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // InternalSpellDatabase.g:1243:5: this_ID_STMT_0= ruleID_STMT
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getKeyValueAccess().getID_STMTParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    this_ID_STMT_0=ruleID_STMT();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_STMT_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalSpellDatabase.g:1254:10: this_BIN_HEX_OCT_1= RULE_BIN_HEX_OCT
            	    {
            	    this_BIN_HEX_OCT_1=(Token)match(input,RULE_BIN_HEX_OCT,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BIN_HEX_OCT_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BIN_HEX_OCT_1, grammarAccess.getKeyValueAccess().getBIN_HEX_OCTTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalSpellDatabase.g:1262:10: this_PLUS_2= RULE_PLUS
            	    {
            	    this_PLUS_2=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PLUS_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PLUS_2, grammarAccess.getKeyValueAccess().getPLUSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalSpellDatabase.g:1270:10: this_MINUS_3= RULE_MINUS
            	    {
            	    this_MINUS_3=(Token)match(input,RULE_MINUS,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MINUS_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MINUS_3, grammarAccess.getKeyValueAccess().getMINUSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // InternalSpellDatabase.g:1278:6: ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER )
            	    {
            	    // InternalSpellDatabase.g:1278:6: ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER )
            	    // InternalSpellDatabase.g:1278:7: ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getKeyValueAccess().getINTEGERParserRuleCall_4()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    this_INTEGER_4=ruleINTEGER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_INTEGER_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSpellDatabase.g:1290:6: ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT )
            	    {
            	    // InternalSpellDatabase.g:1290:6: ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT )
            	    // InternalSpellDatabase.g:1290:7: ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT
            	    {
            	    this_FLOAT_5=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_FLOAT_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_FLOAT_5, grammarAccess.getKeyValueAccess().getFLOATTerminalRuleCall_5()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalSpellDatabase.g:1299:2: kw= '*'
            	    {
            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getKeyValueAccess().getAsteriskKeyword_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // InternalSpellDatabase.g:1305:6: ( ( RULE_STRING )=>this_STRING_7= RULE_STRING )
            	    {
            	    // InternalSpellDatabase.g:1305:6: ( ( RULE_STRING )=>this_STRING_7= RULE_STRING )
            	    // InternalSpellDatabase.g:1305:7: ( RULE_STRING )=>this_STRING_7= RULE_STRING
            	    {
            	    this_STRING_7=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_STRING_7);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_STRING_7, grammarAccess.getKeyValueAccess().getSTRINGTerminalRuleCall_7()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalSpellDatabase.g:1313:10: this_BOOL_EXPR_8= RULE_BOOL_EXPR
            	    {
            	    this_BOOL_EXPR_8=(Token)match(input,RULE_BOOL_EXPR,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BOOL_EXPR_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BOOL_EXPR_8, grammarAccess.getKeyValueAccess().getBOOL_EXPRTerminalRuleCall_8()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleKeyValue"


    // $ANTLR start "entryRuleCSVTelemetry"
    // InternalSpellDatabase.g:1331:1: entryRuleCSVTelemetry returns [EObject current=null] : iv_ruleCSVTelemetry= ruleCSVTelemetry EOF ;
    public final EObject entryRuleCSVTelemetry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSVTelemetry = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:1335:2: (iv_ruleCSVTelemetry= ruleCSVTelemetry EOF )
            // InternalSpellDatabase.g:1336:2: iv_ruleCSVTelemetry= ruleCSVTelemetry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSVTelemetryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCSVTelemetry=ruleCSVTelemetry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSVTelemetry; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSVTelemetry"


    // $ANTLR start "ruleCSVTelemetry"
    // InternalSpellDatabase.g:1346:1: ruleCSVTelemetry returns [EObject current=null] : (this_TM_0= RULE_TM otherlv_1= ',' otherlv_2= ',' ( ( ( ruleTCArgs ) )=> (lv_tmArg_3_0= ruleTCArgs ) ) (otherlv_4= ',' )* ) ;
    public final EObject ruleCSVTelemetry() throws RecognitionException {
        EObject current = null;

        Token this_TM_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tmArg_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:1350:28: ( (this_TM_0= RULE_TM otherlv_1= ',' otherlv_2= ',' ( ( ( ruleTCArgs ) )=> (lv_tmArg_3_0= ruleTCArgs ) ) (otherlv_4= ',' )* ) )
            // InternalSpellDatabase.g:1351:1: (this_TM_0= RULE_TM otherlv_1= ',' otherlv_2= ',' ( ( ( ruleTCArgs ) )=> (lv_tmArg_3_0= ruleTCArgs ) ) (otherlv_4= ',' )* )
            {
            // InternalSpellDatabase.g:1351:1: (this_TM_0= RULE_TM otherlv_1= ',' otherlv_2= ',' ( ( ( ruleTCArgs ) )=> (lv_tmArg_3_0= ruleTCArgs ) ) (otherlv_4= ',' )* )
            // InternalSpellDatabase.g:1351:2: this_TM_0= RULE_TM otherlv_1= ',' otherlv_2= ',' ( ( ( ruleTCArgs ) )=> (lv_tmArg_3_0= ruleTCArgs ) ) (otherlv_4= ',' )*
            {
            this_TM_0=(Token)match(input,RULE_TM,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_TM_0, grammarAccess.getCSVTelemetryAccess().getTMTerminalRuleCall_0()); 
                  
            }
            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCSVTelemetryAccess().getCommaKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCSVTelemetryAccess().getCommaKeyword_2());
                  
            }
            // InternalSpellDatabase.g:1363:1: ( ( ( ruleTCArgs ) )=> (lv_tmArg_3_0= ruleTCArgs ) )
            // InternalSpellDatabase.g:1363:2: ( ( ruleTCArgs ) )=> (lv_tmArg_3_0= ruleTCArgs )
            {
            // InternalSpellDatabase.g:1368:1: (lv_tmArg_3_0= ruleTCArgs )
            // InternalSpellDatabase.g:1369:3: lv_tmArg_3_0= ruleTCArgs
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSVTelemetryAccess().getTmArgTCArgsParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_18);
            lv_tmArg_3_0=ruleTCArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSVTelemetryRule());
              	        }
                     		set(
                     			current, 
                     			"tmArg",
                      		lv_tmArg_3_0, 
                      		"lu.ses.engineering.spell.SpellDatabase.TCArgs");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSpellDatabase.g:1385:2: (otherlv_4= ',' )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // InternalSpellDatabase.g:1385:4: otherlv_4= ','
            	    {
            	    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getCSVTelemetryAccess().getCommaKeyword_4());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSVTelemetry"


    // $ANTLR start "entryRuleCSVSpell"
    // InternalSpellDatabase.g:1400:1: entryRuleCSVSpell returns [EObject current=null] : iv_ruleCSVSpell= ruleCSVSpell EOF ;
    public final EObject entryRuleCSVSpell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSVSpell = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:1404:2: (iv_ruleCSVSpell= ruleCSVSpell EOF )
            // InternalSpellDatabase.g:1405:2: iv_ruleCSVSpell= ruleCSVSpell EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSVSpellRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCSVSpell=ruleCSVSpell();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSVSpell; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSVSpell"


    // $ANTLR start "ruleCSVSpell"
    // InternalSpellDatabase.g:1415:1: ruleCSVSpell returns [EObject current=null] : (this_SPELL_0= RULE_SPELL otherlv_1= ',' ( ( ( ruleSpellCommand ) )=> (lv_cmd_2_0= ruleSpellCommand ) ) (otherlv_3= ',' )* ) ;
    public final EObject ruleCSVSpell() throws RecognitionException {
        EObject current = null;

        Token this_SPELL_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cmd_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:1419:28: ( (this_SPELL_0= RULE_SPELL otherlv_1= ',' ( ( ( ruleSpellCommand ) )=> (lv_cmd_2_0= ruleSpellCommand ) ) (otherlv_3= ',' )* ) )
            // InternalSpellDatabase.g:1420:1: (this_SPELL_0= RULE_SPELL otherlv_1= ',' ( ( ( ruleSpellCommand ) )=> (lv_cmd_2_0= ruleSpellCommand ) ) (otherlv_3= ',' )* )
            {
            // InternalSpellDatabase.g:1420:1: (this_SPELL_0= RULE_SPELL otherlv_1= ',' ( ( ( ruleSpellCommand ) )=> (lv_cmd_2_0= ruleSpellCommand ) ) (otherlv_3= ',' )* )
            // InternalSpellDatabase.g:1420:2: this_SPELL_0= RULE_SPELL otherlv_1= ',' ( ( ( ruleSpellCommand ) )=> (lv_cmd_2_0= ruleSpellCommand ) ) (otherlv_3= ',' )*
            {
            this_SPELL_0=(Token)match(input,RULE_SPELL,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SPELL_0, grammarAccess.getCSVSpellAccess().getSPELLTerminalRuleCall_0()); 
                  
            }
            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCSVSpellAccess().getCommaKeyword_1());
                  
            }
            // InternalSpellDatabase.g:1428:1: ( ( ( ruleSpellCommand ) )=> (lv_cmd_2_0= ruleSpellCommand ) )
            // InternalSpellDatabase.g:1428:2: ( ( ruleSpellCommand ) )=> (lv_cmd_2_0= ruleSpellCommand )
            {
            // InternalSpellDatabase.g:1433:1: (lv_cmd_2_0= ruleSpellCommand )
            // InternalSpellDatabase.g:1434:3: lv_cmd_2_0= ruleSpellCommand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSVSpellAccess().getCmdSpellCommandParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_18);
            lv_cmd_2_0=ruleSpellCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSVSpellRule());
              	        }
                     		set(
                     			current, 
                     			"cmd",
                      		lv_cmd_2_0, 
                      		"lu.ses.engineering.spell.SpellDatabase.SpellCommand");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSpellDatabase.g:1450:2: (otherlv_3= ',' )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalSpellDatabase.g:1450:4: otherlv_3= ','
            	    {
            	    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getCSVSpellAccess().getCommaKeyword_3());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSVSpell"


    // $ANTLR start "entryRuleSpellCommand"
    // InternalSpellDatabase.g:1465:1: entryRuleSpellCommand returns [EObject current=null] : iv_ruleSpellCommand= ruleSpellCommand EOF ;
    public final EObject entryRuleSpellCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpellCommand = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:1469:2: (iv_ruleSpellCommand= ruleSpellCommand EOF )
            // InternalSpellDatabase.g:1470:2: iv_ruleSpellCommand= ruleSpellCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpellCommandRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpellCommand=ruleSpellCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpellCommand; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSpellCommand"


    // $ANTLR start "ruleSpellCommand"
    // InternalSpellDatabase.g:1480:1: ruleSpellCommand returns [EObject current=null] : ( ( () this_WAIT_1= RULE_WAIT otherlv_2= ',' ( ( ( ruleIntOrFloat ) )=> (lv_value_3_0= ruleIntOrFloat ) ) otherlv_4= ',' ( ( ( RULE_TIME_EXPR ) )=> (lv_unit_5_0= RULE_TIME_EXPR ) ) ) | ( () this_PAUSE_7= RULE_PAUSE (otherlv_8= ',' )* ) ) ;
    public final EObject ruleSpellCommand() throws RecognitionException {
        EObject current = null;

        Token this_WAIT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_unit_5_0=null;
        Token this_PAUSE_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:1484:28: ( ( ( () this_WAIT_1= RULE_WAIT otherlv_2= ',' ( ( ( ruleIntOrFloat ) )=> (lv_value_3_0= ruleIntOrFloat ) ) otherlv_4= ',' ( ( ( RULE_TIME_EXPR ) )=> (lv_unit_5_0= RULE_TIME_EXPR ) ) ) | ( () this_PAUSE_7= RULE_PAUSE (otherlv_8= ',' )* ) ) )
            // InternalSpellDatabase.g:1485:1: ( ( () this_WAIT_1= RULE_WAIT otherlv_2= ',' ( ( ( ruleIntOrFloat ) )=> (lv_value_3_0= ruleIntOrFloat ) ) otherlv_4= ',' ( ( ( RULE_TIME_EXPR ) )=> (lv_unit_5_0= RULE_TIME_EXPR ) ) ) | ( () this_PAUSE_7= RULE_PAUSE (otherlv_8= ',' )* ) )
            {
            // InternalSpellDatabase.g:1485:1: ( ( () this_WAIT_1= RULE_WAIT otherlv_2= ',' ( ( ( ruleIntOrFloat ) )=> (lv_value_3_0= ruleIntOrFloat ) ) otherlv_4= ',' ( ( ( RULE_TIME_EXPR ) )=> (lv_unit_5_0= RULE_TIME_EXPR ) ) ) | ( () this_PAUSE_7= RULE_PAUSE (otherlv_8= ',' )* ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_WAIT) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_PAUSE) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSpellDatabase.g:1485:2: ( () this_WAIT_1= RULE_WAIT otherlv_2= ',' ( ( ( ruleIntOrFloat ) )=> (lv_value_3_0= ruleIntOrFloat ) ) otherlv_4= ',' ( ( ( RULE_TIME_EXPR ) )=> (lv_unit_5_0= RULE_TIME_EXPR ) ) )
                    {
                    // InternalSpellDatabase.g:1485:2: ( () this_WAIT_1= RULE_WAIT otherlv_2= ',' ( ( ( ruleIntOrFloat ) )=> (lv_value_3_0= ruleIntOrFloat ) ) otherlv_4= ',' ( ( ( RULE_TIME_EXPR ) )=> (lv_unit_5_0= RULE_TIME_EXPR ) ) )
                    // InternalSpellDatabase.g:1485:3: () this_WAIT_1= RULE_WAIT otherlv_2= ',' ( ( ( ruleIntOrFloat ) )=> (lv_value_3_0= ruleIntOrFloat ) ) otherlv_4= ',' ( ( ( RULE_TIME_EXPR ) )=> (lv_unit_5_0= RULE_TIME_EXPR ) )
                    {
                    // InternalSpellDatabase.g:1485:3: ()
                    // InternalSpellDatabase.g:1486:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSpellCommandAccess().getWaitCommandAction_0_0(),
                                  current);
                          
                    }

                    }

                    this_WAIT_1=(Token)match(input,RULE_WAIT,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WAIT_1, grammarAccess.getSpellCommandAccess().getWAITTerminalRuleCall_0_1()); 
                          
                    }
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSpellCommandAccess().getCommaKeyword_0_2());
                          
                    }
                    // InternalSpellDatabase.g:1499:1: ( ( ( ruleIntOrFloat ) )=> (lv_value_3_0= ruleIntOrFloat ) )
                    // InternalSpellDatabase.g:1499:2: ( ( ruleIntOrFloat ) )=> (lv_value_3_0= ruleIntOrFloat )
                    {
                    // InternalSpellDatabase.g:1504:1: (lv_value_3_0= ruleIntOrFloat )
                    // InternalSpellDatabase.g:1505:3: lv_value_3_0= ruleIntOrFloat
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSpellCommandAccess().getValueIntOrFloatParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
                    lv_value_3_0=ruleIntOrFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSpellCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.IntOrFloat");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSpellCommandAccess().getCommaKeyword_0_4());
                          
                    }
                    // InternalSpellDatabase.g:1525:1: ( ( ( RULE_TIME_EXPR ) )=> (lv_unit_5_0= RULE_TIME_EXPR ) )
                    // InternalSpellDatabase.g:1525:2: ( ( RULE_TIME_EXPR ) )=> (lv_unit_5_0= RULE_TIME_EXPR )
                    {
                    // InternalSpellDatabase.g:1531:1: (lv_unit_5_0= RULE_TIME_EXPR )
                    // InternalSpellDatabase.g:1532:3: lv_unit_5_0= RULE_TIME_EXPR
                    {
                    lv_unit_5_0=(Token)match(input,RULE_TIME_EXPR,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_unit_5_0, grammarAccess.getSpellCommandAccess().getUnitTIME_EXPRTerminalRuleCall_0_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSpellCommandRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"unit",
                              		lv_unit_5_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.TIME_EXPR");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:1549:6: ( () this_PAUSE_7= RULE_PAUSE (otherlv_8= ',' )* )
                    {
                    // InternalSpellDatabase.g:1549:6: ( () this_PAUSE_7= RULE_PAUSE (otherlv_8= ',' )* )
                    // InternalSpellDatabase.g:1549:7: () this_PAUSE_7= RULE_PAUSE (otherlv_8= ',' )*
                    {
                    // InternalSpellDatabase.g:1549:7: ()
                    // InternalSpellDatabase.g:1550:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSpellCommandAccess().getPauseCommandAction_1_0(),
                                  current);
                          
                    }

                    }

                    this_PAUSE_7=(Token)match(input,RULE_PAUSE,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PAUSE_7, grammarAccess.getSpellCommandAccess().getPAUSETerminalRuleCall_1_1()); 
                          
                    }
                    // InternalSpellDatabase.g:1559:1: (otherlv_8= ',' )*
                    loop27:
                    do {
                        int alt27=2;
                        alt27 = dfa27.predict(input);
                        switch (alt27) {
                    	case 1 :
                    	    // InternalSpellDatabase.g:1559:3: otherlv_8= ','
                    	    {
                    	    otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getSpellCommandAccess().getCommaKeyword_1_2());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSpellCommand"


    // $ANTLR start "entryRuleIntOrFloat"
    // InternalSpellDatabase.g:1574:1: entryRuleIntOrFloat returns [String current=null] : iv_ruleIntOrFloat= ruleIntOrFloat EOF ;
    public final String entryRuleIntOrFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntOrFloat = null;


        try {
            // InternalSpellDatabase.g:1575:2: (iv_ruleIntOrFloat= ruleIntOrFloat EOF )
            // InternalSpellDatabase.g:1576:2: iv_ruleIntOrFloat= ruleIntOrFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntOrFloatRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntOrFloat=ruleIntOrFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntOrFloat.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntOrFloat"


    // $ANTLR start "ruleIntOrFloat"
    // InternalSpellDatabase.g:1583:1: ruleIntOrFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_Val_0= ruleFLOAT_Val | this_INTEGER_1= ruleINTEGER ) ;
    public final AntlrDatatypeRuleToken ruleIntOrFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FLOAT_Val_0 = null;

        AntlrDatatypeRuleToken this_INTEGER_1 = null;


         enterRule(); 
            
        try {
            // InternalSpellDatabase.g:1586:28: ( (this_FLOAT_Val_0= ruleFLOAT_Val | this_INTEGER_1= ruleINTEGER ) )
            // InternalSpellDatabase.g:1587:1: (this_FLOAT_Val_0= ruleFLOAT_Val | this_INTEGER_1= ruleINTEGER )
            {
            // InternalSpellDatabase.g:1587:1: (this_FLOAT_Val_0= ruleFLOAT_Val | this_INTEGER_1= ruleINTEGER )
            int alt29=2;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==RULE_FLOAT) ) {
                    alt29=1;
                }
                else if ( (LA29_1==RULE_INT) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MINUS:
                {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==RULE_FLOAT) ) {
                    alt29=1;
                }
                else if ( (LA29_2==RULE_INT) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                alt29=1;
                }
                break;
            case RULE_INT:
                {
                alt29=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalSpellDatabase.g:1588:5: this_FLOAT_Val_0= ruleFLOAT_Val
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIntOrFloatAccess().getFLOAT_ValParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FLOAT_Val_0=ruleFLOAT_Val();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FLOAT_Val_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:1600:5: this_INTEGER_1= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIntOrFloatAccess().getINTEGERParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_INTEGER_1=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INTEGER_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
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
    // $ANTLR end "ruleIntOrFloat"


    // $ANTLR start "entryRulePosIntOrFloat"
    // InternalSpellDatabase.g:1618:1: entryRulePosIntOrFloat returns [String current=null] : iv_rulePosIntOrFloat= rulePosIntOrFloat EOF ;
    public final String entryRulePosIntOrFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePosIntOrFloat = null;


        try {
            // InternalSpellDatabase.g:1619:2: (iv_rulePosIntOrFloat= rulePosIntOrFloat EOF )
            // InternalSpellDatabase.g:1620:2: iv_rulePosIntOrFloat= rulePosIntOrFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPosIntOrFloatRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePosIntOrFloat=rulePosIntOrFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePosIntOrFloat.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePosIntOrFloat"


    // $ANTLR start "rulePosIntOrFloat"
    // InternalSpellDatabase.g:1627:1: rulePosIntOrFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_0= RULE_FLOAT | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePosIntOrFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalSpellDatabase.g:1630:28: ( (this_FLOAT_0= RULE_FLOAT | this_INT_1= RULE_INT ) )
            // InternalSpellDatabase.g:1631:1: (this_FLOAT_0= RULE_FLOAT | this_INT_1= RULE_INT )
            {
            // InternalSpellDatabase.g:1631:1: (this_FLOAT_0= RULE_FLOAT | this_INT_1= RULE_INT )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_FLOAT) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_INT) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSpellDatabase.g:1631:6: this_FLOAT_0= RULE_FLOAT
                    {
                    this_FLOAT_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FLOAT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FLOAT_0, grammarAccess.getPosIntOrFloatAccess().getFLOATTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:1639:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getPosIntOrFloatAccess().getINTTerminalRuleCall_1()); 
                          
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
    // $ANTLR end "rulePosIntOrFloat"


    // $ANTLR start "entryRuleDatabaseEntry"
    // InternalSpellDatabase.g:1654:1: entryRuleDatabaseEntry returns [EObject current=null] : iv_ruleDatabaseEntry= ruleDatabaseEntry EOF ;
    public final EObject entryRuleDatabaseEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseEntry = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:1658:2: (iv_ruleDatabaseEntry= ruleDatabaseEntry EOF )
            // InternalSpellDatabase.g:1659:2: iv_ruleDatabaseEntry= ruleDatabaseEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatabaseEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDatabaseEntry=ruleDatabaseEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatabaseEntry; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDatabaseEntry"


    // $ANTLR start "ruleDatabaseEntry"
    // InternalSpellDatabase.g:1669:1: ruleDatabaseEntry returns [EObject current=null] : ( ( (lv_name_0_0= ruleKeyValue ) ) (this_WS_1= RULE_WS )? ruleSkipped_NL (this_WS_3= RULE_WS )? ( (lv_value_4_0= ruleDatabaseValue ) )? ) ;
    public final EObject ruleDatabaseEntry() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token this_WS_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:1673:28: ( ( ( (lv_name_0_0= ruleKeyValue ) ) (this_WS_1= RULE_WS )? ruleSkipped_NL (this_WS_3= RULE_WS )? ( (lv_value_4_0= ruleDatabaseValue ) )? ) )
            // InternalSpellDatabase.g:1674:1: ( ( (lv_name_0_0= ruleKeyValue ) ) (this_WS_1= RULE_WS )? ruleSkipped_NL (this_WS_3= RULE_WS )? ( (lv_value_4_0= ruleDatabaseValue ) )? )
            {
            // InternalSpellDatabase.g:1674:1: ( ( (lv_name_0_0= ruleKeyValue ) ) (this_WS_1= RULE_WS )? ruleSkipped_NL (this_WS_3= RULE_WS )? ( (lv_value_4_0= ruleDatabaseValue ) )? )
            // InternalSpellDatabase.g:1674:2: ( (lv_name_0_0= ruleKeyValue ) ) (this_WS_1= RULE_WS )? ruleSkipped_NL (this_WS_3= RULE_WS )? ( (lv_value_4_0= ruleDatabaseValue ) )?
            {
            // InternalSpellDatabase.g:1674:2: ( (lv_name_0_0= ruleKeyValue ) )
            // InternalSpellDatabase.g:1675:1: (lv_name_0_0= ruleKeyValue )
            {
            // InternalSpellDatabase.g:1675:1: (lv_name_0_0= ruleKeyValue )
            // InternalSpellDatabase.g:1676:3: lv_name_0_0= ruleKeyValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDatabaseEntryAccess().getNameKeyValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_28);
            lv_name_0_0=ruleKeyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDatabaseEntryRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"lu.ses.engineering.spell.SpellDatabase.KeyValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSpellDatabase.g:1692:2: (this_WS_1= RULE_WS )?
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalSpellDatabase.g:1692:3: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_1, grammarAccess.getDatabaseEntryAccess().getWSTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDatabaseEntryAccess().getSkipped_NLParserRuleCall_2()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_29);
            ruleSkipped_NL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpellDatabase.g:1704:1: (this_WS_3= RULE_WS )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalSpellDatabase.g:1704:2: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_3, grammarAccess.getDatabaseEntryAccess().getWSTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;

            }

            // InternalSpellDatabase.g:1708:3: ( (lv_value_4_0= ruleDatabaseValue ) )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalSpellDatabase.g:1709:1: (lv_value_4_0= ruleDatabaseValue )
                    {
                    // InternalSpellDatabase.g:1709:1: (lv_value_4_0= ruleDatabaseValue )
                    // InternalSpellDatabase.g:1710:3: lv_value_4_0= ruleDatabaseValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDatabaseEntryAccess().getValueDatabaseValueParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_4_0=ruleDatabaseValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDatabaseEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.DatabaseValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDatabaseEntry"


    // $ANTLR start "entryRuleDatabaseValue"
    // InternalSpellDatabase.g:1737:1: entryRuleDatabaseValue returns [EObject current=null] : iv_ruleDatabaseValue= ruleDatabaseValue EOF ;
    public final EObject entryRuleDatabaseValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseValue = null;


        try {
            // InternalSpellDatabase.g:1738:2: (iv_ruleDatabaseValue= ruleDatabaseValue EOF )
            // InternalSpellDatabase.g:1739:2: iv_ruleDatabaseValue= ruleDatabaseValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatabaseValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDatabaseValue=ruleDatabaseValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatabaseValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDatabaseValue"


    // $ANTLR start "ruleDatabaseValue"
    // InternalSpellDatabase.g:1746:1: ruleDatabaseValue returns [EObject current=null] : (this_ComplexValue_0= ruleComplexValue | ( ( ruleRelDate )=>this_RelDate_1= ruleRelDate ) | ( ( ruleDate )=>this_Date_2= ruleDate ) | ( ( ruleAtom )=>this_Atom_3= ruleAtom ) ) ;
    public final EObject ruleDatabaseValue() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexValue_0 = null;

        EObject this_RelDate_1 = null;

        EObject this_Date_2 = null;

        EObject this_Atom_3 = null;


         enterRule(); 
            
        try {
            // InternalSpellDatabase.g:1749:28: ( (this_ComplexValue_0= ruleComplexValue | ( ( ruleRelDate )=>this_RelDate_1= ruleRelDate ) | ( ( ruleDate )=>this_Date_2= ruleDate ) | ( ( ruleAtom )=>this_Atom_3= ruleAtom ) ) )
            // InternalSpellDatabase.g:1750:1: (this_ComplexValue_0= ruleComplexValue | ( ( ruleRelDate )=>this_RelDate_1= ruleRelDate ) | ( ( ruleDate )=>this_Date_2= ruleDate ) | ( ( ruleAtom )=>this_Atom_3= ruleAtom ) )
            {
            // InternalSpellDatabase.g:1750:1: (this_ComplexValue_0= ruleComplexValue | ( ( ruleRelDate )=>this_RelDate_1= ruleRelDate ) | ( ( ruleDate )=>this_Date_2= ruleDate ) | ( ( ruleAtom )=>this_Atom_3= ruleAtom ) )
            int alt34=4;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalSpellDatabase.g:1751:5: this_ComplexValue_0= ruleComplexValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDatabaseValueAccess().getComplexValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ComplexValue_0=ruleComplexValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComplexValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:1760:6: ( ( ruleRelDate )=>this_RelDate_1= ruleRelDate )
                    {
                    // InternalSpellDatabase.g:1760:6: ( ( ruleRelDate )=>this_RelDate_1= ruleRelDate )
                    // InternalSpellDatabase.g:1760:7: ( ruleRelDate )=>this_RelDate_1= ruleRelDate
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDatabaseValueAccess().getRelDateParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RelDate_1=ruleRelDate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RelDate_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSpellDatabase.g:1770:6: ( ( ruleDate )=>this_Date_2= ruleDate )
                    {
                    // InternalSpellDatabase.g:1770:6: ( ( ruleDate )=>this_Date_2= ruleDate )
                    // InternalSpellDatabase.g:1770:7: ( ruleDate )=>this_Date_2= ruleDate
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDatabaseValueAccess().getDateParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Date_2=ruleDate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Date_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSpellDatabase.g:1780:6: ( ( ruleAtom )=>this_Atom_3= ruleAtom )
                    {
                    // InternalSpellDatabase.g:1780:6: ( ( ruleAtom )=>this_Atom_3= ruleAtom )
                    // InternalSpellDatabase.g:1780:7: ( ruleAtom )=>this_Atom_3= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDatabaseValueAccess().getAtomParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Atom_3=ruleAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atom_3; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleDatabaseValue"


    // $ANTLR start "entryRuleLambda_Stmt"
    // InternalSpellDatabase.g:1797:1: entryRuleLambda_Stmt returns [EObject current=null] : iv_ruleLambda_Stmt= ruleLambda_Stmt EOF ;
    public final EObject entryRuleLambda_Stmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda_Stmt = null;


        try {
            // InternalSpellDatabase.g:1798:2: (iv_ruleLambda_Stmt= ruleLambda_Stmt EOF )
            // InternalSpellDatabase.g:1799:2: iv_ruleLambda_Stmt= ruleLambda_Stmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambda_StmtRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLambda_Stmt=ruleLambda_Stmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambda_Stmt; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLambda_Stmt"


    // $ANTLR start "ruleLambda_Stmt"
    // InternalSpellDatabase.g:1806:1: ruleLambda_Stmt returns [EObject current=null] : ( () this_LAMBDA_1= RULE_LAMBDA ( (lv_variables_2_0= ruleLambda_Vars ) )? this_COLON_3= RULE_COLON ( (lv_val_4_0= ruleLambda_Function ) )? ) ;
    public final EObject ruleLambda_Stmt() throws RecognitionException {
        EObject current = null;

        Token this_LAMBDA_1=null;
        Token this_COLON_3=null;
        AntlrDatatypeRuleToken lv_variables_2_0 = null;

        AntlrDatatypeRuleToken lv_val_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSpellDatabase.g:1809:28: ( ( () this_LAMBDA_1= RULE_LAMBDA ( (lv_variables_2_0= ruleLambda_Vars ) )? this_COLON_3= RULE_COLON ( (lv_val_4_0= ruleLambda_Function ) )? ) )
            // InternalSpellDatabase.g:1810:1: ( () this_LAMBDA_1= RULE_LAMBDA ( (lv_variables_2_0= ruleLambda_Vars ) )? this_COLON_3= RULE_COLON ( (lv_val_4_0= ruleLambda_Function ) )? )
            {
            // InternalSpellDatabase.g:1810:1: ( () this_LAMBDA_1= RULE_LAMBDA ( (lv_variables_2_0= ruleLambda_Vars ) )? this_COLON_3= RULE_COLON ( (lv_val_4_0= ruleLambda_Function ) )? )
            // InternalSpellDatabase.g:1810:2: () this_LAMBDA_1= RULE_LAMBDA ( (lv_variables_2_0= ruleLambda_Vars ) )? this_COLON_3= RULE_COLON ( (lv_val_4_0= ruleLambda_Function ) )?
            {
            // InternalSpellDatabase.g:1810:2: ()
            // InternalSpellDatabase.g:1811:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLambda_StmtAccess().getLambda_StmtAction_0(),
                          current);
                  
            }

            }

            this_LAMBDA_1=(Token)match(input,RULE_LAMBDA,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LAMBDA_1, grammarAccess.getLambda_StmtAccess().getLAMBDATerminalRuleCall_1()); 
                  
            }
            // InternalSpellDatabase.g:1820:1: ( (lv_variables_2_0= ruleLambda_Vars ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSpellDatabase.g:1821:1: (lv_variables_2_0= ruleLambda_Vars )
                    {
                    // InternalSpellDatabase.g:1821:1: (lv_variables_2_0= ruleLambda_Vars )
                    // InternalSpellDatabase.g:1822:3: lv_variables_2_0= ruleLambda_Vars
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLambda_StmtAccess().getVariablesLambda_VarsParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_variables_2_0=ruleLambda_Vars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLambda_StmtRule());
                      	        }
                             		set(
                             			current, 
                             			"variables",
                              		lv_variables_2_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.Lambda_Vars");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_COLON_3=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_3, grammarAccess.getLambda_StmtAccess().getCOLONTerminalRuleCall_3()); 
                  
            }
            // InternalSpellDatabase.g:1842:1: ( (lv_val_4_0= ruleLambda_Function ) )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalSpellDatabase.g:1843:1: (lv_val_4_0= ruleLambda_Function )
                    {
                    // InternalSpellDatabase.g:1843:1: (lv_val_4_0= ruleLambda_Function )
                    // InternalSpellDatabase.g:1844:3: lv_val_4_0= ruleLambda_Function
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLambda_StmtAccess().getValLambda_FunctionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_val_4_0=ruleLambda_Function();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLambda_StmtRule());
                      	        }
                             		set(
                             			current, 
                             			"val",
                              		lv_val_4_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.Lambda_Function");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "ruleLambda_Stmt"


    // $ANTLR start "entryRuleLambda_Function"
    // InternalSpellDatabase.g:1868:1: entryRuleLambda_Function returns [String current=null] : iv_ruleLambda_Function= ruleLambda_Function EOF ;
    public final String entryRuleLambda_Function() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLambda_Function = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ANY_OTHER", "RULE_WS");
        	
        try {
            // InternalSpellDatabase.g:1872:2: (iv_ruleLambda_Function= ruleLambda_Function EOF )
            // InternalSpellDatabase.g:1873:2: iv_ruleLambda_Function= ruleLambda_Function EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambda_FunctionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLambda_Function=ruleLambda_Function();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambda_Function.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLambda_Function"


    // $ANTLR start "ruleLambda_Function"
    // InternalSpellDatabase.g:1883:1: ruleLambda_Function returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Lambda_Partial_Func_0= ruleLambda_Partial_Func )+ ;
    public final AntlrDatatypeRuleToken ruleLambda_Function() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Lambda_Partial_Func_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ANY_OTHER", "RULE_WS");
            
        try {
            // InternalSpellDatabase.g:1887:28: ( (this_Lambda_Partial_Func_0= ruleLambda_Partial_Func )+ )
            // InternalSpellDatabase.g:1888:1: (this_Lambda_Partial_Func_0= ruleLambda_Partial_Func )+
            {
            // InternalSpellDatabase.g:1888:1: (this_Lambda_Partial_Func_0= ruleLambda_Partial_Func )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // InternalSpellDatabase.g:1889:5: this_Lambda_Partial_Func_0= ruleLambda_Partial_Func
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getLambda_FunctionAccess().getLambda_Partial_FuncParserRuleCall()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    this_Lambda_Partial_Func_0=ruleLambda_Partial_Func();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Lambda_Partial_Func_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLambda_Function"


    // $ANTLR start "entryRuleLambda_Partial_Func"
    // InternalSpellDatabase.g:1910:1: entryRuleLambda_Partial_Func returns [String current=null] : iv_ruleLambda_Partial_Func= ruleLambda_Partial_Func EOF ;
    public final String entryRuleLambda_Partial_Func() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLambda_Partial_Func = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ANY_OTHER", "RULE_WS");
        	
        try {
            // InternalSpellDatabase.g:1914:2: (iv_ruleLambda_Partial_Func= ruleLambda_Partial_Func EOF )
            // InternalSpellDatabase.g:1915:2: iv_ruleLambda_Partial_Func= ruleLambda_Partial_Func EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambda_Partial_FuncRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLambda_Partial_Func=ruleLambda_Partial_Func();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambda_Partial_Func.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLambda_Partial_Func"


    // $ANTLR start "ruleLambda_Partial_Func"
    // InternalSpellDatabase.g:1925:1: ruleLambda_Partial_Func returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | this_FLOAT_1= RULE_FLOAT | this_INT_2= RULE_INT | this_PLUS_3= RULE_PLUS | this_MINUS_4= RULE_MINUS | this_ML_COMMENT_5= RULE_ML_COMMENT | this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT | this_BOOL_EXPR_7= RULE_BOOL_EXPR | this_STRING_8= RULE_STRING | this_ANY_OTHER_9= RULE_ANY_OTHER ) | (this_LAMBDA_10= RULE_LAMBDA (this_Lambda_Vars_11= ruleLambda_Vars )? this_COLON_12= RULE_COLON (this_Lambda_Function_13= ruleLambda_Function )? ) ) ;
    public final AntlrDatatypeRuleToken ruleLambda_Partial_Func() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_FLOAT_1=null;
        Token this_INT_2=null;
        Token this_PLUS_3=null;
        Token this_MINUS_4=null;
        Token this_ML_COMMENT_5=null;
        Token this_BIN_HEX_OCT_6=null;
        Token this_BOOL_EXPR_7=null;
        Token this_STRING_8=null;
        Token this_ANY_OTHER_9=null;
        Token this_LAMBDA_10=null;
        Token this_COLON_12=null;
        AntlrDatatypeRuleToken this_Lambda_Vars_11 = null;

        AntlrDatatypeRuleToken this_Lambda_Function_13 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ANY_OTHER", "RULE_WS");
            
        try {
            // InternalSpellDatabase.g:1929:28: ( ( (this_ID_0= RULE_ID | this_FLOAT_1= RULE_FLOAT | this_INT_2= RULE_INT | this_PLUS_3= RULE_PLUS | this_MINUS_4= RULE_MINUS | this_ML_COMMENT_5= RULE_ML_COMMENT | this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT | this_BOOL_EXPR_7= RULE_BOOL_EXPR | this_STRING_8= RULE_STRING | this_ANY_OTHER_9= RULE_ANY_OTHER ) | (this_LAMBDA_10= RULE_LAMBDA (this_Lambda_Vars_11= ruleLambda_Vars )? this_COLON_12= RULE_COLON (this_Lambda_Function_13= ruleLambda_Function )? ) ) )
            // InternalSpellDatabase.g:1930:1: ( (this_ID_0= RULE_ID | this_FLOAT_1= RULE_FLOAT | this_INT_2= RULE_INT | this_PLUS_3= RULE_PLUS | this_MINUS_4= RULE_MINUS | this_ML_COMMENT_5= RULE_ML_COMMENT | this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT | this_BOOL_EXPR_7= RULE_BOOL_EXPR | this_STRING_8= RULE_STRING | this_ANY_OTHER_9= RULE_ANY_OTHER ) | (this_LAMBDA_10= RULE_LAMBDA (this_Lambda_Vars_11= ruleLambda_Vars )? this_COLON_12= RULE_COLON (this_Lambda_Function_13= ruleLambda_Function )? ) )
            {
            // InternalSpellDatabase.g:1930:1: ( (this_ID_0= RULE_ID | this_FLOAT_1= RULE_FLOAT | this_INT_2= RULE_INT | this_PLUS_3= RULE_PLUS | this_MINUS_4= RULE_MINUS | this_ML_COMMENT_5= RULE_ML_COMMENT | this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT | this_BOOL_EXPR_7= RULE_BOOL_EXPR | this_STRING_8= RULE_STRING | this_ANY_OTHER_9= RULE_ANY_OTHER ) | (this_LAMBDA_10= RULE_LAMBDA (this_Lambda_Vars_11= ruleLambda_Vars )? this_COLON_12= RULE_COLON (this_Lambda_Function_13= ruleLambda_Function )? ) )
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalSpellDatabase.g:1930:2: (this_ID_0= RULE_ID | this_FLOAT_1= RULE_FLOAT | this_INT_2= RULE_INT | this_PLUS_3= RULE_PLUS | this_MINUS_4= RULE_MINUS | this_ML_COMMENT_5= RULE_ML_COMMENT | this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT | this_BOOL_EXPR_7= RULE_BOOL_EXPR | this_STRING_8= RULE_STRING | this_ANY_OTHER_9= RULE_ANY_OTHER )
                    {
                    // InternalSpellDatabase.g:1930:2: (this_ID_0= RULE_ID | this_FLOAT_1= RULE_FLOAT | this_INT_2= RULE_INT | this_PLUS_3= RULE_PLUS | this_MINUS_4= RULE_MINUS | this_ML_COMMENT_5= RULE_ML_COMMENT | this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT | this_BOOL_EXPR_7= RULE_BOOL_EXPR | this_STRING_8= RULE_STRING | this_ANY_OTHER_9= RULE_ANY_OTHER )
                    int alt38=10;
                    alt38 = dfa38.predict(input);
                    switch (alt38) {
                        case 1 :
                            // InternalSpellDatabase.g:1930:7: this_ID_0= RULE_ID
                            {
                            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ID_0);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ID_0, grammarAccess.getLambda_Partial_FuncAccess().getIDTerminalRuleCall_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpellDatabase.g:1938:10: this_FLOAT_1= RULE_FLOAT
                            {
                            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FLOAT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_FLOAT_1, grammarAccess.getLambda_Partial_FuncAccess().getFLOATTerminalRuleCall_0_1()); 
                                  
                            }

                            }
                            break;
                        case 3 :
                            // InternalSpellDatabase.g:1946:10: this_INT_2= RULE_INT
                            {
                            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_2, grammarAccess.getLambda_Partial_FuncAccess().getINTTerminalRuleCall_0_2()); 
                                  
                            }

                            }
                            break;
                        case 4 :
                            // InternalSpellDatabase.g:1954:10: this_PLUS_3= RULE_PLUS
                            {
                            this_PLUS_3=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_PLUS_3);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_PLUS_3, grammarAccess.getLambda_Partial_FuncAccess().getPLUSTerminalRuleCall_0_3()); 
                                  
                            }

                            }
                            break;
                        case 5 :
                            // InternalSpellDatabase.g:1962:10: this_MINUS_4= RULE_MINUS
                            {
                            this_MINUS_4=(Token)match(input,RULE_MINUS,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_MINUS_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_MINUS_4, grammarAccess.getLambda_Partial_FuncAccess().getMINUSTerminalRuleCall_0_4()); 
                                  
                            }

                            }
                            break;
                        case 6 :
                            // InternalSpellDatabase.g:1970:10: this_ML_COMMENT_5= RULE_ML_COMMENT
                            {
                            this_ML_COMMENT_5=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ML_COMMENT_5);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ML_COMMENT_5, grammarAccess.getLambda_Partial_FuncAccess().getML_COMMENTTerminalRuleCall_0_5()); 
                                  
                            }

                            }
                            break;
                        case 7 :
                            // InternalSpellDatabase.g:1978:10: this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT
                            {
                            this_BIN_HEX_OCT_6=(Token)match(input,RULE_BIN_HEX_OCT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_BIN_HEX_OCT_6);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_BIN_HEX_OCT_6, grammarAccess.getLambda_Partial_FuncAccess().getBIN_HEX_OCTTerminalRuleCall_0_6()); 
                                  
                            }

                            }
                            break;
                        case 8 :
                            // InternalSpellDatabase.g:1986:10: this_BOOL_EXPR_7= RULE_BOOL_EXPR
                            {
                            this_BOOL_EXPR_7=(Token)match(input,RULE_BOOL_EXPR,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_BOOL_EXPR_7);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_BOOL_EXPR_7, grammarAccess.getLambda_Partial_FuncAccess().getBOOL_EXPRTerminalRuleCall_0_7()); 
                                  
                            }

                            }
                            break;
                        case 9 :
                            // InternalSpellDatabase.g:1994:10: this_STRING_8= RULE_STRING
                            {
                            this_STRING_8=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_STRING_8);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_STRING_8, grammarAccess.getLambda_Partial_FuncAccess().getSTRINGTerminalRuleCall_0_8()); 
                                  
                            }

                            }
                            break;
                        case 10 :
                            // InternalSpellDatabase.g:2002:10: this_ANY_OTHER_9= RULE_ANY_OTHER
                            {
                            this_ANY_OTHER_9=(Token)match(input,RULE_ANY_OTHER,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ANY_OTHER_9);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ANY_OTHER_9, grammarAccess.getLambda_Partial_FuncAccess().getANY_OTHERTerminalRuleCall_0_9()); 
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:2010:6: (this_LAMBDA_10= RULE_LAMBDA (this_Lambda_Vars_11= ruleLambda_Vars )? this_COLON_12= RULE_COLON (this_Lambda_Function_13= ruleLambda_Function )? )
                    {
                    // InternalSpellDatabase.g:2010:6: (this_LAMBDA_10= RULE_LAMBDA (this_Lambda_Vars_11= ruleLambda_Vars )? this_COLON_12= RULE_COLON (this_Lambda_Function_13= ruleLambda_Function )? )
                    // InternalSpellDatabase.g:2010:11: this_LAMBDA_10= RULE_LAMBDA (this_Lambda_Vars_11= ruleLambda_Vars )? this_COLON_12= RULE_COLON (this_Lambda_Function_13= ruleLambda_Function )?
                    {
                    this_LAMBDA_10=(Token)match(input,RULE_LAMBDA,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LAMBDA_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LAMBDA_10, grammarAccess.getLambda_Partial_FuncAccess().getLAMBDATerminalRuleCall_1_0()); 
                          
                    }
                    // InternalSpellDatabase.g:2017:1: (this_Lambda_Vars_11= ruleLambda_Vars )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalSpellDatabase.g:2018:5: this_Lambda_Vars_11= ruleLambda_Vars
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getLambda_Partial_FuncAccess().getLambda_VarsParserRuleCall_1_1()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_12);
                            this_Lambda_Vars_11=ruleLambda_Vars();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Lambda_Vars_11);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    this_COLON_12=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COLON_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_12, grammarAccess.getLambda_Partial_FuncAccess().getCOLONTerminalRuleCall_1_2()); 
                          
                    }
                    // InternalSpellDatabase.g:2035:1: (this_Lambda_Function_13= ruleLambda_Function )?
                    int alt40=2;
                    alt40 = dfa40.predict(input);
                    switch (alt40) {
                        case 1 :
                            // InternalSpellDatabase.g:2036:5: this_Lambda_Function_13= ruleLambda_Function
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getLambda_Partial_FuncAccess().getLambda_FunctionParserRuleCall_1_3()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            this_Lambda_Function_13=ruleLambda_Function();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Lambda_Function_13);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLambda_Partial_Func"


    // $ANTLR start "entryRuleLambda_Vars"
    // InternalSpellDatabase.g:2057:1: entryRuleLambda_Vars returns [String current=null] : iv_ruleLambda_Vars= ruleLambda_Vars EOF ;
    public final String entryRuleLambda_Vars() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLambda_Vars = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ANY_OTHER", "RULE_WS");
        	
        try {
            // InternalSpellDatabase.g:2061:2: (iv_ruleLambda_Vars= ruleLambda_Vars EOF )
            // InternalSpellDatabase.g:2062:2: iv_ruleLambda_Vars= ruleLambda_Vars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambda_VarsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLambda_Vars=ruleLambda_Vars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambda_Vars.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLambda_Vars"


    // $ANTLR start "ruleLambda_Vars"
    // InternalSpellDatabase.g:2072:1: ruleLambda_Vars returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleLambda_Vars() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ANY_OTHER", "RULE_WS");
            
        try {
            // InternalSpellDatabase.g:2076:28: ( (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) )
            // InternalSpellDatabase.g:2077:1: (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* )
            {
            // InternalSpellDatabase.g:2077:1: (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* )
            // InternalSpellDatabase.g:2077:6: this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getLambda_VarsAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalSpellDatabase.g:2084:1: (kw= ',' this_ID_2= RULE_ID )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==31) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSpellDatabase.g:2085:2: kw= ',' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getLambda_VarsAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getLambda_VarsAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLambda_Vars"


    // $ANTLR start "entryRuleComplexValue"
    // InternalSpellDatabase.g:2108:1: entryRuleComplexValue returns [EObject current=null] : iv_ruleComplexValue= ruleComplexValue EOF ;
    public final EObject entryRuleComplexValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexValue = null;


        try {
            // InternalSpellDatabase.g:2109:2: (iv_ruleComplexValue= ruleComplexValue EOF )
            // InternalSpellDatabase.g:2110:2: iv_ruleComplexValue= ruleComplexValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComplexValue=ruleComplexValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComplexValue"


    // $ANTLR start "ruleComplexValue"
    // InternalSpellDatabase.g:2117:1: ruleComplexValue returns [EObject current=null] : (this_Dictionary_0= ruleDictionary | this_List_1= ruleList | this_Tuple_2= ruleTuple ) ;
    public final EObject ruleComplexValue() throws RecognitionException {
        EObject current = null;

        EObject this_Dictionary_0 = null;

        EObject this_List_1 = null;

        EObject this_Tuple_2 = null;


         enterRule(); 
            
        try {
            // InternalSpellDatabase.g:2120:28: ( (this_Dictionary_0= ruleDictionary | this_List_1= ruleList | this_Tuple_2= ruleTuple ) )
            // InternalSpellDatabase.g:2121:1: (this_Dictionary_0= ruleDictionary | this_List_1= ruleList | this_Tuple_2= ruleTuple )
            {
            // InternalSpellDatabase.g:2121:1: (this_Dictionary_0= ruleDictionary | this_List_1= ruleList | this_Tuple_2= ruleTuple )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt43=1;
                }
                break;
            case 35:
                {
                alt43=2;
                }
                break;
            case 33:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalSpellDatabase.g:2122:5: this_Dictionary_0= ruleDictionary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexValueAccess().getDictionaryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Dictionary_0=ruleDictionary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Dictionary_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:2132:5: this_List_1= ruleList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexValueAccess().getListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_List_1=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_List_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSpellDatabase.g:2142:5: this_Tuple_2= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexValueAccess().getTupleParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Tuple_2=ruleTuple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Tuple_2; 
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
    // $ANTLR end "ruleComplexValue"


    // $ANTLR start "entryRuleTuple"
    // InternalSpellDatabase.g:2158:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:2162:2: (iv_ruleTuple= ruleTuple EOF )
            // InternalSpellDatabase.g:2163:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTuple"


    // $ANTLR start "ruleTuple"
    // InternalSpellDatabase.g:2173:1: ruleTuple returns [EObject current=null] : ( () otherlv_1= '(' ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )? ruleSkipped_NL (otherlv_9= ',' )? ruleSkipped_NL otherlv_11= ')' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_values_3_1 = null;

        EObject lv_values_3_2 = null;

        EObject lv_values_7_1 = null;

        EObject lv_values_7_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:2177:28: ( ( () otherlv_1= '(' ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )? ruleSkipped_NL (otherlv_9= ',' )? ruleSkipped_NL otherlv_11= ')' ) )
            // InternalSpellDatabase.g:2178:1: ( () otherlv_1= '(' ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )? ruleSkipped_NL (otherlv_9= ',' )? ruleSkipped_NL otherlv_11= ')' )
            {
            // InternalSpellDatabase.g:2178:1: ( () otherlv_1= '(' ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )? ruleSkipped_NL (otherlv_9= ',' )? ruleSkipped_NL otherlv_11= ')' )
            // InternalSpellDatabase.g:2178:2: () otherlv_1= '(' ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )? ruleSkipped_NL (otherlv_9= ',' )? ruleSkipped_NL otherlv_11= ')'
            {
            // InternalSpellDatabase.g:2178:2: ()
            // InternalSpellDatabase.g:2179:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTupleAccess().getTupleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalSpellDatabase.g:2188:1: ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )?
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalSpellDatabase.g:2189:5: ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTupleAccess().getSkipped_NLParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    ruleSkipped_NL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSpellDatabase.g:2196:1: ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) )
                    // InternalSpellDatabase.g:2197:1: ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) )
                    {
                    // InternalSpellDatabase.g:2197:1: ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) )
                    // InternalSpellDatabase.g:2198:1: (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue )
                    {
                    // InternalSpellDatabase.g:2198:1: (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue )
                    int alt44=2;
                    alt44 = dfa44.predict(input);
                    switch (alt44) {
                        case 1 :
                            // InternalSpellDatabase.g:2199:3: lv_values_3_1= ruleAtom
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTupleAccess().getValuesAtomParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_35);
                            lv_values_3_1=ruleAtom();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTupleRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"values",
                                      		lv_values_3_1, 
                                      		"lu.ses.engineering.spell.SpellDatabase.Atom");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpellDatabase.g:2214:8: lv_values_3_2= ruleComplexValue
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTupleAccess().getValuesComplexValueParserRuleCall_2_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_35);
                            lv_values_3_2=ruleComplexValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTupleRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"values",
                                      		lv_values_3_2, 
                                      		"lu.ses.engineering.spell.SpellDatabase.ComplexValue");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTupleAccess().getSkipped_NLParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    ruleSkipped_NL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSpellDatabase.g:2240:1: (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        alt46 = dfa46.predict(input);
                        switch (alt46) {
                    	case 1 :
                    	    // InternalSpellDatabase.g:2240:3: otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) )
                    	    {
                    	    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getTupleAccess().getCommaKeyword_2_3_0());
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getTupleAccess().getSkipped_NLParserRuleCall_2_3_1()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_34);
                    	    ruleSkipped_NL();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }
                    	    // InternalSpellDatabase.g:2252:1: ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) )
                    	    // InternalSpellDatabase.g:2253:1: ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) )
                    	    {
                    	    // InternalSpellDatabase.g:2253:1: ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) )
                    	    // InternalSpellDatabase.g:2254:1: (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue )
                    	    {
                    	    // InternalSpellDatabase.g:2254:1: (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue )
                    	    int alt45=2;
                    	    alt45 = dfa45.predict(input);
                    	    switch (alt45) {
                    	        case 1 :
                    	            // InternalSpellDatabase.g:2255:3: lv_values_7_1= ruleAtom
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getTupleAccess().getValuesAtomParserRuleCall_2_3_2_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_35);
                    	            lv_values_7_1=ruleAtom();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getTupleRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"values",
                    	                      		lv_values_7_1, 
                    	                      		"lu.ses.engineering.spell.SpellDatabase.Atom");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalSpellDatabase.g:2270:8: lv_values_7_2= ruleComplexValue
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getTupleAccess().getValuesComplexValueParserRuleCall_2_3_2_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_35);
                    	            lv_values_7_2=ruleComplexValue();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getTupleRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"values",
                    	                      		lv_values_7_2, 
                    	                      		"lu.ses.engineering.spell.SpellDatabase.ComplexValue");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTupleAccess().getSkipped_NLParserRuleCall_3()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_35);
            ruleSkipped_NL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpellDatabase.g:2296:1: (otherlv_9= ',' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==31) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSpellDatabase.g:2296:3: otherlv_9= ','
                    {
                    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTupleAccess().getCommaKeyword_4());
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTupleAccess().getSkipped_NLParserRuleCall_5()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_38);
            ruleSkipped_NL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getTupleAccess().getRightParenthesisKeyword_6());
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTuple"


    // $ANTLR start "entryRuleList"
    // InternalSpellDatabase.g:2323:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:2327:2: (iv_ruleList= ruleList EOF )
            // InternalSpellDatabase.g:2328:2: iv_ruleList= ruleList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalSpellDatabase.g:2338:1: ruleList returns [EObject current=null] : ( () otherlv_1= '[' ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )? ruleSkipped_NL (otherlv_9= ',' )? ruleSkipped_NL otherlv_11= ']' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_values_3_1 = null;

        EObject lv_values_3_2 = null;

        EObject lv_values_7_1 = null;

        EObject lv_values_7_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:2342:28: ( ( () otherlv_1= '[' ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )? ruleSkipped_NL (otherlv_9= ',' )? ruleSkipped_NL otherlv_11= ']' ) )
            // InternalSpellDatabase.g:2343:1: ( () otherlv_1= '[' ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )? ruleSkipped_NL (otherlv_9= ',' )? ruleSkipped_NL otherlv_11= ']' )
            {
            // InternalSpellDatabase.g:2343:1: ( () otherlv_1= '[' ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )? ruleSkipped_NL (otherlv_9= ',' )? ruleSkipped_NL otherlv_11= ']' )
            // InternalSpellDatabase.g:2343:2: () otherlv_1= '[' ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )? ruleSkipped_NL (otherlv_9= ',' )? ruleSkipped_NL otherlv_11= ']'
            {
            // InternalSpellDatabase.g:2343:2: ()
            // InternalSpellDatabase.g:2344:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getListAccess().getListAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalSpellDatabase.g:2353:1: ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )?
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // InternalSpellDatabase.g:2354:5: ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListAccess().getSkipped_NLParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    ruleSkipped_NL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSpellDatabase.g:2361:1: ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) )
                    // InternalSpellDatabase.g:2362:1: ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) )
                    {
                    // InternalSpellDatabase.g:2362:1: ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) )
                    // InternalSpellDatabase.g:2363:1: (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue )
                    {
                    // InternalSpellDatabase.g:2363:1: (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue )
                    int alt49=2;
                    alt49 = dfa49.predict(input);
                    switch (alt49) {
                        case 1 :
                            // InternalSpellDatabase.g:2364:3: lv_values_3_1= ruleAtom
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getListAccess().getValuesAtomParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_40);
                            lv_values_3_1=ruleAtom();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getListRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"values",
                                      		lv_values_3_1, 
                                      		"lu.ses.engineering.spell.SpellDatabase.Atom");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpellDatabase.g:2379:8: lv_values_3_2= ruleComplexValue
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getListAccess().getValuesComplexValueParserRuleCall_2_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_40);
                            lv_values_3_2=ruleComplexValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getListRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"values",
                                      		lv_values_3_2, 
                                      		"lu.ses.engineering.spell.SpellDatabase.ComplexValue");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListAccess().getSkipped_NLParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
                    ruleSkipped_NL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSpellDatabase.g:2405:1: (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        alt51 = dfa51.predict(input);
                        switch (alt51) {
                    	case 1 :
                    	    // InternalSpellDatabase.g:2405:3: otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) )
                    	    {
                    	    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getListAccess().getCommaKeyword_2_3_0());
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getListAccess().getSkipped_NLParserRuleCall_2_3_1()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_34);
                    	    ruleSkipped_NL();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }
                    	    // InternalSpellDatabase.g:2417:1: ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) )
                    	    // InternalSpellDatabase.g:2418:1: ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) )
                    	    {
                    	    // InternalSpellDatabase.g:2418:1: ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) )
                    	    // InternalSpellDatabase.g:2419:1: (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue )
                    	    {
                    	    // InternalSpellDatabase.g:2419:1: (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue )
                    	    int alt50=2;
                    	    alt50 = dfa50.predict(input);
                    	    switch (alt50) {
                    	        case 1 :
                    	            // InternalSpellDatabase.g:2420:3: lv_values_7_1= ruleAtom
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getListAccess().getValuesAtomParserRuleCall_2_3_2_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_40);
                    	            lv_values_7_1=ruleAtom();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getListRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"values",
                    	                      		lv_values_7_1, 
                    	                      		"lu.ses.engineering.spell.SpellDatabase.Atom");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalSpellDatabase.g:2435:8: lv_values_7_2= ruleComplexValue
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getListAccess().getValuesComplexValueParserRuleCall_2_3_2_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_40);
                    	            lv_values_7_2=ruleComplexValue();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getListRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"values",
                    	                      		lv_values_7_2, 
                    	                      		"lu.ses.engineering.spell.SpellDatabase.ComplexValue");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getListAccess().getSkipped_NLParserRuleCall_3()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_40);
            ruleSkipped_NL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpellDatabase.g:2461:1: (otherlv_9= ',' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==31) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSpellDatabase.g:2461:3: otherlv_9= ','
                    {
                    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getListAccess().getCommaKeyword_4());
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getListAccess().getSkipped_NLParserRuleCall_5()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_42);
            ruleSkipped_NL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_11=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getListAccess().getRightSquareBracketKeyword_6());
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleDictionary"
    // InternalSpellDatabase.g:2488:1: entryRuleDictionary returns [EObject current=null] : iv_ruleDictionary= ruleDictionary EOF ;
    public final EObject entryRuleDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:2492:2: (iv_ruleDictionary= ruleDictionary EOF )
            // InternalSpellDatabase.g:2493:2: iv_ruleDictionary= ruleDictionary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictionaryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDictionary=ruleDictionary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictionary; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDictionary"


    // $ANTLR start "ruleDictionary"
    // InternalSpellDatabase.g:2503:1: ruleDictionary returns [EObject current=null] : ( () otherlv_1= '{' ( ruleSkipped_NL ( (lv_entries_3_0= ruleDictionaryEntry ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( (lv_entries_7_0= ruleDictionaryEntry ) ) ruleSkipped_NL )* )? ruleSkipped_NL (otherlv_10= ',' )? ruleSkipped_NL otherlv_12= '}' ) ;
    public final EObject ruleDictionary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_entries_3_0 = null;

        EObject lv_entries_7_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:2507:28: ( ( () otherlv_1= '{' ( ruleSkipped_NL ( (lv_entries_3_0= ruleDictionaryEntry ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( (lv_entries_7_0= ruleDictionaryEntry ) ) ruleSkipped_NL )* )? ruleSkipped_NL (otherlv_10= ',' )? ruleSkipped_NL otherlv_12= '}' ) )
            // InternalSpellDatabase.g:2508:1: ( () otherlv_1= '{' ( ruleSkipped_NL ( (lv_entries_3_0= ruleDictionaryEntry ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( (lv_entries_7_0= ruleDictionaryEntry ) ) ruleSkipped_NL )* )? ruleSkipped_NL (otherlv_10= ',' )? ruleSkipped_NL otherlv_12= '}' )
            {
            // InternalSpellDatabase.g:2508:1: ( () otherlv_1= '{' ( ruleSkipped_NL ( (lv_entries_3_0= ruleDictionaryEntry ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( (lv_entries_7_0= ruleDictionaryEntry ) ) ruleSkipped_NL )* )? ruleSkipped_NL (otherlv_10= ',' )? ruleSkipped_NL otherlv_12= '}' )
            // InternalSpellDatabase.g:2508:2: () otherlv_1= '{' ( ruleSkipped_NL ( (lv_entries_3_0= ruleDictionaryEntry ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( (lv_entries_7_0= ruleDictionaryEntry ) ) ruleSkipped_NL )* )? ruleSkipped_NL (otherlv_10= ',' )? ruleSkipped_NL otherlv_12= '}'
            {
            // InternalSpellDatabase.g:2508:2: ()
            // InternalSpellDatabase.g:2509:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDictionaryAccess().getDicitonaryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDictionaryAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalSpellDatabase.g:2518:1: ( ruleSkipped_NL ( (lv_entries_3_0= ruleDictionaryEntry ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( (lv_entries_7_0= ruleDictionaryEntry ) ) ruleSkipped_NL )* )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalSpellDatabase.g:2519:5: ruleSkipped_NL ( (lv_entries_3_0= ruleDictionaryEntry ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( (lv_entries_7_0= ruleDictionaryEntry ) ) ruleSkipped_NL )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDictionaryAccess().getSkipped_NLParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    ruleSkipped_NL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSpellDatabase.g:2526:1: ( (lv_entries_3_0= ruleDictionaryEntry ) )
                    // InternalSpellDatabase.g:2527:1: (lv_entries_3_0= ruleDictionaryEntry )
                    {
                    // InternalSpellDatabase.g:2527:1: (lv_entries_3_0= ruleDictionaryEntry )
                    // InternalSpellDatabase.g:2528:3: lv_entries_3_0= ruleDictionaryEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictionaryAccess().getEntriesDictionaryEntryParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    lv_entries_3_0=ruleDictionaryEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDictionaryRule());
                      	        }
                             		add(
                             			current, 
                             			"entries",
                              		lv_entries_3_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.DictionaryEntry");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDictionaryAccess().getSkipped_NLParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    ruleSkipped_NL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSpellDatabase.g:2552:1: (otherlv_5= ',' ruleSkipped_NL ( (lv_entries_7_0= ruleDictionaryEntry ) ) ruleSkipped_NL )*
                    loop54:
                    do {
                        int alt54=2;
                        alt54 = dfa54.predict(input);
                        switch (alt54) {
                    	case 1 :
                    	    // InternalSpellDatabase.g:2552:3: otherlv_5= ',' ruleSkipped_NL ( (lv_entries_7_0= ruleDictionaryEntry ) ) ruleSkipped_NL
                    	    {
                    	    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getDictionaryAccess().getCommaKeyword_2_3_0());
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getDictionaryAccess().getSkipped_NLParserRuleCall_2_3_1()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
                    	    ruleSkipped_NL();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }
                    	    // InternalSpellDatabase.g:2564:1: ( (lv_entries_7_0= ruleDictionaryEntry ) )
                    	    // InternalSpellDatabase.g:2565:1: (lv_entries_7_0= ruleDictionaryEntry )
                    	    {
                    	    // InternalSpellDatabase.g:2565:1: (lv_entries_7_0= ruleDictionaryEntry )
                    	    // InternalSpellDatabase.g:2566:3: lv_entries_7_0= ruleDictionaryEntry
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDictionaryAccess().getEntriesDictionaryEntryParserRuleCall_2_3_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_44);
                    	    lv_entries_7_0=ruleDictionaryEntry();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDictionaryRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"entries",
                    	              		lv_entries_7_0, 
                    	              		"lu.ses.engineering.spell.SpellDatabase.DictionaryEntry");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getDictionaryAccess().getSkipped_NLParserRuleCall_2_3_3()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_44);
                    	    ruleSkipped_NL();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDictionaryAccess().getSkipped_NLParserRuleCall_3()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_44);
            ruleSkipped_NL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpellDatabase.g:2598:1: (otherlv_10= ',' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==31) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSpellDatabase.g:2598:3: otherlv_10= ','
                    {
                    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getDictionaryAccess().getCommaKeyword_4());
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDictionaryAccess().getSkipped_NLParserRuleCall_5()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_46);
            ruleSkipped_NL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_12=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getDictionaryAccess().getRightCurlyBracketKeyword_6());
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDictionary"


    // $ANTLR start "entryRuleDictionaryEntry"
    // InternalSpellDatabase.g:2625:1: entryRuleDictionaryEntry returns [EObject current=null] : iv_ruleDictionaryEntry= ruleDictionaryEntry EOF ;
    public final EObject entryRuleDictionaryEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionaryEntry = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalSpellDatabase.g:2629:2: (iv_ruleDictionaryEntry= ruleDictionaryEntry EOF )
            // InternalSpellDatabase.g:2630:2: iv_ruleDictionaryEntry= ruleDictionaryEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictionaryEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDictionaryEntry=ruleDictionaryEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictionaryEntry; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDictionaryEntry"


    // $ANTLR start "ruleDictionaryEntry"
    // InternalSpellDatabase.g:2640:1: ruleDictionaryEntry returns [EObject current=null] : ( ( ( (lv_key_0_1= ruleAtom | lv_key_0_2= ruleComplexValue ) ) ) ruleSkipped_NL (this_COLON_2= RULE_COLON ruleSkipped_NL ( ( (lv_value_4_1= ruleAtom | lv_value_4_2= ruleComplexValue ) ) ) )? ) ;
    public final EObject ruleDictionaryEntry() throws RecognitionException {
        EObject current = null;

        Token this_COLON_2=null;
        EObject lv_key_0_1 = null;

        EObject lv_key_0_2 = null;

        EObject lv_value_4_1 = null;

        EObject lv_value_4_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalSpellDatabase.g:2644:28: ( ( ( ( (lv_key_0_1= ruleAtom | lv_key_0_2= ruleComplexValue ) ) ) ruleSkipped_NL (this_COLON_2= RULE_COLON ruleSkipped_NL ( ( (lv_value_4_1= ruleAtom | lv_value_4_2= ruleComplexValue ) ) ) )? ) )
            // InternalSpellDatabase.g:2645:1: ( ( ( (lv_key_0_1= ruleAtom | lv_key_0_2= ruleComplexValue ) ) ) ruleSkipped_NL (this_COLON_2= RULE_COLON ruleSkipped_NL ( ( (lv_value_4_1= ruleAtom | lv_value_4_2= ruleComplexValue ) ) ) )? )
            {
            // InternalSpellDatabase.g:2645:1: ( ( ( (lv_key_0_1= ruleAtom | lv_key_0_2= ruleComplexValue ) ) ) ruleSkipped_NL (this_COLON_2= RULE_COLON ruleSkipped_NL ( ( (lv_value_4_1= ruleAtom | lv_value_4_2= ruleComplexValue ) ) ) )? )
            // InternalSpellDatabase.g:2645:2: ( ( (lv_key_0_1= ruleAtom | lv_key_0_2= ruleComplexValue ) ) ) ruleSkipped_NL (this_COLON_2= RULE_COLON ruleSkipped_NL ( ( (lv_value_4_1= ruleAtom | lv_value_4_2= ruleComplexValue ) ) ) )?
            {
            // InternalSpellDatabase.g:2645:2: ( ( (lv_key_0_1= ruleAtom | lv_key_0_2= ruleComplexValue ) ) )
            // InternalSpellDatabase.g:2646:1: ( (lv_key_0_1= ruleAtom | lv_key_0_2= ruleComplexValue ) )
            {
            // InternalSpellDatabase.g:2646:1: ( (lv_key_0_1= ruleAtom | lv_key_0_2= ruleComplexValue ) )
            // InternalSpellDatabase.g:2647:1: (lv_key_0_1= ruleAtom | lv_key_0_2= ruleComplexValue )
            {
            // InternalSpellDatabase.g:2647:1: (lv_key_0_1= ruleAtom | lv_key_0_2= ruleComplexValue )
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // InternalSpellDatabase.g:2648:3: lv_key_0_1= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictionaryEntryAccess().getKeyAtomParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
                    lv_key_0_1=ruleAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDictionaryEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"key",
                              		lv_key_0_1, 
                              		"lu.ses.engineering.spell.SpellDatabase.Atom");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:2663:8: lv_key_0_2= ruleComplexValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictionaryEntryAccess().getKeyComplexValueParserRuleCall_0_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
                    lv_key_0_2=ruleComplexValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDictionaryEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"key",
                              		lv_key_0_2, 
                              		"lu.ses.engineering.spell.SpellDatabase.ComplexValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDictionaryEntryAccess().getSkipped_NLParserRuleCall_1()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_48);
            ruleSkipped_NL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpellDatabase.g:2689:1: (this_COLON_2= RULE_COLON ruleSkipped_NL ( ( (lv_value_4_1= ruleAtom | lv_value_4_2= ruleComplexValue ) ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_COLON) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSpellDatabase.g:2689:2: this_COLON_2= RULE_COLON ruleSkipped_NL ( ( (lv_value_4_1= ruleAtom | lv_value_4_2= ruleComplexValue ) ) )
                    {
                    this_COLON_2=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_2, grammarAccess.getDictionaryEntryAccess().getCOLONTerminalRuleCall_2_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDictionaryEntryAccess().getSkipped_NLParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    ruleSkipped_NL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSpellDatabase.g:2701:1: ( ( (lv_value_4_1= ruleAtom | lv_value_4_2= ruleComplexValue ) ) )
                    // InternalSpellDatabase.g:2702:1: ( (lv_value_4_1= ruleAtom | lv_value_4_2= ruleComplexValue ) )
                    {
                    // InternalSpellDatabase.g:2702:1: ( (lv_value_4_1= ruleAtom | lv_value_4_2= ruleComplexValue ) )
                    // InternalSpellDatabase.g:2703:1: (lv_value_4_1= ruleAtom | lv_value_4_2= ruleComplexValue )
                    {
                    // InternalSpellDatabase.g:2703:1: (lv_value_4_1= ruleAtom | lv_value_4_2= ruleComplexValue )
                    int alt58=2;
                    alt58 = dfa58.predict(input);
                    switch (alt58) {
                        case 1 :
                            // InternalSpellDatabase.g:2704:3: lv_value_4_1= ruleAtom
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDictionaryEntryAccess().getValueAtomParserRuleCall_2_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_value_4_1=ruleAtom();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDictionaryEntryRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_4_1, 
                                      		"lu.ses.engineering.spell.SpellDatabase.Atom");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpellDatabase.g:2719:8: lv_value_4_2= ruleComplexValue
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDictionaryEntryAccess().getValueComplexValueParserRuleCall_2_2_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_value_4_2=ruleComplexValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDictionaryEntryRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_4_2, 
                                      		"lu.ses.engineering.spell.SpellDatabase.ComplexValue");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDictionaryEntry"


    // $ANTLR start "entryRuleAtom"
    // InternalSpellDatabase.g:2748:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalSpellDatabase.g:2749:2: (iv_ruleAtom= ruleAtom EOF )
            // InternalSpellDatabase.g:2750:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalSpellDatabase.g:2757:1: ruleAtom returns [EObject current=null] : (this_Number_0= ruleNumber | this_StringValue_1= ruleStringValue | this_Boolean_2= ruleBoolean | this_Lambda_Stmt_3= ruleLambda_Stmt ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_Boolean_2 = null;

        EObject this_Lambda_Stmt_3 = null;


         enterRule(); 
            
        try {
            // InternalSpellDatabase.g:2760:28: ( (this_Number_0= ruleNumber | this_StringValue_1= ruleStringValue | this_Boolean_2= ruleBoolean | this_Lambda_Stmt_3= ruleLambda_Stmt ) )
            // InternalSpellDatabase.g:2761:1: (this_Number_0= ruleNumber | this_StringValue_1= ruleStringValue | this_Boolean_2= ruleBoolean | this_Lambda_Stmt_3= ruleLambda_Stmt )
            {
            // InternalSpellDatabase.g:2761:1: (this_Number_0= ruleNumber | this_StringValue_1= ruleStringValue | this_Boolean_2= ruleBoolean | this_Lambda_Stmt_3= ruleLambda_Stmt )
            int alt60=4;
            switch ( input.LA(1) ) {
            case RULE_BIN_HEX_OCT:
            case RULE_PLUS:
            case RULE_MINUS:
            case RULE_FLOAT:
            case RULE_INT:
                {
                alt60=1;
                }
                break;
            case RULE_STRING:
                {
                alt60=2;
                }
                break;
            case RULE_BOOL_EXPR:
                {
                alt60=3;
                }
                break;
            case RULE_LAMBDA:
                {
                alt60=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalSpellDatabase.g:2762:5: this_Number_0= ruleNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getNumberParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Number_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:2772:5: this_StringValue_1= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getStringValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValue_1=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSpellDatabase.g:2782:5: this_Boolean_2= ruleBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getBooleanParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Boolean_2=ruleBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Boolean_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSpellDatabase.g:2792:5: this_Lambda_Stmt_3= ruleLambda_Stmt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getLambda_StmtParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Lambda_Stmt_3=ruleLambda_Stmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Lambda_Stmt_3; 
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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleRelDate"
    // InternalSpellDatabase.g:2808:1: entryRuleRelDate returns [EObject current=null] : iv_ruleRelDate= ruleRelDate EOF ;
    public final EObject entryRuleRelDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelDate = null;


        try {
            // InternalSpellDatabase.g:2809:2: (iv_ruleRelDate= ruleRelDate EOF )
            // InternalSpellDatabase.g:2810:2: iv_ruleRelDate= ruleRelDate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelDateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRelDate=ruleRelDate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelDate; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelDate"


    // $ANTLR start "ruleRelDate"
    // InternalSpellDatabase.g:2817:1: ruleRelDate returns [EObject current=null] : ( ( ( ruleRELTIME ) )=> (lv_val_0_0= ruleRELTIME ) ) ;
    public final EObject ruleRelDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSpellDatabase.g:2820:28: ( ( ( ( ruleRELTIME ) )=> (lv_val_0_0= ruleRELTIME ) ) )
            // InternalSpellDatabase.g:2821:1: ( ( ( ruleRELTIME ) )=> (lv_val_0_0= ruleRELTIME ) )
            {
            // InternalSpellDatabase.g:2821:1: ( ( ( ruleRELTIME ) )=> (lv_val_0_0= ruleRELTIME ) )
            // InternalSpellDatabase.g:2821:2: ( ( ruleRELTIME ) )=> (lv_val_0_0= ruleRELTIME )
            {
            // InternalSpellDatabase.g:2826:1: (lv_val_0_0= ruleRELTIME )
            // InternalSpellDatabase.g:2827:3: lv_val_0_0= ruleRELTIME
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelDateAccess().getValRELTIMEParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_val_0_0=ruleRELTIME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelDateRule());
              	        }
                     		set(
                     			current, 
                     			"val",
                      		lv_val_0_0, 
                      		"lu.ses.engineering.spell.SpellDatabase.RELTIME");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleRelDate"


    // $ANTLR start "entryRuleDate"
    // InternalSpellDatabase.g:2851:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalSpellDatabase.g:2852:2: (iv_ruleDate= ruleDate EOF )
            // InternalSpellDatabase.g:2853:2: iv_ruleDate= ruleDate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDate; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalSpellDatabase.g:2860:1: ruleDate returns [EObject current=null] : ( ( ( ruleABSTIME ) )=> (lv_val_0_0= ruleABSTIME ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSpellDatabase.g:2863:28: ( ( ( ( ruleABSTIME ) )=> (lv_val_0_0= ruleABSTIME ) ) )
            // InternalSpellDatabase.g:2864:1: ( ( ( ruleABSTIME ) )=> (lv_val_0_0= ruleABSTIME ) )
            {
            // InternalSpellDatabase.g:2864:1: ( ( ( ruleABSTIME ) )=> (lv_val_0_0= ruleABSTIME ) )
            // InternalSpellDatabase.g:2864:2: ( ( ruleABSTIME ) )=> (lv_val_0_0= ruleABSTIME )
            {
            // InternalSpellDatabase.g:2869:1: (lv_val_0_0= ruleABSTIME )
            // InternalSpellDatabase.g:2870:3: lv_val_0_0= ruleABSTIME
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDateAccess().getValABSTIMEParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_val_0_0=ruleABSTIME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDateRule());
              	        }
                     		set(
                     			current, 
                     			"val",
                      		lv_val_0_0, 
                      		"lu.ses.engineering.spell.SpellDatabase.ABSTIME");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleBoolean"
    // InternalSpellDatabase.g:2894:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalSpellDatabase.g:2895:2: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalSpellDatabase.g:2896:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalSpellDatabase.g:2903:1: ruleBoolean returns [EObject current=null] : ( (lv_val_0_0= RULE_BOOL_EXPR ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;

         enterRule(); 
            
        try {
            // InternalSpellDatabase.g:2906:28: ( ( (lv_val_0_0= RULE_BOOL_EXPR ) ) )
            // InternalSpellDatabase.g:2907:1: ( (lv_val_0_0= RULE_BOOL_EXPR ) )
            {
            // InternalSpellDatabase.g:2907:1: ( (lv_val_0_0= RULE_BOOL_EXPR ) )
            // InternalSpellDatabase.g:2908:1: (lv_val_0_0= RULE_BOOL_EXPR )
            {
            // InternalSpellDatabase.g:2908:1: (lv_val_0_0= RULE_BOOL_EXPR )
            // InternalSpellDatabase.g:2909:3: lv_val_0_0= RULE_BOOL_EXPR
            {
            lv_val_0_0=(Token)match(input,RULE_BOOL_EXPR,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_val_0_0, grammarAccess.getBooleanAccess().getValBOOL_EXPRTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBooleanRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"val",
                      		lv_val_0_0, 
                      		"lu.ses.engineering.spell.SpellDatabase.BOOL_EXPR");
              	    
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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleStringValue"
    // InternalSpellDatabase.g:2933:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalSpellDatabase.g:2934:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSpellDatabase.g:2935:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalSpellDatabase.g:2942:1: ruleStringValue returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;

         enterRule(); 
            
        try {
            // InternalSpellDatabase.g:2945:28: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalSpellDatabase.g:2946:1: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalSpellDatabase.g:2946:1: ( (lv_val_0_0= RULE_STRING ) )
            // InternalSpellDatabase.g:2947:1: (lv_val_0_0= RULE_STRING )
            {
            // InternalSpellDatabase.g:2947:1: (lv_val_0_0= RULE_STRING )
            // InternalSpellDatabase.g:2948:3: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_val_0_0, grammarAccess.getStringValueAccess().getValSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"val",
                      		lv_val_0_0, 
                      		"lu.ses.engineering.spell.SpellDatabase.STRING");
              	    
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleNumber"
    // InternalSpellDatabase.g:2972:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalSpellDatabase.g:2973:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalSpellDatabase.g:2974:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalSpellDatabase.g:2981:1: ruleNumber returns [EObject current=null] : ( ( (lv_val_0_0= RULE_BIN_HEX_OCT ) ) | ( (lv_valInt_1_0= ruleINTEGER ) ) | ( ( ( ruleFLOAT_Val ) )=> (lv_valStr_2_0= ruleFLOAT_Val ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        AntlrDatatypeRuleToken lv_valInt_1_0 = null;

        AntlrDatatypeRuleToken lv_valStr_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSpellDatabase.g:2984:28: ( ( ( (lv_val_0_0= RULE_BIN_HEX_OCT ) ) | ( (lv_valInt_1_0= ruleINTEGER ) ) | ( ( ( ruleFLOAT_Val ) )=> (lv_valStr_2_0= ruleFLOAT_Val ) ) ) )
            // InternalSpellDatabase.g:2985:1: ( ( (lv_val_0_0= RULE_BIN_HEX_OCT ) ) | ( (lv_valInt_1_0= ruleINTEGER ) ) | ( ( ( ruleFLOAT_Val ) )=> (lv_valStr_2_0= ruleFLOAT_Val ) ) )
            {
            // InternalSpellDatabase.g:2985:1: ( ( (lv_val_0_0= RULE_BIN_HEX_OCT ) ) | ( (lv_valInt_1_0= ruleINTEGER ) ) | ( ( ( ruleFLOAT_Val ) )=> (lv_valStr_2_0= ruleFLOAT_Val ) ) )
            int alt61=3;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalSpellDatabase.g:2985:2: ( (lv_val_0_0= RULE_BIN_HEX_OCT ) )
                    {
                    // InternalSpellDatabase.g:2985:2: ( (lv_val_0_0= RULE_BIN_HEX_OCT ) )
                    // InternalSpellDatabase.g:2986:1: (lv_val_0_0= RULE_BIN_HEX_OCT )
                    {
                    // InternalSpellDatabase.g:2986:1: (lv_val_0_0= RULE_BIN_HEX_OCT )
                    // InternalSpellDatabase.g:2987:3: lv_val_0_0= RULE_BIN_HEX_OCT
                    {
                    lv_val_0_0=(Token)match(input,RULE_BIN_HEX_OCT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_val_0_0, grammarAccess.getNumberAccess().getValBIN_HEX_OCTTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumberRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"val",
                              		lv_val_0_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.BIN_HEX_OCT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:3004:6: ( (lv_valInt_1_0= ruleINTEGER ) )
                    {
                    // InternalSpellDatabase.g:3004:6: ( (lv_valInt_1_0= ruleINTEGER ) )
                    // InternalSpellDatabase.g:3005:1: (lv_valInt_1_0= ruleINTEGER )
                    {
                    // InternalSpellDatabase.g:3005:1: (lv_valInt_1_0= ruleINTEGER )
                    // InternalSpellDatabase.g:3006:3: lv_valInt_1_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberAccess().getValIntINTEGERParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_valInt_1_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumberRule());
                      	        }
                             		set(
                             			current, 
                             			"valInt",
                              		lv_valInt_1_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.INTEGER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpellDatabase.g:3023:6: ( ( ( ruleFLOAT_Val ) )=> (lv_valStr_2_0= ruleFLOAT_Val ) )
                    {
                    // InternalSpellDatabase.g:3023:6: ( ( ( ruleFLOAT_Val ) )=> (lv_valStr_2_0= ruleFLOAT_Val ) )
                    // InternalSpellDatabase.g:3023:7: ( ( ruleFLOAT_Val ) )=> (lv_valStr_2_0= ruleFLOAT_Val )
                    {
                    // InternalSpellDatabase.g:3028:1: (lv_valStr_2_0= ruleFLOAT_Val )
                    // InternalSpellDatabase.g:3029:3: lv_valStr_2_0= ruleFLOAT_Val
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberAccess().getValStrFLOAT_ValParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_valStr_2_0=ruleFLOAT_Val();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumberRule());
                      	        }
                             		set(
                             			current, 
                             			"valStr",
                              		lv_valStr_2_0, 
                              		"lu.ses.engineering.spell.SpellDatabase.FLOAT_Val");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleFLOAT_Val"
    // InternalSpellDatabase.g:3053:1: entryRuleFLOAT_Val returns [String current=null] : iv_ruleFLOAT_Val= ruleFLOAT_Val EOF ;
    public final String entryRuleFLOAT_Val() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT_Val = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // InternalSpellDatabase.g:3057:2: (iv_ruleFLOAT_Val= ruleFLOAT_Val EOF )
            // InternalSpellDatabase.g:3058:2: iv_ruleFLOAT_Val= ruleFLOAT_Val EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFLOAT_ValRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFLOAT_Val=ruleFLOAT_Val();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFLOAT_Val.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT_Val"


    // $ANTLR start "ruleFLOAT_Val"
    // InternalSpellDatabase.g:3068:1: ruleFLOAT_Val returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )? this_FLOAT_2= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT_Val() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_MINUS_1=null;
        Token this_FLOAT_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // InternalSpellDatabase.g:3072:28: ( ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )? this_FLOAT_2= RULE_FLOAT ) )
            // InternalSpellDatabase.g:3073:1: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )? this_FLOAT_2= RULE_FLOAT )
            {
            // InternalSpellDatabase.g:3073:1: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )? this_FLOAT_2= RULE_FLOAT )
            // InternalSpellDatabase.g:3073:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )? this_FLOAT_2= RULE_FLOAT
            {
            // InternalSpellDatabase.g:3073:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )?
            int alt62=3;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_PLUS) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_MINUS) ) {
                alt62=2;
            }
            switch (alt62) {
                case 1 :
                    // InternalSpellDatabase.g:3073:7: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_0, grammarAccess.getFLOAT_ValAccess().getPLUSTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:3081:10: this_MINUS_1= RULE_MINUS
                    {
                    this_MINUS_1=(Token)match(input,RULE_MINUS,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_1, grammarAccess.getFLOAT_ValAccess().getMINUSTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_2=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FLOAT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_FLOAT_2, grammarAccess.getFLOAT_ValAccess().getFLOATTerminalRuleCall_1()); 
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFLOAT_Val"


    // $ANTLR start "entryRuleSkipped_NL"
    // InternalSpellDatabase.g:3106:1: entryRuleSkipped_NL returns [String current=null] : iv_ruleSkipped_NL= ruleSkipped_NL EOF ;
    public final String entryRuleSkipped_NL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSkipped_NL = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // InternalSpellDatabase.g:3110:2: (iv_ruleSkipped_NL= ruleSkipped_NL EOF )
            // InternalSpellDatabase.g:3111:2: iv_ruleSkipped_NL= ruleSkipped_NL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSkipped_NLRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSkipped_NL=ruleSkipped_NL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSkipped_NL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSkipped_NL"


    // $ANTLR start "ruleSkipped_NL"
    // InternalSpellDatabase.g:3121:1: ruleSkipped_NL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\\\' this_NL_1= RULE_NL )* ;
    public final AntlrDatatypeRuleToken ruleSkipped_NL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NL_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // InternalSpellDatabase.g:3125:28: ( (kw= '\\\\' this_NL_1= RULE_NL )* )
            // InternalSpellDatabase.g:3126:1: (kw= '\\\\' this_NL_1= RULE_NL )*
            {
            // InternalSpellDatabase.g:3126:1: (kw= '\\\\' this_NL_1= RULE_NL )*
            loop63:
            do {
                int alt63=2;
                alt63 = dfa63.predict(input);
                switch (alt63) {
            	case 1 :
            	    // InternalSpellDatabase.g:3127:2: kw= '\\\\' this_NL_1= RULE_NL
            	    {
            	    kw=(Token)match(input,39,FollowSets000.FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSkipped_NLAccess().getReverseSolidusKeyword_0()); 
            	          
            	    }
            	    this_NL_1=(Token)match(input,RULE_NL,FollowSets000.FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_NL_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NL_1, grammarAccess.getSkipped_NLAccess().getNLTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSkipped_NL"


    // $ANTLR start "entryRuleRELTIME"
    // InternalSpellDatabase.g:3150:1: entryRuleRELTIME returns [String current=null] : iv_ruleRELTIME= ruleRELTIME EOF ;
    public final String entryRuleRELTIME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRELTIME = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // InternalSpellDatabase.g:3154:2: (iv_ruleRELTIME= ruleRELTIME EOF )
            // InternalSpellDatabase.g:3155:2: iv_ruleRELTIME= ruleRELTIME EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRELTIMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRELTIME=ruleRELTIME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRELTIME.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleRELTIME"


    // $ANTLR start "ruleRELTIME"
    // InternalSpellDatabase.g:3165:1: ruleRELTIME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_0= ruleINTEGER ( (this_INT_1= RULE_INT this_COLON_2= RULE_COLON this_INT_3= RULE_INT this_COLON_4= RULE_COLON this_INT_5= RULE_INT ) | (this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT ) ) ) ;
    public final AntlrDatatypeRuleToken ruleRELTIME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token this_COLON_2=null;
        Token this_INT_3=null;
        Token this_COLON_4=null;
        Token this_INT_5=null;
        Token this_COLON_6=null;
        Token this_INT_7=null;
        Token this_COLON_8=null;
        Token this_INT_9=null;
        AntlrDatatypeRuleToken this_INTEGER_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // InternalSpellDatabase.g:3169:28: ( (this_INTEGER_0= ruleINTEGER ( (this_INT_1= RULE_INT this_COLON_2= RULE_COLON this_INT_3= RULE_INT this_COLON_4= RULE_COLON this_INT_5= RULE_INT ) | (this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT ) ) ) )
            // InternalSpellDatabase.g:3170:1: (this_INTEGER_0= ruleINTEGER ( (this_INT_1= RULE_INT this_COLON_2= RULE_COLON this_INT_3= RULE_INT this_COLON_4= RULE_COLON this_INT_5= RULE_INT ) | (this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT ) ) )
            {
            // InternalSpellDatabase.g:3170:1: (this_INTEGER_0= ruleINTEGER ( (this_INT_1= RULE_INT this_COLON_2= RULE_COLON this_INT_3= RULE_INT this_COLON_4= RULE_COLON this_INT_5= RULE_INT ) | (this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT ) ) )
            // InternalSpellDatabase.g:3171:5: this_INTEGER_0= ruleINTEGER ( (this_INT_1= RULE_INT this_COLON_2= RULE_COLON this_INT_3= RULE_INT this_COLON_4= RULE_COLON this_INT_5= RULE_INT ) | (this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT ) )
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRELTIMEAccess().getINTEGERParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_52);
            this_INTEGER_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INTEGER_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSpellDatabase.g:3181:1: ( (this_INT_1= RULE_INT this_COLON_2= RULE_COLON this_INT_3= RULE_INT this_COLON_4= RULE_COLON this_INT_5= RULE_INT ) | (this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_INT) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_COLON) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalSpellDatabase.g:3181:2: (this_INT_1= RULE_INT this_COLON_2= RULE_COLON this_INT_3= RULE_INT this_COLON_4= RULE_COLON this_INT_5= RULE_INT )
                    {
                    // InternalSpellDatabase.g:3181:2: (this_INT_1= RULE_INT this_COLON_2= RULE_COLON this_INT_3= RULE_INT this_COLON_4= RULE_COLON this_INT_5= RULE_INT )
                    // InternalSpellDatabase.g:3181:7: this_INT_1= RULE_INT this_COLON_2= RULE_COLON this_INT_3= RULE_INT this_COLON_4= RULE_COLON this_INT_5= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getRELTIMEAccess().getINTTerminalRuleCall_1_0_0()); 
                          
                    }
                    this_COLON_2=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COLON_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_2, grammarAccess.getRELTIMEAccess().getCOLONTerminalRuleCall_1_0_1()); 
                          
                    }
                    this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_3, grammarAccess.getRELTIMEAccess().getINTTerminalRuleCall_1_0_2()); 
                          
                    }
                    this_COLON_4=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COLON_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getRELTIMEAccess().getCOLONTerminalRuleCall_1_0_3()); 
                          
                    }
                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_5, grammarAccess.getRELTIMEAccess().getINTTerminalRuleCall_1_0_4()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:3217:6: (this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT )
                    {
                    // InternalSpellDatabase.g:3217:6: (this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT )
                    // InternalSpellDatabase.g:3217:11: this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT
                    {
                    this_COLON_6=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COLON_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_6, grammarAccess.getRELTIMEAccess().getCOLONTerminalRuleCall_1_1_0()); 
                          
                    }
                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_7, grammarAccess.getRELTIMEAccess().getINTTerminalRuleCall_1_1_1()); 
                          
                    }
                    this_COLON_8=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COLON_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_8, grammarAccess.getRELTIMEAccess().getCOLONTerminalRuleCall_1_1_2()); 
                          
                    }
                    this_INT_9=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_9, grammarAccess.getRELTIMEAccess().getINTTerminalRuleCall_1_1_3()); 
                          
                    }

                    }


                    }
                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleRELTIME"


    // $ANTLR start "entryRuleABSTIME"
    // InternalSpellDatabase.g:3256:1: entryRuleABSTIME returns [String current=null] : iv_ruleABSTIME= ruleABSTIME EOF ;
    public final String entryRuleABSTIME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleABSTIME = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // InternalSpellDatabase.g:3260:2: (iv_ruleABSTIME= ruleABSTIME EOF )
            // InternalSpellDatabase.g:3261:2: iv_ruleABSTIME= ruleABSTIME EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getABSTIMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleABSTIME=ruleABSTIME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleABSTIME.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleABSTIME"


    // $ANTLR start "ruleABSTIME"
    // InternalSpellDatabase.g:3271:1: ruleABSTIME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_INT_0= RULE_INT this_MINUS_1= RULE_MINUS (this_INT_2= RULE_INT | this_ID_STMT_3= ruleID_STMT ) this_MINUS_4= RULE_MINUS this_INT_5= RULE_INT ) (this_COLON_6= RULE_COLON | this_WS_7= RULE_WS ) (this_INT_8= RULE_INT this_COLON_9= RULE_COLON this_INT_10= RULE_INT (this_COLON_11= RULE_COLON this_INT_12= RULE_INT )? )? ) | ( (this_INT_13= RULE_INT kw= '/' (this_INT_15= RULE_INT | this_ID_16= RULE_ID ) kw= '/' this_INT_18= RULE_INT ) (this_COLON_19= RULE_COLON | this_WS_20= RULE_WS ) (this_INT_21= RULE_INT this_COLON_22= RULE_COLON this_INT_23= RULE_INT (this_COLON_24= RULE_COLON this_INT_25= RULE_INT )? )? ) ) ;
    public final AntlrDatatypeRuleToken ruleABSTIME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_MINUS_1=null;
        Token this_INT_2=null;
        Token this_MINUS_4=null;
        Token this_INT_5=null;
        Token this_COLON_6=null;
        Token this_WS_7=null;
        Token this_INT_8=null;
        Token this_COLON_9=null;
        Token this_INT_10=null;
        Token this_COLON_11=null;
        Token this_INT_12=null;
        Token this_INT_13=null;
        Token kw=null;
        Token this_INT_15=null;
        Token this_ID_16=null;
        Token this_INT_18=null;
        Token this_COLON_19=null;
        Token this_WS_20=null;
        Token this_INT_21=null;
        Token this_COLON_22=null;
        Token this_INT_23=null;
        Token this_COLON_24=null;
        Token this_INT_25=null;
        AntlrDatatypeRuleToken this_ID_STMT_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // InternalSpellDatabase.g:3275:28: ( ( ( (this_INT_0= RULE_INT this_MINUS_1= RULE_MINUS (this_INT_2= RULE_INT | this_ID_STMT_3= ruleID_STMT ) this_MINUS_4= RULE_MINUS this_INT_5= RULE_INT ) (this_COLON_6= RULE_COLON | this_WS_7= RULE_WS ) (this_INT_8= RULE_INT this_COLON_9= RULE_COLON this_INT_10= RULE_INT (this_COLON_11= RULE_COLON this_INT_12= RULE_INT )? )? ) | ( (this_INT_13= RULE_INT kw= '/' (this_INT_15= RULE_INT | this_ID_16= RULE_ID ) kw= '/' this_INT_18= RULE_INT ) (this_COLON_19= RULE_COLON | this_WS_20= RULE_WS ) (this_INT_21= RULE_INT this_COLON_22= RULE_COLON this_INT_23= RULE_INT (this_COLON_24= RULE_COLON this_INT_25= RULE_INT )? )? ) ) )
            // InternalSpellDatabase.g:3276:1: ( ( (this_INT_0= RULE_INT this_MINUS_1= RULE_MINUS (this_INT_2= RULE_INT | this_ID_STMT_3= ruleID_STMT ) this_MINUS_4= RULE_MINUS this_INT_5= RULE_INT ) (this_COLON_6= RULE_COLON | this_WS_7= RULE_WS ) (this_INT_8= RULE_INT this_COLON_9= RULE_COLON this_INT_10= RULE_INT (this_COLON_11= RULE_COLON this_INT_12= RULE_INT )? )? ) | ( (this_INT_13= RULE_INT kw= '/' (this_INT_15= RULE_INT | this_ID_16= RULE_ID ) kw= '/' this_INT_18= RULE_INT ) (this_COLON_19= RULE_COLON | this_WS_20= RULE_WS ) (this_INT_21= RULE_INT this_COLON_22= RULE_COLON this_INT_23= RULE_INT (this_COLON_24= RULE_COLON this_INT_25= RULE_INT )? )? ) )
            {
            // InternalSpellDatabase.g:3276:1: ( ( (this_INT_0= RULE_INT this_MINUS_1= RULE_MINUS (this_INT_2= RULE_INT | this_ID_STMT_3= ruleID_STMT ) this_MINUS_4= RULE_MINUS this_INT_5= RULE_INT ) (this_COLON_6= RULE_COLON | this_WS_7= RULE_WS ) (this_INT_8= RULE_INT this_COLON_9= RULE_COLON this_INT_10= RULE_INT (this_COLON_11= RULE_COLON this_INT_12= RULE_INT )? )? ) | ( (this_INT_13= RULE_INT kw= '/' (this_INT_15= RULE_INT | this_ID_16= RULE_ID ) kw= '/' this_INT_18= RULE_INT ) (this_COLON_19= RULE_COLON | this_WS_20= RULE_WS ) (this_INT_21= RULE_INT this_COLON_22= RULE_COLON this_INT_23= RULE_INT (this_COLON_24= RULE_COLON this_INT_25= RULE_INT )? )? ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_INT) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==RULE_MINUS) ) {
                    alt73=1;
                }
                else if ( (LA73_1==40) ) {
                    alt73=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalSpellDatabase.g:3276:2: ( (this_INT_0= RULE_INT this_MINUS_1= RULE_MINUS (this_INT_2= RULE_INT | this_ID_STMT_3= ruleID_STMT ) this_MINUS_4= RULE_MINUS this_INT_5= RULE_INT ) (this_COLON_6= RULE_COLON | this_WS_7= RULE_WS ) (this_INT_8= RULE_INT this_COLON_9= RULE_COLON this_INT_10= RULE_INT (this_COLON_11= RULE_COLON this_INT_12= RULE_INT )? )? )
                    {
                    // InternalSpellDatabase.g:3276:2: ( (this_INT_0= RULE_INT this_MINUS_1= RULE_MINUS (this_INT_2= RULE_INT | this_ID_STMT_3= ruleID_STMT ) this_MINUS_4= RULE_MINUS this_INT_5= RULE_INT ) (this_COLON_6= RULE_COLON | this_WS_7= RULE_WS ) (this_INT_8= RULE_INT this_COLON_9= RULE_COLON this_INT_10= RULE_INT (this_COLON_11= RULE_COLON this_INT_12= RULE_INT )? )? )
                    // InternalSpellDatabase.g:3276:3: (this_INT_0= RULE_INT this_MINUS_1= RULE_MINUS (this_INT_2= RULE_INT | this_ID_STMT_3= ruleID_STMT ) this_MINUS_4= RULE_MINUS this_INT_5= RULE_INT ) (this_COLON_6= RULE_COLON | this_WS_7= RULE_WS ) (this_INT_8= RULE_INT this_COLON_9= RULE_COLON this_INT_10= RULE_INT (this_COLON_11= RULE_COLON this_INT_12= RULE_INT )? )?
                    {
                    // InternalSpellDatabase.g:3276:3: (this_INT_0= RULE_INT this_MINUS_1= RULE_MINUS (this_INT_2= RULE_INT | this_ID_STMT_3= ruleID_STMT ) this_MINUS_4= RULE_MINUS this_INT_5= RULE_INT )
                    // InternalSpellDatabase.g:3276:8: this_INT_0= RULE_INT this_MINUS_1= RULE_MINUS (this_INT_2= RULE_INT | this_ID_STMT_3= ruleID_STMT ) this_MINUS_4= RULE_MINUS this_INT_5= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getABSTIMEAccess().getINTTerminalRuleCall_0_0_0()); 
                          
                    }
                    this_MINUS_1=(Token)match(input,RULE_MINUS,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_1, grammarAccess.getABSTIMEAccess().getMINUSTerminalRuleCall_0_0_1()); 
                          
                    }
                    // InternalSpellDatabase.g:3290:1: (this_INT_2= RULE_INT | this_ID_STMT_3= ruleID_STMT )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_INT) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==RULE_ID) ) {
                        alt65=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalSpellDatabase.g:3290:6: this_INT_2= RULE_INT
                            {
                            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_54); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_2, grammarAccess.getABSTIMEAccess().getINTTerminalRuleCall_0_0_2_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpellDatabase.g:3299:5: this_ID_STMT_3= ruleID_STMT
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getABSTIMEAccess().getID_STMTParserRuleCall_0_0_2_1()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_54);
                            this_ID_STMT_3=ruleID_STMT();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ID_STMT_3);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    this_MINUS_4=(Token)match(input,RULE_MINUS,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_4, grammarAccess.getABSTIMEAccess().getMINUSTerminalRuleCall_0_0_3()); 
                          
                    }
                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_5, grammarAccess.getABSTIMEAccess().getINTTerminalRuleCall_0_0_4()); 
                          
                    }

                    }

                    // InternalSpellDatabase.g:3323:2: (this_COLON_6= RULE_COLON | this_WS_7= RULE_WS )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_COLON) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==RULE_WS) ) {
                        alt66=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalSpellDatabase.g:3323:7: this_COLON_6= RULE_COLON
                            {
                            this_COLON_6=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_57); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_COLON_6);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_COLON_6, grammarAccess.getABSTIMEAccess().getCOLONTerminalRuleCall_0_1_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpellDatabase.g:3331:10: this_WS_7= RULE_WS
                            {
                            this_WS_7=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_57); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_WS_7);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WS_7, grammarAccess.getABSTIMEAccess().getWSTerminalRuleCall_0_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // InternalSpellDatabase.g:3338:2: (this_INT_8= RULE_INT this_COLON_9= RULE_COLON this_INT_10= RULE_INT (this_COLON_11= RULE_COLON this_INT_12= RULE_INT )? )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_INT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalSpellDatabase.g:3338:7: this_INT_8= RULE_INT this_COLON_9= RULE_COLON this_INT_10= RULE_INT (this_COLON_11= RULE_COLON this_INT_12= RULE_INT )?
                            {
                            this_INT_8=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_8);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_8, grammarAccess.getABSTIMEAccess().getINTTerminalRuleCall_0_2_0()); 
                                  
                            }
                            this_COLON_9=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_COLON_9);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_COLON_9, grammarAccess.getABSTIMEAccess().getCOLONTerminalRuleCall_0_2_1()); 
                                  
                            }
                            this_INT_10=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_48); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_10);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_10, grammarAccess.getABSTIMEAccess().getINTTerminalRuleCall_0_2_2()); 
                                  
                            }
                            // InternalSpellDatabase.g:3359:1: (this_COLON_11= RULE_COLON this_INT_12= RULE_INT )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==RULE_COLON) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // InternalSpellDatabase.g:3359:6: this_COLON_11= RULE_COLON this_INT_12= RULE_INT
                                    {
                                    this_COLON_11=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_53); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_COLON_11);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_COLON_11, grammarAccess.getABSTIMEAccess().getCOLONTerminalRuleCall_0_2_3_0()); 
                                          
                                    }
                                    this_INT_12=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_12);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_12, grammarAccess.getABSTIMEAccess().getINTTerminalRuleCall_0_2_3_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:3374:6: ( (this_INT_13= RULE_INT kw= '/' (this_INT_15= RULE_INT | this_ID_16= RULE_ID ) kw= '/' this_INT_18= RULE_INT ) (this_COLON_19= RULE_COLON | this_WS_20= RULE_WS ) (this_INT_21= RULE_INT this_COLON_22= RULE_COLON this_INT_23= RULE_INT (this_COLON_24= RULE_COLON this_INT_25= RULE_INT )? )? )
                    {
                    // InternalSpellDatabase.g:3374:6: ( (this_INT_13= RULE_INT kw= '/' (this_INT_15= RULE_INT | this_ID_16= RULE_ID ) kw= '/' this_INT_18= RULE_INT ) (this_COLON_19= RULE_COLON | this_WS_20= RULE_WS ) (this_INT_21= RULE_INT this_COLON_22= RULE_COLON this_INT_23= RULE_INT (this_COLON_24= RULE_COLON this_INT_25= RULE_INT )? )? )
                    // InternalSpellDatabase.g:3374:7: (this_INT_13= RULE_INT kw= '/' (this_INT_15= RULE_INT | this_ID_16= RULE_ID ) kw= '/' this_INT_18= RULE_INT ) (this_COLON_19= RULE_COLON | this_WS_20= RULE_WS ) (this_INT_21= RULE_INT this_COLON_22= RULE_COLON this_INT_23= RULE_INT (this_COLON_24= RULE_COLON this_INT_25= RULE_INT )? )?
                    {
                    // InternalSpellDatabase.g:3374:7: (this_INT_13= RULE_INT kw= '/' (this_INT_15= RULE_INT | this_ID_16= RULE_ID ) kw= '/' this_INT_18= RULE_INT )
                    // InternalSpellDatabase.g:3374:12: this_INT_13= RULE_INT kw= '/' (this_INT_15= RULE_INT | this_ID_16= RULE_ID ) kw= '/' this_INT_18= RULE_INT
                    {
                    this_INT_13=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_13, grammarAccess.getABSTIMEAccess().getINTTerminalRuleCall_1_0_0()); 
                          
                    }
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getABSTIMEAccess().getSolidusKeyword_1_0_1()); 
                          
                    }
                    // InternalSpellDatabase.g:3387:1: (this_INT_15= RULE_INT | this_ID_16= RULE_ID )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_INT) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==RULE_ID) ) {
                        alt69=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalSpellDatabase.g:3387:6: this_INT_15= RULE_INT
                            {
                            this_INT_15=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_58); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_15);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_15, grammarAccess.getABSTIMEAccess().getINTTerminalRuleCall_1_0_2_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpellDatabase.g:3395:10: this_ID_16= RULE_ID
                            {
                            this_ID_16=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_58); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ID_16);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ID_16, grammarAccess.getABSTIMEAccess().getIDTerminalRuleCall_1_0_2_1()); 
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,40,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getABSTIMEAccess().getSolidusKeyword_1_0_3()); 
                          
                    }
                    this_INT_18=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_18, grammarAccess.getABSTIMEAccess().getINTTerminalRuleCall_1_0_4()); 
                          
                    }

                    }

                    // InternalSpellDatabase.g:3415:2: (this_COLON_19= RULE_COLON | this_WS_20= RULE_WS )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==RULE_COLON) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==RULE_WS) ) {
                        alt70=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalSpellDatabase.g:3415:7: this_COLON_19= RULE_COLON
                            {
                            this_COLON_19=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_57); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_COLON_19);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_COLON_19, grammarAccess.getABSTIMEAccess().getCOLONTerminalRuleCall_1_1_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalSpellDatabase.g:3423:10: this_WS_20= RULE_WS
                            {
                            this_WS_20=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_57); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_WS_20);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WS_20, grammarAccess.getABSTIMEAccess().getWSTerminalRuleCall_1_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // InternalSpellDatabase.g:3430:2: (this_INT_21= RULE_INT this_COLON_22= RULE_COLON this_INT_23= RULE_INT (this_COLON_24= RULE_COLON this_INT_25= RULE_INT )? )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==RULE_INT) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalSpellDatabase.g:3430:7: this_INT_21= RULE_INT this_COLON_22= RULE_COLON this_INT_23= RULE_INT (this_COLON_24= RULE_COLON this_INT_25= RULE_INT )?
                            {
                            this_INT_21=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_21);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_21, grammarAccess.getABSTIMEAccess().getINTTerminalRuleCall_1_2_0()); 
                                  
                            }
                            this_COLON_22=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_COLON_22);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_COLON_22, grammarAccess.getABSTIMEAccess().getCOLONTerminalRuleCall_1_2_1()); 
                                  
                            }
                            this_INT_23=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_48); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_23);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_23, grammarAccess.getABSTIMEAccess().getINTTerminalRuleCall_1_2_2()); 
                                  
                            }
                            // InternalSpellDatabase.g:3451:1: (this_COLON_24= RULE_COLON this_INT_25= RULE_INT )?
                            int alt71=2;
                            int LA71_0 = input.LA(1);

                            if ( (LA71_0==RULE_COLON) ) {
                                alt71=1;
                            }
                            switch (alt71) {
                                case 1 :
                                    // InternalSpellDatabase.g:3451:6: this_COLON_24= RULE_COLON this_INT_25= RULE_INT
                                    {
                                    this_COLON_24=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_53); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_COLON_24);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_COLON_24, grammarAccess.getABSTIMEAccess().getCOLONTerminalRuleCall_1_2_3_0()); 
                                          
                                    }
                                    this_INT_25=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_25);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_25, grammarAccess.getABSTIMEAccess().getINTTerminalRuleCall_1_2_3_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleABSTIME"


    // $ANTLR start "entryRuleSINGLE_VALUE"
    // InternalSpellDatabase.g:3476:1: entryRuleSINGLE_VALUE returns [String current=null] : iv_ruleSINGLE_VALUE= ruleSINGLE_VALUE EOF ;
    public final String entryRuleSINGLE_VALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSINGLE_VALUE = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // InternalSpellDatabase.g:3480:2: (iv_ruleSINGLE_VALUE= ruleSINGLE_VALUE EOF )
            // InternalSpellDatabase.g:3481:2: iv_ruleSINGLE_VALUE= ruleSINGLE_VALUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSINGLE_VALUERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSINGLE_VALUE=ruleSINGLE_VALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSINGLE_VALUE.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSINGLE_VALUE"


    // $ANTLR start "ruleSINGLE_VALUE"
    // InternalSpellDatabase.g:3491:1: ruleSINGLE_VALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_FLOAT_1= RULE_FLOAT | this_INT_2= RULE_INT | this_PLUS_3= RULE_PLUS | this_MINUS_4= RULE_MINUS | this_ML_COMMENT_5= RULE_ML_COMMENT | this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT | this_BOOL_EXPR_7= RULE_BOOL_EXPR | this_STRING_8= RULE_STRING | this_ANY_OTHER_9= RULE_ANY_OTHER | kw= '.' )+ ;
    public final AntlrDatatypeRuleToken ruleSINGLE_VALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_FLOAT_1=null;
        Token this_INT_2=null;
        Token this_PLUS_3=null;
        Token this_MINUS_4=null;
        Token this_ML_COMMENT_5=null;
        Token this_BIN_HEX_OCT_6=null;
        Token this_BOOL_EXPR_7=null;
        Token this_STRING_8=null;
        Token this_ANY_OTHER_9=null;
        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // InternalSpellDatabase.g:3495:28: ( (this_ID_0= RULE_ID | this_FLOAT_1= RULE_FLOAT | this_INT_2= RULE_INT | this_PLUS_3= RULE_PLUS | this_MINUS_4= RULE_MINUS | this_ML_COMMENT_5= RULE_ML_COMMENT | this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT | this_BOOL_EXPR_7= RULE_BOOL_EXPR | this_STRING_8= RULE_STRING | this_ANY_OTHER_9= RULE_ANY_OTHER | kw= '.' )+ )
            // InternalSpellDatabase.g:3496:1: (this_ID_0= RULE_ID | this_FLOAT_1= RULE_FLOAT | this_INT_2= RULE_INT | this_PLUS_3= RULE_PLUS | this_MINUS_4= RULE_MINUS | this_ML_COMMENT_5= RULE_ML_COMMENT | this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT | this_BOOL_EXPR_7= RULE_BOOL_EXPR | this_STRING_8= RULE_STRING | this_ANY_OTHER_9= RULE_ANY_OTHER | kw= '.' )+
            {
            // InternalSpellDatabase.g:3496:1: (this_ID_0= RULE_ID | this_FLOAT_1= RULE_FLOAT | this_INT_2= RULE_INT | this_PLUS_3= RULE_PLUS | this_MINUS_4= RULE_MINUS | this_ML_COMMENT_5= RULE_ML_COMMENT | this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT | this_BOOL_EXPR_7= RULE_BOOL_EXPR | this_STRING_8= RULE_STRING | this_ANY_OTHER_9= RULE_ANY_OTHER | kw= '.' )+
            int cnt74=0;
            loop74:
            do {
                int alt74=12;
                alt74 = dfa74.predict(input);
                switch (alt74) {
            	case 1 :
            	    // InternalSpellDatabase.g:3496:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getSINGLE_VALUEAccess().getIDTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalSpellDatabase.g:3504:10: this_FLOAT_1= RULE_FLOAT
            	    {
            	    this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_FLOAT_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_FLOAT_1, grammarAccess.getSINGLE_VALUEAccess().getFLOATTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalSpellDatabase.g:3512:10: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_INT_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INT_2, grammarAccess.getSINGLE_VALUEAccess().getINTTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalSpellDatabase.g:3520:10: this_PLUS_3= RULE_PLUS
            	    {
            	    this_PLUS_3=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PLUS_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PLUS_3, grammarAccess.getSINGLE_VALUEAccess().getPLUSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // InternalSpellDatabase.g:3528:10: this_MINUS_4= RULE_MINUS
            	    {
            	    this_MINUS_4=(Token)match(input,RULE_MINUS,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MINUS_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MINUS_4, grammarAccess.getSINGLE_VALUEAccess().getMINUSTerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // InternalSpellDatabase.g:3536:10: this_ML_COMMENT_5= RULE_ML_COMMENT
            	    {
            	    this_ML_COMMENT_5=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ML_COMMENT_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ML_COMMENT_5, grammarAccess.getSINGLE_VALUEAccess().getML_COMMENTTerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // InternalSpellDatabase.g:3544:10: this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT
            	    {
            	    this_BIN_HEX_OCT_6=(Token)match(input,RULE_BIN_HEX_OCT,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BIN_HEX_OCT_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BIN_HEX_OCT_6, grammarAccess.getSINGLE_VALUEAccess().getBIN_HEX_OCTTerminalRuleCall_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // InternalSpellDatabase.g:3552:10: this_BOOL_EXPR_7= RULE_BOOL_EXPR
            	    {
            	    this_BOOL_EXPR_7=(Token)match(input,RULE_BOOL_EXPR,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BOOL_EXPR_7);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BOOL_EXPR_7, grammarAccess.getSINGLE_VALUEAccess().getBOOL_EXPRTerminalRuleCall_7()); 
            	          
            	    }

            	    }
            	    break;
            	case 9 :
            	    // InternalSpellDatabase.g:3560:10: this_STRING_8= RULE_STRING
            	    {
            	    this_STRING_8=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_STRING_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_STRING_8, grammarAccess.getSINGLE_VALUEAccess().getSTRINGTerminalRuleCall_8()); 
            	          
            	    }

            	    }
            	    break;
            	case 10 :
            	    // InternalSpellDatabase.g:3568:10: this_ANY_OTHER_9= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_9=(Token)match(input,RULE_ANY_OTHER,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ANY_OTHER_9);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ANY_OTHER_9, grammarAccess.getSINGLE_VALUEAccess().getANY_OTHERTerminalRuleCall_9()); 
            	          
            	    }

            	    }
            	    break;
            	case 11 :
            	    // InternalSpellDatabase.g:3577:2: kw= '.'
            	    {
            	    kw=(Token)match(input,41,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSINGLE_VALUEAccess().getFullStopKeyword_10()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSINGLE_VALUE"


    // $ANTLR start "entryRuleID_STMT"
    // InternalSpellDatabase.g:3593:1: entryRuleID_STMT returns [String current=null] : iv_ruleID_STMT= ruleID_STMT EOF ;
    public final String entryRuleID_STMT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID_STMT = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // InternalSpellDatabase.g:3597:2: (iv_ruleID_STMT= ruleID_STMT EOF )
            // InternalSpellDatabase.g:3598:2: iv_ruleID_STMT= ruleID_STMT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getID_STMTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleID_STMT=ruleID_STMT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID_STMT.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleID_STMT"


    // $ANTLR start "ruleID_STMT"
    // InternalSpellDatabase.g:3608:1: ruleID_STMT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '\\\\' | kw= '/' )* ) ;
    public final AntlrDatatypeRuleToken ruleID_STMT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // InternalSpellDatabase.g:3612:28: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '\\\\' | kw= '/' )* ) )
            // InternalSpellDatabase.g:3613:1: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '\\\\' | kw= '/' )* )
            {
            // InternalSpellDatabase.g:3613:1: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '\\\\' | kw= '/' )* )
            // InternalSpellDatabase.g:3613:6: this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '\\\\' | kw= '/' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getID_STMTAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalSpellDatabase.g:3620:1: (this_ID_1= RULE_ID | kw= '\\\\' | kw= '/' )*
            loop75:
            do {
                int alt75=4;
                alt75 = dfa75.predict(input);
                switch (alt75) {
            	case 1 :
            	    // InternalSpellDatabase.g:3620:6: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_1, grammarAccess.getID_STMTAccess().getIDTerminalRuleCall_1_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalSpellDatabase.g:3629:2: kw= '\\\\'
            	    {
            	    kw=(Token)match(input,39,FollowSets000.FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getID_STMTAccess().getReverseSolidusKeyword_1_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalSpellDatabase.g:3636:2: kw= '/'
            	    {
            	    kw=(Token)match(input,40,FollowSets000.FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getID_STMTAccess().getSolidusKeyword_1_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleID_STMT"


    // $ANTLR start "entryRuleASTRIUM_ID"
    // InternalSpellDatabase.g:3652:1: entryRuleASTRIUM_ID returns [String current=null] : iv_ruleASTRIUM_ID= ruleASTRIUM_ID EOF ;
    public final String entryRuleASTRIUM_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleASTRIUM_ID = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // InternalSpellDatabase.g:3656:2: (iv_ruleASTRIUM_ID= ruleASTRIUM_ID EOF )
            // InternalSpellDatabase.g:3657:2: iv_ruleASTRIUM_ID= ruleASTRIUM_ID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getASTRIUM_IDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleASTRIUM_ID=ruleASTRIUM_ID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleASTRIUM_ID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleASTRIUM_ID"


    // $ANTLR start "ruleASTRIUM_ID"
    // InternalSpellDatabase.g:3667:1: ruleASTRIUM_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleASTRIUM_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // InternalSpellDatabase.g:3671:28: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ) )
            // InternalSpellDatabase.g:3672:1: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* )
            {
            // InternalSpellDatabase.g:3672:1: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* )
            // InternalSpellDatabase.g:3672:6: this_ID_0= RULE_ID (this_ID_1= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getASTRIUM_IDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalSpellDatabase.g:3679:1: (this_ID_1= RULE_ID )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_ID) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalSpellDatabase.g:3679:6: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_1, grammarAccess.getASTRIUM_IDAccess().getIDTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleASTRIUM_ID"


    // $ANTLR start "entryRuleASTRIUM_TIME"
    // InternalSpellDatabase.g:3697:1: entryRuleASTRIUM_TIME returns [String current=null] : iv_ruleASTRIUM_TIME= ruleASTRIUM_TIME EOF ;
    public final String entryRuleASTRIUM_TIME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleASTRIUM_TIME = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // InternalSpellDatabase.g:3701:2: (iv_ruleASTRIUM_TIME= ruleASTRIUM_TIME EOF )
            // InternalSpellDatabase.g:3702:2: iv_ruleASTRIUM_TIME= ruleASTRIUM_TIME EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getASTRIUM_TIMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleASTRIUM_TIME=ruleASTRIUM_TIME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleASTRIUM_TIME.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleASTRIUM_TIME"


    // $ANTLR start "ruleASTRIUM_TIME"
    // InternalSpellDatabase.g:3712:1: ruleASTRIUM_TIME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_ID_0= RULE_ID kw= '.' )? this_INT_2= RULE_INT this_ID_3= RULE_ID this_INT_4= RULE_INT )? this_INT_5= RULE_INT this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleASTRIUM_TIME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_ID_3=null;
        Token this_INT_4=null;
        Token this_INT_5=null;
        Token this_COLON_6=null;
        Token this_INT_7=null;
        Token this_COLON_8=null;
        Token this_INT_9=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // InternalSpellDatabase.g:3716:28: ( ( ( (this_ID_0= RULE_ID kw= '.' )? this_INT_2= RULE_INT this_ID_3= RULE_ID this_INT_4= RULE_INT )? this_INT_5= RULE_INT this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT ) )
            // InternalSpellDatabase.g:3717:1: ( ( (this_ID_0= RULE_ID kw= '.' )? this_INT_2= RULE_INT this_ID_3= RULE_ID this_INT_4= RULE_INT )? this_INT_5= RULE_INT this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT )
            {
            // InternalSpellDatabase.g:3717:1: ( ( (this_ID_0= RULE_ID kw= '.' )? this_INT_2= RULE_INT this_ID_3= RULE_ID this_INT_4= RULE_INT )? this_INT_5= RULE_INT this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT )
            // InternalSpellDatabase.g:3717:2: ( (this_ID_0= RULE_ID kw= '.' )? this_INT_2= RULE_INT this_ID_3= RULE_ID this_INT_4= RULE_INT )? this_INT_5= RULE_INT this_COLON_6= RULE_COLON this_INT_7= RULE_INT this_COLON_8= RULE_COLON this_INT_9= RULE_INT
            {
            // InternalSpellDatabase.g:3717:2: ( (this_ID_0= RULE_ID kw= '.' )? this_INT_2= RULE_INT this_ID_3= RULE_ID this_INT_4= RULE_INT )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID) ) {
                alt78=1;
            }
            else if ( (LA78_0==RULE_INT) ) {
                int LA78_2 = input.LA(2);

                if ( (LA78_2==RULE_ID) ) {
                    alt78=1;
                }
            }
            switch (alt78) {
                case 1 :
                    // InternalSpellDatabase.g:3717:3: (this_ID_0= RULE_ID kw= '.' )? this_INT_2= RULE_INT this_ID_3= RULE_ID this_INT_4= RULE_INT
                    {
                    // InternalSpellDatabase.g:3717:3: (this_ID_0= RULE_ID kw= '.' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==RULE_ID) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalSpellDatabase.g:3717:8: this_ID_0= RULE_ID kw= '.'
                            {
                            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ID_0);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ID_0, grammarAccess.getASTRIUM_TIMEAccess().getIDTerminalRuleCall_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,41,FollowSets000.FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getASTRIUM_TIMEAccess().getFullStopKeyword_0_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getASTRIUM_TIMEAccess().getINTTerminalRuleCall_0_1()); 
                          
                    }
                    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_3, grammarAccess.getASTRIUM_TIMEAccess().getIDTerminalRuleCall_0_2()); 
                          
                    }
                    this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_4, grammarAccess.getASTRIUM_TIMEAccess().getINTTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;

            }

            this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_5);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_5, grammarAccess.getASTRIUM_TIMEAccess().getINTTerminalRuleCall_1()); 
                  
            }
            this_COLON_6=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_COLON_6);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_6, grammarAccess.getASTRIUM_TIMEAccess().getCOLONTerminalRuleCall_2()); 
                  
            }
            this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_7);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_7, grammarAccess.getASTRIUM_TIMEAccess().getINTTerminalRuleCall_3()); 
                  
            }
            this_COLON_8=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_COLON_8);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_8, grammarAccess.getASTRIUM_TIMEAccess().getCOLONTerminalRuleCall_4()); 
                  
            }
            this_INT_9=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_9);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_9, grammarAccess.getASTRIUM_TIMEAccess().getINTTerminalRuleCall_5()); 
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleASTRIUM_TIME"


    // $ANTLR start "entryRuleINTEGER"
    // InternalSpellDatabase.g:3797:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // InternalSpellDatabase.g:3801:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalSpellDatabase.g:3802:2: iv_ruleINTEGER= ruleINTEGER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTEGERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleINTEGER=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTEGER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // InternalSpellDatabase.g:3812:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_MINUS_1=null;
        Token this_INT_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // InternalSpellDatabase.g:3816:28: ( ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )? this_INT_2= RULE_INT ) )
            // InternalSpellDatabase.g:3817:1: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )? this_INT_2= RULE_INT )
            {
            // InternalSpellDatabase.g:3817:1: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )? this_INT_2= RULE_INT )
            // InternalSpellDatabase.g:3817:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )? this_INT_2= RULE_INT
            {
            // InternalSpellDatabase.g:3817:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )?
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_PLUS) ) {
                alt79=1;
            }
            else if ( (LA79_0==RULE_MINUS) ) {
                alt79=2;
            }
            switch (alt79) {
                case 1 :
                    // InternalSpellDatabase.g:3817:7: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_0, grammarAccess.getINTEGERAccess().getPLUSTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSpellDatabase.g:3825:10: this_MINUS_1= RULE_MINUS
                    {
                    this_MINUS_1=(Token)match(input,RULE_MINUS,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_1, grammarAccess.getINTEGERAccess().getMINUSTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_2, grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_1()); 
                  
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleINTEGER"

    // $ANTLR start synpred2_InternalSpellDatabase
    public final void synpred2_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:456:3: ( ( ruleASTRIUM_TIME ) )
        // InternalSpellDatabase.g:457:1: ( ruleASTRIUM_TIME )
        {
        // InternalSpellDatabase.g:457:1: ( ruleASTRIUM_TIME )
        // InternalSpellDatabase.g:458:1: ruleASTRIUM_TIME
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleASTRIUM_TIME();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSpellDatabase

    // $ANTLR start synpred3_InternalSpellDatabase
    public final void synpred3_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:479:7: ( ( ruleAtom ) )
        // InternalSpellDatabase.g:480:1: ( ruleAtom )
        {
        // InternalSpellDatabase.g:480:1: ( ruleAtom )
        // InternalSpellDatabase.g:481:1: ruleAtom
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleAtom();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSpellDatabase

    // $ANTLR start synpred4_InternalSpellDatabase
    public final void synpred4_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:608:3: ( ( ruleASTRIUM_TIME ) )
        // InternalSpellDatabase.g:609:1: ( ruleASTRIUM_TIME )
        {
        // InternalSpellDatabase.g:609:1: ( ruleASTRIUM_TIME )
        // InternalSpellDatabase.g:610:1: ruleASTRIUM_TIME
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleASTRIUM_TIME();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSpellDatabase

    // $ANTLR start synpred5_InternalSpellDatabase
    public final void synpred5_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:631:7: ( ( ruleAtom ) )
        // InternalSpellDatabase.g:632:1: ( ruleAtom )
        {
        // InternalSpellDatabase.g:632:1: ( ruleAtom )
        // InternalSpellDatabase.g:633:1: ruleAtom
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleAtom();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalSpellDatabase

    // $ANTLR start synpred6_InternalSpellDatabase
    public final void synpred6_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:710:4: ( ruleSkipNLAndComments )
        // InternalSpellDatabase.g:710:6: ruleSkipNLAndComments
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleSkipNLAndComments();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalSpellDatabase

    // $ANTLR start synpred9_InternalSpellDatabase
    public final void synpred9_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:916:3: ( ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* ) )
        // InternalSpellDatabase.g:916:4: ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* )
        {
        // InternalSpellDatabase.g:916:4: ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* )
        // InternalSpellDatabase.g:916:6: ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )*
        {
        pushFollow(FollowSets000.FOLLOW_16);
        ruleSkipNLAndComments2();

        state._fsp--;
        if (state.failed) return ;
        match(input,31,FollowSets000.FOLLOW_16); if (state.failed) return ;
        match(input,31,FollowSets000.FOLLOW_19); if (state.failed) return ;
        // InternalSpellDatabase.g:918:1: ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) )
        // InternalSpellDatabase.g:918:2: ( ( ruleTCArgs ) )=> ( ruleTCArgs )
        {
        // InternalSpellDatabase.g:923:1: ( ruleTCArgs )
        // InternalSpellDatabase.g:924:1: ruleTCArgs
        {
        pushFollow(FollowSets000.FOLLOW_18);
        ruleTCArgs();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSpellDatabase.g:926:2: ( ',' )*
        loop80:
        do {
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==31) ) {
                alt80=1;
            }


            switch (alt80) {
        	case 1 :
        	    // InternalSpellDatabase.g:926:4: ','
        	    {
        	    match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop80;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred9_InternalSpellDatabase

    // $ANTLR start synpred14_InternalSpellDatabase
    public final void synpred14_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:1079:3: ( ( ',' ( ( rulePosIntOrFloat ) )? ) )
        // InternalSpellDatabase.g:1079:4: ( ',' ( ( rulePosIntOrFloat ) )? )
        {
        // InternalSpellDatabase.g:1079:4: ( ',' ( ( rulePosIntOrFloat ) )? )
        // InternalSpellDatabase.g:1079:6: ',' ( ( rulePosIntOrFloat ) )?
        {
        match(input,31,FollowSets000.FOLLOW_63); if (state.failed) return ;
        // InternalSpellDatabase.g:1080:1: ( ( rulePosIntOrFloat ) )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==RULE_FLOAT||LA81_0==RULE_INT) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // InternalSpellDatabase.g:1081:1: ( rulePosIntOrFloat )
                {
                // InternalSpellDatabase.g:1081:1: ( rulePosIntOrFloat )
                // InternalSpellDatabase.g:1082:1: rulePosIntOrFloat
                {
                pushFollow(FollowSets000.FOLLOW_2);
                rulePosIntOrFloat();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalSpellDatabase

    // $ANTLR start synpred15_InternalSpellDatabase
    public final void synpred15_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:1177:7: ( ruleINTEGER )
        // InternalSpellDatabase.g:1177:9: ruleINTEGER
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleINTEGER();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalSpellDatabase

    // $ANTLR start synpred16_InternalSpellDatabase
    public final void synpred16_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:1189:7: ( RULE_FLOAT )
        // InternalSpellDatabase.g:1189:9: RULE_FLOAT
        {
        match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalSpellDatabase

    // $ANTLR start synpred17_InternalSpellDatabase
    public final void synpred17_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:1278:7: ( ruleINTEGER )
        // InternalSpellDatabase.g:1278:9: ruleINTEGER
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleINTEGER();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalSpellDatabase

    // $ANTLR start synpred18_InternalSpellDatabase
    public final void synpred18_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:1290:7: ( RULE_FLOAT )
        // InternalSpellDatabase.g:1290:9: RULE_FLOAT
        {
        match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalSpellDatabase

    // $ANTLR start synpred19_InternalSpellDatabase
    public final void synpred19_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:1305:7: ( RULE_STRING )
        // InternalSpellDatabase.g:1305:9: RULE_STRING
        {
        match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalSpellDatabase

    // $ANTLR start synpred24_InternalSpellDatabase
    public final void synpred24_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:1760:7: ( ruleRelDate )
        // InternalSpellDatabase.g:1760:9: ruleRelDate
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleRelDate();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalSpellDatabase

    // $ANTLR start synpred25_InternalSpellDatabase
    public final void synpred25_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:1770:7: ( ruleDate )
        // InternalSpellDatabase.g:1770:9: ruleDate
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleDate();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalSpellDatabase

    // $ANTLR start synpred26_InternalSpellDatabase
    public final void synpred26_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:1780:7: ( ruleAtom )
        // InternalSpellDatabase.g:1780:9: ruleAtom
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleAtom();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalSpellDatabase

    // $ANTLR start synpred29_InternalSpellDatabase
    public final void synpred29_InternalSpellDatabase_fragment() throws RecognitionException {   
        // InternalSpellDatabase.g:3023:7: ( ( ruleFLOAT_Val ) )
        // InternalSpellDatabase.g:3024:1: ( ruleFLOAT_Val )
        {
        // InternalSpellDatabase.g:3024:1: ( ruleFLOAT_Val )
        // InternalSpellDatabase.g:3025:1: ruleFLOAT_Val
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleFLOAT_Val();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalSpellDatabase

    // Delegated rules

    public final boolean synpred9_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSpellDatabase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSpellDatabase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA1 dfa1 = new DFA1(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA75 dfa75 = new DFA75(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\13\15\uffff";
    static final String dfa_3s = "\1\40\15\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\10\uffff\1\3\2\uffff";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\1\uffff\6\2\2\13\3\uffff\1\2\1\uffff\1\2\1\uffff\1\1\3\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "97:1: ( ( () otherlv_2= 'FILE_HEADER' ruleSkipNLAndComments ( (lv_database_4_0= ruleAstriumDatabase ) ) ) | ( () ( ( (lv_databaseEntry_6_0= ruleDatabaseEntry ) ) ( ruleSkipNLAndComments2 ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )? )* ruleSkipNLAndComments ) ) | ( () ( (lv_csvEntries_11_0= ruleCSVEntry ) ) ( ruleSkipNLAndComments2 )? ( ( ruleSkipNLAndComments2 )? ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) ) )* ruleSkipNLAndComments ) )";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\1\12\16\uffff";
    static final String dfa_9s = "\1\7\16\uffff";
    static final String dfa_10s = "\1\40\16\uffff";
    static final String dfa_11s = "\1\uffff\1\1\10\uffff\1\2\4\uffff";
    static final String dfa_12s = "\17\uffff}>";
    static final String[] dfa_13s = {
            "\4\12\2\uffff\6\1\5\uffff\1\1\1\uffff\1\1\5\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "166:1: ( (lv_databaseEntry_8_0= ruleDatabaseEntry ) )?";
        }
    }
    static final String dfa_14s = "\61\uffff";
    static final String dfa_15s = "\1\1\3\uffff\1\1\5\uffff\4\1\43\uffff";
    static final String dfa_16s = "\1\7\3\uffff\1\7\5\uffff\4\7\43\uffff";
    static final String dfa_17s = "\1\24\3\uffff\1\24\5\uffff\4\24\43\uffff";
    static final String dfa_18s = "\1\uffff\1\2\4\uffff\1\1\13\uffff\4\1\4\uffff\4\1\4\uffff\4\1\4\uffff\4\1\3\uffff";
    static final String dfa_19s = "\61\uffff}>";
    static final String[] dfa_20s = {
            "\1\4\3\1\1\6\7\uffff\2\6",
            "",
            "",
            "",
            "\1\15\1\12\1\13\1\14\1\6\7\uffff\2\6",
            "",
            "",
            "",
            "",
            "",
            "\1\25\1\22\1\23\1\24\1\6\7\uffff\2\6",
            "\1\35\1\32\1\33\1\34\1\6\7\uffff\2\6",
            "\1\45\1\42\1\43\1\44\1\6\7\uffff\2\6",
            "\1\55\1\52\1\53\1\54\1\6\7\uffff\2\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 225:3: ( ( ruleSkipNLAndComments2 )? ( ( ( ruleCSVEntry ) )=> (lv_csvEntries_14_0= ruleCSVEntry ) ) )*";
        }
    }
    static final String dfa_21s = "\u00f1\uffff";
    static final String dfa_22s = "\1\15\1\12\2\uffff\2\12\35\uffff\1\12\u00cd\uffff";
    static final String dfa_23s = "\2\4\1\6\1\0\2\4\3\0\32\uffff\1\4\43\uffff\1\0\10\uffff\1\0\7\uffff\2\0\113\uffff\1\0\113\uffff";
    static final String dfa_24s = "\2\51\1\32\1\0\2\51\3\0\32\uffff\1\51\43\uffff\1\0\10\uffff\1\0\7\uffff\2\0\113\uffff\1\0\113\uffff";
    static final String dfa_25s = "\11\uffff\1\2\1\3\2\uffff\1\4\35\uffff\1\1\11\uffff\1\1\u00bb\uffff";
    static final String dfa_26s = "\1\0\1\uffff\1\1\1\2\2\uffff\1\3\1\4\1\5\76\uffff\1\6\10\uffff\1\7\7\uffff\1\10\1\11\113\uffff\1\12\113\uffff}>";
    static final String[] dfa_27s = {
            "\2\15\1\uffff\2\15\1\12\1\15\2\uffff\1\3\1\4\1\5\1\6\1\10\1\7\5\uffff\1\2\1\11\1\1\1\12\15\uffff\1\12",
            "\2\12\1\uffff\4\12\2\uffff\6\12\5\uffff\1\12\1\uffff\2\12\15\uffff\1\43",
            "\1\65\23\uffff\1\53",
            "\1\uffff",
            "\2\12\1\uffff\4\12\2\uffff\3\12\1\107\2\12\5\uffff\1\120\1\uffff\2\12\15\uffff\1\12",
            "\2\12\1\uffff\4\12\2\uffff\3\12\1\131\2\12\5\uffff\1\130\1\uffff\2\12\15\uffff\1\12",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\12\1\uffff\4\12\2\uffff\6\12\5\uffff\1\u00a5\1\uffff\2\12\15\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_21;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "456:1: ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_7_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_8_0= ruleAtom ) ) | ( (lv_simpleValue_9_0= ruleSINGLE_VALUE ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                         
                        int index9_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_0==RULE_ID) ) {s = 1;}

                        else if ( (LA9_0==RULE_INT) ) {s = 2;}

                        else if ( (LA9_0==RULE_BIN_HEX_OCT) ) {s = 3;}

                        else if ( (LA9_0==RULE_PLUS) ) {s = 4;}

                        else if ( (LA9_0==RULE_MINUS) ) {s = 5;}

                        else if ( (LA9_0==RULE_FLOAT) ) {s = 6;}

                        else if ( (LA9_0==RULE_STRING) ) {s = 7;}

                        else if ( (LA9_0==RULE_BOOL_EXPR) ) {s = 8;}

                        else if ( (LA9_0==RULE_LAMBDA) && (synpred3_InternalSpellDatabase())) {s = 9;}

                        else if ( (LA9_0==RULE_ML_COMMENT||LA9_0==RULE_ANY_OTHER||LA9_0==41) ) {s = 10;}

                        else if ( (LA9_0==EOF||(LA9_0>=RULE_ASTRIUM_COMMENT && LA9_0<=RULE_DOLLAR)||(LA9_0>=RULE_NL && LA9_0<=RULE_WS)||LA9_0==RULE_SL_COMMENT) ) {s = 13;}

                         
                        input.seek(index9_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_2==RULE_ID) && (synpred2_InternalSpellDatabase())) {s = 43;}

                        else if ( (LA9_2==RULE_COLON) && (synpred2_InternalSpellDatabase())) {s = 53;}

                        else if ( (synpred3_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_71 = input.LA(1);

                         
                        int index9_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_71);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_80 = input.LA(1);

                         
                        int index9_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_80);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_88 = input.LA(1);

                         
                        int index9_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_88);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA9_89 = input.LA(1);

                         
                        int index9_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_89);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA9_165 = input.LA(1);

                         
                        int index9_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSpellDatabase()) ) {s = 53;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index9_165);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_28s = "\u00f2\uffff";
    static final String dfa_29s = "\1\15\1\31\2\uffff\2\31\35\uffff\1\31\u00ce\uffff";
    static final String dfa_30s = "\2\4\1\6\1\0\2\4\3\0\32\uffff\1\4\44\uffff\1\0\10\uffff\1\0\7\uffff\2\0\113\uffff\1\0\113\uffff";
    static final String dfa_31s = "\2\51\1\32\1\0\2\51\3\0\32\uffff\1\51\44\uffff\1\0\10\uffff\1\0\7\uffff\2\0\113\uffff\1\0\113\uffff";
    static final String dfa_32s = "\11\uffff\1\2\1\3\2\uffff\1\4\13\uffff\1\3\21\uffff\1\1\12\uffff\1\1\u00bb\uffff";
    static final String dfa_33s = "\1\0\1\uffff\1\1\1\2\2\uffff\1\3\1\4\1\5\77\uffff\1\6\10\uffff\1\7\7\uffff\1\10\1\11\113\uffff\1\12\113\uffff}>";
    static final String[] dfa_34s = {
            "\1\15\2\uffff\2\15\1\12\1\15\2\uffff\1\3\1\4\1\5\1\6\1\10\1\7\5\uffff\1\2\1\11\1\1\1\12\1\uffff\1\15\13\uffff\1\12",
            "\1\12\1\uffff\1\15\4\12\2\uffff\6\31\5\uffff\1\31\1\uffff\2\31\1\uffff\1\12\13\uffff\1\43",
            "\1\66\23\uffff\1\53",
            "\1\uffff",
            "\1\31\2\uffff\4\31\2\uffff\3\31\1\110\2\31\5\uffff\1\121\1\uffff\2\31\1\uffff\1\31\13\uffff\1\31",
            "\1\31\2\uffff\4\31\2\uffff\3\31\1\132\2\31\5\uffff\1\131\1\uffff\2\31\1\uffff\1\31\13\uffff\1\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\2\uffff\4\31\2\uffff\6\31\5\uffff\1\u00a6\1\uffff\2\31\1\uffff\1\31\13\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_28;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_33;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "608:1: ( ( ( ( ruleASTRIUM_TIME ) )=> (lv_astriumTime_6_0= ruleASTRIUM_TIME ) ) | ( ( ( ruleAtom ) )=> (lv_value_7_0= ruleAtom ) ) | ( (lv_simpleValue_8_0= ruleSINGLE_VALUE ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                         
                        int index11_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_0==RULE_ID) ) {s = 1;}

                        else if ( (LA11_0==RULE_INT) ) {s = 2;}

                        else if ( (LA11_0==RULE_BIN_HEX_OCT) ) {s = 3;}

                        else if ( (LA11_0==RULE_PLUS) ) {s = 4;}

                        else if ( (LA11_0==RULE_MINUS) ) {s = 5;}

                        else if ( (LA11_0==RULE_FLOAT) ) {s = 6;}

                        else if ( (LA11_0==RULE_STRING) ) {s = 7;}

                        else if ( (LA11_0==RULE_BOOL_EXPR) ) {s = 8;}

                        else if ( (LA11_0==RULE_LAMBDA) && (synpred5_InternalSpellDatabase())) {s = 9;}

                        else if ( (LA11_0==RULE_ML_COMMENT||LA11_0==RULE_ANY_OTHER||LA11_0==41) ) {s = 10;}

                        else if ( (LA11_0==EOF||LA11_0==RULE_ASTRIUM_COMMENT||(LA11_0>=RULE_NL && LA11_0<=RULE_WS)||LA11_0==RULE_SL_COMMENT||LA11_0==29) ) {s = 13;}

                         
                        input.seek(index11_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_2==RULE_ID) && (synpred4_InternalSpellDatabase())) {s = 43;}

                        else if ( (LA11_2==RULE_COLON) && (synpred4_InternalSpellDatabase())) {s = 54;}

                        else if ( (synpred5_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_72 = input.LA(1);

                         
                        int index11_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index11_72);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_81 = input.LA(1);

                         
                        int index11_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index11_81);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_89 = input.LA(1);

                         
                        int index11_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index11_89);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_90 = input.LA(1);

                         
                        int index11_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSpellDatabase()) ) {s = 9;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index11_90);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_166 = input.LA(1);

                         
                        int index11_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index11_166);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_35s = "\46\uffff";
    static final String dfa_36s = "\1\16\45\uffff";
    static final String dfa_37s = "\1\7\3\uffff\1\0\41\uffff";
    static final String dfa_38s = "\1\40\3\uffff\1\0\41\uffff";
    static final String dfa_39s = "\1\uffff\3\2\1\uffff\16\2\22\uffff\1\1";
    static final String dfa_40s = "\1\0\3\uffff\1\1\41\uffff}>";
    static final String[] dfa_41s = {
            "\1\4\1\1\1\2\1\3\1\17\1\uffff\1\6\1\7\1\10\1\12\1\15\1\14\1\20\1\21\3\uffff\1\11\1\uffff\1\5\4\uffff\1\22\1\13",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[][] dfa_41 = unpackEncodedStringArray(dfa_41s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_35;
            this.eof = dfa_36;
            this.min = dfa_37;
            this.max = dfa_38;
            this.accept = dfa_39;
            this.special = dfa_40;
            this.transition = dfa_41;
        }
        public String getDescription() {
            return "()+ loopback of 703:2: (this_NL_0= RULE_NL )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                         
                        int index13_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_0==RULE_WS) && (synpred6_InternalSpellDatabase())) {s = 1;}

                        else if ( (LA13_0==RULE_ML_COMMENT) && (synpred6_InternalSpellDatabase())) {s = 2;}

                        else if ( (LA13_0==RULE_SL_COMMENT) && (synpred6_InternalSpellDatabase())) {s = 3;}

                        else if ( (LA13_0==RULE_NL) ) {s = 4;}

                        else if ( (LA13_0==RULE_ID) && (synpred6_InternalSpellDatabase())) {s = 5;}

                        else if ( (LA13_0==RULE_BIN_HEX_OCT) && (synpred6_InternalSpellDatabase())) {s = 6;}

                        else if ( (LA13_0==RULE_PLUS) && (synpred6_InternalSpellDatabase())) {s = 7;}

                        else if ( (LA13_0==RULE_MINUS) && (synpred6_InternalSpellDatabase())) {s = 8;}

                        else if ( (LA13_0==RULE_INT) && (synpred6_InternalSpellDatabase())) {s = 9;}

                        else if ( (LA13_0==RULE_FLOAT) && (synpred6_InternalSpellDatabase())) {s = 10;}

                        else if ( (LA13_0==32) && (synpred6_InternalSpellDatabase())) {s = 11;}

                        else if ( (LA13_0==RULE_STRING) && (synpred6_InternalSpellDatabase())) {s = 12;}

                        else if ( (LA13_0==RULE_BOOL_EXPR) && (synpred6_InternalSpellDatabase())) {s = 13;}

                        else if ( (LA13_0==EOF) && (synpred6_InternalSpellDatabase())) {s = 14;}

                        else if ( (LA13_0==RULE_CMD) && (synpred6_InternalSpellDatabase())) {s = 15;}

                        else if ( (LA13_0==RULE_TM) && (synpred6_InternalSpellDatabase())) {s = 16;}

                        else if ( (LA13_0==RULE_SPELL) && (synpred6_InternalSpellDatabase())) {s = 17;}

                        else if ( (LA13_0==31) && (synpred6_InternalSpellDatabase())) {s = 18;}

                         
                        input.seek(index13_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 37;}

                        else if ( (synpred6_InternalSpellDatabase()) ) {s = 18;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_42s = "\27\uffff";
    static final String dfa_43s = "\1\1\26\uffff";
    static final String dfa_44s = "\1\4\26\uffff";
    static final String dfa_45s = "\1\40\26\uffff";
    static final String dfa_46s = "\1\uffff\1\5\20\uffff\1\1\1\2\1\3\1\4\1\uffff";
    static final String dfa_47s = "\27\uffff}>";
    static final String[] dfa_48s = {
            "\2\1\1\uffff\1\25\1\22\1\23\1\24\1\1\1\uffff\10\1\3\uffff\1\1\1\uffff\1\1\1\uffff\2\1\1\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[][] dfa_48 = unpackEncodedStringArray(dfa_48s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_42;
            this.eof = dfa_43;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "()* loopback of 752:1: (this_WS_0= RULE_WS | this_ML_COMMENT_1= RULE_ML_COMMENT | this_SL_COMMENT_2= RULE_SL_COMMENT | this_NL_3= RULE_NL )*";
        }
    }
    static final String dfa_49s = "\33\uffff";
    static final String dfa_50s = "\2\2\31\uffff";
    static final String dfa_51s = "\2\7\31\uffff";
    static final String dfa_52s = "\1\37\1\40\31\uffff";
    static final String dfa_53s = "\2\uffff\1\2\20\uffff\1\1\7\uffff";
    static final String dfa_54s = "\33\uffff}>";
    static final String[] dfa_55s = {
            "\5\2\7\uffff\2\2\12\uffff\1\1",
            "\5\2\1\uffff\5\23\1\uffff\2\2\3\uffff\1\23\1\uffff\1\23\4\uffff\1\2\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[][] dfa_55 = unpackEncodedStringArray(dfa_55s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_49;
            this.eof = dfa_50;
            this.min = dfa_51;
            this.max = dfa_52;
            this.accept = dfa_53;
            this.special = dfa_54;
            this.transition = dfa_55;
        }
        public String getDescription() {
            return "890:2: (otherlv_3= ',' ( ( ( ruleTCArgs ) )=> (lv_args_4_0= ruleTCArgs ) ) ( ( ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* ) )=> ( ruleSkipNLAndComments2 otherlv_6= ',' otherlv_7= ',' ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) ) (otherlv_9= ',' )* ) )* )?";
        }
    }
    static final String dfa_56s = "\67\uffff";
    static final String dfa_57s = "\1\1\1\uffff\1\1\10\uffff\4\1\50\uffff";
    static final String dfa_58s = "\1\7\1\uffff\1\7\10\uffff\4\7\5\uffff\4\0\4\uffff\1\0\3\uffff\3\0\5\uffff\4\0\3\uffff\4\0\4\uffff";
    static final String dfa_59s = "\1\37\1\uffff\1\37\10\uffff\4\37\5\uffff\4\0\4\uffff\1\0\3\uffff\3\0\5\uffff\4\0\3\uffff\4\0\4\uffff";
    static final String dfa_60s = "\1\uffff\1\2\20\uffff\1\1\10\uffff\1\1\10\uffff\1\1\7\uffff\1\1\11\uffff\1\1";
    static final String dfa_61s = "\2\uffff\1\0\10\uffff\1\1\1\2\1\3\1\4\5\uffff\1\5\1\6\1\7\1\10\4\uffff\1\11\3\uffff\1\12\1\13\1\14\5\uffff\1\15\1\16\1\17\1\20\3\uffff\1\21\1\22\1\23\1\24\4\uffff}>";
    static final String[] dfa_62s = {
            "\1\2\4\1\7\uffff\2\1\12\uffff\1\1",
            "",
            "\1\16\1\13\1\14\1\15\1\1\7\uffff\2\1\12\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27\1\24\1\25\1\26\1\1\7\uffff\2\1\12\uffff\1\33",
            "\1\34\1\40\1\41\1\42\1\1\7\uffff\2\1\12\uffff\1\44",
            "\1\53\1\50\1\51\1\52\1\1\7\uffff\2\1\12\uffff\1\54",
            "\1\62\1\57\1\60\1\61\1\1\7\uffff\2\1\12\uffff\1\66",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final char[] dfa_58 = DFA.unpackEncodedStringToUnsignedChars(dfa_58s);
    static final char[] dfa_59 = DFA.unpackEncodedStringToUnsignedChars(dfa_59s);
    static final short[] dfa_60 = DFA.unpackEncodedString(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[][] dfa_62 = unpackEncodedStringArray(dfa_62s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_56;
            this.eof = dfa_57;
            this.min = dfa_58;
            this.max = dfa_59;
            this.accept = dfa_60;
            this.special = dfa_61;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "()* loopback of 916:2: ( ( ( ruleSkipNLAndComments2 ',' ',' ( ( ( ruleTCArgs ) )=> ( ruleTCArgs ) ) ( ',' )* ) )=> ( ruleSkipNLAndComments2 otherlv_6= ',' otherlv_7= ',' ( ( ( ruleTCArgs ) )=> (lv_args_8_0= ruleTCArgs ) ) (otherlv_9= ',' )* ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_2==EOF||LA17_2==RULE_CMD||(LA17_2>=RULE_TM && LA17_2<=RULE_SPELL)) ) {s = 1;}

                        else if ( (LA17_2==RULE_WS) ) {s = 11;}

                        else if ( (LA17_2==RULE_ML_COMMENT) ) {s = 12;}

                        else if ( (LA17_2==RULE_SL_COMMENT) ) {s = 13;}

                        else if ( (LA17_2==RULE_NL) ) {s = 14;}

                        else if ( (LA17_2==31) && (synpred9_InternalSpellDatabase())) {s = 18;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_11 = input.LA(1);

                         
                        int index17_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_11==EOF||LA17_11==RULE_CMD||(LA17_11>=RULE_TM && LA17_11<=RULE_SPELL)) ) {s = 1;}

                        else if ( (LA17_11==RULE_WS) ) {s = 20;}

                        else if ( (LA17_11==RULE_ML_COMMENT) ) {s = 21;}

                        else if ( (LA17_11==RULE_SL_COMMENT) ) {s = 22;}

                        else if ( (LA17_11==RULE_NL) ) {s = 23;}

                        else if ( (LA17_11==31) && (synpred9_InternalSpellDatabase())) {s = 27;}

                         
                        input.seek(index17_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_12 = input.LA(1);

                         
                        int index17_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_12==RULE_NL) ) {s = 28;}

                        else if ( (LA17_12==EOF||LA17_12==RULE_CMD||(LA17_12>=RULE_TM && LA17_12<=RULE_SPELL)) ) {s = 1;}

                        else if ( (LA17_12==RULE_WS) ) {s = 32;}

                        else if ( (LA17_12==RULE_ML_COMMENT) ) {s = 33;}

                        else if ( (LA17_12==RULE_SL_COMMENT) ) {s = 34;}

                        else if ( (LA17_12==31) && (synpred9_InternalSpellDatabase())) {s = 36;}

                         
                        input.seek(index17_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_13 = input.LA(1);

                         
                        int index17_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_13==EOF||LA17_13==RULE_CMD||(LA17_13>=RULE_TM && LA17_13<=RULE_SPELL)) ) {s = 1;}

                        else if ( (LA17_13==RULE_WS) ) {s = 40;}

                        else if ( (LA17_13==RULE_ML_COMMENT) ) {s = 41;}

                        else if ( (LA17_13==RULE_SL_COMMENT) ) {s = 42;}

                        else if ( (LA17_13==RULE_NL) ) {s = 43;}

                        else if ( (LA17_13==31) && (synpred9_InternalSpellDatabase())) {s = 44;}

                         
                        input.seek(index17_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_14 = input.LA(1);

                         
                        int index17_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_14==EOF||LA17_14==RULE_CMD||(LA17_14>=RULE_TM && LA17_14<=RULE_SPELL)) ) {s = 1;}

                        else if ( (LA17_14==RULE_WS) ) {s = 47;}

                        else if ( (LA17_14==RULE_ML_COMMENT) ) {s = 48;}

                        else if ( (LA17_14==RULE_SL_COMMENT) ) {s = 49;}

                        else if ( (LA17_14==RULE_NL) ) {s = 50;}

                        else if ( (LA17_14==31) && (synpred9_InternalSpellDatabase())) {s = 54;}

                         
                        input.seek(index17_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_20 = input.LA(1);

                         
                        int index17_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_20);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_21 = input.LA(1);

                         
                        int index17_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_21);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_22 = input.LA(1);

                         
                        int index17_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_22);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_23 = input.LA(1);

                         
                        int index17_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_23);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_28 = input.LA(1);

                         
                        int index17_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_28);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_32 = input.LA(1);

                         
                        int index17_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_32);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_33 = input.LA(1);

                         
                        int index17_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_33);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_34 = input.LA(1);

                         
                        int index17_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_34);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_40 = input.LA(1);

                         
                        int index17_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_40);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_41 = input.LA(1);

                         
                        int index17_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_41);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_42 = input.LA(1);

                         
                        int index17_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_42);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_43 = input.LA(1);

                         
                        int index17_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_43);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA17_47 = input.LA(1);

                         
                        int index17_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_47);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA17_48 = input.LA(1);

                         
                        int index17_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_48);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA17_49 = input.LA(1);

                         
                        int index17_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_49);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA17_50 = input.LA(1);

                         
                        int index17_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpellDatabase()) ) {s = 54;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_50);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_63s = "\12\uffff";
    static final String dfa_64s = "\1\2\11\uffff";
    static final String dfa_65s = "\1\7\11\uffff";
    static final String dfa_66s = "\1\37\11\uffff";
    static final String dfa_67s = "\1\uffff\1\1\1\2\7\uffff";
    static final String dfa_68s = "\12\uffff}>";
    static final String[] dfa_69s = {
            "\5\2\7\uffff\2\2\12\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final char[] dfa_65 = DFA.unpackEncodedStringToUnsignedChars(dfa_65s);
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[][] dfa_69 = unpackEncodedStringArray(dfa_69s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_63;
            this.eof = dfa_64;
            this.min = dfa_65;
            this.max = dfa_66;
            this.accept = dfa_67;
            this.special = dfa_68;
            this.transition = dfa_69;
        }
        public String getDescription() {
            return "()* loopback of 965:2: (otherlv_9= ',' )*";
        }
    }
    static final String dfa_70s = "\1\1\11\uffff";
    static final String dfa_71s = "\1\uffff\1\2\7\uffff\1\1";
    static final String[] dfa_72s = {
            "\5\1\7\uffff\2\1\12\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[][] dfa_72 = unpackEncodedStringArray(dfa_72s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_63;
            this.eof = dfa_70;
            this.min = dfa_65;
            this.max = dfa_66;
            this.accept = dfa_71;
            this.special = dfa_68;
            this.transition = dfa_72;
        }
        public String getDescription() {
            return "()* loopback of 969:8: (otherlv_10= ',' )*";
        }
    }
    static final String dfa_73s = "\26\uffff";
    static final String dfa_74s = "\1\2\25\uffff";
    static final String dfa_75s = "\1\7\1\0\24\uffff";
    static final String dfa_76s = "\1\37\1\0\24\uffff";
    static final String dfa_77s = "\2\uffff\1\2\22\uffff\1\1";
    static final String dfa_78s = "\1\uffff\1\0\24\uffff}>";
    static final String[] dfa_79s = {
            "\5\2\7\uffff\2\2\12\uffff\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final char[] dfa_76 = DFA.unpackEncodedStringToUnsignedChars(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final short[][] dfa_79 = unpackEncodedStringArray(dfa_79s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_73;
            this.eof = dfa_74;
            this.min = dfa_75;
            this.max = dfa_76;
            this.accept = dfa_77;
            this.special = dfa_78;
            this.transition = dfa_79;
        }
        public String getDescription() {
            return "1079:2: ( ( ( ',' ( ( rulePosIntOrFloat ) )? ) )=> (otherlv_5= ',' ( (lv_tolerance_6_0= rulePosIntOrFloat ) )? ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSpellDatabase()) ) {s = 21;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_80s = "\14\uffff";
    static final String dfa_81s = "\1\3\13\uffff";
    static final String dfa_82s = "\1\7\13\uffff";
    static final String dfa_83s = "\1\37\13\uffff";
    static final String dfa_84s = "\1\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String dfa_85s = "\14\uffff}>";
    static final String[] dfa_86s = {
            "\5\3\4\uffff\1\1\2\uffff\2\3\3\uffff\1\1\6\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_80 = DFA.unpackEncodedString(dfa_80s);
    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final char[] dfa_82 = DFA.unpackEncodedStringToUnsignedChars(dfa_82s);
    static final char[] dfa_83 = DFA.unpackEncodedStringToUnsignedChars(dfa_83s);
    static final short[] dfa_84 = DFA.unpackEncodedString(dfa_84s);
    static final short[] dfa_85 = DFA.unpackEncodedString(dfa_85s);
    static final short[][] dfa_86 = unpackEncodedStringArray(dfa_86s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_80;
            this.eof = dfa_81;
            this.min = dfa_82;
            this.max = dfa_83;
            this.accept = dfa_84;
            this.special = dfa_85;
            this.transition = dfa_86;
        }
        public String getDescription() {
            return "1088:1: ( (lv_tolerance_6_0= rulePosIntOrFloat ) )?";
        }
    }
    static final String dfa_87s = "\1\uffff\1\2\1\1\7\uffff";
    static final String[] dfa_88s = {
            "\5\1\7\uffff\2\1\12\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_87 = DFA.unpackEncodedString(dfa_87s);
    static final short[][] dfa_88 = unpackEncodedStringArray(dfa_88s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_63;
            this.eof = dfa_70;
            this.min = dfa_65;
            this.max = dfa_66;
            this.accept = dfa_87;
            this.special = dfa_68;
            this.transition = dfa_88;
        }
        public String getDescription() {
            return "()* loopback of 1106:6: (otherlv_7= ',' )*";
        }
    }
    static final String dfa_89s = "\41\uffff";
    static final String dfa_90s = "\1\1\40\uffff";
    static final String dfa_91s = "\1\15\4\uffff\2\0\32\uffff";
    static final String dfa_92s = "\1\40\4\uffff\2\0\32\uffff";
    static final String dfa_93s = "\1\uffff\1\11\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\7\1\10\12\uffff\1\3\12\uffff\1\4";
    static final String dfa_94s = "\1\0\4\uffff\1\1\1\2\32\uffff}>";
    static final String[] dfa_95s = {
            "\1\4\1\5\1\6\1\10\1\12\6\uffff\1\7\1\uffff\1\3\4\uffff\1\1\1\11",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_89 = DFA.unpackEncodedString(dfa_89s);
    static final short[] dfa_90 = DFA.unpackEncodedString(dfa_90s);
    static final char[] dfa_91 = DFA.unpackEncodedStringToUnsignedChars(dfa_91s);
    static final char[] dfa_92 = DFA.unpackEncodedStringToUnsignedChars(dfa_92s);
    static final short[] dfa_93 = DFA.unpackEncodedString(dfa_93s);
    static final short[] dfa_94 = DFA.unpackEncodedString(dfa_94s);
    static final short[][] dfa_95 = unpackEncodedStringArray(dfa_95s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_89;
            this.eof = dfa_90;
            this.min = dfa_91;
            this.max = dfa_92;
            this.accept = dfa_93;
            this.special = dfa_94;
            this.transition = dfa_95;
        }
        public String getDescription() {
            return "()+ loopback of 1141:1: (this_ID_STMT_0= ruleID_STMT | this_BIN_HEX_OCT_1= RULE_BIN_HEX_OCT | this_PLUS_2= RULE_PLUS | this_MINUS_3= RULE_MINUS | ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER ) | ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT ) | kw= '*' | this_BOOL_EXPR_7= RULE_BOOL_EXPR )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA23_0==EOF||LA23_0==31) ) {s = 1;}

                        else if ( (LA23_0==RULE_ID) ) {s = 3;}

                        else if ( (LA23_0==RULE_BIN_HEX_OCT) ) {s = 4;}

                        else if ( (LA23_0==RULE_PLUS) ) {s = 5;}

                        else if ( (LA23_0==RULE_MINUS) ) {s = 6;}

                        else if ( (LA23_0==RULE_INT) && (synpred15_InternalSpellDatabase())) {s = 7;}

                        else if ( (LA23_0==RULE_FLOAT) && (synpred16_InternalSpellDatabase())) {s = 8;}

                        else if ( (LA23_0==32) ) {s = 9;}

                        else if ( (LA23_0==RULE_BOOL_EXPR) ) {s = 10;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_5 = input.LA(1);

                         
                        int index23_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 21;}

                        else if ( (synpred15_InternalSpellDatabase()) ) {s = 7;}

                         
                        input.seek(index23_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_6 = input.LA(1);

                         
                        int index23_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 32;}

                        else if ( (synpred15_InternalSpellDatabase()) ) {s = 7;}

                         
                        input.seek(index23_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_96s = "\122\uffff";
    static final String dfa_97s = "\1\1\121\uffff";
    static final String dfa_98s = "\1\7\10\uffff\1\0\1\uffff\2\0\105\uffff";
    static final String dfa_99s = "\1\47\10\uffff\1\0\1\uffff\2\0\105\uffff";
    static final String dfa_100s = "\1\uffff\1\12\5\uffff\1\3\1\4\1\uffff\1\2\2\uffff\1\11\4\uffff\1\1\1\7\25\uffff\1\5\23\uffff\1\6\23\uffff\1\10";
    static final String dfa_101s = "\11\uffff\1\0\1\uffff\1\1\1\2\105\uffff}>";
    static final String[] dfa_102s = {
            "\4\1\2\uffff\1\12\1\7\1\10\1\13\1\15\1\14\5\uffff\1\11\1\1\1\22\5\uffff\1\23\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_96 = DFA.unpackEncodedString(dfa_96s);
    static final short[] dfa_97 = DFA.unpackEncodedString(dfa_97s);
    static final char[] dfa_98 = DFA.unpackEncodedStringToUnsignedChars(dfa_98s);
    static final char[] dfa_99 = DFA.unpackEncodedStringToUnsignedChars(dfa_99s);
    static final short[] dfa_100 = DFA.unpackEncodedString(dfa_100s);
    static final short[] dfa_101 = DFA.unpackEncodedString(dfa_101s);
    static final short[][] dfa_102 = unpackEncodedStringArray(dfa_102s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_96;
            this.eof = dfa_97;
            this.min = dfa_98;
            this.max = dfa_99;
            this.accept = dfa_100;
            this.special = dfa_101;
            this.transition = dfa_102;
        }
        public String getDescription() {
            return "()+ loopback of 1242:1: (this_ID_STMT_0= ruleID_STMT | this_BIN_HEX_OCT_1= RULE_BIN_HEX_OCT | this_PLUS_2= RULE_PLUS | this_MINUS_3= RULE_MINUS | ( ( ruleINTEGER )=>this_INTEGER_4= ruleINTEGER ) | ( ( RULE_FLOAT )=>this_FLOAT_5= RULE_FLOAT ) | kw= '*' | ( ( RULE_STRING )=>this_STRING_7= RULE_STRING ) | this_BOOL_EXPR_8= RULE_BOOL_EXPR )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_9 = input.LA(1);

                         
                        int index24_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSpellDatabase()) ) {s = 41;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_11 = input.LA(1);

                         
                        int index24_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSpellDatabase()) ) {s = 61;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_12 = input.LA(1);

                         
                        int index24_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSpellDatabase()) ) {s = 81;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_63;
            this.eof = dfa_70;
            this.min = dfa_65;
            this.max = dfa_66;
            this.accept = dfa_71;
            this.special = dfa_68;
            this.transition = dfa_72;
        }
        public String getDescription() {
            return "()* loopback of 1385:2: (otherlv_4= ',' )*";
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_63;
            this.eof = dfa_70;
            this.min = dfa_65;
            this.max = dfa_66;
            this.accept = dfa_71;
            this.special = dfa_68;
            this.transition = dfa_72;
        }
        public String getDescription() {
            return "()* loopback of 1450:2: (otherlv_3= ',' )*";
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_63;
            this.eof = dfa_64;
            this.min = dfa_65;
            this.max = dfa_66;
            this.accept = dfa_67;
            this.special = dfa_68;
            this.transition = dfa_69;
        }
        public String getDescription() {
            return "()* loopback of 1559:1: (otherlv_8= ',' )*";
        }
    }
    static final String dfa_103s = "\22\uffff";
    static final String dfa_104s = "\1\2\21\uffff";
    static final String dfa_105s = "\1\7\21\uffff";
    static final String dfa_106s = "\1\47\21\uffff";
    static final String dfa_107s = "\1\uffff\1\1\1\2\17\uffff";
    static final String dfa_108s = "\22\uffff}>";
    static final String[] dfa_109s = {
            "\1\2\1\1\2\2\2\uffff\6\2\5\uffff\2\2\7\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_103 = DFA.unpackEncodedString(dfa_103s);
    static final short[] dfa_104 = DFA.unpackEncodedString(dfa_104s);
    static final char[] dfa_105 = DFA.unpackEncodedStringToUnsignedChars(dfa_105s);
    static final char[] dfa_106 = DFA.unpackEncodedStringToUnsignedChars(dfa_106s);
    static final short[] dfa_107 = DFA.unpackEncodedString(dfa_107s);
    static final short[] dfa_108 = DFA.unpackEncodedString(dfa_108s);
    static final short[][] dfa_109 = unpackEncodedStringArray(dfa_109s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_103;
            this.eof = dfa_104;
            this.min = dfa_105;
            this.max = dfa_106;
            this.accept = dfa_107;
            this.special = dfa_108;
            this.transition = dfa_109;
        }
        public String getDescription() {
            return "1692:2: (this_WS_1= RULE_WS )?";
        }
    }
    static final String dfa_110s = "\21\uffff";
    static final String dfa_111s = "\1\2\20\uffff";
    static final String dfa_112s = "\1\7\20\uffff";
    static final String dfa_113s = "\1\45\20\uffff";
    static final String dfa_114s = "\1\uffff\1\1\1\2\16\uffff";
    static final String dfa_115s = "\21\uffff}>";
    static final String[] dfa_116s = {
            "\1\2\1\1\2\2\2\uffff\6\2\5\uffff\2\2\7\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_110 = DFA.unpackEncodedString(dfa_110s);
    static final short[] dfa_111 = DFA.unpackEncodedString(dfa_111s);
    static final char[] dfa_112 = DFA.unpackEncodedStringToUnsignedChars(dfa_112s);
    static final char[] dfa_113 = DFA.unpackEncodedStringToUnsignedChars(dfa_113s);
    static final short[] dfa_114 = DFA.unpackEncodedString(dfa_114s);
    static final short[] dfa_115 = DFA.unpackEncodedString(dfa_115s);
    static final short[][] dfa_116 = unpackEncodedStringArray(dfa_116s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_110;
            this.eof = dfa_111;
            this.min = dfa_112;
            this.max = dfa_113;
            this.accept = dfa_114;
            this.special = dfa_115;
            this.transition = dfa_116;
        }
        public String getDescription() {
            return "1704:1: (this_WS_3= RULE_WS )?";
        }
    }
    static final String dfa_117s = "\1\14\20\uffff";
    static final String dfa_118s = "\1\uffff\1\1\12\uffff\1\2\4\uffff";
    static final String[] dfa_119s = {
            "\4\14\2\uffff\6\1\5\uffff\2\1\7\uffff\1\1\1\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_117 = DFA.unpackEncodedString(dfa_117s);
    static final short[] dfa_118 = DFA.unpackEncodedString(dfa_118s);
    static final short[][] dfa_119 = unpackEncodedStringArray(dfa_119s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_110;
            this.eof = dfa_117;
            this.min = dfa_112;
            this.max = dfa_113;
            this.accept = dfa_118;
            this.special = dfa_115;
            this.transition = dfa_119;
        }
        public String getDescription() {
            return "1708:3: ( (lv_value_4_0= ruleDatabaseValue ) )?";
        }
    }
    static final String dfa_120s = "\47\uffff";
    static final String dfa_121s = "\6\uffff\1\24\5\uffff\1\35\1\uffff\1\44\30\uffff";
    static final String dfa_122s = "\1\15\3\uffff\2\20\1\6\5\uffff\1\6\1\uffff\1\6\30\uffff";
    static final String dfa_123s = "\1\45\3\uffff\2\30\1\50\5\uffff\1\30\1\uffff\1\30\30\uffff";
    static final String dfa_124s = "\1\uffff\1\1\5\uffff\5\4\1\uffff\1\4\1\uffff\6\4\2\2\2\3\5\4\2\2\5\4\2\2";
    static final String dfa_125s = "\1\0\3\uffff\1\1\1\2\1\3\5\uffff\1\4\1\uffff\1\5\30\uffff}>";
    static final String[] dfa_126s = {
            "\1\7\1\4\1\5\1\10\1\12\1\11\5\uffff\1\6\1\13\7\uffff\1\1\1\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "\1\15\7\uffff\1\14",
            "\1\17\7\uffff\1\16",
            "\1\26\1\20\1\21\1\22\1\23\4\uffff\1\30\10\uffff\1\25\17\uffff\1\27",
            "",
            "",
            "",
            "",
            "",
            "\1\37\1\31\1\32\1\33\1\34\15\uffff\1\36",
            "",
            "\1\46\1\40\1\41\1\42\1\43\15\uffff\1\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_120 = DFA.unpackEncodedString(dfa_120s);
    static final short[] dfa_121 = DFA.unpackEncodedString(dfa_121s);
    static final char[] dfa_122 = DFA.unpackEncodedStringToUnsignedChars(dfa_122s);
    static final char[] dfa_123 = DFA.unpackEncodedStringToUnsignedChars(dfa_123s);
    static final short[] dfa_124 = DFA.unpackEncodedString(dfa_124s);
    static final short[] dfa_125 = DFA.unpackEncodedString(dfa_125s);
    static final short[][] dfa_126 = unpackEncodedStringArray(dfa_126s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_120;
            this.eof = dfa_121;
            this.min = dfa_122;
            this.max = dfa_123;
            this.accept = dfa_124;
            this.special = dfa_125;
            this.transition = dfa_126;
        }
        public String getDescription() {
            return "1750:1: (this_ComplexValue_0= ruleComplexValue | ( ( ruleRelDate )=>this_RelDate_1= ruleRelDate ) | ( ( ruleDate )=>this_Date_2= ruleDate ) | ( ( ruleAtom )=>this_Atom_3= ruleAtom ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==33||LA34_0==35||LA34_0==37) ) {s = 1;}

                        else if ( (LA34_0==RULE_PLUS) ) {s = 4;}

                        else if ( (LA34_0==RULE_MINUS) ) {s = 5;}

                        else if ( (LA34_0==RULE_INT) ) {s = 6;}

                        else if ( (LA34_0==RULE_BIN_HEX_OCT) && (synpred26_InternalSpellDatabase())) {s = 7;}

                        else if ( (LA34_0==RULE_FLOAT) && (synpred26_InternalSpellDatabase())) {s = 8;}

                        else if ( (LA34_0==RULE_STRING) && (synpred26_InternalSpellDatabase())) {s = 9;}

                        else if ( (LA34_0==RULE_BOOL_EXPR) && (synpred26_InternalSpellDatabase())) {s = 10;}

                        else if ( (LA34_0==RULE_LAMBDA) && (synpred26_InternalSpellDatabase())) {s = 11;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_4==RULE_INT) ) {s = 12;}

                        else if ( (LA34_4==RULE_FLOAT) && (synpred26_InternalSpellDatabase())) {s = 13;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_5==RULE_INT) ) {s = 14;}

                        else if ( (LA34_5==RULE_FLOAT) && (synpred26_InternalSpellDatabase())) {s = 15;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_6==RULE_NL) && (synpred26_InternalSpellDatabase())) {s = 16;}

                        else if ( (LA34_6==RULE_WS) && (synpred26_InternalSpellDatabase())) {s = 17;}

                        else if ( (LA34_6==RULE_ML_COMMENT) && (synpred26_InternalSpellDatabase())) {s = 18;}

                        else if ( (LA34_6==RULE_SL_COMMENT) && (synpred26_InternalSpellDatabase())) {s = 19;}

                        else if ( (LA34_6==EOF) && (synpred26_InternalSpellDatabase())) {s = 20;}

                        else if ( (LA34_6==RULE_INT) && (synpred24_InternalSpellDatabase())) {s = 21;}

                        else if ( (LA34_6==RULE_COLON) && (synpred24_InternalSpellDatabase())) {s = 22;}

                        else if ( (LA34_6==40) && (synpred25_InternalSpellDatabase())) {s = 23;}

                        else if ( (LA34_6==RULE_MINUS) && (synpred25_InternalSpellDatabase())) {s = 24;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_12 = input.LA(1);

                         
                        int index34_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_12==RULE_NL) && (synpred26_InternalSpellDatabase())) {s = 25;}

                        else if ( (LA34_12==RULE_WS) && (synpred26_InternalSpellDatabase())) {s = 26;}

                        else if ( (LA34_12==RULE_ML_COMMENT) && (synpred26_InternalSpellDatabase())) {s = 27;}

                        else if ( (LA34_12==RULE_SL_COMMENT) && (synpred26_InternalSpellDatabase())) {s = 28;}

                        else if ( (LA34_12==EOF) && (synpred26_InternalSpellDatabase())) {s = 29;}

                        else if ( (LA34_12==RULE_INT) && (synpred24_InternalSpellDatabase())) {s = 30;}

                        else if ( (LA34_12==RULE_COLON) && (synpred24_InternalSpellDatabase())) {s = 31;}

                         
                        input.seek(index34_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_14 = input.LA(1);

                         
                        int index34_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_14==RULE_NL) && (synpred26_InternalSpellDatabase())) {s = 32;}

                        else if ( (LA34_14==RULE_WS) && (synpred26_InternalSpellDatabase())) {s = 33;}

                        else if ( (LA34_14==RULE_ML_COMMENT) && (synpred26_InternalSpellDatabase())) {s = 34;}

                        else if ( (LA34_14==RULE_SL_COMMENT) && (synpred26_InternalSpellDatabase())) {s = 35;}

                        else if ( (LA34_14==EOF) && (synpred26_InternalSpellDatabase())) {s = 36;}

                        else if ( (LA34_14==RULE_INT) && (synpred24_InternalSpellDatabase())) {s = 37;}

                        else if ( (LA34_14==RULE_COLON) && (synpred24_InternalSpellDatabase())) {s = 38;}

                         
                        input.seek(index34_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_127s = "\76\uffff";
    static final String dfa_128s = "\1\14\1\6\74\uffff";
    static final String dfa_129s = "\2\4\44\uffff\1\15\27\uffff";
    static final String dfa_130s = "\2\47\44\uffff\1\47\27\uffff";
    static final String dfa_131s = "\2\uffff\1\1\3\uffff\1\1\5\uffff\1\2\24\uffff\1\1\34\uffff";
    static final String dfa_132s = "\76\uffff}>";
    static final String[] dfa_133s = {
            "\5\14\1\6\1\14\2\uffff\1\6\3\2\2\6\5\uffff\1\2\1\6\1\1\1\6\1\uffff\1\14\1\uffff\1\14\2\uffff\1\14\1\uffff\1\14\1\uffff\2\14",
            "\2\6\1\46\4\6\2\uffff\6\41\5\uffff\4\41\1\uffff\1\6\1\uffff\1\41\2\uffff\1\41\1\uffff\1\41\1\uffff\2\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\41\5\uffff\2\41\4\uffff\1\14\2\uffff\1\41\1\uffff\1\41\1\uffff\1\41\1\uffff\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_127 = DFA.unpackEncodedString(dfa_127s);
    static final short[] dfa_128 = DFA.unpackEncodedString(dfa_128s);
    static final char[] dfa_129 = DFA.unpackEncodedStringToUnsignedChars(dfa_129s);
    static final char[] dfa_130 = DFA.unpackEncodedStringToUnsignedChars(dfa_130s);
    static final short[] dfa_131 = DFA.unpackEncodedString(dfa_131s);
    static final short[] dfa_132 = DFA.unpackEncodedString(dfa_132s);
    static final short[][] dfa_133 = unpackEncodedStringArray(dfa_133s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_127;
            this.eof = dfa_128;
            this.min = dfa_129;
            this.max = dfa_130;
            this.accept = dfa_131;
            this.special = dfa_132;
            this.transition = dfa_133;
        }
        public String getDescription() {
            return "1842:1: ( (lv_val_4_0= ruleLambda_Function ) )?";
        }
    }
    static final String dfa_134s = "\31\uffff";
    static final String dfa_135s = "\1\1\30\uffff";
    static final String dfa_136s = "\1\4\30\uffff";
    static final String dfa_137s = "\1\47\30\uffff";
    static final String dfa_138s = "\1\uffff\1\2\1\uffff\1\1\5\uffff\1\1\6\uffff\11\1";
    static final String dfa_139s = "\31\uffff}>";
    static final String[] dfa_140s = {
            "\5\1\1\3\1\1\2\uffff\1\24\1\22\1\23\1\20\1\25\1\26\5\uffff\1\21\1\30\1\11\1\27\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_134 = DFA.unpackEncodedString(dfa_134s);
    static final short[] dfa_135 = DFA.unpackEncodedString(dfa_135s);
    static final char[] dfa_136 = DFA.unpackEncodedStringToUnsignedChars(dfa_136s);
    static final char[] dfa_137 = DFA.unpackEncodedStringToUnsignedChars(dfa_137s);
    static final short[] dfa_138 = DFA.unpackEncodedString(dfa_138s);
    static final short[] dfa_139 = DFA.unpackEncodedString(dfa_139s);
    static final short[][] dfa_140 = unpackEncodedStringArray(dfa_140s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_134;
            this.eof = dfa_135;
            this.min = dfa_136;
            this.max = dfa_137;
            this.accept = dfa_138;
            this.special = dfa_139;
            this.transition = dfa_140;
        }
        public String getDescription() {
            return "()+ loopback of 1888:1: (this_Lambda_Partial_Func_0= ruleLambda_Partial_Func )+";
        }
    }
    static final String dfa_141s = "\1\11\13\uffff";
    static final String dfa_142s = "\1\33\13\uffff";
    static final String dfa_143s = "\1\uffff\1\1\11\uffff\1\2";
    static final String[] dfa_144s = {
            "\1\1\3\uffff\6\1\5\uffff\1\1\1\13\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_141 = DFA.unpackEncodedStringToUnsignedChars(dfa_141s);
    static final char[] dfa_142 = DFA.unpackEncodedStringToUnsignedChars(dfa_142s);
    static final short[] dfa_143 = DFA.unpackEncodedString(dfa_143s);
    static final short[][] dfa_144 = unpackEncodedStringArray(dfa_144s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_80;
            this.eof = dfa_80;
            this.min = dfa_141;
            this.max = dfa_142;
            this.accept = dfa_143;
            this.special = dfa_85;
            this.transition = dfa_144;
        }
        public String getDescription() {
            return "1930:1: ( (this_ID_0= RULE_ID | this_FLOAT_1= RULE_FLOAT | this_INT_2= RULE_INT | this_PLUS_3= RULE_PLUS | this_MINUS_4= RULE_MINUS | this_ML_COMMENT_5= RULE_ML_COMMENT | this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT | this_BOOL_EXPR_7= RULE_BOOL_EXPR | this_STRING_8= RULE_STRING | this_ANY_OTHER_9= RULE_ANY_OTHER ) | (this_LAMBDA_10= RULE_LAMBDA (this_Lambda_Vars_11= ruleLambda_Vars )? this_COLON_12= RULE_COLON (this_Lambda_Function_13= ruleLambda_Function )? ) )";
        }
    }
    static final String dfa_145s = "\13\uffff";
    static final String dfa_146s = "\1\11\12\uffff";
    static final String dfa_147s = "\1\33\12\uffff";
    static final String dfa_148s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_149s = "\13\uffff}>";
    static final String[] dfa_150s = {
            "\1\6\3\uffff\1\7\1\4\1\5\1\2\1\10\1\11\5\uffff\1\3\1\uffff\1\1\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_145 = DFA.unpackEncodedString(dfa_145s);
    static final char[] dfa_146 = DFA.unpackEncodedStringToUnsignedChars(dfa_146s);
    static final char[] dfa_147 = DFA.unpackEncodedStringToUnsignedChars(dfa_147s);
    static final short[] dfa_148 = DFA.unpackEncodedString(dfa_148s);
    static final short[] dfa_149 = DFA.unpackEncodedString(dfa_149s);
    static final short[][] dfa_150 = unpackEncodedStringArray(dfa_150s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_145;
            this.eof = dfa_145;
            this.min = dfa_146;
            this.max = dfa_147;
            this.accept = dfa_148;
            this.special = dfa_149;
            this.transition = dfa_150;
        }
        public String getDescription() {
            return "1930:2: (this_ID_0= RULE_ID | this_FLOAT_1= RULE_FLOAT | this_INT_2= RULE_INT | this_PLUS_3= RULE_PLUS | this_MINUS_4= RULE_MINUS | this_ML_COMMENT_5= RULE_ML_COMMENT | this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT | this_BOOL_EXPR_7= RULE_BOOL_EXPR | this_STRING_8= RULE_STRING | this_ANY_OTHER_9= RULE_ANY_OTHER )";
        }
    }
    static final String dfa_151s = "\1\14\30\uffff";
    static final String dfa_152s = "\1\uffff\13\1\1\2\14\uffff";
    static final String[] dfa_153s = {
            "\5\14\1\6\1\14\2\uffff\1\7\1\4\1\5\1\2\1\10\1\11\5\uffff\1\3\1\13\1\1\1\12\1\uffff\1\14\1\uffff\1\14\2\uffff\1\14\1\uffff\1\14\1\uffff\2\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_151 = DFA.unpackEncodedString(dfa_151s);
    static final short[] dfa_152 = DFA.unpackEncodedString(dfa_152s);
    static final short[][] dfa_153 = unpackEncodedStringArray(dfa_153s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_134;
            this.eof = dfa_151;
            this.min = dfa_136;
            this.max = dfa_137;
            this.accept = dfa_152;
            this.special = dfa_139;
            this.transition = dfa_153;
        }
        public String getDescription() {
            return "2035:1: (this_Lambda_Function_13= ruleLambda_Function )?";
        }
    }
    static final String dfa_154s = "\36\uffff";
    static final String dfa_155s = "\1\15\1\7\15\uffff\1\15\16\uffff";
    static final String dfa_156s = "\1\47\1\7\15\uffff\1\47\16\uffff";
    static final String dfa_157s = "\2\uffff\1\1\12\uffff\1\2\3\uffff\1\1\14\uffff";
    static final String dfa_158s = "\36\uffff}>";
    static final String[] dfa_159s = {
            "\6\2\5\uffff\2\2\5\uffff\1\15\1\uffff\1\2\1\15\1\2\1\uffff\1\2\1\uffff\1\1",
            "\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\2\5\uffff\2\2\5\uffff\1\15\1\uffff\1\2\1\15\1\2\1\uffff\1\2\1\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_154 = DFA.unpackEncodedString(dfa_154s);
    static final char[] dfa_155 = DFA.unpackEncodedStringToUnsignedChars(dfa_155s);
    static final char[] dfa_156 = DFA.unpackEncodedStringToUnsignedChars(dfa_156s);
    static final short[] dfa_157 = DFA.unpackEncodedString(dfa_157s);
    static final short[] dfa_158 = DFA.unpackEncodedString(dfa_158s);
    static final short[][] dfa_159 = unpackEncodedStringArray(dfa_159s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_154;
            this.eof = dfa_154;
            this.min = dfa_155;
            this.max = dfa_156;
            this.accept = dfa_157;
            this.special = dfa_158;
            this.transition = dfa_159;
        }
        public String getDescription() {
            return "2188:1: ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )?";
        }
    }
    static final String dfa_160s = "\1\15\13\uffff";
    static final String dfa_161s = "\1\45\13\uffff";
    static final String dfa_162s = "\1\uffff\1\1\7\uffff\1\2\2\uffff";
    static final String[] dfa_163s = {
            "\6\1\5\uffff\2\1\7\uffff\1\11\1\uffff\1\11\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_160 = DFA.unpackEncodedStringToUnsignedChars(dfa_160s);
    static final char[] dfa_161 = DFA.unpackEncodedStringToUnsignedChars(dfa_161s);
    static final short[] dfa_162 = DFA.unpackEncodedString(dfa_162s);
    static final short[][] dfa_163 = unpackEncodedStringArray(dfa_163s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_80;
            this.eof = dfa_80;
            this.min = dfa_160;
            this.max = dfa_161;
            this.accept = dfa_162;
            this.special = dfa_85;
            this.transition = dfa_163;
        }
        public String getDescription() {
            return "2198:1: (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue )";
        }
    }
    static final String dfa_164s = "\1\37\1\uffff\1\15\1\uffff\1\7\15\uffff";
    static final String dfa_165s = "\1\47\1\uffff\1\47\1\uffff\1\7\15\uffff";
    static final String dfa_166s = "\1\uffff\1\2\4\uffff\1\1\12\uffff\1\1";
    static final String[] dfa_167s = {
            "\1\2\2\uffff\1\1\4\uffff\1\1",
            "",
            "\6\6\5\uffff\2\6\7\uffff\1\6\1\1\1\6\1\uffff\1\6\1\uffff\1\4",
            "",
            "\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_164 = DFA.unpackEncodedStringToUnsignedChars(dfa_164s);
    static final char[] dfa_165 = DFA.unpackEncodedStringToUnsignedChars(dfa_165s);
    static final short[] dfa_166 = DFA.unpackEncodedString(dfa_166s);
    static final short[][] dfa_167 = unpackEncodedStringArray(dfa_167s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_103;
            this.eof = dfa_103;
            this.min = dfa_164;
            this.max = dfa_165;
            this.accept = dfa_166;
            this.special = dfa_108;
            this.transition = dfa_167;
        }
        public String getDescription() {
            return "()* loopback of 2240:1: (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )*";
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_80;
            this.eof = dfa_80;
            this.min = dfa_160;
            this.max = dfa_161;
            this.accept = dfa_162;
            this.special = dfa_85;
            this.transition = dfa_163;
        }
        public String getDescription() {
            return "2254:1: (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue )";
        }
    }
    static final String[] dfa_168s = {
            "\6\2\5\uffff\2\2\5\uffff\1\15\1\uffff\1\2\1\uffff\1\2\1\15\1\2\1\uffff\1\1",
            "\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\2\5\uffff\2\2\5\uffff\1\15\1\uffff\1\2\1\uffff\1\2\1\15\1\2\1\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_168 = unpackEncodedStringArray(dfa_168s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_154;
            this.eof = dfa_154;
            this.min = dfa_155;
            this.max = dfa_156;
            this.accept = dfa_157;
            this.special = dfa_158;
            this.transition = dfa_168;
        }
        public String getDescription() {
            return "2353:1: ( ruleSkipped_NL ( ( (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue ) ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )* )?";
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_80;
            this.eof = dfa_80;
            this.min = dfa_160;
            this.max = dfa_161;
            this.accept = dfa_162;
            this.special = dfa_85;
            this.transition = dfa_163;
        }
        public String getDescription() {
            return "2363:1: (lv_values_3_1= ruleAtom | lv_values_3_2= ruleComplexValue )";
        }
    }
    static final String[] dfa_169s = {
            "\1\2\4\uffff\1\1\2\uffff\1\1",
            "",
            "\6\6\5\uffff\2\6\7\uffff\1\6\1\uffff\1\6\1\1\1\6\1\uffff\1\4",
            "",
            "\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_169 = unpackEncodedStringArray(dfa_169s);

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_103;
            this.eof = dfa_103;
            this.min = dfa_164;
            this.max = dfa_165;
            this.accept = dfa_166;
            this.special = dfa_108;
            this.transition = dfa_169;
        }
        public String getDescription() {
            return "()* loopback of 2405:1: (otherlv_5= ',' ruleSkipped_NL ( ( (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue ) ) ) )*";
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_80;
            this.eof = dfa_80;
            this.min = dfa_160;
            this.max = dfa_161;
            this.accept = dfa_162;
            this.special = dfa_85;
            this.transition = dfa_163;
        }
        public String getDescription() {
            return "2419:1: (lv_values_7_1= ruleAtom | lv_values_7_2= ruleComplexValue )";
        }
    }
    static final String dfa_170s = "\2\uffff\1\1\12\uffff\1\2\15\uffff\1\1\2\uffff";
    static final String[] dfa_171s = {
            "\6\2\5\uffff\2\2\5\uffff\1\15\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\15\1\1",
            "\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\2\5\uffff\2\2\5\uffff\1\15\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\15\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_170 = DFA.unpackEncodedString(dfa_170s);
    static final short[][] dfa_171 = unpackEncodedStringArray(dfa_171s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_154;
            this.eof = dfa_154;
            this.min = dfa_155;
            this.max = dfa_156;
            this.accept = dfa_170;
            this.special = dfa_158;
            this.transition = dfa_171;
        }
        public String getDescription() {
            return "2518:1: ( ruleSkipped_NL ( (lv_entries_3_0= ruleDictionaryEntry ) ) ruleSkipped_NL (otherlv_5= ',' ruleSkipped_NL ( (lv_entries_7_0= ruleDictionaryEntry ) ) ruleSkipped_NL )* )?";
        }
    }
    static final String dfa_172s = "\1\uffff\1\2\3\uffff\1\1\13\uffff\1\1";
    static final String[] dfa_173s = {
            "\1\2\6\uffff\2\1",
            "",
            "\6\5\5\uffff\2\5\7\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\1\1\4",
            "",
            "\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_172 = DFA.unpackEncodedString(dfa_172s);
    static final short[][] dfa_173 = unpackEncodedStringArray(dfa_173s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_103;
            this.eof = dfa_103;
            this.min = dfa_164;
            this.max = dfa_165;
            this.accept = dfa_172;
            this.special = dfa_108;
            this.transition = dfa_173;
        }
        public String getDescription() {
            return "()* loopback of 2552:1: (otherlv_5= ',' ruleSkipped_NL ( (lv_entries_7_0= ruleDictionaryEntry ) ) ruleSkipped_NL )*";
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_80;
            this.eof = dfa_80;
            this.min = dfa_160;
            this.max = dfa_161;
            this.accept = dfa_162;
            this.special = dfa_85;
            this.transition = dfa_163;
        }
        public String getDescription() {
            return "2647:1: (lv_key_0_1= ruleAtom | lv_key_0_2= ruleComplexValue )";
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_80;
            this.eof = dfa_80;
            this.min = dfa_160;
            this.max = dfa_161;
            this.accept = dfa_162;
            this.special = dfa_85;
            this.transition = dfa_163;
        }
        public String getDescription() {
            return "2703:1: (lv_value_4_1= ruleAtom | lv_value_4_2= ruleComplexValue )";
        }
    }
    static final String dfa_174s = "\1\15\1\uffff\2\20\6\uffff";
    static final String dfa_175s = "\1\30\1\uffff\2\30\6\uffff";
    static final String dfa_176s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff\2\3\1\uffff";
    static final String dfa_177s = "\1\0\1\uffff\1\1\1\2\6\uffff}>";
    static final String[] dfa_178s = {
            "\1\1\1\2\1\3\1\5\7\uffff\1\4",
            "",
            "\1\7\7\uffff\1\4",
            "\1\10\7\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_174 = DFA.unpackEncodedStringToUnsignedChars(dfa_174s);
    static final char[] dfa_175 = DFA.unpackEncodedStringToUnsignedChars(dfa_175s);
    static final short[] dfa_176 = DFA.unpackEncodedString(dfa_176s);
    static final short[] dfa_177 = DFA.unpackEncodedString(dfa_177s);
    static final short[][] dfa_178 = unpackEncodedStringArray(dfa_178s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_63;
            this.eof = dfa_63;
            this.min = dfa_174;
            this.max = dfa_175;
            this.accept = dfa_176;
            this.special = dfa_177;
            this.transition = dfa_178;
        }
        public String getDescription() {
            return "2985:1: ( ( (lv_val_0_0= RULE_BIN_HEX_OCT ) ) | ( (lv_valInt_1_0= ruleINTEGER ) ) | ( ( ( ruleFLOAT_Val ) )=> (lv_valStr_2_0= ruleFLOAT_Val ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==RULE_BIN_HEX_OCT) ) {s = 1;}

                        else if ( (LA61_0==RULE_PLUS) ) {s = 2;}

                        else if ( (LA61_0==RULE_MINUS) ) {s = 3;}

                        else if ( (LA61_0==RULE_INT) ) {s = 4;}

                        else if ( (LA61_0==RULE_FLOAT) && (synpred29_InternalSpellDatabase())) {s = 5;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_2==RULE_INT) ) {s = 4;}

                        else if ( (LA61_2==RULE_FLOAT) && (synpred29_InternalSpellDatabase())) {s = 7;}

                         
                        input.seek(index61_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_3 = input.LA(1);

                         
                        int index61_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_3==RULE_FLOAT) && (synpred29_InternalSpellDatabase())) {s = 8;}

                        else if ( (LA61_3==RULE_INT) ) {s = 4;}

                         
                        input.seek(index61_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_179s = "\1\6\26\uffff";
    static final String dfa_180s = "\1\47\26\uffff";
    static final String dfa_181s = "\1\uffff\1\2\20\uffff\1\1\4\uffff";
    static final String[] dfa_182s = {
            "\5\1\2\uffff\6\1\5\uffff\2\1\5\uffff\1\1\1\uffff\6\1\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_179 = DFA.unpackEncodedStringToUnsignedChars(dfa_179s);
    static final char[] dfa_180 = DFA.unpackEncodedStringToUnsignedChars(dfa_180s);
    static final short[] dfa_181 = DFA.unpackEncodedString(dfa_181s);
    static final short[][] dfa_182 = unpackEncodedStringArray(dfa_182s);

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = dfa_42;
            this.eof = dfa_43;
            this.min = dfa_179;
            this.max = dfa_180;
            this.accept = dfa_181;
            this.special = dfa_47;
            this.transition = dfa_182;
        }
        public String getDescription() {
            return "()* loopback of 3126:1: (kw= '\\\\' this_NL_1= RULE_NL )*";
        }
    }
    static final String dfa_183s = "\1\1\10\uffff\1\23\34\uffff";
    static final String dfa_184s = "\1\4\10\uffff\1\4\34\uffff";
    static final String dfa_185s = "\1\51\10\uffff\1\51\34\uffff";
    static final String dfa_186s = "\1\uffff\1\14\1\6\7\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\11\1\12\1\13\1\1\7\uffff\1\1\12\uffff";
    static final String dfa_187s = "\46\uffff}>";
    static final String[] dfa_188s = {
            "\2\1\1\uffff\2\1\1\2\1\1\2\uffff\1\16\1\14\1\15\1\12\1\17\1\20\5\uffff\1\13\1\uffff\1\11\1\21\1\uffff\1\1\13\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\23\1\1\4\23\2\uffff\6\33\5\uffff\1\33\1\uffff\2\33\1\uffff\1\23\13\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_183 = DFA.unpackEncodedString(dfa_183s);
    static final char[] dfa_184 = DFA.unpackEncodedStringToUnsignedChars(dfa_184s);
    static final char[] dfa_185 = DFA.unpackEncodedStringToUnsignedChars(dfa_185s);
    static final short[] dfa_186 = DFA.unpackEncodedString(dfa_186s);
    static final short[] dfa_187 = DFA.unpackEncodedString(dfa_187s);
    static final short[][] dfa_188 = unpackEncodedStringArray(dfa_188s);

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = dfa_35;
            this.eof = dfa_183;
            this.min = dfa_184;
            this.max = dfa_185;
            this.accept = dfa_186;
            this.special = dfa_187;
            this.transition = dfa_188;
        }
        public String getDescription() {
            return "()+ loopback of 3496:1: (this_ID_0= RULE_ID | this_FLOAT_1= RULE_FLOAT | this_INT_2= RULE_INT | this_PLUS_3= RULE_PLUS | this_MINUS_4= RULE_MINUS | this_ML_COMMENT_5= RULE_ML_COMMENT | this_BIN_HEX_OCT_6= RULE_BIN_HEX_OCT | this_BOOL_EXPR_7= RULE_BOOL_EXPR | this_STRING_8= RULE_STRING | this_ANY_OTHER_9= RULE_ANY_OTHER | kw= '.' )+";
        }
    }
    static final String dfa_189s = "\1\1\21\uffff\1\31\36\uffff";
    static final String dfa_190s = "\1\7\21\uffff\1\7\36\uffff";
    static final String dfa_191s = "\1\50\21\uffff\1\50\36\uffff";
    static final String dfa_192s = "\1\uffff\1\4\10\uffff\1\1\15\uffff\1\3\1\2\27\uffff";
    static final String[] dfa_193s = {
            "\5\1\1\uffff\10\1\3\uffff\2\1\1\12\4\uffff\3\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\22\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\5\31\1\uffff\10\31\3\uffff\3\31\4\uffff\3\31\1\uffff\1\31\1\uffff\1\31\1\uffff\2\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_189 = DFA.unpackEncodedString(dfa_189s);
    static final char[] dfa_190 = DFA.unpackEncodedStringToUnsignedChars(dfa_190s);
    static final char[] dfa_191 = DFA.unpackEncodedStringToUnsignedChars(dfa_191s);
    static final short[] dfa_192 = DFA.unpackEncodedString(dfa_192s);
    static final short[][] dfa_193 = unpackEncodedStringArray(dfa_193s);

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_14;
            this.eof = dfa_189;
            this.min = dfa_190;
            this.max = dfa_191;
            this.accept = dfa_192;
            this.special = dfa_19;
            this.transition = dfa_193;
        }
        public String getDescription() {
            return "()* loopback of 3620:1: (this_ID_1= RULE_ID | kw= '\\\\' | kw= '/' )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001151FE800L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000024000790L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000780L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000010507E780L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001151FEF80L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000024000010L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000007B0L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000002000F07E202L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000782L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000010503E000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000082L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000081010002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000010503E002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000010507E002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000101E000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000AA0307E100L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002A0307E102L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002A0307E002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000F07E202L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000AE8307E000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002A0307E000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008480000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000AA0307E000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008400000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000BA8307E000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000009080000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000009000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000EA8307E000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000000C080000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000008000000040L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000005000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000140L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x000002000D07E202L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000018004000002L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000001010002L});
    }


}