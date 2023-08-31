// Generated from dev/tlang/parser/TLangCommon.g4 by ANTLR 4.13.0
package dev.tlang.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TLangCommonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, TEXT=27, WS=28, STRING=29, NUMBER=30, COMMENT=31, 
		LINE_COMMENT=32, Helper=33, Tmpl=34, Model=35, Use=36, Expose=37, Func=38, 
		If=39, Else=40, For=41, In=42, To=43, Until=44, Set=45, Ext=46, Impl=47, 
		Spec=48, Pkg=49, While=50, Do=51, Var=52, Return=53, LBRACE=54, RBRACE=55, 
		ESCAPED_ID=56, WHITE_SPACES=57, ID=58;
	public static final int
		RULE_assignVar = 0, RULE_valueType = 1, RULE_objType = 2, RULE_arrayType = 3, 
		RULE_operation = 4, RULE_operator = 5, RULE_complexValueType = 6, RULE_primitiveValue = 7, 
		RULE_lazyValue = 8, RULE_stringValue = 9, RULE_numberValue = 10, RULE_textValue = 11, 
		RULE_boolValue = 12, RULE_arrayValue = 13, RULE_callObj = 14, RULE_callObjType = 15, 
		RULE_callArray = 16, RULE_callFunc = 17, RULE_curryParams = 18, RULE_setAttribute = 19, 
		RULE_callVariable = 20, RULE_entityValue = 21, RULE_impl = 22, RULE_multiValue = 23, 
		RULE_complexAttribute = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"assignVar", "valueType", "objType", "arrayType", "operation", "operator", 
			"complexValueType", "primitiveValue", "lazyValue", "stringValue", "numberValue", 
			"textValue", "boolValue", "arrayValue", "callObj", "callObjType", "callArray", 
			"callFunc", "curryParams", "setAttribute", "callVariable", "entityValue", 
			"impl", "multiValue", "complexAttribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "':'", "'='", "'.'", "'['", "']'", "'('", "')'", "'&&'", 
			"'||'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'_'", "'true'", "'false'", "','", "'&'", null, null, 
			null, null, null, null, "'helper'", "'tmpl'", "'model'", "'use'", "'expose'", 
			"'func'", "'if'", "'else'", "'for'", "'in'", "'to'", "'until'", "'set'", 
			"'ext'", "'impl'", "'spec'", "'pkg'", "'while'", "'do'", "'var'", "'return'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "TEXT", "WS", "STRING", "NUMBER", "COMMENT", "LINE_COMMENT", 
			"Helper", "Tmpl", "Model", "Use", "Expose", "Func", "If", "Else", "For", 
			"In", "To", "Until", "Set", "Ext", "Impl", "Spec", "Pkg", "While", "Do", 
			"Var", "Return", "LBRACE", "RBRACE", "ESCAPED_ID", "WHITE_SPACES", "ID"
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
	public String getGrammarFileName() { return "TLangCommon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLangCommonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignVarContext extends ParserRuleContext {
		public Token name;
		public ValueTypeContext type;
		public OperationContext value;
		public TerminalNode ID() { return getToken(TLangCommonParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public AssignVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitAssignVar(this);
		}
	}

	public final AssignVarContext assignVar() throws RecognitionException {
		AssignVarContext _localctx = new AssignVarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_assignVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			((AssignVarContext)_localctx).name = match(ID);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(52);
				match(T__1);
				setState(53);
				((AssignVarContext)_localctx).type = valueType();
				}
			}

			setState(56);
			match(T__2);
			setState(57);
			((AssignVarContext)_localctx).value = operation();
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
	public static class ValueTypeContext extends ParserRuleContext {
		public ObjTypeContext objType() {
			return getRuleContext(ObjTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ValueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterValueType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitValueType(this);
		}
	}

	public final ValueTypeContext valueType() throws RecognitionException {
		ValueTypeContext _localctx = new ValueTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_valueType);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				objType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				arrayType();
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
	public static class ObjTypeContext extends ParserRuleContext {
		public Token exTpye;
		public Token type;
		public List<TerminalNode> ID() { return getTokens(TLangCommonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLangCommonParser.ID, i);
		}
		public ObjTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterObjType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitObjType(this);
		}
	}

	public final ObjTypeContext objType() throws RecognitionException {
		ObjTypeContext _localctx = new ObjTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_objType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(63);
				((ObjTypeContext)_localctx).exTpye = match(ID);
				setState(64);
				match(T__3);
				}
				break;
			}
			setState(67);
			((ObjTypeContext)_localctx).type = match(ID);
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
	public static class ArrayTypeContext extends ParserRuleContext {
		public Token exTpye;
		public Token type;
		public List<TerminalNode> ID() { return getTokens(TLangCommonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLangCommonParser.ID, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(69);
				((ArrayTypeContext)_localctx).exTpye = match(ID);
				setState(70);
				match(T__3);
				}
				break;
			}
			setState(73);
			((ArrayTypeContext)_localctx).type = match(ID);
			setState(74);
			match(T__4);
			setState(75);
			match(T__5);
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
	public static class OperationContext extends ParserRuleContext {
		public ComplexValueTypeContext content;
		public OperatorContext op;
		public OperationContext next;
		public OperationContext innerBlock;
		public ComplexValueTypeContext complexValueType() {
			return getRuleContext(ComplexValueTypeContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(77);
				((OperationContext)_localctx).content = complexValueType();
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(78);
						((OperationContext)_localctx).op = operator();
						setState(79);
						((OperationContext)_localctx).next = operation();
						}
						} 
					}
					setState(85);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(86);
				match(T__6);
				setState(87);
				((OperationContext)_localctx).content = complexValueType();
				setState(88);
				match(T__7);
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(89);
						((OperationContext)_localctx).op = operator();
						setState(90);
						((OperationContext)_localctx).next = operation();
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(97);
				match(T__6);
				setState(98);
				((OperationContext)_localctx).content = complexValueType();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4193792L) != 0)) {
					{
					{
					setState(99);
					((OperationContext)_localctx).op = operator();
					setState(100);
					((OperationContext)_localctx).next = operation();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(T__7);
				}
				break;
			case 4:
				{
				setState(109);
				match(T__6);
				setState(110);
				((OperationContext)_localctx).innerBlock = operation();
				setState(111);
				match(T__7);
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(112);
						((OperationContext)_localctx).op = operator();
						setState(113);
						((OperationContext)_localctx).next = operation();
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4193792L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexValueTypeContext extends ParserRuleContext {
		public CallObjContext callObj() {
			return getRuleContext(CallObjContext.class,0);
		}
		public PrimitiveValueContext primitiveValue() {
			return getRuleContext(PrimitiveValueContext.class,0);
		}
		public MultiValueContext multiValue() {
			return getRuleContext(MultiValueContext.class,0);
		}
		public LazyValueContext lazyValue() {
			return getRuleContext(LazyValueContext.class,0);
		}
		public ImplContext impl() {
			return getRuleContext(ImplContext.class,0);
		}
		public ComplexValueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexValueType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterComplexValueType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitComplexValueType(this);
		}
	}

	public final ComplexValueTypeContext complexValueType() throws RecognitionException {
		ComplexValueTypeContext _localctx = new ComplexValueTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_complexValueType);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				callObj();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				primitiveValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				multiValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				lazyValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				impl();
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
	public static class PrimitiveValueContext extends ParserRuleContext {
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
		public TextValueContext textValue() {
			return getRuleContext(TextValueContext.class,0);
		}
		public EntityValueContext entityValue() {
			return getRuleContext(EntityValueContext.class,0);
		}
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public ArrayValueContext arrayValue() {
			return getRuleContext(ArrayValueContext.class,0);
		}
		public PrimitiveValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterPrimitiveValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitPrimitiveValue(this);
		}
	}

	public final PrimitiveValueContext primitiveValue() throws RecognitionException {
		PrimitiveValueContext _localctx = new PrimitiveValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primitiveValue);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				stringValue();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				numberValue();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				textValue();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				entityValue();
				}
				break;
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				boolValue();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				arrayValue();
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
	public static class LazyValueContext extends ParserRuleContext {
		public LazyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterLazyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitLazyValue(this);
		}
	}

	public final LazyValueContext lazyValue() throws RecognitionException {
		LazyValueContext _localctx = new LazyValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lazyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__21);
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
	public static class StringValueContext extends ParserRuleContext {
		public Token value;
		public TerminalNode STRING() { return getToken(TLangCommonParser.STRING, 0); }
		public StringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitStringValue(this);
		}
	}

	public final StringValueContext stringValue() throws RecognitionException {
		StringValueContext _localctx = new StringValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stringValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((StringValueContext)_localctx).value = match(STRING);
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
	public static class NumberValueContext extends ParserRuleContext {
		public Token value;
		public TerminalNode NUMBER() { return getToken(TLangCommonParser.NUMBER, 0); }
		public NumberValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitNumberValue(this);
		}
	}

	public final NumberValueContext numberValue() throws RecognitionException {
		NumberValueContext _localctx = new NumberValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numberValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			((NumberValueContext)_localctx).value = match(NUMBER);
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
	public static class TextValueContext extends ParserRuleContext {
		public Token value;
		public TerminalNode TEXT() { return getToken(TLangCommonParser.TEXT, 0); }
		public TextValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterTextValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitTextValue(this);
		}
	}

	public final TextValueContext textValue() throws RecognitionException {
		TextValueContext _localctx = new TextValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_textValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((TextValueContext)_localctx).value = match(TEXT);
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
	public static class BoolValueContext extends ParserRuleContext {
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitBoolValue(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValueContext extends ParserRuleContext {
		public ComplexAttributeContext complexAttribute;
		public List<ComplexAttributeContext> params = new ArrayList<ComplexAttributeContext>();
		public List<ComplexAttributeContext> complexAttribute() {
			return getRuleContexts(ComplexAttributeContext.class);
		}
		public ComplexAttributeContext complexAttribute(int i) {
			return getRuleContext(ComplexAttributeContext.class,i);
		}
		public ArrayValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitArrayValue(this);
		}
	}

	public final ArrayValueContext arrayValue() throws RecognitionException {
		ArrayValueContext _localctx = new ArrayValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__4);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 306385513990848672L) != 0)) {
				{
				setState(150);
				((ArrayValueContext)_localctx).complexAttribute = complexAttribute();
				((ArrayValueContext)_localctx).params.add(((ArrayValueContext)_localctx).complexAttribute);
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(153);
				match(T__24);
				setState(154);
				((ArrayValueContext)_localctx).complexAttribute = complexAttribute();
				((ArrayValueContext)_localctx).params.add(((ArrayValueContext)_localctx).complexAttribute);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(T__5);
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
	public static class CallObjContext extends ParserRuleContext {
		public CallObjTypeContext callObjType;
		public List<CallObjTypeContext> objs = new ArrayList<CallObjTypeContext>();
		public List<CallObjTypeContext> callObjType() {
			return getRuleContexts(CallObjTypeContext.class);
		}
		public CallObjTypeContext callObjType(int i) {
			return getRuleContext(CallObjTypeContext.class,i);
		}
		public CallObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterCallObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitCallObj(this);
		}
	}

	public final CallObjContext callObj() throws RecognitionException {
		CallObjContext _localctx = new CallObjContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((CallObjContext)_localctx).callObjType = callObjType();
			((CallObjContext)_localctx).objs.add(((CallObjContext)_localctx).callObjType);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(163);
				match(T__3);
				setState(164);
				((CallObjContext)_localctx).callObjType = callObjType();
				((CallObjContext)_localctx).objs.add(((CallObjContext)_localctx).callObjType);
				}
				}
				setState(169);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallObjTypeContext extends ParserRuleContext {
		public Token ref;
		public CallArrayContext callArray() {
			return getRuleContext(CallArrayContext.class,0);
		}
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
		}
		public CallVariableContext callVariable() {
			return getRuleContext(CallVariableContext.class,0);
		}
		public CallObjTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callObjType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterCallObjType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitCallObjType(this);
		}
	}

	public final CallObjTypeContext callObjType() throws RecognitionException {
		CallObjTypeContext _localctx = new CallObjTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_callObjType);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				callArray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(171);
					((CallObjTypeContext)_localctx).ref = match(T__25);
					}
				}

				setState(174);
				callFunc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				callVariable();
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
	public static class CallArrayContext extends ParserRuleContext {
		public Token name;
		public OperationContext elem;
		public TerminalNode ID() { return getToken(TLangCommonParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public CallArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterCallArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitCallArray(this);
		}
	}

	public final CallArrayContext callArray() throws RecognitionException {
		CallArrayContext _localctx = new CallArrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_callArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((CallArrayContext)_localctx).name = match(ID);
			setState(179);
			match(T__4);
			setState(180);
			((CallArrayContext)_localctx).elem = operation();
			setState(181);
			match(T__5);
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
	public static class CallFuncContext extends ParserRuleContext {
		public Token name;
		public CurryParamsContext curryParams;
		public List<CurryParamsContext> currying = new ArrayList<CurryParamsContext>();
		public List<CurryParamsContext> curryParams() {
			return getRuleContexts(CurryParamsContext.class);
		}
		public CurryParamsContext curryParams(int i) {
			return getRuleContext(CurryParamsContext.class,i);
		}
		public TerminalNode ID() { return getToken(TLangCommonParser.ID, 0); }
		public CallFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterCallFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitCallFunc(this);
		}
	}

	public final CallFuncContext callFunc() throws RecognitionException {
		CallFuncContext _localctx = new CallFuncContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_callFunc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(183);
				((CallFuncContext)_localctx).name = match(ID);
				}
				}
				break;
			case T__21:
				{
				setState(184);
				match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(188); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(187);
					((CallFuncContext)_localctx).curryParams = curryParams();
					((CallFuncContext)_localctx).currying.add(((CallFuncContext)_localctx).curryParams);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(190); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class CurryParamsContext extends ParserRuleContext {
		public SetAttributeContext setAttribute;
		public List<SetAttributeContext> params = new ArrayList<SetAttributeContext>();
		public List<SetAttributeContext> setAttribute() {
			return getRuleContexts(SetAttributeContext.class);
		}
		public SetAttributeContext setAttribute(int i) {
			return getRuleContext(SetAttributeContext.class,i);
		}
		public CurryParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curryParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterCurryParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitCurryParams(this);
		}
	}

	public final CurryParamsContext curryParams() throws RecognitionException {
		CurryParamsContext _localctx = new CurryParamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_curryParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__6);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 306385513990848672L) != 0)) {
				{
				setState(193);
				((CurryParamsContext)_localctx).setAttribute = setAttribute();
				((CurryParamsContext)_localctx).params.add(((CurryParamsContext)_localctx).setAttribute);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(194);
					match(T__24);
					setState(195);
					((CurryParamsContext)_localctx).setAttribute = setAttribute();
					((CurryParamsContext)_localctx).params.add(((CurryParamsContext)_localctx).setAttribute);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(203);
			match(T__7);
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
	public static class SetAttributeContext extends ParserRuleContext {
		public Token attr;
		public OperationContext value;
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode ID() { return getToken(TLangCommonParser.ID, 0); }
		public SetAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterSetAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitSetAttribute(this);
		}
	}

	public final SetAttributeContext setAttribute() throws RecognitionException {
		SetAttributeContext _localctx = new SetAttributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_setAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(205);
				((SetAttributeContext)_localctx).attr = match(ID);
				setState(206);
				match(T__2);
				}
				break;
			}
			setState(209);
			((SetAttributeContext)_localctx).value = operation();
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
	public static class CallVariableContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(TLangCommonParser.ID, 0); }
		public CallVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterCallVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitCallVariable(this);
		}
	}

	public final CallVariableContext callVariable() throws RecognitionException {
		CallVariableContext _localctx = new CallVariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_callVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			((CallVariableContext)_localctx).name = match(ID);
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
	public static class EntityValueContext extends ParserRuleContext {
		public ComplexAttributeContext complexAttribute;
		public List<ComplexAttributeContext> attrs = new ArrayList<ComplexAttributeContext>();
		public TerminalNode LBRACE() { return getToken(TLangCommonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangCommonParser.RBRACE, 0); }
		public List<ComplexAttributeContext> complexAttribute() {
			return getRuleContexts(ComplexAttributeContext.class);
		}
		public ComplexAttributeContext complexAttribute(int i) {
			return getRuleContext(ComplexAttributeContext.class,i);
		}
		public EntityValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterEntityValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitEntityValue(this);
		}
	}

	public final EntityValueContext entityValue() throws RecognitionException {
		EntityValueContext _localctx = new EntityValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_entityValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(LBRACE);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 306385513990848672L) != 0)) {
				{
				{
				setState(214);
				((EntityValueContext)_localctx).complexAttribute = complexAttribute();
				((EntityValueContext)_localctx).attrs.add(((EntityValueContext)_localctx).complexAttribute);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(RBRACE);
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
	public static class ImplContext extends ParserRuleContext {
		public Token type;
		public ComplexAttributeContext complexAttribute;
		public List<ComplexAttributeContext> attrs = new ArrayList<ComplexAttributeContext>();
		public TerminalNode Impl() { return getToken(TLangCommonParser.Impl, 0); }
		public TerminalNode LBRACE() { return getToken(TLangCommonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangCommonParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(TLangCommonParser.ID, 0); }
		public List<ComplexAttributeContext> complexAttribute() {
			return getRuleContexts(ComplexAttributeContext.class);
		}
		public ComplexAttributeContext complexAttribute(int i) {
			return getRuleContext(ComplexAttributeContext.class,i);
		}
		public ImplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitImpl(this);
		}
	}

	public final ImplContext impl() throws RecognitionException {
		ImplContext _localctx = new ImplContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_impl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(Impl);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(223);
				match(T__1);
				setState(224);
				((ImplContext)_localctx).type = match(ID);
				}
			}

			setState(227);
			match(LBRACE);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 306385513990848672L) != 0)) {
				{
				setState(228);
				((ImplContext)_localctx).complexAttribute = complexAttribute();
				((ImplContext)_localctx).attrs.add(((ImplContext)_localctx).complexAttribute);
				}
			}

			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(231);
				match(T__24);
				setState(232);
				((ImplContext)_localctx).complexAttribute = complexAttribute();
				((ImplContext)_localctx).attrs.add(((ImplContext)_localctx).complexAttribute);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(RBRACE);
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
	public static class MultiValueContext extends ParserRuleContext {
		public OperationContext operation;
		public List<OperationContext> values = new ArrayList<OperationContext>();
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public MultiValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterMultiValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitMultiValue(this);
		}
	}

	public final MultiValueContext multiValue() throws RecognitionException {
		MultiValueContext _localctx = new MultiValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_multiValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__6);
			{
			setState(241);
			((MultiValueContext)_localctx).operation = operation();
			((MultiValueContext)_localctx).values.add(((MultiValueContext)_localctx).operation);
			}
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				match(T__24);
				setState(243);
				((MultiValueContext)_localctx).operation = operation();
				((MultiValueContext)_localctx).values.add(((MultiValueContext)_localctx).operation);
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__24 );
			setState(248);
			match(T__7);
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
	public static class ComplexAttributeContext extends ParserRuleContext {
		public Token attr;
		public ValueTypeContext type;
		public OperationContext value;
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode ID() { return getToken(TLangCommonParser.ID, 0); }
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public ComplexAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).enterComplexAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangCommonListener ) ((TLangCommonListener)listener).exitComplexAttribute(this);
		}
	}

	public final ComplexAttributeContext complexAttribute() throws RecognitionException {
		ComplexAttributeContext _localctx = new ComplexAttributeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_complexAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				{
				setState(250);
				((ComplexAttributeContext)_localctx).attr = match(ID);
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(251);
					match(T__1);
					setState(252);
					((ComplexAttributeContext)_localctx).type = valueType();
					}
				}

				setState(255);
				match(T__2);
				}
				break;
			}
			setState(258);
			((ComplexAttributeContext)_localctx).value = operation();
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

	public static final String _serializedATN =
		"\u0004\u0001:\u0105\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00007\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		">\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004R\b\u0004\n\u0004\f\u0004U\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004]\b"+
		"\u0004\n\u0004\f\u0004`\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004g\b\u0004\n\u0004\f\u0004j\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004t\b\u0004\n\u0004\f\u0004w\t\u0004\u0003"+
		"\u0004y\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0082\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008a"+
		"\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u0098\b\r\u0001\r\u0001"+
		"\r\u0005\r\u009c\b\r\n\r\f\r\u009f\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00a6\b\u000e\n\u000e\f\u000e\u00a9\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00ad\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00b1\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00ba\b\u0011\u0001\u0011"+
		"\u0004\u0011\u00bd\b\u0011\u000b\u0011\f\u0011\u00be\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00c5\b\u0012\n\u0012\f\u0012"+
		"\u00c8\t\u0012\u0003\u0012\u00ca\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00d0\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u00d8\b\u0015\n"+
		"\u0015\f\u0015\u00db\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00e2\b\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00e6\b\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00ea\b\u0016"+
		"\n\u0016\f\u0016\u00ed\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u00f5\b\u0017\u000b\u0017\f"+
		"\u0017\u00f6\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u00fe\b\u0018\u0001\u0018\u0003\u0018\u0101\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"0\u0000\u0002\u0001\u0000\t\u0015\u0001\u0000\u0017\u0018\u0111\u0000"+
		"2\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004A\u0001"+
		"\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bx\u0001\u0000\u0000"+
		"\u0000\nz\u0001\u0000\u0000\u0000\f\u0081\u0001\u0000\u0000\u0000\u000e"+
		"\u0089\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000\u0000\u0000\u0012"+
		"\u008d\u0001\u0000\u0000\u0000\u0014\u008f\u0001\u0000\u0000\u0000\u0016"+
		"\u0091\u0001\u0000\u0000\u0000\u0018\u0093\u0001\u0000\u0000\u0000\u001a"+
		"\u0095\u0001\u0000\u0000\u0000\u001c\u00a2\u0001\u0000\u0000\u0000\u001e"+
		"\u00b0\u0001\u0000\u0000\u0000 \u00b2\u0001\u0000\u0000\u0000\"\u00b9"+
		"\u0001\u0000\u0000\u0000$\u00c0\u0001\u0000\u0000\u0000&\u00cf\u0001\u0000"+
		"\u0000\u0000(\u00d3\u0001\u0000\u0000\u0000*\u00d5\u0001\u0000\u0000\u0000"+
		",\u00de\u0001\u0000\u0000\u0000.\u00f0\u0001\u0000\u0000\u00000\u0100"+
		"\u0001\u0000\u0000\u000023\u0005\u0001\u0000\u000036\u0005:\u0000\u0000"+
		"45\u0005\u0002\u0000\u000057\u0003\u0002\u0001\u000064\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0005\u0003"+
		"\u0000\u00009:\u0003\b\u0004\u0000:\u0001\u0001\u0000\u0000\u0000;>\u0003"+
		"\u0004\u0002\u0000<>\u0003\u0006\u0003\u0000=;\u0001\u0000\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?@\u0005:\u0000"+
		"\u0000@B\u0005\u0004\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0005:\u0000\u0000D\u0005\u0001"+
		"\u0000\u0000\u0000EF\u0005:\u0000\u0000FH\u0005\u0004\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IJ\u0005:\u0000\u0000JK\u0005\u0005\u0000\u0000KL\u0005\u0006\u0000\u0000"+
		"L\u0007\u0001\u0000\u0000\u0000MS\u0003\f\u0006\u0000NO\u0003\n\u0005"+
		"\u0000OP\u0003\b\u0004\u0000PR\u0001\u0000\u0000\u0000QN\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000Ty\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005"+
		"\u0007\u0000\u0000WX\u0003\f\u0006\u0000X^\u0005\b\u0000\u0000YZ\u0003"+
		"\n\u0005\u0000Z[\u0003\b\u0004\u0000[]\u0001\u0000\u0000\u0000\\Y\u0001"+
		"\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_y\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0007\u0000\u0000bh\u0003\f\u0006\u0000cd\u0003\n\u0005"+
		"\u0000de\u0003\b\u0004\u0000eg\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000"+
		"\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005"+
		"\b\u0000\u0000ly\u0001\u0000\u0000\u0000mn\u0005\u0007\u0000\u0000no\u0003"+
		"\b\u0004\u0000ou\u0005\b\u0000\u0000pq\u0003\n\u0005\u0000qr\u0003\b\u0004"+
		"\u0000rt\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000tw\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xM\u0001\u0000\u0000\u0000"+
		"xV\u0001\u0000\u0000\u0000xa\u0001\u0000\u0000\u0000xm\u0001\u0000\u0000"+
		"\u0000y\t\u0001\u0000\u0000\u0000z{\u0007\u0000\u0000\u0000{\u000b\u0001"+
		"\u0000\u0000\u0000|\u0082\u0003\u001c\u000e\u0000}\u0082\u0003\u000e\u0007"+
		"\u0000~\u0082\u0003.\u0017\u0000\u007f\u0082\u0003\u0010\b\u0000\u0080"+
		"\u0082\u0003,\u0016\u0000\u0081|\u0001\u0000\u0000\u0000\u0081}\u0001"+
		"\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\r\u0001\u0000\u0000"+
		"\u0000\u0083\u008a\u0003\u0012\t\u0000\u0084\u008a\u0003\u0014\n\u0000"+
		"\u0085\u008a\u0003\u0016\u000b\u0000\u0086\u008a\u0003*\u0015\u0000\u0087"+
		"\u008a\u0003\u0018\f\u0000\u0088\u008a\u0003\u001a\r\u0000\u0089\u0083"+
		"\u0001\u0000\u0000\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0085"+
		"\u0001\u0000\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u000f"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0016\u0000\u0000\u008c\u0011"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u001d\u0000\u0000\u008e\u0013"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u001e\u0000\u0000\u0090\u0015"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u001b\u0000\u0000\u0092\u0017"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0001\u0000\u0000\u0094\u0019"+
		"\u0001\u0000\u0000\u0000\u0095\u0097\u0005\u0005\u0000\u0000\u0096\u0098"+
		"\u00030\u0018\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u009d\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"\u0019\u0000\u0000\u009a\u009c\u00030\u0018\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0006"+
		"\u0000\u0000\u00a1\u001b\u0001\u0000\u0000\u0000\u00a2\u00a7\u0003\u001e"+
		"\u000f\u0000\u00a3\u00a4\u0005\u0004\u0000\u0000\u00a4\u00a6\u0003\u001e"+
		"\u000f\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u001d\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00b1\u0003 \u0010\u0000\u00ab\u00ad\u0005\u001a\u0000"+
		"\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b1\u0003\"\u0011\u0000"+
		"\u00af\u00b1\u0003(\u0014\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u001f\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005:\u0000\u0000\u00b3\u00b4"+
		"\u0005\u0005\u0000\u0000\u00b4\u00b5\u0003\b\u0004\u0000\u00b5\u00b6\u0005"+
		"\u0006\u0000\u0000\u00b6!\u0001\u0000\u0000\u0000\u00b7\u00ba\u0005:\u0000"+
		"\u0000\u00b8\u00ba\u0005\u0016\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bd\u0003$\u0012\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf#\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c9\u0005\u0007\u0000\u0000\u00c1\u00c6\u0003&\u0013\u0000\u00c2\u00c3"+
		"\u0005\u0019\u0000\u0000\u00c3\u00c5\u0003&\u0013\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0005\b\u0000\u0000\u00cc%\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0005:\u0000\u0000\u00ce\u00d0\u0005\u0003\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0003\b\u0004\u0000"+
		"\u00d2\'\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005:\u0000\u0000\u00d4"+
		")\u0001\u0000\u0000\u0000\u00d5\u00d9\u00056\u0000\u0000\u00d6\u00d8\u0003"+
		"0\u0018\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u00057\u0000\u0000\u00dd+\u0001\u0000\u0000\u0000"+
		"\u00de\u00e1\u0005/\u0000\u0000\u00df\u00e0\u0005\u0002\u0000\u0000\u00e0"+
		"\u00e2\u0005:\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5"+
		"\u00056\u0000\u0000\u00e4\u00e6\u00030\u0018\u0000\u00e5\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00eb\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005\u0019\u0000\u0000\u00e8\u00ea\u00030\u0018"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u00057\u0000\u0000\u00ef-\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0005\u0007\u0000\u0000\u00f1\u00f4\u0003\b\u0004\u0000\u00f2\u00f3"+
		"\u0005\u0019\u0000\u0000\u00f3\u00f5\u0003\b\u0004\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0005\b\u0000\u0000\u00f9/\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fd\u0005:\u0000\u0000\u00fb\u00fc\u0005\u0002\u0000"+
		"\u0000\u00fc\u00fe\u0003\u0002\u0001\u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0101\u0005\u0003\u0000\u0000\u0100\u00fa\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0003\b\u0004\u0000\u01031\u0001\u0000\u0000\u0000"+
		"\u001c6=AGS^hux\u0081\u0089\u0097\u009d\u00a7\u00ac\u00b0\u00b9\u00be"+
		"\u00c6\u00c9\u00cf\u00d9\u00e1\u00e5\u00eb\u00f6\u00fd\u0100";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}