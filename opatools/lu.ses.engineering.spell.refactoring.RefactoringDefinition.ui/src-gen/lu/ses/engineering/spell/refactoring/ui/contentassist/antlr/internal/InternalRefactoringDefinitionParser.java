package lu.ses.engineering.spell.refactoring.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import lu.ses.engineering.spell.refactoring.services.RefactoringDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRefactoringDefinitionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_NL", "RULE_VALUE"
    };
    public static final int RULE_VALUE=6;
    public static final int RULE_WS=4;
    public static final int RULE_NL=5;
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
     	
        public void setGrammarAccess(RefactoringDefinitionGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleRefactorings"
    // InternalRefactoringDefinition.g:60:1: entryRuleRefactorings : ruleRefactorings EOF ;
    public final void entryRuleRefactorings() throws RecognitionException {
        try {
            // InternalRefactoringDefinition.g:61:1: ( ruleRefactorings EOF )
            // InternalRefactoringDefinition.g:62:1: ruleRefactorings EOF
            {
             before(grammarAccess.getRefactoringsRule()); 
            pushFollow(FOLLOW_1);
            ruleRefactorings();

            state._fsp--;

             after(grammarAccess.getRefactoringsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefactorings"


    // $ANTLR start "ruleRefactorings"
    // InternalRefactoringDefinition.g:69:1: ruleRefactorings : ( ( ( rule__Refactorings__RefactoringsAssignment ) ) ( ( rule__Refactorings__RefactoringsAssignment )* ) ) ;
    public final void ruleRefactorings() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:73:2: ( ( ( ( rule__Refactorings__RefactoringsAssignment ) ) ( ( rule__Refactorings__RefactoringsAssignment )* ) ) )
            // InternalRefactoringDefinition.g:74:1: ( ( ( rule__Refactorings__RefactoringsAssignment ) ) ( ( rule__Refactorings__RefactoringsAssignment )* ) )
            {
            // InternalRefactoringDefinition.g:74:1: ( ( ( rule__Refactorings__RefactoringsAssignment ) ) ( ( rule__Refactorings__RefactoringsAssignment )* ) )
            // InternalRefactoringDefinition.g:75:1: ( ( rule__Refactorings__RefactoringsAssignment ) ) ( ( rule__Refactorings__RefactoringsAssignment )* )
            {
            // InternalRefactoringDefinition.g:75:1: ( ( rule__Refactorings__RefactoringsAssignment ) )
            // InternalRefactoringDefinition.g:76:1: ( rule__Refactorings__RefactoringsAssignment )
            {
             before(grammarAccess.getRefactoringsAccess().getRefactoringsAssignment()); 
            // InternalRefactoringDefinition.g:77:1: ( rule__Refactorings__RefactoringsAssignment )
            // InternalRefactoringDefinition.g:77:2: rule__Refactorings__RefactoringsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Refactorings__RefactoringsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRefactoringsAccess().getRefactoringsAssignment()); 

            }

            // InternalRefactoringDefinition.g:80:1: ( ( rule__Refactorings__RefactoringsAssignment )* )
            // InternalRefactoringDefinition.g:81:1: ( rule__Refactorings__RefactoringsAssignment )*
            {
             before(grammarAccess.getRefactoringsAccess().getRefactoringsAssignment()); 
            // InternalRefactoringDefinition.g:82:1: ( rule__Refactorings__RefactoringsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_VALUE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRefactoringDefinition.g:82:2: rule__Refactorings__RefactoringsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Refactorings__RefactoringsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRefactoringsAccess().getRefactoringsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefactorings"


    // $ANTLR start "entryRulerefactorMapEntry"
    // InternalRefactoringDefinition.g:95:1: entryRulerefactorMapEntry : rulerefactorMapEntry EOF ;
    public final void entryRulerefactorMapEntry() throws RecognitionException {
        try {
            // InternalRefactoringDefinition.g:96:1: ( rulerefactorMapEntry EOF )
            // InternalRefactoringDefinition.g:97:1: rulerefactorMapEntry EOF
            {
             before(grammarAccess.getRefactorMapEntryRule()); 
            pushFollow(FOLLOW_1);
            rulerefactorMapEntry();

            state._fsp--;

             after(grammarAccess.getRefactorMapEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerefactorMapEntry"


    // $ANTLR start "rulerefactorMapEntry"
    // InternalRefactoringDefinition.g:104:1: rulerefactorMapEntry : ( ( rule__RefactorMapEntry__Group__0 ) ) ;
    public final void rulerefactorMapEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:108:2: ( ( ( rule__RefactorMapEntry__Group__0 ) ) )
            // InternalRefactoringDefinition.g:109:1: ( ( rule__RefactorMapEntry__Group__0 ) )
            {
            // InternalRefactoringDefinition.g:109:1: ( ( rule__RefactorMapEntry__Group__0 ) )
            // InternalRefactoringDefinition.g:110:1: ( rule__RefactorMapEntry__Group__0 )
            {
             before(grammarAccess.getRefactorMapEntryAccess().getGroup()); 
            // InternalRefactoringDefinition.g:111:1: ( rule__RefactorMapEntry__Group__0 )
            // InternalRefactoringDefinition.g:111:2: rule__RefactorMapEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RefactorMapEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefactorMapEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerefactorMapEntry"


    // $ANTLR start "entryRuleargRefactor"
    // InternalRefactoringDefinition.g:125:1: entryRuleargRefactor : ruleargRefactor EOF ;
    public final void entryRuleargRefactor() throws RecognitionException {
        try {
            // InternalRefactoringDefinition.g:126:1: ( ruleargRefactor EOF )
            // InternalRefactoringDefinition.g:127:1: ruleargRefactor EOF
            {
             before(grammarAccess.getArgRefactorRule()); 
            pushFollow(FOLLOW_1);
            ruleargRefactor();

            state._fsp--;

             after(grammarAccess.getArgRefactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleargRefactor"


    // $ANTLR start "ruleargRefactor"
    // InternalRefactoringDefinition.g:134:1: ruleargRefactor : ( ( rule__ArgRefactor__Group__0 ) ) ;
    public final void ruleargRefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:138:2: ( ( ( rule__ArgRefactor__Group__0 ) ) )
            // InternalRefactoringDefinition.g:139:1: ( ( rule__ArgRefactor__Group__0 ) )
            {
            // InternalRefactoringDefinition.g:139:1: ( ( rule__ArgRefactor__Group__0 ) )
            // InternalRefactoringDefinition.g:140:1: ( rule__ArgRefactor__Group__0 )
            {
             before(grammarAccess.getArgRefactorAccess().getGroup()); 
            // InternalRefactoringDefinition.g:141:1: ( rule__ArgRefactor__Group__0 )
            // InternalRefactoringDefinition.g:141:2: rule__ArgRefactor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArgRefactor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgRefactorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleargRefactor"


    // $ANTLR start "rule__RefactorMapEntry__Group__0"
    // InternalRefactoringDefinition.g:155:1: rule__RefactorMapEntry__Group__0 : rule__RefactorMapEntry__Group__0__Impl rule__RefactorMapEntry__Group__1 ;
    public final void rule__RefactorMapEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:159:1: ( rule__RefactorMapEntry__Group__0__Impl rule__RefactorMapEntry__Group__1 )
            // InternalRefactoringDefinition.g:160:2: rule__RefactorMapEntry__Group__0__Impl rule__RefactorMapEntry__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RefactorMapEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefactorMapEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefactorMapEntry__Group__0"


    // $ANTLR start "rule__RefactorMapEntry__Group__0__Impl"
    // InternalRefactoringDefinition.g:167:1: rule__RefactorMapEntry__Group__0__Impl : ( ( rule__RefactorMapEntry__KeyAssignment_0 ) ) ;
    public final void rule__RefactorMapEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:171:1: ( ( ( rule__RefactorMapEntry__KeyAssignment_0 ) ) )
            // InternalRefactoringDefinition.g:172:1: ( ( rule__RefactorMapEntry__KeyAssignment_0 ) )
            {
            // InternalRefactoringDefinition.g:172:1: ( ( rule__RefactorMapEntry__KeyAssignment_0 ) )
            // InternalRefactoringDefinition.g:173:1: ( rule__RefactorMapEntry__KeyAssignment_0 )
            {
             before(grammarAccess.getRefactorMapEntryAccess().getKeyAssignment_0()); 
            // InternalRefactoringDefinition.g:174:1: ( rule__RefactorMapEntry__KeyAssignment_0 )
            // InternalRefactoringDefinition.g:174:2: rule__RefactorMapEntry__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RefactorMapEntry__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRefactorMapEntryAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefactorMapEntry__Group__0__Impl"


    // $ANTLR start "rule__RefactorMapEntry__Group__1"
    // InternalRefactoringDefinition.g:184:1: rule__RefactorMapEntry__Group__1 : rule__RefactorMapEntry__Group__1__Impl rule__RefactorMapEntry__Group__2 ;
    public final void rule__RefactorMapEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:188:1: ( rule__RefactorMapEntry__Group__1__Impl rule__RefactorMapEntry__Group__2 )
            // InternalRefactoringDefinition.g:189:2: rule__RefactorMapEntry__Group__1__Impl rule__RefactorMapEntry__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RefactorMapEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefactorMapEntry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefactorMapEntry__Group__1"


    // $ANTLR start "rule__RefactorMapEntry__Group__1__Impl"
    // InternalRefactoringDefinition.g:196:1: rule__RefactorMapEntry__Group__1__Impl : ( RULE_WS ) ;
    public final void rule__RefactorMapEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:200:1: ( ( RULE_WS ) )
            // InternalRefactoringDefinition.g:201:1: ( RULE_WS )
            {
            // InternalRefactoringDefinition.g:201:1: ( RULE_WS )
            // InternalRefactoringDefinition.g:202:1: RULE_WS
            {
             before(grammarAccess.getRefactorMapEntryAccess().getWSTerminalRuleCall_1()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getRefactorMapEntryAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefactorMapEntry__Group__1__Impl"


    // $ANTLR start "rule__RefactorMapEntry__Group__2"
    // InternalRefactoringDefinition.g:213:1: rule__RefactorMapEntry__Group__2 : rule__RefactorMapEntry__Group__2__Impl rule__RefactorMapEntry__Group__3 ;
    public final void rule__RefactorMapEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:217:1: ( rule__RefactorMapEntry__Group__2__Impl rule__RefactorMapEntry__Group__3 )
            // InternalRefactoringDefinition.g:218:2: rule__RefactorMapEntry__Group__2__Impl rule__RefactorMapEntry__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__RefactorMapEntry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefactorMapEntry__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefactorMapEntry__Group__2"


    // $ANTLR start "rule__RefactorMapEntry__Group__2__Impl"
    // InternalRefactoringDefinition.g:225:1: rule__RefactorMapEntry__Group__2__Impl : ( ( rule__RefactorMapEntry__ValueAssignment_2 ) ) ;
    public final void rule__RefactorMapEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:229:1: ( ( ( rule__RefactorMapEntry__ValueAssignment_2 ) ) )
            // InternalRefactoringDefinition.g:230:1: ( ( rule__RefactorMapEntry__ValueAssignment_2 ) )
            {
            // InternalRefactoringDefinition.g:230:1: ( ( rule__RefactorMapEntry__ValueAssignment_2 ) )
            // InternalRefactoringDefinition.g:231:1: ( rule__RefactorMapEntry__ValueAssignment_2 )
            {
             before(grammarAccess.getRefactorMapEntryAccess().getValueAssignment_2()); 
            // InternalRefactoringDefinition.g:232:1: ( rule__RefactorMapEntry__ValueAssignment_2 )
            // InternalRefactoringDefinition.g:232:2: rule__RefactorMapEntry__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RefactorMapEntry__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRefactorMapEntryAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefactorMapEntry__Group__2__Impl"


    // $ANTLR start "rule__RefactorMapEntry__Group__3"
    // InternalRefactoringDefinition.g:242:1: rule__RefactorMapEntry__Group__3 : rule__RefactorMapEntry__Group__3__Impl ;
    public final void rule__RefactorMapEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:246:1: ( rule__RefactorMapEntry__Group__3__Impl )
            // InternalRefactoringDefinition.g:247:2: rule__RefactorMapEntry__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefactorMapEntry__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefactorMapEntry__Group__3"


    // $ANTLR start "rule__RefactorMapEntry__Group__3__Impl"
    // InternalRefactoringDefinition.g:253:1: rule__RefactorMapEntry__Group__3__Impl : ( ( RULE_NL )? ) ;
    public final void rule__RefactorMapEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:257:1: ( ( ( RULE_NL )? ) )
            // InternalRefactoringDefinition.g:258:1: ( ( RULE_NL )? )
            {
            // InternalRefactoringDefinition.g:258:1: ( ( RULE_NL )? )
            // InternalRefactoringDefinition.g:259:1: ( RULE_NL )?
            {
             before(grammarAccess.getRefactorMapEntryAccess().getNLTerminalRuleCall_3()); 
            // InternalRefactoringDefinition.g:260:1: ( RULE_NL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRefactoringDefinition.g:260:3: RULE_NL
                    {
                    match(input,RULE_NL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRefactorMapEntryAccess().getNLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefactorMapEntry__Group__3__Impl"


    // $ANTLR start "rule__ArgRefactor__Group__0"
    // InternalRefactoringDefinition.g:279:1: rule__ArgRefactor__Group__0 : rule__ArgRefactor__Group__0__Impl rule__ArgRefactor__Group__1 ;
    public final void rule__ArgRefactor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:283:1: ( rule__ArgRefactor__Group__0__Impl rule__ArgRefactor__Group__1 )
            // InternalRefactoringDefinition.g:284:2: rule__ArgRefactor__Group__0__Impl rule__ArgRefactor__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ArgRefactor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgRefactor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgRefactor__Group__0"


    // $ANTLR start "rule__ArgRefactor__Group__0__Impl"
    // InternalRefactoringDefinition.g:291:1: rule__ArgRefactor__Group__0__Impl : ( ( rule__ArgRefactor__MnemAssignment_0 ) ) ;
    public final void rule__ArgRefactor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:295:1: ( ( ( rule__ArgRefactor__MnemAssignment_0 ) ) )
            // InternalRefactoringDefinition.g:296:1: ( ( rule__ArgRefactor__MnemAssignment_0 ) )
            {
            // InternalRefactoringDefinition.g:296:1: ( ( rule__ArgRefactor__MnemAssignment_0 ) )
            // InternalRefactoringDefinition.g:297:1: ( rule__ArgRefactor__MnemAssignment_0 )
            {
             before(grammarAccess.getArgRefactorAccess().getMnemAssignment_0()); 
            // InternalRefactoringDefinition.g:298:1: ( rule__ArgRefactor__MnemAssignment_0 )
            // InternalRefactoringDefinition.g:298:2: rule__ArgRefactor__MnemAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ArgRefactor__MnemAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArgRefactorAccess().getMnemAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgRefactor__Group__0__Impl"


    // $ANTLR start "rule__ArgRefactor__Group__1"
    // InternalRefactoringDefinition.g:308:1: rule__ArgRefactor__Group__1 : rule__ArgRefactor__Group__1__Impl rule__ArgRefactor__Group__2 ;
    public final void rule__ArgRefactor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:312:1: ( rule__ArgRefactor__Group__1__Impl rule__ArgRefactor__Group__2 )
            // InternalRefactoringDefinition.g:313:2: rule__ArgRefactor__Group__1__Impl rule__ArgRefactor__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ArgRefactor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgRefactor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgRefactor__Group__1"


    // $ANTLR start "rule__ArgRefactor__Group__1__Impl"
    // InternalRefactoringDefinition.g:320:1: rule__ArgRefactor__Group__1__Impl : ( RULE_WS ) ;
    public final void rule__ArgRefactor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:324:1: ( ( RULE_WS ) )
            // InternalRefactoringDefinition.g:325:1: ( RULE_WS )
            {
            // InternalRefactoringDefinition.g:325:1: ( RULE_WS )
            // InternalRefactoringDefinition.g:326:1: RULE_WS
            {
             before(grammarAccess.getArgRefactorAccess().getWSTerminalRuleCall_1()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getArgRefactorAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgRefactor__Group__1__Impl"


    // $ANTLR start "rule__ArgRefactor__Group__2"
    // InternalRefactoringDefinition.g:337:1: rule__ArgRefactor__Group__2 : rule__ArgRefactor__Group__2__Impl ;
    public final void rule__ArgRefactor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:341:1: ( rule__ArgRefactor__Group__2__Impl )
            // InternalRefactoringDefinition.g:342:2: rule__ArgRefactor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgRefactor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgRefactor__Group__2"


    // $ANTLR start "rule__ArgRefactor__Group__2__Impl"
    // InternalRefactoringDefinition.g:348:1: rule__ArgRefactor__Group__2__Impl : ( ( rule__ArgRefactor__RawAssignment_2 ) ) ;
    public final void rule__ArgRefactor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:352:1: ( ( ( rule__ArgRefactor__RawAssignment_2 ) ) )
            // InternalRefactoringDefinition.g:353:1: ( ( rule__ArgRefactor__RawAssignment_2 ) )
            {
            // InternalRefactoringDefinition.g:353:1: ( ( rule__ArgRefactor__RawAssignment_2 ) )
            // InternalRefactoringDefinition.g:354:1: ( rule__ArgRefactor__RawAssignment_2 )
            {
             before(grammarAccess.getArgRefactorAccess().getRawAssignment_2()); 
            // InternalRefactoringDefinition.g:355:1: ( rule__ArgRefactor__RawAssignment_2 )
            // InternalRefactoringDefinition.g:355:2: rule__ArgRefactor__RawAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ArgRefactor__RawAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArgRefactorAccess().getRawAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgRefactor__Group__2__Impl"


    // $ANTLR start "rule__Refactorings__RefactoringsAssignment"
    // InternalRefactoringDefinition.g:372:1: rule__Refactorings__RefactoringsAssignment : ( rulerefactorMapEntry ) ;
    public final void rule__Refactorings__RefactoringsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:376:1: ( ( rulerefactorMapEntry ) )
            // InternalRefactoringDefinition.g:377:1: ( rulerefactorMapEntry )
            {
            // InternalRefactoringDefinition.g:377:1: ( rulerefactorMapEntry )
            // InternalRefactoringDefinition.g:378:1: rulerefactorMapEntry
            {
             before(grammarAccess.getRefactoringsAccess().getRefactoringsRefactorMapEntryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulerefactorMapEntry();

            state._fsp--;

             after(grammarAccess.getRefactoringsAccess().getRefactoringsRefactorMapEntryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refactorings__RefactoringsAssignment"


    // $ANTLR start "rule__RefactorMapEntry__KeyAssignment_0"
    // InternalRefactoringDefinition.g:387:1: rule__RefactorMapEntry__KeyAssignment_0 : ( RULE_VALUE ) ;
    public final void rule__RefactorMapEntry__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:391:1: ( ( RULE_VALUE ) )
            // InternalRefactoringDefinition.g:392:1: ( RULE_VALUE )
            {
            // InternalRefactoringDefinition.g:392:1: ( RULE_VALUE )
            // InternalRefactoringDefinition.g:393:1: RULE_VALUE
            {
             before(grammarAccess.getRefactorMapEntryAccess().getKeyVALUETerminalRuleCall_0_0()); 
            match(input,RULE_VALUE,FOLLOW_2); 
             after(grammarAccess.getRefactorMapEntryAccess().getKeyVALUETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefactorMapEntry__KeyAssignment_0"


    // $ANTLR start "rule__RefactorMapEntry__ValueAssignment_2"
    // InternalRefactoringDefinition.g:402:1: rule__RefactorMapEntry__ValueAssignment_2 : ( RULE_VALUE ) ;
    public final void rule__RefactorMapEntry__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:406:1: ( ( RULE_VALUE ) )
            // InternalRefactoringDefinition.g:407:1: ( RULE_VALUE )
            {
            // InternalRefactoringDefinition.g:407:1: ( RULE_VALUE )
            // InternalRefactoringDefinition.g:408:1: RULE_VALUE
            {
             before(grammarAccess.getRefactorMapEntryAccess().getValueVALUETerminalRuleCall_2_0()); 
            match(input,RULE_VALUE,FOLLOW_2); 
             after(grammarAccess.getRefactorMapEntryAccess().getValueVALUETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefactorMapEntry__ValueAssignment_2"


    // $ANTLR start "rule__ArgRefactor__MnemAssignment_0"
    // InternalRefactoringDefinition.g:419:1: rule__ArgRefactor__MnemAssignment_0 : ( RULE_VALUE ) ;
    public final void rule__ArgRefactor__MnemAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:423:1: ( ( RULE_VALUE ) )
            // InternalRefactoringDefinition.g:424:1: ( RULE_VALUE )
            {
            // InternalRefactoringDefinition.g:424:1: ( RULE_VALUE )
            // InternalRefactoringDefinition.g:425:1: RULE_VALUE
            {
             before(grammarAccess.getArgRefactorAccess().getMnemVALUETerminalRuleCall_0_0()); 
            match(input,RULE_VALUE,FOLLOW_2); 
             after(grammarAccess.getArgRefactorAccess().getMnemVALUETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgRefactor__MnemAssignment_0"


    // $ANTLR start "rule__ArgRefactor__RawAssignment_2"
    // InternalRefactoringDefinition.g:434:1: rule__ArgRefactor__RawAssignment_2 : ( RULE_VALUE ) ;
    public final void rule__ArgRefactor__RawAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRefactoringDefinition.g:438:1: ( ( RULE_VALUE ) )
            // InternalRefactoringDefinition.g:439:1: ( RULE_VALUE )
            {
            // InternalRefactoringDefinition.g:439:1: ( RULE_VALUE )
            // InternalRefactoringDefinition.g:440:1: RULE_VALUE
            {
             before(grammarAccess.getArgRefactorAccess().getRawVALUETerminalRuleCall_2_0()); 
            match(input,RULE_VALUE,FOLLOW_2); 
             after(grammarAccess.getArgRefactorAccess().getRawVALUETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgRefactor__RawAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});

}