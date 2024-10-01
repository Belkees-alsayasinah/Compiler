package AST.Widget;

import AST.Node.NodeType;

import java.util.List;

public class ColumnWidget extends Widget{


    public List<KeyValue> columnProperties;

    public ColumnWidget(List<KeyValue> widgetProperties,int lineNumber) {
        this.columnProperties = widgetProperties;
        this.lineNumber = lineNumber;
        this.nodeName = "Column Widget";
        this.nodeType = NodeType.Widget;
        if(!widgetProperties.isEmpty()){
            this.leftChild = this.columnProperties.get(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (KeyValue child : this.columnProperties){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if(columnProperties.isEmpty()){
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
        codeGeneration.append("\t\t<div class=\"column\"");
        for(KeyValue node : this.columnProperties){
            //assign values to css and html
            String nodeCodeGeneration = node.codeGeneration();
            String key = nodeCodeGeneration.split("\\*")[0];
            String value = nodeCodeGeneration.split("\\*")[1];
            cssCodeGeneration.append(cssCodeGeneration(key, value));
            htmlCodeGeneration.append(htmlCodeGeneration(key, value));
        }
        if(cssCodeGeneration.length() != 0){
            codeGeneration.append(" style=\"height:100%; display:flex ; flex-direction: column; ").append(cssCodeGeneration).append("\"");
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
    }
}
