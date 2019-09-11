// Generated from dato.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class datoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATO=1, DAG=2, MON=3, HVIDERUM=4, KOMMENTAR=5, KOMMENTAR2=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DATO", "DAG", "MON", "HVIDERUM", "KOMMENTAR", "KOMMENTAR2"
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
			null, "DATO", "DAG", "MON", "HVIDERUM", "KOMMENTAR", "KOMMENTAR2"
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


	public datoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dato.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bH\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\3\5\3\26"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\5\4 \n\4\3\4\3\4\3\4\5\4%\n\4"+
		"\3\5\6\5(\n\5\r\5\16\5)\3\5\3\5\3\6\3\6\3\6\3\6\7\6\62\n\6\f\6\16\6\65"+
		"\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7\3\7\3\7"+
		"\3\7\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\6\5\2\13\f\17\17\"\"\3"+
		"\2\f\f\3\2,,\3\2\61\61\2P\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5\34\3\2\2\2\7$\3\2\2\2\t\'"+
		"\3\2\2\2\13-\3\2\2\2\r8\3\2\2\2\17\20\5\5\3\2\20\21\7\60\2\2\21\22\5\7"+
		"\4\2\22\23\7\60\2\2\23\4\3\2\2\2\24\26\7\62\2\2\25\24\3\2\2\2\25\26\3"+
		"\2\2\2\26\27\3\2\2\2\27\35\4\63;\2\30\31\4\63\64\2\31\35\4\62;\2\32\33"+
		"\7\65\2\2\33\35\4\62\63\2\34\25\3\2\2\2\34\30\3\2\2\2\34\32\3\2\2\2\35"+
		"\6\3\2\2\2\36 \7\62\2\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!%\4\63;\2"+
		"\"#\7\63\2\2#%\4\62\64\2$\37\3\2\2\2$\"\3\2\2\2%\b\3\2\2\2&(\t\2\2\2\'"+
		"&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\b\5\2\2,\n\3\2\2"+
		"\2-.\7\61\2\2./\7\61\2\2/\63\3\2\2\2\60\62\n\3\2\2\61\60\3\2\2\2\62\65"+
		"\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67"+
		"\b\6\2\2\67\f\3\2\2\289\7\61\2\29:\7,\2\2:@\3\2\2\2;?\n\4\2\2<=\7,\2\2"+
		"=?\n\5\2\2>;\3\2\2\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2"+
		"B@\3\2\2\2CD\7,\2\2DE\7\61\2\2EF\3\2\2\2FG\b\7\2\2G\16\3\2\2\2\13\2\25"+
		"\34\37$)\63>@\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}