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
		RULE_func_param_list = 4, RULE_func_body = 5, RULE_func_invocation = 6, 
		RULE_func_invocation_param_list = 7, RULE_func_invocation_param = 8, RULE_num_expression = 9, 
		RULE_num_expression_t = 10, RULE_num_expression_f = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "s", "var_declaration", "func_declaration", "func_param_list", 
			"func_body", "func_invocation", "func_invocation_param_list", "func_invocation_param", 
			"num_expression", "num_expression_t", "num_expression_f"
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
			setState(24);
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
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Func_declarationContext func_declaration() {
			return getRuleContext(Func_declarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SimpleMathParser.EOF, 0); }
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleMathParser.SEMICOLON, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitS(this);
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
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(27);
				var_declaration();
				}
				break;
			case FUNC:
				{
				setState(28);
				func_declaration();
				}
				break;
			case EOF:
				{
				setState(29);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_s);
					setState(32);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(33);
					match(SEMICOLON);
					setState(34);
					s(5);
					}
					} 
				}
				setState(39);
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
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
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
			setState(40);
			match(VAR);
			setState(41);
			match(ID);
			setState(42);
			match(EQ);
			setState(43);
			num_expression(0);
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
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
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
			setState(45);
			match(FUNC);
			setState(46);
			match(ID);
			setState(47);
			match(LPAREN);
			setState(48);
			func_param_list();
			setState(49);
			match(RPAREN);
			setState(50);
			func_body();
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
		public List<TerminalNode> COMMA() { return getTokens(SimpleMathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleMathParser.COMMA, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(53);
				match(COMMA);
				setState(54);
				match(ID);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Func_bodyContext extends ParserRuleContext {
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitFunc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			num_expression(0);
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

	public static class Func_invocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleMathParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleMathParser.LPAREN, 0); }
		public Func_invocation_param_listContext func_invocation_param_list() {
			return getRuleContext(Func_invocation_param_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimpleMathParser.RPAREN, 0); }
		public Func_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_invocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitFunc_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_invocationContext func_invocation() throws RecognitionException {
		Func_invocationContext _localctx = new Func_invocationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ID);
			setState(63);
			match(LPAREN);
			setState(64);
			func_invocation_param_list();
			setState(65);
			match(RPAREN);
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

	public static class Func_invocation_param_listContext extends ParserRuleContext {
		public List<Func_invocation_paramContext> func_invocation_param() {
			return getRuleContexts(Func_invocation_paramContext.class);
		}
		public Func_invocation_paramContext func_invocation_param(int i) {
			return getRuleContext(Func_invocation_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleMathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleMathParser.COMMA, i);
		}
		public Func_invocation_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_invocation_param_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitFunc_invocation_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_invocation_param_listContext func_invocation_param_list() throws RecognitionException {
		Func_invocation_param_listContext _localctx = new Func_invocation_param_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_invocation_param_list);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				func_invocation_param();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				func_invocation_param();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(69);
					match(COMMA);
					setState(70);
					func_invocation_param();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Func_invocation_paramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleMathParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SimpleMathParser.NUM, 0); }
		public Func_invocation_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_invocation_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitFunc_invocation_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_invocation_paramContext func_invocation_param() throws RecognitionException {
		Func_invocation_paramContext _localctx = new Func_invocation_paramContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_invocation_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Num_expressionContext extends ParserRuleContext {
		public Num_expression_tContext num_expression_t() {
			return getRuleContext(Num_expression_tContext.class,0);
		}
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(SimpleMathParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(SimpleMathParser.ADD, 0); }
		public Num_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitNum_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_expressionContext num_expression() throws RecognitionException {
		return num_expression(0);
	}

	private Num_expressionContext num_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Num_expressionContext _localctx = new Num_expressionContext(_ctx, _parentState);
		Num_expressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_num_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(81);
			num_expression_t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Num_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_num_expression);
						setState(83);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(84);
						match(SUB);
						setState(85);
						num_expression_t(0);
						}
						break;
					case 2:
						{
						_localctx = new Num_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_num_expression);
						setState(86);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(87);
						match(ADD);
						setState(88);
						num_expression_t(0);
						}
						break;
					}
					} 
				}
				setState(93);
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

	public static class Num_expression_tContext extends ParserRuleContext {
		public Num_expression_fContext num_expression_f() {
			return getRuleContext(Num_expression_fContext.class,0);
		}
		public Num_expression_tContext num_expression_t() {
			return getRuleContext(Num_expression_tContext.class,0);
		}
		public TerminalNode MUL() { return getToken(SimpleMathParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SimpleMathParser.DIV, 0); }
		public Num_expression_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expression_t; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitNum_expression_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_expression_tContext num_expression_t() throws RecognitionException {
		return num_expression_t(0);
	}

	private Num_expression_tContext num_expression_t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Num_expression_tContext _localctx = new Num_expression_tContext(_ctx, _parentState);
		Num_expression_tContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_num_expression_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(95);
			num_expression_f();
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new Num_expression_tContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_num_expression_t);
						setState(97);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(98);
						match(MUL);
						setState(99);
						num_expression_f();
						}
						break;
					case 2:
						{
						_localctx = new Num_expression_tContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_num_expression_t);
						setState(100);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(101);
						match(DIV);
						setState(102);
						num_expression_f();
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Num_expression_fContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleMathParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SimpleMathParser.NUM, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleMathParser.LPAREN, 0); }
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimpleMathParser.RPAREN, 0); }
		public Func_invocationContext func_invocation() {
			return getRuleContext(Func_invocationContext.class,0);
		}
		public Num_expression_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expression_f; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleMathVisitor ) return ((SimpleMathVisitor<? extends T>)visitor).visitNum_expression_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_expression_fContext num_expression_f() throws RecognitionException {
		Num_expression_fContext _localctx = new Num_expression_fContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_num_expression_f);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(LPAREN);
				setState(111);
				num_expression(0);
				setState(112);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				func_invocation();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return s_sempred((SContext)_localctx, predIndex);
		case 9:
			return num_expression_sempred((Num_expressionContext)_localctx, predIndex);
		case 10:
			return num_expression_t_sempred((Num_expression_tContext)_localctx, predIndex);
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
	private boolean num_expression_sempred(Num_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean num_expression_t_sempred(Num_expression_tContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21x\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\5\3!\n\3\3\3\3\3\3\3\7\3&\n\3\f"+
		"\3\16\3)\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\7\6:\n\6\f\6\16\6=\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\7\tJ\n\t\f\t\16\tM\13\t\5\tO\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\\\n\13\f\13\16\13_\13\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\fj\n\f\f\f\16\fm\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"v\n\r\3\r\2\5\4\24\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\17\20\2"+
		"x\2\32\3\2\2\2\4 \3\2\2\2\6*\3\2\2\2\b/\3\2\2\2\n\66\3\2\2\2\f>\3\2\2"+
		"\2\16@\3\2\2\2\20N\3\2\2\2\22P\3\2\2\2\24R\3\2\2\2\26`\3\2\2\2\30u\3\2"+
		"\2\2\32\33\5\4\3\2\33\3\3\2\2\2\34\35\b\3\1\2\35!\5\6\4\2\36!\5\b\5\2"+
		"\37!\7\2\2\3 \34\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!\'\3\2\2\2\"#\f\6\2\2"+
		"#$\7\7\2\2$&\5\4\3\7%\"\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3\2"+
		"\2\2)\'\3\2\2\2*+\7\4\2\2+,\7\17\2\2,-\7\6\2\2-.\5\24\13\2.\7\3\2\2\2"+
		"/\60\7\5\2\2\60\61\7\17\2\2\61\62\7\b\2\2\62\63\5\n\6\2\63\64\7\t\2\2"+
		"\64\65\5\f\7\2\65\t\3\2\2\2\66;\7\17\2\2\678\7\r\2\28:\7\17\2\29\67\3"+
		"\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\13\3\2\2\2=;\3\2\2\2>?\5\24\13\2"+
		"?\r\3\2\2\2@A\7\17\2\2AB\7\b\2\2BC\5\20\t\2CD\7\t\2\2D\17\3\2\2\2EO\5"+
		"\22\n\2FK\5\22\n\2GH\7\r\2\2HJ\5\22\n\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NE\3\2\2\2NF\3\2\2\2O\21\3\2\2\2PQ\t\2\2"+
		"\2Q\23\3\2\2\2RS\b\13\1\2ST\5\26\f\2T]\3\2\2\2UV\f\5\2\2VW\7\f\2\2W\\"+
		"\5\26\f\2XY\f\4\2\2YZ\7\n\2\2Z\\\5\26\f\2[U\3\2\2\2[X\3\2\2\2\\_\3\2\2"+
		"\2][\3\2\2\2]^\3\2\2\2^\25\3\2\2\2_]\3\2\2\2`a\b\f\1\2ab\5\30\r\2bk\3"+
		"\2\2\2cd\f\5\2\2de\7\13\2\2ej\5\30\r\2fg\f\4\2\2gh\7\16\2\2hj\5\30\r\2"+
		"ic\3\2\2\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\27\3\2\2\2mk\3\2\2"+
		"\2nv\7\17\2\2ov\7\20\2\2pq\7\b\2\2qr\5\24\13\2rs\7\t\2\2sv\3\2\2\2tv\5"+
		"\16\b\2un\3\2\2\2uo\3\2\2\2up\3\2\2\2ut\3\2\2\2v\31\3\2\2\2\f \';KN[]"+
		"iku";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}