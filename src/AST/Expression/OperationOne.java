package AST.Expression;

import AST.Node.DataType;

public class OperationOne extends Expression {
    public String chars;
    public String operation;

    public OperationOne(String chars, String operation,int lineNumber) {
        this.chars = chars;
        this.operation = operation;
        this.lineNumber = lineNumber;
        this.expressionDataType = DataType.Integer;
    }

    @Override
    public String toString() {
        return "OperationOne{" +
                "chars='" + chars + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }

    @Override
    public String codeGeneration() {
        return "$" + chars + operation;
    }
}

//$x ++;