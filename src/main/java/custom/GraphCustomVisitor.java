package custom;

import generated.GraphBaseVisitor;
import generated.GraphParser.BlockContext;
import generated.GraphParser.BlockStatementContext;
import generated.GraphParser.CastExpressionContext;
import generated.GraphParser.ComparisonExpressionContext;
import generated.GraphParser.ComparisonOperatorContext;
import generated.GraphParser.DefaultPrimitiveTypeExpressionContext;
import generated.GraphParser.EntryPointContext;
import generated.GraphParser.ExpressionContext;
import generated.GraphParser.ExpressionStatementContext;
import generated.GraphParser.ForControlContext;
import generated.GraphParser.ForStatementContext;
import generated.GraphParser.GetExpressionContext;
import generated.GraphParser.GlobalVariableDeclarationContext;
import generated.GraphParser.GlobalVariableDeclarationStatementContext;
import generated.GraphParser.IfStatementContext;
import generated.GraphParser.LocalVariableDeclarationContext;
import generated.GraphParser.LocalVariableDeclarationStatementContext;
import generated.GraphParser.LogicalExpressionContext;
import generated.GraphParser.LogicalOperatorContext;
import generated.GraphParser.MainMethodDeclarationContext;
import generated.GraphParser.MathExpressionContext;
import generated.GraphParser.MathOperatorContext;
import generated.GraphParser.MethodBodyContext;
import generated.GraphParser.MethodCallArgumentsContext;
import generated.GraphParser.MethodCallExpressionContext;
import generated.GraphParser.MethodCallStatementContext;
import generated.GraphParser.MethodDeclarationContext;
import generated.GraphParser.MethodParameterDeclsContext;
import generated.GraphParser.MethodParameterDeclsRestContext;
import generated.GraphParser.MethodParametersContext;
import generated.GraphParser.MultiPrimitiveTypeExpressionContext;
import generated.GraphParser.ParExpressionContext;
import generated.GraphParser.PrimitiveTypeContext;
import generated.GraphParser.PrimitiveTypeExpressionContext;
import generated.GraphParser.PrintlnExpressionContext;
import generated.GraphParser.ReturnStatementContext;
import generated.GraphParser.SizeExpressionContext;
import generated.GraphParser.StatementContext;
import generated.GraphParser.UnaryExpressionContext;
import generated.GraphParser.UnaryNotPlusMinusExpressionContext;
import generated.GraphParser.UntilStatementContext;
import generated.GraphParser.VariableDeclaratorContext;
import generated.GraphParser.VariableDeclaratorsContext;
import generated.GraphParser.VariableInitializerContext;
import generated.GraphParser.WhileStatementContext;

public class GraphCustomVisitor extends GraphBaseVisitor<String> {

	private final IndentProvider indentProvider = new IndentProvider("\t");

	@Override
	public String visitPrimitiveType(PrimitiveTypeContext ctx) {
		if (ctx.INT() != null) {
			return "int";
		} else if (ctx.NODE() != null) {
			return "Node";
		} else if (ctx.ARC() != null) {
			return "Arc";
		} else if (ctx.GRAPH() != null) {
			return "Graph";
		} else {
			return "visitPrimitiveType_ERROR";
		}
	}

	@Override
	public String visitComparisonOperator(ComparisonOperatorContext ctx) {
		if (ctx.LESS_OR_EQUAL() != null) {
			return " <= ";
		} else if (ctx.GREATER_OR_EQUAL() != null) {
			return " >= ";
		} else if (ctx.LESS() != null) {
			return " < ";
		} else if (ctx.GREATER() != null) {
			return " > ";
		} else if (ctx.EQUAL() != null) {
			return " == ";
		} else if (ctx.NOT_EQUAL() != null) {
			return " != ";
		} else {
			return "visitComparisonOperator_ERROR";
		}
	}

	@Override
	public String visitMathOperator(MathOperatorContext ctx) {
		if (ctx.ADD() != null) {
			return " + ";
		} else if (ctx.SUB() != null) {
			return " - ";
		} else if (ctx.MULTIPLY() != null) {
			return " * ";
		} else if (ctx.DIVIDE() != null) {
			return " / ";
		} else {
			return "visitMathOperator_ERROR";
		}
	}

