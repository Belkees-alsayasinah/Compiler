package main;

import ErrorHandling.ErrorPrinter;
import AST.Program;
import AST.Visitor;
import Grammar.FlutterLexer;
import Grammar.FlutterParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) {
        try {
            String[] path = {"Tests/try1.txt", "Tests/details.txt", "Tests/editPrice.txt","Tests/testError.txt"};
            for (int i = 0; i < path.length; i++) {
                CharStream input = fromFileName(path[i]);
                FlutterLexer lexer = new FlutterLexer(input);
                CommonTokenStream token = new CommonTokenStream(lexer);
                FlutterParser parser = new FlutterParser(token);
                ParseTree tree = parser.program();
                ErrorPrinter.initFile();
//            SymbolTable symbolTable = new SymbolTable();
                Visitor ProgramVisitor = new Visitor();
                Program program = (Program) ProgramVisitor.visit(tree);
                System.out.println(program);
                System.out.println("\n");
                codeGeneration(i + 1, program.codeGeneration());
            }
//            System.out.println(symbolTable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void codeGeneration(int index, String value) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("codeGeneration/page_" + index + ".php", false);
            int i = value.indexOf("echo");
            StringBuilder stringBuilder = new StringBuilder(value);
            if(i != -1){
                stringBuilder.insert(i , Use.state.toString());
            }
            fileWriter.write(stringBuilder.toString());
            Use.state.setLength(0);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
