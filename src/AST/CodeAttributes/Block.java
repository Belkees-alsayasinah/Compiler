package AST.CodeAttributes;

import AST.Expression.FastMath;
import AST.Expression.OperationOne;
import AST.Node.Node;
import AST.Node.NodeType;

import java.util.ArrayList;
import java.util.List;

public class Block extends CodeAttributes{
    public boolean isState = false;
    List<Node> codeAttributes;

    public Block(List<Node> codeAttributes,int lineNumber) {
        this.codeAttributes = codeAttributes;
        this.nodeName = "Block";
        this.nodeType = NodeType.CodeAttribute;
        this.lineNumber = lineNumber;
        this.childCount = codeAttributes.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node child : this.codeAttributes){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        return "Block{" +
                "codeAttributes=" + stringBuilder +
                '}';
    }

    @Override
    public String codeGeneration() {
        StringBuilder builder = new StringBuilder();
        builder.append("{\n");
        for (Node child : this.codeAttributes){
            builder.append(child.codeGeneration());
            if(child instanceof SetState){
               isState = true;
            }
            if(isState){
                System.out.println(child.getClass().toString());
                if(child instanceof Assignment) {
                    builder.append("\n$_SESSION['").append(((Assignment) child).char1)
                            .append("'] = ").append(((Assignment) child).expr.codeGeneration()).append(";\n");
                    builder.append("$").append(((Assignment) child).char1).append(" = ");
                    builder.append("$_SESSION['").append(((Assignment) child).char1)
                            .append("'];\n");
                } if(child instanceof OperationOneCode){
                    builder.append("\n$_SESSION['").append(((OperationOneCode) child).expression.chars)
                            .append("']").append(((OperationOneCode) child).expression.operation).append(";\n");
                    builder.append("$").append(((OperationOneCode) child).expression.chars).append(" = ");
                    builder.append("$_SESSION['").append(((OperationOneCode) child).expression.chars)
                            .append("'];\n");
                }if(child instanceof FastMath){
                    builder.append("\n$_SESSION['").append(((FastMath) child).name)
                            .append("']").append(((FastMath) child).operation).append(((FastMath) child).number).append(";\n");
                    builder.append("$").append(((FastMath) child).name).append("=");
                    builder.append("$_SESSION['").append(((FastMath) child).name)
                            .append("'];\n");
                }
            }
            builder.append("\n");
        }
        builder.append("}\n");
        return builder.toString();
    }
}