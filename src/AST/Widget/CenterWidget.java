package AST.Widget;

import AST.Node.NodeType;

import java.util.List;

public class CenterWidget extends Widget {

    public List<KeyValue> centerProperties;

    public CenterWidget(List<KeyValue> widgetProperties, int lineNumber) {
        this.centerProperties = widgetProperties;
        this.lineNumber = lineNumber;
        this.nodeName = "Center Widget";
        this.nodeType = NodeType.Widget;
        if (!widgetProperties.isEmpty()) {
            this.leftChild = this.centerProperties.get(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (KeyValue child : this.centerProperties) {
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if (centerProperties.isEmpty()) {
            stringBuilder.append("[]");
        }
        return ", widgetProperties=\n" + stringBuilder +
                "\n}";
    }

    @Override
    public String codeGeneration() {
        StringBuilder codeGeneration = new StringBuilder();
        StringBuilder htmlCodeGeneration = new StringBuilder();
        codeGeneration.append("\t\t<div ");
        for (KeyValue node : this.centerProperties) {
            //assign values to css and html
            String nodeCodeGeneration = node.codeGeneration();
            String key = nodeCodeGeneration.split("\\*")[0];
            String value = nodeCodeGeneration.split("\\*")[1];
            htmlCodeGeneration.append(htmlCodeGeneration(key, value));
        }

        codeGeneration.append(" style=\"display:flex ;justify-content: center; align-items: center;").append("\"");

        codeGeneration.append(">\n\t");
        codeGeneration.append("\t").append(htmlCodeGeneration);
        codeGeneration.append("\t\t</div>\n");
        return codeGeneration.toString();
    }


    private String htmlCodeGeneration(String key, String value) {
        StringBuilder stringBuilder = new StringBuilder();
        if (key.equals("child")) {
            stringBuilder.append(value);
        }
        return stringBuilder.toString();
    }


}
