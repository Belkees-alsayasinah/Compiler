package AST;

import AST.CodeAttributes.*;
import AST.Expression.*;
import AST.Node.DataType;
import AST.Node.Import;
import AST.Node.Node;
import AST.TopLevel.*;
import AST.Widget.*;
import ErrorHandling.*;
import Grammar.FlutterParser;
import Grammar.FlutterParserBaseVisitor;
import SymbolTable.*;

import java.util.ArrayList;
import java.util.List;

public class Visitor extends FlutterParserBaseVisitor {
    SymbolTableTypeMisMatch symbolTableTypeMisMatch;
    SymbolTableReWriteChild symbolTableReWriteChild;
    SymbolTableUndefinedVar symbolTableUndefinedVar;
    SymbolTableOnPressedFunction symbolTableOnPressedFunction;
    SymbolTableDividZero symbolTableDividZero;

    public Visitor() {
        symbolTableTypeMisMatch = new SymbolTableTypeMisMatch();
        this.symbolTableReWriteChild = new SymbolTableReWriteChild();
        symbolTableOnPressedFunction = new SymbolTableOnPressedFunction();
        symbolTableUndefinedVar = new SymbolTableUndefinedVar();
        symbolTableDividZero = new SymbolTableDividZero();
    }

//    public Visitor(SymbolTableUndefinedVar symbolTableUndefinedVar) {
//        this.symbolTableUndefinedVar = symbolTableUndefinedVar;
//    }


    //Program  ##################################
    @Override
    public Node visitProgram(FlutterParser.ProgramContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Node leftChild = (Node) visit(ctx.getChild(0));
        Program program = new Program(lineNumber, leftChild);
        program.addProgramNode(leftChild);
        for (int i = 1; i < ctx.getChildCount(); i++) {
            Node children = (Node) visit(ctx.getChild(i));
            program.addProgramNode(children);
        }
        return program;
    }

    //Import ########################
    @Override
    public Node visitImportRules(FlutterParser.ImportRulesContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String value = ctx.STRING_EXP().getText();
        return new Import(value, lineNumber);
    }

    //topLevel ##########################
    @Override
    public Node visitVariableDeclarationTopLevel(FlutterParser.VariableDeclarationTopLevelContext ctx) {
        return (Node) visit(ctx.variables_decl());
    }

    @Override
    public Node visitClassDeclarationTopLevel(FlutterParser.ClassDeclarationTopLevelContext ctx) {
        return (Node) visit(ctx.class_decl());
    }

    @Override
    public Node visitFunctionDeclarationTopLevel(FlutterParser.FunctionDeclarationTopLevelContext ctx) {
        return (Node) visit(ctx.function());
    }

    @Override
    public Node visitWidgetDeclarationTopLevel(FlutterParser.WidgetDeclarationTopLevelContext ctx) {
        return (Node) visit(ctx.widget());
    }

    @Override
    public Node visitStateLessDeclarationTopLevel(FlutterParser.StateLessDeclarationTopLevelContext ctx) {
        return (Node) visit(ctx.statelessWidget());
    }


    //Class Declaration ###################
    @Override
    public Node visitClass_decl(FlutterParser.Class_declContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        boolean isAbs = ctx.ABSTRACT() != null;
        CharsExpression className = new CharsExpression(ctx.CHARS().getText(), lineNumber);
        List<Node> classMember = new ArrayList<>();
        for (int i = 0; i < ctx.class_member().size(); i++) {
            classMember.add((Node) visit(ctx.class_member(i)));
        }
        return new ClassDeclaration(classMember, isAbs, className, lineNumber);
    }

    @Override
    public Node visitVariableDeclarationClass(FlutterParser.VariableDeclarationClassContext ctx) {
        return (Node) visit(ctx.variables_decl());
    }

    @Override
    public Node visitFunctionDeclarationClass(FlutterParser.FunctionDeclarationClassContext ctx) {
        return (Node) visit(ctx.function());
    }


    @Override
    public Node visitVariableDeclarationType(FlutterParser.VariableDeclarationTypeContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        DataType type = (DataType) visit(ctx.type());
        CharsExpression varName = new CharsExpression(ctx.CHARS().getText(), lineNumber);
        Expression expression = null;
        if (ctx.expr() != null){
            expression = (Expression) visit(ctx.expr());
        }

        if (type != null) {
            if (!symbolTableUndefinedVar.mapSymbol.containsKey(ctx.CHARS().getText())) {
                //  ErrorPrinter.printError(new UndefinedException(lineNumber, ctx.CHARS().getText(), type.name(), expression.expressionDataType.name()));
                symbolTableUndefinedVar.addKeyValue(varName.toString(), expression);
            } else
                ErrorPrinter.printError(new UndefinedException(lineNumber, "this variable :", ctx.CHARS().getText(), "is already defined, \ntry again by changing tha variable name "));
        }
        symbolTableUndefinedVar.addKeyValue(ctx.CHARS().getText(), expression);
        symbolTableTypeMisMatch.addVariable(ctx.CHARS().getText(), type);
        if (expression != null){
            try {
                if (!type.name().equals(expression.expressionDataType.name())) {
                    ErrorPrinter.printError(new TypeMisMatchException(lineNumber, ctx.CHARS().getText(), type.name(), expression.expressionDataType.name()));
                }
            }catch (Exception e){

            }
        }
        return new VariableDeclaration(type, varName, expression, lineNumber);
    }


    @Override
    public Node visitVaraibleListDeclaration(FlutterParser.VaraibleListDeclarationContext ctx) {
        return (Node) visit(ctx.list());
    }

    @Override
    public Node visitList(FlutterParser.ListContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        DataType type = (DataType) visit(ctx.type());
        Expression list_exp = null;
        if (ctx.list_exp() != null) {
            list_exp = (Expression) visit(ctx.list_exp());
        }
        String id = ctx.CHARS().getText();
        return new ListDeclaration(type, id, list_exp, lineNumber);
    }

