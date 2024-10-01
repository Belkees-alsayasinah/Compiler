package AST.Widget;

import AST.Node.Node;
import AST.Node.NodeType;

public class KeyValueWidget extends KeyValue { // Text("sdfd"); + Column(children: [])
    public Node value;

    public KeyValueWidget(String key, Node value, int lineNumber) {
        this.key = key;
        this.value = value;
        this.leftChild = value;
        this.lineNumber = lineNumber;
        this.nodeName = key;
        this.nodeType = NodeType.Widget;
    }

    @Override
    public String toString() {
        return "KeyValueWidget{\n" +
                "key='" + key + '\'' +
                ", value=" + value +
                "\n}";
    }

    @Override
    public String codeGeneration() {
        return key + "*" + value.codeGeneration();
    }
}
