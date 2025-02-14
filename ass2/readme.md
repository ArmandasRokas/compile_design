<div align="right">
    <p>13/11/2019</p> 
<p>Armandas Rokas (s185144) 
</p>
</div>

</br>
</br>
</br>

<center><h1>
    Compile design 
    </h1> 
    <p> Assignment 2: Syntax and Parsing</p>


</br>
</br>
</br>
</br>

 <h2> Table of contents </h2>
[TOC]


 <div style="page-break-after: always;"></div>
### Task 1

#### Guide

- `make bigtest` in **coco.v1_task1**

#### Code documentation

In this task basically only the `translate()` functions in  `AST.java` are implemented. 

##### translate() in Start

Loops all `datatypedefs` and concatenates to the output string and returns it. 
##### translate() in DataTypeDef
Loops all `alternatives` and concatenates to the output string and return it.
##### translate(AST parent) in Alternative

The implementation of the `translate` function in `Alternative` class is a bit different , because it requires `dataTypeName` and `functionHead` from `DataTypeDef` in order to concatenate class definitions for all alternatives.  Therefore `AST parent`parameter was defined in the function. This requires the parent node, so that it can be used to get these values. Moreover the function loops arguments three times in order to create attributes and a constructor. Finally the implementation of method is added to the output and everything is returned to the parent. 

##### translate() in Argument

Returns the concatenated string of the argument type and name. 


#### Conclusion
The correctness of `AST.java` was confirmed by `test` and `bigtest`. The both tests did produced the expected results. 
#### Limitations of coco
The limitation of this coco is that only one function head can be used for a datatype. That means it is not possible for example to define both `eval()` and `check()` functions in one datatype. However this out of the scope of this assignment. 
 <div style="page-break-after: always;"></div>
### Task 2

#### Guide
-  `make coco` in **coco.v1_task1** directory

#### Code documentation

- Summary of modified and created files:
  - created the **coco.v1_task2** directory that is just a copy of **coco.v1_task1**, but later modified in order to run generated `AST_output.java`
  - created `coco.coco` in coco syntax in **coco.v1_task2** directory
  - modified `main.java` in the **coco.v1_task2** directory
  - modified `Makefile`  both in **coco.v1_task1** and **coco.v1_task2** directory

##### coco.coco

In the `coco.coco`  four algebraic datatypes are defined: `Start`, `DataTypeDef`, `Alternative` and `Argument`. All these types has one implementation. The implementation has  `-Impl` postfix. 

 `coco.coco` basically is used to generate `AST_output.java` in  **coco.v1_task2**  directory. 

##### main.java in coco.v1_task2

As described above generated classes in `AST_output.java` has different names than in the original `AST.java` like `StartImpl` instead of `Start` and so on. So therefore `main.java` is modified according to this e.g. `new StartImpl` in stead of `new Start`. 

##### Makefile in coco.v1_task1 directory
`coco` command is added in order to  generate `AST_output.java` from `coco.coco` and execute `bigtest` by using it. Like so:

```
// Snippet from Makefile in coco.v1_task1

coco: main.class
	java main ../coco.v1_task2/coco.coco > ../coco.v1_task2/AST_output.java
	cd ../coco.v1_task2 ; make bigtest
```


##### Makefile in coco.v1_task2 directory

Modified to use `AST_output.java` instead of `AST.java` . 

#### Conclusion

The correctness of `AST_output.java` was confirmed by `bigtest` that was executed in  **coco.v1_task2** directory. The test did produced the expected result. 
 <div style="page-break-after: always;"></div>
### Task 3

Yes, the functional language developed in week 6 can be described as coco-file.  

##### Classes that couldn't be generated 

All classes could be generated by coco expect these: 

- `enum Type`
- `Environment`
- `FunEnvironment`
- `faux`

##### Additional classes

The coco would generate additional abstract classes for all data types that has only one alternative. Among these are:

- `FunAbstract`
- `ValueAbstract` 
- `TypeIDAbstract`
- `StartAbstract`

However, it is possible to implement `coco`  so that it doesn't generate these classes by adding extra logic that checks how many alternatives the data type has. If it has only one so  the data type extends directly `AST` and the implementation is inside that class.

##### Additional changes

Yes, `ast` variable in `main.java` would need to be casted to `Start` type, because abstract `AST` class wouldn't contain `eval()` function declaration in a generated file. 



