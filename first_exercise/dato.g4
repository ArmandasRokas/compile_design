grammar dato;

start   : d=DATO EOF ;

DATO   : DAG '.' MON '.' ; 
DAG :  '0'?('1'..'9') | ('1'|'2')('0'..'9') | '3'('0'..'1') ;
MON :  '0'?('1'..'9') | '1'('0'..'2');


HVIDERUM : [ \n\t\r]+ -> skip;
KOMMENTAR  : '//'~[\n]*  -> skip;
KOMMENTAR2 : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;