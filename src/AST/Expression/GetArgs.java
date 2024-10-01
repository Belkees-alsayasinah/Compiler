package AST.Expression;

import AST.Node.NodeType;

public class GetArgs extends Expression {
    Expression expression;

    public GetArgs(Expression expression, int lineNumber) {
        this.expression = expression;
        this.lineNumber = lineNumber;
        this.childCount = 1;
        this.nodeName = "GetArguments";
        this.nodeType = NodeType.Expression;
        if (expression != null) {
            this.leftChild = expression;
        }
    }

    @Override
    public String toString() {
        return "GetArguments{" +
                "expression=" + expression +
                '}';
    }

    @Override
    public String codeGeneration() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("$_GET").append("[");

        if (this.expression != null) {
            stringBuilder.append(this.expression.codeGeneration());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

//$_GET['name']
