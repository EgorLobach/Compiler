import grammar.SetGrammarLexer;
import grammar.SetGrammarParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String currentDir = System.getProperty("user.dir");
            ANTLRInputStream input = new ANTLRFileStream(currentDir + "\\prog1.txt");
            SetGrammarLexer lexer = new SetGrammarLexer(input);
            SetGrammarParser parser = new SetGrammarParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            Visitor visitor = new Visitor();
            String output = (String) visitor.visit(tree);

            FileWriter fileWriter = new FileWriter("Program.java");
            fileWriter.write(output);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
