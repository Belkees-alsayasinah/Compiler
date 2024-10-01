package AST.CodeAttributes;

import AST.CodeAttributes.CodeAttributes;
import AST.Expression.Expression;
import AST.Node.Node;
import AST.Node.NodeType;

public class Assignment extends CodeAttributes {
    public String char1;
    public Expression expr;

    public Assignment(String char1, Expression expr, int lineNumber) {
        this.char1 = char1;
        this.expr = expr;
        this.nodeName = "Assignment CodeAttribute";
        this.nodeType = NodeType.CodeAttribute;
        this.lineNumber = lineNumber;
        this.childCount = 0;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "char1='" + char1 + '\'' +
                ", expr=" + expr +
                '}';
    }

    @Override
    public String codeGeneration() {

        return "$" + char1 + " = " + expr.codeGeneration() + ";";
    }
}

//$x=4;