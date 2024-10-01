package AST.CodeAttributes;

import AST.Expression.Expression;
import AST.Node.NodeType;

public class ElseIfStatement extends CodeAttributes{

    Expression exp;
    Block block;

    public ElseIfStatement(Expression exp, Block block, int lineNumber) {
        this.exp = exp;
        this.block = block;

        this.nodeName = "ElseIfStatement";
        this.nodeType = NodeType.CodeAttribute;
        this.lineNumber = lineNumber;
        this.childCount = 0;

    }

    @Override
    public String toString() {
        return "ElseIfStatement{" +
                "exp=" + exp +
                ", block=" + block +
                '}';
    }

    @Override
    public String codeGeneration() {
        return "else if (" +
                exp.codeGeneration() +
                ") " +
                block.codeGeneration();
    }
}

// else if(exp) {...}