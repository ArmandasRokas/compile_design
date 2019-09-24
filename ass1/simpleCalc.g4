grammar simpleCalc;

start   : (bs+=block)*  (as+=assign)* e=exp EOF ; // hvad betyder + her??

block : '{' stat* '}';

stat:	block
	|'if' '(' condition  ')'
		(stat | block) 
		('else' (stat | block))?
	| 'while' '(' condition ')'
		(stat | block )
	| assign;

condition: 
	ce1=exp co=CONDOP ce2=exp 	# BoolCondition	
	| '(' c=condition ')'		# ParenthCondition
	| '!' c=condition 		# NotCondition
	| c1=condition '&&' c2=condition	# AndCondition
	| c1=condition '||' c2=condition	# OrCondition
	;

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
BOOLCON: ('||' | '&&');
ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : ( NUM+ ('.' NUM+)?) ;

ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
