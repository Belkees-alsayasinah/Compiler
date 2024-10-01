package AST.Widget;

import AST.Node.NodeType;

import java.util.List;

public class ContainerWidget extends Widget{

    public List<KeyValue> containerProperties;

    public ContainerWidget(List<KeyValue> widgetProperties,int lineNumber) {
        this.containerProperties = widgetProperties;
        this.lineNumber = lineNumber;
        this.nodeName = "Container Widget";
        this.nodeType = NodeType.Widget;
        if(!widgetProperties.isEmpty()){
            this.leftChild = this.containerProperties.get(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (KeyValue child : this.containerProperties){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if(containerProperties.isEmpty()){
            stringBuilder.append("[]");
        }
        return ", widgetProperties=\n" + stringBuilder +
                "\n}";
    }
    @Override
    public String codeGeneration() {
        StringBuilder codeGeneration = new StringBuilder();
        StringBuilder htmlCodeGeneration = new StringBuilder();
        StringBuilder cssCodeGeneration = new StringBuilder();
        codeGeneration.append("\t\t<div class=\"container\"");
        for(KeyValue node : this.containerProperties){
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
        switch (key) {
            case "color":
                stringBuilder.append("background-color: ");
                String color = value.split("\\.")[1];
                stringBuilder.append(color).append("; ");
                break;
            case "width":
                stringBuilder.append("width: ");
                if (value.contains("$")){
                    stringBuilder.append("'. ").append(value).append(". '").append("px").append("; ");
                } else {
                    stringBuilder.append(value).append("px; ");
                }
                break;
            case "height":
                stringBuilder.append("height: ");
                if (value.contains("$")){
                    stringBuilder.append("'. ").append(value).append(". '").append("px").append("; ");
                } else {
                    stringBuilder.append(value).append("px; ");
                }
                break;
        }
        return stringBuilder.toString();
    }

    private String htmlCodeGeneration(String key, String value){
        StringBuilder stringBuilder = new StringBuilder();
        if (key.equals("child")) {
            stringBuilder.append(value);
        }
        return stringBuilder.toString();
    }

}
