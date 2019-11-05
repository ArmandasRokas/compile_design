// Generated from interpreter.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link interpreterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface interpreterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link interpreterParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(interpreterParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Single}
	 * labeled alternative in {@link interpreterParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle(interpreterParser.SingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link interpreterParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(interpreterParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link interpreterParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(interpreterParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Conditional}
	 * labeled alternative in {@link interpreterParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(interpreterParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link interpreterParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(interpreterParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(interpreterParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(interpreterParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LevelTwo}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelTwo(interpreterParser.LevelTwoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(interpreterParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LevelOne}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelOne(interpreterParser.LevelOneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Disjunction}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(interpreterParser.DisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisCondition}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisCondition(interpreterParser.ParenthesisConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(interpreterParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(interpreterParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Conjunction}
	 * labeled alternative in {@link interpreterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(interpreterParser.ConjunctionContext ctx);
}