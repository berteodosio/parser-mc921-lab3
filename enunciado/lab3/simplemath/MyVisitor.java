import java.util.HashSet;
import java.util.Set;

public class MyVisitor extends SimpleMathBaseVisitor<Integer> {

    private final Set<String> declaredVariableIdentifiers = new HashSet<>();
    private final Set<DeclaredFunction> declaredFunctionIdentifiers = new HashSet<>();

    private final CompilationLog compilationLog = new CompilationLog();

    public String getCompilationLog() {
        return compilationLog.getFullLog();
    }

    @Override
    public Integer visitSVarDeclaration(final SimpleMathParser.SVarDeclarationContext ctx) {
        final String variableName = ctx.var_declaration().ID().getText();
        assertSymbolNotDeclared(variableName);

        declaredVariableIdentifiers.add(variableName);
        return super.visitSVarDeclaration(ctx);
    }

    @Override
    public Integer visitSFuncDeclaration(final SimpleMathParser.SFuncDeclarationContext ctx) {
        final String functionName = ctx.func_declaration().ID().getText();
        final int functionArgumentsCount = ctx.func_declaration().func_param_list().ID().size();
        assertSymbolNotDeclared(functionName);
        declaredFunctionIdentifiers.add(new DeclaredFunction(functionName, functionArgumentsCount));
        return super.visitSFuncDeclaration(ctx);
    }

    @Override
    public Integer visitFunc_invocation(final SimpleMathParser.Func_invocationContext ctx) {
        final String invokedFunctionName = ctx.ID().getText();
        final int invokedFunctionArgumentsCount = ctx.func_invocation_param_list().func_invocation_param().size();
        assertFunctionDeclaredBeforeInvocation(invokedFunctionName);
        assertInvokedFunctionArgumentsCountMatchDeclaredFunction(invokedFunctionName, invokedFunctionArgumentsCount);
        return super.visitFunc_invocation(ctx);
    }

    private void assertInvokedFunctionArgumentsCountMatchDeclaredFunction(final String invokedFunctionName,
                                                                          final int invokedFunctionArgumentsCount) {
        final DeclaredFunction declaredFunction = declaredFunctionIdentifiers
                .stream()
                .filter((DeclaredFunction d) -> d.name.equals(invokedFunctionName))
                .findFirst()
                .orElse(null);

        if (declaredFunction == null) {
            return;
        }

        if (declaredFunction.argumentsCount != invokedFunctionArgumentsCount) {
            compilationLog.addBadArgumentCount(invokedFunctionName);
        }
    }

    @Override
    public Integer visitDeclared_id(final SimpleMathParser.Declared_idContext ctx) {
        final String declaredIdentifier = ctx.ID().getText();
        assertDeclaredIdentifier(declaredIdentifier);
        return super.visitDeclared_id(ctx);
    }

    private boolean declaredFunctionSetContainsId(final String id) {
        return declaredFunctionIdentifiers
                .stream()
                .anyMatch((DeclaredFunction d) -> d.name.equals(id));
    }

    private void assertDeclaredIdentifier(final String declaredIdentifier) {
        if (!declaredVariableIdentifiers.contains(declaredIdentifier) && !declaredFunctionSetContainsId(declaredIdentifier)) {
            compilationLog.addSymbolUndeclaredMessage(declaredIdentifier);
            return;
        }

        if (declaredFunctionSetContainsId(declaredIdentifier)) {
            compilationLog.addBadUsedSymbolMessage(declaredIdentifier);
        }
    }

    private void assertFunctionDeclaredBeforeInvocation(final String invokedFunctionName) {
        if (!declaredFunctionSetContainsId(invokedFunctionName) && !declaredVariableIdentifiers.contains(invokedFunctionName)) {
            compilationLog.addSymbolUndeclaredMessage(invokedFunctionName);
            return;
        }

        if (declaredVariableIdentifiers.contains(invokedFunctionName)) {
            compilationLog.addBadUsedSymbolMessage(invokedFunctionName);
        }
    }

    private void assertSymbolNotDeclared(final String variableName) {
        if (symbolAlreadyDeclared(variableName)) {
            compilationLog.addSymbolAlreadyDeclaredMessage(variableName);
        }
    }

    private boolean symbolAlreadyDeclared(final String variableName) {
        return declaredVariableIdentifiers.contains(variableName) || declaredFunctionSetContainsId(variableName);
    }

    private static void println(final Object object) {
        System.out.println(object);
    }

    private static class DeclaredFunction {

        private final String name;
        private final int argumentsCount;

        private DeclaredFunction(final String name, final int argumentsCount) {
            this.name = name;
            this.argumentsCount = argumentsCount;
        }

    }

    private static class CompilationLog {

        private String compilationLogMessage = "";

        private void addMessage(final CompilerErrorMessage compilerErrorMessage, final String symbol) {
            compilationLogMessage += compilerErrorMessage.getMessage(symbol) + "\n";
        }

        void addSymbolAlreadyDeclaredMessage(final String symbol) {
            addMessage(CompilerErrorMessage.SYMBOL_ALREADY_DECLARED, symbol);
        }

        void addSymbolUndeclaredMessage(final String symbol) {
            addMessage(CompilerErrorMessage.SYMBOL_UNDECLARED, symbol);
        }

        void addBadUsedSymbolMessage(final String invokedFunctionName) {
            addMessage(CompilerErrorMessage.BAD_USED_SYMBOL, invokedFunctionName);
        }

        void addBadArgumentCount(final String invokedFunctionName) {
            addMessage(CompilerErrorMessage.BAD_ARGUMENT_COUNT, invokedFunctionName);
        }

        public String getFullLog() {
            return compilationLogMessage;
        }

        private enum CompilerErrorMessage {
            SYMBOL_UNDECLARED("Symbol undeclared: "),
            BAD_USED_SYMBOL("Bad used symbol: "),
            SYMBOL_ALREADY_DECLARED("Symbol already declared: "),
            BAD_ARGUMENT_COUNT("Bad argument count: "),
            ;

            final String message;

            CompilerErrorMessage(final String s) {
                this.message = s;
            }

            public String getMessage(final String symbolName) {
                return message + symbolName;
            }
        }

    }
}
