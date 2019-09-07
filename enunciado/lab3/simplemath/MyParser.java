import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

class MyParser {

    public static void main(String args[]) throws Exception {
//        println("[MAIN] Starting");

        // create a CharStream that reads from standard input
        final CharStream input = CharStreams.fromStream(System.in);

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

    private static void println(final String string) {
        System.out.println(string);
    }

}