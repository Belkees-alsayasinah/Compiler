package AST.Expression;

import AST.Node.DataType;
import AST.Node.NodeType;
import AST.Widget.KeyValueWidget;

import java.util.List;
import java.util.ArrayList;

public class List_exp extends Expression {
    public List<Expression> expressions;

    public List_exp(int lineNumber) {
        this.expressions =  new ArrayList<>();
        this.lineNumber = lineNumber;
        this.nodeName = "ListCodeAttribute";
        this.nodeType = NodeType.Expression;
        this.expressionDataType = DataType.List;

    }

    public void AddExpression(Expression expression){
        this.expressions.add(expression);
        this.childCount++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Expression child : this.expressions){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if(expressions.isEmpty()){
            stringBuilder.append("[]");
        }
        return ", Expression=\n" + stringBuilder +
                "\n}";
    }

    @Override
    public String codeGeneration() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.expressions.size(); i++) {
            stringBuilder.append(this.expressions.get(i).codeGeneration());
            if(i != this.expressions.size() - 1){
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
    //["c",4]
}
