// Generated from simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OneStat}
	 * labeled alternative in {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneStat(simpleCalcParser.OneStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiStat}
	 * labeled alternative in {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiStat(simpleCalcParser.MultiStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If_else_stat}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_stat(simpleCalcParser.If_else_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If_stat}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(simpleCalcParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While_stat}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(simpleCalcParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(simpleCalcParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(simpleCalcParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(simpleCalcParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCondition(simpleCalcParser.NotConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanOrEqual}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqual(simpleCalcParser.LessThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(simpleCalcParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseCondition(simpleCalcParser.FalseConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthCondition(simpleCalcParser.ParenthConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueCondition(simpleCalcParser.TrueConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCondition(simpleCalcParser.OrConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeaterThanOrEqual}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeaterThanOrEqual(simpleCalcParser.GeaterThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEquals}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEquals(simpleCalcParser.NotEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link simpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCondition(simpleCalcParser.AndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(simpleCalcParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(simpleCalcParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Increment_Prefix}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_Prefix(simpleCalcParser.Increment_PrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decrement_Postfix}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement_Postfix(simpleCalcParser.Decrement_PostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decrement_Prefix}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement_Prefix(simpleCalcParser.Decrement_PrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignedConstant_Plus}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedConstant_Plus(simpleCalcParser.SignedConstant_PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(simpleCalcParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Increment_Postfix}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_Postfix(simpleCalcParser.Increment_PostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(simpleCalcParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignedConstant_Minus}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedConstant_Minus(simpleCalcParser.SignedConstant_MinusContext ctx);
}