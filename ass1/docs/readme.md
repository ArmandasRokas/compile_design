##### Opgaver

- Gramma: Make syntax elements for stat and block. 



## Task 1

In order to extend the given calculator with substraction and division there is modified `main.java` and `simpleCalc.g4`. 

In `simpleCalc.g4` there is added division and subtraction syntax elements labeled respectively. Here's these two extra syntax elements added to `exp` rule:

```
exp:
...
| e1=exp '/' e2=exp   # Division
...
| e1=exp '-' e2=exp   # Subtraction
...

```

In `java.main` there is added two methods respectively for visiting a division and subtraction syntax elements:

```java
public Double visitDivision(simpleCalcParser.DivisionContext ctx){
        return visit(ctx.e1)/visit(ctx.e2);
    }
public Double visitDivision(simpleCalcParser.DivisionContext ctx){
        return visit(ctx.e1)/visit(ctx.e2);
    }
```



## Task 2

There is used `Top-Down` strategy to define the draft of the grammar. `Top-down` means that the design should be started from the coarsest to the finest level. [^ANTLR] 

There is chosen `block` to be as the coarsest of the language, thus everything should be inside `block`. One level down there is ` statement`, which can have `while`/`if` declarations or `assignment`. The finest elements are `condition` and `expression`. 

Here's is the grammar of the language [^slides]:

```
BLOCK -> STMT							EXP -> ID
BLOCK -> {STMTS}						EXP -> FLOAT
STMTS -> STMT; STMTS					EXP -> EXP * EXP
STMTS -> empty							EXP -> EXP / EXP
STMT -> ID=EXP							EXP -> EXP + EXP
STMT -> if (COND) BLOCK else BLOCK		EXP -> ( EXP )
STMT -> while (COND) PROG

COND -> 
````

## Task 3

This task was about extending the given calculator to the grammar designed in Task 2. 

In order to do this there are added `block`, `stat`, `condition` parsing rules.

In addition there are added respective methods in `main.java` for visiting these syntax elements which was defined in the grammar.

### Testing the precedence

In order to confirm the precedence of logical operators `AND`,  `OR` and `NOT` in the grammar the parse tree is examined. Here`s the test case:

```c
// Code snippet 1:
1: {
2:    	a=1;
3:      b=2;
4:      c=3;
5:      if(a==1 && !b==5 || c == 3)
6:               c=1;
7:      else
8:               c=2;
9: }
10: c
```



In *Figure 1* is the parse tree of the *Code snippet 1* described above. Since the operands that appears lower in a parse tree than others has higher precedence, so it can be clarified that `NOT` is evaluated before `AND`, and `AND` before `OR`. 





precedence, we can    `!` that is marked with red circle is the most lowest sign in the path that means  `!` evaluated before `&&` and `||` logical operators. 

 The left branch visualize the `if` statement

On left branch

 while the right branch visualize arithmetic expression.  The same is on the right branch, where `*` is lower than `+` in the tree. So this confirms the right precedence in the grammar. 

should be read from bottom to top in order to examine precedence, 

In line 5 there is an conditional statement `if` with a boolean condition inside.  The expected output of the test case is that `!` should be evaluated first, `&&` second and `||` last.





![parse_tree_precedence](pics\parse_tree_precedence.PNG)

*Figure 1: The parse tree that shows precedence of logical operators in the gramma*  

The same technique is used to determine precedence in arithmetic expressions. Here`s the test case with arithmetic expression:

```

```



<strong style="font-size:large"> Bibliography </strong>

[^ANTLR]: Parr Terence, The Definitive ANTLR Reference: Building Domain-specific Languages. ISBN: 0978739256
[^slides]: Slides provided by Sebastian Modersheim
[^MOG]: Mogensen, T.Æ. Introduction to Compiler Design, Edition: 2, ISBN: 3319669664



