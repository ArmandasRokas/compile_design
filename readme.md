- **Visitor error**: `ntlr4 -visitor dato.g4`

- Every time console restarted:
  - `$ export CLASSPATH=".:/usr/local/lib/antlr-4.7.2-complete.jar:$CLASSPATH" `
  - `$ alias antlr4='java -jar /usr/local/lib/antlr-4.7.2-complete.jar' `
  - `$ alias grun='java org.antlr.v4.gui.TestRig'`

- Precedence in the tree reads from bottom-top. That means that what comes first from bottom, it has higher precedence
