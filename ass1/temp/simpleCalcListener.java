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
	 * Enter a parse tree produced by the {@code OneStat}
	 * labeled alternative in {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 */
	void enterOneStat(simpleCalcParser.OneStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneStat}
	 * labeled alternative in {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 */
	void exitOneStat(simpleCalcParser.OneStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiStat}
	 * labeled alternative in {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 */
	void enterMultiStat(simpleCalcParser.MultiStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiStat}
	 * labeled alternative in {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 */
	void exitMultiStat(simpleCalcParser.MultiStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If_else_stat}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_stat(simpleCalcParser.If_else_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If_else_stat}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_stat(simpleCalcParser.If_else_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If_stat}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(simpleCalcParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If_stat}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(simpleCalcParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While_stat}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(simpleCalcParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While_stat}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(simpleCalcParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterUnary(simpleCalcParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitUnary(simpleCalcParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEquals(simpleCalcParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEquals(simpleCalcParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(simpleCalcParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(simpleCalcParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNotCondition(simpleCalcParser.NotConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNotCondition(simpleCalcParser.NotConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanOrEqual}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqual(simpleCalcParser.LessThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanOrEqual}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqual(simpleCalcParser.LessThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(simpleCalcParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(simpleCalcParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterFalseCondition(simpleCalcParser.FalseConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitFalseCondition(simpleCalcParser.FalseConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterParenthCondition(simpleCalcParser.ParenthConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitParenthCondition(simpleCalcParser.ParenthConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterTrueCondition(simpleCalcParser.TrueConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitTrueCondition(simpleCalcParser.TrueConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOrCondition(simpleCalcParser.OrConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOrCondition(simpleCalcParser.OrConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeaterThanOrEqual}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGeaterThanOrEqual(simpleCalcParser.GeaterThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeaterThanOrEqual}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGeaterThanOrEqual(simpleCalcParser.GeaterThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEquals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNotEquals(simpleCalcParser.NotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEquals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNotEquals(simpleCalcParser.NotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(simpleCalcParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(simpleCalcParser.AndConditionContext ctx);
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
	 * Enter a parse tree produced by the {@code Increment_Prefix}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_Prefix(simpleCalcParser.Increment_PrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Increment_Prefix}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_Prefix(simpleCalcParser.Increment_PrefixContext ctx);
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
	 * Enter a parse tree produced by the {@code Decrement_Postfix}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDecrement_Postfix(simpleCalcParser.Decrement_PostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decrement_Postfix}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDecrement_Postfix(simpleCalcParser.Decrement_PostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decrement_Prefix}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDecrement_Prefix(simpleCalcParser.Decrement_PrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decrement_Prefix}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDecrement_Prefix(simpleCalcParser.Decrement_PrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignedConstant_Plus}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSignedConstant_Plus(simpleCalcParser.SignedConstant_PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignedConstant_Plus}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSignedConstant_Plus(simpleCalcParser.SignedConstant_PlusContext ctx);
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
	 * Enter a parse tree produced by the {@code Increment_Postfix}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_Postfix(simpleCalcParser.Increment_PostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Increment_Postfix}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_Postfix(simpleCalcParser.Increment_PostfixContext ctx);
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
	 * Enter a parse tree produced by the {@code SignedConstant_Minus}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSignedConstant_Minus(simpleCalcParser.SignedConstant_MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignedConstant_Minus}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSignedConstant_Minus(simpleCalcParser.SignedConstant_MinusContext ctx);
}