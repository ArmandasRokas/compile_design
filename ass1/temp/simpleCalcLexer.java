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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OP=8, ID=9, FLOAT=10, 
		ALPHA=11, NUM=12, WHITESPACE=13, COMMENT=14, COMMENT2=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "OP", "ID", "FLOAT", 
			"ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "OP", "ID", "FLOAT", 
			"ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21l\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n\65\n\n\f"+
		"\n\16\n8\13\n\3\13\6\13;\n\13\r\13\16\13<\3\13\3\13\6\13A\n\13\r\13\16"+
		"\13B\5\13E\n\13\3\f\3\f\3\r\3\r\3\16\6\16L\n\16\r\16\16\16M\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\7\17V\n\17\f\17\16\17Y\13\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20c\n\20\f\20\16\20f\13\20\3\20\3\20\3\20\3\20"+
		"\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21\3\2\t\4\2--//\t\2C\\aac|\u00c7\u00c8\u00da\u00da\u00e7"+
		"\u00e8\u00fa\u00fa\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61"+
		"\2t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3"+
		"\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17-\3\2\2\2\21/\3"+
		"\2\2\2\23\61\3\2\2\2\25:\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33K\3\2\2\2\35"+
		"Q\3\2\2\2\37\\\3\2\2\2!\"\7?\2\2\"\4\3\2\2\2#$\7,\2\2$\6\3\2\2\2%&\7\61"+
		"\2\2&\b\3\2\2\2\'(\7-\2\2(\n\3\2\2\2)*\7/\2\2*\f\3\2\2\2+,\7*\2\2,\16"+
		"\3\2\2\2-.\7+\2\2.\20\3\2\2\2/\60\t\2\2\2\60\22\3\2\2\2\61\66\5\27\f\2"+
		"\62\65\5\27\f\2\63\65\5\31\r\2\64\62\3\2\2\2\64\63\3\2\2\2\658\3\2\2\2"+
		"\66\64\3\2\2\2\66\67\3\2\2\2\67\24\3\2\2\28\66\3\2\2\29;\5\31\r\2:9\3"+
		"\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=D\3\2\2\2>@\7\60\2\2?A\5\31\r\2@"+
		"?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2D>\3\2\2\2DE\3\2\2\2"+
		"E\26\3\2\2\2FG\t\3\2\2G\30\3\2\2\2HI\t\4\2\2I\32\3\2\2\2JL\t\5\2\2KJ\3"+
		"\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\b\16\2\2P\34\3\2\2\2"+
		"QR\7\61\2\2RS\7\61\2\2SW\3\2\2\2TV\n\6\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2"+
		"\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\b\17\2\2[\36\3\2\2\2\\]\7\61\2\2]^"+
		"\7,\2\2^d\3\2\2\2_c\n\7\2\2`a\7,\2\2ac\n\b\2\2b_\3\2\2\2b`\3\2\2\2cf\3"+
		"\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7,\2\2hi\7\61\2\2ij\3"+
		"\2\2\2jk\b\20\2\2k \3\2\2\2\f\2\64\66<BDMWbd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}