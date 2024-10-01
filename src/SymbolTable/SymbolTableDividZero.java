package SymbolTable;

import AST.Node.Node;
import java.util.HashMap;
import java.util.Map;

public class SymbolTableDividZero {

    public Map<String, Node> dividZero;

    public SymbolTableDividZero() {
        this.dividZero = new HashMap<>();
    }

    public void addVariable(String key, Node value) {
        dividZero.put(key, value);
    }

    public boolean getExpression(String val) {
        if (val.equals("0")) {
            return true;
        }
        return false;
    }


}
