package AST.TopLevel;

import AST.Expression.Expression;
import AST.Expression.List_exp;
import AST.Node.DataType;
import AST.Node.Node;
import AST.Node.NodeType;

public class ListDeclaration extends Node {
    DataType type;
    String id;
    Expression listExpression;

    public ListDeclaration(DataType type, String id, Expression listExpression,int lineNumber) {
        this.type = type;
        this.id = id;
        this.listExpression = listExpression;
        this.nodeName = "ListDeclaration";
        this.nodeType = NodeType.ListDeclaration;
        this.lineNumber = lineNumber;
        this.leftChild = listExpression;
    }

    @Override
    public String toString() {
        return "ListDeclaration{\n" +
                "type=" + type +
                ", listExpression=" + listExpression +
                "\n}";
    }


    @Override
    public String codeGeneration() {
        return "$" + id +
                " = " +
                this.listExpression.codeGeneration() +
                ";";
        //return this.type + "[] " + this.listExpression.codeGeneration() + ";";
    }
}
