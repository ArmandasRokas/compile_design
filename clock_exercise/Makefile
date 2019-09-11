antlr4 = java -jar /usr/local/lib/antlr-4.7.2-complete.jar
SRCFILES = main.java
GENERATED = timeListener.java timeBaseListener.java timeParser.java timeBaseVisitor.java timeVisitor.java timeLexer.java

all:
	make main.class

main.class:	$(SRCFILES) $(GENERATED) time.g4
	javac  $(SRCFILES) $(GENERATED)

datoListener.java:	time.g4
	$(antlr4) -visitor dato.g4

test:	main.class
	java main time_input.txt
