package AST.Widget;


import AST.Node.NodeType;

import java.util.List;

public class Style extends Widget {


    public List<KeyValue> styleProperties;

    public Style(List<KeyValue> widgetProperties,int lineNumber) {
        this.styleProperties = widgetProperties;
        this.lineNumber = lineNumber;
        this.nodeName = "Style Widget";
        this.nodeType = NodeType.Widget;
        if(!widgetProperties.isEmpty()){
            this.leftChild = this.styleProperties.get(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (KeyValue child : this.styleProperties){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if(styleProperties.isEmpty()){
            stringBuilder.append("[]");
        }
        return ", styleProperties=\n" + stringBuilder +
                "\n}";
    }



    @Override
    public String codeGeneration() {
        //font-size: 10; color: red;
        StringBuilder cssCodeGeneration = new StringBuilder();
        for(KeyValue node : this.styleProperties){
            //assign values to css
            String nodeCodeGeneration = node.codeGeneration();
            String key = nodeCodeGeneration.split("\\*")[0];
            String value = nodeCodeGeneration.split("\\*")[1];
            cssCodeGeneration.append(cssCodeGeneration(key, value));
        }
        return cssCodeGeneration.toString();
    }

    private String cssCodeGeneration(String key, String value) {
        StringBuilder stringBuilder = new StringBuilder();
        if (key.equals("color")) {
            stringBuilder.append("color: ");
            String color = value.split("\\.")[1];
            stringBuilder.append(color).append("; ");
        }else if (key.equals("fontSize")) {
            stringBuilder.append("font-size: ");
            if (value.contains("$")){
                stringBuilder.append("'. ").append(value).append(". '").append("px").append("; ");
            } else {
                stringBuilder.append(value).append("px; ");
            }
        }
        return stringBuilder.toString();
    }
}