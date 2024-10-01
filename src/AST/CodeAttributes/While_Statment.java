package AST.CodeAttributes;

import AST.Expression.Expression;
import AST.Node.Node;
import AST.Node.NodeType;



public class While_Statment extends CodeAttributes {
    Expression expr;
    Block block;

    public While_Statment(  Expression expr, Block block,int lineNumber) {
        this.expr = expr;
        this.block = block;
        this.nodeName = "While_Statment CodeAttribute";
        this.nodeType = NodeType.CodeAttribute;
        this.lineNumber = lineNumber;
        this.childCount = 2;
    }

    @Override
    public String toString() {
        return "While_Statment{" +
                "expr=" + expr +
                ", block=" + block +
                '}';
    }

    @Override
    public String codeGeneration() {
        StringBuilder builder = new StringBuilder();
        builder.append("while (");
        builder.append(expr.codeGeneration());
        builder.append(") ");
        builder.append(block.codeGeneration());
        return builder.toString();
    }
}
//while(exp){...}