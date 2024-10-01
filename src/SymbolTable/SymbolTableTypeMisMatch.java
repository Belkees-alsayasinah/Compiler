package SymbolTable;

import AST.Node.DataType;

import java.util.HashMap;
import java.util.Map;

public class SymbolTableTypeMisMatch {

    public Map<String, DataType> typeSymbol; //variable , type variable

    public SymbolTableTypeMisMatch() {
        typeSymbol = new HashMap<>();
    }

    public void addVariable(String name, DataType value) {
        typeSymbol.put(name, value);
    }

    public DataType getValueType(String name) {
        return typeSymbol.get(name);
    }
}