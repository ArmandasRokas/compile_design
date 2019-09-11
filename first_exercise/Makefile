antlr4 = java -jar /usr/local/lib/antlr-4.7-complete.jar
SRCFILES = main.java
GENERATED = datoListener.java datoBaseListener.java datoParser.java datoBaseVisitor.java datoVisitor.java datoLexer.java

all:
	make main.class

main.class:	$(SRCFILES) $(GENERATED) dato.g4
	javac  $(SRCFILES) $(GENERATED)

datoListener.java:	dato.g4
	$(antlr4) -visitor dato.g4

test:	main.class
	java main dato_input.txt
