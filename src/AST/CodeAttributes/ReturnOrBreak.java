package AST.CodeAttributes;

import AST.Expression.Expression;
import AST.Node.NodeType;

public class ReturnOrBreak extends CodeAttributes{
    Expression expression;
    String keyWord;

    public ReturnOrBreak(Expression expression, String keyWord, int lineNumber) {
        this.nodeName = "ReturnOrBreak";
        this.nodeType = NodeType.CodeAttribute;
        this.lineNumber = lineNumber;
        this.childCount = 0;
        if(expression != null){
            this.expression = expression;
            this.leftChild = expression;
        }
        this.keyWord = keyWord;
    }

    @Override
    public String toString() {
        return "ReturnOrBreak{" +
                "expression=" + expression +
                ", keyWord='" + keyWord + '\'' +
                '}';
    }

    @Override
    public String codeGeneration() {
        StringBuilder builder = new StringBuilder();
        builder.append(keyWord);
        if (expression != null) {
            builder.append(" ");
            builder.append(expression.codeGeneration());
        }
        builder.append(";");
        return builder.toString();
    }
}


// return x;
// break;