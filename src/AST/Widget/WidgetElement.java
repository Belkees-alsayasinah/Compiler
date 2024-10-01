package AST.Widget;

import AST.Node.NodeType;

public class WidgetElement extends Widget {
    String return_;
    Widget widget;

    public WidgetElement(String return_, Widget widget, int lineNumber) {
        this.return_ = return_;
        this.widget = widget;
        this.lineNumber = lineNumber;
        this.nodeType = NodeType.Widget;
    }

    @Override
    public String toString() {
        return "WidgetElement{" +
                "return_='" + return_ + '\'' +
                ", widget=" + widget +
                '}';
    }

    @Override
    public String codeGeneration() {
        return "\t<body>\n" + widget.codeGeneration() + "\n\t</body>";
    }
}
