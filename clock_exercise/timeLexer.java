// Generated from time.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class timeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIME=1, HOUR=2, MIN=3, NUM=4, HVIDERUM=5, KOMMENTAR=6, KOMMENTAR2=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TIME", "HOUR", "MIN", "NUM", "HVIDERUM", "KOMMENTAR", "KOMMENTAR2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIME", "HOUR", "MIN", "NUM", "HVIDERUM", "KOMMENTAR", "KOMMENTAR2"
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


	public timeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "time.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tE\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\5\3\5\3\6\6\6%\n\6\r\6\16"+
		"\6&\3\6\3\6\3\7\3\7\3\7\3\7\7\7/\n\7\f\7\16\7\62\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b<\n\b\f\b\16\b?\13\b\3\b\3\b\3\b\3\b\3\b\2\2\t\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\3\2\6\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2"+
		"\61\61\2K\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\34\3\2\2\2\7\36\3\2\2\2\t!\3"+
		"\2\2\2\13$\3\2\2\2\r*\3\2\2\2\17\65\3\2\2\2\21\22\5\5\3\2\22\23\7<\2\2"+
		"\23\24\5\7\4\2\24\4\3\2\2\2\25\35\5\t\5\2\26\27\7\62\2\2\27\35\5\t\5\2"+
		"\30\31\7\63\2\2\31\35\5\t\5\2\32\33\7\64\2\2\33\35\4\62\65\2\34\25\3\2"+
		"\2\2\34\26\3\2\2\2\34\30\3\2\2\2\34\32\3\2\2\2\35\6\3\2\2\2\36\37\4\62"+
		"\67\2\37 \4\62;\2 \b\3\2\2\2!\"\4\62;\2\"\n\3\2\2\2#%\t\2\2\2$#\3\2\2"+
		"\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\b\6\2\2)\f\3\2\2\2*+\7"+
		"\61\2\2+,\7\61\2\2,\60\3\2\2\2-/\n\3\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2"+
		"\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\b\7\2\2\64\16\3\2"+
		"\2\2\65\66\7\61\2\2\66\67\7,\2\2\67=\3\2\2\28<\n\4\2\29:\7,\2\2:<\n\5"+
		"\2\2;8\3\2\2\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2"+
		"\2\2@A\7,\2\2AB\7\61\2\2BC\3\2\2\2CD\b\b\2\2D\20\3\2\2\2\b\2\34&\60;="+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}