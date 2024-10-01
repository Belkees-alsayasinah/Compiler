package SymbolTable;

import AST.Node.Node;

import java.util.HashMap;
import java.util.Map;

public class SymbolTableOnPressedFunction {
    String []buttonProperty = {"onPressed", "child"};

    public Map<String, Boolean> onPressed;

    public SymbolTableOnPressedFunction() {
        onPressed = new HashMap<>();
    }

    public void addOnPressed(String name, Boolean value) {
        onPressed.put(name, value);
    }

    public boolean checkRequiredProperties(){
        for(String button : buttonProperty){
            if(!onPressed.containsKey(button)){
                return false;
            }
        }
        return true;
    }
}
