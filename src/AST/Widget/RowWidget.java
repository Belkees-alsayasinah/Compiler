package AST.Widget;

import AST.Node.NodeType;

import java.util.List;

public class RowWidget extends Widget{

    public List<KeyValue> rowProperties;

    public RowWidget(List<KeyValue> widgetProperties,int lineNumber) {
        this.rowProperties = widgetProperties;
        this.lineNumber = lineNumber;
        this.nodeName = "Row Widget";
        this.nodeType = NodeType.Widget;
        if(!widgetProperties.isEmpty()){
            this.leftChild = this.rowProperties.get(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (KeyValue child : this.rowProperties){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if(rowProperties.isEmpty()){
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
        codeGeneration.append("\t\t<div class=\"row\"");
        for(KeyValue node : this.rowProperties){
            //assign values to css and html
            String nodeCodeGeneration = node.codeGeneration();
            String key = nodeCodeGeneration.split("\\*")[0];
            String value = nodeCodeGeneration.split("\\*")[1];
            cssCodeGeneration.append(cssCodeGeneration(key, value));
            htmlCodeGeneration.append(htmlCodeGeneration(key, value));
        }
        if(cssCodeGeneration.length() != 0){
            codeGeneration.append(" style=\"width:100%; display:flex ; flex-direction: row; ").append(cssCodeGeneration).append("\"");
        }
        codeGeneration.append(">\n\t");
        codeGeneration.append("\t").append(htmlCodeGeneration);
        codeGeneration.append("\t\t</div>\n");
        return codeGeneration.toString();
    }


    private String cssCodeGeneration(String key, String value) {
        StringBuilder stringBuilder = new StringBuilder();
        switch (key) {
            case "mainAxisAlignment":
                stringBuilder.append("justify-content: ");
                String width = value.split("\\.")[1];
                switch (width) {
                    case "spaceBetween":
                        width = "space-between";
                        break;
                    case "spaceAround":
                        width = "space-around";
                        break;
                    case "spaceEvenly":
                        width = "space-evenly";
                        break;
                }
                stringBuilder.append(width).append("; ");
                break;
            case "crossAxisAlignment":
                stringBuilder.append("align-items: ");
                String crossAxis = value.split("\\.")[1];
                stringBuilder.append(crossAxis).append("; ");
                break;
        }
        return stringBuilder.toString();
    }

    private String htmlCodeGeneration(String key, String value){
        StringBuilder stringBuilder = new StringBuilder();
        if (key.equals("children")) {
            stringBuilder.append(value);
        }
        return stringBuilder.toString();
    }}
