grammar regex;

start   : expr EOF ;

expr: PERIOD;

PERIOD: DATE '-' DATE;
DATE: YEAR '/' ((MONTH29 '/' DAY29) | (MONTH30 '/' DAY30)  | (MONTH31 '/' DAY31)) ;
YEAR: '20'[0-9][0-9];
MONTH29: '02';
MONTH30: '04' | '06' | '09' | '11' ; 
MONTH31: '01' | '03' | '05' | '07' | '08' | '10' | '12';
MONTH: [0][1-9] | [1][0-2];
DAY29: [0][1-9] | [1-2][0-9];
DAY30: [0][1-9] | [1-2][0-9] | [3][0] ;   
DAY31: [0][1-9] | [1-2][0-9] | [3][0-1] ;  

//STRING: '"' ( [a-z] | [\\]["\\n] )* '"' ;
/ESCAPEDSTRING : '"' ( '""' | ~["\r\n] )* '"';

//expr: HEXDEC;
//HEXDEC : ( [0][xX][0] | [0] | [0][xX][1-9][0-9a-fA-F]* | [1-9][0-9]*);

// Lexer
//NAME    : '"' ALPHA (ALPHA|NUM)* '"' ;
//STRING : '"' ~["]* '"' ;
//VALUE : ALPHA (ALPHA|NUM)*;
//ALPHA : [a-zA-Z_ÆØÅæøå] ;
//NUMS : NUM+;
//NUM   : [0-9] ;




WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
//COMMENT3    : '{-' .*? '-}' -> skip;
COMMENT3    : '{-' (~[-] | '-'~[}])* '-}' -> skip;

