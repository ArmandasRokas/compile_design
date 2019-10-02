// ASK1: Hvordan kan jeg tillade block i block?

grammar simpleCalc;

start   : b=block  e=exp EOF ; 

block : s=stat # OneStat // visit s
	| '{' ss+=stat* '}' # MultiStat // visit all in the list // ASK: should I visit this to? Should it has a label too?
	;	

stat:
	'if' '(' c=condition  ')'
		(b1=block) 
		'else' (b2=block) # If_stat // ASK: should it has else like this or should I create a seperate alternative, that has if and else without question mark
	| 'while' '(' c=condition ')' b1=block # While_stat
	| x=ID '=' e=exp ';' # Assign
;

condition: 
	b=BOOL 				# BoolConst
	|ce1=exp co=CONDOP ce2=exp 	# BoolCondition	
	| '(' c=condition ')'		# ParenthCondition
	| '!' c=condition 		# NotCondition
	| c1=condition '&&' c2=condition	# AndCondition
	| c1=condition '||' c2=condition	# OrCondition
	| e1=exp '==' e2=exp		# Equals
	;

// assign : x=ID '=' e=exp ';'  ;

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
CONDOP: ( '!=' | '<' | '>' | '<=' | '>=');
BOOLCON: ('||' | '&&');
ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : ( NUM+ ('.' NUM+)?) ;
BOOL : ('true' | 'false');
ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
