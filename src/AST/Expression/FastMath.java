package AST.Expression;

import AST.Node.DataType;
import AST.Node.NodeType;

public class FastMath extends Expression {
   public String name;
   public String operation;
   public int number;

    public FastMath(String name, String operation, int number, int lineNumber) {
        this.name = name;
        this.operation = operation;
        this.number = number;
        this.nodeName = "FastMath Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
        this.expressionDataType = DataType.Integer;
    }

    @Override
    public String toString() {
        return "FastMath{" +
                "name='" + name + '\'' +
                ", operation='" + operation + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public String codeGeneration() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        sb.append(name);
        sb.append(" ");
        sb.append(operation);
        sb.append(number);
        sb.append(";");
        return sb.toString();
    }
}


// x +=5;