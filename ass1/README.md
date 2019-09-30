- `antlr4 -o temp/ -visitor simpleCalc.g4`
- `cp main.java temp/`
- `javac temp/*.java`
- `cd temp`
- `java main ../simpleCalc_input.txt`
- `grun simpleCalc start -tree -ps tree.ps  < ../simpleCalc_input.txt`

## References
https://stackoverflow.com/questions/15610183/if-else-statements-in-antlr-using-listeners
