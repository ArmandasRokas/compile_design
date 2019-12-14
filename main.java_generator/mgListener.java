// Generated from mg.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mgParser}.
 */
public interface mgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mgParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(mgParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link mgParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(mgParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link mgParser#grammarDef}.
	 * @param ctx the parse tree
	 */
	void enterGrammarDef(mgParser.GrammarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link mgParser#grammarDef}.
	 * @param ctx the parse tree
	 */
	void exitGrammarDef(mgParser.GrammarDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneGrammarRule}
	 * labeled alternative in {@link mgParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterOneGrammarRule(mgParser.OneGrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneGrammarRule}
	 * labeled alternative in {@link mgParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitOneGrammarRule(mgParser.OneGrammarRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiGrammarRules}
	 * labeled alternative in {@link mgParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterMultiGrammarRules(mgParser.MultiGrammarRulesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiGrammarRules}
	 * labeled alternative in {@link mgParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitMultiGrammarRules(mgParser.MultiGrammarRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mgParser#alternatives}.
	 * @param ctx the parse tree
	 */
	void enterAlternatives(mgParser.AlternativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link mgParser#alternatives}.
	 * @param ctx the parse tree
	 */
	void exitAlternatives(mgParser.AlternativesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mgParser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(mgParser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mgParser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(mgParser.AlternativeContext ctx);
}