    @Override
    public Node visitList_exp(FlutterParser.List_expContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List_exp list_exp = new List_exp(lineNumber);
        for (int i = 0; i < ctx.expr().size(); i++) {
            list_exp.AddExpression((Expression) visit(ctx.expr(i)));
        }
        return list_exp;
    }



    @Override
    public Node visitFunction(FlutterParser.FunctionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        DataType type;
        if (ctx.type() != null) {
            type = (DataType) visit(ctx.type());
        } else {
            type = DataType.Void;
        }
        String id = ctx.CHARS().getText();
        List<FunctionParameter> functionParameters = new ArrayList<>();
        if (ctx.function_parameters() != null) {
            functionParameters = visitFunction_parameters(ctx.function_parameters());
        }
        Block block = (Block) visit(ctx.block());
        return new Function(functionParameters, type, block, id, lineNumber);
    }

    @Override
    public List<FunctionParameter> visitFunction_parameters(FlutterParser.Function_parametersContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<FunctionParameter> functionParameters = new ArrayList<>();
        for (int i = 0; i < ctx.type().size(); i++) {
            DataType type = (DataType) visit(ctx.type().get(i));
            String chars = ctx.CHARS(i).getText();
            FunctionParameter functionParameter = new FunctionParameter(type, chars, lineNumber);
            functionParameters.add(functionParameter);
        }
        return functionParameters;
    }


    @Override
    public Node visitVariableDeclaration(FlutterParser.VariableDeclarationContext ctx) {
        return (Node) visit(ctx.variables_decl());
    }

    @Override
    public Node visitPrintCodeAttributes(FlutterParser.PrintCodeAttributesContext ctx) {
        return (Node) visit(ctx.print_statements());
    }

    @Override
    public Node visitIfCodeAttributes(FlutterParser.IfCodeAttributesContext ctx) {
        return (Node) visit(ctx.if_statment());
    }

    @Override
    public Node visitForCodeAttributes(FlutterParser.ForCodeAttributesContext ctx) {
        return (Node) visit(ctx.for_statement());
    }

    @Override
    public Node visitWhileStatements(FlutterParser.WhileStatementsContext ctx) {
        return (Node) visit(ctx.while_statment());
    }

    @Override
    public Node visitAssignmentCodeAttributes(FlutterParser.AssignmentCodeAttributesContext ctx) {
        return (Node) visit(ctx.assignment());
    }

    @Override
    public Node visitCallCodeAttributes(FlutterParser.CallCodeAttributesContext ctx) {
        return (Node) visit(ctx.call_function());
    }

    @Override
    public Node visitBreakCodeAttributes(FlutterParser.BreakCodeAttributesContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String expression = ctx.BREAK().getText();
        return new ReturnOrBreak(null, expression, lineNumber);
    }

    @Override
    public Node visitReturnCodeAttributes(FlutterParser.ReturnCodeAttributesContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String expression = ctx.RETURN().getText();
        Expression expression1 = null;
        if (ctx.expr() != null) {
            expression1 = (Expression) visit(ctx.expr());
        }
        return new ReturnOrBreak(expression1, expression, lineNumber);
    }

    @Override
    public Node visitFastMathCodeAttributes(FlutterParser.FastMathCodeAttributesContext ctx) {
        return visitFast_math(ctx.fast_math());
    }

    @Override
    public Node visitCall_function(FlutterParser.Call_functionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String call_name = ctx.CHARS().getText();
        return new CallFunction(call_name, lineNumber);
    }

    @Override
    public Node visitFast_math(FlutterParser.Fast_mathContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String name = ctx.CHARS().getText();
        String operation = ctx.getChild(1).getText();
        String val = ctx.NUMBER().getText();
        int number = Integer.parseInt(val);
        if (!symbolTableUndefinedVar.mapSymbol.containsKey(name)) {
            ErrorPrinter.printError(new UndefinedException(lineNumber, "this variable :", name,
                    "is  undefined, try again by definition the variable first... "));
        }
        return new FastMath(name, operation, number, lineNumber);
    }

    @Override
    public Node visitWhile_statment(FlutterParser.While_statmentContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Expression expr = (Expression) visit(ctx.expr());
        Block block = (Block) visitBlock(ctx.block());
        return new While_Statment(expr, block, lineNumber);
    }

    @Override
    public Node visitIf_statment(FlutterParser.If_statmentContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Expression exp = (Expression) visit(ctx.expr());
        Block block = (Block) visit(ctx.block(0));
        List<ElseIfStatement> elseIfStatementList = new ArrayList<>();
        if (ctx.else_if_statements() != null) {
            for (int i = 0; i < ctx.else_if_statements().size(); i++) {
                ElseIfStatement elseIfStatements1 = (ElseIfStatement) visit(ctx.else_if_statements(i));
                elseIfStatementList.add(elseIfStatements1);
            }
        }
      //  Block elseStatement = (Block) visit(ctx.block(1));
        return new IfStatement(exp, block, elseIfStatementList, lineNumber);
    }

    @Override
    public Node visitElse_if_statements(FlutterParser.Else_if_statementsContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Expression ifPart = (Expression) visit(ctx.expr());
        Block block = (Block) visitBlock(ctx.block());
        return new ElseIfStatement(ifPart, block, lineNumber);
    }

    @Override
    public Node visitAssignment(FlutterParser.AssignmentContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String char1 = ctx.getChild(0).getText();
        // check if var exist or not
        Expression expr = (Expression) visit(ctx.expr());
        if(symbolTableUndefinedVar.getValue(char1) == null){
            symbolTableUndefinedVar.update(char1, expr);
        }
        DataType varType = symbolTableTypeMisMatch.getValueType(char1);
        DataType exprType = expr.expressionDataType;
        if(expr instanceof Variable_expr){
            exprType = symbolTableTypeMisMatch.getValueType(((Variable_expr) expr).Variable_expr);
        }
        if (!symbolTableUndefinedVar.mapSymbol.containsKey(char1)) {
            ErrorPrinter.printError(new UndefinedException(lineNumber, "this variable :", char1,
                    "is  undefined, \ntry again by setting the type of the variable... \nor use one of defined variables  "));
        }
        if (!varType.name().equals(exprType.name())) {
            ErrorPrinter.printError(new TypeMisMatchException(lineNumber, char1, varType.name(), exprType.name()));
        }
        return new Assignment(char1, expr, lineNumber);
    }

