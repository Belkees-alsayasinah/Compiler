package AST;

import AST.Node.Node;
import AST.Node.NodeType;
import main.Use;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node {

    public List<Node> programNodes ;

    public Program(int childCount, Node leftChild) {
        this.nodeName = "Root";
        this.nodeType = NodeType.Root;
        this.lineNumber = 1;
        this.childCount = childCount;
        this.leftChild = leftChild;
        this.programNodes = new ArrayList<>();
    }

    public void addProgramNode(Node node){
        this.programNodes.add(node);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node child : this.programNodes){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    @Override
    public String codeGeneration() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<?php\n");
        stringBuilder.append("session_start();\n");
        stringBuilder.append("\n");
        for (Node child : this.programNodes){
            stringBuilder.append(child.codeGeneration());
            stringBuilder.append("\n");
        }
        stringBuilder.append("?>");
        return stringBuilder.toString();
    }
}
