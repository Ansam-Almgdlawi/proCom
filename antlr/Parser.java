// Generated from C:/Users/pc/Desktop/newproject/newproject/newproject/Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_OPEN=1, TEXT=2, SCRIPT_OPEN=3, STYLE_OPEN=4, WS=5, HTML_TAG_CLOSE=6, 
		HTML_SLASH_CLOSE=7, HTML_SLASH=8, HTML_EQUALS=9, HTML_ATTRIBUTE_VALUE=10, 
		HTML_PROPERTY_BINDING=11, HTML_EVENT_BINDING=12, HTML_TAG_NAME=13, HTML_TWO_WAY_BINDING=14, 
		HTML_STAR_BINDING=15, HTML_INTERPOLATION=16, HTML_ATTRIBUTE_NAME=17, HTML_WS=18, 
		STYLE_CLOSE=19, CSS_PROPERTY=20, CSS_VALUE=21, CSS_CLASS_SELECTOR=22, 
		CSS_ID_SELECTOR=23, CSS_ELEMENT_SELECTOR=24, CSS_COMBINATOR_WS=25, CSS_LBRACE=26, 
		CSS_RBRACE=27, CSS_COLON=28, CSS_SEMICOLON=29, CSS_WS=30, SCRIPT_CLOSE=31, 
		IF=32, ELSEIF=33, ELSE=34, FOR=35, WHILE=36, SWITCH=37, CASE=38, BREAK=39, 
		CONTINUE=40, DEFAULT=41, DO=42, TRY=43, CATCH=44, FINALLY=45, THROW=46, 
		FUNCTION=47, RETURN=48, CONST=49, LET=50, CONSTRUCTOR=51, VAR=52, CLASS=53, 
		IMPORT=54, IMPORTS=55, EXPORT=56, AS=57, FROM=58, NEW=59, THIS=60, IMPLEMENTS=61, 
		INPUT=62, OUTPUT=63, COMPONENT=64, NGONINIT=65, NGONCHANGES=66, SELECTOR=67, 
		STANDALONE=68, STYLEURL=69, TEMPLATEURL=70, TEMPLATE=71, DESCRIBE=72, 
		INTERFACE=73, IT=74, BEFOREEACH=75, AFTEREACH=76, AWAIT=77, PUBLIC=78, 
		PRIVATE=79, PROTECTED=80, READONLY=81, STATIC=82, ABSTRACT=83, FINAL=84, 
		ASYNC=85, EQUAL=86, ARROW=87, PLUS=88, MINUS=89, STAR=90, DIVIDE=91, MODULO=92, 
		AND=93, OR=94, NOT=95, EQUAL_TO=96, EQUAL_TO3=97, NOT_EQUAL=98, NOT_EQUAL2=99, 
		GREATER_THAN=100, LESS_THAN=101, GREATER_THAN_OR_EQUAL=102, LESS_THAN_OR_EQUAL=103, 
		LPAREN=104, RPAREN=105, LSBRACKET=106, RSBRACKET=107, LCURLY=108, RCURLY=109, 
		COMMA=110, SEMI=111, COLON=112, DOT=113, QUESTION=114, A=115, Integer=116, 
		Float=117, String=118, Boolean=119, Undefined=120, Null=121, ACCESS_MODIFIER=122, 
		SINGLE_LINE_COMMENT=123, COMMENT_BLOCK=124, TS_WS=125, IDENTIFIER=126, 
		EXTENDS=127, QUESITIONMARK=128;
	public static final int
		RULE_program = 0, RULE_scriptBlock = 1, RULE_tsStatement = 2, RULE_importStatement = 3, 
		RULE_importSpecifier = 4, RULE_componentDeclaration = 5, RULE_selector = 6, 
		RULE_standalone = 7, RULE_url = 8, RULE_imports = 9, RULE_functionDeclaration = 10, 
		RULE_methodDeclaration = 11, RULE_arrowMethod = 12, RULE_block = 13, RULE_parameterList = 14, 
		RULE_parameter = 15, RULE_modifier = 16, RULE_classDeclaration = 17, RULE_classMember = 18, 
		RULE_ngOn = 19, RULE_constructorDecleration = 20, RULE_inputDeclaration = 21, 
		RULE_outputDeclaration = 22, RULE_variableDeclaration = 23, RULE_type = 24, 
		RULE_propertyDeclaration = 25, RULE_property = 26, RULE_objectDecleration = 27, 
		RULE_objectName = 28, RULE_objectInit = 29, RULE_objectType = 30, RULE_objectLiteral = 31, 
		RULE_literal = 32, RULE_statement = 33, RULE_expression = 34, RULE_ifStatement = 35, 
		RULE_elseIfStatment = 36, RULE_elseStatment = 37, RULE_shortIf = 38, RULE_shortElseIf = 39, 
		RULE_shortelse = 40, RULE_arrowIf = 41, RULE_forStatement = 42, RULE_whileStatement = 43, 
		RULE_expressionStatement = 44, RULE_returnStatement = 45, RULE_callingMethod = 46, 
		RULE_dataStructure = 47, RULE_itemsStructures = 48, RULE_map = 49, RULE_list = 50, 
		RULE_operator = 51, RULE_compersion = 52, RULE_eos = 53, RULE_jasmineStatement = 54, 
		RULE_jasmineDescribe = 55, RULE_jasmineCallback = 56, RULE_jasmineIt = 57, 
		RULE_jasmineBeforeEach = 58, RULE_jasmineAfterEach = 59, RULE_htmlElement = 60, 
		RULE_htmlAttributes = 61, RULE_angularAttribute = 62, RULE_htmlClosingTag = 63, 
		RULE_htmlAttribute = 64, RULE_htmlContent = 65, RULE_styleBlock = 66, 
		RULE_cssRules = 67, RULE_cssRule = 68, RULE_cssSelector = 69, RULE_simpleSelector = 70, 
		RULE_cssDeclarations = 71, RULE_cssDeclaration = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "scriptBlock", "tsStatement", "importStatement", "importSpecifier", 
			"componentDeclaration", "selector", "standalone", "url", "imports", "functionDeclaration", 
			"methodDeclaration", "arrowMethod", "block", "parameterList", "parameter", 
			"modifier", "classDeclaration", "classMember", "ngOn", "constructorDecleration", 
			"inputDeclaration", "outputDeclaration", "variableDeclaration", "type", 
			"propertyDeclaration", "property", "objectDecleration", "objectName", 
			"objectInit", "objectType", "objectLiteral", "literal", "statement", 
			"expression", "ifStatement", "elseIfStatment", "elseStatment", "shortIf", 
			"shortElseIf", "shortelse", "arrowIf", "forStatement", "whileStatement", 
			"expressionStatement", "returnStatement", "callingMethod", "dataStructure", 
			"itemsStructures", "map", "list", "operator", "compersion", "eos", "jasmineStatement", 
			"jasmineDescribe", "jasmineCallback", "jasmineIt", "jasmineBeforeEach", 
			"jasmineAfterEach", "htmlElement", "htmlAttributes", "angularAttribute", 
			"htmlClosingTag", "htmlAttribute", "htmlContent", "styleBlock", "cssRules", 
			"cssRule", "cssSelector", "simpleSelector", "cssDeclarations", "cssDeclaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'<script>'", "'<style>'", null, null, "'/>'", null, 
			null, null, null, null, null, null, null, null, null, null, "'</style>'", 
			null, null, null, null, null, null, null, null, null, null, null, "'</script>'", 
			"'if'", "'else if'", "'else'", "'for'", "'while'", "'switch'", "'case'", 
			"'break'", "'continue'", "'default'", "'do'", "'try'", "'catch'", "'finally'", 
			"'throw'", "'function'", "'return'", "'const'", "'let'", "'constructor'", 
			"'var'", "'class'", "'import'", "'imports'", "'export'", "'as'", "'from'", 
			"'new'", "'this'", "'implements'", "'@Input'", "'@Output'", "'@Component'", 
			"'ngOnInit'", "'ngOnChanges'", "'selector'", "'standalone'", "'styleUrls'", 
			"'templateUrl'", "'template'", "'describe'", "'interface'", "'it'", "'beforeEach'", 
			"'afterEach'", "'await'", "'public'", "'private'", "'protected'", "'readonly'", 
			"'static'", "'abstract'", "'final'", "'async'", null, "'=>'", "'+'", 
			"'-'", "'*'", null, "'%'", "'&&'", "'||'", "'!'", "'=='", "'==='", "'!='", 
			"'!=='", null, "'<'", "'>='", "'<='", "'('", "')'", "'['", "']'", null, 
			null, "','", null, null, "'.'", "'?'", "'@'", null, null, null, null, 
			"'undefined'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAG_OPEN", "TEXT", "SCRIPT_OPEN", "STYLE_OPEN", "WS", "HTML_TAG_CLOSE", 
			"HTML_SLASH_CLOSE", "HTML_SLASH", "HTML_EQUALS", "HTML_ATTRIBUTE_VALUE", 
			"HTML_PROPERTY_BINDING", "HTML_EVENT_BINDING", "HTML_TAG_NAME", "HTML_TWO_WAY_BINDING", 
			"HTML_STAR_BINDING", "HTML_INTERPOLATION", "HTML_ATTRIBUTE_NAME", "HTML_WS", 
			"STYLE_CLOSE", "CSS_PROPERTY", "CSS_VALUE", "CSS_CLASS_SELECTOR", "CSS_ID_SELECTOR", 
			"CSS_ELEMENT_SELECTOR", "CSS_COMBINATOR_WS", "CSS_LBRACE", "CSS_RBRACE", 
			"CSS_COLON", "CSS_SEMICOLON", "CSS_WS", "SCRIPT_CLOSE", "IF", "ELSEIF", 
			"ELSE", "FOR", "WHILE", "SWITCH", "CASE", "BREAK", "CONTINUE", "DEFAULT", 
			"DO", "TRY", "CATCH", "FINALLY", "THROW", "FUNCTION", "RETURN", "CONST", 
			"LET", "CONSTRUCTOR", "VAR", "CLASS", "IMPORT", "IMPORTS", "EXPORT", 
			"AS", "FROM", "NEW", "THIS", "IMPLEMENTS", "INPUT", "OUTPUT", "COMPONENT", 
			"NGONINIT", "NGONCHANGES", "SELECTOR", "STANDALONE", "STYLEURL", "TEMPLATEURL", 
			"TEMPLATE", "DESCRIBE", "INTERFACE", "IT", "BEFOREEACH", "AFTEREACH", 
			"AWAIT", "PUBLIC", "PRIVATE", "PROTECTED", "READONLY", "STATIC", "ABSTRACT", 
			"FINAL", "ASYNC", "EQUAL", "ARROW", "PLUS", "MINUS", "STAR", "DIVIDE", 
			"MODULO", "AND", "OR", "NOT", "EQUAL_TO", "EQUAL_TO3", "NOT_EQUAL", "NOT_EQUAL2", 
			"GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
			"LPAREN", "RPAREN", "LSBRACKET", "RSBRACKET", "LCURLY", "RCURLY", "COMMA", 
			"SEMI", "COLON", "DOT", "QUESTION", "A", "Integer", "Float", "String", 
			"Boolean", "Undefined", "Null", "ACCESS_MODIFIER", "SINGLE_LINE_COMMENT", 
			"COMMENT_BLOCK", "TS_WS", "IDENTIFIER", "EXTENDS", "QUESITIONMARK"
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
	public String getGrammarFileName() { return "antlr/Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Parser.EOF, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<StyleBlockContext> styleBlock() {
			return getRuleContexts(StyleBlockContext.class);
		}
		public StyleBlockContext styleBlock(int i) {
			return getRuleContext(StyleBlockContext.class,i);
		}
		public List<ScriptBlockContext> scriptBlock() {
			return getRuleContexts(ScriptBlockContext.class);
		}
		public ScriptBlockContext scriptBlock(int i) {
			return getRuleContext(ScriptBlockContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26L) != 0)) {
				{
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_OPEN:
					{
					setState(146);
					htmlElement();
					}
					break;
				case STYLE_OPEN:
					{
					setState(147);
					styleBlock();
					}
					break;
				case SCRIPT_OPEN:
					{
					setState(148);
					scriptBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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
	public static class ScriptBlockContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(Parser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_CLOSE() { return getToken(Parser.SCRIPT_CLOSE, 0); }
		public List<TsStatementContext> tsStatement() {
			return getRuleContexts(TsStatementContext.class);
		}
		public TsStatementContext tsStatement(int i) {
			return getRuleContext(TsStatementContext.class,i);
		}
		public ScriptBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterScriptBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitScriptBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitScriptBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptBlockContext scriptBlock() throws RecognitionException {
		ScriptBlockContext _localctx = new ScriptBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scriptBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(SCRIPT_OPEN);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1294661854940889088L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4897687822003076865L) != 0)) {
				{
				{
				setState(157);
				tsStatement();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(SCRIPT_CLOSE);
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
	public static class TsStatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsStatementContext tsStatement() throws RecognitionException {
		TsStatementContext _localctx = new TsStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tsStatement);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				importStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				componentDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				statement();
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Parser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(Parser.FROM, 0); }
		public TerminalNode String() { return getToken(Parser.String, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode STAR() { return getToken(Parser.STAR, 0); }
		public TerminalNode AS() { return getToken(Parser.AS, 0); }
		public ImportSpecifierContext importSpecifier() {
			return getRuleContext(ImportSpecifierContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStatement);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(IMPORT);
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(173);
					match(IDENTIFIER);
					}
					break;
				case STAR:
					{
					setState(174);
					match(STAR);
					setState(175);
					match(AS);
					setState(176);
					match(IDENTIFIER);
					}
					break;
				case LCURLY:
					{
					setState(177);
					importSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(180);
				match(FROM);
				setState(181);
				match(String);
				setState(182);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(IMPORT);
				setState(184);
				match(String);
				setState(185);
				eos();
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
	public static class ImportSpecifierContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Parser.RCURLY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> AS() { return getTokens(Parser.AS); }
		public TerminalNode AS(int i) {
			return getToken(Parser.AS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(LCURLY);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(189);
				match(IDENTIFIER);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(190);
					match(AS);
					setState(191);
					match(IDENTIFIER);
					}
				}

				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(194);
					match(COMMA);
					setState(195);
					match(IDENTIFIER);
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(196);
						match(AS);
						setState(197);
						match(IDENTIFIER);
						}
					}

					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(207);
			match(RCURLY);
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
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(Parser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Parser.RCURLY, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<StandaloneContext> standalone() {
			return getRuleContexts(StandaloneContext.class);
		}
		public StandaloneContext standalone(int i) {
			return getRuleContext(StandaloneContext.class,i);
		}
		public List<UrlContext> url() {
			return getRuleContexts(UrlContext.class);
		}
		public UrlContext url(int i) {
			return getRuleContext(UrlContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(COMPONENT);
			setState(210);
			match(LPAREN);
			setState(211);
			match(LCURLY);
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				{
				setState(212);
				selector();
				}
				break;
			case STANDALONE:
				{
				setState(213);
				standalone();
				}
				break;
			case STYLEURL:
			case TEMPLATEURL:
				{
				setState(214);
				url();
				}
				break;
			case IMPORTS:
				{
				setState(215);
				imports();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(218);
				match(COMMA);
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECTOR:
					{
					setState(219);
					selector();
					}
					break;
				case STANDALONE:
					{
					setState(220);
					standalone();
					}
					break;
				case STYLEURL:
				case TEMPLATEURL:
					{
					setState(221);
					url();
					}
					break;
				case IMPORTS:
					{
					setState(222);
					imports();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(RCURLY);
			setState(231);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(Parser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public TerminalNode String() { return getToken(Parser.String, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(SELECTOR);
			setState(234);
			match(COLON);
			setState(235);
			match(String);
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
	public static class StandaloneContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(Parser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public TerminalNode Boolean() { return getToken(Parser.Boolean, 0); }
		public StandaloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStandalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStandalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStandalone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneContext standalone() throws RecognitionException {
		StandaloneContext _localctx = new StandaloneContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_standalone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(STANDALONE);
			setState(238);
			match(COLON);
			setState(239);
			match(Boolean);
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
	public static class UrlContext extends ParserRuleContext {
		public TerminalNode STYLEURL() { return getToken(Parser.STYLEURL, 0); }
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public TerminalNode LSBRACKET() { return getToken(Parser.LSBRACKET, 0); }
		public TerminalNode String() { return getToken(Parser.String, 0); }
		public TerminalNode RSBRACKET() { return getToken(Parser.RSBRACKET, 0); }
		public TerminalNode TEMPLATEURL() { return getToken(Parser.TEMPLATEURL, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_url);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLEURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(STYLEURL);
				setState(242);
				match(COLON);
				setState(243);
				match(LSBRACKET);
				setState(244);
				match(String);
				setState(245);
				match(RSBRACKET);
				}
				break;
			case TEMPLATEURL:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(TEMPLATEURL);
				setState(247);
				match(COLON);
				setState(248);
				match(String);
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
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(Parser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public TerminalNode LSBRACKET() { return getToken(Parser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(Parser.RSBRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_imports);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(IMPORTS);
				setState(252);
				match(COLON);
				setState(253);
				match(LSBRACKET);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(254);
					match(IDENTIFIER);
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(255);
						match(COMMA);
						setState(256);
						match(IDENTIFIER);
						}
						}
						setState(261);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(264);
				match(RSBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(IMPORTS);
				setState(266);
				match(COLON);
				setState(267);
				match(LSBRACKET);
				setState(268);
				match(IDENTIFIER);
				setState(269);
				match(RSBRACKET);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(Parser.FUNCTION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDeclaration);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION) {
					{
					setState(272);
					match(FUNCTION);
					}
				}

				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(275);
					match(IDENTIFIER);
					}
				}

				setState(278);
				parameterList();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(279);
					match(COLON);
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(280);
						match(IDENTIFIER);
						}
					}

					}
				}

				setState(285);
				block();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				arrowMethod();
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodDeclaration);
		int _la;
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) {
					{
					setState(290);
					modifier();
					}
				}

				setState(293);
				match(IDENTIFIER);
				setState(294);
				parameterList();
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(295);
					match(COLON);
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(296);
						match(IDENTIFIER);
						}
					}

					}
				}

				setState(301);
				block();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				arrowMethod();
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
	public static class ArrowMethodContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(Parser.ARROW, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public TerminalNode LCURLY() { return getToken(Parser.LCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(Parser.RCURLY, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(Parser.ASYNC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ArrowMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrowMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrowMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrowMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowMethodContext arrowMethod() throws RecognitionException {
		ArrowMethodContext _localctx = new ArrowMethodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrowMethod);
		int _la;
		try {
			int _alt;
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) {
					{
					setState(306);
					modifier();
					}
				}

				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(309);
					match(IDENTIFIER);
					}
				}

				setState(312);
				parameterList();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(313);
					match(COLON);
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(314);
						match(IDENTIFIER);
						}
					}

					}
				}

				setState(319);
				match(ARROW);
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(320);
					match(LCURLY);
					}
					break;
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(323);
						statement();
						}
						} 
					}
					setState(328);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(329);
					match(RCURLY);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(332);
					match(IDENTIFIER);
					}
				}

				setState(335);
				parameterList();
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(336);
					match(COLON);
					setState(338);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(337);
						match(IDENTIFIER);
						}
						break;
					}
					}
				}

				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(342);
					match(LCURLY);
					}
					break;
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1267499519688310784L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 19131593054699519L) != 0)) {
					{
					{
					setState(345);
					statement();
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(351);
				match(RCURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(353);
					match(ASYNC);
					}
				}

				setState(356);
				match(LPAREN);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(357);
					match(IDENTIFIER);
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(358);
						match(COMMA);
						setState(359);
						match(IDENTIFIER);
						}
						}
						setState(364);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(367);
				match(RPAREN);
				setState(368);
				match(ARROW);
				setState(369);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				match(LPAREN);
				setState(371);
				match(RPAREN);
				setState(372);
				match(ARROW);
				setState(373);
				block();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Parser.RCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(LCURLY);
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(377);
					statement();
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(383);
				returnStatement();
				}
			}

			setState(386);
			match(RCURLY);
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
	public static class ParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(LPAREN);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 281474976710911L) != 0)) {
				{
				setState(389);
				parameter();
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(390);
					match(COMMA);
					setState(391);
					parameter();
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(399);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public TerminalNode EQUAL() { return getToken(Parser.EQUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameter);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(401);
				match(IDENTIFIER);
				setState(402);
				match(COLON);
				setState(403);
				match(IDENTIFIER);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(404);
					match(EQUAL);
					setState(405);
					literal();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				modifier();
				{
				setState(410);
				match(IDENTIFIER);
				setState(411);
				match(COLON);
				setState(412);
				match(IDENTIFIER);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(413);
					match(EQUAL);
					setState(414);
					literal();
					}
				}

				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				match(IDENTIFIER);
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
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(Parser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(Parser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(Parser.PROTECTED, 0); }
		public TerminalNode READONLY() { return getToken(Parser.READONLY, 0); }
		public TerminalNode STATIC() { return getToken(Parser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(Parser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(Parser.FINAL, 0); }
		public TerminalNode ASYNC() { return getToken(Parser.ASYNC, 0); }
		public TerminalNode EXPORT() { return getToken(Parser.EXPORT, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) ) {
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public TerminalNode LCURLY() { return getToken(Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Parser.RCURLY, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(Parser.CLASS, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(Parser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(Parser.IMPLEMENTS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) {
				{
				setState(422);
				modifier();
				}
			}

			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(425);
				match(CLASS);
				}
			}

			setState(428);
			match(IDENTIFIER);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS || _la==EXTENDS) {
				{
				setState(429);
				_la = _input.LA(1);
				if ( !(_la==IMPLEMENTS || _la==EXTENDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(430);
				match(IDENTIFIER);
				}
			}

			setState(433);
			match(LCURLY);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4495155378069176320L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2305843558971597059L) != 0)) {
				{
				{
				setState(434);
				classMember();
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			match(RCURLY);
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
	public static class ClassMemberContext extends ParserRuleContext {
		public InputDeclarationContext inputDeclaration() {
			return getRuleContext(InputDeclarationContext.class,0);
		}
		public OutputDeclarationContext outputDeclaration() {
			return getRuleContext(OutputDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public ConstructorDeclerationContext constructorDecleration() {
			return getRuleContext(ConstructorDeclerationContext.class,0);
		}
		public NgOnContext ngOn() {
			return getRuleContext(NgOnContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classMember);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				inputDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				outputDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				methodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(445);
				propertyDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(446);
				variableDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(447);
				objectDecleration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(448);
				constructorDecleration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(449);
				ngOn();
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
	public static class NgOnContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NGONINIT() { return getToken(Parser.NGONINIT, 0); }
		public TerminalNode NGONCHANGES() { return getToken(Parser.NGONCHANGES, 0); }
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public NgOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngOn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNgOn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNgOn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNgOn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgOnContext ngOn() throws RecognitionException {
		NgOnContext _localctx = new NgOnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ngOn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if ( !(_la==NGONINIT || _la==NGONCHANGES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(453);
			parameterList();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(454);
				match(COLON);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(455);
					match(IDENTIFIER);
					}
				}

				}
			}

			setState(460);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclerationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(Parser.CONSTRUCTOR, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDecleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterConstructorDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitConstructorDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitConstructorDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclerationContext constructorDecleration() throws RecognitionException {
		ConstructorDeclerationContext _localctx = new ConstructorDeclerationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructorDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(CONSTRUCTOR);
			setState(463);
			parameterList();
			setState(464);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputDeclarationContext extends ParserRuleContext {
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode INPUT() { return getToken(Parser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public InputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterInputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitInputDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInputDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDeclarationContext inputDeclaration() throws RecognitionException {
		InputDeclarationContext _localctx = new InputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(466);
			match(INPUT);
			setState(467);
			match(LPAREN);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 4539628425194766337L) != 0)) {
				{
				setState(468);
				literal();
				}
			}

			setState(471);
			match(RPAREN);
			setState(472);
			property();
			}
			setState(474);
			eos();
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
	public static class OutputDeclarationContext extends ParserRuleContext {
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode OUTPUT() { return getToken(Parser.OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OutputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterOutputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitOutputDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOutputDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputDeclarationContext outputDeclaration() throws RecognitionException {
		OutputDeclarationContext _localctx = new OutputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_outputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(476);
			match(OUTPUT);
			setState(477);
			match(LPAREN);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 4539628425194766337L) != 0)) {
				{
				setState(478);
				literal();
				}
			}

			setState(481);
			match(RPAREN);
			setState(482);
			objectDecleration();
			}
			setState(484);
			eos();
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(Parser.EQUAL, 0); }
		public TerminalNode AS() { return getToken(Parser.AS, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 136918859915L) != 0)) {
				{
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) {
					{
					setState(486);
					modifier();
					}
				}

				setState(489);
				type();
				}
			}

			setState(492);
			match(IDENTIFIER);
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(493);
				match(COLON);
				setState(494);
				expression(0);
				}
				break;
			}
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(497);
				match(EQUAL);
				setState(498);
				expression(0);
				}
				break;
			}
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(501);
				match(AS);
				setState(502);
				match(IDENTIFIER);
				}
				break;
			}
			setState(505);
			eos();
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(Parser.CONST, 0); }
		public TerminalNode LET() { return getToken(Parser.LET, 0); }
		public TerminalNode VAR() { return getToken(Parser.VAR, 0); }
		public TerminalNode INTERFACE() { return getToken(Parser.INTERFACE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 16777227L) != 0)) ) {
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
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(Parser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_propertyDeclaration);
		int _la;
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) {
					{
					setState(509);
					modifier();
					}
				}

				setState(512);
				property();
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(513);
					match(EQUAL);
					setState(514);
					expression(0);
					}
				}

				setState(517);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1069547521L) != 0)) {
					{
					setState(519);
					modifier();
					}
				}

				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 16777227L) != 0)) {
					{
					setState(522);
					type();
					}
				}

				setState(525);
				property();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(526);
					match(EQUAL);
					setState(527);
					expression(0);
					}
				}

				setState(530);
				eos();
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
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Parser.QUESTION, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_property);
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(534);
				match(IDENTIFIER);
				setState(535);
				match(COLON);
				setState(536);
				expression(0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				imports();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(538);
				match(IDENTIFIER);
				setState(539);
				match(QUESTION);
				setState(540);
				match(COLON);
				setState(541);
				expression(0);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				imports();
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
	public static class ObjectDeclerationContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Parser.EQUAL, 0); }
		public ObjectInitContext objectInit() {
			return getRuleContext(ObjectInitContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public ObjectDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDecleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclerationContext objectDecleration() throws RecognitionException {
		ObjectDeclerationContext _localctx = new ObjectDeclerationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_objectDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(545);
				property();
				}
				break;
			case 2:
				{
				setState(546);
				objectName();
				}
				break;
			}
			setState(549);
			match(EQUAL);
			setState(550);
			objectInit();
			setState(551);
			eos();
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
	public static class ObjectNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public ObjectNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectNameContext objectName() throws RecognitionException {
		ObjectNameContext _localctx = new ObjectNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_objectName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(IDENTIFIER);
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(554);
				objectType();
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
	public static class ObjectInitContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Parser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ObjectInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInitContext objectInit() throws RecognitionException {
		ObjectInitContext _localctx = new ObjectInitContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(NEW);
			setState(558);
			match(IDENTIFIER);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(559);
				objectType();
				}
			}

			setState(562);
			match(LPAREN);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1261306962826493952L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 597862282959359L) != 0)) {
				{
				setState(563);
				expression(0);
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(564);
					match(COMMA);
					setState(565);
					expression(0);
					}
					}
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(573);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(Parser.LESS_THAN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public TerminalNode GREATER_THAN() { return getToken(Parser.GREATER_THAN, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(LESS_THAN);
			setState(576);
			match(IDENTIFIER);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSBRACKET || _la==LCURLY) {
				{
				setState(577);
				list();
				}
			}

			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(580);
				match(COMMA);
				setState(581);
				match(IDENTIFIER);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSBRACKET || _la==LCURLY) {
					{
					setState(582);
					list();
					}
				}

				}
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(590);
			match(GREATER_THAN);
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
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Parser.RCURLY, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(LCURLY);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS || _la==IDENTIFIER) {
				{
				setState(593);
				property();
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(594);
						match(COMMA);
						setState(595);
						property();
						}
						} 
					}
					setState(600);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
			}

			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(603);
				match(COMMA);
				}
			}

			setState(606);
			match(RCURLY);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(Parser.Integer, 0); }
		public TerminalNode PLUS() { return getToken(Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Parser.MINUS, 0); }
		public TerminalNode Float() { return getToken(Parser.Float, 0); }
		public TerminalNode String() { return getToken(Parser.String, 0); }
		public TerminalNode Boolean() { return getToken(Parser.Boolean, 0); }
		public TerminalNode Null() { return getToken(Parser.Null, 0); }
		public TerminalNode Undefined() { return getToken(Parser.Undefined, 0); }
		public TerminalNode THIS() { return getToken(Parser.THIS, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal);
		int _la;
		try {
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(608);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(611);
				match(Integer);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(612);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(615);
				match(Float);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				match(String);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(617);
				match(Boolean);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(618);
				match(Null);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(619);
				match(Undefined);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(620);
				match(THIS);
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
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Parser.RCURLY, 0); }
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public JasmineStatementContext jasmineStatement() {
			return getRuleContext(JasmineStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statement);
		int _la;
		try {
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCURLY) {
					{
					setState(624);
					match(LCURLY);
					}
				}

				setState(627);
				variableDeclaration();
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(628);
					match(RCURLY);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				objectDecleration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(632);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(633);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(634);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(635);
				jasmineStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(636);
				expressionStatement();
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostIncrementExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public List<TerminalNode> PLUS() { return getTokens(Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Parser.PLUS, i);
		}
		public PostIncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataStructureExpressionContext extends ExpressionContext {
		public DataStructureContext dataStructure() {
			return getRuleContext(DataStructureContext.class,0);
		}
		public DataStructureExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDataStructureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDataStructureExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDataStructureExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ExpressionContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(Parser.DOT, 0); }
		public DotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralExpressionContext extends ExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCastExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(Parser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public TypeCastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTypeCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTypeCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallingMethodExpressionContext extends ExpressionContext {
		public CallingMethodContext callingMethod() {
			return getRuleContext(CallingMethodContext.class,0);
		}
		public CallingMethodExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCallingMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCallingMethodExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCallingMethodExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowMethodExpressionContext extends ExpressionContext {
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public ArrowMethodExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrowMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrowMethodExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrowMethodExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExpressionContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(Parser.THIS, 0); }
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompersionContext compersion() {
			return getRuleContext(CompersionContext.class,0);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectNameExpressionContext extends ExpressionContext {
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public ObjectNameExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAssertionExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(Parser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TypeAssertionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTypeAssertionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTypeAssertionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeAssertionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(Parser.EQUAL, 0); }
		public DataStructureContext dataStructure() {
			return getRuleContext(DataStructureContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionalChainingExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(Parser.QUESTION, 0); }
		public TerminalNode DOT() { return getToken(Parser.DOT, 0); }
		public OptionalChainingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterOptionalChainingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitOptionalChainingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOptionalChainingExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperatorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OperatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeExpressionContext extends ExpressionContext {
		public TerminalNode LESS_THAN() { return getToken(Parser.LESS_THAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(Parser.GREATER_THAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public GenericTypeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterGenericTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitGenericTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitGenericTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnExpContext extends ExpressionContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Parser.RCURLY, 0); }
		public ReturnExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterReturnExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitReturnExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitReturnExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostDecrementExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public List<TerminalNode> MINUS() { return getTokens(Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Parser.MINUS, i);
		}
		public PostDecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDeclarationExpressionContext extends ExpressionContext {
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public ObjectDeclarationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectDeclarationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectDeclarationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectDeclarationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AwaitContext extends ExpressionContext {
		public TerminalNode AWAIT() { return getToken(Parser.AWAIT, 0); }
		public AwaitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAwait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAwait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAwait(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExpressionListContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExpressionList(this);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(640);
				objectLiteral();
				}
				break;
			case 2:
				{
				_localctx = new ObjectDeclarationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(641);
				objectDecleration();
				}
				break;
			case 3:
				{
				_localctx = new ObjectNameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(642);
				objectName();
				}
				break;
			case 4:
				{
				_localctx = new ArrowMethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(643);
				arrowMethod();
				}
				break;
			case 5:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(644);
				match(THIS);
				}
				break;
			case 6:
				{
				_localctx = new AwaitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(645);
				match(AWAIT);
				}
				break;
			case 7:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(646);
				match(IDENTIFIER);
				}
				break;
			case 8:
				{
				_localctx = new PostIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(647);
				match(IDENTIFIER);
				setState(648);
				match(PLUS);
				setState(649);
				match(PLUS);
				}
				break;
			case 9:
				{
				_localctx = new PostDecrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(650);
				match(IDENTIFIER);
				setState(651);
				match(MINUS);
				setState(652);
				match(MINUS);
				}
				break;
			case 10:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(653);
				literal();
				}
				break;
			case 11:
				{
				_localctx = new CallingMethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(654);
				callingMethod();
				}
				break;
			case 12:
				{
				_localctx = new GenericTypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(655);
				match(LESS_THAN);
				setState(656);
				expression(0);
				setState(657);
				match(GREATER_THAN);
				setState(658);
				match(IDENTIFIER);
				}
				break;
			case 13:
				{
				_localctx = new TypeCastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(660);
				match(LPAREN);
				setState(661);
				expression(0);
				setState(662);
				match(AS);
				setState(663);
				match(IDENTIFIER);
				setState(664);
				match(RPAREN);
				}
				break;
			case 14:
				{
				_localctx = new DataStructureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(666);
				dataStructure();
				}
				break;
			case 15:
				{
				_localctx = new ReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(667);
				returnStatement();
				}
				break;
			case 16:
				{
				_localctx = new ReturnExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCURLY) {
					{
					setState(668);
					match(LCURLY);
					}
				}

				setState(671);
				returnStatement();
				setState(673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(672);
					match(RCURLY);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(703);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						_localctx = new DotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(677);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(678);
						match(DOT);
						setState(679);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new OptionalChainingExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(680);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(681);
						match(QUESTION);
						setState(682);
						match(DOT);
						setState(683);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(684);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(685);
						compersion();
						setState(686);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new OperatorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(688);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(689);
						operator();
						setState(690);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionListContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(692);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(693);
						list();
						}
						break;
					case 6:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(694);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(695);
						match(EQUAL);
						setState(698);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LSBRACKET:
						case LCURLY:
							{
							setState(696);
							dataStructure();
							}
							break;
						case THIS:
						case PLUS:
						case MINUS:
						case Integer:
						case Float:
						case String:
						case Boolean:
						case Undefined:
						case Null:
							{
							setState(697);
							literal();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 7:
						{
						_localctx = new TypeAssertionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(700);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(701);
						match(AS);
						setState(702);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElseIfStatmentContext> elseIfStatment() {
			return getRuleContexts(ElseIfStatmentContext.class);
		}
		public ElseIfStatmentContext elseIfStatment(int i) {
			return getRuleContext(ElseIfStatmentContext.class,i);
		}
		public ElseStatmentContext elseStatment() {
			return getRuleContext(ElseStatmentContext.class,0);
		}
		public ShortIfContext shortIf() {
			return getRuleContext(ShortIfContext.class,0);
		}
		public ArrowIfContext arrowIf() {
			return getRuleContext(ArrowIfContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifStatement);
		try {
			int _alt;
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(708);
				match(IF);
				setState(709);
				match(LPAREN);
				setState(710);
				expression(0);
				setState(711);
				match(RPAREN);
				setState(712);
				block();
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(713);
						elseIfStatment();
						}
						} 
					}
					setState(718);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				setState(720);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(719);
					elseStatment();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				shortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(723);
				arrowIf();
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
	public static class ElseIfStatmentContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(Parser.ELSEIF, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterElseIfStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitElseIfStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitElseIfStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatmentContext elseIfStatment() throws RecognitionException {
		ElseIfStatmentContext _localctx = new ElseIfStatmentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elseIfStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(ELSEIF);
			setState(727);
			match(LPAREN);
			setState(728);
			expression(0);
			setState(729);
			match(RPAREN);
			setState(730);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatmentContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(Parser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterElseStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitElseStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitElseStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatmentContext elseStatment() throws RecognitionException {
		ElseStatmentContext _localctx = new ElseStatmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elseStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(ELSE);
			setState(733);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShortIfContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUESITIONMARK() { return getToken(Parser.QUESITIONMARK, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ShortelseContext shortelse() {
			return getRuleContext(ShortelseContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Parser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Parser.RPAREN, i);
		}
		public List<ShortElseIfContext> shortElseIf() {
			return getRuleContexts(ShortElseIfContext.class);
		}
		public ShortElseIfContext shortElseIf(int i) {
			return getRuleContext(ShortElseIfContext.class,i);
		}
		public ShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortIfContext shortIf() throws RecognitionException {
		ShortIfContext _localctx = new ShortIfContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_shortIf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(735);
				match(LPAREN);
				}
				break;
			}
			setState(738);
			expression(0);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(739);
				match(RPAREN);
				}
			}

			setState(742);
			match(QUESITIONMARK);
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(743);
				match(LPAREN);
				}
				break;
			}
			setState(746);
			statement();
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(747);
				match(RPAREN);
				}
			}

			setState(753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(750);
					shortElseIf();
					}
					} 
				}
				setState(755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(756);
			shortelse();
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
	public static class ShortElseIfContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUESITIONMARK() { return getToken(Parser.QUESITIONMARK, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Parser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Parser.RPAREN, i);
		}
		public ShortElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortElseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterShortElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitShortElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitShortElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortElseIfContext shortElseIf() throws RecognitionException {
		ShortElseIfContext _localctx = new ShortElseIfContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_shortElseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(COLON);
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(759);
				match(LPAREN);
				}
				break;
			}
			setState(762);
			expression(0);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(763);
				match(RPAREN);
				}
			}

			setState(766);
			match(QUESITIONMARK);
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(767);
				match(LPAREN);
				}
				break;
			}
			setState(770);
			statement();
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(771);
				match(RPAREN);
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
	public static class ShortelseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public ShortelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterShortelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitShortelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitShortelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortelseContext shortelse() throws RecognitionException {
		ShortelseContext _localctx = new ShortelseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_shortelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(COLON);
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(775);
				match(LPAREN);
				}
				break;
			}
			setState(778);
			statement();
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(779);
				match(RPAREN);
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
	public static class ArrowIfContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(Parser.ARROW, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public ArrowIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrowIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrowIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrowIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowIfContext arrowIf() throws RecognitionException {
		ArrowIfContext _localctx = new ArrowIfContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arrowIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(782);
				match(LPAREN);
				}
				break;
			}
			setState(785);
			expression(0);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(786);
				match(RPAREN);
				}
			}

			setState(789);
			match(ARROW);
			setState(790);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Parser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(FOR);
			setState(793);
			match(LPAREN);
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(794);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(795);
				expression(0);
				}
				break;
			}
			setState(798);
			match(SEMI);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1261306962826493952L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 597862282959359L) != 0)) {
				{
				setState(799);
				expression(0);
				}
			}

			setState(802);
			match(SEMI);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1261306962826493952L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 597862282959359L) != 0)) {
				{
				setState(803);
				expression(0);
				}
			}

			setState(806);
			match(RPAREN);
			setState(807);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(WHILE);
			setState(810);
			match(LPAREN);
			setState(811);
			expression(0);
			setState(812);
			match(RPAREN);
			setState(813);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			expression(0);
			setState(816);
			eos();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Parser.RETURN, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(RETURN);
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(819);
				match(LPAREN);
				}
				break;
			}
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(822);
				expressionStatement();
				}
				break;
			}
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(825);
				match(RPAREN);
				}
				break;
			}
			setState(828);
			eos();
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
	public static class CallingMethodContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public TerminalNode CATCH() { return getToken(Parser.CATCH, 0); }
		public List<DataStructureContext> dataStructure() {
			return getRuleContexts(DataStructureContext.class);
		}
		public DataStructureContext dataStructure(int i) {
			return getRuleContext(DataStructureContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parser.DOT, i);
		}
		public List<CallingMethodContext> callingMethod() {
			return getRuleContexts(CallingMethodContext.class);
		}
		public CallingMethodContext callingMethod(int i) {
			return getRuleContext(CallingMethodContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public TerminalNode A() { return getToken(Parser.A, 0); }
		public CallingMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callingMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCallingMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCallingMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCallingMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallingMethodContext callingMethod() throws RecognitionException {
		CallingMethodContext _localctx = new CallingMethodContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_callingMethod);
		int _la;
		try {
			int _alt;
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(830);
				_la = _input.LA(1);
				if ( !(_la==CATCH || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(831);
				match(LPAREN);
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1261306962826493952L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 597862282959359L) != 0)) {
					{
					setState(832);
					expression(0);
					setState(837);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(833);
						match(COMMA);
						setState(834);
						expression(0);
						}
						}
						setState(839);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(842);
				match(RPAREN);
				}
				setState(852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(850);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
							{
							{
							setState(844);
							match(DOT);
							setState(847);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
							case 1:
								{
								setState(845);
								callingMethod();
								}
								break;
							case 2:
								{
								setState(846);
								match(IDENTIFIER);
								}
								break;
							}
							}
							}
							break;
						case LSBRACKET:
						case LCURLY:
							{
							setState(849);
							dataStructure();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(854);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(858);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case A:
					{
					setState(855);
					match(A);
					setState(856);
					match(IDENTIFIER);
					}
					break;
				case CATCH:
					{
					setState(857);
					match(CATCH);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(860);
				match(LPAREN);
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1261306962826493952L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 597862282959359L) != 0)) {
					{
					setState(861);
					expression(0);
					setState(866);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(862);
						match(COMMA);
						setState(863);
						expression(0);
						}
						}
						setState(868);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(871);
				match(RPAREN);
				}
				setState(881);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(879);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
							{
							{
							setState(873);
							match(DOT);
							setState(876);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
							case 1:
								{
								setState(874);
								callingMethod();
								}
								break;
							case 2:
								{
								setState(875);
								match(IDENTIFIER);
								}
								break;
							}
							}
							}
							break;
						case LSBRACKET:
						case LCURLY:
							{
							setState(878);
							dataStructure();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(883);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataStructureContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public DataStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDataStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDataStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDataStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataStructureContext dataStructure() throws RecognitionException {
		DataStructureContext _localctx = new DataStructureContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dataStructure);
		try {
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				map();
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
	public static class ItemsStructuresContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public CallingMethodContext callingMethod() {
			return getRuleContext(CallingMethodContext.class,0);
		}
		public ItemsStructuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemsStructures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterItemsStructures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitItemsStructures(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitItemsStructures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsStructuresContext itemsStructures() throws RecognitionException {
		ItemsStructuresContext _localctx = new ItemsStructuresContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_itemsStructures);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(890);
				literal();
				}
				break;
			case 2:
				{
				setState(891);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(892);
				list();
				}
				break;
			case 4:
				{
				setState(893);
				map();
				}
				break;
			case 5:
				{
				setState(894);
				callingMethod();
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
	public static class MapContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Parser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public List<ItemsStructuresContext> itemsStructures() {
			return getRuleContexts(ItemsStructuresContext.class);
		}
		public ItemsStructuresContext itemsStructures(int i) {
			return getRuleContext(ItemsStructuresContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parser.COLON, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_map);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(LCURLY);
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH || _la==THIS || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 291924869123L) != 0)) {
				{
				{
				setState(898);
				itemsStructures();
				setState(899);
				match(COLON);
				setState(900);
				itemsStructures();
				}
				setState(909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(902);
						match(COMMA);
						{
						setState(903);
						itemsStructures();
						setState(904);
						match(COLON);
						setState(905);
						itemsStructures();
						}
						}
						} 
					}
					setState(911);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				}
				}
			}

			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(914);
				match(COMMA);
				}
			}

			setState(917);
			match(RCURLY);
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LSBRACKET() { return getToken(Parser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(Parser.RSBRACKET, 0); }
		public List<ItemsStructuresContext> itemsStructures() {
			return getRuleContexts(ItemsStructuresContext.class);
		}
		public ItemsStructuresContext itemsStructures(int i) {
			return getRuleContext(ItemsStructuresContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public TerminalNode LCURLY() { return getToken(Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Parser.RCURLY, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_list);
		int _la;
		try {
			int _alt;
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				match(LSBRACKET);
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH || _la==THIS || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 291924869123L) != 0)) {
					{
					setState(920);
					itemsStructures();
					setState(925);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(921);
							match(COMMA);
							setState(922);
							itemsStructures();
							}
							} 
						}
						setState(927);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
					}
					}
				}

				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(930);
					match(COMMA);
					}
				}

				setState(933);
				match(RSBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCURLY) {
					{
					setState(934);
					match(LCURLY);
					}
				}

				setState(937);
				match(LSBRACKET);
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH || _la==THIS || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 291924869123L) != 0)) {
					{
					setState(938);
					itemsStructures();
					setState(943);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(939);
							match(COMMA);
							setState(940);
							itemsStructures();
							}
							} 
						}
						setState(945);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
					}
					}
				}

				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(948);
					match(COMMA);
					}
				}

				setState(951);
				match(RSBRACKET);
				setState(953);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(952);
					match(RCURLY);
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Parser.EQUAL, 0); }
		public TerminalNode PLUS() { return getToken(Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Parser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(Parser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(Parser.DIVIDE, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_operator);
		try {
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				match(PLUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(959);
				match(MINUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(960);
				match(STAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(961);
				match(DIVIDE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(962);
				match(PLUS);
				setState(963);
				match(EQUAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(964);
				match(MINUS);
				setState(965);
				match(EQUAL);
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
	public static class CompersionContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN() { return getToken(Parser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(Parser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(Parser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(Parser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(Parser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL_TO() { return getToken(Parser.EQUAL_TO, 0); }
		public TerminalNode AND() { return getToken(Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Parser.OR, 0); }
		public TerminalNode EQUAL_TO3() { return getToken(Parser.EQUAL_TO3, 0); }
		public TerminalNode NOT_EQUAL2() { return getToken(Parser.NOT_EQUAL2, 0); }
		public CompersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCompersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCompersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCompersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompersionContext compersion() throws RecognitionException {
		CompersionContext _localctx = new CompersionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_compersion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 2043L) != 0)) ) {
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
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(970);
				match(SEMI);
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
	public static class JasmineStatementContext extends ParserRuleContext {
		public JasmineDescribeContext jasmineDescribe() {
			return getRuleContext(JasmineDescribeContext.class,0);
		}
		public JasmineItContext jasmineIt() {
			return getRuleContext(JasmineItContext.class,0);
		}
		public JasmineBeforeEachContext jasmineBeforeEach() {
			return getRuleContext(JasmineBeforeEachContext.class,0);
		}
		public JasmineAfterEachContext jasmineAfterEach() {
			return getRuleContext(JasmineAfterEachContext.class,0);
		}
		public JasmineStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterJasmineStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitJasmineStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitJasmineStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineStatementContext jasmineStatement() throws RecognitionException {
		JasmineStatementContext _localctx = new JasmineStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_jasmineStatement);
		try {
			setState(977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESCRIBE:
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				jasmineDescribe();
				}
				break;
			case IT:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				jasmineIt();
				}
				break;
			case BEFOREEACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(975);
				jasmineBeforeEach();
				}
				break;
			case AFTEREACH:
				enterOuterAlt(_localctx, 4);
				{
				setState(976);
				jasmineAfterEach();
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
	public static class JasmineDescribeContext extends ParserRuleContext {
		public TerminalNode DESCRIBE() { return getToken(Parser.DESCRIBE, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode String() { return getToken(Parser.String, 0); }
		public TerminalNode COMMA() { return getToken(Parser.COMMA, 0); }
		public JasmineCallbackContext jasmineCallback() {
			return getRuleContext(JasmineCallbackContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public JasmineDescribeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineDescribe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterJasmineDescribe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitJasmineDescribe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitJasmineDescribe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineDescribeContext jasmineDescribe() throws RecognitionException {
		JasmineDescribeContext _localctx = new JasmineDescribeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_jasmineDescribe);
		try {
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(979);
				match(DESCRIBE);
				setState(980);
				match(LPAREN);
				setState(981);
				match(String);
				setState(982);
				match(COMMA);
				setState(983);
				jasmineCallback();
				setState(985);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(984);
					match(RPAREN);
					}
					break;
				}
				setState(988);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(987);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				match(DESCRIBE);
				setState(991);
				match(LPAREN);
				setState(992);
				match(String);
				setState(993);
				match(COMMA);
				setState(994);
				arrowMethod();
				setState(995);
				match(RPAREN);
				setState(996);
				match(SEMI);
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
	public static class JasmineCallbackContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(Parser.ARROW, 0); }
		public TerminalNode LCURLY() { return getToken(Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Parser.RCURLY, 0); }
		public TerminalNode ASYNC() { return getToken(Parser.ASYNC, 0); }
		public List<JasmineStatementContext> jasmineStatement() {
			return getRuleContexts(JasmineStatementContext.class);
		}
		public JasmineStatementContext jasmineStatement(int i) {
			return getRuleContext(JasmineStatementContext.class,i);
		}
		public JasmineCallbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineCallback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterJasmineCallback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitJasmineCallback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitJasmineCallback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineCallbackContext jasmineCallback() throws RecognitionException {
		JasmineCallbackContext _localctx = new JasmineCallbackContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_jasmineCallback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(1000);
				match(ASYNC);
				}
			}

			setState(1003);
			parameterList();
			setState(1004);
			match(ARROW);
			setState(1005);
			match(LCURLY);
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 29L) != 0)) {
				{
				{
				setState(1006);
				jasmineStatement();
				}
				}
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1012);
			match(RCURLY);
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
	public static class JasmineItContext extends ParserRuleContext {
		public TerminalNode IT() { return getToken(Parser.IT, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public List<TerminalNode> String() { return getTokens(Parser.String); }
		public TerminalNode String(int i) {
			return getToken(Parser.String, i);
		}
		public TerminalNode COMMA() { return getToken(Parser.COMMA, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public JasmineItContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineIt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterJasmineIt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitJasmineIt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitJasmineIt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineItContext jasmineIt() throws RecognitionException {
		JasmineItContext _localctx = new JasmineItContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_jasmineIt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			match(IT);
			setState(1015);
			match(LPAREN);
			setState(1016);
			match(String);
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1017);
				match(IDENTIFIER);
				}
			}

			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==String) {
				{
				setState(1020);
				match(String);
				}
			}

			setState(1023);
			match(COMMA);
			setState(1024);
			arrowMethod();
			setState(1025);
			match(RPAREN);
			setState(1026);
			match(SEMI);
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
	public static class JasmineBeforeEachContext extends ParserRuleContext {
		public TerminalNode BEFOREEACH() { return getToken(Parser.BEFOREEACH, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public JasmineBeforeEachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineBeforeEach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterJasmineBeforeEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitJasmineBeforeEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitJasmineBeforeEach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineBeforeEachContext jasmineBeforeEach() throws RecognitionException {
		JasmineBeforeEachContext _localctx = new JasmineBeforeEachContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_jasmineBeforeEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(BEFOREEACH);
			setState(1029);
			match(LPAREN);
			setState(1030);
			arrowMethod();
			setState(1031);
			match(RPAREN);
			setState(1032);
			match(SEMI);
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
	public static class JasmineAfterEachContext extends ParserRuleContext {
		public TerminalNode AFTEREACH() { return getToken(Parser.AFTEREACH, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public JasmineAfterEachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineAfterEach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterJasmineAfterEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitJasmineAfterEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitJasmineAfterEach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineAfterEachContext jasmineAfterEach() throws RecognitionException {
		JasmineAfterEachContext _localctx = new JasmineAfterEachContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jasmineAfterEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			match(AFTEREACH);
			setState(1035);
			match(LPAREN);
			setState(1036);
			arrowMethod();
			setState(1037);
			match(RPAREN);
			setState(1038);
			match(SEMI);
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
		public TerminalNode TAG_OPEN() { return getToken(Parser.TAG_OPEN, 0); }
		public TerminalNode HTML_TAG_NAME() { return getToken(Parser.HTML_TAG_NAME, 0); }
		public TerminalNode HTML_TAG_CLOSE() { return getToken(Parser.HTML_TAG_CLOSE, 0); }
		public HtmlClosingTagContext htmlClosingTag() {
			return getRuleContext(HtmlClosingTagContext.class,0);
		}
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public TerminalNode HTML_SLASH_CLOSE() { return getToken(Parser.HTML_SLASH_CLOSE, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_htmlElement);
		try {
			int _alt;
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1040);
				match(TAG_OPEN);
				setState(1041);
				match(HTML_TAG_NAME);
				setState(1043);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1042);
					htmlAttributes();
					}
					break;
				}
				setState(1045);
				match(HTML_TAG_CLOSE);
				setState(1049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1046);
						htmlContent();
						}
						} 
					}
					setState(1051);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				}
				setState(1052);
				htmlClosingTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				match(TAG_OPEN);
				setState(1054);
				match(HTML_TAG_NAME);
				setState(1056);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1055);
					htmlAttributes();
					}
					break;
				}
				setState(1058);
				match(HTML_SLASH_CLOSE);
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
	public static class HtmlAttributesContext extends ParserRuleContext {
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<AngularAttributeContext> angularAttribute() {
			return getRuleContexts(AngularAttributeContext.class);
		}
		public AngularAttributeContext angularAttribute(int i) {
			return getRuleContext(AngularAttributeContext.class,i);
		}
		public HtmlAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterHtmlAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitHtmlAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitHtmlAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributesContext htmlAttributes() throws RecognitionException {
		HtmlAttributesContext _localctx = new HtmlAttributesContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_htmlAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 251904L) != 0)) {
				{
				setState(1063);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1061);
					htmlAttribute();
					}
					break;
				case 2:
					{
					setState(1062);
					angularAttribute();
					}
					break;
				}
				}
				setState(1067);
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
	public static class AngularAttributeContext extends ParserRuleContext {
		public TerminalNode HTML_PROPERTY_BINDING() { return getToken(Parser.HTML_PROPERTY_BINDING, 0); }
		public TerminalNode HTML_EVENT_BINDING() { return getToken(Parser.HTML_EVENT_BINDING, 0); }
		public TerminalNode HTML_TWO_WAY_BINDING() { return getToken(Parser.HTML_TWO_WAY_BINDING, 0); }
		public TerminalNode HTML_STAR_BINDING() { return getToken(Parser.HTML_STAR_BINDING, 0); }
		public TerminalNode HTML_INTERPOLATION() { return getToken(Parser.HTML_INTERPOLATION, 0); }
		public AngularAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAngularAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAngularAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAngularAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularAttributeContext angularAttribute() throws RecognitionException {
		AngularAttributeContext _localctx = new AngularAttributeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_angularAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120832L) != 0)) ) {
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
	public static class HtmlClosingTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(Parser.TAG_OPEN, 0); }
		public TerminalNode HTML_SLASH() { return getToken(Parser.HTML_SLASH, 0); }
		public TerminalNode HTML_TAG_NAME() { return getToken(Parser.HTML_TAG_NAME, 0); }
		public TerminalNode HTML_TAG_CLOSE() { return getToken(Parser.HTML_TAG_CLOSE, 0); }
		public HtmlClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterHtmlClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitHtmlClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitHtmlClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlClosingTagContext htmlClosingTag() throws RecognitionException {
		HtmlClosingTagContext _localctx = new HtmlClosingTagContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_htmlClosingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			match(TAG_OPEN);
			setState(1071);
			match(HTML_SLASH);
			setState(1072);
			match(HTML_TAG_NAME);
			setState(1073);
			match(HTML_TAG_CLOSE);
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode HTML_ATTRIBUTE_NAME() { return getToken(Parser.HTML_ATTRIBUTE_NAME, 0); }
		public TerminalNode HTML_EQUALS() { return getToken(Parser.HTML_EQUALS, 0); }
		public TerminalNode HTML_ATTRIBUTE_VALUE() { return getToken(Parser.HTML_ATTRIBUTE_VALUE, 0); }
		public TerminalNode HTML_PROPERTY_BINDING() { return getToken(Parser.HTML_PROPERTY_BINDING, 0); }
		public TerminalNode HTML_EVENT_BINDING() { return getToken(Parser.HTML_EVENT_BINDING, 0); }
		public TerminalNode HTML_TWO_WAY_BINDING() { return getToken(Parser.HTML_TWO_WAY_BINDING, 0); }
		public TerminalNode HTML_STAR_BINDING() { return getToken(Parser.HTML_STAR_BINDING, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_htmlAttribute);
		int _la;
		try {
			setState(1100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_ATTRIBUTE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1075);
				match(HTML_ATTRIBUTE_NAME);
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1076);
					match(HTML_EQUALS);
					setState(1077);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

				}
				break;
			case HTML_PROPERTY_BINDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1080);
				match(HTML_PROPERTY_BINDING);
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1081);
					match(HTML_EQUALS);
					setState(1082);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

				}
				break;
			case HTML_EVENT_BINDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1085);
				match(HTML_EVENT_BINDING);
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1086);
					match(HTML_EQUALS);
					setState(1087);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

				}
				break;
			case HTML_TWO_WAY_BINDING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1090);
				match(HTML_TWO_WAY_BINDING);
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1091);
					match(HTML_EQUALS);
					setState(1092);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

				}
				break;
			case HTML_STAR_BINDING:
				enterOuterAlt(_localctx, 5);
				{
				setState(1095);
				match(HTML_STAR_BINDING);
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1096);
					match(HTML_EQUALS);
					setState(1097);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

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
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode HTML_INTERPOLATION() { return getToken(Parser.HTML_INTERPOLATION, 0); }
		public TerminalNode TEXT() { return getToken(Parser.TEXT, 0); }
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_htmlContent);
		try {
			setState(1105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1102);
				htmlElement();
				}
				break;
			case HTML_INTERPOLATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
				match(HTML_INTERPOLATION);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1104);
				match(TEXT);
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
	public static class StyleBlockContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(Parser.STYLE_OPEN, 0); }
		public CssRulesContext cssRules() {
			return getRuleContext(CssRulesContext.class,0);
		}
		public TerminalNode STYLE_CLOSE() { return getToken(Parser.STYLE_CLOSE, 0); }
		public StyleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStyleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStyleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStyleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleBlockContext styleBlock() throws RecognitionException {
		StyleBlockContext _localctx = new StyleBlockContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_styleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(STYLE_OPEN);
			setState(1108);
			cssRules();
			setState(1109);
			match(STYLE_CLOSE);
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
	public static class CssRulesContext extends ParserRuleContext {
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public CssRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCssRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCssRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCssRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRulesContext cssRules() throws RecognitionException {
		CssRulesContext _localctx = new CssRulesContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_cssRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) {
				{
				{
				setState(1111);
				cssRule();
				}
				}
				setState(1116);
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
	public static class CssRuleContext extends ParserRuleContext {
		public CssSelectorContext cssSelector() {
			return getRuleContext(CssSelectorContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(Parser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(Parser.CSS_RBRACE, 0); }
		public CssDeclarationsContext cssDeclarations() {
			return getRuleContext(CssDeclarationsContext.class,0);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_cssRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			cssSelector();
			setState(1118);
			match(CSS_LBRACE);
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_PROPERTY) {
				{
				setState(1119);
				cssDeclarations();
				}
			}

			setState(1122);
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
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_cssSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			simpleSelector();
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) {
				{
				{
				setState(1125);
				simpleSelector();
				}
				}
				setState(1130);
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
	public static class SimpleSelectorContext extends ParserRuleContext {
		public TerminalNode CSS_CLASS_SELECTOR() { return getToken(Parser.CSS_CLASS_SELECTOR, 0); }
		public TerminalNode CSS_ID_SELECTOR() { return getToken(Parser.CSS_ID_SELECTOR, 0); }
		public TerminalNode CSS_ELEMENT_SELECTOR() { return getToken(Parser.CSS_ELEMENT_SELECTOR, 0); }
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_simpleSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
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
	public static class CssDeclarationsContext extends ParserRuleContext {
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public List<TerminalNode> CSS_SEMICOLON() { return getTokens(Parser.CSS_SEMICOLON); }
		public TerminalNode CSS_SEMICOLON(int i) {
			return getToken(Parser.CSS_SEMICOLON, i);
		}
		public CssDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCssDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCssDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCssDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationsContext cssDeclarations() throws RecognitionException {
		CssDeclarationsContext _localctx = new CssDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_cssDeclarations);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			cssDeclaration();
			setState(1138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1134);
					match(CSS_SEMICOLON);
					setState(1135);
					cssDeclaration();
					}
					} 
				}
				setState(1140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMICOLON) {
				{
				setState(1141);
				match(CSS_SEMICOLON);
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
	public static class CssDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> CSS_PROPERTY() { return getTokens(Parser.CSS_PROPERTY); }
		public TerminalNode CSS_PROPERTY(int i) {
			return getToken(Parser.CSS_PROPERTY, i);
		}
		public TerminalNode CSS_COLON() { return getToken(Parser.CSS_COLON, 0); }
		public List<TerminalNode> CSS_VALUE() { return getTokens(Parser.CSS_VALUE); }
		public TerminalNode CSS_VALUE(int i) {
			return getToken(Parser.CSS_VALUE, i);
		}
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_cssDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(CSS_PROPERTY);
			setState(1145);
			match(CSS_COLON);
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_PROPERTY) {
				{
				setState(1146);
				match(CSS_PROPERTY);
				}
			}

			setState(1150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1149);
				match(CSS_VALUE);
				}
				break;
			}
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_VALUE) {
				{
				setState(1152);
				match(CSS_VALUE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 23);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0080\u0484\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u0096\b\u0000\n\u0000\f\u0000\u0099\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u009f\b\u0001\n\u0001"+
		"\f\u0001\u00a2\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00ab\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00b3\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00bb\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00c1\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00c7\b\u0004\u0005\u0004\u00c9\b\u0004\n\u0004"+
		"\f\u0004\u00cc\t\u0004\u0003\u0004\u00ce\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00d9\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00e0\b\u0005\u0005\u0005\u00e2\b"+
		"\u0005\n\u0005\f\u0005\u00e5\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00fa\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0102\b\t\n\t\f\t\u0105\t\t\u0003\t\u0107\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u010f\b\t\u0001\n\u0003"+
		"\n\u0112\b\n\u0001\n\u0003\n\u0115\b\n\u0001\n\u0001\n\u0001\n\u0003\n"+
		"\u011a\b\n\u0003\n\u011c\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u0121\b\n"+
		"\u0001\u000b\u0003\u000b\u0124\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u012a\b\u000b\u0003\u000b\u012c\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0131\b\u000b\u0001\f\u0003"+
		"\f\u0134\b\f\u0001\f\u0003\f\u0137\b\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u013c\b\f\u0003\f\u013e\b\f\u0001\f\u0001\f\u0003\f\u0142\b\f\u0001\f"+
		"\u0005\f\u0145\b\f\n\f\f\f\u0148\t\f\u0001\f\u0003\f\u014b\b\f\u0001\f"+
		"\u0003\f\u014e\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u0153\b\f\u0003\f\u0155"+
		"\b\f\u0001\f\u0003\f\u0158\b\f\u0001\f\u0005\f\u015b\b\f\n\f\f\f\u015e"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0003\f\u0163\b\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u0169\b\f\n\f\f\f\u016c\t\f\u0003\f\u016e\b\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0177\b\f\u0001"+
		"\r\u0001\r\u0005\r\u017b\b\r\n\r\f\r\u017e\t\r\u0001\r\u0003\r\u0181\b"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0189\b\u000e\n\u000e\f\u000e\u018c\t\u000e\u0003\u000e\u018e\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0197\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01a0"+
		"\b\u000f\u0001\u000f\u0003\u000f\u01a3\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0003\u0011\u01a8\b\u0011\u0001\u0011\u0003\u0011\u01ab\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01b0\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u01b4\b\u0011\n\u0011\f\u0011\u01b7\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01c3\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01c9\b\u0013"+
		"\u0003\u0013\u01cb\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01d6\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01e0\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0003\u0017"+
		"\u01e8\b\u0017\u0001\u0017\u0003\u0017\u01eb\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u01f0\b\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01f4\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01f8\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0003\u0019"+
		"\u01ff\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0204\b"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0209\b\u0019\u0001"+
		"\u0019\u0003\u0019\u020c\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0211\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0215\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0220\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0224\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u022c\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0231\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u0237\b\u001d\n\u001d\f\u001d\u023a"+
		"\t\u001d\u0003\u001d\u023c\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0243\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0248\b\u001e\u0005\u001e\u024a\b\u001e\n\u001e"+
		"\f\u001e\u024d\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u0255\b\u001f\n\u001f\f\u001f\u0258"+
		"\t\u001f\u0003\u001f\u025a\b\u001f\u0001\u001f\u0003\u001f\u025d\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0003 \u0262\b \u0001 \u0001 \u0003 \u0266"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u026e\b \u0001!\u0001"+
		"!\u0003!\u0272\b!\u0001!\u0001!\u0003!\u0276\b!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u027e\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u029e"+
		"\b\"\u0001\"\u0001\"\u0003\"\u02a2\b\"\u0003\"\u02a4\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u02bb\b\"\u0001\"\u0001\"\u0001\"\u0005\"\u02c0\b\""+
		"\n\"\f\"\u02c3\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u02cb"+
		"\b#\n#\f#\u02ce\t#\u0001#\u0003#\u02d1\b#\u0001#\u0001#\u0003#\u02d5\b"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"&\u0003&\u02e1\b&\u0001&\u0001&\u0003&\u02e5\b&\u0001&\u0001&\u0003&\u02e9"+
		"\b&\u0001&\u0001&\u0003&\u02ed\b&\u0001&\u0005&\u02f0\b&\n&\f&\u02f3\t"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0003\'\u02f9\b\'\u0001\'\u0001\'\u0003"+
		"\'\u02fd\b\'\u0001\'\u0001\'\u0003\'\u0301\b\'\u0001\'\u0001\'\u0003\'"+
		"\u0305\b\'\u0001(\u0001(\u0003(\u0309\b(\u0001(\u0001(\u0003(\u030d\b"+
		"(\u0001)\u0003)\u0310\b)\u0001)\u0001)\u0003)\u0314\b)\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001*\u0003*\u031d\b*\u0001*\u0001*\u0003*\u0321"+
		"\b*\u0001*\u0001*\u0003*\u0325\b*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001-\u0003-\u0335"+
		"\b-\u0001-\u0003-\u0338\b-\u0001-\u0003-\u033b\b-\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0005.\u0344\b.\n.\f.\u0347\t.\u0003.\u0349"+
		"\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0350\b.\u0001.\u0005.\u0353"+
		"\b.\n.\f.\u0356\t.\u0001.\u0001.\u0001.\u0003.\u035b\b.\u0001.\u0001."+
		"\u0001.\u0001.\u0005.\u0361\b.\n.\f.\u0364\t.\u0003.\u0366\b.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0003.\u036d\b.\u0001.\u0005.\u0370\b.\n.\f.\u0373"+
		"\t.\u0003.\u0375\b.\u0001/\u0001/\u0003/\u0379\b/\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u0380\b0\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00051\u038c\b1\n1\f1\u038f\t1\u00031\u0391"+
		"\b1\u00011\u00031\u0394\b1\u00011\u00011\u00012\u00012\u00012\u00012\u0005"+
		"2\u039c\b2\n2\f2\u039f\t2\u00032\u03a1\b2\u00012\u00032\u03a4\b2\u0001"+
		"2\u00012\u00032\u03a8\b2\u00012\u00012\u00012\u00012\u00052\u03ae\b2\n"+
		"2\f2\u03b1\t2\u00032\u03b3\b2\u00012\u00032\u03b6\b2\u00012\u00012\u0003"+
		"2\u03ba\b2\u00032\u03bc\b2\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00033\u03c7\b3\u00014\u00014\u00015\u00035\u03cc\b5\u0001"+
		"6\u00016\u00016\u00016\u00036\u03d2\b6\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00037\u03da\b7\u00017\u00037\u03dd\b7\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00037\u03e7\b7\u00018\u00038\u03ea\b8\u0001"+
		"8\u00018\u00018\u00018\u00058\u03f0\b8\n8\f8\u03f3\t8\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u00039\u03fb\b9\u00019\u00039\u03fe\b9\u00019\u0001"+
		"9\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0003<\u0414"+
		"\b<\u0001<\u0001<\u0005<\u0418\b<\n<\f<\u041b\t<\u0001<\u0001<\u0001<"+
		"\u0001<\u0003<\u0421\b<\u0001<\u0003<\u0424\b<\u0001=\u0001=\u0005=\u0428"+
		"\b=\n=\f=\u042b\t=\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"@\u0001@\u0001@\u0003@\u0437\b@\u0001@\u0001@\u0001@\u0003@\u043c\b@\u0001"+
		"@\u0001@\u0001@\u0003@\u0441\b@\u0001@\u0001@\u0001@\u0003@\u0446\b@\u0001"+
		"@\u0001@\u0001@\u0003@\u044b\b@\u0003@\u044d\b@\u0001A\u0001A\u0001A\u0003"+
		"A\u0452\bA\u0001B\u0001B\u0001B\u0001B\u0001C\u0005C\u0459\bC\nC\fC\u045c"+
		"\tC\u0001D\u0001D\u0001D\u0003D\u0461\bD\u0001D\u0001D\u0001E\u0001E\u0005"+
		"E\u0467\bE\nE\fE\u046a\tE\u0001F\u0001F\u0001G\u0001G\u0001G\u0005G\u0471"+
		"\bG\nG\fG\u0474\tG\u0001G\u0003G\u0477\bG\u0001H\u0001H\u0001H\u0003H"+
		"\u047c\bH\u0001H\u0003H\u047f\bH\u0001H\u0003H\u0482\bH\u0001H\u0000\u0001"+
		"DI\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0000\t\u0002\u000088NU\u0002"+
		"\u0000==\u007f\u007f\u0001\u0000AB\u0003\u00001244II\u0001\u0000XY\u0002"+
		"\u0000,,~~\u0002\u0000]^`g\u0002\u0000\u000b\f\u000e\u0010\u0001\u0000"+
		"\u0016\u0018\u0529\u0000\u0097\u0001\u0000\u0000\u0000\u0002\u009c\u0001"+
		"\u0000\u0000\u0000\u0004\u00aa\u0001\u0000\u0000\u0000\u0006\u00ba\u0001"+
		"\u0000\u0000\u0000\b\u00bc\u0001\u0000\u0000\u0000\n\u00d1\u0001\u0000"+
		"\u0000\u0000\f\u00e9\u0001\u0000\u0000\u0000\u000e\u00ed\u0001\u0000\u0000"+
		"\u0000\u0010\u00f9\u0001\u0000\u0000\u0000\u0012\u010e\u0001\u0000\u0000"+
		"\u0000\u0014\u0120\u0001\u0000\u0000\u0000\u0016\u0130\u0001\u0000\u0000"+
		"\u0000\u0018\u0176\u0001\u0000\u0000\u0000\u001a\u0178\u0001\u0000\u0000"+
		"\u0000\u001c\u0184\u0001\u0000\u0000\u0000\u001e\u01a2\u0001\u0000\u0000"+
		"\u0000 \u01a4\u0001\u0000\u0000\u0000\"\u01a7\u0001\u0000\u0000\u0000"+
		"$\u01c2\u0001\u0000\u0000\u0000&\u01c4\u0001\u0000\u0000\u0000(\u01ce"+
		"\u0001\u0000\u0000\u0000*\u01d2\u0001\u0000\u0000\u0000,\u01dc\u0001\u0000"+
		"\u0000\u0000.\u01ea\u0001\u0000\u0000\u00000\u01fb\u0001\u0000\u0000\u0000"+
		"2\u0214\u0001\u0000\u0000\u00004\u021f\u0001\u0000\u0000\u00006\u0223"+
		"\u0001\u0000\u0000\u00008\u0229\u0001\u0000\u0000\u0000:\u022d\u0001\u0000"+
		"\u0000\u0000<\u023f\u0001\u0000\u0000\u0000>\u0250\u0001\u0000\u0000\u0000"+
		"@\u026d\u0001\u0000\u0000\u0000B\u027d\u0001\u0000\u0000\u0000D\u02a3"+
		"\u0001\u0000\u0000\u0000F\u02d4\u0001\u0000\u0000\u0000H\u02d6\u0001\u0000"+
		"\u0000\u0000J\u02dc\u0001\u0000\u0000\u0000L\u02e0\u0001\u0000\u0000\u0000"+
		"N\u02f6\u0001\u0000\u0000\u0000P\u0306\u0001\u0000\u0000\u0000R\u030f"+
		"\u0001\u0000\u0000\u0000T\u0318\u0001\u0000\u0000\u0000V\u0329\u0001\u0000"+
		"\u0000\u0000X\u032f\u0001\u0000\u0000\u0000Z\u0332\u0001\u0000\u0000\u0000"+
		"\\\u0374\u0001\u0000\u0000\u0000^\u0378\u0001\u0000\u0000\u0000`\u037f"+
		"\u0001\u0000\u0000\u0000b\u0381\u0001\u0000\u0000\u0000d\u03bb\u0001\u0000"+
		"\u0000\u0000f\u03c6\u0001\u0000\u0000\u0000h\u03c8\u0001\u0000\u0000\u0000"+
		"j\u03cb\u0001\u0000\u0000\u0000l\u03d1\u0001\u0000\u0000\u0000n\u03e6"+
		"\u0001\u0000\u0000\u0000p\u03e9\u0001\u0000\u0000\u0000r\u03f6\u0001\u0000"+
		"\u0000\u0000t\u0404\u0001\u0000\u0000\u0000v\u040a\u0001\u0000\u0000\u0000"+
		"x\u0423\u0001\u0000\u0000\u0000z\u0429\u0001\u0000\u0000\u0000|\u042c"+
		"\u0001\u0000\u0000\u0000~\u042e\u0001\u0000\u0000\u0000\u0080\u044c\u0001"+
		"\u0000\u0000\u0000\u0082\u0451\u0001\u0000\u0000\u0000\u0084\u0453\u0001"+
		"\u0000\u0000\u0000\u0086\u045a\u0001\u0000\u0000\u0000\u0088\u045d\u0001"+
		"\u0000\u0000\u0000\u008a\u0464\u0001\u0000\u0000\u0000\u008c\u046b\u0001"+
		"\u0000\u0000\u0000\u008e\u046d\u0001\u0000\u0000\u0000\u0090\u0478\u0001"+
		"\u0000\u0000\u0000\u0092\u0096\u0003x<\u0000\u0093\u0096\u0003\u0084B"+
		"\u0000\u0094\u0096\u0003\u0002\u0001\u0000\u0095\u0092\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0000\u0000"+
		"\u0001\u009b\u0001\u0001\u0000\u0000\u0000\u009c\u00a0\u0005\u0003\u0000"+
		"\u0000\u009d\u009f\u0003\u0004\u0002\u0000\u009e\u009d\u0001\u0000\u0000"+
		"\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u001f\u0000"+
		"\u0000\u00a4\u0003\u0001\u0000\u0000\u0000\u00a5\u00ab\u0003\u0006\u0003"+
		"\u0000\u00a6\u00ab\u0003\n\u0005\u0000\u00a7\u00ab\u0003\"\u0011\u0000"+
		"\u00a8\u00ab\u0003\u0014\n\u0000\u00a9\u00ab\u0003B!\u0000\u00aa\u00a5"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000\u00aa\u00a7"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u0005\u0001\u0000\u0000\u0000\u00ac\u00b2"+
		"\u00056\u0000\u0000\u00ad\u00b3\u0005~\u0000\u0000\u00ae\u00af\u0005Z"+
		"\u0000\u0000\u00af\u00b0\u00059\u0000\u0000\u00b0\u00b3\u0005~\u0000\u0000"+
		"\u00b1\u00b3\u0003\b\u0004\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000\u00b2"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005:\u0000\u0000\u00b5\u00b6"+
		"\u0005v\u0000\u0000\u00b6\u00bb\u0003j5\u0000\u00b7\u00b8\u00056\u0000"+
		"\u0000\u00b8\u00b9\u0005v\u0000\u0000\u00b9\u00bb\u0003j5\u0000\u00ba"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000\u00bb"+
		"\u0007\u0001\u0000\u0000\u0000\u00bc\u00cd\u0005l\u0000\u0000\u00bd\u00c0"+
		"\u0005~\u0000\u0000\u00be\u00bf\u00059\u0000\u0000\u00bf\u00c1\u0005~"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00ca\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005n\u0000"+
		"\u0000\u00c3\u00c6\u0005~\u0000\u0000\u00c4\u00c5\u00059\u0000\u0000\u00c5"+
		"\u00c7\u0005~\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00bd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005m\u0000\u0000\u00d0\t\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0005@\u0000\u0000\u00d2\u00d3\u0005h\u0000"+
		"\u0000\u00d3\u00d8\u0005l\u0000\u0000\u00d4\u00d9\u0003\f\u0006\u0000"+
		"\u00d5\u00d9\u0003\u000e\u0007\u0000\u00d6\u00d9\u0003\u0010\b\u0000\u00d7"+
		"\u00d9\u0003\u0012\t\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d8\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00e3\u0001\u0000\u0000\u0000\u00da\u00df"+
		"\u0005n\u0000\u0000\u00db\u00e0\u0003\f\u0006\u0000\u00dc\u00e0\u0003"+
		"\u000e\u0007\u0000\u00dd\u00e0\u0003\u0010\b\u0000\u00de\u00e0\u0003\u0012"+
		"\t\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00dc\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00da\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005m\u0000\u0000"+
		"\u00e7\u00e8\u0005i\u0000\u0000\u00e8\u000b\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0005C\u0000\u0000\u00ea\u00eb\u0005p\u0000\u0000\u00eb\u00ec\u0005"+
		"v\u0000\u0000\u00ec\r\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005D\u0000"+
		"\u0000\u00ee\u00ef\u0005p\u0000\u0000\u00ef\u00f0\u0005w\u0000\u0000\u00f0"+
		"\u000f\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005E\u0000\u0000\u00f2\u00f3"+
		"\u0005p\u0000\u0000\u00f3\u00f4\u0005j\u0000\u0000\u00f4\u00f5\u0005v"+
		"\u0000\u0000\u00f5\u00fa\u0005k\u0000\u0000\u00f6\u00f7\u0005F\u0000\u0000"+
		"\u00f7\u00f8\u0005p\u0000\u0000\u00f8\u00fa\u0005v\u0000\u0000\u00f9\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000\u00fa\u0011"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u00057\u0000\u0000\u00fc\u00fd\u0005"+
		"p\u0000\u0000\u00fd\u0106\u0005j\u0000\u0000\u00fe\u0103\u0005~\u0000"+
		"\u0000\u00ff\u0100\u0005n\u0000\u0000\u0100\u0102\u0005~\u0000\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106"+
		"\u00fe\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u010f\u0005k\u0000\u0000\u0109\u010a"+
		"\u00057\u0000\u0000\u010a\u010b\u0005p\u0000\u0000\u010b\u010c\u0005j"+
		"\u0000\u0000\u010c\u010d\u0005~\u0000\u0000\u010d\u010f\u0005k\u0000\u0000"+
		"\u010e\u00fb\u0001\u0000\u0000\u0000\u010e\u0109\u0001\u0000\u0000\u0000"+
		"\u010f\u0013\u0001\u0000\u0000\u0000\u0110\u0112\u0005/\u0000\u0000\u0111"+
		"\u0110\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0114\u0001\u0000\u0000\u0000\u0113\u0115\u0005~\u0000\u0000\u0114\u0113"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\u011b\u0003\u001c\u000e\u0000\u0117\u0119"+
		"\u0005p\u0000\u0000\u0118\u011a\u0005~\u0000\u0000\u0119\u0118\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011c\u0001\u0000"+
		"\u0000\u0000\u011b\u0117\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0003\u001a"+
		"\r\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u0121\u0003\u0018\f"+
		"\u0000\u0120\u0111\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000"+
		"\u0000\u0121\u0015\u0001\u0000\u0000\u0000\u0122\u0124\u0003 \u0010\u0000"+
		"\u0123\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005~\u0000\u0000\u0126"+
		"\u012b\u0003\u001c\u000e\u0000\u0127\u0129\u0005p\u0000\u0000\u0128\u012a"+
		"\u0005~\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129\u012a\u0001"+
		"\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u0127\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0003\u001a\r\u0000\u012e\u0131\u0001\u0000"+
		"\u0000\u0000\u012f\u0131\u0003\u0018\f\u0000\u0130\u0123\u0001\u0000\u0000"+
		"\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0017\u0001\u0000\u0000"+
		"\u0000\u0132\u0134\u0003 \u0010\u0000\u0133\u0132\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000"+
		"\u0135\u0137\u0005~\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u013d\u0003\u001c\u000e\u0000\u0139\u013b\u0005p\u0000\u0000\u013a\u013c"+
		"\u0005~\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u0139\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001"+
		"\u0000\u0000\u0000\u013f\u0141\u0005W\u0000\u0000\u0140\u0142\u0005l\u0000"+
		"\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u0142\u0146\u0001\u0000\u0000\u0000\u0143\u0145\u0003B!\u0000\u0144"+
		"\u0143\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146"+
		"\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149"+
		"\u014b\u0005m\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0001\u0000\u0000\u0000\u014b\u0177\u0001\u0000\u0000\u0000\u014c\u014e"+
		"\u0005~\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014d\u014e\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0154\u0003"+
		"\u001c\u000e\u0000\u0150\u0152\u0005p\u0000\u0000\u0151\u0153\u0005~\u0000"+
		"\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000"+
		"\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0150\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0157\u0001\u0000\u0000"+
		"\u0000\u0156\u0158\u0005l\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015c\u0001\u0000\u0000\u0000"+
		"\u0159\u015b\u0003B!\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b\u015e"+
		"\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d\u015f\u0001\u0000\u0000\u0000\u015e\u015c"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0005m\u0000\u0000\u0160\u0177\u0001"+
		"\u0000\u0000\u0000\u0161\u0163\u0005U\u0000\u0000\u0162\u0161\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u0164\u016d\u0005h\u0000\u0000\u0165\u016a\u0005~\u0000\u0000"+
		"\u0166\u0167\u0005n\u0000\u0000\u0167\u0169\u0005~\u0000\u0000\u0168\u0166"+
		"\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168"+
		"\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016e"+
		"\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u0165"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0005i\u0000\u0000\u0170\u0171\u0005"+
		"W\u0000\u0000\u0171\u0177\u0003\u001a\r\u0000\u0172\u0173\u0005h\u0000"+
		"\u0000\u0173\u0174\u0005i\u0000\u0000\u0174\u0175\u0005W\u0000\u0000\u0175"+
		"\u0177\u0003\u001a\r\u0000\u0176\u0133\u0001\u0000\u0000\u0000\u0176\u014d"+
		"\u0001\u0000\u0000\u0000\u0176\u0162\u0001\u0000\u0000\u0000\u0176\u0172"+
		"\u0001\u0000\u0000\u0000\u0177\u0019\u0001\u0000\u0000\u0000\u0178\u017c"+
		"\u0005l\u0000\u0000\u0179\u017b\u0003B!\u0000\u017a\u0179\u0001\u0000"+
		"\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000"+
		"\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0181\u0003Z-\u0000"+
		"\u0180\u017f\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0005m\u0000\u0000\u0183"+
		"\u001b\u0001\u0000\u0000\u0000\u0184\u018d\u0005h\u0000\u0000\u0185\u018a"+
		"\u0003\u001e\u000f\u0000\u0186\u0187\u0005n\u0000\u0000\u0187\u0189\u0003"+
		"\u001e\u000f\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0189\u018c\u0001"+
		"\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001"+
		"\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001"+
		"\u0000\u0000\u0000\u018d\u0185\u0001\u0000\u0000\u0000\u018d\u018e\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0005"+
		"i\u0000\u0000\u0190\u001d\u0001\u0000\u0000\u0000\u0191\u0192\u0005~\u0000"+
		"\u0000\u0192\u0193\u0005p\u0000\u0000\u0193\u0196\u0005~\u0000\u0000\u0194"+
		"\u0195\u0005V\u0000\u0000\u0195\u0197\u0003@ \u0000\u0196\u0194\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u01a3\u0001"+
		"\u0000\u0000\u0000\u0198\u01a3\u0005~\u0000\u0000\u0199\u019a\u0003 \u0010"+
		"\u0000\u019a\u019b\u0005~\u0000\u0000\u019b\u019c\u0005p\u0000\u0000\u019c"+
		"\u019f\u0005~\u0000\u0000\u019d\u019e\u0005V\u0000\u0000\u019e\u01a0\u0003"+
		"@ \u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u01a3\u0005~\u0000\u0000"+
		"\u01a2\u0191\u0001\u0000\u0000\u0000\u01a2\u0198\u0001\u0000\u0000\u0000"+
		"\u01a2\u0199\u0001\u0000\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a3\u001f\u0001\u0000\u0000\u0000\u01a4\u01a5\u0007\u0000\u0000\u0000"+
		"\u01a5!\u0001\u0000\u0000\u0000\u01a6\u01a8\u0003 \u0010\u0000\u01a7\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa"+
		"\u0001\u0000\u0000\u0000\u01a9\u01ab\u00055\u0000\u0000\u01aa\u01a9\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ac\u01af\u0005~\u0000\u0000\u01ad\u01ae\u0007\u0001"+
		"\u0000\u0000\u01ae\u01b0\u0005~\u0000\u0000\u01af\u01ad\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b5\u0005l\u0000\u0000\u01b2\u01b4\u0003$\u0012\u0000\u01b3"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0005m\u0000\u0000\u01b9#\u0001\u0000\u0000\u0000\u01ba\u01c3\u0003"+
		"*\u0015\u0000\u01bb\u01c3\u0003,\u0016\u0000\u01bc\u01c3\u0003\u0016\u000b"+
		"\u0000\u01bd\u01c3\u00032\u0019\u0000\u01be\u01c3\u0003.\u0017\u0000\u01bf"+
		"\u01c3\u00036\u001b\u0000\u01c0\u01c3\u0003(\u0014\u0000\u01c1\u01c3\u0003"+
		"&\u0013\u0000\u01c2\u01ba\u0001\u0000\u0000\u0000\u01c2\u01bb\u0001\u0000"+
		"\u0000\u0000\u01c2\u01bc\u0001\u0000\u0000\u0000\u01c2\u01bd\u0001\u0000"+
		"\u0000\u0000\u01c2\u01be\u0001\u0000\u0000\u0000\u01c2\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c3%\u0001\u0000\u0000\u0000\u01c4\u01c5\u0007\u0002\u0000"+
		"\u0000\u01c5\u01ca\u0003\u001c\u000e\u0000\u01c6\u01c8\u0005p\u0000\u0000"+
		"\u01c7\u01c9\u0005~\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca"+
		"\u01c6\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd\u0003\u001a\r\u0000\u01cd\'"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u00053\u0000\u0000\u01cf\u01d0\u0003"+
		"\u001c\u000e\u0000\u01d0\u01d1\u0003\u001a\r\u0000\u01d1)\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0005>\u0000\u0000\u01d3\u01d5\u0005h\u0000\u0000"+
		"\u01d4\u01d6\u0003@ \u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0005i\u0000\u0000\u01d8\u01d9\u00034\u001a\u0000\u01d9\u01da\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0003j5\u0000\u01db+\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0005?\u0000\u0000\u01dd\u01df\u0005h\u0000\u0000\u01de\u01e0"+
		"\u0003@ \u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005i\u0000"+
		"\u0000\u01e2\u01e3\u00036\u001b\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e5\u0003j5\u0000\u01e5-\u0001\u0000\u0000\u0000\u01e6\u01e8"+
		"\u0003 \u0010\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01eb\u0003"+
		"0\u0018\u0000\u01ea\u01e7\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ef\u0005~\u0000"+
		"\u0000\u01ed\u01ee\u0005p\u0000\u0000\u01ee\u01f0\u0003D\"\u0000\u01ef"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005V\u0000\u0000\u01f2\u01f4"+
		"\u0003D\"\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005"+
		"9\u0000\u0000\u01f6\u01f8\u0005~\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0003j5\u0000\u01fa/\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\u0007\u0003\u0000\u0000\u01fc1\u0001\u0000\u0000\u0000\u01fd\u01ff"+
		"\u0003 \u0010\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001"+
		"\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0203\u0003"+
		"4\u001a\u0000\u0201\u0202\u0005V\u0000\u0000\u0202\u0204\u0003D\"\u0000"+
		"\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0206\u0003j5\u0000\u0206\u0215"+
		"\u0001\u0000\u0000\u0000\u0207\u0209\u0003 \u0010\u0000\u0208\u0207\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020b\u0001"+
		"\u0000\u0000\u0000\u020a\u020c\u00030\u0018\u0000\u020b\u020a\u0001\u0000"+
		"\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000"+
		"\u0000\u0000\u020d\u0210\u00034\u001a\u0000\u020e\u020f\u0005V\u0000\u0000"+
		"\u020f\u0211\u0003D\"\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0003j5\u0000\u0213\u0215\u0001\u0000\u0000\u0000\u0214\u01fe\u0001"+
		"\u0000\u0000\u0000\u0214\u0208\u0001\u0000\u0000\u0000\u02153\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0005~\u0000\u0000\u0217\u0218\u0005p\u0000\u0000"+
		"\u0218\u0220\u0003D\"\u0000\u0219\u0220\u0003\u0012\t\u0000\u021a\u021b"+
		"\u0005~\u0000\u0000\u021b\u021c\u0005r\u0000\u0000\u021c\u021d\u0005p"+
		"\u0000\u0000\u021d\u0220\u0003D\"\u0000\u021e\u0220\u0003\u0012\t\u0000"+
		"\u021f\u0216\u0001\u0000\u0000\u0000\u021f\u0219\u0001\u0000\u0000\u0000"+
		"\u021f\u021a\u0001\u0000\u0000\u0000\u021f\u021e\u0001\u0000\u0000\u0000"+
		"\u02205\u0001\u0000\u0000\u0000\u0221\u0224\u00034\u001a\u0000\u0222\u0224"+
		"\u00038\u001c\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0222\u0001"+
		"\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0226\u0005"+
		"V\u0000\u0000\u0226\u0227\u0003:\u001d\u0000\u0227\u0228\u0003j5\u0000"+
		"\u02287\u0001\u0000\u0000\u0000\u0229\u022b\u0005~\u0000\u0000\u022a\u022c"+
		"\u0003<\u001e\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022b\u022c\u0001"+
		"\u0000\u0000\u0000\u022c9\u0001\u0000\u0000\u0000\u022d\u022e\u0005;\u0000"+
		"\u0000\u022e\u0230\u0005~\u0000\u0000\u022f\u0231\u0003<\u001e\u0000\u0230"+
		"\u022f\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231"+
		"\u0232\u0001\u0000\u0000\u0000\u0232\u023b\u0005h\u0000\u0000\u0233\u0238"+
		"\u0003D\"\u0000\u0234\u0235\u0005n\u0000\u0000\u0235\u0237\u0003D\"\u0000"+
		"\u0236\u0234\u0001\u0000\u0000\u0000\u0237\u023a\u0001\u0000\u0000\u0000"+
		"\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000"+
		"\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000"+
		"\u023b\u0233\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000"+
		"\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023e\u0005i\u0000\u0000\u023e"+
		";\u0001\u0000\u0000\u0000\u023f\u0240\u0005e\u0000\u0000\u0240\u0242\u0005"+
		"~\u0000\u0000\u0241\u0243\u0003d2\u0000\u0242\u0241\u0001\u0000\u0000"+
		"\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u024b\u0001\u0000\u0000"+
		"\u0000\u0244\u0245\u0005n\u0000\u0000\u0245\u0247\u0005~\u0000\u0000\u0246"+
		"\u0248\u0003d2\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0247\u0248\u0001"+
		"\u0000\u0000\u0000\u0248\u024a\u0001\u0000\u0000\u0000\u0249\u0244\u0001"+
		"\u0000\u0000\u0000\u024a\u024d\u0001\u0000\u0000\u0000\u024b\u0249\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024e\u0001"+
		"\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024e\u024f\u0005"+
		"d\u0000\u0000\u024f=\u0001\u0000\u0000\u0000\u0250\u0259\u0005l\u0000"+
		"\u0000\u0251\u0256\u00034\u001a\u0000\u0252\u0253\u0005n\u0000\u0000\u0253"+
		"\u0255\u00034\u001a\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0258"+
		"\u0001\u0000\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256\u0257"+
		"\u0001\u0000\u0000\u0000\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256"+
		"\u0001\u0000\u0000\u0000\u0259\u0251\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\u0001\u0000\u0000\u0000\u025a\u025c\u0001\u0000\u0000\u0000\u025b\u025d"+
		"\u0005n\u0000\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025c\u025d\u0001"+
		"\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0005"+
		"m\u0000\u0000\u025f?\u0001\u0000\u0000\u0000\u0260\u0262\u0007\u0004\u0000"+
		"\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000"+
		"\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u026e\u0005t\u0000\u0000"+
		"\u0264\u0266\u0007\u0004\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000"+
		"\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000"+
		"\u0267\u026e\u0005u\u0000\u0000\u0268\u026e\u0005v\u0000\u0000\u0269\u026e"+
		"\u0005w\u0000\u0000\u026a\u026e\u0005y\u0000\u0000\u026b\u026e\u0005x"+
		"\u0000\u0000\u026c\u026e\u0005<\u0000\u0000\u026d\u0261\u0001\u0000\u0000"+
		"\u0000\u026d\u0265\u0001\u0000\u0000\u0000\u026d\u0268\u0001\u0000\u0000"+
		"\u0000\u026d\u0269\u0001\u0000\u0000\u0000\u026d\u026a\u0001\u0000\u0000"+
		"\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d\u026c\u0001\u0000\u0000"+
		"\u0000\u026eA\u0001\u0000\u0000\u0000\u026f\u027e\u0003.\u0017\u0000\u0270"+
		"\u0272\u0005l\u0000\u0000\u0271\u0270\u0001\u0000\u0000\u0000\u0271\u0272"+
		"\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u0275"+
		"\u0003.\u0017\u0000\u0274\u0276\u0005m\u0000\u0000\u0275\u0274\u0001\u0000"+
		"\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u027e\u0001\u0000"+
		"\u0000\u0000\u0277\u027e\u00036\u001b\u0000\u0278\u027e\u0003F#\u0000"+
		"\u0279\u027e\u0003T*\u0000\u027a\u027e\u0003V+\u0000\u027b\u027e\u0003"+
		"l6\u0000\u027c\u027e\u0003X,\u0000\u027d\u026f\u0001\u0000\u0000\u0000"+
		"\u027d\u0271\u0001\u0000\u0000\u0000\u027d\u0277\u0001\u0000\u0000\u0000"+
		"\u027d\u0278\u0001\u0000\u0000\u0000\u027d\u0279\u0001\u0000\u0000\u0000"+
		"\u027d\u027a\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000"+
		"\u027d\u027c\u0001\u0000\u0000\u0000\u027eC\u0001\u0000\u0000\u0000\u027f"+
		"\u0280\u0006\"\uffff\uffff\u0000\u0280\u02a4\u0003>\u001f\u0000\u0281"+
		"\u02a4\u00036\u001b\u0000\u0282\u02a4\u00038\u001c\u0000\u0283\u02a4\u0003"+
		"\u0018\f\u0000\u0284\u02a4\u0005<\u0000\u0000\u0285\u02a4\u0005M\u0000"+
		"\u0000\u0286\u02a4\u0005~\u0000\u0000\u0287\u0288\u0005~\u0000\u0000\u0288"+
		"\u0289\u0005X\u0000\u0000\u0289\u02a4\u0005X\u0000\u0000\u028a\u028b\u0005"+
		"~\u0000\u0000\u028b\u028c\u0005Y\u0000\u0000\u028c\u02a4\u0005Y\u0000"+
		"\u0000\u028d\u02a4\u0003@ \u0000\u028e\u02a4\u0003\\.\u0000\u028f\u0290"+
		"\u0005e\u0000\u0000\u0290\u0291\u0003D\"\u0000\u0291\u0292\u0005d\u0000"+
		"\u0000\u0292\u0293\u0005~\u0000\u0000\u0293\u02a4\u0001\u0000\u0000\u0000"+
		"\u0294\u0295\u0005h\u0000\u0000\u0295\u0296\u0003D\"\u0000\u0296\u0297"+
		"\u00059\u0000\u0000\u0297\u0298\u0005~\u0000\u0000\u0298\u0299\u0005i"+
		"\u0000\u0000\u0299\u02a4\u0001\u0000\u0000\u0000\u029a\u02a4\u0003^/\u0000"+
		"\u029b\u02a4\u0003Z-\u0000\u029c\u029e\u0005l\u0000\u0000\u029d\u029c"+
		"\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e\u029f"+
		"\u0001\u0000\u0000\u0000\u029f\u02a1\u0003Z-\u0000\u02a0\u02a2\u0005m"+
		"\u0000\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a2\u02a4\u0001\u0000\u0000\u0000\u02a3\u027f\u0001\u0000"+
		"\u0000\u0000\u02a3\u0281\u0001\u0000\u0000\u0000\u02a3\u0282\u0001\u0000"+
		"\u0000\u0000\u02a3\u0283\u0001\u0000\u0000\u0000\u02a3\u0284\u0001\u0000"+
		"\u0000\u0000\u02a3\u0285\u0001\u0000\u0000\u0000\u02a3\u0286\u0001\u0000"+
		"\u0000\u0000\u02a3\u0287\u0001\u0000\u0000\u0000\u02a3\u028a\u0001\u0000"+
		"\u0000\u0000\u02a3\u028d\u0001\u0000\u0000\u0000\u02a3\u028e\u0001\u0000"+
		"\u0000\u0000\u02a3\u028f\u0001\u0000\u0000\u0000\u02a3\u0294\u0001\u0000"+
		"\u0000\u0000\u02a3\u029a\u0001\u0000\u0000\u0000\u02a3\u029b\u0001\u0000"+
		"\u0000\u0000\u02a3\u029d\u0001\u0000\u0000\u0000\u02a4\u02c1\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a6\n\n\u0000\u0000\u02a6\u02a7\u0005q\u0000\u0000"+
		"\u02a7\u02c0\u0003D\"\u000b\u02a8\u02a9\n\t\u0000\u0000\u02a9\u02aa\u0005"+
		"r\u0000\u0000\u02aa\u02ab\u0005q\u0000\u0000\u02ab\u02c0\u0003D\"\n\u02ac"+
		"\u02ad\n\b\u0000\u0000\u02ad\u02ae\u0003h4\u0000\u02ae\u02af\u0003D\""+
		"\t\u02af\u02c0\u0001\u0000\u0000\u0000\u02b0\u02b1\n\u0007\u0000\u0000"+
		"\u02b1\u02b2\u0003f3\u0000\u02b2\u02b3\u0003D\"\b\u02b3\u02c0\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b5\n\u0017\u0000\u0000\u02b5\u02c0\u0003d2\u0000"+
		"\u02b6\u02b7\n\u0012\u0000\u0000\u02b7\u02ba\u0005V\u0000\u0000\u02b8"+
		"\u02bb\u0003^/\u0000\u02b9\u02bb\u0003@ \u0000\u02ba\u02b8\u0001\u0000"+
		"\u0000\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02bb\u02c0\u0001\u0000"+
		"\u0000\u0000\u02bc\u02bd\n\u0004\u0000\u0000\u02bd\u02be\u00059\u0000"+
		"\u0000\u02be\u02c0\u0005~\u0000\u0000\u02bf\u02a5\u0001\u0000\u0000\u0000"+
		"\u02bf\u02a8\u0001\u0000\u0000\u0000\u02bf\u02ac\u0001\u0000\u0000\u0000"+
		"\u02bf\u02b0\u0001\u0000\u0000\u0000\u02bf\u02b4\u0001\u0000\u0000\u0000"+
		"\u02bf\u02b6\u0001\u0000\u0000\u0000\u02bf\u02bc\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c3\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000"+
		"\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2E\u0001\u0000\u0000\u0000\u02c3"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c4\u02c5\u0005 \u0000\u0000\u02c5\u02c6"+
		"\u0005h\u0000\u0000\u02c6\u02c7\u0003D\"\u0000\u02c7\u02c8\u0005i\u0000"+
		"\u0000\u02c8\u02cc\u0003\u001a\r\u0000\u02c9\u02cb\u0003H$\u0000\u02ca"+
		"\u02c9\u0001\u0000\u0000\u0000\u02cb\u02ce\u0001\u0000\u0000\u0000\u02cc"+
		"\u02ca\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd"+
		"\u02d0\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf"+
		"\u02d1\u0003J%\u0000\u02d0\u02cf\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d5\u0001\u0000\u0000\u0000\u02d2\u02d5\u0003"+
		"L&\u0000\u02d3\u02d5\u0003R)\u0000\u02d4\u02c4\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000"+
		"\u02d5G\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005!\u0000\u0000\u02d7\u02d8"+
		"\u0005h\u0000\u0000\u02d8\u02d9\u0003D\"\u0000\u02d9\u02da\u0005i\u0000"+
		"\u0000\u02da\u02db\u0003\u001a\r\u0000\u02dbI\u0001\u0000\u0000\u0000"+
		"\u02dc\u02dd\u0005\"\u0000\u0000\u02dd\u02de\u0003\u001a\r\u0000\u02de"+
		"K\u0001\u0000\u0000\u0000\u02df\u02e1\u0005h\u0000\u0000\u02e0\u02df\u0001"+
		"\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001"+
		"\u0000\u0000\u0000\u02e2\u02e4\u0003D\"\u0000\u02e3\u02e5\u0005i\u0000"+
		"\u0000\u02e4\u02e3\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000"+
		"\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02e8\u0005\u0080\u0000"+
		"\u0000\u02e7\u02e9\u0005h\u0000\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000"+
		"\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000"+
		"\u02ea\u02ec\u0003B!\u0000\u02eb\u02ed\u0005i\u0000\u0000\u02ec\u02eb"+
		"\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u02f1"+
		"\u0001\u0000\u0000\u0000\u02ee\u02f0\u0003N\'\u0000\u02ef\u02ee\u0001"+
		"\u0000\u0000\u0000\u02f0\u02f3\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f4\u02f5\u0003"+
		"P(\u0000\u02f5M\u0001\u0000\u0000\u0000\u02f6\u02f8\u0005p\u0000\u0000"+
		"\u02f7\u02f9\u0005h\u0000\u0000\u02f8\u02f7\u0001\u0000\u0000\u0000\u02f8"+
		"\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fc\u0003D\"\u0000\u02fb\u02fd\u0005i\u0000\u0000\u02fc\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001"+
		"\u0000\u0000\u0000\u02fe\u0300\u0005\u0080\u0000\u0000\u02ff\u0301\u0005"+
		"h\u0000\u0000\u0300\u02ff\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000"+
		"\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0304\u0003B!\u0000"+
		"\u0303\u0305\u0005i\u0000\u0000\u0304\u0303\u0001\u0000\u0000\u0000\u0304"+
		"\u0305\u0001\u0000\u0000\u0000\u0305O\u0001\u0000\u0000\u0000\u0306\u0308"+
		"\u0005p\u0000\u0000\u0307\u0309\u0005h\u0000\u0000\u0308\u0307\u0001\u0000"+
		"\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000"+
		"\u0000\u0000\u030a\u030c\u0003B!\u0000\u030b\u030d\u0005i\u0000\u0000"+
		"\u030c\u030b\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000\u0000"+
		"\u030dQ\u0001\u0000\u0000\u0000\u030e\u0310\u0005h\u0000\u0000\u030f\u030e"+
		"\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u0311"+
		"\u0001\u0000\u0000\u0000\u0311\u0313\u0003D\"\u0000\u0312\u0314\u0005"+
		"i\u0000\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000"+
		"\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0316\u0005W\u0000"+
		"\u0000\u0316\u0317\u0003D\"\u0000\u0317S\u0001\u0000\u0000\u0000\u0318"+
		"\u0319\u0005#\u0000\u0000\u0319\u031c\u0005h\u0000\u0000\u031a\u031d\u0003"+
		".\u0017\u0000\u031b\u031d\u0003D\"\u0000\u031c\u031a\u0001\u0000\u0000"+
		"\u0000\u031c\u031b\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000"+
		"\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031e\u0320\u0005o\u0000\u0000"+
		"\u031f\u0321\u0003D\"\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0320"+
		"\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322"+
		"\u0324\u0005o\u0000\u0000\u0323\u0325\u0003D\"\u0000\u0324\u0323\u0001"+
		"\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0326\u0001"+
		"\u0000\u0000\u0000\u0326\u0327\u0005i\u0000\u0000\u0327\u0328\u0003\u001a"+
		"\r\u0000\u0328U\u0001\u0000\u0000\u0000\u0329\u032a\u0005$\u0000\u0000"+
		"\u032a\u032b\u0005h\u0000\u0000\u032b\u032c\u0003D\"\u0000\u032c\u032d"+
		"\u0005i\u0000\u0000\u032d\u032e\u0003\u001a\r\u0000\u032eW\u0001\u0000"+
		"\u0000\u0000\u032f\u0330\u0003D\"\u0000\u0330\u0331\u0003j5\u0000\u0331"+
		"Y\u0001\u0000\u0000\u0000\u0332\u0334\u00050\u0000\u0000\u0333\u0335\u0005"+
		"h\u0000\u0000\u0334\u0333\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000"+
		"\u0000\u0000\u0335\u0337\u0001\u0000\u0000\u0000\u0336\u0338\u0003X,\u0000"+
		"\u0337\u0336\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000"+
		"\u0338\u033a\u0001\u0000\u0000\u0000\u0339\u033b\u0005i\u0000\u0000\u033a"+
		"\u0339\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b"+
		"\u033c\u0001\u0000\u0000\u0000\u033c\u033d\u0003j5\u0000\u033d[\u0001"+
		"\u0000\u0000\u0000\u033e\u033f\u0007\u0005\u0000\u0000\u033f\u0348\u0005"+
		"h\u0000\u0000\u0340\u0345\u0003D\"\u0000\u0341\u0342\u0005n\u0000\u0000"+
		"\u0342\u0344\u0003D\"\u0000\u0343\u0341\u0001\u0000\u0000\u0000\u0344"+
		"\u0347\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0345"+
		"\u0346\u0001\u0000\u0000\u0000\u0346\u0349\u0001\u0000\u0000\u0000\u0347"+
		"\u0345\u0001\u0000\u0000\u0000\u0348\u0340\u0001\u0000\u0000\u0000\u0348"+
		"\u0349\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034a"+
		"\u034b\u0005i\u0000\u0000\u034b\u0354\u0001\u0000\u0000\u0000\u034c\u034f"+
		"\u0005q\u0000\u0000\u034d\u0350\u0003\\.\u0000\u034e\u0350\u0005~\u0000"+
		"\u0000\u034f\u034d\u0001\u0000\u0000\u0000\u034f\u034e\u0001\u0000\u0000"+
		"\u0000\u0350\u0353\u0001\u0000\u0000\u0000\u0351\u0353\u0003^/\u0000\u0352"+
		"\u034c\u0001\u0000\u0000\u0000\u0352\u0351\u0001\u0000\u0000\u0000\u0353"+
		"\u0356\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0354"+
		"\u0355\u0001\u0000\u0000\u0000\u0355\u0375\u0001\u0000\u0000\u0000\u0356"+
		"\u0354\u0001\u0000\u0000\u0000\u0357\u0358\u0005s\u0000\u0000\u0358\u035b"+
		"\u0005~\u0000\u0000\u0359\u035b\u0005,\u0000\u0000\u035a\u0357\u0001\u0000"+
		"\u0000\u0000\u035a\u0359\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000"+
		"\u0000\u0000\u035c\u0365\u0005h\u0000\u0000\u035d\u0362\u0003D\"\u0000"+
		"\u035e\u035f\u0005n\u0000\u0000\u035f\u0361\u0003D\"\u0000\u0360\u035e"+
		"\u0001\u0000\u0000\u0000\u0361\u0364\u0001\u0000\u0000\u0000\u0362\u0360"+
		"\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363\u0366"+
		"\u0001\u0000\u0000\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0365\u035d"+
		"\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366\u0367"+
		"\u0001\u0000\u0000\u0000\u0367\u0368\u0005i\u0000\u0000\u0368\u0371\u0001"+
		"\u0000\u0000\u0000\u0369\u036c\u0005q\u0000\u0000\u036a\u036d\u0003\\"+
		".\u0000\u036b\u036d\u0005~\u0000\u0000\u036c\u036a\u0001\u0000\u0000\u0000"+
		"\u036c\u036b\u0001\u0000\u0000\u0000\u036d\u0370\u0001\u0000\u0000\u0000"+
		"\u036e\u0370\u0003^/\u0000\u036f\u0369\u0001\u0000\u0000\u0000\u036f\u036e"+
		"\u0001\u0000\u0000\u0000\u0370\u0373\u0001\u0000\u0000\u0000\u0371\u036f"+
		"\u0001\u0000\u0000\u0000\u0371\u0372\u0001\u0000\u0000\u0000\u0372\u0375"+
		"\u0001\u0000\u0000\u0000\u0373\u0371\u0001\u0000\u0000\u0000\u0374\u033e"+
		"\u0001\u0000\u0000\u0000\u0374\u035a\u0001\u0000\u0000\u0000\u0375]\u0001"+
		"\u0000\u0000\u0000\u0376\u0379\u0003d2\u0000\u0377\u0379\u0003b1\u0000"+
		"\u0378\u0376\u0001\u0000\u0000\u0000\u0378\u0377\u0001\u0000\u0000\u0000"+
		"\u0379_\u0001\u0000\u0000\u0000\u037a\u0380\u0003@ \u0000\u037b\u0380"+
		"\u0005~\u0000\u0000\u037c\u0380\u0003d2\u0000\u037d\u0380\u0003b1\u0000"+
		"\u037e\u0380\u0003\\.\u0000\u037f\u037a\u0001\u0000\u0000\u0000\u037f"+
		"\u037b\u0001\u0000\u0000\u0000\u037f\u037c\u0001\u0000\u0000\u0000\u037f"+
		"\u037d\u0001\u0000\u0000\u0000\u037f\u037e\u0001\u0000\u0000\u0000\u0380"+
		"a\u0001\u0000\u0000\u0000\u0381\u0390\u0005l\u0000\u0000\u0382\u0383\u0003"+
		"`0\u0000\u0383\u0384\u0005p\u0000\u0000\u0384\u0385\u0003`0\u0000\u0385"+
		"\u038d\u0001\u0000\u0000\u0000\u0386\u0387\u0005n\u0000\u0000\u0387\u0388"+
		"\u0003`0\u0000\u0388\u0389\u0005p\u0000\u0000\u0389\u038a\u0003`0\u0000"+
		"\u038a\u038c\u0001\u0000\u0000\u0000\u038b\u0386\u0001\u0000\u0000\u0000"+
		"\u038c\u038f\u0001\u0000\u0000\u0000\u038d\u038b\u0001\u0000\u0000\u0000"+
		"\u038d\u038e\u0001\u0000\u0000\u0000\u038e\u0391\u0001\u0000\u0000\u0000"+
		"\u038f\u038d\u0001\u0000\u0000\u0000\u0390\u0382\u0001\u0000\u0000\u0000"+
		"\u0390\u0391\u0001\u0000\u0000\u0000\u0391\u0393\u0001\u0000\u0000\u0000"+
		"\u0392\u0394\u0005n\u0000\u0000\u0393\u0392\u0001\u0000\u0000\u0000\u0393"+
		"\u0394\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395"+
		"\u0396\u0005m\u0000\u0000\u0396c\u0001\u0000\u0000\u0000\u0397\u03a0\u0005"+
		"j\u0000\u0000\u0398\u039d\u0003`0\u0000\u0399\u039a\u0005n\u0000\u0000"+
		"\u039a\u039c\u0003`0\u0000\u039b\u0399\u0001\u0000\u0000\u0000\u039c\u039f"+
		"\u0001\u0000\u0000\u0000\u039d\u039b\u0001\u0000\u0000\u0000\u039d\u039e"+
		"\u0001\u0000\u0000\u0000\u039e\u03a1\u0001\u0000\u0000\u0000\u039f\u039d"+
		"\u0001\u0000\u0000\u0000\u03a0\u0398\u0001\u0000\u0000\u0000\u03a0\u03a1"+
		"\u0001\u0000\u0000\u0000\u03a1\u03a3\u0001\u0000\u0000\u0000\u03a2\u03a4"+
		"\u0005n\u0000\u0000\u03a3\u03a2\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001"+
		"\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5\u03bc\u0005"+
		"k\u0000\u0000\u03a6\u03a8\u0005l\u0000\u0000\u03a7\u03a6\u0001\u0000\u0000"+
		"\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000"+
		"\u0000\u03a9\u03b2\u0005j\u0000\u0000\u03aa\u03af\u0003`0\u0000\u03ab"+
		"\u03ac\u0005n\u0000\u0000\u03ac\u03ae\u0003`0\u0000\u03ad\u03ab\u0001"+
		"\u0000\u0000\u0000\u03ae\u03b1\u0001\u0000\u0000\u0000\u03af\u03ad\u0001"+
		"\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000\u03b0\u03b3\u0001"+
		"\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b2\u03aa\u0001"+
		"\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000\u0000\u0000\u03b3\u03b5\u0001"+
		"\u0000\u0000\u0000\u03b4\u03b6\u0005n\u0000\u0000\u03b5\u03b4\u0001\u0000"+
		"\u0000\u0000\u03b5\u03b6\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000"+
		"\u0000\u0000\u03b7\u03b9\u0005k\u0000\u0000\u03b8\u03ba\u0005m\u0000\u0000"+
		"\u03b9\u03b8\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000\u0000"+
		"\u03ba\u03bc\u0001\u0000\u0000\u0000\u03bb\u0397\u0001\u0000\u0000\u0000"+
		"\u03bb\u03a7\u0001\u0000\u0000\u0000\u03bce\u0001\u0000\u0000\u0000\u03bd"+
		"\u03c7\u0005V\u0000\u0000\u03be\u03c7\u0005X\u0000\u0000\u03bf\u03c7\u0005"+
		"Y\u0000\u0000\u03c0\u03c7\u0005Z\u0000\u0000\u03c1\u03c7\u0005[\u0000"+
		"\u0000\u03c2\u03c3\u0005X\u0000\u0000\u03c3\u03c7\u0005V\u0000\u0000\u03c4"+
		"\u03c5\u0005Y\u0000\u0000\u03c5\u03c7\u0005V\u0000\u0000\u03c6\u03bd\u0001"+
		"\u0000\u0000\u0000\u03c6\u03be\u0001\u0000\u0000\u0000\u03c6\u03bf\u0001"+
		"\u0000\u0000\u0000\u03c6\u03c0\u0001\u0000\u0000\u0000\u03c6\u03c1\u0001"+
		"\u0000\u0000\u0000\u03c6\u03c2\u0001\u0000\u0000\u0000\u03c6\u03c4\u0001"+
		"\u0000\u0000\u0000\u03c7g\u0001\u0000\u0000\u0000\u03c8\u03c9\u0007\u0006"+
		"\u0000\u0000\u03c9i\u0001\u0000\u0000\u0000\u03ca\u03cc\u0005o\u0000\u0000"+
		"\u03cb\u03ca\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000"+
		"\u03cck\u0001\u0000\u0000\u0000\u03cd\u03d2\u0003n7\u0000\u03ce\u03d2"+
		"\u0003r9\u0000\u03cf\u03d2\u0003t:\u0000\u03d0\u03d2\u0003v;\u0000\u03d1"+
		"\u03cd\u0001\u0000\u0000\u0000\u03d1\u03ce\u0001\u0000\u0000\u0000\u03d1"+
		"\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d0\u0001\u0000\u0000\u0000\u03d2"+
		"m\u0001\u0000\u0000\u0000\u03d3\u03d4\u0005H\u0000\u0000\u03d4\u03d5\u0005"+
		"h\u0000\u0000\u03d5\u03d6\u0005v\u0000\u0000\u03d6\u03d7\u0005n\u0000"+
		"\u0000\u03d7\u03d9\u0003p8\u0000\u03d8\u03da\u0005i\u0000\u0000\u03d9"+
		"\u03d8\u0001\u0000\u0000\u0000\u03d9\u03da\u0001\u0000\u0000\u0000\u03da"+
		"\u03dc\u0001\u0000\u0000\u0000\u03db\u03dd\u0005o\u0000\u0000\u03dc\u03db"+
		"\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001\u0000\u0000\u0000\u03dd\u03e7"+
		"\u0001\u0000\u0000\u0000\u03de\u03df\u0005H\u0000\u0000\u03df\u03e0\u0005"+
		"h\u0000\u0000\u03e0\u03e1\u0005v\u0000\u0000\u03e1\u03e2\u0005n\u0000"+
		"\u0000\u03e2\u03e3\u0003\u0018\f\u0000\u03e3\u03e4\u0005i\u0000\u0000"+
		"\u03e4\u03e5\u0005o\u0000\u0000\u03e5\u03e7\u0001\u0000\u0000\u0000\u03e6"+
		"\u03d3\u0001\u0000\u0000\u0000\u03e6\u03de\u0001\u0000\u0000\u0000\u03e7"+
		"o\u0001\u0000\u0000\u0000\u03e8\u03ea\u0005U\u0000\u0000\u03e9\u03e8\u0001"+
		"\u0000\u0000\u0000\u03e9\u03ea\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001"+
		"\u0000\u0000\u0000\u03eb\u03ec\u0003\u001c\u000e\u0000\u03ec\u03ed\u0005"+
		"W\u0000\u0000\u03ed\u03f1\u0005l\u0000\u0000\u03ee\u03f0\u0003l6\u0000"+
		"\u03ef\u03ee\u0001\u0000\u0000\u0000\u03f0\u03f3\u0001\u0000\u0000\u0000"+
		"\u03f1\u03ef\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000\u0000\u0000"+
		"\u03f2\u03f4\u0001\u0000\u0000\u0000\u03f3\u03f1\u0001\u0000\u0000\u0000"+
		"\u03f4\u03f5\u0005m\u0000\u0000\u03f5q\u0001\u0000\u0000\u0000\u03f6\u03f7"+
		"\u0005J\u0000\u0000\u03f7\u03f8\u0005h\u0000\u0000\u03f8\u03fa\u0005v"+
		"\u0000\u0000\u03f9\u03fb\u0005~\u0000\u0000\u03fa\u03f9\u0001\u0000\u0000"+
		"\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fd\u0001\u0000\u0000"+
		"\u0000\u03fc\u03fe\u0005v\u0000\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000"+
		"\u03fd\u03fe\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000"+
		"\u03ff\u0400\u0005n\u0000\u0000\u0400\u0401\u0003\u0018\f\u0000\u0401"+
		"\u0402\u0005i\u0000\u0000\u0402\u0403\u0005o\u0000\u0000\u0403s\u0001"+
		"\u0000\u0000\u0000\u0404\u0405\u0005K\u0000\u0000\u0405\u0406\u0005h\u0000"+
		"\u0000\u0406\u0407\u0003\u0018\f\u0000\u0407\u0408\u0005i\u0000\u0000"+
		"\u0408\u0409\u0005o\u0000\u0000\u0409u\u0001\u0000\u0000\u0000\u040a\u040b"+
		"\u0005L\u0000\u0000\u040b\u040c\u0005h\u0000\u0000\u040c\u040d\u0003\u0018"+
		"\f\u0000\u040d\u040e\u0005i\u0000\u0000\u040e\u040f\u0005o\u0000\u0000"+
		"\u040fw\u0001\u0000\u0000\u0000\u0410\u0411\u0005\u0001\u0000\u0000\u0411"+
		"\u0413\u0005\r\u0000\u0000\u0412\u0414\u0003z=\u0000\u0413\u0412\u0001"+
		"\u0000\u0000\u0000\u0413\u0414\u0001\u0000\u0000\u0000\u0414\u0415\u0001"+
		"\u0000\u0000\u0000\u0415\u0419\u0005\u0006\u0000\u0000\u0416\u0418\u0003"+
		"\u0082A\u0000\u0417\u0416\u0001\u0000\u0000\u0000\u0418\u041b\u0001\u0000"+
		"\u0000\u0000\u0419\u0417\u0001\u0000\u0000\u0000\u0419\u041a\u0001\u0000"+
		"\u0000\u0000\u041a\u041c\u0001\u0000\u0000\u0000\u041b\u0419\u0001\u0000"+
		"\u0000\u0000\u041c\u0424\u0003~?\u0000\u041d\u041e\u0005\u0001\u0000\u0000"+
		"\u041e\u0420\u0005\r\u0000\u0000\u041f\u0421\u0003z=\u0000\u0420\u041f"+
		"\u0001\u0000\u0000\u0000\u0420\u0421\u0001\u0000\u0000\u0000\u0421\u0422"+
		"\u0001\u0000\u0000\u0000\u0422\u0424\u0005\u0007\u0000\u0000\u0423\u0410"+
		"\u0001\u0000\u0000\u0000\u0423\u041d\u0001\u0000\u0000\u0000\u0424y\u0001"+
		"\u0000\u0000\u0000\u0425\u0428\u0003\u0080@\u0000\u0426\u0428\u0003|>"+
		"\u0000\u0427\u0425\u0001\u0000\u0000\u0000\u0427\u0426\u0001\u0000\u0000"+
		"\u0000\u0428\u042b\u0001\u0000\u0000\u0000\u0429\u0427\u0001\u0000\u0000"+
		"\u0000\u0429\u042a\u0001\u0000\u0000\u0000\u042a{\u0001\u0000\u0000\u0000"+
		"\u042b\u0429\u0001\u0000\u0000\u0000\u042c\u042d\u0007\u0007\u0000\u0000"+
		"\u042d}\u0001\u0000\u0000\u0000\u042e\u042f\u0005\u0001\u0000\u0000\u042f"+
		"\u0430\u0005\b\u0000\u0000\u0430\u0431\u0005\r\u0000\u0000\u0431\u0432"+
		"\u0005\u0006\u0000\u0000\u0432\u007f\u0001\u0000\u0000\u0000\u0433\u0436"+
		"\u0005\u0011\u0000\u0000\u0434\u0435\u0005\t\u0000\u0000\u0435\u0437\u0005"+
		"\n\u0000\u0000\u0436\u0434\u0001\u0000\u0000\u0000\u0436\u0437\u0001\u0000"+
		"\u0000\u0000\u0437\u044d\u0001\u0000\u0000\u0000\u0438\u043b\u0005\u000b"+
		"\u0000\u0000\u0439\u043a\u0005\t\u0000\u0000\u043a\u043c\u0005\n\u0000"+
		"\u0000\u043b\u0439\u0001\u0000\u0000\u0000\u043b\u043c\u0001\u0000\u0000"+
		"\u0000\u043c\u044d\u0001\u0000\u0000\u0000\u043d\u0440\u0005\f\u0000\u0000"+
		"\u043e\u043f\u0005\t\u0000\u0000\u043f\u0441\u0005\n\u0000\u0000\u0440"+
		"\u043e\u0001\u0000\u0000\u0000\u0440\u0441\u0001\u0000\u0000\u0000\u0441"+
		"\u044d\u0001\u0000\u0000\u0000\u0442\u0445\u0005\u000e\u0000\u0000\u0443"+
		"\u0444\u0005\t\u0000\u0000\u0444\u0446\u0005\n\u0000\u0000\u0445\u0443"+
		"\u0001\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000\u0000\u0446\u044d"+
		"\u0001\u0000\u0000\u0000\u0447\u044a\u0005\u000f\u0000\u0000\u0448\u0449"+
		"\u0005\t\u0000\u0000\u0449\u044b\u0005\n\u0000\u0000\u044a\u0448\u0001"+
		"\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u044d\u0001"+
		"\u0000\u0000\u0000\u044c\u0433\u0001\u0000\u0000\u0000\u044c\u0438\u0001"+
		"\u0000\u0000\u0000\u044c\u043d\u0001\u0000\u0000\u0000\u044c\u0442\u0001"+
		"\u0000\u0000\u0000\u044c\u0447\u0001\u0000\u0000\u0000\u044d\u0081\u0001"+
		"\u0000\u0000\u0000\u044e\u0452\u0003x<\u0000\u044f\u0452\u0005\u0010\u0000"+
		"\u0000\u0450\u0452\u0005\u0002\u0000\u0000\u0451\u044e\u0001\u0000\u0000"+
		"\u0000\u0451\u044f\u0001\u0000\u0000\u0000\u0451\u0450\u0001\u0000\u0000"+
		"\u0000\u0452\u0083\u0001\u0000\u0000\u0000\u0453\u0454\u0005\u0004\u0000"+
		"\u0000\u0454\u0455\u0003\u0086C\u0000\u0455\u0456\u0005\u0013\u0000\u0000"+
		"\u0456\u0085\u0001\u0000\u0000\u0000\u0457\u0459\u0003\u0088D\u0000\u0458"+
		"\u0457\u0001\u0000\u0000\u0000\u0459\u045c\u0001\u0000\u0000\u0000\u045a"+
		"\u0458\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000\u0000\u0000\u045b"+
		"\u0087\u0001\u0000\u0000\u0000\u045c\u045a\u0001\u0000\u0000\u0000\u045d"+
		"\u045e\u0003\u008aE\u0000\u045e\u0460\u0005\u001a\u0000\u0000\u045f\u0461"+
		"\u0003\u008eG\u0000\u0460\u045f\u0001\u0000\u0000\u0000\u0460\u0461\u0001"+
		"\u0000\u0000\u0000\u0461\u0462\u0001\u0000\u0000\u0000\u0462\u0463\u0005"+
		"\u001b\u0000\u0000\u0463\u0089\u0001\u0000\u0000\u0000\u0464\u0468\u0003"+
		"\u008cF\u0000\u0465\u0467\u0003\u008cF\u0000\u0466\u0465\u0001\u0000\u0000"+
		"\u0000\u0467\u046a\u0001\u0000\u0000\u0000\u0468\u0466\u0001\u0000\u0000"+
		"\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469\u008b\u0001\u0000\u0000"+
		"\u0000\u046a\u0468\u0001\u0000\u0000\u0000\u046b\u046c\u0007\b\u0000\u0000"+
		"\u046c\u008d\u0001\u0000\u0000\u0000\u046d\u0472\u0003\u0090H\u0000\u046e"+
		"\u046f\u0005\u001d\u0000\u0000\u046f\u0471\u0003\u0090H\u0000\u0470\u046e"+
		"\u0001\u0000\u0000\u0000\u0471\u0474\u0001\u0000\u0000\u0000\u0472\u0470"+
		"\u0001\u0000\u0000\u0000\u0472\u0473\u0001\u0000\u0000\u0000\u0473\u0476"+
		"\u0001\u0000\u0000\u0000\u0474\u0472\u0001\u0000\u0000\u0000\u0475\u0477"+
		"\u0005\u001d\u0000\u0000\u0476\u0475\u0001\u0000\u0000\u0000\u0476\u0477"+
		"\u0001\u0000\u0000\u0000\u0477\u008f\u0001\u0000\u0000\u0000\u0478\u0479"+
		"\u0005\u0014\u0000\u0000\u0479\u047b\u0005\u001c\u0000\u0000\u047a\u047c"+
		"\u0005\u0014\u0000\u0000\u047b\u047a\u0001\u0000\u0000\u0000\u047b\u047c"+
		"\u0001\u0000\u0000\u0000\u047c\u047e\u0001\u0000\u0000\u0000\u047d\u047f"+
		"\u0005\u0015\u0000\u0000\u047e\u047d\u0001\u0000\u0000\u0000\u047e\u047f"+
		"\u0001\u0000\u0000\u0000\u047f\u0481\u0001\u0000\u0000\u0000\u0480\u0482"+
		"\u0005\u0015\u0000\u0000\u0481\u0480\u0001\u0000\u0000\u0000\u0481\u0482"+
		"\u0001\u0000\u0000\u0000\u0482\u0091\u0001\u0000\u0000\u0000\u00ac\u0095"+
		"\u0097\u00a0\u00aa\u00b2\u00ba\u00c0\u00c6\u00ca\u00cd\u00d8\u00df\u00e3"+
		"\u00f9\u0103\u0106\u010e\u0111\u0114\u0119\u011b\u0120\u0123\u0129\u012b"+
		"\u0130\u0133\u0136\u013b\u013d\u0141\u0146\u014a\u014d\u0152\u0154\u0157"+
		"\u015c\u0162\u016a\u016d\u0176\u017c\u0180\u018a\u018d\u0196\u019f\u01a2"+
		"\u01a7\u01aa\u01af\u01b5\u01c2\u01c8\u01ca\u01d5\u01df\u01e7\u01ea\u01ef"+
		"\u01f3\u01f7\u01fe\u0203\u0208\u020b\u0210\u0214\u021f\u0223\u022b\u0230"+
		"\u0238\u023b\u0242\u0247\u024b\u0256\u0259\u025c\u0261\u0265\u026d\u0271"+
		"\u0275\u027d\u029d\u02a1\u02a3\u02ba\u02bf\u02c1\u02cc\u02d0\u02d4\u02e0"+
		"\u02e4\u02e8\u02ec\u02f1\u02f8\u02fc\u0300\u0304\u0308\u030c\u030f\u0313"+
		"\u031c\u0320\u0324\u0334\u0337\u033a\u0345\u0348\u034f\u0352\u0354\u035a"+
		"\u0362\u0365\u036c\u036f\u0371\u0374\u0378\u037f\u038d\u0390\u0393\u039d"+
		"\u03a0\u03a3\u03a7\u03af\u03b2\u03b5\u03b9\u03bb\u03c6\u03cb\u03d1\u03d9"+
		"\u03dc\u03e6\u03e9\u03f1\u03fa\u03fd\u0413\u0419\u0420\u0423\u0427\u0429"+
		"\u0436\u043b\u0440\u0445\u044a\u044c\u0451\u045a\u0460\u0468\u0472\u0476"+
		"\u047b\u047e\u0481";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}