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
}
}
 class ASTMaker extends AbstractParseTreeVisitor<AST> implements simpleCalcVisitor<AST> {
public AST visitStart(simpleCalcParser.StartContext ctx){
	return null;//TODO implement m
};

public AST visitOneStat(simpleCalcParser.OneStatContext ctx){
	return null;//TODO implement me
};

public AST visitMultiStat(simpleCalcParser.MultiStatContext ctx){
	return null;//TODO implement me
};

public AST visitIf_else_stat(simpleCalcParser.If_else_statContext ctx){
	return null;//TODO implement me
};

public AST visitIf_stat(simpleCalcParser.If_statContext ctx){
	return null;//TODO implement me
};

public AST visitWhile_stat(simpleCalcParser.While_statContext ctx){
	return null;//TODO implement me
};

public AST visitAssign(simpleCalcParser.AssignContext ctx){
	return null;//TODO implement me
};

public AST visitUnary(simpleCalcParser.UnaryContext ctx){
	return null;//TODO implement me
};

public AST visitParenthCondition(simpleCalcParser.ParenthConditionContext ctx){
	return null;//TODO implement me
};

public AST visitNotCondition(simpleCalcParser.NotConditionContext ctx){
	return null;//TODO implement me
};

public AST visitAndCondition(simpleCalcParser.AndConditionContext ctx){
	return null;//TODO implement me
};

public AST visitOrCondition(simpleCalcParser.OrConditionContext ctx){
	return null;//TODO implement me
};

public AST visitEquals(simpleCalcParser.EqualsContext ctx){
	return null;//TODO implement me
};

public AST visitNotEquals(simpleCalcParser.NotEqualsContext ctx){
	return null;//TODO implement me
};

public AST visitLessThan(simpleCalcParser.LessThanContext ctx){
	return null;//TODO implement me
};

public AST visitGreaterThan(simpleCalcParser.GreaterThanContext ctx){
	return null;//TODO implement me
};

public AST visitLessThanOrEqual(simpleCalcParser.LessThanOrEqualContext ctx){
	return null;//TODO implement me
};

public AST visitGeaterThanOrEqual(simpleCalcParser.GeaterThanOrEqualContext ctx){
	return null;//TODO implement me
};

public AST visitTrueCondition(simpleCalcParser.TrueConditionContext ctx){
	return null;//TODO implement me
};

public AST visitFalseCondition(simpleCalcParser.FalseConditionContext ctx){
	return null;//TODO implement me
};

public AST visitVariable(simpleCalcParser.VariableContext ctx){
	return null;//TODO implement me
};

public AST visitIncrement_Postfix(simpleCalcParser.Increment_PostfixContext ctx){
	return null;//TODO implement me
};

public AST visitDecrement_Postfix(simpleCalcParser.Decrement_PostfixContext ctx){
	return null;//TODO implement me
};

public AST visitIncrement_Prefix(simpleCalcParser.Increment_PrefixContext ctx){
	return null;//TODO implement me
};

public AST visitDecrement_Prefix(simpleCalcParser.Decrement_PrefixContext ctx){
	return null;//TODO implement me
};

public AST visitConstant(simpleCalcParser.ConstantContext ctx){
	return null;//TODO implement me
};

public AST visitMultiplication(simpleCalcParser.MultiplicationContext ctx){
	return null;//TODO implement me
};

public AST visitDivision(simpleCalcParser.DivisionContext ctx){
	return null;//TODO implement me
};

public AST visitAddition(simpleCalcParser.AdditionContext ctx){
	return null;//TODO implement me
};

public AST visitSubtraction(simpleCalcParser.SubtractionContext ctx){
	return null;//TODO implement me
};

public AST visitParenthesis(simpleCalcParser.ParenthesisContext ctx){
	return null;//TODO implement me
};

public AST visitSignedConstant_Minus(simpleCalcParser.SignedConstant_MinusContext ctx){
	return null;//TODO implement me
};

public AST visitSignedConstant_Plus(simpleCalcParser.SignedConstant_PlusContext ctx){
	return null;//TODO implement me
};


}
