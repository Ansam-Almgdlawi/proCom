// Generated from C:/src/newproject/Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(Parser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(Parser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecifier(Parser.ImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecifier(Parser.ImportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(Parser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(Parser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(Parser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(Parser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#standalone}.
	 * @param ctx the parse tree
	 */
	void enterStandalone(Parser.StandaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#standalone}.
	 * @param ctx the parse tree
	 */
	void exitStandalone(Parser.StandaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(Parser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(Parser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(Parser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(Parser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(Parser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(Parser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrowMethod}.
	 * @param ctx the parse tree
	 */
	void enterArrowMethod(Parser.ArrowMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrowMethod}.
	 * @param ctx the parse tree
	 */
	void exitArrowMethod(Parser.ArrowMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(Parser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(Parser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(Parser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(Parser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(Parser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(Parser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#ngOn}.
	 * @param ctx the parse tree
	 */
	void enterNgOn(Parser.NgOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#ngOn}.
	 * @param ctx the parse tree
	 */
	void exitNgOn(Parser.NgOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#constructorDecleration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDecleration(Parser.ConstructorDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#constructorDecleration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDecleration(Parser.ConstructorDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInputDeclaration(Parser.InputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInputDeclaration(Parser.InputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#outputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOutputDeclaration(Parser.OutputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#outputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOutputDeclaration(Parser.OutputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(Parser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(Parser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(Parser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(Parser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#objectDecleration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDecleration(Parser.ObjectDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#objectDecleration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDecleration(Parser.ObjectDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#objectName}.
	 * @param ctx the parse tree
	 */
	void enterObjectName(Parser.ObjectNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#objectName}.
	 * @param ctx the parse tree
	 */
	void exitObjectName(Parser.ObjectNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#objectInit}.
	 * @param ctx the parse tree
	 */
	void enterObjectInit(Parser.ObjectInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#objectInit}.
	 * @param ctx the parse tree
	 */
	void exitObjectInit(Parser.ObjectInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(Parser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(Parser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(Parser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(Parser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(Parser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(Parser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataStructureExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDataStructureExpression(Parser.DataStructureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataStructureExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDataStructureExpression(Parser.DataStructureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDotExpression(Parser.DotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDotExpression(Parser.DotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(Parser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(Parser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeCastExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeCastExpression(Parser.TypeCastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeCastExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeCastExpression(Parser.TypeCastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(Parser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(Parser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallingMethodExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallingMethodExpression(Parser.CallingMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallingMethodExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallingMethodExpression(Parser.CallingMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(Parser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(Parser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowMethodExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrowMethodExpression(Parser.ArrowMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowMethodExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrowMethodExpression(Parser.ArrowMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(Parser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(Parser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(Parser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(Parser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectNameExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectNameExpression(Parser.ObjectNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectNameExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectNameExpression(Parser.ObjectNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(Parser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(Parser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(Parser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(Parser.OperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericTypeExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeExpression(Parser.GenericTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericTypeExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeExpression(Parser.GenericTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecrementExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(Parser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecrementExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(Parser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectDeclarationExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclarationExpression(Parser.ObjectDeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectDeclarationExpression}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclarationExpression(Parser.ObjectDeclarationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionList}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionList}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(Parser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#elseIfStatment}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatment(Parser.ElseIfStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#elseIfStatment}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatment(Parser.ElseIfStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#elseStatment}.
	 * @param ctx the parse tree
	 */
	void enterElseStatment(Parser.ElseStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#elseStatment}.
	 * @param ctx the parse tree
	 */
	void exitElseStatment(Parser.ElseStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#shortIf}.
	 * @param ctx the parse tree
	 */
	void enterShortIf(Parser.ShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#shortIf}.
	 * @param ctx the parse tree
	 */
	void exitShortIf(Parser.ShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#shortElseIf}.
	 * @param ctx the parse tree
	 */
	void enterShortElseIf(Parser.ShortElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#shortElseIf}.
	 * @param ctx the parse tree
	 */
	void exitShortElseIf(Parser.ShortElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#shortelse}.
	 * @param ctx the parse tree
	 */
	void enterShortelse(Parser.ShortelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#shortelse}.
	 * @param ctx the parse tree
	 */
	void exitShortelse(Parser.ShortelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrowIf}.
	 * @param ctx the parse tree
	 */
	void enterArrowIf(Parser.ArrowIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrowIf}.
	 * @param ctx the parse tree
	 */
	void exitArrowIf(Parser.ArrowIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(Parser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(Parser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(Parser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(Parser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(Parser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(Parser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#callingMethod}.
	 * @param ctx the parse tree
	 */
	void enterCallingMethod(Parser.CallingMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#callingMethod}.
	 * @param ctx the parse tree
	 */
	void exitCallingMethod(Parser.CallingMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#dataStructure}.
	 * @param ctx the parse tree
	 */
	void enterDataStructure(Parser.DataStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#dataStructure}.
	 * @param ctx the parse tree
	 */
	void exitDataStructure(Parser.DataStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#itemsStructures}.
	 * @param ctx the parse tree
	 */
	void enterItemsStructures(Parser.ItemsStructuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#itemsStructures}.
	 * @param ctx the parse tree
	 */
	void exitItemsStructures(Parser.ItemsStructuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(Parser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(Parser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(Parser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(Parser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(Parser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#compersion}.
	 * @param ctx the parse tree
	 */
	void enterCompersion(Parser.CompersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#compersion}.
	 * @param ctx the parse tree
	 */
	void exitCompersion(Parser.CompersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(Parser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(Parser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(Parser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(Parser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(Parser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(Parser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(Parser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(Parser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(Parser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(Parser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(Parser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(Parser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(Parser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(Parser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(Parser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(Parser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(Parser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(Parser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(Parser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(Parser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(Parser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(Parser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(Parser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(Parser.StyleContext ctx);
}