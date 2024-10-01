package AST.Widget;

import AST.Node.NodeType;

import java.util.List;

public class FormWidget extends Widget {

    public List<KeyValue> formProperties;

    public FormWidget(List<KeyValue> widgetProperties, int lineNumber) {
        this.formProperties = widgetProperties;
        this.lineNumber = lineNumber;
        this.nodeName = "Form Widget";
        this.nodeType = NodeType.Widget;
        if (!widgetProperties.isEmpty()) {
            this.leftChild = this.formProperties.get(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (KeyValue child : this.formProperties) {
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if (formProperties.isEmpty()) {
            stringBuilder.append("[]");
        }
        return ", widgetProperties=\n" + stringBuilder +
                "\n}";
    }

    @Override
    public String codeGeneration() {
        StringBuilder codeGeneration = new StringBuilder();
        StringBuilder htmlCodeGeneration = new StringBuilder();
        codeGeneration.append("\t\t<form method=\"POST\" ");
        for (KeyValue node : this.formProperties) {
            //assign values to css and html
            String nodeCodeGeneration = node.codeGeneration();
            String key = nodeCodeGeneration.split("\\*")[0];
            String value = nodeCodeGeneration.split("\\*")[1];
            htmlCodeGeneration.append(htmlCodeGeneration(key, value));
        }

        codeGeneration.append(">\n\t");
        codeGeneration.append("\t").append(htmlCodeGeneration);
        codeGeneration.append("\t\t</form>\n");
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
