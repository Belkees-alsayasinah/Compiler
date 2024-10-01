package AST.CodeAttributes;

import AST.Expression.Expression;
import AST.Node.Node;
import AST.Node.NodeType;


public class PrintStatement extends CodeAttributes {
    Expression expr;

    public PrintStatement (Expression expr, int lineNumber) {
        this.expr = expr;
        this.nodeName = "PrintStatements CodeAttribute";
        this.nodeType = NodeType.CodeAttribute;
        this.lineNumber = lineNumber;
        this.childCount = 0;
    }

    @Override
    public String toString() {
        return "PrintStatement{" +
                "expr=" + expr +
                '}';
    }

    @Override
    public String codeGeneration() {
        StringBuilder builder = new StringBuilder();
        builder.append("echo ");
        builder.append(expr.codeGeneration());
        builder.append(";");
        return builder.toString();
    }
}

// echo $x;