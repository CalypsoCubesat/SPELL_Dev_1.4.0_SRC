package lu.ses.engineering.B7022SPELL.pages.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTmDisplayPagesLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_COMMENT_STRING=7;
    public static final int T__11=11;
    public static final int RULE_NUM=6;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_NL=4;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators

    public InternalTmDisplayPagesLexer() {;} 
    public InternalTmDisplayPagesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTmDisplayPagesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:11:7: ( '\"' )
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:11:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:12:7: ( '\\'' )
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:12:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:13:7: ( 'SPELL' )
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:13:9: 'SPELL'
            {
            match("SPELL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:14:7: ( 'CMD' )
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:14:9: 'CMD'
            {
            match("CMD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:15:7: ( 'TM' )
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:15:9: 'TM'
            {
            match("TM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:16:7: ( 'SCP1' )
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:16:9: 'SCP1'
            {
            match("SCP1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:17:7: ( 'SCP2' )
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:17:9: 'SCP2'
            {
            match("SCP2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "RULE_COMMENT_STRING"
    public final void mRULE_COMMENT_STRING() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:916:21: ( '#' (~ ( ( '\\r' | '\\n' ) ) )* )
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:916:23: '#' (~ ( ( '\\r' | '\\n' ) ) )*
            {
            match('#'); 
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:916:27: (~ ( ( '\\r' | '\\n' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:916:27: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:918:9: ( ( '^' )? ~ ( ( '0' .. '9' | '\\r' | '\\n' | '\\t' | ' ' | ',' ) ) (~ ( ( '\\t' | ' ' | ',' | '\\r' | '\\n' ) ) )* )
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:918:11: ( '^' )? ~ ( ( '0' .. '9' | '\\r' | '\\n' | '\\t' | ' ' | ',' ) ) (~ ( ( '\\t' | ' ' | ',' | '\\r' | '\\n' ) ) )*
            {
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:918:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>='\u0000' && LA2_1<='\b')||(LA2_1>='\u000B' && LA2_1<='\f')||(LA2_1>='\u000E' && LA2_1<='\u001F')||(LA2_1>='!' && LA2_1<='+')||(LA2_1>='-' && LA2_1<='/')||(LA2_1>=':' && LA2_1<='\uFFFF')) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:918:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:918:53: (~ ( ( '\\t' | ' ' | ',' | '\\r' | '\\n' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\b')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\u001F')||(LA3_0>='!' && LA3_0<='+')||(LA3_0>='-' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:918:53: ~ ( ( '\\t' | ' ' | ',' | '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_NUM"
    public final void mRULE_NUM() throws RecognitionException {
        try {
            int _type = RULE_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:920:10: ( ( '0' .. '9' )+ )
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:920:12: ( '0' .. '9' )+
            {
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:920:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:920:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUM"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:922:9: ( ( ' ' | '\\t' | ',' )+ )
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:922:11: ( ' ' | '\\t' | ',' )+
            {
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:922:11: ( ' ' | '\\t' | ',' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' '||LA5_0==',') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' '||input.LA(1)==',' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:924:9: ( ( '\\r' | '\\n' )+ )
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:924:11: ( '\\r' | '\\n' )+
            {
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:924:11: ( '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:926:16: ( . )
            // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:926:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | RULE_COMMENT_STRING | RULE_ID | RULE_NUM | RULE_WS | RULE_NL | RULE_ANY_OTHER )
        int alt7=13;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:52: RULE_COMMENT_STRING
                {
                mRULE_COMMENT_STRING(); 

                }
                break;
            case 9 :
                // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:72: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 10 :
                // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:80: RULE_NUM
                {
                mRULE_NUM(); 

                }
                break;
            case 11 :
                // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:89: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:97: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 13 :
                // ../lu.ses.engineering.B7022SPELL.TmDisplayPages/src-gen/lu/ses/engineering/B7022SPELL/pages/parser/antlr/internal/InternalTmDisplayPages.g:1:105: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\1\14\1\16\3\15\1\24\10\uffff\3\15\1\33\1\24\4\uffff\2"+
        "\15\1\37\1\uffff\1\15\1\41\1\42\1\uffff\1\43\3\uffff";
    static final String DFA7_eofS =
        "\44\uffff";
    static final String DFA7_minS =
        "\3\0\1\103\2\115\1\0\10\uffff\1\105\1\120\1\104\2\0\4\uffff\1\114"+
        "\1\61\1\0\1\uffff\1\114\2\0\1\uffff\1\0\3\uffff";
    static final String DFA7_maxS =
        "\3\uffff\1\120\2\115\1\uffff\10\uffff\1\105\1\120\1\104\2\uffff"+
        "\4\uffff\1\114\1\62\1\uffff\1\uffff\1\114\2\uffff\1\uffff\1\uffff"+
        "\3\uffff";
    static final String DFA7_acceptS =
        "\7\uffff\2\11\1\12\1\13\1\14\1\1\1\11\1\2\5\uffff\1\10\1\12\1\13"+
        "\1\14\3\uffff\1\5\3\uffff\1\4\1\uffff\1\6\1\7\1\3";
    static final String DFA7_specialS =
        "\1\1\1\2\1\5\3\uffff\1\11\13\uffff\1\10\1\3\6\uffff\1\7\2\uffff"+
        "\1\0\1\4\1\uffff\1\6\3\uffff}>";
    static final String[] DFA7_transitionS = {
            "\11\10\1\12\1\13\2\10\1\13\22\10\1\12\1\10\1\1\1\6\3\10\1\2"+
            "\4\10\1\12\3\10\12\11\11\10\1\4\17\10\1\3\1\5\11\10\1\7\uffa1"+
            "\10",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\13\15\1\uffff\uffd3"+
            "\15",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\13\15\1\uffff\uffd3"+
            "\15",
            "\1\20\14\uffff\1\17",
            "\1\21",
            "\1\22",
            "\11\23\2\uffff\2\23\1\uffff\22\23\1\uffff\13\23\1\uffff\uffd3"+
            "\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30",
            "\1\31",
            "\1\32",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\13\15\1\uffff\uffd3"+
            "\15",
            "\11\23\2\uffff\2\23\1\uffff\22\23\1\uffff\13\23\1\uffff\uffd3"+
            "\23",
            "",
            "",
            "",
            "",
            "\1\34",
            "\1\35\1\36",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\13\15\1\uffff\uffd3"+
            "\15",
            "",
            "\1\40",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\13\15\1\uffff\uffd3"+
            "\15",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\13\15\1\uffff\uffd3"+
            "\15",
            "",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\13\15\1\uffff\uffd3"+
            "\15",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    static class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | RULE_COMMENT_STRING | RULE_ID | RULE_NUM | RULE_WS | RULE_NL | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_29 = input.LA(1);

                        s = -1;
                        if ( ((LA7_29>='\u0000' && LA7_29<='\b')||(LA7_29>='\u000B' && LA7_29<='\f')||(LA7_29>='\u000E' && LA7_29<='\u001F')||(LA7_29>='!' && LA7_29<='+')||(LA7_29>='-' && LA7_29<='\uFFFF')) ) {s = 13;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_0 = input.LA(1);

                        s = -1;
                        if ( (LA7_0=='\"') ) {s = 1;}

                        else if ( (LA7_0=='\'') ) {s = 2;}

                        else if ( (LA7_0=='S') ) {s = 3;}

                        else if ( (LA7_0=='C') ) {s = 4;}

                        else if ( (LA7_0=='T') ) {s = 5;}

                        else if ( (LA7_0=='#') ) {s = 6;}

                        else if ( (LA7_0=='^') ) {s = 7;}

                        else if ( ((LA7_0>='\u0000' && LA7_0<='\b')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\u001F')||LA7_0=='!'||(LA7_0>='$' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='+')||(LA7_0>='-' && LA7_0<='/')||(LA7_0>=':' && LA7_0<='B')||(LA7_0>='D' && LA7_0<='R')||(LA7_0>='U' && LA7_0<=']')||(LA7_0>='_' && LA7_0<='\uFFFF')) ) {s = 8;}

                        else if ( ((LA7_0>='0' && LA7_0<='9')) ) {s = 9;}

                        else if ( (LA7_0=='\t'||LA7_0==' '||LA7_0==',') ) {s = 10;}

                        else if ( (LA7_0=='\n'||LA7_0=='\r') ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_1 = input.LA(1);

                        s = -1;
                        if ( ((LA7_1>='\u0000' && LA7_1<='\b')||(LA7_1>='\u000B' && LA7_1<='\f')||(LA7_1>='\u000E' && LA7_1<='\u001F')||(LA7_1>='!' && LA7_1<='+')||(LA7_1>='-' && LA7_1<='\uFFFF')) ) {s = 13;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_19 = input.LA(1);

                        s = -1;
                        if ( ((LA7_19>='\u0000' && LA7_19<='\b')||(LA7_19>='\u000B' && LA7_19<='\f')||(LA7_19>='\u000E' && LA7_19<='\u001F')||(LA7_19>='!' && LA7_19<='+')||(LA7_19>='-' && LA7_19<='\uFFFF')) ) {s = 19;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_30 = input.LA(1);

                        s = -1;
                        if ( ((LA7_30>='\u0000' && LA7_30<='\b')||(LA7_30>='\u000B' && LA7_30<='\f')||(LA7_30>='\u000E' && LA7_30<='\u001F')||(LA7_30>='!' && LA7_30<='+')||(LA7_30>='-' && LA7_30<='\uFFFF')) ) {s = 13;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_2 = input.LA(1);

                        s = -1;
                        if ( ((LA7_2>='\u0000' && LA7_2<='\b')||(LA7_2>='\u000B' && LA7_2<='\f')||(LA7_2>='\u000E' && LA7_2<='\u001F')||(LA7_2>='!' && LA7_2<='+')||(LA7_2>='-' && LA7_2<='\uFFFF')) ) {s = 13;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_32 = input.LA(1);

                        s = -1;
                        if ( ((LA7_32>='\u0000' && LA7_32<='\b')||(LA7_32>='\u000B' && LA7_32<='\f')||(LA7_32>='\u000E' && LA7_32<='\u001F')||(LA7_32>='!' && LA7_32<='+')||(LA7_32>='-' && LA7_32<='\uFFFF')) ) {s = 13;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_26 = input.LA(1);

                        s = -1;
                        if ( ((LA7_26>='\u0000' && LA7_26<='\b')||(LA7_26>='\u000B' && LA7_26<='\f')||(LA7_26>='\u000E' && LA7_26<='\u001F')||(LA7_26>='!' && LA7_26<='+')||(LA7_26>='-' && LA7_26<='\uFFFF')) ) {s = 13;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA7_18 = input.LA(1);

                        s = -1;
                        if ( ((LA7_18>='\u0000' && LA7_18<='\b')||(LA7_18>='\u000B' && LA7_18<='\f')||(LA7_18>='\u000E' && LA7_18<='\u001F')||(LA7_18>='!' && LA7_18<='+')||(LA7_18>='-' && LA7_18<='\uFFFF')) ) {s = 13;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA7_6 = input.LA(1);

                        s = -1;
                        if ( ((LA7_6>='\u0000' && LA7_6<='\b')||(LA7_6>='\u000B' && LA7_6<='\f')||(LA7_6>='\u000E' && LA7_6<='\u001F')||(LA7_6>='!' && LA7_6<='+')||(LA7_6>='-' && LA7_6<='\uFFFF')) ) {s = 19;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}