// Generated from java-escape by ANTLR 4.11.1

import backend.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, Type=24, NUMERIC=25, 
		STRING=26, BOOL=27, ID=28, COMMENT=29, WHITESPACE=30;
	public static final int
		RULE_program = 0, RULE_prog_b = 1, RULE_prog_list = 2, RULE_string_list = 3, 
		RULE_statement = 4, RULE_assignment = 5, RULE_expression = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "prog_b", "prog_list", "string_list", "statement", "assignment", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'='", "'function'", "'('", "')'", "'{'", "'}'", 
			"'++'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'for('", 
			"'in'", "'..'", "'if('", "'else'", "'print('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Type", "NUMERIC", "STRING", "BOOL", "ID", "COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public PLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Expr expr;
		public Prog_listContext prog_list;
		public Prog_listContext prog_list() {
			return getRuleContext(Prog_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PLParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((ProgramContext)_localctx).prog_list = prog_list();
			setState(15);
			match(EOF);
			 ((ProgramContext)_localctx).expr =  new Block (((ProgramContext)_localctx).prog_list.list);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Prog_bContext extends ParserRuleContext {
		public Expr expr;
		public Prog_listContext prog_list;
		public Prog_listContext prog_list() {
			return getRuleContext(Prog_listContext.class,0);
		}
		public Prog_bContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog_b; }
	}

	public final Prog_bContext prog_b() throws RecognitionException {
		Prog_bContext _localctx = new Prog_bContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((Prog_bContext)_localctx).prog_list = prog_list();
			 ((Prog_bContext)_localctx).expr =  new Block (((Prog_bContext)_localctx).prog_list.list);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Prog_listContext extends ParserRuleContext {
		public List<Expr> list;
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Prog_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog_list; }
	}

	public final Prog_listContext prog_list() throws RecognitionException {
		Prog_listContext _localctx = new Prog_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List <Expr> statements = new ArrayList<Expr>(); 
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				((Prog_listContext)_localctx).statement = statement();
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(23);
					match(T__0);
					}
				}

				 statements.add(((Prog_listContext)_localctx).statement.expr);
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 530843696L) != 0 );
			((Prog_listContext)_localctx).list =  statements;
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_listContext extends ParserRuleContext {
		public List<String> list;
		public Token Type;
		public Token ID;
		public List<TerminalNode> Type() { return getTokens(PLParser.Type); }
		public TerminalNode Type(int i) {
			return getToken(PLParser.Type, i);
		}
		public List<TerminalNode> ID() { return getTokens(PLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLParser.ID, i);
		}
		public String_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_list; }
	}

	public final String_listContext string_list() throws RecognitionException {
		String_listContext _localctx = new String_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_string_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List <String> statements = new ArrayList<String>(); 
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				((String_listContext)_localctx).Type = match(Type);
				setState(36);
				((String_listContext)_localctx).ID = match(ID);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(37);
					match(T__0);
					}
				}

				 statements.add((((String_listContext)_localctx).Type!=null?((String_listContext)_localctx).Type.getText():null) + " " + (((String_listContext)_localctx).ID!=null?((String_listContext)_localctx).ID.getText():null));
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Type );
			((String_listContext)_localctx).list =  statements;
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Expr expr;
		public AssignmentContext assignment;
		public ExpressionContext expression;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				((StatementContext)_localctx).assignment = assignment();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(48);
					match(T__1);
					}
				}

				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).assignment.expr; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				((StatementContext)_localctx).expression = expression(0);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(54);
					match(T__1);
					}
				}

				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).expression.expr; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Expr expr;
		public Token Type;
		public Token ID;
		public ExpressionContext expression;
		public String_listContext args;
		public Prog_bContext body;
		public TerminalNode Type() { return getToken(PLParser.Type, 0); }
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public String_listContext string_list() {
			return getRuleContext(String_listContext.class,0);
		}
		public Prog_bContext prog_b() {
			return getRuleContext(Prog_bContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((AssignmentContext)_localctx).Type = match(Type);
				setState(62);
				((AssignmentContext)_localctx).ID = match(ID);
				setState(63);
				match(T__2);
				setState(64);
				((AssignmentContext)_localctx).expression = expression(0);
				 ((AssignmentContext)_localctx).expr =  new Assign((((AssignmentContext)_localctx).Type!=null?((AssignmentContext)_localctx).Type.getText():null), (((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), ((AssignmentContext)_localctx).expression.expr); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				((AssignmentContext)_localctx).ID = match(ID);
				setState(68);
				match(T__2);
				setState(69);
				((AssignmentContext)_localctx).expression = expression(0);
				 ((AssignmentContext)_localctx).expr =  new Reassign((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), ((AssignmentContext)_localctx).expression.expr); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(T__3);
				setState(73);
				((AssignmentContext)_localctx).Type = match(Type);
				setState(74);
				((AssignmentContext)_localctx).ID = match(ID);
				setState(75);
				match(T__4);
				setState(76);
				((AssignmentContext)_localctx).args = string_list();
				setState(77);
				match(T__5);
				setState(78);
				match(T__6);
				setState(79);
				((AssignmentContext)_localctx).body = prog_b();
				setState(80);
				match(T__7);
				((AssignmentContext)_localctx).expr =  new Declare((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), (((AssignmentContext)_localctx).Type!=null?((AssignmentContext)_localctx).Type.getText():null), ((AssignmentContext)_localctx).args.list, ((AssignmentContext)_localctx).body.expr);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expr expr;
		public ExpressionContext e1;
		public ExpressionContext expression;
		public Token ID;
		public ExpressionContext e2;
		public Prog_bContext body;
		public ExpressionContext comp;
		public Prog_bContext body1;
		public Prog_bContext body2;
		public Prog_listContext prog_list;
		public Token NUMERIC;
		public Token BOOL;
		public Token STRING;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public List<Prog_bContext> prog_b() {
			return getRuleContexts(Prog_bContext.class);
		}
		public Prog_bContext prog_b(int i) {
			return getRuleContext(Prog_bContext.class,i);
		}
		public Prog_listContext prog_list() {
			return getRuleContext(Prog_listContext.class,0);
		}
		public TerminalNode NUMERIC() { return getToken(PLParser.NUMERIC, 0); }
		public TerminalNode BOOL() { return getToken(PLParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(PLParser.STRING, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(86);
				match(T__10);
				setState(87);
				((ExpressionContext)_localctx).e1 = ((ExpressionContext)_localctx).expression = expression(17);
				((ExpressionContext)_localctx).expr =  new Arith(Operator.SUB, new IntLiteral("0"), ((ExpressionContext)_localctx).e1.expr);
				}
				break;
			case 2:
				{
				setState(90);
				match(T__17);
				setState(91);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(92);
				match(T__18);
				setState(93);
				((ExpressionContext)_localctx).e1 = ((ExpressionContext)_localctx).expression = expression(0);
				setState(94);
				match(T__19);
				setState(95);
				((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
				setState(96);
				match(T__5);
				setState(97);
				match(T__6);
				setState(98);
				((ExpressionContext)_localctx).body = prog_b();
				setState(99);
				match(T__7);
				((ExpressionContext)_localctx).expr =  new For((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e1.expr, ((ExpressionContext)_localctx).e2.expr, ((ExpressionContext)_localctx).body.expr);
				}
				break;
			case 3:
				{
				setState(102);
				match(T__20);
				setState(103);
				((ExpressionContext)_localctx).comp = ((ExpressionContext)_localctx).expression = expression(0);
				setState(104);
				match(T__5);
				setState(105);
				match(T__6);
				setState(106);
				((ExpressionContext)_localctx).body1 = prog_b();
				setState(107);
				match(T__7);
				setState(108);
				match(T__21);
				setState(109);
				match(T__6);
				setState(110);
				((ExpressionContext)_localctx).body2 = prog_b();
				setState(111);
				match(T__7);
				((ExpressionContext)_localctx).expr =  new Ifelse(((ExpressionContext)_localctx).comp.expr, ((ExpressionContext)_localctx).body1.expr, ((ExpressionContext)_localctx).body2.expr);
				}
				break;
			case 4:
				{
				setState(114);
				match(T__22);
				setState(115);
				((ExpressionContext)_localctx).prog_list = prog_list();
				setState(116);
				match(T__5);
				((ExpressionContext)_localctx).expr =  new Print(((ExpressionContext)_localctx).prog_list.list);
				}
				break;
			case 5:
				{
				setState(119);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(120);
				match(T__4);
				setState(121);
				((ExpressionContext)_localctx).prog_list = prog_list();
				setState(122);
				match(T__5);
				((ExpressionContext)_localctx).expr =  new Invoke((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).prog_list.list);
				}
				break;
			case 6:
				{
				setState(125);
				match(T__4);
				setState(126);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(127);
				match(T__5);
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).expression.expr; 
				}
				break;
			case 7:
				{
				setState(130);
				((ExpressionContext)_localctx).NUMERIC = match(NUMERIC);
				((ExpressionContext)_localctx).expr =  new IntLiteral((((ExpressionContext)_localctx).NUMERIC!=null?((ExpressionContext)_localctx).NUMERIC.getText():null)); 
				}
				break;
			case 8:
				{
				setState(132);
				((ExpressionContext)_localctx).BOOL = match(BOOL);
				((ExpressionContext)_localctx).expr =  new BooleanLiteral((((ExpressionContext)_localctx).BOOL!=null?((ExpressionContext)_localctx).BOOL.getText():null)); 
				}
				break;
			case 9:
				{
				setState(134);
				((ExpressionContext)_localctx).STRING = match(STRING);
				((ExpressionContext)_localctx).expr =  new StringLiteral((((ExpressionContext)_localctx).STRING!=null?((ExpressionContext)_localctx).STRING.getText():null)); 
				}
				break;
			case 10:
				{
				setState(136);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).expr =  new IdentifierExpr((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(141);
						match(T__8);
						setState(142);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(21);
						((ExpressionContext)_localctx).expr =  new Concat(((ExpressionContext)_localctx).e1.expr, ((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(146);
						match(T__9);
						setState(147);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(20);
						((ExpressionContext)_localctx).expr =  new Arith(Operator.ADD, ((ExpressionContext)_localctx).e1.expr, ((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(151);
						match(T__10);
						setState(152);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(19);
						((ExpressionContext)_localctx).expr =  new Arith(Operator.SUB, ((ExpressionContext)_localctx).e1.expr, ((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(156);
						match(T__11);
						setState(157);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(17);
						((ExpressionContext)_localctx).expr =  new Arith(Operator.MUL, ((ExpressionContext)_localctx).e1.expr, ((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(161);
						match(T__12);
						setState(162);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(16);
						((ExpressionContext)_localctx).expr =  new Arith(Operator.MUL, ((ExpressionContext)_localctx).e1.expr, ((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(166);
						match(T__13);
						setState(167);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(15);
						((ExpressionContext)_localctx).expr =  new Cmp(CmpOperators.LT, ((ExpressionContext)_localctx).e1.expr, ((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(171);
						match(T__14);
						setState(172);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(14);
						((ExpressionContext)_localctx).expr =  new Cmp(CmpOperators.GT, ((ExpressionContext)_localctx).e1.expr, ((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(176);
						match(T__2);
						setState(177);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(13);
						((ExpressionContext)_localctx).expr =  new Cmp(CmpOperators.EQ, ((ExpressionContext)_localctx).e1.expr, ((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(181);
						match(T__15);
						setState(182);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(12);
						((ExpressionContext)_localctx).expr =  new Cmp(CmpOperators.LTE, ((ExpressionContext)_localctx).e1.expr, ((ExpressionContext)_localctx).e2.expr);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(186);
						match(T__16);
						setState(187);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(11);
						((ExpressionContext)_localctx).expr =  new Cmp(CmpOperators.GTE, ((ExpressionContext)_localctx).e1.expr, ((ExpressionContext)_localctx).e2.expr);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0019\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002\u001d\b\u0002\u000b\u0002\f\u0002\u001e\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\'\b"+
		"\u0003\u0001\u0003\u0004\u0003*\b\u0003\u000b\u0003\f\u0003+\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u00042\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00048\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004<\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005T\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u008b\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00bf\b\u0006\n\u0006\f\u0006\u00c2\t\u0006\u0001\u0006\u0000"+
		"\u0001\f\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000\u00d8\u0000\u000e"+
		"\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u0015"+
		"\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000\u0000\b;\u0001\u0000"+
		"\u0000\u0000\nS\u0001\u0000\u0000\u0000\f\u008a\u0001\u0000\u0000\u0000"+
		"\u000e\u000f\u0003\u0004\u0002\u0000\u000f\u0010\u0005\u0000\u0000\u0001"+
		"\u0010\u0011\u0006\u0000\uffff\uffff\u0000\u0011\u0001\u0001\u0000\u0000"+
		"\u0000\u0012\u0013\u0003\u0004\u0002\u0000\u0013\u0014\u0006\u0001\uffff"+
		"\uffff\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0015\u001c\u0006\u0002"+
		"\uffff\uffff\u0000\u0016\u0018\u0003\b\u0004\u0000\u0017\u0019\u0005\u0001"+
		"\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b\u0006\u0002"+
		"\uffff\uffff\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u0016\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 !\u0006\u0002\uffff\uffff\u0000!\u0005\u0001\u0000\u0000"+
		"\u0000\")\u0006\u0003\uffff\uffff\u0000#$\u0005\u0018\u0000\u0000$&\u0005"+
		"\u001c\u0000\u0000%\'\u0005\u0001\u0000\u0000&%\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0006\u0003\uffff"+
		"\uffff\u0000)#\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-.\u0006\u0003\uffff\uffff\u0000.\u0007\u0001\u0000\u0000\u0000/1\u0003"+
		"\n\u0005\u000002\u0005\u0002\u0000\u000010\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0006\u0004\uffff\uffff"+
		"\u00004<\u0001\u0000\u0000\u000057\u0003\f\u0006\u000068\u0005\u0002\u0000"+
		"\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009:\u0006\u0004\uffff\uffff\u0000:<\u0001\u0000\u0000\u0000"+
		";/\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000<\t\u0001\u0000\u0000"+
		"\u0000=>\u0005\u0018\u0000\u0000>?\u0005\u001c\u0000\u0000?@\u0005\u0003"+
		"\u0000\u0000@A\u0003\f\u0006\u0000AB\u0006\u0005\uffff\uffff\u0000BT\u0001"+
		"\u0000\u0000\u0000CD\u0005\u001c\u0000\u0000DE\u0005\u0003\u0000\u0000"+
		"EF\u0003\f\u0006\u0000FG\u0006\u0005\uffff\uffff\u0000GT\u0001\u0000\u0000"+
		"\u0000HI\u0005\u0004\u0000\u0000IJ\u0005\u0018\u0000\u0000JK\u0005\u001c"+
		"\u0000\u0000KL\u0005\u0005\u0000\u0000LM\u0003\u0006\u0003\u0000MN\u0005"+
		"\u0006\u0000\u0000NO\u0005\u0007\u0000\u0000OP\u0003\u0002\u0001\u0000"+
		"PQ\u0005\b\u0000\u0000QR\u0006\u0005\uffff\uffff\u0000RT\u0001\u0000\u0000"+
		"\u0000S=\u0001\u0000\u0000\u0000SC\u0001\u0000\u0000\u0000SH\u0001\u0000"+
		"\u0000\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0006\u0006\uffff\uffff"+
		"\u0000VW\u0005\u000b\u0000\u0000WX\u0003\f\u0006\u0011XY\u0006\u0006\uffff"+
		"\uffff\u0000Y\u008b\u0001\u0000\u0000\u0000Z[\u0005\u0012\u0000\u0000"+
		"[\\\u0005\u001c\u0000\u0000\\]\u0005\u0013\u0000\u0000]^\u0003\f\u0006"+
		"\u0000^_\u0005\u0014\u0000\u0000_`\u0003\f\u0006\u0000`a\u0005\u0006\u0000"+
		"\u0000ab\u0005\u0007\u0000\u0000bc\u0003\u0002\u0001\u0000cd\u0005\b\u0000"+
		"\u0000de\u0006\u0006\uffff\uffff\u0000e\u008b\u0001\u0000\u0000\u0000"+
		"fg\u0005\u0015\u0000\u0000gh\u0003\f\u0006\u0000hi\u0005\u0006\u0000\u0000"+
		"ij\u0005\u0007\u0000\u0000jk\u0003\u0002\u0001\u0000kl\u0005\b\u0000\u0000"+
		"lm\u0005\u0016\u0000\u0000mn\u0005\u0007\u0000\u0000no\u0003\u0002\u0001"+
		"\u0000op\u0005\b\u0000\u0000pq\u0006\u0006\uffff\uffff\u0000q\u008b\u0001"+
		"\u0000\u0000\u0000rs\u0005\u0017\u0000\u0000st\u0003\u0004\u0002\u0000"+
		"tu\u0005\u0006\u0000\u0000uv\u0006\u0006\uffff\uffff\u0000v\u008b\u0001"+
		"\u0000\u0000\u0000wx\u0005\u001c\u0000\u0000xy\u0005\u0005\u0000\u0000"+
		"yz\u0003\u0004\u0002\u0000z{\u0005\u0006\u0000\u0000{|\u0006\u0006\uffff"+
		"\uffff\u0000|\u008b\u0001\u0000\u0000\u0000}~\u0005\u0005\u0000\u0000"+
		"~\u007f\u0003\f\u0006\u0000\u007f\u0080\u0005\u0006\u0000\u0000\u0080"+
		"\u0081\u0006\u0006\uffff\uffff\u0000\u0081\u008b\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005\u0019\u0000\u0000\u0083\u008b\u0006\u0006\uffff\uffff"+
		"\u0000\u0084\u0085\u0005\u001b\u0000\u0000\u0085\u008b\u0006\u0006\uffff"+
		"\uffff\u0000\u0086\u0087\u0005\u001a\u0000\u0000\u0087\u008b\u0006\u0006"+
		"\uffff\uffff\u0000\u0088\u0089\u0005\u001c\u0000\u0000\u0089\u008b\u0006"+
		"\u0006\uffff\uffff\u0000\u008aU\u0001\u0000\u0000\u0000\u008aZ\u0001\u0000"+
		"\u0000\u0000\u008af\u0001\u0000\u0000\u0000\u008ar\u0001\u0000\u0000\u0000"+
		"\u008aw\u0001\u0000\u0000\u0000\u008a}\u0001\u0000\u0000\u0000\u008a\u0082"+
		"\u0001\u0000\u0000\u0000\u008a\u0084\u0001\u0000\u0000\u0000\u008a\u0086"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u00c0"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\n\u0014\u0000\u0000\u008d\u008e\u0005"+
		"\t\u0000\u0000\u008e\u008f\u0003\f\u0006\u0015\u008f\u0090\u0006\u0006"+
		"\uffff\uffff\u0000\u0090\u00bf\u0001\u0000\u0000\u0000\u0091\u0092\n\u0013"+
		"\u0000\u0000\u0092\u0093\u0005\n\u0000\u0000\u0093\u0094\u0003\f\u0006"+
		"\u0014\u0094\u0095\u0006\u0006\uffff\uffff\u0000\u0095\u00bf\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\n\u0012\u0000\u0000\u0097\u0098\u0005\u000b\u0000"+
		"\u0000\u0098\u0099\u0003\f\u0006\u0013\u0099\u009a\u0006\u0006\uffff\uffff"+
		"\u0000\u009a\u00bf\u0001\u0000\u0000\u0000\u009b\u009c\n\u0010\u0000\u0000"+
		"\u009c\u009d\u0005\f\u0000\u0000\u009d\u009e\u0003\f\u0006\u0011\u009e"+
		"\u009f\u0006\u0006\uffff\uffff\u0000\u009f\u00bf\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\n\u000f\u0000\u0000\u00a1\u00a2\u0005\r\u0000\u0000\u00a2"+
		"\u00a3\u0003\f\u0006\u0010\u00a3\u00a4\u0006\u0006\uffff\uffff\u0000\u00a4"+
		"\u00bf\u0001\u0000\u0000\u0000\u00a5\u00a6\n\u000e\u0000\u0000\u00a6\u00a7"+
		"\u0005\u000e\u0000\u0000\u00a7\u00a8\u0003\f\u0006\u000f\u00a8\u00a9\u0006"+
		"\u0006\uffff\uffff\u0000\u00a9\u00bf\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\n\r\u0000\u0000\u00ab\u00ac\u0005\u000f\u0000\u0000\u00ac\u00ad\u0003"+
		"\f\u0006\u000e\u00ad\u00ae\u0006\u0006\uffff\uffff\u0000\u00ae\u00bf\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\n\f\u0000\u0000\u00b0\u00b1\u0005\u0003"+
		"\u0000\u0000\u00b1\u00b2\u0003\f\u0006\r\u00b2\u00b3\u0006\u0006\uffff"+
		"\uffff\u0000\u00b3\u00bf\u0001\u0000\u0000\u0000\u00b4\u00b5\n\u000b\u0000"+
		"\u0000\u00b5\u00b6\u0005\u0010\u0000\u0000\u00b6\u00b7\u0003\f\u0006\f"+
		"\u00b7\u00b8\u0006\u0006\uffff\uffff\u0000\u00b8\u00bf\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\n\n\u0000\u0000\u00ba\u00bb\u0005\u0011\u0000\u0000"+
		"\u00bb\u00bc\u0003\f\u0006\u000b\u00bc\u00bd\u0006\u0006\uffff\uffff\u0000"+
		"\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u008c\u0001\u0000\u0000\u0000"+
		"\u00be\u0091\u0001\u0000\u0000\u0000\u00be\u0096\u0001\u0000\u0000\u0000"+
		"\u00be\u009b\u0001\u0000\u0000\u0000\u00be\u00a0\u0001\u0000\u0000\u0000"+
		"\u00be\u00a5\u0001\u0000\u0000\u0000\u00be\u00aa\u0001\u0000\u0000\u0000"+
		"\u00be\u00af\u0001\u0000\u0000\u0000\u00be\u00b4\u0001\u0000\u0000\u0000"+
		"\u00be\u00b9\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c1\r\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u000b"+
		"\u0018\u001e&+17;S\u008a\u00be\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}