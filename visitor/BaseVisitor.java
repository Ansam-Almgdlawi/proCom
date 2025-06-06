package visitor;

import AST.*;
import AST.CSS.*;
import AST.Expressions.*;
//import gen.src.antlr.AngularParserBaseVisitor;
import src.antlr.AngularParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import src.antlr.AngularParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;
//import src.src.antlr.AngularParserBaseVisitor;
//import src.antlr.AngularParserBaseVisitor;

public class BaseVisitor extends AngularParserBaseVisitor {
    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx) {
        Program program = new Program();
        for (ParseTree child : ctx.children) {
            ASTNode node = (ASTNode) visit(child);
            if (node != null) {
                program.addElement(node);
            }
        }
        return program;
    }
    public ASTNode visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();

        // Set the source module
        if (ctx.String() != null) {
            importStatement.setSource(ctx.String().getText().replace("\"", ""));
        }

        // Handle the different types of imports
        if (ctx.IDENTIFIER() != null) {
            // Default import
            importStatement.setDefaultImport(ctx.IDENTIFIER().getText());

        } else if (ctx.STAR() != null && ctx.AS() != null && ctx.IDENTIFIER() != null) {
            // Wildcard import
            ImportSpecifier.Specifier wildcardSpecifier = new ImportSpecifier.Specifier("*",ctx.IDENTIFIER().getText());
            importStatement.setWildcardImport(wildcardSpecifier);
        } else if (ctx.importSpecifier() != null) {
            // Named imports
            ImportSpecifier namedSpecifier = (ImportSpecifier) visit(ctx.importSpecifier());
            importStatement.getNamedImports().add(namedSpecifier);
        }

        return importStatement;
    }

    public ASTNode visitImportSpecifier(AngularParser.ImportSpecifierContext ctx) {
        ImportSpecifier importSpecifier = new ImportSpecifier();

        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            String id = ctx.IDENTIFIER(i).getText();
            String alias = null;

            // Check if the current identifier has an alias by inspecting the next token
            if (i + 1 < ctx.IDENTIFIER().size() && ctx.getChild(i * 2 + 1).getText().equals("as")) {
                alias = ctx.IDENTIFIER(i + 1).getText();
                i++; // Skip the alias identifier
            }
            // Add each specifier with its alias (if any)
            importSpecifier.addSpecifier(id, alias);
        }

        return importSpecifier;
    }


    public ASTNode visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        ComponentDeclaration component = new ComponentDeclaration();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof AngularParser.SelectorContext) {
                component.setSelector((Selector) visit(child));
            } else if (child instanceof AngularParser.StandaloneContext) {
                component.setStandalone((Standalone) visit(child));
            } else if (child instanceof AngularParser.ImportsContext) {
                component.setImports((Imports) visit(child));
            } else if (child instanceof AngularParser.UrlContext) {
                if (child.getText().startsWith("templateUrl")) {
                    component.setTemplateUrl((Url) visit(child));
                } else if (child.getText().startsWith("styleUrl")) {
                    component.setStyleUrl((Url) visit(child));
                }
            }
        }

        return component;
    }




    public ASTNode visitSelector(AngularParser.SelectorContext ctx) {
        return new Selector(ctx.String().getText().replace("\"", ""));
    }


    public ASTNode visitStandalone(AngularParser.StandaloneContext ctx) {
        return new Standalone(Boolean.parseBoolean(ctx.Boolean().getText()));
    }


    public ASTNode visitImports(AngularParser.ImportsContext ctx) {
        Imports imports= new Imports();

        for (TerminalNode identifier : ctx.IDENTIFIER()) {
            imports.addChild(identifier.getText());
        }
        return imports;
    }


    public ASTNode visitUrl(AngularParser.UrlContext ctx) {
        return new Url(ctx.String().getText().replace("\"", ""));
    }
    public ASTNode visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        String name = null;

        String returnType = null;
        Block block = null;


        // Extract function name if present
        if (ctx.IDENTIFIER(0) != null) {
            name = ctx.IDENTIFIER(0).getText();
        }

        // Extract and collect parameters directly into a List

        ParameterList parameters = (ParameterList) visit(ctx.parameterList());

        // Extract return type if present
        if (ctx.COLON() != null && ctx.IDENTIFIER(1) != null) {
            returnType = ctx.IDENTIFIER(1).getText();
        }

        // Visit block
        if (ctx.block() != null) {
            block = (Block) visit(ctx.block());
        }
        FunctionDeclaration functionDeclaration =  new FunctionDeclaration(name, parameters, returnType, block);


        return functionDeclaration;
    }
    public ASTNode visitBlock(AngularParser.BlockContext ctx) {
        Block block = new Block();

        // Iterate through each child in the block context
        for (ParseTree child : ctx.children) {
            // Visit each child and cast to ASTNode
            ASTNode statement = (ASTNode) visit(child);
            if (statement != null && statement instanceof Statement) {
                block.addStatment((Statement) statement);
            } else if (statement != null && statement instanceof ReturnStatement) {
                block.setReturnStatement((ReturnStatement) statement);
            }
        }

        return block;
    }
    public ASTNode visitParameterList(AngularParser.ParameterListContext ctx) {
        // Create a new ParameterList instance
        ParameterList parameterList = new ParameterList();

        // Visit each parameter and add to the parameter list
        if (ctx.parameter() != null) {
            for (AngularParser.ParameterContext paramCtx : ctx.parameter()) {
                Parameter parameter = (Parameter) visit(paramCtx); // Visit each parameter
                parameterList.addParameter(parameter); // Add to the list
            }
        }

        return parameterList;
    }
    public ASTNode visitParameter(AngularParser.ParameterContext ctx) {
        // Create a Parameter with the name from the context
        String paramName = ctx.IDENTIFIER(0).getText();
        return new Parameter(paramName);
    }
    public ASTNode visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx) {
        if (ctx == null) return null;

        if (ctx.arrowMethod() != null) {
            return (ASTNode) visit(ctx.arrowMethod());
        }

        if (ctx.IDENTIFIER() == null || ctx.IDENTIFIER().isEmpty()) {
            return null; // لا يوجد اسم method
        }

        String name = ctx.IDENTIFIER().get(0).getText();

        ParameterList parameterList = null;
        if (ctx.parameterList() != null) {
            parameterList = (ParameterList) visit(ctx.parameterList());
        }

        String returnType = null;
        if (ctx.COLON() != null && ctx.IDENTIFIER().size() > 1 && ctx.IDENTIFIER(1) != null) {
            returnType = ctx.IDENTIFIER(1).getText();
        }

        Block block = null;
        if (ctx.block() != null) {
            block = (Block) visit(ctx.block());
        }

        Modifier modifier = null;
        if (ctx.modifier() != null) {
            modifier = (Modifier) visit(ctx.modifier());
        }

        return new MethodDeclaration(name, modifier, parameterList, returnType, block);
    }

    public ASTNode visitArrowMethod(AngularParser.ArrowMethodContext ctx) {
        // Extract the optional modifier (e.g., PUBLIC, PRIVATE)
        Modifier modifier = ctx.modifier() != null ?(Modifier) visit( ctx.modifier()) : null;

        // Extract the optional method name (IDENTIFIER)
        String name = ctx.IDENTIFIER(0) != null ? ctx.IDENTIFIER(0).getText() : null;

        // Extract the parameter list
        ParameterList parameters = (ParameterList) visit(ctx.parameterList());

        // Extract the optional return type (IDENTIFIER)
        String returnType = ctx.IDENTIFIER(1) != null ?ctx.IDENTIFIER().get(1).getText(): null;

        // Create a new ArrowMethod instance
        ArrowMethod arrowMethod = new ArrowMethod(modifier, name, parameters, returnType);

        // Extract the statements inside the method block
        if (ctx.statement() != null) {
            for (AngularParser.StatementContext statementCtx : ctx.statement()) {
                Statement statement = (Statement) visit(statementCtx);
                arrowMethod.addBodyElement(statement);
            }
        }
        return arrowMethod;
    }
    public ASTNode visitModifier(AngularParser.ModifierContext ctx) {
        if (ctx.PUBLIC() != null) {
            return new Modifier("PUBLIC");
        } else if (ctx.PRIVATE() != null) {
            return new Modifier("PRIVATE");
        } else if (ctx.PROTECTED() != null) {
            return new Modifier("PROTECTED");
        } else if (ctx.READONLY() != null) {
            return new Modifier("READONLY");
        } else if (ctx.STATIC() != null) {
            return new Modifier("STATIC");
        } else if (ctx.ABSTRACT() != null) {
            return new Modifier("ABSTRACT");
        } else if (ctx.FINAL() != null) {
            return new Modifier("FINAL");
        } else if (ctx.ASYNC() != null) {
            return new Modifier("async");
        } else if (ctx.EXPORT() != null) {
            return new Modifier("EXPORT");
        }
        return null;
    }
    public ASTNode visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ASTNode modifier = ctx.modifier() != null ? (ASTNode) visit( ctx.modifier()) : null;
        String name = ctx.IDENTIFIER(0).getText();
        String parentOrInterface = null;

        if (ctx.EXTENDS() != null || ctx.IMPLEMENTS() != null) {
            parentOrInterface = ctx.IDENTIFIER(1).getText();
        }

        ClassDeclaration classDeclaration = new ClassDeclaration(modifier, name, parentOrInterface);

        if (ctx.classMember() != null) {
            for (AngularParser.ClassMemberContext memberCtx : ctx.classMember()) {
                classDeclaration.addMember((ClassMember) visit(memberCtx));
            }
        }

        return classDeclaration;
    }

    public ASTNode visitClassMember(AngularParser.ClassMemberContext ctx) {
        if (ctx.inputDeclaration() != null) {
            return new ClassMember((ASTNode)visit(ctx.inputDeclaration()));
        } else if (ctx.outputDeclaration() != null) {
            return new ClassMember((ASTNode)visit(ctx.outputDeclaration()));
        } else if (ctx.methodDeclaration() != null) {
            return new ClassMember((ASTNode)visit(ctx.methodDeclaration()));
        } else if (ctx.propertyDeclaration() != null) {
            return new ClassMember((ASTNode)visit(ctx.propertyDeclaration()));
        } else if (ctx.variableDeclaration() != null) {
            return new ClassMember((ASTNode)visit(ctx.variableDeclaration()));
        } else if (ctx.objectDecleration() != null) {
            return new ClassMember((ASTNode)visit(ctx.objectDecleration()));
        } else if (ctx.constructorDecleration() != null) {
            return new ClassMember((ASTNode)visit(ctx.constructorDecleration()));
        } else if (ctx.ngOn() != null) {
            return new ClassMember((ASTNode)visit(ctx.ngOn()));
        }
        return null;
    }
    public ASTNode visitNgOn(AngularParser.NgOnContext ctx) {
        // Determine the type (NGONINIT or NGONCHANGES)
        String type = ctx.NGONINIT() != null ? ctx.NGONINIT().getText() : ctx.NGONCHANGES().getText();

        // Extract and process parameters
        ParameterList parameters = (ParameterList) visit(ctx.parameterList());

        // Determine the return type if specified
        String returnType = ctx.COLON() != null && ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : null;

        // Visit the block
        Block block = ctx.block() != null ? (Block) visit(ctx.block()) : null;

        // Create and populate the NgOn node
        NgOn ngOn = new NgOn(type,parameters, returnType, block);



        return ngOn;
    }


    public ASTNode visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        ASTNode expression = null;
        return new ReturnStatement(expression);
    }


    public ASTNode visitCallingMethod(AngularParser.CallingMethodContext ctx) {
        // Extract method name (IDENTIFIER or CATCH)
        String methodName = ctx.IDENTIFIER(0) != null ? ctx.IDENTIFIER(0).getText() : ctx.CATCH().getText();

        // Create CallingMethod instance
        CallingMethod callingMethod = new CallingMethod(methodName);

        // Handle arguments
        if (ctx.expression() != null) {
            for (var exprCtx : ctx.expression()) {
                callingMethod.addArgument((ASTNode) visit(exprCtx));
            }
        }

        // Handle chained calls
        if (ctx.DOT() != null) {
            for (int i = 0; i < ctx.DOT().size(); i++) {
                // Check if it's another callingMethod, IDENTIFIER, or dataStructure
                if (ctx.callingMethod(i) != null) {
                    callingMethod.addChainedCall((ASTNode) visit(ctx.callingMethod(i)));
                } else if (ctx.IDENTIFIER(i) != null) {
                    callingMethod.addChainedCall(ctx.IDENTIFIER(i).getText()); // Add plain string for IDENTIFIER
                } else if (ctx.dataStructure(i) != null) {
                    callingMethod.addChainedCall((ASTNode) visit(ctx.dataStructure(i)));
                }
            }
        }

        return callingMethod;
    }



    public ASTNode visitDataStructure(AngularParser.DataStructureContext ctx) {
        DataStructure dataStructure=new DataStructure();
        if (ctx.list() != null) {
            dataStructure.setStructure1((ListStructure) visitList(ctx.list())); ;
           return dataStructure;
        }
        if (ctx.map() != null) {
            dataStructure.setStructure2((MapStructure) visitMap(ctx.map())) ;
            return dataStructure;
        }
        return null;
    }

    public ASTNode visitItemsStructures(AngularParser.ItemsStructuresContext ctx) {
        if (ctx.literal() != null) {
            return new ItemsStructures((ASTNode) visit(ctx.literal()));
        }
        if (ctx.IDENTIFIER() != null) {
            return new ItemsStructures(ctx.IDENTIFIER().getText());
        }
        if (ctx.list() != null) {
            return new ItemsStructures((ASTNode) visit(ctx.list()));
        }
        if (ctx.map() != null) {
            return new ItemsStructures((ASTNode) visit(ctx.map()));
        }
        if (ctx.callingMethod() != null) {
            return new ItemsStructures((ASTNode) visit(ctx.callingMethod()));
        }
        return null;
    }


    public ASTNode visitMap(AngularParser.MapContext ctx) {
        MapStructure map = new MapStructure();

        if (ctx.itemsStructures().size() % 2 == 0) {
            for (int i = 0; i < ctx.itemsStructures().size(); i += 2) {
                ItemsStructures key = (ItemsStructures) visit(ctx.itemsStructures(i));
                ItemsStructures value = (ItemsStructures) visit(ctx.itemsStructures(i + 1));
                map.addEntry(key, value);
            }
        }

        return map;
    }

    public ASTNode visitList(AngularParser.ListContext ctx) {
        ListStructure list = new ListStructure();

        if (ctx.itemsStructures() != null) {
            for (AngularParser.ItemsStructuresContext itemCtx : ctx.itemsStructures()) {
                list.addItem((ItemsStructures) visit(itemCtx));
            }
        }

        return list;
    }

    public ASTNode visitOperator(AngularParser.OperatorContext ctx) {
        if (ctx.EQUAL() != null) return new Operator("=");
        if (ctx.getChild(0) != ctx.PLUS()&&ctx.getChild(1) == ctx.EQUAL()) return new Operator("+=");
        if (ctx.getChild(0) != ctx.MINUS()&&ctx.getChild(1) == ctx.EQUAL()) return new Operator("-=");
        if (ctx.MINUS() != null) return new Operator("-");
        if (ctx.STAR() != null) return new Operator("*");
        if (ctx.DIVIDE() != null) return new Operator("/");
        if (ctx.PLUS() != null) return new Operator("+");
        if (ctx.MINUS() != null) return new Operator("-");
        return null;
    }

    public ASTNode visitCompersion(AngularParser.CompersionContext ctx) {
        if (ctx.GREATER_THAN() != null) return new Comparison(">");
        if (ctx.LESS_THAN() != null) return new Comparison("<");
        if (ctx.GREATER_THAN_OR_EQUAL() != null) return new Comparison(">=");
        if (ctx.LESS_THAN_OR_EQUAL() != null) return new Comparison("<=");
        if (ctx.NOT_EQUAL() != null) return new Comparison("!=");
        if (ctx.EQUAL_TO() != null) return new Comparison("==");
        if (ctx.AND() != null) return new Comparison("&&");
        if (ctx.OR() != null) return new Comparison("||");
        if (ctx.EQUAL_TO3() != null) return new Comparison("===");
        if (ctx.NOT_EQUAL2() != null) return new Comparison("!==");
        return null;
    }

    public ASTNode visitIfStatement(AngularParser.IfStatementContext ctx) {
        if (ctx.shortIf() != null) {
            // Handle arrow method
            return (ASTNode) visit(ctx.shortIf());
        }
        if (ctx.arrowIf() != null) {
            // Handle arrow method
            return (ASTNode) visit(ctx.arrowIf());
        }
        // Visit the expression (condition) and block
        ASTNode condition = (ASTNode) visit(ctx.expression());
        Block block = (Block) visit(ctx.block());

        // Create the IfStatement with condition and block
        IfStatement ifStatement = new IfStatement(condition, block);

        // Visit any else-if statements and add them
        for (AngularParser.ElseIfStatmentContext elseIfCtx : ctx.elseIfStatment()) {
            ElseIfStatement elseIfStatement = (ElseIfStatement) visit(elseIfCtx);
            ifStatement.addElseIfStatement(elseIfStatement);
        }

        // Visit the else statement if it exists
        if (ctx.elseStatment() != null) {
            ElseStatement elseStatement = (ElseStatement) visit(ctx.elseStatment());
            ifStatement.setElseStatement(elseStatement);
        }

        return ifStatement;
    }


    public ASTNode visitElseIfStatment(AngularParser.ElseIfStatmentContext ctx) {
        // Visit the expression and block inside the elseif statement
        ASTNode condition = (ASTNode) visit(ctx.expression());
        Block block = (Block) visit(ctx.block());

        // Return a new ElseIfStatement with the condition and block
        return new ElseIfStatement(condition, block);
    }


    public ASTNode visitElseStatment(AngularParser.ElseStatmentContext ctx) {
        Block block = (Block) visit(ctx.block());

        // Return a new ElseStatement with the block
        return new ElseStatement(block);
    }

    public ASTNode visitShortIf(AngularParser.ShortIfContext ctx) {
        // Visit the expression and statement parts of the short if
        ASTNode expression = (ASTNode) visit(ctx.expression());
        Statement statement = (Statement) visit(ctx.statement());

        // Create the ShortIf AST node
        ShortIf shortIf = new ShortIf(expression, statement);

        // Visit any short else if blocks
        for (AngularParser.ShortElseIfContext shortElseIfCtx : ctx.shortElseIf()) {
            ShortElseIf shortElseIf = (ShortElseIf) visit(shortElseIfCtx);
            shortIf.addShortElseIf(shortElseIf);
        }

        // Visit the short else block
        ShortElse shortElse = (ShortElse) visit(ctx.shortelse());
        shortIf.setShortElse(shortElse);

        return shortIf;
    }


    public ASTNode visitShortElseIf(AngularParser.ShortElseIfContext ctx) {
        // Visit the expression and statement parts of short else if
        Expression expression = (Expression) visit(ctx.expression());
        Statement statement = (Statement) visit(ctx.statement());
        return new ShortElseIf(expression, statement);
    }

    public ASTNode visitShortelse(AngularParser.ShortelseContext ctx) {

        // Visit the statement inside the short else and return it
        Statement statement = (Statement) visit(ctx.statement());
        return new ShortElse(statement);


    }

    public ASTNode visitArrowIf(AngularParser.ArrowIfContext ctx) {
        // Visit the expression before the ARROW (condition)
        Expression condition = (Expression) visit(ctx.expression(0));

        // Visit the expression after the ARROW (result)
        Expression result = (Expression) visit(ctx.expression(1));

        // Create and return an ArrowIf object with the condition and result
        return new ArrowIf(condition, result);
    }


    public ASTNode visitForStatement(AngularParser.ForStatementContext ctx) {
        // Visit the components of the for-statement
        ASTNode initializer = ctx.variableDeclaration() != null
                ? (ASTNode) visit(ctx.variableDeclaration())
                : ctx.expression(0) != null
                ? (ASTNode) visit(ctx.expression(0))
                : null;

        ASTNode condition = ctx.expression(1) != null ? (ASTNode) visit(ctx.expression(1)) : null;
        ASTNode increment = ctx.expression(2) != null ? (ASTNode) visit(ctx.expression(2)) : null;
        Block block = (Block) visit(ctx.block());

        // Create and return a ForStatement node
        return new ForStatement(initializer, condition, increment, block);
    }


    public ASTNode visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        // Visit the condition (expression) and the block
        ASTNode condition = (ASTNode) visit(ctx.expression());
        Block block = (Block) visit(ctx.block());

        // Create and return a WhileStatement node
        return new WhileStatement(condition, block);
    }
    public ASTNode visitObjectLiteral(AngularParser.ObjectLiteralContext ctx) {
        ObjectLiteral objectLiteral = new ObjectLiteral();

        // Visit each property in the object literal
        for (AngularParser.PropertyContext propertyCtx : ctx.property()) {
            Property property = (Property) visit(propertyCtx);
            objectLiteral.addProperty(property);
        }

        return objectLiteral;
    }


    public ASTNode visitLiteral(AngularParser.LiteralContext ctx) {
        // Handle signed integers
        if (ctx.Integer() != null) {
            String sign = ctx.PLUS() != null ? "+" : ctx.MINUS() != null ? "-" : "";
            return new Literal(sign + ctx.Integer().getText(), "Integer");
        }

        // Handle signed floats
        if (ctx.Float() != null) {
            String sign = ctx.PLUS() != null ? "+" : ctx.MINUS() != null ? "-" : "";
            return new Literal(sign + ctx.Float().getText(), "Float");
        }

        // Handle strings
        if (ctx.String() != null) {
            return new Literal(ctx.String().getText(), "String");
        }

        // Handle booleans
        if (ctx.Boolean() != null) {
            return new Literal(Boolean.valueOf(ctx.Boolean().getText()), "Boolean");
        }

        // Handle null
        if (ctx.Null() != null) {
            return new Literal(null, "Null");
        }

        // Handle undefined
        if (ctx.Undefined() != null) {
            return new Literal("undefined", "Undefined");
        }

        // Handle 'this'
        if (ctx.THIS() != null) {
            return new Literal("this", "This");
        }

        return null; // Default case (should not be reached)
    }

    public ASTNode visitStatement(AngularParser.StatementContext ctx) {
        if (ctx.expressionStatement() != null) {
            return (ASTNode) visit(ctx.expressionStatement()); // لا تغلف ب Statement مرة ثانية
        }
        if (ctx.variableDeclaration() != null) {
            return new Statement((ASTNode) visit(ctx.variableDeclaration()));
        } else if (ctx.objectDecleration() != null) {
            return new Statement((ASTNode)visit(ctx.objectDecleration()));
        } else if (ctx.ifStatement() != null) {
            return new Statement((ASTNode)visit(ctx.ifStatement()));
        } else if (ctx.forStatement() != null) {
            return new Statement((ASTNode)visit(ctx.forStatement()));
        } else if (ctx.whileStatement() != null) {
            return new Statement((ASTNode)visit(ctx.whileStatement()));
        } else if (ctx.expressionStatement() != null) {
            return new Statement((ASTNode)visit(ctx.expressionStatement()));
        }
        return new Statement(null);
    }
    public ASTNode visitObjectDecleration(AngularParser.ObjectDeclerationContext ctx) {
        // Visit property or object name (could be a Property or ObjectName)
        ASTNode propertyOrObjectName =(ASTNode) visit(ctx.property() != null ? ctx.property() : ctx.objectName());

        // Visit object initialization
        ObjectInit objectInit = (ObjectInit) visit(ctx.objectInit());



        return new ObjectDeclaration(propertyOrObjectName, objectInit);
    }

    public ASTNode visitObjectName(AngularParser.ObjectNameContext ctx) {
        String name = ctx.IDENTIFIER().getText(); // Get the IDENTIFIER
        ObjectType type = null;

        // If objectType exists, visit it
        if (ctx.objectType() != null) {
            type = (ObjectType) visit(ctx.objectType());
        }


        return new ObjectName(name, type);
    }

    public ASTNode visitObjectInit(AngularParser.ObjectInitContext ctx) {
        String className = ctx.IDENTIFIER().getText(); // Get the class name (IDENTIFIER)
        ObjectType objectType = null;

        // If objectType exists, visit and parse it
        if (ctx.objectType() != null) {
            objectType = (ObjectType) visit(ctx.objectType());
        }

        // Create ObjectInit instance
        ObjectInit objectInit = new ObjectInit(className, objectType);

        // Visit and add arguments (expressions) if present
        if (ctx.expression() != null) {
            for (AngularParser.ExpressionContext exprCtx : ctx.expression()) {
                objectInit.addArgument((ASTNode) visit(exprCtx));
            }
        }

        return objectInit;
    }

    public ASTNode visitObjectType(AngularParser.ObjectTypeContext ctx) {
        ObjectType objectType = new ObjectType();

        // Iterate through each IDENTIFIER and optional list
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            String identifier = ctx.IDENTIFIER(i).getText();

            // Check if a list is present for this identifier
            ASTNode list = null;
            if (ctx.list(i) != null) {
                list = (ASTNode) visit(ctx.list(i));
            }

            objectType.addType(identifier, list);
        }

        return objectType;
    }
    public Object visitConstructorDecleration(AngularParser.ConstructorDeclerationContext ctx) {

        ParameterList parameters = (ParameterList) visit(ctx.parameterList());
        // Visit the block
        Block block = ctx.block() != null ? (Block) visit(ctx.block()) : null;

        // Create and populate the ConstructorDeclaration node
        ConstructorDeclaration constructorDeclaration = new ConstructorDeclaration(parameters,block);


        return constructorDeclaration;


    }

    public ASTNode visitInputDeclaration(AngularParser.InputDeclarationContext ctx) {
        // Extract the literal if present
        Literal literal = null;
        if (ctx.literal() != null) {
            literal = (Literal) visit(ctx.literal());
        }
        Property property = null;
        if (ctx.property() != null) {
            property = (Property) visit(ctx.property());
        }

        // Create the InputDeclaration node
        InputDeclaration inputDeclaration = new InputDeclaration(literal, property);

        return inputDeclaration;
    }


    public ASTNode visitOutputDeclaration(AngularParser.OutputDeclarationContext ctx) {
        // Extract the optional literal (expression)
        Literal literal = ctx.literal() != null ? (Literal) visit(ctx.literal()) : null;

        // Extract the object declaration
        ObjectDeclaration objectDeclaration = (ObjectDeclaration) visit(ctx.objectDecleration());

        return new OutputDeclaration(literal, objectDeclaration);
    }



    public ASTNode visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        String modifier = null;
        String type = null;
        String name = ctx.IDENTIFIER(0).getText();
        ASTNode expression = null;
        ASTNode initialValue = null;
        String alias = null;

        // Check for modifier (e.g., 'public', 'private', 'static')
        if (ctx.modifier() != null) {
            modifier = ctx.modifier().getText();
        }

        // Check for type (e.g., 'int', 'String')
        if (ctx.type() != null) {
            type = ctx.type().getText();
        }

        // Check if there's a type annotation (COLON expression)
        if (ctx.expression(0) != null) {
            expression = (ASTNode) visit(ctx.expression(0));
        }

        // Check for initial value (EQUAL expression)
        if (ctx.expression(1) != null) {
            initialValue = (Expression) visit(ctx.expression(1));
        }

        // Check for alias (AS IDENTIFIER)
        if (ctx.AS() != null) {
            alias = ctx.IDENTIFIER(1).getText();
        }
        return new VariableDeclaration(modifier, type, name, expression, initialValue, alias);
    }


    public ASTNode visitType(AngularParser.TypeContext ctx) {

        String typeText = ctx.getText();
        return new Type(typeText);
    }

    public ASTNode visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx) {
        // Parse the modifier if present
        Modifier modifier = ctx.modifier() != null ? (Modifier) visit(ctx.modifier()) : null;

        // Visit the property
        Property property = (Property) visit(ctx.property());

        // Visit the assigned value if present
        ASTNode value = ctx.expression() != null ?(ASTNode) visit(ctx.expression()) : null;
        String type=ctx.getText();
        // Create and return the PropertyDeclaration AST node
        return new PropertyDeclaration(modifier, property, value,type);
    }


    public ASTNode visitProperty(AngularParser.PropertyContext ctx) {
        if (ctx.imports() != null) {
            Imports imports = (Imports) visit(ctx.imports());
            return new Property("imports", imports);
        }

        String name = ctx.IDENTIFIER().getText();
        ASTNode value =(ASTNode) visit(ctx.expression());

        return new Property(name, value);
    }
    @Override
    public ASTNode visitScriptBlock(AngularParser.ScriptBlockContext ctx) {
        Program program = new Program();

        // ctx.tsStatement() يرجع قائمة جمل TypeScript داخل scriptBlock
        for (AngularParser.TsStatementContext tsStmtCtx : ctx.tsStatement()) {
            ASTNode node = (ASTNode) visit(tsStmtCtx);  // زور كل جملة TypeScript
            if (node != null) {
                program.addElement(node);
            }
        }

        return program;
    }

