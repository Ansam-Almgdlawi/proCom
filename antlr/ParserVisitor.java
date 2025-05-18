// Generated from C:/Users/pc/Desktop/newproject/newproject/newproject/Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#scriptBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptBlock(Parser.ScriptBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#tsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsStatement(Parser.TsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(Parser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#importSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecifier(Parser.ImportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(Parser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(Parser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalone(Parser.StandaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(Parser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(Parser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(Parser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Parser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrowMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowMethod(Parser.ArrowMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(Parser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(Parser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(Parser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(Parser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(Parser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#ngOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgOn(Parser.NgOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#constructorDecleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDecleration(Parser.ConstructorDeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#inputDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDeclaration(Parser.InputDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#outputDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputDeclaration(Parser.OutputDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(Parser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(Parser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#objectDecleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDecleration(Parser.ObjectDeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#objectName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectName(Parser.ObjectNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#objectInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInit(Parser.ObjectInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(Parser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(Parser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(Parser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataStructureExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStructureExpression(Parser.DataStructureExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(Parser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpression(Parser.DotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(Parser.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCastExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCastExpression(Parser.TypeCastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(Parser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallingMethodExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallingMethodExpression(Parser.CallingMethodExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(Parser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowMethodExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowMethodExpression(Parser.ArrowMethodExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(Parser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(Parser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectNameExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectNameExpression(Parser.ObjectNameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAssertionExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssertionExpression(Parser.TypeAssertionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(Parser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionalChainingExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalChainingExpression(Parser.OptionalChainingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorExpression(Parser.OperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericTypeExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeExpression(Parser.GenericTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExp}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExp(Parser.ReturnExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostDecrementExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(Parser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectDeclarationExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclarationExpression(Parser.ObjectDeclarationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Await}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwait(Parser.AwaitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionList}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(Parser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#elseIfStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatment(Parser.ElseIfStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#elseStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatment(Parser.ElseStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#shortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortIf(Parser.ShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#shortElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortElseIf(Parser.ShortElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#shortelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortelse(Parser.ShortelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrowIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowIf(Parser.ArrowIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(Parser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(Parser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#callingMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallingMethod(Parser.CallingMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#dataStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStructure(Parser.DataStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#itemsStructures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemsStructures(Parser.ItemsStructuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(Parser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(Parser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(Parser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#compersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompersion(Parser.CompersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(Parser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#jasmineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineStatement(Parser.JasmineStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#jasmineDescribe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineDescribe(Parser.JasmineDescribeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#jasmineCallback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineCallback(Parser.JasmineCallbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#jasmineIt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineIt(Parser.JasmineItContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#jasmineBeforeEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineBeforeEach(Parser.JasmineBeforeEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#jasmineAfterEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineAfterEach(Parser.JasmineAfterEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(Parser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#htmlAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributes(Parser.HtmlAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#angularAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularAttribute(Parser.AngularAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#htmlClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlClosingTag(Parser.HtmlClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(Parser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(Parser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#styleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleBlock(Parser.StyleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#cssRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRules(Parser.CssRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(Parser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelector(Parser.CssSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(Parser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#cssDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclarations(Parser.CssDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(Parser.CssDeclarationContext ctx);
}