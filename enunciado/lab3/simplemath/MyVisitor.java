
public class MyVisitor extends SimpleMathBaseVisitor<Integer> {
    @Override
    public Integer visitRoot(final SimpleMathParser.RootContext ctx) {
        System.out.println("I'm visiting root");
        return 0;
    }
}
