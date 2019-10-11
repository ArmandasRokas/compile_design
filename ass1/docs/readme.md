<div align="right">
    <p>11/10/2019</p> 
<p>Armandas Rokas (s185144) 
</p>
</div>

</br>
</br>
</br>
</br></br>
</br>
</br>

<center><h1>
    Compile design 
    </h1> 
    <p> Assignment 1: Syntax and Parsing</p>


</br>
</br>
</br>
</br>

 <h2> Table of contents </h2>
[TOC]


 <div style="page-break-after: always;"></div>
## Quick guide to run test cases
In order to run the test examples:
1. `make` in the root path (the path that contains simpleCacl.g4)
2. `cd temp/`
3. run `make` again (in `/temp` directory)



## Task 1: Implementing division and subtraction

In order to extend the given calculator with subtraction and division there are made some modifications in `main.java` and `simpleCalc.g4` files. 

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
        return visit(ctx.e1) / visit(ctx.e2);
    }
public Double visitSubtraction(simpleCalcParser.SubstractionContext ctx){
        return visit(ctx.e1) - visit(ctx.e2);
    }
```



## Task 2: Designing the grammar 

There is used `Top-Down` strategy to define the draft of the grammar. `Top-down` means that the design should be started from the coarsest to the finest level. [^ANTLR] 

There is chosen `block` to be as the coarsest of the language, thus everything should be inside `block`. One level down there is ` statement`, which can have `while`/`if` declarations, `assignment` or `unary operation`. The finest elements are `condition` and `expression`. 

Here's is the grammar of the language [^slides]:

``` 
BLOCK -> STMT							EXP -> ID
BLOCK -> {STMTS}						EXP -> FLOAT
										EXP -> EXP * EXP
STMTS -> STMT; STMTS					EXP -> EXP / EXP
STMTS -> empty							EXP -> EXP + EXP
STMT -> ID = EXP						EXP -> ( EXP )
STMT -> if (COND) BLOCK else BLOCK		EXP -> ++ID
STMT -> while (COND) PROG				EXP -> ID++
STMT -> EXP								EXP -> --ID
										EXP -> ID--

COND -> EXP == EXP						COND -> EXP < EXP		
COND -> EXP != EXP						COND -> EXP > EXP
COND -> COND && COND					COND -> EXP >= EXP
COND -> COND || COND					COND -> EXP <= EXP
````

It is important to notice here that nested blocks aren't allowed in the language. Although it was not a requirement to have them, it could be a nice feature that needs to be considered for later implementations. 

## Task 3: Extending grammar

This task was about extending the given calculator grammar to the grammar designed in Task 2. 

In order to do this there are added `block`, `stat` and `condition` parsing rules and their alternatives are labeled accordingly, so that it would be possible to refer them later in `main.java` language application. 

Here's for example how looks `stat` rule with `If_else_stat`, `If_stat`, `While_stat`, `Assign`, and `Unary` alternatives:

```
stat:
        'if' '(' c=condition  ')' b1=block 'else' b2=block      # If_else_stat
        |  'if' '(' c=condition ')' b1=block                    # If_stat
        | 'while' '(' c=condition ')' b1=block                  # While_stat
        | x=ID '=' e=exp ';'                                    # Assign
        | e=exp ';'                                             # Unary
        ;

```

Notice that `Unary` alternative is used for unary operations like increments and decrements. 

### Testing the precedence

#### Logical operators 

##### Examining a parse tree

In order to confirm the precedence of logical operators `AND`,  `OR` and `NOT` in the grammar the parse tree of the code below is examined:

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

In *Figure 1* is the parse tree of the *Code snippet 1* described above. Since we know that the operands, that has a higher precedence, appear lower in a parse tree than other operands, so it can be concluded that `NOT` is evaluated before `AND`, and `AND` before `OR`.



![parse_tree_precedence](pics\parse_tree_precedence.PNG)

*Figure 1: The parse tree that shows precedence of logical operators in the gramma.*  