    @Override
    public Node visitPrint_statements(FlutterParser.Print_statementsContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Expression expr = (Expression) visit(ctx.expr());
        return new PrintStatement(expr, lineNumber);
    }

    @Override
    public Node visitFor_statement(FlutterParser.For_statementContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Node for_first_part = (Node) visit(ctx.for_first_part());
        Expression exp = (Expression) visit(ctx.expr(0));
        Block block = (Block) visitBlock(ctx.block());
        return new For_statement(for_first_part,exp, block, lineNumber);
    }

    @Override
    public Node visitAssignmentForFirst(FlutterParser.AssignmentForFirstContext ctx) {
        return (Node) visit(ctx.assignment());
    }

    @Override
    public Node visitVariableForFirst(FlutterParser.VariableForFirstContext ctx) {
        return (Node) visit(ctx.variables_decl());
    }


    @Override
    public Node visitBlock(FlutterParser.BlockContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<Node> codeAttributes = new ArrayList<>();
        if (ctx.code_attribute() != null) {
            for (int i = 0; i < ctx.code_attribute().size(); i++) {
                Node node = (Node) visit(ctx.code_attribute().get(i));
                codeAttributes.add(node);
            }
        }
        return new Block(codeAttributes, lineNumber);
    }


    ////////// here aaaa
    @Override
    public DataType visitIntType(FlutterParser.IntTypeContext ctx) {
        return DataType.Integer;
    }

    @Override
    public DataType visitVarType(FlutterParser.VarTypeContext ctx) {
        return DataType.Var;
    }

    @Override
    public DataType visitStringType(FlutterParser.StringTypeContext ctx) {
        return DataType.String;
    }

    @Override
    public DataType visitBoolType(FlutterParser.BoolTypeContext ctx) {
        return DataType.Boolean;
    }

    @Override
    public DataType visitDoubleType(FlutterParser.DoubleTypeContext ctx) {
        return DataType.Double;
    }

    @Override
    public Expression visitOperation_arithmatic(FlutterParser.Operation_arithmaticContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String operation = ctx.getChild(0).getText();

        return new OperationArithmatic(operation, lineNumber);
    }

    @Override
    public Expression visitCallFunction(FlutterParser.CallFunctionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String call_name = ctx.CHARS().getText();
        return new CallFunction(call_name, lineNumber);    }



    // expression
    @Override
    public Node visitBoolExp(FlutterParser.BoolExpContext ctx) {

        int lineNumber = ctx.getStart().getLine();
        String value = ctx.getChild(0).getText();
        boolean boolValue = Boolean.parseBoolean(value);
        return new BoolExpr(boolValue, lineNumber);
    }

    @Override
    public Node visitVariable(FlutterParser.VariableContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String variable = ctx.CHARS().getText();
        if (!symbolTableUndefinedVar.mapSymbol.containsKey(variable)) {
            ErrorPrinter.printError(new UndefinedException(lineNumber, "this variable :", variable,
                    "is  undefined, try again by definition the variable first... "));
        }
        return new Variable_expr(variable, lineNumber);
    }

    @Override
    public Node visitNumber(FlutterParser.NumberContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String value = ctx.NUMBER().getText();
        int number = Integer.parseInt(value);
        return new Number_expr(number, lineNumber);
    }

    @Override
    public Node visitStringExp(FlutterParser.StringExpContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String value = ctx.STRING_EXP().getText();
        return new String_expr(value, lineNumber);
    }

    @Override
    public Node visitOperationExpression(FlutterParser.OperationExpressionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Expression left = (Expression) visit(ctx.expr(0));
        Expression right = (Expression) visit(ctx.expr(1));
        String val = ctx.getChild(1).getText();
        symbolTableDividZero.addVariable(val,right);
        if(val.equals("/")){
            String c = right.toString().split("=")[1];
            String x=  c.replace("}","");
                if(symbolTableDividZero.getExpression(x)){
                    ErrorPrinter.printError(new DividZeroExeption(lineNumber,"you have divided by zero, Try another number"));
                }
        }

        return new OperationExpression(left, right, val, lineNumber);
    }

    @Override
    public CodeAttributes visitOperationIncCodeAttributes(FlutterParser.OperationIncCodeAttributesContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        return new OperationOneCode((OperationOne) visit(ctx.increase_math()), lineNumber);
    }

    @Override
    public CodeAttributes visitOperationDecCodeAttributes(FlutterParser.OperationDecCodeAttributesContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        return new OperationOneCode((OperationOne) visit(ctx.decrease_math()), lineNumber);
    }

    @Override
    public Expression visitOperationIncrease(FlutterParser.OperationIncreaseContext ctx) {
        return (Expression) visit(ctx.increase_math());
    }

    @Override
    public Expression visitOperationDecrease(FlutterParser.OperationDecreaseContext ctx) {
        return (Expression) visit(ctx.decrease_math());
    }

    @Override
    public Expression visitIncrease_math(FlutterParser.Increase_mathContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String chars = ctx.getChild(0).getText();
        String operation = ctx.getChild(1).getText();
        if (!symbolTableUndefinedVar.mapSymbol.containsKey(chars)) {
            ErrorPrinter.printError(new UndefinedException(lineNumber, "this variable :", chars,
                    "is  undefined, try again by definition the variable first... "));
        }
        return new OperationOne(chars, operation, lineNumber);
    }

    @Override
    public Expression visitDecrease_math(FlutterParser.Decrease_mathContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String chars = ctx.getChild(0).getText();
        String operation = ctx.getChild(1).getText();
        if (!symbolTableUndefinedVar.mapSymbol.containsKey(chars)) {
            ErrorPrinter.printError(new UndefinedException(lineNumber, "this variable :", chars,
                    "is  undefined, try again by definition the variable first... "));
        }
        return new OperationOne(chars, operation, lineNumber);
    }

