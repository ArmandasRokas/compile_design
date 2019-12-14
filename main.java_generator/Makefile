antlr4 = java -jar /usr/local/lib/antlr-4.7.2-complete.jar
SRCFILES = main.java AST.java
GENERATED = mgListener.java mgBaseListener.java mgParser.java mgBaseVisitor.java mgVisitor.java mgLexer.java

all:
	make main.class

main.class:	$(SRCFILES) $(GENERATED) mg.g4
	javac  -Xlint:unchecked  $(SRCFILES) $(GENERATED)

mgListener.java:	mg.g4
	$(antlr4) -visitor mg.g4

test:	main.class
	java main coco_input.txt > coco_output.java
	cat coco_output.java

clean:
	rm -f *.class
	rm -f $(GENERATED)
	rm -f *.tokens
	rm -f *.interp
