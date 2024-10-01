package AST.TopLevel;

import AST.Expression.CharsExpression;
import AST.Node.Node;
import AST.Node.NodeType;

import java.util.List;

public class ClassDeclaration extends Node {
    boolean abstractClass;
    CharsExpression identifier;
    List<Node> classMember;

    public ClassDeclaration(List<Node> classMember, boolean abstractClass, CharsExpression identifier, int lineNumber) {
        this.classMember = classMember;
        this.abstractClass = abstractClass;
        this.identifier = identifier;
        this.nodeName = "ClassDeclaration";
        this.nodeType = NodeType.ClassDeclaration;
        if (!classMember.isEmpty()) {
            this.leftChild = this.classMember.get(0);
        }
        this.lineNumber = lineNumber;
        this.childCount = classMember.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node child : this.classMember) {
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if (this.classMember.isEmpty()) {
            stringBuilder.append("[]");
        }
        return "ClassDeclaration{\n" +
                "abstractClass=" + abstractClass +
                ", identifier='" + identifier + '\'' +
                ", classMember=" + stringBuilder +
                "\n}";
    }

    @Override
    public String codeGeneration() {
        StringBuilder stringBuilder = new StringBuilder();

        if (this.abstractClass) {
            stringBuilder.append("abstract ");
        }
        stringBuilder.append("class ").append(" ").append(this.identifier.codeGeneration()).append("{");
        stringBuilder.append("\n");

        for (int i = 0; i < this.classMember.size(); i++) {
            stringBuilder.append(this.classMember.get(i).codeGeneration()).append("\n");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}


//Abstract Class ddd{...}