//expression
public Object visitExpressionList(AngularParser.ExpressionListContext ctx) {
    ASTNode expression = (ASTNode) visit(ctx.expression());
    ListStructure list = (ListStructure) visit(ctx.list());
    return new ExpressionList(expression, list);
}

    @Override
    public ASTNode visitObjectLiteralExpression(AngularParser.ObjectLiteralExpressionContext ctx) {
        return new ExistingExpression((ASTNode) visit(ctx.objectLiteral())).expression;
    }

    @Override
    public ASTNode visitObjectDeclarationExpression(AngularParser.ObjectDeclarationExpressionContext ctx) {
        return new ExistingExpression((ASTNode) visit(ctx.objectDecleration())).expression;
    }

    @Override
    public ASTNode visitObjectNameExpression(AngularParser.ObjectNameExpressionContext ctx) {
        return new ExistingExpression((ASTNode) visit(ctx.objectName())).expression;
    }

    @Override
    public ASTNode visitArrowMethodExpression(AngularParser.ArrowMethodExpressionContext ctx) {
        return new ExistingExpression((ASTNode) visit(ctx.arrowMethod())).expression;
    }

    @Override
    public Object visitAssignmentExpression(AngularParser.AssignmentExpressionContext ctx) {
        ASTNode left = (ASTNode) visit(ctx.expression());
        ASTNode right = ctx.literal() != null ? (ASTNode) visit(ctx.literal()) : (ASTNode) visit(ctx.dataStructure());
        return new AssignmentExpression(left, right);
    }

    @Override
    public Object visitThisExpression(AngularParser.ThisExpressionContext ctx) {
        return new ThisExpression();
    }

    @Override
    public Object visitIdentifierExpression(AngularParser.IdentifierExpressionContext ctx) {
        return new IdentifierExpression(ctx.IDENTIFIER().getText());
    }

    @Override
    public Object visitPostIncrementExpression(AngularParser.PostIncrementExpressionContext ctx) {
        return new PostIncrementExpression(ctx.IDENTIFIER().getText());
    }

    @Override
    public Object visitPostDecrementExpression(AngularParser.PostDecrementExpressionContext ctx) {
        return new PostDecrementExpression(ctx.IDENTIFIER().getText());
    }

    @Override
    public ASTNode visitLiteralExpression(AngularParser.LiteralExpressionContext ctx) {

        return new ExistingExpression((ASTNode) visit(ctx.literal())).expression;
    }

    @Override
    public ASTNode visitCallingMethodExpression(AngularParser.CallingMethodExpressionContext ctx) {

        return new ExistingExpression((ASTNode) visit(ctx.callingMethod())).expression;
    }

    @Override
    public Object visitDotExpression(AngularParser.DotExpressionContext ctx) {
        ASTNode left = (ASTNode) visit(ctx.expression(0));
        ASTNode right = (ASTNode) visit(ctx.expression(1));
        return new DotExpression(left, right);
    }

    @Override
    public Object visitComparisonExpression(AngularParser.ComparisonExpressionContext ctx) {
        ASTNode left = (ASTNode) visit(ctx.expression(0));
        String operator = ctx.compersion().getText();
        ASTNode right = (ASTNode) visit(ctx.expression(1));
        return new ComparisonExpression(left, operator, right);
    }

    @Override
    public Object visitOperatorExpression(AngularParser.OperatorExpressionContext ctx) {
        ASTNode left = (ASTNode) visit(ctx.expression(0));
        String operator = ctx.operator().getText();
        ASTNode right = (ASTNode) visit(ctx.expression(1));
        return new OperatorExpression(left, operator, right);
    }

    @Override
    public Object visitGenericTypeExpression(AngularParser.GenericTypeExpressionContext ctx) {
        ASTNode innerExpression = (ASTNode) visit(ctx.expression());
        String identifier = ctx.IDENTIFIER().getText();
        return new GenericTypeExpression(innerExpression, identifier);
    }

    @Override
    public Object visitTypeCastExpression(AngularParser.TypeCastExpressionContext ctx) {
        ASTNode innerExpression = (ASTNode) visit(ctx.expression());
        String typeIdentifier = ctx.IDENTIFIER().getText();
        return new TypeCastExpression(innerExpression, typeIdentifier);
    }

    @Override
    public ASTNode visitDataStructureExpression(AngularParser.DataStructureExpressionContext ctx) {
        return (ASTNode) visitDataStructure(ctx.dataStructure());
    }
    @Override
    public ASTNode visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) {
        ASTNode expr = (ASTNode) visit(ctx.expression());
        return new Statement(expr);
    }
