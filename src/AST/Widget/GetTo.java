package AST.Widget;

import AST.Node.Node;
import AST.Node.NodeType;

import java.util.List;

public class GetTo extends Node {

    public List<KeyValue> Properties;

    public GetTo(List<KeyValue> getProperties, int lineNumber) {
        this.Properties = getProperties;
        this.lineNumber = lineNumber;
        this.nodeName = "Get to";
        this.nodeType = NodeType.Widget;
        if (!getProperties.isEmpty()) {
            this.leftChild = this.Properties.get(0);
        }
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        for (KeyValue child : this.Properties) {
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if (Properties.isEmpty()) {
            stringBuilder.append("[]");
        }
        return ", getProperties=\n" + stringBuilder +
                "\n}";
    }


    @Override
    public String codeGeneration() {
        StringBuilder codeGeneration = new StringBuilder();
        StringBuilder pageNameCodeGeneration = new StringBuilder();
        StringBuilder argumentsCodeGeneration = new StringBuilder();
        for (KeyValue node : this.Properties) {
            //assign values to css and html
            String nodeCodeGeneration = node.codeGeneration();
            String key = nodeCodeGeneration.split("\\*")[0];
            String value = nodeCodeGeneration.split("\\*")[1];
            pageNameCodeGeneration.append(pageNameCodeGeneration(key, value));
            argumentsCodeGeneration.append(argumentsCodeGeneration(key, value));
        }
        codeGeneration.append(argumentsCodeGeneration);
        String val = pageNameCodeGeneration.toString().replaceAll("\"","");
        codeGeneration.append("\t\theader(\"Location: ").append(val).append("?$parm\");\n" + "\t\texit;");
        return codeGeneration.toString();
    }

    private String pageNameCodeGeneration(String key, String value) {
        StringBuilder stringBuilder = new StringBuilder();
        if (key.equals("data")) {
            stringBuilder.append(value);
        }
        return stringBuilder.toString();
    }

    private String argumentsCodeGeneration(String key, String value) {
        StringBuilder stringBuilder = new StringBuilder();
        if (key.equals("arguments")) {
            stringBuilder.append("$par = ").append(value).append(";\n");
            stringBuilder.append("$parm = http_build_query($par);\n");
        }
        return stringBuilder.toString();
    }
}