	@Override
	public String visitLogicalOperator(LogicalOperatorContext ctx) {
		if (ctx.OR() != null) {
			return " || ";
		} else if (ctx.AND() != null) {
			return " && ";
		} else {
			return "visitLogicalOperator_ERROR";
		}
	}

	@Override
	public String visitEntryPoint(EntryPointContext ctx) {
		StringBuilder builder = new StringBuilder(indentProvider.getIndent());
		builder.append("public class GraphApp {\n");
		indentProvider.next();
		for (GlobalVariableDeclarationStatementContext c : ctx.globalVariableDeclarationStatement()) {
			builder.append(visitGlobalVariableDeclarationStatement(c));
			builder.append("\n");
		}
		builder.append("\n");
		for (MethodDeclarationContext c : ctx.methodDeclaration()) {
			builder.append(visitMethodDeclaration(c));
		}
		builder.append(visitMainMethodDeclaration(ctx.mainMethodDeclaration()));
		indentProvider.prev();
		builder.append(indentProvider.getIndent());
		builder.append("}");
		return builder.toString();
	}

	@Override
	public String visitMainMethodDeclaration(MainMethodDeclarationContext ctx) {
		return String.format(
				"%spublic static void main(String[] args) %s",
				indentProvider.getIndent(),
				visitMethodBody(ctx.methodBody())
		);
	}

	@Override
	public String visitMethodDeclaration(MethodDeclarationContext ctx) {
		return String.format(
				"%spublic %s %s%s %s",
				indentProvider.getIndent(),
				ctx.VOID() != null ? "void" : visitPrimitiveType(ctx.primitiveType()),
				ctx.Identifier().toString(),
				visitMethodParameters(ctx.methodParameters()),
				visitMethodBody(ctx.methodBody())
		);
	}

	@Override
	public String visitMethodParameters(MethodParametersContext ctx) {
		return String.format(
				"(%s)",
				ctx.methodParameterDecls() == null ? ""
						: visitMethodParameterDecls(ctx.methodParameterDecls())
		);
	}

	@Override
	public String visitMethodParameterDecls(MethodParameterDeclsContext ctx) {
		return String.format(
				"%s %s",
				visitPrimitiveType(ctx.primitiveType()),
				visitMethodParameterDeclsRest(ctx.methodParameterDeclsRest())
		);
	}

	@Override
	public String visitMethodParameterDeclsRest(MethodParameterDeclsRestContext ctx) {
		return String.format(
				"%s%s",
				ctx.Identifier().toString(),
				ctx.methodParameterDecls() == null
						? ""
						: String.format(", %s",
								visitMethodParameterDecls(ctx.methodParameterDecls()))
		);
	}

	@Override
	public String visitMethodBody(MethodBodyContext ctx) {
		return String.format("%s\n", visitBlock(ctx.block()));
	}

	@Override
	public String visitBlock(BlockContext ctx) {
		StringBuilder result = new StringBuilder();
		result.append("{\n");
		indentProvider.next();
		for (BlockStatementContext c : ctx.blockStatement()) {
			result.append(visitBlockStatement(c));
		}
		indentProvider.prev();
		result.append(indentProvider.getIndent());
		result.append("}\n");
		return result.toString();
	}

	@Override
	public String visitBlockStatement(BlockStatementContext ctx) {
		StringBuilder result = new StringBuilder(indentProvider.getIndent());
		if (ctx.statement() != null) {
			result.append(String.format("%s\n", visitStatement(ctx.statement())));
		} else if (ctx.localVariableDeclarationStatement() != null) {
			result.append(String.format("%s\n", visitLocalVariableDeclarationStatement(
					ctx.localVariableDeclarationStatement())));
		} else {
			result.append("visitBlockStatement_ERROR");
		}
		return result.toString();
	}

