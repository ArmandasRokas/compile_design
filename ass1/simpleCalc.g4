grammar simpleCalc;

start   : b=block  e=exp EOF ; 

block : 
	s=stat 			# OneStat	// visit s
	| '{' ss+=stat* '}' 	# MultiStat 	// visit all in the list 
	;	

stat:
	'if' '(' c=condition  ')' b1=block 'else' b2=block 	# If_else_stat
        |  'if' '(' c=condition ')' b1=block  		        # If_stat
	| 'while' '(' c=condition ')' b1=block 			# While_stat
	| x=ID '=' e=exp ';' 					# Assign
	| e=exp ';'				 		# Unary
	;

condition: 
	 '(' c=condition ')'			# ParenthCondition
	| '!' c=condition 			# NotCondition
	| c1=condition '&&' c2=condition	# AndCondition
	| c1=condition '||' c2=condition	# OrCondition
	| e1=exp '==' e2=exp			# Equals
	| e1=exp '!=' e2=exp			# NotEquals
	| e1=exp '<'  e2=exp			# LessThan
	| e1=exp '>'  e2=exp			# GreaterThan
	| e1=exp '<=' e2=exp			# LessThanOrEqual
	| e1=exp '>=' e2=exp			# GeaterThanOrEqual
	| 'true'				# TrueCondition
	| 'false'				# FalseCondition
	;


/* A grammar for arithmetic expressions */

exp : 
	x=ID    	      # Variable
	| x=ID '++'	      # Increment_Postfix
	| x=ID '--'	      # Decrement_Postfix
	| '++' x=ID 	      # Increment_Prefix
	| '--' x=ID 	      # Decrement_Prefix 
	| f=FLOAT	      # Constant
	| e1=exp '*' e2=exp   # Multiplication
	| e1=exp '/' e2=exp   # Division
	| e1=exp '+' e2=exp   # Addition
	| e1=exp '-' e2=exp   # Subtraction
	| '(' e=exp ')'	      # Parenthesis
	| '-' f=FLOAT         # SignedConstant_Minus
	| '+' f=FLOAT         # SignedConstant_Plus
	;



// Lexer:
ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : ( NUM+ ('.' NUM+)?) ;
ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
