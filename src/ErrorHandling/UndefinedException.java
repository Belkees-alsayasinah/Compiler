package ErrorHandling;

public class UndefinedException  extends Exception {
    public UndefinedException(int lineNumber, String message, String varName,String message2) {
        super("UndefinedException in line: " + lineNumber + ",\n"+message
                + varName+".\n"+ message2+"\n\n");
    }
}
