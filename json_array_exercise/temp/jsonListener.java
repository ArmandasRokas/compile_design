// Generated from json.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jsonParser}.
 */
public interface jsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jsonParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(jsonParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(jsonParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(jsonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(jsonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#pairs}.
	 * @param ctx the parse tree
	 */
	void enterPairs(jsonParser.PairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#pairs}.
	 * @param ctx the parse tree
	 */
	void exitPairs(jsonParser.PairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsonParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(jsonParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsonParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(jsonParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link jsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(jsonParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link jsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(jsonParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link jsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(jsonParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link jsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(jsonParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link jsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(jsonParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link jsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(jsonParser.ObjectValueContext ctx);
}