// Generated from D:/work/java/Compiler/grammar\SetGrammar.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SetGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, OPEN_BRACKET=2, CLOSE_BRACKET=3, OPEN_CURLY_BRACKET=4, CLOSE_CURLY_BRACKET=5, 
		OPEN_SQUARE_BRACKET=6, CLOSE_SQUARE_BRACKET=7, INT=8, ELEMENT=9, SET=10, 
		SET_EXPRESSION=11, PRINT=12, IF=13, ELSE=14, FOR=15, WHILE=16, RETURN=17, 
		EQULS=18, COMMA=19, PLUS=20, MINUS=21, MULTIPLY=22, DIVIDE=23, SPACE=24, 
		NAME=25, NUMBER=26, LINE=27;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_print = 2, RULE_declaration = 3, 
		RULE_print_set = 4, RULE_expression = 5, RULE_content = 6;
	public static final String[] ruleNames = {
		"program", "block", "print", "declaration", "print_set", "expression", 
		"content"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'int'", "'element'", 
		"'set'", null, "'print'", "'if'", "'else'", "'for'", "'while'", "'return'", 
		"'='", "','", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAIN", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", 
		"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "INT", "ELEMENT", "SET", 
		"SET_EXPRESSION", "PRINT", "IF", "ELSE", "FOR", "WHILE", "RETURN", "EQULS", 
		"COMMA", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "SPACE", "NAME", "NUMBER", 
		"LINE"
	};
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

	@Override
	public String getGrammarFileName() { return "SetGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SetGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(SetGrammarParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(MAIN);
			setState(15);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(SetGrammarParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(SetGrammarParser.CLOSE_CURLY_BRACKET, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(OPEN_CURLY_BRACKET);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << PRINT) | (1L << NAME))) != 0)) {
				{
				{
				setState(18);
				content();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(CLOSE_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SetGrammarParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(SetGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode LINE() { return getToken(SetGrammarParser.LINE, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SetGrammarParser.CLOSE_BRACKET, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(PRINT);
			setState(27);
			match(OPEN_BRACKET);
			setState(28);
			match(LINE);
			setState(29);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SetGrammarParser.NAME, 0); }
		public TerminalNode EQULS() { return getToken(SetGrammarParser.EQULS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SET() { return getToken(SetGrammarParser.SET, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET) {
				{
				setState(31);
				match(SET);
				}
			}

			setState(34);
			match(NAME);
			setState(35);
			match(EQULS);
			{
			setState(36);
			expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_setContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SetGrammarParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(SetGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode NAME() { return getToken(SetGrammarParser.NAME, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SetGrammarParser.CLOSE_BRACKET, 0); }
		public Print_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitPrint_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_setContext print_set() throws RecognitionException {
		Print_setContext _localctx = new Print_setContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(PRINT);
			setState(39);
			match(OPEN_BRACKET);
			setState(40);
			match(NAME);
			setState(41);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode SET_EXPRESSION() { return getToken(SetGrammarParser.SET_EXPRESSION, 0); }
		public List<TerminalNode> NAME() { return getTokens(SetGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SetGrammarParser.NAME, i);
		}
		public TerminalNode PLUS() { return getToken(SetGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SetGrammarParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(SetGrammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(SetGrammarParser.DIVIDE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(SET_EXPRESSION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(NAME);
				setState(45);
				match(PLUS);
				setState(46);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(NAME);
				setState(48);
				match(MINUS);
				setState(49);
				match(NAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(NAME);
				setState(51);
				match(MULTIPLY);
				setState(52);
				match(NAME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				match(NAME);
				setState(54);
				match(DIVIDE);
				setState(55);
				match(NAME);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				match(NAME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Print_setContext print_set() {
			return getRuleContext(Print_setContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetGrammarVisitor ) return ((SetGrammarVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_content);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				print_set();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35C\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\5\5#\n\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7<\n\7\3\b\3\b\3\b\5\bA\n\b\3\b\2\2\t\2\4\6\b\n\f\16"+
		"\2\2\2D\2\20\3\2\2\2\4\23\3\2\2\2\6\34\3\2\2\2\b\"\3\2\2\2\n(\3\2\2\2"+
		"\f;\3\2\2\2\16@\3\2\2\2\20\21\7\3\2\2\21\22\5\4\3\2\22\3\3\2\2\2\23\27"+
		"\7\6\2\2\24\26\5\16\b\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\7\2\2\33\5\3\2\2\2\34\35"+
		"\7\16\2\2\35\36\7\4\2\2\36\37\7\35\2\2\37 \7\5\2\2 \7\3\2\2\2!#\7\f\2"+
		"\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\33\2\2%&\7\24\2\2&\'\5\f\7\2\'"+
		"\t\3\2\2\2()\7\16\2\2)*\7\4\2\2*+\7\33\2\2+,\7\5\2\2,\13\3\2\2\2-<\7\r"+
		"\2\2./\7\33\2\2/\60\7\26\2\2\60<\7\33\2\2\61\62\7\33\2\2\62\63\7\27\2"+
		"\2\63<\7\33\2\2\64\65\7\33\2\2\65\66\7\30\2\2\66<\7\33\2\2\678\7\33\2"+
		"\289\7\31\2\29<\7\33\2\2:<\7\33\2\2;-\3\2\2\2;.\3\2\2\2;\61\3\2\2\2;\64"+
		"\3\2\2\2;\67\3\2\2\2;:\3\2\2\2<\r\3\2\2\2=A\5\6\4\2>A\5\b\5\2?A\5\n\6"+
		"\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\17\3\2\2\2\6\27\";@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}