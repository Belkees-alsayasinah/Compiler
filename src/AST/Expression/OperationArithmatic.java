package AST.Expression;

import AST.Node.DataType;
import AST.Node.NodeType;

public class OperationArithmatic extends Expression{

    String operation;
    public OperationArithmatic(String operation, int lineNumber) {
        this.operation = operation;
        this.nodeName = "OperationArithmatic Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;

    }

    @Override
    public String toString() {
        return "Operation_if{" +
                "operation='" + operation + '\'' +
                '}';
    }
    @Override
    public String codeGeneration() {
        return operation;
    }
}
