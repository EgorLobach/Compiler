// Generated from D:/work/java/Compiler/grammar\SetGrammar.g4 by ANTLR 4.7
package grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SetGrammarParser extends Parser {
    public static final int
            MAIN = 1, OPEN_BRACKET = 2, CLOSE_BRACKET = 3, OPEN_CURLY_BRACKET = 4, CLOSE_CURLY_BRACKET = 5,
            OPEN_SQUARE_BRACKET = 6, CLOSE_SQUARE_BRACKET = 7, INT = 8, ELEMENT = 9, SET = 10,
            PRINT = 11, IF = 12, ELSE = 13, FOR = 14, WHILE = 15, RETURN = 16, FUNCTION = 17, SIZE = 18,
            GET = 19, INDEX_OF = 20, EQULS = 21, DOT = 22, COMMA = 23, PLUS = 24, MINUS = 25, MULTIPLY = 26,
            DIVIDE = 27, NEGATION = 28, EQUAL = 29, NON_EQUAL = 30, LESS = 31, GREATER = 32, SPACE = 33,
            NAME = 34, NUMBER = 35, LINE = 36;
    public static final int
            RULE_setExpression = 0, RULE_program = 1, RULE_block = 2, RULE_declaration = 3,
            RULE_declarationElement = 4, RULE_print = 5, RULE_printSet = 6, RULE_inputSignature = 7,
            RULE_functionCall = 8, RULE_type = 9, RULE_signatureFunction = 10, RULE_functionReturn = 11,
            RULE_functionNonReturn = 12, RULE_blockReturn = 13, RULE_blockNonReturn = 14,
            RULE_equalCompare = 15, RULE_compare = 16, RULE_simpleCompare = 17, RULE_negationCompare = 18,
            RULE_elseBlock = 19, RULE_ifBlock = 20, RULE_whileBlock = 21, RULE_sizeExpression = 22,
            RULE_getExpression = 23, RULE_indexOfExpression = 24, RULE_expression = 25,
            RULE_content = 26;
    public static final String[] ruleNames = {
            "setExpression", "program", "block", "declaration", "declarationElement",
            "print", "printSet", "inputSignature", "functionCall", "type", "signatureFunction",
            "functionReturn", "functionNonReturn", "blockReturn", "blockNonReturn",
            "equalCompare", "compare", "simpleCompare", "negationCompare", "elseBlock",
            "ifBlock", "whileBlock", "sizeExpression", "getExpression", "indexOfExpression",
            "expression", "content"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0113\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2" +
                    "\3\2\3\2\3\3\3\3\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\4\3\4\7\4O\n\4\f\4" +
                    "\16\4R\13\4\3\4\3\4\3\5\5\5W\n\5\3\5\3\5\3\5\3\5\3\6\5\6^\n\6\3\6\3\6" +
                    "\3\6\3\6\3\6\5\6e\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t" +
                    "\3\t\7\tt\n\t\f\t\16\tw\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0080\n\n" +
                    "\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f\3\f\3" +
                    "\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0099\n\r\3\r\3\r\3\16\3\16" +
                    "\3\16\3\16\3\16\5\16\u00a2\n\16\3\16\3\16\3\17\3\17\7\17\u00a8\n\17\f" +
                    "\17\16\17\u00ab\13\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20\u00b3\n\20\f" +
                    "\20\16\20\u00b6\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22" +
                    "\3\22\3\23\3\23\3\23\5\23\u00c6\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25" +
                    "\3\25\3\26\3\26\3\26\3\26\5\26\u00d4\n\26\3\26\3\26\3\26\5\26\u00d9\n" +
                    "\26\3\27\3\27\3\27\3\27\5\27\u00df\n\27\3\27\3\27\3\27\3\30\3\30\3\30" +
                    "\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32" +
                    "\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33" +
                    "\3\33\3\33\3\33\3\33\3\33\5\33\u0108\n\33\3\34\3\34\3\34\3\34\3\34\3\34" +
                    "\3\34\5\34\u0111\n\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34" +
                    "\36 \"$&(*,.\60\62\64\66\2\5\3\2\13\f\3\2\37 \3\2\37\"\2\u0118\28\3\2" +
                    "\2\2\4C\3\2\2\2\6L\3\2\2\2\bV\3\2\2\2\n]\3\2\2\2\ff\3\2\2\2\16k\3\2\2" +
                    "\2\20p\3\2\2\2\22{\3\2\2\2\24\u0081\3\2\2\2\26\u0083\3\2\2\2\30\u0092" +
                    "\3\2\2\2\32\u009c\3\2\2\2\34\u00a5\3\2\2\2\36\u00b0\3\2\2\2 \u00ba\3\2" +
                    "\2\2\"\u00be\3\2\2\2$\u00c5\3\2\2\2&\u00c7\3\2\2\2(\u00cc\3\2\2\2*\u00cf" +
                    "\3\2\2\2,\u00da\3\2\2\2.\u00e3\3\2\2\2\60\u00e9\3\2\2\2\62\u00f0\3\2\2" +
                    "\2\64\u0107\3\2\2\2\66\u0110\3\2\2\28=\7\6\2\29:\7$\2\2:<\7\31\2\2;9\3" +
                    "\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7$\2\2AB\7" +
                    "\7\2\2B\3\3\2\2\2CD\7\3\2\2DI\5\6\4\2EH\5\30\r\2FH\5\32\16\2GE\3\2\2\2" +
                    "GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\5\3\2\2\2KI\3\2\2\2LP\7\6\2" +
                    "\2MO\5\66\34\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2" +
                    "\2\2ST\7\7\2\2T\7\3\2\2\2UW\7\f\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7" +
                    "$\2\2YZ\7\27\2\2Z[\5\64\33\2[\t\3\2\2\2\\^\7\13\2\2]\\\3\2\2\2]^\3\2\2" +
                    "\2^_\3\2\2\2_`\7$\2\2`d\7\27\2\2ae\7&\2\2be\5\22\n\2ce\5\60\31\2da\3\2" +
                    "\2\2db\3\2\2\2dc\3\2\2\2e\13\3\2\2\2fg\7\r\2\2gh\7\4\2\2hi\7&\2\2ij\7" +
                    "\5\2\2j\r\3\2\2\2kl\7\r\2\2lm\7\4\2\2mn\7$\2\2no\7\5\2\2o\17\3\2\2\2p" +
                    "u\7\4\2\2qr\7$\2\2rt\7\31\2\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2" +
                    "vx\3\2\2\2wu\3\2\2\2xy\7$\2\2yz\7\5\2\2z\21\3\2\2\2{\177\7$\2\2|\u0080" +
                    "\5\20\t\2}~\7\4\2\2~\u0080\7\5\2\2\177|\3\2\2\2\177}\3\2\2\2\u0080\23" +
                    "\3\2\2\2\u0081\u0082\t\2\2\2\u0082\25\3\2\2\2\u0083\u008a\7\4\2\2\u0084" +
                    "\u0085\5\24\13\2\u0085\u0086\7$\2\2\u0086\u0087\7\31\2\2\u0087\u0089\3" +
                    "\2\2\2\u0088\u0084\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a" +
                    "\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\5\24" +
                    "\13\2\u008e\u008f\7$\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\5\2\2\u0091" +
                    "\27\3\2\2\2\u0092\u0093\7\23\2\2\u0093\u0094\5\24\13\2\u0094\u0098\7$" +
                    "\2\2\u0095\u0099\5\26\f\2\u0096\u0097\7\4\2\2\u0097\u0099\7\5\2\2\u0098" +
                    "\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\5\34" +
                    "\17\2\u009b\31\3\2\2\2\u009c\u009d\7\23\2\2\u009d\u00a1\7$\2\2\u009e\u00a2" +
                    "\5\26\f\2\u009f\u00a0\7\4\2\2\u00a0\u00a2\7\5\2\2\u00a1\u009e\3\2\2\2" +
                    "\u00a1\u009f\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\5\36\20\2\u00a4\33" +
                    "\3\2\2\2\u00a5\u00a9\7\6\2\2\u00a6\u00a8\5\66\34\2\u00a7\u00a6\3\2\2\2" +
                    "\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac" +
                    "\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\22\2\2\u00ad\u00ae\7$\2\2\u00ae" +
                    "\u00af\7\7\2\2\u00af\35\3\2\2\2\u00b0\u00b4\7\6\2\2\u00b1\u00b3\5\66\34" +
                    "\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5" +
                    "\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\22\2\2" +
                    "\u00b8\u00b9\7\7\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\5\64\33\2\u00bb\u00bc" +
                    "\t\3\2\2\u00bc\u00bd\5\64\33\2\u00bd!\3\2\2\2\u00be\u00bf\5.\30\2\u00bf" +
                    "\u00c0\t\4\2\2\u00c0\u00c1\5.\30\2\u00c1#\3\2\2\2\u00c2\u00c6\5 \21\2" +
                    "\u00c3\u00c6\5\"\22\2\u00c4\u00c6\5\62\32\2\u00c5\u00c2\3\2\2\2\u00c5" +
                    "\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6%\3\2\2\2\u00c7\u00c8\7\36\2\2" +
                    "\u00c8\u00c9\7\4\2\2\u00c9\u00ca\5$\23\2\u00ca\u00cb\7\5\2\2\u00cb\'\3" +
                    "\2\2\2\u00cc\u00cd\7\17\2\2\u00cd\u00ce\5\6\4\2\u00ce)\3\2\2\2\u00cf\u00d0" +
                    "\7\16\2\2\u00d0\u00d3\7\4\2\2\u00d1\u00d4\5$\23\2\u00d2\u00d4\5&\24\2" +
                    "\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6" +
                    "\7\5\2\2\u00d6\u00d8\5\6\4\2\u00d7\u00d9\5(\25\2\u00d8\u00d7\3\2\2\2\u00d8" +
                    "\u00d9\3\2\2\2\u00d9+\3\2\2\2\u00da\u00db\7\21\2\2\u00db\u00de\7\4\2\2" +
                    "\u00dc\u00df\5$\23\2\u00dd\u00df\5&\24\2\u00de\u00dc\3\2\2\2\u00de\u00dd" +
                    "\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\5\2\2\u00e1\u00e2\5\6\4\2\u00e2" +
                    "-\3\2\2\2\u00e3\u00e4\7$\2\2\u00e4\u00e5\7\30\2\2\u00e5\u00e6\7\24\2\2" +
                    "\u00e6\u00e7\7\4\2\2\u00e7\u00e8\7\5\2\2\u00e8/\3\2\2\2\u00e9\u00ea\7" +
                    "$\2\2\u00ea\u00eb\7\30\2\2\u00eb\u00ec\7\25\2\2\u00ec\u00ed\7\4\2\2\u00ed" +
                    "\u00ee\7%\2\2\u00ee\u00ef\7\5\2\2\u00ef\61\3\2\2\2\u00f0\u00f1\7$\2\2" +
                    "\u00f1\u00f2\7\30\2\2\u00f2\u00f3\7\26\2\2\u00f3\u00f4\7\4\2\2\u00f4\u00f5" +
                    "\7$\2\2\u00f5\u00f6\7\5\2\2\u00f6\63\3\2\2\2\u00f7\u0108\5\2\2\2\u00f8" +
                    "\u00f9\7$\2\2\u00f9\u00fa\7\32\2\2\u00fa\u0108\7$\2\2\u00fb\u00fc\7$\2" +
                    "\2\u00fc\u00fd\7\33\2\2\u00fd\u0108\7$\2\2\u00fe\u00ff\7$\2\2\u00ff\u0100" +
                    "\7\34\2\2\u0100\u0108\7$\2\2\u0101\u0102\7$\2\2\u0102\u0103\7\35\2\2\u0103" +
                    "\u0108\7$\2\2\u0104\u0108\7$\2\2\u0105\u0108\5\22\n\2\u0106\u0108\5\60" +
                    "\31\2\u0107\u00f7\3\2\2\2\u0107\u00f8\3\2\2\2\u0107\u00fb\3\2\2\2\u0107" +
                    "\u00fe\3\2\2\2\u0107\u0101\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2" +
                    "\2\2\u0107\u0106\3\2\2\2\u0108\65\3\2\2\2\u0109\u0111\5\f\7\2\u010a\u0111" +
                    "\5\b\5\2\u010b\u0111\5\n\6\2\u010c\u0111\5\16\b\2\u010d\u0111\5\22\n\2" +
                    "\u010e\u0111\5*\26\2\u010f\u0111\5,\27\2\u0110\u0109\3\2\2\2\u0110\u010a" +
                    "\3\2\2\2\u0110\u010b\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010d\3\2\2\2\u0110" +
                    "\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\67\3\2\2\2\26=GIPV]du\177\u008a" +
                    "\u0098\u00a1\u00a9\u00b4\u00c5\u00d3\u00d8\u00de\u0107\u0110";
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

    public SetGrammarParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public ATN getATN() {
        return _ATN;
    }

    public final SetExpressionContext setExpression() throws RecognitionException {
        SetExpressionContext _localctx = new SetExpressionContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_setExpression);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(54);
                match(OPEN_CURLY_BRACKET);
                setState(59);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(55);
                                match(NAME);
                                setState(56);
                                match(COMMA);
                            }
                        }
                    }
                    setState(61);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
                }
                setState(62);
                match(NAME);
                setState(63);
                match(CLOSE_CURLY_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_program);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(65);
                match(MAIN);
                setState(66);
                block();
                setState(71);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == FUNCTION) {
                    {
                        setState(69);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                            case 1: {
                                setState(67);
                                functionReturn();
                            }
                            break;
                            case 2: {
                                setState(68);
                                functionNonReturn();
                            }
                            break;
                        }
                    }
                    setState(73);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(74);
                match(OPEN_CURLY_BRACKET);
                setState(78);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELEMENT) | (1L << SET) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << NAME))) != 0)) {
                    {
                        {
                            setState(75);
                            content();
                        }
                    }
                    setState(80);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(81);
                match(CLOSE_CURLY_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DeclarationContext declaration() throws RecognitionException {
        DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_declaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(84);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == SET) {
                    {
                        setState(83);
                        match(SET);
                    }
                }

                setState(86);
                match(NAME);
                setState(87);
                match(EQULS);
                setState(88);
                expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DeclarationElementContext declarationElement() throws RecognitionException {
        DeclarationElementContext _localctx = new DeclarationElementContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_declarationElement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(91);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ELEMENT) {
                    {
                        setState(90);
                        match(ELEMENT);
                    }
                }

                setState(93);
                match(NAME);
                setState(94);
                match(EQULS);
                setState(98);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                    case 1: {
                        setState(95);
                        match(LINE);
                    }
                    break;
                    case 2: {
                        setState(96);
                        functionCall();
                    }
                    break;
                    case 3: {
                        setState(97);
                        getExpression();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PrintContext print() throws RecognitionException {
        PrintContext _localctx = new PrintContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_print);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(100);
                match(PRINT);
                setState(101);
                match(OPEN_BRACKET);
                setState(102);
                match(LINE);
                setState(103);
                match(CLOSE_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PrintSetContext printSet() throws RecognitionException {
        PrintSetContext _localctx = new PrintSetContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_printSet);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(105);
                match(PRINT);
                setState(106);
                match(OPEN_BRACKET);
                setState(107);
                match(NAME);
                setState(108);
                match(CLOSE_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InputSignatureContext inputSignature() throws RecognitionException {
        InputSignatureContext _localctx = new InputSignatureContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_inputSignature);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(110);
                match(OPEN_BRACKET);
                setState(115);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(111);
                                match(NAME);
                                setState(112);
                                match(COMMA);
                            }
                        }
                    }
                    setState(117);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                }
                setState(118);
                match(NAME);
                setState(119);
                match(CLOSE_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunctionCallContext functionCall() throws RecognitionException {
        FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_functionCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(121);
                    match(NAME);
                    setState(125);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                        case 1: {
                            setState(122);
                            inputSignature();
                        }
                        break;
                        case 2: {
                            {
                                setState(123);
                                match(OPEN_BRACKET);
                                setState(124);
                                match(CLOSE_BRACKET);
                            }
                        }
                        break;
                    }
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeContext type() throws RecognitionException {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_type);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(127);
                _la = _input.LA(1);
                if (!(_la == ELEMENT || _la == SET)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SignatureFunctionContext signatureFunction() throws RecognitionException {
        SignatureFunctionContext _localctx = new SignatureFunctionContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_signatureFunction);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(129);
                match(OPEN_BRACKET);
                setState(136);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(130);
                                type();
                                setState(131);
                                match(NAME);
                                setState(132);
                                match(COMMA);
                            }
                        }
                    }
                    setState(138);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                }
                {
                    setState(139);
                    type();
                    setState(140);
                    match(NAME);
                }
                setState(142);
                match(CLOSE_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunctionReturnContext functionReturn() throws RecognitionException {
        FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_functionReturn);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(144);
                match(FUNCTION);
                setState(145);
                type();
                setState(146);
                match(NAME);
                setState(150);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                    case 1: {
                        setState(147);
                        signatureFunction();
                    }
                    break;
                    case 2: {
                        {
                            setState(148);
                            match(OPEN_BRACKET);
                            setState(149);
                            match(CLOSE_BRACKET);
                        }
                    }
                    break;
                }
                setState(152);
                blockReturn();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunctionNonReturnContext functionNonReturn() throws RecognitionException {
        FunctionNonReturnContext _localctx = new FunctionNonReturnContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_functionNonReturn);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(154);
                match(FUNCTION);
                setState(155);
                match(NAME);
                setState(159);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        setState(156);
                        signatureFunction();
                    }
                    break;
                    case 2: {
                        {
                            setState(157);
                            match(OPEN_BRACKET);
                            setState(158);
                            match(CLOSE_BRACKET);
                        }
                    }
                    break;
                }
                setState(161);
                blockNonReturn();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockReturnContext blockReturn() throws RecognitionException {
        BlockReturnContext _localctx = new BlockReturnContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_blockReturn);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(163);
                match(OPEN_CURLY_BRACKET);
                setState(167);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELEMENT) | (1L << SET) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << NAME))) != 0)) {
                    {
                        {
                            setState(164);
                            content();
                        }
                    }
                    setState(169);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(170);
                match(RETURN);
                setState(171);
                match(NAME);
                setState(172);
                match(CLOSE_CURLY_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockNonReturnContext blockNonReturn() throws RecognitionException {
        BlockNonReturnContext _localctx = new BlockNonReturnContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_blockNonReturn);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(174);
                match(OPEN_CURLY_BRACKET);
                setState(178);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELEMENT) | (1L << SET) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << NAME))) != 0)) {
                    {
                        {
                            setState(175);
                            content();
                        }
                    }
                    setState(180);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(181);
                match(RETURN);
                setState(182);
                match(CLOSE_CURLY_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final EqualCompareContext equalCompare() throws RecognitionException {
        EqualCompareContext _localctx = new EqualCompareContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_equalCompare);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(184);
                    expression();
                }
                setState(185);
                _la = _input.LA(1);
                if (!(_la == EQUAL || _la == NON_EQUAL)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                {
                    setState(186);
                    expression();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CompareContext compare() throws RecognitionException {
        CompareContext _localctx = new CompareContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_compare);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(188);
                    sizeExpression();
                }
                setState(189);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << GREATER))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                {
                    setState(190);
                    sizeExpression();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SimpleCompareContext simpleCompare() throws RecognitionException {
        SimpleCompareContext _localctx = new SimpleCompareContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_simpleCompare);
        try {
            setState(195);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(192);
                    equalCompare();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(193);
                    compare();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(194);
                    indexOfExpression();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NegationCompareContext negationCompare() throws RecognitionException {
        NegationCompareContext _localctx = new NegationCompareContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_negationCompare);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(197);
                match(NEGATION);
                setState(198);
                match(OPEN_BRACKET);
                setState(199);
                simpleCompare();
                setState(200);
                match(CLOSE_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ElseBlockContext elseBlock() throws RecognitionException {
        ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_elseBlock);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(202);
                match(ELSE);
                setState(203);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IfBlockContext ifBlock() throws RecognitionException {
        IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_ifBlock);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(205);
                match(IF);
                setState(206);
                match(OPEN_BRACKET);
                setState(209);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case OPEN_CURLY_BRACKET:
                    case NAME: {
                        setState(207);
                        simpleCompare();
                    }
                    break;
                    case NEGATION: {
                        setState(208);
                        negationCompare();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(211);
                match(CLOSE_BRACKET);
                setState(212);
                block();
                setState(214);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ELSE) {
                    {
                        setState(213);
                        elseBlock();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WhileBlockContext whileBlock() throws RecognitionException {
        WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_whileBlock);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(216);
                match(WHILE);
                setState(217);
                match(OPEN_BRACKET);
                setState(220);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case OPEN_CURLY_BRACKET:
                    case NAME: {
                        setState(218);
                        simpleCompare();
                    }
                    break;
                    case NEGATION: {
                        setState(219);
                        negationCompare();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(222);
                match(CLOSE_BRACKET);
                setState(223);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SizeExpressionContext sizeExpression() throws RecognitionException {
        SizeExpressionContext _localctx = new SizeExpressionContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_sizeExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(225);
                match(NAME);
                setState(226);
                match(DOT);
                setState(227);
                match(SIZE);
                setState(228);
                match(OPEN_BRACKET);
                setState(229);
                match(CLOSE_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final GetExpressionContext getExpression() throws RecognitionException {
        GetExpressionContext _localctx = new GetExpressionContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_getExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(231);
                match(NAME);
                setState(232);
                match(DOT);
                setState(233);
                match(GET);
                setState(234);
                match(OPEN_BRACKET);
                setState(235);
                match(NUMBER);
                setState(236);
                match(CLOSE_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IndexOfExpressionContext indexOfExpression() throws RecognitionException {
        IndexOfExpressionContext _localctx = new IndexOfExpressionContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_indexOfExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(238);
                match(NAME);
                setState(239);
                match(DOT);
                setState(240);
                match(INDEX_OF);
                setState(241);
                match(OPEN_BRACKET);
                setState(242);
                match(NAME);
                setState(243);
                match(CLOSE_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_expression);
        try {
            setState(261);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(245);
                    setExpression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(246);
                    match(NAME);
                    setState(247);
                    match(PLUS);
                    setState(248);
                    match(NAME);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(249);
                    match(NAME);
                    setState(250);
                    match(MINUS);
                    setState(251);
                    match(NAME);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(252);
                    match(NAME);
                    setState(253);
                    match(MULTIPLY);
                    setState(254);
                    match(NAME);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(255);
                    match(NAME);
                    setState(256);
                    match(DIVIDE);
                    setState(257);
                    match(NAME);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(258);
                    match(NAME);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(259);
                    functionCall();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(260);
                    getExpression();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ContentContext content() throws RecognitionException {
        ContentContext _localctx = new ContentContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_content);
        try {
            setState(270);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(263);
                    print();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(264);
                    declaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(265);
                    declarationElement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(266);
                    printSet();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(267);
                    functionCall();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(268);
                    ifBlock();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(269);
                    whileBlock();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SetExpressionContext extends ParserRuleContext {
        public SetExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OPEN_CURLY_BRACKET() {
            return getToken(SetGrammarParser.OPEN_CURLY_BRACKET, 0);
        }

        public List<TerminalNode> NAME() {
            return getTokens(SetGrammarParser.NAME);
        }

        public TerminalNode NAME(int i) {
            return getToken(SetGrammarParser.NAME, i);
        }

        public TerminalNode CLOSE_CURLY_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_CURLY_BRACKET, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SetGrammarParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SetGrammarParser.COMMA, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_setExpression;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitSetExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ProgramContext extends ParserRuleContext {
        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode MAIN() {
            return getToken(SetGrammarParser.MAIN, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<FunctionReturnContext> functionReturn() {
            return getRuleContexts(FunctionReturnContext.class);
        }

        public FunctionReturnContext functionReturn(int i) {
            return getRuleContext(FunctionReturnContext.class, i);
        }

        public List<FunctionNonReturnContext> functionNonReturn() {
            return getRuleContexts(FunctionNonReturnContext.class);
        }

        public FunctionNonReturnContext functionNonReturn(int i) {
            return getRuleContext(FunctionNonReturnContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OPEN_CURLY_BRACKET() {
            return getToken(SetGrammarParser.OPEN_CURLY_BRACKET, 0);
        }

        public TerminalNode CLOSE_CURLY_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_CURLY_BRACKET, 0);
        }

        public List<ContentContext> content() {
            return getRuleContexts(ContentContext.class);
        }

        public ContentContext content(int i) {
            return getRuleContext(ContentContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DeclarationContext extends ParserRuleContext {
        public DeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NAME() {
            return getToken(SetGrammarParser.NAME, 0);
        }

        public TerminalNode EQULS() {
            return getToken(SetGrammarParser.EQULS, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode SET() {
            return getToken(SetGrammarParser.SET, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaration;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DeclarationElementContext extends ParserRuleContext {
        public DeclarationElementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NAME() {
            return getToken(SetGrammarParser.NAME, 0);
        }

        public TerminalNode EQULS() {
            return getToken(SetGrammarParser.EQULS, 0);
        }

        public TerminalNode LINE() {
            return getToken(SetGrammarParser.LINE, 0);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public GetExpressionContext getExpression() {
            return getRuleContext(GetExpressionContext.class, 0);
        }

        public TerminalNode ELEMENT() {
            return getToken(SetGrammarParser.ELEMENT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declarationElement;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitDeclarationElement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrintContext extends ParserRuleContext {
        public PrintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode PRINT() {
            return getToken(SetGrammarParser.PRINT, 0);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(SetGrammarParser.OPEN_BRACKET, 0);
        }

        public TerminalNode LINE() {
            return getToken(SetGrammarParser.LINE, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_BRACKET, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_print;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitPrint(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrintSetContext extends ParserRuleContext {
        public PrintSetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode PRINT() {
            return getToken(SetGrammarParser.PRINT, 0);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(SetGrammarParser.OPEN_BRACKET, 0);
        }

        public TerminalNode NAME() {
            return getToken(SetGrammarParser.NAME, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_BRACKET, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_printSet;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitPrintSet(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InputSignatureContext extends ParserRuleContext {
        public InputSignatureContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(SetGrammarParser.OPEN_BRACKET, 0);
        }

        public List<TerminalNode> NAME() {
            return getTokens(SetGrammarParser.NAME);
        }

        public TerminalNode NAME(int i) {
            return getToken(SetGrammarParser.NAME, i);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_BRACKET, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SetGrammarParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SetGrammarParser.COMMA, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_inputSignature;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitInputSignature(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionCallContext extends ParserRuleContext {
        public FunctionCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NAME() {
            return getToken(SetGrammarParser.NAME, 0);
        }

        public InputSignatureContext inputSignature() {
            return getRuleContext(InputSignatureContext.class, 0);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(SetGrammarParser.OPEN_BRACKET, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_BRACKET, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionCall;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TypeContext extends ParserRuleContext {
        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode SET() {
            return getToken(SetGrammarParser.SET, 0);
        }

        public TerminalNode ELEMENT() {
            return getToken(SetGrammarParser.ELEMENT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor) return ((SetGrammarVisitor<? extends T>) visitor).visitType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SignatureFunctionContext extends ParserRuleContext {
        public SignatureFunctionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(SetGrammarParser.OPEN_BRACKET, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_BRACKET, 0);
        }

        public List<TypeContext> type() {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i) {
            return getRuleContext(TypeContext.class, i);
        }

        public List<TerminalNode> NAME() {
            return getTokens(SetGrammarParser.NAME);
        }

        public TerminalNode NAME(int i) {
            return getToken(SetGrammarParser.NAME, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SetGrammarParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SetGrammarParser.COMMA, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_signatureFunction;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitSignatureFunction(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionReturnContext extends ParserRuleContext {
        public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FUNCTION() {
            return getToken(SetGrammarParser.FUNCTION, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode NAME() {
            return getToken(SetGrammarParser.NAME, 0);
        }

        public BlockReturnContext blockReturn() {
            return getRuleContext(BlockReturnContext.class, 0);
        }

        public SignatureFunctionContext signatureFunction() {
            return getRuleContext(SignatureFunctionContext.class, 0);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(SetGrammarParser.OPEN_BRACKET, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_BRACKET, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionReturn;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitFunctionReturn(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionNonReturnContext extends ParserRuleContext {
        public FunctionNonReturnContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FUNCTION() {
            return getToken(SetGrammarParser.FUNCTION, 0);
        }

        public TerminalNode NAME() {
            return getToken(SetGrammarParser.NAME, 0);
        }

        public BlockNonReturnContext blockNonReturn() {
            return getRuleContext(BlockNonReturnContext.class, 0);
        }

        public SignatureFunctionContext signatureFunction() {
            return getRuleContext(SignatureFunctionContext.class, 0);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(SetGrammarParser.OPEN_BRACKET, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_BRACKET, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionNonReturn;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitFunctionNonReturn(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BlockReturnContext extends ParserRuleContext {
        public BlockReturnContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OPEN_CURLY_BRACKET() {
            return getToken(SetGrammarParser.OPEN_CURLY_BRACKET, 0);
        }

        public TerminalNode RETURN() {
            return getToken(SetGrammarParser.RETURN, 0);
        }

        public TerminalNode NAME() {
            return getToken(SetGrammarParser.NAME, 0);
        }

        public TerminalNode CLOSE_CURLY_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_CURLY_BRACKET, 0);
        }

        public List<ContentContext> content() {
            return getRuleContexts(ContentContext.class);
        }

        public ContentContext content(int i) {
            return getRuleContext(ContentContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_blockReturn;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitBlockReturn(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BlockNonReturnContext extends ParserRuleContext {
        public BlockNonReturnContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OPEN_CURLY_BRACKET() {
            return getToken(SetGrammarParser.OPEN_CURLY_BRACKET, 0);
        }

        public TerminalNode RETURN() {
            return getToken(SetGrammarParser.RETURN, 0);
        }

        public TerminalNode CLOSE_CURLY_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_CURLY_BRACKET, 0);
        }

        public List<ContentContext> content() {
            return getRuleContexts(ContentContext.class);
        }

        public ContentContext content(int i) {
            return getRuleContext(ContentContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_blockNonReturn;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitBlockNonReturn(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EqualCompareContext extends ParserRuleContext {
        public EqualCompareContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EQUAL() {
            return getToken(SetGrammarParser.EQUAL, 0);
        }

        public TerminalNode NON_EQUAL() {
            return getToken(SetGrammarParser.NON_EQUAL, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_equalCompare;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitEqualCompare(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CompareContext extends ParserRuleContext {
        public CompareContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EQUAL() {
            return getToken(SetGrammarParser.EQUAL, 0);
        }

        public TerminalNode NON_EQUAL() {
            return getToken(SetGrammarParser.NON_EQUAL, 0);
        }

        public TerminalNode LESS() {
            return getToken(SetGrammarParser.LESS, 0);
        }

        public TerminalNode GREATER() {
            return getToken(SetGrammarParser.GREATER, 0);
        }

        public List<SizeExpressionContext> sizeExpression() {
            return getRuleContexts(SizeExpressionContext.class);
        }

        public SizeExpressionContext sizeExpression(int i) {
            return getRuleContext(SizeExpressionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_compare;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitCompare(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SimpleCompareContext extends ParserRuleContext {
        public SimpleCompareContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public EqualCompareContext equalCompare() {
            return getRuleContext(EqualCompareContext.class, 0);
        }

        public CompareContext compare() {
            return getRuleContext(CompareContext.class, 0);
        }

        public IndexOfExpressionContext indexOfExpression() {
            return getRuleContext(IndexOfExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_simpleCompare;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitSimpleCompare(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NegationCompareContext extends ParserRuleContext {
        public NegationCompareContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NEGATION() {
            return getToken(SetGrammarParser.NEGATION, 0);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(SetGrammarParser.OPEN_BRACKET, 0);
        }

        public SimpleCompareContext simpleCompare() {
            return getRuleContext(SimpleCompareContext.class, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_BRACKET, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_negationCompare;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitNegationCompare(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ElseBlockContext extends ParserRuleContext {
        public ElseBlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ELSE() {
            return getToken(SetGrammarParser.ELSE, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseBlock;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitElseBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfBlockContext extends ParserRuleContext {
        public IfBlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IF() {
            return getToken(SetGrammarParser.IF, 0);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(SetGrammarParser.OPEN_BRACKET, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_BRACKET, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public SimpleCompareContext simpleCompare() {
            return getRuleContext(SimpleCompareContext.class, 0);
        }

        public NegationCompareContext negationCompare() {
            return getRuleContext(NegationCompareContext.class, 0);
        }

        public ElseBlockContext elseBlock() {
            return getRuleContext(ElseBlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifBlock;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitIfBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WhileBlockContext extends ParserRuleContext {
        public WhileBlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode WHILE() {
            return getToken(SetGrammarParser.WHILE, 0);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(SetGrammarParser.OPEN_BRACKET, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_BRACKET, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public SimpleCompareContext simpleCompare() {
            return getRuleContext(SimpleCompareContext.class, 0);
        }

        public NegationCompareContext negationCompare() {
            return getRuleContext(NegationCompareContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whileBlock;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitWhileBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SizeExpressionContext extends ParserRuleContext {
        public SizeExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NAME() {
            return getToken(SetGrammarParser.NAME, 0);
        }

        public TerminalNode DOT() {
            return getToken(SetGrammarParser.DOT, 0);
        }

        public TerminalNode SIZE() {
            return getToken(SetGrammarParser.SIZE, 0);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(SetGrammarParser.OPEN_BRACKET, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_BRACKET, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sizeExpression;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitSizeExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class GetExpressionContext extends ParserRuleContext {
        public GetExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NAME() {
            return getToken(SetGrammarParser.NAME, 0);
        }

        public TerminalNode DOT() {
            return getToken(SetGrammarParser.DOT, 0);
        }

        public TerminalNode GET() {
            return getToken(SetGrammarParser.GET, 0);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(SetGrammarParser.OPEN_BRACKET, 0);
        }

        public TerminalNode NUMBER() {
            return getToken(SetGrammarParser.NUMBER, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_BRACKET, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_getExpression;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitGetExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IndexOfExpressionContext extends ParserRuleContext {
        public IndexOfExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> NAME() {
            return getTokens(SetGrammarParser.NAME);
        }

        public TerminalNode NAME(int i) {
            return getToken(SetGrammarParser.NAME, i);
        }

        public TerminalNode DOT() {
            return getToken(SetGrammarParser.DOT, 0);
        }

        public TerminalNode INDEX_OF() {
            return getToken(SetGrammarParser.INDEX_OF, 0);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(SetGrammarParser.OPEN_BRACKET, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(SetGrammarParser.CLOSE_BRACKET, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_indexOfExpression;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitIndexOfExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpressionContext extends ParserRuleContext {
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public SetExpressionContext setExpression() {
            return getRuleContext(SetExpressionContext.class, 0);
        }

        public List<TerminalNode> NAME() {
            return getTokens(SetGrammarParser.NAME);
        }

        public TerminalNode NAME(int i) {
            return getToken(SetGrammarParser.NAME, i);
        }

        public TerminalNode PLUS() {
            return getToken(SetGrammarParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(SetGrammarParser.MINUS, 0);
        }

        public TerminalNode MULTIPLY() {
            return getToken(SetGrammarParser.MULTIPLY, 0);
        }

        public TerminalNode DIVIDE() {
            return getToken(SetGrammarParser.DIVIDE, 0);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public GetExpressionContext getExpression() {
            return getRuleContext(GetExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ContentContext extends ParserRuleContext {
        public ContentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public PrintContext print() {
            return getRuleContext(PrintContext.class, 0);
        }

        public DeclarationContext declaration() {
            return getRuleContext(DeclarationContext.class, 0);
        }

        public DeclarationElementContext declarationElement() {
            return getRuleContext(DeclarationElementContext.class, 0);
        }

        public PrintSetContext printSet() {
            return getRuleContext(PrintSetContext.class, 0);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public IfBlockContext ifBlock() {
            return getRuleContext(IfBlockContext.class, 0);
        }

        public WhileBlockContext whileBlock() {
            return getRuleContext(WhileBlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_content;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof SetGrammarVisitor)
                return ((SetGrammarVisitor<? extends T>) visitor).visitContent(this);
            else return visitor.visitChildren(this);
        }
    }
}