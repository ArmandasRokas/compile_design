// Generated from interpreter.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link interpreterParser}.
 */
public interface interpreterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link interpreterParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(interpreterParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(interpreterParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Single}
	 * labeled alternative in {@link interpreterParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterSingle(interpreterParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Single}
	 * labeled alternative in {@link interpreterParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitSingle(interpreterParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link interpreterParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterSequence(interpreterParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link interpreterParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitSequence(interpreterParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link interpreterParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(interpreterParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link interpreterParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(interpreterParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Conditional}
	 * labeled alternative in {@link interpreterParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterConditional(interpreterParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Conditional}
	 * labeled alternative in {@link interpreterParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitConditional(interpreterParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link interpreterParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(interpreterParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link interpreterParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(interpreterParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(interpreterParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(interpreterParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(interpreterParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(interpreterParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LevelTwo}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLevelTwo(interpreterParser.LevelTwoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LevelTwo}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLevelTwo(interpreterParser.LevelTwoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(interpreterParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(interpreterParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LevelOne}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLevelOne(interpreterParser.LevelOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LevelOne}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLevelOne(interpreterParser.LevelOneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Disjunction}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(interpreterParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Disjunction}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(interpreterParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisCondition}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisCondition(interpreterParser.ParenthesisConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisCondition}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisCondition(interpreterParser.ParenthesisConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterNegation(interpreterParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitNegation(interpreterParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterComparison(interpreterParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitComparison(interpreterParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Conjunction}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(interpreterParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Conjunction}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(interpreterParser.ConjunctionContext ctx);
}