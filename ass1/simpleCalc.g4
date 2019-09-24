grammar simpleCalc;

start   : (bs+=block)*  (as+=assign)* e=exp EOF ; // hvad betyder + her??

block : '{' stat* '}';

stat:	'if' '(' exp CONDOP exp ')' stat
	| assign;

assign : x=ID '=' e=exp ';'  ;

/* A grammar for arithmetic expressions */

exp : x=ID    	      # Variable
| f=FLOAT	      # Constant
| e1=exp '*' e2=exp   # Multiplication
| e1=exp '/' e2=exp   # Division
| e1=exp '+' e2=exp   # Addition
| e1=exp '-' e2=exp   # Subtraction
| '(' e=exp ')'	      # Parenthesis
| op=OP f=FLOAT       # SignedConstant
;

// Lexer:
// OPMD : ('/'|'*'); // modified
OP : ('-'|'+') ;
CONDOP: ('==' | '!=' | '<' | '>' | '<=' | '>=');
ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : ( NUM+ ('.' NUM+)?) ;

ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
