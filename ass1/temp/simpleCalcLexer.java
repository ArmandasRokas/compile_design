// Generated from simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, EQ=14, NEQ=15, GT=16, LT=17, GTEQ=18, 
		LTEQ=19, OR=20, AND=21, NOT=22, OP=23, CONDOP=24, BOOLCON=25, ID=26, FLOAT=27, 
		BOOL=28, ALPHA=29, NUM=30, WHITESPACE=31, COMMENT=32, COMMENT2=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", 
			"OR", "AND", "NOT", "OP", "CONDOP", "BOOLCON", "ID", "FLOAT", "BOOL", 
			"ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'if'", "'else'", "'{'", "'}'", "'while'", "'*'", 
			"'/'", "'+'", "'-'", "'('", "')'", "'=='", "'!='", "'>'", "'<'", "'>='", 
			"'<='", "'||'", "'&&'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "OR", "AND", "NOT", 
			"OP", "CONDOP", "BOOLCON", "ID", "FLOAT", "BOOL", "ALPHA", "NUM", "WHITESPACE", 
			"COMMENT", "COMMENT2"
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


	public simpleCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00d8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u008b\n\31\3\32"+
		"\3\32\3\32\3\32\5\32\u0091\n\32\3\33\3\33\3\33\7\33\u0096\n\33\f\33\16"+
		"\33\u0099\13\33\3\34\6\34\u009c\n\34\r\34\16\34\u009d\3\34\3\34\6\34\u00a2"+
		"\n\34\r\34\16\34\u00a3\5\34\u00a6\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u00b1\n\35\3\36\3\36\3\37\3\37\3 \6 \u00b8\n \r \16"+
		" \u00b9\3 \3 \3!\3!\3!\3!\7!\u00c2\n!\f!\16!\u00c5\13!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\7\"\u00cf\n\"\f\"\16\"\u00d2\13\"\3\"\3\"\3\"\3\"\3\"\2"+
		"\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#\3\2\n\4\2--//\4\2>>@@\t\2C\\aac|\u00c7\u00c8\u00da\u00da"+
		"\u00e7\u00e8\u00fa\u00fa\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2"+
		"\61\61\2\u00e6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3"+
		"\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tL\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2"+
		"\2\2\21[\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31c\3\2\2\2\33e\3"+
		"\2\2\2\35g\3\2\2\2\37j\3\2\2\2!m\3\2\2\2#o\3\2\2\2%q\3\2\2\2\'t\3\2\2"+
		"\2)w\3\2\2\2+z\3\2\2\2-}\3\2\2\2/\177\3\2\2\2\61\u008a\3\2\2\2\63\u0090"+
		"\3\2\2\2\65\u0092\3\2\2\2\67\u009b\3\2\2\29\u00b0\3\2\2\2;\u00b2\3\2\2"+
		"\2=\u00b4\3\2\2\2?\u00b7\3\2\2\2A\u00bd\3\2\2\2C\u00c8\3\2\2\2EF\7?\2"+
		"\2F\4\3\2\2\2GH\7=\2\2H\6\3\2\2\2IJ\7k\2\2JK\7h\2\2K\b\3\2\2\2LM\7g\2"+
		"\2MN\7n\2\2NO\7u\2\2OP\7g\2\2P\n\3\2\2\2QR\7}\2\2R\f\3\2\2\2ST\7\177\2"+
		"\2T\16\3\2\2\2UV\7y\2\2VW\7j\2\2WX\7k\2\2XY\7n\2\2YZ\7g\2\2Z\20\3\2\2"+
		"\2[\\\7,\2\2\\\22\3\2\2\2]^\7\61\2\2^\24\3\2\2\2_`\7-\2\2`\26\3\2\2\2"+
		"ab\7/\2\2b\30\3\2\2\2cd\7*\2\2d\32\3\2\2\2ef\7+\2\2f\34\3\2\2\2gh\7?\2"+
		"\2hi\7?\2\2i\36\3\2\2\2jk\7#\2\2kl\7?\2\2l \3\2\2\2mn\7@\2\2n\"\3\2\2"+
		"\2op\7>\2\2p$\3\2\2\2qr\7@\2\2rs\7?\2\2s&\3\2\2\2tu\7>\2\2uv\7?\2\2v("+
		"\3\2\2\2wx\7~\2\2xy\7~\2\2y*\3\2\2\2z{\7(\2\2{|\7(\2\2|,\3\2\2\2}~\7#"+
		"\2\2~.\3\2\2\2\177\u0080\t\2\2\2\u0080\60\3\2\2\2\u0081\u0082\7?\2\2\u0082"+
		"\u008b\7?\2\2\u0083\u0084\7#\2\2\u0084\u008b\7?\2\2\u0085\u008b\t\3\2"+
		"\2\u0086\u0087\7>\2\2\u0087\u008b\7?\2\2\u0088\u0089\7@\2\2\u0089\u008b"+
		"\7?\2\2\u008a\u0081\3\2\2\2\u008a\u0083\3\2\2\2\u008a\u0085\3\2\2\2\u008a"+
		"\u0086\3\2\2\2\u008a\u0088\3\2\2\2\u008b\62\3\2\2\2\u008c\u008d\7~\2\2"+
		"\u008d\u0091\7~\2\2\u008e\u008f\7(\2\2\u008f\u0091\7(\2\2\u0090\u008c"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091\64\3\2\2\2\u0092\u0097\5;\36\2\u0093"+
		"\u0096\5;\36\2\u0094\u0096\5=\37\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\66\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\5=\37\2\u009b\u009a\3\2\2"+
		"\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a5"+
		"\3\2\2\2\u009f\u00a1\7\60\2\2\u00a0\u00a2\5=\37\2\u00a1\u00a0\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6"+
		"\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a68\3\2\2\2\u00a7"+
		"\u00a8\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7w\2\2\u00aa\u00b1\7g\2\2"+
		"\u00ab\u00ac\7h\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af"+
		"\7u\2\2\u00af\u00b1\7g\2\2\u00b0\u00a7\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b1"+
		":\3\2\2\2\u00b2\u00b3\t\4\2\2\u00b3<\3\2\2\2\u00b4\u00b5\t\5\2\2\u00b5"+
		">\3\2\2\2\u00b6\u00b8\t\6\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\b \2\2\u00bc@\3\2\2\2\u00bd\u00be\7\61\2\2\u00be\u00bf\7\61\2\2\u00bf"+
		"\u00c3\3\2\2\2\u00c0\u00c2\n\7\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c7\b!\2\2\u00c7B\3\2\2\2\u00c8\u00c9\7\61\2\2"+
		"\u00c9\u00ca\7,\2\2\u00ca\u00d0\3\2\2\2\u00cb\u00cf\n\b\2\2\u00cc\u00cd"+
		"\7,\2\2\u00cd\u00cf\n\t\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7,\2\2\u00d4\u00d5\7\61\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\b\"\2\2\u00d7D\3\2\2\2\17\2\u008a\u0090\u0095"+
		"\u0097\u009d\u00a3\u00a5\u00b0\u00b9\u00c3\u00ce\u00d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}