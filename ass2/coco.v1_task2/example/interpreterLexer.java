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
		T__9=10, T__10=11, T__11=12, OP2=13, OP1=14, CMP=15, ID=16, FLOAT=17, 
		ALPHA=18, NUM=19, WHITESPACE=20, COMMENT=21, COMMENT2=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "OP2", "OP1", "CMP", "ID", "FLOAT", "ALPHA", 
			"NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'if'", "'('", "')'", "'else'", "'while'", 
			"'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "OP2", "OP1", "CMP", "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20_\n\20\3\21\3\21"+
		"\3\21\7\21d\n\21\f\21\16\21g\13\21\3\22\6\22j\n\22\r\22\16\22k\3\22\3"+
		"\22\6\22p\n\22\r\22\16\22q\5\22t\n\22\3\23\3\23\3\24\3\24\3\25\6\25{\n"+
		"\25\r\25\16\25|\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0085\n\26\f\26\16"+
		"\26\u0088\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0092\n\27"+
		"\f\27\16\27\u0095\13\27\3\27\3\27\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30\3\2\13\4\2,,\61\61\4\2--//\4\2>>@@\t\2C\\aac|\u00c7"+
		"\u00c8\u00da\u00da\u00e7\u00e8\u00fa\u00fa\3\2\62;\5\2\13\f\17\17\"\""+
		"\3\2\f\f\3\2,,\3\2\61\61\2\u00a7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2"+
		"\2\13\67\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23C\3\2\2\2\25I\3"+
		"\2\2\2\27K\3\2\2\2\31N\3\2\2\2\33Q\3\2\2\2\35S\3\2\2\2\37^\3\2\2\2!`\3"+
		"\2\2\2#i\3\2\2\2%u\3\2\2\2\'w\3\2\2\2)z\3\2\2\2+\u0080\3\2\2\2-\u008b"+
		"\3\2\2\2/\60\7}\2\2\60\4\3\2\2\2\61\62\7\177\2\2\62\6\3\2\2\2\63\64\7"+
		"?\2\2\64\b\3\2\2\2\65\66\7=\2\2\66\n\3\2\2\2\678\7k\2\289\7h\2\29\f\3"+
		"\2\2\2:;\7*\2\2;\16\3\2\2\2<=\7+\2\2=\20\3\2\2\2>?\7g\2\2?@\7n\2\2@A\7"+
		"u\2\2AB\7g\2\2B\22\3\2\2\2CD\7y\2\2DE\7j\2\2EF\7k\2\2FG\7n\2\2GH\7g\2"+
		"\2H\24\3\2\2\2IJ\7#\2\2J\26\3\2\2\2KL\7(\2\2LM\7(\2\2M\30\3\2\2\2NO\7"+
		"~\2\2OP\7~\2\2P\32\3\2\2\2QR\t\2\2\2R\34\3\2\2\2ST\t\3\2\2T\36\3\2\2\2"+
		"UV\7?\2\2V_\7?\2\2W_\t\4\2\2XY\7>\2\2Y_\7?\2\2Z[\7@\2\2[_\7?\2\2\\]\7"+
		"#\2\2]_\7?\2\2^U\3\2\2\2^W\3\2\2\2^X\3\2\2\2^Z\3\2\2\2^\\\3\2\2\2_ \3"+
		"\2\2\2`e\5%\23\2ad\5%\23\2bd\5\'\24\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec"+
		"\3\2\2\2ef\3\2\2\2f\"\3\2\2\2ge\3\2\2\2hj\5\'\24\2ih\3\2\2\2jk\3\2\2\2"+
		"ki\3\2\2\2kl\3\2\2\2ls\3\2\2\2mo\7\60\2\2np\5\'\24\2on\3\2\2\2pq\3\2\2"+
		"\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sm\3\2\2\2st\3\2\2\2t$\3\2\2\2uv\t\5\2"+
		"\2v&\3\2\2\2wx\t\6\2\2x(\3\2\2\2y{\t\7\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2"+
		"\2|}\3\2\2\2}~\3\2\2\2~\177\b\25\2\2\177*\3\2\2\2\u0080\u0081\7\61\2\2"+
		"\u0081\u0082\7\61\2\2\u0082\u0086\3\2\2\2\u0083\u0085\n\b\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\b\26\2\2\u008a,\3\2\2\2"+
		"\u008b\u008c\7\61\2\2\u008c\u008d\7,\2\2\u008d\u0093\3\2\2\2\u008e\u0092"+
		"\n\t\2\2\u008f\u0090\7,\2\2\u0090\u0092\n\n\2\2\u0091\u008e\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7,\2\2\u0097"+
		"\u0098\7\61\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\27\2\2\u009a.\3\2\2"+
		"\2\r\2^cekqs|\u0086\u0091\u0093\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}