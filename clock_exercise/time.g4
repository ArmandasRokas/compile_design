grammar time;

start   : t=TIME EOF ;

TIME   : HOUR ':' MIN  ; 
HOUR :  (NUM | '0'NUM | '1'NUM | '2'('0'..'3')) ;
MIN :  ('0'..'5')('0'..'9');
NUM: ('0'..'9') ;

HVIDERUM : [ \n\t\r]+ -> skip;
KOMMENTAR  : '//'~[\n]*  -> skip;
KOMMENTAR2 : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
