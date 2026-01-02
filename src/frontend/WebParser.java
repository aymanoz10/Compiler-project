// Generated from C:/Users/MyPre/IdeaProjects/compilar/src/frontend/WebParser.g4 by ANTLR 4.13.2
package frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class WebParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JINJA_COMMENT=1, JINJA_VAR_START=2, JINJA_BLOCK_START=3, HTML_COMMENT=4, 
		HTML_CONDITIONAL_COMMENT=5, XML_DECLARATION=6, CDATA=7, DOCTYPE=8, TAG_SLASH_CLOSE=9, 
		TAG_OPEN=10, TAG_CLOSE=11, TAG_SLASH=12, CSS_COMMENT=13, CSS_LBRACE=14, 
		CSS_RBRACE=15, IMPORTANT=16, STRING=17, NUMBER=18, CSS_VALUE=19, HEX_COLOR=20, 
		CSS_PSEUDO=21, CSS_CLASS_SELECTOR=22, CSS_ID_SELECTOR=23, EQ=24, NE=25, 
		LE=26, GE=27, LT=28, GT=29, EQUALS=30, COMMA=31, LPAREN=32, RPAREN=33, 
		LBRACKET=34, RBRACKET=35, COLON=36, SEMICOLON=37, PLUS=38, MINUS=39, STAR=40, 
		SLASH=41, IDENTIFIER=42, HTML_TEXT=43, WS=44, NEWLINE=45, JINJA_VAR_END=46, 
		JINJA_BLOCK_END=47, J_FOR=48, J_IN=49, J_ENDFOR=50, J_IF=51, J_ELIF=52, 
		J_ELSE=53, J_ENDIF=54, J_NOT=55, J_AND=56, J_OR=57, J_EQ=58, J_NE=59, 
		J_LE=60, J_GE=61, J_LT=62, J_GT=63, J_PIPE=64, J_DOT=65, J_PERCENT=66, 
		J_EQUALS=67, J_COMMA=68, J_LPAREN=69, J_RPAREN=70, J_LBRACKET=71, J_RBRACKET=72, 
		J_COLON=73, J_PLUS=74, J_MINUS=75, J_STAR=76, J_SLASH=77, J_STRING=78, 
		J_NUMBER=79, J_IDENTIFIER=80, J_WS=81;
	public static final int
		RULE_document = 0, RULE_content = 1, RULE_anyText = 2, RULE_doctype = 3, 
		RULE_htmlComment = 4, RULE_xmlDeclaration = 5, RULE_cdata = 6, RULE_htmlElement = 7, 
		RULE_htmlContent = 8, RULE_attribute = 9, RULE_attributeValue = 10, RULE_jinjaComment = 11, 
		RULE_jinjaVar = 12, RULE_jinjaFor = 13, RULE_forContent = 14, RULE_jinjaIf = 15, 
		RULE_jinjaElif = 16, RULE_jinjaElse = 17, RULE_ifContent = 18, RULE_jinjaExpression = 19, 
		RULE_jinjaTernary = 20, RULE_jinjaLogical = 21, RULE_jinjaComparison = 22, 
		RULE_jinjaAdditive = 23, RULE_jinjaMultiplicative = 24, RULE_jinjaUnary = 25, 
		RULE_jinjaFilter = 26, RULE_jinjaPostfix = 27, RULE_jinjaPostfixOp = 28, 
		RULE_jinjaPrimary = 29, RULE_jinjaArguments = 30, RULE_cssBlock = 31, 
		RULE_cssSelector = 32, RULE_cssSelectorPart = 33, RULE_cssDeclaration = 34, 
		RULE_cssProperty = 35, RULE_cssValueList = 36, RULE_cssValue = 37, RULE_cssComment = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "content", "anyText", "doctype", "htmlComment", "xmlDeclaration", 
			"cdata", "htmlElement", "htmlContent", "attribute", "attributeValue", 
			"jinjaComment", "jinjaVar", "jinjaFor", "forContent", "jinjaIf", "jinjaElif", 
			"jinjaElse", "ifContent", "jinjaExpression", "jinjaTernary", "jinjaLogical", 
			"jinjaComparison", "jinjaAdditive", "jinjaMultiplicative", "jinjaUnary", 
			"jinjaFilter", "jinjaPostfix", "jinjaPostfixOp", "jinjaPrimary", "jinjaArguments", 
			"cssBlock", "cssSelector", "cssSelectorPart", "cssDeclaration", "cssProperty", 
			"cssValueList", "cssValue", "cssComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{{'", "'{%'", null, null, null, null, null, "'/>'", null, 
			null, null, null, "'{'", "'}'", "'!important'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "';'", null, null, null, null, null, null, null, 
			null, "'}}'", "'%}'", "'for'", "'in'", "'endfor'", "'if'", "'elif'", 
			"'else'", "'endif'", "'not'", "'and'", "'or'", null, null, null, null, 
			null, null, "'|'", "'.'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "JINJA_COMMENT", "JINJA_VAR_START", "JINJA_BLOCK_START", "HTML_COMMENT", 
			"HTML_CONDITIONAL_COMMENT", "XML_DECLARATION", "CDATA", "DOCTYPE", "TAG_SLASH_CLOSE", 
			"TAG_OPEN", "TAG_CLOSE", "TAG_SLASH", "CSS_COMMENT", "CSS_LBRACE", "CSS_RBRACE", 
			"IMPORTANT", "STRING", "NUMBER", "CSS_VALUE", "HEX_COLOR", "CSS_PSEUDO", 
			"CSS_CLASS_SELECTOR", "CSS_ID_SELECTOR", "EQ", "NE", "LE", "GE", "LT", 
			"GT", "EQUALS", "COMMA", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
			"COLON", "SEMICOLON", "PLUS", "MINUS", "STAR", "SLASH", "IDENTIFIER", 
			"HTML_TEXT", "WS", "NEWLINE", "JINJA_VAR_END", "JINJA_BLOCK_END", "J_FOR", 
			"J_IN", "J_ENDFOR", "J_IF", "J_ELIF", "J_ELSE", "J_ENDIF", "J_NOT", "J_AND", 
			"J_OR", "J_EQ", "J_NE", "J_LE", "J_GE", "J_LT", "J_GT", "J_PIPE", "J_DOT", 
			"J_PERCENT", "J_EQUALS", "J_COMMA", "J_LPAREN", "J_RPAREN", "J_LBRACKET", 
			"J_RBRACKET", "J_COLON", "J_PLUS", "J_MINUS", "J_STAR", "J_SLASH", "J_STRING", 
			"J_NUMBER", "J_IDENTIFIER", "J_WS"
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
	public String getGrammarFileName() { return "WebParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WebParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(WebParser.EOF, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17591127387646L) != 0)) {
				{
				{
				setState(78);
				content();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(EOF);
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
	public static class ContentContext extends ParserRuleContext {
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	 
		public ContentContext() { }
		public void copyFrom(ContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentContentContext extends ContentContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public HtmlCommentContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterHtmlCommentContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitHtmlCommentContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitHtmlCommentContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CdataContentContext extends ContentContext {
		public CdataContext cdata() {
			return getRuleContext(CdataContext.class,0);
		}
		public CdataContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCdataContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCdataContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCdataContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBlockContentContext extends ContentContext {
		public CssBlockContext cssBlock() {
			return getRuleContext(CssBlockContext.class,0);
		}
		public CssBlockContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCssBlockContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCssBlockContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCssBlockContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContentContext extends ContentContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlElementContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterHtmlElementContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitHtmlElementContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitHtmlElementContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyTextContentContext extends ContentContext {
		public AnyTextContext anyText() {
			return getRuleContext(AnyTextContext.class,0);
		}
		public AnyTextContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterAnyTextContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitAnyTextContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitAnyTextContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCommentContentContext extends ContentContext {
		public JinjaCommentContext jinjaComment() {
			return getRuleContext(JinjaCommentContext.class,0);
		}
		public JinjaCommentContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaCommentContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaCommentContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaCommentContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfContentContext extends ContentContext {
		public JinjaIfContext jinjaIf() {
			return getRuleContext(JinjaIfContext.class,0);
		}
		public JinjaIfContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaIfContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaIfContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaIfContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForContentContext extends ContentContext {
		public JinjaForContext jinjaFor() {
			return getRuleContext(JinjaForContext.class,0);
		}
		public JinjaForContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaForContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaForContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaForContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCommentContentContext extends ContentContext {
		public CssCommentContext cssComment() {
			return getRuleContext(CssCommentContext.class,0);
		}
		public CssCommentContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCssCommentContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCssCommentContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCssCommentContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeContentContext extends ContentContext {
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public DoctypeContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterDoctypeContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitDoctypeContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitDoctypeContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XmlDeclContentContext extends ContentContext {
		public XmlDeclarationContext xmlDeclaration() {
			return getRuleContext(XmlDeclarationContext.class,0);
		}
		public XmlDeclContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterXmlDeclContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitXmlDeclContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitXmlDeclContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVarContentContext extends ContentContext {
		public JinjaVarContext jinjaVar() {
			return getRuleContext(JinjaVarContext.class,0);
		}
		public JinjaVarContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaVarContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaVarContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaVarContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_content);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new DoctypeContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				doctype();
				}
				break;
			case 2:
				_localctx = new HtmlCommentContentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				htmlComment();
				}
				break;
			case 3:
				_localctx = new XmlDeclContentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				xmlDeclaration();
				}
				break;
			case 4:
				_localctx = new CdataContentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				cdata();
				}
				break;
			case 5:
				_localctx = new JinjaCommentContentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				jinjaComment();
				}
				break;
			case 6:
				_localctx = new JinjaForContentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				jinjaFor();
				}
				break;
			case 7:
				_localctx = new JinjaIfContentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				jinjaIf();
				}
				break;
			case 8:
				_localctx = new JinjaVarContentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				jinjaVar();
				}
				break;
			case 9:
				_localctx = new HtmlElementContentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(94);
				htmlElement();
				}
				break;
			case 10:
				_localctx = new CssBlockContentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(95);
				cssBlock();
				}
				break;
			case 11:
				_localctx = new CssCommentContentContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(96);
				cssComment();
				}
				break;
			case 12:
				_localctx = new AnyTextContentContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(97);
				anyText();
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
	public static class AnyTextContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(WebParser.HTML_TEXT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WebParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(WebParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(WebParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(WebParser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(WebParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(WebParser.SEMICOLON, 0); }
		public TerminalNode LPAREN() { return getToken(WebParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(WebParser.RPAREN, 0); }
		public TerminalNode LBRACKET() { return getToken(WebParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(WebParser.RBRACKET, 0); }
		public TerminalNode PLUS() { return getToken(WebParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(WebParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(WebParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(WebParser.SLASH, 0); }
		public TerminalNode EQUALS() { return getToken(WebParser.EQUALS, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(WebParser.TAG_CLOSE, 0); }
		public AnyTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterAnyText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitAnyText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitAnyText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyTextContext anyText() throws RecognitionException {
		AnyTextContext _localctx = new AnyTextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_anyText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17591112697856L) != 0)) ) {
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
	public static class DoctypeContext extends ParserRuleContext {
		public TerminalNode DOCTYPE() { return getToken(WebParser.DOCTYPE, 0); }
		public DoctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doctype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterDoctype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitDoctype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitDoctype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoctypeContext doctype() throws RecognitionException {
		DoctypeContext _localctx = new DoctypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_doctype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(DOCTYPE);
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
	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(WebParser.HTML_COMMENT, 0); }
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(WebParser.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) ) {
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
	public static class XmlDeclarationContext extends ParserRuleContext {
		public TerminalNode XML_DECLARATION() { return getToken(WebParser.XML_DECLARATION, 0); }
		public XmlDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterXmlDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitXmlDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitXmlDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlDeclarationContext xmlDeclaration() throws RecognitionException {
		XmlDeclarationContext _localctx = new XmlDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_xmlDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(XML_DECLARATION);
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
	public static class CdataContext extends ParserRuleContext {
		public TerminalNode CDATA() { return getToken(WebParser.CDATA, 0); }
		public CdataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCdata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CdataContext cdata() throws RecognitionException {
		CdataContext _localctx = new CdataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cdata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(CDATA);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingHtmlElementContext extends HtmlElementContext {
		public Token tagName;
		public TerminalNode TAG_OPEN() { return getToken(WebParser.TAG_OPEN, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(WebParser.TAG_SLASH_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WebParser.IDENTIFIER, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SelfClosingHtmlElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterSelfClosingHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitSelfClosingHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitSelfClosingHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalHtmlElementContext extends HtmlElementContext {
		public Token tagName;
		public Token closeTagName;
		public List<TerminalNode> TAG_OPEN() { return getTokens(WebParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(WebParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(WebParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(WebParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_SLASH() { return getToken(WebParser.TAG_SLASH, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(WebParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(WebParser.IDENTIFIER, i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public NormalHtmlElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterNormalHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitNormalHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitNormalHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpenHtmlElementContext extends HtmlElementContext {
		public Token tagName;
		public TerminalNode TAG_OPEN() { return getToken(WebParser.TAG_OPEN, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(WebParser.TAG_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WebParser.IDENTIFIER, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public OpenHtmlElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterOpenHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitOpenHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitOpenHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new SelfClosingHtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(TAG_OPEN);
				setState(111);
				((SelfClosingHtmlElementContext)_localctx).tagName = match(IDENTIFIER);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(112);
					attribute();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(TAG_SLASH_CLOSE);
				}
				break;
			case 2:
				_localctx = new NormalHtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(TAG_OPEN);
				setState(120);
				((NormalHtmlElementContext)_localctx).tagName = match(IDENTIFIER);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(121);
					attribute();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(TAG_CLOSE);
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						htmlContent();
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(134);
				match(TAG_OPEN);
				setState(135);
				match(TAG_SLASH);
				setState(136);
				((NormalHtmlElementContext)_localctx).closeTagName = match(IDENTIFIER);
				setState(137);
				match(TAG_CLOSE);
				}
				break;
			case 3:
				_localctx = new OpenHtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(TAG_OPEN);
				setState(139);
				((OpenHtmlElementContext)_localctx).tagName = match(IDENTIFIER);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(140);
					attribute();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(TAG_CLOSE);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	 
		public HtmlContentContext() { }
		public void copyFrom(HtmlContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentHtmlContentContext extends HtmlContentContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public HtmlCommentHtmlContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterHtmlCommentHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitHtmlCommentHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitHtmlCommentHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForHtmlContentContext extends HtmlContentContext {
		public JinjaForContext jinjaFor() {
			return getRuleContext(JinjaForContext.class,0);
		}
		public JinjaForHtmlContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaForHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaForHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaForHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfHtmlContentContext extends HtmlContentContext {
		public JinjaIfContext jinjaIf() {
			return getRuleContext(JinjaIfContext.class,0);
		}
		public JinjaIfHtmlContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaIfHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaIfHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaIfHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCommentHtmlContentContext extends HtmlContentContext {
		public JinjaCommentContext jinjaComment() {
			return getRuleContext(JinjaCommentContext.class,0);
		}
		public JinjaCommentHtmlContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaCommentHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaCommentHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaCommentHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CdataHtmlContentContext extends HtmlContentContext {
		public CdataContext cdata() {
			return getRuleContext(CdataContext.class,0);
		}
		public CdataHtmlContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCdataHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCdataHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCdataHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVarHtmlContentContext extends HtmlContentContext {
		public JinjaVarContext jinjaVar() {
			return getRuleContext(JinjaVarContext.class,0);
		}
		public JinjaVarHtmlContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaVarHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaVarHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaVarHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeHtmlContentContext extends HtmlContentContext {
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public DoctypeHtmlContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterDoctypeHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitDoctypeHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitDoctypeHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XmlDeclHtmlContentContext extends HtmlContentContext {
		public XmlDeclarationContext xmlDeclaration() {
			return getRuleContext(XmlDeclarationContext.class,0);
		}
		public XmlDeclHtmlContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterXmlDeclHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitXmlDeclHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitXmlDeclHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyTextHtmlContentContext extends HtmlContentContext {
		public AnyTextContext anyText() {
			return getRuleContext(AnyTextContext.class,0);
		}
		public AnyTextHtmlContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterAnyTextHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitAnyTextHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitAnyTextHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementHtmlContentContext extends HtmlContentContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlElementHtmlContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterHtmlElementHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitHtmlElementHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitHtmlElementHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlContent);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new DoctypeHtmlContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				doctype();
				}
				break;
			case 2:
				_localctx = new HtmlCommentHtmlContentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				htmlComment();
				}
				break;
			case 3:
				_localctx = new XmlDeclHtmlContentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				xmlDeclaration();
				}
				break;
			case 4:
				_localctx = new CdataHtmlContentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				cdata();
				}
				break;
			case 5:
				_localctx = new JinjaCommentHtmlContentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				jinjaComment();
				}
				break;
			case 6:
				_localctx = new JinjaForHtmlContentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				jinjaFor();
				}
				break;
			case 7:
				_localctx = new JinjaIfHtmlContentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				jinjaIf();
				}
				break;
			case 8:
				_localctx = new JinjaVarHtmlContentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				jinjaVar();
				}
				break;
			case 9:
				_localctx = new HtmlElementHtmlContentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(157);
				htmlElement();
				}
				break;
			case 10:
				_localctx = new AnyTextHtmlContentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(158);
				anyText();
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
	public static class AttributeContext extends ParserRuleContext {
		public Token attrName;
		public AttributeValueContext attrValue;
		public TerminalNode IDENTIFIER() { return getToken(WebParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(WebParser.EQUALS, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((AttributeContext)_localctx).attrName = match(IDENTIFIER);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(162);
				match(EQUALS);
				setState(163);
				((AttributeContext)_localctx).attrValue = attributeValue();
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
	public static class AttributeValueContext extends ParserRuleContext {
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
	 
		public AttributeValueContext() { }
		public void copyFrom(AttributeValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierAttrValueContext extends AttributeValueContext {
		public TerminalNode IDENTIFIER() { return getToken(WebParser.IDENTIFIER, 0); }
		public IdentifierAttrValueContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterIdentifierAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitIdentifierAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitIdentifierAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAttrValueContext extends AttributeValueContext {
		public TerminalNode STRING() { return getToken(WebParser.STRING, 0); }
		public StringAttrValueContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterStringAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitStringAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitStringAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVarAttrValueContext extends AttributeValueContext {
		public JinjaVarContext jinjaVar() {
			return getRuleContext(JinjaVarContext.class,0);
		}
		public JinjaVarAttrValueContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaVarAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaVarAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaVarAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberAttrValueContext extends AttributeValueContext {
		public TerminalNode NUMBER() { return getToken(WebParser.NUMBER, 0); }
		public NumberAttrValueContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterNumberAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitNumberAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitNumberAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attributeValue);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringAttrValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierAttrValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				_localctx = new NumberAttrValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(NUMBER);
				}
				break;
			case JINJA_VAR_START:
				_localctx = new JinjaVarAttrValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				jinjaVar();
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
	public static class JinjaCommentContext extends ParserRuleContext {
		public TerminalNode JINJA_COMMENT() { return getToken(WebParser.JINJA_COMMENT, 0); }
		public JinjaCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaCommentContext jinjaComment() throws RecognitionException {
		JinjaCommentContext _localctx = new JinjaCommentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jinjaComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(JINJA_COMMENT);
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
	public static class JinjaVarContext extends ParserRuleContext {
		public TerminalNode JINJA_VAR_START() { return getToken(WebParser.JINJA_VAR_START, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public TerminalNode JINJA_VAR_END() { return getToken(WebParser.JINJA_VAR_END, 0); }
		public JinjaVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaVarContext jinjaVar() throws RecognitionException {
		JinjaVarContext _localctx = new JinjaVarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jinjaVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(JINJA_VAR_START);
			setState(175);
			jinjaExpression();
			setState(176);
			match(JINJA_VAR_END);
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
	public static class JinjaForContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_BLOCK_START() { return getTokens(WebParser.JINJA_BLOCK_START); }
		public TerminalNode JINJA_BLOCK_START(int i) {
			return getToken(WebParser.JINJA_BLOCK_START, i);
		}
		public TerminalNode J_FOR() { return getToken(WebParser.J_FOR, 0); }
		public TerminalNode J_IDENTIFIER() { return getToken(WebParser.J_IDENTIFIER, 0); }
		public TerminalNode J_IN() { return getToken(WebParser.J_IN, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public List<TerminalNode> JINJA_BLOCK_END() { return getTokens(WebParser.JINJA_BLOCK_END); }
		public TerminalNode JINJA_BLOCK_END(int i) {
			return getToken(WebParser.JINJA_BLOCK_END, i);
		}
		public TerminalNode J_ENDFOR() { return getToken(WebParser.J_ENDFOR, 0); }
		public List<ForContentContext> forContent() {
			return getRuleContexts(ForContentContext.class);
		}
		public ForContentContext forContent(int i) {
			return getRuleContext(ForContentContext.class,i);
		}
		public JinjaForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaForContext jinjaFor() throws RecognitionException {
		JinjaForContext _localctx = new JinjaForContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jinjaFor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(JINJA_BLOCK_START);
			setState(179);
			match(J_FOR);
			setState(180);
			match(J_IDENTIFIER);
			setState(181);
			match(J_IN);
			setState(182);
			jinjaExpression();
			setState(183);
			match(JINJA_BLOCK_END);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					forContent();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(190);
			match(JINJA_BLOCK_START);
			setState(191);
			match(J_ENDFOR);
			setState(192);
			match(JINJA_BLOCK_END);
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
	public static class ForContentContext extends ParserRuleContext {
		public ForContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forContent; }
	 
		public ForContentContext() { }
		public void copyFrom(ForContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementForContentContext extends ForContentContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlElementForContentContext(ForContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterHtmlElementForContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitHtmlElementForContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitHtmlElementForContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyTextForContentContext extends ForContentContext {
		public AnyTextContext anyText() {
			return getRuleContext(AnyTextContext.class,0);
		}
		public AnyTextForContentContext(ForContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterAnyTextForContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitAnyTextForContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitAnyTextForContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XmlDeclForContentContext extends ForContentContext {
		public XmlDeclarationContext xmlDeclaration() {
			return getRuleContext(XmlDeclarationContext.class,0);
		}
		public XmlDeclForContentContext(ForContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterXmlDeclForContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitXmlDeclForContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitXmlDeclForContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCommentForContentContext extends ForContentContext {
		public JinjaCommentContext jinjaComment() {
			return getRuleContext(JinjaCommentContext.class,0);
		}
		public JinjaCommentForContentContext(ForContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaCommentForContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaCommentForContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaCommentForContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentForContentContext extends ForContentContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public HtmlCommentForContentContext(ForContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterHtmlCommentForContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitHtmlCommentForContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitHtmlCommentForContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVarForContentContext extends ForContentContext {
		public JinjaVarContext jinjaVar() {
			return getRuleContext(JinjaVarContext.class,0);
		}
		public JinjaVarForContentContext(ForContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaVarForContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaVarForContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaVarForContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeForContentContext extends ForContentContext {
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public DoctypeForContentContext(ForContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterDoctypeForContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitDoctypeForContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitDoctypeForContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfForContentContext extends ForContentContext {
		public JinjaIfContext jinjaIf() {
			return getRuleContext(JinjaIfContext.class,0);
		}
		public JinjaIfForContentContext(ForContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaIfForContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaIfForContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaIfForContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CdataForContentContext extends ForContentContext {
		public CdataContext cdata() {
			return getRuleContext(CdataContext.class,0);
		}
		public CdataForContentContext(ForContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCdataForContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCdataForContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCdataForContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContentContext forContent() throws RecognitionException {
		ForContentContext _localctx = new ForContentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forContent);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOCTYPE:
				_localctx = new DoctypeForContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				doctype();
				}
				break;
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				_localctx = new HtmlCommentForContentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				htmlComment();
				}
				break;
			case XML_DECLARATION:
				_localctx = new XmlDeclForContentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				xmlDeclaration();
				}
				break;
			case CDATA:
				_localctx = new CdataForContentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				cdata();
				}
				break;
			case JINJA_COMMENT:
				_localctx = new JinjaCommentForContentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				jinjaComment();
				}
				break;
			case JINJA_BLOCK_START:
				_localctx = new JinjaIfForContentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				jinjaIf();
				}
				break;
			case JINJA_VAR_START:
				_localctx = new JinjaVarForContentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				jinjaVar();
				}
				break;
			case TAG_OPEN:
				_localctx = new HtmlElementForContentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(201);
				htmlElement();
				}
				break;
			case TAG_CLOSE:
			case STRING:
			case NUMBER:
			case EQUALS:
			case COMMA:
			case LPAREN:
			case RPAREN:
			case LBRACKET:
			case RBRACKET:
			case COLON:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case SLASH:
			case IDENTIFIER:
			case HTML_TEXT:
				_localctx = new AnyTextForContentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(202);
				anyText();
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
	public static class JinjaIfContext extends ParserRuleContext {
		public JinjaExpressionContext condition;
		public List<TerminalNode> JINJA_BLOCK_START() { return getTokens(WebParser.JINJA_BLOCK_START); }
		public TerminalNode JINJA_BLOCK_START(int i) {
			return getToken(WebParser.JINJA_BLOCK_START, i);
		}
		public TerminalNode J_IF() { return getToken(WebParser.J_IF, 0); }
		public List<TerminalNode> JINJA_BLOCK_END() { return getTokens(WebParser.JINJA_BLOCK_END); }
		public TerminalNode JINJA_BLOCK_END(int i) {
			return getToken(WebParser.JINJA_BLOCK_END, i);
		}
		public TerminalNode J_ENDIF() { return getToken(WebParser.J_ENDIF, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public List<IfContentContext> ifContent() {
			return getRuleContexts(IfContentContext.class);
		}
		public IfContentContext ifContent(int i) {
			return getRuleContext(IfContentContext.class,i);
		}
		public List<JinjaElifContext> jinjaElif() {
			return getRuleContexts(JinjaElifContext.class);
		}
		public JinjaElifContext jinjaElif(int i) {
			return getRuleContext(JinjaElifContext.class,i);
		}
		public JinjaElseContext jinjaElse() {
			return getRuleContext(JinjaElseContext.class,0);
		}
		public JinjaIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIfContext jinjaIf() throws RecognitionException {
		JinjaIfContext _localctx = new JinjaIfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jinjaIf);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(JINJA_BLOCK_START);
			setState(206);
			match(J_IF);
			setState(207);
			((JinjaIfContext)_localctx).condition = jinjaExpression();
			setState(208);
			match(JINJA_BLOCK_END);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(209);
					ifContent();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					jinjaElif();
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(221);
				jinjaElse();
				}
				break;
			}
			setState(224);
			match(JINJA_BLOCK_START);
			setState(225);
			match(J_ENDIF);
			setState(226);
			match(JINJA_BLOCK_END);
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
	public static class JinjaElifContext extends ParserRuleContext {
		public JinjaExpressionContext condition;
		public TerminalNode JINJA_BLOCK_START() { return getToken(WebParser.JINJA_BLOCK_START, 0); }
		public TerminalNode J_ELIF() { return getToken(WebParser.J_ELIF, 0); }
		public TerminalNode JINJA_BLOCK_END() { return getToken(WebParser.JINJA_BLOCK_END, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public List<IfContentContext> ifContent() {
			return getRuleContexts(IfContentContext.class);
		}
		public IfContentContext ifContent(int i) {
			return getRuleContext(IfContentContext.class,i);
		}
		public JinjaElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaElif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaElif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElifContext jinjaElif() throws RecognitionException {
		JinjaElifContext _localctx = new JinjaElifContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jinjaElif);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(JINJA_BLOCK_START);
			setState(229);
			match(J_ELIF);
			setState(230);
			((JinjaElifContext)_localctx).condition = jinjaExpression();
			setState(231);
			match(JINJA_BLOCK_END);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(232);
					ifContent();
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class JinjaElseContext extends ParserRuleContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(WebParser.JINJA_BLOCK_START, 0); }
		public TerminalNode J_ELSE() { return getToken(WebParser.J_ELSE, 0); }
		public TerminalNode JINJA_BLOCK_END() { return getToken(WebParser.JINJA_BLOCK_END, 0); }
		public List<IfContentContext> ifContent() {
			return getRuleContexts(IfContentContext.class);
		}
		public IfContentContext ifContent(int i) {
			return getRuleContext(IfContentContext.class,i);
		}
		public JinjaElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElseContext jinjaElse() throws RecognitionException {
		JinjaElseContext _localctx = new JinjaElseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jinjaElse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(JINJA_BLOCK_START);
			setState(239);
			match(J_ELSE);
			setState(240);
			match(JINJA_BLOCK_END);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					ifContent();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	public static class IfContentContext extends ParserRuleContext {
		public IfContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifContent; }
	 
		public IfContentContext() { }
		public void copyFrom(IfContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementIfContentContext extends IfContentContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlElementIfContentContext(IfContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterHtmlElementIfContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitHtmlElementIfContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitHtmlElementIfContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyTextIfContentContext extends IfContentContext {
		public AnyTextContext anyText() {
			return getRuleContext(AnyTextContext.class,0);
		}
		public AnyTextIfContentContext(IfContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterAnyTextIfContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitAnyTextIfContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitAnyTextIfContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForIfContentContext extends IfContentContext {
		public JinjaForContext jinjaFor() {
			return getRuleContext(JinjaForContext.class,0);
		}
		public JinjaForIfContentContext(IfContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaForIfContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaForIfContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaForIfContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CdataIfContentContext extends IfContentContext {
		public CdataContext cdata() {
			return getRuleContext(CdataContext.class,0);
		}
		public CdataIfContentContext(IfContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCdataIfContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCdataIfContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCdataIfContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XmlDeclIfContentContext extends IfContentContext {
		public XmlDeclarationContext xmlDeclaration() {
			return getRuleContext(XmlDeclarationContext.class,0);
		}
		public XmlDeclIfContentContext(IfContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterXmlDeclIfContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitXmlDeclIfContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitXmlDeclIfContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeIfContentContext extends IfContentContext {
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public DoctypeIfContentContext(IfContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterDoctypeIfContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitDoctypeIfContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitDoctypeIfContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCommentIfContentContext extends IfContentContext {
		public JinjaCommentContext jinjaComment() {
			return getRuleContext(JinjaCommentContext.class,0);
		}
		public JinjaCommentIfContentContext(IfContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaCommentIfContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaCommentIfContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaCommentIfContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentIfContentContext extends IfContentContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public HtmlCommentIfContentContext(IfContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterHtmlCommentIfContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitHtmlCommentIfContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitHtmlCommentIfContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVarIfContentContext extends IfContentContext {
		public JinjaVarContext jinjaVar() {
			return getRuleContext(JinjaVarContext.class,0);
		}
		public JinjaVarIfContentContext(IfContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaVarIfContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaVarIfContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaVarIfContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContentContext ifContent() throws RecognitionException {
		IfContentContext _localctx = new IfContentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifContent);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOCTYPE:
				_localctx = new DoctypeIfContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				doctype();
				}
				break;
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				_localctx = new HtmlCommentIfContentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				htmlComment();
				}
				break;
			case XML_DECLARATION:
				_localctx = new XmlDeclIfContentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				xmlDeclaration();
				}
				break;
			case CDATA:
				_localctx = new CdataIfContentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				cdata();
				}
				break;
			case JINJA_COMMENT:
				_localctx = new JinjaCommentIfContentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				jinjaComment();
				}
				break;
			case JINJA_BLOCK_START:
				_localctx = new JinjaForIfContentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				jinjaFor();
				}
				break;
			case JINJA_VAR_START:
				_localctx = new JinjaVarIfContentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				jinjaVar();
				}
				break;
			case TAG_OPEN:
				_localctx = new HtmlElementIfContentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				htmlElement();
				}
				break;
			case TAG_CLOSE:
			case STRING:
			case NUMBER:
			case EQUALS:
			case COMMA:
			case LPAREN:
			case RPAREN:
			case LBRACKET:
			case RBRACKET:
			case COLON:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case SLASH:
			case IDENTIFIER:
			case HTML_TEXT:
				_localctx = new AnyTextIfContentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(255);
				anyText();
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
	public static class JinjaExpressionContext extends ParserRuleContext {
		public JinjaTernaryContext jinjaTernary() {
			return getRuleContext(JinjaTernaryContext.class,0);
		}
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExpressionContext jinjaExpression() throws RecognitionException {
		JinjaExpressionContext _localctx = new JinjaExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			jinjaTernary();
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
	public static class JinjaTernaryContext extends ParserRuleContext {
		public List<JinjaLogicalContext> jinjaLogical() {
			return getRuleContexts(JinjaLogicalContext.class);
		}
		public JinjaLogicalContext jinjaLogical(int i) {
			return getRuleContext(JinjaLogicalContext.class,i);
		}
		public TerminalNode J_IF() { return getToken(WebParser.J_IF, 0); }
		public TerminalNode J_ELSE() { return getToken(WebParser.J_ELSE, 0); }
		public JinjaTernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaTernary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaTernary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaTernaryContext jinjaTernary() throws RecognitionException {
		JinjaTernaryContext _localctx = new JinjaTernaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jinjaTernary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			jinjaLogical();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_IF) {
				{
				setState(261);
				match(J_IF);
				setState(262);
				jinjaLogical();
				setState(263);
				match(J_ELSE);
				setState(264);
				jinjaLogical();
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
	public static class JinjaLogicalContext extends ParserRuleContext {
		public List<JinjaComparisonContext> jinjaComparison() {
			return getRuleContexts(JinjaComparisonContext.class);
		}
		public JinjaComparisonContext jinjaComparison(int i) {
			return getRuleContext(JinjaComparisonContext.class,i);
		}
		public List<TerminalNode> J_AND() { return getTokens(WebParser.J_AND); }
		public TerminalNode J_AND(int i) {
			return getToken(WebParser.J_AND, i);
		}
		public List<TerminalNode> J_OR() { return getTokens(WebParser.J_OR); }
		public TerminalNode J_OR(int i) {
			return getToken(WebParser.J_OR, i);
		}
		public JinjaLogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaLogical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaLogicalContext jinjaLogical() throws RecognitionException {
		JinjaLogicalContext _localctx = new JinjaLogicalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jinjaLogical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			jinjaComparison();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_AND || _la==J_OR) {
				{
				{
				setState(269);
				_la = _input.LA(1);
				if ( !(_la==J_AND || _la==J_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				jinjaComparison();
				}
				}
				setState(275);
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
	public static class JinjaComparisonContext extends ParserRuleContext {
		public List<JinjaAdditiveContext> jinjaAdditive() {
			return getRuleContexts(JinjaAdditiveContext.class);
		}
		public JinjaAdditiveContext jinjaAdditive(int i) {
			return getRuleContext(JinjaAdditiveContext.class,i);
		}
		public List<TerminalNode> J_EQ() { return getTokens(WebParser.J_EQ); }
		public TerminalNode J_EQ(int i) {
			return getToken(WebParser.J_EQ, i);
		}
		public List<TerminalNode> J_NE() { return getTokens(WebParser.J_NE); }
		public TerminalNode J_NE(int i) {
			return getToken(WebParser.J_NE, i);
		}
		public List<TerminalNode> J_LE() { return getTokens(WebParser.J_LE); }
		public TerminalNode J_LE(int i) {
			return getToken(WebParser.J_LE, i);
		}
		public List<TerminalNode> J_GE() { return getTokens(WebParser.J_GE); }
		public TerminalNode J_GE(int i) {
			return getToken(WebParser.J_GE, i);
		}
		public List<TerminalNode> J_LT() { return getTokens(WebParser.J_LT); }
		public TerminalNode J_LT(int i) {
			return getToken(WebParser.J_LT, i);
		}
		public List<TerminalNode> J_GT() { return getTokens(WebParser.J_GT); }
		public TerminalNode J_GT(int i) {
			return getToken(WebParser.J_GT, i);
		}
		public JinjaComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaComparisonContext jinjaComparison() throws RecognitionException {
		JinjaComparisonContext _localctx = new JinjaComparisonContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jinjaComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			jinjaAdditive();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -288230376151711744L) != 0)) {
				{
				{
				setState(277);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -288230376151711744L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(278);
				jinjaAdditive();
				}
				}
				setState(283);
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
	public static class JinjaAdditiveContext extends ParserRuleContext {
		public List<JinjaMultiplicativeContext> jinjaMultiplicative() {
			return getRuleContexts(JinjaMultiplicativeContext.class);
		}
		public JinjaMultiplicativeContext jinjaMultiplicative(int i) {
			return getRuleContext(JinjaMultiplicativeContext.class,i);
		}
		public List<TerminalNode> J_PLUS() { return getTokens(WebParser.J_PLUS); }
		public TerminalNode J_PLUS(int i) {
			return getToken(WebParser.J_PLUS, i);
		}
		public List<TerminalNode> J_MINUS() { return getTokens(WebParser.J_MINUS); }
		public TerminalNode J_MINUS(int i) {
			return getToken(WebParser.J_MINUS, i);
		}
		public JinjaAdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaAdditive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaAdditive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaAdditiveContext jinjaAdditive() throws RecognitionException {
		JinjaAdditiveContext _localctx = new JinjaAdditiveContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jinjaAdditive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			jinjaMultiplicative();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_PLUS || _la==J_MINUS) {
				{
				{
				setState(285);
				_la = _input.LA(1);
				if ( !(_la==J_PLUS || _la==J_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(286);
				jinjaMultiplicative();
				}
				}
				setState(291);
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
	public static class JinjaMultiplicativeContext extends ParserRuleContext {
		public List<JinjaUnaryContext> jinjaUnary() {
			return getRuleContexts(JinjaUnaryContext.class);
		}
		public JinjaUnaryContext jinjaUnary(int i) {
			return getRuleContext(JinjaUnaryContext.class,i);
		}
		public List<TerminalNode> J_STAR() { return getTokens(WebParser.J_STAR); }
		public TerminalNode J_STAR(int i) {
			return getToken(WebParser.J_STAR, i);
		}
		public List<TerminalNode> J_SLASH() { return getTokens(WebParser.J_SLASH); }
		public TerminalNode J_SLASH(int i) {
			return getToken(WebParser.J_SLASH, i);
		}
		public List<TerminalNode> J_PERCENT() { return getTokens(WebParser.J_PERCENT); }
		public TerminalNode J_PERCENT(int i) {
			return getToken(WebParser.J_PERCENT, i);
		}
		public JinjaMultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaMultiplicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaMultiplicative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaMultiplicative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaMultiplicativeContext jinjaMultiplicative() throws RecognitionException {
		JinjaMultiplicativeContext _localctx = new JinjaMultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_jinjaMultiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			jinjaUnary();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 3073L) != 0)) {
				{
				{
				setState(293);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 3073L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(294);
				jinjaUnary();
				}
				}
				setState(299);
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
	public static class JinjaUnaryContext extends ParserRuleContext {
		public JinjaUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaUnary; }
	 
		public JinjaUnaryContext() { }
		public void copyFrom(JinjaUnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterUnaryContext extends JinjaUnaryContext {
		public JinjaFilterContext jinjaFilter() {
			return getRuleContext(JinjaFilterContext.class,0);
		}
		public FilterUnaryContext(JinjaUnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterFilterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitFilterUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitFilterUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotUnaryContext extends JinjaUnaryContext {
		public TerminalNode J_NOT() { return getToken(WebParser.J_NOT, 0); }
		public JinjaUnaryContext jinjaUnary() {
			return getRuleContext(JinjaUnaryContext.class,0);
		}
		public NotUnaryContext(JinjaUnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterNotUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitNotUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitNotUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaUnaryContext jinjaUnary() throws RecognitionException {
		JinjaUnaryContext _localctx = new JinjaUnaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jinjaUnary);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_NOT:
				_localctx = new NotUnaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(J_NOT);
				setState(301);
				jinjaUnary();
				}
				break;
			case J_LPAREN:
			case J_STRING:
			case J_NUMBER:
			case J_IDENTIFIER:
				_localctx = new FilterUnaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				jinjaFilter();
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
	public static class JinjaFilterContext extends ParserRuleContext {
		public Token filterName;
		public JinjaPostfixContext jinjaPostfix() {
			return getRuleContext(JinjaPostfixContext.class,0);
		}
		public List<TerminalNode> J_PIPE() { return getTokens(WebParser.J_PIPE); }
		public TerminalNode J_PIPE(int i) {
			return getToken(WebParser.J_PIPE, i);
		}
		public List<TerminalNode> J_IDENTIFIER() { return getTokens(WebParser.J_IDENTIFIER); }
		public TerminalNode J_IDENTIFIER(int i) {
			return getToken(WebParser.J_IDENTIFIER, i);
		}
		public List<TerminalNode> J_LPAREN() { return getTokens(WebParser.J_LPAREN); }
		public TerminalNode J_LPAREN(int i) {
			return getToken(WebParser.J_LPAREN, i);
		}
		public List<TerminalNode> J_RPAREN() { return getTokens(WebParser.J_RPAREN); }
		public TerminalNode J_RPAREN(int i) {
			return getToken(WebParser.J_RPAREN, i);
		}
		public List<JinjaArgumentsContext> jinjaArguments() {
			return getRuleContexts(JinjaArgumentsContext.class);
		}
		public JinjaArgumentsContext jinjaArguments(int i) {
			return getRuleContext(JinjaArgumentsContext.class,i);
		}
		public JinjaFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaFilterContext jinjaFilter() throws RecognitionException {
		JinjaFilterContext _localctx = new JinjaFilterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jinjaFilter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			jinjaPostfix();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_PIPE) {
				{
				{
				setState(306);
				match(J_PIPE);
				setState(307);
				((JinjaFilterContext)_localctx).filterName = match(J_IDENTIFIER);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==J_LPAREN) {
					{
					setState(308);
					match(J_LPAREN);
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 58736641L) != 0)) {
						{
						setState(309);
						jinjaArguments();
						}
					}

					setState(312);
					match(J_RPAREN);
					}
				}

				}
				}
				setState(319);
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
	public static class JinjaPostfixContext extends ParserRuleContext {
		public JinjaPrimaryContext jinjaPrimary() {
			return getRuleContext(JinjaPrimaryContext.class,0);
		}
		public List<JinjaPostfixOpContext> jinjaPostfixOp() {
			return getRuleContexts(JinjaPostfixOpContext.class);
		}
		public JinjaPostfixOpContext jinjaPostfixOp(int i) {
			return getRuleContext(JinjaPostfixOpContext.class,i);
		}
		public JinjaPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaPostfixContext jinjaPostfix() throws RecognitionException {
		JinjaPostfixContext _localctx = new JinjaPostfixContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_jinjaPostfix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			jinjaPrimary();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 81L) != 0)) {
				{
				{
				setState(321);
				jinjaPostfixOp();
				}
				}
				setState(326);
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
	public static class JinjaPostfixOpContext extends ParserRuleContext {
		public JinjaPostfixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaPostfixOp; }
	 
		public JinjaPostfixOpContext() { }
		public void copyFrom(JinjaPostfixOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallOpContext extends JinjaPostfixOpContext {
		public TerminalNode J_LPAREN() { return getToken(WebParser.J_LPAREN, 0); }
		public TerminalNode J_RPAREN() { return getToken(WebParser.J_RPAREN, 0); }
		public JinjaArgumentsContext jinjaArguments() {
			return getRuleContext(JinjaArgumentsContext.class,0);
		}
		public FunctionCallOpContext(JinjaPostfixOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterFunctionCallOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitFunctionCallOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitFunctionCallOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexAccessOpContext extends JinjaPostfixOpContext {
		public JinjaExpressionContext index;
		public TerminalNode J_LBRACKET() { return getToken(WebParser.J_LBRACKET, 0); }
		public TerminalNode J_RBRACKET() { return getToken(WebParser.J_RBRACKET, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public IndexAccessOpContext(JinjaPostfixOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterIndexAccessOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitIndexAccessOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitIndexAccessOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessOpContext extends JinjaPostfixOpContext {
		public Token member;
		public TerminalNode J_DOT() { return getToken(WebParser.J_DOT, 0); }
		public TerminalNode J_IDENTIFIER() { return getToken(WebParser.J_IDENTIFIER, 0); }
		public TerminalNode J_LPAREN() { return getToken(WebParser.J_LPAREN, 0); }
		public TerminalNode J_RPAREN() { return getToken(WebParser.J_RPAREN, 0); }
		public JinjaArgumentsContext jinjaArguments() {
			return getRuleContext(JinjaArgumentsContext.class,0);
		}
		public MemberAccessOpContext(JinjaPostfixOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterMemberAccessOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitMemberAccessOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitMemberAccessOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaPostfixOpContext jinjaPostfixOp() throws RecognitionException {
		JinjaPostfixOpContext _localctx = new JinjaPostfixOpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_jinjaPostfixOp);
		int _la;
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_DOT:
				_localctx = new MemberAccessOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(J_DOT);
				setState(328);
				((MemberAccessOpContext)_localctx).member = match(J_IDENTIFIER);
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(329);
					match(J_LPAREN);
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 58736641L) != 0)) {
						{
						setState(330);
						jinjaArguments();
						}
					}

					setState(333);
					match(J_RPAREN);
					}
					break;
				}
				}
				break;
			case J_LBRACKET:
				_localctx = new IndexAccessOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(J_LBRACKET);
				setState(337);
				((IndexAccessOpContext)_localctx).index = jinjaExpression();
				setState(338);
				match(J_RBRACKET);
				}
				break;
			case J_LPAREN:
				_localctx = new FunctionCallOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				match(J_LPAREN);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 58736641L) != 0)) {
					{
					setState(341);
					jinjaArguments();
					}
				}

				setState(344);
				match(J_RPAREN);
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
	public static class JinjaPrimaryContext extends ParserRuleContext {
		public JinjaPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaPrimary; }
	 
		public JinjaPrimaryContext() { }
		public void copyFrom(JinjaPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringPrimaryContext extends JinjaPrimaryContext {
		public TerminalNode J_STRING() { return getToken(WebParser.J_STRING, 0); }
		public StringPrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterStringPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitStringPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitStringPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierPrimaryContext extends JinjaPrimaryContext {
		public TerminalNode J_IDENTIFIER() { return getToken(WebParser.J_IDENTIFIER, 0); }
		public IdentifierPrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterIdentifierPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitIdentifierPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitIdentifierPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberPrimaryContext extends JinjaPrimaryContext {
		public TerminalNode J_NUMBER() { return getToken(WebParser.J_NUMBER, 0); }
		public NumberPrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterNumberPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitNumberPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitNumberPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenPrimaryContext extends JinjaPrimaryContext {
		public TerminalNode J_LPAREN() { return getToken(WebParser.J_LPAREN, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public TerminalNode J_RPAREN() { return getToken(WebParser.J_RPAREN, 0); }
		public ParenPrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterParenPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitParenPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitParenPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaPrimaryContext jinjaPrimary() throws RecognitionException {
		JinjaPrimaryContext _localctx = new JinjaPrimaryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_jinjaPrimary);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_IDENTIFIER:
				_localctx = new IdentifierPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(J_IDENTIFIER);
				}
				break;
			case J_STRING:
				_localctx = new StringPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(J_STRING);
				}
				break;
			case J_NUMBER:
				_localctx = new NumberPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(J_NUMBER);
				}
				break;
			case J_LPAREN:
				_localctx = new ParenPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(J_LPAREN);
				setState(351);
				jinjaExpression();
				setState(352);
				match(J_RPAREN);
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
	public static class JinjaArgumentsContext extends ParserRuleContext {
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
		}
		public List<TerminalNode> J_COMMA() { return getTokens(WebParser.J_COMMA); }
		public TerminalNode J_COMMA(int i) {
			return getToken(WebParser.J_COMMA, i);
		}
		public JinjaArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaArgumentsContext jinjaArguments() throws RecognitionException {
		JinjaArgumentsContext _localctx = new JinjaArgumentsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_jinjaArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			jinjaExpression();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(357);
				match(J_COMMA);
				setState(358);
				jinjaExpression();
				}
				}
				setState(363);
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
	public static class CssBlockContext extends ParserRuleContext {
		public CssSelectorContext cssSelector() {
			return getRuleContext(CssSelectorContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(WebParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(WebParser.CSS_RBRACE, 0); }
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public CssBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCssBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCssBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCssBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBlockContext cssBlock() throws RecognitionException {
		CssBlockContext _localctx = new CssBlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cssBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			cssSelector();
			setState(365);
			match(CSS_LBRACE);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(366);
				cssDeclaration();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(CSS_RBRACE);
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
	public static class CssSelectorContext extends ParserRuleContext {
		public List<CssSelectorPartContext> cssSelectorPart() {
			return getRuleContexts(CssSelectorPartContext.class);
		}
		public CssSelectorPartContext cssSelectorPart(int i) {
			return getRuleContext(CssSelectorPartContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WebParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WebParser.COMMA, i);
		}
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cssSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			cssSelectorPart();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(375);
				match(COMMA);
				setState(376);
				cssSelectorPart();
				}
				}
				setState(381);
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
	public static class CssSelectorPartContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(WebParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(WebParser.IDENTIFIER, i);
		}
		public List<TerminalNode> CSS_CLASS_SELECTOR() { return getTokens(WebParser.CSS_CLASS_SELECTOR); }
		public TerminalNode CSS_CLASS_SELECTOR(int i) {
			return getToken(WebParser.CSS_CLASS_SELECTOR, i);
		}
		public List<TerminalNode> CSS_ID_SELECTOR() { return getTokens(WebParser.CSS_ID_SELECTOR); }
		public TerminalNode CSS_ID_SELECTOR(int i) {
			return getToken(WebParser.CSS_ID_SELECTOR, i);
		}
		public List<TerminalNode> CSS_PSEUDO() { return getTokens(WebParser.CSS_PSEUDO); }
		public TerminalNode CSS_PSEUDO(int i) {
			return getToken(WebParser.CSS_PSEUDO, i);
		}
		public List<TerminalNode> TAG_OPEN() { return getTokens(WebParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(WebParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(WebParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(WebParser.TAG_CLOSE, i);
		}
		public List<TerminalNode> HTML_TEXT() { return getTokens(WebParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(WebParser.HTML_TEXT, i);
		}
		public CssSelectorPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelectorPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCssSelectorPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCssSelectorPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCssSelectorPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorPartContext cssSelectorPart() throws RecognitionException {
		CssSelectorPartContext _localctx = new CssSelectorPartContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cssSelectorPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(382);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13194154216448L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(385); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 13194154216448L) != 0) );
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
	public static class CssDeclarationContext extends ParserRuleContext {
		public CssPropertyContext cssProperty() {
			return getRuleContext(CssPropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(WebParser.COLON, 0); }
		public CssValueListContext cssValueList() {
			return getRuleContext(CssValueListContext.class,0);
		}
		public TerminalNode IMPORTANT() { return getToken(WebParser.IMPORTANT, 0); }
		public TerminalNode SEMICOLON() { return getToken(WebParser.SEMICOLON, 0); }
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cssDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			cssProperty();
			setState(388);
			match(COLON);
			setState(389);
			cssValueList();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTANT) {
				{
				setState(390);
				match(IMPORTANT);
				}
			}

			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(393);
				match(SEMICOLON);
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
	public static class CssPropertyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(WebParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(WebParser.IDENTIFIER, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(WebParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(WebParser.MINUS, i);
		}
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCssProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCssProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(IDENTIFIER);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(397);
				match(MINUS);
				setState(398);
				match(IDENTIFIER);
				}
				}
				setState(403);
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
	public static class CssValueListContext extends ParserRuleContext {
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public CssValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCssValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCssValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCssValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueListContext cssValueList() throws RecognitionException {
		CssValueListContext _localctx = new CssValueListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cssValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(404);
					cssValue();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(407); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
	public static class CssValueContext extends ParserRuleContext {
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
	 
		public CssValueContext() { }
		public void copyFrom(CssValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagOpenCssValueContext extends CssValueContext {
		public TerminalNode TAG_OPEN() { return getToken(WebParser.TAG_OPEN, 0); }
		public TagOpenCssValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterTagOpenCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitTagOpenCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitTagOpenCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColonCssValueContext extends CssValueContext {
		public TerminalNode COLON() { return getToken(WebParser.COLON, 0); }
		public ColonCssValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterColonCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitColonCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitColonCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexColorValueContext extends CssValueContext {
		public TerminalNode HEX_COLOR() { return getToken(WebParser.HEX_COLOR, 0); }
		public HexColorValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterHexColorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitHexColorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitHexColorValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenCssValueContext extends CssValueContext {
		public TerminalNode LPAREN() { return getToken(WebParser.LPAREN, 0); }
		public CssValueListContext cssValueList() {
			return getRuleContext(CssValueListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WebParser.RPAREN, 0); }
		public ParenCssValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterParenCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitParenCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitParenCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaCssValueContext extends CssValueContext {
		public TerminalNode COMMA() { return getToken(WebParser.COMMA, 0); }
		public CommaCssValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCommaCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCommaCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCommaCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringCssValueContext extends CssValueContext {
		public TerminalNode STRING() { return getToken(WebParser.STRING, 0); }
		public StringCssValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterStringCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitStringCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitStringCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierCssValueContext extends CssValueContext {
		public TerminalNode IDENTIFIER() { return getToken(WebParser.IDENTIFIER, 0); }
		public IdentifierCssValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterIdentifierCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitIdentifierCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitIdentifierCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueTokenContext extends CssValueContext {
		public TerminalNode CSS_VALUE() { return getToken(WebParser.CSS_VALUE, 0); }
		public CssValueTokenContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCssValueToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCssValueToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCssValueToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericCssValueContext extends CssValueContext {
		public TerminalNode NUMBER() { return getToken(WebParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(WebParser.MINUS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WebParser.IDENTIFIER, 0); }
		public TerminalNode CSS_VALUE() { return getToken(WebParser.CSS_VALUE, 0); }
		public NumericCssValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterNumericCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitNumericCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitNumericCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberCssValueContext extends CssValueContext {
		public TerminalNode NUMBER() { return getToken(WebParser.NUMBER, 0); }
		public NumberCssValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterNumberCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitNumberCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitNumberCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextCssValueContext extends CssValueContext {
		public TerminalNode HTML_TEXT() { return getToken(WebParser.HTML_TEXT, 0); }
		public TextCssValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterTextCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitTextCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitTextCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagCloseCssValueContext extends CssValueContext {
		public TerminalNode TAG_CLOSE() { return getToken(WebParser.TAG_CLOSE, 0); }
		public TagCloseCssValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterTagCloseCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitTagCloseCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitTagCloseCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cssValue);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new IdentifierCssValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new NumberCssValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(NUMBER);
				}
				break;
			case 3:
				_localctx = new StringCssValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new CssValueTokenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
				match(CSS_VALUE);
				}
				break;
			case 5:
				_localctx = new HexColorValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				match(HEX_COLOR);
				}
				break;
			case 6:
				_localctx = new TextCssValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(414);
				match(HTML_TEXT);
				}
				break;
			case 7:
				_localctx = new NumericCssValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(415);
					match(MINUS);
					}
				}

				setState(418);
				match(NUMBER);
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(419);
					_la = _input.LA(1);
					if ( !(_la==CSS_VALUE || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new ParenCssValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(422);
				match(LPAREN);
				setState(423);
				cssValueList();
				setState(424);
				match(RPAREN);
				}
				break;
			case 9:
				_localctx = new CommaCssValueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(426);
				match(COMMA);
				}
				break;
			case 10:
				_localctx = new TagOpenCssValueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(427);
				match(TAG_OPEN);
				}
				break;
			case 11:
				_localctx = new TagCloseCssValueContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(428);
				match(TAG_CLOSE);
				}
				break;
			case 12:
				_localctx = new ColonCssValueContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(429);
				match(COLON);
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
	public static class CssCommentContext extends ParserRuleContext {
		public TerminalNode CSS_COMMENT() { return getToken(WebParser.CSS_COMMENT, 0); }
		public CssCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterCssComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitCssComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitCssComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssCommentContext cssComment() throws RecognitionException {
		CssCommentContext _localctx = new CssCommentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cssComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(CSS_COMMENT);
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
		"\u0004\u0001Q\u01b3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0005\u0000"+
		"P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"c\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007r\b\u0007\n\u0007\f\u0007u\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007{\b\u0007"+
		"\n\u0007\f\u0007~\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0082\b"+
		"\u0007\n\u0007\f\u0007\u0085\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u008e\b\u0007"+
		"\n\u0007\f\u0007\u0091\t\u0007\u0001\u0007\u0003\u0007\u0094\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00a0\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u00a5\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u00ab\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00ba\b\r\n\r\f\r\u00bd\t\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cc\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d3"+
		"\b\u000f\n\u000f\f\u000f\u00d6\t\u000f\u0001\u000f\u0005\u000f\u00d9\b"+
		"\u000f\n\u000f\f\u000f\u00dc\t\u000f\u0001\u000f\u0003\u000f\u00df\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00ea\b\u0010\n\u0010"+
		"\f\u0010\u00ed\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00f3\b\u0011\n\u0011\f\u0011\u00f6\t\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0101\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u010b\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0110"+
		"\b\u0015\n\u0015\f\u0015\u0113\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0118\b\u0016\n\u0016\f\u0016\u011b\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0120\b\u0017\n\u0017\f\u0017\u0123\t\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0128\b\u0018\n\u0018"+
		"\f\u0018\u012b\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0130\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0137\b\u001a\u0001\u001a\u0003\u001a\u013a\b\u001a\u0005"+
		"\u001a\u013c\b\u001a\n\u001a\f\u001a\u013f\t\u001a\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u0143\b\u001b\n\u001b\f\u001b\u0146\t\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u014c\b\u001c\u0001\u001c\u0003"+
		"\u001c\u014f\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0157\b\u001c\u0001\u001c\u0003\u001c\u015a"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u0163\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0005\u001e\u0168\b\u001e\n\u001e\f\u001e\u016b\t\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u0170\b\u001f\n\u001f\f\u001f\u0173"+
		"\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0005 \u017a\b "+
		"\n \f \u017d\t \u0001!\u0004!\u0180\b!\u000b!\f!\u0181\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0003\"\u0188\b\"\u0001\"\u0003\"\u018b\b\"\u0001#\u0001"+
		"#\u0001#\u0005#\u0190\b#\n#\f#\u0193\t#\u0001$\u0004$\u0196\b$\u000b$"+
		"\f$\u0197\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01a1"+
		"\b%\u0001%\u0001%\u0003%\u01a5\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u01af\b%\u0001&\u0001&\u0001&\u0000\u0000\'\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJL\u0000\b\u0003\u0000\u000b\u000b\u0011\u0012"+
		"\u001e+\u0001\u0000\u0004\u0005\u0001\u000089\u0001\u0000:?\u0001\u0000"+
		"JK\u0002\u0000BBLM\u0003\u0000\n\u000b\u0015\u0017*+\u0002\u0000\u0013"+
		"\u0013**\u01e7\u0000Q\u0001\u0000\u0000\u0000\u0002b\u0001\u0000\u0000"+
		"\u0000\u0004d\u0001\u0000\u0000\u0000\u0006f\u0001\u0000\u0000\u0000\b"+
		"h\u0001\u0000\u0000\u0000\nj\u0001\u0000\u0000\u0000\fl\u0001\u0000\u0000"+
		"\u0000\u000e\u0093\u0001\u0000\u0000\u0000\u0010\u009f\u0001\u0000\u0000"+
		"\u0000\u0012\u00a1\u0001\u0000\u0000\u0000\u0014\u00aa\u0001\u0000\u0000"+
		"\u0000\u0016\u00ac\u0001\u0000\u0000\u0000\u0018\u00ae\u0001\u0000\u0000"+
		"\u0000\u001a\u00b2\u0001\u0000\u0000\u0000\u001c\u00cb\u0001\u0000\u0000"+
		"\u0000\u001e\u00cd\u0001\u0000\u0000\u0000 \u00e4\u0001\u0000\u0000\u0000"+
		"\"\u00ee\u0001\u0000\u0000\u0000$\u0100\u0001\u0000\u0000\u0000&\u0102"+
		"\u0001\u0000\u0000\u0000(\u0104\u0001\u0000\u0000\u0000*\u010c\u0001\u0000"+
		"\u0000\u0000,\u0114\u0001\u0000\u0000\u0000.\u011c\u0001\u0000\u0000\u0000"+
		"0\u0124\u0001\u0000\u0000\u00002\u012f\u0001\u0000\u0000\u00004\u0131"+
		"\u0001\u0000\u0000\u00006\u0140\u0001\u0000\u0000\u00008\u0159\u0001\u0000"+
		"\u0000\u0000:\u0162\u0001\u0000\u0000\u0000<\u0164\u0001\u0000\u0000\u0000"+
		">\u016c\u0001\u0000\u0000\u0000@\u0176\u0001\u0000\u0000\u0000B\u017f"+
		"\u0001\u0000\u0000\u0000D\u0183\u0001\u0000\u0000\u0000F\u018c\u0001\u0000"+
		"\u0000\u0000H\u0195\u0001\u0000\u0000\u0000J\u01ae\u0001\u0000\u0000\u0000"+
		"L\u01b0\u0001\u0000\u0000\u0000NP\u0003\u0002\u0001\u0000ON\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"TU\u0005\u0000\u0000\u0001U\u0001\u0001\u0000\u0000\u0000Vc\u0003\u0006"+
		"\u0003\u0000Wc\u0003\b\u0004\u0000Xc\u0003\n\u0005\u0000Yc\u0003\f\u0006"+
		"\u0000Zc\u0003\u0016\u000b\u0000[c\u0003\u001a\r\u0000\\c\u0003\u001e"+
		"\u000f\u0000]c\u0003\u0018\f\u0000^c\u0003\u000e\u0007\u0000_c\u0003>"+
		"\u001f\u0000`c\u0003L&\u0000ac\u0003\u0004\u0002\u0000bV\u0001\u0000\u0000"+
		"\u0000bW\u0001\u0000\u0000\u0000bX\u0001\u0000\u0000\u0000bY\u0001\u0000"+
		"\u0000\u0000bZ\u0001\u0000\u0000\u0000b[\u0001\u0000\u0000\u0000b\\\u0001"+
		"\u0000\u0000\u0000b]\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000"+
		"b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000c\u0003\u0001\u0000\u0000\u0000de\u0007\u0000\u0000\u0000e\u0005"+
		"\u0001\u0000\u0000\u0000fg\u0005\b\u0000\u0000g\u0007\u0001\u0000\u0000"+
		"\u0000hi\u0007\u0001\u0000\u0000i\t\u0001\u0000\u0000\u0000jk\u0005\u0006"+
		"\u0000\u0000k\u000b\u0001\u0000\u0000\u0000lm\u0005\u0007\u0000\u0000"+
		"m\r\u0001\u0000\u0000\u0000no\u0005\n\u0000\u0000os\u0005*\u0000\u0000"+
		"pr\u0003\u0012\t\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000v\u0094\u0005\t\u0000\u0000wx\u0005\n"+
		"\u0000\u0000x|\u0005*\u0000\u0000y{\u0003\u0012\t\u0000zy\u0001\u0000"+
		"\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000\u007f\u0083\u0005\u000b\u0000\u0000\u0080\u0082\u0003\u0010\b\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005\n\u0000\u0000\u0087\u0088\u0005\f\u0000\u0000\u0088"+
		"\u0089\u0005*\u0000\u0000\u0089\u0094\u0005\u000b\u0000\u0000\u008a\u008b"+
		"\u0005\n\u0000\u0000\u008b\u008f\u0005*\u0000\u0000\u008c\u008e\u0003"+
		"\u0012\t\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u0094\u0005\u000b\u0000\u0000\u0093n\u0001\u0000\u0000"+
		"\u0000\u0093w\u0001\u0000\u0000\u0000\u0093\u008a\u0001\u0000\u0000\u0000"+
		"\u0094\u000f\u0001\u0000\u0000\u0000\u0095\u00a0\u0003\u0006\u0003\u0000"+
		"\u0096\u00a0\u0003\b\u0004\u0000\u0097\u00a0\u0003\n\u0005\u0000\u0098"+
		"\u00a0\u0003\f\u0006\u0000\u0099\u00a0\u0003\u0016\u000b\u0000\u009a\u00a0"+
		"\u0003\u001a\r\u0000\u009b\u00a0\u0003\u001e\u000f\u0000\u009c\u00a0\u0003"+
		"\u0018\f\u0000\u009d\u00a0\u0003\u000e\u0007\u0000\u009e\u00a0\u0003\u0004"+
		"\u0002\u0000\u009f\u0095\u0001\u0000\u0000\u0000\u009f\u0096\u0001\u0000"+
		"\u0000\u0000\u009f\u0097\u0001\u0000\u0000\u0000\u009f\u0098\u0001\u0000"+
		"\u0000\u0000\u009f\u0099\u0001\u0000\u0000\u0000\u009f\u009a\u0001\u0000"+
		"\u0000\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u009f\u009c\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u0011\u0001\u0000\u0000\u0000\u00a1\u00a4\u0005*\u0000"+
		"\u0000\u00a2\u00a3\u0005\u001e\u0000\u0000\u00a3\u00a5\u0003\u0014\n\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u0013\u0001\u0000\u0000\u0000\u00a6\u00ab\u0005\u0011\u0000\u0000"+
		"\u00a7\u00ab\u0005*\u0000\u0000\u00a8\u00ab\u0005\u0012\u0000\u0000\u00a9"+
		"\u00ab\u0003\u0018\f\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000\u00aa\u00a7"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u0015\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005\u0001\u0000\u0000\u00ad\u0017\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005\u0002\u0000\u0000\u00af\u00b0\u0003&\u0013\u0000\u00b0\u00b1\u0005"+
		".\u0000\u0000\u00b1\u0019\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0003"+
		"\u0000\u0000\u00b3\u00b4\u00050\u0000\u0000\u00b4\u00b5\u0005P\u0000\u0000"+
		"\u00b5\u00b6\u00051\u0000\u0000\u00b6\u00b7\u0003&\u0013\u0000\u00b7\u00bb"+
		"\u0005/\u0000\u0000\u00b8\u00ba\u0003\u001c\u000e\u0000\u00b9\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"\u0003\u0000\u0000\u00bf\u00c0\u00052\u0000\u0000\u00c0\u00c1\u0005/\u0000"+
		"\u0000\u00c1\u001b\u0001\u0000\u0000\u0000\u00c2\u00cc\u0003\u0006\u0003"+
		"\u0000\u00c3\u00cc\u0003\b\u0004\u0000\u00c4\u00cc\u0003\n\u0005\u0000"+
		"\u00c5\u00cc\u0003\f\u0006\u0000\u00c6\u00cc\u0003\u0016\u000b\u0000\u00c7"+
		"\u00cc\u0003\u001e\u000f\u0000\u00c8\u00cc\u0003\u0018\f\u0000\u00c9\u00cc"+
		"\u0003\u000e\u0007\u0000\u00ca\u00cc\u0003\u0004\u0002\u0000\u00cb\u00c2"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c3\u0001\u0000\u0000\u0000\u00cb\u00c4"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c5\u0001\u0000\u0000\u0000\u00cb\u00c6"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cb\u00c8"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cc\u001d\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0005\u0003\u0000\u0000\u00ce\u00cf\u00053\u0000\u0000\u00cf\u00d0\u0003"+
		"&\u0013\u0000\u00d0\u00d4\u0005/\u0000\u0000\u00d1\u00d3\u0003$\u0012"+
		"\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00da\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d9\u0003 \u0010\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00df\u0003\"\u0011\u0000\u00de"+
		"\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0003\u0000\u0000\u00e1"+
		"\u00e2\u00056\u0000\u0000\u00e2\u00e3\u0005/\u0000\u0000\u00e3\u001f\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005\u0003\u0000\u0000\u00e5\u00e6\u0005"+
		"4\u0000\u0000\u00e6\u00e7\u0003&\u0013\u0000\u00e7\u00eb\u0005/\u0000"+
		"\u0000\u00e8\u00ea\u0003$\u0012\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec!\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0003\u0000\u0000\u00ef"+
		"\u00f0\u00055\u0000\u0000\u00f0\u00f4\u0005/\u0000\u0000\u00f1\u00f3\u0003"+
		"$\u0012\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5#\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u0101\u0003\u0006\u0003\u0000\u00f8\u0101\u0003\b\u0004\u0000"+
		"\u00f9\u0101\u0003\n\u0005\u0000\u00fa\u0101\u0003\f\u0006\u0000\u00fb"+
		"\u0101\u0003\u0016\u000b\u0000\u00fc\u0101\u0003\u001a\r\u0000\u00fd\u0101"+
		"\u0003\u0018\f\u0000\u00fe\u0101\u0003\u000e\u0007\u0000\u00ff\u0101\u0003"+
		"\u0004\u0002\u0000\u0100\u00f7\u0001\u0000\u0000\u0000\u0100\u00f8\u0001"+
		"\u0000\u0000\u0000\u0100\u00f9\u0001\u0000\u0000\u0000\u0100\u00fa\u0001"+
		"\u0000\u0000\u0000\u0100\u00fb\u0001\u0000\u0000\u0000\u0100\u00fc\u0001"+
		"\u0000\u0000\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101%\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0003(\u0014\u0000\u0103\'\u0001\u0000\u0000"+
		"\u0000\u0104\u010a\u0003*\u0015\u0000\u0105\u0106\u00053\u0000\u0000\u0106"+
		"\u0107\u0003*\u0015\u0000\u0107\u0108\u00055\u0000\u0000\u0108\u0109\u0003"+
		"*\u0015\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0105\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b)\u0001\u0000\u0000"+
		"\u0000\u010c\u0111\u0003,\u0016\u0000\u010d\u010e\u0007\u0002\u0000\u0000"+
		"\u010e\u0110\u0003,\u0016\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110"+
		"\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112+\u0001\u0000\u0000\u0000\u0113\u0111"+
		"\u0001\u0000\u0000\u0000\u0114\u0119\u0003.\u0017\u0000\u0115\u0116\u0007"+
		"\u0003\u0000\u0000\u0116\u0118\u0003.\u0017\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a-\u0001\u0000\u0000"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u0121\u00030\u0018\u0000"+
		"\u011d\u011e\u0007\u0004\u0000\u0000\u011e\u0120\u00030\u0018\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121"+
		"\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122"+
		"/\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0129"+
		"\u00032\u0019\u0000\u0125\u0126\u0007\u0005\u0000\u0000\u0126\u0128\u0003"+
		"2\u0019\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a1\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u00057\u0000\u0000\u012d\u0130\u00032\u0019\u0000\u012e"+
		"\u0130\u00034\u001a\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u012f\u012e"+
		"\u0001\u0000\u0000\u0000\u01303\u0001\u0000\u0000\u0000\u0131\u013d\u0003"+
		"6\u001b\u0000\u0132\u0133\u0005@\u0000\u0000\u0133\u0139\u0005P\u0000"+
		"\u0000\u0134\u0136\u0005E\u0000\u0000\u0135\u0137\u0003<\u001e\u0000\u0136"+
		"\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0001\u0000\u0000\u0000\u0138\u013a\u0005F\u0000\u0000\u0139\u0134"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013c"+
		"\u0001\u0000\u0000\u0000\u013b\u0132\u0001\u0000\u0000\u0000\u013c\u013f"+
		"\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e5\u0001\u0000\u0000\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u0140\u0144\u0003:\u001d\u0000\u0141\u0143\u00038\u001c"+
		"\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000"+
		"\u0000\u01457\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0005A\u0000\u0000\u0148\u014e\u0005P\u0000\u0000\u0149\u014b"+
		"\u0005E\u0000\u0000\u014a\u014c\u0003<\u001e\u0000\u014b\u014a\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u014f\u0005F\u0000\u0000\u014e\u0149\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u015a\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0005G\u0000\u0000\u0151\u0152\u0003&\u0013\u0000\u0152"+
		"\u0153\u0005H\u0000\u0000\u0153\u015a\u0001\u0000\u0000\u0000\u0154\u0156"+
		"\u0005E\u0000\u0000\u0155\u0157\u0003<\u001e\u0000\u0156\u0155\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\u015a\u0005F\u0000\u0000\u0159\u0147\u0001\u0000\u0000"+
		"\u0000\u0159\u0150\u0001\u0000\u0000\u0000\u0159\u0154\u0001\u0000\u0000"+
		"\u0000\u015a9\u0001\u0000\u0000\u0000\u015b\u0163\u0005P\u0000\u0000\u015c"+
		"\u0163\u0005N\u0000\u0000\u015d\u0163\u0005O\u0000\u0000\u015e\u015f\u0005"+
		"E\u0000\u0000\u015f\u0160\u0003&\u0013\u0000\u0160\u0161\u0005F\u0000"+
		"\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u015b\u0001\u0000\u0000"+
		"\u0000\u0162\u015c\u0001\u0000\u0000\u0000\u0162\u015d\u0001\u0000\u0000"+
		"\u0000\u0162\u015e\u0001\u0000\u0000\u0000\u0163;\u0001\u0000\u0000\u0000"+
		"\u0164\u0169\u0003&\u0013\u0000\u0165\u0166\u0005D\u0000\u0000\u0166\u0168"+
		"\u0003&\u0013\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u016b\u0001"+
		"\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a=\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0003@ \u0000\u016d\u0171\u0005\u000e\u0000\u0000"+
		"\u016e\u0170\u0003D\"\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0173\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0001\u0000\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173"+
		"\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u000f\u0000\u0000\u0175"+
		"?\u0001\u0000\u0000\u0000\u0176\u017b\u0003B!\u0000\u0177\u0178\u0005"+
		"\u001f\u0000\u0000\u0178\u017a\u0003B!\u0000\u0179\u0177\u0001\u0000\u0000"+
		"\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017cA\u0001\u0000\u0000\u0000"+
		"\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0180\u0007\u0006\u0000\u0000"+
		"\u017f\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000"+
		"\u0182C\u0001\u0000\u0000\u0000\u0183\u0184\u0003F#\u0000\u0184\u0185"+
		"\u0005$\u0000\u0000\u0185\u0187\u0003H$\u0000\u0186\u0188\u0005\u0010"+
		"\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000"+
		"\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u018b\u0005%\u0000"+
		"\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000"+
		"\u0000\u018bE\u0001\u0000\u0000\u0000\u018c\u0191\u0005*\u0000\u0000\u018d"+
		"\u018e\u0005\'\u0000\u0000\u018e\u0190\u0005*\u0000\u0000\u018f\u018d"+
		"\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191\u018f"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192G\u0001"+
		"\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0196\u0003"+
		"J%\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000"+
		"\u0000\u0198I\u0001\u0000\u0000\u0000\u0199\u01af\u0005*\u0000\u0000\u019a"+
		"\u01af\u0005\u0012\u0000\u0000\u019b\u01af\u0005\u0011\u0000\u0000\u019c"+
		"\u01af\u0005\u0013\u0000\u0000\u019d\u01af\u0005\u0014\u0000\u0000\u019e"+
		"\u01af\u0005+\u0000\u0000\u019f\u01a1\u0005\'\u0000\u0000\u01a0\u019f"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a4\u0005\u0012\u0000\u0000\u01a3\u01a5"+
		"\u0007\u0007\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a5\u01af\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0005 \u0000\u0000\u01a7\u01a8\u0003H$\u0000\u01a8\u01a9\u0005!\u0000"+
		"\u0000\u01a9\u01af\u0001\u0000\u0000\u0000\u01aa\u01af\u0005\u001f\u0000"+
		"\u0000\u01ab\u01af\u0005\n\u0000\u0000\u01ac\u01af\u0005\u000b\u0000\u0000"+
		"\u01ad\u01af\u0005$\u0000\u0000\u01ae\u0199\u0001\u0000\u0000\u0000\u01ae"+
		"\u019a\u0001\u0000\u0000\u0000\u01ae\u019b\u0001\u0000\u0000\u0000\u01ae"+
		"\u019c\u0001\u0000\u0000\u0000\u01ae\u019d\u0001\u0000\u0000\u0000\u01ae"+
		"\u019e\u0001\u0000\u0000\u0000\u01ae\u01a0\u0001\u0000\u0000\u0000\u01ae"+
		"\u01a6\u0001\u0000\u0000\u0000\u01ae\u01aa\u0001\u0000\u0000\u0000\u01ae"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae"+
		"\u01ad\u0001\u0000\u0000\u0000\u01afK\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0005\r\u0000\u0000\u01b1M\u0001\u0000\u0000\u0000,Qbs|\u0083\u008f\u0093"+
		"\u009f\u00a4\u00aa\u00bb\u00cb\u00d4\u00da\u00de\u00eb\u00f4\u0100\u010a"+
		"\u0111\u0119\u0121\u0129\u012f\u0136\u0139\u013d\u0144\u014b\u014e\u0156"+
		"\u0159\u0162\u0169\u0171\u017b\u0181\u0187\u018a\u0191\u0197\u01a0\u01a4"+
		"\u01ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}