// Generated from C:/Users/sayas/AI Project/compiler2/src/Grammar\FlutterParser.g4 by ANTLR 4.12.0
package Grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FlutterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SETSTATE=1, GET=2, TO=3, BACK=4, OFALL=5, EXTENDS=6, STATELESSWIDGET=7, 
		OVERRIDE=8, STATE=9, CREATESTATE=10, WIDGET=11, BUILD=12, BUILDCONTEXT=13, 
		CONTEXT=14, COLUMN=15, E_BUTTON=16, ROW=17, CONTAINER=18, CHILDREN=19, 
		IMAGEASSETS=20, IMAGE=21, CHILD=22, TEXT=23, SCAFFOLD=24, BODY=25, COLOR=26, 
		COLORS=27, HEIGHT=28, WIDTH=29, ON_PRESSED=30, CENTER=31, BACK_COLOR=32, 
		MAINAXISALIGNMENT_KEY=33, MAINAXISALIGNMENT_VALUE=34, CROSSAXISALIGNMENT_KEY=35, 
		CROSSAXISALIGNMENT_VALUE=36, MAINAXISSIZE_KEY=37, MAINAXISSIZE_VALUE=38, 
		MAINAXISALIGNMENT_VALUES=39, MAINAXISSIZE_VALUES=40, COLORS_VALUES=41, 
		FONTSIZE=42, STYLE=43, TEXTSTYLE=44, ARGUMENTS=45, GETARG=46, VAR=47, 
		INT=48, STRING=49, VOID=50, DOUBLE=51, BOOL=52, MAP=53, LIST=54, WHILE=55, 
		FOR=56, TRUE=57, FALSE=58, RETURN=59, BREAK=60, IMPORT=61, PRINT=62, LENGTH=63, 
		CLASS=64, ABSTRACT=65, TEXTFIELD=66, HINT_TEXT=67, TEXTFIELD_CONTROLLER=68, 
		FORM=69, IF=70, ELSE_IF=71, ELSE=72, WS=73, CB=74, OB=75, CURLYOPEN=76, 
		CURLYCLOSE=77, OPENTEXT=78, CLOSETEXT=79, C=80, SUM=81, DIVID=82, MULTIPLY=83, 
		MINUS=84, SUMS=85, MINUSS=86, OR=87, AND=88, SUM_EQUAL=89, MINUS_EQUAL=90, 
		EQUALEQUAL=91, DIVID_EQUAL=92, MULTIPLY_EQUAL=93, NOT_EQUAL=94, EQUAL=95, 
		TAG_OPEN=96, TAG_CLOSE=97, TAG_OPEN_EQUAL=98, TAG_CLOSE_EQUAL=99, COMMA=100, 
		SEMICOLON=101, DOT=102, SINGLE_QUOTE=103, DOUBLE_QUOTE=104, LINE_COMMENT=105, 
		MULTI_LINE_COMMENTS=106, NUMBER=107, CHARS=108, STRING_EXP=109, WS_Cross=110, 
		DOT_Cross=111, CROSSAXISALIGNMENT_VALUES=112;
	public static final int
		RULE_program = 0, RULE_importRules = 1, RULE_topLevel = 2, RULE_class_decl = 3, 
		RULE_class_member = 4, RULE_statelessWidget = 5, RULE_variables_decl = 6, 
		RULE_list = 7, RULE_list_exp = 8, RULE_map = 9, RULE_buildMethod = 10, 
		RULE_widgetElement = 11, RULE_function = 12, RULE_function_parameters = 13, 
		RULE_code_attribute = 14, RULE_call_function = 15, RULE_fast_math = 16, 
		RULE_operation_arithmatic = 17, RULE_while_statment = 18, RULE_if_statment = 19, 
		RULE_else_if_statements = 20, RULE_assignment = 21, RULE_print_statements = 22, 
		RULE_for_statement = 23, RULE_for_first_part = 24, RULE_block = 25, RULE_type = 26, 
		RULE_expr = 27, RULE_increase_math = 28, RULE_decrease_math = 29, RULE_map_expr = 30, 
		RULE_map_object = 31, RULE_operation_if = 32, RULE_widget = 33, RULE_get_to = 34, 
		RULE_get_to_args = 35, RULE_get_to_arg = 36, RULE_get_back = 37, RULE_scaffold = 38, 
		RULE_scaffoldArgs = 39, RULE_scaffoldProperty = 40, RULE_image = 41, RULE_imageProperties = 42, 
		RULE_imageProperty = 43, RULE_text = 44, RULE_textProperties = 45, RULE_textProperty = 46, 
		RULE_style = 47, RULE_textStyleProprties = 48, RULE_textStyleProprty = 49, 
		RULE_column = 50, RULE_row = 51, RULE_columnArgs = 52, RULE_columnArg = 53, 
		RULE_rowArgs = 54, RULE_rowArg = 55, RULE_mainAxisAlignment = 56, RULE_crossAxisAlignment = 57, 
		RULE_mainAxisSize = 58, RULE_widgetList = 59, RULE_container = 60, RULE_containerProperties = 61, 
		RULE_containerProperty = 62, RULE_e_button = 63, RULE_e_buttonProperties = 64, 
		RULE_e_ButtonProperty = 65, RULE_textField = 66, RULE_textFieldArgs = 67, 
		RULE_textFieldWidgetArg = 68, RULE_form = 69, RULE_formArgs = 70, RULE_formArg = 71, 
		RULE_voidFunction = 72, RULE_center = 73, RULE_centerWidgetArgs = 74, 
		RULE_setState = 75;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importRules", "topLevel", "class_decl", "class_member", "statelessWidget", 
			"variables_decl", "list", "list_exp", "map", "buildMethod", "widgetElement", 
			"function", "function_parameters", "code_attribute", "call_function", 
			"fast_math", "operation_arithmatic", "while_statment", "if_statment", 
			"else_if_statements", "assignment", "print_statements", "for_statement", 
			"for_first_part", "block", "type", "expr", "increase_math", "decrease_math", 
			"map_expr", "map_object", "operation_if", "widget", "get_to", "get_to_args", 
			"get_to_arg", "get_back", "scaffold", "scaffoldArgs", "scaffoldProperty", 
			"image", "imageProperties", "imageProperty", "text", "textProperties", 
			"textProperty", "style", "textStyleProprties", "textStyleProprty", "column", 
			"row", "columnArgs", "columnArg", "rowArgs", "rowArg", "mainAxisAlignment", 
			"crossAxisAlignment", "mainAxisSize", "widgetList", "container", "containerProperties", 
			"containerProperty", "e_button", "e_buttonProperties", "e_ButtonProperty", 
			"textField", "textFieldArgs", "textFieldWidgetArg", "form", "formArgs", 
			"formArg", "voidFunction", "center", "centerWidgetArgs", "setState"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'setState'", "'Get'", "'to'", "'back'", "'offAll'", "'extends'", 
			"'StatelessWidget'", "'@override'", "'state'", "'createState'", "'Widget'", 
			"'build'", "'BuildContext'", "'context'", "'Column'", "'ElevatedButton'", 
			"'Row'", "'Container'", "'children'", "'Image.assets'", "'Image'", "'child'", 
			"'Text'", "'Scaffold'", "'body'", "'color'", "'Colors'", "'height'", 
			"'width'", "'onPressed'", "'Center'", "'backgroundColor'", "'mainAxisAlignment'", 
			"'MainAxisAlignment'", "'crossAxisAlignment'", "'CrossAxisAlignment'", 
			"'mainAxisSize'", "'MainAxisSize'", null, null, null, "'fontSize'", "'style'", 
			"'TextStyle'", "'arguments'", "'Get.arguments'", "'var'", "'int'", "'String'", 
			"'void'", "'double'", "'bool'", "'Map'", "'List'", "'while'", "'for'", 
			"'true'", "'false'", "'return'", "'break'", "'import'", "'print'", "'length'", 
			"'class'", "'abstract'", "'TextField'", "'hintText'", "'controller'", 
			"'Form'", "'if'", "'else if'", "'else'", null, "']'", "'['", "'{'", "'}'", 
			"'('", "')'", "':'", "'+'", "'/'", "'*'", "'-'", "'++'", "'--'", "'||'", 
			"'&&'", "'+='", "'-='", "'=='", "'/='", "'*='", "'!='", "'='", "'<'", 
			"'>'", "'<='", "'>='", "','", "';'", null, "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SETSTATE", "GET", "TO", "BACK", "OFALL", "EXTENDS", "STATELESSWIDGET", 
			"OVERRIDE", "STATE", "CREATESTATE", "WIDGET", "BUILD", "BUILDCONTEXT", 
			"CONTEXT", "COLUMN", "E_BUTTON", "ROW", "CONTAINER", "CHILDREN", "IMAGEASSETS", 
			"IMAGE", "CHILD", "TEXT", "SCAFFOLD", "BODY", "COLOR", "COLORS", "HEIGHT", 
			"WIDTH", "ON_PRESSED", "CENTER", "BACK_COLOR", "MAINAXISALIGNMENT_KEY", 
			"MAINAXISALIGNMENT_VALUE", "CROSSAXISALIGNMENT_KEY", "CROSSAXISALIGNMENT_VALUE", 
			"MAINAXISSIZE_KEY", "MAINAXISSIZE_VALUE", "MAINAXISALIGNMENT_VALUES", 
			"MAINAXISSIZE_VALUES", "COLORS_VALUES", "FONTSIZE", "STYLE", "TEXTSTYLE", 
			"ARGUMENTS", "GETARG", "VAR", "INT", "STRING", "VOID", "DOUBLE", "BOOL", 
			"MAP", "LIST", "WHILE", "FOR", "TRUE", "FALSE", "RETURN", "BREAK", "IMPORT", 
			"PRINT", "LENGTH", "CLASS", "ABSTRACT", "TEXTFIELD", "HINT_TEXT", "TEXTFIELD_CONTROLLER", 
			"FORM", "IF", "ELSE_IF", "ELSE", "WS", "CB", "OB", "CURLYOPEN", "CURLYCLOSE", 
			"OPENTEXT", "CLOSETEXT", "C", "SUM", "DIVID", "MULTIPLY", "MINUS", "SUMS", 
			"MINUSS", "OR", "AND", "SUM_EQUAL", "MINUS_EQUAL", "EQUALEQUAL", "DIVID_EQUAL", 
			"MULTIPLY_EQUAL", "NOT_EQUAL", "EQUAL", "TAG_OPEN", "TAG_CLOSE", "TAG_OPEN_EQUAL", 
			"TAG_CLOSE_EQUAL", "COMMA", "SEMICOLON", "DOT", "SINGLE_QUOTE", "DOUBLE_QUOTE", 
			"LINE_COMMENT", "MULTI_LINE_COMMENTS", "NUMBER", "CHARS", "STRING_EXP", 
			"WS_Cross", "DOT_Cross", "CROSSAXISALIGNMENT_VALUES"
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
	public String getGrammarFileName() { return "FlutterParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlutterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<ImportRulesContext> importRules() {
			return getRuleContexts(ImportRulesContext.class);
		}
		public ImportRulesContext importRules(int i) {
			return getRuleContext(ImportRulesContext.class,i);
		}
		public List<TopLevelContext> topLevel() {
			return getRuleContexts(TopLevelContext.class);
		}
		public TopLevelContext topLevel(int i) {
			return getRuleContext(TopLevelContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(152);
				importRules();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & 21956143400157999L) != 0)) {
				{
				{
				setState(158);
				topLevel();
				}
				}
				setState(163);
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
	public static class ImportRulesContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(FlutterParser.IMPORT, 0); }
		public TerminalNode STRING_EXP() { return getToken(FlutterParser.STRING_EXP, 0); }
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public ImportRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterImportRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitImportRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitImportRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportRulesContext importRules() throws RecognitionException {
		ImportRulesContext _localctx = new ImportRulesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importRules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(IMPORT);
			setState(165);
			match(STRING_EXP);
			setState(166);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelContext extends ParserRuleContext {
		public TopLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevel; }
	 
		public TopLevelContext() { }
		public void copyFrom(TopLevelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationTopLevelContext extends TopLevelContext {
		public Class_declContext class_decl() {
			return getRuleContext(Class_declContext.class,0);
		}
		public ClassDeclarationTopLevelContext(TopLevelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterClassDeclarationTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitClassDeclarationTopLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitClassDeclarationTopLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationTopLevelContext extends TopLevelContext {
		public Variables_declContext variables_decl() {
			return getRuleContext(Variables_declContext.class,0);
		}
		public VariableDeclarationTopLevelContext(TopLevelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterVariableDeclarationTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitVariableDeclarationTopLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitVariableDeclarationTopLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WidgetDeclarationTopLevelContext extends TopLevelContext {
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public WidgetDeclarationTopLevelContext(TopLevelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterWidgetDeclarationTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitWidgetDeclarationTopLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitWidgetDeclarationTopLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateLessDeclarationTopLevelContext extends TopLevelContext {
		public StatelessWidgetContext statelessWidget() {
			return getRuleContext(StatelessWidgetContext.class,0);
		}
		public StateLessDeclarationTopLevelContext(TopLevelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterStateLessDeclarationTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitStateLessDeclarationTopLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitStateLessDeclarationTopLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationTopLevelContext extends TopLevelContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionDeclarationTopLevelContext(TopLevelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFunctionDeclarationTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFunctionDeclarationTopLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFunctionDeclarationTopLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelContext topLevel() throws RecognitionException {
		TopLevelContext _localctx = new TopLevelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topLevel);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationTopLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				variables_decl();
				}
				break;
			case 2:
				_localctx = new ClassDeclarationTopLevelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				class_decl();
				}
				break;
			case 3:
				_localctx = new FunctionDeclarationTopLevelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				function();
				}
				break;
			case 4:
				_localctx = new WidgetDeclarationTopLevelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				widget();
				}
				break;
			case 5:
				_localctx = new StateLessDeclarationTopLevelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				statelessWidget();
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
	public static class Class_declContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(FlutterParser.CLASS, 0); }
		public TerminalNode CHARS() { return getToken(FlutterParser.CHARS, 0); }
		public TerminalNode CURLYOPEN() { return getToken(FlutterParser.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(FlutterParser.CURLYCLOSE, 0); }
		public TerminalNode ABSTRACT() { return getToken(FlutterParser.ABSTRACT, 0); }
		public List<Class_memberContext> class_member() {
			return getRuleContexts(Class_memberContext.class);
		}
		public Class_memberContext class_member(int i) {
			return getRuleContext(Class_memberContext.class,i);
		}
		public Class_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterClass_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitClass_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitClass_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declContext class_decl() throws RecognitionException {
		Class_declContext _localctx = new Class_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(175);
				match(ABSTRACT);
				}
			}

			setState(178);
			match(CLASS);
			setState(179);
			match(CHARS);
			setState(180);
			match(CURLYOPEN);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35888059530608640L) != 0)) {
				{
				{
				setState(181);
				class_member();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_memberContext extends ParserRuleContext {
		public Class_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member; }
	 
		public Class_memberContext() { }
		public void copyFrom(Class_memberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationClassContext extends Class_memberContext {
		public Variables_declContext variables_decl() {
			return getRuleContext(Variables_declContext.class,0);
		}
		public VariableDeclarationClassContext(Class_memberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterVariableDeclarationClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitVariableDeclarationClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitVariableDeclarationClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationClassContext extends Class_memberContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionDeclarationClassContext(Class_memberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFunctionDeclarationClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFunctionDeclarationClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFunctionDeclarationClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_memberContext class_member() throws RecognitionException {
		Class_memberContext _localctx = new Class_memberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_member);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				variables_decl();
				}
				break;
			case 2:
				_localctx = new FunctionDeclarationClassContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				function();
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
	public static class StatelessWidgetContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(FlutterParser.CLASS, 0); }
		public TerminalNode CHARS() { return getToken(FlutterParser.CHARS, 0); }
		public TerminalNode EXTENDS() { return getToken(FlutterParser.EXTENDS, 0); }
		public TerminalNode STATELESSWIDGET() { return getToken(FlutterParser.STATELESSWIDGET, 0); }
		public TerminalNode CURLYOPEN() { return getToken(FlutterParser.CURLYOPEN, 0); }
		public BuildMethodContext buildMethod() {
			return getRuleContext(BuildMethodContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(FlutterParser.CURLYCLOSE, 0); }
		public StatelessWidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statelessWidget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterStatelessWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitStatelessWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitStatelessWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatelessWidgetContext statelessWidget() throws RecognitionException {
		StatelessWidgetContext _localctx = new StatelessWidgetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statelessWidget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(CLASS);
			setState(194);
			match(CHARS);
			setState(195);
			match(EXTENDS);
			setState(196);
			match(STATELESSWIDGET);
			setState(197);
			match(CURLYOPEN);
			setState(198);
			buildMethod();
			setState(199);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variables_declContext extends ParserRuleContext {
		public Variables_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_decl; }
	 
		public Variables_declContext() { }
		public void copyFrom(Variables_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationTypeContext extends Variables_declContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CHARS() { return getToken(FlutterParser.CHARS, 0); }
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public TerminalNode EQUAL() { return getToken(FlutterParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableDeclarationTypeContext(Variables_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterVariableDeclarationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitVariableDeclarationType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitVariableDeclarationType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableMapDeclarationContext extends Variables_declContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public VariableMapDeclarationContext(Variables_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterVariableMapDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitVariableMapDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitVariableMapDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VaraibleListDeclarationContext extends Variables_declContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public VaraibleListDeclarationContext(Variables_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterVaraibleListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitVaraibleListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitVaraibleListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variables_declContext variables_decl() throws RecognitionException {
		Variables_declContext _localctx = new Variables_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variables_decl);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				type();
				setState(202);
				match(CHARS);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(203);
					match(EQUAL);
					setState(204);
					expr(0);
					}
				}

				setState(207);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new VaraibleListDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				list();
				}
				break;
			case 3:
				_localctx = new VariableMapDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(FlutterParser.LIST, 0); }
		public TerminalNode TAG_OPEN() { return getToken(FlutterParser.TAG_OPEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TAG_CLOSE() { return getToken(FlutterParser.TAG_CLOSE, 0); }
		public TerminalNode CHARS() { return getToken(FlutterParser.CHARS, 0); }
		public TerminalNode EQUAL() { return getToken(FlutterParser.EQUAL, 0); }
		public TerminalNode OB() { return getToken(FlutterParser.OB, 0); }
		public TerminalNode CB() { return getToken(FlutterParser.CB, 0); }
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public List_expContext list_exp() {
			return getRuleContext(List_expContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(LIST);
			setState(214);
			match(TAG_OPEN);
			setState(215);
			type();
			setState(216);
			match(TAG_CLOSE);
			setState(217);
			match(CHARS);
			setState(218);
			match(EQUAL);
			setState(219);
			match(OB);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & -2305843008139945983L) != 0)) {
				{
				setState(220);
				list_exp();
				}
			}

			setState(223);
			match(CB);
			setState(224);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_expContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public List_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterList_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitList_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitList_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_expContext list_exp() throws RecognitionException {
		List_expContext _localctx = new List_expContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			expr(0);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(227);
				match(COMMA);
				setState(228);
				expr(0);
				}
				}
				setState(233);
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
	public static class MapContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(FlutterParser.MAP, 0); }
		public TerminalNode TAG_OPEN() { return getToken(FlutterParser.TAG_OPEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TAG_CLOSE() { return getToken(FlutterParser.TAG_CLOSE, 0); }
		public TerminalNode CHARS() { return getToken(FlutterParser.CHARS, 0); }
		public TerminalNode EQUAL() { return getToken(FlutterParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public Map_exprContext map_expr() {
			return getRuleContext(Map_exprContext.class,0);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(MAP);
			setState(235);
			match(TAG_OPEN);
			setState(236);
			type();
			setState(237);
			match(TAG_CLOSE);
			setState(238);
			match(CHARS);
			setState(239);
			match(EQUAL);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CURLYOPEN) {
				{
				setState(240);
				map_expr();
				}
			}

			setState(243);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuildMethodContext extends ParserRuleContext {
		public TerminalNode OVERRIDE() { return getToken(FlutterParser.OVERRIDE, 0); }
		public TerminalNode WIDGET() { return getToken(FlutterParser.WIDGET, 0); }
		public TerminalNode BUILD() { return getToken(FlutterParser.BUILD, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TerminalNode BUILDCONTEXT() { return getToken(FlutterParser.BUILDCONTEXT, 0); }
		public TerminalNode CONTEXT() { return getToken(FlutterParser.CONTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public TerminalNode CURLYOPEN() { return getToken(FlutterParser.CURLYOPEN, 0); }
		public WidgetElementContext widgetElement() {
			return getRuleContext(WidgetElementContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(FlutterParser.CURLYCLOSE, 0); }
		public BuildMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterBuildMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitBuildMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitBuildMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildMethodContext buildMethod() throws RecognitionException {
		BuildMethodContext _localctx = new BuildMethodContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_buildMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(OVERRIDE);
			setState(246);
			match(WIDGET);
			setState(247);
			match(BUILD);
			setState(248);
			match(OPENTEXT);
			setState(249);
			match(BUILDCONTEXT);
			setState(250);
			match(CONTEXT);
			setState(251);
			match(CLOSETEXT);
			setState(252);
			match(CURLYOPEN);
			setState(253);
			widgetElement();
			setState(254);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WidgetElementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FlutterParser.RETURN, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public WidgetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgetElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterWidgetElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitWidgetElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitWidgetElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetElementContext widgetElement() throws RecognitionException {
		WidgetElementContext _localctx = new WidgetElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_widgetElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(RETURN);
			setState(257);
			widget();
			setState(258);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(FlutterParser.CHARS, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(FlutterParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(260);
				match(VOID);
				}
				break;
			case VAR:
			case INT:
			case STRING:
			case DOUBLE:
			case BOOL:
			case MAP:
				{
				setState(261);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(264);
			match(CHARS);
			setState(265);
			match(OPENTEXT);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16747761114284032L) != 0)) {
				{
				setState(266);
				function_parameters();
				}
			}

			setState(269);
			match(CLOSETEXT);
			setState(270);
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
	public static class Function_parametersContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> CHARS() { return getTokens(FlutterParser.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(FlutterParser.CHARS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFunction_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFunction_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			type();
			setState(273);
			match(CHARS);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(274);
				match(COMMA);
				setState(275);
				type();
				setState(276);
				match(CHARS);
				}
				}
				setState(282);
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
	public static class Code_attributeContext extends ParserRuleContext {
		public Code_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_attribute; }
	 
		public Code_attributeContext() { }
		public void copyFrom(Code_attributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementsContext extends Code_attributeContext {
		public While_statmentContext while_statment() {
			return getRuleContext(While_statmentContext.class,0);
		}
		public WhileStatementsContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterWhileStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitWhileStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitWhileStatements(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintCodeAttributesContext extends Code_attributeContext {
		public Print_statementsContext print_statements() {
			return getRuleContext(Print_statementsContext.class,0);
		}
		public PrintCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterPrintCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitPrintCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitPrintCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FastMathCodeAttributesContext extends Code_attributeContext {
		public Fast_mathContext fast_math() {
			return getRuleContext(Fast_mathContext.class,0);
		}
		public FastMathCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFastMathCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFastMathCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFastMathCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetBackCodeAttributesContext extends Code_attributeContext {
		public Get_backContext get_back() {
			return getRuleContext(Get_backContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public GetBackCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterGetBackCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitGetBackCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitGetBackCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForCodeAttributesContext extends Code_attributeContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ForCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterForCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitForCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitForCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationDecCodeAttributesContext extends Code_attributeContext {
		public Decrease_mathContext decrease_math() {
			return getRuleContext(Decrease_mathContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public OperationDecCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterOperationDecCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitOperationDecCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitOperationDecCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetStateCodeAttributesContext extends Code_attributeContext {
		public SetStateContext setState() {
			return getRuleContext(SetStateContext.class,0);
		}
		public SetStateCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterSetStateCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitSetStateCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitSetStateCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentCodeAttributesContext extends Code_attributeContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterAssignmentCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitAssignmentCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitAssignmentCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnCodeAttributesContext extends Code_attributeContext {
		public TerminalNode RETURN() { return getToken(FlutterParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterReturnCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitReturnCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitReturnCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationIncCodeAttributesContext extends Code_attributeContext {
		public Increase_mathContext increase_math() {
			return getRuleContext(Increase_mathContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public OperationIncCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterOperationIncCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitOperationIncCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitOperationIncCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetToPageCodeAttributesContext extends Code_attributeContext {
		public Get_toContext get_to() {
			return getRuleContext(Get_toContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public GetToPageCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterGetToPageCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitGetToPageCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitGetToPageCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends Code_attributeContext {
		public Variables_declContext variables_decl() {
			return getRuleContext(Variables_declContext.class,0);
		}
		public VariableDeclarationContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallCodeAttributesContext extends Code_attributeContext {
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public CallCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterCallCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitCallCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitCallCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakCodeAttributesContext extends Code_attributeContext {
		public TerminalNode BREAK() { return getToken(FlutterParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public BreakCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterBreakCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitBreakCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitBreakCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfCodeAttributesContext extends Code_attributeContext {
		public If_statmentContext if_statment() {
			return getRuleContext(If_statmentContext.class,0);
		}
		public IfCodeAttributesContext(Code_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterIfCodeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitIfCodeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitIfCodeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_attributeContext code_attribute() throws RecognitionException {
		Code_attributeContext _localctx = new Code_attributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_code_attribute);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				variables_decl();
				}
				break;
			case 2:
				_localctx = new PrintCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				print_statements();
				}
				break;
			case 3:
				_localctx = new IfCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				if_statment();
				}
				break;
			case 4:
				_localctx = new ForCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				for_statement();
				}
				break;
			case 5:
				_localctx = new WhileStatementsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				while_statment();
				}
				break;
			case 6:
				_localctx = new AssignmentCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(288);
				assignment();
				}
				break;
			case 7:
				_localctx = new CallCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(289);
				call_function();
				}
				break;
			case 8:
				_localctx = new BreakCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				match(BREAK);
				setState(291);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new ReturnCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(292);
				match(RETURN);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & -2305843008139945983L) != 0)) {
					{
					setState(293);
					expr(0);
					}
				}

				setState(296);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new GetToPageCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(297);
				get_to();
				setState(298);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new GetBackCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(300);
				get_back();
				setState(301);
				match(SEMICOLON);
				}
				break;
			case 12:
				_localctx = new OperationIncCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(303);
				increase_math();
				setState(304);
				match(SEMICOLON);
				}
				break;
			case 13:
				_localctx = new OperationDecCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(306);
				decrease_math();
				setState(307);
				match(SEMICOLON);
				}
				break;
			case 14:
				_localctx = new FastMathCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(309);
				fast_math();
				}
				break;
			case 15:
				_localctx = new SetStateCodeAttributesContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(310);
				setState();
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
	public static class Call_functionContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(FlutterParser.CHARS, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitCall_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_call_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(CHARS);
			setState(314);
			match(OPENTEXT);
			setState(315);
			match(CLOSETEXT);
			setState(316);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fast_mathContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(FlutterParser.CHARS, 0); }
		public TerminalNode NUMBER() { return getToken(FlutterParser.NUMBER, 0); }
		public TerminalNode SUM_EQUAL() { return getToken(FlutterParser.SUM_EQUAL, 0); }
		public TerminalNode MINUS_EQUAL() { return getToken(FlutterParser.MINUS_EQUAL, 0); }
		public TerminalNode DIVID_EQUAL() { return getToken(FlutterParser.DIVID_EQUAL, 0); }
		public TerminalNode MULTIPLY_EQUAL() { return getToken(FlutterParser.MULTIPLY_EQUAL, 0); }
		public Fast_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fast_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFast_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFast_math(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFast_math(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fast_mathContext fast_math() throws RecognitionException {
		Fast_mathContext _localctx = new Fast_mathContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fast_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(CHARS);
			setState(319);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 27L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(320);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operation_arithmaticContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(FlutterParser.MULTIPLY, 0); }
		public TerminalNode SUM() { return getToken(FlutterParser.SUM, 0); }
		public TerminalNode MINUS() { return getToken(FlutterParser.MINUS, 0); }
		public TerminalNode DIVID() { return getToken(FlutterParser.DIVID, 0); }
		public Operation_arithmaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_arithmatic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterOperation_arithmatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitOperation_arithmatic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitOperation_arithmatic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operation_arithmaticContext operation_arithmatic() throws RecognitionException {
		Operation_arithmaticContext _localctx = new Operation_arithmaticContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operation_arithmatic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 15L) != 0)) ) {
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
	public static class While_statmentContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FlutterParser.WHILE, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterWhile_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitWhile_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitWhile_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statmentContext while_statment() throws RecognitionException {
		While_statmentContext _localctx = new While_statmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_statment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(WHILE);
			setState(325);
			match(OPENTEXT);
			setState(326);
			expr(0);
			setState(327);
			match(CLOSETEXT);
			setState(328);
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
	public static class If_statmentContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FlutterParser.IF, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<Else_if_statementsContext> else_if_statements() {
			return getRuleContexts(Else_if_statementsContext.class);
		}
		public Else_if_statementsContext else_if_statements(int i) {
			return getRuleContext(Else_if_statementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(FlutterParser.ELSE, 0); }
		public If_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterIf_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitIf_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitIf_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statmentContext if_statment() throws RecognitionException {
		If_statmentContext _localctx = new If_statmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_if_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(IF);
			setState(331);
			match(OPENTEXT);
			setState(332);
			expr(0);
			setState(333);
			match(CLOSETEXT);
			setState(334);
			block();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(335);
				else_if_statements();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(341);
				match(ELSE);
				setState(342);
				block();
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
	public static class Else_if_statementsContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(FlutterParser.ELSE_IF, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_if_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterElse_if_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitElse_if_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitElse_if_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_statementsContext else_if_statements() throws RecognitionException {
		Else_if_statementsContext _localctx = new Else_if_statementsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_else_if_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(ELSE_IF);
			setState(346);
			match(OPENTEXT);
			setState(347);
			expr(0);
			setState(348);
			match(CLOSETEXT);
			setState(349);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(FlutterParser.CHARS, 0); }
		public TerminalNode EQUAL() { return getToken(FlutterParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(CHARS);
			setState(352);
			match(EQUAL);
			setState(353);
			expr(0);
			setState(354);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statementsContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(FlutterParser.PRINT, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public Print_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterPrint_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitPrint_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitPrint_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementsContext print_statements() throws RecognitionException {
		Print_statementsContext _localctx = new Print_statementsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_print_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(PRINT);
			setState(357);
			match(OPENTEXT);
			setState(358);
			expr(0);
			setState(359);
			match(CLOSETEXT);
			setState(360);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FlutterParser.FOR, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public For_first_partContext for_first_part() {
			return getRuleContext(For_first_partContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(FOR);
			setState(363);
			match(OPENTEXT);
			setState(364);
			for_first_part();
			setState(365);
			expr(0);
			setState(366);
			match(SEMICOLON);
			setState(367);
			expr(0);
			setState(368);
			match(CLOSETEXT);
			setState(369);
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
	public static class For_first_partContext extends ParserRuleContext {
		public For_first_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_first_part; }
	 
		public For_first_partContext() { }
		public void copyFrom(For_first_partContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentForFirstContext extends For_first_partContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentForFirstContext(For_first_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterAssignmentForFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitAssignmentForFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitAssignmentForFirst(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableForFirstContext extends For_first_partContext {
		public Variables_declContext variables_decl() {
			return getRuleContext(Variables_declContext.class,0);
		}
		public VariableForFirstContext(For_first_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterVariableForFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitVariableForFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitVariableForFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_first_partContext for_first_part() throws RecognitionException {
		For_first_partContext _localctx = new For_first_partContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_first_part);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARS:
				_localctx = new AssignmentForFirstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				assignment();
				}
				break;
			case VAR:
			case INT:
			case STRING:
			case DOUBLE:
			case BOOL:
			case MAP:
			case LIST:
				_localctx = new VariableForFirstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				variables_decl();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode CURLYOPEN() { return getToken(FlutterParser.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(FlutterParser.CURLYCLOSE, 0); }
		public List<Code_attributeContext> code_attribute() {
			return getRuleContexts(Code_attributeContext.class);
		}
		public Code_attributeContext code_attribute(int i) {
			return getRuleContext(Code_attributeContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(CURLYOPEN);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6483916826018316294L) != 0) || _la==IF || _la==CHARS) {
				{
				{
				setState(376);
				code_attribute();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolTypeContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(FlutterParser.BOOL, 0); }
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTypeContext extends TypeContext {
		public TerminalNode STRING() { return getToken(FlutterParser.STRING, 0); }
		public StringTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitStringType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleTypeContext extends TypeContext {
		public TerminalNode DOUBLE() { return getToken(FlutterParser.DOUBLE, 0); }
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarTypeContext extends TypeContext {
		public TerminalNode VAR() { return getToken(FlutterParser.VAR, 0); }
		public VarTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapTypeContext extends TypeContext {
		public TerminalNode MAP() { return getToken(FlutterParser.MAP, 0); }
		public MapTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitMapType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitMapType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INT() { return getToken(FlutterParser.INT, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(INT);
				}
				break;
			case VAR:
				_localctx = new VarTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(VAR);
				}
				break;
			case STRING:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(STRING);
				}
				break;
			case BOOL:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				match(BOOL);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				match(DOUBLE);
				}
				break;
			case MAP:
				_localctx = new MapTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(389);
				match(MAP);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExpContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(FlutterParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FlutterParser.FALSE, 0); }
		public BoolExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapExpContext extends ExprContext {
		public Map_exprContext map_expr() {
			return getRuleContext(Map_exprContext.class,0);
		}
		public MapExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterMapExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitMapExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitMapExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationIncreaseContext extends ExprContext {
		public Increase_mathContext increase_math() {
			return getRuleContext(Increase_mathContext.class,0);
		}
		public OperationIncreaseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterOperationIncrease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitOperationIncrease(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitOperationIncrease(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExprContext {
		public TerminalNode CHARS() { return getToken(FlutterParser.CHARS, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(FlutterParser.NUMBER, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExpContext extends ExprContext {
		public TerminalNode STRING_EXP() { return getToken(FlutterParser.STRING_EXP, 0); }
		public StringExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterStringExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitStringExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitStringExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Operation_arithmaticContext operation_arithmatic() {
			return getRuleContext(Operation_arithmaticContext.class,0);
		}
		public OperationExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterOperationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitOperationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitOperationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FastMathContext extends ExprContext {
		public Fast_mathContext fast_math() {
			return getRuleContext(Fast_mathContext.class,0);
		}
		public FastMathContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFastMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFastMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFastMath(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationDecreaseContext extends ExprContext {
		public Decrease_mathContext decrease_math() {
			return getRuleContext(Decrease_mathContext.class,0);
		}
		public OperationDecreaseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterOperationDecrease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitOperationDecrease(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitOperationDecrease(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ExprContext {
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolOperationExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Operation_ifContext operation_if() {
			return getRuleContext(Operation_ifContext.class,0);
		}
		public BoolOperationExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterBoolOperationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitBoolOperationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitBoolOperationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetArgumentsExpContext extends ExprContext {
		public TerminalNode GETARG() { return getToken(FlutterParser.GETARG, 0); }
		public TerminalNode OB() { return getToken(FlutterParser.OB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CB() { return getToken(FlutterParser.CB, 0); }
		public GetArgumentsExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterGetArgumentsExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitGetArgumentsExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitGetArgumentsExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(393);
				match(CHARS);
				}
				break;
			case 2:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(394);
				match(NUMBER);
				}
				break;
			case 3:
				{
				_localctx = new StringExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(395);
				match(STRING_EXP);
				}
				break;
			case 4:
				{
				_localctx = new OperationIncreaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(396);
				increase_math();
				}
				break;
			case 5:
				{
				_localctx = new OperationDecreaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(397);
				decrease_math();
				}
				break;
			case 6:
				{
				_localctx = new FastMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(398);
				fast_math();
				}
				break;
			case 7:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(399);
				call_function();
				}
				break;
			case 8:
				{
				_localctx = new BoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(400);
				match(TRUE);
				}
				break;
			case 9:
				{
				_localctx = new BoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(401);
				match(FALSE);
				}
				break;
			case 10:
				{
				_localctx = new MapExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(402);
				map_expr();
				}
				break;
			case 11:
				{
				_localctx = new GetArgumentsExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(403);
				match(GETARG);
				setState(408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(404);
					match(OB);
					setState(405);
					expr(0);
					setState(406);
					match(CB);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(420);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new OperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(412);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(413);
						operation_arithmatic();
						setState(414);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new BoolOperationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(416);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(417);
						operation_if();
						setState(418);
						expr(13);
						}
						break;
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class Increase_mathContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(FlutterParser.CHARS, 0); }
		public TerminalNode SUMS() { return getToken(FlutterParser.SUMS, 0); }
		public Increase_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increase_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterIncrease_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitIncrease_math(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitIncrease_math(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Increase_mathContext increase_math() throws RecognitionException {
		Increase_mathContext _localctx = new Increase_mathContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_increase_math);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(CHARS);
			setState(426);
			match(SUMS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Decrease_mathContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(FlutterParser.CHARS, 0); }
		public TerminalNode MINUSS() { return getToken(FlutterParser.MINUSS, 0); }
		public Decrease_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrease_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterDecrease_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitDecrease_math(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitDecrease_math(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decrease_mathContext decrease_math() throws RecognitionException {
		Decrease_mathContext _localctx = new Decrease_mathContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_decrease_math);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(CHARS);
			setState(429);
			match(MINUSS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Map_exprContext extends ParserRuleContext {
		public TerminalNode CURLYOPEN() { return getToken(FlutterParser.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(FlutterParser.CURLYCLOSE, 0); }
		public List<Map_objectContext> map_object() {
			return getRuleContexts(Map_objectContext.class);
		}
		public Map_objectContext map_object(int i) {
			return getRuleContext(Map_objectContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public Map_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterMap_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitMap_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitMap_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_exprContext map_expr() throws RecognitionException {
		Map_exprContext _localctx = new Map_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_map_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(CURLYOPEN);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & -2305843008139945983L) != 0)) {
				{
				setState(432);
				map_object();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(433);
					match(COMMA);
					setState(434);
					map_object();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(442);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Map_objectContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public Map_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterMap_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitMap_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitMap_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_objectContext map_object() throws RecognitionException {
		Map_objectContext _localctx = new Map_objectContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_map_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			expr(0);
			setState(445);
			match(C);
			setState(446);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operation_ifContext extends ParserRuleContext {
		public Operation_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_if; }
	 
		public Operation_ifContext() { }
		public void copyFrom(Operation_ifContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualContext extends Operation_ifContext {
		public TerminalNode NOT_EQUAL() { return getToken(FlutterParser.NOT_EQUAL, 0); }
		public NotEqualContext(Operation_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends Operation_ifContext {
		public TerminalNode OR() { return getToken(FlutterParser.OR, 0); }
		public OrContext(Operation_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagCloseEqualContext extends Operation_ifContext {
		public TerminalNode TAG_CLOSE_EQUAL() { return getToken(FlutterParser.TAG_CLOSE_EQUAL, 0); }
		public TagCloseEqualContext(Operation_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterTagCloseEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitTagCloseEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitTagCloseEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagOpenContext extends Operation_ifContext {
		public TerminalNode TAG_OPEN() { return getToken(FlutterParser.TAG_OPEN, 0); }
		public TagOpenContext(Operation_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterTagOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitTagOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitTagOpen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends Operation_ifContext {
		public TerminalNode AND() { return getToken(FlutterParser.AND, 0); }
		public AndContext(Operation_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagCloseContext extends Operation_ifContext {
		public TerminalNode TAG_CLOSE() { return getToken(FlutterParser.TAG_CLOSE, 0); }
		public TagCloseContext(Operation_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterTagClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitTagClose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitTagClose(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagOpenEqualContext extends Operation_ifContext {
		public TerminalNode TAG_OPEN_EQUAL() { return getToken(FlutterParser.TAG_OPEN_EQUAL, 0); }
		public TagOpenEqualContext(Operation_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterTagOpenEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitTagOpenEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitTagOpenEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagEqualEqualContext extends Operation_ifContext {
		public TerminalNode EQUALEQUAL() { return getToken(FlutterParser.EQUALEQUAL, 0); }
		public TagEqualEqualContext(Operation_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterTagEqualEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitTagEqualEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitTagEqualEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operation_ifContext operation_if() throws RecognitionException {
		Operation_ifContext _localctx = new Operation_ifContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operation_if);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUALEQUAL:
				_localctx = new TagEqualEqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(EQUALEQUAL);
				}
				break;
			case TAG_CLOSE:
				_localctx = new TagCloseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(TAG_CLOSE);
				}
				break;
			case TAG_OPEN:
				_localctx = new TagOpenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(TAG_OPEN);
				}
				break;
			case TAG_CLOSE_EQUAL:
				_localctx = new TagCloseEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
				match(TAG_CLOSE_EQUAL);
				}
				break;
			case TAG_OPEN_EQUAL:
				_localctx = new TagOpenEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(452);
				match(TAG_OPEN_EQUAL);
				}
				break;
			case NOT_EQUAL:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(453);
				match(NOT_EQUAL);
				}
				break;
			case AND:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(454);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(455);
				match(OR);
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
	public static class WidgetContext extends ParserRuleContext {
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
	 
		public WidgetContext() { }
		public void copyFrom(WidgetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowWidgetContext extends WidgetContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public RowWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterRowWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitRowWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitRowWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElevatedButtonWidgetContext extends WidgetContext {
		public E_buttonContext e_button() {
			return getRuleContext(E_buttonContext.class,0);
		}
		public ElevatedButtonWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterElevatedButtonWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitElevatedButtonWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitElevatedButtonWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormWidgetContext extends WidgetContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public FormWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFormWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFormWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFormWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextWidgetContext extends WidgetContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TextWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterTextWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitTextWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitTextWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldWidgetContext extends WidgetContext {
		public ScaffoldContext scaffold() {
			return getRuleContext(ScaffoldContext.class,0);
		}
		public ScaffoldWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterScaffoldWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitScaffoldWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitScaffoldWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CenterWidgetContext extends WidgetContext {
		public CenterContext center() {
			return getRuleContext(CenterContext.class,0);
		}
		public CenterWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterCenterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitCenterWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitCenterWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldWidgetContext extends WidgetContext {
		public TextFieldContext textField() {
			return getRuleContext(TextFieldContext.class,0);
		}
		public TextFieldWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterTextFieldWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitTextFieldWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitTextFieldWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageWidgetContext extends WidgetContext {
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ImageWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterImageWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitImageWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitImageWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerWidgetContext extends WidgetContext {
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public ContainerWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterContainerWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitContainerWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitContainerWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnWidgetContext extends WidgetContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ColumnWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterColumnWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitColumnWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitColumnWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_widget);
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAFFOLD:
				_localctx = new ScaffoldWidgetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				scaffold();
				}
				break;
			case IMAGEASSETS:
				_localctx = new ImageWidgetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				image();
				}
				break;
			case TEXT:
				_localctx = new TextWidgetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				text();
				}
				break;
			case CONTAINER:
				_localctx = new ContainerWidgetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				container();
				}
				break;
			case COLUMN:
				_localctx = new ColumnWidgetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(462);
				column();
				}
				break;
			case ROW:
				_localctx = new RowWidgetContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(463);
				row();
				}
				break;
			case CENTER:
				_localctx = new CenterWidgetContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(464);
				center();
				}
				break;
			case E_BUTTON:
				_localctx = new ElevatedButtonWidgetContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(465);
				e_button();
				}
				break;
			case TEXTFIELD:
				_localctx = new TextFieldWidgetContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(466);
				textField();
				}
				break;
			case FORM:
				_localctx = new FormWidgetContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(467);
				form();
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
	public static class Get_toContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(FlutterParser.GET, 0); }
		public TerminalNode DOT() { return getToken(FlutterParser.DOT, 0); }
		public TerminalNode TO() { return getToken(FlutterParser.TO, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public Get_to_argsContext get_to_args() {
			return getRuleContext(Get_to_argsContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public Get_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterGet_to(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitGet_to(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitGet_to(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_toContext get_to() throws RecognitionException {
		Get_toContext _localctx = new Get_toContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_get_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(GET);
			setState(471);
			match(DOT);
			setState(472);
			match(TO);
			setState(473);
			match(OPENTEXT);
			setState(474);
			get_to_args();
			setState(475);
			match(CLOSETEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Get_to_argsContext extends ParserRuleContext {
		public List<Get_to_argContext> get_to_arg() {
			return getRuleContexts(Get_to_argContext.class);
		}
		public Get_to_argContext get_to_arg(int i) {
			return getRuleContext(Get_to_argContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public Get_to_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_to_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterGet_to_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitGet_to_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitGet_to_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_to_argsContext get_to_args() throws RecognitionException {
		Get_to_argsContext _localctx = new Get_to_argsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_get_to_args);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			get_to_arg();
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478);
					match(COMMA);
					setState(479);
					get_to_arg();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(485);
				match(COMMA);
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
	public static class Get_to_argContext extends ParserRuleContext {
		public Get_to_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_to_arg; }
	 
		public Get_to_argContext() { }
		public void copyFrom(Get_to_argContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetToArgWidgetContext extends Get_to_argContext {
		public TerminalNode ARGUMENTS() { return getToken(FlutterParser.ARGUMENTS, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GetToArgWidgetContext(Get_to_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterGetToArgWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitGetToArgWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitGetToArgWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetToArgExprContext extends Get_to_argContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GetToArgExprContext(Get_to_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterGetToArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitGetToArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitGetToArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_to_argContext get_to_arg() throws RecognitionException {
		Get_to_argContext _localctx = new Get_to_argContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_get_to_arg);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GETARG:
			case TRUE:
			case FALSE:
			case CURLYOPEN:
			case NUMBER:
			case CHARS:
			case STRING_EXP:
				_localctx = new GetToArgExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				expr(0);
				}
				break;
			case ARGUMENTS:
				_localctx = new GetToArgWidgetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				match(ARGUMENTS);
				setState(490);
				match(C);
				setState(491);
				expr(0);
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
	public static class Get_backContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(FlutterParser.GET, 0); }
		public TerminalNode DOT() { return getToken(FlutterParser.DOT, 0); }
		public TerminalNode BACK() { return getToken(FlutterParser.BACK, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public Get_backContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_back; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterGet_back(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitGet_back(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitGet_back(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_backContext get_back() throws RecognitionException {
		Get_backContext _localctx = new Get_backContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_get_back);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(GET);
			setState(495);
			match(DOT);
			setState(496);
			match(BACK);
			setState(497);
			match(OPENTEXT);
			setState(498);
			match(CLOSETEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldContext extends ParserRuleContext {
		public TerminalNode SCAFFOLD() { return getToken(FlutterParser.SCAFFOLD, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public ScaffoldArgsContext scaffoldArgs() {
			return getRuleContext(ScaffoldArgsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FlutterParser.COMMA, 0); }
		public ScaffoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterScaffold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitScaffold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitScaffold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldContext scaffold() throws RecognitionException {
		ScaffoldContext _localctx = new ScaffoldContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_scaffold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(SCAFFOLD);
			setState(501);
			match(OPENTEXT);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BODY || _la==BACK_COLOR) {
				{
				setState(502);
				scaffoldArgs();
				}
			}

			setState(505);
			match(CLOSETEXT);
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(506);
				match(COMMA);
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
	public static class ScaffoldArgsContext extends ParserRuleContext {
		public List<ScaffoldPropertyContext> scaffoldProperty() {
			return getRuleContexts(ScaffoldPropertyContext.class);
		}
		public ScaffoldPropertyContext scaffoldProperty(int i) {
			return getRuleContext(ScaffoldPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public ScaffoldArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterScaffoldArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitScaffoldArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitScaffoldArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldArgsContext scaffoldArgs() throws RecognitionException {
		ScaffoldArgsContext _localctx = new ScaffoldArgsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_scaffoldArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			scaffoldProperty();
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(510);
					match(COMMA);
					setState(511);
					scaffoldProperty();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(517);
				match(COMMA);
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
	public static class ScaffoldPropertyContext extends ParserRuleContext {
		public ScaffoldPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldProperty; }
	 
		public ScaffoldPropertyContext() { }
		public void copyFrom(ScaffoldPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundScaffoldPropertyContext extends ScaffoldPropertyContext {
		public TerminalNode BACK_COLOR() { return getToken(FlutterParser.BACK_COLOR, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public TerminalNode COLORS() { return getToken(FlutterParser.COLORS, 0); }
		public TerminalNode DOT() { return getToken(FlutterParser.DOT, 0); }
		public TerminalNode COLORS_VALUES() { return getToken(FlutterParser.COLORS_VALUES, 0); }
		public BackgroundScaffoldPropertyContext(ScaffoldPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterBackgroundScaffoldProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitBackgroundScaffoldProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitBackgroundScaffoldProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BodyScaffoldPropertyContext extends ScaffoldPropertyContext {
		public TerminalNode BODY() { return getToken(FlutterParser.BODY, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public BodyScaffoldPropertyContext(ScaffoldPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterBodyScaffoldProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitBodyScaffoldProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitBodyScaffoldProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldPropertyContext scaffoldProperty() throws RecognitionException {
		ScaffoldPropertyContext _localctx = new ScaffoldPropertyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_scaffoldProperty);
		try {
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY:
				_localctx = new BodyScaffoldPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(BODY);
				setState(521);
				match(C);
				setState(522);
				widget();
				}
				break;
			case BACK_COLOR:
				_localctx = new BackgroundScaffoldPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(BACK_COLOR);
				setState(524);
				match(C);
				setState(525);
				match(COLORS);
				setState(526);
				match(DOT);
				setState(527);
				match(COLORS_VALUES);
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
	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGEASSETS() { return getToken(FlutterParser.IMAGEASSETS, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public ImagePropertiesContext imageProperties() {
			return getRuleContext(ImagePropertiesContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public TerminalNode COMMA() { return getToken(FlutterParser.COMMA, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(IMAGEASSETS);
			setState(531);
			match(OPENTEXT);
			setState(532);
			imageProperties();
			setState(533);
			match(CLOSETEXT);
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(534);
				match(COMMA);
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
	public static class ImagePropertiesContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public List<ImagePropertyContext> imageProperty() {
			return getRuleContexts(ImagePropertyContext.class);
		}
		public ImagePropertyContext imageProperty(int i) {
			return getRuleContext(ImagePropertyContext.class,i);
		}
		public ImagePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterImageProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitImageProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitImageProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImagePropertiesContext imageProperties() throws RecognitionException {
		ImagePropertiesContext _localctx = new ImagePropertiesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_imageProperties);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			expr(0);
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(538);
					match(COMMA);
					setState(539);
					imageProperty();
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(545);
				match(COMMA);
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
	public static class ImagePropertyContext extends ParserRuleContext {
		public ImagePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageProperty; }
	 
		public ImagePropertyContext() { }
		public void copyFrom(ImagePropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageColorContext extends ImagePropertyContext {
		public TerminalNode COLOR() { return getToken(FlutterParser.COLOR, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public TerminalNode COLORS() { return getToken(FlutterParser.COLORS, 0); }
		public TerminalNode DOT() { return getToken(FlutterParser.DOT, 0); }
		public TerminalNode COLORS_VALUES() { return getToken(FlutterParser.COLORS_VALUES, 0); }
		public ImageColorContext(ImagePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterImageColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitImageColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitImageColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageWidthHeightContext extends ImagePropertyContext {
		public TerminalNode WIDTH() { return getToken(FlutterParser.WIDTH, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode HEIGHT() { return getToken(FlutterParser.HEIGHT, 0); }
		public ImageWidthHeightContext(ImagePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterImageWidthHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitImageWidthHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitImageWidthHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImagePropertyContext imageProperty() throws RecognitionException {
		ImagePropertyContext _localctx = new ImagePropertyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_imageProperty);
		try {
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new ImageWidthHeightContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(WIDTH);
				setState(549);
				match(C);
				setState(550);
				expr(0);
				}
				break;
			case HEIGHT:
				_localctx = new ImageWidthHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(HEIGHT);
				setState(552);
				match(C);
				setState(553);
				expr(0);
				}
				break;
			case COLOR:
				_localctx = new ImageColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				match(COLOR);
				setState(555);
				match(C);
				setState(556);
				match(COLORS);
				setState(557);
				match(DOT);
				setState(558);
				match(COLORS_VALUES);
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
	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(FlutterParser.TEXT, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TextPropertiesContext textProperties() {
			return getRuleContext(TextPropertiesContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public TerminalNode COMMA() { return getToken(FlutterParser.COMMA, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(TEXT);
			setState(562);
			match(OPENTEXT);
			setState(563);
			textProperties();
			setState(564);
			match(CLOSETEXT);
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(565);
				match(COMMA);
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
	public static class TextPropertiesContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public TextPropertyContext textProperty() {
			return getRuleContext(TextPropertyContext.class,0);
		}
		public TextPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterTextProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitTextProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitTextProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextPropertiesContext textProperties() throws RecognitionException {
		TextPropertiesContext _localctx = new TextPropertiesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_textProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			expr(0);
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(569);
				match(COMMA);
				setState(570);
				textProperty();
				}
				break;
			}
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(573);
				match(COMMA);
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
	public static class TextPropertyContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(FlutterParser.STYLE, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public TextPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterTextProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitTextProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitTextProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextPropertyContext textProperty() throws RecognitionException {
		TextPropertyContext _localctx = new TextPropertyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_textProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(STYLE);
			setState(577);
			match(C);
			setState(578);
			style();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode TEXTSTYLE() { return getToken(FlutterParser.TEXTSTYLE, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public TextStyleProprtiesContext textStyleProprties() {
			return getRuleContext(TextStyleProprtiesContext.class,0);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(TEXTSTYLE);
			setState(581);
			match(OPENTEXT);
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR || _la==FONTSIZE) {
				{
				setState(582);
				textStyleProprties();
				}
			}

			setState(585);
			match(CLOSETEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextStyleProprtiesContext extends ParserRuleContext {
		public List<TextStyleProprtyContext> textStyleProprty() {
			return getRuleContexts(TextStyleProprtyContext.class);
		}
		public TextStyleProprtyContext textStyleProprty(int i) {
			return getRuleContext(TextStyleProprtyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public TextStyleProprtiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textStyleProprties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterTextStyleProprties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitTextStyleProprties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitTextStyleProprties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextStyleProprtiesContext textStyleProprties() throws RecognitionException {
		TextStyleProprtiesContext _localctx = new TextStyleProprtiesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_textStyleProprties);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			textStyleProprty();
			setState(592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(588);
					match(COMMA);
					setState(589);
					textStyleProprty();
					}
					} 
				}
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(595);
				match(COMMA);
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
	public static class TextStyleProprtyContext extends ParserRuleContext {
		public TextStyleProprtyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textStyleProprty; }
	 
		public TextStyleProprtyContext() { }
		public void copyFrom(TextStyleProprtyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorKeyValueContext extends TextStyleProprtyContext {
		public TerminalNode COLOR() { return getToken(FlutterParser.COLOR, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public TerminalNode COLORS() { return getToken(FlutterParser.COLORS, 0); }
		public TerminalNode DOT() { return getToken(FlutterParser.DOT, 0); }
		public TerminalNode COLORS_VALUES() { return getToken(FlutterParser.COLORS_VALUES, 0); }
		public ColorKeyValueContext(TextStyleProprtyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterColorKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitColorKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitColorKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontSizeKeyValueContext extends TextStyleProprtyContext {
		public TerminalNode FONTSIZE() { return getToken(FlutterParser.FONTSIZE, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FontSizeKeyValueContext(TextStyleProprtyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFontSizeKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFontSizeKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFontSizeKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextStyleProprtyContext textStyleProprty() throws RecognitionException {
		TextStyleProprtyContext _localctx = new TextStyleProprtyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_textStyleProprty);
		try {
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				_localctx = new ColorKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(COLOR);
				setState(599);
				match(C);
				setState(600);
				match(COLORS);
				setState(601);
				match(DOT);
				setState(602);
				match(COLORS_VALUES);
				}
				break;
			case FONTSIZE:
				_localctx = new FontSizeKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(FONTSIZE);
				setState(604);
				match(C);
				setState(605);
				expr(0);
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
	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(FlutterParser.COLUMN, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public ColumnArgsContext columnArgs() {
			return getRuleContext(ColumnArgsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FlutterParser.COMMA, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(COLUMN);
			setState(609);
			match(OPENTEXT);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42950197248L) != 0)) {
				{
				setState(610);
				columnArgs();
				}
			}

			setState(613);
			match(CLOSETEXT);
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(614);
				match(COMMA);
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
	public static class RowContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(FlutterParser.ROW, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public RowArgsContext rowArgs() {
			return getRuleContext(RowArgsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FlutterParser.COMMA, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(ROW);
			setState(618);
			match(OPENTEXT);
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42950197248L) != 0)) {
				{
				setState(619);
				rowArgs();
				}
			}

			setState(622);
			match(CLOSETEXT);
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(623);
				match(COMMA);
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
	public static class ColumnArgsContext extends ParserRuleContext {
		public List<ColumnArgContext> columnArg() {
			return getRuleContexts(ColumnArgContext.class);
		}
		public ColumnArgContext columnArg(int i) {
			return getRuleContext(ColumnArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public ColumnArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterColumnArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitColumnArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitColumnArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnArgsContext columnArgs() throws RecognitionException {
		ColumnArgsContext _localctx = new ColumnArgsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_columnArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			columnArg();
			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(627);
					match(COMMA);
					setState(628);
					columnArg();
					}
					} 
				}
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(634);
				match(COMMA);
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
	public static class ColumnArgContext extends ParserRuleContext {
		public ColumnArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnArg; }
	 
		public ColumnArgContext() { }
		public void copyFrom(ColumnArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnWidgetListContext extends ColumnArgContext {
		public TerminalNode CHILDREN() { return getToken(FlutterParser.CHILDREN, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public WidgetListContext widgetList() {
			return getRuleContext(WidgetListContext.class,0);
		}
		public ColumnWidgetListContext(ColumnArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterColumnWidgetList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitColumnWidgetList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitColumnWidgetList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnKeyValueContext extends ColumnArgContext {
		public TerminalNode MAINAXISALIGNMENT_KEY() { return getToken(FlutterParser.MAINAXISALIGNMENT_KEY, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public MainAxisAlignmentContext mainAxisAlignment() {
			return getRuleContext(MainAxisAlignmentContext.class,0);
		}
		public TerminalNode CROSSAXISALIGNMENT_KEY() { return getToken(FlutterParser.CROSSAXISALIGNMENT_KEY, 0); }
		public CrossAxisAlignmentContext crossAxisAlignment() {
			return getRuleContext(CrossAxisAlignmentContext.class,0);
		}
		public ColumnKeyValueContext(ColumnArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterColumnKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitColumnKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitColumnKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnArgContext columnArg() throws RecognitionException {
		ColumnArgContext _localctx = new ColumnArgContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_columnArg);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAINAXISALIGNMENT_KEY:
				_localctx = new ColumnKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				match(MAINAXISALIGNMENT_KEY);
				setState(638);
				match(C);
				setState(639);
				mainAxisAlignment();
				}
				break;
			case CROSSAXISALIGNMENT_KEY:
				_localctx = new ColumnKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(CROSSAXISALIGNMENT_KEY);
				setState(641);
				match(C);
				setState(642);
				crossAxisAlignment();
				}
				break;
			case CHILDREN:
				_localctx = new ColumnWidgetListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(643);
				match(CHILDREN);
				setState(644);
				match(C);
				setState(645);
				widgetList();
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
	public static class RowArgsContext extends ParserRuleContext {
		public List<RowArgContext> rowArg() {
			return getRuleContexts(RowArgContext.class);
		}
		public RowArgContext rowArg(int i) {
			return getRuleContext(RowArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public RowArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterRowArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitRowArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitRowArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowArgsContext rowArgs() throws RecognitionException {
		RowArgsContext _localctx = new RowArgsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_rowArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			rowArg();
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(649);
					match(COMMA);
					setState(650);
					rowArg();
					}
					} 
				}
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(656);
				match(COMMA);
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
	public static class RowArgContext extends ParserRuleContext {
		public RowArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowArg; }
	 
		public RowArgContext() { }
		public void copyFrom(RowArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowWidgetListContext extends RowArgContext {
		public TerminalNode CHILDREN() { return getToken(FlutterParser.CHILDREN, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public WidgetListContext widgetList() {
			return getRuleContext(WidgetListContext.class,0);
		}
		public RowWidgetListContext(RowArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterRowWidgetList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitRowWidgetList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitRowWidgetList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowKeyValueContext extends RowArgContext {
		public TerminalNode MAINAXISALIGNMENT_KEY() { return getToken(FlutterParser.MAINAXISALIGNMENT_KEY, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public MainAxisAlignmentContext mainAxisAlignment() {
			return getRuleContext(MainAxisAlignmentContext.class,0);
		}
		public TerminalNode CROSSAXISALIGNMENT_KEY() { return getToken(FlutterParser.CROSSAXISALIGNMENT_KEY, 0); }
		public CrossAxisAlignmentContext crossAxisAlignment() {
			return getRuleContext(CrossAxisAlignmentContext.class,0);
		}
		public RowKeyValueContext(RowArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterRowKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitRowKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitRowKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowArgContext rowArg() throws RecognitionException {
		RowArgContext _localctx = new RowArgContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_rowArg);
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAINAXISALIGNMENT_KEY:
				_localctx = new RowKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(MAINAXISALIGNMENT_KEY);
				setState(660);
				match(C);
				setState(661);
				mainAxisAlignment();
				}
				break;
			case CROSSAXISALIGNMENT_KEY:
				_localctx = new RowKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				match(CROSSAXISALIGNMENT_KEY);
				setState(663);
				match(C);
				setState(664);
				crossAxisAlignment();
				}
				break;
			case CHILDREN:
				_localctx = new RowWidgetListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				match(CHILDREN);
				setState(666);
				match(C);
				setState(667);
				widgetList();
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
	public static class MainAxisAlignmentContext extends ParserRuleContext {
		public TerminalNode MAINAXISALIGNMENT_VALUE() { return getToken(FlutterParser.MAINAXISALIGNMENT_VALUE, 0); }
		public TerminalNode DOT() { return getToken(FlutterParser.DOT, 0); }
		public TerminalNode MAINAXISALIGNMENT_VALUES() { return getToken(FlutterParser.MAINAXISALIGNMENT_VALUES, 0); }
		public MainAxisAlignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainAxisAlignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterMainAxisAlignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitMainAxisAlignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitMainAxisAlignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainAxisAlignmentContext mainAxisAlignment() throws RecognitionException {
		MainAxisAlignmentContext _localctx = new MainAxisAlignmentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_mainAxisAlignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(MAINAXISALIGNMENT_VALUE);
			setState(671);
			match(DOT);
			setState(672);
			match(MAINAXISALIGNMENT_VALUES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossAxisAlignmentContext extends ParserRuleContext {
		public TerminalNode CROSSAXISALIGNMENT_VALUE() { return getToken(FlutterParser.CROSSAXISALIGNMENT_VALUE, 0); }
		public TerminalNode DOT_Cross() { return getToken(FlutterParser.DOT_Cross, 0); }
		public TerminalNode CROSSAXISALIGNMENT_VALUES() { return getToken(FlutterParser.CROSSAXISALIGNMENT_VALUES, 0); }
		public CrossAxisAlignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossAxisAlignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterCrossAxisAlignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitCrossAxisAlignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitCrossAxisAlignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossAxisAlignmentContext crossAxisAlignment() throws RecognitionException {
		CrossAxisAlignmentContext _localctx = new CrossAxisAlignmentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_crossAxisAlignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(CROSSAXISALIGNMENT_VALUE);
			setState(675);
			match(DOT_Cross);
			setState(676);
			match(CROSSAXISALIGNMENT_VALUES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainAxisSizeContext extends ParserRuleContext {
		public TerminalNode MAINAXISSIZE_VALUE() { return getToken(FlutterParser.MAINAXISSIZE_VALUE, 0); }
		public TerminalNode DOT() { return getToken(FlutterParser.DOT, 0); }
		public TerminalNode MAINAXISSIZE_VALUES() { return getToken(FlutterParser.MAINAXISSIZE_VALUES, 0); }
		public MainAxisSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainAxisSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterMainAxisSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitMainAxisSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitMainAxisSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainAxisSizeContext mainAxisSize() throws RecognitionException {
		MainAxisSizeContext _localctx = new MainAxisSizeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_mainAxisSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(MAINAXISSIZE_VALUE);
			setState(679);
			match(DOT);
			setState(680);
			match(MAINAXISSIZE_VALUES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WidgetListContext extends ParserRuleContext {
		public TerminalNode OB() { return getToken(FlutterParser.OB, 0); }
		public TerminalNode CB() { return getToken(FlutterParser.CB, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public WidgetListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgetList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterWidgetList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitWidgetList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitWidgetList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetListContext widgetList() throws RecognitionException {
		WidgetListContext _localctx = new WidgetListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_widgetList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(OB);
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & 20266198323233583L) != 0)) {
				{
				setState(683);
				widget();
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(684);
						match(COMMA);
						setState(685);
						widget();
						}
						} 
					}
					setState(690);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
			}

			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(693);
				match(COMMA);
				}
			}

			setState(696);
			match(CB);
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(697);
				match(COMMA);
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
	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINER() { return getToken(FlutterParser.CONTAINER, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public ContainerPropertiesContext containerProperties() {
			return getRuleContext(ContainerPropertiesContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FlutterParser.COMMA, 0); }
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(CONTAINER);
			setState(701);
			match(OPENTEXT);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 876609536L) != 0)) {
				{
				setState(702);
				containerProperties();
				}
			}

			setState(705);
			match(CLOSETEXT);
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(706);
				match(COMMA);
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
	public static class ContainerPropertiesContext extends ParserRuleContext {
		public List<ContainerPropertyContext> containerProperty() {
			return getRuleContexts(ContainerPropertyContext.class);
		}
		public ContainerPropertyContext containerProperty(int i) {
			return getRuleContext(ContainerPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public ContainerPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterContainerProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitContainerProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitContainerProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerPropertiesContext containerProperties() throws RecognitionException {
		ContainerPropertiesContext _localctx = new ContainerPropertiesContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_containerProperties);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			containerProperty();
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(710);
					match(COMMA);
					setState(711);
					containerProperty();
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(717);
				match(COMMA);
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
	public static class ContainerPropertyContext extends ParserRuleContext {
		public ContainerPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerProperty; }
	 
		public ContainerPropertyContext() { }
		public void copyFrom(ContainerPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerKeyValueContext extends ContainerPropertyContext {
		public TerminalNode COLOR() { return getToken(FlutterParser.COLOR, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public TerminalNode COLORS() { return getToken(FlutterParser.COLORS, 0); }
		public TerminalNode DOT() { return getToken(FlutterParser.DOT, 0); }
		public TerminalNode COLORS_VALUES() { return getToken(FlutterParser.COLORS_VALUES, 0); }
		public ContainerKeyValueContext(ContainerPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterContainerKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitContainerKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitContainerKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerKeyWidgetValueContext extends ContainerPropertyContext {
		public TerminalNode CHILD() { return getToken(FlutterParser.CHILD, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ContainerKeyWidgetValueContext(ContainerPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterContainerKeyWidgetValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitContainerKeyWidgetValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitContainerKeyWidgetValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerWidthHeightContext extends ContainerPropertyContext {
		public TerminalNode WIDTH() { return getToken(FlutterParser.WIDTH, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode HEIGHT() { return getToken(FlutterParser.HEIGHT, 0); }
		public ContainerWidthHeightContext(ContainerPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterContainerWidthHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitContainerWidthHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitContainerWidthHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerPropertyContext containerProperty() throws RecognitionException {
		ContainerPropertyContext _localctx = new ContainerPropertyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_containerProperty);
		try {
			setState(734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				_localctx = new ContainerKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				match(COLOR);
				setState(721);
				match(C);
				setState(722);
				match(COLORS);
				setState(723);
				match(DOT);
				setState(724);
				match(COLORS_VALUES);
				}
				break;
			case WIDTH:
				_localctx = new ContainerWidthHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				match(WIDTH);
				setState(726);
				match(C);
				setState(727);
				expr(0);
				}
				break;
			case HEIGHT:
				_localctx = new ContainerWidthHeightContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(728);
				match(HEIGHT);
				setState(729);
				match(C);
				setState(730);
				expr(0);
				}
				break;
			case CHILD:
				_localctx = new ContainerKeyWidgetValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(731);
				match(CHILD);
				setState(732);
				match(C);
				setState(733);
				widget();
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
	public static class E_buttonContext extends ParserRuleContext {
		public TerminalNode E_BUTTON() { return getToken(FlutterParser.E_BUTTON, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public E_buttonPropertiesContext e_buttonProperties() {
			return getRuleContext(E_buttonPropertiesContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public E_buttonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_button; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterE_button(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitE_button(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitE_button(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_buttonContext e_button() throws RecognitionException {
		E_buttonContext _localctx = new E_buttonContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_e_button);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(E_BUTTON);
			setState(737);
			match(OPENTEXT);
			setState(738);
			e_buttonProperties();
			setState(739);
			match(CLOSETEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class E_buttonPropertiesContext extends ParserRuleContext {
		public List<E_ButtonPropertyContext> e_ButtonProperty() {
			return getRuleContexts(E_ButtonPropertyContext.class);
		}
		public E_ButtonPropertyContext e_ButtonProperty(int i) {
			return getRuleContext(E_ButtonPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public E_buttonPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_buttonProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterE_buttonProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitE_buttonProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitE_buttonProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_buttonPropertiesContext e_buttonProperties() throws RecognitionException {
		E_buttonPropertiesContext _localctx = new E_buttonPropertiesContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_e_buttonProperties);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			e_ButtonProperty();
			setState(746);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(742);
					match(COMMA);
					setState(743);
					e_ButtonProperty();
					}
					} 
				}
				setState(748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(749);
				match(COMMA);
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
	public static class E_ButtonPropertyContext extends ParserRuleContext {
		public E_ButtonPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_ButtonProperty; }
	 
		public E_ButtonPropertyContext() { }
		public void copyFrom(E_ButtonPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EbuttonColorContext extends E_ButtonPropertyContext {
		public TerminalNode COLOR() { return getToken(FlutterParser.COLOR, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public TerminalNode COLORS() { return getToken(FlutterParser.COLORS, 0); }
		public TerminalNode DOT() { return getToken(FlutterParser.DOT, 0); }
		public TerminalNode COLORS_VALUES() { return getToken(FlutterParser.COLORS_VALUES, 0); }
		public EbuttonColorContext(E_ButtonPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterEbuttonColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitEbuttonColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitEbuttonColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EbuttonVoidContext extends E_ButtonPropertyContext {
		public TerminalNode ON_PRESSED() { return getToken(FlutterParser.ON_PRESSED, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public VoidFunctionContext voidFunction() {
			return getRuleContext(VoidFunctionContext.class,0);
		}
		public TerminalNode CHILD() { return getToken(FlutterParser.CHILD, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public EbuttonVoidContext(E_ButtonPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterEbuttonVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitEbuttonVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitEbuttonVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_ButtonPropertyContext e_ButtonProperty() throws RecognitionException {
		E_ButtonPropertyContext _localctx = new E_ButtonPropertyContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_e_ButtonProperty);
		try {
			setState(763);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_PRESSED:
				_localctx = new EbuttonVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				match(ON_PRESSED);
				setState(753);
				match(C);
				setState(754);
				voidFunction();
				}
				break;
			case COLOR:
				_localctx = new EbuttonColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				match(COLOR);
				setState(756);
				match(C);
				setState(757);
				match(COLORS);
				setState(758);
				match(DOT);
				setState(759);
				match(COLORS_VALUES);
				}
				break;
			case CHILD:
				_localctx = new EbuttonVoidContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(760);
				match(CHILD);
				setState(761);
				match(C);
				setState(762);
				widget();
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
	public static class TextFieldContext extends ParserRuleContext {
		public TerminalNode TEXTFIELD() { return getToken(FlutterParser.TEXTFIELD, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public TextFieldArgsContext textFieldArgs() {
			return getRuleContext(TextFieldArgsContext.class,0);
		}
		public TextFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterTextField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitTextField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitTextField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldContext textField() throws RecognitionException {
		TextFieldContext _localctx = new TextFieldContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_textField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(TEXTFIELD);
			setState(766);
			match(OPENTEXT);
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HINT_TEXT || _la==TEXTFIELD_CONTROLLER) {
				{
				setState(767);
				textFieldArgs();
				}
			}

			setState(770);
			match(CLOSETEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldArgsContext extends ParserRuleContext {
		public List<TextFieldWidgetArgContext> textFieldWidgetArg() {
			return getRuleContexts(TextFieldWidgetArgContext.class);
		}
		public TextFieldWidgetArgContext textFieldWidgetArg(int i) {
			return getRuleContext(TextFieldWidgetArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public TextFieldArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFieldArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterTextFieldArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitTextFieldArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitTextFieldArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldArgsContext textFieldArgs() throws RecognitionException {
		TextFieldArgsContext _localctx = new TextFieldArgsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_textFieldArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			textFieldWidgetArg();
			setState(777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(773);
					match(COMMA);
					setState(774);
					textFieldWidgetArg();
					}
					} 
				}
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(780);
				match(COMMA);
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
	public static class TextFieldWidgetArgContext extends ParserRuleContext {
		public TerminalNode TEXTFIELD_CONTROLLER() { return getToken(FlutterParser.TEXTFIELD_CONTROLLER, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode HINT_TEXT() { return getToken(FlutterParser.HINT_TEXT, 0); }
		public TextFieldWidgetArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFieldWidgetArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterTextFieldWidgetArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitTextFieldWidgetArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitTextFieldWidgetArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldWidgetArgContext textFieldWidgetArg() throws RecognitionException {
		TextFieldWidgetArgContext _localctx = new TextFieldWidgetArgContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_textFieldWidgetArg);
		try {
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTFIELD_CONTROLLER:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(TEXTFIELD_CONTROLLER);
				setState(784);
				match(C);
				setState(785);
				expr(0);
				}
				break;
			case HINT_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				match(HINT_TEXT);
				setState(787);
				match(C);
				setState(788);
				expr(0);
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
	public static class FormContext extends ParserRuleContext {
		public TerminalNode FORM() { return getToken(FlutterParser.FORM, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public FormArgsContext formArgs() {
			return getRuleContext(FormArgsContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(FORM);
			setState(792);
			match(OPENTEXT);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
				setState(793);
				formArgs();
				}
			}

			setState(796);
			match(CLOSETEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormArgsContext extends ParserRuleContext {
		public List<FormArgContext> formArg() {
			return getRuleContexts(FormArgContext.class);
		}
		public FormArgContext formArg(int i) {
			return getRuleContext(FormArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlutterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlutterParser.COMMA, i);
		}
		public FormArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFormArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFormArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFormArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormArgsContext formArgs() throws RecognitionException {
		FormArgsContext _localctx = new FormArgsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_formArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			formArg();
			setState(803);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(799);
					match(COMMA);
					setState(800);
					formArg();
					}
					} 
				}
				setState(805);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(806);
				match(COMMA);
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
	public static class FormArgContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(FlutterParser.CHILD, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public FormArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFormArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFormArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFormArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormArgContext formArg() throws RecognitionException {
		FormArgContext _localctx = new FormArgContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_formArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(CHILD);
			setState(810);
			match(C);
			setState(811);
			widget();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VoidFunctionContext extends ParserRuleContext {
		public VoidFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidFunction; }
	 
		public VoidFunctionContext() { }
		public void copyFrom(VoidFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends VoidFunctionContext {
		public TerminalNode CHARS() { return getToken(FlutterParser.CHARS, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public CallFunctionContext(VoidFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBlockContext extends VoidFunctionContext {
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionBlockContext(VoidFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidFunctionContext voidFunction() throws RecognitionException {
		VoidFunctionContext _localctx = new VoidFunctionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_voidFunction);
		try {
			setState(819);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARS:
				_localctx = new CallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				match(CHARS);
				setState(814);
				match(OPENTEXT);
				setState(815);
				match(CLOSETEXT);
				}
				break;
			case OPENTEXT:
				_localctx = new FunctionBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(816);
				match(OPENTEXT);
				setState(817);
				match(CLOSETEXT);
				setState(818);
				block();
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
	public static class CenterContext extends ParserRuleContext {
		public TerminalNode CENTER() { return getToken(FlutterParser.CENTER, 0); }
		public TerminalNode OPENTEXT() { return getToken(FlutterParser.OPENTEXT, 0); }
		public CenterWidgetArgsContext centerWidgetArgs() {
			return getRuleContext(CenterWidgetArgsContext.class,0);
		}
		public TerminalNode CLOSETEXT() { return getToken(FlutterParser.CLOSETEXT, 0); }
		public CenterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_center; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterCenter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitCenter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitCenter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterContext center() throws RecognitionException {
		CenterContext _localctx = new CenterContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_center);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(CENTER);
			setState(822);
			match(OPENTEXT);
			setState(823);
			centerWidgetArgs();
			setState(824);
			match(CLOSETEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CenterWidgetArgsContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(FlutterParser.CHILD, 0); }
		public TerminalNode C() { return getToken(FlutterParser.C, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public CenterWidgetArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centerWidgetArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterCenterWidgetArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitCenterWidgetArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitCenterWidgetArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterWidgetArgsContext centerWidgetArgs() throws RecognitionException {
		CenterWidgetArgsContext _localctx = new CenterWidgetArgsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_centerWidgetArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(CHILD);
			setState(827);
			match(C);
			setState(828);
			widget();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetStateContext extends ParserRuleContext {
		public TerminalNode SETSTATE() { return getToken(FlutterParser.SETSTATE, 0); }
		public List<TerminalNode> OPENTEXT() { return getTokens(FlutterParser.OPENTEXT); }
		public TerminalNode OPENTEXT(int i) {
			return getToken(FlutterParser.OPENTEXT, i);
		}
		public List<TerminalNode> CLOSETEXT() { return getTokens(FlutterParser.CLOSETEXT); }
		public TerminalNode CLOSETEXT(int i) {
			return getToken(FlutterParser.CLOSETEXT, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FlutterParser.SEMICOLON, 0); }
		public SetStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).enterSetState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlutterParserListener ) ((FlutterParserListener)listener).exitSetState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlutterParserVisitor ) return ((FlutterParserVisitor<? extends T>)visitor).visitSetState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStateContext setState() throws RecognitionException {
		SetStateContext _localctx = new SetStateContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_setState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(SETSTATE);
			setState(831);
			match(OPENTEXT);
			setState(832);
			match(OPENTEXT);
			setState(833);
			match(CLOSETEXT);
			setState(834);
			block();
			setState(835);
			match(CLOSETEXT);
			setState(836);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
		case 27:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001p\u0347\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"K\u0007K\u0001\u0000\u0005\u0000\u009a\b\u0000\n\u0000\f\u0000\u009d\t"+
		"\u0000\u0001\u0000\u0005\u0000\u00a0\b\u0000\n\u0000\f\u0000\u00a3\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00ae\b\u0002\u0001\u0003"+
		"\u0003\u0003\u00b1\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u00b7\b\u0003\n\u0003\f\u0003\u00ba\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00c0\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ce"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00d4"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00de\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00e6\b\b\n\b\f\b\u00e9"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f2"+
		"\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0003\f\u0107\b\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u010c\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u0117\b\r\n\r\f\r\u011a\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0127\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0138\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0151\b\u0013\n"+
		"\u0013\f\u0013\u0154\t\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0158"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0176"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u017a\b\u0019\n\u0019\f\u0019"+
		"\u017d\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0187\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0199\b\u001b\u0003\u001b"+
		"\u019b\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01a5\b\u001b\n\u001b"+
		"\f\u001b\u01a8\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u01b4\b\u001e\n\u001e\f\u001e\u01b7\t\u001e\u0003\u001e\u01b9"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 "+
		"\u01c9\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u01d5\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u01e1\b#\n#\f#\u01e4\t#\u0001#"+
		"\u0003#\u01e7\b#\u0001$\u0001$\u0001$\u0001$\u0003$\u01ed\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0003&\u01f8\b&\u0001"+
		"&\u0001&\u0003&\u01fc\b&\u0001\'\u0001\'\u0001\'\u0005\'\u0201\b\'\n\'"+
		"\f\'\u0204\t\'\u0001\'\u0003\'\u0207\b\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u0211\b(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u0218\b)\u0001*\u0001*\u0001*\u0005*\u021d\b*\n*\f*\u0220\t*"+
		"\u0001*\u0003*\u0223\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u0230\b+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u0237\b,\u0001-\u0001-\u0001-\u0003-\u023c\b-\u0001-\u0003"+
		"-\u023f\b-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0003/\u0248"+
		"\b/\u0001/\u0001/\u00010\u00010\u00010\u00050\u024f\b0\n0\f0\u0252\t0"+
		"\u00010\u00030\u0255\b0\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00031\u025f\b1\u00012\u00012\u00012\u00032\u0264\b2\u00012\u0001"+
		"2\u00032\u0268\b2\u00013\u00013\u00013\u00033\u026d\b3\u00013\u00013\u0003"+
		"3\u0271\b3\u00014\u00014\u00014\u00054\u0276\b4\n4\f4\u0279\t4\u00014"+
		"\u00034\u027c\b4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00035\u0287\b5\u00016\u00016\u00016\u00056\u028c\b6\n6\f6\u028f"+
		"\t6\u00016\u00036\u0292\b6\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00037\u029d\b7\u00018\u00018\u00018\u00018\u00019\u0001"+
		"9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001"+
		";\u0005;\u02af\b;\n;\f;\u02b2\t;\u0003;\u02b4\b;\u0001;\u0003;\u02b7\b"+
		";\u0001;\u0001;\u0003;\u02bb\b;\u0001<\u0001<\u0001<\u0003<\u02c0\b<\u0001"+
		"<\u0001<\u0003<\u02c4\b<\u0001=\u0001=\u0001=\u0005=\u02c9\b=\n=\f=\u02cc"+
		"\t=\u0001=\u0003=\u02cf\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u02df\b>\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0005@\u02e9\b@\n@"+
		"\f@\u02ec\t@\u0001@\u0003@\u02ef\b@\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u02fc\bA\u0001B\u0001"+
		"B\u0001B\u0003B\u0301\bB\u0001B\u0001B\u0001C\u0001C\u0001C\u0005C\u0308"+
		"\bC\nC\fC\u030b\tC\u0001C\u0003C\u030e\bC\u0001D\u0001D\u0001D\u0001D"+
		"\u0001D\u0001D\u0003D\u0316\bD\u0001E\u0001E\u0001E\u0003E\u031b\bE\u0001"+
		"E\u0001E\u0001F\u0001F\u0001F\u0005F\u0322\bF\nF\fF\u0325\tF\u0001F\u0003"+
		"F\u0328\bF\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0003H\u0334\bH\u0001I\u0001I\u0001I\u0001I\u0001I\u0001J\u0001"+
		"J\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0000\u00016L\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0000\u0002\u0002\u0000YZ\\]\u0001\u0000QT\u037a\u0000"+
		"\u009b\u0001\u0000\u0000\u0000\u0002\u00a4\u0001\u0000\u0000\u0000\u0004"+
		"\u00ad\u0001\u0000\u0000\u0000\u0006\u00b0\u0001\u0000\u0000\u0000\b\u00bf"+
		"\u0001\u0000\u0000\u0000\n\u00c1\u0001\u0000\u0000\u0000\f\u00d3\u0001"+
		"\u0000\u0000\u0000\u000e\u00d5\u0001\u0000\u0000\u0000\u0010\u00e2\u0001"+
		"\u0000\u0000\u0000\u0012\u00ea\u0001\u0000\u0000\u0000\u0014\u00f5\u0001"+
		"\u0000\u0000\u0000\u0016\u0100\u0001\u0000\u0000\u0000\u0018\u0106\u0001"+
		"\u0000\u0000\u0000\u001a\u0110\u0001\u0000\u0000\u0000\u001c\u0137\u0001"+
		"\u0000\u0000\u0000\u001e\u0139\u0001\u0000\u0000\u0000 \u013e\u0001\u0000"+
		"\u0000\u0000\"\u0142\u0001\u0000\u0000\u0000$\u0144\u0001\u0000\u0000"+
		"\u0000&\u014a\u0001\u0000\u0000\u0000(\u0159\u0001\u0000\u0000\u0000*"+
		"\u015f\u0001\u0000\u0000\u0000,\u0164\u0001\u0000\u0000\u0000.\u016a\u0001"+
		"\u0000\u0000\u00000\u0175\u0001\u0000\u0000\u00002\u0177\u0001\u0000\u0000"+
		"\u00004\u0186\u0001\u0000\u0000\u00006\u019a\u0001\u0000\u0000\u00008"+
		"\u01a9\u0001\u0000\u0000\u0000:\u01ac\u0001\u0000\u0000\u0000<\u01af\u0001"+
		"\u0000\u0000\u0000>\u01bc\u0001\u0000\u0000\u0000@\u01c8\u0001\u0000\u0000"+
		"\u0000B\u01d4\u0001\u0000\u0000\u0000D\u01d6\u0001\u0000\u0000\u0000F"+
		"\u01dd\u0001\u0000\u0000\u0000H\u01ec\u0001\u0000\u0000\u0000J\u01ee\u0001"+
		"\u0000\u0000\u0000L\u01f4\u0001\u0000\u0000\u0000N\u01fd\u0001\u0000\u0000"+
		"\u0000P\u0210\u0001\u0000\u0000\u0000R\u0212\u0001\u0000\u0000\u0000T"+
		"\u0219\u0001\u0000\u0000\u0000V\u022f\u0001\u0000\u0000\u0000X\u0231\u0001"+
		"\u0000\u0000\u0000Z\u0238\u0001\u0000\u0000\u0000\\\u0240\u0001\u0000"+
		"\u0000\u0000^\u0244\u0001\u0000\u0000\u0000`\u024b\u0001\u0000\u0000\u0000"+
		"b\u025e\u0001\u0000\u0000\u0000d\u0260\u0001\u0000\u0000\u0000f\u0269"+
		"\u0001\u0000\u0000\u0000h\u0272\u0001\u0000\u0000\u0000j\u0286\u0001\u0000"+
		"\u0000\u0000l\u0288\u0001\u0000\u0000\u0000n\u029c\u0001\u0000\u0000\u0000"+
		"p\u029e\u0001\u0000\u0000\u0000r\u02a2\u0001\u0000\u0000\u0000t\u02a6"+
		"\u0001\u0000\u0000\u0000v\u02aa\u0001\u0000\u0000\u0000x\u02bc\u0001\u0000"+
		"\u0000\u0000z\u02c5\u0001\u0000\u0000\u0000|\u02de\u0001\u0000\u0000\u0000"+
		"~\u02e0\u0001\u0000\u0000\u0000\u0080\u02e5\u0001\u0000\u0000\u0000\u0082"+
		"\u02fb\u0001\u0000\u0000\u0000\u0084\u02fd\u0001\u0000\u0000\u0000\u0086"+
		"\u0304\u0001\u0000\u0000\u0000\u0088\u0315\u0001\u0000\u0000\u0000\u008a"+
		"\u0317\u0001\u0000\u0000\u0000\u008c\u031e\u0001\u0000\u0000\u0000\u008e"+
		"\u0329\u0001\u0000\u0000\u0000\u0090\u0333\u0001\u0000\u0000\u0000\u0092"+
		"\u0335\u0001\u0000\u0000\u0000\u0094\u033a\u0001\u0000\u0000\u0000\u0096"+
		"\u033e\u0001\u0000\u0000\u0000\u0098\u009a\u0003\u0002\u0001\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u00a1\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e"+
		"\u00a0\u0003\u0004\u0002\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u0001\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005=\u0000\u0000\u00a5\u00a6"+
		"\u0005m\u0000\u0000\u00a6\u00a7\u0005e\u0000\u0000\u00a7\u0003\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ae\u0003\f\u0006\u0000\u00a9\u00ae\u0003\u0006\u0003"+
		"\u0000\u00aa\u00ae\u0003\u0018\f\u0000\u00ab\u00ae\u0003B!\u0000\u00ac"+
		"\u00ae\u0003\n\u0005\u0000\u00ad\u00a8\u0001\u0000\u0000\u0000\u00ad\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u0005"+
		"\u0001\u0000\u0000\u0000\u00af\u00b1\u0005A\u0000\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005@\u0000\u0000\u00b3\u00b4\u0005l\u0000"+
		"\u0000\u00b4\u00b8\u0005L\u0000\u0000\u00b5\u00b7\u0003\b\u0004\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005M\u0000\u0000\u00bc\u0007\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0003\f\u0006\u0000\u00be\u00c0\u0003\u0018\f\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\t\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005@\u0000\u0000\u00c2\u00c3\u0005l\u0000"+
		"\u0000\u00c3\u00c4\u0005\u0006\u0000\u0000\u00c4\u00c5\u0005\u0007\u0000"+
		"\u0000\u00c5\u00c6\u0005L\u0000\u0000\u00c6\u00c7\u0003\u0014\n\u0000"+
		"\u00c7\u00c8\u0005M\u0000\u0000\u00c8\u000b\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u00034\u001a\u0000\u00ca\u00cd\u0005l\u0000\u0000\u00cb\u00cc\u0005"+
		"_\u0000\u0000\u00cc\u00ce\u00036\u001b\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005e\u0000\u0000\u00d0\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d4\u0003\u000e\u0007\u0000\u00d2\u00d4\u0003\u0012\t\u0000\u00d3"+
		"\u00c9\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\r\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u00056\u0000\u0000\u00d6\u00d7\u0005`\u0000\u0000\u00d7\u00d8\u00034"+
		"\u001a\u0000\u00d8\u00d9\u0005a\u0000\u0000\u00d9\u00da\u0005l\u0000\u0000"+
		"\u00da\u00db\u0005_\u0000\u0000\u00db\u00dd\u0005K\u0000\u0000\u00dc\u00de"+
		"\u0003\u0010\b\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"J\u0000\u0000\u00e0\u00e1\u0005e\u0000\u0000\u00e1\u000f\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e7\u00036\u001b\u0000\u00e3\u00e4\u0005d\u0000\u0000\u00e4"+
		"\u00e6\u00036\u001b\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u0011\u0001\u0000\u0000\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u00055\u0000\u0000\u00eb\u00ec\u0005"+
		"`\u0000\u0000\u00ec\u00ed\u00034\u001a\u0000\u00ed\u00ee\u0005a\u0000"+
		"\u0000\u00ee\u00ef\u0005l\u0000\u0000\u00ef\u00f1\u0005_\u0000\u0000\u00f0"+
		"\u00f2\u0003<\u001e\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0005e\u0000\u0000\u00f4\u0013\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"\b\u0000\u0000\u00f6\u00f7\u0005\u000b\u0000\u0000\u00f7\u00f8\u0005\f"+
		"\u0000\u0000\u00f8\u00f9\u0005N\u0000\u0000\u00f9\u00fa\u0005\r\u0000"+
		"\u0000\u00fa\u00fb\u0005\u000e\u0000\u0000\u00fb\u00fc\u0005O\u0000\u0000"+
		"\u00fc\u00fd\u0005L\u0000\u0000\u00fd\u00fe\u0003\u0016\u000b\u0000\u00fe"+
		"\u00ff\u0005M\u0000\u0000\u00ff\u0015\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0005;\u0000\u0000\u0101\u0102\u0003B!\u0000\u0102\u0103\u0005e\u0000"+
		"\u0000\u0103\u0017\u0001\u0000\u0000\u0000\u0104\u0107\u00052\u0000\u0000"+
		"\u0105\u0107\u00034\u001a\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106"+
		"\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0005l\u0000\u0000\u0109\u010b\u0005N\u0000\u0000\u010a\u010c\u0003"+
		"\u001a\r\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0005O\u0000"+
		"\u0000\u010e\u010f\u00032\u0019\u0000\u010f\u0019\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u00034\u001a\u0000\u0111\u0118\u0005l\u0000\u0000\u0112\u0113"+
		"\u0005d\u0000\u0000\u0113\u0114\u00034\u001a\u0000\u0114\u0115\u0005l"+
		"\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0112\u0001\u0000"+
		"\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u001b\u0001\u0000"+
		"\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u0138\u0003\f\u0006"+
		"\u0000\u011c\u0138\u0003,\u0016\u0000\u011d\u0138\u0003&\u0013\u0000\u011e"+
		"\u0138\u0003.\u0017\u0000\u011f\u0138\u0003$\u0012\u0000\u0120\u0138\u0003"+
		"*\u0015\u0000\u0121\u0138\u0003\u001e\u000f\u0000\u0122\u0123\u0005<\u0000"+
		"\u0000\u0123\u0138\u0005e\u0000\u0000\u0124\u0126\u0005;\u0000\u0000\u0125"+
		"\u0127\u00036\u001b\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0138"+
		"\u0005e\u0000\u0000\u0129\u012a\u0003D\"\u0000\u012a\u012b\u0005e\u0000"+
		"\u0000\u012b\u0138\u0001\u0000\u0000\u0000\u012c\u012d\u0003J%\u0000\u012d"+
		"\u012e\u0005e\u0000\u0000\u012e\u0138\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u00038\u001c\u0000\u0130\u0131\u0005e\u0000\u0000\u0131\u0138\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0003:\u001d\u0000\u0133\u0134\u0005e\u0000\u0000"+
		"\u0134\u0138\u0001\u0000\u0000\u0000\u0135\u0138\u0003 \u0010\u0000\u0136"+
		"\u0138\u0003\u0096K\u0000\u0137\u011b\u0001\u0000\u0000\u0000\u0137\u011c"+
		"\u0001\u0000\u0000\u0000\u0137\u011d\u0001\u0000\u0000\u0000\u0137\u011e"+
		"\u0001\u0000\u0000\u0000\u0137\u011f\u0001\u0000\u0000\u0000\u0137\u0120"+
		"\u0001\u0000\u0000\u0000\u0137\u0121\u0001\u0000\u0000\u0000\u0137\u0122"+
		"\u0001\u0000\u0000\u0000\u0137\u0124\u0001\u0000\u0000\u0000\u0137\u0129"+
		"\u0001\u0000\u0000\u0000\u0137\u012c\u0001\u0000\u0000\u0000\u0137\u012f"+
		"\u0001\u0000\u0000\u0000\u0137\u0132\u0001\u0000\u0000\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u001d"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0005l\u0000\u0000\u013a\u013b\u0005"+
		"N\u0000\u0000\u013b\u013c\u0005O\u0000\u0000\u013c\u013d\u0005e\u0000"+
		"\u0000\u013d\u001f\u0001\u0000\u0000\u0000\u013e\u013f\u0005l\u0000\u0000"+
		"\u013f\u0140\u0007\u0000\u0000\u0000\u0140\u0141\u0005k\u0000\u0000\u0141"+
		"!\u0001\u0000\u0000\u0000\u0142\u0143\u0007\u0001\u0000\u0000\u0143#\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u00057\u0000\u0000\u0145\u0146\u0005N\u0000"+
		"\u0000\u0146\u0147\u00036\u001b\u0000\u0147\u0148\u0005O\u0000\u0000\u0148"+
		"\u0149\u00032\u0019\u0000\u0149%\u0001\u0000\u0000\u0000\u014a\u014b\u0005"+
		"F\u0000\u0000\u014b\u014c\u0005N\u0000\u0000\u014c\u014d\u00036\u001b"+
		"\u0000\u014d\u014e\u0005O\u0000\u0000\u014e\u0152\u00032\u0019\u0000\u014f"+
		"\u0151\u0003(\u0014\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151\u0154"+
		"\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0001\u0000\u0000\u0000\u0153\u0157\u0001\u0000\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0005H\u0000\u0000\u0156\u0158\u0003"+
		"2\u0019\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\'\u0001\u0000\u0000\u0000\u0159\u015a\u0005G\u0000"+
		"\u0000\u015a\u015b\u0005N\u0000\u0000\u015b\u015c\u00036\u001b\u0000\u015c"+
		"\u015d\u0005O\u0000\u0000\u015d\u015e\u00032\u0019\u0000\u015e)\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0005l\u0000\u0000\u0160\u0161\u0005_\u0000"+
		"\u0000\u0161\u0162\u00036\u001b\u0000\u0162\u0163\u0005e\u0000\u0000\u0163"+
		"+\u0001\u0000\u0000\u0000\u0164\u0165\u0005>\u0000\u0000\u0165\u0166\u0005"+
		"N\u0000\u0000\u0166\u0167\u00036\u001b\u0000\u0167\u0168\u0005O\u0000"+
		"\u0000\u0168\u0169\u0005e\u0000\u0000\u0169-\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u00058\u0000\u0000\u016b\u016c\u0005N\u0000\u0000\u016c\u016d\u0003"+
		"0\u0018\u0000\u016d\u016e\u00036\u001b\u0000\u016e\u016f\u0005e\u0000"+
		"\u0000\u016f\u0170\u00036\u001b\u0000\u0170\u0171\u0005O\u0000\u0000\u0171"+
		"\u0172\u00032\u0019\u0000\u0172/\u0001\u0000\u0000\u0000\u0173\u0176\u0003"+
		"*\u0015\u0000\u0174\u0176\u0003\f\u0006\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u01761\u0001\u0000\u0000"+
		"\u0000\u0177\u017b\u0005L\u0000\u0000\u0178\u017a\u0003\u001c\u000e\u0000"+
		"\u0179\u0178\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000"+
		"\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000"+
		"\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0005M\u0000\u0000\u017f3\u0001\u0000\u0000\u0000\u0180\u0187"+
		"\u00050\u0000\u0000\u0181\u0187\u0005/\u0000\u0000\u0182\u0187\u00051"+
		"\u0000\u0000\u0183\u0187\u00054\u0000\u0000\u0184\u0187\u00053\u0000\u0000"+
		"\u0185\u0187\u00055\u0000\u0000\u0186\u0180\u0001\u0000\u0000\u0000\u0186"+
		"\u0181\u0001\u0000\u0000\u0000\u0186\u0182\u0001\u0000\u0000\u0000\u0186"+
		"\u0183\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186"+
		"\u0185\u0001\u0000\u0000\u0000\u01875\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0006\u001b\uffff\uffff\u0000\u0189\u019b\u0005l\u0000\u0000\u018a\u019b"+
		"\u0005k\u0000\u0000\u018b\u019b\u0005m\u0000\u0000\u018c\u019b\u00038"+
		"\u001c\u0000\u018d\u019b\u0003:\u001d\u0000\u018e\u019b\u0003 \u0010\u0000"+
		"\u018f\u019b\u0003\u001e\u000f\u0000\u0190\u019b\u00059\u0000\u0000\u0191"+
		"\u019b\u0005:\u0000\u0000\u0192\u019b\u0003<\u001e\u0000\u0193\u0198\u0005"+
		".\u0000\u0000\u0194\u0195\u0005K\u0000\u0000\u0195\u0196\u00036\u001b"+
		"\u0000\u0196\u0197\u0005J\u0000\u0000\u0197\u0199\u0001\u0000\u0000\u0000"+
		"\u0198\u0194\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000"+
		"\u0199\u019b\u0001\u0000\u0000\u0000\u019a\u0188\u0001\u0000\u0000\u0000"+
		"\u019a\u018a\u0001\u0000\u0000\u0000\u019a\u018b\u0001\u0000\u0000\u0000"+
		"\u019a\u018c\u0001\u0000\u0000\u0000\u019a\u018d\u0001\u0000\u0000\u0000"+
		"\u019a\u018e\u0001\u0000\u0000\u0000\u019a\u018f\u0001\u0000\u0000\u0000"+
		"\u019a\u0190\u0001\u0000\u0000\u0000\u019a\u0191\u0001\u0000\u0000\u0000"+
		"\u019a\u0192\u0001\u0000\u0000\u0000\u019a\u0193\u0001\u0000\u0000\u0000"+
		"\u019b\u01a6\u0001\u0000\u0000\u0000\u019c\u019d\n\r\u0000\u0000\u019d"+
		"\u019e\u0003\"\u0011\u0000\u019e\u019f\u00036\u001b\u000e\u019f\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\n\f\u0000\u0000\u01a1\u01a2\u0003"+
		"@ \u0000\u01a2\u01a3\u00036\u001b\r\u01a3\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a4\u019c\u0001\u0000\u0000\u0000\u01a4\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a77\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005l\u0000\u0000\u01aa\u01ab"+
		"\u0005U\u0000\u0000\u01ab9\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005l"+
		"\u0000\u0000\u01ad\u01ae\u0005V\u0000\u0000\u01ae;\u0001\u0000\u0000\u0000"+
		"\u01af\u01b8\u0005L\u0000\u0000\u01b0\u01b5\u0003>\u001f\u0000\u01b1\u01b2"+
		"\u0005d\u0000\u0000\u01b2\u01b4\u0003>\u001f\u0000\u01b3\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0005M\u0000\u0000\u01bb=\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u00036\u001b\u0000\u01bd\u01be\u0005P\u0000\u0000\u01be\u01bf"+
		"\u00036\u001b\u0000\u01bf?\u0001\u0000\u0000\u0000\u01c0\u01c9\u0005["+
		"\u0000\u0000\u01c1\u01c9\u0005a\u0000\u0000\u01c2\u01c9\u0005`\u0000\u0000"+
		"\u01c3\u01c9\u0005c\u0000\u0000\u01c4\u01c9\u0005b\u0000\u0000\u01c5\u01c9"+
		"\u0005^\u0000\u0000\u01c6\u01c9\u0005X\u0000\u0000\u01c7\u01c9\u0005W"+
		"\u0000\u0000\u01c8\u01c0\u0001\u0000\u0000\u0000\u01c8\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c2\u0001\u0000\u0000\u0000\u01c8\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c4\u0001\u0000\u0000\u0000\u01c8\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c9A\u0001\u0000\u0000\u0000\u01ca\u01d5\u0003L&\u0000"+
		"\u01cb\u01d5\u0003R)\u0000\u01cc\u01d5\u0003X,\u0000\u01cd\u01d5\u0003"+
		"x<\u0000\u01ce\u01d5\u0003d2\u0000\u01cf\u01d5\u0003f3\u0000\u01d0\u01d5"+
		"\u0003\u0092I\u0000\u01d1\u01d5\u0003~?\u0000\u01d2\u01d5\u0003\u0084"+
		"B\u0000\u01d3\u01d5\u0003\u008aE\u0000\u01d4\u01ca\u0001\u0000\u0000\u0000"+
		"\u01d4\u01cb\u0001\u0000\u0000\u0000\u01d4\u01cc\u0001\u0000\u0000\u0000"+
		"\u01d4\u01cd\u0001\u0000\u0000\u0000\u01d4\u01ce\u0001\u0000\u0000\u0000"+
		"\u01d4\u01cf\u0001\u0000\u0000\u0000\u01d4\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5C\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d7\u0005\u0002\u0000\u0000\u01d7\u01d8\u0005f\u0000\u0000\u01d8\u01d9"+
		"\u0005\u0003\u0000\u0000\u01d9\u01da\u0005N\u0000\u0000\u01da\u01db\u0003"+
		"F#\u0000\u01db\u01dc\u0005O\u0000\u0000\u01dcE\u0001\u0000\u0000\u0000"+
		"\u01dd\u01e2\u0003H$\u0000\u01de\u01df\u0005d\u0000\u0000\u01df\u01e1"+
		"\u0003H$\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e7\u0005d\u0000\u0000\u01e6\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7G\u0001\u0000\u0000\u0000"+
		"\u01e8\u01ed\u00036\u001b\u0000\u01e9\u01ea\u0005-\u0000\u0000\u01ea\u01eb"+
		"\u0005P\u0000\u0000\u01eb\u01ed\u00036\u001b\u0000\u01ec\u01e8\u0001\u0000"+
		"\u0000\u0000\u01ec\u01e9\u0001\u0000\u0000\u0000\u01edI\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0005\u0002\u0000\u0000\u01ef\u01f0\u0005f\u0000\u0000"+
		"\u01f0\u01f1\u0005\u0004\u0000\u0000\u01f1\u01f2\u0005N\u0000\u0000\u01f2"+
		"\u01f3\u0005O\u0000\u0000\u01f3K\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005"+
		"\u0018\u0000\u0000\u01f5\u01f7\u0005N\u0000\u0000\u01f6\u01f8\u0003N\'"+
		"\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fb\u0005O\u0000\u0000"+
		"\u01fa\u01fc\u0005d\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fcM\u0001\u0000\u0000\u0000\u01fd\u0202"+
		"\u0003P(\u0000\u01fe\u01ff\u0005d\u0000\u0000\u01ff\u0201\u0003P(\u0000"+
		"\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0204\u0001\u0000\u0000\u0000"+
		"\u0202\u0200\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000"+
		"\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000"+
		"\u0205\u0207\u0005d\u0000\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0206"+
		"\u0207\u0001\u0000\u0000\u0000\u0207O\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0005\u0019\u0000\u0000\u0209\u020a\u0005P\u0000\u0000\u020a\u0211\u0003"+
		"B!\u0000\u020b\u020c\u0005 \u0000\u0000\u020c\u020d\u0005P\u0000\u0000"+
		"\u020d\u020e\u0005\u001b\u0000\u0000\u020e\u020f\u0005f\u0000\u0000\u020f"+
		"\u0211\u0005)\u0000\u0000\u0210\u0208\u0001\u0000\u0000\u0000\u0210\u020b"+
		"\u0001\u0000\u0000\u0000\u0211Q\u0001\u0000\u0000\u0000\u0212\u0213\u0005"+
		"\u0014\u0000\u0000\u0213\u0214\u0005N\u0000\u0000\u0214\u0215\u0003T*"+
		"\u0000\u0215\u0217\u0005O\u0000\u0000\u0216\u0218\u0005d\u0000\u0000\u0217"+
		"\u0216\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218"+
		"S\u0001\u0000\u0000\u0000\u0219\u021e\u00036\u001b\u0000\u021a\u021b\u0005"+
		"d\u0000\u0000\u021b\u021d\u0003V+\u0000\u021c\u021a\u0001\u0000\u0000"+
		"\u0000\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0222\u0001\u0000\u0000"+
		"\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0223\u0005d\u0000\u0000"+
		"\u0222\u0221\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000"+
		"\u0223U\u0001\u0000\u0000\u0000\u0224\u0225\u0005\u001d\u0000\u0000\u0225"+
		"\u0226\u0005P\u0000\u0000\u0226\u0230\u00036\u001b\u0000\u0227\u0228\u0005"+
		"\u001c\u0000\u0000\u0228\u0229\u0005P\u0000\u0000\u0229\u0230\u00036\u001b"+
		"\u0000\u022a\u022b\u0005\u001a\u0000\u0000\u022b\u022c\u0005P\u0000\u0000"+
		"\u022c\u022d\u0005\u001b\u0000\u0000\u022d\u022e\u0005f\u0000\u0000\u022e"+
		"\u0230\u0005)\u0000\u0000\u022f\u0224\u0001\u0000\u0000\u0000\u022f\u0227"+
		"\u0001\u0000\u0000\u0000\u022f\u022a\u0001\u0000\u0000\u0000\u0230W\u0001"+
		"\u0000\u0000\u0000\u0231\u0232\u0005\u0017\u0000\u0000\u0232\u0233\u0005"+
		"N\u0000\u0000\u0233\u0234\u0003Z-\u0000\u0234\u0236\u0005O\u0000\u0000"+
		"\u0235\u0237\u0005d\u0000\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0236"+
		"\u0237\u0001\u0000\u0000\u0000\u0237Y\u0001\u0000\u0000\u0000\u0238\u023b"+
		"\u00036\u001b\u0000\u0239\u023a\u0005d\u0000\u0000\u023a\u023c\u0003\\"+
		".\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000"+
		"\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023f\u0005d\u0000\u0000"+
		"\u023e\u023d\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000"+
		"\u023f[\u0001\u0000\u0000\u0000\u0240\u0241\u0005+\u0000\u0000\u0241\u0242"+
		"\u0005P\u0000\u0000\u0242\u0243\u0003^/\u0000\u0243]\u0001\u0000\u0000"+
		"\u0000\u0244\u0245\u0005,\u0000\u0000\u0245\u0247\u0005N\u0000\u0000\u0246"+
		"\u0248\u0003`0\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0247\u0248\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024a\u0005"+
		"O\u0000\u0000\u024a_\u0001\u0000\u0000\u0000\u024b\u0250\u0003b1\u0000"+
		"\u024c\u024d\u0005d\u0000\u0000\u024d\u024f\u0003b1\u0000\u024e\u024c"+
		"\u0001\u0000\u0000\u0000\u024f\u0252\u0001\u0000\u0000\u0000\u0250\u024e"+
		"\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0254"+
		"\u0001\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0253\u0255"+
		"\u0005d\u0000\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0254\u0255\u0001"+
		"\u0000\u0000\u0000\u0255a\u0001\u0000\u0000\u0000\u0256\u0257\u0005\u001a"+
		"\u0000\u0000\u0257\u0258\u0005P\u0000\u0000\u0258\u0259\u0005\u001b\u0000"+
		"\u0000\u0259\u025a\u0005f\u0000\u0000\u025a\u025f\u0005)\u0000\u0000\u025b"+
		"\u025c\u0005*\u0000\u0000\u025c\u025d\u0005P\u0000\u0000\u025d\u025f\u0003"+
		"6\u001b\u0000\u025e\u0256\u0001\u0000\u0000\u0000\u025e\u025b\u0001\u0000"+
		"\u0000\u0000\u025fc\u0001\u0000\u0000\u0000\u0260\u0261\u0005\u000f\u0000"+
		"\u0000\u0261\u0263\u0005N\u0000\u0000\u0262\u0264\u0003h4\u0000\u0263"+
		"\u0262\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264"+
		"\u0265\u0001\u0000\u0000\u0000\u0265\u0267\u0005O\u0000\u0000\u0266\u0268"+
		"\u0005d\u0000\u0000\u0267\u0266\u0001\u0000\u0000\u0000\u0267\u0268\u0001"+
		"\u0000\u0000\u0000\u0268e\u0001\u0000\u0000\u0000\u0269\u026a\u0005\u0011"+
		"\u0000\u0000\u026a\u026c\u0005N\u0000\u0000\u026b\u026d\u0003l6\u0000"+
		"\u026c\u026b\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000"+
		"\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u0270\u0005O\u0000\u0000\u026f"+
		"\u0271\u0005d\u0000\u0000\u0270\u026f\u0001\u0000\u0000\u0000\u0270\u0271"+
		"\u0001\u0000\u0000\u0000\u0271g\u0001\u0000\u0000\u0000\u0272\u0277\u0003"+
		"j5\u0000\u0273\u0274\u0005d\u0000\u0000\u0274\u0276\u0003j5\u0000\u0275"+
		"\u0273\u0001\u0000\u0000\u0000\u0276\u0279\u0001\u0000\u0000\u0000\u0277"+
		"\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278"+
		"\u027b\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u027a"+
		"\u027c\u0005d\u0000\u0000\u027b\u027a\u0001\u0000\u0000\u0000\u027b\u027c"+
		"\u0001\u0000\u0000\u0000\u027ci\u0001\u0000\u0000\u0000\u027d\u027e\u0005"+
		"!\u0000\u0000\u027e\u027f\u0005P\u0000\u0000\u027f\u0287\u0003p8\u0000"+
		"\u0280\u0281\u0005#\u0000\u0000\u0281\u0282\u0005P\u0000\u0000\u0282\u0287"+
		"\u0003r9\u0000\u0283\u0284\u0005\u0013\u0000\u0000\u0284\u0285\u0005P"+
		"\u0000\u0000\u0285\u0287\u0003v;\u0000\u0286\u027d\u0001\u0000\u0000\u0000"+
		"\u0286\u0280\u0001\u0000\u0000\u0000\u0286\u0283\u0001\u0000\u0000\u0000"+
		"\u0287k\u0001\u0000\u0000\u0000\u0288\u028d\u0003n7\u0000\u0289\u028a"+
		"\u0005d\u0000\u0000\u028a\u028c\u0003n7\u0000\u028b\u0289\u0001\u0000"+
		"\u0000\u0000\u028c\u028f\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000"+
		"\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u0291\u0001\u0000"+
		"\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u0290\u0292\u0005d\u0000"+
		"\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000"+
		"\u0000\u0292m\u0001\u0000\u0000\u0000\u0293\u0294\u0005!\u0000\u0000\u0294"+
		"\u0295\u0005P\u0000\u0000\u0295\u029d\u0003p8\u0000\u0296\u0297\u0005"+
		"#\u0000\u0000\u0297\u0298\u0005P\u0000\u0000\u0298\u029d\u0003r9\u0000"+
		"\u0299\u029a\u0005\u0013\u0000\u0000\u029a\u029b\u0005P\u0000\u0000\u029b"+
		"\u029d\u0003v;\u0000\u029c\u0293\u0001\u0000\u0000\u0000\u029c\u0296\u0001"+
		"\u0000\u0000\u0000\u029c\u0299\u0001\u0000\u0000\u0000\u029do\u0001\u0000"+
		"\u0000\u0000\u029e\u029f\u0005\"\u0000\u0000\u029f\u02a0\u0005f\u0000"+
		"\u0000\u02a0\u02a1\u0005\'\u0000\u0000\u02a1q\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a3\u0005$\u0000\u0000\u02a3\u02a4\u0005o\u0000\u0000\u02a4\u02a5"+
		"\u0005p\u0000\u0000\u02a5s\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005&"+
		"\u0000\u0000\u02a7\u02a8\u0005f\u0000\u0000\u02a8\u02a9\u0005(\u0000\u0000"+
		"\u02a9u\u0001\u0000\u0000\u0000\u02aa\u02b3\u0005K\u0000\u0000\u02ab\u02b0"+
		"\u0003B!\u0000\u02ac\u02ad\u0005d\u0000\u0000\u02ad\u02af\u0003B!\u0000"+
		"\u02ae\u02ac\u0001\u0000\u0000\u0000\u02af\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b4\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b3\u02ab\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b6\u0001\u0000\u0000\u0000\u02b5\u02b7\u0005d\u0000\u0000\u02b6"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b8\u02ba\u0005J\u0000\u0000\u02b9\u02bb"+
		"\u0005d\u0000\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001"+
		"\u0000\u0000\u0000\u02bbw\u0001\u0000\u0000\u0000\u02bc\u02bd\u0005\u0012"+
		"\u0000\u0000\u02bd\u02bf\u0005N\u0000\u0000\u02be\u02c0\u0003z=\u0000"+
		"\u02bf\u02be\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c3\u0005O\u0000\u0000\u02c2"+
		"\u02c4\u0005d\u0000\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c3\u02c4"+
		"\u0001\u0000\u0000\u0000\u02c4y\u0001\u0000\u0000\u0000\u02c5\u02ca\u0003"+
		"|>\u0000\u02c6\u02c7\u0005d\u0000\u0000\u02c7\u02c9\u0003|>\u0000\u02c8"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca"+
		"\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb"+
		"\u02ce\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd"+
		"\u02cf\u0005d\u0000\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02ce\u02cf"+
		"\u0001\u0000\u0000\u0000\u02cf{\u0001\u0000\u0000\u0000\u02d0\u02d1\u0005"+
		"\u001a\u0000\u0000\u02d1\u02d2\u0005P\u0000\u0000\u02d2\u02d3\u0005\u001b"+
		"\u0000\u0000\u02d3\u02d4\u0005f\u0000\u0000\u02d4\u02df\u0005)\u0000\u0000"+
		"\u02d5\u02d6\u0005\u001d\u0000\u0000\u02d6\u02d7\u0005P\u0000\u0000\u02d7"+
		"\u02df\u00036\u001b\u0000\u02d8\u02d9\u0005\u001c\u0000\u0000\u02d9\u02da"+
		"\u0005P\u0000\u0000\u02da\u02df\u00036\u001b\u0000\u02db\u02dc\u0005\u0016"+
		"\u0000\u0000\u02dc\u02dd\u0005P\u0000\u0000\u02dd\u02df\u0003B!\u0000"+
		"\u02de\u02d0\u0001\u0000\u0000\u0000\u02de\u02d5\u0001\u0000\u0000\u0000"+
		"\u02de\u02d8\u0001\u0000\u0000\u0000\u02de\u02db\u0001\u0000\u0000\u0000"+
		"\u02df}\u0001\u0000\u0000\u0000\u02e0\u02e1\u0005\u0010\u0000\u0000\u02e1"+
		"\u02e2\u0005N\u0000\u0000\u02e2\u02e3\u0003\u0080@\u0000\u02e3\u02e4\u0005"+
		"O\u0000\u0000\u02e4\u007f\u0001\u0000\u0000\u0000\u02e5\u02ea\u0003\u0082"+
		"A\u0000\u02e6\u02e7\u0005d\u0000\u0000\u02e7\u02e9\u0003\u0082A\u0000"+
		"\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e9\u02ec\u0001\u0000\u0000\u0000"+
		"\u02ea\u02e8\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000"+
		"\u02eb\u02ee\u0001\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000"+
		"\u02ed\u02ef\u0005d\u0000\u0000\u02ee\u02ed\u0001\u0000\u0000\u0000\u02ee"+
		"\u02ef\u0001\u0000\u0000\u0000\u02ef\u0081\u0001\u0000\u0000\u0000\u02f0"+
		"\u02f1\u0005\u001e\u0000\u0000\u02f1\u02f2\u0005P\u0000\u0000\u02f2\u02fc"+
		"\u0003\u0090H\u0000\u02f3\u02f4\u0005\u001a\u0000\u0000\u02f4\u02f5\u0005"+
		"P\u0000\u0000\u02f5\u02f6\u0005\u001b\u0000\u0000\u02f6\u02f7\u0005f\u0000"+
		"\u0000\u02f7\u02fc\u0005)\u0000\u0000\u02f8\u02f9\u0005\u0016\u0000\u0000"+
		"\u02f9\u02fa\u0005P\u0000\u0000\u02fa\u02fc\u0003B!\u0000\u02fb\u02f0"+
		"\u0001\u0000\u0000\u0000\u02fb\u02f3\u0001\u0000\u0000\u0000\u02fb\u02f8"+
		"\u0001\u0000\u0000\u0000\u02fc\u0083\u0001\u0000\u0000\u0000\u02fd\u02fe"+
		"\u0005B\u0000\u0000\u02fe\u0300\u0005N\u0000\u0000\u02ff\u0301\u0003\u0086"+
		"C\u0000\u0300\u02ff\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000"+
		"\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0303\u0005O\u0000\u0000"+
		"\u0303\u0085\u0001\u0000\u0000\u0000\u0304\u0309\u0003\u0088D\u0000\u0305"+
		"\u0306\u0005d\u0000\u0000\u0306\u0308\u0003\u0088D\u0000\u0307\u0305\u0001"+
		"\u0000\u0000\u0000\u0308\u030b\u0001\u0000\u0000\u0000\u0309\u0307\u0001"+
		"\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u030d\u0001"+
		"\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030c\u030e\u0005"+
		"d\u0000\u0000\u030d\u030c\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000"+
		"\u0000\u0000\u030e\u0087\u0001\u0000\u0000\u0000\u030f\u0310\u0005D\u0000"+
		"\u0000\u0310\u0311\u0005P\u0000\u0000\u0311\u0316\u00036\u001b\u0000\u0312"+
		"\u0313\u0005C\u0000\u0000\u0313\u0314\u0005P\u0000\u0000\u0314\u0316\u0003"+
		"6\u001b\u0000\u0315\u030f\u0001\u0000\u0000\u0000\u0315\u0312\u0001\u0000"+
		"\u0000\u0000\u0316\u0089\u0001\u0000\u0000\u0000\u0317\u0318\u0005E\u0000"+
		"\u0000\u0318\u031a\u0005N\u0000\u0000\u0319\u031b\u0003\u008cF\u0000\u031a"+
		"\u0319\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b"+
		"\u031c\u0001\u0000\u0000\u0000\u031c\u031d\u0005O\u0000\u0000\u031d\u008b"+
		"\u0001\u0000\u0000\u0000\u031e\u0323\u0003\u008eG\u0000\u031f\u0320\u0005"+
		"d\u0000\u0000\u0320\u0322\u0003\u008eG\u0000\u0321\u031f\u0001\u0000\u0000"+
		"\u0000\u0322\u0325\u0001\u0000\u0000\u0000\u0323\u0321\u0001\u0000\u0000"+
		"\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0327\u0001\u0000\u0000"+
		"\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0326\u0328\u0005d\u0000\u0000"+
		"\u0327\u0326\u0001\u0000\u0000\u0000\u0327\u0328\u0001\u0000\u0000\u0000"+
		"\u0328\u008d\u0001\u0000\u0000\u0000\u0329\u032a\u0005\u0016\u0000\u0000"+
		"\u032a\u032b\u0005P\u0000\u0000\u032b\u032c\u0003B!\u0000\u032c\u008f"+
		"\u0001\u0000\u0000\u0000\u032d\u032e\u0005l\u0000\u0000\u032e\u032f\u0005"+
		"N\u0000\u0000\u032f\u0334\u0005O\u0000\u0000\u0330\u0331\u0005N\u0000"+
		"\u0000\u0331\u0332\u0005O\u0000\u0000\u0332\u0334\u00032\u0019\u0000\u0333"+
		"\u032d\u0001\u0000\u0000\u0000\u0333\u0330\u0001\u0000\u0000\u0000\u0334"+
		"\u0091\u0001\u0000\u0000\u0000\u0335\u0336\u0005\u001f\u0000\u0000\u0336"+
		"\u0337\u0005N\u0000\u0000\u0337\u0338\u0003\u0094J\u0000\u0338\u0339\u0005"+
		"O\u0000\u0000\u0339\u0093\u0001\u0000\u0000\u0000\u033a\u033b\u0005\u0016"+
		"\u0000\u0000\u033b\u033c\u0005P\u0000\u0000\u033c\u033d\u0003B!\u0000"+
		"\u033d\u0095\u0001\u0000\u0000\u0000\u033e\u033f\u0005\u0001\u0000\u0000"+
		"\u033f\u0340\u0005N\u0000\u0000\u0340\u0341\u0005N\u0000\u0000\u0341\u0342"+
		"\u0005O\u0000\u0000\u0342\u0343\u00032\u0019\u0000\u0343\u0344\u0005O"+
		"\u0000\u0000\u0344\u0345\u0005e\u0000\u0000\u0345\u0097\u0001\u0000\u0000"+
		"\u0000N\u009b\u00a1\u00ad\u00b0\u00b8\u00bf\u00cd\u00d3\u00dd\u00e7\u00f1"+
		"\u0106\u010b\u0118\u0126\u0137\u0152\u0157\u0175\u017b\u0186\u0198\u019a"+
		"\u01a4\u01a6\u01b5\u01b8\u01c8\u01d4\u01e2\u01e6\u01ec\u01f7\u01fb\u0202"+
		"\u0206\u0210\u0217\u021e\u0222\u022f\u0236\u023b\u023e\u0247\u0250\u0254"+
		"\u025e\u0263\u0267\u026c\u0270\u0277\u027b\u0286\u028d\u0291\u029c\u02b0"+
		"\u02b3\u02b6\u02ba\u02bf\u02c3\u02ca\u02ce\u02de\u02ea\u02ee\u02fb\u0300"+
		"\u0309\u030d\u0315\u031a\u0323\u0327\u0333";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}