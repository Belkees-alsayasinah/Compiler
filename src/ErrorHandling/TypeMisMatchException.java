package ErrorHandling;

import AST.Node.DataType;

public class TypeMisMatchException extends Exception {
    public TypeMisMatchException(int lineNumber, String varName, String typeVar, String exprType) {
        super("TypeMisMatchException in line: " + lineNumber + ", variable: "
                + varName + " has type: " + exprType + ".\npossible solution : Assign type " + typeVar + "\n");
    }
}
