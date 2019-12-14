import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class main {
public static void main(String[] args) throws IOException{
if (args.length!=1) {
System.exit(-1);
}
String filename=args[0];
CharStream input = CharStreams.fromFileName(filename);
 simpleCalcLexer lex = new simpleCalcLexer(input);
CommonTokenStream tokens = new CommonTokenStream(lex);
 simpleCalcParser parser = new simpleCalcParser(tokens);
ParseTree parseTree = parser.start();
ASTMaker astmaker = new ASTMaker();
AST ast=astmaker.visit(parseTree);
System.out.println("The result is: "+ast.eval(new Environment()));
}
}
 class ASTMaker extends AbstractParseTreeVisitor<AST> implements simpleCalcVisitor<AST> {
public AST visitStart(simpleCalcParser.StartContext ctx){	List<Assign> as=new ArrayList<Assign>();
	
	for (simpleCalcParser.AssignContext a:ctx.as)
	    as.add((Assign) visit(a)); 

	return new Start(as,(Expr) visit(ctx.e));};

public AST visitAssign(simpleCalcParser.AssignContext ctx){	String varname=ctx.x.getText();
	Expr e=(Expr)visit(ctx.e);

	return new Assign(varname,e);};

public AST visitVariable(simpleCalcParser.VariableContext ctx){	String varname=ctx.x.getText();
	return new Variable(varname);};

public AST visitConstant(simpleCalcParser.ConstantContext ctx){	return new Constant(Double.parseDouble(ctx.c.getText())); };

public AST visitMultiplication(simpleCalcParser.MultiplicationContext ctx){	Expr e1=(Expr)visit(ctx.e1);
	Expr e2=(Expr)visit(ctx.e2);
	
	return new Multiplication(e1,e2);};

public AST visitDivision(simpleCalcParser.DivisionContext ctx){        Expr e1 = (Expr) visit(ctx.e1); // can be new Addition, Constant etc.
        Expr e2 = (Expr) visit(ctx.e2);
        return new Division(e1,e2);};

public AST visitAddition(simpleCalcParser.AdditionContext ctx){	Expr e1=(Expr)visit(ctx.e1);
	Expr e2=(Expr)visit(ctx.e2);
	
	if (ctx.op.getText().equals("+"))
	    return new Addition(e1,e2);
	else
	    return new Subtraction(e1,e2);};

public AST visitParenthesis(simpleCalcParser.ParenthesisContext ctx){	return visit(ctx.e);};

public AST visitSignedConstant(simpleCalcParser.SignedConstantContext ctx){		return new Constant(Double.parseDouble(ctx.getText()));};
}


