package AST.Widget;

import AST.Node.NodeType;
import main.Use;

import java.util.List;

public class ElevatedButtonWidget extends Widget{

    public List<KeyValue> eButtonProperties;

    public ElevatedButtonWidget(List<KeyValue> widgetProperties,int lineNumber) {
        this.eButtonProperties = widgetProperties;
        this.lineNumber = lineNumber;
        this.nodeName = "elevated Button Widget";
        this.nodeType = NodeType.Widget;
        if(!widgetProperties.isEmpty()){
            this.leftChild = this.eButtonProperties.get(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (KeyValue child : this.eButtonProperties){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if(eButtonProperties.isEmpty()){
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
        codeGeneration.append("\t\t<button type=\"submit\" class=\"ElevatedButton\" name=\"ElevatedButton").append(Use.counter).append("\" ");
        for(KeyValue node : this.eButtonProperties){
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
        codeGeneration.append("\t\t</button>\n");
        return codeGeneration.toString();
    }

    private String cssCodeGeneration(String key, String value) {
        StringBuilder stringBuilder = new StringBuilder();
        if (key.equals("color")) {
            stringBuilder.append("background-color: ");
            String color = value.split("\\.")[1];
            stringBuilder.append(color).append("; ");
        }
        return stringBuilder.toString();
    }

    private String htmlCodeGeneration(String key, String value){
        StringBuilder stringBuilder = new StringBuilder();
        if (key.equals("child")) {
            stringBuilder.append(value);
        } else if(key.equals("onPressed")){
            Use.state.append("\t")
                    .append("\n" + "if (isset($_POST['ElevatedButton").append(Use.counter).append("'])) {\n\t")
                    .append(value).append("}\n");
            Use.counter++;
        }
        return stringBuilder.toString();
    }
}
