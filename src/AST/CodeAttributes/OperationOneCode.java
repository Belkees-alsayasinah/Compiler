package AST.CodeAttributes;

import AST.Expression.Expression;
import AST.Expression.OperationOne;
import AST.Node.NodeType;

public class OperationOneCode extends CodeAttributes {
    public OperationOne expression;

    public OperationOneCode(OperationOne expression, int lineNumber) {
        this.expression = expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "OperationOneCode{\n" +
                "expression=" + expression +
                "}\n";
    }

    @Override
    public String codeGeneration() {
        return expression.codeGeneration() + ";";
    }


}
