package AST.Widget;

import AST.Expression.Expression;
import AST.Expression.String_expr;
import AST.Node.NodeType;

public class KeyValueExpr extends KeyValue{
    Expression expr;

    public KeyValueExpr(String key, Expression expr,int lineNumber) {
        this.key = key;
        this.expr = expr;
        this.lineNumber = lineNumber;
        this.nodeName = key;
        this.nodeType = NodeType.Expression;
        this.childCount = 1;
    }

    @Override
    public String toString() {
        return "KeyValueExpr{" +
                "key='" + key + '\'' +
                ", expr=" + expr +
                '}';
    }

    @Override
    public String codeGeneration() {
        return key + "*" + expr.codeGeneration();
    }
}
