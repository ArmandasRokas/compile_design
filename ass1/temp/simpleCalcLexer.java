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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, OP=9, 
		ID=10, FLOAT=11, ALPHA=12, NUM=13, WHITESPACE=14, COMMENT=15, COMMENT2=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "OP", 
			"ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "OP", "ID", "FLOAT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\7\139\n\13\f\13\16\13<\13\13\3\f\6\f?\n\f\r\f\16\f@\3\f\3\f\6"+
		"\fE\n\f\r\f\16\fF\5\fI\n\f\3\r\3\r\3\16\3\16\3\17\6\17P\n\17\r\17\16\17"+
		"Q\3\17\3\17\3\20\3\20\3\20\3\20\7\20Z\n\20\f\20\16\20]\13\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21g\n\21\f\21\16\21j\13\21\3\21\3\21"+
		"\3\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22\3\2\t\4\2--//\t\2C\\aac|\u00c7\u00c8\u00da"+
		"\u00da\u00e7\u00e8\u00fa\u00fa\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\3\2"+
		",,\3\2\61\61\2x\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2"+
		"\2\2\17/\3\2\2\2\21\61\3\2\2\2\23\63\3\2\2\2\25\65\3\2\2\2\27>\3\2\2\2"+
		"\31J\3\2\2\2\33L\3\2\2\2\35O\3\2\2\2\37U\3\2\2\2!`\3\2\2\2#$\7?\2\2$\4"+
		"\3\2\2\2%&\7=\2\2&\6\3\2\2\2\'(\7,\2\2(\b\3\2\2\2)*\7\61\2\2*\n\3\2\2"+
		"\2+,\7-\2\2,\f\3\2\2\2-.\7/\2\2.\16\3\2\2\2/\60\7*\2\2\60\20\3\2\2\2\61"+
		"\62\7+\2\2\62\22\3\2\2\2\63\64\t\2\2\2\64\24\3\2\2\2\65:\5\31\r\2\669"+
		"\5\31\r\2\679\5\33\16\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;"+
		"\3\2\2\2;\26\3\2\2\2<:\3\2\2\2=?\5\33\16\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2"+
		"\2@A\3\2\2\2AH\3\2\2\2BD\7\60\2\2CE\5\33\16\2DC\3\2\2\2EF\3\2\2\2FD\3"+
		"\2\2\2FG\3\2\2\2GI\3\2\2\2HB\3\2\2\2HI\3\2\2\2I\30\3\2\2\2JK\t\3\2\2K"+
		"\32\3\2\2\2LM\t\4\2\2M\34\3\2\2\2NP\t\5\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2"+
		"\2\2QR\3\2\2\2RS\3\2\2\2ST\b\17\2\2T\36\3\2\2\2UV\7\61\2\2VW\7\61\2\2"+
		"W[\3\2\2\2XZ\n\6\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2"+
		"\2][\3\2\2\2^_\b\20\2\2_ \3\2\2\2`a\7\61\2\2ab\7,\2\2bh\3\2\2\2cg\n\7"+
		"\2\2de\7,\2\2eg\n\b\2\2fc\3\2\2\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2ik\3\2\2\2jh\3\2\2\2kl\7,\2\2lm\7\61\2\2mn\3\2\2\2no\b\21\2\2o\"\3"+
		"\2\2\2\f\28:@FHQ[fh\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}