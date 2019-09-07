public class MyVisitor extends SimpleMathBaseVisitor<Integer> {
    @Override
    public Integer visitRoot(final SimpleMathParser.RootContext ctx) {
        println("visitRoot()");
        handleRootExpression(ctx);
        return 0;
    }

    private void handleRootExpression(final SimpleMathParser.RootContext ctx) {
        println("Read expression is [" + ctx.getText() + "]");
    }

    private static void println(final String string) {
        System.out.println(string);
    }
}
