package AST.Widget;

import AST.Node.Node;

import java.util.List;

public class KeyValueListWidget extends KeyValue{
    List<Widget> values;

    public KeyValueListWidget(String key, List<Widget> values,int lineNumber) {
        this.key = key;
        this.values = values;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node child : this.values){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if(values.isEmpty()){
            stringBuilder.append("[]");
        }
        return ", Node=\n" + stringBuilder +
                "\n}";
    }

    @Override
    public String codeGeneration() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node node : this.values) {
            stringBuilder.append(node.codeGeneration());
            stringBuilder.append("\n");
        }
        return key + "*" + stringBuilder;
    }
}
