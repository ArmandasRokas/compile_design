import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException{

	// we expect exactly one argument: the name of the input file
	if (args.length!=1) {
	    System.err.println("\n");
	    System.err.println("=================\n\n");
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];

	// open the input file
	CharStream input = CharStreams.fromFileName(filename);
	    //new ANTLRFileStream (filename); // depricated
	
	// create a lexer/scanner
	jsonLexer lex = new jsonLexer(input);
	
	// get the stream of tokens from the scanner
	CommonTokenStream tokens = new CommonTokenStream(lex);
	
	// create a parser
	jsonParser parser = new jsonParser(tokens);
	
	// and parse anything from the grammar for "start"
	ParseTree parseTree = parser.start();

	// Instead of the interpreter, we have now a maker for an
	// Abstract Syntax Tree (AST) that we define right after this class.
	ASTMaker astmaker = new ASTMaker();
	AST ast=astmaker.visit(parseTree);

	String s=ast.translate();
	if (s.equals(""))
	    System.out.println("This is where the output is supposed to be\n");
	else
	    System.out.println(s);
	/* Suggested way to do it: implement the translate function in ast to produce a more meaningful string than "", so it is output here instead. */

    }
}


class ASTMaker extends AbstractParseTreeVisitor<AST> implements jsonVisitor<AST> {
    public AST visitStart(jsonParser.StartContext ctx){
        List<JsonObject> objs = new ArrayList<JsonObject>();
        for(jsonParser.ObjectContext o: ctx.os){
            objs.add((JsonObject) visit(o));
        }        
        return new Start(objs);
    }

    public AST visitObject(jsonParser.ObjectContext ctx){
        List<Pair> pairs = new ArrayList<Pair>();
        for(jsonParser.PairContext pair: ctx.pairs().pair()){
            pairs.add((Pair) visit(pair));
        }        
        return new JsonObject(pairs);
    }
    public AST visitPair(jsonParser.PairContext ctx){
        return new Pair(ctx.STRING().getText(), (Value) visit(ctx.value()));
    }   
    
    public AST visitStringValue(jsonParser.StringValueContext ctx){
        return new StringValue(ctx.STRING().getText());
    }
    public AST visitNumberValue(jsonParser.NumberValueContext ctx){
        return new NumberValue(ctx.NUMS().getText());
    }
    public AST visitObjectValue(jsonParser.ObjectValueContext ctx){
        return new ObjectValue((JsonObject) visit(ctx.object()));
    }

    public AST visitPairs(jsonParser.PairsContext ctx){
        // This function should not be called
        return null;
    }
}
