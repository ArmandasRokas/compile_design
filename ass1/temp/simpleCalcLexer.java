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
		T__9=10, T__10=11, T__11=12, OP=13, CONDOP=14, ID=15, FLOAT=16, ALPHA=17, 
		NUM=18, WHITESPACE=19, COMMENT=20, COMMENT2=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "OP", "CONDOP", "ID", "FLOAT", "ALPHA", "NUM", 
			"WHITESPACE", "COMMENT", "COMMENT2"
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
			null, "OP", "CONDOP", "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", 
			"COMMENT2"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17U\n\17\3\20\3\20\3\20\7\20Z\n\20\f\20\16\20]\13\20\3\21\6\21"+
		"`\n\21\r\21\16\21a\3\21\3\21\6\21f\n\21\r\21\16\21g\5\21j\n\21\3\22\3"+
		"\22\3\23\3\23\3\24\6\24q\n\24\r\24\16\24r\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\7\25{\n\25\f\25\16\25~\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u0088\n\26\f\26\16\26\u008b\13\26\3\26\3\26\3\26\3\26\3\26\2\2\27"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27\3\2\n\4\2--//\4\2>>@@\t\2C\\aac|\u00c7"+
		"\u00c8\u00da\u00da\u00e7\u00e8\u00fa\u00fa\3\2\62;\5\2\13\f\17\17\"\""+
		"\3\2\f\f\3\2,,\3\2\61\61\2\u009d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\64\3\2\2\2\13\66\3\2"+
		"\2\2\r8\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3"+
		"\2\2\2\31G\3\2\2\2\33I\3\2\2\2\35T\3\2\2\2\37V\3\2\2\2!_\3\2\2\2#k\3\2"+
		"\2\2%m\3\2\2\2\'p\3\2\2\2)v\3\2\2\2+\u0081\3\2\2\2-.\7}\2\2.\4\3\2\2\2"+
		"/\60\7\177\2\2\60\6\3\2\2\2\61\62\7k\2\2\62\63\7h\2\2\63\b\3\2\2\2\64"+
		"\65\7*\2\2\65\n\3\2\2\2\66\67\7+\2\2\67\f\3\2\2\289\7g\2\29:\7n\2\2:;"+
		"\7u\2\2;<\7g\2\2<\16\3\2\2\2=>\7?\2\2>\20\3\2\2\2?@\7=\2\2@\22\3\2\2\2"+
		"AB\7,\2\2B\24\3\2\2\2CD\7\61\2\2D\26\3\2\2\2EF\7-\2\2F\30\3\2\2\2GH\7"+
		"/\2\2H\32\3\2\2\2IJ\t\2\2\2J\34\3\2\2\2KL\7?\2\2LU\7?\2\2MN\7#\2\2NU\7"+
		"?\2\2OU\t\3\2\2PQ\7>\2\2QU\7?\2\2RS\7@\2\2SU\7?\2\2TK\3\2\2\2TM\3\2\2"+
		"\2TO\3\2\2\2TP\3\2\2\2TR\3\2\2\2U\36\3\2\2\2V[\5#\22\2WZ\5#\22\2XZ\5%"+
		"\23\2YW\3\2\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\ \3\2\2\2]["+
		"\3\2\2\2^`\5%\23\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bi\3\2\2\2c"+
		"e\7\60\2\2df\5%\23\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2"+
		"ic\3\2\2\2ij\3\2\2\2j\"\3\2\2\2kl\t\4\2\2l$\3\2\2\2mn\t\5\2\2n&\3\2\2"+
		"\2oq\t\6\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\b\24"+
		"\2\2u(\3\2\2\2vw\7\61\2\2wx\7\61\2\2x|\3\2\2\2y{\n\7\2\2zy\3\2\2\2{~\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\b\25\2\2\u0080"+
		"*\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7,\2\2\u0083\u0089\3\2\2\2"+
		"\u0084\u0088\n\b\2\2\u0085\u0086\7,\2\2\u0086\u0088\n\t\2\2\u0087\u0084"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7,"+
		"\2\2\u008d\u008e\7\61\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\26\2\2\u0090"+
		",\3\2\2\2\r\2TY[agir|\u0087\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}