package AST.Widget;

import AST.Node.Node;
import AST.Node.NodeType;

public class GetBack extends Node {


    public GetBack(int lineNumber) {
        this.lineNumber = lineNumber;
        this.nodeName = "Get to";
        this.nodeType = NodeType.Widget;
    }

    @Override
    public String toString() {
        return "GetBack{}";
    }

    @Override
    public String codeGeneration() {
        return null;
    }
}
