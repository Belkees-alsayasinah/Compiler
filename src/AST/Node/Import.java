package AST.Node;

public class Import extends Node {
    String value;

    public Import(String value, int lineNumber) {
        this.lineNumber = lineNumber;
        this.nodeName = "Import";
        this.nodeType = NodeType.Import;
        this.childCount = 0;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Import{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public String codeGeneration() {
        return value;
    }
}