    @Override
    public Expression visitFastMath(FlutterParser.FastMathContext ctx) {
        return (Expression) visit(ctx.fast_math());
    }

    @Override
    public Node visitFunctionCall(FlutterParser.FunctionCallContext ctx) {
        return visitCall_function(ctx.call_function());
    }

    @Override
    public Node visitBoolOperationExpression(FlutterParser.BoolOperationExpressionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Expression left = (Expression) visit(ctx.expr(0));
        Expression right = (Expression) visit(ctx.expr(1));
        Operation_if val = (Operation_if) visit(ctx.operation_if());
        return new BoolOperationExpression(left, right, val, lineNumber);
    }

    @Override
    public Node visitVariableMapDeclaration(FlutterParser.VariableMapDeclarationContext ctx) {
        return visitMap(ctx.map());
    }

    @Override
    public Node visitMap(FlutterParser.MapContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        DataType type = (DataType) visit(ctx.type());
        Expression list_exp = null;
        if (ctx.map_expr() != null) {
            list_exp = (Expression) visit(ctx.map_expr());
        }
        String id = ctx.CHARS().getText();
        return new MapDeclaration(type, id, list_exp, lineNumber);
    }

    @Override
    public DataType visitMapType(FlutterParser.MapTypeContext ctx) {
        return DataType.Map;
    }

    @Override
    public Expression visitGetArgumentsExp(FlutterParser.GetArgumentsExpContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Expression exp = null;
        if (ctx.expr() != null) {
            exp = (Expression) visit(ctx.expr());
        }
        return new GetArgs(exp, lineNumber);
    }

    //Widget #####################

    @Override
    public Widget visitScaffoldWidget(FlutterParser.ScaffoldWidgetContext ctx) {
        return (Widget) visit(ctx.scaffold());
    }

    @Override
    public Widget visitImageWidget(FlutterParser.ImageWidgetContext ctx) {
        return (Widget) visit(ctx.image());
    }

    @Override
    public Widget visitTextWidget(FlutterParser.TextWidgetContext ctx) {
        return (Widget) visit(ctx.text());
    }

    @Override
    public Widget visitContainerWidget(FlutterParser.ContainerWidgetContext ctx) {
        return (Widget) visit(ctx.container());
    }

    @Override
    public Widget visitColumnWidget(FlutterParser.ColumnWidgetContext ctx) {
        return (Widget) visit(ctx.column());
    }

    @Override
    public Widget visitRowWidget(FlutterParser.RowWidgetContext ctx) {
        return (Widget) visit(ctx.row());
    }

    @Override
    public Widget visitCenterWidget(FlutterParser.CenterWidgetContext ctx) {
        return (Widget) visit(ctx.center());
    }

    @Override
    public Widget visitElevatedButtonWidget(FlutterParser.ElevatedButtonWidgetContext ctx) {
        return (Widget) visit(ctx.e_button());
    }
    //StatelessWidget


    @Override
    public Widget visitStatelessWidget(FlutterParser.StatelessWidgetContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String classWord = ctx.CLASS().getText();
        String className = ctx.CHARS().getText();
        String extend = ctx.EXTENDS().getText();
        String statelessWidget = ctx.STATELESSWIDGET().getText();
        BuildMethod buildMethod = (BuildMethod) visitBuildMethod(ctx.buildMethod());
        return new StatelessWidget(classWord, className, extend, statelessWidget, buildMethod, lineNumber);
    }

    @Override
    public Widget visitBuildMethod(FlutterParser.BuildMethodContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String override_ = ctx.OVERRIDE().getText();
        String widget = ctx.WIDGET().getText();
        String build = ctx.BUILD().getText();
        String buildContext = ctx.BUILDCONTEXT().getText();
        String context = ctx.CONTEXT().getText();
        WidgetElement widgetElement = (WidgetElement) visitWidgetElement(ctx.widgetElement());
        return new BuildMethod(override_, widget, build, buildContext, context, widgetElement, lineNumber);
    }

    @Override
    public Widget visitWidgetElement(FlutterParser.WidgetElementContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.RETURN().getText();
        Widget widget = (Widget) visit(ctx.widget());
        return new WidgetElement(key, widget, lineNumber);
    }

    // Scaffold
    @Override
    public Widget visitScaffold(FlutterParser.ScaffoldContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<KeyValue> scaffoldProp = visitScaffoldArgs(ctx.scaffoldArgs());
        return new ScaffoldWidget(scaffoldProp, lineNumber);
    }

    @Override
    public List<KeyValue> visitScaffoldArgs(FlutterParser.ScaffoldArgsContext ctx) {
        List<KeyValue> scaffoldProp = new ArrayList<>();
        for (int i = 0; i < ctx.scaffoldProperty().size(); i++) {
            scaffoldProp.add((KeyValue) visit(ctx.scaffoldProperty(i)));
        }
        return scaffoldProp;
    }

    @Override
    public KeyValue visitBodyScaffoldProperty(FlutterParser.BodyScaffoldPropertyContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.BODY().getText();
        Node widget = (Node) visit(ctx.widget());
        return new KeyValueWidget(key, widget, lineNumber);
    }

    @Override
    public KeyValue visitBackgroundScaffoldProperty(FlutterParser.BackgroundScaffoldPropertyContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.BACK_COLOR().getText();
        String value = ctx.COLORS().getText() + "." + ctx.COLORS_VALUES().getText();
        Expression expression = new String_expr(value, lineNumber);
        return new KeyValueExpr(key, expression, lineNumber);
    }

