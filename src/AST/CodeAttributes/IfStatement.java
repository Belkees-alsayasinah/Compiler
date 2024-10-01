package AST.CodeAttributes;

import AST.Expression.Expression;
import AST.Node.NodeType;

import java.util.ArrayList;
import java.util.List;

public class IfStatement extends CodeAttributes{
    Expression exp;
    Block block;
    public List<ElseIfStatement> elseIfStatementList;

    public IfStatement(Expression exp, Block block, List<ElseIfStatement> elseIfStatementList,int lineNumber) {
        this.exp = exp;
        this.block = block;
        this.elseIfStatementList = new ArrayList<>();

        this.nodeName = "IfStatement";
        this.nodeType = NodeType.CodeAttribute;
        this.lineNumber = lineNumber;
        this.childCount = 0;
        // lineNumber, childCount , nodeName, nodeType, leftChild
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (CodeAttributes child : this.elseIfStatementList){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        return "IfStatement{" +
                "exp=" + exp +
                ", block=" + block +
                ", elseIfStatementList=" + stringBuilder +
                '}';
    }

    @Override
    public String codeGeneration() {
        StringBuilder builder = new StringBuilder();
        builder.append("if (");
        builder.append(exp.codeGeneration());
        builder.append(") ");
        builder.append(block.codeGeneration());

        for (ElseIfStatement elseIfStatement : elseIfStatementList) {
            builder.append(elseIfStatement.codeGeneration());
        }


            builder.append("else ");
            builder.append(block.codeGeneration());

        return builder.toString();
    }
}
// if(exp){..}
// else if(){...}
// else {..}