// Generated from interpreter.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class interpreterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, NUM=14, FLOAT=15, ID=16, WHITESPACE=17, 
		COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "NUM", "FLOAT", "ID", "WHITESPACE", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "'int'", "'bool'", "'float'", "','", "'*'", 
			"'+'", "'=='", "'if'", "'then'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NUM", "FLOAT", "ID", "WHITESPACE", "COMMENT"
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


	public interpreterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "interpreter.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\5\17T\n\17\3"+
		"\17\6\17W\n\17\r\17\16\17X\3\20\5\20\\\n\20\3\20\6\20_\n\20\r\20\16\20"+
		"`\3\20\3\20\6\20e\n\20\r\20\16\20f\3\21\6\21j\n\21\r\21\16\21k\3\22\6"+
		"\22o\n\22\r\22\16\22p\3\22\3\22\3\23\3\23\3\23\3\23\7\23y\n\23\f\23\16"+
		"\23|\13\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\5\5\2C\\aac|\5\2\13\f"+
		"\17\17\"\"\3\2\f\f\2\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2"+
		"\2\2\t-\3\2\2\2\13\61\3\2\2\2\r\66\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23"+
		"@\3\2\2\2\25B\3\2\2\2\27E\3\2\2\2\31H\3\2\2\2\33M\3\2\2\2\35S\3\2\2\2"+
		"\37[\3\2\2\2!i\3\2\2\2#n\3\2\2\2%t\3\2\2\2\'(\7*\2\2(\4\3\2\2\2)*\7+\2"+
		"\2*\6\3\2\2\2+,\7?\2\2,\b\3\2\2\2-.\7k\2\2./\7p\2\2/\60\7v\2\2\60\n\3"+
		"\2\2\2\61\62\7d\2\2\62\63\7q\2\2\63\64\7q\2\2\64\65\7n\2\2\65\f\3\2\2"+
		"\2\66\67\7h\2\2\678\7n\2\289\7q\2\29:\7c\2\2:;\7v\2\2;\16\3\2\2\2<=\7"+
		".\2\2=\20\3\2\2\2>?\7,\2\2?\22\3\2\2\2@A\7-\2\2A\24\3\2\2\2BC\7?\2\2C"+
		"D\7?\2\2D\26\3\2\2\2EF\7k\2\2FG\7h\2\2G\30\3\2\2\2HI\7v\2\2IJ\7j\2\2J"+
		"K\7g\2\2KL\7p\2\2L\32\3\2\2\2MN\7g\2\2NO\7n\2\2OP\7u\2\2PQ\7g\2\2Q\34"+
		"\3\2\2\2RT\7/\2\2SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\4\62;\2VU\3\2\2\2WX"+
		"\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\36\3\2\2\2Z\\\7/\2\2[Z\3\2\2\2[\\\3\2\2"+
		"\2\\^\3\2\2\2]_\4\62;\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2"+
		"\2\2bd\7\60\2\2ce\4\62;\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g \3"+
		"\2\2\2hj\t\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\"\3\2\2\2mo"+
		"\t\3\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\b\22\2\2"+
		"s$\3\2\2\2tu\7\61\2\2uv\7\61\2\2vz\3\2\2\2wy\n\4\2\2xw\3\2\2\2y|\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\b\23\2\2~&\3\2\2\2\13\2S"+
		"X[`fkpz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}