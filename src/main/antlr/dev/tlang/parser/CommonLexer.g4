lexer grammar CommonLexer;

TEXT:
	'"""' '"""';

WS : ( ' ' | '\t' | '\r' | '\n' )+ -> channel(HIDDEN);

fragment ESCAPED_QUOTE : '\\"';
STRING :   '"' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '"';

NUMBER     : '0'..'9'+ ('.' '0'..'9'+)?;

COMMENT
    : '/*' .*? '*/' -> channel(HIDDEN)
;

LINE_COMMENT
    : '//' ~[\r\n]* -> channel(HIDDEN)
;

Helper : 'helper';
Tmpl : 'tmpl';
Model: 'model';
Use: 'use';
Expose: 'expose';
Func: 'func';
If: 'if';
Else: 'else';
For: 'for';
In: 'in';
To: 'to';
Until: 'until';
Set: 'set';
Ext: 'ext';
Impl: 'impl';
Spec: 'spec';
Pkg: 'pkg';
While: 'while';
Do: 'do';
Var: 'var';
Return: 'return';
LBRACE : '{' ;
RBRACE : '}' ;

ESCAPED_ID: '`'  ( ~('\n' | '\r' | '\t' | ' ') )*? '`';

WHITE_SPACES: [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN);
//ML_COMMENT : '/*' -> '*/';
//SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;

//WS         : (' '|'\t'|'\r'|'\n')+ -> skip;
//WS     : [ \t\r\n]+ -> channel(HIDDEN);

ID:
	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9' | '-')*;
