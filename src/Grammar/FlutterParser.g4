parser grammar FlutterParser;
options {tokenVocab=FlutterLexer;}


program
    : importRules* topLevel*
    ;

importRules
    : IMPORT STRING_EXP SEMICOLON
    ;

topLevel
    : variables_decl        #VariableDeclarationTopLevel
    | class_decl            #ClassDeclarationTopLevel
    | function              #FunctionDeclarationTopLevel
    | widget                #WidgetDeclarationTopLevel
    | statelessWidget       #StateLessDeclarationTopLevel
    ;

class_decl
    : ABSTRACT? CLASS CHARS CURLYOPEN class_member* CURLYCLOSE
    ;
class_member
    : variables_decl        #VariableDeclarationClass
    | function              #FunctionDeclarationClass
    ;

statelessWidget
    : CLASS CHARS EXTENDS STATELESSWIDGET CURLYOPEN buildMethod CURLYCLOSE
    ;

variables_decl
    : type CHARS (EQUAL expr)? SEMICOLON       #VariableDeclarationType
    | list                                  #VaraibleListDeclaration
    | map                                   #VariableMapDeclaration
    ;


list
    : LIST TAG_OPEN type TAG_CLOSE CHARS EQUAL OB list_exp? CB SEMICOLON
    ;
list_exp
    : expr (COMMA expr)*
    ;
map
    : MAP TAG_OPEN type TAG_CLOSE CHARS EQUAL map_expr? SEMICOLON
    ;

buildMethod
    :OVERRIDE WIDGET BUILD OPENTEXT BUILDCONTEXT CONTEXT CLOSETEXT CURLYOPEN widgetElement CURLYCLOSE
    ;
widgetElement
    : RETURN widget SEMICOLON
    ;


function
    : (VOID| type) CHARS
       OPENTEXT function_parameters? CLOSETEXT
       block
    ;
function_parameters
    : type CHARS (COMMA type CHARS)*
    ;

code_attribute
    : variables_decl                                            #VariableDeclaration
    | print_statements                                          #PrintCodeAttributes
    | if_statment                                               #IfCodeAttributes
    | for_statement                                             #ForCodeAttributes
    | while_statment                                            #WhileStatements
    | assignment                                                #AssignmentCodeAttributes
    | call_function                                             #CallCodeAttributes
    | BREAK SEMICOLON                                           #BreakCodeAttributes
    | RETURN expr? SEMICOLON                                    #ReturnCodeAttributes
    | get_to SEMICOLON                                          #GetToPageCodeAttributes
    | get_back SEMICOLON                                        #GetBackCodeAttributes
    | increase_math SEMICOLON                                   #OperationIncCodeAttributes //i++    // OperationOne { String Chars , String operation}
    | decrease_math SEMICOLON                                   #OperationDecCodeAttributes // i--
    | fast_math                                                 #FastMathCodeAttributes
    | setState                                                   #SetStateCodeAttributes
    ;

call_function
    : CHARS OPENTEXT CLOSETEXT SEMICOLON
    ;

fast_math
    :  CHARS (SUM_EQUAL|MINUS_EQUAL|DIVID_EQUAL|MULTIPLY_EQUAL) NUMBER
    ;
operation_arithmatic
    : MULTIPLY
    | SUM
    | MINUS
    | DIVID
    ;
while_statment
    : WHILE OPENTEXT expr CLOSETEXT block
    ;
if_statment
    : IF OPENTEXT expr CLOSETEXT block else_if_statements* (ELSE block)?
    ;
else_if_statements
    : ELSE_IF OPENTEXT expr CLOSETEXT block
    ;

//logical_sympol : OR | AND;
assignment
    : CHARS EQUAL expr SEMICOLON
    ;
print_statements
    : PRINT OPENTEXT expr CLOSETEXT SEMICOLON
    ;

for_statement
    : FOR OPENTEXT for_first_part
    expr SEMICOLON
    expr CLOSETEXT  block
    ;
