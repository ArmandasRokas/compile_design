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
}