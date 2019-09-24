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
		T__9=10, T__10=11, T__11=12, OP=13, CONDOP=14, BOOLCON=15, ID=16, FLOAT=17, 
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
			"T__9", "T__10", "T__11", "OP", "CONDOP", "BOOLCON", "ID", "FLOAT", "ALPHA", 
			"NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'if'", "'('", "')'", "'else'", "'='", "';'", "'*'", 
			"'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "OP", "CONDOP", "BOOLCON", "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17W\n\17\3\20\3\20\3\20\3\20\5\20]\n\20\3\21\3\21\3"+
		"\21\7\21b\n\21\f\21\16\21e\13\21\3\22\6\22h\n\22\r\22\16\22i\3\22\3\22"+
		"\6\22n\n\22\r\22\16\22o\5\22r\n\22\3\23\3\23\3\24\3\24\3\25\6\25y\n\25"+
		"\r\25\16\25z\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0083\n\26\f\26\16\26"+
		"\u0086\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0090\n\27\f"+
		"\27\16\27\u0093\13\27\3\27\3\27\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30\3\2\n\4\2--//\4\2>>@@\t\2C\\aac|\u00c7\u00c8\u00da\u00da"+
		"\u00e7\u00e8\u00fa\u00fa\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2"+
		"\61\61\2\u00a6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r:"+
		"\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27G\3\2\2\2\31"+
		"I\3\2\2\2\33K\3\2\2\2\35V\3\2\2\2\37\\\3\2\2\2!^\3\2\2\2#g\3\2\2\2%s\3"+
		"\2\2\2\'u\3\2\2\2)x\3\2\2\2+~\3\2\2\2-\u0089\3\2\2\2/\60\7}\2\2\60\4\3"+
		"\2\2\2\61\62\7\177\2\2\62\6\3\2\2\2\63\64\7k\2\2\64\65\7h\2\2\65\b\3\2"+
		"\2\2\66\67\7*\2\2\67\n\3\2\2\289\7+\2\29\f\3\2\2\2:;\7g\2\2;<\7n\2\2<"+
		"=\7u\2\2=>\7g\2\2>\16\3\2\2\2?@\7?\2\2@\20\3\2\2\2AB\7=\2\2B\22\3\2\2"+
		"\2CD\7,\2\2D\24\3\2\2\2EF\7\61\2\2F\26\3\2\2\2GH\7-\2\2H\30\3\2\2\2IJ"+
		"\7/\2\2J\32\3\2\2\2KL\t\2\2\2L\34\3\2\2\2MN\7?\2\2NW\7?\2\2OP\7#\2\2P"+
		"W\7?\2\2QW\t\3\2\2RS\7>\2\2SW\7?\2\2TU\7@\2\2UW\7?\2\2VM\3\2\2\2VO\3\2"+
		"\2\2VQ\3\2\2\2VR\3\2\2\2VT\3\2\2\2W\36\3\2\2\2XY\7~\2\2Y]\7~\2\2Z[\7("+
		"\2\2[]\7(\2\2\\X\3\2\2\2\\Z\3\2\2\2] \3\2\2\2^c\5%\23\2_b\5%\23\2`b\5"+
		"\'\24\2a_\3\2\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\"\3\2\2\2e"+
		"c\3\2\2\2fh\5\'\24\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jq\3\2\2\2"+
		"km\7\60\2\2ln\5\'\24\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2"+
		"\2qk\3\2\2\2qr\3\2\2\2r$\3\2\2\2st\t\4\2\2t&\3\2\2\2uv\t\5\2\2v(\3\2\2"+
		"\2wy\t\6\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\25"+
		"\2\2}*\3\2\2\2~\177\7\61\2\2\177\u0080\7\61\2\2\u0080\u0084\3\2\2\2\u0081"+
		"\u0083\n\7\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0088\b\26\2\2\u0088,\3\2\2\2\u0089\u008a\7\61\2\2\u008a\u008b\7,\2\2"+
		"\u008b\u0091\3\2\2\2\u008c\u0090\n\b\2\2\u008d\u008e\7,\2\2\u008e\u0090"+
		"\n\t\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0095\7,\2\2\u0095\u0096\7\61\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\b\27\2\2\u0098.\3\2\2\2\16\2V\\acioqz\u0084\u008f\u0091\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}