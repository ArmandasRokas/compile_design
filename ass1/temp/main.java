import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;

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
	simpleCalcLexer lex = new simpleCalcLexer(input);
	
	// get the stream of tokens from the scanner
	CommonTokenStream tokens = new CommonTokenStream(lex);
	
	// create a parser
	simpleCalcParser parser = new simpleCalcParser(tokens);
	
	// and parse anything from the grammar for "start"
	ParseTree parseTree = parser.start();

	// Construct an interpreter and run it on the parse tree
	Interpreter interpreter = new Interpreter();
	Double result=interpreter.visit(parseTree);
	
	System.out.println("The result is: "+result);
    }
}

// We write an interpreter that implements interface
// "simpleCalcVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Double.

class Interpreter extends AbstractParseTreeVisitor<Double> implements simpleCalcVisitor<Double> {

    public Double visitStart(simpleCalcParser.StartContext ctx){
	return visit(ctx.e);
    };

    public Double visitParenthesis(simpleCalcParser.ParenthesisContext ctx){
	return visit(ctx.e);
    };
    
    public Double visitVariable(simpleCalcParser.VariableContext ctx){
	System.err.println("Variables are not yet supported -- replacing by -1.0.\n");
	return Double.valueOf(-1.0);
	//return Double.valueOf(ctx.x.e.getText()); //not working
    };
    
    public Double visitAddition(simpleCalcParser.AdditionContext ctx){
//	if (ctx.op.getText().equals("+"))
	    return visit(ctx.e1)+visit(ctx.e2);
//	else
//	    return visit(ctx.e1)-visit(ctx.e2 );	    
    };

    public Double visitSubtraction(simpleCalcParser.SubtractionContext ctx){
	return visit(ctx.e1)-visit(ctx.e2);
    }

    public Double visitMultiplication(simpleCalcParser.MultiplicationContext ctx){
	return visit(ctx.e1)*visit(ctx.e2);
    };

    public Double visitDivision(simpleCalcParser.DivisionContext ctx){
	return visit(ctx.e1)/visit(ctx.e2);
    }

    public Double visitConstant(simpleCalcParser.ConstantContext ctx){
	return Double.parseDouble(ctx.f.getText()); 
    };

    public Double visitAssign(simpleCalcParser.AssignContext ctx){ return Double.valueOf(-1); };

    public Double visitBlock(simpleCalcParser.BlockContext ctx){ return Double.valueOf(-1); };

    public Double visitStat(simpleCalcParser.StatContext ctx){ return Double.valueOf(-1); };

    public Double visitCondition(simpleCalcParser.ConditionContext ctx){ return Double.valueOf(-1); };

    public Double visitSignedConstant(simpleCalcParser.SignedConstantContext ctx){ return Double.valueOf(-1); };
    
}

