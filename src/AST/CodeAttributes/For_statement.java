package AST.CodeAttributes;

import AST.Expression.Expression;
import AST.Node.Node;
import AST.Node.NodeType;

public class For_statement extends CodeAttributes {

    Node for_first_part;
    Expression exp;
    Block block;

    public For_statement(Node for_first_part, Expression exp, Block block, int lineNumber) {
        this.for_first_part = for_first_part;
        this.exp = exp;
        this.block = block;
        this.nodeName = "For_statement";
        this.nodeType = NodeType.CodeAttribute;
        this.lineNumber = lineNumber;
        this.childCount = 0;
    }

    @Override
    public String toString() {
        return "For_statement{" +
                "for_first_part=" + for_first_part +
                ", exp=" + exp +
                ", block=" + block +
                '}';
    }

    @Override
    public String codeGeneration() {
        return "for (" +
                for_first_part.codeGeneration()
                +
                exp.codeGeneration() +
                "; " +
                exp.codeGeneration() +
                ") " +
                block.codeGeneration();
    }
}

//for(i=0 ; i ; i ) {}