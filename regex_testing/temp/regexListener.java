// Generated from regex.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link regexParser}.
 */
public interface regexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link regexParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(regexParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(regexParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(regexParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(regexParser.NumContext ctx);
}