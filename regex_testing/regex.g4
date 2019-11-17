grammar regex;

start   : num EOF ;

num: HEXDEC;

HEXDEC : ( [0][xX][0] | [0] | [0][xX][1-9][0-9a-fA-F]* | [1-9][0-9]*);

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

