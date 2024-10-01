package AST.Widget;

import AST.Node.NodeType;

import java.util.List;

public class ScaffoldWidget extends Widget {
    public List<KeyValue> scaffoldProperties;

    public ScaffoldWidget(List<KeyValue> widgetProperties, int lineNumber) {
        this.scaffoldProperties = widgetProperties;
        this.lineNumber = lineNumber;
        this.nodeName = "Scaffold Widget";
        this.nodeType = NodeType.Widget;
        if (!widgetProperties.isEmpty()) {
            this.leftChild = this.scaffoldProperties.get(0);
        }
        this.childCount = widgetProperties.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (KeyValue child : this.scaffoldProperties) {
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if (scaffoldProperties.isEmpty()) {
            stringBuilder.append("[]");
        }
        return "ScaffoldWidget{" +
                "scaffoldProperties=\n" + stringBuilder +
                "}";
    }

    @Override
    public String codeGeneration() {
        StringBuilder codeGeneration = new StringBuilder();
        StringBuilder htmlCodeGeneration = new StringBuilder();
        StringBuilder cssCodeGeneration = new StringBuilder();
        codeGeneration.append("\t\t<div class=\"scaffold-body\"");
        for(KeyValue node : this.scaffoldProperties){
            //assign values to css and html
            String nodeCodeGeneration = node.codeGeneration();
            String key = nodeCodeGeneration.split("\\*")[0];
            String value = nodeCodeGeneration.split("\\*")[1];
            cssCodeGeneration.append(cssCodeGeneration(key, value));
            htmlCodeGeneration.append(htmlCodeGeneration(key, value));
        }
        if(cssCodeGeneration.length() != 0){
            codeGeneration.append(" style=\"").append(cssCodeGeneration).append("\"");
        }
        codeGeneration.append(">\n\t");
        codeGeneration.append("\t").append(htmlCodeGeneration);
        codeGeneration.append("\t\t</div>\n");
        return codeGeneration.toString();
    }

    private String cssCodeGeneration(String key, String value) {
        StringBuilder stringBuilder = new StringBuilder();
        if (key.equals("backgroundColor")) {
            stringBuilder.append("background-color: ");
            String color = value.split("\\.")[1];
            stringBuilder.append(color).append("; ");
        }
        return stringBuilder.toString();
    }

    private String htmlCodeGeneration(String key, String value){
        StringBuilder stringBuilder = new StringBuilder();
        if (key.equals("body")) {
            stringBuilder.append(value);
        }
        return stringBuilder.toString();
    }
}
