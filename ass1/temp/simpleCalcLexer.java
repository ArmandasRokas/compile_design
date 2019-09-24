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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, OP=15, CONDOP=16, BOOLCON=17, 
		ID=18, FLOAT=19, ALPHA=20, NUM=21, WHITESPACE=22, COMMENT=23, COMMENT2=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "OP", "CONDOP", "BOOLCON", 
			"ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'if'", "'!'", "'('", "')'", "'else'", "'while'", 
			"'='", "';'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "OP", "CONDOP", "BOOLCON", "ID", "FLOAT", "ALPHA", 
			"NUM", "WHITESPACE", "COMMENT", "COMMENT2"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21c\n\21\3\22\3\22\3\22\3\22\5\22i\n\22\3\23\3\23\3\23\7\23n\n\23\f"+
		"\23\16\23q\13\23\3\24\6\24t\n\24\r\24\16\24u\3\24\3\24\6\24z\n\24\r\24"+
		"\16\24{\5\24~\n\24\3\25\3\25\3\26\3\26\3\27\6\27\u0085\n\27\r\27\16\27"+
		"\u0086\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u008f\n\30\f\30\16\30\u0092"+
		"\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u009c\n\31\f\31\16"+
		"\31\u009f\13\31\3\31\3\31\3\31\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\3\2\n\4\2--//\4\2>>@@\t\2C\\aac|\u00c7\u00c8\u00da"+
		"\u00da\u00e7\u00e8\u00fa\u00fa\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\3\2"+
		",,\3\2\61\61\2\u00b2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2"+
		"\2\2\t:\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21E\3\2\2\2\23K\3\2"+
		"\2\2\25M\3\2\2\2\27O\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35U\3\2\2\2\37W\3"+
		"\2\2\2!b\3\2\2\2#h\3\2\2\2%j\3\2\2\2\'s\3\2\2\2)\177\3\2\2\2+\u0081\3"+
		"\2\2\2-\u0084\3\2\2\2/\u008a\3\2\2\2\61\u0095\3\2\2\2\63\64\7}\2\2\64"+
		"\4\3\2\2\2\65\66\7\177\2\2\66\6\3\2\2\2\678\7k\2\289\7h\2\29\b\3\2\2\2"+
		":;\7#\2\2;\n\3\2\2\2<=\7*\2\2=\f\3\2\2\2>?\7+\2\2?\16\3\2\2\2@A\7g\2\2"+
		"AB\7n\2\2BC\7u\2\2CD\7g\2\2D\20\3\2\2\2EF\7y\2\2FG\7j\2\2GH\7k\2\2HI\7"+
		"n\2\2IJ\7g\2\2J\22\3\2\2\2KL\7?\2\2L\24\3\2\2\2MN\7=\2\2N\26\3\2\2\2O"+
		"P\7,\2\2P\30\3\2\2\2QR\7\61\2\2R\32\3\2\2\2ST\7-\2\2T\34\3\2\2\2UV\7/"+
		"\2\2V\36\3\2\2\2WX\t\2\2\2X \3\2\2\2YZ\7?\2\2Zc\7?\2\2[\\\7#\2\2\\c\7"+
		"?\2\2]c\t\3\2\2^_\7>\2\2_c\7?\2\2`a\7@\2\2ac\7?\2\2bY\3\2\2\2b[\3\2\2"+
		"\2b]\3\2\2\2b^\3\2\2\2b`\3\2\2\2c\"\3\2\2\2de\7~\2\2ei\7~\2\2fg\7(\2\2"+
		"gi\7(\2\2hd\3\2\2\2hf\3\2\2\2i$\3\2\2\2jo\5)\25\2kn\5)\25\2ln\5+\26\2"+
		"mk\3\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p&\3\2\2\2qo\3\2\2\2"+
		"rt\5+\26\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v}\3\2\2\2wy\7\60\2"+
		"\2xz\5+\26\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}w\3\2\2"+
		"\2}~\3\2\2\2~(\3\2\2\2\177\u0080\t\4\2\2\u0080*\3\2\2\2\u0081\u0082\t"+
		"\5\2\2\u0082,\3\2\2\2\u0083\u0085\t\6\2\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\b\27\2\2\u0089.\3\2\2\2\u008a\u008b\7\61\2\2\u008b\u008c\7\61\2"+
		"\2\u008c\u0090\3\2\2\2\u008d\u008f\n\7\2\2\u008e\u008d\3\2\2\2\u008f\u0092"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\b\30\2\2\u0094\60\3\2\2\2\u0095\u0096\7\61"+
		"\2\2\u0096\u0097\7,\2\2\u0097\u009d\3\2\2\2\u0098\u009c\n\b\2\2\u0099"+
		"\u009a\7,\2\2\u009a\u009c\n\t\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a2\7\61"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\31\2\2\u00a4\62\3\2\2\2\16\2bh"+
		"mou{}\u0086\u0090\u009b\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}