// Generated from regex.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link regexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface regexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link regexParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(regexParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(regexParser.NumContext ctx);
}