for_first_part
    : assignment        #AssignmentForFirst
    | variables_decl    #VariableForFirst
    ;
block
    : CURLYOPEN code_attribute* CURLYCLOSE
    ;

type
    : INT                           #IntType
    | VAR                           #VarType
    | STRING                        #StringType
    | BOOL                          #BoolType
    | DOUBLE                        #DoubleType
    | MAP                           #MapType
    ;
expr: expr operation_arithmatic expr            #OperationExpression
    | expr operation_if expr                    #BoolOperationExpression
    | CHARS                                     #Variable
    | NUMBER                                    #Number
    | STRING_EXP                                #StringExp
    | increase_math                             #OperationIncrease //i++    // OperationOne { String Chars , String operation}
    | decrease_math                             #OperationDecrease // i--
    | fast_math                                 #FastMath
    | call_function                             #FunctionCall
    | TRUE                                      #BoolExp
    | FALSE                                     #BoolExp
    | map_expr                                  #MapExp
    | GETARG (OB expr CB)?                      #GetArgumentsExp
    ;
increase_math
    : CHARS SUMS
    ;
decrease_math
    : CHARS MINUSS
    ;
map_expr
    : CURLYOPEN (map_object (COMMA map_object)*)? CURLYCLOSE
    ;
map_object
    : expr C expr
    ;

operation_if
    : EQUALEQUAL                                 #TagEqualEqual
    | TAG_CLOSE                                  #TagClose
    | TAG_OPEN                                   #TagOpen
    | TAG_CLOSE_EQUAL                            #TagCloseEqual
    | TAG_OPEN_EQUAL                             #TagOpenEqual
    | NOT_EQUAL                                  #NotEqual
    | AND                                        #And
    | OR                                         #Or
    ;

//Flutter
widget
    : scaffold                  #ScaffoldWidget
    | image                     #ImageWidget
    | text                      #TextWidget
    | container                 #ContainerWidget
    | column                    #ColumnWidget
    | row                       #RowWidget
    | center                    #CenterWidget
    | e_button                  #ElevatedButtonWidget
    | textField                 #TextFieldWidget
    | form                      #FormWidget
    ;

get_to
    : GET DOT TO OPENTEXT get_to_args CLOSETEXT
    ;
get_to_args
    : get_to_arg (COMMA get_to_arg)* COMMA?
    ;
get_to_arg
    : expr                                      #GetToArgExpr
    | ARGUMENTS C expr                        #GetToArgWidget
    ;
get_back
    : GET DOT BACK OPENTEXT CLOSETEXT
    ;

scaffold
    : SCAFFOLD OPENTEXT scaffoldArgs? CLOSETEXT COMMA?;//<body>
scaffoldArgs
    : scaffoldProperty (COMMA scaffoldProperty)* COMMA?
    ;
scaffoldProperty
    : BODY C widget                                 #BodyScaffoldProperty
    | BACK_COLOR C COLORS DOT COLORS_VALUES         #BackgroundScaffoldProperty
    ;
//Image.assets("aaa",width:20 , height:30, color: Colors.red)
//<img src="your-image.png" style="display: block; margin: auto;">
image
    : IMAGEASSETS OPENTEXT imageProperties CLOSETEXT COMMA?
    //<img>
    ;
imageProperties
    : expr (COMMA imageProperty)* COMMA? //KeyValue //TODO: new keyValue
    //src="string"
    ;
imageProperty
    : WIDTH C expr                                #ImageWidthHeight
    | HEIGHT C expr                               #ImageWidthHeight
    | COLOR C COLORS DOT COLORS_VALUES              #ImageColor
    ;
    //width:num; height:num ; background-color:color

text
    : TEXT OPENTEXT textProperties CLOSETEXT COMMA?
    ;
textProperties
    : expr (COMMA textProperty)? COMMA?
    ;
textProperty
    : STYLE C style
    ;
style
    : TEXTSTYLE OPENTEXT textStyleProprties? CLOSETEXT
    ;
