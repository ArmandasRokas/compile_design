grammar simpleCalc;

start   : (as+=assign)* (bs+=stat_block)*   e=exp EOF ; // hvad betyder + her??

// block : '{' stat* '}'; // ASK: should I visit this to? Should it has a label too?

block : stat*;

stat: 	assign
	| if_stat
	| while_stat;



//condition: 
//	b=BOOL 				# BoolConst
//	|ce1=exp co=CONDOP ce2=exp 	# BoolCondition	
//	// |ce1=exp '>' ce2=exp 	# GreaterThan 
//	| '(' c=condition ')'		# ParenthCondition
//	| '!' c=condition 		# NotCondition
//	| c1=condition '&&' c2=condition	# AndCondition
//	| c1=condition '||' c2=condition	# OrCondition
//	;

assign : x=ID '=' e=exp ';'  ;

if_stat : 'if' condition_block ('else' stat_block)?;

condition_block: exp stat_block;

stat_block : '{' block '}'
		| stat;

while_stat : 'while' exp stat_block;

exp :	 
 op=OP f=FLOAT		# SignedConstant
| NOT e1=exp		# Not
| e1=exp '*' e2=exp   # Multiplication
| e1=exp '/' e2=exp   # Division
| e1=exp '+' e2=exp   # Addition
| e1=exp '-' e2=exp   # Subtraction
| '(' e=exp ')'	      # Parenthesis
| e1=exp op=(LTEQ | GTEQ | LT | GT) e2=exp	# Relational
| e1=exp op=(EQ | NEQ) e1=exp 	# Equality
| e1=exp AND e2=exp 	# And
| e2=exp OR e2=exp  	# Or
| x=ID			# Variable
| f=FLOAT 		# Constant
;


// Lexer:
// OPMD : ('/'|'*'); // modified
EQ: '==';
NEQ: '!=';
GT: '>';
LT: '<';
GTEQ: '>=';
LTEQ: '<=';
OR: '||';
AND: '&&';
NOT: '!';
OP : ('-'|'+') ;
CONDOP: ('==' | '!=' | '<' | '>' | '<=' | '>=');
BOOLCON: ('||' | '&&');
ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : ( NUM+ ('.' NUM+)?) ;
BOOL : ('true' | 'false');
ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
