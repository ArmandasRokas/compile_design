// Generated from mg.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, RULE=6, ALTERNATIVE=7, WHITESPACE=8, 
		COMMENT=9, COMMENT2=10, JAVACODE=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "ID", "RULE", "ALTERNATIVE", "WHITESPACE", 
			"COMMENT", "COMMENT2", "JAVACODE"
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


	public mgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mg.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u0085\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\7\6*\n\6\f\6\16\6-\13\6\3\7\3\7\6\7\61\n\7\r\7\16\7\62\3\7\3"+
		"\7\3\b\3\b\3\b\5\b:\n\b\7\b<\n\b\f\b\16\b?\13\b\3\b\3\b\3\t\6\tD\n\t\r"+
		"\t\16\tE\3\t\3\t\3\n\3\n\3\n\3\n\7\nN\n\n\f\n\16\nQ\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13[\n\13\f\13\16\13^\13\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\fm\n\f\f\f\16\fp\13\f\3\f"+
		"\7\fs\n\f\f\f\16\fv\13\f\3\f\7\fy\n\f\f\f\16\f|\13\f\3\f\7\f\177\n\f\f"+
		"\f\16\f\u0082\13\f\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\3\2\13\5\2C\\aac|\b\2\62;>>@@C\\aac|\5\2%%<=~~\5\2%%<<~"+
		"~\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61\4\2}}\177\177\2\u0093\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31"+
		"\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r.\3\2\2\2\17="+
		"\3\2\2\2\21C\3\2\2\2\23I\3\2\2\2\25T\3\2\2\2\27d\3\2\2\2\31\32\7i\2\2"+
		"\32\33\7t\2\2\33\34\7c\2\2\34\35\7o\2\2\35\36\7o\2\2\36\37\7c\2\2\37 "+
		"\7t\2\2 \4\3\2\2\2!\"\7=\2\2\"\6\3\2\2\2#$\7<\2\2$\b\3\2\2\2%&\7~\2\2"+
		"&\n\3\2\2\2\'+\t\2\2\2(*\t\3\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2"+
		"\2,\f\3\2\2\2-+\3\2\2\2.\60\7<\2\2/\61\n\4\2\2\60/\3\2\2\2\61\62\3\2\2"+
		"\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7=\2\2\65\16\3\2\2"+
		"\2\66:\n\5\2\2\678\7~\2\28:\7~\2\29\66\3\2\2\29\67\3\2\2\2:<\3\2\2\2;"+
		"9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7%\2\2A"+
		"\20\3\2\2\2BD\t\6\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2"+
		"\2GH\b\t\2\2H\22\3\2\2\2IJ\7\61\2\2JK\7\61\2\2KO\3\2\2\2LN\n\7\2\2ML\3"+
		"\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\b\n\2\2S\24"+
		"\3\2\2\2TU\7\61\2\2UV\7,\2\2V\\\3\2\2\2W[\n\b\2\2XY\7,\2\2Y[\n\t\2\2Z"+
		"W\3\2\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2"+
		"\2_`\7,\2\2`a\7\61\2\2ab\3\2\2\2bc\b\13\2\2c\26\3\2\2\2d\u0080\7}\2\2"+
		"e\177\n\n\2\2fz\7}\2\2gy\n\n\2\2ht\7}\2\2is\n\n\2\2jn\7}\2\2km\n\n\2\2"+
		"lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qs\7\177\2"+
		"\2ri\3\2\2\2rj\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2"+
		"\2wy\7\177\2\2xg\3\2\2\2xh\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2"+
		"\2\2|z\3\2\2\2}\177\7\177\2\2~e\3\2\2\2~f\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0084\7\177\2\2\u0084\30\3\2\2\2\22\2+\629=EOZ\\nrtxz~\u0080\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}