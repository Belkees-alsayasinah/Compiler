package AST.TopLevel;

import AST.Expression.CharsExpression;
import AST.Expression.Expression;
import AST.Node.DataType;
import AST.Node.Node;
import AST.Node.NodeType;

public class VariableDeclaration extends Node {
    DataType type;
    CharsExpression id;
    Expression expression;

    public VariableDeclaration(DataType type, CharsExpression id, Expression expression, int lineNumber) {
        this.type = type;
        this.id = id;
        this.expression = expression;
        this.nodeName = "Variable Declaration";
        this.nodeType = NodeType.FunctionDeclaration;
        this.leftChild = id;
        this.lineNumber = lineNumber;
        this.childCount = 2;
    }

    @Override
    public String toString() {
        return "VariableDeclaration{" +
                "type=" + type +
                ", id=" + id +
                ", expression=" + expression +
                '}';
    }

    @Override
    public String codeGeneration() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("$").append(this.id.codeGeneration());
        if (this.expression != null) {
            stringBuilder.append(" = ").append(this.expression.codeGeneration());
        }
        stringBuilder.append(";");
        return stringBuilder.toString();
    }
}
