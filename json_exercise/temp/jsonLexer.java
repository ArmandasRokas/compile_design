// Generated from json.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, STRING=5, VALUE=6, ALPHA=7, NUMS=8, NUM=9, 
		WHITESPACE=10, COMMENT=11, COMMENT2=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "STRING", "VALUE", "ALPHA", "NUMS", "NUM", 
			"WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "STRING", "VALUE", "ALPHA", "NUMS", "NUM", 
			"WHITESPACE", "COMMENT", "COMMENT2"
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


	public jsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "json.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6&\n\6\f"+
		"\6\16\6)\13\6\3\6\3\6\3\7\3\7\3\7\7\7\60\n\7\f\7\16\7\63\13\7\3\b\3\b"+
		"\3\t\6\t8\n\t\r\t\16\t9\3\n\3\n\3\13\6\13?\n\13\r\13\16\13@\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\7\fI\n\f\f\f\16\fL\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\rV\n\r\f\r\16\rY\13\r\3\r\3\r\3\r\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\t\3\2$$\t\2C\\aac|\u00c7"+
		"\u00c8\u00da\u00da\u00e7\u00e8\u00fa\u00fa\3\2\62;\5\2\13\f\17\17\"\""+
		"\3\2\f\f\3\2,,\3\2\61\61\2f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37"+
		"\3\2\2\2\t!\3\2\2\2\13#\3\2\2\2\r,\3\2\2\2\17\64\3\2\2\2\21\67\3\2\2\2"+
		"\23;\3\2\2\2\25>\3\2\2\2\27D\3\2\2\2\31O\3\2\2\2\33\34\7}\2\2\34\4\3\2"+
		"\2\2\35\36\7\177\2\2\36\6\3\2\2\2\37 \7.\2\2 \b\3\2\2\2!\"\7<\2\2\"\n"+
		"\3\2\2\2#\'\7$\2\2$&\n\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2"+
		"(*\3\2\2\2)\'\3\2\2\2*+\7$\2\2+\f\3\2\2\2,\61\5\17\b\2-\60\5\17\b\2.\60"+
		"\5\23\n\2/-\3\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2"+
		"\62\16\3\2\2\2\63\61\3\2\2\2\64\65\t\3\2\2\65\20\3\2\2\2\668\5\23\n\2"+
		"\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\22\3\2\2\2;<\t\4\2\2<"+
		"\24\3\2\2\2=?\t\5\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2"+
		"\2BC\b\13\2\2C\26\3\2\2\2DE\7\61\2\2EF\7\61\2\2FJ\3\2\2\2GI\n\6\2\2HG"+
		"\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\b\f\2\2N"+
		"\30\3\2\2\2OP\7\61\2\2PQ\7,\2\2QW\3\2\2\2RV\n\7\2\2ST\7,\2\2TV\n\b\2\2"+
		"UR\3\2\2\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2"+
		"Z[\7,\2\2[\\\7\61\2\2\\]\3\2\2\2]^\b\r\2\2^\32\3\2\2\2\13\2\'/\619@JU"+
		"W\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}