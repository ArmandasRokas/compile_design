grammar mg;

/* Compiler-compiler */

start   :  gd=grammarDef gRules+=grammarRule+  EOF ; // 

grammarDef: 'grammar' id=ID ';' ;

grammarRule: id=ID RULE				# OneGrammarRule
			| id=ID ':' as=alternatives # MultiGrammarRules
			;


alternatives: as+=alternative('|' as+=alternative)* ';';
alternative: ALTERNATIVE  id=ID; 


// 'DATA' name=ID 'WITH' fun=JAVACODE '=' as=alternatives ';' ; 

// alternatives of an algebraic data type and concrete syntax for it. 
//alternatives : as+=alternative ('|' as+=alternative)* ;
//alternative  : cons=ID '(' as=arguments ')' code=JAVACODE ;

// an argument consists of a type and a name (both are IDs for the lexer)
//arguments : as+=argument (',' as+=argument)* ;
//argument  : type=ID name=ID ;

ID	   : ('A'..'Z'|'a'..'z'|'_')('A'..'Z'|'a'..'z'|'_'|'0'..'9'|'<'|'>')* ;
RULE   : ':' (~[;:|#])+ ';';
ALTERNATIVE:  ((~[#:|] | '||'))*  '#' ;
WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'(~[\n])* -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
//JAVACODE  : '{' ~[{}]* JAVACODE_NESTED* ~[{}]* JAVACODE_NESTED* ~[{}]*  '}';
JAVACODE   : '{' (  ~[{}]
                 | '{' ( ~[{}]
                       | '{' ( ~[{}]
                             | '{' ~[{}]* '}'
                             )*
                         '}'
                       )*
                   '}'
                 )*
             '}';  // allowing three levels of braces within the JAVA code