// Generated from mg.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mgParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mgVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mgParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(mgParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link mgParser#grammarDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarDef(mgParser.GrammarDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OneGrammarRule}
	 * labeled alternative in {@link mgParser#grammarRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneGrammarRule(mgParser.OneGrammarRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiGrammarRules}
	 * labeled alternative in {@link mgParser#grammarRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiGrammarRules(mgParser.MultiGrammarRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link mgParser#alternatives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternatives(mgParser.AlternativesContext ctx);
	/**
	 * Visit a parse tree produced by {@link mgParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(mgParser.AlternativeContext ctx);
}