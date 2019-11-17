import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException{

	// we expect exactly one argument: the name of the input file
	if (args.length!=1) {
	    System.err.println("\n");
	    System.err.println("Simple calculator\n");
	    System.err.println("=================\n\n");
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];

	// open the input file
	CharStream input = CharStreams.fromFileName(filename);
	    //new ANTLRFileStream (filename); // depricated
	
	// create a lexer/scanner
	interpreterLexer lex = new interpreterLexer(input);
	
	// get the stream of tokens from the scanner
	CommonTokenStream tokens = new CommonTokenStream(lex);
	
	// create a parser
	interpreterParser parser = new interpreterParser(tokens);
	
	// and parse anything from the grammar for "start"
	ParseTree parseTree = parser.start();

	// A maker for an Abstract Syntax Tree (AST) 
	ASTMaker astmaker = new ASTMaker();
	AST ast=astmaker.visit(parseTree);

	System.out.println("Type checking in progress...");

	Type t= ((Start) ast).typecheck();

    if (t==null){
	faux.error("Type error\n");
    }
    
    System.out.println("Program is type correct!");
    
    }
}
enum Type{
    INTTYPE, BOOLTYPE, LISTTYPE  
}


class ASTMaker extends AbstractParseTreeVisitor<AST> implements interpreterVisitor<AST> {

    public AST visitStart(interpreterParser.StartContext ctx){
	return new Start((expr)visit(ctx.e)); 
}
 public AST visitMultiplication(interpreterParser.MultiplicationContext ctx){
	return new Multiplication((expr) visit(ctx.e1), (expr) visit(ctx.e2)); 
}
 public AST visitAddition(interpreterParser.AdditionContext ctx){
	return new Addition((expr) visit(ctx.e1), (expr) visit(ctx.e2)); 
}
 public AST visitComparison(interpreterParser.ComparisonContext ctx){
	return new Comparison((expr) visit(ctx.e1), (expr) visit(ctx.e2)); 
}
 public AST visitConstant(interpreterParser.ConstantContext ctx){
	return new Constant(Integer.valueOf(ctx.NUM().getText())); 
}
 public AST visitVariable(interpreterParser.VariableContext ctx){
	return new Variable(ctx.ID().getText()); 
}

public AST visitEmptyArray(interpreterParser.EmptyArrayContext ctx){
	return new EmptyArray(null); 
}

 public AST visitArray(interpreterParser.ArrayContext ctx){
	    List<expr> es = new ArrayList<expr>();
        for(interpreterParser.ExprContext e : ctx.expr()){
	    es.add((expr)visit(e));
	    }
        return new Array(es); 
}
 public AST visitConcatArray(interpreterParser.ConcatArrayContext ctx){
	return new ConcatArray((expr) visit(ctx.e1), (expr) visit(ctx.e2)); 
}
}

