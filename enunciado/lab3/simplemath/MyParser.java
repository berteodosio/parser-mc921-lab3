import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

class MyParser {

    private static final boolean IS_DEBUG = false;

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
            return CharStreams.fromString("func a(x) 2 + x * 5;");
        }
        return CharStreams.fromStream(System.in);
    }

    private static void println(final String string) {
        System.out.println(string);
    }

}