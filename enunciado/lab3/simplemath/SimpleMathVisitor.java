// Generated from SimpleMath.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleMathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleMathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleMathParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(SimpleMathParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link SimpleMathParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(SimpleMathParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EndOfFile}
	 * labeled alternative in {@link SimpleMathParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfFile(SimpleMathParser.EndOfFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SSemicolonS}
	 * labeled alternative in {@link SimpleMathParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSSemicolonS(SimpleMathParser.SSemicolonSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDeclaration}
	 * labeled alternative in {@link SimpleMathParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclaration(SimpleMathParser.FuncDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleMathParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(SimpleMathParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleMathParser#func_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_declaration(SimpleMathParser.Func_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleMathParser#func_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param_list(SimpleMathParser.Func_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleMathParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleMathParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleMathParser#expression_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_t(SimpleMathParser.Expression_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleMathParser#expression_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_f(SimpleMathParser.Expression_fContext ctx);
}