import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import static util.Util.println;

class MyParser {

    public static void main(String args[]) throws Exception {
        println("[MAIN] Starting");

        // create a CharStream that reads from standard input
        final CharStream input = CharStreams.fromStream(System.in);
        // create a lexer that feeds off of input CharStream
        final SimpleMathLexer lexer = new SimpleMathLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        final SimpleMathParser parser = new SimpleMathParser(tokens);
        final ParseTree tree = parser.root(); // begin parsing at prog rule

        final MyVisitor myVisitor = new MyVisitor();
        myVisitor.visit(tree);

        println("[MAIN] Finishing");
    }

}