	@Override
	public String visitStatement(StatementContext ctx) {
		if (ctx.block() != null) {
			return visitBlock(ctx.block());
		} else if (ctx.ifStatement() != null) {
			return visitIfStatement(ctx.ifStatement());
		} else if (ctx.forStatement() != null) {
			return visitForStatement(ctx.forStatement());
		} else if (ctx.whileStatement() != null) {
			return visitWhileStatement(ctx.whileStatement());
		} else if (ctx.untilStatement() != null) {
			return visitUntilStatement(ctx.untilStatement());
		} else if (ctx.returnStatement() != null) {
			return visitReturnStatement(ctx.returnStatement());
		} else if (ctx.methodCallStatement() != null) {
			return visitMethodCallStatement(ctx.methodCallStatement());
		} else if (ctx.expressionStatement() != null) {
			return visitExpressionStatement(ctx.expressionStatement());
		} else {
			return "visitStatement_ERROR";
		}
	}

	@Override
	public String visitExpressionStatement(ExpressionStatementContext ctx) {
		return String.format("%s;", visitExpression(ctx.expression()));
	}

	@Override
	public String visitMethodCallStatement(MethodCallStatementContext ctx) {
		return String.format("%s;", visitMethodCallExpression(ctx.methodCallExpression()));
	}

	@Override
	public String visitReturnStatement(ReturnStatementContext ctx) {
		return String.format("return %s;", visitExpression(ctx.expression()));
	}

	@Override
	public String visitIfStatement(IfStatementContext ctx) {
		return String.format(
				"if %s %s %s",
				visitParExpression(ctx.parExpression()),
				visitStatement(ctx.statement(0)),
				ctx.statement(1) == null
						? ""
						: String.format("else %s", visitStatement(ctx.statement(1)))
		);
	}

	@Override
	public String visitWhileStatement(WhileStatementContext ctx) {
		return String.format(
				"while %s %s",
				visitParExpression(ctx.parExpression()),
				visitStatement(ctx.statement())
		);
	}

	@Override
	public String visitUntilStatement(UntilStatementContext ctx) {
		return String.format(
				"do {%s} while%s;",
				visitStatement(ctx.statement()),
				visitParExpression(ctx.parExpression())
		);
	}

	@Override
	public String visitForStatement(ForStatementContext ctx) {
		return String.format(
				"for (%s) %s",
				visitForControl(ctx.forControl()),
				visitStatement(ctx.statement())
		);
	}

	@Override
	public String visitForControl(ForControlContext ctx) {
		return String.format(
				"%s %s : %s",
				visitPrimitiveType(ctx.primitiveType()),
				ctx.Identifier().toString(),
				visitExpression(ctx.expression())
		);
	}

	@Override
	public String visitGlobalVariableDeclarationStatement(GlobalVariableDeclarationStatementContext ctx) {
		return String.format("%sprivate %s;",
				indentProvider.getIndent(),
				visitGlobalVariableDeclaration(ctx.globalVariableDeclaration())
		);
	}

	@Override
	public String visitGlobalVariableDeclaration(GlobalVariableDeclarationContext ctx) {
		return String.format(
				"%s %s",
				visitPrimitiveType(ctx.primitiveType()),
				visitVariableDeclarators(ctx.variableDeclarators())
		);
	}

	@Override
	public String visitLocalVariableDeclarationStatement(LocalVariableDeclarationStatementContext ctx) {
		return String.format("%s;", visitLocalVariableDeclaration(ctx.localVariableDeclaration()));
	}

