// Generated from dev/tlang/parser/TLangModel.g4 by ANTLR 4.13.0
package dev.tlang.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TLangModelLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "TEXT", "WS", "ESCAPED_QUOTE", "STRING", "NUMBER", "COMMENT", 
			"LINE_COMMENT", "Helper", "Tmpl", "Model", "Use", "Expose", "Func", "If", 
			"Else", "For", "In", "To", "Until", "Set", "Ext", "Impl", "Spec", "Pkg", 
			"While", "Do", "Var", "Return", "LBRACE", "RBRACE", "ESCAPED_ID", "WHITE_SPACES", 
			"ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "':'", "'['", "']'", "'&'", "'.'", "'let'", 
			"'='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'_'", "'true'", "'false'", null, null, 
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


	public TLangModelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TLangModel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000:\u017e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0004"+
		"\u001b\u00c4\b\u001b\u000b\u001b\f\u001b\u00c5\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u00d0\b\u001d\n\u001d\f\u001d\u00d3\t\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0004\u001e\u00d8\b\u001e\u000b\u001e\f\u001e\u00d9"+
		"\u0001\u001e\u0001\u001e\u0004\u001e\u00de\b\u001e\u000b\u001e\f\u001e"+
		"\u00df\u0003\u001e\u00e2\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u00e8\b\u001f\n\u001f\f\u001f\u00eb\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0005 \u00f6\b \n \f \u00f9\t \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00016\u0001"+
		"6\u00017\u00017\u00018\u00018\u00058\u0167\b8\n8\f8\u016a\t8\u00018\u0001"+
		"8\u00019\u00049\u016f\b9\u000b9\f9\u0170\u00019\u00019\u0001:\u0003:\u0176"+
		"\b:\u0001:\u0001:\u0005:\u017a\b:\n:\f:\u017d\t:\u0003\u00d1\u00e9\u0168"+
		"\u0000;\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u0000;\u001d=\u001e?\u001f"+
		"A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a0c1e2g3i4k5m6o7q8s9u:\u0001\u0000\u0005"+
		"\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0004\u0000\t\t\u000b\f  \u00a0"+
		"\u00a0\u0003\u0000AZ__az\u0005\u0000--09AZ__az\u0188\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u0000;\u0001\u0000"+
		"\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000"+
		"\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E"+
		"\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000"+
		"\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000"+
		"\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S"+
		"\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000"+
		"\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000"+
		"\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a"+
		"\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000"+
		"\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000"+
		"\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o"+
		"\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000"+
		"\u0000\u0000\u0000u\u0001\u0000\u0000\u0000\u0001w\u0001\u0000\u0000\u0000"+
		"\u0003y\u0001\u0000\u0000\u0000\u0005{\u0001\u0000\u0000\u0000\u0007}"+
		"\u0001\u0000\u0000\u0000\t\u007f\u0001\u0000\u0000\u0000\u000b\u0081\u0001"+
		"\u0000\u0000\u0000\r\u0083\u0001\u0000\u0000\u0000\u000f\u0085\u0001\u0000"+
		"\u0000\u0000\u0011\u0087\u0001\u0000\u0000\u0000\u0013\u008b\u0001\u0000"+
		"\u0000\u0000\u0015\u008d\u0001\u0000\u0000\u0000\u0017\u0090\u0001\u0000"+
		"\u0000\u0000\u0019\u0093\u0001\u0000\u0000\u0000\u001b\u0095\u0001\u0000"+
		"\u0000\u0000\u001d\u0097\u0001\u0000\u0000\u0000\u001f\u0099\u0001\u0000"+
		"\u0000\u0000!\u009b\u0001\u0000\u0000\u0000#\u009d\u0001\u0000\u0000\u0000"+
		"%\u00a0\u0001\u0000\u0000\u0000\'\u00a3\u0001\u0000\u0000\u0000)\u00a5"+
		"\u0001\u0000\u0000\u0000+\u00a7\u0001\u0000\u0000\u0000-\u00aa\u0001\u0000"+
		"\u0000\u0000/\u00ad\u0001\u0000\u0000\u00001\u00af\u0001\u0000\u0000\u0000"+
		"3\u00b4\u0001\u0000\u0000\u00005\u00ba\u0001\u0000\u0000\u00007\u00c3"+
		"\u0001\u0000\u0000\u00009\u00c9\u0001\u0000\u0000\u0000;\u00cc\u0001\u0000"+
		"\u0000\u0000=\u00d7\u0001\u0000\u0000\u0000?\u00e3\u0001\u0000\u0000\u0000"+
		"A\u00f1\u0001\u0000\u0000\u0000C\u00fc\u0001\u0000\u0000\u0000E\u0103"+
		"\u0001\u0000\u0000\u0000G\u0108\u0001\u0000\u0000\u0000I\u010e\u0001\u0000"+
		"\u0000\u0000K\u0112\u0001\u0000\u0000\u0000M\u0119\u0001\u0000\u0000\u0000"+
		"O\u011e\u0001\u0000\u0000\u0000Q\u0121\u0001\u0000\u0000\u0000S\u0126"+
		"\u0001\u0000\u0000\u0000U\u012a\u0001\u0000\u0000\u0000W\u012d\u0001\u0000"+
		"\u0000\u0000Y\u0130\u0001\u0000\u0000\u0000[\u0136\u0001\u0000\u0000\u0000"+
		"]\u013a\u0001\u0000\u0000\u0000_\u013e\u0001\u0000\u0000\u0000a\u0143"+
		"\u0001\u0000\u0000\u0000c\u0148\u0001\u0000\u0000\u0000e\u014c\u0001\u0000"+
		"\u0000\u0000g\u0152\u0001\u0000\u0000\u0000i\u0155\u0001\u0000\u0000\u0000"+
		"k\u0159\u0001\u0000\u0000\u0000m\u0160\u0001\u0000\u0000\u0000o\u0162"+
		"\u0001\u0000\u0000\u0000q\u0164\u0001\u0000\u0000\u0000s\u016e\u0001\u0000"+
		"\u0000\u0000u\u0175\u0001\u0000\u0000\u0000wx\u0005(\u0000\u0000x\u0002"+
		"\u0001\u0000\u0000\u0000yz\u0005,\u0000\u0000z\u0004\u0001\u0000\u0000"+
		"\u0000{|\u0005)\u0000\u0000|\u0006\u0001\u0000\u0000\u0000}~\u0005:\u0000"+
		"\u0000~\b\u0001\u0000\u0000\u0000\u007f\u0080\u0005[\u0000\u0000\u0080"+
		"\n\u0001\u0000\u0000\u0000\u0081\u0082\u0005]\u0000\u0000\u0082\f\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005&\u0000\u0000\u0084\u000e\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005.\u0000\u0000\u0086\u0010\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005l\u0000\u0000\u0088\u0089\u0005e\u0000\u0000\u0089"+
		"\u008a\u0005t\u0000\u0000\u008a\u0012\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005=\u0000\u0000\u008c\u0014\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"&\u0000\u0000\u008e\u008f\u0005&\u0000\u0000\u008f\u0016\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005|\u0000\u0000\u0091\u0092\u0005|\u0000\u0000\u0092"+
		"\u0018\u0001\u0000\u0000\u0000\u0093\u0094\u0005+\u0000\u0000\u0094\u001a"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005-\u0000\u0000\u0096\u001c\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005*\u0000\u0000\u0098\u001e\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005/\u0000\u0000\u009a \u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005%\u0000\u0000\u009c\"\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005=\u0000\u0000\u009e\u009f\u0005=\u0000\u0000\u009f$\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005!\u0000\u0000\u00a1\u00a2\u0005=\u0000"+
		"\u0000\u00a2&\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005>\u0000\u0000\u00a4"+
		"(\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005<\u0000\u0000\u00a6*\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005>\u0000\u0000\u00a8\u00a9\u0005=\u0000"+
		"\u0000\u00a9,\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005<\u0000\u0000\u00ab"+
		"\u00ac\u0005=\u0000\u0000\u00ac.\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"_\u0000\u0000\u00ae0\u0001\u0000\u0000\u0000\u00af\u00b0\u0005t\u0000"+
		"\u0000\u00b0\u00b1\u0005r\u0000\u0000\u00b1\u00b2\u0005u\u0000\u0000\u00b2"+
		"\u00b3\u0005e\u0000\u0000\u00b32\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"f\u0000\u0000\u00b5\u00b6\u0005a\u0000\u0000\u00b6\u00b7\u0005l\u0000"+
		"\u0000\u00b7\u00b8\u0005s\u0000\u0000\u00b8\u00b9\u0005e\u0000\u0000\u00b9"+
		"4\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\"\u0000\u0000\u00bb\u00bc"+
		"\u0005\"\u0000\u0000\u00bc\u00bd\u0005\"\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005\"\u0000\u0000\u00bf\u00c0\u0005\""+
		"\u0000\u0000\u00c0\u00c1\u0005\"\u0000\u0000\u00c16\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0007\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0006\u001b\u0000\u0000\u00c88\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005\\\u0000\u0000\u00ca\u00cb\u0005\"\u0000\u0000\u00cb"+
		":\u0001\u0000\u0000\u0000\u00cc\u00d1\u0005\"\u0000\u0000\u00cd\u00d0"+
		"\u00039\u001c\u0000\u00ce\u00d0\b\u0001\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005\"\u0000\u0000\u00d5<\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d8\u000209\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00e1\u0001\u0000\u0000\u0000"+
		"\u00db\u00dd\u0005.\u0000\u0000\u00dc\u00de\u000209\u0000\u00dd\u00dc"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e1\u00db\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2>\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005"+
		"/\u0000\u0000\u00e4\u00e5\u0005*\u0000\u0000\u00e5\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e8\t\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000"+
		"\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005*\u0000\u0000\u00ed"+
		"\u00ee\u0005/\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0006\u001f\u0000\u0000\u00f0@\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"/\u0000\u0000\u00f2\u00f3\u0005/\u0000\u0000\u00f3\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f6\b\u0001\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0006 \u0000\u0000\u00fb"+
		"B\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005h\u0000\u0000\u00fd\u00fe\u0005"+
		"e\u0000\u0000\u00fe\u00ff\u0005l\u0000\u0000\u00ff\u0100\u0005p\u0000"+
		"\u0000\u0100\u0101\u0005e\u0000\u0000\u0101\u0102\u0005r\u0000\u0000\u0102"+
		"D\u0001\u0000\u0000\u0000\u0103\u0104\u0005t\u0000\u0000\u0104\u0105\u0005"+
		"m\u0000\u0000\u0105\u0106\u0005p\u0000\u0000\u0106\u0107\u0005l\u0000"+
		"\u0000\u0107F\u0001\u0000\u0000\u0000\u0108\u0109\u0005m\u0000\u0000\u0109"+
		"\u010a\u0005o\u0000\u0000\u010a\u010b\u0005d\u0000\u0000\u010b\u010c\u0005"+
		"e\u0000\u0000\u010c\u010d\u0005l\u0000\u0000\u010dH\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0005u\u0000\u0000\u010f\u0110\u0005s\u0000\u0000\u0110"+
		"\u0111\u0005e\u0000\u0000\u0111J\u0001\u0000\u0000\u0000\u0112\u0113\u0005"+
		"e\u0000\u0000\u0113\u0114\u0005x\u0000\u0000\u0114\u0115\u0005p\u0000"+
		"\u0000\u0115\u0116\u0005o\u0000\u0000\u0116\u0117\u0005s\u0000\u0000\u0117"+
		"\u0118\u0005e\u0000\u0000\u0118L\u0001\u0000\u0000\u0000\u0119\u011a\u0005"+
		"f\u0000\u0000\u011a\u011b\u0005u\u0000\u0000\u011b\u011c\u0005n\u0000"+
		"\u0000\u011c\u011d\u0005c\u0000\u0000\u011dN\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0005i\u0000\u0000\u011f\u0120\u0005f\u0000\u0000\u0120P\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0005e\u0000\u0000\u0122\u0123\u0005l\u0000"+
		"\u0000\u0123\u0124\u0005s\u0000\u0000\u0124\u0125\u0005e\u0000\u0000\u0125"+
		"R\u0001\u0000\u0000\u0000\u0126\u0127\u0005f\u0000\u0000\u0127\u0128\u0005"+
		"o\u0000\u0000\u0128\u0129\u0005r\u0000\u0000\u0129T\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005i\u0000\u0000\u012b\u012c\u0005n\u0000\u0000\u012c"+
		"V\u0001\u0000\u0000\u0000\u012d\u012e\u0005t\u0000\u0000\u012e\u012f\u0005"+
		"o\u0000\u0000\u012fX\u0001\u0000\u0000\u0000\u0130\u0131\u0005u\u0000"+
		"\u0000\u0131\u0132\u0005n\u0000\u0000\u0132\u0133\u0005t\u0000\u0000\u0133"+
		"\u0134\u0005i\u0000\u0000\u0134\u0135\u0005l\u0000\u0000\u0135Z\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005s\u0000\u0000\u0137\u0138\u0005e\u0000"+
		"\u0000\u0138\u0139\u0005t\u0000\u0000\u0139\\\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0005e\u0000\u0000\u013b\u013c\u0005x\u0000\u0000\u013c\u013d"+
		"\u0005t\u0000\u0000\u013d^\u0001\u0000\u0000\u0000\u013e\u013f\u0005i"+
		"\u0000\u0000\u013f\u0140\u0005m\u0000\u0000\u0140\u0141\u0005p\u0000\u0000"+
		"\u0141\u0142\u0005l\u0000\u0000\u0142`\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0005s\u0000\u0000\u0144\u0145\u0005p\u0000\u0000\u0145\u0146\u0005e"+
		"\u0000\u0000\u0146\u0147\u0005c\u0000\u0000\u0147b\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0005p\u0000\u0000\u0149\u014a\u0005k\u0000\u0000\u014a\u014b"+
		"\u0005g\u0000\u0000\u014bd\u0001\u0000\u0000\u0000\u014c\u014d\u0005w"+
		"\u0000\u0000\u014d\u014e\u0005h\u0000\u0000\u014e\u014f\u0005i\u0000\u0000"+
		"\u014f\u0150\u0005l\u0000\u0000\u0150\u0151\u0005e\u0000\u0000\u0151f"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0005d\u0000\u0000\u0153\u0154\u0005"+
		"o\u0000\u0000\u0154h\u0001\u0000\u0000\u0000\u0155\u0156\u0005v\u0000"+
		"\u0000\u0156\u0157\u0005a\u0000\u0000\u0157\u0158\u0005r\u0000\u0000\u0158"+
		"j\u0001\u0000\u0000\u0000\u0159\u015a\u0005r\u0000\u0000\u015a\u015b\u0005"+
		"e\u0000\u0000\u015b\u015c\u0005t\u0000\u0000\u015c\u015d\u0005u\u0000"+
		"\u0000\u015d\u015e\u0005r\u0000\u0000\u015e\u015f\u0005n\u0000\u0000\u015f"+
		"l\u0001\u0000\u0000\u0000\u0160\u0161\u0005{\u0000\u0000\u0161n\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0005}\u0000\u0000\u0163p\u0001\u0000\u0000"+
		"\u0000\u0164\u0168\u0005`\u0000\u0000\u0165\u0167\b\u0000\u0000\u0000"+
		"\u0166\u0165\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000"+
		"\u0169\u016b\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0005`\u0000\u0000\u016cr\u0001\u0000\u0000\u0000\u016d\u016f"+
		"\u0007\u0002\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u00069\u0000\u0000\u0173t\u0001\u0000\u0000\u0000\u0174\u0176\u0005^"+
		"\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u017b\u0007\u0003"+
		"\u0000\u0000\u0178\u017a\u0007\u0004\u0000\u0000\u0179\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017cv\u0001\u0000\u0000"+
		"\u0000\u017d\u017b\u0001\u0000\u0000\u0000\r\u0000\u00c5\u00cf\u00d1\u00d9"+
		"\u00df\u00e1\u00e9\u00f7\u0168\u0170\u0175\u017b\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}