package AST.CodeAttributes;

import AST.Node.NodeType;

public class number_attribute extends CodeAttributes {
    String att;

    public number_attribute(String att, int lineNumber) {
        this.att = att;
        this.nodeName = "number_attribute CodeAttribute";
        this.nodeType = NodeType.CodeAttribute;
        this.lineNumber = lineNumber;
        this.childCount = 0;
    }

    @Override
    public String toString() {
        return "number_attribute{" +
                "att='" + att + '\'' +
                '}';
    }

    @Override
    public String codeGeneration() {
        return att;    }
}
