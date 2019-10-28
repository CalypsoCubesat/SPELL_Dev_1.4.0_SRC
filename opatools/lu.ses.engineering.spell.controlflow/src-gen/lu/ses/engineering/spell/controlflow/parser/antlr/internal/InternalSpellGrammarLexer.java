package lu.ses.engineering.spell.controlflow.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpellGrammarLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_ENDWITH=9;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ENDIF=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_ENDFOR=7;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int RULE_ENDTRY=8;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_NAME_TERMINAL=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_ENDWHILE=6;
    public static final int RULE_SL_COMMENT=16;
    public static final int RULE_ENDDEF=4;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int RULE_ENDCLASS=12;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_NUMBER=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalSpellGrammarLexer() {;} 
    public InternalSpellGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpellGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSpellGrammar.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:11:7: ( '@' )
            // InternalSpellGrammar.g:11:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:12:7: ( '(' )
            // InternalSpellGrammar.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:13:7: ( ')' )
            // InternalSpellGrammar.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:14:7: ( 'def' )
            // InternalSpellGrammar.g:14:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:15:7: ( ':' )
            // InternalSpellGrammar.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:16:7: ( ',' )
            // InternalSpellGrammar.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:17:7: ( '=' )
            // InternalSpellGrammar.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:18:7: ( '*' )
            // InternalSpellGrammar.g:18:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:19:7: ( '**' )
            // InternalSpellGrammar.g:19:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:20:7: ( ';' )
            // InternalSpellGrammar.g:20:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:21:7: ( '+' )
            // InternalSpellGrammar.g:21:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:22:7: ( '-=' )
            // InternalSpellGrammar.g:22:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:23:7: ( '*=' )
            // InternalSpellGrammar.g:23:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:24:7: ( '/=' )
            // InternalSpellGrammar.g:24:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:25:7: ( '%=' )
            // InternalSpellGrammar.g:25:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:26:7: ( '&=' )
            // InternalSpellGrammar.g:26:9: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:27:7: ( '|=' )
            // InternalSpellGrammar.g:27:9: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:28:7: ( '^=' )
            // InternalSpellGrammar.g:28:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:29:7: ( '<<=' )
            // InternalSpellGrammar.g:29:9: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:30:7: ( '>>=' )
            // InternalSpellGrammar.g:30:9: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:31:7: ( '**=' )
            // InternalSpellGrammar.g:31:9: '**='
            {
            match("**="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:32:7: ( '//=' )
            // InternalSpellGrammar.g:32:9: '//='
            {
            match("//="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:33:7: ( 'del' )
            // InternalSpellGrammar.g:33:9: 'del'
            {
            match("del"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:34:7: ( 'pass' )
            // InternalSpellGrammar.g:34:9: 'pass'
            {
            match("pass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:35:7: ( 'break' )
            // InternalSpellGrammar.g:35:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:36:7: ( 'continue' )
            // InternalSpellGrammar.g:36:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:37:7: ( 'return' )
            // InternalSpellGrammar.g:37:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:38:7: ( 'raise' )
            // InternalSpellGrammar.g:38:9: 'raise'
            {
            match("raise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:39:7: ( 'import' )
            // InternalSpellGrammar.g:39:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:40:7: ( 'from' )
            // InternalSpellGrammar.g:40:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:41:7: ( '.' )
            // InternalSpellGrammar.g:41:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:42:7: ( 'as' )
            // InternalSpellGrammar.g:42:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:43:7: ( 'global' )
            // InternalSpellGrammar.g:43:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:44:7: ( 'exec' )
            // InternalSpellGrammar.g:44:9: 'exec'
            {
            match("exec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:45:7: ( 'in' )
            // InternalSpellGrammar.g:45:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:46:7: ( 'assert' )
            // InternalSpellGrammar.g:46:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:47:7: ( 'elif' )
            // InternalSpellGrammar.g:47:9: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:48:7: ( 'if' )
            // InternalSpellGrammar.g:48:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:49:7: ( 'else' )
            // InternalSpellGrammar.g:49:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:50:7: ( 'while' )
            // InternalSpellGrammar.g:50:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:51:7: ( 'for' )
            // InternalSpellGrammar.g:51:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:52:7: ( 'try' )
            // InternalSpellGrammar.g:52:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:53:7: ( 'finally' )
            // InternalSpellGrammar.g:53:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:54:7: ( 'with' )
            // InternalSpellGrammar.g:54:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:55:7: ( 'except' )
            // InternalSpellGrammar.g:55:9: 'except'
            {
            match("except"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:56:7: ( 'or' )
            // InternalSpellGrammar.g:56:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:57:7: ( 'and' )
            // InternalSpellGrammar.g:57:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:58:7: ( 'not' )
            // InternalSpellGrammar.g:58:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:59:7: ( '<' )
            // InternalSpellGrammar.g:59:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:60:7: ( '>' )
            // InternalSpellGrammar.g:60:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:61:7: ( '==' )
            // InternalSpellGrammar.g:61:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:62:7: ( '>=' )
            // InternalSpellGrammar.g:62:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:63:7: ( '<=' )
            // InternalSpellGrammar.g:63:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:64:7: ( '<>' )
            // InternalSpellGrammar.g:64:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:65:7: ( '!=' )
            // InternalSpellGrammar.g:65:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:66:7: ( 'is' )
            // InternalSpellGrammar.g:66:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:67:7: ( '|' )
            // InternalSpellGrammar.g:67:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:68:7: ( '^' )
            // InternalSpellGrammar.g:68:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:69:7: ( '&' )
            // InternalSpellGrammar.g:69:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:70:7: ( '<<' )
            // InternalSpellGrammar.g:70:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:71:7: ( '>>' )
            // InternalSpellGrammar.g:71:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:72:7: ( '-' )
            // InternalSpellGrammar.g:72:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:73:7: ( '/' )
            // InternalSpellGrammar.g:73:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:74:7: ( '%' )
            // InternalSpellGrammar.g:74:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:75:7: ( '//' )
            // InternalSpellGrammar.g:75:9: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:76:7: ( '~' )
            // InternalSpellGrammar.g:76:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:77:7: ( 'Step' )
            // InternalSpellGrammar.g:77:9: 'Step'
            {
            match("Step"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:78:7: ( 'DisplayStep' )
            // InternalSpellGrammar.g:78:9: 'DisplayStep'
            {
            match("DisplayStep"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:79:7: ( 'ShowTM' )
            // InternalSpellGrammar.g:79:9: 'ShowTM'
            {
            match("ShowTM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:80:7: ( 'Send' )
            // InternalSpellGrammar.g:80:9: 'Send'
            {
            match("Send"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:81:7: ( 'BuildTC' )
            // InternalSpellGrammar.g:81:9: 'BuildTC'
            {
            match("BuildTC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:82:7: ( 'SetLimits' )
            // InternalSpellGrammar.g:82:9: 'SetLimits'
            {
            match("SetLimits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:83:7: ( 'GetLimits' )
            // InternalSpellGrammar.g:83:9: 'GetLimits'
            {
            match("GetLimits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:84:7: ( 'GetTM' )
            // InternalSpellGrammar.g:84:9: 'GetTM'
            {
            match("GetTM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:85:7: ( 'Goto' )
            // InternalSpellGrammar.g:85:9: 'Goto'
            {
            match("Goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:86:7: ( 'Verify' )
            // InternalSpellGrammar.g:86:9: 'Verify'
            {
            match("Verify"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:87:7: ( 'WaitFor' )
            // InternalSpellGrammar.g:87:9: 'WaitFor'
            {
            match("WaitFor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:88:7: ( 'ChangeLanguageConfig' )
            // InternalSpellGrammar.g:88:9: 'ChangeLanguageConfig'
            {
            match("ChangeLanguageConfig"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:89:7: ( '[' )
            // InternalSpellGrammar.g:89:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:90:7: ( ']' )
            // InternalSpellGrammar.g:90:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:91:7: ( '{' )
            // InternalSpellGrammar.g:91:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:92:7: ( '}' )
            // InternalSpellGrammar.g:92:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:93:8: ( '`' )
            // InternalSpellGrammar.g:93:10: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:94:8: ( 'lambda' )
            // InternalSpellGrammar.g:94:10: 'lambda'
            {
            match("lambda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:95:8: ( 'class' )
            // InternalSpellGrammar.g:95:10: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:96:8: ( 'yield' )
            // InternalSpellGrammar.g:96:10: 'yield'
            {
            match("yield"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:97:8: ( '\\\\' )
            // InternalSpellGrammar.g:97:10: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "RULE_ENDIF"
    public final void mRULE_ENDIF() throws RecognitionException {
        try {
            int _type = RULE_ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:8092:12: ( '#' 'ENDIF' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalSpellGrammar.g:8092:14: '#' 'ENDIF' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            match("ENDIF"); 

            // InternalSpellGrammar.g:8092:26: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpellGrammar.g:8092:26: ~ ( ( '\\n' | '\\r' ) )
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
    // $ANTLR end "RULE_ENDIF"

    // $ANTLR start "RULE_ENDWHILE"
    public final void mRULE_ENDWHILE() throws RecognitionException {
        try {
            int _type = RULE_ENDWHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:8094:15: ( '#' 'ENDWHILE' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalSpellGrammar.g:8094:17: '#' 'ENDWHILE' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            match("ENDWHILE"); 

            // InternalSpellGrammar.g:8094:32: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSpellGrammar.g:8094:32: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENDWHILE"

    // $ANTLR start "RULE_ENDFOR"
    public final void mRULE_ENDFOR() throws RecognitionException {
        try {
            int _type = RULE_ENDFOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:8096:13: ( '#' 'ENDFOR' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalSpellGrammar.g:8096:15: '#' 'ENDFOR' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            match("ENDFOR"); 

            // InternalSpellGrammar.g:8096:28: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSpellGrammar.g:8096:28: ~ ( ( '\\n' | '\\r' ) )
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
    // $ANTLR end "RULE_ENDFOR"

    // $ANTLR start "RULE_ENDWITH"
    public final void mRULE_ENDWITH() throws RecognitionException {
        try {
            int _type = RULE_ENDWITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:8098:14: ( '#' 'ENDWITH' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalSpellGrammar.g:8098:16: '#' 'ENDWITH' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            match("ENDWITH"); 

            // InternalSpellGrammar.g:8098:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSpellGrammar.g:8098:30: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENDWITH"

    // $ANTLR start "RULE_ENDDEF"
    public final void mRULE_ENDDEF() throws RecognitionException {
        try {
            int _type = RULE_ENDDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:8100:13: ( '#' 'ENDDEF' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalSpellGrammar.g:8100:15: '#' 'ENDDEF' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            match("ENDDEF"); 

            // InternalSpellGrammar.g:8100:28: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSpellGrammar.g:8100:28: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENDDEF"

    // $ANTLR start "RULE_ENDTRY"
    public final void mRULE_ENDTRY() throws RecognitionException {
        try {
            int _type = RULE_ENDTRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:8102:13: ( '#' 'ENDTRY' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalSpellGrammar.g:8102:15: '#' 'ENDTRY' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            match("ENDTRY"); 

            // InternalSpellGrammar.g:8102:28: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSpellGrammar.g:8102:28: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENDTRY"

    // $ANTLR start "RULE_ENDCLASS"
    public final void mRULE_ENDCLASS() throws RecognitionException {
        try {
            int _type = RULE_ENDCLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:8104:15: ( '#' 'ENDCLASS' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalSpellGrammar.g:8104:17: '#' 'ENDCLASS' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            match("ENDCLASS"); 

            // InternalSpellGrammar.g:8104:32: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSpellGrammar.g:8104:32: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENDCLASS"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:8106:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSpellGrammar.g:8106:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSpellGrammar.g:8106:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpellGrammar.g:8106:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSpellGrammar.g:8106:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSpellGrammar.g:8106:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalSpellGrammar.g:8106:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSpellGrammar.g:8106:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSpellGrammar.g:8106:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSpellGrammar.g:8106:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalSpellGrammar.g:8106:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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
            // InternalSpellGrammar.g:8108:17: ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' )
            // InternalSpellGrammar.g:8108:19: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
            {
            match("'''"); 

            // InternalSpellGrammar.g:8108:28: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\'') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='\'') ) {
                        int LA11_3 = input.LA(3);

                        if ( (LA11_3=='\'') ) {
                            alt11=2;
                        }
                        else if ( ((LA11_3>='\u0000' && LA11_3<='&')||(LA11_3>='(' && LA11_3<='\uFFFF')) ) {
                            alt11=1;
                        }


                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='&')||(LA11_1>='(' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSpellGrammar.g:8108:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("'''"); 


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
            // InternalSpellGrammar.g:8110:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalSpellGrammar.g:8110:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalSpellGrammar.g:8110:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSpellGrammar.g:8110:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:8112:9: ( ( ' ' | '\\t' | ( '\\\\' )? ( '\\r' )? '\\n' )+ )
            // InternalSpellGrammar.g:8112:11: ( ' ' | '\\t' | ( '\\\\' )? ( '\\r' )? '\\n' )+
            {
            // InternalSpellGrammar.g:8112:11: ( ' ' | '\\t' | ( '\\\\' )? ( '\\r' )? '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt15=1;
                    }
                    break;
                case '\t':
                    {
                    alt15=2;
                    }
                    break;
                case '\n':
                case '\r':
                case '\\':
                    {
                    alt15=3;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalSpellGrammar.g:8112:12: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // InternalSpellGrammar.g:8112:16: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalSpellGrammar.g:8112:21: ( '\\\\' )? ( '\\r' )? '\\n'
            	    {
            	    // InternalSpellGrammar.g:8112:21: ( '\\\\' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0=='\\') ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalSpellGrammar.g:8112:21: '\\\\'
            	            {
            	            match('\\'); 

            	            }
            	            break;

            	    }

            	    // InternalSpellGrammar.g:8112:27: ( '\\r' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0=='\r') ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalSpellGrammar.g:8112:27: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_NAME_TERMINAL"
    public final void mRULE_NAME_TERMINAL() throws RecognitionException {
        try {
            int _type = RULE_NAME_TERMINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:8114:20: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSpellGrammar.g:8114:22: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSpellGrammar.g:8114:46: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSpellGrammar.g:
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
            	    break loop16;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME_TERMINAL"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:8116:13: ( ( '0' .. '9' )+ ( ( 'x' | 'X' | 'b' | 'O' | 'o' | 'B' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )? ( '.' ( '0' .. '9' )+ )? ( ( 'E' | 'e' ) ( '-' | '+' )? ( '0' .. '9' )+ )? ( 'L' )? )
            // InternalSpellGrammar.g:8116:15: ( '0' .. '9' )+ ( ( 'x' | 'X' | 'b' | 'O' | 'o' | 'B' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )? ( '.' ( '0' .. '9' )+ )? ( ( 'E' | 'e' ) ( '-' | '+' )? ( '0' .. '9' )+ )? ( 'L' )?
            {
            // InternalSpellGrammar.g:8116:15: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSpellGrammar.g:8116:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            // InternalSpellGrammar.g:8116:27: ( ( 'x' | 'X' | 'b' | 'O' | 'o' | 'B' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='B'||LA19_0=='O'||LA19_0=='X'||LA19_0=='b'||LA19_0=='o'||LA19_0=='x') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSpellGrammar.g:8116:28: ( 'x' | 'X' | 'b' | 'O' | 'o' | 'B' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='O'||input.LA(1)=='X'||input.LA(1)=='b'||input.LA(1)=='o'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSpellGrammar.g:8116:54: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='E'||LA18_0=='e') ) {
                            int LA18_2 = input.LA(2);

                            if ( ((LA18_2>='0' && LA18_2<='9')) ) {
                                alt18=1;
                            }

                            else {
                                alt18=1;
                            }

                        }
                        else if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='D')||LA18_0=='F'||(LA18_0>='a' && LA18_0<='d')||LA18_0=='f') ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSpellGrammar.g:
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
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;

            }

            // InternalSpellGrammar.g:8116:86: ( '.' ( '0' .. '9' )+ )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='.') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSpellGrammar.g:8116:87: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalSpellGrammar.g:8116:91: ( '0' .. '9' )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSpellGrammar.g:8116:92: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    }
                    break;

            }

            // InternalSpellGrammar.g:8116:105: ( ( 'E' | 'e' ) ( '-' | '+' )? ( '0' .. '9' )+ )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='E'||LA24_0=='e') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSpellGrammar.g:8116:106: ( 'E' | 'e' ) ( '-' | '+' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSpellGrammar.g:8116:116: ( '-' | '+' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='+'||LA22_0=='-') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalSpellGrammar.g:
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

                    // InternalSpellGrammar.g:8116:127: ( '0' .. '9' )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSpellGrammar.g:8116:128: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;

            }

            // InternalSpellGrammar.g:8116:141: ( 'L' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='L') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSpellGrammar.g:8116:141: 'L'
                    {
                    match('L'); 

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
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpellGrammar.g:8118:16: ( . )
            // InternalSpellGrammar.g:8118:18: .
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
        // InternalSpellGrammar.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | RULE_ENDIF | RULE_ENDWHILE | RULE_ENDFOR | RULE_ENDWITH | RULE_ENDDEF | RULE_ENDTRY | RULE_ENDCLASS | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_NAME_TERMINAL | RULE_NUMBER | RULE_ANY_OTHER )
        int alt26=101;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // InternalSpellGrammar.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalSpellGrammar.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalSpellGrammar.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalSpellGrammar.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalSpellGrammar.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalSpellGrammar.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalSpellGrammar.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalSpellGrammar.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalSpellGrammar.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalSpellGrammar.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalSpellGrammar.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalSpellGrammar.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalSpellGrammar.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalSpellGrammar.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalSpellGrammar.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalSpellGrammar.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalSpellGrammar.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalSpellGrammar.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalSpellGrammar.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalSpellGrammar.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // InternalSpellGrammar.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // InternalSpellGrammar.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // InternalSpellGrammar.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // InternalSpellGrammar.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // InternalSpellGrammar.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // InternalSpellGrammar.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // InternalSpellGrammar.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // InternalSpellGrammar.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // InternalSpellGrammar.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // InternalSpellGrammar.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // InternalSpellGrammar.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // InternalSpellGrammar.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // InternalSpellGrammar.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // InternalSpellGrammar.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // InternalSpellGrammar.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // InternalSpellGrammar.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // InternalSpellGrammar.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // InternalSpellGrammar.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // InternalSpellGrammar.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // InternalSpellGrammar.g:1:244: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // InternalSpellGrammar.g:1:250: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // InternalSpellGrammar.g:1:256: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // InternalSpellGrammar.g:1:262: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // InternalSpellGrammar.g:1:268: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // InternalSpellGrammar.g:1:274: T__62
                {
                mT__62(); 

                }
                break;
            case 46 :
                // InternalSpellGrammar.g:1:280: T__63
                {
                mT__63(); 

                }
                break;
            case 47 :
                // InternalSpellGrammar.g:1:286: T__64
                {
                mT__64(); 

                }
                break;
            case 48 :
                // InternalSpellGrammar.g:1:292: T__65
                {
                mT__65(); 

                }
                break;
            case 49 :
                // InternalSpellGrammar.g:1:298: T__66
                {
                mT__66(); 

                }
                break;
            case 50 :
                // InternalSpellGrammar.g:1:304: T__67
                {
                mT__67(); 

                }
                break;
            case 51 :
                // InternalSpellGrammar.g:1:310: T__68
                {
                mT__68(); 

                }
                break;
            case 52 :
                // InternalSpellGrammar.g:1:316: T__69
                {
                mT__69(); 

                }
                break;
            case 53 :
                // InternalSpellGrammar.g:1:322: T__70
                {
                mT__70(); 

                }
                break;
            case 54 :
                // InternalSpellGrammar.g:1:328: T__71
                {
                mT__71(); 

                }
                break;
            case 55 :
                // InternalSpellGrammar.g:1:334: T__72
                {
                mT__72(); 

                }
                break;
            case 56 :
                // InternalSpellGrammar.g:1:340: T__73
                {
                mT__73(); 

                }
                break;
            case 57 :
                // InternalSpellGrammar.g:1:346: T__74
                {
                mT__74(); 

                }
                break;
            case 58 :
                // InternalSpellGrammar.g:1:352: T__75
                {
                mT__75(); 

                }
                break;
            case 59 :
                // InternalSpellGrammar.g:1:358: T__76
                {
                mT__76(); 

                }
                break;
            case 60 :
                // InternalSpellGrammar.g:1:364: T__77
                {
                mT__77(); 

                }
                break;
            case 61 :
                // InternalSpellGrammar.g:1:370: T__78
                {
                mT__78(); 

                }
                break;
            case 62 :
                // InternalSpellGrammar.g:1:376: T__79
                {
                mT__79(); 

                }
                break;
            case 63 :
                // InternalSpellGrammar.g:1:382: T__80
                {
                mT__80(); 

                }
                break;
            case 64 :
                // InternalSpellGrammar.g:1:388: T__81
                {
                mT__81(); 

                }
                break;
            case 65 :
                // InternalSpellGrammar.g:1:394: T__82
                {
                mT__82(); 

                }
                break;
            case 66 :
                // InternalSpellGrammar.g:1:400: T__83
                {
                mT__83(); 

                }
                break;
            case 67 :
                // InternalSpellGrammar.g:1:406: T__84
                {
                mT__84(); 

                }
                break;
            case 68 :
                // InternalSpellGrammar.g:1:412: T__85
                {
                mT__85(); 

                }
                break;
            case 69 :
                // InternalSpellGrammar.g:1:418: T__86
                {
                mT__86(); 

                }
                break;
            case 70 :
                // InternalSpellGrammar.g:1:424: T__87
                {
                mT__87(); 

                }
                break;
            case 71 :
                // InternalSpellGrammar.g:1:430: T__88
                {
                mT__88(); 

                }
                break;
            case 72 :
                // InternalSpellGrammar.g:1:436: T__89
                {
                mT__89(); 

                }
                break;
            case 73 :
                // InternalSpellGrammar.g:1:442: T__90
                {
                mT__90(); 

                }
                break;
            case 74 :
                // InternalSpellGrammar.g:1:448: T__91
                {
                mT__91(); 

                }
                break;
            case 75 :
                // InternalSpellGrammar.g:1:454: T__92
                {
                mT__92(); 

                }
                break;
            case 76 :
                // InternalSpellGrammar.g:1:460: T__93
                {
                mT__93(); 

                }
                break;
            case 77 :
                // InternalSpellGrammar.g:1:466: T__94
                {
                mT__94(); 

                }
                break;
            case 78 :
                // InternalSpellGrammar.g:1:472: T__95
                {
                mT__95(); 

                }
                break;
            case 79 :
                // InternalSpellGrammar.g:1:478: T__96
                {
                mT__96(); 

                }
                break;
            case 80 :
                // InternalSpellGrammar.g:1:484: T__97
                {
                mT__97(); 

                }
                break;
            case 81 :
                // InternalSpellGrammar.g:1:490: T__98
                {
                mT__98(); 

                }
                break;
            case 82 :
                // InternalSpellGrammar.g:1:496: T__99
                {
                mT__99(); 

                }
                break;
            case 83 :
                // InternalSpellGrammar.g:1:502: T__100
                {
                mT__100(); 

                }
                break;
            case 84 :
                // InternalSpellGrammar.g:1:509: T__101
                {
                mT__101(); 

                }
                break;
            case 85 :
                // InternalSpellGrammar.g:1:516: T__102
                {
                mT__102(); 

                }
                break;
            case 86 :
                // InternalSpellGrammar.g:1:523: T__103
                {
                mT__103(); 

                }
                break;
            case 87 :
                // InternalSpellGrammar.g:1:530: T__104
                {
                mT__104(); 

                }
                break;
            case 88 :
                // InternalSpellGrammar.g:1:537: RULE_ENDIF
                {
                mRULE_ENDIF(); 

                }
                break;
            case 89 :
                // InternalSpellGrammar.g:1:548: RULE_ENDWHILE
                {
                mRULE_ENDWHILE(); 

                }
                break;
            case 90 :
                // InternalSpellGrammar.g:1:562: RULE_ENDFOR
                {
                mRULE_ENDFOR(); 

                }
                break;
            case 91 :
                // InternalSpellGrammar.g:1:574: RULE_ENDWITH
                {
                mRULE_ENDWITH(); 

                }
                break;
            case 92 :
                // InternalSpellGrammar.g:1:587: RULE_ENDDEF
                {
                mRULE_ENDDEF(); 

                }
                break;
            case 93 :
                // InternalSpellGrammar.g:1:599: RULE_ENDTRY
                {
                mRULE_ENDTRY(); 

                }
                break;
            case 94 :
                // InternalSpellGrammar.g:1:611: RULE_ENDCLASS
                {
                mRULE_ENDCLASS(); 

                }
                break;
            case 95 :
                // InternalSpellGrammar.g:1:625: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 96 :
                // InternalSpellGrammar.g:1:637: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 97 :
                // InternalSpellGrammar.g:1:653: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 98 :
                // InternalSpellGrammar.g:1:669: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 99 :
                // InternalSpellGrammar.g:1:677: RULE_NAME_TERMINAL
                {
                mRULE_NAME_TERMINAL(); 

                }
                break;
            case 100 :
                // InternalSpellGrammar.g:1:696: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 101 :
                // InternalSpellGrammar.g:1:708: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA26_eotS =
        "\4\uffff\1\100\2\uffff\1\104\1\107\2\uffff\1\113\1\116\1\120\1\122\1\124\1\126\1\132\1\135\6\100\1\uffff\7\100\1\73\1\uffff\7\100\5\uffff\2\100\1\u0089\1\u008c\2\73\2\uffff\1\73\7\uffff\1\100\5\uffff\1\u0093\7\uffff\1\u0095\11\uffff\1\u0097\3\uffff\1\u0099\2\uffff\7\100\1\u00a1\1\u00a2\1\u00a3\3\100\1\uffff\1\u00a8\7\100\1\u00b2\1\100\2\uffff\12\100\5\uffff\2\100\2\uffff\1\u008c\2\uffff\1\u008d\1\uffff\1\u00c3\1\u00c4\10\uffff\7\100\3\uffff\1\100\1\u00cd\2\100\1\uffff\1\u00d0\7\100\1\u00d8\1\uffff\1\u00d9\15\100\1\u008c\3\uffff\1\u00e9\6\100\1\u00f0\1\uffff\2\100\1\uffff\1\100\1\u00f4\1\100\1\u00f6\1\u00f7\1\100\1\u00f9\2\uffff\1\u00fa\1\100\1\u00fc\5\100\1\u0102\5\100\1\u008c\1\uffff\1\u010e\1\100\1\u0110\1\100\1\u0112\1\100\1\uffff\3\100\1\uffff\1\100\2\uffff\1\u0118\2\uffff\1\100\1\uffff\4\100\1\u011e\1\uffff\4\100\1\u0123\6\u008c\1\uffff\1\100\1\uffff\1\u012c\1\uffff\1\u012d\1\100\1\u012f\1\u0130\1\u0131\1\uffff\1\u0132\4\100\1\uffff\1\u0137\2\100\1\u013a\1\uffff\1\u013b\6\u008c\1\100\2\uffff\1\u0144\4\uffff\2\100\1\u0147\1\100\1\uffff\1\u0149\1\100\2\uffff\1\u013b\2\u008c\1\u014d\1\u014f\1\u0152\1\u008c\1\u0154\1\uffff\2\100\1\uffff\1\100\1\uffff\1\100\1\u008c\1\u015a\1\uffff\1\u014d\1\uffff\1\u014f\1\u0152\1\uffff\1\u008c\1\uffff\1\u015d\1\100\1\u015f\1\100\1\u0161\1\uffff\1\u015a\1\u0163\1\uffff\1\100\1\uffff\1\100\1\uffff\1\u0161\1\uffff\1\u0163\1\u0167\1\100\1\uffff\10\100\1\u0171\1\uffff";
    static final String DFA26_eofS =
        "\u0172\uffff";
    static final String DFA26_minS =
        "\1\0\3\uffff\1\145\2\uffff\1\75\1\52\2\uffff\1\75\1\57\4\75\1\74\1\75\1\141\1\162\1\154\1\141\1\146\1\151\1\uffff\1\156\2\154\1\150\2\162\1\157\1\75\1\uffff\1\145\1\151\1\165\2\145\1\141\1\150\5\uffff\1\141\1\151\1\12\1\105\2\0\2\uffff\1\12\7\uffff\1\146\5\uffff\1\75\7\uffff\1\75\11\uffff\1\75\3\uffff\1\75\2\uffff\1\163\1\145\1\156\1\141\1\164\1\151\1\160\3\60\1\157\1\162\1\156\1\uffff\1\60\1\144\1\157\1\143\2\151\1\164\1\171\1\60\1\164\2\uffff\1\145\1\157\1\156\1\163\1\151\2\164\1\162\1\151\1\141\5\uffff\1\155\1\145\2\uffff\1\116\2\uffff\1\47\1\uffff\2\60\10\uffff\1\163\1\141\1\164\1\163\1\165\1\163\1\157\3\uffff\1\155\1\60\1\141\1\145\1\uffff\1\60\1\142\1\143\1\145\1\146\1\145\1\154\1\150\1\60\1\uffff\1\60\1\160\1\167\1\144\1\114\1\160\1\154\1\114\1\157\1\151\1\164\1\156\1\142\1\154\1\104\3\uffff\1\60\1\153\1\151\1\163\1\162\1\145\1\162\1\60\1\uffff\1\154\1\162\1\uffff\1\141\1\60\1\160\2\60\1\145\1\60\2\uffff\1\60\1\124\1\60\1\151\1\154\1\144\1\151\1\115\1\60\1\146\1\106\1\147\2\144\1\103\1\uffff\1\60\1\156\1\60\1\156\1\60\1\164\1\uffff\1\154\1\164\1\154\1\uffff\1\164\2\uffff\1\60\2\uffff\1\115\1\uffff\1\155\1\141\1\124\1\155\1\60\1\uffff\1\171\1\157\1\145\1\141\1\60\1\106\1\110\1\117\1\105\1\122\1\114\1\uffff\1\165\1\uffff\1\60\1\uffff\1\60\1\171\3\60\1\uffff\1\60\1\151\1\171\1\103\1\151\1\uffff\1\60\1\162\1\114\1\60\1\uffff\1\0\1\111\1\124\1\122\1\106\1\131\1\101\1\145\2\uffff\1\60\4\uffff\1\164\1\123\1\60\1\164\1\uffff\1\60\1\141\2\uffff\1\0\1\114\1\110\3\0\1\123\1\60\1\uffff\1\163\1\164\1\uffff\1\163\1\uffff\1\156\1\105\1\0\1\uffff\1\0\1\uffff\2\0\1\uffff\1\123\1\uffff\1\60\1\145\1\60\1\147\1\0\1\uffff\2\0\1\uffff\1\160\1\uffff\1\165\1\uffff\1\0\1\uffff\1\0\1\60\1\141\1\uffff\1\147\1\145\1\103\1\157\1\156\1\146\1\151\1\147\1\60\1\uffff";
    static final String DFA26_maxS =
        "\1\uffff\3\uffff\1\145\2\uffff\2\75\2\uffff\6\75\2\76\1\141\1\162\1\157\1\145\1\163\1\162\1\uffff\1\163\1\154\1\170\1\151\2\162\1\157\1\75\1\uffff\1\164\1\151\1\165\1\157\1\145\1\141\1\150\5\uffff\1\141\1\151\1\15\1\105\2\uffff\2\uffff\1\12\7\uffff\1\154\5\uffff\1\75\7\uffff\1\75\11\uffff\1\75\3\uffff\1\75\2\uffff\1\163\1\145\1\156\1\141\1\164\1\151\1\160\3\172\1\157\1\162\1\156\1\uffff\1\172\1\144\1\157\1\145\1\163\1\151\1\164\1\171\1\172\1\164\2\uffff\1\145\1\157\1\164\1\163\1\151\2\164\1\162\1\151\1\141\5\uffff\1\155\1\145\2\uffff\1\116\2\uffff\1\47\1\uffff\2\172\10\uffff\1\163\1\141\1\164\1\163\1\165\1\163\1\157\3\uffff\1\155\1\172\1\141\1\145\1\uffff\1\172\1\142\1\143\1\145\1\146\1\145\1\154\1\150\1\172\1\uffff\1\172\1\160\1\167\1\144\1\114\1\160\1\154\1\124\1\157\1\151\1\164\1\156\1\142\1\154\1\104\3\uffff\1\172\1\153\1\151\1\163\1\162\1\145\1\162\1\172\1\uffff\1\154\1\162\1\uffff\1\141\1\172\1\160\2\172\1\145\1\172\2\uffff\1\172\1\124\1\172\1\151\1\154\1\144\1\151\1\115\1\172\1\146\1\106\1\147\2\144\1\127\1\uffff\1\172\1\156\1\172\1\156\1\172\1\164\1\uffff\1\154\1\164\1\154\1\uffff\1\164\2\uffff\1\172\2\uffff\1\115\1\uffff\1\155\1\141\1\124\1\155\1\172\1\uffff\1\171\1\157\1\145\1\141\1\172\1\106\1\111\1\117\1\105\1\122\1\114\1\uffff\1\165\1\uffff\1\172\1\uffff\1\172\1\171\3\172\1\uffff\1\172\1\151\1\171\1\103\1\151\1\uffff\1\172\1\162\1\114\1\172\1\uffff\1\uffff\1\111\1\124\1\122\1\106\1\131\1\101\1\145\2\uffff\1\172\4\uffff\1\164\1\123\1\172\1\164\1\uffff\1\172\1\141\2\uffff\1\uffff\1\114\1\110\3\uffff\1\123\1\172\1\uffff\1\163\1\164\1\uffff\1\163\1\uffff\1\156\1\105\1\uffff\1\uffff\1\uffff\1\uffff\2\uffff\1\uffff\1\123\1\uffff\1\172\1\145\1\172\1\147\1\uffff\1\uffff\2\uffff\1\uffff\1\160\1\uffff\1\165\1\uffff\1\uffff\1\uffff\1\uffff\1\172\1\141\1\uffff\1\147\1\145\1\103\1\157\1\156\1\146\1\151\1\147\1\172\1\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\2\uffff\1\12\1\13\16\uffff\1\37\10\uffff\1\102\7\uffff\1\117\1\120\1\121\1\122\1\123\6\uffff\2\142\1\uffff\1\142\1\143\1\144\1\145\1\1\1\2\1\3\1\uffff\1\143\1\5\1\6\1\63\1\7\1\uffff\1\15\1\10\1\12\1\13\1\14\1\76\1\16\1\uffff\1\77\1\17\1\100\1\20\1\73\1\21\1\71\1\22\1\72\1\uffff\1\65\1\66\1\61\1\uffff\1\64\1\62\15\uffff\1\37\12\uffff\1\67\1\102\12\uffff\1\117\1\120\1\121\1\122\1\123\2\uffff\1\127\1\142\1\uffff\1\141\1\137\1\uffff\1\144\2\uffff\1\25\1\11\1\26\1\101\1\23\1\74\1\24\1\75\7\uffff\1\43\1\46\1\70\4\uffff\1\40\11\uffff\1\56\17\uffff\1\140\1\4\1\27\10\uffff\1\51\2\uffff\1\57\7\uffff\1\52\1\60\17\uffff\1\30\6\uffff\1\36\3\uffff\1\42\1\uffff\1\45\1\47\1\uffff\1\54\1\103\1\uffff\1\106\5\uffff\1\113\13\uffff\1\31\1\uffff\1\125\1\uffff\1\34\5\uffff\1\50\5\uffff\1\112\4\uffff\1\126\10\uffff\1\33\1\35\1\uffff\1\44\1\41\1\55\1\105\4\uffff\1\114\2\uffff\1\124\1\130\10\uffff\1\53\2\uffff\1\107\1\uffff\1\115\3\uffff\1\132\1\uffff\1\134\2\uffff\1\135\1\uffff\1\32\5\uffff\1\133\2\uffff\1\110\1\uffff\1\111\1\uffff\1\131\1\uffff\1\136\3\uffff\1\104\11\uffff\1\116";
    static final String DFA26_specialS =
        "\1\3\62\uffff\1\6\1\13\u00ef\uffff\1\10\27\uffff\1\11\2\uffff\1\0\1\12\1\17\12\uffff\1\5\1\uffff\1\20\1\uffff\1\4\1\7\7\uffff\1\16\1\uffff\1\1\1\2\5\uffff\1\15\1\uffff\1\14\15\uffff}>";
    static final String[] DFA26_transitionS = {
            "\11\73\1\66\1\70\2\73\1\67\22\73\1\65\1\41\1\63\1\62\1\73\1\15\1\16\1\64\1\2\1\3\1\10\1\12\1\6\1\13\1\31\1\14\12\72\1\5\1\11\1\21\1\7\1\22\1\73\1\1\1\71\1\45\1\51\1\44\2\71\1\46\13\71\1\43\2\71\1\47\1\50\3\71\1\52\1\61\1\53\1\20\1\71\1\56\1\32\1\24\1\25\1\4\1\34\1\30\1\33\1\71\1\27\2\71\1\57\1\71\1\40\1\37\1\23\1\71\1\26\1\71\1\36\2\71\1\35\1\71\1\60\1\71\1\54\1\17\1\55\1\42\uff81\73",
            "",
            "",
            "",
            "\1\77",
            "",
            "",
            "\1\103",
            "\1\105\22\uffff\1\106",
            "",
            "",
            "\1\112",
            "\1\115\15\uffff\1\114",
            "\1\117",
            "\1\121",
            "\1\123",
            "\1\125",
            "\1\127\1\130\1\131",
            "\1\134\1\133",
            "\1\136",
            "\1\137",
            "\1\141\2\uffff\1\140",
            "\1\143\3\uffff\1\142",
            "\1\146\6\uffff\1\144\1\145\4\uffff\1\147",
            "\1\152\5\uffff\1\151\2\uffff\1\150",
            "",
            "\1\155\4\uffff\1\154",
            "\1\156",
            "\1\160\13\uffff\1\157",
            "\1\161\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\172\2\uffff\1\171\13\uffff\1\170",
            "\1\173",
            "\1\174",
            "\1\175\11\uffff\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "",
            "",
            "",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u008a\2\uffff\1\u008a",
            "\1\u008b",
            "\0\u008d",
            "\47\u008d\1\u008e\uffd8\u008d",
            "",
            "",
            "\1\u008a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0090\5\uffff\1\u0091",
            "",
            "",
            "",
            "",
            "",
            "\1\u0092",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0094",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0096",
            "",
            "",
            "",
            "\1\u0098",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u00a7\7\100",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ad\11\uffff\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00b3",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6\5\uffff\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "",
            "\1\u00c1",
            "",
            "",
            "\1\u00c2",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "",
            "",
            "\1\u00cc",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0\7\uffff\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00f5",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00f8",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00fb",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u010d\1\u010b\1\uffff\1\u010a\2\uffff\1\u0108\12\uffff\1\u010c\2\uffff\1\u0109",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u010f",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0111",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0113",
            "",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0117",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0124",
            "\1\u0125\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "",
            "\1\u012b",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u012e",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0138",
            "\1\u0139",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\u013c\1\uffff\2\u013c\1\uffff\ufff2\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "",
            "",
            "\1\u0145",
            "\1\u0146",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0148",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u014a",
            "",
            "",
            "\12\u013c\1\uffff\2\u013c\1\uffff\ufff2\u013c",
            "\1\u014b",
            "\1\u014c",
            "\12\u014e\1\uffff\2\u014e\1\uffff\ufff2\u014e",
            "\12\u0150\1\uffff\2\u0150\1\uffff\ufff2\u0150",
            "\12\u0151\1\uffff\2\u0151\1\uffff\ufff2\u0151",
            "\1\u0153",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u0155",
            "\1\u0156",
            "",
            "\1\u0157",
            "",
            "\1\u0158",
            "\1\u0159",
            "\12\u015b\1\uffff\2\u015b\1\uffff\ufff2\u015b",
            "",
            "\12\u014e\1\uffff\2\u014e\1\uffff\ufff2\u014e",
            "",
            "\12\u0150\1\uffff\2\u0150\1\uffff\ufff2\u0150",
            "\12\u0151\1\uffff\2\u0151\1\uffff\ufff2\u0151",
            "",
            "\1\u015c",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u015e",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0160",
            "\12\u0162\1\uffff\2\u0162\1\uffff\ufff2\u0162",
            "",
            "\12\u015b\1\uffff\2\u015b\1\uffff\ufff2\u015b",
            "\12\u0164\1\uffff\2\u0164\1\uffff\ufff2\u0164",
            "",
            "\1\u0165",
            "",
            "\1\u0166",
            "",
            "\12\u0162\1\uffff\2\u0162\1\uffff\ufff2\u0162",
            "",
            "\12\u0164\1\uffff\2\u0164\1\uffff\ufff2\u0164",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0168",
            "",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    static class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | RULE_ENDIF | RULE_ENDWHILE | RULE_ENDFOR | RULE_ENDWITH | RULE_ENDDEF | RULE_ENDTRY | RULE_ENDCLASS | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_NAME_TERMINAL | RULE_NUMBER | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_319 = input.LA(1);

                        s = -1;
                        if ( ((LA26_319>='\u0000' && LA26_319<='\t')||(LA26_319>='\u000B' && LA26_319<='\f')||(LA26_319>='\u000E' && LA26_319<='\uFFFF')) ) {s = 334;}

                        else s = 333;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_347 = input.LA(1);

                        s = -1;
                        if ( ((LA26_347>='\u0000' && LA26_347<='\t')||(LA26_347>='\u000B' && LA26_347<='\f')||(LA26_347>='\u000E' && LA26_347<='\uFFFF')) ) {s = 347;}

                        else s = 346;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_348 = input.LA(1);

                        s = -1;
                        if ( ((LA26_348>='\u0000' && LA26_348<='\t')||(LA26_348>='\u000B' && LA26_348<='\f')||(LA26_348>='\u000E' && LA26_348<='\uFFFF')) ) {s = 356;}

                        else s = 355;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_0 = input.LA(1);

                        s = -1;
                        if ( (LA26_0=='@') ) {s = 1;}

                        else if ( (LA26_0=='(') ) {s = 2;}

                        else if ( (LA26_0==')') ) {s = 3;}

                        else if ( (LA26_0=='d') ) {s = 4;}

                        else if ( (LA26_0==':') ) {s = 5;}

                        else if ( (LA26_0==',') ) {s = 6;}

                        else if ( (LA26_0=='=') ) {s = 7;}

                        else if ( (LA26_0=='*') ) {s = 8;}

                        else if ( (LA26_0==';') ) {s = 9;}

                        else if ( (LA26_0=='+') ) {s = 10;}

                        else if ( (LA26_0=='-') ) {s = 11;}

                        else if ( (LA26_0=='/') ) {s = 12;}

                        else if ( (LA26_0=='%') ) {s = 13;}

                        else if ( (LA26_0=='&') ) {s = 14;}

                        else if ( (LA26_0=='|') ) {s = 15;}

                        else if ( (LA26_0=='^') ) {s = 16;}

                        else if ( (LA26_0=='<') ) {s = 17;}

                        else if ( (LA26_0=='>') ) {s = 18;}

                        else if ( (LA26_0=='p') ) {s = 19;}

                        else if ( (LA26_0=='b') ) {s = 20;}

                        else if ( (LA26_0=='c') ) {s = 21;}

                        else if ( (LA26_0=='r') ) {s = 22;}

                        else if ( (LA26_0=='i') ) {s = 23;}

                        else if ( (LA26_0=='f') ) {s = 24;}

                        else if ( (LA26_0=='.') ) {s = 25;}

                        else if ( (LA26_0=='a') ) {s = 26;}

                        else if ( (LA26_0=='g') ) {s = 27;}

                        else if ( (LA26_0=='e') ) {s = 28;}

                        else if ( (LA26_0=='w') ) {s = 29;}

                        else if ( (LA26_0=='t') ) {s = 30;}

                        else if ( (LA26_0=='o') ) {s = 31;}

                        else if ( (LA26_0=='n') ) {s = 32;}

                        else if ( (LA26_0=='!') ) {s = 33;}

                        else if ( (LA26_0=='~') ) {s = 34;}

                        else if ( (LA26_0=='S') ) {s = 35;}

                        else if ( (LA26_0=='D') ) {s = 36;}

                        else if ( (LA26_0=='B') ) {s = 37;}

                        else if ( (LA26_0=='G') ) {s = 38;}

                        else if ( (LA26_0=='V') ) {s = 39;}

                        else if ( (LA26_0=='W') ) {s = 40;}

                        else if ( (LA26_0=='C') ) {s = 41;}

                        else if ( (LA26_0=='[') ) {s = 42;}

                        else if ( (LA26_0==']') ) {s = 43;}

                        else if ( (LA26_0=='{') ) {s = 44;}

                        else if ( (LA26_0=='}') ) {s = 45;}

                        else if ( (LA26_0=='`') ) {s = 46;}

                        else if ( (LA26_0=='l') ) {s = 47;}

                        else if ( (LA26_0=='y') ) {s = 48;}

                        else if ( (LA26_0=='\\') ) {s = 49;}

                        else if ( (LA26_0=='#') ) {s = 50;}

                        else if ( (LA26_0=='\"') ) {s = 51;}

                        else if ( (LA26_0=='\'') ) {s = 52;}

                        else if ( (LA26_0==' ') ) {s = 53;}

                        else if ( (LA26_0=='\t') ) {s = 54;}

                        else if ( (LA26_0=='\r') ) {s = 55;}

                        else if ( (LA26_0=='\n') ) {s = 56;}

                        else if ( (LA26_0=='A'||(LA26_0>='E' && LA26_0<='F')||(LA26_0>='H' && LA26_0<='R')||(LA26_0>='T' && LA26_0<='U')||(LA26_0>='X' && LA26_0<='Z')||LA26_0=='_'||LA26_0=='h'||(LA26_0>='j' && LA26_0<='k')||LA26_0=='m'||LA26_0=='q'||LA26_0=='s'||(LA26_0>='u' && LA26_0<='v')||LA26_0=='x'||LA26_0=='z') ) {s = 57;}

                        else if ( ((LA26_0>='0' && LA26_0<='9')) ) {s = 58;}

                        else if ( ((LA26_0>='\u0000' && LA26_0<='\b')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\u001F')||LA26_0=='$'||LA26_0=='?'||(LA26_0>='\u007F' && LA26_0<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_336 = input.LA(1);

                        s = -1;
                        if ( ((LA26_336>='\u0000' && LA26_336<='\t')||(LA26_336>='\u000B' && LA26_336<='\f')||(LA26_336>='\u000E' && LA26_336<='\uFFFF')) ) {s = 336;}

                        else s = 335;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_332 = input.LA(1);

                        s = -1;
                        if ( ((LA26_332>='\u0000' && LA26_332<='\t')||(LA26_332>='\u000B' && LA26_332<='\f')||(LA26_332>='\u000E' && LA26_332<='\uFFFF')) ) {s = 347;}

                        else s = 346;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_51 = input.LA(1);

                        s = -1;
                        if ( ((LA26_51>='\u0000' && LA26_51<='\uFFFF')) ) {s = 141;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_337 = input.LA(1);

                        s = -1;
                        if ( ((LA26_337>='\u0000' && LA26_337<='\t')||(LA26_337>='\u000B' && LA26_337<='\f')||(LA26_337>='\u000E' && LA26_337<='\uFFFF')) ) {s = 337;}

                        else s = 338;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_292 = input.LA(1);

                        s = -1;
                        if ( ((LA26_292>='\u0000' && LA26_292<='\t')||(LA26_292>='\u000B' && LA26_292<='\f')||(LA26_292>='\u000E' && LA26_292<='\uFFFF')) ) {s = 316;}

                        else s = 315;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_316 = input.LA(1);

                        s = -1;
                        if ( ((LA26_316>='\u0000' && LA26_316<='\t')||(LA26_316>='\u000B' && LA26_316<='\f')||(LA26_316>='\u000E' && LA26_316<='\uFFFF')) ) {s = 316;}

                        else s = 315;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA26_320 = input.LA(1);

                        s = -1;
                        if ( ((LA26_320>='\u0000' && LA26_320<='\t')||(LA26_320>='\u000B' && LA26_320<='\f')||(LA26_320>='\u000E' && LA26_320<='\uFFFF')) ) {s = 336;}

                        else s = 335;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA26_52 = input.LA(1);

                        s = -1;
                        if ( (LA26_52=='\'') ) {s = 142;}

                        else if ( ((LA26_52>='\u0000' && LA26_52<='&')||(LA26_52>='(' && LA26_52<='\uFFFF')) ) {s = 141;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA26_356 = input.LA(1);

                        s = -1;
                        if ( ((LA26_356>='\u0000' && LA26_356<='\t')||(LA26_356>='\u000B' && LA26_356<='\f')||(LA26_356>='\u000E' && LA26_356<='\uFFFF')) ) {s = 356;}

                        else s = 355;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA26_354 = input.LA(1);

                        s = -1;
                        if ( ((LA26_354>='\u0000' && LA26_354<='\t')||(LA26_354>='\u000B' && LA26_354<='\f')||(LA26_354>='\u000E' && LA26_354<='\uFFFF')) ) {s = 354;}

                        else s = 353;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA26_345 = input.LA(1);

                        s = -1;
                        if ( ((LA26_345>='\u0000' && LA26_345<='\t')||(LA26_345>='\u000B' && LA26_345<='\f')||(LA26_345>='\u000E' && LA26_345<='\uFFFF')) ) {s = 354;}

                        else s = 353;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA26_321 = input.LA(1);

                        s = -1;
                        if ( ((LA26_321>='\u0000' && LA26_321<='\t')||(LA26_321>='\u000B' && LA26_321<='\f')||(LA26_321>='\u000E' && LA26_321<='\uFFFF')) ) {s = 337;}

                        else s = 338;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA26_334 = input.LA(1);

                        s = -1;
                        if ( ((LA26_334>='\u0000' && LA26_334<='\t')||(LA26_334>='\u000B' && LA26_334<='\f')||(LA26_334>='\u000E' && LA26_334<='\uFFFF')) ) {s = 334;}

                        else s = 333;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}