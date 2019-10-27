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

	System.out.println("Type checking in progress...\n");

	Type t=ast.check(new Environment(), new FunEnvironment());

    if (t==null){
	faux.error("Type error\n");
    }
    
    System.out.println("Program is type correct!\n");
    
    System.out.println("The result is: "+ast.eval(new Environment(), new FunEnvironment()));
    }
}



class ASTMaker extends AbstractParseTreeVisitor<AST> implements interpreterVisitor<AST> {

    public AST visitStart(interpreterParser.StartContext ctx){
	List<Fun> fs=new ArrayList<Fun>();
	for( interpreterParser.FunContext fc : ctx.fun()){
	    fs.add((Fun)visit(fc));
	}
	return new Start(fs,(Expr)visit(ctx.expr())); // For example, if expresion is constant (e.g. 0.2). So the (Expr)visit(ctx.expr()) function will create new Constant(). So when e.eval is called in Start return, so it will call eval() in Consant class, that returns Value and will be used toString method in Value class to print the value to result.  
    };
    
    public AST visitFun(interpreterParser.FunContext ctx){
	List<TypeID> tids=new ArrayList<TypeID>();
	for(interpreterParser.TypeidContext tc : ctx.typeids().typeid()){
	    tids.add((TypeID)visit(tc));
	}
	return new Fun((TypeID)visit(ctx.typeid()), tids,
		       (Expr)visit(ctx.expr() ));
    };
    public AST visitIntegerdec(interpreterParser.IntegerdecContext ctx){
	return new TypeID(Type.INTTYPE,ctx.ID().getText());
    };
    public AST visitBooldec(interpreterParser.BooldecContext ctx){
	return new TypeID(Type.BOOLTYPE,ctx.ID().getText());
    };
    public AST visitFloatdec(interpreterParser.FloatdecContext ctx){
	return new TypeID(Type.FLOATTYPE,ctx.ID().getText()); // *** Modified ** 
    };
    public AST visitTypeids(interpreterParser.TypeidsContext ctx){
	faux.error("This function should not be called.");
	return null;
    };
    
    public AST visitParenthesis(interpreterParser.ParenthesisContext ctx){
	return (Expr) visit(ctx.expr());
    };
    public AST visitMultiplication(interpreterParser.MultiplicationContext ctx){
	return new Multiplication((Expr) visit(ctx.expr(0)), (Expr) visit(ctx.expr(1)));
    };
    public AST visitAddition(interpreterParser.AdditionContext ctx){
	return new Addition((Expr) visit(ctx.expr(0)), (Expr) visit(ctx.expr(1)));
    };
    public AST visitVariable(interpreterParser.VariableContext ctx){ 
	return new Variable(ctx.getText());
    };
    public AST visitComparison(interpreterParser.ComparisonContext ctx){
	return new Comparison((Expr) visit(ctx.expr(0)), (Expr) visit(ctx.expr(1)));
    };
    public AST visitConstant(interpreterParser.ConstantContext ctx){
	return new Constant(new Value(Type.INTTYPE,Integer.parseInt(ctx.getText()))); 
    };
    public AST visitFloatConst(interpreterParser.FloatConstContext ctx){
	return new Constant(new Value(Type.FLOATTYPE,Double.valueOf(ctx.getText()))); 
    };
    public AST visitConditional(interpreterParser.ConditionalContext ctx){
	return new Conditional((Expr) visit(ctx.expr(0)), (Expr) visit(ctx.expr(1)),(Expr) visit(ctx.expr(2)) );
    };
    public AST visitFunctionCall(interpreterParser.FunctionCallContext ctx){
	List<Expr> es=new ArrayList<Expr>();
	for (interpreterParser.ExprContext ec : ctx.exprs().expr())
	    es.add((Expr) visit(ec));
	return new FunctionCall(ctx.ID().getText(),es);
    };
    public AST visitExprs(interpreterParser.ExprsContext ctx){
	faux.error("This function should not be called actually");
	return null;
    };
}

