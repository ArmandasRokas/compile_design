// Generated from simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleCalcParser}.
 */
public interface simpleCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(simpleCalcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(simpleCalcParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(simpleCalcParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(simpleCalcParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(simpleCalcParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(simpleCalcParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(simpleCalcParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(simpleCalcParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(simpleCalcParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(simpleCalcParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(simpleCalcParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(simpleCalcParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(simpleCalcParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOr(simpleCalcParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOr(simpleCalcParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRelational(simpleCalcParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRelational(simpleCalcParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNot(simpleCalcParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNot(simpleCalcParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(simpleCalcParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(simpleCalcParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAnd(simpleCalcParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAnd(simpleCalcParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDivision(simpleCalcParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDivision(simpleCalcParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSignedConstant(simpleCalcParser.SignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSignedConstant(simpleCalcParser.SignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEquality(simpleCalcParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEquality(simpleCalcParser.EqualityContext ctx);
}