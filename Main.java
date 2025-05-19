import AST.ASTNode;
import AST.Program;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.BaseVisitor;
import java.io.File;
import java.io.IOException;
import src.antlr.AngularParser;
import src.antlr.AngularLexer;


import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    static void printAST(File file)throws IOException {
        String source = file.getPath();
        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        AngularParser.ProgramContext tree = parser.program();

        if (parser.getNumberOfSyntaxErrors() > 0 || tree == null) {
            System.err.println("❌ Failed to parse: " + file.getName() + " (syntax errors or no match with grammar)");
            return;
        }

        try {
            Program program = (Program) new BaseVisitor().visit(tree);
            System.out.println("✅ The Parser Output for " + file.getName() + " :");
            System.out.println(program);
        } catch (NullPointerException e) {
            System.err.println("💥 Visitor failed due to null node in tree for: " + file.getName());
            e.printStackTrace();
        }
    }
    static void printCSSAST(File file) throws IOException {
        String source = file.getPath();
        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        AngularParser.StylesheetContext tree = parser.stylesheet(); // لاحظ هنا الفرق

        if (parser.getNumberOfSyntaxErrors() > 0 || tree == null) {
            System.err.println("❌ Failed to parse CSS: " + file.getName() + " (syntax errors or no match with grammar)");
            return;
        }

        try {
            ASTNode cssAST = (ASTNode) new BaseVisitor().visit(tree);
            System.out.println("✅ The CSS Parser Output for " + file.getName() + " :");
            System.out.println(cssAST);
        } catch (NullPointerException e) {
            System.err.println("💥 Visitor failed due to null node in CSS for: " + file.getName());
            e.printStackTrace();
        }
    }


    static void getTests(String path) throws IOException {
        File folder = new File(path);

        if (!folder.exists() || !folder.isDirectory()) {
            System.err.println("❌ Directory not found or is not a directory: " + folder.getAbsolutePath());
            return;
        }

        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.err.println("📂 Directory is empty or inaccessible: " + folder.getAbsolutePath());
            return;
        }

        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().endsWith(".spec.ts")) continue;
            if (files[i].isFile()) {
                if (files[i].getName().contains("ts"))
                    printAST(files[i]);
                else if (files[i].getName().contains("html")) continue;
                else if (files[i].getName().endsWith("css"))
                    printCSSAST(files[i]);
                else continue;
            } else {
                getTests(files[i].getPath());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        getTests("C:/Users/pc/Desktop/newproject/newproject/newproject/Tset");

       // Main m=new Main();
    }
}
