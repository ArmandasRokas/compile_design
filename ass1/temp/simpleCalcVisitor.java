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
	 * Visit a parse tree produced by {@link simpleCalcParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(simpleCalcParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(simpleCalcParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(simpleCalcParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(simpleCalcParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(simpleCalcParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(simpleCalcParser.While_statContext ctx);
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
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(simpleCalcParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(simpleCalcParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(simpleCalcParser.NotContext ctx);
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
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(simpleCalcParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(simpleCalcParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedConstant(simpleCalcParser.SignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link simpleCalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(simpleCalcParser.EqualityContext ctx);
}