	@Override
	public String visitLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
		return String.format(
				"%s %s",
				visitPrimitiveType(ctx.primitiveType()),
				visitVariableDeclarators(ctx.variableDeclarators())
		);
	}

	@Override
	public String visitVariableDeclarators(VariableDeclaratorsContext ctx) {
		StringBuilder result = new StringBuilder();
		result.append(visitVariableDeclarator(ctx.variableDeclarator(0)));
		for (int i = 1; i < ctx.variableDeclarator().size(); i++) {
			result.append(", ");
			result.append(visitVariableDeclarator(ctx.variableDeclarator(i)));
		}
		return result.toString();
	}

	@Override
	public String visitVariableDeclarator(VariableDeclaratorContext ctx) {
		return String.format(
				"%s%s",
				ctx.Identifier().toString(),
				ctx.variableInitializer() == null
						? ""
						: String.format(" = %s",
								visitVariableInitializer(ctx.variableInitializer()))
		);
	}

	@Override
	public String visitVariableInitializer(VariableInitializerContext ctx) {
		if (ctx.expression() != null) {
			return visitExpression(ctx.expression());
		} else if (ctx.Identifier() != null) {
			return ctx.Identifier().toString();
		} else {
			return "visitVariableInitializer_ERROR";
		}
	}

	@Override
	public String visitParExpression(ParExpressionContext ctx) {
		return String.format("(%s)", visitExpression(ctx.expression()));
	}

	@Override
	public String visitExpression(ExpressionContext ctx) {
		StringBuilder result = new StringBuilder();
		result.append(visitLogicalExpression(ctx.logicalExpression(0)));
		if (ctx.logicalExpression(1) != null) {
			result.append(" = ");
			result.append(visitLogicalExpression(ctx.logicalExpression(1)));
		}
		return result.toString();
	}

	@Override
	public String visitLogicalExpression(LogicalExpressionContext ctx) {
		StringBuilder result = new StringBuilder();
		result.append(visitComparisonExpression(ctx.comparisonExpression(0)));
		for (int i = 1; i < ctx.comparisonExpression().size(); i++) {
			result.append(visitLogicalOperator(ctx.logicalOperator(i - 1)));
			result.append(visitComparisonExpression(ctx.comparisonExpression(i)));
		}
		return result.toString();
	}

	@Override
	public String visitComparisonExpression(ComparisonExpressionContext ctx) {
		StringBuilder result = new StringBuilder();
		result.append(visitMathExpression(ctx.mathExpression(0)));
		for (int i = 1; i < ctx.mathExpression().size(); i++) {
			result.append(visitComparisonOperator(ctx.comparisonOperator(i - 1)));
			result.append(visitMathExpression(ctx.mathExpression(i)));
		}
		return result.toString();
	}

	@Override
	public String visitMathExpression(MathExpressionContext ctx) {
		StringBuilder result = new StringBuilder();
		result.append(visitUnaryExpression(ctx.unaryExpression(0)));
		for (int i = 1; i < ctx.unaryExpression().size(); i++) {
			result.append(visitMathOperator(ctx.mathOperator(i - 1)));
			result.append(visitUnaryExpression(ctx.unaryExpression(i)));
		}
		return result.toString();
	}

	@Override
	public String visitUnaryExpression(UnaryExpressionContext ctx) {
		if (ctx.ADD() != null) {
			return String.format("+%s", visitUnaryExpression(ctx.unaryExpression()));
		} else if (ctx.SUB() != null) {
			return String.format("-%s", visitUnaryExpression(ctx.unaryExpression()));
		} else if (ctx.INCREMENT() != null) {
			return String.format("++%s", visitUnaryExpression(ctx.unaryExpression()));
		} else if (ctx.DECREMENT() != null) {
			return String.format("--%s", visitUnaryExpression(ctx.unaryExpression()));
		} else if (ctx.unaryNotPlusMinusExpression() != null) {
			return visitUnaryNotPlusMinusExpression(ctx.unaryNotPlusMinusExpression());
		} else {
			return "visitUnaryExpression_ERROR";
		}
	}

	@Override
	public String visitUnaryNotPlusMinusExpression(UnaryNotPlusMinusExpressionContext ctx) {
		if (ctx.castExpression() != null) {
			return visitCastExpression(ctx.castExpression());
		} else if (ctx.methodCallExpression() != null) {
			return visitMethodCallExpression(ctx.methodCallExpression());
		} else if (ctx.methodCallExpression() != null) {
			return visitMethodCallExpression(ctx.methodCallExpression());
		} else if (ctx.primitiveTypeExpression() != null) {
			return visitPrimitiveTypeExpression(ctx.primitiveTypeExpression());
		} else if (ctx.Identifier() != null) {
			if (ctx.INCREMENT() != null) {
				return String.format("%s++", ctx.Identifier().toString());
			} else if (ctx.DECREMENT() != null) {
				return String.format("%s--", ctx.Identifier().toString());
			} else {
				return ctx.Identifier().toString();
			}
		} else if (ctx.NUMBER() != null) {
			if (ctx.INCREMENT() != null) {
				return String.format("%s++", ctx.NUMBER().toString());
			} else if (ctx.DECREMENT() != null) {
				return String.format("%s--", ctx.NUMBER().toString());
			} else {
				return ctx.NUMBER().toString();
			}
		} else if (ctx.LINE() != null) {
			return ctx.LINE().toString();
		} else {
			return "visitUnaryNotPlusMinusExpression_ERROR";
		}
	}

	@Override
	public String visitPrimitiveTypeExpression(PrimitiveTypeExpressionContext ctx) {
		if (ctx.defaultPrimitiveTypeExpression() != null) {
			return visitDefaultPrimitiveTypeExpression(ctx.defaultPrimitiveTypeExpression());
		} else if (ctx.multiPrimitiveTypeExpression() != null) {
			return visitMultiPrimitiveTypeExpression(ctx.multiPrimitiveTypeExpression());
		} else {
			return "visitPrimitiveTypeExpression_ERROR";
		}
	}

	@Override
	public String visitDefaultPrimitiveTypeExpression(DefaultPrimitiveTypeExpressionContext ctx) {
		return String.format(
				"new %s(%s, %s)",
				visitPrimitiveType(ctx.primitiveType()),
				visitExpression(ctx.expression(0)),
				visitExpression(ctx.expression(1))
		);
	}

	@Override
	public String visitMultiPrimitiveTypeExpression(MultiPrimitiveTypeExpressionContext ctx) {
		StringBuilder result = new StringBuilder();
		result.append("new ");
		result.append(visitPrimitiveType(ctx.primitiveType()));
		result.append("(");
		if (ctx.expression(0) != null) {
			result.append(visitExpression(ctx.expression(0)));
		}
		for (int i = 1; i < ctx.expression().size(); i++) {
			result.append(", ");
			result.append(visitExpression(ctx.expression(i)));
		}
		result.append(")");
		return result.toString();
	}

	@Override
	public String visitCastExpression(CastExpressionContext ctx) {
		return String.format("(%s) %s", visitPrimitiveType(ctx.primitiveType()),
				visitUnaryExpression(ctx.unaryExpression()));
	}

	@Override
	public String visitMethodCallExpression(MethodCallExpressionContext ctx) {
		if (ctx.Identifier() != null && ctx.methodCallArguments() != null) {
			return String.format(
					"%s%s",
					ctx.Identifier().toString(),
					visitMethodCallArguments(ctx.methodCallArguments())
			);
		} else if (ctx.getExpression() != null) {
			return visitGetExpression(ctx.getExpression());
		} else if (ctx.sizeExpression() != null) {
			return visitSizeExpression(ctx.sizeExpression());
		} else if (ctx.printlnExpression() != null) {
			return visitPrintlnExpression(ctx.printlnExpression());
		} else {
			return "visitFunctionCallExpression_ERROR";
		}
	}

	@Override
	public String visitGetExpression(GetExpressionContext ctx) {
		return String.format("%s.getNode(%s)", ctx.Identifier().toString(), ctx.NUMBER().toString());
	}

	@Override
	public String visitSizeExpression(SizeExpressionContext ctx) {
		return String.format("%s.size()", ctx.Identifier().toString());
	}

	@Override
	public String visitPrintlnExpression(PrintlnExpressionContext ctx) {
		return String.format("System.out.println(%s)", visitExpression(ctx.expression()));
	}

	@Override
	public String visitMethodCallArguments(MethodCallArgumentsContext ctx) {
		StringBuilder result = new StringBuilder();
		result.append("(");
		if (ctx.expression(0) != null) {
			result.append(visitExpression(ctx.expression(0)));
		}
		for (int i = 1; i < ctx.expression().size(); i++) {
			result.append(",");
			result.append(visitExpression(ctx.expression(i)));
		}
		result.append(")");
		return result.toString();
	}
}
