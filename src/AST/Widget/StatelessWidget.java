package AST.Widget;

import AST.Node.Node;
import AST.Node.NodeType;

public class StatelessWidget extends Widget {
    public BuildMethod buildMethod;
    String n_Class;
    String chars;
    String extend;
    String stateless_name;

    public StatelessWidget(String n_Class, String chars, String extend, String stateless_name, BuildMethod buildMethod, int lineNumber) {
        this.n_Class = n_Class;
        this.chars = chars;
        this.extend = extend;
        this.stateless_name = stateless_name;
        this.buildMethod = buildMethod;
        this.lineNumber = lineNumber;
        this.nodeName = "Stateless Widget";
        this.nodeType = NodeType.Widget;
        this.leftChild = buildMethod;
    }

    @Override
    public String toString() {
        return "StatelessWidget{" +
                "n_Class='" + n_Class + '\'' +
                ", chars='" + chars + '\'' +
                ", extend='" + extend + '\'' +
                ", stateless_name='" + stateless_name + '\'' +
                ", buildMethod= {" + buildMethod +
                '}';
    }

    @Override
    public String codeGeneration() {
        return "echo'\n" +
                "<html>\n\t" +
                buildMethod.codeGeneration() + "\n<html>\n';";
    }
}


//public class ImageWidget extends Widget{
//    public List<KeyValueWidget> imageProperties;
//
//    public ImageWidget(List<KeyValueWidget> widgetProperties,int lineNumber) {
//        this.imageProperties = widgetProperties;
//        this.lineNumber = lineNumber;
//        this.nodeName = "Image Widget";
//        this.nodeType = NodeType.Widget;
//        if(!widgetProperties.isEmpty()){
//            this.leftChild = this.imageProperties.get(0);
//        }
//    }