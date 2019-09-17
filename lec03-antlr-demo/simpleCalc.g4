grammar simpleCalc;

start   : (as+=assign)* e=exp EOF ;

assign : x=ID '=' e=exp  ;

/* A grammar for arithmetic expressions */

exp : x=ID    	 # Variable
| f=FLOAT	 # Constant
| e1=exp '*' e2=exp   # Multiplication 
| e1=exp op=OP e2=exp   # Addition
| '(' e=exp ')'	 # Parenthesis
| op=OP f=FLOAT  # SignedConstant
;

// Lexer:

OP : ('-'|'+') ;

ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : ( NUM+ ('.' NUM+)?) ;

ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
