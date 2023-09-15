// Generated from /home/joel/EventManager/intellij-lsp-client/intellij-lsp-client/src/main/antlr/dev/tlang/parser/TLangTmpl.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TLangTmplParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, TEXT=30, WS=31, STRING=32, 
		NUMBER=33, COMMENT=34, LINE_COMMENT=35, Helper=36, Tmpl=37, Model=38, 
		Use=39, Expose=40, Func=41, If=42, Else=43, For=44, In=45, To=46, Until=47, 
		Set=48, Let=49, Impl=50, Ext=51, New=52, Spec=53, Pkg=54, While=55, Do=56, 
		Var=57, Return=58, True=59, False=60, As=61, LBRACE=62, RBRACE=63, LPARENT=64, 
		RPARENT=65, LSQUARE=66, RSQUARE=67, INTEPRETED=68, ESCAPED_ID=69, WHITE_SPACES=70, 
		ID=71, With=72;
	public static final int
		RULE_tmplBlock = 0, RULE_tmplBlockContentType = 1, RULE_tmplFullBlock = 2, 
		RULE_tmplSpecialisedBlock = 3, RULE_tmplSpecialisedContent = 4, RULE_tmplContent = 5, 
		RULE_tmplPkg = 6, RULE_tmplUse = 7, RULE_tmplAnnot = 8, RULE_tmplAnnotParam = 9, 
		RULE_tmplProps = 10, RULE_tmplImpl = 11, RULE_tmplFunc = 12, RULE_tmplCurrying = 13, 
		RULE_tmplCurryingParam = 14, RULE_tmplParam = 15, RULE_tmplType = 16, 
		RULE_tmplGeneric = 17, RULE_tmplExprContent = 18, RULE_tmplExprBlock = 19, 
		RULE_tmplExpression = 20, RULE_tmplIf = 21, RULE_tmplElse = 22, RULE_tmplFor = 23, 
		RULE_tmplWhile = 24, RULE_tmplDoWhile = 25, RULE_tmplAnonFunc = 26, RULE_tmplVar = 27, 
		RULE_tmplOptionalValue = 28, RULE_tmplCallObj = 29, RULE_tmplCallObjType = 30, 
		RULE_tmplCallFunc = 31, RULE_tmplCurryParams = 32, RULE_tmplSetAttribute = 33, 
		RULE_tmplInclSetAttribute = 34, RULE_tmplCallArray = 35, RULE_tmplCallVariable = 36, 
		RULE_tmplValueType = 37, RULE_tmplPrimitiveValue = 38, RULE_tmplStringValue = 39, 
		RULE_tmplNumberValue = 40, RULE_tmplTextValue = 41, RULE_tmplBoolValue = 42, 
		RULE_tmplArrayValue = 43, RULE_tmplInclAttribute = 44, RULE_tmplAttribute = 45, 
		RULE_tmplMultiValue = 46, RULE_tmplEntityValue = 47, RULE_tmplOperation = 48, 
		RULE_tmplInclude = 49, RULE_tmplReturn = 50, RULE_tmplAffect = 51, RULE_tmplCast = 52, 
		RULE_tmplID = 53, RULE_tmplIntprID = 54, RULE_tmplString = 55, RULE_tmplIntprString = 56, 
		RULE_tmplText = 57, RULE_tmplIntprText = 58, RULE_tmplIdOrString = 59, 
		RULE_assignVar = 60, RULE_valueType = 61, RULE_objType = 62, RULE_arrayType = 63, 
		RULE_operation = 64, RULE_operator = 65, RULE_complexValueType = 66, RULE_primitiveValue = 67, 
		RULE_lazyValue = 68, RULE_stringValue = 69, RULE_numberValue = 70, RULE_textValue = 71, 
		RULE_boolValue = 72, RULE_arrayValue = 73, RULE_callObj = 74, RULE_callObjType = 75, 
		RULE_callArray = 76, RULE_callFunc = 77, RULE_curryParams = 78, RULE_setAttribute = 79, 
		RULE_callVariable = 80, RULE_entityValue = 81, RULE_impl = 82, RULE_multiValue = 83, 
		RULE_complexAttribute = 84, RULE_helperBlock = 85, RULE_helperFunc = 86, 
		RULE_helperCurrying = 87, RULE_helperParam = 88, RULE_helperParamType = 89, 
		RULE_helperFuncType = 90, RULE_helperContent = 91, RULE_helperStatement = 92, 
		RULE_helperIf = 93, RULE_helperElse = 94, RULE_helperFor = 95;
	private static String[] makeRuleNames() {
		return new String[] {
			"tmplBlock", "tmplBlockContentType", "tmplFullBlock", "tmplSpecialisedBlock", 
			"tmplSpecialisedContent", "tmplContent", "tmplPkg", "tmplUse", "tmplAnnot", 
			"tmplAnnotParam", "tmplProps", "tmplImpl", "tmplFunc", "tmplCurrying", 
			"tmplCurryingParam", "tmplParam", "tmplType", "tmplGeneric", "tmplExprContent", 
			"tmplExprBlock", "tmplExpression", "tmplIf", "tmplElse", "tmplFor", "tmplWhile", 
			"tmplDoWhile", "tmplAnonFunc", "tmplVar", "tmplOptionalValue", "tmplCallObj", 
			"tmplCallObjType", "tmplCallFunc", "tmplCurryParams", "tmplSetAttribute", 
			"tmplInclSetAttribute", "tmplCallArray", "tmplCallVariable", "tmplValueType", 
			"tmplPrimitiveValue", "tmplStringValue", "tmplNumberValue", "tmplTextValue", 
			"tmplBoolValue", "tmplArrayValue", "tmplInclAttribute", "tmplAttribute", 
			"tmplMultiValue", "tmplEntityValue", "tmplOperation", "tmplInclude", 
			"tmplReturn", "tmplAffect", "tmplCast", "tmplID", "tmplIntprID", "tmplString", 
			"tmplIntprString", "tmplText", "tmplIntprText", "tmplIdOrString", "assignVar", 
			"valueType", "objType", "arrayType", "operation", "operator", "complexValueType", 
			"primitiveValue", "lazyValue", "stringValue", "numberValue", "textValue", 
			"boolValue", "arrayValue", "callObj", "callObjType", "callArray", "callFunc", 
			"curryParams", "setAttribute", "callVariable", "entityValue", "impl", 
			"multiValue", "complexAttribute", "helperBlock", "helperFunc", "helperCurrying", 
			"helperParam", "helperParamType", "helperFuncType", "helperContent", 
			"helperStatement", "helperIf", "helperElse", "helperFor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'setAttr'", "'.'", "'@'", "'='", "':'", "'<'", "'>'", "'=>'", 
			"'?'", "'_'", "'<['", "']>'", "'s\"'", "'\"'", "'s\"\"\"'", "'\"\"\"'", 
			"'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'>='", 
			"'<='", "'&'", null, null, null, null, null, null, "'helper'", "'tmpl'", 
			"'model'", "'use'", "'expose'", "'func'", "'if'", "'else'", "'for'", 
			"'in'", "'to'", "'until'", "'set'", "'let'", "'impl'", "'ext'", "'new'", 
			"'spec'", "'pkg'", "'while'", "'do'", "'var'", "'return'", "'true'", 
			"'false'", "'as'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TEXT", "WS", "STRING", "NUMBER", 
			"COMMENT", "LINE_COMMENT", "Helper", "Tmpl", "Model", "Use", "Expose", 
			"Func", "If", "Else", "For", "In", "To", "Until", "Set", "Let", "Impl", 
			"Ext", "New", "Spec", "Pkg", "While", "Do", "Var", "Return", "True", 
			"False", "As", "LBRACE", "RBRACE", "LPARENT", "RPARENT", "LSQUARE", "RSQUARE", 
			"INTEPRETED", "ESCAPED_ID", "WHITE_SPACES", "ID", "With"
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
	public String getGrammarFileName() { return "TLangTmpl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLangTmplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TmplBlockContext extends ParserRuleContext {
		public TmplIDContext lang;
		public TmplIDContext name;
		public HelperParamContext helperParam;
		public List<HelperParamContext> params = new ArrayList<HelperParamContext>();
		public TmplBlockContentTypeContext block;
		public TerminalNode Tmpl() { return getToken(TLangTmplParser.Tmpl, 0); }
		public TerminalNode LSQUARE() { return getToken(TLangTmplParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TLangTmplParser.RSQUARE, 0); }
		public List<TmplIDContext> tmplID() {
			return getRuleContexts(TmplIDContext.class);
		}
		public TmplIDContext tmplID(int i) {
			return getRuleContext(TmplIDContext.class,i);
		}
		public TmplBlockContentTypeContext tmplBlockContentType() {
			return getRuleContext(TmplBlockContentTypeContext.class,0);
		}
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public List<HelperParamContext> helperParam() {
			return getRuleContexts(HelperParamContext.class);
		}
		public HelperParamContext helperParam(int i) {
			return getRuleContext(HelperParamContext.class,i);
		}
		public TmplBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplBlockContext tmplBlock() throws RecognitionException {
		TmplBlockContext _localctx = new TmplBlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tmplBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(Tmpl);
			setState(193);
			match(LSQUARE);
			setState(194);
			((TmplBlockContext)_localctx).lang = tmplID();
			setState(195);
			match(RSQUARE);
			setState(196);
			((TmplBlockContext)_localctx).name = tmplID();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPARENT) {
				{
				setState(197);
				match(LPARENT);
				setState(198);
				((TmplBlockContext)_localctx).helperParam = helperParam();
				((TmplBlockContext)_localctx).params.add(((TmplBlockContext)_localctx).helperParam);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(199);
					match(T__0);
					setState(200);
					((TmplBlockContext)_localctx).helperParam = helperParam();
					((TmplBlockContext)_localctx).params.add(((TmplBlockContext)_localctx).helperParam);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(RPARENT);
				}
			}

			setState(210);
			((TmplBlockContext)_localctx).block = tmplBlockContentType();
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
	public static class TmplBlockContentTypeContext extends ParserRuleContext {
		public TmplFullBlockContext tmplFullBlock() {
			return getRuleContext(TmplFullBlockContext.class,0);
		}
		public TmplSpecialisedBlockContext tmplSpecialisedBlock() {
			return getRuleContext(TmplSpecialisedBlockContext.class,0);
		}
		public TmplBlockContentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplBlockContentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplBlockContentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplBlockContentType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplBlockContentType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplBlockContentTypeContext tmplBlockContentType() throws RecognitionException {
		TmplBlockContentTypeContext _localctx = new TmplBlockContentTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tmplBlockContentType);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				tmplFullBlock();
				}
				break;
			case Spec:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				tmplSpecialisedBlock();
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
	public static class TmplFullBlockContext extends ParserRuleContext {
		public TmplPkgContext tmplPakage;
		public TmplUseContext tmplUse;
		public List<TmplUseContext> tmplUses = new ArrayList<TmplUseContext>();
		public TmplContentContext tmplContent;
		public List<TmplContentContext> tmplContents = new ArrayList<TmplContentContext>();
		public TerminalNode LBRACE() { return getToken(TLangTmplParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
		public TmplPkgContext tmplPkg() {
			return getRuleContext(TmplPkgContext.class,0);
		}
		public List<TmplUseContext> tmplUse() {
			return getRuleContexts(TmplUseContext.class);
		}
		public TmplUseContext tmplUse(int i) {
			return getRuleContext(TmplUseContext.class,i);
		}
		public List<TmplContentContext> tmplContent() {
			return getRuleContexts(TmplContentContext.class);
		}
		public TmplContentContext tmplContent(int i) {
			return getRuleContext(TmplContentContext.class,i);
		}
		public TmplFullBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplFullBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplFullBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplFullBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplFullBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplFullBlockContext tmplFullBlock() throws RecognitionException {
		TmplFullBlockContext _localctx = new TmplFullBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tmplFullBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(LBRACE);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Pkg) {
				{
				setState(217);
				((TmplFullBlockContext)_localctx).tmplPakage = tmplPkg();
				}
			}

			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Use) {
				{
				{
				setState(220);
				((TmplFullBlockContext)_localctx).tmplUse = tmplUse();
				((TmplFullBlockContext)_localctx).tmplUses.add(((TmplFullBlockContext)_localctx).tmplUse);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2275467914943485968L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 181L) != 0)) {
				{
				{
				setState(226);
				((TmplFullBlockContext)_localctx).tmplContent = tmplContent();
				((TmplFullBlockContext)_localctx).tmplContents.add(((TmplFullBlockContext)_localctx).tmplContent);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
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
	public static class TmplSpecialisedBlockContext extends ParserRuleContext {
		public TmplSpecialisedContentContext content;
		public TerminalNode Spec() { return getToken(TLangTmplParser.Spec, 0); }
		public TerminalNode LBRACE() { return getToken(TLangTmplParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
		public TmplSpecialisedContentContext tmplSpecialisedContent() {
			return getRuleContext(TmplSpecialisedContentContext.class,0);
		}
		public TmplSpecialisedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplSpecialisedBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplSpecialisedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplSpecialisedBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplSpecialisedBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplSpecialisedBlockContext tmplSpecialisedBlock() throws RecognitionException {
		TmplSpecialisedBlockContext _localctx = new TmplSpecialisedBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tmplSpecialisedBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(Spec);
			setState(235);
			match(LBRACE);
			setState(236);
			((TmplSpecialisedBlockContext)_localctx).content = tmplSpecialisedContent();
			setState(237);
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
	public static class TmplSpecialisedContentContext extends ParserRuleContext {
		public TmplContentContext tmplContent() {
			return getRuleContext(TmplContentContext.class,0);
		}
		public TmplAttributeContext tmplAttribute() {
			return getRuleContext(TmplAttributeContext.class,0);
		}
		public TmplSetAttributeContext tmplSetAttribute() {
			return getRuleContext(TmplSetAttributeContext.class,0);
		}
		public TmplParamContext tmplParam() {
			return getRuleContext(TmplParamContext.class,0);
		}
		public TmplSpecialisedContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplSpecialisedContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplSpecialisedContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplSpecialisedContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplSpecialisedContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplSpecialisedContentContext tmplSpecialisedContent() throws RecognitionException {
		TmplSpecialisedContentContext _localctx = new TmplSpecialisedContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tmplSpecialisedContent);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				tmplContent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				tmplAttribute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(T__1);
				setState(242);
				tmplSetAttribute();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				tmplParam();
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
	public static class TmplContentContext extends ParserRuleContext {
		public TmplImplContext tmplImpl() {
			return getRuleContext(TmplImplContext.class,0);
		}
		public TmplFuncContext tmplFunc() {
			return getRuleContext(TmplFuncContext.class,0);
		}
		public TmplExpressionContext tmplExpression() {
			return getRuleContext(TmplExpressionContext.class,0);
		}
		public TmplOperationContext tmplOperation() {
			return getRuleContext(TmplOperationContext.class,0);
		}
		public TmplContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplContentContext tmplContent() throws RecognitionException {
		TmplContentContext _localctx = new TmplContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tmplContent);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				tmplImpl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				tmplFunc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				tmplExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				tmplOperation();
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
	public static class TmplPkgContext extends ParserRuleContext {
		public TmplIDContext tmplID;
		public List<TmplIDContext> parts = new ArrayList<TmplIDContext>();
		public TerminalNode Pkg() { return getToken(TLangTmplParser.Pkg, 0); }
		public List<TmplIDContext> tmplID() {
			return getRuleContexts(TmplIDContext.class);
		}
		public TmplIDContext tmplID(int i) {
			return getRuleContext(TmplIDContext.class,i);
		}
		public TmplPkgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplPkg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplPkg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplPkg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplPkg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplPkgContext tmplPkg() throws RecognitionException {
		TmplPkgContext _localctx = new TmplPkgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tmplPkg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(Pkg);
			setState(253);
			((TmplPkgContext)_localctx).tmplID = tmplID();
			((TmplPkgContext)_localctx).parts.add(((TmplPkgContext)_localctx).tmplID);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(254);
				match(T__2);
				setState(255);
				((TmplPkgContext)_localctx).tmplID = tmplID();
				((TmplPkgContext)_localctx).parts.add(((TmplPkgContext)_localctx).tmplID);
				}
				}
				setState(260);
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
	public static class TmplUseContext extends ParserRuleContext {
		public TmplIDContext tmplID;
		public List<TmplIDContext> parts = new ArrayList<TmplIDContext>();
		public TmplIDContext alias;
		public TerminalNode Use() { return getToken(TLangTmplParser.Use, 0); }
		public List<TmplIDContext> tmplID() {
			return getRuleContexts(TmplIDContext.class);
		}
		public TmplIDContext tmplID(int i) {
			return getRuleContext(TmplIDContext.class,i);
		}
		public TerminalNode As() { return getToken(TLangTmplParser.As, 0); }
		public TmplUseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplUse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplUse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplUseContext tmplUse() throws RecognitionException {
		TmplUseContext _localctx = new TmplUseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tmplUse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(Use);
			setState(262);
			((TmplUseContext)_localctx).tmplID = tmplID();
			((TmplUseContext)_localctx).parts.add(((TmplUseContext)_localctx).tmplID);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(263);
				match(T__2);
				setState(264);
				((TmplUseContext)_localctx).tmplID = tmplID();
				((TmplUseContext)_localctx).parts.add(((TmplUseContext)_localctx).tmplID);
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(270);
				match(As);
				setState(271);
				((TmplUseContext)_localctx).alias = tmplID();
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
	public static class TmplAnnotContext extends ParserRuleContext {
		public TmplIDContext name;
		public TmplAnnotParamContext tmplAnnotParam;
		public List<TmplAnnotParamContext> annotParams = new ArrayList<TmplAnnotParamContext>();
		public TmplIDContext tmplID() {
			return getRuleContext(TmplIDContext.class,0);
		}
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public List<TmplAnnotParamContext> tmplAnnotParam() {
			return getRuleContexts(TmplAnnotParamContext.class);
		}
		public TmplAnnotParamContext tmplAnnotParam(int i) {
			return getRuleContext(TmplAnnotParamContext.class,i);
		}
		public TmplAnnotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplAnnot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplAnnot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplAnnot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplAnnot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplAnnotContext tmplAnnot() throws RecognitionException {
		TmplAnnotContext _localctx = new TmplAnnotContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tmplAnnot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__3);
			setState(275);
			((TmplAnnotContext)_localctx).name = tmplID();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPARENT) {
				{
				setState(276);
				match(LPARENT);
				setState(277);
				((TmplAnnotContext)_localctx).tmplAnnotParam = tmplAnnotParam();
				((TmplAnnotContext)_localctx).annotParams.add(((TmplAnnotContext)_localctx).tmplAnnotParam);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(278);
					match(T__0);
					setState(279);
					((TmplAnnotContext)_localctx).tmplAnnotParam = tmplAnnotParam();
					((TmplAnnotContext)_localctx).annotParams.add(((TmplAnnotContext)_localctx).tmplAnnotParam);
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(RPARENT);
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
	public static class TmplAnnotParamContext extends ParserRuleContext {
		public TmplIDContext name;
		public TmplValueTypeContext value;
		public TmplValueTypeContext tmplValueType() {
			return getRuleContext(TmplValueTypeContext.class,0);
		}
		public TmplIDContext tmplID() {
			return getRuleContext(TmplIDContext.class,0);
		}
		public TmplAnnotParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplAnnotParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplAnnotParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplAnnotParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplAnnotParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplAnnotParamContext tmplAnnotParam() throws RecognitionException {
		TmplAnnotParamContext _localctx = new TmplAnnotParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tmplAnnotParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(289);
				((TmplAnnotParamContext)_localctx).name = tmplID();
				setState(290);
				match(T__4);
				}
				break;
			}
			setState(294);
			((TmplAnnotParamContext)_localctx).value = tmplValueType();
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
	public static class TmplPropsContext extends ParserRuleContext {
		public TmplIDContext tmplID;
		public List<TmplIDContext> props = new ArrayList<TmplIDContext>();
		public TerminalNode LSQUARE() { return getToken(TLangTmplParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TLangTmplParser.RSQUARE, 0); }
		public List<TmplIDContext> tmplID() {
			return getRuleContexts(TmplIDContext.class);
		}
		public TmplIDContext tmplID(int i) {
			return getRuleContext(TmplIDContext.class,i);
		}
		public TmplPropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplProps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplPropsContext tmplProps() throws RecognitionException {
		TmplPropsContext _localctx = new TmplPropsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tmplProps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(296);
				match(LSQUARE);
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(297);
					((TmplPropsContext)_localctx).tmplID = tmplID();
					((TmplPropsContext)_localctx).props.add(((TmplPropsContext)_localctx).tmplID);
					}
					}
					setState(300); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 11L) != 0) );
				setState(302);
				match(RSQUARE);
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
	public static class TmplImplContext extends ParserRuleContext {
		public TmplAnnotContext tmplAnnot;
		public List<TmplAnnotContext> annots = new ArrayList<TmplAnnotContext>();
		public TmplPropsContext props;
		public TmplIDContext name;
		public TmplPropsContext forProps;
		public TmplTypeContext tmplType;
		public List<TmplTypeContext> forNames = new ArrayList<TmplTypeContext>();
		public TmplPropsContext withProps;
		public List<TmplTypeContext> withNames = new ArrayList<TmplTypeContext>();
		public TmplContentContext tmplContent;
		public List<TmplContentContext> tmplImplContents = new ArrayList<TmplContentContext>();
		public TerminalNode Impl() { return getToken(TLangTmplParser.Impl, 0); }
		public TerminalNode LBRACE() { return getToken(TLangTmplParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
		public List<TmplPropsContext> tmplProps() {
			return getRuleContexts(TmplPropsContext.class);
		}
		public TmplPropsContext tmplProps(int i) {
			return getRuleContext(TmplPropsContext.class,i);
		}
		public TmplIDContext tmplID() {
			return getRuleContext(TmplIDContext.class,0);
		}
		public List<TmplAnnotContext> tmplAnnot() {
			return getRuleContexts(TmplAnnotContext.class);
		}
		public TmplAnnotContext tmplAnnot(int i) {
			return getRuleContext(TmplAnnotContext.class,i);
		}
		public List<TmplContentContext> tmplContent() {
			return getRuleContexts(TmplContentContext.class);
		}
		public TmplContentContext tmplContent(int i) {
			return getRuleContext(TmplContentContext.class,i);
		}
		public TerminalNode For() { return getToken(TLangTmplParser.For, 0); }
		public List<TmplTypeContext> tmplType() {
			return getRuleContexts(TmplTypeContext.class);
		}
		public TmplTypeContext tmplType(int i) {
			return getRuleContext(TmplTypeContext.class,i);
		}
		public TerminalNode With() { return getToken(TLangTmplParser.With, 0); }
		public TmplImplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplImpl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplImpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplImpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplImplContext tmplImpl() throws RecognitionException {
		TmplImplContext _localctx = new TmplImplContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tmplImpl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(306);
				((TmplImplContext)_localctx).tmplAnnot = tmplAnnot();
				((TmplImplContext)_localctx).annots.add(((TmplImplContext)_localctx).tmplAnnot);
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			match(Impl);
			setState(313);
			((TmplImplContext)_localctx).props = tmplProps();
			setState(314);
			((TmplImplContext)_localctx).name = tmplID();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==For) {
				{
				{
				setState(315);
				match(For);
				setState(316);
				((TmplImplContext)_localctx).forProps = tmplProps();
				setState(317);
				((TmplImplContext)_localctx).tmplType = tmplType();
				((TmplImplContext)_localctx).forNames.add(((TmplImplContext)_localctx).tmplType);
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(319);
					match(T__0);
					setState(320);
					((TmplImplContext)_localctx).tmplType = tmplType();
					((TmplImplContext)_localctx).forNames.add(((TmplImplContext)_localctx).tmplType);
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==With) {
					{
					{
					setState(326);
					match(With);
					setState(327);
					((TmplImplContext)_localctx).withProps = tmplProps();
					setState(328);
					((TmplImplContext)_localctx).tmplType = tmplType();
					((TmplImplContext)_localctx).withNames.add(((TmplImplContext)_localctx).tmplType);
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(330);
						match(T__0);
						setState(331);
						((TmplImplContext)_localctx).tmplType = tmplType();
						((TmplImplContext)_localctx).withNames.add(((TmplImplContext)_localctx).tmplType);
						}
						}
						setState(336);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
			}

			setState(341);
			match(LBRACE);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2275467914943485968L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 181L) != 0)) {
				{
				{
				setState(342);
				((TmplImplContext)_localctx).tmplContent = tmplContent();
				((TmplImplContext)_localctx).tmplImplContents.add(((TmplImplContext)_localctx).tmplContent);
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
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
	public static class TmplFuncContext extends ParserRuleContext {
		public TmplAnnotContext tmplAnnot;
		public List<TmplAnnotContext> annots = new ArrayList<TmplAnnotContext>();
		public TmplPropsContext props;
		public TmplIDContext name;
		public TmplCurryingContext tmplCurrying;
		public List<TmplCurryingContext> curries = new ArrayList<TmplCurryingContext>();
		public TmplTypeContext tmplType;
		public List<TmplTypeContext> types = new ArrayList<TmplTypeContext>();
		public TmplPropsContext postProps;
		public TmplExprBlockContext content;
		public TerminalNode Func() { return getToken(TLangTmplParser.Func, 0); }
		public List<TmplPropsContext> tmplProps() {
			return getRuleContexts(TmplPropsContext.class);
		}
		public TmplPropsContext tmplProps(int i) {
			return getRuleContext(TmplPropsContext.class,i);
		}
		public TmplIDContext tmplID() {
			return getRuleContext(TmplIDContext.class,0);
		}
		public List<TmplAnnotContext> tmplAnnot() {
			return getRuleContexts(TmplAnnotContext.class);
		}
		public TmplAnnotContext tmplAnnot(int i) {
			return getRuleContext(TmplAnnotContext.class,i);
		}
		public List<TmplCurryingContext> tmplCurrying() {
			return getRuleContexts(TmplCurryingContext.class);
		}
		public TmplCurryingContext tmplCurrying(int i) {
			return getRuleContext(TmplCurryingContext.class,i);
		}
		public List<TmplTypeContext> tmplType() {
			return getRuleContexts(TmplTypeContext.class);
		}
		public TmplTypeContext tmplType(int i) {
			return getRuleContext(TmplTypeContext.class,i);
		}
		public TmplExprBlockContext tmplExprBlock() {
			return getRuleContext(TmplExprBlockContext.class,0);
		}
		public TmplFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplFuncContext tmplFunc() throws RecognitionException {
		TmplFuncContext _localctx = new TmplFuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tmplFunc);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(350);
				((TmplFuncContext)_localctx).tmplAnnot = tmplAnnot();
				((TmplFuncContext)_localctx).annots.add(((TmplFuncContext)_localctx).tmplAnnot);
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			match(Func);
			setState(357);
			((TmplFuncContext)_localctx).props = tmplProps();
			setState(358);
			((TmplFuncContext)_localctx).name = tmplID();
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(359);
					((TmplFuncContext)_localctx).tmplCurrying = tmplCurrying();
					((TmplFuncContext)_localctx).curries.add(((TmplFuncContext)_localctx).tmplCurrying);
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(365);
				match(T__5);
				setState(366);
				((TmplFuncContext)_localctx).tmplType = tmplType();
				((TmplFuncContext)_localctx).types.add(((TmplFuncContext)_localctx).tmplType);
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(367);
						match(T__0);
						setState(368);
						((TmplFuncContext)_localctx).tmplType = tmplType();
						((TmplFuncContext)_localctx).types.add(((TmplFuncContext)_localctx).tmplType);
						}
						} 
					}
					setState(373);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
			}

			setState(376);
			((TmplFuncContext)_localctx).postProps = tmplProps();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(377);
				((TmplFuncContext)_localctx).content = tmplExprBlock();
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
	public static class TmplCurryingContext extends ParserRuleContext {
		public TmplCurryingParamContext param;
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public TmplCurryingParamContext tmplCurryingParam() {
			return getRuleContext(TmplCurryingParamContext.class,0);
		}
		public TmplCurryingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplCurrying; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplCurrying(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplCurrying(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplCurrying(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplCurryingContext tmplCurrying() throws RecognitionException {
		TmplCurryingContext _localctx = new TmplCurryingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tmplCurrying);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(LPARENT);
			setState(381);
			((TmplCurryingContext)_localctx).param = tmplCurryingParam();
			setState(382);
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
	public static class TmplCurryingParamContext extends ParserRuleContext {
		public TmplParamContext tmplParam;
		public List<TmplParamContext> params = new ArrayList<TmplParamContext>();
		public List<TmplParamContext> tmplParam() {
			return getRuleContexts(TmplParamContext.class);
		}
		public TmplParamContext tmplParam(int i) {
			return getRuleContext(TmplParamContext.class,i);
		}
		public TmplCurryingParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplCurryingParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplCurryingParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplCurryingParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplCurryingParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplCurryingParamContext tmplCurryingParam() throws RecognitionException {
		TmplCurryingParamContext _localctx = new TmplCurryingParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tmplCurryingParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 11L) != 0)) {
				{
				{
				setState(384);
				((TmplCurryingParamContext)_localctx).tmplParam = tmplParam();
				((TmplCurryingParamContext)_localctx).params.add(((TmplCurryingParamContext)_localctx).tmplParam);
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(385);
					match(T__0);
					setState(386);
					((TmplCurryingParamContext)_localctx).tmplParam = tmplParam();
					((TmplCurryingParamContext)_localctx).params.add(((TmplCurryingParamContext)_localctx).tmplParam);
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class TmplParamContext extends ParserRuleContext {
		public TmplAnnotContext tmplAnnot;
		public List<TmplAnnotContext> annots = new ArrayList<TmplAnnotContext>();
		public TmplIDContext accessor;
		public TmplIDContext name;
		public TmplTypeContext type;
		public List<TmplIDContext> tmplID() {
			return getRuleContexts(TmplIDContext.class);
		}
		public TmplIDContext tmplID(int i) {
			return getRuleContext(TmplIDContext.class,i);
		}
		public List<TmplAnnotContext> tmplAnnot() {
			return getRuleContexts(TmplAnnotContext.class);
		}
		public TmplAnnotContext tmplAnnot(int i) {
			return getRuleContext(TmplAnnotContext.class,i);
		}
		public TmplTypeContext tmplType() {
			return getRuleContext(TmplTypeContext.class,0);
		}
		public TmplParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplParamContext tmplParam() throws RecognitionException {
		TmplParamContext _localctx = new TmplParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tmplParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(394);
				((TmplParamContext)_localctx).tmplAnnot = tmplAnnot();
				((TmplParamContext)_localctx).annots.add(((TmplParamContext)_localctx).tmplAnnot);
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(400);
				((TmplParamContext)_localctx).accessor = tmplID();
				}
				break;
			}
			setState(403);
			((TmplParamContext)_localctx).name = tmplID();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(404);
				match(T__5);
				setState(405);
				((TmplParamContext)_localctx).type = tmplType();
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
	public static class TmplTypeContext extends ParserRuleContext {
		public TmplIDContext type;
		public TmplGenericContext generic;
		public TmplCurryParamsContext instance;
		public Token array;
		public TmplIDContext tmplID() {
			return getRuleContext(TmplIDContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(TLangTmplParser.RSQUARE, 0); }
		public TmplCurryParamsContext tmplCurryParams() {
			return getRuleContext(TmplCurryParamsContext.class,0);
		}
		public TerminalNode LSQUARE() { return getToken(TLangTmplParser.LSQUARE, 0); }
		public TmplGenericContext tmplGeneric() {
			return getRuleContext(TmplGenericContext.class,0);
		}
		public TmplTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplTypeContext tmplType() throws RecognitionException {
		TmplTypeContext _localctx = new TmplTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tmplType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			((TmplTypeContext)_localctx).type = tmplID();
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(409);
				match(T__6);
				{
				setState(410);
				((TmplTypeContext)_localctx).generic = tmplGeneric();
				}
				setState(411);
				match(T__7);
				}
				break;
			}
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(415);
				((TmplTypeContext)_localctx).instance = tmplCurryParams();
				}
				break;
			}
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(418);
				((TmplTypeContext)_localctx).array = match(LSQUARE);
				setState(419);
				match(RSQUARE);
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
	public static class TmplGenericContext extends ParserRuleContext {
		public TmplTypeContext tmplType;
		public List<TmplTypeContext> types = new ArrayList<TmplTypeContext>();
		public List<TmplTypeContext> tmplType() {
			return getRuleContexts(TmplTypeContext.class);
		}
		public TmplTypeContext tmplType(int i) {
			return getRuleContext(TmplTypeContext.class,i);
		}
		public TmplGenericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplGeneric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplGeneric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplGeneric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplGeneric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplGenericContext tmplGeneric() throws RecognitionException {
		TmplGenericContext _localctx = new TmplGenericContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tmplGeneric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(422);
			((TmplGenericContext)_localctx).tmplType = tmplType();
			((TmplGenericContext)_localctx).types.add(((TmplGenericContext)_localctx).tmplType);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(423);
				match(T__0);
				setState(424);
				((TmplGenericContext)_localctx).tmplType = tmplType();
				((TmplGenericContext)_localctx).types.add(((TmplGenericContext)_localctx).tmplType);
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class TmplExprContentContext extends ParserRuleContext {
		public TmplExpressionContext tmplExpression() {
			return getRuleContext(TmplExpressionContext.class,0);
		}
		public TmplExprBlockContext tmplExprBlock() {
			return getRuleContext(TmplExprBlockContext.class,0);
		}
		public TmplExprContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplExprContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplExprContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplExprContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplExprContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplExprContentContext tmplExprContent() throws RecognitionException {
		TmplExprContentContext _localctx = new TmplExprContentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tmplExprContent);
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__10:
			case T__11:
			case T__13:
			case T__15:
			case TEXT:
			case STRING:
			case NUMBER:
			case Func:
			case If:
			case For:
			case New:
			case While:
			case Do:
			case Var:
			case Return:
			case True:
			case False:
			case LPARENT:
			case LSQUARE:
			case INTEPRETED:
			case ESCAPED_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				tmplExpression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				tmplExprBlock();
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
	public static class TmplExprBlockContext extends ParserRuleContext {
		public TmplExpressionContext tmplExpression;
		public List<TmplExpressionContext> exprs = new ArrayList<TmplExpressionContext>();
		public TerminalNode LBRACE() { return getToken(TLangTmplParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
		public List<TmplExpressionContext> tmplExpression() {
			return getRuleContexts(TmplExpressionContext.class);
		}
		public TmplExpressionContext tmplExpression(int i) {
			return getRuleContext(TmplExpressionContext.class,i);
		}
		public TmplExprBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplExprBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplExprBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplExprBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplExprBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplExprBlockContext tmplExprBlock() throws RecognitionException {
		TmplExprBlockContext _localctx = new TmplExprBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tmplExprBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(LBRACE);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2274342015036643344L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 181L) != 0)) {
				{
				{
				setState(435);
				((TmplExprBlockContext)_localctx).tmplExpression = tmplExpression();
				((TmplExprBlockContext)_localctx).exprs.add(((TmplExprBlockContext)_localctx).tmplExpression);
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
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
	public static class TmplExpressionContext extends ParserRuleContext {
		public TmplVarContext tmplVar() {
			return getRuleContext(TmplVarContext.class,0);
		}
		public TmplCallObjContext tmplCallObj() {
			return getRuleContext(TmplCallObjContext.class,0);
		}
		public TmplValueTypeContext tmplValueType() {
			return getRuleContext(TmplValueTypeContext.class,0);
		}
		public TmplFuncContext tmplFunc() {
			return getRuleContext(TmplFuncContext.class,0);
		}
		public TmplIfContext tmplIf() {
			return getRuleContext(TmplIfContext.class,0);
		}
		public TmplForContext tmplFor() {
			return getRuleContext(TmplForContext.class,0);
		}
		public TmplWhileContext tmplWhile() {
			return getRuleContext(TmplWhileContext.class,0);
		}
		public TmplDoWhileContext tmplDoWhile() {
			return getRuleContext(TmplDoWhileContext.class,0);
		}
		public TmplIncludeContext tmplInclude() {
			return getRuleContext(TmplIncludeContext.class,0);
		}
		public TmplReturnContext tmplReturn() {
			return getRuleContext(TmplReturnContext.class,0);
		}
		public TmplAffectContext tmplAffect() {
			return getRuleContext(TmplAffectContext.class,0);
		}
		public TmplCastContext tmplCast() {
			return getRuleContext(TmplCastContext.class,0);
		}
		public TmplAnonFuncContext tmplAnonFunc() {
			return getRuleContext(TmplAnonFuncContext.class,0);
		}
		public TmplPrimitiveValueContext tmplPrimitiveValue() {
			return getRuleContext(TmplPrimitiveValueContext.class,0);
		}
		public TmplExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplExpressionContext tmplExpression() throws RecognitionException {
		TmplExpressionContext _localctx = new TmplExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tmplExpression);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				tmplVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				tmplCallObj();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				tmplValueType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				tmplFunc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(447);
				tmplIf();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(448);
				tmplFor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(449);
				tmplWhile();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(450);
				tmplDoWhile();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(451);
				tmplInclude();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(452);
				tmplReturn();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(453);
				tmplAffect();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(454);
				tmplCast();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(455);
				tmplAnonFunc();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(456);
				tmplPrimitiveValue();
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
	public static class TmplIfContext extends ParserRuleContext {
		public TmplOperationContext cond;
		public TmplExprContentContext content;
		public TmplElseContext elseThen;
		public TerminalNode If() { return getToken(TLangTmplParser.If, 0); }
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public TmplOperationContext tmplOperation() {
			return getRuleContext(TmplOperationContext.class,0);
		}
		public TmplExprContentContext tmplExprContent() {
			return getRuleContext(TmplExprContentContext.class,0);
		}
		public TmplElseContext tmplElse() {
			return getRuleContext(TmplElseContext.class,0);
		}
		public TmplIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplIfContext tmplIf() throws RecognitionException {
		TmplIfContext _localctx = new TmplIfContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tmplIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(If);
			setState(460);
			match(LPARENT);
			setState(461);
			((TmplIfContext)_localctx).cond = tmplOperation();
			setState(462);
			match(RPARENT);
			setState(463);
			((TmplIfContext)_localctx).content = tmplExprContent();
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(464);
				((TmplIfContext)_localctx).elseThen = tmplElse();
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
	public static class TmplElseContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(TLangTmplParser.Else, 0); }
		public TmplIfContext tmplIf() {
			return getRuleContext(TmplIfContext.class,0);
		}
		public TmplExprContentContext tmplExprContent() {
			return getRuleContext(TmplExprContentContext.class,0);
		}
		public TmplElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplElseContext tmplElse() throws RecognitionException {
		TmplElseContext _localctx = new TmplElseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tmplElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(Else);
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(468);
				tmplIf();
				}
				break;
			case 2:
				{
				setState(469);
				tmplExprContent();
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
	public static class TmplForContext extends ParserRuleContext {
		public TmplIDContext variable;
		public TmplOperationContext start;
		public Token type;
		public TmplOperationContext array;
		public TmplExprContentContext content;
		public TerminalNode For() { return getToken(TLangTmplParser.For, 0); }
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public TmplIDContext tmplID() {
			return getRuleContext(TmplIDContext.class,0);
		}
		public List<TmplOperationContext> tmplOperation() {
			return getRuleContexts(TmplOperationContext.class);
		}
		public TmplOperationContext tmplOperation(int i) {
			return getRuleContext(TmplOperationContext.class,i);
		}
		public TmplExprContentContext tmplExprContent() {
			return getRuleContext(TmplExprContentContext.class,0);
		}
		public TerminalNode In() { return getToken(TLangTmplParser.In, 0); }
		public TerminalNode To() { return getToken(TLangTmplParser.To, 0); }
		public TerminalNode Until() { return getToken(TLangTmplParser.Until, 0); }
		public TmplForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplForContext tmplFor() throws RecognitionException {
		TmplForContext _localctx = new TmplForContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tmplFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(For);
			setState(473);
			match(LPARENT);
			setState(474);
			((TmplForContext)_localctx).variable = tmplID();
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(475);
				match(T__4);
				setState(476);
				((TmplForContext)_localctx).start = tmplOperation();
				}
			}

			setState(479);
			((TmplForContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0)) ) {
				((TmplForContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(480);
			((TmplForContext)_localctx).array = tmplOperation();
			setState(481);
			match(RPARENT);
			setState(482);
			((TmplForContext)_localctx).content = tmplExprContent();
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
	public static class TmplWhileContext extends ParserRuleContext {
		public TmplOperationContext cond;
		public TmplExprContentContext content;
		public TerminalNode While() { return getToken(TLangTmplParser.While, 0); }
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public TmplOperationContext tmplOperation() {
			return getRuleContext(TmplOperationContext.class,0);
		}
		public TmplExprContentContext tmplExprContent() {
			return getRuleContext(TmplExprContentContext.class,0);
		}
		public TmplWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplWhileContext tmplWhile() throws RecognitionException {
		TmplWhileContext _localctx = new TmplWhileContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tmplWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(While);
			setState(485);
			match(LPARENT);
			setState(486);
			((TmplWhileContext)_localctx).cond = tmplOperation();
			setState(487);
			match(RPARENT);
			setState(488);
			((TmplWhileContext)_localctx).content = tmplExprContent();
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
	public static class TmplDoWhileContext extends ParserRuleContext {
		public TmplExprContentContext content;
		public TmplOperationContext cond;
		public TerminalNode Do() { return getToken(TLangTmplParser.Do, 0); }
		public TerminalNode While() { return getToken(TLangTmplParser.While, 0); }
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public TmplExprContentContext tmplExprContent() {
			return getRuleContext(TmplExprContentContext.class,0);
		}
		public TmplOperationContext tmplOperation() {
			return getRuleContext(TmplOperationContext.class,0);
		}
		public TmplDoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplDoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplDoWhileContext tmplDoWhile() throws RecognitionException {
		TmplDoWhileContext _localctx = new TmplDoWhileContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tmplDoWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(Do);
			setState(491);
			((TmplDoWhileContext)_localctx).content = tmplExprContent();
			setState(492);
			match(While);
			setState(493);
			match(LPARENT);
			setState(494);
			((TmplDoWhileContext)_localctx).cond = tmplOperation();
			setState(495);
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
	public static class TmplAnonFuncContext extends ParserRuleContext {
		public TmplCurryingContext params;
		public TmplExprContentContext content;
		public TmplCurryingContext tmplCurrying() {
			return getRuleContext(TmplCurryingContext.class,0);
		}
		public TmplExprContentContext tmplExprContent() {
			return getRuleContext(TmplExprContentContext.class,0);
		}
		public TmplAnonFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplAnonFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplAnonFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplAnonFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplAnonFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplAnonFuncContext tmplAnonFunc() throws RecognitionException {
		TmplAnonFuncContext _localctx = new TmplAnonFuncContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tmplAnonFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			((TmplAnonFuncContext)_localctx).params = tmplCurrying();
			setState(498);
			match(T__8);
			setState(499);
			((TmplAnonFuncContext)_localctx).content = tmplExprContent();
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
	public static class TmplVarContext extends ParserRuleContext {
		public TmplAnnotContext tmplAnnot;
		public List<TmplAnnotContext> annots = new ArrayList<TmplAnnotContext>();
		public TmplPropsContext props;
		public TmplIDContext name;
		public TmplTypeContext type;
		public TmplOptionalValueContext optional;
		public TmplOperationContext value;
		public TerminalNode Var() { return getToken(TLangTmplParser.Var, 0); }
		public TmplPropsContext tmplProps() {
			return getRuleContext(TmplPropsContext.class,0);
		}
		public TmplIDContext tmplID() {
			return getRuleContext(TmplIDContext.class,0);
		}
		public List<TmplAnnotContext> tmplAnnot() {
			return getRuleContexts(TmplAnnotContext.class);
		}
		public TmplAnnotContext tmplAnnot(int i) {
			return getRuleContext(TmplAnnotContext.class,i);
		}
		public TmplTypeContext tmplType() {
			return getRuleContext(TmplTypeContext.class,0);
		}
		public TmplOptionalValueContext tmplOptionalValue() {
			return getRuleContext(TmplOptionalValueContext.class,0);
		}
		public TmplOperationContext tmplOperation() {
			return getRuleContext(TmplOperationContext.class,0);
		}
		public TmplVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplVarContext tmplVar() throws RecognitionException {
		TmplVarContext _localctx = new TmplVarContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tmplVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(501);
				((TmplVarContext)_localctx).tmplAnnot = tmplAnnot();
				((TmplVarContext)_localctx).annots.add(((TmplVarContext)_localctx).tmplAnnot);
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(507);
			match(Var);
			setState(508);
			((TmplVarContext)_localctx).props = tmplProps();
			setState(509);
			((TmplVarContext)_localctx).name = tmplID();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(510);
				match(T__5);
				setState(511);
				((TmplVarContext)_localctx).type = tmplType();
				}
			}

			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(514);
				((TmplVarContext)_localctx).optional = tmplOptionalValue();
				}
			}

			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(517);
				match(T__4);
				setState(518);
				((TmplVarContext)_localctx).value = tmplOperation();
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
	public static class TmplOptionalValueContext extends ParserRuleContext {
		public TmplOptionalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplOptionalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplOptionalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplOptionalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplOptionalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplOptionalValueContext tmplOptionalValue() throws RecognitionException {
		TmplOptionalValueContext _localctx = new TmplOptionalValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tmplOptionalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(T__9);
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
	public static class TmplCallObjContext extends ParserRuleContext {
		public TmplPropsContext props;
		public TmplCallObjTypeContext tmplCallObjType;
		public List<TmplCallObjTypeContext> objs = new ArrayList<TmplCallObjTypeContext>();
		public TmplPropsContext tmplProps() {
			return getRuleContext(TmplPropsContext.class,0);
		}
		public List<TmplCallObjTypeContext> tmplCallObjType() {
			return getRuleContexts(TmplCallObjTypeContext.class);
		}
		public TmplCallObjTypeContext tmplCallObjType(int i) {
			return getRuleContext(TmplCallObjTypeContext.class,i);
		}
		public TmplCallObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplCallObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplCallObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplCallObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplCallObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplCallObjContext tmplCallObj() throws RecognitionException {
		TmplCallObjContext _localctx = new TmplCallObjContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tmplCallObj);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			((TmplCallObjContext)_localctx).props = tmplProps();
			setState(524);
			((TmplCallObjContext)_localctx).tmplCallObjType = tmplCallObjType();
			((TmplCallObjContext)_localctx).objs.add(((TmplCallObjContext)_localctx).tmplCallObjType);
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(525);
					match(T__2);
					setState(526);
					((TmplCallObjContext)_localctx).tmplCallObjType = tmplCallObjType();
					((TmplCallObjContext)_localctx).objs.add(((TmplCallObjContext)_localctx).tmplCallObjType);
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
	public static class TmplCallObjTypeContext extends ParserRuleContext {
		public TmplCallArrayContext tmplCallArray() {
			return getRuleContext(TmplCallArrayContext.class,0);
		}
		public TmplCallFuncContext tmplCallFunc() {
			return getRuleContext(TmplCallFuncContext.class,0);
		}
		public TmplCallVariableContext tmplCallVariable() {
			return getRuleContext(TmplCallVariableContext.class,0);
		}
		public TmplCallObjTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplCallObjType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplCallObjType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplCallObjType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplCallObjType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplCallObjTypeContext tmplCallObjType() throws RecognitionException {
		TmplCallObjTypeContext _localctx = new TmplCallObjTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tmplCallObjType);
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				tmplCallArray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				tmplCallFunc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				tmplCallVariable();
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
	public static class TmplCallFuncContext extends ParserRuleContext {
		public TmplIDContext name;
		public TmplCurryParamsContext tmplCurryParams;
		public List<TmplCurryParamsContext> currying = new ArrayList<TmplCurryParamsContext>();
		public List<TmplCurryParamsContext> tmplCurryParams() {
			return getRuleContexts(TmplCurryParamsContext.class);
		}
		public TmplCurryParamsContext tmplCurryParams(int i) {
			return getRuleContext(TmplCurryParamsContext.class,i);
		}
		public TmplIDContext tmplID() {
			return getRuleContext(TmplIDContext.class,0);
		}
		public TmplCallFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplCallFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplCallFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplCallFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplCallFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplCallFuncContext tmplCallFunc() throws RecognitionException {
		TmplCallFuncContext _localctx = new TmplCallFuncContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tmplCallFunc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEPRETED:
			case ESCAPED_ID:
			case ID:
				{
				{
				setState(537);
				((TmplCallFuncContext)_localctx).name = tmplID();
				}
				}
				break;
			case T__10:
				{
				setState(538);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(542); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(541);
					((TmplCallFuncContext)_localctx).tmplCurryParams = tmplCurryParams();
					((TmplCallFuncContext)_localctx).currying.add(((TmplCallFuncContext)_localctx).tmplCurryParams);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(544); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
	public static class TmplCurryParamsContext extends ParserRuleContext {
		public TmplInclSetAttributeContext tmplInclSetAttribute;
		public List<TmplInclSetAttributeContext> params = new ArrayList<TmplInclSetAttributeContext>();
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public List<TmplInclSetAttributeContext> tmplInclSetAttribute() {
			return getRuleContexts(TmplInclSetAttributeContext.class);
		}
		public TmplInclSetAttributeContext tmplInclSetAttribute(int i) {
			return getRuleContext(TmplInclSetAttributeContext.class,i);
		}
		public TmplCurryParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplCurryParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplCurryParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplCurryParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplCurryParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplCurryParamsContext tmplCurryParams() throws RecognitionException {
		TmplCurryParamsContext _localctx = new TmplCurryParamsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tmplCurryParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(LPARENT);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2274342015036643344L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 181L) != 0)) {
				{
				setState(547);
				((TmplCurryParamsContext)_localctx).tmplInclSetAttribute = tmplInclSetAttribute();
				((TmplCurryParamsContext)_localctx).params.add(((TmplCurryParamsContext)_localctx).tmplInclSetAttribute);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(548);
					match(T__0);
					setState(549);
					((TmplCurryParamsContext)_localctx).tmplInclSetAttribute = tmplInclSetAttribute();
					((TmplCurryParamsContext)_localctx).params.add(((TmplCurryParamsContext)_localctx).tmplInclSetAttribute);
					}
					}
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(557);
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
	public static class TmplSetAttributeContext extends ParserRuleContext {
		public TmplIdOrStringContext name;
		public TmplOperationContext value;
		public TmplOperationContext tmplOperation() {
			return getRuleContext(TmplOperationContext.class,0);
		}
		public TmplIdOrStringContext tmplIdOrString() {
			return getRuleContext(TmplIdOrStringContext.class,0);
		}
		public TmplSetAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplSetAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplSetAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplSetAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplSetAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplSetAttributeContext tmplSetAttribute() throws RecognitionException {
		TmplSetAttributeContext _localctx = new TmplSetAttributeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tmplSetAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(559);
				((TmplSetAttributeContext)_localctx).name = tmplIdOrString();
				setState(560);
				match(T__5);
				}
				break;
			}
			setState(564);
			((TmplSetAttributeContext)_localctx).value = tmplOperation();
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
	public static class TmplInclSetAttributeContext extends ParserRuleContext {
		public TmplIncludeContext tmplInclude() {
			return getRuleContext(TmplIncludeContext.class,0);
		}
		public TmplSetAttributeContext tmplSetAttribute() {
			return getRuleContext(TmplSetAttributeContext.class,0);
		}
		public TmplInclSetAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplInclSetAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplInclSetAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplInclSetAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplInclSetAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplInclSetAttributeContext tmplInclSetAttribute() throws RecognitionException {
		TmplInclSetAttributeContext _localctx = new TmplInclSetAttributeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tmplInclSetAttribute);
		try {
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				tmplInclude();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				tmplSetAttribute();
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
	public static class TmplCallArrayContext extends ParserRuleContext {
		public TmplIDContext name;
		public TmplOperationContext elem;
		public TerminalNode LSQUARE() { return getToken(TLangTmplParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TLangTmplParser.RSQUARE, 0); }
		public TmplIDContext tmplID() {
			return getRuleContext(TmplIDContext.class,0);
		}
		public TmplOperationContext tmplOperation() {
			return getRuleContext(TmplOperationContext.class,0);
		}
		public TmplCallArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplCallArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplCallArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplCallArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplCallArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplCallArrayContext tmplCallArray() throws RecognitionException {
		TmplCallArrayContext _localctx = new TmplCallArrayContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tmplCallArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			((TmplCallArrayContext)_localctx).name = tmplID();
			setState(571);
			match(LSQUARE);
			setState(572);
			((TmplCallArrayContext)_localctx).elem = tmplOperation();
			setState(573);
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
	public static class TmplCallVariableContext extends ParserRuleContext {
		public TmplIDContext name;
		public TmplIDContext tmplID() {
			return getRuleContext(TmplIDContext.class,0);
		}
		public TmplCallVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplCallVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplCallVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplCallVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplCallVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplCallVariableContext tmplCallVariable() throws RecognitionException {
		TmplCallVariableContext _localctx = new TmplCallVariableContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tmplCallVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			((TmplCallVariableContext)_localctx).name = tmplID();
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
	public static class TmplValueTypeContext extends ParserRuleContext {
		public TmplCallObjContext tmplCallObj() {
			return getRuleContext(TmplCallObjContext.class,0);
		}
		public TmplPrimitiveValueContext tmplPrimitiveValue() {
			return getRuleContext(TmplPrimitiveValueContext.class,0);
		}
		public TmplMultiValueContext tmplMultiValue() {
			return getRuleContext(TmplMultiValueContext.class,0);
		}
		public TmplValueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplValueType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplValueType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplValueType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplValueType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplValueTypeContext tmplValueType() throws RecognitionException {
		TmplValueTypeContext _localctx = new TmplValueTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tmplValueType);
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				tmplCallObj();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				tmplPrimitiveValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				tmplMultiValue();
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
	public static class TmplPrimitiveValueContext extends ParserRuleContext {
		public TmplStringValueContext tmplStringValue() {
			return getRuleContext(TmplStringValueContext.class,0);
		}
		public TmplNumberValueContext tmplNumberValue() {
			return getRuleContext(TmplNumberValueContext.class,0);
		}
		public TmplTextValueContext tmplTextValue() {
			return getRuleContext(TmplTextValueContext.class,0);
		}
		public TmplEntityValueContext tmplEntityValue() {
			return getRuleContext(TmplEntityValueContext.class,0);
		}
		public TmplBoolValueContext tmplBoolValue() {
			return getRuleContext(TmplBoolValueContext.class,0);
		}
		public TmplArrayValueContext tmplArrayValue() {
			return getRuleContext(TmplArrayValueContext.class,0);
		}
		public TmplPrimitiveValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplPrimitiveValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplPrimitiveValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplPrimitiveValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplPrimitiveValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplPrimitiveValueContext tmplPrimitiveValue() throws RecognitionException {
		TmplPrimitiveValueContext _localctx = new TmplPrimitiveValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tmplPrimitiveValue);
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				tmplStringValue();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				tmplNumberValue();
				}
				break;
			case T__15:
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				tmplTextValue();
				}
				break;
			case New:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				tmplEntityValue();
				}
				break;
			case True:
			case False:
				enterOuterAlt(_localctx, 5);
				{
				setState(586);
				tmplBoolValue();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 6);
				{
				setState(587);
				tmplArrayValue();
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
	public static class TmplStringValueContext extends ParserRuleContext {
		public TmplStringContext value;
		public TmplStringContext tmplString() {
			return getRuleContext(TmplStringContext.class,0);
		}
		public TmplStringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplStringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplStringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplStringValueContext tmplStringValue() throws RecognitionException {
		TmplStringValueContext _localctx = new TmplStringValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tmplStringValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			((TmplStringValueContext)_localctx).value = tmplString();
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
	public static class TmplNumberValueContext extends ParserRuleContext {
		public Token value;
		public TerminalNode NUMBER() { return getToken(TLangTmplParser.NUMBER, 0); }
		public TmplNumberValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplNumberValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplNumberValueContext tmplNumberValue() throws RecognitionException {
		TmplNumberValueContext _localctx = new TmplNumberValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tmplNumberValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			((TmplNumberValueContext)_localctx).value = match(NUMBER);
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
	public static class TmplTextValueContext extends ParserRuleContext {
		public TmplTextContext value;
		public TmplTextContext tmplText() {
			return getRuleContext(TmplTextContext.class,0);
		}
		public TmplTextValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplTextValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplTextValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplTextValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplTextValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplTextValueContext tmplTextValue() throws RecognitionException {
		TmplTextValueContext _localctx = new TmplTextValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tmplTextValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			((TmplTextValueContext)_localctx).value = tmplText();
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
	public static class TmplBoolValueContext extends ParserRuleContext {
		public Token value;
		public TerminalNode True() { return getToken(TLangTmplParser.True, 0); }
		public TerminalNode False() { return getToken(TLangTmplParser.False, 0); }
		public TmplBoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplBoolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplBoolValueContext tmplBoolValue() throws RecognitionException {
		TmplBoolValueContext _localctx = new TmplBoolValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tmplBoolValue);
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				((TmplBoolValueContext)_localctx).value = match(True);
				}
				break;
			case False:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				match(False);
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
	public static class TmplArrayValueContext extends ParserRuleContext {
		public TmplInclSetAttributeContext tmplInclSetAttribute;
		public List<TmplInclSetAttributeContext> params = new ArrayList<TmplInclSetAttributeContext>();
		public TerminalNode LSQUARE() { return getToken(TLangTmplParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TLangTmplParser.RSQUARE, 0); }
		public List<TmplInclSetAttributeContext> tmplInclSetAttribute() {
			return getRuleContexts(TmplInclSetAttributeContext.class);
		}
		public TmplInclSetAttributeContext tmplInclSetAttribute(int i) {
			return getRuleContext(TmplInclSetAttributeContext.class,i);
		}
		public TmplArrayValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplArrayValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplArrayValueContext tmplArrayValue() throws RecognitionException {
		TmplArrayValueContext _localctx = new TmplArrayValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tmplArrayValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(LSQUARE);
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2274342015036643344L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 181L) != 0)) {
				{
				setState(601);
				((TmplArrayValueContext)_localctx).tmplInclSetAttribute = tmplInclSetAttribute();
				((TmplArrayValueContext)_localctx).params.add(((TmplArrayValueContext)_localctx).tmplInclSetAttribute);
				}
			}

			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(604);
				match(T__0);
				setState(605);
				((TmplArrayValueContext)_localctx).tmplInclSetAttribute = tmplInclSetAttribute();
				((TmplArrayValueContext)_localctx).params.add(((TmplArrayValueContext)_localctx).tmplInclSetAttribute);
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(611);
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
	public static class TmplInclAttributeContext extends ParserRuleContext {
		public TmplIncludeContext tmplInclude() {
			return getRuleContext(TmplIncludeContext.class,0);
		}
		public TmplAttributeContext tmplAttribute() {
			return getRuleContext(TmplAttributeContext.class,0);
		}
		public TmplInclAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplInclAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplInclAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplInclAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplInclAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplInclAttributeContext tmplInclAttribute() throws RecognitionException {
		TmplInclAttributeContext _localctx = new TmplInclAttributeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tmplInclAttribute);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				tmplInclude();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				tmplAttribute();
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
	public static class TmplAttributeContext extends ParserRuleContext {
		public TmplIDContext attr;
		public TmplTypeContext type;
		public TmplOperationContext value;
		public TmplOperationContext tmplOperation() {
			return getRuleContext(TmplOperationContext.class,0);
		}
		public TmplIDContext tmplID() {
			return getRuleContext(TmplIDContext.class,0);
		}
		public TmplTypeContext tmplType() {
			return getRuleContext(TmplTypeContext.class,0);
		}
		public TmplAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplAttributeContext tmplAttribute() throws RecognitionException {
		TmplAttributeContext _localctx = new TmplAttributeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tmplAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(617);
				((TmplAttributeContext)_localctx).attr = tmplID();
				}
				break;
			}
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(620);
				match(T__5);
				setState(621);
				((TmplAttributeContext)_localctx).type = tmplType();
				}
			}

			setState(624);
			((TmplAttributeContext)_localctx).value = tmplOperation();
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
	public static class TmplMultiValueContext extends ParserRuleContext {
		public TmplValueTypeContext tmplValueType;
		public List<TmplValueTypeContext> values = new ArrayList<TmplValueTypeContext>();
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public List<TmplValueTypeContext> tmplValueType() {
			return getRuleContexts(TmplValueTypeContext.class);
		}
		public TmplValueTypeContext tmplValueType(int i) {
			return getRuleContext(TmplValueTypeContext.class,i);
		}
		public TmplMultiValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplMultiValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplMultiValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplMultiValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplMultiValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplMultiValueContext tmplMultiValue() throws RecognitionException {
		TmplMultiValueContext _localctx = new TmplMultiValueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tmplMultiValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(LPARENT);
			{
			setState(627);
			((TmplMultiValueContext)_localctx).tmplValueType = tmplValueType();
			((TmplMultiValueContext)_localctx).values.add(((TmplMultiValueContext)_localctx).tmplValueType);
			}
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(628);
				match(T__0);
				setState(629);
				((TmplMultiValueContext)_localctx).tmplValueType = tmplValueType();
				((TmplMultiValueContext)_localctx).values.add(((TmplMultiValueContext)_localctx).tmplValueType);
				}
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(635);
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
	public static class TmplEntityValueContext extends ParserRuleContext {
		public TmplIDContext name;
		public TmplInclAttributeContext tmplInclAttribute;
		public List<TmplInclAttributeContext> params = new ArrayList<TmplInclAttributeContext>();
		public List<TmplInclAttributeContext> attrs = new ArrayList<TmplInclAttributeContext>();
		public TerminalNode New() { return getToken(TLangTmplParser.New, 0); }
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public TerminalNode LBRACE() { return getToken(TLangTmplParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
		public TmplIDContext tmplID() {
			return getRuleContext(TmplIDContext.class,0);
		}
		public List<TmplInclAttributeContext> tmplInclAttribute() {
			return getRuleContexts(TmplInclAttributeContext.class);
		}
		public TmplInclAttributeContext tmplInclAttribute(int i) {
			return getRuleContext(TmplInclAttributeContext.class,i);
		}
		public TmplEntityValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplEntityValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplEntityValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplEntityValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplEntityValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplEntityValueContext tmplEntityValue() throws RecognitionException {
		TmplEntityValueContext _localctx = new TmplEntityValueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_tmplEntityValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(New);
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(638);
				((TmplEntityValueContext)_localctx).name = tmplID();
				}
				break;
			}
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(641);
				match(LPARENT);
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2274342015036643408L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 181L) != 0)) {
					{
					{
					setState(642);
					((TmplEntityValueContext)_localctx).tmplInclAttribute = tmplInclAttribute();
					((TmplEntityValueContext)_localctx).params.add(((TmplEntityValueContext)_localctx).tmplInclAttribute);
					}
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(643);
						match(T__0);
						setState(644);
						((TmplEntityValueContext)_localctx).tmplInclAttribute = tmplInclAttribute();
						((TmplEntityValueContext)_localctx).params.add(((TmplEntityValueContext)_localctx).tmplInclAttribute);
						}
						}
						setState(649);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(652);
				match(RPARENT);
				}
				break;
			}
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(655);
				match(LBRACE);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2274342015036643408L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 181L) != 0)) {
					{
					{
					setState(656);
					((TmplEntityValueContext)_localctx).tmplInclAttribute = tmplInclAttribute();
					((TmplEntityValueContext)_localctx).attrs.add(((TmplEntityValueContext)_localctx).tmplInclAttribute);
					}
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(657);
						match(T__0);
						setState(658);
						((TmplEntityValueContext)_localctx).tmplInclAttribute = tmplInclAttribute();
						((TmplEntityValueContext)_localctx).attrs.add(((TmplEntityValueContext)_localctx).tmplInclAttribute);
						}
						}
						setState(663);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(666);
				match(RBRACE);
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
	public static class TmplOperationContext extends ParserRuleContext {
		public TmplExpressionContext content;
		public OperatorContext op;
		public TmplOperationContext next;
		public TmplOperationContext innerBlock;
		public TmplCallObjContext combine;
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public TmplExpressionContext tmplExpression() {
			return getRuleContext(TmplExpressionContext.class,0);
		}
		public List<TmplOperationContext> tmplOperation() {
			return getRuleContexts(TmplOperationContext.class);
		}
		public TmplOperationContext tmplOperation(int i) {
			return getRuleContext(TmplOperationContext.class,i);
		}
		public TmplCallObjContext tmplCallObj() {
			return getRuleContext(TmplCallObjContext.class,0);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public TmplOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplOperationContext tmplOperation() throws RecognitionException {
		TmplOperationContext _localctx = new TmplOperationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_tmplOperation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(669);
				((TmplOperationContext)_localctx).content = tmplExpression();
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(670);
						((TmplOperationContext)_localctx).op = operator();
						setState(671);
						((TmplOperationContext)_localctx).next = tmplOperation();
						}
						} 
					}
					setState(677);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(678);
				match(LPARENT);
				setState(679);
				((TmplOperationContext)_localctx).content = tmplExpression();
				setState(680);
				match(RPARENT);
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(681);
						((TmplOperationContext)_localctx).op = operator();
						setState(682);
						((TmplOperationContext)_localctx).next = tmplOperation();
						}
						} 
					}
					setState(688);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(689);
				match(LPARENT);
				setState(690);
				((TmplOperationContext)_localctx).content = tmplExpression();
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536609152L) != 0)) {
					{
					{
					setState(691);
					((TmplOperationContext)_localctx).op = operator();
					setState(692);
					((TmplOperationContext)_localctx).next = tmplOperation();
					}
					}
					setState(698);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(699);
				match(RPARENT);
				}
				break;
			case 4:
				{
				setState(701);
				match(LPARENT);
				setState(702);
				((TmplOperationContext)_localctx).innerBlock = tmplOperation();
				setState(703);
				match(RPARENT);
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(704);
						((TmplOperationContext)_localctx).op = operator();
						setState(705);
						((TmplOperationContext)_localctx).next = tmplOperation();
						}
						} 
					}
					setState(711);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				}
				break;
			}
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(714);
				match(T__2);
				setState(715);
				((TmplOperationContext)_localctx).combine = tmplCallObj();
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
	public static class TmplIncludeContext extends ParserRuleContext {
		public CallObjContext callObj;
		public List<CallObjContext> calls = new ArrayList<CallObjContext>();
		public List<CallObjContext> callObj() {
			return getRuleContexts(CallObjContext.class);
		}
		public CallObjContext callObj(int i) {
			return getRuleContext(CallObjContext.class,i);
		}
		public TmplIncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplInclude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplIncludeContext tmplInclude() throws RecognitionException {
		TmplIncludeContext _localctx = new TmplIncludeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_tmplInclude);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(T__11);
			{
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1152921504607109121L) != 0)) {
				{
				{
				setState(719);
				((TmplIncludeContext)_localctx).callObj = callObj();
				((TmplIncludeContext)_localctx).calls.add(((TmplIncludeContext)_localctx).callObj);
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(725);
			match(T__12);
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
	public static class TmplReturnContext extends ParserRuleContext {
		public TmplOperationContext call;
		public TerminalNode Return() { return getToken(TLangTmplParser.Return, 0); }
		public TmplOperationContext tmplOperation() {
			return getRuleContext(TmplOperationContext.class,0);
		}
		public TmplReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplReturnContext tmplReturn() throws RecognitionException {
		TmplReturnContext _localctx = new TmplReturnContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_tmplReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(Return);
			setState(728);
			((TmplReturnContext)_localctx).call = tmplOperation();
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
	public static class TmplAffectContext extends ParserRuleContext {
		public TmplCallObjContext variable;
		public TmplOperationContext value;
		public TmplCallObjContext tmplCallObj() {
			return getRuleContext(TmplCallObjContext.class,0);
		}
		public TmplOperationContext tmplOperation() {
			return getRuleContext(TmplOperationContext.class,0);
		}
		public TmplAffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplAffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplAffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplAffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplAffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplAffectContext tmplAffect() throws RecognitionException {
		TmplAffectContext _localctx = new TmplAffectContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tmplAffect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			((TmplAffectContext)_localctx).variable = tmplCallObj();
			setState(731);
			match(T__4);
			setState(732);
			((TmplAffectContext)_localctx).value = tmplOperation();
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
	public static class TmplCastContext extends ParserRuleContext {
		public TmplOperationContext toCast;
		public TmplTypeContext type;
		public TmplCallObjContext combine;
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode As() { return getToken(TLangTmplParser.As, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public TmplOperationContext tmplOperation() {
			return getRuleContext(TmplOperationContext.class,0);
		}
		public TmplTypeContext tmplType() {
			return getRuleContext(TmplTypeContext.class,0);
		}
		public TmplCallObjContext tmplCallObj() {
			return getRuleContext(TmplCallObjContext.class,0);
		}
		public TmplCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplCastContext tmplCast() throws RecognitionException {
		TmplCastContext _localctx = new TmplCastContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_tmplCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(LPARENT);
			setState(735);
			((TmplCastContext)_localctx).toCast = tmplOperation();
			setState(736);
			match(As);
			setState(737);
			((TmplCastContext)_localctx).type = tmplType();
			setState(738);
			match(RPARENT);
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(739);
				match(T__2);
				setState(740);
				((TmplCastContext)_localctx).combine = tmplCallObj();
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
	public static class TmplIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLangTmplParser.ID, 0); }
		public TmplIntprIDContext tmplIntprID() {
			return getRuleContext(TmplIntprIDContext.class,0);
		}
		public TerminalNode ESCAPED_ID() { return getToken(TLangTmplParser.ESCAPED_ID, 0); }
		public TmplIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplIDContext tmplID() throws RecognitionException {
		TmplIDContext _localctx = new TmplIDContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tmplID);
		try {
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				tmplIntprID();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(745);
				match(ESCAPED_ID);
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
	public static class TmplIntprIDContext extends ParserRuleContext {
		public Token pre;
		public Token pos;
		public TerminalNode INTEPRETED() { return getToken(TLangTmplParser.INTEPRETED, 0); }
		public CallObjContext callObj() {
			return getRuleContext(CallObjContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(TLangTmplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLangTmplParser.ID, i);
		}
		public TmplIntprIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplIntprID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplIntprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplIntprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplIntprID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplIntprIDContext tmplIntprID() throws RecognitionException {
		TmplIntprIDContext _localctx = new TmplIntprIDContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_tmplIntprID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(748);
				((TmplIntprIDContext)_localctx).pre = match(ID);
				}
			}

			setState(751);
			match(INTEPRETED);
			setState(752);
			callObj();
			setState(753);
			match(RBRACE);
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(754);
				((TmplIntprIDContext)_localctx).pos = match(ID);
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
	public static class TmplStringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TLangTmplParser.STRING, 0); }
		public TmplIntprStringContext tmplIntprString() {
			return getRuleContext(TmplIntprStringContext.class,0);
		}
		public TmplStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplStringContext tmplString() throws RecognitionException {
		TmplStringContext _localctx = new TmplStringContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_tmplString);
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				match(STRING);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				tmplIntprString();
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
	public static class TmplIntprStringContext extends ParserRuleContext {
		public Token pre;
		public Token pos;
		public TerminalNode INTEPRETED() { return getToken(TLangTmplParser.INTEPRETED, 0); }
		public CallObjContext callObj() {
			return getRuleContext(CallObjContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
		public TmplIntprStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplIntprString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplIntprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplIntprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplIntprString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplIntprStringContext tmplIntprString() throws RecognitionException {
		TmplIntprStringContext _localctx = new TmplIntprStringContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tmplIntprString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(T__13);
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(762);
				((TmplIntprStringContext)_localctx).pre = matchWildcard();
				}
				break;
			}
			setState(765);
			match(INTEPRETED);
			setState(766);
			callObj();
			setState(767);
			match(RBRACE);
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(768);
				((TmplIntprStringContext)_localctx).pos = matchWildcard();
				}
				break;
			}
			setState(771);
			match(T__14);
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
	public static class TmplTextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TLangTmplParser.TEXT, 0); }
		public TmplIntprTextContext tmplIntprText() {
			return getRuleContext(TmplIntprTextContext.class,0);
		}
		public TmplTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplTextContext tmplText() throws RecognitionException {
		TmplTextContext _localctx = new TmplTextContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_tmplText);
		try {
			setState(775);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				match(TEXT);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				tmplIntprText();
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
	public static class TmplIntprTextContext extends ParserRuleContext {
		public Token pre;
		public Token pos;
		public TerminalNode INTEPRETED() { return getToken(TLangTmplParser.INTEPRETED, 0); }
		public CallObjContext callObj() {
			return getRuleContext(CallObjContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
		public TmplIntprTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplIntprText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplIntprText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplIntprText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplIntprText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplIntprTextContext tmplIntprText() throws RecognitionException {
		TmplIntprTextContext _localctx = new TmplIntprTextContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_tmplIntprText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(T__15);
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(778);
				((TmplIntprTextContext)_localctx).pre = matchWildcard();
				}
				break;
			}
			setState(781);
			match(INTEPRETED);
			setState(782);
			callObj();
			setState(783);
			match(RBRACE);
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(784);
				((TmplIntprTextContext)_localctx).pos = matchWildcard();
				}
				break;
			}
			setState(787);
			match(T__16);
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
	public static class TmplIdOrStringContext extends ParserRuleContext {
		public TmplIDContext tmplID() {
			return getRuleContext(TmplIDContext.class,0);
		}
		public TmplStringContext tmplString() {
			return getRuleContext(TmplStringContext.class,0);
		}
		public TmplIdOrStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplIdOrString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTmplIdOrString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTmplIdOrString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTmplIdOrString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplIdOrStringContext tmplIdOrString() throws RecognitionException {
		TmplIdOrStringContext _localctx = new TmplIdOrStringContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_tmplIdOrString);
		try {
			setState(791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEPRETED:
			case ESCAPED_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				tmplID();
				}
				break;
			case T__13:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				tmplString();
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
	public static class AssignVarContext extends ParserRuleContext {
		public Token name;
		public ValueTypeContext type;
		public OperationContext value;
		public TerminalNode Let() { return getToken(TLangTmplParser.Let, 0); }
		public TerminalNode ID() { return getToken(TLangTmplParser.ID, 0); }
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitAssignVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignVarContext assignVar() throws RecognitionException {
		AssignVarContext _localctx = new AssignVarContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_assignVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(Let);
			setState(794);
			((AssignVarContext)_localctx).name = match(ID);
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(795);
				match(T__5);
				setState(796);
				((AssignVarContext)_localctx).type = valueType();
				}
			}

			setState(799);
			match(T__4);
			setState(800);
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterValueType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitValueType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitValueType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueTypeContext valueType() throws RecognitionException {
		ValueTypeContext _localctx = new ValueTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_valueType);
		try {
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				objType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
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
		public List<TerminalNode> ID() { return getTokens(TLangTmplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLangTmplParser.ID, i);
		}
		public ObjTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterObjType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitObjType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitObjType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjTypeContext objType() throws RecognitionException {
		ObjTypeContext _localctx = new ObjTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_objType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(806);
				((ObjTypeContext)_localctx).exTpye = match(ID);
				setState(807);
				match(T__2);
				}
				break;
			}
			setState(810);
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
		public TerminalNode LSQUARE() { return getToken(TLangTmplParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TLangTmplParser.RSQUARE, 0); }
		public List<TerminalNode> ID() { return getTokens(TLangTmplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLangTmplParser.ID, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(812);
				((ArrayTypeContext)_localctx).exTpye = match(ID);
				setState(813);
				match(T__2);
				}
				break;
			}
			setState(816);
			((ArrayTypeContext)_localctx).type = match(ID);
			setState(817);
			match(LSQUARE);
			setState(818);
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
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_operation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(820);
				((OperationContext)_localctx).content = complexValueType();
				setState(826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(821);
						((OperationContext)_localctx).op = operator();
						setState(822);
						((OperationContext)_localctx).next = operation();
						}
						} 
					}
					setState(828);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(829);
				match(LPARENT);
				setState(830);
				((OperationContext)_localctx).content = complexValueType();
				setState(831);
				match(RPARENT);
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(832);
						((OperationContext)_localctx).op = operator();
						setState(833);
						((OperationContext)_localctx).next = operation();
						}
						} 
					}
					setState(839);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(840);
				match(LPARENT);
				setState(841);
				((OperationContext)_localctx).content = complexValueType();
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536609152L) != 0)) {
					{
					{
					setState(842);
					((OperationContext)_localctx).op = operator();
					setState(843);
					((OperationContext)_localctx).next = operation();
					}
					}
					setState(849);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(850);
				match(RPARENT);
				}
				break;
			case 4:
				{
				setState(852);
				match(LPARENT);
				setState(853);
				((OperationContext)_localctx).innerBlock = operation();
				setState(854);
				match(RPARENT);
				setState(860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(855);
						((OperationContext)_localctx).op = operator();
						setState(856);
						((OperationContext)_localctx).next = operation();
						}
						} 
					}
					setState(862);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 536609152L) != 0)) ) {
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterComplexValueType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitComplexValueType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitComplexValueType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexValueTypeContext complexValueType() throws RecognitionException {
		ComplexValueTypeContext _localctx = new ComplexValueTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_complexValueType);
		try {
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(867);
				callObj();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				primitiveValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(869);
				multiValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(870);
				lazyValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(871);
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterPrimitiveValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitPrimitiveValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitPrimitiveValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveValueContext primitiveValue() throws RecognitionException {
		PrimitiveValueContext _localctx = new PrimitiveValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_primitiveValue);
		try {
			setState(880);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				stringValue();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				numberValue();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(876);
				textValue();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(877);
				entityValue();
				}
				break;
			case True:
			case False:
				enterOuterAlt(_localctx, 5);
				{
				setState(878);
				boolValue();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 6);
				{
				setState(879);
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterLazyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitLazyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitLazyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LazyValueContext lazyValue() throws RecognitionException {
		LazyValueContext _localctx = new LazyValueContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_lazyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(T__10);
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
		public TerminalNode STRING() { return getToken(TLangTmplParser.STRING, 0); }
		public StringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringValueContext stringValue() throws RecognitionException {
		StringValueContext _localctx = new StringValueContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_stringValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
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
		public TerminalNode NUMBER() { return getToken(TLangTmplParser.NUMBER, 0); }
		public NumberValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberValueContext numberValue() throws RecognitionException {
		NumberValueContext _localctx = new NumberValueContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_numberValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
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
		public TerminalNode TEXT() { return getToken(TLangTmplParser.TEXT, 0); }
		public TextValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterTextValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitTextValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitTextValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextValueContext textValue() throws RecognitionException {
		TextValueContext _localctx = new TextValueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_textValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
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
		public TerminalNode True() { return getToken(TLangTmplParser.True, 0); }
		public TerminalNode False() { return getToken(TLangTmplParser.False, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
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
		public TerminalNode LSQUARE() { return getToken(TLangTmplParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TLangTmplParser.RSQUARE, 0); }
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValueContext arrayValue() throws RecognitionException {
		ArrayValueContext _localctx = new ArrayValueContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_arrayValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(LSQUARE);
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1201054275387260929L) != 0)) {
				{
				setState(893);
				((ArrayValueContext)_localctx).complexAttribute = complexAttribute();
				((ArrayValueContext)_localctx).params.add(((ArrayValueContext)_localctx).complexAttribute);
				}
			}

			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(896);
				match(T__0);
				setState(897);
				((ArrayValueContext)_localctx).complexAttribute = complexAttribute();
				((ArrayValueContext)_localctx).params.add(((ArrayValueContext)_localctx).complexAttribute);
				}
				}
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(903);
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterCallObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitCallObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitCallObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallObjContext callObj() throws RecognitionException {
		CallObjContext _localctx = new CallObjContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_callObj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			((CallObjContext)_localctx).callObjType = callObjType();
			((CallObjContext)_localctx).objs.add(((CallObjContext)_localctx).callObjType);
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(906);
				match(T__2);
				setState(907);
				((CallObjContext)_localctx).callObjType = callObjType();
				((CallObjContext)_localctx).objs.add(((CallObjContext)_localctx).callObjType);
				}
				}
				setState(912);
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterCallObjType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitCallObjType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitCallObjType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallObjTypeContext callObjType() throws RecognitionException {
		CallObjTypeContext _localctx = new CallObjTypeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_callObjType);
		int _la;
		try {
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(913);
				callArray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(914);
					((CallObjTypeContext)_localctx).ref = match(T__28);
					}
				}

				setState(917);
				callFunc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(918);
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
		public TerminalNode LSQUARE() { return getToken(TLangTmplParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(TLangTmplParser.RSQUARE, 0); }
		public TerminalNode ID() { return getToken(TLangTmplParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public CallArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterCallArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitCallArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitCallArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArrayContext callArray() throws RecognitionException {
		CallArrayContext _localctx = new CallArrayContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_callArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			((CallArrayContext)_localctx).name = match(ID);
			setState(922);
			match(LSQUARE);
			setState(923);
			((CallArrayContext)_localctx).elem = operation();
			setState(924);
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
		public TerminalNode ID() { return getToken(TLangTmplParser.ID, 0); }
		public CallFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterCallFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitCallFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitCallFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFuncContext callFunc() throws RecognitionException {
		CallFuncContext _localctx = new CallFuncContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_callFunc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(926);
				((CallFuncContext)_localctx).name = match(ID);
				}
				}
				break;
			case T__10:
				{
				setState(927);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(931); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(930);
					((CallFuncContext)_localctx).curryParams = curryParams();
					((CallFuncContext)_localctx).currying.add(((CallFuncContext)_localctx).curryParams);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(933); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterCurryParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitCurryParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitCurryParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurryParamsContext curryParams() throws RecognitionException {
		CurryParamsContext _localctx = new CurryParamsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_curryParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(LPARENT);
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1201054275387260929L) != 0)) {
				{
				setState(936);
				((CurryParamsContext)_localctx).setAttribute = setAttribute();
				((CurryParamsContext)_localctx).params.add(((CurryParamsContext)_localctx).setAttribute);
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(937);
					match(T__0);
					setState(938);
					((CurryParamsContext)_localctx).setAttribute = setAttribute();
					((CurryParamsContext)_localctx).params.add(((CurryParamsContext)_localctx).setAttribute);
					}
					}
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(946);
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
		public TerminalNode ID() { return getToken(TLangTmplParser.ID, 0); }
		public SetAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterSetAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitSetAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitSetAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetAttributeContext setAttribute() throws RecognitionException {
		SetAttributeContext _localctx = new SetAttributeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_setAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(948);
				((SetAttributeContext)_localctx).attr = match(ID);
				setState(949);
				match(T__4);
				}
				break;
			}
			setState(952);
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
		public TerminalNode ID() { return getToken(TLangTmplParser.ID, 0); }
		public CallVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterCallVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitCallVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitCallVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallVariableContext callVariable() throws RecognitionException {
		CallVariableContext _localctx = new CallVariableContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_callVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
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
		public TerminalNode LBRACE() { return getToken(TLangTmplParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterEntityValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitEntityValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitEntityValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityValueContext entityValue() throws RecognitionException {
		EntityValueContext _localctx = new EntityValueContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_entityValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(LBRACE);
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1201054275387260929L) != 0)) {
				{
				{
				setState(957);
				((EntityValueContext)_localctx).complexAttribute = complexAttribute();
				((EntityValueContext)_localctx).attrs.add(((EntityValueContext)_localctx).complexAttribute);
				}
				}
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(963);
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
		public TerminalNode Impl() { return getToken(TLangTmplParser.Impl, 0); }
		public TerminalNode LBRACE() { return getToken(TLangTmplParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(TLangTmplParser.ID, 0); }
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitImpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitImpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplContext impl() throws RecognitionException {
		ImplContext _localctx = new ImplContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_impl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(Impl);
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(966);
				match(T__5);
				setState(967);
				((ImplContext)_localctx).type = match(ID);
				}
			}

			setState(970);
			match(LBRACE);
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1201054275387260929L) != 0)) {
				{
				setState(971);
				((ImplContext)_localctx).complexAttribute = complexAttribute();
				((ImplContext)_localctx).attrs.add(((ImplContext)_localctx).complexAttribute);
				}
			}

			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(974);
				match(T__0);
				setState(975);
				((ImplContext)_localctx).complexAttribute = complexAttribute();
				((ImplContext)_localctx).attrs.add(((ImplContext)_localctx).complexAttribute);
				}
				}
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(981);
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
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterMultiValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitMultiValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitMultiValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiValueContext multiValue() throws RecognitionException {
		MultiValueContext _localctx = new MultiValueContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_multiValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(LPARENT);
			{
			setState(984);
			((MultiValueContext)_localctx).operation = operation();
			((MultiValueContext)_localctx).values.add(((MultiValueContext)_localctx).operation);
			}
			setState(987); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(985);
				match(T__0);
				setState(986);
				((MultiValueContext)_localctx).operation = operation();
				((MultiValueContext)_localctx).values.add(((MultiValueContext)_localctx).operation);
				}
				}
				setState(989); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(991);
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
		public TerminalNode ID() { return getToken(TLangTmplParser.ID, 0); }
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public ComplexAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterComplexAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitComplexAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitComplexAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexAttributeContext complexAttribute() throws RecognitionException {
		ComplexAttributeContext _localctx = new ComplexAttributeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_complexAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				{
				setState(993);
				((ComplexAttributeContext)_localctx).attr = match(ID);
				}
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(994);
					match(T__5);
					setState(995);
					((ComplexAttributeContext)_localctx).type = valueType();
					}
				}

				setState(998);
				match(T__4);
				}
				break;
			}
			setState(1001);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HelperBlockContext extends ParserRuleContext {
		public HelperFuncContext helperFunc;
		public List<HelperFuncContext> helperFuncs = new ArrayList<HelperFuncContext>();
		public TerminalNode Helper() { return getToken(TLangTmplParser.Helper, 0); }
		public TerminalNode LBRACE() { return getToken(TLangTmplParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterHelperBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitHelperBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitHelperBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperBlockContext helperBlock() throws RecognitionException {
		HelperBlockContext _localctx = new HelperBlockContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_helperBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(Helper);
			setState(1004);
			match(LBRACE);
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Func) {
				{
				{
				setState(1005);
				((HelperBlockContext)_localctx).helperFunc = helperFunc();
				((HelperBlockContext)_localctx).helperFuncs.add(((HelperBlockContext)_localctx).helperFunc);
				}
				}
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1011);
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
		public TerminalNode Func() { return getToken(TLangTmplParser.Func, 0); }
		public TerminalNode LBRACE() { return getToken(TLangTmplParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(TLangTmplParser.ID, 0); }
		public HelperContentContext helperContent() {
			return getRuleContext(HelperContentContext.class,0);
		}
		public List<TerminalNode> LPARENT() { return getTokens(TLangTmplParser.LPARENT); }
		public TerminalNode LPARENT(int i) {
			return getToken(TLangTmplParser.LPARENT, i);
		}
		public List<TerminalNode> RPARENT() { return getTokens(TLangTmplParser.RPARENT); }
		public TerminalNode RPARENT(int i) {
			return getToken(TLangTmplParser.RPARENT, i);
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterHelperFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitHelperFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitHelperFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperFuncContext helperFunc() throws RecognitionException {
		HelperFuncContext _localctx = new HelperFuncContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_helperFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			match(Func);
			setState(1014);
			((HelperFuncContext)_localctx).name = match(ID);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPARENT) {
				{
				{
				setState(1015);
				match(LPARENT);
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENT || _la==ID) {
					{
					setState(1016);
					((HelperFuncContext)_localctx).helperCurrying = helperCurrying();
					((HelperFuncContext)_localctx).currying.add(((HelperFuncContext)_localctx).helperCurrying);
					}
				}

				setState(1019);
				match(RPARENT);
				}
				}
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1025);
				match(T__5);
				setState(1026);
				((HelperFuncContext)_localctx).helperParamType = helperParamType();
				((HelperFuncContext)_localctx).retVals.add(((HelperFuncContext)_localctx).helperParamType);
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(1027);
					match(T__0);
					setState(1028);
					((HelperFuncContext)_localctx).helperParamType = helperParamType();
					((HelperFuncContext)_localctx).retVals.add(((HelperFuncContext)_localctx).helperParamType);
					}
					}
					setState(1033);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1036);
			match(LBRACE);
			setState(1037);
			((HelperFuncContext)_localctx).body = helperContent();
			setState(1038);
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterHelperCurrying(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitHelperCurrying(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitHelperCurrying(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperCurryingContext helperCurrying() throws RecognitionException {
		HelperCurryingContext _localctx = new HelperCurryingContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_helperCurrying);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			((HelperCurryingContext)_localctx).helperParam = helperParam();
			((HelperCurryingContext)_localctx).params.add(((HelperCurryingContext)_localctx).helperParam);
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(1041);
				match(T__0);
				setState(1042);
				((HelperCurryingContext)_localctx).helperParam = helperParam();
				((HelperCurryingContext)_localctx).params.add(((HelperCurryingContext)_localctx).helperParam);
				}
				}
				setState(1047);
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
		public TerminalNode ID() { return getToken(TLangTmplParser.ID, 0); }
		public HelperParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterHelperParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitHelperParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitHelperParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperParamContext helperParam() throws RecognitionException {
		HelperParamContext _localctx = new HelperParamContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_helperParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1048);
				((HelperParamContext)_localctx).param = match(ID);
				setState(1049);
				match(T__5);
				}
				break;
			}
			setState(1052);
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterHelperParamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitHelperParamType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitHelperParamType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperParamTypeContext helperParamType() throws RecognitionException {
		HelperParamTypeContext _localctx = new HelperParamTypeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_helperParamType);
		try {
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				objType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1056);
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
		public List<TerminalNode> RPARENT() { return getTokens(TLangTmplParser.RPARENT); }
		public TerminalNode RPARENT(int i) {
			return getToken(TLangTmplParser.RPARENT, i);
		}
		public List<TerminalNode> LPARENT() { return getTokens(TLangTmplParser.LPARENT); }
		public TerminalNode LPARENT(int i) {
			return getToken(TLangTmplParser.LPARENT, i);
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterHelperFuncType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitHelperFuncType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitHelperFuncType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperFuncTypeContext helperFuncType() throws RecognitionException {
		HelperFuncTypeContext _localctx = new HelperFuncTypeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_helperFuncType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			((HelperFuncTypeContext)_localctx).type = match(LPARENT);
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPARENT || _la==ID) {
				{
				setState(1060);
				((HelperFuncTypeContext)_localctx).helperCurrying = helperCurrying();
				((HelperFuncTypeContext)_localctx).currying.add(((HelperFuncTypeContext)_localctx).helperCurrying);
				}
			}

			setState(1063);
			match(RPARENT);
			setState(1070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPARENT) {
				{
				{
				setState(1064);
				match(LPARENT);
				setState(1065);
				((HelperFuncTypeContext)_localctx).helperCurrying = helperCurrying();
				((HelperFuncTypeContext)_localctx).currying.add(((HelperFuncTypeContext)_localctx).helperCurrying);
				setState(1066);
				match(RPARENT);
				}
				}
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1073);
			match(T__8);
			setState(1074);
			((HelperFuncTypeContext)_localctx).helperParamType = helperParamType();
			((HelperFuncTypeContext)_localctx).retVals.add(((HelperFuncTypeContext)_localctx).helperParamType);
			setState(1079);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1075);
					match(T__0);
					setState(1076);
					((HelperFuncTypeContext)_localctx).helperParamType = helperParamType();
					((HelperFuncTypeContext)_localctx).retVals.add(((HelperFuncTypeContext)_localctx).helperParamType);
					}
					} 
				}
				setState(1081);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterHelperContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitHelperContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitHelperContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperContentContext helperContent() throws RecognitionException {
		HelperContentContext _localctx = new HelperContentContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_helperContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1201054561002586113L) != 0)) {
				{
				{
				setState(1082);
				((HelperContentContext)_localctx).helperStatement = helperStatement();
				((HelperContentContext)_localctx).content.add(((HelperContentContext)_localctx).helperStatement);
				}
				}
				setState(1087);
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterHelperStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitHelperStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitHelperStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperStatementContext helperStatement() throws RecognitionException {
		HelperStatementContext _localctx = new HelperStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_helperStatement);
		try {
			setState(1092);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Let:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				assignVar();
				}
				break;
			case T__10:
			case T__28:
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
				setState(1089);
				operation();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(1090);
				helperIf();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(1091);
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
		public TerminalNode If() { return getToken(TLangTmplParser.If, 0); }
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public TerminalNode LBRACE() { return getToken(TLangTmplParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
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
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterHelperIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitHelperIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitHelperIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperIfContext helperIf() throws RecognitionException {
		HelperIfContext _localctx = new HelperIfContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_helperIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(If);
			setState(1095);
			match(LPARENT);
			setState(1096);
			((HelperIfContext)_localctx).cond = operation();
			setState(1097);
			match(RPARENT);
			setState(1098);
			match(LBRACE);
			setState(1099);
			((HelperIfContext)_localctx).body = helperContent();
			setState(1100);
			match(RBRACE);
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(1101);
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
		public TerminalNode Else() { return getToken(TLangTmplParser.Else, 0); }
		public TerminalNode LBRACE() { return getToken(TLangTmplParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
		public HelperContentContext helperContent() {
			return getRuleContext(HelperContentContext.class,0);
		}
		public HelperElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterHelperElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitHelperElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitHelperElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperElseContext helperElse() throws RecognitionException {
		HelperElseContext _localctx = new HelperElseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_helperElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			match(Else);
			setState(1105);
			match(LBRACE);
			setState(1106);
			((HelperElseContext)_localctx).body = helperContent();
			setState(1107);
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
		public TerminalNode For() { return getToken(TLangTmplParser.For, 0); }
		public TerminalNode LPARENT() { return getToken(TLangTmplParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(TLangTmplParser.RPARENT, 0); }
		public TerminalNode LBRACE() { return getToken(TLangTmplParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLangTmplParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(TLangTmplParser.ID, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public HelperContentContext helperContent() {
			return getRuleContext(HelperContentContext.class,0);
		}
		public TerminalNode In() { return getToken(TLangTmplParser.In, 0); }
		public TerminalNode To() { return getToken(TLangTmplParser.To, 0); }
		public TerminalNode Until() { return getToken(TLangTmplParser.Until, 0); }
		public HelperForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helperFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).enterHelperFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLangTmplListener ) ((TLangTmplListener)listener).exitHelperFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLangTmplVisitor ) return ((TLangTmplVisitor<? extends T>)visitor).visitHelperFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelperForContext helperFor() throws RecognitionException {
		HelperForContext _localctx = new HelperForContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_helperFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(For);
			setState(1110);
			match(LPARENT);
			setState(1111);
			((HelperForContext)_localctx).var = match(ID);
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 1201054275387260929L) != 0)) {
				{
				setState(1112);
				((HelperForContext)_localctx).start = operation();
				}
			}

			setState(1115);
			((HelperForContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0)) ) {
				((HelperForContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1116);
			((HelperForContext)_localctx).array = operation();
			setState(1117);
			match(RPARENT);
			setState(1118);
			match(LBRACE);
			setState(1119);
			((HelperForContext)_localctx).body = helperContent();
			setState(1120);
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

	public static final String _serializedATN =
		"\u0004\u0001H\u0463\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00ca\b\u0000\n"+
		"\u0000\f\u0000\u00cd\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00d1"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u00d7"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u00db\b\u0002\u0001\u0002"+
		"\u0005\u0002\u00de\b\u0002\n\u0002\f\u0002\u00e1\t\u0002\u0001\u0002\u0005"+
		"\u0002\u00e4\b\u0002\n\u0002\f\u0002\u00e7\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00f5\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00fb\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0101\b\u0006"+
		"\n\u0006\f\u0006\u0104\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u010a\b\u0007\n\u0007\f\u0007\u010d\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0111\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u0119\b\b\n\b\f\b\u011c\t\b\u0001\b\u0001\b\u0003"+
		"\b\u0120\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u0125\b\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0004\n\u012b\b\n\u000b\n\f\n\u012c\u0001\n\u0001\n\u0003"+
		"\n\u0131\b\n\u0001\u000b\u0005\u000b\u0134\b\u000b\n\u000b\f\u000b\u0137"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0142\b\u000b\n"+
		"\u000b\f\u000b\u0145\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u014d\b\u000b\n\u000b\f\u000b"+
		"\u0150\t\u000b\u0003\u000b\u0152\b\u000b\u0003\u000b\u0154\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0158\b\u000b\n\u000b\f\u000b\u015b\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u0160\b\f\n\f\f\f\u0163\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u0169\b\f\n\f\f\f\u016c\t\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u0172\b\f\n\f\f\f\u0175\t\f\u0003\f\u0177"+
		"\b\f\u0001\f\u0001\f\u0003\f\u017b\b\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0184\b\u000e\n\u000e"+
		"\f\u000e\u0187\t\u000e\u0003\u000e\u0189\b\u000e\u0001\u000f\u0005\u000f"+
		"\u018c\b\u000f\n\u000f\f\u000f\u018f\t\u000f\u0001\u000f\u0003\u000f\u0192"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0197\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u019e\b\u0010\u0001\u0010\u0003\u0010\u01a1\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u01a5\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u01aa\b\u0011\n\u0011\f\u0011\u01ad\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u01b1\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u01b5\b"+
		"\u0013\n\u0013\f\u0013\u01b8\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u01ca\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01d2\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u01d7\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01de\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0005\u001b\u01f7\b\u001b"+
		"\n\u001b\f\u001b\u01fa\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0201\b\u001b\u0001\u001b\u0003\u001b\u0204"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0208\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u0210\b\u001d\n\u001d\f\u001d\u0213\t\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0218\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u021c"+
		"\b\u001f\u0001\u001f\u0004\u001f\u021f\b\u001f\u000b\u001f\f\u001f\u0220"+
		"\u0001 \u0001 \u0001 \u0001 \u0005 \u0227\b \n \f \u022a\t \u0003 \u022c"+
		"\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u0233\b!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0003\"\u0239\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0003%\u0245\b%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u024d\b&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001*\u0001*\u0003*\u0257\b*\u0001+\u0001+\u0003+\u025b\b+\u0001+\u0001"+
		"+\u0005+\u025f\b+\n+\f+\u0262\t+\u0001+\u0001+\u0001,\u0001,\u0003,\u0268"+
		"\b,\u0001-\u0003-\u026b\b-\u0001-\u0001-\u0003-\u026f\b-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0005.\u0277\b.\n.\f.\u027a\t.\u0001.\u0001"+
		".\u0001/\u0001/\u0003/\u0280\b/\u0001/\u0001/\u0001/\u0001/\u0005/\u0286"+
		"\b/\n/\f/\u0289\t/\u0003/\u028b\b/\u0001/\u0003/\u028e\b/\u0001/\u0001"+
		"/\u0001/\u0001/\u0005/\u0294\b/\n/\f/\u0297\t/\u0003/\u0299\b/\u0001/"+
		"\u0003/\u029c\b/\u00010\u00010\u00010\u00010\u00050\u02a2\b0\n0\f0\u02a5"+
		"\t0\u00010\u00010\u00010\u00010\u00010\u00010\u00050\u02ad\b0\n0\f0\u02b0"+
		"\t0\u00010\u00010\u00010\u00010\u00010\u00050\u02b7\b0\n0\f0\u02ba\t0"+
		"\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00050\u02c4"+
		"\b0\n0\f0\u02c7\t0\u00030\u02c9\b0\u00010\u00010\u00030\u02cd\b0\u0001"+
		"1\u00011\u00051\u02d1\b1\n1\f1\u02d4\t1\u00011\u00011\u00012\u00012\u0001"+
		"2\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00034\u02e6\b4\u00015\u00015\u00015\u00035\u02eb\b5\u00016\u0003"+
		"6\u02ee\b6\u00016\u00016\u00016\u00016\u00036\u02f4\b6\u00017\u00017\u0003"+
		"7\u02f8\b7\u00018\u00018\u00038\u02fc\b8\u00018\u00018\u00018\u00018\u0003"+
		"8\u0302\b8\u00018\u00018\u00019\u00019\u00039\u0308\b9\u0001:\u0001:\u0003"+
		":\u030c\b:\u0001:\u0001:\u0001:\u0001:\u0003:\u0312\b:\u0001:\u0001:\u0001"+
		";\u0001;\u0003;\u0318\b;\u0001<\u0001<\u0001<\u0001<\u0003<\u031e\b<\u0001"+
		"<\u0001<\u0001<\u0001=\u0001=\u0003=\u0325\b=\u0001>\u0001>\u0003>\u0329"+
		"\b>\u0001>\u0001>\u0001?\u0001?\u0003?\u032f\b?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001@\u0001@\u0001@\u0001@\u0005@\u0339\b@\n@\f@\u033c\t@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0005@\u0344\b@\n@\f@\u0347\t@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0005@\u034e\b@\n@\f@\u0351\t@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0005@\u035b\b@\n@\f@\u035e\t@\u0003"+
		"@\u0360\b@\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u0369"+
		"\bB\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u0371\bC\u0001D\u0001"+
		"D\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001H\u0001H\u0001I\u0001"+
		"I\u0003I\u037f\bI\u0001I\u0001I\u0005I\u0383\bI\nI\fI\u0386\tI\u0001I"+
		"\u0001I\u0001J\u0001J\u0001J\u0005J\u038d\bJ\nJ\fJ\u0390\tJ\u0001K\u0001"+
		"K\u0003K\u0394\bK\u0001K\u0001K\u0003K\u0398\bK\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001M\u0001M\u0003M\u03a1\bM\u0001M\u0004M\u03a4\bM\u000bM\f"+
		"M\u03a5\u0001N\u0001N\u0001N\u0001N\u0005N\u03ac\bN\nN\fN\u03af\tN\u0003"+
		"N\u03b1\bN\u0001N\u0001N\u0001O\u0001O\u0003O\u03b7\bO\u0001O\u0001O\u0001"+
		"P\u0001P\u0001Q\u0001Q\u0005Q\u03bf\bQ\nQ\fQ\u03c2\tQ\u0001Q\u0001Q\u0001"+
		"R\u0001R\u0001R\u0003R\u03c9\bR\u0001R\u0001R\u0003R\u03cd\bR\u0001R\u0001"+
		"R\u0005R\u03d1\bR\nR\fR\u03d4\tR\u0001R\u0001R\u0001S\u0001S\u0001S\u0001"+
		"S\u0004S\u03dc\bS\u000bS\fS\u03dd\u0001S\u0001S\u0001T\u0001T\u0001T\u0003"+
		"T\u03e5\bT\u0001T\u0003T\u03e8\bT\u0001T\u0001T\u0001U\u0001U\u0001U\u0005"+
		"U\u03ef\bU\nU\fU\u03f2\tU\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0003"+
		"V\u03fa\bV\u0001V\u0005V\u03fd\bV\nV\fV\u0400\tV\u0001V\u0001V\u0001V"+
		"\u0001V\u0005V\u0406\bV\nV\fV\u0409\tV\u0003V\u040b\bV\u0001V\u0001V\u0001"+
		"V\u0001V\u0001W\u0001W\u0001W\u0005W\u0414\bW\nW\fW\u0417\tW\u0001X\u0001"+
		"X\u0003X\u041b\bX\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0003Y\u0422\bY\u0001"+
		"Z\u0001Z\u0003Z\u0426\bZ\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0005Z\u042d"+
		"\bZ\nZ\fZ\u0430\tZ\u0001Z\u0001Z\u0001Z\u0001Z\u0005Z\u0436\bZ\nZ\fZ\u0439"+
		"\tZ\u0001[\u0005[\u043c\b[\n[\f[\u043f\t[\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0003\\\u0445\b\\\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]"+
		"\u0001]\u0003]\u044f\b]\u0001^\u0001^\u0001^\u0001^\u0001^\u0001_\u0001"+
		"_\u0001_\u0001_\u0003_\u045a\b_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0001_\u0000\u0000`\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u0000\u0003\u0001\u0000-/\u0002\u0000\u0007\b\u0012\u001c\u0001\u0000"+
		";<\u04ab\u0000\u00c0\u0001\u0000\u0000\u0000\u0002\u00d6\u0001\u0000\u0000"+
		"\u0000\u0004\u00d8\u0001\u0000\u0000\u0000\u0006\u00ea\u0001\u0000\u0000"+
		"\u0000\b\u00f4\u0001\u0000\u0000\u0000\n\u00fa\u0001\u0000\u0000\u0000"+
		"\f\u00fc\u0001\u0000\u0000\u0000\u000e\u0105\u0001\u0000\u0000\u0000\u0010"+
		"\u0112\u0001\u0000\u0000\u0000\u0012\u0124\u0001\u0000\u0000\u0000\u0014"+
		"\u0130\u0001\u0000\u0000\u0000\u0016\u0135\u0001\u0000\u0000\u0000\u0018"+
		"\u0161\u0001\u0000\u0000\u0000\u001a\u017c\u0001\u0000\u0000\u0000\u001c"+
		"\u0188\u0001\u0000\u0000\u0000\u001e\u018d\u0001\u0000\u0000\u0000 \u0198"+
		"\u0001\u0000\u0000\u0000\"\u01a6\u0001\u0000\u0000\u0000$\u01b0\u0001"+
		"\u0000\u0000\u0000&\u01b2\u0001\u0000\u0000\u0000(\u01c9\u0001\u0000\u0000"+
		"\u0000*\u01cb\u0001\u0000\u0000\u0000,\u01d3\u0001\u0000\u0000\u0000."+
		"\u01d8\u0001\u0000\u0000\u00000\u01e4\u0001\u0000\u0000\u00002\u01ea\u0001"+
		"\u0000\u0000\u00004\u01f1\u0001\u0000\u0000\u00006\u01f8\u0001\u0000\u0000"+
		"\u00008\u0209\u0001\u0000\u0000\u0000:\u020b\u0001\u0000\u0000\u0000<"+
		"\u0217\u0001\u0000\u0000\u0000>\u021b\u0001\u0000\u0000\u0000@\u0222\u0001"+
		"\u0000\u0000\u0000B\u0232\u0001\u0000\u0000\u0000D\u0238\u0001\u0000\u0000"+
		"\u0000F\u023a\u0001\u0000\u0000\u0000H\u023f\u0001\u0000\u0000\u0000J"+
		"\u0244\u0001\u0000\u0000\u0000L\u024c\u0001\u0000\u0000\u0000N\u024e\u0001"+
		"\u0000\u0000\u0000P\u0250\u0001\u0000\u0000\u0000R\u0252\u0001\u0000\u0000"+
		"\u0000T\u0256\u0001\u0000\u0000\u0000V\u0258\u0001\u0000\u0000\u0000X"+
		"\u0267\u0001\u0000\u0000\u0000Z\u026a\u0001\u0000\u0000\u0000\\\u0272"+
		"\u0001\u0000\u0000\u0000^\u027d\u0001\u0000\u0000\u0000`\u02c8\u0001\u0000"+
		"\u0000\u0000b\u02ce\u0001\u0000\u0000\u0000d\u02d7\u0001\u0000\u0000\u0000"+
		"f\u02da\u0001\u0000\u0000\u0000h\u02de\u0001\u0000\u0000\u0000j\u02ea"+
		"\u0001\u0000\u0000\u0000l\u02ed\u0001\u0000\u0000\u0000n\u02f7\u0001\u0000"+
		"\u0000\u0000p\u02f9\u0001\u0000\u0000\u0000r\u0307\u0001\u0000\u0000\u0000"+
		"t\u0309\u0001\u0000\u0000\u0000v\u0317\u0001\u0000\u0000\u0000x\u0319"+
		"\u0001\u0000\u0000\u0000z\u0324\u0001\u0000\u0000\u0000|\u0328\u0001\u0000"+
		"\u0000\u0000~\u032e\u0001\u0000\u0000\u0000\u0080\u035f\u0001\u0000\u0000"+
		"\u0000\u0082\u0361\u0001\u0000\u0000\u0000\u0084\u0368\u0001\u0000\u0000"+
		"\u0000\u0086\u0370\u0001\u0000\u0000\u0000\u0088\u0372\u0001\u0000\u0000"+
		"\u0000\u008a\u0374\u0001\u0000\u0000\u0000\u008c\u0376\u0001\u0000\u0000"+
		"\u0000\u008e\u0378\u0001\u0000\u0000\u0000\u0090\u037a\u0001\u0000\u0000"+
		"\u0000\u0092\u037c\u0001\u0000\u0000\u0000\u0094\u0389\u0001\u0000\u0000"+
		"\u0000\u0096\u0397\u0001\u0000\u0000\u0000\u0098\u0399\u0001\u0000\u0000"+
		"\u0000\u009a\u03a0\u0001\u0000\u0000\u0000\u009c\u03a7\u0001\u0000\u0000"+
		"\u0000\u009e\u03b6\u0001\u0000\u0000\u0000\u00a0\u03ba\u0001\u0000\u0000"+
		"\u0000\u00a2\u03bc\u0001\u0000\u0000\u0000\u00a4\u03c5\u0001\u0000\u0000"+
		"\u0000\u00a6\u03d7\u0001\u0000\u0000\u0000\u00a8\u03e7\u0001\u0000\u0000"+
		"\u0000\u00aa\u03eb\u0001\u0000\u0000\u0000\u00ac\u03f5\u0001\u0000\u0000"+
		"\u0000\u00ae\u0410\u0001\u0000\u0000\u0000\u00b0\u041a\u0001\u0000\u0000"+
		"\u0000\u00b2\u0421\u0001\u0000\u0000\u0000\u00b4\u0423\u0001\u0000\u0000"+
		"\u0000\u00b6\u043d\u0001\u0000\u0000\u0000\u00b8\u0444\u0001\u0000\u0000"+
		"\u0000\u00ba\u0446\u0001\u0000\u0000\u0000\u00bc\u0450\u0001\u0000\u0000"+
		"\u0000\u00be\u0455\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005%\u0000\u0000"+
		"\u00c1\u00c2\u0005B\u0000\u0000\u00c2\u00c3\u0003j5\u0000\u00c3\u00c4"+
		"\u0005C\u0000\u0000\u00c4\u00d0\u0003j5\u0000\u00c5\u00c6\u0005@\u0000"+
		"\u0000\u00c6\u00cb\u0003\u00b0X\u0000\u00c7\u00c8\u0005\u0001\u0000\u0000"+
		"\u00c8\u00ca\u0003\u00b0X\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005A\u0000\u0000\u00cf\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d0\u00c5\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0003\u0002\u0001\u0000\u00d3\u0001\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0003\u0004\u0002\u0000\u00d5\u00d7\u0003\u0006\u0003\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u0003"+
		"\u0001\u0000\u0000\u0000\u00d8\u00da\u0005>\u0000\u0000\u00d9\u00db\u0003"+
		"\f\u0006\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00df\u0001\u0000\u0000\u0000\u00dc\u00de\u0003\u000e"+
		"\u0007\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000"+
		"\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e5\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e4\u0003\n\u0005\u0000\u00e3\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005?\u0000\u0000"+
		"\u00e9\u0005\u0001\u0000\u0000\u0000\u00ea\u00eb\u00055\u0000\u0000\u00eb"+
		"\u00ec\u0005>\u0000\u0000\u00ec\u00ed\u0003\b\u0004\u0000\u00ed\u00ee"+
		"\u0005?\u0000\u0000\u00ee\u0007\u0001\u0000\u0000\u0000\u00ef\u00f5\u0003"+
		"\n\u0005\u0000\u00f0\u00f5\u0003Z-\u0000\u00f1\u00f2\u0005\u0002\u0000"+
		"\u0000\u00f2\u00f5\u0003B!\u0000\u00f3\u00f5\u0003\u001e\u000f\u0000\u00f4"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\t\u0001\u0000\u0000\u0000\u00f6\u00fb\u0003\u0016\u000b\u0000\u00f7\u00fb"+
		"\u0003\u0018\f\u0000\u00f8\u00fb\u0003(\u0014\u0000\u00f9\u00fb\u0003"+
		"`0\u0000\u00fa\u00f6\u0001\u0000\u0000\u0000\u00fa\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u000b\u0001\u0000\u0000\u0000\u00fc\u00fd\u00056\u0000\u0000"+
		"\u00fd\u0102\u0003j5\u0000\u00fe\u00ff\u0005\u0003\u0000\u0000\u00ff\u0101"+
		"\u0003j5\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103\r\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0005\'\u0000\u0000\u0106\u010b\u0003j5\u0000\u0107"+
		"\u0108\u0005\u0003\u0000\u0000\u0108\u010a\u0003j5\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0110\u0001"+
		"\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0005"+
		"=\u0000\u0000\u010f\u0111\u0003j5\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u000f\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005\u0004\u0000\u0000\u0113\u011f\u0003j5\u0000\u0114"+
		"\u0115\u0005@\u0000\u0000\u0115\u011a\u0003\u0012\t\u0000\u0116\u0117"+
		"\u0005\u0001\u0000\u0000\u0117\u0119\u0003\u0012\t\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0001"+
		"\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"A\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u0114\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0011\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0003j5\u0000\u0122\u0123\u0005\u0005\u0000\u0000"+
		"\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0121\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0003J%\u0000\u0127\u0013\u0001\u0000\u0000\u0000\u0128\u012a"+
		"\u0005B\u0000\u0000\u0129\u012b\u0003j5\u0000\u012a\u0129\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0005C\u0000\u0000\u012f\u0131\u0001\u0000\u0000"+
		"\u0000\u0130\u0128\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u0015\u0001\u0000\u0000\u0000\u0132\u0134\u0003\u0010\b\u0000"+
		"\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000"+
		"\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000"+
		"\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u00052\u0000\u0000\u0139\u013a\u0003\u0014\n\u0000\u013a"+
		"\u0153\u0003j5\u0000\u013b\u013c\u0005,\u0000\u0000\u013c\u013d\u0003"+
		"\u0014\n\u0000\u013d\u013e\u0003 \u0010\u0000\u013e\u0143\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0005\u0001\u0000\u0000\u0140\u0142\u0003 \u0010"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0145\u0001\u0000\u0000"+
		"\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000"+
		"\u0000\u0144\u0151\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0005H\u0000\u0000\u0147\u0148\u0003\u0014\n\u0000"+
		"\u0148\u0149\u0003 \u0010\u0000\u0149\u014e\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0005\u0001\u0000\u0000\u014b\u014d\u0003 \u0010\u0000\u014c\u014a"+
		"\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0152"+
		"\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0146"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0154"+
		"\u0001\u0000\u0000\u0000\u0153\u013b\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0159"+
		"\u0005>\u0000\u0000\u0156\u0158\u0003\n\u0005\u0000\u0157\u0156\u0001"+
		"\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001"+
		"\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0005"+
		"?\u0000\u0000\u015d\u0017\u0001\u0000\u0000\u0000\u015e\u0160\u0003\u0010"+
		"\b\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000"+
		"\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0005)\u0000\u0000\u0165\u0166\u0003\u0014\n\u0000"+
		"\u0166\u016a\u0003j5\u0000\u0167\u0169\u0003\u001a\r\u0000\u0168\u0167"+
		"\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168"+
		"\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u0176"+
		"\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0005\u0006\u0000\u0000\u016e\u0173\u0003 \u0010\u0000\u016f\u0170\u0005"+
		"\u0001\u0000\u0000\u0170\u0172\u0003 \u0010\u0000\u0171\u016f\u0001\u0000"+
		"\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000"+
		"\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u016d\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u017a\u0003\u0014\n\u0000\u0179\u017b\u0003&\u0013"+
		"\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b\u0019\u0001\u0000\u0000\u0000\u017c\u017d\u0005@\u0000\u0000"+
		"\u017d\u017e\u0003\u001c\u000e\u0000\u017e\u017f\u0005A\u0000\u0000\u017f"+
		"\u001b\u0001\u0000\u0000\u0000\u0180\u0185\u0003\u001e\u000f\u0000\u0181"+
		"\u0182\u0005\u0001\u0000\u0000\u0182\u0184\u0003\u001e\u000f\u0000\u0183"+
		"\u0181\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186"+
		"\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188"+
		"\u0180\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189"+
		"\u001d\u0001\u0000\u0000\u0000\u018a\u018c\u0003\u0010\b\u0000\u018b\u018a"+
		"\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018b"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0191"+
		"\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0192"+
		"\u0003j5\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0196\u0003j5\u0000"+
		"\u0194\u0195\u0005\u0006\u0000\u0000\u0195\u0197\u0003 \u0010\u0000\u0196"+
		"\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197"+
		"\u001f\u0001\u0000\u0000\u0000\u0198\u019d\u0003j5\u0000\u0199\u019a\u0005"+
		"\u0007\u0000\u0000\u019a\u019b\u0003\"\u0011\u0000\u019b\u019c\u0005\b"+
		"\u0000\u0000\u019c\u019e\u0001\u0000\u0000\u0000\u019d\u0199\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a0\u0001\u0000"+
		"\u0000\u0000\u019f\u01a1\u0003@ \u0000\u01a0\u019f\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0005B\u0000\u0000\u01a3\u01a5\u0005C\u0000\u0000\u01a4\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5!\u0001"+
		"\u0000\u0000\u0000\u01a6\u01ab\u0003 \u0010\u0000\u01a7\u01a8\u0005\u0001"+
		"\u0000\u0000\u01a8\u01aa\u0003 \u0010\u0000\u01a9\u01a7\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac#\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01b1\u0003(\u0014\u0000\u01af"+
		"\u01b1\u0003&\u0013\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01af"+
		"\u0001\u0000\u0000\u0000\u01b1%\u0001\u0000\u0000\u0000\u01b2\u01b6\u0005"+
		">\u0000\u0000\u01b3\u01b5\u0003(\u0014\u0000\u01b4\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005?\u0000\u0000"+
		"\u01ba\'\u0001\u0000\u0000\u0000\u01bb\u01ca\u00036\u001b\u0000\u01bc"+
		"\u01ca\u0003:\u001d\u0000\u01bd\u01ca\u0003J%\u0000\u01be\u01ca\u0003"+
		"\u0018\f\u0000\u01bf\u01ca\u0003*\u0015\u0000\u01c0\u01ca\u0003.\u0017"+
		"\u0000\u01c1\u01ca\u00030\u0018\u0000\u01c2\u01ca\u00032\u0019\u0000\u01c3"+
		"\u01ca\u0003b1\u0000\u01c4\u01ca\u0003d2\u0000\u01c5\u01ca\u0003f3\u0000"+
		"\u01c6\u01ca\u0003h4\u0000\u01c7\u01ca\u00034\u001a\u0000\u01c8\u01ca"+
		"\u0003L&\u0000\u01c9\u01bb\u0001\u0000\u0000\u0000\u01c9\u01bc\u0001\u0000"+
		"\u0000\u0000\u01c9\u01bd\u0001\u0000\u0000\u0000\u01c9\u01be\u0001\u0000"+
		"\u0000\u0000\u01c9\u01bf\u0001\u0000\u0000\u0000\u01c9\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c1\u0001\u0000\u0000\u0000\u01c9\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c3\u0001\u0000\u0000\u0000\u01c9\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c5\u0001\u0000\u0000\u0000\u01c9\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01c8\u0001\u0000"+
		"\u0000\u0000\u01ca)\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005*\u0000\u0000"+
		"\u01cc\u01cd\u0005@\u0000\u0000\u01cd\u01ce\u0003`0\u0000\u01ce\u01cf"+
		"\u0005A\u0000\u0000\u01cf\u01d1\u0003$\u0012\u0000\u01d0\u01d2\u0003,"+
		"\u0016\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d2+\u0001\u0000\u0000\u0000\u01d3\u01d6\u0005+\u0000\u0000"+
		"\u01d4\u01d7\u0003*\u0015\u0000\u01d5\u01d7\u0003$\u0012\u0000\u01d6\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7-\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d9\u0005,\u0000\u0000\u01d9\u01da\u0005@\u0000"+
		"\u0000\u01da\u01dd\u0003j5\u0000\u01db\u01dc\u0005\u0005\u0000\u0000\u01dc"+
		"\u01de\u0003`0\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e0\u0007"+
		"\u0000\u0000\u0000\u01e0\u01e1\u0003`0\u0000\u01e1\u01e2\u0005A\u0000"+
		"\u0000\u01e2\u01e3\u0003$\u0012\u0000\u01e3/\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e5\u00057\u0000\u0000\u01e5\u01e6\u0005@\u0000\u0000\u01e6\u01e7\u0003"+
		"`0\u0000\u01e7\u01e8\u0005A\u0000\u0000\u01e8\u01e9\u0003$\u0012\u0000"+
		"\u01e91\u0001\u0000\u0000\u0000\u01ea\u01eb\u00058\u0000\u0000\u01eb\u01ec"+
		"\u0003$\u0012\u0000\u01ec\u01ed\u00057\u0000\u0000\u01ed\u01ee\u0005@"+
		"\u0000\u0000\u01ee\u01ef\u0003`0\u0000\u01ef\u01f0\u0005A\u0000\u0000"+
		"\u01f03\u0001\u0000\u0000\u0000\u01f1\u01f2\u0003\u001a\r\u0000\u01f2"+
		"\u01f3\u0005\t\u0000\u0000\u01f3\u01f4\u0003$\u0012\u0000\u01f45\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f7\u0003\u0010\b\u0000\u01f6\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fb\u01fc\u00059\u0000"+
		"\u0000\u01fc\u01fd\u0003\u0014\n\u0000\u01fd\u0200\u0003j5\u0000\u01fe"+
		"\u01ff\u0005\u0006\u0000\u0000\u01ff\u0201\u0003 \u0010\u0000\u0200\u01fe"+
		"\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0203"+
		"\u0001\u0000\u0000\u0000\u0202\u0204\u00038\u001c\u0000\u0203\u0202\u0001"+
		"\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0207\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u0005\u0005\u0000\u0000\u0206\u0208\u0003"+
		"`0\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000"+
		"\u0000\u02087\u0001\u0000\u0000\u0000\u0209\u020a\u0005\n\u0000\u0000"+
		"\u020a9\u0001\u0000\u0000\u0000\u020b\u020c\u0003\u0014\n\u0000\u020c"+
		"\u0211\u0003<\u001e\u0000\u020d\u020e\u0005\u0003\u0000\u0000\u020e\u0210"+
		"\u0003<\u001e\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210\u0213\u0001"+
		"\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001"+
		"\u0000\u0000\u0000\u0212;\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000"+
		"\u0000\u0000\u0214\u0218\u0003F#\u0000\u0215\u0218\u0003>\u001f\u0000"+
		"\u0216\u0218\u0003H$\u0000\u0217\u0214\u0001\u0000\u0000\u0000\u0217\u0215"+
		"\u0001\u0000\u0000\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0218=\u0001"+
		"\u0000\u0000\u0000\u0219\u021c\u0003j5\u0000\u021a\u021c\u0005\u000b\u0000"+
		"\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021a\u0001\u0000\u0000"+
		"\u0000\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u021f\u0003@ \u0000\u021e"+
		"\u021d\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220"+
		"\u021e\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221"+
		"?\u0001\u0000\u0000\u0000\u0222\u022b\u0005@\u0000\u0000\u0223\u0228\u0003"+
		"D\"\u0000\u0224\u0225\u0005\u0001\u0000\u0000\u0225\u0227\u0003D\"\u0000"+
		"\u0226\u0224\u0001\u0000\u0000\u0000\u0227\u022a\u0001\u0000\u0000\u0000"+
		"\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000"+
		"\u0229\u022c\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000"+
		"\u022b\u0223\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000"+
		"\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e\u0005A\u0000\u0000\u022e"+
		"A\u0001\u0000\u0000\u0000\u022f\u0230\u0003v;\u0000\u0230\u0231\u0005"+
		"\u0006\u0000\u0000\u0231\u0233\u0001\u0000\u0000\u0000\u0232\u022f\u0001"+
		"\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0001"+
		"\u0000\u0000\u0000\u0234\u0235\u0003`0\u0000\u0235C\u0001\u0000\u0000"+
		"\u0000\u0236\u0239\u0003b1\u0000\u0237\u0239\u0003B!\u0000\u0238\u0236"+
		"\u0001\u0000\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239E\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0003j5\u0000\u023b\u023c\u0005B\u0000"+
		"\u0000\u023c\u023d\u0003`0\u0000\u023d\u023e\u0005C\u0000\u0000\u023e"+
		"G\u0001\u0000\u0000\u0000\u023f\u0240\u0003j5\u0000\u0240I\u0001\u0000"+
		"\u0000\u0000\u0241\u0245\u0003:\u001d\u0000\u0242\u0245\u0003L&\u0000"+
		"\u0243\u0245\u0003\\.\u0000\u0244\u0241\u0001\u0000\u0000\u0000\u0244"+
		"\u0242\u0001\u0000\u0000\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0245"+
		"K\u0001\u0000\u0000\u0000\u0246\u024d\u0003N\'\u0000\u0247\u024d\u0003"+
		"P(\u0000\u0248\u024d\u0003R)\u0000\u0249\u024d\u0003^/\u0000\u024a\u024d"+
		"\u0003T*\u0000\u024b\u024d\u0003V+\u0000\u024c\u0246\u0001\u0000\u0000"+
		"\u0000\u024c\u0247\u0001\u0000\u0000\u0000\u024c\u0248\u0001\u0000\u0000"+
		"\u0000\u024c\u0249\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000"+
		"\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024dM\u0001\u0000\u0000\u0000"+
		"\u024e\u024f\u0003n7\u0000\u024fO\u0001\u0000\u0000\u0000\u0250\u0251"+
		"\u0005!\u0000\u0000\u0251Q\u0001\u0000\u0000\u0000\u0252\u0253\u0003r"+
		"9\u0000\u0253S\u0001\u0000\u0000\u0000\u0254\u0257\u0005;\u0000\u0000"+
		"\u0255\u0257\u0005<\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256"+
		"\u0255\u0001\u0000\u0000\u0000\u0257U\u0001\u0000\u0000\u0000\u0258\u025a"+
		"\u0005B\u0000\u0000\u0259\u025b\u0003D\"\u0000\u025a\u0259\u0001\u0000"+
		"\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u0260\u0001\u0000"+
		"\u0000\u0000\u025c\u025d\u0005\u0001\u0000\u0000\u025d\u025f\u0003D\""+
		"\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025f\u0262\u0001\u0000\u0000"+
		"\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000"+
		"\u0000\u0261\u0263\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000"+
		"\u0000\u0263\u0264\u0005C\u0000\u0000\u0264W\u0001\u0000\u0000\u0000\u0265"+
		"\u0268\u0003b1\u0000\u0266\u0268\u0003Z-\u0000\u0267\u0265\u0001\u0000"+
		"\u0000\u0000\u0267\u0266\u0001\u0000\u0000\u0000\u0268Y\u0001\u0000\u0000"+
		"\u0000\u0269\u026b\u0003j5\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026a"+
		"\u026b\u0001\u0000\u0000\u0000\u026b\u026e\u0001\u0000\u0000\u0000\u026c"+
		"\u026d\u0005\u0006\u0000\u0000\u026d\u026f\u0003 \u0010\u0000\u026e\u026c"+
		"\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0270"+
		"\u0001\u0000\u0000\u0000\u0270\u0271\u0003`0\u0000\u0271[\u0001\u0000"+
		"\u0000\u0000\u0272\u0273\u0005@\u0000\u0000\u0273\u0278\u0003J%\u0000"+
		"\u0274\u0275\u0005\u0001\u0000\u0000\u0275\u0277\u0003J%\u0000\u0276\u0274"+
		"\u0001\u0000\u0000\u0000\u0277\u027a\u0001\u0000\u0000\u0000\u0278\u0276"+
		"\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027b"+
		"\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027b\u027c"+
		"\u0005A\u0000\u0000\u027c]\u0001\u0000\u0000\u0000\u027d\u027f\u00054"+
		"\u0000\u0000\u027e\u0280\u0003j5\u0000\u027f\u027e\u0001\u0000\u0000\u0000"+
		"\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u028d\u0001\u0000\u0000\u0000"+
		"\u0281\u028a\u0005@\u0000\u0000\u0282\u0287\u0003X,\u0000\u0283\u0284"+
		"\u0005\u0001\u0000\u0000\u0284\u0286\u0003X,\u0000\u0285\u0283\u0001\u0000"+
		"\u0000\u0000\u0286\u0289\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000"+
		"\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u028b\u0001\u0000"+
		"\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u028a\u0282\u0001\u0000"+
		"\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000"+
		"\u0000\u0000\u028c\u028e\u0005A\u0000\u0000\u028d\u0281\u0001\u0000\u0000"+
		"\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u029b\u0001\u0000\u0000"+
		"\u0000\u028f\u0298\u0005>\u0000\u0000\u0290\u0295\u0003X,\u0000\u0291"+
		"\u0292\u0005\u0001\u0000\u0000\u0292\u0294\u0003X,\u0000\u0293\u0291\u0001"+
		"\u0000\u0000\u0000\u0294\u0297\u0001\u0000\u0000\u0000\u0295\u0293\u0001"+
		"\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u0299\u0001"+
		"\u0000\u0000\u0000\u0297\u0295\u0001\u0000\u0000\u0000\u0298\u0290\u0001"+
		"\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029a\u0001"+
		"\u0000\u0000\u0000\u029a\u029c\u0005?\u0000\u0000\u029b\u028f\u0001\u0000"+
		"\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c_\u0001\u0000\u0000"+
		"\u0000\u029d\u02a3\u0003(\u0014\u0000\u029e\u029f\u0003\u0082A\u0000\u029f"+
		"\u02a0\u0003`0\u0000\u02a0\u02a2\u0001\u0000\u0000\u0000\u02a1\u029e\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a5\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02c9\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005"+
		"@\u0000\u0000\u02a7\u02a8\u0003(\u0014\u0000\u02a8\u02ae\u0005A\u0000"+
		"\u0000\u02a9\u02aa\u0003\u0082A\u0000\u02aa\u02ab\u0003`0\u0000\u02ab"+
		"\u02ad\u0001\u0000\u0000\u0000\u02ac\u02a9\u0001\u0000\u0000\u0000\u02ad"+
		"\u02b0\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02ae"+
		"\u02af\u0001\u0000\u0000\u0000\u02af\u02c9\u0001\u0000\u0000\u0000\u02b0"+
		"\u02ae\u0001\u0000\u0000\u0000\u02b1\u02b2\u0005@\u0000\u0000\u02b2\u02b8"+
		"\u0003(\u0014\u0000\u02b3\u02b4\u0003\u0082A\u0000\u02b4\u02b5\u0003`"+
		"0\u0000\u02b5\u02b7\u0001\u0000\u0000\u0000\u02b6\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b7\u02ba\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02bb\u0001\u0000\u0000"+
		"\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000\u02bb\u02bc\u0005A\u0000\u0000"+
		"\u02bc\u02c9\u0001\u0000\u0000\u0000\u02bd\u02be\u0005@\u0000\u0000\u02be"+
		"\u02bf\u0003`0\u0000\u02bf\u02c5\u0005A\u0000\u0000\u02c0\u02c1\u0003"+
		"\u0082A\u0000\u02c1\u02c2\u0003`0\u0000\u02c2\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c0\u0001\u0000\u0000\u0000\u02c4\u02c7\u0001\u0000\u0000"+
		"\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c8\u029d\u0001\u0000\u0000\u0000\u02c8\u02a6\u0001\u0000\u0000"+
		"\u0000\u02c8\u02b1\u0001\u0000\u0000\u0000\u02c8\u02bd\u0001\u0000\u0000"+
		"\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005\u0003\u0000"+
		"\u0000\u02cb\u02cd\u0003:\u001d\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000"+
		"\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cda\u0001\u0000\u0000\u0000\u02ce"+
		"\u02d2\u0005\f\u0000\u0000\u02cf\u02d1\u0003\u0094J\u0000\u02d0\u02cf"+
		"\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d5\u02d6"+
		"\u0005\r\u0000\u0000\u02d6c\u0001\u0000\u0000\u0000\u02d7\u02d8\u0005"+
		":\u0000\u0000\u02d8\u02d9\u0003`0\u0000\u02d9e\u0001\u0000\u0000\u0000"+
		"\u02da\u02db\u0003:\u001d\u0000\u02db\u02dc\u0005\u0005\u0000\u0000\u02dc"+
		"\u02dd\u0003`0\u0000\u02ddg\u0001\u0000\u0000\u0000\u02de\u02df\u0005"+
		"@\u0000\u0000\u02df\u02e0\u0003`0\u0000\u02e0\u02e1\u0005=\u0000\u0000"+
		"\u02e1\u02e2\u0003 \u0010\u0000\u02e2\u02e5\u0005A\u0000\u0000\u02e3\u02e4"+
		"\u0005\u0003\u0000\u0000\u02e4\u02e6\u0003:\u001d\u0000\u02e5\u02e3\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6i\u0001\u0000"+
		"\u0000\u0000\u02e7\u02eb\u0005G\u0000\u0000\u02e8\u02eb\u0003l6\u0000"+
		"\u02e9\u02eb\u0005E\u0000\u0000\u02ea\u02e7\u0001\u0000\u0000\u0000\u02ea"+
		"\u02e8\u0001\u0000\u0000\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000\u02eb"+
		"k\u0001\u0000\u0000\u0000\u02ec\u02ee\u0005G\u0000\u0000\u02ed\u02ec\u0001"+
		"\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001"+
		"\u0000\u0000\u0000\u02ef\u02f0\u0005D\u0000\u0000\u02f0\u02f1\u0003\u0094"+
		"J\u0000\u02f1\u02f3\u0005?\u0000\u0000\u02f2\u02f4\u0005G\u0000\u0000"+
		"\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000"+
		"\u02f4m\u0001\u0000\u0000\u0000\u02f5\u02f8\u0005 \u0000\u0000\u02f6\u02f8"+
		"\u0003p8\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f6\u0001\u0000"+
		"\u0000\u0000\u02f8o\u0001\u0000\u0000\u0000\u02f9\u02fb\u0005\u000e\u0000"+
		"\u0000\u02fa\u02fc\t\u0000\u0000\u0000\u02fb\u02fa\u0001\u0000\u0000\u0000"+
		"\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000"+
		"\u02fd\u02fe\u0005D\u0000\u0000\u02fe\u02ff\u0003\u0094J\u0000\u02ff\u0301"+
		"\u0005?\u0000\u0000\u0300\u0302\t\u0000\u0000\u0000\u0301\u0300\u0001"+
		"\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0303\u0001"+
		"\u0000\u0000\u0000\u0303\u0304\u0005\u000f\u0000\u0000\u0304q\u0001\u0000"+
		"\u0000\u0000\u0305\u0308\u0005\u001e\u0000\u0000\u0306\u0308\u0003t:\u0000"+
		"\u0307\u0305\u0001\u0000\u0000\u0000\u0307\u0306\u0001\u0000\u0000\u0000"+
		"\u0308s\u0001\u0000\u0000\u0000\u0309\u030b\u0005\u0010\u0000\u0000\u030a"+
		"\u030c\t\u0000\u0000\u0000\u030b\u030a\u0001\u0000\u0000\u0000\u030b\u030c"+
		"\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d\u030e"+
		"\u0005D\u0000\u0000\u030e\u030f\u0003\u0094J\u0000\u030f\u0311\u0005?"+
		"\u0000\u0000\u0310\u0312\t\u0000\u0000\u0000\u0311\u0310\u0001\u0000\u0000"+
		"\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000"+
		"\u0000\u0313\u0314\u0005\u0011\u0000\u0000\u0314u\u0001\u0000\u0000\u0000"+
		"\u0315\u0318\u0003j5\u0000\u0316\u0318\u0003n7\u0000\u0317\u0315\u0001"+
		"\u0000\u0000\u0000\u0317\u0316\u0001\u0000\u0000\u0000\u0318w\u0001\u0000"+
		"\u0000\u0000\u0319\u031a\u00051\u0000\u0000\u031a\u031d\u0005G\u0000\u0000"+
		"\u031b\u031c\u0005\u0006\u0000\u0000\u031c\u031e\u0003z=\u0000\u031d\u031b"+
		"\u0001\u0000\u0000\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031e\u031f"+
		"\u0001\u0000\u0000\u0000\u031f\u0320\u0005\u0005\u0000\u0000\u0320\u0321"+
		"\u0003\u0080@\u0000\u0321y\u0001\u0000\u0000\u0000\u0322\u0325\u0003|"+
		">\u0000\u0323\u0325\u0003~?\u0000\u0324\u0322\u0001\u0000\u0000\u0000"+
		"\u0324\u0323\u0001\u0000\u0000\u0000\u0325{\u0001\u0000\u0000\u0000\u0326"+
		"\u0327\u0005G\u0000\u0000\u0327\u0329\u0005\u0003\u0000\u0000\u0328\u0326"+
		"\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032a"+
		"\u0001\u0000\u0000\u0000\u032a\u032b\u0005G\u0000\u0000\u032b}\u0001\u0000"+
		"\u0000\u0000\u032c\u032d\u0005G\u0000\u0000\u032d\u032f\u0005\u0003\u0000"+
		"\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000"+
		"\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0331\u0005G\u0000\u0000"+
		"\u0331\u0332\u0005B\u0000\u0000\u0332\u0333\u0005C\u0000\u0000\u0333\u007f"+
		"\u0001\u0000\u0000\u0000\u0334\u033a\u0003\u0084B\u0000\u0335\u0336\u0003"+
		"\u0082A\u0000\u0336\u0337\u0003\u0080@\u0000\u0337\u0339\u0001\u0000\u0000"+
		"\u0000\u0338\u0335\u0001\u0000\u0000\u0000\u0339\u033c\u0001\u0000\u0000"+
		"\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000"+
		"\u0000\u033b\u0360\u0001\u0000\u0000\u0000\u033c\u033a\u0001\u0000\u0000"+
		"\u0000\u033d\u033e\u0005@\u0000\u0000\u033e\u033f\u0003\u0084B\u0000\u033f"+
		"\u0345\u0005A\u0000\u0000\u0340\u0341\u0003\u0082A\u0000\u0341\u0342\u0003"+
		"\u0080@\u0000\u0342\u0344\u0001\u0000\u0000\u0000\u0343\u0340\u0001\u0000"+
		"\u0000\u0000\u0344\u0347\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000"+
		"\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0360\u0001\u0000"+
		"\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0348\u0349\u0005@\u0000"+
		"\u0000\u0349\u034f\u0003\u0084B\u0000\u034a\u034b\u0003\u0082A\u0000\u034b"+
		"\u034c\u0003\u0080@\u0000\u034c\u034e\u0001\u0000\u0000\u0000\u034d\u034a"+
		"\u0001\u0000\u0000\u0000\u034e\u0351\u0001\u0000\u0000\u0000\u034f\u034d"+
		"\u0001\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0352"+
		"\u0001\u0000\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0352\u0353"+
		"\u0005A\u0000\u0000\u0353\u0360\u0001\u0000\u0000\u0000\u0354\u0355\u0005"+
		"@\u0000\u0000\u0355\u0356\u0003\u0080@\u0000\u0356\u035c\u0005A\u0000"+
		"\u0000\u0357\u0358\u0003\u0082A\u0000\u0358\u0359\u0003\u0080@\u0000\u0359"+
		"\u035b\u0001\u0000\u0000\u0000\u035a\u0357\u0001\u0000\u0000\u0000\u035b"+
		"\u035e\u0001\u0000\u0000\u0000\u035c\u035a\u0001\u0000\u0000\u0000\u035c"+
		"\u035d\u0001\u0000\u0000\u0000\u035d\u0360\u0001\u0000\u0000\u0000\u035e"+
		"\u035c\u0001\u0000\u0000\u0000\u035f\u0334\u0001\u0000\u0000\u0000\u035f"+
		"\u033d\u0001\u0000\u0000\u0000\u035f\u0348\u0001\u0000\u0000\u0000\u035f"+
		"\u0354\u0001\u0000\u0000\u0000\u0360\u0081\u0001\u0000\u0000\u0000\u0361"+
		"\u0362\u0007\u0001\u0000\u0000\u0362\u0083\u0001\u0000\u0000\u0000\u0363"+
		"\u0369\u0003\u0094J\u0000\u0364\u0369\u0003\u0086C\u0000\u0365\u0369\u0003"+
		"\u00a6S\u0000\u0366\u0369\u0003\u0088D\u0000\u0367\u0369\u0003\u00a4R"+
		"\u0000\u0368\u0363\u0001\u0000\u0000\u0000\u0368\u0364\u0001\u0000\u0000"+
		"\u0000\u0368\u0365\u0001\u0000\u0000\u0000\u0368\u0366\u0001\u0000\u0000"+
		"\u0000\u0368\u0367\u0001\u0000\u0000\u0000\u0369\u0085\u0001\u0000\u0000"+
		"\u0000\u036a\u0371\u0003\u008aE\u0000\u036b\u0371\u0003\u008cF\u0000\u036c"+
		"\u0371\u0003\u008eG\u0000\u036d\u0371\u0003\u00a2Q\u0000\u036e\u0371\u0003"+
		"\u0090H\u0000\u036f\u0371\u0003\u0092I\u0000\u0370\u036a\u0001\u0000\u0000"+
		"\u0000\u0370\u036b\u0001\u0000\u0000\u0000\u0370\u036c\u0001\u0000\u0000"+
		"\u0000\u0370\u036d\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000"+
		"\u0000\u0370\u036f\u0001\u0000\u0000\u0000\u0371\u0087\u0001\u0000\u0000"+
		"\u0000\u0372\u0373\u0005\u000b\u0000\u0000\u0373\u0089\u0001\u0000\u0000"+
		"\u0000\u0374\u0375\u0005 \u0000\u0000\u0375\u008b\u0001\u0000\u0000\u0000"+
		"\u0376\u0377\u0005!\u0000\u0000\u0377\u008d\u0001\u0000\u0000\u0000\u0378"+
		"\u0379\u0005\u001e\u0000\u0000\u0379\u008f\u0001\u0000\u0000\u0000\u037a"+
		"\u037b\u0007\u0002\u0000\u0000\u037b\u0091\u0001\u0000\u0000\u0000\u037c"+
		"\u037e\u0005B\u0000\u0000\u037d\u037f\u0003\u00a8T\u0000\u037e\u037d\u0001"+
		"\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0384\u0001"+
		"\u0000\u0000\u0000\u0380\u0381\u0005\u0001\u0000\u0000\u0381\u0383\u0003"+
		"\u00a8T\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0383\u0386\u0001\u0000"+
		"\u0000\u0000\u0384\u0382\u0001\u0000\u0000\u0000\u0384\u0385\u0001\u0000"+
		"\u0000\u0000\u0385\u0387\u0001\u0000\u0000\u0000\u0386\u0384\u0001\u0000"+
		"\u0000\u0000\u0387\u0388\u0005C\u0000\u0000\u0388\u0093\u0001\u0000\u0000"+
		"\u0000\u0389\u038e\u0003\u0096K\u0000\u038a\u038b\u0005\u0003\u0000\u0000"+
		"\u038b\u038d\u0003\u0096K\u0000\u038c\u038a\u0001\u0000\u0000\u0000\u038d"+
		"\u0390\u0001\u0000\u0000\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038e"+
		"\u038f\u0001\u0000\u0000\u0000\u038f\u0095\u0001\u0000\u0000\u0000\u0390"+
		"\u038e\u0001\u0000\u0000\u0000\u0391\u0398\u0003\u0098L\u0000\u0392\u0394"+
		"\u0005\u001d\u0000\u0000\u0393\u0392\u0001\u0000\u0000\u0000\u0393\u0394"+
		"\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u0398"+
		"\u0003\u009aM\u0000\u0396\u0398\u0003\u00a0P\u0000\u0397\u0391\u0001\u0000"+
		"\u0000\u0000\u0397\u0393\u0001\u0000\u0000\u0000\u0397\u0396\u0001\u0000"+
		"\u0000\u0000\u0398\u0097\u0001\u0000\u0000\u0000\u0399\u039a\u0005G\u0000"+
		"\u0000\u039a\u039b\u0005B\u0000\u0000\u039b\u039c\u0003\u0080@\u0000\u039c"+
		"\u039d\u0005C\u0000\u0000\u039d\u0099\u0001\u0000\u0000\u0000\u039e\u03a1"+
		"\u0005G\u0000\u0000\u039f\u03a1\u0005\u000b\u0000\u0000\u03a0\u039e\u0001"+
		"\u0000\u0000\u0000\u03a0\u039f\u0001\u0000\u0000\u0000\u03a1\u03a3\u0001"+
		"\u0000\u0000\u0000\u03a2\u03a4\u0003\u009cN\u0000\u03a3\u03a2\u0001\u0000"+
		"\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000"+
		"\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u009b\u0001\u0000"+
		"\u0000\u0000\u03a7\u03b0\u0005@\u0000\u0000\u03a8\u03ad\u0003\u009eO\u0000"+
		"\u03a9\u03aa\u0005\u0001\u0000\u0000\u03aa\u03ac\u0003\u009eO\u0000\u03ab"+
		"\u03a9\u0001\u0000\u0000\u0000\u03ac\u03af\u0001\u0000\u0000\u0000\u03ad"+
		"\u03ab\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae"+
		"\u03b1\u0001\u0000\u0000\u0000\u03af\u03ad\u0001\u0000\u0000\u0000\u03b0"+
		"\u03a8\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1"+
		"\u03b2\u0001\u0000\u0000\u0000\u03b2\u03b3\u0005A\u0000\u0000\u03b3\u009d"+
		"\u0001\u0000\u0000\u0000\u03b4\u03b5\u0005G\u0000\u0000\u03b5\u03b7\u0005"+
		"\u0005\u0000\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001"+
		"\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8\u03b9\u0003"+
		"\u0080@\u0000\u03b9\u009f\u0001\u0000\u0000\u0000\u03ba\u03bb\u0005G\u0000"+
		"\u0000\u03bb\u00a1\u0001\u0000\u0000\u0000\u03bc\u03c0\u0005>\u0000\u0000"+
		"\u03bd\u03bf\u0003\u00a8T\u0000\u03be\u03bd\u0001\u0000\u0000\u0000\u03bf"+
		"\u03c2\u0001\u0000\u0000\u0000\u03c0\u03be\u0001\u0000\u0000\u0000\u03c0"+
		"\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c3\u0001\u0000\u0000\u0000\u03c2"+
		"\u03c0\u0001\u0000\u0000\u0000\u03c3\u03c4\u0005?\u0000\u0000\u03c4\u00a3"+
		"\u0001\u0000\u0000\u0000\u03c5\u03c8\u00052\u0000\u0000\u03c6\u03c7\u0005"+
		"\u0006\u0000\u0000\u03c7\u03c9\u0005G\u0000\u0000\u03c8\u03c6\u0001\u0000"+
		"\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03ca\u0001\u0000"+
		"\u0000\u0000\u03ca\u03cc\u0005>\u0000\u0000\u03cb\u03cd\u0003\u00a8T\u0000"+
		"\u03cc\u03cb\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000"+
		"\u03cd\u03d2\u0001\u0000\u0000\u0000\u03ce\u03cf\u0005\u0001\u0000\u0000"+
		"\u03cf\u03d1\u0003\u00a8T\u0000\u03d0\u03ce\u0001\u0000\u0000\u0000\u03d1"+
		"\u03d4\u0001\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2"+
		"\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d5\u0001\u0000\u0000\u0000\u03d4"+
		"\u03d2\u0001\u0000\u0000\u0000\u03d5\u03d6\u0005?\u0000\u0000\u03d6\u00a5"+
		"\u0001\u0000\u0000\u0000\u03d7\u03d8\u0005@\u0000\u0000\u03d8\u03db\u0003"+
		"\u0080@\u0000\u03d9\u03da\u0005\u0001\u0000\u0000\u03da\u03dc\u0003\u0080"+
		"@\u0000\u03db\u03d9\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001\u0000\u0000"+
		"\u0000\u03dd\u03db\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000"+
		"\u0000\u03de\u03df\u0001\u0000\u0000\u0000\u03df\u03e0\u0005A\u0000\u0000"+
		"\u03e0\u00a7\u0001\u0000\u0000\u0000\u03e1\u03e4\u0005G\u0000\u0000\u03e2"+
		"\u03e3\u0005\u0006\u0000\u0000\u03e3\u03e5\u0003z=\u0000\u03e4\u03e2\u0001"+
		"\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001"+
		"\u0000\u0000\u0000\u03e6\u03e8\u0005\u0005\u0000\u0000\u03e7\u03e1\u0001"+
		"\u0000\u0000\u0000\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8\u03e9\u0001"+
		"\u0000\u0000\u0000\u03e9\u03ea\u0003\u0080@\u0000\u03ea\u00a9\u0001\u0000"+
		"\u0000\u0000\u03eb\u03ec\u0005$\u0000\u0000\u03ec\u03f0\u0005>\u0000\u0000"+
		"\u03ed\u03ef\u0003\u00acV\u0000\u03ee\u03ed\u0001\u0000\u0000\u0000\u03ef"+
		"\u03f2\u0001\u0000\u0000\u0000\u03f0\u03ee\u0001\u0000\u0000\u0000\u03f0"+
		"\u03f1\u0001\u0000\u0000\u0000\u03f1\u03f3\u0001\u0000\u0000\u0000\u03f2"+
		"\u03f0\u0001\u0000\u0000\u0000\u03f3\u03f4\u0005?\u0000\u0000\u03f4\u00ab"+
		"\u0001\u0000\u0000\u0000\u03f5\u03f6\u0005)\u0000\u0000\u03f6\u03fe\u0005"+
		"G\u0000\u0000\u03f7\u03f9\u0005@\u0000\u0000\u03f8\u03fa\u0003\u00aeW"+
		"\u0000\u03f9\u03f8\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000"+
		"\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fd\u0005A\u0000\u0000"+
		"\u03fc\u03f7\u0001\u0000\u0000\u0000\u03fd\u0400\u0001\u0000\u0000\u0000"+
		"\u03fe\u03fc\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000"+
		"\u03ff\u040a\u0001\u0000\u0000\u0000\u0400\u03fe\u0001\u0000\u0000\u0000"+
		"\u0401\u0402\u0005\u0006\u0000\u0000\u0402\u0407\u0003\u00b2Y\u0000\u0403"+
		"\u0404\u0005\u0001\u0000\u0000\u0404\u0406\u0003\u00b2Y\u0000\u0405\u0403"+
		"\u0001\u0000\u0000\u0000\u0406\u0409\u0001\u0000\u0000\u0000\u0407\u0405"+
		"\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u040b"+
		"\u0001\u0000\u0000\u0000\u0409\u0407\u0001\u0000\u0000\u0000\u040a\u0401"+
		"\u0001\u0000\u0000\u0000\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u040c"+
		"\u0001\u0000\u0000\u0000\u040c\u040d\u0005>\u0000\u0000\u040d\u040e\u0003"+
		"\u00b6[\u0000\u040e\u040f\u0005?\u0000\u0000\u040f\u00ad\u0001\u0000\u0000"+
		"\u0000\u0410\u0415\u0003\u00b0X\u0000\u0411\u0412\u0005\u0001\u0000\u0000"+
		"\u0412\u0414\u0003\u00b0X\u0000\u0413\u0411\u0001\u0000\u0000\u0000\u0414"+
		"\u0417\u0001\u0000\u0000\u0000\u0415\u0413\u0001\u0000\u0000\u0000\u0415"+
		"\u0416\u0001\u0000\u0000\u0000\u0416\u00af\u0001\u0000\u0000\u0000\u0417"+
		"\u0415\u0001\u0000\u0000\u0000\u0418\u0419\u0005G\u0000\u0000\u0419\u041b"+
		"\u0005\u0006\u0000\u0000\u041a\u0418\u0001\u0000\u0000\u0000\u041a\u041b"+
		"\u0001\u0000\u0000\u0000\u041b\u041c\u0001\u0000\u0000\u0000\u041c\u041d"+
		"\u0003\u00b2Y\u0000\u041d\u00b1\u0001\u0000\u0000\u0000\u041e\u0422\u0003"+
		"|>\u0000\u041f\u0422\u0003~?\u0000\u0420\u0422\u0003\u00b4Z\u0000\u0421"+
		"\u041e\u0001\u0000\u0000\u0000\u0421\u041f\u0001\u0000\u0000\u0000\u0421"+
		"\u0420\u0001\u0000\u0000\u0000\u0422\u00b3\u0001\u0000\u0000\u0000\u0423"+
		"\u0425\u0005@\u0000\u0000\u0424\u0426\u0003\u00aeW\u0000\u0425\u0424\u0001"+
		"\u0000\u0000\u0000\u0425\u0426\u0001\u0000\u0000\u0000\u0426\u0427\u0001"+
		"\u0000\u0000\u0000\u0427\u042e\u0005A\u0000\u0000\u0428\u0429\u0005@\u0000"+
		"\u0000\u0429\u042a\u0003\u00aeW\u0000\u042a\u042b\u0005A\u0000\u0000\u042b"+
		"\u042d\u0001\u0000\u0000\u0000\u042c\u0428\u0001\u0000\u0000\u0000\u042d"+
		"\u0430\u0001\u0000\u0000\u0000\u042e\u042c\u0001\u0000\u0000\u0000\u042e"+
		"\u042f\u0001\u0000\u0000\u0000\u042f\u0431\u0001\u0000\u0000\u0000\u0430"+
		"\u042e\u0001\u0000\u0000\u0000\u0431\u0432\u0005\t\u0000\u0000\u0432\u0437"+
		"\u0003\u00b2Y\u0000\u0433\u0434\u0005\u0001\u0000\u0000\u0434\u0436\u0003"+
		"\u00b2Y\u0000\u0435\u0433\u0001\u0000\u0000\u0000\u0436\u0439\u0001\u0000"+
		"\u0000\u0000\u0437\u0435\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000"+
		"\u0000\u0000\u0438\u00b5\u0001\u0000\u0000\u0000\u0439\u0437\u0001\u0000"+
		"\u0000\u0000\u043a\u043c\u0003\u00b8\\\u0000\u043b\u043a\u0001\u0000\u0000"+
		"\u0000\u043c\u043f\u0001\u0000\u0000\u0000\u043d\u043b\u0001\u0000\u0000"+
		"\u0000\u043d\u043e\u0001\u0000\u0000\u0000\u043e\u00b7\u0001\u0000\u0000"+
		"\u0000\u043f\u043d\u0001\u0000\u0000\u0000\u0440\u0445\u0003x<\u0000\u0441"+
		"\u0445\u0003\u0080@\u0000\u0442\u0445\u0003\u00ba]\u0000\u0443\u0445\u0003"+
		"\u00be_\u0000\u0444\u0440\u0001\u0000\u0000\u0000\u0444\u0441\u0001\u0000"+
		"\u0000\u0000\u0444\u0442\u0001\u0000\u0000\u0000\u0444\u0443\u0001\u0000"+
		"\u0000\u0000\u0445\u00b9\u0001\u0000\u0000\u0000\u0446\u0447\u0005*\u0000"+
		"\u0000\u0447\u0448\u0005@\u0000\u0000\u0448\u0449\u0003\u0080@\u0000\u0449"+
		"\u044a\u0005A\u0000\u0000\u044a\u044b\u0005>\u0000\u0000\u044b\u044c\u0003"+
		"\u00b6[\u0000\u044c\u044e\u0005?\u0000\u0000\u044d\u044f\u0003\u00bc^"+
		"\u0000\u044e\u044d\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000\u0000"+
		"\u0000\u044f\u00bb\u0001\u0000\u0000\u0000\u0450\u0451\u0005+\u0000\u0000"+
		"\u0451\u0452\u0005>\u0000\u0000\u0452\u0453\u0003\u00b6[\u0000\u0453\u0454"+
		"\u0005?\u0000\u0000\u0454\u00bd\u0001\u0000\u0000\u0000\u0455\u0456\u0005"+
		",\u0000\u0000\u0456\u0457\u0005@\u0000\u0000\u0457\u0459\u0005G\u0000"+
		"\u0000\u0458\u045a\u0003\u0080@\u0000\u0459\u0458\u0001\u0000\u0000\u0000"+
		"\u0459\u045a\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000\u0000\u0000"+
		"\u045b\u045c\u0007\u0000\u0000\u0000\u045c\u045d\u0003\u0080@\u0000\u045d"+
		"\u045e\u0005A\u0000\u0000\u045e\u045f\u0005>\u0000\u0000\u045f\u0460\u0003"+
		"\u00b6[\u0000\u0460\u0461\u0005?\u0000\u0000\u0461\u00bf\u0001\u0000\u0000"+
		"\u0000\u0083\u00cb\u00d0\u00d6\u00da\u00df\u00e5\u00f4\u00fa\u0102\u010b"+
		"\u0110\u011a\u011f\u0124\u012c\u0130\u0135\u0143\u014e\u0151\u0153\u0159"+
		"\u0161\u016a\u0173\u0176\u017a\u0185\u0188\u018d\u0191\u0196\u019d\u01a0"+
		"\u01a4\u01ab\u01b0\u01b6\u01c9\u01d1\u01d6\u01dd\u01f8\u0200\u0203\u0207"+
		"\u0211\u0217\u021b\u0220\u0228\u022b\u0232\u0238\u0244\u024c\u0256\u025a"+
		"\u0260\u0267\u026a\u026e\u0278\u027f\u0287\u028a\u028d\u0295\u0298\u029b"+
		"\u02a3\u02ae\u02b8\u02c5\u02c8\u02cc\u02d2\u02e5\u02ea\u02ed\u02f3\u02f7"+
		"\u02fb\u0301\u0307\u030b\u0311\u0317\u031d\u0324\u0328\u032e\u033a\u0345"+
		"\u034f\u035c\u035f\u0368\u0370\u037e\u0384\u038e\u0393\u0397\u03a0\u03a5"+
		"\u03ad\u03b0\u03b6\u03c0\u03c8\u03cc\u03d2\u03dd\u03e4\u03e7\u03f0\u03f9"+
		"\u03fe\u0407\u040a\u0415\u041a\u0421\u0425\u042e\u0437\u043d\u0444\u044e"+
		"\u0459";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}