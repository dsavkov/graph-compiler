// Generated from Graph.g4 by ANTLR 4.9
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraphParser}.
 */
public interface GraphListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraphParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(GraphParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(GraphParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(GraphParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(GraphParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(GraphParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(GraphParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(GraphParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(GraphParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#entryPoint}.
	 * @param ctx the parse tree
	 */
	void enterEntryPoint(GraphParser.EntryPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#entryPoint}.
	 * @param ctx the parse tree
	 */
	void exitEntryPoint(GraphParser.EntryPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodDeclaration(GraphParser.MainMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodDeclaration(GraphParser.MainMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(GraphParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(GraphParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#methodParameters}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameters(GraphParser.MethodParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#methodParameters}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameters(GraphParser.MethodParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#methodParameterDecls}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameterDecls(GraphParser.MethodParameterDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#methodParameterDecls}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameterDecls(GraphParser.MethodParameterDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#methodParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameterDeclsRest(GraphParser.MethodParameterDeclsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#methodParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameterDeclsRest(GraphParser.MethodParameterDeclsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(GraphParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(GraphParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GraphParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GraphParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(GraphParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(GraphParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GraphParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GraphParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(GraphParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(GraphParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(GraphParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(GraphParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(GraphParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(GraphParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GraphParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GraphParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(GraphParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(GraphParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#untilStatement}.
	 * @param ctx the parse tree
	 */
	void enterUntilStatement(GraphParser.UntilStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#untilStatement}.
	 * @param ctx the parse tree
	 */
	void exitUntilStatement(GraphParser.UntilStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(GraphParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(GraphParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(GraphParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(GraphParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#globalVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariableDeclarationStatement(GraphParser.GlobalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#globalVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariableDeclarationStatement(GraphParser.GlobalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariableDeclaration(GraphParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariableDeclaration(GraphParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(GraphParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(GraphParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(GraphParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(GraphParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(GraphParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(GraphParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(GraphParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(GraphParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(GraphParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(GraphParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(GraphParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(GraphParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GraphParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GraphParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(GraphParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(GraphParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(GraphParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(GraphParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpression(GraphParser.MathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpression(GraphParser.MathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(GraphParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(GraphParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#unaryNotPlusMinusExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNotPlusMinusExpression(GraphParser.UnaryNotPlusMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#unaryNotPlusMinusExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNotPlusMinusExpression(GraphParser.UnaryNotPlusMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#primitiveTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveTypeExpression(GraphParser.PrimitiveTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#primitiveTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveTypeExpression(GraphParser.PrimitiveTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#defaultPrimitiveTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterDefaultPrimitiveTypeExpression(GraphParser.DefaultPrimitiveTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#defaultPrimitiveTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitDefaultPrimitiveTypeExpression(GraphParser.DefaultPrimitiveTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#multiPrimitiveTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiPrimitiveTypeExpression(GraphParser.MultiPrimitiveTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#multiPrimitiveTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiPrimitiveTypeExpression(GraphParser.MultiPrimitiveTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(GraphParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(GraphParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#methodCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(GraphParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#methodCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(GraphParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#getExpression}.
	 * @param ctx the parse tree
	 */
	void enterGetExpression(GraphParser.GetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#getExpression}.
	 * @param ctx the parse tree
	 */
	void exitGetExpression(GraphParser.GetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#sizeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSizeExpression(GraphParser.SizeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#sizeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSizeExpression(GraphParser.SizeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#printlnExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnExpression(GraphParser.PrintlnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#printlnExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnExpression(GraphParser.PrintlnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#methodCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallArguments(GraphParser.MethodCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#methodCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallArguments(GraphParser.MethodCallArgumentsContext ctx);
}