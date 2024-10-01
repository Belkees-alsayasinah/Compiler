package AST.Expression;

import AST.Node.NodeType;

public class CharsExpression extends Expression{
    String id;

    public CharsExpression(String id, int lineNumber) {
        this.id = id;
        this.nodeName = "CharsExpression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
        this.childCount = 0;
    }

    @Override
    public String toString() {
        return "CharsExpression{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    public String codeGeneration() {
        return id;
    }
}
