// Generated from Graph.g4 by ANTLR 4.9
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, LINE=2, MAIN=3, VOID=4, IF=5, THEN=6, ELSE=7, FOR=8, WHILE=9, 
		UNTIL=10, RETURN=11, INT=12, NODE=13, ARC=14, GRAPH=15, PRINTLN=16, SIZE=17, 
		GET=18, OPEN_BRACKET=19, CLOSE_BRACKET=20, OPEN_CURLY_BRACKET=21, CLOSE_CURLY_BRACKET=22, 
		SEMIOCOLON=23, COMMA=24, DOT=25, ASSIGN=26, GREATER=27, LESS=28, EQUAL=29, 
		LESS_OR_EQUAL=30, GREATER_OR_EQUAL=31, NOT_EQUAL=32, AND=33, OR=34, INCREMENT=35, 
		DECREMENT=36, ADD=37, SUB=38, MULTIPLY=39, DIVIDE=40, IN=41, Identifier=42, 
		WS=43, COMMENT=44, LINE_COMMENT=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "LINE", "MAIN", "VOID", "IF", "THEN", "ELSE", "FOR", "WHILE", 
			"UNTIL", "RETURN", "INT", "NODE", "ARC", "GRAPH", "PRINTLN", "SIZE", 
			"GET", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", 
			"SEMIOCOLON", "COMMA", "DOT", "ASSIGN", "GREATER", "LESS", "EQUAL", "LESS_OR_EQUAL", 
			"GREATER_OR_EQUAL", "NOT_EQUAL", "AND", "OR", "INCREMENT", "DECREMENT", 
			"ADD", "SUB", "MULTIPLY", "DIVIDE", "IN", "Identifier", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'main'", "'void'", "'if'", "'then'", "'else'", "'for'", 
			"'while'", "'until'", "'return'", "'int'", "'node'", "'arc'", "'graph'", 
			"'println'", "'size'", "'get'", "'('", "')'", "'{'", "'}'", "';'", "','", 
			"'.'", "'='", "'>'", "'<'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "LINE", "MAIN", "VOID", "IF", "THEN", "ELSE", "FOR", 
			"WHILE", "UNTIL", "RETURN", "INT", "NODE", "ARC", "GRAPH", "PRINTLN", 
			"SIZE", "GET", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLY_BRACKET", 
			"CLOSE_CURLY_BRACKET", "SEMIOCOLON", "COMMA", "DOT", "ASSIGN", "GREATER", 
			"LESS", "EQUAL", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "NOT_EQUAL", "AND", 
			"OR", "INCREMENT", "DECREMENT", "ADD", "SUB", "MULTIPLY", "DIVIDE", "IN", 
			"Identifier", "WS", "COMMENT", "LINE_COMMENT"
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


	public GraphLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Graph.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u011e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\6\2`\n\2\r\2\16\2a\3\2\5\2e\n\2\3\3\3\3\6\3i"+
		"\n\3\r\3\16\3j\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3"+
		"$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\7+\u00fa\n+"+
		"\f+\16+\u00fd\13+\3,\6,\u0100\n,\r,\16,\u0101\3,\3,\3-\3-\3-\3-\7-\u010a"+
		"\n-\f-\16-\u010d\13-\3-\3-\3-\3-\3-\3.\3.\3.\3.\7.\u0118\n.\f.\16.\u011b"+
		"\13.\3.\3.\4j\u010b\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\b\3\2\62;\3"+
		"\2\63;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0124"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3d\3\2\2\2\5f\3\2\2\2\7n\3"+
		"\2\2\2\ts\3\2\2\2\13x\3\2\2\2\r{\3\2\2\2\17\u0080\3\2\2\2\21\u0085\3\2"+
		"\2\2\23\u0089\3\2\2\2\25\u008f\3\2\2\2\27\u0095\3\2\2\2\31\u009c\3\2\2"+
		"\2\33\u00a0\3\2\2\2\35\u00a5\3\2\2\2\37\u00a9\3\2\2\2!\u00af\3\2\2\2#"+
		"\u00b7\3\2\2\2%\u00bc\3\2\2\2\'\u00c0\3\2\2\2)\u00c2\3\2\2\2+\u00c4\3"+
		"\2\2\2-\u00c6\3\2\2\2/\u00c8\3\2\2\2\61\u00ca\3\2\2\2\63\u00cc\3\2\2\2"+
		"\65\u00ce\3\2\2\2\67\u00d0\3\2\2\29\u00d2\3\2\2\2;\u00d4\3\2\2\2=\u00d7"+
		"\3\2\2\2?\u00da\3\2\2\2A\u00dd\3\2\2\2C\u00e0\3\2\2\2E\u00e3\3\2\2\2G"+
		"\u00e6\3\2\2\2I\u00e9\3\2\2\2K\u00ec\3\2\2\2M\u00ee\3\2\2\2O\u00f0\3\2"+
		"\2\2Q\u00f2\3\2\2\2S\u00f4\3\2\2\2U\u00f7\3\2\2\2W\u00ff\3\2\2\2Y\u0105"+
		"\3\2\2\2[\u0113\3\2\2\2]e\t\2\2\2^`\t\3\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2"+
		"\2\2ab\3\2\2\2bc\3\2\2\2ce\t\2\2\2d]\3\2\2\2d_\3\2\2\2e\4\3\2\2\2fh\7"+
		"$\2\2gi\13\2\2\2hg\3\2\2\2ij\3\2\2\2jk\3\2\2\2jh\3\2\2\2kl\3\2\2\2lm\7"+
		"$\2\2m\6\3\2\2\2no\7o\2\2op\7c\2\2pq\7k\2\2qr\7p\2\2r\b\3\2\2\2st\7x\2"+
		"\2tu\7q\2\2uv\7k\2\2vw\7f\2\2w\n\3\2\2\2xy\7k\2\2yz\7h\2\2z\f\3\2\2\2"+
		"{|\7v\2\2|}\7j\2\2}~\7g\2\2~\177\7p\2\2\177\16\3\2\2\2\u0080\u0081\7g"+
		"\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2\u0083\u0084\7g\2\2\u0084\20"+
		"\3\2\2\2\u0085\u0086\7h\2\2\u0086\u0087\7q\2\2\u0087\u0088\7t\2\2\u0088"+
		"\22\3\2\2\2\u0089\u008a\7y\2\2\u008a\u008b\7j\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7n\2\2\u008d\u008e\7g\2\2\u008e\24\3\2\2\2\u008f\u0090\7w\2\2\u0090"+
		"\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092\u0093\7k\2\2\u0093\u0094\7n\2\2"+
		"\u0094\26\3\2\2\2\u0095\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7"+
		"v\2\2\u0098\u0099\7w\2\2\u0099\u009a\7t\2\2\u009a\u009b\7p\2\2\u009b\30"+
		"\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f"+
		"\32\3\2\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7f\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\34\3\2\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7t\2\2\u00a7"+
		"\u00a8\7e\2\2\u00a8\36\3\2\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab\7t\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7r\2\2\u00ad\u00ae\7j\2\2\u00ae \3\2\2\2\u00af"+
		"\u00b0\7r\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2"+
		"\u00b3\u00b4\7v\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7p\2\2\u00b6\"\3\2"+
		"\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7|\2\2\u00ba\u00bb"+
		"\7g\2\2\u00bb$\3\2\2\2\u00bc\u00bd\7i\2\2\u00bd\u00be\7g\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf&\3\2\2\2\u00c0\u00c1\7*\2\2\u00c1(\3\2\2\2\u00c2\u00c3\7"+
		"+\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7}\2\2\u00c5,\3\2\2\2\u00c6\u00c7\7\177"+
		"\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7=\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7"+
		".\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\7\60\2\2\u00cd\64\3\2\2\2\u00ce\u00cf"+
		"\7?\2\2\u00cf\66\3\2\2\2\u00d0\u00d1\7@\2\2\u00d18\3\2\2\2\u00d2\u00d3"+
		"\7>\2\2\u00d3:\3\2\2\2\u00d4\u00d5\7?\2\2\u00d5\u00d6\7?\2\2\u00d6<\3"+
		"\2\2\2\u00d7\u00d8\7>\2\2\u00d8\u00d9\7?\2\2\u00d9>\3\2\2\2\u00da\u00db"+
		"\7@\2\2\u00db\u00dc\7?\2\2\u00dc@\3\2\2\2\u00dd\u00de\7#\2\2\u00de\u00df"+
		"\7?\2\2\u00dfB\3\2\2\2\u00e0\u00e1\7(\2\2\u00e1\u00e2\7(\2\2\u00e2D\3"+
		"\2\2\2\u00e3\u00e4\7~\2\2\u00e4\u00e5\7~\2\2\u00e5F\3\2\2\2\u00e6\u00e7"+
		"\7-\2\2\u00e7\u00e8\7-\2\2\u00e8H\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea\u00eb"+
		"\7/\2\2\u00ebJ\3\2\2\2\u00ec\u00ed\7-\2\2\u00edL\3\2\2\2\u00ee\u00ef\7"+
		"/\2\2\u00efN\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1P\3\2\2\2\u00f2\u00f3\7\61"+
		"\2\2\u00f3R\3\2\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6T\3\2\2"+
		"\2\u00f7\u00fb\t\4\2\2\u00f8\u00fa\t\5\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcV\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u0100\t\6\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\b,\2\2\u0104X\3\2\2\2\u0105\u0106\7\61\2\2\u0106\u0107\7,\2\2\u0107"+
		"\u010b\3\2\2\2\u0108\u010a\13\2\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\7,\2\2\u010f\u0110\7\61\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\b-\2\2\u0112Z\3\2\2\2\u0113\u0114\7\61\2\2\u0114\u0115"+
		"\7\61\2\2\u0115\u0119\3\2\2\2\u0116\u0118\n\7\2\2\u0117\u0116\3\2\2\2"+
		"\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\b.\2\2\u011d\\\3\2\2\2\n\2ad"+
		"j\u00fb\u0101\u010b\u0119\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}