//css visitor
@Override
public ASTNode visitStyleBlock(AngularParser.StyleBlockContext ctx) {
    List<CSSRule> rules = new ArrayList<>();
    for (AngularParser.CssRuleContext ruleCtx : ctx.cssRules().cssRule()) {
        rules.add((CSSRule) visit(ruleCtx));
    }
    return new StyleBlock(rules);
}

    @Override
    public ASTNode visitCssRule(AngularParser.CssRuleContext ctx) {
        CSSSelector selector = (CSSSelector) visit(ctx.cssSelector());
        CSSDeclarations declarations = (CSSDeclarations) visit(ctx.cssDeclarations());
        return new CSSRule(selector, declarations.getDeclarations());
    }

    @Override
    public ASTNode visitCssSelector(AngularParser.CssSelectorContext ctx) {
        List<SimpleSelector> selectors = new ArrayList<>();
        for (AngularParser.SimpleSelectorContext s : ctx.simpleSelector()) {
            selectors.add((SimpleSelector) visit(s));
        }
        return new CSSSelector(selectors);
    }

    @Override
    public ASTNode visitSimpleSelector(AngularParser.SimpleSelectorContext ctx) {
        if (ctx.CSS_CLASS_SELECTOR() != null) {
            String className = ctx.CSS_CLASS_SELECTOR().getText();
            return new SimpleSelector(SimpleSelector.SelectorType.CLASS, className);
        } else if (ctx.CSS_ID_SELECTOR() != null) {
            String idName = ctx.CSS_ID_SELECTOR().getText();
            return new SimpleSelector(SimpleSelector.SelectorType.ID, idName);
        } else if (ctx.CSS_ELEMENT_SELECTOR() != null) {
            String tagName = ctx.CSS_ELEMENT_SELECTOR().getText();
            return new SimpleSelector(SimpleSelector.SelectorType.ELEMENT, tagName);
        }
        return null;
    }

    @Override
    public ASTNode visitCssDeclarations(AngularParser.CssDeclarationsContext ctx) {
        List<CSSDeclaration> declarations = new ArrayList<>();
        for (AngularParser.CssDeclarationContext declCtx : ctx.cssDeclaration()) {
            declarations.add((CSSDeclaration) visit(declCtx));
        }
        return new CSSDeclarations(declarations);
    }

    @Override
    public ASTNode visitCssDeclaration(AngularParser.CssDeclarationContext ctx) {
        String property = ctx.CSS_PROPERTY(0).getText();
        List<String> values = new ArrayList<>();
        for (var value : ctx.CSS_VALUE()) {
            values.add(value.getText());
        }
        return new CSSDeclaration(property, values);
    }
    @Override
    public ASTNode visitStylesheet(AngularParser.StylesheetContext ctx) {
        return (ASTNode) visit(ctx.styleBlock()); // لأنه يحتوي القواعد
    }


}
