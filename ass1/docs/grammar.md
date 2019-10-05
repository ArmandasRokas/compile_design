

### Language

```
void myfunction(number a, text b){
	
	number c = 2;
	number d = 4;
	while(a < 4){
		if(d == 4){
			a = a - 1;
		}
	}
	while(c < 0)
		c = c - 1;
	
}
```




### Gramma
```gramma
start: (fs+=function)*

function: type ID '(' parameters? ')' block;

paramters: parameter(',' formalParameter)*

parameter: type ID

block: '{' stat* '}';

stat: 'while' '(' exp ')' stat
	| 'if' '(' exp ')' stat
	| block
	| assign;

type: 'number'
    | 'text';


```



### My last 

```
block: '{' stat* '}';

stat: 'while' '(' condition ')' stat 
	| 'if' '(' condition ')' stat ('else' stat)?
	| block
	| assign;

condition:
        exp ('==' | '!=' | '<' | '>' | '<=' | '>=') exp         
        | condition '&&' condition        
        | condition '||' condition        
        ;
```







