

### Task 2

- `make coco` in /coco.v1
- `make test` in /coco.v1._task2

#####  Problems

- Nested brackets
  - Solved: der var stærne to gang ` '{' (JAVACODE_NESTED | ~[{}]* )*  '}'` , men den skulle være kun en gang, sådan: `'{' (JAVACODE_NESTED | ~[{}] )*  '}'`