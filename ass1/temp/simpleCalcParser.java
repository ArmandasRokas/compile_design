// Generated from simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		OP=18, CONDOP=19, BOOLCON=20, ID=21, FLOAT=22, BOOL=23, ALPHA=24, NUM=25, 
		WHITESPACE=26, COMMENT=27, COMMENT2=28;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_stat = 2, RULE_condition = 3, RULE_exp = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "stat", "condition", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'if'", "'('", "')'", "'else'", "'while'", "'='", 
			"';'", "'!'", "'&&'", "'||'", "'=='", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "OP", "CONDOP", "BOOLCON", "ID", 
			"FLOAT", "BOOL", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
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
	public String getGrammarFileName() { return "simpleCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public BlockContext b;
		public ExpContext e;
		public TerminalNode EOF() { return getToken(simpleCalcParser.EOF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((StartContext)_localctx).b = block();
			setState(11);
			((StartContext)_localctx).e = exp(0);
			setState(12);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OneStatContext extends BlockContext {
		public StatContext s;
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public OneStatContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterOneStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitOneStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitOneStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiStatContext extends BlockContext {
		public StatContext stat;
		public List<StatContext> ss = new ArrayList<StatContext>();
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public MultiStatContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterMultiStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitMultiStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitMultiStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__6:
			case ID:
				_localctx = new OneStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				((OneStatContext)_localctx).s = stat();
				}
				break;
			case T__0:
				_localctx = new MultiStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(T__0);
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << ID))) != 0)) {
					{
					{
					setState(16);
					((MultiStatContext)_localctx).stat = stat();
					((MultiStatContext)_localctx).ss.add(((MultiStatContext)_localctx).stat);
					}
					}
					setState(21);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(22);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If_statContext extends StatContext {
		public ConditionContext c;
		public BlockContext b1;
		public BlockContext b2;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public If_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatContext {
		public Token x;
		public ExpContext e;
		public TerminalNode ID() { return getToken(simpleCalcParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class While_statContext extends StatContext {
		public ConditionContext c;
		public BlockContext b1;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new If_statContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(T__2);
				setState(26);
				match(T__3);
				setState(27);
				((If_statContext)_localctx).c = condition(0);
				setState(28);
				match(T__4);
				{
				setState(29);
				((If_statContext)_localctx).b1 = block();
				}
				setState(30);
				match(T__5);
				{
				setState(31);
				((If_statContext)_localctx).b2 = block();
				}
				}
				break;
			case T__6:
				_localctx = new While_statContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(T__6);
				setState(34);
				match(T__3);
				setState(35);
				((While_statContext)_localctx).c = condition(0);
				setState(36);
				match(T__4);
				setState(37);
				((While_statContext)_localctx).b1 = block();
				}
				break;
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				((AssignContext)_localctx).x = match(ID);
				setState(40);
				match(T__7);
				setState(41);
				((AssignContext)_localctx).e = exp(0);
				setState(42);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualsContext extends ConditionContext {
		public ExpContext e1;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public EqualsContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolConstContext extends ConditionContext {
		public Token b;
		public TerminalNode BOOL() { return getToken(simpleCalcParser.BOOL, 0); }
		public BoolConstContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterBoolConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitBoolConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitBoolConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotConditionContext extends ConditionContext {
		public ConditionContext c;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public NotConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterNotCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitNotCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitNotCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthConditionContext extends ConditionContext {
		public ConditionContext c;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ParenthConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterParenthCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitParenthCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitParenthCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrConditionContext extends ConditionContext {
		public ConditionContext c1;
		public ConditionContext c2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public OrConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterOrCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitOrCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitOrCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolConditionContext extends ConditionContext {
		public ExpContext ce1;
		public Token co;
		public ExpContext ce2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode CONDOP() { return getToken(simpleCalcParser.CONDOP, 0); }
		public BoolConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterBoolCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitBoolCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitBoolCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndConditionContext extends ConditionContext {
		public ConditionContext c1;
		public ConditionContext c2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public AndConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAndCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAndCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitAndCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new BoolConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(47);
				((BoolConstContext)_localctx).b = match(BOOL);
				}
				break;
			case 2:
				{
				_localctx = new BoolConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				((BoolConditionContext)_localctx).ce1 = exp(0);
				setState(49);
				((BoolConditionContext)_localctx).co = match(CONDOP);
				setState(50);
				((BoolConditionContext)_localctx).ce2 = exp(0);
				}
				break;
			case 3:
				{
				_localctx = new ParenthConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(T__3);
				setState(53);
				((ParenthConditionContext)_localctx).c = condition(0);
				setState(54);
				match(T__4);
				}
				break;
			case 4:
				{
				_localctx = new NotConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(T__9);
				setState(57);
				((NotConditionContext)_localctx).c = condition(4);
				}
				break;
			case 5:
				{
				_localctx = new EqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				((EqualsContext)_localctx).e1 = exp(0);
				setState(59);
				match(T__12);
				setState(60);
				((EqualsContext)_localctx).e2 = exp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						((AndConditionContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(64);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(65);
						match(T__10);
						setState(66);
						((AndConditionContext)_localctx).c2 = condition(4);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						((OrConditionContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(67);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(68);
						match(T__11);
						setState(69);
						((OrConditionContext)_localctx).c2 = condition(3);
						}
						break;
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesisContext extends ExpContext {
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenthesisContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends ExpContext {
		public ExpContext e1;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MultiplicationContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends ExpContext {
		public ExpContext e1;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AdditionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpContext {
		public Token x;
		public TerminalNode ID() { return getToken(simpleCalcParser.ID, 0); }
		public VariableContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends ExpContext {
		public ExpContext e1;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SubtractionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantContext extends ExpContext {
		public Token f;
		public TerminalNode FLOAT() { return getToken(simpleCalcParser.FLOAT, 0); }
		public ConstantContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExpContext {
		public ExpContext e1;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public DivisionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SignedConstantContext extends ExpContext {
		public Token op;
		public Token f;
		public TerminalNode OP() { return getToken(simpleCalcParser.OP, 0); }
		public TerminalNode FLOAT() { return getToken(simpleCalcParser.FLOAT, 0); }
		public SignedConstantContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterSignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitSignedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitSignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(76);
				((VariableContext)_localctx).x = match(ID);
				}
				break;
			case FLOAT:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				((ConstantContext)_localctx).f = match(FLOAT);
				}
				break;
			case T__3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(T__3);
				setState(79);
				((ParenthesisContext)_localctx).e = exp(0);
				setState(80);
				match(T__4);
				}
				break;
			case OP:
				{
				_localctx = new SignedConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				((SignedConstantContext)_localctx).op = match(OP);
				setState(83);
				((SignedConstantContext)_localctx).f = match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExpContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(86);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(87);
						match(T__13);
						setState(88);
						((MultiplicationContext)_localctx).e2 = exp(7);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpContext(_parentctx, _parentState));
						((DivisionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(89);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(90);
						match(T__14);
						setState(91);
						((DivisionContext)_localctx).e2 = exp(6);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ExpContext(_parentctx, _parentState));
						((AdditionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(92);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(93);
						match(T__15);
						setState(94);
						((AdditionContext)_localctx).e2 = exp(5);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new ExpContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(95);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(96);
						match(T__16);
						setState(97);
						((SubtractionContext)_localctx).e2 = exp(4);
						}
						break;
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 4:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\24\n\3\f\3"+
		"\16\3\27\13\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5I\n\5\f\5\16\5L\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6W\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6e\n\6\f\6\16\6h"+
		"\13\6\3\6\2\4\b\n\7\2\4\6\b\n\2\2\2u\2\f\3\2\2\2\4\31\3\2\2\2\6.\3\2\2"+
		"\2\b@\3\2\2\2\nV\3\2\2\2\f\r\5\4\3\2\r\16\5\n\6\2\16\17\7\2\2\3\17\3\3"+
		"\2\2\2\20\32\5\6\4\2\21\25\7\3\2\2\22\24\5\6\4\2\23\22\3\2\2\2\24\27\3"+
		"\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\32\7"+
		"\4\2\2\31\20\3\2\2\2\31\21\3\2\2\2\32\5\3\2\2\2\33\34\7\5\2\2\34\35\7"+
		"\6\2\2\35\36\5\b\5\2\36\37\7\7\2\2\37 \5\4\3\2 !\7\b\2\2!\"\5\4\3\2\""+
		"/\3\2\2\2#$\7\t\2\2$%\7\6\2\2%&\5\b\5\2&\'\7\7\2\2\'(\5\4\3\2(/\3\2\2"+
		"\2)*\7\27\2\2*+\7\n\2\2+,\5\n\6\2,-\7\13\2\2-/\3\2\2\2.\33\3\2\2\2.#\3"+
		"\2\2\2.)\3\2\2\2/\7\3\2\2\2\60\61\b\5\1\2\61A\7\31\2\2\62\63\5\n\6\2\63"+
		"\64\7\25\2\2\64\65\5\n\6\2\65A\3\2\2\2\66\67\7\6\2\2\678\5\b\5\289\7\7"+
		"\2\29A\3\2\2\2:;\7\f\2\2;A\5\b\5\6<=\5\n\6\2=>\7\17\2\2>?\5\n\6\2?A\3"+
		"\2\2\2@\60\3\2\2\2@\62\3\2\2\2@\66\3\2\2\2@:\3\2\2\2@<\3\2\2\2AJ\3\2\2"+
		"\2BC\f\5\2\2CD\7\r\2\2DI\5\b\5\6EF\f\4\2\2FG\7\16\2\2GI\5\b\5\5HB\3\2"+
		"\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LJ\3\2\2\2MN\b"+
		"\6\1\2NW\7\27\2\2OW\7\30\2\2PQ\7\6\2\2QR\5\n\6\2RS\7\7\2\2SW\3\2\2\2T"+
		"U\7\24\2\2UW\7\30\2\2VM\3\2\2\2VO\3\2\2\2VP\3\2\2\2VT\3\2\2\2Wf\3\2\2"+
		"\2XY\f\b\2\2YZ\7\20\2\2Ze\5\n\6\t[\\\f\7\2\2\\]\7\21\2\2]e\5\n\6\b^_\f"+
		"\6\2\2_`\7\22\2\2`e\5\n\6\7ab\f\5\2\2bc\7\23\2\2ce\5\n\6\6dX\3\2\2\2d"+
		"[\3\2\2\2d^\3\2\2\2da\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\13\3\2\2"+
		"\2hf\3\2\2\2\13\25\31.@HJVdf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}