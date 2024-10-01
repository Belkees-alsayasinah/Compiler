package AST.Expression;

import AST.Node.DataType;
import AST.Node.NodeType;

public class BoolOperationExpression extends Expression{
    Expression left;
    Expression right;
    Operation_if operation;

    public BoolOperationExpression(Expression left, Expression right, Operation_if operation, int lineNumber) {
        this.left = left;
        this.right = right;
        this.operation = operation;
        this.nodeName = "OperationExpression Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
        this.expressionDataType = DataType.Boolean;

    }

    @Override
    public String toString() {
        return "BoolOperationExpression{" +
                "left=" + left +
                ", right=" + right +
                ", operation='" + operation + '\'' +
                '}';
    }

    @Override
    public String codeGeneration() {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        builder.append(left.codeGeneration());
        builder.append(" ");
        builder.append(operation.codeGeneration());
        builder.append(" ");
        builder.append(right.codeGeneration());
        builder.append(")");
        return builder.toString();
    }
}


//(x == 4)