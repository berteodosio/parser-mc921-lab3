// Generated from SimpleMath.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleMathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, VAR=2, ID=3, EQ=4, NUM=5, SEMICOLON=6, FUNC=7, LPAREN=8, 
		RPAREN=9, ADD=10, MUL=11, SUB=12, COMMA=13, DIV=14, ERROR_CHAR=15;
	public static final int
		RULE_root = 0, RULE_s = 1, RULE_var_declaration = 2, RULE_func_declaration = 3, 
		RULE_expression = 4, RULE_expression_t = 5, RULE_expression_f = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "s", "var_declaration", "func_declaration", "expression", "expression_t", 
			"expression_f"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'var'", null, "'='", null, "';'", "'func'", "'('", "')'", 
			"'+'", "'*'", "'-'", "','", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "VAR", "ID", "EQ", "NUM", "SEMICOLON", "FUNC", "LPAREN", 
			"RPAREN", "ADD", "MUL", "SUB", "COMMA", "DIV", "ERROR_CHAR"
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

	@Override
	public String getGrammarFileName() { return "SimpleMath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleMathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			s();
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

	public static class SContext extends ParserRuleContext {
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	 
		public SContext() { }
		public void copyFrom(SContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclarationContext extends SContext {
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public VarDeclarationContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndOfFileContext extends SContext {
		public TerminalNode EOF() { return getToken(SimpleMathParser.EOF, 0); }
		public EndOfFileContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitEndOfFile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncDeclarationContext extends SContext {
		public Func_declarationContext func_declaration() {
			return getRuleContext(Func_declarationContext.class,0);
		}
		public FuncDeclarationContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitFuncDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s);
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				var_declaration();
				}
				break;
			case FUNC:
				_localctx = new FuncDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				func_declaration();
				}
				break;
			case EOF:
				_localctx = new EndOfFileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Var_declarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SimpleMathParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SimpleMathParser.ID, 0); }
		public TerminalNode EQ() { return getToken(SimpleMathParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitVar_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(VAR);
			setState(22);
			match(ID);
			setState(23);
			match(EQ);
			setState(24);
			expression(0);
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

	public static class Func_declarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(SimpleMathParser.FUNC, 0); }
		public List<TerminalNode> ID() { return getTokens(SimpleMathParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleMathParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(SimpleMathParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleMathParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Func_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitFunc_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declarationContext func_declaration() throws RecognitionException {
		Func_declarationContext _localctx = new Func_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(FUNC);
			setState(27);
			match(ID);
			setState(28);
			match(LPAREN);
			setState(29);
			match(ID);
			setState(30);
			match(RPAREN);
			setState(31);
			expression(0);
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
		public Expression_tContext expression_t() {
			return getRuleContext(Expression_tContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(SimpleMathParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(SimpleMathParser.ADD, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(34);
			expression_t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(42);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(36);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(37);
						match(SUB);
						setState(38);
						expression_t(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(39);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(40);
						match(ADD);
						setState(41);
						expression_t(0);
						}
						break;
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression_tContext extends ParserRuleContext {
		public Expression_fContext expression_f() {
			return getRuleContext(Expression_fContext.class,0);
		}
		public Expression_tContext expression_t() {
			return getRuleContext(Expression_tContext.class,0);
		}
		public TerminalNode MUL() { return getToken(SimpleMathParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SimpleMathParser.DIV, 0); }
		public Expression_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_t; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitExpression_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_tContext expression_t() throws RecognitionException {
		return expression_t(0);
	}

	private Expression_tContext expression_t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_tContext _localctx = new Expression_tContext(_ctx, _parentState);
		Expression_tContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(48);
			expression_f();
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_tContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_t);
						setState(50);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(51);
						match(MUL);
						setState(52);
						expression_f();
						}
						break;
					case 2:
						{
						_localctx = new Expression_tContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_t);
						setState(53);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(54);
						match(DIV);
						setState(55);
						expression_f();
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression_fContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleMathParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SimpleMathParser.NUM, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleMathParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimpleMathParser.RPAREN, 0); }
		public Expression_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_f; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitExpression_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_fContext expression_f() throws RecognitionException {
		Expression_fContext _localctx = new Expression_fContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression_f);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(NUM);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(LPAREN);
				setState(64);
				expression(0);
				setState(65);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 5:
			return expression_t_sempred((Expression_tContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_t_sempred(Expression_tContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21H\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\5\3\26"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6-\n\6\f\6\16\6\60\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bF\n\b\3"+
		"\b\2\4\n\f\t\2\4\6\b\n\f\16\2\2\2H\2\20\3\2\2\2\4\25\3\2\2\2\6\27\3\2"+
		"\2\2\b\34\3\2\2\2\n#\3\2\2\2\f\61\3\2\2\2\16E\3\2\2\2\20\21\5\4\3\2\21"+
		"\3\3\2\2\2\22\26\5\6\4\2\23\26\5\b\5\2\24\26\7\2\2\3\25\22\3\2\2\2\25"+
		"\23\3\2\2\2\25\24\3\2\2\2\26\5\3\2\2\2\27\30\7\4\2\2\30\31\7\5\2\2\31"+
		"\32\7\6\2\2\32\33\5\n\6\2\33\7\3\2\2\2\34\35\7\t\2\2\35\36\7\5\2\2\36"+
		"\37\7\n\2\2\37 \7\5\2\2 !\7\13\2\2!\"\5\n\6\2\"\t\3\2\2\2#$\b\6\1\2$%"+
		"\5\f\7\2%.\3\2\2\2&\'\f\5\2\2\'(\7\16\2\2(-\5\f\7\2)*\f\4\2\2*+\7\f\2"+
		"\2+-\5\f\7\2,&\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\13\3"+
		"\2\2\2\60.\3\2\2\2\61\62\b\7\1\2\62\63\5\16\b\2\63<\3\2\2\2\64\65\f\5"+
		"\2\2\65\66\7\r\2\2\66;\5\16\b\2\678\f\4\2\289\7\20\2\29;\5\16\b\2:\64"+
		"\3\2\2\2:\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\r\3\2\2\2><\3\2\2"+
		"\2?F\7\5\2\2@F\7\7\2\2AB\7\n\2\2BC\5\n\6\2CD\7\13\2\2DF\3\2\2\2E?\3\2"+
		"\2\2E@\3\2\2\2EA\3\2\2\2F\17\3\2\2\2\b\25,.:<E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}