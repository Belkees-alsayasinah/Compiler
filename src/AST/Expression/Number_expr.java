package AST.Expression;

import AST.Node.DataType;
import AST.Node.NodeType;

public class Number_expr extends Expression {
    int number;

    public Number_expr(int number, int lineNumber) {
        this.number = number;
        this.nodeName = "Number_expr Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
        this.expressionDataType = DataType.Integer;
    }

    @Override
    public String toString() {
        return "Number_expr{" +
                "number=" + number +
                '}';
    }

    @Override
    public String codeGeneration() {
        return String.valueOf(number);
    }
}
