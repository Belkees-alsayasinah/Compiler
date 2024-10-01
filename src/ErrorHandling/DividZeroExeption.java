package ErrorHandling;

public class DividZeroExeption extends Exception {
    public DividZeroExeption(int lineNumber, String varName) {
        super("in line : " +lineNumber+ " , "+ varName+ " \n\n");
    }
}
