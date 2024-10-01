// Generated from C:/Users/sayas/AI Project/compiler2/src/Grammar\FlutterParser.g4 by ANTLR 4.12.0
package Grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlutterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FlutterParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FlutterParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FlutterParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#importRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportRules(FlutterParser.ImportRulesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationTopLevel(FlutterParser.VariableDeclarationTopLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationTopLevel(FlutterParser.ClassDeclarationTopLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationTopLevel(FlutterParser.FunctionDeclarationTopLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WidgetDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetDeclarationTopLevel(FlutterParser.WidgetDeclarationTopLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateLessDeclarationTopLevel}
	 * labeled alternative in {@link FlutterParser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateLessDeclarationTopLevel(FlutterParser.StateLessDeclarationTopLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#class_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_decl(FlutterParser.Class_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationClass}
	 * labeled alternative in {@link FlutterParser#class_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationClass(FlutterParser.VariableDeclarationClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarationClass}
	 * labeled alternative in {@link FlutterParser#class_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationClass(FlutterParser.FunctionDeclarationClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#statelessWidget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatelessWidget(FlutterParser.StatelessWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationType}
	 * labeled alternative in {@link FlutterParser#variables_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationType(FlutterParser.VariableDeclarationTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VaraibleListDeclaration}
	 * labeled alternative in {@link FlutterParser#variables_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaraibleListDeclaration(FlutterParser.VaraibleListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableMapDeclaration}
	 * labeled alternative in {@link FlutterParser#variables_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableMapDeclaration(FlutterParser.VariableMapDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FlutterParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#list_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_exp(FlutterParser.List_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(FlutterParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#buildMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildMethod(FlutterParser.BuildMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#widgetElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetElement(FlutterParser.WidgetElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FlutterParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#function_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameters(FlutterParser.Function_parametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(FlutterParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCodeAttributes(FlutterParser.PrintCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCodeAttributes(FlutterParser.IfCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCodeAttributes(FlutterParser.ForCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatements}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatements(FlutterParser.WhileStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentCodeAttributes(FlutterParser.AssignmentCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallCodeAttributes(FlutterParser.CallCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakCodeAttributes(FlutterParser.BreakCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnCodeAttributes(FlutterParser.ReturnCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetToPageCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetToPageCodeAttributes(FlutterParser.GetToPageCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetBackCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetBackCodeAttributes(FlutterParser.GetBackCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationIncCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationIncCodeAttributes(FlutterParser.OperationIncCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationDecCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationDecCodeAttributes(FlutterParser.OperationDecCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FastMathCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFastMathCodeAttributes(FlutterParser.FastMathCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetStateCodeAttributes}
	 * labeled alternative in {@link FlutterParser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStateCodeAttributes(FlutterParser.SetStateCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(FlutterParser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#fast_math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFast_math(FlutterParser.Fast_mathContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#operation_arithmatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_arithmatic(FlutterParser.Operation_arithmaticContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#while_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statment(FlutterParser.While_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#if_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statment(FlutterParser.If_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#else_if_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_statements(FlutterParser.Else_if_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FlutterParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#print_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statements(FlutterParser.Print_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(FlutterParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentForFirst}
	 * labeled alternative in {@link FlutterParser#for_first_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentForFirst(FlutterParser.AssignmentForFirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableForFirst}
	 * labeled alternative in {@link FlutterParser#for_first_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableForFirst(FlutterParser.VariableForFirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FlutterParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(FlutterParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(FlutterParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(FlutterParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(FlutterParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(FlutterParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapType}
	 * labeled alternative in {@link FlutterParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapType(FlutterParser.MapTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExp}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExp(FlutterParser.BoolExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp(FlutterParser.MapExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationIncrease}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationIncrease(FlutterParser.OperationIncreaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(FlutterParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(FlutterParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExp}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExp(FlutterParser.StringExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationExpression}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationExpression(FlutterParser.OperationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FastMath}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFastMath(FlutterParser.FastMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationDecrease}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationDecrease(FlutterParser.OperationDecreaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(FlutterParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolOperationExpression}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOperationExpression(FlutterParser.BoolOperationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetArgumentsExp}
	 * labeled alternative in {@link FlutterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetArgumentsExp(FlutterParser.GetArgumentsExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#increase_math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrease_math(FlutterParser.Increase_mathContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#decrease_math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrease_math(FlutterParser.Decrease_mathContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#map_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_expr(FlutterParser.Map_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#map_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_object(FlutterParser.Map_objectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagEqualEqual}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagEqualEqual(FlutterParser.TagEqualEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagClose}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagClose(FlutterParser.TagCloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagOpen}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagOpen(FlutterParser.TagOpenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagCloseEqual}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagCloseEqual(FlutterParser.TagCloseEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagOpenEqual}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagOpenEqual(FlutterParser.TagOpenEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(FlutterParser.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(FlutterParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link FlutterParser#operation_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(FlutterParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScaffoldWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldWidget(FlutterParser.ScaffoldWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImageWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageWidget(FlutterParser.ImageWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextWidget(FlutterParser.TextWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainerWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerWidget(FlutterParser.ContainerWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnWidget(FlutterParser.ColumnWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RowWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowWidget(FlutterParser.RowWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CenterWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenterWidget(FlutterParser.CenterWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElevatedButtonWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElevatedButtonWidget(FlutterParser.ElevatedButtonWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextFieldWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldWidget(FlutterParser.TextFieldWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormWidget}
	 * labeled alternative in {@link FlutterParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormWidget(FlutterParser.FormWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#get_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_to(FlutterParser.Get_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#get_to_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_to_args(FlutterParser.Get_to_argsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetToArgExpr}
	 * labeled alternative in {@link FlutterParser#get_to_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetToArgExpr(FlutterParser.GetToArgExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetToArgWidget}
	 * labeled alternative in {@link FlutterParser#get_to_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetToArgWidget(FlutterParser.GetToArgWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#get_back}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_back(FlutterParser.Get_backContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(FlutterParser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#scaffoldArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldArgs(FlutterParser.ScaffoldArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BodyScaffoldProperty}
	 * labeled alternative in {@link FlutterParser#scaffoldProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyScaffoldProperty(FlutterParser.BodyScaffoldPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BackgroundScaffoldProperty}
	 * labeled alternative in {@link FlutterParser#scaffoldProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackgroundScaffoldProperty(FlutterParser.BackgroundScaffoldPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(FlutterParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#imageProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageProperties(FlutterParser.ImagePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImageWidthHeight}
	 * labeled alternative in {@link FlutterParser#imageProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageWidthHeight(FlutterParser.ImageWidthHeightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImageColor}
	 * labeled alternative in {@link FlutterParser#imageProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageColor(FlutterParser.ImageColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(FlutterParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#textProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextProperties(FlutterParser.TextPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#textProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextProperty(FlutterParser.TextPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(FlutterParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#textStyleProprties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextStyleProprties(FlutterParser.TextStyleProprtiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColorKeyValue}
	 * labeled alternative in {@link FlutterParser#textStyleProprty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorKeyValue(FlutterParser.ColorKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FontSizeKeyValue}
	 * labeled alternative in {@link FlutterParser#textStyleProprty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontSizeKeyValue(FlutterParser.FontSizeKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(FlutterParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(FlutterParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#columnArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnArgs(FlutterParser.ColumnArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnKeyValue}
	 * labeled alternative in {@link FlutterParser#columnArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnKeyValue(FlutterParser.ColumnKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnWidgetList}
	 * labeled alternative in {@link FlutterParser#columnArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnWidgetList(FlutterParser.ColumnWidgetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#rowArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowArgs(FlutterParser.RowArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RowKeyValue}
	 * labeled alternative in {@link FlutterParser#rowArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowKeyValue(FlutterParser.RowKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RowWidgetList}
	 * labeled alternative in {@link FlutterParser#rowArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowWidgetList(FlutterParser.RowWidgetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainAxisAlignment(FlutterParser.MainAxisAlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#crossAxisAlignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossAxisAlignment(FlutterParser.CrossAxisAlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#mainAxisSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainAxisSize(FlutterParser.MainAxisSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#widgetList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetList(FlutterParser.WidgetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(FlutterParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#containerProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerProperties(FlutterParser.ContainerPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainerKeyValue}
	 * labeled alternative in {@link FlutterParser#containerProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerKeyValue(FlutterParser.ContainerKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainerWidthHeight}
	 * labeled alternative in {@link FlutterParser#containerProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerWidthHeight(FlutterParser.ContainerWidthHeightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainerKeyWidgetValue}
	 * labeled alternative in {@link FlutterParser#containerProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerKeyWidgetValue(FlutterParser.ContainerKeyWidgetValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#e_button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_button(FlutterParser.E_buttonContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#e_buttonProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_buttonProperties(FlutterParser.E_buttonPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EbuttonVoid}
	 * labeled alternative in {@link FlutterParser#e_ButtonProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEbuttonVoid(FlutterParser.EbuttonVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EbuttonColor}
	 * labeled alternative in {@link FlutterParser#e_ButtonProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEbuttonColor(FlutterParser.EbuttonColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#textField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextField(FlutterParser.TextFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#textFieldArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldArgs(FlutterParser.TextFieldArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#textFieldWidgetArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldWidgetArg(FlutterParser.TextFieldWidgetArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(FlutterParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#formArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormArgs(FlutterParser.FormArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#formArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormArg(FlutterParser.FormArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallFunction}
	 * labeled alternative in {@link FlutterParser#voidFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(FlutterParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionBlock}
	 * labeled alternative in {@link FlutterParser#voidFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(FlutterParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#center}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenter(FlutterParser.CenterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#centerWidgetArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenterWidgetArgs(FlutterParser.CenterWidgetArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlutterParser#setState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetState(FlutterParser.SetStateContext ctx);
}