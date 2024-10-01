package AST.TopLevel;

import AST.Node.DataType;
import AST.Node.Node;
import AST.Node.NodeType;
import AST.CodeAttributes.Block;

import java.util.List;

public class Function extends Node {
    public List<FunctionParameter> functionParameterList;
    DataType type;
    Block block;
    String identifier;

    public Function(List<FunctionParameter> functionParameterList, DataType type, Block block, String identifier, int lineNumber) {
        this.functionParameterList = functionParameterList;
        this.type = type;
        this.block = block;
        this.identifier = identifier;
        this.nodeName = "Function Declaration";
        this.nodeType = NodeType.FunctionDeclaration;
        if(this.functionParameterList.isEmpty()){
            this.leftChild = block;
        } else {
            this.leftChild = this.functionParameterList.get(0);
        }
        this.childCount = this.functionParameterList.size() + 1;
    }

    @Override
    public String toString() {
        return "Function{\n" +
                "identifier='" + identifier + '\'' +
                ", type=" + type +
                ", functionParameterList :\n" + functionParameterList +
                ", block: " + block +
                "\n}";
    }

    @Override
    public String codeGeneration() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("function ").append(this.identifier).append("(");
        for (int i = 0; i < this.functionParameterList.size(); i++) {
            stringBuilder.append(this.functionParameterList.get(i).codeGeneration());
            if (i != this.functionParameterList.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(")").append(this.block.codeGeneration());
        return stringBuilder.toString();
    }
}
