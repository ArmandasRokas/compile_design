// Generated from regex.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class regexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PERIOD=1, DATE=2, YEAR=3, MONTH29=4, MONTH30=5, MONTH31=6, MONTH=7, DAY29=8, 
		DAY30=9, DAY31=10, ESCAPEDSTRING=11, WHITESPACE=12, COMMENT=13, COMMENT2=14, 
		COMMENT3=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PERIOD", "DATE", "YEAR", "MONTH29", "MONTH30", "MONTH31", "MONTH", "DAY29", 
			"DAY30", "DAY31", "ESCAPEDSTRING", "WHITESPACE", "COMMENT", "COMMENT2", 
			"COMMENT3"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'02'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PERIOD", "DATE", "YEAR", "MONTH29", "MONTH30", "MONTH31", "MONTH", 
			"DAY29", "DAY30", "DAY31", "ESCAPEDSTRING", "WHITESPACE", "COMMENT", 
			"COMMENT2", "COMMENT3"
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


	public regexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "regex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"G\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7W\n\7"+
		"\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t\5\tc\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\nk\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13s\n\13\3\f\3\f\3\f\3\f"+
		"\7\fy\n\f\f\f\16\f|\13\f\3\f\3\f\3\r\6\r\u0081\n\r\r\r\16\r\u0082\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\7\16\u008b\n\16\f\16\16\16\u008e\13\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0098\n\17\f\17\16\17\u009b\13"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a8"+
		"\n\20\f\20\16\20\u00ab\13\20\3\20\3\20\3\20\3\20\3\20\2\2\21\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2"+
		"\21\3\2\62;\3\2\62\62\3\2\63;\3\2\63\63\3\2\62\64\3\2\63\64\3\2\65\65"+
		"\3\2\62\63\5\2\f\f\17\17$$\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61"+
		"\3\2//\3\2\177\177\2\u00c9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\3!\3\2\2\2\5%\3\2\2\2\7\65\3\2\2\2\t;\3\2\2\2\13F\3\2\2\2\rV\3"+
		"\2\2\2\17\\\3\2\2\2\21b\3\2\2\2\23j\3\2\2\2\25r\3\2\2\2\27t\3\2\2\2\31"+
		"\u0080\3\2\2\2\33\u0086\3\2\2\2\35\u0091\3\2\2\2\37\u00a1\3\2\2\2!\"\5"+
		"\5\3\2\"#\7/\2\2#$\5\5\3\2$\4\3\2\2\2%&\5\7\4\2&\63\7\61\2\2\'(\5\t\5"+
		"\2()\7\61\2\2)*\5\21\t\2*\64\3\2\2\2+,\5\13\6\2,-\7\61\2\2-.\5\23\n\2"+
		".\64\3\2\2\2/\60\5\r\7\2\60\61\7\61\2\2\61\62\5\25\13\2\62\64\3\2\2\2"+
		"\63\'\3\2\2\2\63+\3\2\2\2\63/\3\2\2\2\64\6\3\2\2\2\65\66\7\64\2\2\66\67"+
		"\7\62\2\2\678\3\2\2\289\t\2\2\29:\t\2\2\2:\b\3\2\2\2;<\7\62\2\2<=\7\64"+
		"\2\2=\n\3\2\2\2>?\7\62\2\2?G\7\66\2\2@A\7\62\2\2AG\78\2\2BC\7\62\2\2C"+
		"G\7;\2\2DE\7\63\2\2EG\7\63\2\2F>\3\2\2\2F@\3\2\2\2FB\3\2\2\2FD\3\2\2\2"+
		"G\f\3\2\2\2HI\7\62\2\2IW\7\63\2\2JK\7\62\2\2KW\7\65\2\2LM\7\62\2\2MW\7"+
		"\67\2\2NO\7\62\2\2OW\79\2\2PQ\7\62\2\2QW\7:\2\2RS\7\63\2\2SW\7\62\2\2"+
		"TU\7\63\2\2UW\7\64\2\2VH\3\2\2\2VJ\3\2\2\2VL\3\2\2\2VN\3\2\2\2VP\3\2\2"+
		"\2VR\3\2\2\2VT\3\2\2\2W\16\3\2\2\2XY\t\3\2\2Y]\t\4\2\2Z[\t\5\2\2[]\t\6"+
		"\2\2\\X\3\2\2\2\\Z\3\2\2\2]\20\3\2\2\2^_\t\3\2\2_c\t\4\2\2`a\t\7\2\2a"+
		"c\t\2\2\2b^\3\2\2\2b`\3\2\2\2c\22\3\2\2\2de\t\3\2\2ek\t\4\2\2fg\t\7\2"+
		"\2gk\t\2\2\2hi\t\b\2\2ik\t\3\2\2jd\3\2\2\2jf\3\2\2\2jh\3\2\2\2k\24\3\2"+
		"\2\2lm\t\3\2\2ms\t\4\2\2no\t\7\2\2os\t\2\2\2pq\t\b\2\2qs\t\t\2\2rl\3\2"+
		"\2\2rn\3\2\2\2rp\3\2\2\2s\26\3\2\2\2tz\7$\2\2uv\7$\2\2vy\7$\2\2wy\n\n"+
		"\2\2xu\3\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2"+
		"\2\2}~\7$\2\2~\30\3\2\2\2\177\u0081\t\13\2\2\u0080\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\b\r\2\2\u0085\32\3\2\2\2\u0086\u0087\7\61\2\2\u0087\u0088\7\61"+
		"\2\2\u0088\u008c\3\2\2\2\u0089\u008b\n\f\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\16\2\2\u0090\34\3\2\2\2\u0091\u0092"+
		"\7\61\2\2\u0092\u0093\7,\2\2\u0093\u0099\3\2\2\2\u0094\u0098\n\r\2\2\u0095"+
		"\u0096\7,\2\2\u0096\u0098\n\16\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7,\2\2\u009d\u009e\7\61"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\17\2\2\u00a0\36\3\2\2\2\u00a1\u00a2"+
		"\7}\2\2\u00a2\u00a3\7/\2\2\u00a3\u00a9\3\2\2\2\u00a4\u00a8\n\17\2\2\u00a5"+
		"\u00a6\7/\2\2\u00a6\u00a8\n\20\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\7\177"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\20\2\2\u00b0 \3\2\2\2\22\2\63F"+
		"V\\bjrxz\u0082\u008c\u0097\u0099\u00a7\u00a9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}