// Generated from Graph.g4 by ANTLR 4.9
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GraphParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GraphVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GraphParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(GraphParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(GraphParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#mathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperator(GraphParser.MathOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(GraphParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(GraphParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#mainFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunctionDeclaration(GraphParser.MainFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(GraphParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(GraphParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#functionParameterDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterDecls(GraphParser.FunctionParameterDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#functionParameterDeclsRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterDeclsRest(GraphParser.FunctionParameterDeclsRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(GraphParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GraphParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(GraphParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GraphParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(GraphParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(GraphParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(GraphParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GraphParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(GraphParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#untilStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilStatement(GraphParser.UntilStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(GraphParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(GraphParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#globalVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVariableDeclarationStatement(GraphParser.GlobalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVariableDeclaration(GraphParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(GraphParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(GraphParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(GraphParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(GraphParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(GraphParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(GraphParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GraphParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(GraphParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(GraphParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpression(GraphParser.MathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(GraphParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#unaryNotPlusMinusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNotPlusMinusExpression(GraphParser.UnaryNotPlusMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#primitiveTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveTypeExpression(GraphParser.PrimitiveTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#defaultPrimitiveTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultPrimitiveTypeExpression(GraphParser.DefaultPrimitiveTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#multiPrimitiveTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiPrimitiveTypeExpression(GraphParser.MultiPrimitiveTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(GraphParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(GraphParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#getExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetExpression(GraphParser.GetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#sizeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeExpression(GraphParser.SizeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#printExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(GraphParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphParser#functionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArguments(GraphParser.FunctionCallArgumentsContext ctx);
}