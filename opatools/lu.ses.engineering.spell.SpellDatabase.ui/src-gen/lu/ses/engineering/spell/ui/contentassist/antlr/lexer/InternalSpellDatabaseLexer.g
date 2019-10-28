
/*
 * generated by Xtext
 */
lexer grammar InternalSpellDatabaseLexer;


@header {
package lu.ses.engineering.spell.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




END_FILE_HEADER : 'END_FILE_HEADER';

FILE_HEADER : 'FILE_HEADER';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

Comma : ',';

FullStop : '.';

Solidus : '/';

EqualsSign : '=';

LeftSquareBracket : '[';

Backslash : '\\';

RightSquareBracket : ']';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';



RULE_ASTRIUM_COMMENT : '*' '*' ~(('\n'|'\r'))*;

RULE_PLUS : '+';

RULE_MINUS : '-';

RULE_WS : (' '|'\t')+;

RULE_COLON : ':';

RULE_LAMBDA : 'lambda';

RULE_TM : 'TM';

RULE_BOOL_EXPR : ('True'|'False'|'None');

RULE_TIME_EXPR : ('SECOND'|'MINUTE'|'HOUR'|'DAY'|'WEEK');

RULE_SPELL : 'SPELL';

RULE_WAIT : 'WAIT';

RULE_PAUSE : 'PAUSE';

RULE_CMD : 'CMD';

RULE_STATE_EXPR : ('STATE'|'ENG'|'RAW');

RULE_FLOAT : (RULE_INT '.' RULE_INT (('e'|'E') ('+'|'-')? RULE_INT?)?|RULE_INT ('.' RULE_INT)? ('e'|'E') ('+'|'-')? RULE_INT?);

RULE_INT : ('0'..'9')+;

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_DOLLAR : '$';

RULE_BIN_HEX_OCT : ('0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+|'0' ('b'|'B') ('0'..'1')+|'0' ('o'|'O') ('0'..'7')+);

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\''|'\n')))* '\'');

RULE_ML_COMMENT : ('\'\'\'' ( options {greedy=false;} : . )*'\'\'\''|'"""' ( options {greedy=false;} : . )*'"""');

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))*;

RULE_NL : ('\r'|'\n')+;

RULE_ANY_OTHER : .;


