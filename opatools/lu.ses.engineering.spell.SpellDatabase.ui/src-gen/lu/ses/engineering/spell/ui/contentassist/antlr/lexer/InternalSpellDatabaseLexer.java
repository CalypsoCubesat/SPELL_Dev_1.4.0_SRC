package lu.ses.engineering.spell.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpellDatabaseLexer extends Lexer {
    public static final int RULE_BOOL_EXPR=25;
    public static final int RULE_STATE_EXPR=31;
    public static final int RULE_DOLLAR=35;
    public static final int FILE_HEADER=5;
    public static final int RULE_TM=24;
    public static final int END_FILE_HEADER=4;
    public static final int RULE_STRING=37;
    public static final int Backslash=14;
    public static final int RULE_SL_COMMENT=39;
    public static final int Comma=9;
    public static final int EqualsSign=12;
    public static final int LeftParenthesis=6;
    public static final int RULE_LAMBDA=23;
    public static final int RULE_TIME_EXPR=26;
    public static final int RULE_PLUS=19;
    public static final int Solidus=11;
    public static final int RightCurlyBracket=17;
    public static final int RULE_PAUSE=29;
    public static final int EOF=-1;
    public static final int Asterisk=8;
    public static final int RULE_BIN_HEX_OCT=36;
    public static final int RightSquareBracket=15;
    public static final int FullStop=10;
    public static final int RULE_ID=34;
    public static final int RULE_WS=21;
    public static final int RightParenthesis=7;
    public static final int LeftCurlyBracket=16;
    public static final int RULE_COLON=22;
    public static final int RULE_ANY_OTHER=41;
    public static final int RULE_CMD=30;
    public static final int RULE_MINUS=20;
    public static final int RULE_WAIT=28;
    public static final int RULE_INT=32;
    public static final int RULE_ML_COMMENT=38;
    public static final int RULE_FLOAT=33;
    public static final int LeftSquareBracket=13;
    public static final int RULE_ASTRIUM_COMMENT=18;
    public static final int RULE_NL=40;
    public static final int RULE_SPELL=27;

    // delegates
    // delegators

    public InternalSpellDatabaseLexer() {;} 
    public InternalSpellDatabaseLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpellDatabaseLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSpellDatabaseLexer.g"; }

    // $ANTLR start "END_FILE_HEADER"
    public final void mEND_FILE_HEADER() throws RecognitionException {
        try {
            int _type = END_FILE_HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:19:17: ( 'END_FILE_HEADER' )
            // InternalSpellDatabaseLexer.g:19:19: 'END_FILE_HEADER'
            {
            match("END_FILE_HEADER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END_FILE_HEADER"

    // $ANTLR start "FILE_HEADER"
    public final void mFILE_HEADER() throws RecognitionException {
        try {
            int _type = FILE_HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:21:13: ( 'FILE_HEADER' )
            // InternalSpellDatabaseLexer.g:21:15: 'FILE_HEADER'
            {
            match("FILE_HEADER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FILE_HEADER"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:23:17: ( '(' )
            // InternalSpellDatabaseLexer.g:23:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:25:18: ( ')' )
            // InternalSpellDatabaseLexer.g:25:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:27:10: ( '*' )
            // InternalSpellDatabaseLexer.g:27:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:29:7: ( ',' )
            // InternalSpellDatabaseLexer.g:29:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:31:10: ( '.' )
            // InternalSpellDatabaseLexer.g:31:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:33:9: ( '/' )
            // InternalSpellDatabaseLexer.g:33:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:35:12: ( '=' )
            // InternalSpellDatabaseLexer.g:35:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:37:19: ( '[' )
            // InternalSpellDatabaseLexer.g:37:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "Backslash"
    public final void mBackslash() throws RecognitionException {
        try {
            int _type = Backslash;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:39:11: ( '\\\\' )
            // InternalSpellDatabaseLexer.g:39:13: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Backslash"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:41:20: ( ']' )
            // InternalSpellDatabaseLexer.g:41:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:43:18: ( '{' )
            // InternalSpellDatabaseLexer.g:43:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:45:19: ( '}' )
            // InternalSpellDatabaseLexer.g:45:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_ASTRIUM_COMMENT"
    public final void mRULE_ASTRIUM_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ASTRIUM_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:49:22: ( '*' '*' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalSpellDatabaseLexer.g:49:24: '*' '*' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('*'); 
            match('*'); 
            // InternalSpellDatabaseLexer.g:49:32: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpellDatabaseLexer.g:49:32: ~ ( ( '\\n' | '\\r' ) )
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
    // $ANTLR end "RULE_ASTRIUM_COMMENT"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:51:11: ( '+' )
            // InternalSpellDatabaseLexer.g:51:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:53:12: ( '-' )
            // InternalSpellDatabaseLexer.g:53:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:55:9: ( ( ' ' | '\\t' )+ )
            // InternalSpellDatabaseLexer.g:55:11: ( ' ' | '\\t' )+
            {
            // InternalSpellDatabaseLexer.g:55:11: ( ' ' | '\\t' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSpellDatabaseLexer.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:57:12: ( ':' )
            // InternalSpellDatabaseLexer.g:57:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_LAMBDA"
    public final void mRULE_LAMBDA() throws RecognitionException {
        try {
            int _type = RULE_LAMBDA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:59:13: ( 'lambda' )
            // InternalSpellDatabaseLexer.g:59:15: 'lambda'
            {
            match("lambda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LAMBDA"

    // $ANTLR start "RULE_TM"
    public final void mRULE_TM() throws RecognitionException {
        try {
            int _type = RULE_TM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:61:9: ( 'TM' )
            // InternalSpellDatabaseLexer.g:61:11: 'TM'
            {
            match("TM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TM"

    // $ANTLR start "RULE_BOOL_EXPR"
    public final void mRULE_BOOL_EXPR() throws RecognitionException {
        try {
            int _type = RULE_BOOL_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:63:16: ( ( 'True' | 'False' | 'None' ) )
            // InternalSpellDatabaseLexer.g:63:18: ( 'True' | 'False' | 'None' )
            {
            // InternalSpellDatabaseLexer.g:63:18: ( 'True' | 'False' | 'None' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 'T':
                {
                alt3=1;
                }
                break;
            case 'F':
                {
                alt3=2;
                }
                break;
            case 'N':
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSpellDatabaseLexer.g:63:19: 'True'
                    {
                    match("True"); 


                    }
                    break;
                case 2 :
                    // InternalSpellDatabaseLexer.g:63:26: 'False'
                    {
                    match("False"); 


                    }
                    break;
                case 3 :
                    // InternalSpellDatabaseLexer.g:63:34: 'None'
                    {
                    match("None"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL_EXPR"

    // $ANTLR start "RULE_TIME_EXPR"
    public final void mRULE_TIME_EXPR() throws RecognitionException {
        try {
            int _type = RULE_TIME_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:65:16: ( ( 'SECOND' | 'MINUTE' | 'HOUR' | 'DAY' | 'WEEK' ) )
            // InternalSpellDatabaseLexer.g:65:18: ( 'SECOND' | 'MINUTE' | 'HOUR' | 'DAY' | 'WEEK' )
            {
            // InternalSpellDatabaseLexer.g:65:18: ( 'SECOND' | 'MINUTE' | 'HOUR' | 'DAY' | 'WEEK' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 'S':
                {
                alt4=1;
                }
                break;
            case 'M':
                {
                alt4=2;
                }
                break;
            case 'H':
                {
                alt4=3;
                }
                break;
            case 'D':
                {
                alt4=4;
                }
                break;
            case 'W':
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSpellDatabaseLexer.g:65:19: 'SECOND'
                    {
                    match("SECOND"); 


                    }
                    break;
                case 2 :
                    // InternalSpellDatabaseLexer.g:65:28: 'MINUTE'
                    {
                    match("MINUTE"); 


                    }
                    break;
                case 3 :
                    // InternalSpellDatabaseLexer.g:65:37: 'HOUR'
                    {
                    match("HOUR"); 


                    }
                    break;
                case 4 :
                    // InternalSpellDatabaseLexer.g:65:44: 'DAY'
                    {
                    match("DAY"); 


                    }
                    break;
                case 5 :
                    // InternalSpellDatabaseLexer.g:65:50: 'WEEK'
                    {
                    match("WEEK"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIME_EXPR"

    // $ANTLR start "RULE_SPELL"
    public final void mRULE_SPELL() throws RecognitionException {
        try {
            int _type = RULE_SPELL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:67:12: ( 'SPELL' )
            // InternalSpellDatabaseLexer.g:67:14: 'SPELL'
            {
            match("SPELL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPELL"

    // $ANTLR start "RULE_WAIT"
    public final void mRULE_WAIT() throws RecognitionException {
        try {
            int _type = RULE_WAIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:69:11: ( 'WAIT' )
            // InternalSpellDatabaseLexer.g:69:13: 'WAIT'
            {
            match("WAIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WAIT"

    // $ANTLR start "RULE_PAUSE"
    public final void mRULE_PAUSE() throws RecognitionException {
        try {
            int _type = RULE_PAUSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:71:12: ( 'PAUSE' )
            // InternalSpellDatabaseLexer.g:71:14: 'PAUSE'
            {
            match("PAUSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PAUSE"

    // $ANTLR start "RULE_CMD"
    public final void mRULE_CMD() throws RecognitionException {
        try {
            int _type = RULE_CMD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:73:10: ( 'CMD' )
            // InternalSpellDatabaseLexer.g:73:12: 'CMD'
            {
            match("CMD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CMD"

    // $ANTLR start "RULE_STATE_EXPR"
    public final void mRULE_STATE_EXPR() throws RecognitionException {
        try {
            int _type = RULE_STATE_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:75:17: ( ( 'STATE' | 'ENG' | 'RAW' ) )
            // InternalSpellDatabaseLexer.g:75:19: ( 'STATE' | 'ENG' | 'RAW' )
            {
            // InternalSpellDatabaseLexer.g:75:19: ( 'STATE' | 'ENG' | 'RAW' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 'S':
                {
                alt5=1;
                }
                break;
            case 'E':
                {
                alt5=2;
                }
                break;
            case 'R':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSpellDatabaseLexer.g:75:20: 'STATE'
                    {
                    match("STATE"); 


                    }
                    break;
                case 2 :
                    // InternalSpellDatabaseLexer.g:75:28: 'ENG'
                    {
                    match("ENG"); 


                    }
                    break;
                case 3 :
                    // InternalSpellDatabaseLexer.g:75:34: 'RAW'
                    {
                    match("RAW"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATE_EXPR"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:77:12: ( ( RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_INT )? )? | RULE_INT ( '.' RULE_INT )? ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_INT )? ) )
            // InternalSpellDatabaseLexer.g:77:14: ( RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_INT )? )? | RULE_INT ( '.' RULE_INT )? ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_INT )? )
            {
            // InternalSpellDatabaseLexer.g:77:14: ( RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_INT )? )? | RULE_INT ( '.' RULE_INT )? ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_INT )? )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalSpellDatabaseLexer.g:77:15: RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_INT )? )?
                    {
                    mRULE_INT(); 
                    match('.'); 
                    mRULE_INT(); 
                    // InternalSpellDatabaseLexer.g:77:37: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_INT )? )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSpellDatabaseLexer.g:77:38: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_INT )?
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalSpellDatabaseLexer.g:77:48: ( '+' | '-' )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0=='+'||LA6_0=='-') ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // InternalSpellDatabaseLexer.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // InternalSpellDatabaseLexer.g:77:59: ( RULE_INT )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalSpellDatabaseLexer.g:77:59: RULE_INT
                                    {
                                    mRULE_INT(); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalSpellDatabaseLexer.g:77:71: RULE_INT ( '.' RULE_INT )? ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_INT )?
                    {
                    mRULE_INT(); 
                    // InternalSpellDatabaseLexer.g:77:80: ( '.' RULE_INT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='.') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSpellDatabaseLexer.g:77:81: '.' RULE_INT
                            {
                            match('.'); 
                            mRULE_INT(); 

                            }
                            break;

                    }

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSpellDatabaseLexer.g:77:106: ( '+' | '-' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='+'||LA10_0=='-') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSpellDatabaseLexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalSpellDatabaseLexer.g:77:117: ( RULE_INT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSpellDatabaseLexer.g:77:117: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:79:10: ( ( '0' .. '9' )+ )
            // InternalSpellDatabaseLexer.g:79:12: ( '0' .. '9' )+
            {
            // InternalSpellDatabaseLexer.g:79:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSpellDatabaseLexer.g:79:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:81:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSpellDatabaseLexer.g:81:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSpellDatabaseLexer.g:81:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSpellDatabaseLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
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

    // $ANTLR start "RULE_DOLLAR"
    public final void mRULE_DOLLAR() throws RecognitionException {
        try {
            int _type = RULE_DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:83:13: ( '$' )
            // InternalSpellDatabaseLexer.g:83:15: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOLLAR"

    // $ANTLR start "RULE_BIN_HEX_OCT"
    public final void mRULE_BIN_HEX_OCT() throws RecognitionException {
        try {
            int _type = RULE_BIN_HEX_OCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:85:18: ( ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ | '0' ( 'b' | 'B' ) ( '0' .. '1' )+ | '0' ( 'o' | 'O' ) ( '0' .. '7' )+ ) )
            // InternalSpellDatabaseLexer.g:85:20: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ | '0' ( 'b' | 'B' ) ( '0' .. '1' )+ | '0' ( 'o' | 'O' ) ( '0' .. '7' )+ )
            {
            // InternalSpellDatabaseLexer.g:85:20: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ | '0' ( 'b' | 'B' ) ( '0' .. '1' )+ | '0' ( 'o' | 'O' ) ( '0' .. '7' )+ )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt18=1;
                    }
                    break;
                case 'B':
                case 'b':
                    {
                    alt18=2;
                    }
                    break;
                case 'O':
                case 'o':
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSpellDatabaseLexer.g:85:21: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSpellDatabaseLexer.g:85:35: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='F')||(LA15_0>='a' && LA15_0<='f')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalSpellDatabaseLexer.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalSpellDatabaseLexer.g:85:65: '0' ( 'b' | 'B' ) ( '0' .. '1' )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSpellDatabaseLexer.g:85:79: ( '0' .. '1' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='1')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSpellDatabaseLexer.g:85:80: '0' .. '1'
                    	    {
                    	    matchRange('0','1'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalSpellDatabaseLexer.g:85:91: '0' ( 'o' | 'O' ) ( '0' .. '7' )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSpellDatabaseLexer.g:85:105: ( '0' .. '7' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='7')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalSpellDatabaseLexer.g:85:106: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIN_HEX_OCT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:87:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\n' ) ) )* '\\'' ) )
            // InternalSpellDatabaseLexer.g:87:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\n' ) ) )* '\\'' )
            {
            // InternalSpellDatabaseLexer.g:87:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\n' ) ) )* '\\'' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\"') ) {
                alt21=1;
            }
            else if ( (LA21_0=='\'') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSpellDatabaseLexer.g:87:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSpellDatabaseLexer.g:87:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSpellDatabaseLexer.g:87:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSpellDatabaseLexer.g:87:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSpellDatabaseLexer.g:87:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\n' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSpellDatabaseLexer.g:87:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\n' ) ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSpellDatabaseLexer.g:87:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSpellDatabaseLexer.g:87:137: ~ ( ( '\\\\' | '\\'' | '\\n' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:89:17: ( ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' ) )
            // InternalSpellDatabaseLexer.g:89:19: ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            {
            // InternalSpellDatabaseLexer.g:89:19: ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\'') ) {
                alt24=1;
            }
            else if ( (LA24_0=='\"') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSpellDatabaseLexer.g:89:20: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
                    {
                    match("'''"); 

                    // InternalSpellDatabaseLexer.g:89:29: ( options {greedy=false; } : . )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0=='\'') ) {
                            int LA22_1 = input.LA(2);

                            if ( (LA22_1=='\'') ) {
                                int LA22_3 = input.LA(3);

                                if ( (LA22_3=='\'') ) {
                                    alt22=2;
                                }
                                else if ( ((LA22_3>='\u0000' && LA22_3<='&')||(LA22_3>='(' && LA22_3<='\uFFFF')) ) {
                                    alt22=1;
                                }


                            }
                            else if ( ((LA22_1>='\u0000' && LA22_1<='&')||(LA22_1>='(' && LA22_1<='\uFFFF')) ) {
                                alt22=1;
                            }


                        }
                        else if ( ((LA22_0>='\u0000' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='\uFFFF')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSpellDatabaseLexer.g:89:57: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match("'''"); 


                    }
                    break;
                case 2 :
                    // InternalSpellDatabaseLexer.g:89:70: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // InternalSpellDatabaseLexer.g:89:76: ( options {greedy=false; } : . )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\"') ) {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1=='\"') ) {
                                int LA23_3 = input.LA(3);

                                if ( (LA23_3=='\"') ) {
                                    alt23=2;
                                }
                                else if ( ((LA23_3>='\u0000' && LA23_3<='!')||(LA23_3>='#' && LA23_3<='\uFFFF')) ) {
                                    alt23=1;
                                }


                            }
                            else if ( ((LA23_1>='\u0000' && LA23_1<='!')||(LA23_1>='#' && LA23_1<='\uFFFF')) ) {
                                alt23=1;
                            }


                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='\uFFFF')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSpellDatabaseLexer.g:89:104: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:91:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalSpellDatabaseLexer.g:91:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalSpellDatabaseLexer.g:91:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSpellDatabaseLexer.g:91:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop25;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellDatabaseLexer.g:93:9: ( ( '\\r' | '\\n' )+ )
            // InternalSpellDatabaseLexer.g:93:11: ( '\\r' | '\\n' )+
            {
            // InternalSpellDatabaseLexer.g:93:11: ( '\\r' | '\\n' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\n'||LA26_0=='\r') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSpellDatabaseLexer.g:
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
            // InternalSpellDatabaseLexer.g:95:16: ( . )
            // InternalSpellDatabaseLexer.g:95:18: .
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
        // InternalSpellDatabaseLexer.g:1:8: ( END_FILE_HEADER | FILE_HEADER | LeftParenthesis | RightParenthesis | Asterisk | Comma | FullStop | Solidus | EqualsSign | LeftSquareBracket | Backslash | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_ASTRIUM_COMMENT | RULE_PLUS | RULE_MINUS | RULE_WS | RULE_COLON | RULE_LAMBDA | RULE_TM | RULE_BOOL_EXPR | RULE_TIME_EXPR | RULE_SPELL | RULE_WAIT | RULE_PAUSE | RULE_CMD | RULE_STATE_EXPR | RULE_FLOAT | RULE_INT | RULE_ID | RULE_DOLLAR | RULE_BIN_HEX_OCT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_NL | RULE_ANY_OTHER )
        int alt27=38;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // InternalSpellDatabaseLexer.g:1:10: END_FILE_HEADER
                {
                mEND_FILE_HEADER(); 

                }
                break;
            case 2 :
                // InternalSpellDatabaseLexer.g:1:26: FILE_HEADER
                {
                mFILE_HEADER(); 

                }
                break;
            case 3 :
                // InternalSpellDatabaseLexer.g:1:38: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 4 :
                // InternalSpellDatabaseLexer.g:1:54: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 5 :
                // InternalSpellDatabaseLexer.g:1:71: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 6 :
                // InternalSpellDatabaseLexer.g:1:80: Comma
                {
                mComma(); 

                }
                break;
            case 7 :
                // InternalSpellDatabaseLexer.g:1:86: FullStop
                {
                mFullStop(); 

                }
                break;
            case 8 :
                // InternalSpellDatabaseLexer.g:1:95: Solidus
                {
                mSolidus(); 

                }
                break;
            case 9 :
                // InternalSpellDatabaseLexer.g:1:103: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 10 :
                // InternalSpellDatabaseLexer.g:1:114: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 11 :
                // InternalSpellDatabaseLexer.g:1:132: Backslash
                {
                mBackslash(); 

                }
                break;
            case 12 :
                // InternalSpellDatabaseLexer.g:1:142: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 13 :
                // InternalSpellDatabaseLexer.g:1:161: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 14 :
                // InternalSpellDatabaseLexer.g:1:178: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 15 :
                // InternalSpellDatabaseLexer.g:1:196: RULE_ASTRIUM_COMMENT
                {
                mRULE_ASTRIUM_COMMENT(); 

                }
                break;
            case 16 :
                // InternalSpellDatabaseLexer.g:1:217: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 17 :
                // InternalSpellDatabaseLexer.g:1:227: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 18 :
                // InternalSpellDatabaseLexer.g:1:238: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // InternalSpellDatabaseLexer.g:1:246: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 20 :
                // InternalSpellDatabaseLexer.g:1:257: RULE_LAMBDA
                {
                mRULE_LAMBDA(); 

                }
                break;
            case 21 :
                // InternalSpellDatabaseLexer.g:1:269: RULE_TM
                {
                mRULE_TM(); 

                }
                break;
            case 22 :
                // InternalSpellDatabaseLexer.g:1:277: RULE_BOOL_EXPR
                {
                mRULE_BOOL_EXPR(); 

                }
                break;
            case 23 :
                // InternalSpellDatabaseLexer.g:1:292: RULE_TIME_EXPR
                {
                mRULE_TIME_EXPR(); 

                }
                break;
            case 24 :
                // InternalSpellDatabaseLexer.g:1:307: RULE_SPELL
                {
                mRULE_SPELL(); 

                }
                break;
            case 25 :
                // InternalSpellDatabaseLexer.g:1:318: RULE_WAIT
                {
                mRULE_WAIT(); 

                }
                break;
            case 26 :
                // InternalSpellDatabaseLexer.g:1:328: RULE_PAUSE
                {
                mRULE_PAUSE(); 

                }
                break;
            case 27 :
                // InternalSpellDatabaseLexer.g:1:339: RULE_CMD
                {
                mRULE_CMD(); 

                }
                break;
            case 28 :
                // InternalSpellDatabaseLexer.g:1:348: RULE_STATE_EXPR
                {
                mRULE_STATE_EXPR(); 

                }
                break;
            case 29 :
                // InternalSpellDatabaseLexer.g:1:364: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 30 :
                // InternalSpellDatabaseLexer.g:1:375: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // InternalSpellDatabaseLexer.g:1:384: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // InternalSpellDatabaseLexer.g:1:392: RULE_DOLLAR
                {
                mRULE_DOLLAR(); 

                }
                break;
            case 33 :
                // InternalSpellDatabaseLexer.g:1:404: RULE_BIN_HEX_OCT
                {
                mRULE_BIN_HEX_OCT(); 

                }
                break;
            case 34 :
                // InternalSpellDatabaseLexer.g:1:421: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalSpellDatabaseLexer.g:1:433: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // InternalSpellDatabaseLexer.g:1:449: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // InternalSpellDatabaseLexer.g:1:465: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 38 :
                // InternalSpellDatabaseLexer.g:1:473: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA12_eotS =
        "\4\uffff\1\5\2\uffff";
    static final String DFA12_eofS =
        "\7\uffff";
    static final String DFA12_minS =
        "\1\60\1\56\1\60\1\uffff\1\60\2\uffff";
    static final String DFA12_maxS =
        "\1\71\1\145\1\71\1\uffff\1\145\2\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\2\1\uffff\2\1";
    static final String DFA12_specialS =
        "\7\uffff}>";
    static final String[] DFA12_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "\12\4",
            "",
            "\12\4\13\uffff\1\6\37\uffff\1\6",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "77:14: ( RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_INT )? )? | RULE_INT ( '.' RULE_INT )? ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_INT )? )";
        }
    }
    static final String DFA27_eotS =
        "\1\uffff\2\50\2\uffff\1\56\15\uffff\13\50\1\114\2\uffff\1\114\2\46\3\uffff\1\50\1\uffff\2\50\21\uffff\1\50\1\132\15\50\3\uffff\1\114\1\uffff\1\121\1\uffff\1\121\2\uffff\1\50\1\152\3\50\1\uffff\7\50\1\165\3\50\1\171\1\152\1\uffff\1\50\1\uffff\3\50\2\176\4\50\1\165\1\uffff\1\165\1\u0083\1\50\1\uffff\2\50\1\176\1\50\1\uffff\1\50\1\u0089\1\152\1\50\1\uffff\1\u008b\2\50\1\u008e\1\165\1\uffff\1\165\1\uffff\2\50\1\uffff\7\50\1\u0098\1\50\1\uffff\2\50\1\u009c\1\uffff";
    static final String DFA27_eofS =
        "\u009d\uffff";
    static final String DFA27_minS =
        "\1\0\1\116\1\111\2\uffff\1\52\15\uffff\1\141\1\115\1\157\1\105\1\111\1\117\3\101\1\115\1\101\1\56\2\uffff\1\56\2\0\3\uffff\1\104\1\uffff\1\114\1\154\21\uffff\1\155\1\60\1\165\1\156\1\103\1\105\1\101\1\116\1\125\1\131\1\105\1\111\1\125\1\104\1\127\3\uffff\1\56\1\uffff\1\42\1\uffff\1\47\2\uffff\1\137\1\60\1\105\1\163\1\142\1\uffff\2\145\1\117\1\114\1\124\1\125\1\122\1\60\1\113\1\124\1\123\2\60\1\uffff\1\106\1\uffff\1\137\1\145\1\144\2\60\1\116\1\114\1\105\1\124\1\60\1\uffff\2\60\1\105\1\uffff\1\111\1\110\1\60\1\141\1\uffff\1\104\2\60\1\105\1\uffff\1\60\1\114\1\105\2\60\1\uffff\1\60\1\uffff\1\105\1\101\1\uffff\1\137\1\104\1\110\2\105\1\122\1\101\1\60\1\104\1\uffff\1\105\1\122\1\60\1\uffff";
    static final String DFA27_maxS =
        "\1\uffff\1\116\1\141\2\uffff\1\52\15\uffff\1\141\1\162\1\157\1\124\1\111\1\117\1\101\1\105\1\101\1\115\1\101\1\170\2\uffff\1\145\2\uffff\3\uffff\1\107\1\uffff\1\114\1\154\21\uffff\1\155\1\172\1\165\1\156\1\103\1\105\1\101\1\116\1\125\1\131\1\105\1\111\1\125\1\104\1\127\3\uffff\1\145\1\uffff\1\42\1\uffff\1\47\2\uffff\1\137\1\172\1\105\1\163\1\142\1\uffff\2\145\1\117\1\114\1\124\1\125\1\122\1\172\1\113\1\124\1\123\2\172\1\uffff\1\106\1\uffff\1\137\1\145\1\144\2\172\1\116\1\114\1\105\1\124\1\172\1\uffff\2\172\1\105\1\uffff\1\111\1\110\1\172\1\141\1\uffff\1\104\2\172\1\105\1\uffff\1\172\1\114\1\105\2\172\1\uffff\1\172\1\uffff\1\105\1\101\1\uffff\1\137\1\104\1\110\2\105\1\122\1\101\1\172\1\104\1\uffff\1\105\1\122\1\172\1\uffff";
    static final String DFA27_acceptS =
        "\3\uffff\1\3\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23\14\uffff\1\37\1\40\3\uffff\1\44\1\45\1\46\1\uffff\1\37\2\uffff\1\3\1\4\1\17\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23\17\uffff\1\41\1\36\1\35\1\uffff\1\40\1\uffff\1\42\1\uffff\1\44\1\45\5\uffff\1\25\15\uffff\1\43\1\uffff\1\34\12\uffff\1\27\3\uffff\1\33\4\uffff\1\26\4\uffff\1\31\5\uffff\1\30\1\uffff\1\32\2\uffff\1\24\11\uffff\1\2\3\uffff\1\1";
    static final String DFA27_specialS =
        "\1\0\41\uffff\1\2\1\1\171\uffff}>";
    static final String[] DFA27_transitionS = {
            "\11\46\1\21\1\45\2\46\1\45\22\46\1\21\1\46\1\42\1\44\1\40\2\46\1\43\1\3\1\4\1\5\1\17\1\6\1\20\1\7\1\10\1\36\11\41\1\22\2\46\1\11\3\46\2\37\1\34\1\31\1\1\1\2\1\37\1\30\4\37\1\27\1\25\1\37\1\33\1\37\1\35\1\26\1\24\2\37\1\32\3\37\1\12\1\13\1\14\1\46\1\37\1\46\13\37\1\23\16\37\1\15\1\46\1\16\uff82\46",
            "\1\47",
            "\1\51\27\uffff\1\52",
            "",
            "",
            "\1\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "\1\75\44\uffff\1\76",
            "\1\77",
            "\1\100\12\uffff\1\101\3\uffff\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\107\3\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\115\1\uffff\12\116\10\uffff\1\113\2\uffff\1\115\11\uffff\1\113\10\uffff\1\113\11\uffff\1\113\2\uffff\1\115\11\uffff\1\113\10\uffff\1\113",
            "",
            "",
            "\1\115\1\uffff\12\116\13\uffff\1\115\37\uffff\1\115",
            "\42\121\1\120\uffdd\121",
            "\12\121\1\uffff\34\121\1\122\uffd8\121",
            "",
            "",
            "",
            "\1\125\2\uffff\1\126",
            "",
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\131",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "",
            "",
            "\1\115\1\uffff\12\116\13\uffff\1\115\37\uffff\1\115",
            "",
            "\1\150",
            "",
            "\1\150",
            "",
            "",
            "\1\151",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\172",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0087",
            "",
            "\1\u0088",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u008a",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u008c",
            "\1\u008d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0099",
            "",
            "\1\u009a",
            "\1\u009b",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( END_FILE_HEADER | FILE_HEADER | LeftParenthesis | RightParenthesis | Asterisk | Comma | FullStop | Solidus | EqualsSign | LeftSquareBracket | Backslash | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_ASTRIUM_COMMENT | RULE_PLUS | RULE_MINUS | RULE_WS | RULE_COLON | RULE_LAMBDA | RULE_TM | RULE_BOOL_EXPR | RULE_TIME_EXPR | RULE_SPELL | RULE_WAIT | RULE_PAUSE | RULE_CMD | RULE_STATE_EXPR | RULE_FLOAT | RULE_INT | RULE_ID | RULE_DOLLAR | RULE_BIN_HEX_OCT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_NL | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                        s = -1;
                        if ( (LA27_0=='E') ) {s = 1;}

                        else if ( (LA27_0=='F') ) {s = 2;}

                        else if ( (LA27_0=='(') ) {s = 3;}

                        else if ( (LA27_0==')') ) {s = 4;}

                        else if ( (LA27_0=='*') ) {s = 5;}

                        else if ( (LA27_0==',') ) {s = 6;}

                        else if ( (LA27_0=='.') ) {s = 7;}

                        else if ( (LA27_0=='/') ) {s = 8;}

                        else if ( (LA27_0=='=') ) {s = 9;}

                        else if ( (LA27_0=='[') ) {s = 10;}

                        else if ( (LA27_0=='\\') ) {s = 11;}

                        else if ( (LA27_0==']') ) {s = 12;}

                        else if ( (LA27_0=='{') ) {s = 13;}

                        else if ( (LA27_0=='}') ) {s = 14;}

                        else if ( (LA27_0=='+') ) {s = 15;}

                        else if ( (LA27_0=='-') ) {s = 16;}

                        else if ( (LA27_0=='\t'||LA27_0==' ') ) {s = 17;}

                        else if ( (LA27_0==':') ) {s = 18;}

                        else if ( (LA27_0=='l') ) {s = 19;}

                        else if ( (LA27_0=='T') ) {s = 20;}

                        else if ( (LA27_0=='N') ) {s = 21;}

                        else if ( (LA27_0=='S') ) {s = 22;}

                        else if ( (LA27_0=='M') ) {s = 23;}

                        else if ( (LA27_0=='H') ) {s = 24;}

                        else if ( (LA27_0=='D') ) {s = 25;}

                        else if ( (LA27_0=='W') ) {s = 26;}

                        else if ( (LA27_0=='P') ) {s = 27;}

                        else if ( (LA27_0=='C') ) {s = 28;}

                        else if ( (LA27_0=='R') ) {s = 29;}

                        else if ( (LA27_0=='0') ) {s = 30;}

                        else if ( ((LA27_0>='A' && LA27_0<='B')||LA27_0=='G'||(LA27_0>='I' && LA27_0<='L')||LA27_0=='O'||LA27_0=='Q'||(LA27_0>='U' && LA27_0<='V')||(LA27_0>='X' && LA27_0<='Z')||LA27_0=='_'||(LA27_0>='a' && LA27_0<='k')||(LA27_0>='m' && LA27_0<='z')) ) {s = 31;}

                        else if ( (LA27_0=='$') ) {s = 32;}

                        else if ( ((LA27_0>='1' && LA27_0<='9')) ) {s = 33;}

                        else if ( (LA27_0=='\"') ) {s = 34;}

                        else if ( (LA27_0=='\'') ) {s = 35;}

                        else if ( (LA27_0=='#') ) {s = 36;}

                        else if ( (LA27_0=='\n'||LA27_0=='\r') ) {s = 37;}

                        else if ( ((LA27_0>='\u0000' && LA27_0<='\b')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\u001F')||LA27_0=='!'||(LA27_0>='%' && LA27_0<='&')||(LA27_0>=';' && LA27_0<='<')||(LA27_0>='>' && LA27_0<='@')||LA27_0=='^'||LA27_0=='`'||LA27_0=='|'||(LA27_0>='~' && LA27_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_35 = input.LA(1);

                        s = -1;
                        if ( (LA27_35=='\'') ) {s = 82;}

                        else if ( ((LA27_35>='\u0000' && LA27_35<='\t')||(LA27_35>='\u000B' && LA27_35<='&')||(LA27_35>='(' && LA27_35<='\uFFFF')) ) {s = 81;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_34 = input.LA(1);

                        s = -1;
                        if ( (LA27_34=='\"') ) {s = 80;}

                        else if ( ((LA27_34>='\u0000' && LA27_34<='!')||(LA27_34>='#' && LA27_34<='\uFFFF')) ) {s = 81;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}