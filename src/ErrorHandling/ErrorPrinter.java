package ErrorHandling;

import java.io.FileWriter;
import java.io.IOException;

public class ErrorPrinter {
    public static void initFile (){
        try {
            FileWriter fileWriter = new FileWriter("src/ErrorHandling/errorMessage.txt", false);
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void printError(Exception e){
        try {
            FileWriter fileWriter = new FileWriter("src/ErrorHandling/errorMessage.txt", true);
            fileWriter.write(e.getMessage());
            fileWriter.append("\n");
            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
