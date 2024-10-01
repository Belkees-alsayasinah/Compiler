package AST.Expression;

public class MapObject extends Expression{
    Expression key,value;

    public MapObject(Expression key, Expression value,int lineNumber) {
        this.lineNumber = lineNumber;
        this.key = key;
        this.value = value;
    }

    public Expression getKey() {
        return key;
    }

    public void setKey(Expression key) {
        this.key = key;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValueExpr{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public String codeGeneration() {
        return key.codeGeneration() + "_" + value.codeGeneration();
    }
}
