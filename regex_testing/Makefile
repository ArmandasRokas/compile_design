compile:
	java -jar /usr/local/lib/antlr-4.7.2-complete.jar -o temp/ -visitor regex.g4
	cp main.java temp/
	javac temp/*.java
	cd temp/ ; java main ../input.txt
