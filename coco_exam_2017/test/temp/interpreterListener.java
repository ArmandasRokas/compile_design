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
	 * Enter a parse tree produced by the {@code Array}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArray(interpreterParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArray(interpreterParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(interpreterParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(interpreterParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(interpreterParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(interpreterParser.AdditionContext ctx);
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
	 * Enter a parse tree produced by the {@code ConcatArray}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConcatArray(interpreterParser.ConcatArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatArray}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConcatArray(interpreterParser.ConcatArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyArray}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArray(interpreterParser.EmptyArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyArray}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArray(interpreterParser.EmptyArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparison(interpreterParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link interpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparison(interpreterParser.ComparisonContext ctx);
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
}