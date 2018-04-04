// Generated from D:/work/java/Compiler/grammar\SetGrammar.g4 by ANTLR 4.7
package grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SetGrammarLexer extends Lexer {
    public static final int
            MAIN = 1, OPEN_BRACKET = 2, CLOSE_BRACKET = 3, OPEN_CURLY_BRACKET = 4, CLOSE_CURLY_BRACKET = 5,
            OPEN_SQUARE_BRACKET = 6, CLOSE_SQUARE_BRACKET = 7, INT = 8, ELEMENT = 9, SET = 10,
            PRINT = 11, IF = 12, ELSE = 13, FOR = 14, WHILE = 15, RETURN = 16, FUNCTION = 17, SIZE = 18,
            GET = 19, INDEX_OF = 20, EQULS = 21, DOT = 22, COMMA = 23, PLUS = 24, MINUS = 25, MULTIPLY = 26,
            DIVIDE = 27, NEGATION = 28, EQUAL = 29, NON_EQUAL = 30, LESS = 31, GREATER = 32, SPACE = 33,
            NAME = 34, NUMBER = 35, LINE = 36;
    public static final String[] ruleNames = {
            "MAIN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET",
            "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "INT", "ELEMENT", "SET",
            "PRINT", "IF", "ELSE", "FOR", "WHILE", "RETURN", "FUNCTION", "SIZE", "GET",
            "INDEX_OF", "EQULS", "DOT", "COMMA", "PLUS", "MINUS", "MULTIPLY", "DIVIDE",
            "NEGATION", "EQUAL", "NON_EQUAL", "LESS", "GREATER", "SPACE", "NAME",
            "NUMBER", "LINE"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00da\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5" +
                    "\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3" +
                    "\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3" +
                    "\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3" +
                    "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3" +
                    "\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3" +
                    "\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3" +
                    "\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 " +
                    "\3!\3!\3\"\6\"\u00c1\n\"\r\"\16\"\u00c2\3\"\3\"\3#\3#\7#\u00c9\n#\f#\16" +
                    "#\u00cc\13#\3$\6$\u00cf\n$\r$\16$\u00d0\3%\3%\6%\u00d5\n%\r%\16%\u00d6" +
                    "\3%\3%\3\u00d6\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31" +
                    "\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65" +
                    "\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\6\5\2\13\f\17\17\"\"\5\2C\\aac|\6" +
                    "\2\62;C\\aac|\3\2\62;\2\u00dd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t" +
                    "\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2" +
                    "\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2" +
                    "\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2" +
                    "+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2" +
                    "\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2" +
                    "C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5P\3\2\2\2\7R\3" +
                    "\2\2\2\tT\3\2\2\2\13V\3\2\2\2\rX\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23`" +
                    "\3\2\2\2\25h\3\2\2\2\27l\3\2\2\2\31r\3\2\2\2\33u\3\2\2\2\35z\3\2\2\2\37" +
                    "~\3\2\2\2!\u0084\3\2\2\2#\u008b\3\2\2\2%\u0094\3\2\2\2\'\u0099\3\2\2\2" +
                    ")\u009d\3\2\2\2+\u00a5\3\2\2\2-\u00a7\3\2\2\2/\u00a9\3\2\2\2\61\u00ab" +
                    "\3\2\2\2\63\u00ad\3\2\2\2\65\u00af\3\2\2\2\67\u00b1\3\2\2\29\u00b3\3\2" +
                    "\2\2;\u00b5\3\2\2\2=\u00b8\3\2\2\2?\u00bb\3\2\2\2A\u00bd\3\2\2\2C\u00c0" +
                    "\3\2\2\2E\u00c6\3\2\2\2G\u00ce\3\2\2\2I\u00d2\3\2\2\2KL\7o\2\2LM\7c\2" +
                    "\2MN\7k\2\2NO\7p\2\2O\4\3\2\2\2PQ\7*\2\2Q\6\3\2\2\2RS\7+\2\2S\b\3\2\2" +
                    "\2TU\7}\2\2U\n\3\2\2\2VW\7\177\2\2W\f\3\2\2\2XY\7]\2\2Y\16\3\2\2\2Z[\7" +
                    "_\2\2[\20\3\2\2\2\\]\7k\2\2]^\7p\2\2^_\7v\2\2_\22\3\2\2\2`a\7g\2\2ab\7" +
                    "n\2\2bc\7g\2\2cd\7o\2\2de\7g\2\2ef\7p\2\2fg\7v\2\2g\24\3\2\2\2hi\7u\2" +
                    "\2ij\7g\2\2jk\7v\2\2k\26\3\2\2\2lm\7r\2\2mn\7t\2\2no\7k\2\2op\7p\2\2p" +
                    "q\7v\2\2q\30\3\2\2\2rs\7k\2\2st\7h\2\2t\32\3\2\2\2uv\7g\2\2vw\7n\2\2w" +
                    "x\7u\2\2xy\7g\2\2y\34\3\2\2\2z{\7h\2\2{|\7q\2\2|}\7t\2\2}\36\3\2\2\2~" +
                    "\177\7y\2\2\177\u0080\7j\2\2\u0080\u0081\7k\2\2\u0081\u0082\7n\2\2\u0082" +
                    "\u0083\7g\2\2\u0083 \3\2\2\2\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086" +
                    "\u0087\7v\2\2\u0087\u0088\7w\2\2\u0088\u0089\7t\2\2\u0089\u008a\7p\2\2" +
                    "\u008a\"\3\2\2\2\u008b\u008c\7h\2\2\u008c\u008d\7w\2\2\u008d\u008e\7p" +
                    "\2\2\u008e\u008f\7e\2\2\u008f\u0090\7v\2\2\u0090\u0091\7k\2\2\u0091\u0092" +
                    "\7q\2\2\u0092\u0093\7p\2\2\u0093$\3\2\2\2\u0094\u0095\7u\2\2\u0095\u0096" +
                    "\7k\2\2\u0096\u0097\7|\2\2\u0097\u0098\7g\2\2\u0098&\3\2\2\2\u0099\u009a" +
                    "\7i\2\2\u009a\u009b\7g\2\2\u009b\u009c\7v\2\2\u009c(\3\2\2\2\u009d\u009e" +
                    "\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7g\2\2\u00a1" +
                    "\u00a2\7z\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4\7h\2\2\u00a4*\3\2\2\2\u00a5" +
                    "\u00a6\7?\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7\60\2\2\u00a8.\3\2\2\2\u00a9" +
                    "\u00aa\7.\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7-\2\2\u00ac\62\3\2\2\2\u00ad" +
                    "\u00ae\7/\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7,\2\2\u00b0\66\3\2\2\2\u00b1" +
                    "\u00b2\7\61\2\2\u00b28\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4:\3\2\2\2\u00b5" +
                    "\u00b6\7?\2\2\u00b6\u00b7\7?\2\2\u00b7<\3\2\2\2\u00b8\u00b9\7#\2\2\u00b9" +
                    "\u00ba\7?\2\2\u00ba>\3\2\2\2\u00bb\u00bc\7>\2\2\u00bc@\3\2\2\2\u00bd\u00be" +
                    "\7@\2\2\u00beB\3\2\2\2\u00bf\u00c1\t\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2" +
                    "\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4" +
                    "\u00c5\b\"\2\2\u00c5D\3\2\2\2\u00c6\u00ca\t\3\2\2\u00c7\u00c9\t\4\2\2" +
                    "\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb" +
                    "\3\2\2\2\u00cbF\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\t\5\2\2\u00ce" +
                    "\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2" +
                    "\2\2\u00d1H\3\2\2\2\u00d2\u00d4\7$\2\2\u00d3\u00d5\13\2\2\2\u00d4\u00d3" +
                    "\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7" +
                    "\u00d8\3\2\2\2\u00d8\u00d9\7$\2\2\u00d9J\3\2\2\2\7\2\u00c2\u00ca\u00d0" +
                    "\u00d6\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'main'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'int'", "'element'",
            "'set'", "'print'", "'if'", "'else'", "'for'", "'while'", "'return'",
            "'function'", "'size'", "'get'", "'indexOf'", "'='", "'.'", "','", "'+'",
            "'-'", "'*'", "'/'", "'!'", "'=='", "'!='", "'<'", "'>'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "MAIN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET",
            "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "INT", "ELEMENT", "SET",
            "PRINT", "IF", "ELSE", "FOR", "WHILE", "RETURN", "FUNCTION", "SIZE", "GET",
            "INDEX_OF", "EQULS", "DOT", "COMMA", "PLUS", "MINUS", "MULTIPLY", "DIVIDE",
            "NEGATION", "EQUAL", "NON_EQUAL", "LESS", "GREATER", "SPACE", "NAME",
            "NUMBER", "LINE"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public SetGrammarLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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

    @Override
    public String getGrammarFileName() {
        return "SetGrammar.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}