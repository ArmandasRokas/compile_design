grammar json;

start   : js=json EOF ;

json : object 
     | array
     ;

object : '{' pairs '}';

pairs : pair (',' pair)* ;

pair : STRING  ':' value ;

value:  STRING          #StringValue
        | NUMS          #NumberValue
        | object        #ObjectValue
        ;
// Lexer
//NAME    : '"' ALPHA (ALPHA|NUM)* '"' ;
STRING : '"' ~["]* '"' ;
VALUE : ALPHA (ALPHA|NUM)*;
ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUMS : NUM+;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
