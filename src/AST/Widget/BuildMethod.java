package AST.Widget;

import AST.Node.NodeType;

public class BuildMethod extends Widget {
    String override_;
    String widget_;
    String build;
    String buildContext;
    String context;
    WidgetElement widgetElement;


    public BuildMethod(String override_, String widget_, String build, String buildContext, String context, WidgetElement widgetElement,int lineNunber) {
        this.lineNumber = lineNunber;
        this.override_= override_;
        this.widget_ = widget_;
        this.build = build;
        this.buildContext = buildContext;
        this.context = context;
        this.widgetElement = widgetElement;
        this.nodeName = "Build Method";
        this.nodeType = NodeType.Widget;
    }

    @Override
    public String toString() {
        return "BuildMethod{" +
                "override_='" + override_ + '\'' +
                ", widget_='" + widget_ + '\'' +
                ", build='" + build + '\'' +
                ", buildContext='" + buildContext + '\'' +
                ", context='" + context + '\'' +
                ", widgetElement=" + widgetElement +
                '}';
    }

    @Override
    public String codeGeneration() {
        return widgetElement.codeGeneration();
    }
}
