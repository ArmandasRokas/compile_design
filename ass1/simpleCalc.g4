// ASK1: Hvordan kan jeg tillade block i block?
// ASK2: should I make seperate alternative for 'if' withuot else? Or how should  øelse' be implemented 
 
grammar simpleCalc;

start   : b=block  e=exp EOF ; 

// skal udkommenteres
block : 
	s=stat 			# OneStat	// visit s
	| '{' ss+=stat* '}' 	# MultiStat 	// visit all in the list 
	;	

stat:
	'if' '(' c=condition  ')' b1=block 'else' b2=block 	# If_stat
	// |  if 						# If_else_stat
	| 'while' '(' c=condition ')' b1=block 			# While_stat
	| x=ID '=' e=exp ';' 					# Assign
	| e=exp ';'				 		# Unary
	//| '{' ss+=stat* '}'					# Block
;

condition: 
	//|b=BOOL 				# BoolConst
	ce1=exp co=CONDOP ce2=exp 		# BoolCondition	
	| '(' c=condition ')'			# ParenthCondition
	| '!' c=condition 			# NotCondition
	| c1=condition '&&' c2=condition	# AndCondition
	| c1=condition '||' c2=condition	# OrCondition
	| e1=exp '==' e2=exp			# Equals
	| e1=exp '!=' e2=exp			# NotEquals
	| e1=exp '<'  e2=exp			# LessThan
	|'true'					# TrueCondition
	| 'false'				# FalseCondition
	;


/* A grammar for arithmetic expressions */

exp : 
	x=ID    	      # Variable
	| x=ID '++'	      # Increment
	| x=ID '--'	      # Decrement
	| f=FLOAT	      # Constant
	| e1=exp '*' e2=exp   # Multiplication
	//| f=FLOAT x=ID	      # Multi_NoSign 
	| e1=exp '/' e2=exp   # Division
	| e1=exp '+' e2=exp   # Addition
	| e1=exp '-' e2=exp   # Subtraction
	| '(' e=exp ')'	      # Parenthesis
	| op=OP f=FLOAT       # SignedConstant
	;



// Lexer:
// OPMD : ('/'|'*'); // modified
OP : ('-'|'+') ;
CONDOP: ( '>' | '<=' | '>=');
BOOLCON: ('||' | '&&');
ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : ( NUM+ ('.' NUM+)?) ;
//BOOL : ('true' | 'false');
ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
