package AST.Expression;

import AST.Node.DataType;
import AST.Node.NodeType;

public class OperationExpression extends Expression {
    Expression left;
    Expression right;
    String operation;

    public OperationExpression(Expression left, Expression right, String operation, int lineNumber) {
        this.left = left;
        this.right = right;
        this.operation = operation;
        this.nodeName = "OperationExpression Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
        this.expressionDataType = DataType.Integer;

    }

    @Override
    public String toString() {
        return "OperationExpression{" +
                "left=" + left +
                ", right=" + right +
                ", operation='" + operation + '\'' +
                '}';
    }

    //x + 4
    @Override
    public String codeGeneration() {

        return left.codeGeneration() + " " + operation + " " + right.codeGeneration();
    }
}

