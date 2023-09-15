// Generated from dev/tlang/parser/TLangHelper.g4 by ANTLR 4.13.0
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
public class TLangHelperParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, TEXT=21, WS=22, STRING=23, NUMBER=24, COMMENT=25, 
		LINE_COMMENT=26, Helper=27, Tmpl=28, Model=29, Use=30, Expose=31, Func=32, 
		If=33, Else=34, For=35, With=36, In=37, To=38, Until=39, Set=40, Let=41, 
		Impl=42, Ext=43, New=44, Spec=45, Pkg=46, While=47, Do=48, Var=49, Return=50, 
		True=51, False=52, LBRACE=53, RBRACE=54, LPARENT=55, RPARENT=56, LSQUARE=57, 
		RSQUARE=58, INTEPRETED=59, As=60, Sync=61, Init=62, Destroy=63, Future=64, 
		Await=65, Try=66, Catch=67, Finally=68, Continue=69, Break=70, Const=71, 
		Static=72, Getter=73, Setter=74, Factory=75, Constructor=76, Throw=77, 
		Public=78, Private=79, Protected=80, Sealed=81, Abstract=82, Trait=83, 
		Record=84, Singleton=85, ESCAPED_ID=86, WHITE_SPACES=87, ID=88;
	public static final int
		RULE_helperBlock = 0, RULE_helperFunc = 1, RULE_helperCurrying = 2, RULE_helperParam = 3, 
		RULE_helperParamType = 4, RULE_helperFuncType = 5, RULE_helperContent = 6, 
		RULE_helperStatement = 7, RULE_helperIf = 8, RULE_helperElse = 9, RULE_helperFor = 10, 
		RULE_assignVar = 11, RULE_valueType = 12, RULE_objType = 13, RULE_arrayType = 14, 
		RULE_operation = 15, RULE_operator = 16, RULE_complexValueType = 17, RULE_primitiveValue = 18, 
		RULE_lazyValue = 19, RULE_stringValue = 20, RULE_numberValue = 21, RULE_textValue = 22, 
		RULE_boolValue = 23, RULE_arrayValue = 24, RULE_callObj = 25, RULE_callObjType = 26, 
		RULE_callArray = 27, RULE_callFunc = 28, RULE_curryParams = 29, RULE_setAttribute = 30, 
		RULE_callVariable = 31, RULE_entityValue = 32, RULE_impl = 33, RULE_multiValue = 34, 
		RULE_complexAttribute = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"helperBlock", "helperFunc", "helperCurrying", "helperParam", "helperParamType", 
			"helperFuncType", "helperContent", "helperStatement", "helperIf", "helperElse", 
			"helperFor", "assignVar", "valueType", "objType", "arrayType", "operation", 
			"operator", "complexValueType", "primitiveValue", "lazyValue", "stringValue", 
			"numberValue", "textValue", "boolValue", "arrayValue", "callObj", "callObjType", 
			"callArray", "callFunc", "curryParams", "setAttribute", "callVariable", 
			"entityValue", "impl", "multiValue", "complexAttribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'=>'", "'='", "'.'", "'&&'", "'||'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'_'", 
			"'&'", null, null, null, null, null, null, "'helper'", "'tmpl'", "'model'", 
			"'use'", "'expose'", "'func'", "'if'", "'else'", "'for'", "'with'", "'in'", 
			"'to'", "'until'", "'set'", "'let'", "'impl'", "'ext'", "'new'", "'spec'", 
			"'pkg'", "'while'", "'do'", "'var'", "'return'", "'true'", "'false'", 
			"'{'", "'}'", "'('", "')'", "'['", "']'", "'${'", "'as'", "'sync'", "'init'", 
			"'destroy'", "'future'", "'await'", "'try'", "'catch'", "'finally'", 
			"'continue'", "'break'", "'const'", "'static'", "'getter'", "'setter'", 
			"'factory'", "'constructor'", "'throw'", "'public'", "'private'", "'protected'", 
			"'sealed'", "'abstract'", "'trait'", "'record'", "'singleton'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "TEXT", "WS", "STRING", 
			"NUMBER", "COMMENT", "LINE_COMMENT", "Helper", "Tmpl", "Model", "Use", 
			"Expose", "Func", "If", "Else", "For", "With", "In", "To", "Until", "Set", 
			"Let", "Impl", "Ext", "New", "Spec", "Pkg", "While", "Do", "Var", "Return", 
			"True", "False", "LBRACE", "RBRACE", "LPARENT", "RPARENT", "LSQUARE", 
			"RSQUARE", "INTEPRETED", "As", "Sync", "Init", "Destroy", "Future", "Await", 
			"Try", "Catch", "Finally", "Continue", "Break", "Const", "Static", "Getter", 
			"Setter", "Factory", "Constructor", "Throw", "Public", "Private", "Protected", 
			"Sealed", "Abstract", "Trait", "Record", "Singleton", "ESCAPED_ID", "WHITE_SPACES", 
			"ID"
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
	public String getGrammarFileName() { return "TLangHelper.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLangHelperParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HelperBlockContext extends ParserRuleContext {
		public HelperFuncContext helperFunc;
		public List<HelperFuncContext> helperFuncs = new ArrayList<HelperFuncContext>();
		public TerminalNode Helper() { return getToken(TLangHelperParser.Helper, 0); }
		public TerminalNode LBRACE() { return getToken(TLangHelperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangHelperParser.RBRACE, 0); }
		public List<HelperFuncContext> helperFunc() {
			return getRuleContexts(HelperFuncContext.class);
		}
		public HelperFuncContext helperFunc(int i) {
			return getRuleContext(HelperFuncContext.class,i);
		}
		public HelperBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterHelperBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitHelperBlock(this);
		}
	}

	public final HelperBlockContext helperBlock() throws RecognitionException {
		HelperBlockContext _localctx = new HelperBlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_helperBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(Helper);
			setState(73);
			match(LBRACE);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Func) {
				{
				{
				setState(74);
				((HelperBlockContext)_localctx).helperFunc = helperFunc();
				((HelperBlockContext)_localctx).helperFuncs.add(((HelperBlockContext)_localctx).helperFunc);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
	public static class HelperFuncContext extends ParserRuleContext {
		public Token name;
		public HelperCurryingContext helperCurrying;
		public List<HelperCurryingContext> currying = new ArrayList<HelperCurryingContext>();
		public HelperParamTypeContext helperParamType;
		public List<HelperParamTypeContext> retVals = new ArrayList<HelperParamTypeContext>();
		public HelperContentContext body;
		public TerminalNode Func() { return getToken(TLangHelperParser.Func, 0); }
		public TerminalNode LBRACE() { return getToken(TLangHelperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangHelperParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(TLangHelperParser.ID, 0); }
		public HelperContentContext helperContent() {
			return getRuleContext(HelperContentContext.class,0);
		}
		public List<TerminalNode> LPARENT() { return getTokens(TLangHelperParser.LPARENT); }
		public TerminalNode LPARENT(int i) {
			return getToken(TLangHelperParser.LPARENT, i);
		}
		public List<TerminalNode> RPARENT() { return getTokens(TLangHelperParser.RPARENT); }
		public TerminalNode RPARENT(int i) {
			return getToken(TLangHelperParser.RPARENT, i);
		}
		public List<HelperParamTypeContext> helperParamType() {
			return getRuleContexts(HelperParamTypeContext.class);
		}
		public HelperParamTypeContext helperParamType(int i) {
			return getRuleContext(HelperParamTypeContext.class,i);
		}
		public List<HelperCurryingContext> helperCurrying() {
			return getRuleContexts(HelperCurryingContext.class);
		}
		public HelperCurryingContext helperCurrying(int i) {
			return getRuleContext(HelperCurryingContext.class,i);
		}
		public HelperFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterHelperFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitHelperFunc(this);
		}
	}

	public final HelperFuncContext helperFunc() throws RecognitionException {
		HelperFuncContext _localctx = new HelperFuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_helperFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(Func);
			setState(83);
			((HelperFuncContext)_localctx).name = match(ID);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPARENT) {
				{
				{
				setState(84);
				match(LPARENT);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT || _la==ID) {
					{
					setState(85);
					((HelperFuncContext)_localctx).helperCurrying = helperCurrying();
					((HelperFuncContext)_localctx).currying.add(((HelperFuncContext)_localctx).helperCurrying);
					}
				}

				setState(88);
				match(RPARENT);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(94);
				match(T__0);
				setState(95);
				((HelperFuncContext)_localctx).helperParamType = helperParamType();
				((HelperFuncContext)_localctx).retVals.add(((HelperFuncContext)_localctx).helperParamType);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(96);
					match(T__1);
					setState(97);
					((HelperFuncContext)_localctx).helperParamType = helperParamType();
					((HelperFuncContext)_localctx).retVals.add(((HelperFuncContext)_localctx).helperParamType);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(105);
			match(LBRACE);
			setState(106);
			((HelperFuncContext)_localctx).body = helperContent();
			setState(107);
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
	public static class HelperCurryingContext extends ParserRuleContext {
		public HelperParamContext helperParam;
		public List<HelperParamContext> params = new ArrayList<HelperParamContext>();
		public List<HelperParamContext> helperParam() {
			return getRuleContexts(HelperParamContext.class);
		}
		public HelperParamContext helperParam(int i) {
			return getRuleContext(HelperParamContext.class,i);
		}
		public HelperCurryingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperCurrying; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterHelperCurrying(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitHelperCurrying(this);
		}
	}

	public final HelperCurryingContext helperCurrying() throws RecognitionException {
		HelperCurryingContext _localctx = new HelperCurryingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_helperCurrying);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((HelperCurryingContext)_localctx).helperParam = helperParam();
			((HelperCurryingContext)_localctx).params.add(((HelperCurryingContext)_localctx).helperParam);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(110);
				match(T__1);
				setState(111);
				((HelperCurryingContext)_localctx).helperParam = helperParam();
				((HelperCurryingContext)_localctx).params.add(((HelperCurryingContext)_localctx).helperParam);
				}
				}
				setState(116);
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
	public static class HelperParamContext extends ParserRuleContext {
		public Token param;
		public HelperParamTypeContext type;
		public HelperParamTypeContext helperParamType() {
			return getRuleContext(HelperParamTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(TLangHelperParser.ID, 0); }
		public HelperParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterHelperParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitHelperParam(this);
		}
	}

	public final HelperParamContext helperParam() throws RecognitionException {
		HelperParamContext _localctx = new HelperParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_helperParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(117);
				((HelperParamContext)_localctx).param = match(ID);
				setState(118);
				match(T__0);
				}
				break;
			}
			setState(121);
			((HelperParamContext)_localctx).type = helperParamType();
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
	public static class HelperParamTypeContext extends ParserRuleContext {
		public ObjTypeContext objType() {
			return getRuleContext(ObjTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public HelperFuncTypeContext helperFuncType() {
			return getRuleContext(HelperFuncTypeContext.class,0);
		}
		public HelperParamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperParamType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterHelperParamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitHelperParamType(this);
		}
	}

	public final HelperParamTypeContext helperParamType() throws RecognitionException {
		HelperParamTypeContext _localctx = new HelperParamTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_helperParamType);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				objType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				helperFuncType();
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
	public static class HelperFuncTypeContext extends ParserRuleContext {
		public Token type;
		public HelperCurryingContext helperCurrying;
		public List<HelperCurryingContext> currying = new ArrayList<HelperCurryingContext>();
		public HelperParamTypeContext helperParamType;
		public List<HelperParamTypeContext> retVals = new ArrayList<HelperParamTypeContext>();
		public List<TerminalNode> RPARENT() { return getTokens(TLangHelperParser.RPARENT); }
		public TerminalNode RPARENT(int i) {
			return getToken(TLangHelperParser.RPARENT, i);
		}
		public List<TerminalNode> LPARENT() { return getTokens(TLangHelperParser.LPARENT); }
		public TerminalNode LPARENT(int i) {
			return getToken(TLangHelperParser.LPARENT, i);
		}
		public List<HelperParamTypeContext> helperParamType() {
			return getRuleContexts(HelperParamTypeContext.class);
		}
		public HelperParamTypeContext helperParamType(int i) {
			return getRuleContext(HelperParamTypeContext.class,i);
		}
		public List<HelperCurryingContext> helperCurrying() {
			return getRuleContexts(HelperCurryingContext.class);
		}
		public HelperCurryingContext helperCurrying(int i) {
			return getRuleContext(HelperCurryingContext.class,i);
		}
		public HelperFuncTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperFuncType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterHelperFuncType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitHelperFuncType(this);
		}
	}

	public final HelperFuncTypeContext helperFuncType() throws RecognitionException {
		HelperFuncTypeContext _localctx = new HelperFuncTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_helperFuncType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((HelperFuncTypeContext)_localctx).type = match(LPARENT);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPARENT || _la==ID) {
				{
				setState(129);
				((HelperFuncTypeContext)_localctx).helperCurrying = helperCurrying();
				((HelperFuncTypeContext)_localctx).currying.add(((HelperFuncTypeContext)_localctx).helperCurrying);
				}
			}

			setState(132);
			match(RPARENT);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPARENT) {
				{
				{
				setState(133);
				match(LPARENT);
				setState(134);
				((HelperFuncTypeContext)_localctx).helperCurrying = helperCurrying();
				((HelperFuncTypeContext)_localctx).currying.add(((HelperFuncTypeContext)_localctx).helperCurrying);
				setState(135);
				match(RPARENT);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(T__2);
			setState(143);
			((HelperFuncTypeContext)_localctx).helperParamType = helperParamType();
			((HelperFuncTypeContext)_localctx).retVals.add(((HelperFuncTypeContext)_localctx).helperParamType);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					match(T__1);
					setState(145);
					((HelperFuncTypeContext)_localctx).helperParamType = helperParamType();
					((HelperFuncTypeContext)_localctx).retVals.add(((HelperFuncTypeContext)_localctx).helperParamType);
					}
					} 
				}
				setState(150);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HelperContentContext extends ParserRuleContext {
		public HelperStatementContext helperStatement;
		public List<HelperStatementContext> content = new ArrayList<HelperStatementContext>();
		public List<HelperStatementContext> helperStatement() {
			return getRuleContexts(HelperStatementContext.class);
		}
		public HelperStatementContext helperStatement(int i) {
			return getRuleContext(HelperStatementContext.class,i);
		}
		public HelperContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterHelperContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitHelperContent(this);
		}
	}

	public final HelperContentContext helperContent() throws RecognitionException {
		HelperContentContext _localctx = new HelperContentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_helperContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 195913223838892032L) != 0) || _la==ID) {
				{
				{
				setState(151);
				((HelperContentContext)_localctx).helperStatement = helperStatement();
				((HelperContentContext)_localctx).content.add(((HelperContentContext)_localctx).helperStatement);
				}
				}
				setState(156);
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
	public static class HelperStatementContext extends ParserRuleContext {
		public AssignVarContext assignVar() {
			return getRuleContext(AssignVarContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public HelperIfContext helperIf() {
			return getRuleContext(HelperIfContext.class,0);
		}
		public HelperForContext helperFor() {
			return getRuleContext(HelperForContext.class,0);
		}
		public HelperStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterHelperStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitHelperStatement(this);
		}
	}

	public final HelperStatementContext helperStatement() throws RecognitionException {
		HelperStatementContext _localctx = new HelperStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_helperStatement);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Let:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				assignVar();
				}
				break;
			case T__18:
			case T__19:
			case TEXT:
			case STRING:
			case NUMBER:
			case Impl:
			case True:
			case False:
			case LBRACE:
			case LPARENT:
			case LSQUARE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				operation();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				helperIf();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				helperFor();
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
	public static class HelperIfContext extends ParserRuleContext {
		public OperationContext cond;
		public HelperContentContext body;
		public HelperElseContext orElse;
		public TerminalNode If() { return getToken(TLangHelperParser.If, 0); }
		public TerminalNode LPARENT() { return getToken(TLangHelperParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangHelperParser.RPARENT, 0); }
		public TerminalNode LBRACE() { return getToken(TLangHelperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangHelperParser.RBRACE, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public HelperContentContext helperContent() {
			return getRuleContext(HelperContentContext.class,0);
		}
		public HelperElseContext helperElse() {
			return getRuleContext(HelperElseContext.class,0);
		}
		public HelperIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterHelperIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitHelperIf(this);
		}
	}

	public final HelperIfContext helperIf() throws RecognitionException {
		HelperIfContext _localctx = new HelperIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_helperIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(If);
			setState(164);
			match(LPARENT);
			setState(165);
			((HelperIfContext)_localctx).cond = operation();
			setState(166);
			match(RPARENT);
			setState(167);
			match(LBRACE);
			setState(168);
			((HelperIfContext)_localctx).body = helperContent();
			setState(169);
			match(RBRACE);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(170);
				((HelperIfContext)_localctx).orElse = helperElse();
				}
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
	public static class HelperElseContext extends ParserRuleContext {
		public HelperContentContext body;
		public TerminalNode Else() { return getToken(TLangHelperParser.Else, 0); }
		public TerminalNode LBRACE() { return getToken(TLangHelperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangHelperParser.RBRACE, 0); }
		public HelperContentContext helperContent() {
			return getRuleContext(HelperContentContext.class,0);
		}
		public HelperElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterHelperElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitHelperElse(this);
		}
	}

	public final HelperElseContext helperElse() throws RecognitionException {
		HelperElseContext _localctx = new HelperElseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_helperElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(Else);
			setState(174);
			match(LBRACE);
			setState(175);
			((HelperElseContext)_localctx).body = helperContent();
			setState(176);
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
	public static class HelperForContext extends ParserRuleContext {
		public Token var;
		public OperationContext start;
		public Token type;
		public OperationContext array;
		public HelperContentContext body;
		public TerminalNode For() { return getToken(TLangHelperParser.For, 0); }
		public TerminalNode LPARENT() { return getToken(TLangHelperParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangHelperParser.RPARENT, 0); }
		public TerminalNode LBRACE() { return getToken(TLangHelperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangHelperParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(TLangHelperParser.ID, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public HelperContentContext helperContent() {
			return getRuleContext(HelperContentContext.class,0);
		}
		public TerminalNode In() { return getToken(TLangHelperParser.In, 0); }
		public TerminalNode To() { return getToken(TLangHelperParser.To, 0); }
		public TerminalNode Until() { return getToken(TLangHelperParser.Until, 0); }
		public HelperForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterHelperFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitHelperFor(this);
		}
	}

	public final HelperForContext helperFor() throws RecognitionException {
		HelperForContext _localctx = new HelperForContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_helperFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(For);
			setState(179);
			match(LPARENT);
			setState(180);
			((HelperForContext)_localctx).var = match(ID);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 195910981865963520L) != 0) || _la==ID) {
				{
				setState(181);
				((HelperForContext)_localctx).start = operation();
				}
			}

			setState(184);
			((HelperForContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
				((HelperForContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(185);
			((HelperForContext)_localctx).array = operation();
			setState(186);
			match(RPARENT);
			setState(187);
			match(LBRACE);
			setState(188);
			((HelperForContext)_localctx).body = helperContent();
			setState(189);
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
	public static class AssignVarContext extends ParserRuleContext {
		public Token name;
		public ValueTypeContext type;
		public OperationContext value;
		public TerminalNode Let() { return getToken(TLangHelperParser.Let, 0); }
		public TerminalNode ID() { return getToken(TLangHelperParser.ID, 0); }
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitAssignVar(this);
		}
	}

	public final AssignVarContext assignVar() throws RecognitionException {
		AssignVarContext _localctx = new AssignVarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(Let);
			setState(192);
			((AssignVarContext)_localctx).name = match(ID);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(193);
				match(T__0);
				setState(194);
				((AssignVarContext)_localctx).type = valueType();
				}
			}

			setState(197);
			match(T__3);
			setState(198);
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterValueType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitValueType(this);
		}
	}

	public final ValueTypeContext valueType() throws RecognitionException {
		ValueTypeContext _localctx = new ValueTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_valueType);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				objType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
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
		public List<TerminalNode> ID() { return getTokens(TLangHelperParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLangHelperParser.ID, i);
		}
		public ObjTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterObjType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitObjType(this);
		}
	}

	public final ObjTypeContext objType() throws RecognitionException {
		ObjTypeContext _localctx = new ObjTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_objType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(204);
				((ObjTypeContext)_localctx).exTpye = match(ID);
				setState(205);
				match(T__4);
				}
				break;
			}
			setState(208);
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
		public TerminalNode LSQUARE() { return getToken(TLangHelperParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TLangHelperParser.RSQUARE, 0); }
		public List<TerminalNode> ID() { return getTokens(TLangHelperParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLangHelperParser.ID, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(210);
				((ArrayTypeContext)_localctx).exTpye = match(ID);
				setState(211);
				match(T__4);
				}
				break;
			}
			setState(214);
			((ArrayTypeContext)_localctx).type = match(ID);
			setState(215);
			match(LSQUARE);
			setState(216);
			match(RSQUARE);
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
		public TerminalNode LPARENT() { return getToken(TLangHelperParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangHelperParser.RPARENT, 0); }
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(218);
				((OperationContext)_localctx).content = complexValueType();
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(219);
						((OperationContext)_localctx).op = operator();
						setState(220);
						((OperationContext)_localctx).next = operation();
						}
						} 
					}
					setState(226);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(227);
				match(LPARENT);
				setState(228);
				((OperationContext)_localctx).content = complexValueType();
				setState(229);
				match(RPARENT);
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(230);
						((OperationContext)_localctx).op = operator();
						setState(231);
						((OperationContext)_localctx).next = operation();
						}
						} 
					}
					setState(237);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(238);
				match(LPARENT);
				setState(239);
				((OperationContext)_localctx).content = complexValueType();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524224L) != 0)) {
					{
					{
					setState(240);
					((OperationContext)_localctx).op = operator();
					setState(241);
					((OperationContext)_localctx).next = operation();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				match(RPARENT);
				}
				break;
			case 4:
				{
				setState(250);
				match(LPARENT);
				setState(251);
				((OperationContext)_localctx).innerBlock = operation();
				setState(252);
				match(RPARENT);
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253);
						((OperationContext)_localctx).op = operator();
						setState(254);
						((OperationContext)_localctx).next = operation();
						}
						} 
					}
					setState(260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 524224L) != 0)) ) {
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterComplexValueType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitComplexValueType(this);
		}
	}

	public final ComplexValueTypeContext complexValueType() throws RecognitionException {
		ComplexValueTypeContext _localctx = new ComplexValueTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_complexValueType);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				callObj();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				primitiveValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				multiValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				lazyValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(269);
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterPrimitiveValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitPrimitiveValue(this);
		}
	}

	public final PrimitiveValueContext primitiveValue() throws RecognitionException {
		PrimitiveValueContext _localctx = new PrimitiveValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primitiveValue);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				stringValue();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				numberValue();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				textValue();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				entityValue();
				}
				break;
			case True:
			case False:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				boolValue();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterLazyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitLazyValue(this);
		}
	}

	public final LazyValueContext lazyValue() throws RecognitionException {
		LazyValueContext _localctx = new LazyValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lazyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__18);
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
		public TerminalNode STRING() { return getToken(TLangHelperParser.STRING, 0); }
		public StringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitStringValue(this);
		}
	}

	public final StringValueContext stringValue() throws RecognitionException {
		StringValueContext _localctx = new StringValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stringValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		public TerminalNode NUMBER() { return getToken(TLangHelperParser.NUMBER, 0); }
		public NumberValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitNumberValue(this);
		}
	}

	public final NumberValueContext numberValue() throws RecognitionException {
		NumberValueContext _localctx = new NumberValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numberValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
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
		public TerminalNode TEXT() { return getToken(TLangHelperParser.TEXT, 0); }
		public TextValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterTextValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitTextValue(this);
		}
	}

	public final TextValueContext textValue() throws RecognitionException {
		TextValueContext _localctx = new TextValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_textValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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
		public TerminalNode True() { return getToken(TLangHelperParser.True, 0); }
		public TerminalNode False() { return getToken(TLangHelperParser.False, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitBoolValue(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==True || _la==False) ) {
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
		public TerminalNode LSQUARE() { return getToken(TLangHelperParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TLangHelperParser.RSQUARE, 0); }
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitArrayValue(this);
		}
	}

	public final ArrayValueContext arrayValue() throws RecognitionException {
		ArrayValueContext _localctx = new ArrayValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(LSQUARE);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 195910981865963520L) != 0) || _la==ID) {
				{
				setState(291);
				((ArrayValueContext)_localctx).complexAttribute = complexAttribute();
				((ArrayValueContext)_localctx).params.add(((ArrayValueContext)_localctx).complexAttribute);
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(294);
				match(T__1);
				setState(295);
				((ArrayValueContext)_localctx).complexAttribute = complexAttribute();
				((ArrayValueContext)_localctx).params.add(((ArrayValueContext)_localctx).complexAttribute);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(RSQUARE);
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterCallObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitCallObj(this);
		}
	}

	public final CallObjContext callObj() throws RecognitionException {
		CallObjContext _localctx = new CallObjContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_callObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			((CallObjContext)_localctx).callObjType = callObjType();
			((CallObjContext)_localctx).objs.add(((CallObjContext)_localctx).callObjType);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(304);
				match(T__4);
				setState(305);
				((CallObjContext)_localctx).callObjType = callObjType();
				((CallObjContext)_localctx).objs.add(((CallObjContext)_localctx).callObjType);
				}
				}
				setState(310);
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterCallObjType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitCallObjType(this);
		}
	}

	public final CallObjTypeContext callObjType() throws RecognitionException {
		CallObjTypeContext _localctx = new CallObjTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_callObjType);
		int _la;
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				callArray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(312);
					((CallObjTypeContext)_localctx).ref = match(T__19);
					}
				}

				setState(315);
				callFunc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
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
		public TerminalNode LSQUARE() { return getToken(TLangHelperParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TLangHelperParser.RSQUARE, 0); }
		public TerminalNode ID() { return getToken(TLangHelperParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public CallArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterCallArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitCallArray(this);
		}
	}

	public final CallArrayContext callArray() throws RecognitionException {
		CallArrayContext _localctx = new CallArrayContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_callArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			((CallArrayContext)_localctx).name = match(ID);
			setState(320);
			match(LSQUARE);
			setState(321);
			((CallArrayContext)_localctx).elem = operation();
			setState(322);
			match(RSQUARE);
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
		public TerminalNode ID() { return getToken(TLangHelperParser.ID, 0); }
		public CallFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterCallFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitCallFunc(this);
		}
	}

	public final CallFuncContext callFunc() throws RecognitionException {
		CallFuncContext _localctx = new CallFuncContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_callFunc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(324);
				((CallFuncContext)_localctx).name = match(ID);
				}
				}
				break;
			case T__18:
				{
				setState(325);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(329); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(328);
					((CallFuncContext)_localctx).curryParams = curryParams();
					((CallFuncContext)_localctx).currying.add(((CallFuncContext)_localctx).curryParams);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(331); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public TerminalNode LPARENT() { return getToken(TLangHelperParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangHelperParser.RPARENT, 0); }
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterCurryParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitCurryParams(this);
		}
	}

	public final CurryParamsContext curryParams() throws RecognitionException {
		CurryParamsContext _localctx = new CurryParamsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_curryParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LPARENT);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 195910981865963520L) != 0) || _la==ID) {
				{
				setState(334);
				((CurryParamsContext)_localctx).setAttribute = setAttribute();
				((CurryParamsContext)_localctx).params.add(((CurryParamsContext)_localctx).setAttribute);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(335);
					match(T__1);
					setState(336);
					((CurryParamsContext)_localctx).setAttribute = setAttribute();
					((CurryParamsContext)_localctx).params.add(((CurryParamsContext)_localctx).setAttribute);
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(344);
			match(RPARENT);
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
		public TerminalNode ID() { return getToken(TLangHelperParser.ID, 0); }
		public SetAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterSetAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitSetAttribute(this);
		}
	}

	public final SetAttributeContext setAttribute() throws RecognitionException {
		SetAttributeContext _localctx = new SetAttributeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_setAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(346);
				((SetAttributeContext)_localctx).attr = match(ID);
				setState(347);
				match(T__3);
				}
				break;
			}
			setState(350);
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
		public TerminalNode ID() { return getToken(TLangHelperParser.ID, 0); }
		public CallVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterCallVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitCallVariable(this);
		}
	}

	public final CallVariableContext callVariable() throws RecognitionException {
		CallVariableContext _localctx = new CallVariableContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_callVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		public TerminalNode LBRACE() { return getToken(TLangHelperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangHelperParser.RBRACE, 0); }
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterEntityValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitEntityValue(this);
		}
	}

	public final EntityValueContext entityValue() throws RecognitionException {
		EntityValueContext _localctx = new EntityValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_entityValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(LBRACE);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 195910981865963520L) != 0) || _la==ID) {
				{
				{
				setState(355);
				((EntityValueContext)_localctx).complexAttribute = complexAttribute();
				((EntityValueContext)_localctx).attrs.add(((EntityValueContext)_localctx).complexAttribute);
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
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
		public TerminalNode Impl() { return getToken(TLangHelperParser.Impl, 0); }
		public TerminalNode LBRACE() { return getToken(TLangHelperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangHelperParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(TLangHelperParser.ID, 0); }
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitImpl(this);
		}
	}

	public final ImplContext impl() throws RecognitionException {
		ImplContext _localctx = new ImplContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_impl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(Impl);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(364);
				match(T__0);
				setState(365);
				((ImplContext)_localctx).type = match(ID);
				}
			}

			setState(368);
			match(LBRACE);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 195910981865963520L) != 0) || _la==ID) {
				{
				setState(369);
				((ImplContext)_localctx).complexAttribute = complexAttribute();
				((ImplContext)_localctx).attrs.add(((ImplContext)_localctx).complexAttribute);
				}
			}

			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(372);
				match(T__1);
				setState(373);
				((ImplContext)_localctx).complexAttribute = complexAttribute();
				((ImplContext)_localctx).attrs.add(((ImplContext)_localctx).complexAttribute);
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
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
		public TerminalNode LPARENT() { return getToken(TLangHelperParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangHelperParser.RPARENT, 0); }
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
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterMultiValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitMultiValue(this);
		}
	}

	public final MultiValueContext multiValue() throws RecognitionException {
		MultiValueContext _localctx = new MultiValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(LPARENT);
			{
			setState(382);
			((MultiValueContext)_localctx).operation = operation();
			((MultiValueContext)_localctx).values.add(((MultiValueContext)_localctx).operation);
			}
			setState(385); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(383);
				match(T__1);
				setState(384);
				((MultiValueContext)_localctx).operation = operation();
				((MultiValueContext)_localctx).values.add(((MultiValueContext)_localctx).operation);
				}
				}
				setState(387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(389);
			match(RPARENT);
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
		public TerminalNode ID() { return getToken(TLangHelperParser.ID, 0); }
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public ComplexAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).enterComplexAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangHelperListener ) ((TLangHelperListener)listener).exitComplexAttribute(this);
		}
	}

	public final ComplexAttributeContext complexAttribute() throws RecognitionException {
		ComplexAttributeContext _localctx = new ComplexAttributeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_complexAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				{
				setState(391);
				((ComplexAttributeContext)_localctx).attr = match(ID);
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(392);
					match(T__0);
					setState(393);
					((ComplexAttributeContext)_localctx).type = valueType();
					}
				}

				setState(396);
				match(T__3);
				}
				break;
			}
			setState(399);
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
		"\u0004\u0001X\u0192\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000L\b\u0000\n\u0000"+
		"\f\u0000O\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001W\b\u0001\u0001\u0001\u0005\u0001Z\b\u0001"+
		"\n\u0001\f\u0001]\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001c\b\u0001\n\u0001\f\u0001f\t\u0001\u0003\u0001h\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002q\b\u0002\n\u0002\f\u0002t\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0003\u0003x\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u007f\b\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0083\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u008a\b\u0005\n\u0005\f\u0005\u008d\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0093\b\u0005\n\u0005"+
		"\f\u0005\u0096\t\u0005\u0001\u0006\u0005\u0006\u0099\b\u0006\n\u0006\f"+
		"\u0006\u009c\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00a2\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00ac\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b7\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00c4\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0003\f\u00cb\b\f\u0001\r\u0001\r\u0003\r\u00cf\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0003\u000e\u00d5\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00df\b\u000f\n\u000f\f\u000f\u00e2\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00ea\b\u000f\n\u000f\f\u000f\u00ed\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00f4\b\u000f\n\u000f\f\u000f"+
		"\u00f7\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0101\b\u000f\n\u000f"+
		"\f\u000f\u0104\t\u000f\u0003\u000f\u0106\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u010f\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0117\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0125\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0129\b\u0018\n\u0018\f\u0018\u012c\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0133"+
		"\b\u0019\n\u0019\f\u0019\u0136\t\u0019\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u013a\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u013e\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0147\b\u001c\u0001\u001c\u0004\u001c\u014a\b\u001c"+
		"\u000b\u001c\f\u001c\u014b\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u0152\b\u001d\n\u001d\f\u001d\u0155\t\u001d\u0003\u001d\u0157"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u015d"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0005 \u0165\b \n \f \u0168\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0003"+
		"!\u016f\b!\u0001!\u0001!\u0003!\u0173\b!\u0001!\u0001!\u0005!\u0177\b"+
		"!\n!\f!\u017a\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0004\""+
		"\u0182\b\"\u000b\"\f\"\u0183\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0003"+
		"#\u018b\b#\u0001#\u0003#\u018e\b#\u0001#\u0001#\u0001#\u0000\u0000$\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDF\u0000\u0003\u0001\u0000%\'\u0001\u0000\u0006"+
		"\u0012\u0001\u000034\u01a5\u0000H\u0001\u0000\u0000\u0000\u0002R\u0001"+
		"\u0000\u0000\u0000\u0004m\u0001\u0000\u0000\u0000\u0006w\u0001\u0000\u0000"+
		"\u0000\b~\u0001\u0000\u0000\u0000\n\u0080\u0001\u0000\u0000\u0000\f\u009a"+
		"\u0001\u0000\u0000\u0000\u000e\u00a1\u0001\u0000\u0000\u0000\u0010\u00a3"+
		"\u0001\u0000\u0000\u0000\u0012\u00ad\u0001\u0000\u0000\u0000\u0014\u00b2"+
		"\u0001\u0000\u0000\u0000\u0016\u00bf\u0001\u0000\u0000\u0000\u0018\u00ca"+
		"\u0001\u0000\u0000\u0000\u001a\u00ce\u0001\u0000\u0000\u0000\u001c\u00d4"+
		"\u0001\u0000\u0000\u0000\u001e\u0105\u0001\u0000\u0000\u0000 \u0107\u0001"+
		"\u0000\u0000\u0000\"\u010e\u0001\u0000\u0000\u0000$\u0116\u0001\u0000"+
		"\u0000\u0000&\u0118\u0001\u0000\u0000\u0000(\u011a\u0001\u0000\u0000\u0000"+
		"*\u011c\u0001\u0000\u0000\u0000,\u011e\u0001\u0000\u0000\u0000.\u0120"+
		"\u0001\u0000\u0000\u00000\u0122\u0001\u0000\u0000\u00002\u012f\u0001\u0000"+
		"\u0000\u00004\u013d\u0001\u0000\u0000\u00006\u013f\u0001\u0000\u0000\u0000"+
		"8\u0146\u0001\u0000\u0000\u0000:\u014d\u0001\u0000\u0000\u0000<\u015c"+
		"\u0001\u0000\u0000\u0000>\u0160\u0001\u0000\u0000\u0000@\u0162\u0001\u0000"+
		"\u0000\u0000B\u016b\u0001\u0000\u0000\u0000D\u017d\u0001\u0000\u0000\u0000"+
		"F\u018d\u0001\u0000\u0000\u0000HI\u0005\u001b\u0000\u0000IM\u00055\u0000"+
		"\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u00056\u0000\u0000Q\u0001"+
		"\u0001\u0000\u0000\u0000RS\u0005 \u0000\u0000S[\u0005X\u0000\u0000TV\u0005"+
		"7\u0000\u0000UW\u0003\u0004\u0002\u0000VU\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u00058\u0000\u0000YT\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\g\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^_\u0005\u0001\u0000\u0000_d\u0003\b\u0004\u0000`a\u0005\u0002\u0000"+
		"\u0000ac\u0003\b\u0004\u0000b`\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000g^\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u00055\u0000\u0000jk\u0003"+
		"\f\u0006\u0000kl\u00056\u0000\u0000l\u0003\u0001\u0000\u0000\u0000mr\u0003"+
		"\u0006\u0003\u0000no\u0005\u0002\u0000\u0000oq\u0003\u0006\u0003\u0000"+
		"pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000s\u0005\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000uv\u0005X\u0000\u0000vx\u0005\u0001\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yz\u0003\b\u0004\u0000z\u0007\u0001\u0000\u0000\u0000{\u007f\u0003\u001a"+
		"\r\u0000|\u007f\u0003\u001c\u000e\u0000}\u007f\u0003\n\u0005\u0000~{\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000"+
		"\u007f\t\u0001\u0000\u0000\u0000\u0080\u0082\u00057\u0000\u0000\u0081"+
		"\u0083\u0003\u0004\u0002\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u008b\u00058\u0000\u0000\u0085\u0086\u00057\u0000\u0000\u0086\u0087\u0003"+
		"\u0004\u0002\u0000\u0087\u0088\u00058\u0000\u0000\u0088\u008a\u0001\u0000"+
		"\u0000\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0094\u0003\b\u0004"+
		"\u0000\u0090\u0091\u0005\u0002\u0000\u0000\u0091\u0093\u0003\b\u0004\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u000b\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0003\u000e\u0007\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\r\u0001\u0000\u0000\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009d\u00a2\u0003\u0016\u000b\u0000\u009e"+
		"\u00a2\u0003\u001e\u000f\u0000\u009f\u00a2\u0003\u0010\b\u0000\u00a0\u00a2"+
		"\u0003\u0014\n\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1\u009e\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u000f\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"!\u0000\u0000\u00a4\u00a5\u00057\u0000\u0000\u00a5\u00a6\u0003\u001e\u000f"+
		"\u0000\u00a6\u00a7\u00058\u0000\u0000\u00a7\u00a8\u00055\u0000\u0000\u00a8"+
		"\u00a9\u0003\f\u0006\u0000\u00a9\u00ab\u00056\u0000\u0000\u00aa\u00ac"+
		"\u0003\u0012\t\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\u0011\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"\"\u0000\u0000\u00ae\u00af\u00055\u0000\u0000\u00af\u00b0\u0003\f\u0006"+
		"\u0000\u00b0\u00b1\u00056\u0000\u0000\u00b1\u0013\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005#\u0000\u0000\u00b3\u00b4\u00057\u0000\u0000\u00b4\u00b6"+
		"\u0005X\u0000\u0000\u00b5\u00b7\u0003\u001e\u000f\u0000\u00b6\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0007\u0000\u0000\u0000\u00b9\u00ba\u0003"+
		"\u001e\u000f\u0000\u00ba\u00bb\u00058\u0000\u0000\u00bb\u00bc\u00055\u0000"+
		"\u0000\u00bc\u00bd\u0003\f\u0006\u0000\u00bd\u00be\u00056\u0000\u0000"+
		"\u00be\u0015\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005)\u0000\u0000\u00c0"+
		"\u00c3\u0005X\u0000\u0000\u00c1\u00c2\u0005\u0001\u0000\u0000\u00c2\u00c4"+
		"\u0003\u0018\f\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"\u0004\u0000\u0000\u00c6\u00c7\u0003\u001e\u000f\u0000\u00c7\u0017\u0001"+
		"\u0000\u0000\u0000\u00c8\u00cb\u0003\u001a\r\u0000\u00c9\u00cb\u0003\u001c"+
		"\u000e\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u0019\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005X\u0000"+
		"\u0000\u00cd\u00cf\u0005\u0005\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0005X\u0000\u0000\u00d1\u001b\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005X\u0000\u0000\u00d3\u00d5\u0005\u0005\u0000\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005X\u0000\u0000\u00d7\u00d8"+
		"\u00059\u0000\u0000\u00d8\u00d9\u0005:\u0000\u0000\u00d9\u001d\u0001\u0000"+
		"\u0000\u0000\u00da\u00e0\u0003\"\u0011\u0000\u00db\u00dc\u0003 \u0010"+
		"\u0000\u00dc\u00dd\u0003\u001e\u000f\u0000\u00dd\u00df\u0001\u0000\u0000"+
		"\u0000\u00de\u00db\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u0106\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u00057\u0000\u0000\u00e4\u00e5\u0003\"\u0011\u0000"+
		"\u00e5\u00eb\u00058\u0000\u0000\u00e6\u00e7\u0003 \u0010\u0000\u00e7\u00e8"+
		"\u0003\u001e\u000f\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e6"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u0106"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u00057\u0000\u0000\u00ef\u00f5\u0003\"\u0011\u0000\u00f0\u00f1\u0003"+
		" \u0010\u0000\u00f1\u00f2\u0003\u001e\u000f\u0000\u00f2\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u00058\u0000\u0000\u00f9\u0106\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u00057\u0000\u0000\u00fb\u00fc\u0003\u001e\u000f\u0000"+
		"\u00fc\u0102\u00058\u0000\u0000\u00fd\u00fe\u0003 \u0010\u0000\u00fe\u00ff"+
		"\u0003\u001e\u000f\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fd"+
		"\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0106"+
		"\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u00da"+
		"\u0001\u0000\u0000\u0000\u0105\u00e3\u0001\u0000\u0000\u0000\u0105\u00ee"+
		"\u0001\u0000\u0000\u0000\u0105\u00fa\u0001\u0000\u0000\u0000\u0106\u001f"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0007\u0001\u0000\u0000\u0108!\u0001"+
		"\u0000\u0000\u0000\u0109\u010f\u00032\u0019\u0000\u010a\u010f\u0003$\u0012"+
		"\u0000\u010b\u010f\u0003D\"\u0000\u010c\u010f\u0003&\u0013\u0000\u010d"+
		"\u010f\u0003B!\u0000\u010e\u0109\u0001\u0000\u0000\u0000\u010e\u010a\u0001"+
		"\u0000\u0000\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e\u010c\u0001"+
		"\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f#\u0001\u0000"+
		"\u0000\u0000\u0110\u0117\u0003(\u0014\u0000\u0111\u0117\u0003*\u0015\u0000"+
		"\u0112\u0117\u0003,\u0016\u0000\u0113\u0117\u0003@ \u0000\u0114\u0117"+
		"\u0003.\u0017\u0000\u0115\u0117\u00030\u0018\u0000\u0116\u0110\u0001\u0000"+
		"\u0000\u0000\u0116\u0111\u0001\u0000\u0000\u0000\u0116\u0112\u0001\u0000"+
		"\u0000\u0000\u0116\u0113\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117%\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0005\u0013\u0000\u0000\u0119\'\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005\u0017\u0000\u0000\u011b)\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005\u0018\u0000\u0000\u011d+\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0005\u0015\u0000\u0000\u011f-\u0001\u0000\u0000\u0000\u0120\u0121\u0007"+
		"\u0002\u0000\u0000\u0121/\u0001\u0000\u0000\u0000\u0122\u0124\u00059\u0000"+
		"\u0000\u0123\u0125\u0003F#\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u012a\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0005\u0002\u0000\u0000\u0127\u0129\u0003F#\u0000\u0128\u0126\u0001"+
		"\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012e\u0005"+
		":\u0000\u0000\u012e1\u0001\u0000\u0000\u0000\u012f\u0134\u00034\u001a"+
		"\u0000\u0130\u0131\u0005\u0005\u0000\u0000\u0131\u0133\u00034\u001a\u0000"+
		"\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000"+
		"\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u01353\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137"+
		"\u013e\u00036\u001b\u0000\u0138\u013a\u0005\u0014\u0000\u0000\u0139\u0138"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b\u013e\u00038\u001c\u0000\u013c\u013e\u0003"+
		">\u001f\u0000\u013d\u0137\u0001\u0000\u0000\u0000\u013d\u0139\u0001\u0000"+
		"\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e5\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0005X\u0000\u0000\u0140\u0141\u00059\u0000\u0000\u0141"+
		"\u0142\u0003\u001e\u000f\u0000\u0142\u0143\u0005:\u0000\u0000\u01437\u0001"+
		"\u0000\u0000\u0000\u0144\u0147\u0005X\u0000\u0000\u0145\u0147\u0005\u0013"+
		"\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0145\u0001\u0000"+
		"\u0000\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u014a\u0003:\u001d"+
		"\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000"+
		"\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000"+
		"\u0000\u014c9\u0001\u0000\u0000\u0000\u014d\u0156\u00057\u0000\u0000\u014e"+
		"\u0153\u0003<\u001e\u0000\u014f\u0150\u0005\u0002\u0000\u0000\u0150\u0152"+
		"\u0003<\u001e\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0155\u0001"+
		"\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001"+
		"\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001"+
		"\u0000\u0000\u0000\u0156\u014e\u0001\u0000\u0000\u0000\u0156\u0157\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0005"+
		"8\u0000\u0000\u0159;\u0001\u0000\u0000\u0000\u015a\u015b\u0005X\u0000"+
		"\u0000\u015b\u015d\u0005\u0004\u0000\u0000\u015c\u015a\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0003\u001e\u000f\u0000\u015f=\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u0005X\u0000\u0000\u0161?\u0001\u0000\u0000\u0000\u0162\u0166"+
		"\u00055\u0000\u0000\u0163\u0165\u0003F#\u0000\u0164\u0163\u0001\u0000"+
		"\u0000\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000"+
		"\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016a\u00056\u0000"+
		"\u0000\u016aA\u0001\u0000\u0000\u0000\u016b\u016e\u0005*\u0000\u0000\u016c"+
		"\u016d\u0005\u0001\u0000\u0000\u016d\u016f\u0005X\u0000\u0000\u016e\u016c"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0001\u0000\u0000\u0000\u0170\u0172\u00055\u0000\u0000\u0171\u0173\u0003"+
		"F#\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000"+
		"\u0000\u0173\u0178\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u0002\u0000"+
		"\u0000\u0175\u0177\u0003F#\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177"+
		"\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0001\u0000\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a"+
		"\u0178\u0001\u0000\u0000\u0000\u017b\u017c\u00056\u0000\u0000\u017cC\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u00057\u0000\u0000\u017e\u0181\u0003\u001e"+
		"\u000f\u0000\u017f\u0180\u0005\u0002\u0000\u0000\u0180\u0182\u0003\u001e"+
		"\u000f\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000"+
		"\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u00058\u0000"+
		"\u0000\u0186E\u0001\u0000\u0000\u0000\u0187\u018a\u0005X\u0000\u0000\u0188"+
		"\u0189\u0005\u0001\u0000\u0000\u0189\u018b\u0003\u0018\f\u0000\u018a\u0188"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0001\u0000\u0000\u0000\u018c\u018e\u0005\u0004\u0000\u0000\u018d\u0187"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0003\u001e\u000f\u0000\u0190G\u0001"+
		"\u0000\u0000\u0000+MV[dgrw~\u0082\u008b\u0094\u009a\u00a1\u00ab\u00b6"+
		"\u00c3\u00ca\u00ce\u00d4\u00e0\u00eb\u00f5\u0102\u0105\u010e\u0116\u0124"+
		"\u012a\u0134\u0139\u013d\u0146\u014b\u0153\u0156\u015c\u0166\u016e\u0172"+
		"\u0178\u0183\u018a\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}