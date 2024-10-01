package AST.Expression;

import AST.Node.DataType;
import AST.Node.NodeType;
import AST.TopLevel.FunctionParameter;

import java.util.List;

public class CallFunction extends Expression {
    String call_name;


    public CallFunction(String call_name, int lineNumber) {
        this.call_name = call_name;
        this.nodeName = "call_function Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "CallFunction{" +
                "call_name='" + call_name + '\'' +
                '}';
    }

    @Override
    public String codeGeneration() {
        return call_name +
                "(" + ")" +
                ";";
    }
}
