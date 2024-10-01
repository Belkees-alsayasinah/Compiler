package AST.Expression;

import AST.Node.DataType;
import AST.Node.NodeType;

public class String_expr extends Expression {
    String string_expr;

    public String_expr(String string_expr, int lineNumber) {

        this.string_expr = string_expr;
        this.nodeName = "String_expr Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
        this.expressionDataType = DataType.String;
    }

    @Override
    public String toString() {
        return "String_expr{" +
                "string_expr='" + string_expr + '\'' +
                '}';
    }

    @Override
    public String codeGeneration() {
        return string_expr;
    }
}

