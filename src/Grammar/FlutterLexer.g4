lexer grammar FlutterLexer;

//Flutter
SETSTATE: 'setState';
GET: 'Get';
TO: 'to';
BACK: 'back';
OFALL: 'offAll';
EXTENDS : 'extends';
STATELESSWIDGET: 'StatelessWidget';
OVERRIDE: '@override';
STATE: 'state';
CREATESTATE: 'createState';
WIDGET: 'Widget';
BUILD: 'build';
BUILDCONTEXT: 'BuildContext';
CONTEXT: 'context';
COLUMN:'Column';
E_BUTTON : 'ElevatedButton';
ROW: 'Row';
CONTAINER:'Container';
CHILDREN:'children';
IMAGEASSETS:'Image.assets';
IMAGE: 'Image';
CHILD: 'child';
TEXT:'Text';
SCAFFOLD: 'Scaffold';
BODY: 'body';
COLOR: 'color';
COLORS: 'Colors';
HEIGHT: 'height';
WIDTH: 'width';
ON_PRESSED:'onPressed';
CENTER: 'Center';
BACK_COLOR : 'backgroundColor';
MAINAXISALIGNMENT_KEY : 'mainAxisAlignment';
MAINAXISALIGNMENT_VALUE : 'MainAxisAlignment';
CROSSAXISALIGNMENT_KEY : 'crossAxisAlignment';
CROSSAXISALIGNMENT_VALUE : 'CrossAxisAlignment' ->pushMode(CrossAxis);

MAINAXISSIZE_KEY : 'mainAxisSize';
MAINAXISSIZE_VALUE : 'MainAxisSize';
MAINAXISALIGNMENT_VALUES : ('center' | 'start' | 'end' | 'spaceBetween' | 'spaceAround' | 'spaceEvenly');
MAINAXISSIZE_VALUES : ('min' | 'max');
COLORS_VALUES: ('red' | 'green' | 'black' | 'white' | 'blue' | 'purple');
FONTSIZE : 'fontSize';
STYLE : 'style';
TEXTSTYLE : 'TextStyle';
ARGUMENTS: 'arguments';
GETARG:'Get.arguments';

VAR:'var';
INT: 'int';
STRING: 'String';
VOID: 'void';
DOUBLE: 'double';
BOOL: 'bool';


MAP: 'Map';
LIST:'List';
WHILE:'while';
FOR : 'for';


TRUE:'true';
FALSE:'false';
RETURN: 'return';
BREAK : 'break';

IMPORT: 'import';
PRINT :'print';
LENGTH: 'length';

CLASS:'class';
ABSTRACT:'abstract';

TEXTFIELD
    : 'TextField';
HINT_TEXT
    : 'hintText';
TEXTFIELD_CONTROLLER
    : 'controller';
FORM :'Form' ;


IF : 'if';
ELSE_IF : 'else if';
ELSE : 'else';



WS: [ \r\t\n]+ -> skip;


CB: ']';
OB:'[';
CURLYOPEN  : '{' ;
CURLYCLOSE : '}' ;
OPENTEXT: '(';
CLOSETEXT: ')';

C: ':';

SUM: '+';
DIVID: '/';
MULTIPLY : '*';
MINUS : '-';


SUMS : '++';
MINUSS : '--';


OR:'||';
AND : '&&';


SUM_EQUAL:'+=';
MINUS_EQUAL:'-=';
EQUALEQUAL : '==';
DIVID_EQUAL : '/=';
MULTIPLY_EQUAL : '*=';
NOT_EQUAL : '!=';
EQUAL: '=' ;

TAG_OPEN : '<';
TAG_CLOSE : '>';
TAG_OPEN_EQUAL : '<=';
TAG_CLOSE_EQUAL:'>=';


COMMA : ',' ;
SEMICOLON : ';';
DOT: '.' ;


SINGLE_QUOTE : '\'';
DOUBLE_QUOTE : '"';

LINE_COMMENT
    : '//' ~[\n\r]* -> skip
    ;
MULTI_LINE_COMMENTS
    : '/*' .*? '*/' -> skip
    ;


NUMBER: [0-9]+;
CHARS: [a-zA-Z][a-zA-Z0-9_]*;
STRING_EXP: DOUBLE_QUOTE (~[\n\r])*? DOUBLE_QUOTE;


mode CrossAxis;
WS_Cross
    : [ \t] -> channel(HIDDEN);
DOT_Cross
    : '.';
CROSSAXISALIGNMENT_VALUES : ('center' | 'start' | 'end') -> popMode
    ;