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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OP=6, ID=7, FLOAT=8, ALPHA=9, 
		NUM=10, WHITESPACE=11, COMMENT=12, COMMENT2=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "OP", "ID", "FLOAT", "ALPHA", 
			"NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "OP", "ID", "FLOAT", "ALPHA", "NUM", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\7\b-\n\b\f\b\16\b\60\13\b\3\t\6\t\63\n\t\r\t\16\t"+
		"\64\3\t\3\t\6\t9\n\t\r\t\16\t:\5\t=\n\t\3\n\3\n\3\13\3\13\3\f\6\fD\n\f"+
		"\r\f\16\fE\3\f\3\f\3\r\3\r\3\r\3\r\7\rN\n\r\f\r\16\rQ\13\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16[\n\16\f\16\16\16^\13\16\3\16\3\16\3\16"+
		"\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\3\2\t\4\2--//\t\2C\\aac|\u00c7\u00c8\u00da\u00da\u00e7\u00e8"+
		"\u00fa\u00fa\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61\2l\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2"+
		"\13%\3\2\2\2\r\'\3\2\2\2\17)\3\2\2\2\21\62\3\2\2\2\23>\3\2\2\2\25@\3\2"+
		"\2\2\27C\3\2\2\2\31I\3\2\2\2\33T\3\2\2\2\35\36\7?\2\2\36\4\3\2\2\2\37"+
		" \7,\2\2 \6\3\2\2\2!\"\7\61\2\2\"\b\3\2\2\2#$\7*\2\2$\n\3\2\2\2%&\7+\2"+
		"\2&\f\3\2\2\2\'(\t\2\2\2(\16\3\2\2\2).\5\23\n\2*-\5\23\n\2+-\5\25\13\2"+
		",*\3\2\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\20\3\2\2\2\60.\3"+
		"\2\2\2\61\63\5\25\13\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65"+
		"\3\2\2\2\65<\3\2\2\2\668\7\60\2\2\679\5\25\13\28\67\3\2\2\29:\3\2\2\2"+
		":8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<\66\3\2\2\2<=\3\2\2\2=\22\3\2\2\2>?\t\3"+
		"\2\2?\24\3\2\2\2@A\t\4\2\2A\26\3\2\2\2BD\t\5\2\2CB\3\2\2\2DE\3\2\2\2E"+
		"C\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\b\f\2\2H\30\3\2\2\2IJ\7\61\2\2JK\7\61"+
		"\2\2KO\3\2\2\2LN\n\6\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2"+
		"\2\2QO\3\2\2\2RS\b\r\2\2S\32\3\2\2\2TU\7\61\2\2UV\7,\2\2V\\\3\2\2\2W["+
		"\n\7\2\2XY\7,\2\2Y[\n\b\2\2ZW\3\2\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\"+
		"]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7,\2\2`a\7\61\2\2ab\3\2\2\2bc\b\16\2"+
		"\2c\34\3\2\2\2\f\2,.\64:<EOZ\\\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}