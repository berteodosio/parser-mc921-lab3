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
	 * Visit a parse tree produced by {@link SimpleMathParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(SimpleMathParser.SContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleMathParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(SimpleMathParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleMathParser#func_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_invocation(SimpleMathParser.Func_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleMathParser#func_invocation_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_invocation_param_list(SimpleMathParser.Func_invocation_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleMathParser#func_invocation_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_invocation_param(SimpleMathParser.Func_invocation_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleMathParser#num_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expression(SimpleMathParser.Num_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleMathParser#num_expression_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expression_t(SimpleMathParser.Num_expression_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleMathParser#num_expression_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expression_f(SimpleMathParser.Num_expression_fContext ctx);
}