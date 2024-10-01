package SymbolTable;

import AST.Node.Node;
import org.antlr.v4.runtime.tree.ErrorNode;

import java.util.HashMap;
import java.util.Map;

public class SymbolTableUndefinedVar {
    public Map<String, Node> mapSymbol;

    public SymbolTableUndefinedVar() {
        this.mapSymbol = new HashMap<>();
    }

    public void addKeyValue(String key, Node value) {
        mapSymbol.put(key, value);
    }

    public Node getValue(String key) {
        return mapSymbol.get(key);
    }

    public void update(String key, Node value) {
        mapSymbol.put(key, value);
    }


//    public boolean containsKey(String key) {
//        return mapSymbol.containsKey(key);
//    }

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("SymbolTable{\n");
//        for (String key : mapSymbol.keySet()) {
//            String value = mapSymbol.get(key).toString();
//            stringBuilder.append(key).append(" : ").append(value);
//            stringBuilder.append("\n");
//        }
//        stringBuilder.append("}");
//        return stringBuilder.toString();
//    }
}




