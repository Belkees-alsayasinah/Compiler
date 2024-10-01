package AST.CodeAttributes;

import AST.Node.Node;
import AST.Node.NodeType;

public class SetState  extends Node {

    Block block;

    public SetState(Block block,int lineNumber) {
        this.block = block;
        this.lineNumber = lineNumber;
        this.nodeName = "SetState Widget";
        this.nodeType = NodeType.Widget;
    }

    @Override
    public String toString() {
        return "SetStateWidget{" +
                "block=" + block +
                '}';
    }

    @Override
    public String codeGeneration() {
        block.isState = true;
        int length = block.codeGeneration().length();
        String value = block.codeGeneration().substring(1,length-2);
        StringBuilder codeGeneration = new StringBuilder();
        codeGeneration.append(value).append("\n");
        return codeGeneration.toString();
    }
}