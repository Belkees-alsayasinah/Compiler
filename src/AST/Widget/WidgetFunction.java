package AST.Widget;

import AST.CodeAttributes.Block;
import AST.Node.Node;
import AST.Node.NodeType;


public class WidgetFunction extends Node {
    Block block;

    public WidgetFunction(Block block, int lineNumber) {
        this.childCount = 1;
        this.leftChild = block;
        this.lineNumber = lineNumber;
        this.block = block;
        this.nodeName = "Widget Function";
        this.nodeType = NodeType.FunctionDeclaration;
    }


    @Override
    public String toString() {
        return "WidgetFunction{\n" +
                "block=" + block +
                "\n}";
    }

    @Override
    public String codeGeneration() {
        StringBuilder value = new StringBuilder(block.codeGeneration().replaceFirst("\\{", ""));
        value.deleteCharAt(value.length() - 2);
        return value.toString();
    }
}
