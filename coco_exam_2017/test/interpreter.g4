grammar interpreter;

start  : e=expr EOF ;

expr : e1=expr '*' e2=expr # Multiplication
    | e1=expr '+' e2=expr  # Addition
    | e1=expr '==' e2=expr # Comparison
    | NUM            # Constant
    | ID             # Variable
    | '[' ']'        # EmptyArray
    | '[' expr (',' expr)* ']' # Array
    | e1=expr '++' e2=expr # ConcatArray
    ; 

ID   : ALPHA (ALPHA|NUM)* ;
ALPHA: [a-zA-Z_ÆØÅæøå] ;
NUM  : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
