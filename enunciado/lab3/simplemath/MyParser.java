import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

class MyParser {

    private static final boolean IS_DEBUG = Boolean.valueOf(System.getenv("useExpressionFromCode"));

    private static final String EXPRESSION_5 = "var a = 0;\n" +
            "var b = 15;\n" +
            "var c = d;\n" +
            "var d = a(10);\n" +
            "var e = d + 20;\n" +
            "var f = a * b + 10 / c;\n" +
            "func A (g) g + a * (2 + b);\n" +
            "func B (g, a) g * a + (f - e + 5) / 2;\n" +
            "func C (A) A - 3;\n" +
            "func D (B) B * A(e);\n" +
            "func E (g) g + A(g) * B(f, g);\n" +
            "func F (A) B + 32 * C(b);";

    private static final String EXPRESSION_6 = "func a (a) (32 * a + 5) / 3;\n" +
            "var a = 6;\n" +
            "var b = a(5);\n" +
            "func c(b) a + 10 * b;";

    public static void main(String args[]) throws Exception {
//        println("[MAIN] Starting");

        // create a CharStream that reads from standard input
        final CharStream input = getCharStream();

        // create a lexer that feeds off of input CharStream
        final SimpleMathLexer lexer = new SimpleMathLexer(input);

        // create a buffer of tokens pulled from the lexer
        final CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        final SimpleMathParser parser = new SimpleMathParser(tokens);

        // begin parsing at prog rule
        final ParseTree tree = parser.root();

        final MyVisitor myVisitor = new MyVisitor();
        myVisitor.visit(tree);

        final String compilationLog = myVisitor.getCompilationLog();
        System.out.print(compilationLog);

//        println("[MAIN] Finishing");
    }

    private static CharStream getCharStream() throws IOException {
        if (IS_DEBUG) {
            return CharStreams.fromString(EXPRESSION_6);
        }
        return CharStreams.fromStream(System.in);
    }

    private static void println(final String string) {
        System.out.println(string);
    }

}