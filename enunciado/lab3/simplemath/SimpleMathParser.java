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
		WHITESPACE=1, VAR=2, FUNC=3, EQ=4, SEMICOLON=5, LPAREN=6, RPAREN=7, ADD=8, 
		MUL=9, SUB=10, COMMA=11, DIV=12, ID=13, NUM=14, ERROR_CHAR=15;
	public static final int
		RULE_root = 0, RULE_s = 1, RULE_var_declaration = 2, RULE_func_declaration = 3, 
		RULE_func_param_list = 4, RULE_expression = 5, RULE_expression_t = 6, 
		RULE_expression_f = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "s", "var_declaration", "func_declaration", "func_param_list", 
			"expression", "expression_t", "expression_f"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'var'", "'func'", "'='", "';'", "'('", "')'", "'+'", "'*'", 
			"'-'", "','", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "VAR", "FUNC", "EQ", "SEMICOLON", "LPAREN", "RPAREN", 
			"ADD", "MUL", "SUB", "COMMA", "DIV", "ID", "NUM", "ERROR_CHAR"
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
			setState(16);
			s(0);
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
	public static class SSemicolonSContext extends SContext {
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleMathParser.SEMICOLON, 0); }
		public SSemicolonSContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitSSemicolonS(this);
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
		return s(0);
	}

	private SContext s(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SContext _localctx = new SContext(_ctx, _parentState);
		SContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_s, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				_localctx = new VarDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				var_declaration();
				}
				break;
			case FUNC:
				{
				_localctx = new FuncDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				func_declaration();
				}
				break;
			case EOF:
				{
				_localctx = new EndOfFileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SSemicolonSContext(new SContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_s);
					setState(24);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(25);
					match(SEMICOLON);
					setState(26);
					s(5);
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
			setState(32);
			match(VAR);
			setState(33);
			match(ID);
			setState(34);
			match(EQ);
			setState(35);
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
		public TerminalNode ID() { return getToken(SimpleMathParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleMathParser.LPAREN, 0); }
		public Func_param_listContext func_param_list() {
			return getRuleContext(Func_param_listContext.class,0);
		}
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
			setState(37);
			match(FUNC);
			setState(38);
			match(ID);
			setState(39);
			match(LPAREN);
			setState(40);
			func_param_list();
			setState(41);
			match(RPAREN);
			setState(42);
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

	public static class Func_param_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimpleMathParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleMathParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(SimpleMathParser.COMMA, 0); }
		public Func_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitFunc_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_param_listContext func_param_list() throws RecognitionException {
		Func_param_listContext _localctx = new Func_param_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_param_list);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(ID);
				setState(46);
				match(COMMA);
				setState(47);
				match(ID);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(51);
			expression_t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(53);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(54);
						match(SUB);
						setState(55);
						expression_t(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(56);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(57);
						match(ADD);
						setState(58);
						expression_t(0);
						}
						break;
					}
					} 
				}
				setState(63);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65);
			expression_f();
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_tContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_t);
						setState(67);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(68);
						match(MUL);
						setState(69);
						expression_f();
						}
						break;
					case 2:
						{
						_localctx = new Expression_tContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_t);
						setState(70);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(71);
						match(DIV);
						setState(72);
						expression_f();
						}
						break;
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 14, RULE_expression_f);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(NUM);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(LPAREN);
				setState(81);
				expression(0);
				setState(82);
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
		case 1:
			return s_sempred((SContext)_localctx, predIndex);
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 6:
			return expression_t_sempred((Expression_tContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean s_sempred(SContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_t_sempred(Expression_tContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21Y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\5\3\31\n\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\63\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7>\n\7\f\7\16\7A\13\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\bL\n\b\f\b\16\bO\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tW"+
		"\n\t\3\t\2\5\4\f\16\n\2\4\6\b\n\f\16\20\2\2\2Z\2\22\3\2\2\2\4\30\3\2\2"+
		"\2\6\"\3\2\2\2\b\'\3\2\2\2\n\62\3\2\2\2\f\64\3\2\2\2\16B\3\2\2\2\20V\3"+
		"\2\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24\25\b\3\1\2\25\31\5\6\4\2\26\31\5"+
		"\b\5\2\27\31\7\2\2\3\30\24\3\2\2\2\30\26\3\2\2\2\30\27\3\2\2\2\31\37\3"+
		"\2\2\2\32\33\f\6\2\2\33\34\7\7\2\2\34\36\5\4\3\7\35\32\3\2\2\2\36!\3\2"+
		"\2\2\37\35\3\2\2\2\37 \3\2\2\2 \5\3\2\2\2!\37\3\2\2\2\"#\7\4\2\2#$\7\17"+
		"\2\2$%\7\6\2\2%&\5\f\7\2&\7\3\2\2\2\'(\7\5\2\2()\7\17\2\2)*\7\b\2\2*+"+
		"\5\n\6\2+,\7\t\2\2,-\5\f\7\2-\t\3\2\2\2.\63\7\17\2\2/\60\7\17\2\2\60\61"+
		"\7\r\2\2\61\63\7\17\2\2\62.\3\2\2\2\62/\3\2\2\2\63\13\3\2\2\2\64\65\b"+
		"\7\1\2\65\66\5\16\b\2\66?\3\2\2\2\678\f\5\2\289\7\f\2\29>\5\16\b\2:;\f"+
		"\4\2\2;<\7\n\2\2<>\5\16\b\2=\67\3\2\2\2=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2"+
		"?@\3\2\2\2@\r\3\2\2\2A?\3\2\2\2BC\b\b\1\2CD\5\20\t\2DM\3\2\2\2EF\f\5\2"+
		"\2FG\7\13\2\2GL\5\20\t\2HI\f\4\2\2IJ\7\16\2\2JL\5\20\t\2KE\3\2\2\2KH\3"+
		"\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\17\3\2\2\2OM\3\2\2\2PW\7\17\2\2"+
		"QW\7\20\2\2RS\7\b\2\2ST\5\f\7\2TU\7\t\2\2UW\3\2\2\2VP\3\2\2\2VQ\3\2\2"+
		"\2VR\3\2\2\2W\21\3\2\2\2\n\30\37\62=?KMV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}