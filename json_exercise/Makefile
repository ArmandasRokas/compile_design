compile:
	java -jar /usr/local/lib/antlr-4.7.2-complete.jar -o temp/ -visitor json.g4
	cp main.java temp/
	cp AST.java temp/
	javac temp/*.java
