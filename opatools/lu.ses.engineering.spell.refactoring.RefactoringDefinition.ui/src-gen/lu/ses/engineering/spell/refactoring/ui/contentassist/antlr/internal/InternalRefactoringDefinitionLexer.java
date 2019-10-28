package lu.ses.engineering.spell.refactoring.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRefactoringDefinitionLexer extends Lexer {
    public static final int RULE_VALUE=6;
    public static final int RULE_WS=4;
    public static final int RULE_NL=5;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalRefactoringDefinitionLexer() {;} 
    public InternalRefactoringDefinitionLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRefactoringDefinitionLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRefactoringDefinition.g"; }

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRefactoringDefinition.g:450:9: ( ( '\\t' )+ )
            // InternalRefactoringDefinition.g:450:11: ( '\\t' )+
            {
            // InternalRefactoringDefinition.g:450:11: ( '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRefactoringDefinition.g:450:11: '\\t'
            	    {
            	    match('\t'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRefactoringDefinition.g:452:9: ( ( '\\r' | '\\n' )+ )
            // InternalRefactoringDefinition.g:452:11: ( '\\r' | '\\n' )+
            {
            // InternalRefactoringDefinition.g:452:11: ( '\\r' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\n'||LA2_0=='\r') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRefactoringDefinition.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_VALUE"
    public final void mRULE_VALUE() throws RecognitionException {
        try {
            int _type = RULE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRefactoringDefinition.g:454:12: ( (~ ( ( '\\t' | '\\r' | '\\n' ) ) )* )
            // InternalRefactoringDefinition.g:454:14: (~ ( ( '\\t' | '\\r' | '\\n' ) ) )*
            {
            // InternalRefactoringDefinition.g:454:14: (~ ( ( '\\t' | '\\r' | '\\n' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\b')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRefactoringDefinition.g:454:14: ~ ( ( '\\t' | '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VALUE"

    public void mTokens() throws RecognitionException {
        // InternalRefactoringDefinition.g:1:8: ( RULE_WS | RULE_NL | RULE_VALUE )
        int alt4=3;
        switch ( input.LA(1) ) {
        case '\t':
            {
            alt4=1;
            }
            break;
        case '\n':
        case '\r':
            {
            alt4=2;
            }
            break;
        default:
            alt4=3;}

        switch (alt4) {
            case 1 :
                // InternalRefactoringDefinition.g:1:10: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 2 :
                // InternalRefactoringDefinition.g:1:18: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 3 :
                // InternalRefactoringDefinition.g:1:26: RULE_VALUE
                {
                mRULE_VALUE(); 

                }
                break;

        }

    }


 

}