#### Arithmetic operators 
##### Examining a parse tree
The same technique is used to determine precedence for arithmetic operators. Here`s the test case for an arithmetic expression:

```c
// Code snippet 2
{
	a=1;
	b=2;
	c=3;
	d=4;
}
d/b+a*c-a*b
```

In the parse tree in *Figure 2* multiply and divide operators appears lower than plus and minus, so it can be concluded that the precedence is correct in the gramma. 

![parse_tree_precedence](pics\parse_tree_precedence_arithmetic.PNG)


*Figure 2: The parse tree that shows precedence of arithmetic operators in the gramma*  

##### Using the simple calculator
The simple calculator is used to confirm the precedence of arithmetic operators. 

The arithmetical expression defined in code snippet above was used as an input to the simple calculator ( `4/2+1*3-1*2` ). The result from calculator was `3` that is equal to the result if the expression was calculated by hand using the precedence rules. So it was another method to confirm that the precedence in the gramma is correct.  
## Task 4: Implementing visitor methods
All visitor methods, that were required by `simpleCalcVisitor` interface, are implemented and tested accordingly. The test cases are placed in `/tests` directory. Below is the list of the visitor methods with a short description of their implementation.
<h3> visitStart() </h3>  
Visits the root block, where all statements are defined,  and return the result of the expression at end of file  
<h3> visitOneStat() </h3>
Visits a statement, which could be one these alternatives: `If_stat`, `While_stat` or `Assign`
<h3> visitMultiStat()</h3>
Loops an array of statements and visits them one by one.
<h3> visitAssign()</h3>
Puts a variable to the environment that is declared as `HashMap` of strings key and doubles values. Variable name is used as key and variable value as value.  
<h3> visitVariable()</h3>
Returns a value of a variable if it exists in the environments. 
<h3> visitParenthesis()</h3>
Visits an expression inside parenthesis by simply ignoring them.
<h3> visitAddition()</h3>
Returns the sum of two expressions.
<h3> visitSubtraction()</h3>
 Returns the difference of two expressions.
 <h3>visitDivision()</h3>
 Returns the quotient of two expressions. 
 <h3>visitConstant()</h3>
 Parses the text and returns double.
 <h3>visitEquals()</h3>
 Returns `1.0` if two expression equals otherwise returns `0.0`
 <h3>visitNotEquals()</h3>
Returns `1.0` if two expression not equals otherwise returns `0.0`
<h3> visitLessThan()</h3>
  Returns `1.0` if the first expression is less than second. Otherwise returns `0.0`
  <h3>visitLessThanOrEqual()</h3>
  Returns `1.0` if the first expression is less than or equal to the second expression. Otherwise returns `0.0`
  <h3>visitGreaterThan()</h3>
  Returns `1.0` if the first expression is greater than second. Otherwise returns `0.0`
  <h3>visitGreaterThanOrEqual()</h3>
  Returns `1.0` if the first expression is greater than or equal to the second expression. Otherwise returns `0.0`
  <h3>visitTrueCondition()</h3>
  Returns double value of `1.0`
  <h3>visitFalseCondition()</h3>
  Returns double value of `0.0`
  <h3>visitAndCondition()</h3>
  Returns `1.0` if first condition and second condition is evaluated to true, otherwise return `0.0`
  <h3>visitNotCondition()</h3>
  Returns `1.0` if a condition is evaluated to false, otherwise returns `0.0`.
  <h3>visitParenthCondition()</h3>
  Visits the condition inside parenthesis by simply ignoring them 
  <h3>visitIf_else_stat()</h3>
  Visits the main block if the condition evaluated to true, otherwise visits the alternative block
  <h3>visitIf_stat()</h3>
  Visits the main block if the condition evaluated to true.
  <h3>visitWhile_stat()</h3>
  Visits the block until the condition is evaluated to true.
  <h3> visitIncrement_Postfix()</h3>
  Increments the value of the variable by one in the environment, but returns **the not incremented value**. 
  <h3> visitIncrement_Prefix()</h3>
  Increments the value of the variable by one in the environment, and **returns the incremented value. **
  Consider the code below:

```c
// Code snippet 2
{
 a = 0;
 b = 1;
 c = b + a++;
}
```
In order to calculate `c` there should be used the incremented value of `a` . It gives that `c` is equal to `1` after execution and `a` is equal to `1` in the environment. 
<h3> visitDecrement_Postfix()</h3>
Decrements the value of the variable by one in the environment, but returns **the not incremented value**.
<h3> visitDecrement_Prefix()</h3>
Decrements the value of the variable by one in the environment and **returns the decremented value. **
<h3> visitSignedConstant_Minus()</h3>
Parses the text and returns minus double value.
<h3> visitSignedConstant_Plus()</h3>
Parses the text and returns double by simply ignoring `+` operator.

## Summary

In this assignment the gramma for the language is designed and implemented using Antlr4 parse generator. Moreover the given simple calculator is extended by implementing visitor methods that relates to the gramma rules, so that the simple calculator could return meaningful results of the given input of the language. Lastly all visitor methods is tested in order to confirm the correct behavior of the application. 

<div style="font-size:18pt; position:relative;  top:50px; font-weight: bold;"> Bibliography </div>
[^ANTLR]: Parr Terence, The Definitive ANTLR Reference: Building Domain-specific Languages. ISBN: 0978739256
[^slides]: Slides provided by Sebastian Modersheim
[^MOG]: Mogensen, T.Æ. Introduction to Compiler Design, Edition: 2, ISBN: 3319669664

