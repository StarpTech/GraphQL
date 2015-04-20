// Generated from .\grammar\SQLParser.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParserParser}.
 */
public interface SQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void enterRelational_op(SQLParserParser.Relational_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void exitRelational_op(SQLParserParser.Relational_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#between_op}.
	 * @param ctx the parse tree
	 */
	void enterBetween_op(SQLParserParser.Between_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#between_op}.
	 * @param ctx the parse tree
	 */
	void exitBetween_op(SQLParserParser.Between_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#expr_op}.
	 * @param ctx the parse tree
	 */
	void enterExpr_op(SQLParserParser.Expr_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#expr_op}.
	 * @param ctx the parse tree
	 */
	void exitExpr_op(SQLParserParser.Expr_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#projection_item}.
	 * @param ctx the parse tree
	 */
	void enterProjection_item(SQLParserParser.Projection_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#projection_item}.
	 * @param ctx the parse tree
	 */
	void exitProjection_item(SQLParserParser.Projection_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(SQLParserParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(SQLParserParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(SQLParserParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(SQLParserParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLParserParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLParserParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(SQLParserParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(SQLParserParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#right_element}.
	 * @param ctx the parse tree
	 */
	void enterRight_element(SQLParserParser.Right_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#right_element}.
	 * @param ctx the parse tree
	 */
	void exitRight_element(SQLParserParser.Right_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#left_element}.
	 * @param ctx the parse tree
	 */
	void enterLeft_element(SQLParserParser.Left_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#left_element}.
	 * @param ctx the parse tree
	 */
	void exitLeft_element(SQLParserParser.Left_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(SQLParserParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(SQLParserParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(SQLParserParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(SQLParserParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SQLParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SQLParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter(SQLParserParser.Function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter(SQLParserParser.Function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(SQLParserParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(SQLParserParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SQLParserParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SQLParserParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SQLParserParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SQLParserParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#traverse_condition}.
	 * @param ctx the parse tree
	 */
	void enterTraverse_condition(SQLParserParser.Traverse_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#traverse_condition}.
	 * @param ctx the parse tree
	 */
	void exitTraverse_condition(SQLParserParser.Traverse_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#traverse_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTraverse_stmt(SQLParserParser.Traverse_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#traverse_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTraverse_stmt(SQLParserParser.Traverse_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(SQLParserParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(SQLParserParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(SQLParserParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(SQLParserParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(SQLParserParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(SQLParserParser.Limit_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#range_clause}.
	 * @param ctx the parse tree
	 */
	void enterRange_clause(SQLParserParser.Range_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#range_clause}.
	 * @param ctx the parse tree
	 */
	void exitRange_clause(SQLParserParser.Range_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParserParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLParserParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParserParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLParserParser.Select_stmtContext ctx);
}