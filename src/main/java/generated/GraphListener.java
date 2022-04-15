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
	 * Enter a parse tree produced by {@link GraphParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(GraphParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(GraphParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#mainFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainFunctionDeclaration(GraphParser.MainFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#mainFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainFunctionDeclaration(GraphParser.MainFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(GraphParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(GraphParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(GraphParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(GraphParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#functionParameterDecls}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterDecls(GraphParser.FunctionParameterDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#functionParameterDecls}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterDecls(GraphParser.FunctionParameterDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclsRest(GraphParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclsRest(GraphParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(GraphParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(GraphParser.FunctionBodyContext ctx);
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
	 * Enter a parse tree produced by {@link GraphParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(GraphParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(GraphParser.FunctionCallStatementContext ctx);
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
	 * Enter a parse tree produced by {@link GraphParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(GraphParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(GraphParser.FunctionCallExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link GraphParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(GraphParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(GraphParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(GraphParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(GraphParser.FunctionCallArgumentsContext ctx);
}