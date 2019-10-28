package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReportGrammarLexer extends Lexer {
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

    public InternalReportGrammarLexer() {;} 
    public InternalReportGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalReportGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:11:6: ( 'Procedure' )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:11:8: 'Procedure'
            {
            match("Procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:12:7: ( ':' )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:12:9: ':'
            {
            match(':'); 

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
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:13:7: ( 'procedure calls the procedures:' )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:13:9: 'procedure calls the procedures:'
            {
            match("procedure calls the procedures:"); 


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
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:14:7: ( 'procedure is called by:' )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:14:9: 'procedure is called by:'
            {
            match("procedure is called by:"); 


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
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:15:7: ( 'No Source found for' )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:15:9: 'No Source found for'
            {
            match("No Source found for"); 


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
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:16:7: ( 'is called by:' )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:16:9: 'is called by:'
            {
            match("is called by:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:408:9: ( (~ ( ( '\\t' | ' ' | '\\r' | '\\n' ) ) )+ )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:408:11: (~ ( ( '\\t' | ' ' | '\\r' | '\\n' ) ) )+
            {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:408:11: (~ ( ( '\\t' | ' ' | '\\r' | '\\n' ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||(LA1_0>='!' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:408:11: ~ ( ( '\\t' | ' ' | '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_TAB"
    public final void mRULE_TAB() throws RecognitionException {
        try {
            int _type = RULE_TAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:410:10: ( ( '\\t' )+ )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:410:12: ( '\\t' )+
            {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:410:12: ( '\\t' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:410:12: '\\t'
            	    {
            	    match('\t'); 

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
    // $ANTLR end "RULE_TAB"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:412:9: ( ( ' ' )+ )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:412:11: ( ' ' )+
            {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:412:11: ( ' ' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:412:11: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:414:9: ( ( '\\r' | '\\n' )+ )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:414:11: ( '\\r' | '\\n' )+
            {
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:414:11: ( '\\r' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:
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
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:416:16: ( . )
            // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:416:18: .
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
        // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | RULE_ID | RULE_TAB | RULE_WS | RULE_NL | RULE_ANY_OTHER )
        int alt5=11;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:1:45: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 8 :
                // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:1:53: RULE_TAB
                {
                mRULE_TAB(); 

                }
                break;
            case 9 :
                // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:1:62: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 10 :
                // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:1:70: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 11 :
                // ../lu.ses.engineering.B7022SPELL.WorkspaceGrammar/src-gen/lu/ses/engineering/B7022SPELL/WorkspaceGrammar/parser/antlr/internal/InternalReportGrammar.g:1:78: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\13\1\14\3\13\4\uffff\1\13\2\uffff\3\13\3\uffff\2\13"+
        "\2\uffff\12\13\1\43\1\13\4\uffff";
    static final String DFA5_eofS =
        "\47\uffff";
    static final String DFA5_minS =
        "\1\0\1\162\1\0\1\162\1\157\1\163\4\uffff\1\157\2\uffff\1\157\2"+
        "\40\3\uffff\2\143\2\uffff\2\145\2\144\2\165\2\162\2\145\1\0\1\40"+
        "\1\uffff\1\143\2\uffff";
    static final String DFA5_maxS =
        "\1\uffff\1\162\1\uffff\1\162\1\157\1\163\4\uffff\1\157\2\uffff"+
        "\1\157\2\40\3\uffff\2\143\2\uffff\2\145\2\144\2\165\2\162\2\145"+
        "\1\uffff\1\40\1\uffff\1\151\2\uffff";
    static final String DFA5_acceptS =
        "\6\uffff\1\7\1\10\1\11\1\12\1\uffff\1\7\1\2\3\uffff\1\10\1\11\1"+
        "\12\2\uffff\1\5\1\6\14\uffff\1\1\1\uffff\1\3\1\4";
    static final String DFA5_specialS =
        "\1\0\1\uffff\1\2\36\uffff\1\1\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\11\6\1\7\1\11\2\6\1\11\22\6\1\10\31\6\1\2\23\6\1\4\1\6\1\1"+
            "\30\6\1\5\6\6\1\3\uff8f\6",
            "\1\12",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\uffdf\13",
            "\1\15",
            "\1\16",
            "\1\17",
            "",
            "",
            "",
            "",
            "\1\23",
            "",
            "",
            "\1\24",
            "\1\25",
            "\1\26",
            "",
            "",
            "",
            "\1\27",
            "\1\30",
            "",
            "",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\uffdf\13",
            "\1\44",
            "",
            "\1\45\5\uffff\1\46",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | RULE_ID | RULE_TAB | RULE_WS | RULE_NL | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='P') ) {s = 1;}

                        else if ( (LA5_0==':') ) {s = 2;}

                        else if ( (LA5_0=='p') ) {s = 3;}

                        else if ( (LA5_0=='N') ) {s = 4;}

                        else if ( (LA5_0=='i') ) {s = 5;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\b')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u001F')||(LA5_0>='!' && LA5_0<='9')||(LA5_0>=';' && LA5_0<='M')||LA5_0=='O'||(LA5_0>='Q' && LA5_0<='h')||(LA5_0>='j' && LA5_0<='o')||(LA5_0>='q' && LA5_0<='\uFFFF')) ) {s = 6;}

                        else if ( (LA5_0=='\t') ) {s = 7;}

                        else if ( (LA5_0==' ') ) {s = 8;}

                        else if ( (LA5_0=='\n'||LA5_0=='\r') ) {s = 9;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_33 = input.LA(1);

                        s = -1;
                        if ( ((LA5_33>='\u0000' && LA5_33<='\b')||(LA5_33>='\u000B' && LA5_33<='\f')||(LA5_33>='\u000E' && LA5_33<='\u001F')||(LA5_33>='!' && LA5_33<='\uFFFF')) ) {s = 11;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_2 = input.LA(1);

                        s = -1;
                        if ( ((LA5_2>='\u0000' && LA5_2<='\b')||(LA5_2>='\u000B' && LA5_2<='\f')||(LA5_2>='\u000E' && LA5_2<='\u001F')||(LA5_2>='!' && LA5_2<='\uFFFF')) ) {s = 11;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}