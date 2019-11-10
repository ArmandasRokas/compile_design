// Generated from json.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jsonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jsonParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(jsonParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsonParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(jsonParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsonParser#pairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairs(jsonParser.PairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link jsonParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(jsonParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link jsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(jsonParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberValue}
	 * labeled alternative in {@link jsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(jsonParser.NumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link jsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(jsonParser.ObjectValueContext ctx);
}