textStyleProprties
    : textStyleProprty (COMMA textStyleProprty)* COMMA?
    ;
textStyleProprty
    : COLOR C COLORS DOT COLORS_VALUES         #ColorKeyValue //Colors.red
    | FONTSIZE C expr                        #FontSizeKeyValue
    ;

column //div class ="column"
    : COLUMN OPENTEXT columnArgs? CLOSETEXT COMMA?
    ;
row
    : ROW OPENTEXT rowArgs? CLOSETEXT COMMA?
    ;
columnArgs
    : columnArg (COMMA columnArg)* COMMA?
    ;
columnArg
    : MAINAXISALIGNMENT_KEY C mainAxisAlignment         #ColumnKeyValue
    //style="disply:flex ; flex-direction: column ; justify-content: center ; align-items: center"
    | CROSSAXISALIGNMENT_KEY C crossAxisAlignment       #ColumnKeyValue
    | CHILDREN C widgetList                             #ColumnWidgetList
    ;

rowArgs
    : rowArg (COMMA rowArg)* COMMA?
    ;
rowArg
    : MAINAXISALIGNMENT_KEY C mainAxisAlignment         #RowKeyValue
    //style="disply:flex ; flex-direction: row ; justify-content: center ; align-items: center"
    | CROSSAXISALIGNMENT_KEY C crossAxisAlignment       #RowKeyValue
    | CHILDREN C widgetList                             #RowWidgetList
    ;
mainAxisAlignment //Chars Expression
    : MAINAXISALIGNMENT_VALUE DOT MAINAXISALIGNMENT_VALUES
    ;
crossAxisAlignment //Chars Expression
    : CROSSAXISALIGNMENT_VALUE DOT_Cross CROSSAXISALIGNMENT_VALUES
    ;
mainAxisSize
    : MAINAXISSIZE_VALUE DOT MAINAXISSIZE_VALUES
    ;
widgetList
    : OB (widget (COMMA widget)*)? COMMA? CB COMMA?
    ;

container
    : CONTAINER OPENTEXT containerProperties? CLOSETEXT COMMA?
    ;
containerProperties
    : containerProperty (COMMA containerProperty)* COMMA?
    ;
containerProperty
    : COLOR C COLORS DOT COLORS_VALUES              #ContainerKeyValue
    | WIDTH C expr                                #ContainerWidthHeight
    | HEIGHT C expr                               #ContainerWidthHeight
    | CHILD C widget                                #ContainerKeyWidgetValue
    ;
e_button
    : E_BUTTON OPENTEXT e_buttonProperties CLOSETEXT
    ;
e_buttonProperties
    : e_ButtonProperty (COMMA e_ButtonProperty)* COMMA?
    ;
e_ButtonProperty
    : ON_PRESSED C voidFunction         #EbuttonVoid
    | COLOR C COLORS DOT COLORS_VALUES  #EbuttonColor
    | CHILD C widget                    #EbuttonVoid
    ;

//text field
textField
    : TEXTFIELD OPENTEXT textFieldArgs? CLOSETEXT
    ;
textFieldArgs
    : textFieldWidgetArg (COMMA textFieldWidgetArg)* COMMA?
    ;
textFieldWidgetArg
    : TEXTFIELD_CONTROLLER C expr
    | HINT_TEXT C expr
    ;

form
    : FORM OPENTEXT formArgs? CLOSETEXT
    ;
formArgs
    : formArg (COMMA formArg)* COMMA?
    ;
formArg
    : CHILD C widget
    ;

voidFunction
    : CHARS OPENTEXT CLOSETEXT      #CallFunction
    | OPENTEXT CLOSETEXT block      #FunctionBlock
    ;
center
    : CENTER OPENTEXT centerWidgetArgs CLOSETEXT
    ;
centerWidgetArgs
    : CHILD C widget
    ;

setState:
    SETSTATE OPENTEXT OPENTEXT CLOSETEXT block CLOSETEXT SEMICOLON
    ;

