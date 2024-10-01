package AST.Widget;

import AST.Node.NodeType;
import main.Use;

import java.util.List;

public class TextFieldWidget extends Widget {

    public List<KeyValue> textfieldProperties;

    public TextFieldWidget(List<KeyValue> widgetProperties, int lineNumber) {
        this.textfieldProperties = widgetProperties;
        this.lineNumber = lineNumber;
        this.nodeName = "Form Widget";
        this.nodeType = NodeType.Widget;
        if (!widgetProperties.isEmpty()) {
            this.leftChild = this.textfieldProperties.get(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (KeyValue child : this.textfieldProperties) {
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if (textfieldProperties.isEmpty()) {
            stringBuilder.append("[]");
        }
        return ", widgetProperties=\n" + stringBuilder +
                "\n}";
    }

    @Override
    public String codeGeneration() {
        StringBuilder codeGeneration = new StringBuilder();
        StringBuilder htmlCodeGeneration = new StringBuilder();
        codeGeneration.append("\t\t<input type=\"text\"");
        for (KeyValue node : this.textfieldProperties) {
            //assign values to css and html
            String nodeCodeGeneration = node.codeGeneration();
            String key = nodeCodeGeneration.split("\\*")[0];
            String value = nodeCodeGeneration.split("\\*")[1];
            htmlCodeGeneration.append(htmlCodeGeneration(key, value));
        }

        codeGeneration.append(htmlCodeGeneration);
        codeGeneration.append(">\n\t");
        return codeGeneration.toString();
    }


    private String htmlCodeGeneration(String key, String value) {
        StringBuilder stringBuilder = new StringBuilder();
        switch (key) {
            case "controller":
                stringBuilder.append(" value=");
                stringBuilder.append("\"'. ").append(value).append(". '\"");
                String keyPost = value.substring(1);
                Use.state.append("if (isset($_POST['").append(keyPost).append("'])) {\n\t");
                Use.state.append(value).append(" = ").append("$_POST['").append(keyPost).append("'];\n\t");
                Use.state.append("$_SESSION['").append(keyPost).append("'] = ").append(value).append(";\n}\n");
                break;
            case "hintText":
                stringBuilder.append(" placeholder=");
                if (value.contains("$")){
                    stringBuilder.append("'. ").append(value).append(". ';");
                } else {
                    stringBuilder.append(value);
                }
                stringBuilder.append(" name=");
                if (value.contains("$")){
                    stringBuilder.append("'. ").append(value).append(". ';");
                } else {
                    stringBuilder.append(value);
                }
                break;
        }
        return stringBuilder.toString();
    }
}
