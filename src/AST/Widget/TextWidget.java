package AST.Widget;

import AST.Node.NodeType;

import java.util.List;


public class TextWidget extends Widget{

    public List<KeyValue> textProperties;

    public TextWidget(List<KeyValue> widgetProperties,int lineNumber) {
        this.textProperties = widgetProperties;
        this.lineNumber = lineNumber;
        this.nodeName = "Text Widget";
        this.nodeType = NodeType.Widget;
        if(!widgetProperties.isEmpty()){
            this.leftChild = this.textProperties.get(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (KeyValue child : this.textProperties){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if(textProperties.isEmpty()){
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
        codeGeneration.append("\t\t<p ");
        for(KeyValue node : this.textProperties){
            //assign values to css and html
            String nodeCodeGeneration = node.codeGeneration();
            String key = nodeCodeGeneration.split("\\*")[0];
            String value = nodeCodeGeneration.split("\\*")[1];
            cssCodeGeneration.append(cssCodeGeneration(key, value));
            htmlCodeGeneration.append(htmlCodeGeneration(key, value)); //body
        }
        if(cssCodeGeneration.length() != 0){
            codeGeneration.append(" style=\"").append(cssCodeGeneration).append("\"");
        }
        codeGeneration.append(">");
        codeGeneration.append(htmlCodeGeneration);
        codeGeneration.append("</p>\n");
        return codeGeneration.toString();
    }

    private String cssCodeGeneration(String key, String value) {
        StringBuilder stringBuilder = new StringBuilder();
        if (key.equals("style")) {
            stringBuilder.append(value);
        }
        return stringBuilder.toString();
    }

    private String htmlCodeGeneration(String key, String value){
        StringBuilder stringBuilder = new StringBuilder();
        if (key.equals("data")) {
            if (value.contains("$")){
                stringBuilder.append("'. ").append(value).append(". '");
            } else {
                String s = value.replaceAll("\"", " ");
                stringBuilder.append(s);
            };
        }
        return stringBuilder.toString();
    }
}
