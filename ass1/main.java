import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.*;

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

	// An environment mapping variablenames to double values (initially empty) 
	public static HashMap<String,Double> env = new HashMap<String, Double>();

    	public Double visitStart(simpleCalcParser.StartContext ctx){	
		visit(ctx.b);
	    	return visit(ctx.e);
    	};


    	public Double visitOneStat(simpleCalcParser.OneStatContext ctx){ 
		return visit(ctx.s);
		//return Double.valueOf(-1); 
	};

    	public Double visitMultiStat(simpleCalcParser.MultiStatContext ctx){ 
	    	// Visit all statements
	    	for(simpleCalcParser.StatContext s: ctx.ss){
			visit(s);
	    	}
	    	return Double.valueOf(-1); 
	};


    	public Double visitParenthesis(simpleCalcParser.ParenthesisContext ctx){
		return visit(ctx.e);
    	};
    
    	public Double visitVariable(simpleCalcParser.VariableContext ctx){
		// Look up the value of the variable in the environment env:
		String varname = ctx.x.getText();
		Double d = env.get(varname);
		if (d==null){
			System.err.println("Variable " + varname + " is not defined. \n");
			System.exit(-1);
		}
	    	return d;
    	};
    
    	public Double visitAssign(simpleCalcParser.AssignContext ctx){ 
		String varname = ctx.x.getText();
		Double v = visit(ctx.e);
		env.put(varname, v);
		return v; 
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


    public Double visitEquals(simpleCalcParser.EqualsContext ctx){ 
	    if(visit(ctx.e1).equals(visit(ctx.e2))){
		return Double.parseDouble("1");
	    } else {
		return Double.parseDouble("0");
	    }
    };
    //public Double visitBlock(simpleCalcParser.BlockContext ctx){ return Double.valueOf(-1); };

    public Double visitStat(simpleCalcParser.StatContext ctx){ return Double.valueOf(-1); };

    public Double visitCondition(simpleCalcParser.ConditionContext ctx){ 
	    return Double.valueOf(-1); 
    };

    public Double visitBoolCondition(simpleCalcParser.BoolConditionContext ctx){ return Double.valueOf(-1); };

    public Double visitSignedConstant(simpleCalcParser.SignedConstantContext ctx){ return Double.valueOf(-1); };
	
    public Double visitAndCondition(simpleCalcParser.AndConditionContext ctx){ return Double.valueOf(-1); };

    public Double visitOrCondition(simpleCalcParser.OrConditionContext ctx){ return Double.valueOf(-1); };

    public Double visitNotCondition(simpleCalcParser.NotConditionContext ctx){ return Double.valueOf(-1); };
    
    public Double visitParenthCondition(simpleCalcParser.ParenthConditionContext ctx){ return Double.valueOf(-1); };

    public Double visitBoolConst(simpleCalcParser.BoolConstContext ctx){ return Double.valueOf(-1); };
    public Double visitIf_stat(simpleCalcParser.If_statContext ctx){ 
	    Double c = visit(ctx.c);
	    if(c.equals(1.0)){
		return visit(ctx.b1);
	    } else {
		return visit(ctx.b2);
	    }
	    //return Double.valueOf(-1); 
    };


    public Double visitWhile_stat(simpleCalcParser.While_statContext ctx){ return Double.valueOf(-1); };
}

