// Generated from C:/Users/sayas/AI Project/compiler2/src/Grammar\FlutterParser.g4 by ANTLR 4.12.0
package Grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlutterParser}.
 */
public interface FlutterParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlutterParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FlutterParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FlutterParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#importRules}.
	 * @param ctx the parse tree
	 */
	void enterImportRules(FlutterParser.ImportRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#importRules}.
	 * @param ctx the parse tree
	 */
	void exitImportRules(FlutterParser.ImportRulesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationTopLevel(FlutterParser.VariableDeclarationTopLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationTopLevel(FlutterParser.VariableDeclarationTopLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationTopLevel(FlutterParser.ClassDeclarationTopLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationTopLevel(FlutterParser.ClassDeclarationTopLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationTopLevel(FlutterParser.FunctionDeclarationTopLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationTopLevel(FlutterParser.FunctionDeclarationTopLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WidgetDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterWidgetDeclarationTopLevel(FlutterParser.WidgetDeclarationTopLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WidgetDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitWidgetDeclarationTopLevel(FlutterParser.WidgetDeclarationTopLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateLessDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterStateLessDeclarationTopLevel(FlutterParser.StateLessDeclarationTopLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateLessDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitStateLessDeclarationTopLevel(FlutterParser.StateLessDeclarationTopLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void enterClass_decl(FlutterParser.Class_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void exitClass_decl(FlutterParser.Class_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationClass}
	 * labeled alternative in {@link FlutterParser#class_member}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationClass(FlutterParser.VariableDeclarationClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationClass}
	 * labeled alternative in {@link FlutterParser#class_member}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationClass(FlutterParser.VariableDeclarationClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclarationClass}
	 * labeled alternative in {@link FlutterParser#class_member}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationClass(FlutterParser.FunctionDeclarationClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclarationClass}
	 * labeled alternative in {@link FlutterParser#class_member}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationClass(FlutterParser.FunctionDeclarationClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#statelessWidget}.
	 * @param ctx the parse tree
	 */
	void enterStatelessWidget(FlutterParser.StatelessWidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#statelessWidget}.
	 * @param ctx the parse tree
	 */
	void exitStatelessWidget(FlutterParser.StatelessWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationType}
	 * labeled alternative in {@link FlutterParser#variables_decl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationType(FlutterParser.VariableDeclarationTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationType}
	 * labeled alternative in {@link FlutterParser#variables_decl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationType(FlutterParser.VariableDeclarationTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VaraibleListDeclaration}
	 * labeled alternative in {@link FlutterParser#variables_decl}.
	 * @param ctx the parse tree
	 */
	void enterVaraibleListDeclaration(FlutterParser.VaraibleListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VaraibleListDeclaration}
	 * labeled alternative in {@link FlutterParser#variables_decl}.
	 * @param ctx the parse tree
	 */
	void exitVaraibleListDeclaration(FlutterParser.VaraibleListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableMapDeclaration}
	 * labeled alternative in {@link FlutterParser#variables_decl}.
	 * @param ctx the parse tree
	 */
	void enterVariableMapDeclaration(FlutterParser.VariableMapDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableMapDeclaration}
	 * labeled alternative in {@link FlutterParser#variables_decl}.
	 * @param ctx the parse tree
	 */
	void exitVariableMapDeclaration(FlutterParser.VariableMapDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FlutterParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FlutterParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#list_exp}.
	 * @param ctx the parse tree
	 */
	void enterList_exp(FlutterParser.List_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#list_exp}.
	 * @param ctx the parse tree
	 */
	void exitList_exp(FlutterParser.List_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(FlutterParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(FlutterParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#buildMethod}.
	 * @param ctx the parse tree
	 */
	void enterBuildMethod(FlutterParser.BuildMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#buildMethod}.
	 * @param ctx the parse tree
	 */
	void exitBuildMethod(FlutterParser.BuildMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#widgetElement}.
	 * @param ctx the parse tree
	 */
	void enterWidgetElement(FlutterParser.WidgetElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#widgetElement}.
	 * @param ctx the parse tree
	 */
	void exitWidgetElement(FlutterParser.WidgetElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FlutterParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FlutterParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(FlutterParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(FlutterParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(FlutterParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(FlutterParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterPrintCodeAttributes(FlutterParser.PrintCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitPrintCodeAttributes(FlutterParser.PrintCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterIfCodeAttributes(FlutterParser.IfCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitIfCodeAttributes(FlutterParser.IfCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterForCodeAttributes(FlutterParser.ForCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitForCodeAttributes(FlutterParser.ForCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatements}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatements(FlutterParser.WhileStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatements}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatements(FlutterParser.WhileStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentCodeAttributes(FlutterParser.AssignmentCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentCodeAttributes(FlutterParser.AssignmentCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterCallCodeAttributes(FlutterParser.CallCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitCallCodeAttributes(FlutterParser.CallCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterBreakCodeAttributes(FlutterParser.BreakCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitBreakCodeAttributes(FlutterParser.BreakCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterReturnCodeAttributes(FlutterParser.ReturnCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitReturnCodeAttributes(FlutterParser.ReturnCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetToPageCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterGetToPageCodeAttributes(FlutterParser.GetToPageCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetToPageCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitGetToPageCodeAttributes(FlutterParser.GetToPageCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetBackCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterGetBackCodeAttributes(FlutterParser.GetBackCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetBackCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitGetBackCodeAttributes(FlutterParser.GetBackCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationIncCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterOperationIncCodeAttributes(FlutterParser.OperationIncCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationIncCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitOperationIncCodeAttributes(FlutterParser.OperationIncCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationDecCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterOperationDecCodeAttributes(FlutterParser.OperationDecCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationDecCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitOperationDecCodeAttributes(FlutterParser.OperationDecCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FastMathCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterFastMathCodeAttributes(FlutterParser.FastMathCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FastMathCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitFastMathCodeAttributes(FlutterParser.FastMathCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetStateCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterSetStateCodeAttributes(FlutterParser.SetStateCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetStateCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitSetStateCodeAttributes(FlutterParser.SetStateCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(FlutterParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(FlutterParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#fast_math}.
	 * @param ctx the parse tree
	 */
	void enterFast_math(FlutterParser.Fast_mathContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#fast_math}.
	 * @param ctx the parse tree
	 */
	void exitFast_math(FlutterParser.Fast_mathContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#operation_arithmatic}.
	 * @param ctx the parse tree
	 */
	void enterOperation_arithmatic(FlutterParser.Operation_arithmaticContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#operation_arithmatic}.
	 * @param ctx the parse tree
	 */
	void exitOperation_arithmatic(FlutterParser.Operation_arithmaticContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#while_statment}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statment(FlutterParser.While_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#while_statment}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statment(FlutterParser.While_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#if_statment}.
	 * @param ctx the parse tree
	 */
	void enterIf_statment(FlutterParser.If_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#if_statment}.
	 * @param ctx the parse tree
	 */
	void exitIf_statment(FlutterParser.If_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#else_if_statements}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_statements(FlutterParser.Else_if_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#else_if_statements}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_statements(FlutterParser.Else_if_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FlutterParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FlutterParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#print_statements}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statements(FlutterParser.Print_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#print_statements}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statements(FlutterParser.Print_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(FlutterParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(FlutterParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentForFirst}
	 * labeled alternative in {@link FlutterParser#for_first_part}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentForFirst(FlutterParser.AssignmentForFirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentForFirst}
	 * labeled alternative in {@link FlutterParser#for_first_part}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentForFirst(FlutterParser.AssignmentForFirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableForFirst}
	 * labeled alternative in {@link FlutterParser#for_first_part}.
	 * @param ctx the parse tree
	 */
	void enterVariableForFirst(FlutterParser.VariableForFirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableForFirst}
	 * labeled alternative in {@link FlutterParser#for_first_part}.
	 * @param ctx the parse tree
	 */
	void exitVariableForFirst(FlutterParser.VariableForFirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FlutterParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FlutterParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(FlutterParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(FlutterParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVarType(FlutterParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVarType(FlutterParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStringType(FlutterParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStringType(FlutterParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(FlutterParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(FlutterParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(FlutterParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(FlutterParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 */
	void enterMapType(FlutterParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 */
	void exitMapType(FlutterParser.MapTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExp}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExp(FlutterParser.BoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExp}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExp(FlutterParser.BoolExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMapExp(FlutterParser.MapExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMapExp(FlutterParser.MapExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationIncrease}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOperationIncrease(FlutterParser.OperationIncreaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationIncrease}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOperationIncrease(FlutterParser.OperationIncreaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FlutterParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FlutterParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(FlutterParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(FlutterParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExp}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExp(FlutterParser.StringExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExp}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExp(FlutterParser.StringExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationExpression}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOperationExpression(FlutterParser.OperationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationExpression}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOperationExpression(FlutterParser.OperationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FastMath}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFastMath(FlutterParser.FastMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FastMath}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFastMath(FlutterParser.FastMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationDecrease}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOperationDecrease(FlutterParser.OperationDecreaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationDecrease}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOperationDecrease(FlutterParser.OperationDecreaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(FlutterParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(FlutterParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolOperationExpression}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolOperationExpression(FlutterParser.BoolOperationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolOperationExpression}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolOperationExpression(FlutterParser.BoolOperationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetArgumentsExp}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGetArgumentsExp(FlutterParser.GetArgumentsExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetArgumentsExp}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGetArgumentsExp(FlutterParser.GetArgumentsExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#increase_math}.
	 * @param ctx the parse tree
	 */
	void enterIncrease_math(FlutterParser.Increase_mathContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#increase_math}.
	 * @param ctx the parse tree
	 */
	void exitIncrease_math(FlutterParser.Increase_mathContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#decrease_math}.
	 * @param ctx the parse tree
	 */
	void enterDecrease_math(FlutterParser.Decrease_mathContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#decrease_math}.
	 * @param ctx the parse tree
	 */
	void exitDecrease_math(FlutterParser.Decrease_mathContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#map_expr}.
	 * @param ctx the parse tree
	 */
	void enterMap_expr(FlutterParser.Map_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#map_expr}.
	 * @param ctx the parse tree
	 */
	void exitMap_expr(FlutterParser.Map_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#map_object}.
	 * @param ctx the parse tree
	 */
	void enterMap_object(FlutterParser.Map_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#map_object}.
	 * @param ctx the parse tree
	 */
	void exitMap_object(FlutterParser.Map_objectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagEqualEqual}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void enterTagEqualEqual(FlutterParser.TagEqualEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagEqualEqual}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void exitTagEqualEqual(FlutterParser.TagEqualEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagClose}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void enterTagClose(FlutterParser.TagCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagClose}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void exitTagClose(FlutterParser.TagCloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagOpen}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void enterTagOpen(FlutterParser.TagOpenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagOpen}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void exitTagOpen(FlutterParser.TagOpenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagCloseEqual}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void enterTagCloseEqual(FlutterParser.TagCloseEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagCloseEqual}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void exitTagCloseEqual(FlutterParser.TagCloseEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagOpenEqual}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void enterTagOpenEqual(FlutterParser.TagOpenEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagOpenEqual}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void exitTagOpenEqual(FlutterParser.TagOpenEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(FlutterParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(FlutterParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void enterAnd(FlutterParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void exitAnd(FlutterParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void enterOr(FlutterParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 */
	void exitOr(FlutterParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScaffoldWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterScaffoldWidget(FlutterParser.ScaffoldWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScaffoldWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitScaffoldWidget(FlutterParser.ScaffoldWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterImageWidget(FlutterParser.ImageWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitImageWidget(FlutterParser.ImageWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterTextWidget(FlutterParser.TextWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitTextWidget(FlutterParser.TextWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainerWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterContainerWidget(FlutterParser.ContainerWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainerWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitContainerWidget(FlutterParser.ContainerWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterColumnWidget(FlutterParser.ColumnWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitColumnWidget(FlutterParser.ColumnWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RowWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterRowWidget(FlutterParser.RowWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RowWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitRowWidget(FlutterParser.RowWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CenterWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterCenterWidget(FlutterParser.CenterWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CenterWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitCenterWidget(FlutterParser.CenterWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElevatedButtonWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterElevatedButtonWidget(FlutterParser.ElevatedButtonWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElevatedButtonWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitElevatedButtonWidget(FlutterParser.ElevatedButtonWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextFieldWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldWidget(FlutterParser.TextFieldWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextFieldWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldWidget(FlutterParser.TextFieldWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FormWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterFormWidget(FlutterParser.FormWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FormWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitFormWidget(FlutterParser.FormWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#get_to}.
	 * @param ctx the parse tree
	 */
	void enterGet_to(FlutterParser.Get_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#get_to}.
	 * @param ctx the parse tree
	 */
	void exitGet_to(FlutterParser.Get_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#get_to_args}.
	 * @param ctx the parse tree
	 */
	void enterGet_to_args(FlutterParser.Get_to_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#get_to_args}.
	 * @param ctx the parse tree
	 */
	void exitGet_to_args(FlutterParser.Get_to_argsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetToArgExpr}
	 * labeled alternative in {@link FlutterParser#get_to_arg}.
	 * @param ctx the parse tree
	 */
	void enterGetToArgExpr(FlutterParser.GetToArgExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetToArgExpr}
	 * labeled alternative in {@link FlutterParser#get_to_arg}.
	 * @param ctx the parse tree
	 */
	void exitGetToArgExpr(FlutterParser.GetToArgExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetToArgWidget}
	 * labeled alternative in {@link FlutterParser#get_to_arg}.
	 * @param ctx the parse tree
	 */
	void enterGetToArgWidget(FlutterParser.GetToArgWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetToArgWidget}
	 * labeled alternative in {@link FlutterParser#get_to_arg}.
	 * @param ctx the parse tree
	 */
	void exitGetToArgWidget(FlutterParser.GetToArgWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#get_back}.
	 * @param ctx the parse tree
	 */
	void enterGet_back(FlutterParser.Get_backContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#get_back}.
	 * @param ctx the parse tree
	 */
	void exitGet_back(FlutterParser.Get_backContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(FlutterParser.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(FlutterParser.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#scaffoldArgs}.
	 * @param ctx the parse tree
	 */
	void enterScaffoldArgs(FlutterParser.ScaffoldArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#scaffoldArgs}.
	 * @param ctx the parse tree
	 */
	void exitScaffoldArgs(FlutterParser.ScaffoldArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BodyScaffoldProperty}
	 * labeled alternative in {@link FlutterParser#scaffoldProperty}.
	 * @param ctx the parse tree
	 */
	void enterBodyScaffoldProperty(FlutterParser.BodyScaffoldPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BodyScaffoldProperty}
	 * labeled alternative in {@link FlutterParser#scaffoldProperty}.
	 * @param ctx the parse tree
	 */
	void exitBodyScaffoldProperty(FlutterParser.BodyScaffoldPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BackgroundScaffoldProperty}
	 * labeled alternative in {@link FlutterParser#scaffoldProperty}.
	 * @param ctx the parse tree
	 */
	void enterBackgroundScaffoldProperty(FlutterParser.BackgroundScaffoldPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BackgroundScaffoldProperty}
	 * labeled alternative in {@link FlutterParser#scaffoldProperty}.
	 * @param ctx the parse tree
	 */
	void exitBackgroundScaffoldProperty(FlutterParser.BackgroundScaffoldPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(FlutterParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(FlutterParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void enterImageProperties(FlutterParser.ImagePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void exitImageProperties(FlutterParser.ImagePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageWidthHeight}
	 * labeled alternative in {@link FlutterParser#imageProperty}.
	 * @param ctx the parse tree
	 */
	void enterImageWidthHeight(FlutterParser.ImageWidthHeightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageWidthHeight}
	 * labeled alternative in {@link FlutterParser#imageProperty}.
	 * @param ctx the parse tree
	 */
	void exitImageWidthHeight(FlutterParser.ImageWidthHeightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageColor}
	 * labeled alternative in {@link FlutterParser#imageProperty}.
	 * @param ctx the parse tree
	 */
	void enterImageColor(FlutterParser.ImageColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageColor}
	 * labeled alternative in {@link FlutterParser#imageProperty}.
	 * @param ctx the parse tree
	 */
	void exitImageColor(FlutterParser.ImageColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(FlutterParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(FlutterParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#textProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextProperties(FlutterParser.TextPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#textProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextProperties(FlutterParser.TextPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#textProperty}.
	 * @param ctx the parse tree
	 */
	void enterTextProperty(FlutterParser.TextPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#textProperty}.
	 * @param ctx the parse tree
	 */
	void exitTextProperty(FlutterParser.TextPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(FlutterParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(FlutterParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#textStyleProprties}.
	 * @param ctx the parse tree
	 */
	void enterTextStyleProprties(FlutterParser.TextStyleProprtiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#textStyleProprties}.
	 * @param ctx the parse tree
	 */
	void exitTextStyleProprties(FlutterParser.TextStyleProprtiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorKeyValue}
	 * labeled alternative in {@link FlutterParser#textStyleProprty}.
	 * @param ctx the parse tree
	 */
	void enterColorKeyValue(FlutterParser.ColorKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorKeyValue}
	 * labeled alternative in {@link FlutterParser#textStyleProprty}.
	 * @param ctx the parse tree
	 */
	void exitColorKeyValue(FlutterParser.ColorKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FontSizeKeyValue}
	 * labeled alternative in {@link FlutterParser#textStyleProprty}.
	 * @param ctx the parse tree
	 */
	void enterFontSizeKeyValue(FlutterParser.FontSizeKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FontSizeKeyValue}
	 * labeled alternative in {@link FlutterParser#textStyleProprty}.
	 * @param ctx the parse tree
	 */
	void exitFontSizeKeyValue(FlutterParser.FontSizeKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(FlutterParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(FlutterParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(FlutterParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(FlutterParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#columnArgs}.
	 * @param ctx the parse tree
	 */
	void enterColumnArgs(FlutterParser.ColumnArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#columnArgs}.
	 * @param ctx the parse tree
	 */
	void exitColumnArgs(FlutterParser.ColumnArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnKeyValue}
	 * labeled alternative in {@link FlutterParser#columnArg}.
	 * @param ctx the parse tree
	 */
	void enterColumnKeyValue(FlutterParser.ColumnKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnKeyValue}
	 * labeled alternative in {@link FlutterParser#columnArg}.
	 * @param ctx the parse tree
	 */
	void exitColumnKeyValue(FlutterParser.ColumnKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnWidgetList}
	 * labeled alternative in {@link FlutterParser#columnArg}.
	 * @param ctx the parse tree
	 */
	void enterColumnWidgetList(FlutterParser.ColumnWidgetListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnWidgetList}
	 * labeled alternative in {@link FlutterParser#columnArg}.
	 * @param ctx the parse tree
	 */
	void exitColumnWidgetList(FlutterParser.ColumnWidgetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#rowArgs}.
	 * @param ctx the parse tree
	 */
	void enterRowArgs(FlutterParser.RowArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#rowArgs}.
	 * @param ctx the parse tree
	 */
	void exitRowArgs(FlutterParser.RowArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RowKeyValue}
	 * labeled alternative in {@link FlutterParser#rowArg}.
	 * @param ctx the parse tree
	 */
	void enterRowKeyValue(FlutterParser.RowKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RowKeyValue}
	 * labeled alternative in {@link FlutterParser#rowArg}.
	 * @param ctx the parse tree
	 */
	void exitRowKeyValue(FlutterParser.RowKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RowWidgetList}
	 * labeled alternative in {@link FlutterParser#rowArg}.
	 * @param ctx the parse tree
	 */
	void enterRowWidgetList(FlutterParser.RowWidgetListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RowWidgetList}
	 * labeled alternative in {@link FlutterParser#rowArg}.
	 * @param ctx the parse tree
	 */
	void exitRowWidgetList(FlutterParser.RowWidgetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void enterMainAxisAlignment(FlutterParser.MainAxisAlignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void exitMainAxisAlignment(FlutterParser.MainAxisAlignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#crossAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void enterCrossAxisAlignment(FlutterParser.CrossAxisAlignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#crossAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void exitCrossAxisAlignment(FlutterParser.CrossAxisAlignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#mainAxisSize}.
	 * @param ctx the parse tree
	 */
	void enterMainAxisSize(FlutterParser.MainAxisSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#mainAxisSize}.
	 * @param ctx the parse tree
	 */
	void exitMainAxisSize(FlutterParser.MainAxisSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#widgetList}.
	 * @param ctx the parse tree
	 */
	void enterWidgetList(FlutterParser.WidgetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#widgetList}.
	 * @param ctx the parse tree
	 */
	void exitWidgetList(FlutterParser.WidgetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(FlutterParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(FlutterParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void enterContainerProperties(FlutterParser.ContainerPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void exitContainerProperties(FlutterParser.ContainerPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainerKeyValue}
	 * labeled alternative in {@link FlutterParser#containerProperty}.
	 * @param ctx the parse tree
	 */
	void enterContainerKeyValue(FlutterParser.ContainerKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainerKeyValue}
	 * labeled alternative in {@link FlutterParser#containerProperty}.
	 * @param ctx the parse tree
	 */
	void exitContainerKeyValue(FlutterParser.ContainerKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainerWidthHeight}
	 * labeled alternative in {@link FlutterParser#containerProperty}.
	 * @param ctx the parse tree
	 */
	void enterContainerWidthHeight(FlutterParser.ContainerWidthHeightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainerWidthHeight}
	 * labeled alternative in {@link FlutterParser#containerProperty}.
	 * @param ctx the parse tree
	 */
	void exitContainerWidthHeight(FlutterParser.ContainerWidthHeightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainerKeyWidgetValue}
	 * labeled alternative in {@link FlutterParser#containerProperty}.
	 * @param ctx the parse tree
	 */
	void enterContainerKeyWidgetValue(FlutterParser.ContainerKeyWidgetValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainerKeyWidgetValue}
	 * labeled alternative in {@link FlutterParser#containerProperty}.
	 * @param ctx the parse tree
	 */
	void exitContainerKeyWidgetValue(FlutterParser.ContainerKeyWidgetValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#e_button}.
	 * @param ctx the parse tree
	 */
	void enterE_button(FlutterParser.E_buttonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#e_button}.
	 * @param ctx the parse tree
	 */
	void exitE_button(FlutterParser.E_buttonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#e_buttonProperties}.
	 * @param ctx the parse tree
	 */
	void enterE_buttonProperties(FlutterParser.E_buttonPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#e_buttonProperties}.
	 * @param ctx the parse tree
	 */
	void exitE_buttonProperties(FlutterParser.E_buttonPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EbuttonVoid}
	 * labeled alternative in {@link FlutterParser#e_ButtonProperty}.
	 * @param ctx the parse tree
	 */
	void enterEbuttonVoid(FlutterParser.EbuttonVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EbuttonVoid}
	 * labeled alternative in {@link FlutterParser#e_ButtonProperty}.
	 * @param ctx the parse tree
	 */
	void exitEbuttonVoid(FlutterParser.EbuttonVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EbuttonColor}
	 * labeled alternative in {@link FlutterParser#e_ButtonProperty}.
	 * @param ctx the parse tree
	 */
	void enterEbuttonColor(FlutterParser.EbuttonColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EbuttonColor}
	 * labeled alternative in {@link FlutterParser#e_ButtonProperty}.
	 * @param ctx the parse tree
	 */
	void exitEbuttonColor(FlutterParser.EbuttonColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#textField}.
	 * @param ctx the parse tree
	 */
	void enterTextField(FlutterParser.TextFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#textField}.
	 * @param ctx the parse tree
	 */
	void exitTextField(FlutterParser.TextFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#textFieldArgs}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldArgs(FlutterParser.TextFieldArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#textFieldArgs}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldArgs(FlutterParser.TextFieldArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#textFieldWidgetArg}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldWidgetArg(FlutterParser.TextFieldWidgetArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#textFieldWidgetArg}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldWidgetArg(FlutterParser.TextFieldWidgetArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(FlutterParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(FlutterParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#formArgs}.
	 * @param ctx the parse tree
	 */
	void enterFormArgs(FlutterParser.FormArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#formArgs}.
	 * @param ctx the parse tree
	 */
	void exitFormArgs(FlutterParser.FormArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#formArg}.
	 * @param ctx the parse tree
	 */
	void enterFormArg(FlutterParser.FormArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#formArg}.
	 * @param ctx the parse tree
	 */
	void exitFormArg(FlutterParser.FormArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallFunction}
	 * labeled alternative in {@link FlutterParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(FlutterParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFunction}
	 * labeled alternative in {@link FlutterParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(FlutterParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionBlock}
	 * labeled alternative in {@link FlutterParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(FlutterParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionBlock}
	 * labeled alternative in {@link FlutterParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(FlutterParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#center}.
	 * @param ctx the parse tree
	 */
	void enterCenter(FlutterParser.CenterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#center}.
	 * @param ctx the parse tree
	 */
	void exitCenter(FlutterParser.CenterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#centerWidgetArgs}.
	 * @param ctx the parse tree
	 */
	void enterCenterWidgetArgs(FlutterParser.CenterWidgetArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#centerWidgetArgs}.
	 * @param ctx the parse tree
	 */
	void exitCenterWidgetArgs(FlutterParser.CenterWidgetArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlutterParser#setState}.
	 * @param ctx the parse tree
	 */
	void enterSetState(FlutterParser.SetStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlutterParser#setState}.
	 * @param ctx the parse tree
	 */
	void exitSetState(FlutterParser.SetStateContext ctx);
}