    // Column and Row and Text done
    @Override
    public Widget visitColumn(FlutterParser.ColumnContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<KeyValue> coulmnarg = new ArrayList<>();
        if (ctx.columnArgs() != null) {
            coulmnarg = visitColumnArgs(ctx.columnArgs());
        }
        ColumnWidget column_widget = new ColumnWidget(coulmnarg, lineNumber);
        for (int i = 0; i < column_widget.columnProperties.size(); i++) {
            if (i != column_widget.columnProperties.size() - 1) {
                column_widget.columnProperties.get(i).sibling = column_widget.columnProperties.get(i + 1);
            }
            column_widget.columnProperties.get(i).parent = column_widget;
        }
        return column_widget;
    }

    @Override
    public List<KeyValue> visitColumnArgs(FlutterParser.ColumnArgsContext ctx) {
        List<KeyValue> columnarg = new ArrayList<>();
        for (int i = 0; i < ctx.columnArg().size(); i++) {
            KeyValue keyValueWidget = (KeyValue) visit(ctx.columnArg().get(i));
            columnarg.add(keyValueWidget);
        }
        return columnarg;
    }

    @Override
    public KeyValue visitColumnKeyValue(FlutterParser.ColumnKeyValueContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValue keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    @Override
    public KeyValue visitColumnWidgetList(FlutterParser.ColumnWidgetListContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValue keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    @Override
    public Widget visitRow(FlutterParser.RowContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<KeyValue> rowargs = new ArrayList<>();
        if (ctx.rowArgs() != null) {
            rowargs = visitRowArgs(ctx.rowArgs());
        }
        RowWidget row_widget = new RowWidget(rowargs, lineNumber);
        for (int i = 0; i < row_widget.rowProperties.size(); i++) {
            if (i != row_widget.rowProperties.size() - 1) {
                row_widget.rowProperties.get(i).sibling = row_widget.rowProperties.get(i + 1);
            }
            row_widget.rowProperties.get(i).parent = row_widget;
        }
        return row_widget;
    }

    @Override
    public List<KeyValue> visitRowArgs(FlutterParser.RowArgsContext ctx) {
        List<KeyValue> rowarg = new ArrayList<>();
        for (int i = 0; i < ctx.rowArg().size(); i++) {
            KeyValue keyValueWidget = (KeyValue) visit(ctx.rowArg().get(i));
            rowarg.add(keyValueWidget);
        }
        return rowarg;
    }
    @Override
    public KeyValue visitRowKeyValue(FlutterParser.RowKeyValueContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValue keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    @Override
    public KeyValue visitRowWidgetList(FlutterParser.RowWidgetListContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValue keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    @Override
    public Node visitMainAxisAlignment(FlutterParser.MainAxisAlignmentContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        StringBuilder stringBuilder = new StringBuilder();
        String key = ctx.MAINAXISALIGNMENT_VALUE().getText();
        stringBuilder.append(key);
        String dot = ctx.DOT().getText();
        String value = ctx.MAINAXISALIGNMENT_VALUES().getText();
        stringBuilder.append(dot).append(value);
        return new String_expr(stringBuilder.toString(), lineNumber);
    }

    @Override
    public Node visitMainAxisSize(FlutterParser.MainAxisSizeContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        StringBuilder stringBuilder = new StringBuilder();
        String key = ctx.MAINAXISSIZE_VALUE().getText();
        stringBuilder.append(key);
        String dot = ctx.DOT().getText();
        String value = ctx.MAINAXISSIZE_VALUES().getText();
        stringBuilder.append(dot).append(value);
        return new String_expr(stringBuilder.toString(), lineNumber);
    }

    @Override
    public Node visitCrossAxisAlignment(FlutterParser.CrossAxisAlignmentContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        StringBuilder stringBuilder = new StringBuilder();
        String key = ctx.CROSSAXISALIGNMENT_VALUE().getText();
        stringBuilder.append(key);
        String dot = ctx.DOT_Cross().getText();
        String value = ctx.CROSSAXISALIGNMENT_VALUES().getText();
        stringBuilder.append(dot).append(value);
        return new String_expr(stringBuilder.toString(), lineNumber);
    }

    @Override
    public Node visitWidgetList(FlutterParser.WidgetListContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<Node> widgetListLocal = new ArrayList<>();
        if (ctx.widget() != null) {
            for (int i = 0; i < ctx.widget().size(); i++) {
                Node widget = (Node) visit(ctx.widget().get(i));
                widgetListLocal.add(widget);
            }
            WidgetList widgetList = new WidgetList(widgetListLocal, lineNumber);
            for (int i = 0; i < widgetList.widgets.size(); i++) {
                if (i != widgetList.widgets.size() - 1) {
                    widgetList.widgets.get(i).sibling = widgetList.widgets.get(i + 1);
                }
                widgetList.widgets.get(i).parent = widgetList;
            }
            return widgetList;
        }
        return new WidgetList(widgetListLocal, lineNumber);
    }


    @Override
    public Node visitText(FlutterParser.TextContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<KeyValue> textArgs = new ArrayList<>();
        if (ctx.textProperties() != null) {
            textArgs = visitTextProperties(ctx.textProperties());
        }
        TextWidget textWidget = new TextWidget(textArgs, lineNumber);
        for (int i = 0; i < textWidget.textProperties.size(); i++) {
            if (i != textWidget.textProperties.size() - 1) {
                textWidget.textProperties.get(i).sibling = textWidget.textProperties.get(i + 1);
            }
            textWidget.textProperties.get(i).parent = textWidget;
        }
        return textWidget;
    }

    @Override
    public List<KeyValue> visitTextProperties(FlutterParser.TextPropertiesContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<KeyValue> textArgs = new ArrayList<>();
        Node expr = (Node) visit(ctx.expr());
        KeyValue keyValueWidget = new KeyValueWidget("data", expr, lineNumber);
        textArgs.add(keyValueWidget);
        if (ctx.textProperty() != null) {
            KeyValue textKeyValue = visitTextProperty(ctx.textProperty());
            textArgs.add(textKeyValue);
        }
        return textArgs;
    }

    @Override
    public KeyValue visitTextProperty(FlutterParser.TextPropertyContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.STYLE().getText();
        Node value = (Node) visit(ctx.style());
        KeyValue keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    @Override
    public Node visitStyle(FlutterParser.StyleContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<KeyValue> styleArgs = new ArrayList<>();
        if (ctx.textStyleProprties() != null) {
            styleArgs = visitTextStyleProprties(ctx.textStyleProprties());
        }
        Style textStyleWidget = new Style(styleArgs, lineNumber);
        for (int i = 0; i < textStyleWidget.styleProperties.size(); i++) {
            if (i != textStyleWidget.styleProperties.size() - 1) {
                textStyleWidget.styleProperties.get(i).sibling = textStyleWidget.styleProperties.get(i + 1);
            }
            textStyleWidget.styleProperties.get(i).parent = textStyleWidget;
        }
        return textStyleWidget;
    }

    @Override
    public List<KeyValue> visitTextStyleProprties(FlutterParser.TextStyleProprtiesContext ctx) {
        List<KeyValue> textStyleArgs = new ArrayList<>();
        for (int i = 0; i < ctx.textStyleProprty().size(); i++) {
            KeyValue keyValueWidget = (KeyValue) visit(ctx.textStyleProprty().get(i));
            textStyleArgs.add(keyValueWidget);
        }
        return textStyleArgs;
    }

    @Override  // color: colors.red
    public KeyValue visitColorKeyValue(FlutterParser.ColorKeyValueContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.COLOR().getText();
        String value = ctx.COLORS().getText() + "." + ctx.COLORS_VALUES().getText();
        Expression expression = new String_expr(value, lineNumber);
        return new KeyValueExpr(key, expression, lineNumber);
    }

    @Override
    public KeyValue visitFontSizeKeyValue(FlutterParser.FontSizeKeyValueContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Expression valueNode = (Expression) visit(ctx.expr());
        return new KeyValueExpr(key, valueNode, lineNumber);
    }


    // ################ Container
    @Override
    public Node visitContainer(FlutterParser.ContainerContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<KeyValue> containerProperties = new ArrayList<>();
        if (ctx.containerProperties() != null) {
            containerProperties = visitContainerProperties(ctx.containerProperties());
        }
        ContainerWidget containerWidget = new ContainerWidget(containerProperties, lineNumber);
        for (int i = 0; i < containerWidget.containerProperties.size(); i++) {
            if (i != containerWidget.containerProperties.size() - 1) {
                containerWidget.containerProperties.get(i).sibling = containerWidget.containerProperties.get(i + 1);
            }
            containerWidget.containerProperties.get(i).parent = containerWidget;
        }
        return containerWidget;
    }

    @Override
    public List<KeyValue> visitContainerProperties(FlutterParser.ContainerPropertiesContext ctx) {
        List<KeyValue> containerProp = new ArrayList<>();
        for (int i = 0; i < ctx.containerProperty().size(); i++) {
            KeyValue keyValueWidget = (KeyValue) visit(ctx.containerProperty().get(i));
            containerProp.add(keyValueWidget);
        }
        return containerProp;
    }

    @Override
    public KeyValue visitContainerKeyValue(FlutterParser.ContainerKeyValueContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        String value = ctx.COLORS().getText() + "." + ctx.COLORS_VALUES().getText();
        Expression expression = new String_expr(value, lineNumber);
        if (!symbolTableReWriteChild.checkKey(key)) {
            symbolTableReWriteChild.addVariable(key, true);
        } else {
            ErrorPrinter.printError(new ReWriteBodyException(lineNumber, "Container"));
        }
        return new KeyValueExpr(key, expression, lineNumber);
    }

    @Override
    public KeyValue visitContainerKeyWidgetValue(FlutterParser.ContainerKeyWidgetValueContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValue keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        if (!symbolTableReWriteChild.checkKey(key)) {
            symbolTableReWriteChild.addVariable(key, true);
        } else {
            ErrorPrinter.printError(new ReWriteBodyException(lineNumber, "Container"));
        }
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    @Override
    public KeyValue visitContainerWidthHeight(FlutterParser.ContainerWidthHeightContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node valueNode = (Node) visit(ctx.expr());
        KeyValue keyValueWidget = new KeyValueWidget(key, valueNode, lineNumber);
        valueNode.parent = keyValueWidget;
        if (!symbolTableReWriteChild.checkKey(key)) {
            symbolTableReWriteChild.addVariable(key, true);
        } else {
            ErrorPrinter.printError(new ReWriteBodyException(lineNumber, "Container"));
        }
        symbolTableReWriteChild.addVariable(key, true);
        valueNode.parent = keyValueWidget;
        return keyValueWidget;
    }


//################Center



    @Override
    public Widget visitCenter(FlutterParser.CenterContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        KeyValue center = visitCenterWidgetArgs(ctx.centerWidgetArgs());
        List<KeyValue> keyValueWidgets = new ArrayList<>();
        keyValueWidgets.add(center);
        CenterWidget CenterWidget = new CenterWidget(keyValueWidgets, lineNumber);
        for (int i = 0; i < CenterWidget.centerProperties.size(); i++) {
            if (i != CenterWidget.centerProperties.size() - 1) {
                CenterWidget.centerProperties.get(i).sibling = CenterWidget.centerProperties.get(i + 1);
            }
            CenterWidget.centerProperties.get(i).parent = CenterWidget;
        }
        return CenterWidget;
    }

    @Override
    public KeyValue visitCenterWidgetArgs(FlutterParser.CenterWidgetArgsContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.CHILD().getText();
        Node value = (Node) visit(ctx.widget());
        KeyValue keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    ///##############Image


    @Override
    public Widget visitImage(FlutterParser.ImageContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<KeyValue> image = visitImageProperties(ctx.imageProperties());
        ImageWidget imageWidget = new ImageWidget(image, lineNumber);
        for (int i = 0; i < imageWidget.imageProperties.size(); i++) {
            if (i != imageWidget.imageProperties.size() - 1) {
                imageWidget.imageProperties.get(i).sibling = imageWidget.imageProperties.get(i + 1);
            }
            imageWidget.imageProperties.get(i).parent = imageWidget;
        }
        return imageWidget;
    }

    @Override
    public List<KeyValue> visitImageProperties(FlutterParser.ImagePropertiesContext ctx) {
        String string_exp = ctx.expr().getText();
        int lineNumber = ctx.getStart().getLine();
        Node valueexpr = (Node) visit(ctx.expr());
        KeyValue key = new KeyValueWidget("data", valueexpr, lineNumber);
        List<KeyValue> image = new ArrayList<>();
        image.add(key);
        if (ctx.imageProperty() != null) {
            for (int i = 0; i < ctx.imageProperty().size(); i++) {
                KeyValue keyValueWidget = (KeyValue) visit(ctx.imageProperty().get(i));
                image.add(keyValueWidget);
            }
        }
        return image;
    }

    @Override
    public KeyValue visitImageWidthHeight(FlutterParser.ImageWidthHeightContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node valueNode = (Node) visit(ctx.expr());
        KeyValue keyValueWidget = new KeyValueWidget(key, valueNode, lineNumber);
        valueNode.parent = keyValueWidget;
        return keyValueWidget;
    }

    @Override
    public KeyValue visitImageColor(FlutterParser.ImageColorContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.COLOR().getText();
        String value = ctx.COLORS().getText() + "." + ctx.COLORS_VALUES().getText();
        Expression expression = new String_expr(value, lineNumber);
        return new KeyValueExpr(key, expression, lineNumber);
    }


    //###########Button
    @Override
    public Widget visitE_button(FlutterParser.E_buttonContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<KeyValue> e_buttonProperties = new ArrayList<>();
        if (ctx.e_buttonProperties() != null) {
            e_buttonProperties = visitE_buttonProperties(ctx.e_buttonProperties());
        }
        ElevatedButtonWidget E_ButtonWidget = new ElevatedButtonWidget(e_buttonProperties, lineNumber);
        for (int i = 0; i < E_ButtonWidget.eButtonProperties.size(); i++) {
            if (i != E_ButtonWidget.eButtonProperties.size() - 1) {
                E_ButtonWidget.eButtonProperties.get(i).sibling = E_ButtonWidget.eButtonProperties.get(i + 1);
            }
            E_ButtonWidget.eButtonProperties.get(i).parent = E_ButtonWidget;
        }
        boolean check = symbolTableOnPressedFunction.checkRequiredProperties();
        if (!check) {
            ErrorPrinter.printError(new onPressedException(lineNumber, "required property miss"));
        }
        return E_ButtonWidget;
    }

    @Override
    public List<KeyValue> visitE_buttonProperties(FlutterParser.E_buttonPropertiesContext ctx) {

        List<KeyValue> elevatedArgs = new ArrayList<>();
        for (int i = 0; i < ctx.e_ButtonProperty().size(); i++) {
            KeyValue keyValueWidget = (KeyValue) visit(ctx.e_ButtonProperty().get(i));

            elevatedArgs.add(keyValueWidget);
        }
        return elevatedArgs;
    }

    @Override
    public KeyValue visitEbuttonVoid(FlutterParser.EbuttonVoidContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValue keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        symbolTableOnPressedFunction.addOnPressed(key, true);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    @Override
    public KeyValue visitEbuttonColor(FlutterParser.EbuttonColorContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        String value = ctx.COLORS().getText() + "." + ctx.COLORS_VALUES().getText();
        Expression expression = new String_expr(value, lineNumber);
        return new KeyValueExpr(key, expression, lineNumber);
    }


    @Override
    public Node visitFunctionBlock(FlutterParser.FunctionBlockContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Block block = (Block) visitBlock(ctx.block());
        WidgetFunction widgetFunction = new WidgetFunction(block, lineNumber);
        block.parent = widgetFunction;
        return widgetFunction;
    }


    @Override
    public Expression visitMapExp(FlutterParser.MapExpContext ctx) {
        return visitMap_expr(ctx.map_expr());
    }

    @Override
    public Expression visitMap_expr(FlutterParser.Map_exprContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<MapObject> mapObjects = new ArrayList<>();
        for (int i = 0; i < ctx.map_object().size(); i++) {
            MapObject mapObject = (MapObject) visit(ctx.map_object().get(i));
            mapObjects.add(mapObject);
        }
        return new MapExpr(mapObjects,lineNumber);
    }

    @Override
    public Expression visitMap_object(FlutterParser.Map_objectContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Expression key= (Expression) visit(ctx.getChild(0));
        Expression value =(Expression) visit(ctx.getChild(2));
        return new MapObject(key,value,lineNumber);
      //  return super.visitMap_object(ctx);
    }



    //SETSTATE

    @Override
    public Node visitSetStateCodeAttributes(FlutterParser.SetStateCodeAttributesContext ctx) {
        return visitSetState(ctx.setState());
    }


    @Override
    public Node visitSetState(FlutterParser.SetStateContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Block block = (Block) visitBlock(ctx.block());
        return new SetState(block,lineNumber);
    }


    //GETX

    @Override
    public Node visitGetToPageCodeAttributes(FlutterParser.GetToPageCodeAttributesContext ctx) {
        return visitGet_to(ctx.get_to());
    }

    @Override
    public Node visitGetBackCodeAttributes(FlutterParser.GetBackCodeAttributesContext ctx) {
        return visitGet_back(ctx.get_back());    }

    @Override
    public Node visitGet_to(FlutterParser.Get_toContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<KeyValue> getToArgs = new ArrayList<>();
        if (ctx.get_to_args() != null) {
            getToArgs = visitGet_to_args(ctx.get_to_args());
        }
        GetTo getTo = new GetTo(getToArgs, lineNumber);
        for (int i = 0; i < getTo.Properties.size(); i++) {
            if (i != getTo.Properties.size() - 1) {
                getTo.Properties.get(i).sibling = getTo.Properties.get(i + 1);
            }
            getTo.Properties.get(i).parent = getTo;
        }
        boolean check = symbolTableOnPressedFunction.checkRequiredProperties();
        if (!check) {
            ErrorPrinter.printError(new onPressedException(lineNumber, "required property miss"));
        }
        return getTo;
    }

    @Override
    public Node visitGet_back(FlutterParser.Get_backContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        return new GetBack(lineNumber);
    }


    @Override
    public List<KeyValue> visitGet_to_args(FlutterParser.Get_to_argsContext ctx) {
        List<KeyValue> getToArgs = new ArrayList<>();
        for (int i = 0; i < ctx.get_to_arg().size(); i++) {
            KeyValue keyValueWidget = (KeyValue) visit(ctx.get_to_arg().get(i));
            getToArgs.add(keyValueWidget);
        }
        return getToArgs;
    }

    @Override
    public KeyValue visitGetToArgExpr(FlutterParser.GetToArgExprContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = "data";
        Expression value = (Expression) visit(ctx.expr());
        return new KeyValueExpr(key, value, lineNumber);
    }

    @Override
    public KeyValue visitGetToArgWidget(FlutterParser.GetToArgWidgetContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Expression expression = (Expression) visit(ctx.expr());
        return new KeyValueExpr(key, expression, lineNumber);
    }

    @Override
    public Widget visitTextFieldWidget(FlutterParser.TextFieldWidgetContext ctx) {
        return (Widget) visit(ctx.textField());
    }

    @Override
    public Widget visitFormWidget(FlutterParser.FormWidgetContext ctx) {
        return (Widget) visit(ctx.form());
    }

    @Override
    public Widget visitTextField(FlutterParser.TextFieldContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<KeyValue> properties = visitTextFieldArgs(ctx.textFieldArgs());
        TextFieldWidget textFieldWidget = new TextFieldWidget(properties, lineNumber);
        for (int i = 0; i < textFieldWidget.textfieldProperties.size(); i++) {
            if (i != textFieldWidget.textfieldProperties.size() - 1) {
                textFieldWidget.textfieldProperties.get(i).sibling = textFieldWidget.textfieldProperties.get(i + 1);
            }
            textFieldWidget.textfieldProperties.get(i).parent = textFieldWidget;
        }
        return textFieldWidget;
    }

    @Override
    public List<KeyValue> visitTextFieldArgs(FlutterParser.TextFieldArgsContext ctx) {
        List<KeyValue> getToArgs = new ArrayList<>();
        for (int i = 0; i < ctx.textFieldWidgetArg().size(); i++) {
            KeyValue keyValueWidget = (KeyValue) visit(ctx.textFieldWidgetArg().get(i));
            getToArgs.add(keyValueWidget);
        }
        return getToArgs;
    }

    @Override
    public KeyValue visitTextFieldWidgetArg(FlutterParser.TextFieldWidgetArgContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValue keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    @Override
    public Widget visitForm(FlutterParser.FormContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<KeyValue> properties = visitFormArgs(ctx.formArgs());
        FormWidget textFieldWidget = new FormWidget(properties, lineNumber);
        for (int i = 0; i < textFieldWidget.formProperties.size(); i++) {
            if (i != textFieldWidget.formProperties.size() - 1) {
                textFieldWidget.formProperties.get(i).sibling = textFieldWidget.formProperties.get(i + 1);
            }
            textFieldWidget.formProperties.get(i).parent = textFieldWidget;
        }
        return textFieldWidget;    }

    @Override
    public List<KeyValue> visitFormArgs(FlutterParser.FormArgsContext ctx) {
        List<KeyValue> getToArgs = new ArrayList<>();
        for (int i = 0; i < ctx.formArg().size(); i++) {
            KeyValue keyValueWidget = (KeyValue) visit(ctx.formArg().get(i));
            getToArgs.add(keyValueWidget);
        }
        return getToArgs;
    }

    @Override
    public KeyValue visitFormArg(FlutterParser.FormArgContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValue keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;    }

    @Override
    public Node visitTagEqualEqual(FlutterParser.TagEqualEqualContext ctx) {
        int lineNumber = ctx.getStart().getLine();
       String operation = ctx.getChild(0).getText();
       return new Operation_if(operation, lineNumber);
   }


    @Override
    public Node visitTagClose(FlutterParser.TagCloseContext ctx) {

        int lineNumber = ctx.getStart().getLine();
        String operation = ctx.getChild(0).getText();
        return new Operation_if(operation, lineNumber);
    }

    @Override
    public Node visitTagOpen(FlutterParser.TagOpenContext ctx)
    {
        int lineNumber = ctx.getStart().getLine();
        String operation = ctx.getChild(0).getText();
        return new Operation_if(operation, lineNumber);
    }

    @Override
    public Node visitTagCloseEqual(FlutterParser.TagCloseEqualContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String operation = ctx.getChild(0).getText();
        return new Operation_if(operation, lineNumber);
    }

    @Override
    public Node visitTagOpenEqual(FlutterParser.TagOpenEqualContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String operation = ctx.getChild(0).getText();
        return new Operation_if(operation, lineNumber);
    }

    @Override
    public Node visitNotEqual(FlutterParser.NotEqualContext ctx) {

        int lineNumber = ctx.getStart().getLine();
        String operation = ctx.getChild(0).getText();
        return new Operation_if(operation, lineNumber);
    }

    @Override
    public Node visitAnd(FlutterParser.AndContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String operation = ctx.getChild(0).getText();
        return new Operation_if(operation, lineNumber);
    }

    @Override
    public Node visitOr(FlutterParser.OrContext ctx) {

        int lineNumber = ctx.getStart().getLine();
        String operation = ctx.getChild(0).getText();
        return new Operation_if(operation, lineNumber);
    }
//
//    @Override
//    public Expression visitOperation_if(FlutterParser.Operation_ifContext ctx) {
//        int lineNumber = ctx.getStart().getLine();
//        String operation = ctx.getChild(0).getText();
//        return new Operation_if(operation, lineNumber);
//    }
}
