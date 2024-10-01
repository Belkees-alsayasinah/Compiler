package ErrorHandling;

public class ReWriteBodyException extends Exception{
    public ReWriteBodyException(int lineNumber, String type){
        super("Rewrite child for the " + type + " in line : " + lineNumber + "\nplease delete the child that you don't use it\n\n");
    }
}
