// Generated from mg.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mgParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, RULE=6, ALTERNATIVE=7, WHITESPACE=8, 
		COMMENT=9, COMMENT2=10, JAVACODE=11;
	public static final int
		RULE_start = 0, RULE_grammarDef = 1, RULE_grammarRule = 2, RULE_alternatives = 3, 
		RULE_alternative = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "grammarDef", "grammarRule", "alternatives", "alternative"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "';'", "':'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "ID", "RULE", "ALTERNATIVE", "WHITESPACE", 
			"COMMENT", "COMMENT2", "JAVACODE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "mg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public GrammarDefContext gd;
		public GrammarRuleContext grammarRule;
		public List<GrammarRuleContext> gRules = new ArrayList<GrammarRuleContext>();
		public TerminalNode EOF() { return getToken(mgParser.EOF, 0); }
		public GrammarDefContext grammarDef() {
			return getRuleContext(GrammarDefContext.class,0);
		}
		public List<GrammarRuleContext> grammarRule() {
			return getRuleContexts(GrammarRuleContext.class);
		}
		public GrammarRuleContext grammarRule(int i) {
			return getRuleContext(GrammarRuleContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mgListener ) ((mgListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mgListener ) ((mgListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mgVisitor ) return ((mgVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((StartContext)_localctx).gd = grammarDef();
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(11);
				((StartContext)_localctx).grammarRule = grammarRule();
				((StartContext)_localctx).gRules.add(((StartContext)_localctx).grammarRule);
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(16);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarDefContext extends ParserRuleContext {
		public Token id;
		public TerminalNode ID() { return getToken(mgParser.ID, 0); }
		public GrammarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mgListener ) ((mgListener)listener).enterGrammarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mgListener ) ((mgListener)listener).exitGrammarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mgVisitor ) return ((mgVisitor<? extends T>)visitor).visitGrammarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarDefContext grammarDef() throws RecognitionException {
		GrammarDefContext _localctx = new GrammarDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			((GrammarDefContext)_localctx).id = match(ID);
			setState(20);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarRuleContext extends ParserRuleContext {
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
	 
		public GrammarRuleContext() { }
		public void copyFrom(GrammarRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OneGrammarRuleContext extends GrammarRuleContext {
		public Token id;
		public TerminalNode RULE() { return getToken(mgParser.RULE, 0); }
		public TerminalNode ID() { return getToken(mgParser.ID, 0); }
		public OneGrammarRuleContext(GrammarRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mgListener ) ((mgListener)listener).enterOneGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mgListener ) ((mgListener)listener).exitOneGrammarRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mgVisitor ) return ((mgVisitor<? extends T>)visitor).visitOneGrammarRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiGrammarRulesContext extends GrammarRuleContext {
		public Token id;
		public AlternativesContext as;
		public TerminalNode ID() { return getToken(mgParser.ID, 0); }
		public AlternativesContext alternatives() {
			return getRuleContext(AlternativesContext.class,0);
		}
		public MultiGrammarRulesContext(GrammarRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mgListener ) ((mgListener)listener).enterMultiGrammarRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mgListener ) ((mgListener)listener).exitMultiGrammarRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mgVisitor ) return ((mgVisitor<? extends T>)visitor).visitMultiGrammarRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRuleContext grammarRule() throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grammarRule);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new OneGrammarRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				((OneGrammarRuleContext)_localctx).id = match(ID);
				setState(23);
				match(RULE);
				}
				break;
			case 2:
				_localctx = new MultiGrammarRulesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				((MultiGrammarRulesContext)_localctx).id = match(ID);
				setState(25);
				match(T__2);
				setState(26);
				((MultiGrammarRulesContext)_localctx).as = alternatives();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlternativesContext extends ParserRuleContext {
		public AlternativeContext alternative;
		public List<AlternativeContext> as = new ArrayList<AlternativeContext>();
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public AlternativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternatives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mgListener ) ((mgListener)listener).enterAlternatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mgListener ) ((mgListener)listener).exitAlternatives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mgVisitor ) return ((mgVisitor<? extends T>)visitor).visitAlternatives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativesContext alternatives() throws RecognitionException {
		AlternativesContext _localctx = new AlternativesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alternatives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			((AlternativesContext)_localctx).alternative = alternative();
			((AlternativesContext)_localctx).as.add(((AlternativesContext)_localctx).alternative);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(30);
				match(T__3);
				setState(31);
				((AlternativesContext)_localctx).alternative = alternative();
				((AlternativesContext)_localctx).as.add(((AlternativesContext)_localctx).alternative);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlternativeContext extends ParserRuleContext {
		public Token id;
		public TerminalNode ALTERNATIVE() { return getToken(mgParser.ALTERNATIVE, 0); }
		public TerminalNode ID() { return getToken(mgParser.ID, 0); }
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mgListener ) ((mgListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mgListener ) ((mgListener)listener).exitAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mgVisitor ) return ((mgVisitor<? extends T>)visitor).visitAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alternative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ALTERNATIVE);
			setState(40);
			((AlternativeContext)_localctx).id = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r-\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\36\n\4\3\5\3\5\3\5\7\5#\n\5\f\5\16"+
		"\5&\13\5\3\5\3\5\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2*\2\f\3\2\2\2\4"+
		"\24\3\2\2\2\6\35\3\2\2\2\b\37\3\2\2\2\n)\3\2\2\2\f\16\5\4\3\2\r\17\5\6"+
		"\4\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\22\3\2"+
		"\2\2\22\23\7\2\2\3\23\3\3\2\2\2\24\25\7\3\2\2\25\26\7\7\2\2\26\27\7\4"+
		"\2\2\27\5\3\2\2\2\30\31\7\7\2\2\31\36\7\b\2\2\32\33\7\7\2\2\33\34\7\5"+
		"\2\2\34\36\5\b\5\2\35\30\3\2\2\2\35\32\3\2\2\2\36\7\3\2\2\2\37$\5\n\6"+
		"\2 !\7\6\2\2!#\5\n\6\2\" \3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3"+
		"\2\2\2&$\3\2\2\2\'(\7\4\2\2(\t\3\2\2\2)*\7\t\2\2*+\7\7\2\2+\13\3\2\2\2"+
		"\5\20\35$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}