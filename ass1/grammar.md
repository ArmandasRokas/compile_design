

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
block: '{' stat* '}';

stat: 'while' '(' exp ')' stat
	| 'if' '(' exp ')' stat
	| block
	| assign;

type: 'number'
    | 'text';


```



condition: e1=exp '&&' e2=exp   # AndBoolConnect
        | e1=exp '||' e2=exp    # OrBoolConnect
        ;



```
start: (fs+=function)*

function: type ID '(' parameters? ')' block;

paramters: parameter(',' formalParameter)*

parameter: type ID
```





