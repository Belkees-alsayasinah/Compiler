package ErrorHandling;

public class onPressedException extends Exception{
    public onPressedException(int lineNumber, String varName) {
        super("in line : " +lineNumber+ " , "+ varName+ " ");
    }
}

