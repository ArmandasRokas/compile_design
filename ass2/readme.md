### Task 2

#### Guide
- run `make coco` in **coco.v1_task1** directory

#### Code documentation

- Created `coco.coco`  that defines abstract tree for AST_output.java. 

  There are made additional folder `coco.v1_task2` that contains all the same files from `coco.v1_task1`, but instead uses genereted AST_outout.java from `coco.coco`. There are made some changes in `main.java` too, because genereted `AST_output.java` uses different naming conventions e.g. `StartImpl` instead of `Start`, . Because Compiler comiler requues to define abstract type and give some alternatives. It does not make so much sense when there is only one alternative. But in order to make more consistent it left like this.   