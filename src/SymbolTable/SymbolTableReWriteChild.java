package SymbolTable;

import AST.Node.Node;

import javax.swing.text.View;
import java.util.HashMap;
import java.util.Map;

public class SymbolTableReWriteChild {
    public Map<String, Boolean> fatherType;

    public SymbolTableReWriteChild() {
        this.fatherType = new HashMap<>();
    }

    public void addVariable(String key,Boolean value){
        fatherType.put(key, value);
    }

    public boolean checkKey(String key){
        return fatherType.containsKey(key);
    }
}