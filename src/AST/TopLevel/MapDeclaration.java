package AST.TopLevel;

import AST.Expression.Expression;
import AST.Expression.List_exp;
import AST.Node.DataType;
import AST.Node.Node;
import AST.Node.NodeType;

public class MapDeclaration extends Node {
    DataType type;
    String id;
    Expression mapExpression;

    public MapDeclaration(DataType type, String id, Expression mapExpression,int lineNumber) {
        this.type = type;
        this.id = id;
        this.mapExpression = mapExpression;
        this.nodeName = "MapDeclaration";
        this.nodeType = NodeType.ListDeclaration;
        this.lineNumber = lineNumber;
        this.leftChild = mapExpression;
    }

    @Override
    public String toString() {
        return "ListDeclaration{\n" +
                "type=" + type +
                ", listExpression=" + mapExpression +
                "\n}";
    }


    @Override
    public String codeGeneration() {
        return "$" + id +
                " = " +
                this.mapExpression.codeGeneration() +
                ";";
    }
}
