package backend;

import backend.AST.*;
import shared.ASTNode;
import shared.SymbolTable;
import org.antlr.v4.runtime.tree.ParseTree;

public class PythonASTVisitor extends PythonParserBaseVisitor<ASTNode> {

    private ProgramNode root;
    private SymbolTable symbolTable;

    public PythonASTVisitor() {
        symbolTable = new SymbolTable();
    }

    public ProgramNode getRoot() {
        return root;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public ASTNode visitProgram(PythonParser.ProgramContext ctx) {
        root = new ProgramNode(1);

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof PythonParser.StatementContext) {
                PythonParser.StatementContext stmtCtx = (PythonParser.StatementContext) child;

                if (stmtCtx.getParent() == ctx) {
                    ASTNode node = visitTopLevelStatement(stmtCtx);
                    if (node != null) {
                        root.addChild(node);
                    }
                }
            }
        }

        return root;
    }

    private ASTNode visitTopLevelStatement(PythonParser.StatementContext ctx) {
        if (ctx instanceof PythonParser.ImportStmtContext) {
            return visit(((PythonParser.ImportStmtContext) ctx).importStatement());
        } else if (ctx instanceof PythonParser.FunctionDefStmtContext) {
            return visitFunctionDefHelper(((PythonParser.FunctionDefStmtContext) ctx).functionDef(), null);
        } else if (ctx instanceof PythonParser.DecoratorStmtContext) {
            PythonParser.DecoratorStmtContext decorCtx = (PythonParser.DecoratorStmtContext) ctx;
            String decoratorName = decorCtx.decoratorStatement().decoratorCall().IDENTIFIER(0).getText();
            return visitFunctionDefHelper(decorCtx.decoratorStatement().functionDef(), "@" + decoratorName);
        } else if (ctx instanceof PythonParser.ClassDeclStmtContext) {
            return visitClassDeclarationHelper(((PythonParser.ClassDeclStmtContext) ctx).classDeclaration());
        } else if (ctx instanceof PythonParser.AssignmentStmtContext) {
            return visitAssignmentHelper(((PythonParser.AssignmentStmtContext) ctx).assignment());
        } else if (ctx instanceof PythonParser.IfStmtContext) {
            return visitIfStatementHelper(((PythonParser.IfStmtContext) ctx).ifStatement());
        } else if (ctx instanceof PythonParser.ExpressionStmtContext) {
            return visit(((PythonParser.ExpressionStmtContext) ctx).expressionStatement());
        } else if (ctx instanceof PythonParser.ForStmtContext) {
            return visitForStatementHelper(((PythonParser.ForStmtContext) ctx).forStatement());
        }

        return null;
    }

    @Override
    public ASTNode visitFromImport(PythonParser.FromImportContext ctx) {
        String moduleName = ctx.moduleName.getText();
        int line = ctx.getStart().getLine();

        ImportNode importNode = new ImportNode(moduleName, line, true);

        for (PythonParser.ImportItemContext item : ctx.importList().importItem()) {
            String name = item.IDENTIFIER(0).getText();
            importNode.addImportedName(name);
            symbolTable.insert(name, "IMPORTED_MODULE", line);
        }

        return importNode;
    }

    @Override
    public ASTNode visitSimpleImport(PythonParser.SimpleImportContext ctx) {
        int line = ctx.getStart().getLine();
        ImportNode importNode = new ImportNode("", line, false);

        for (PythonParser.ImportItemContext item : ctx.importList().importItem()) {
            String name = item.IDENTIFIER(0).getText();
            importNode.addImportedName(name);
            symbolTable.insert(name, "IMPORTED_MODULE", line);
        }

        return importNode;
    }

    private ASTNode visitFunctionDefHelper(PythonParser.FunctionDefContext ctx, String decorator) {
        String functionName = ctx.functionName.getText();
        int line = ctx.getStart().getLine();

        FunctionDefNode funcNode = new FunctionDefNode(functionName, line);

        if (decorator != null) {
            funcNode.addDecorator(decorator);
        }

        symbolTable.enterScope();

        if (ctx.parameters() != null) {
            for (PythonParser.ParameterContext param : ctx.parameters().parameter()) {
                String paramName = param.IDENTIFIER().getText();
                funcNode.addParameter(paramName);
                symbolTable.insert(paramName, "PARAMETER", line);
            }
        }

        if (ctx.suite() != null) {
            processSuite(ctx.suite(), funcNode);
        }

        symbolTable.exitScope();

        symbolTable.insert(functionName, "FUNCTION", line);

        return funcNode;
    }

    private ASTNode visitClassDeclarationHelper(PythonParser.ClassDeclarationContext ctx) {
        String className = ctx.className.getText();
        int line = ctx.getStart().getLine();

        ClassDefNode classNode = new ClassDefNode(className, line);

        if (ctx.baseClasses() != null) {
            for (var baseClass : ctx.baseClasses().IDENTIFIER()) {
                classNode.addBaseClass(baseClass.getText());
            }
        }

        symbolTable.enterScope();

        if (ctx.suite() != null) {
            processSuite(ctx.suite(), classNode);
        }

        symbolTable.exitScope();

        symbolTable.insert(className, "CLASS", line);

        return classNode;
    }

    private void processSuite(PythonParser.SuiteContext ctx, ASTNode parentNode) {
        if (ctx instanceof PythonParser.SimpleSuiteContext) {
            PythonParser.SimpleSuiteContext simpleCtx = (PythonParser.SimpleSuiteContext) ctx;
            ASTNode stmt = visitStatementInBody(simpleCtx.simpleStatement().statement());
            if (stmt != null) {
                addToParent(parentNode, stmt);
            }
        } else if (ctx instanceof PythonParser.BlockSuiteContext) {
            PythonParser.BlockSuiteContext blockCtx = (PythonParser.BlockSuiteContext) ctx;
            for (PythonParser.StatementContext stmt : blockCtx.statementBlock().statement()) {
                ASTNode node = visitStatementInBody(stmt);
                if (node != null) {
                    addToParent(parentNode, node);
                }
            }
        }
    }

    private ASTNode visitStatementInBody(PythonParser.StatementContext ctx) {
        if (ctx instanceof PythonParser.AssignmentStmtContext) {
            return visitAssignmentHelper(((PythonParser.AssignmentStmtContext) ctx).assignment());
        } else if (ctx instanceof PythonParser.ReturnStmtContext) {
            return visitReturnStatementHelper(((PythonParser.ReturnStmtContext) ctx).returnStatement());
        } else if (ctx instanceof PythonParser.IfStmtContext) {
            return visitIfStatementHelper(((PythonParser.IfStmtContext) ctx).ifStatement());
        } else if (ctx instanceof PythonParser.ForStmtContext) {
            return visitForStatementHelper(((PythonParser.ForStmtContext) ctx).forStatement());
        } else if (ctx instanceof PythonParser.WithStmtContext) {
            return visitWithStatementHelper(((PythonParser.WithStmtContext) ctx).withStatement());
        } else if (ctx instanceof PythonParser.ExpressionStmtContext) {
            return visit(((PythonParser.ExpressionStmtContext) ctx).expressionStatement());
        } else if (ctx instanceof PythonParser.PassStmtContext) {
            int line = ctx.getStart().getLine();
            return new ExpressionNode("pass", "PASS", line);
        }

        return null;
    }

    private ASTNode visitAssignmentHelper(PythonParser.AssignmentContext ctx) {
        String target = ctx.assignTarget().getText();
        String operator = ctx.assignOp().getText();
        int line = ctx.getStart().getLine();

        AssignmentNode assignNode = new AssignmentNode(target, operator, line);

        ASTNode value = visit(ctx.value);
        if (value != null) {
            assignNode.setValue(value);
        }

        symbolTable.insert(target, "VARIABLE", line);

        return assignNode;
    }

    private ASTNode visitReturnStatementHelper(PythonParser.ReturnStatementContext ctx) {
        int line = ctx.getStart().getLine();
        ReturnNode returnNode = new ReturnNode(line);

        if (ctx.expression() != null) {
            ASTNode value = visit(ctx.expression());
            returnNode.setReturnValue(value);
        }

        return returnNode;
    }

    private ASTNode visitIfStatementHelper(PythonParser.IfStatementContext ctx) {
        int line = ctx.getStart().getLine();
        IfNode ifNode = new IfNode(line);

        ASTNode condition = visit(ctx.condition);
        if (condition != null) {
            ifNode.setCondition(condition);
        }

        symbolTable.enterScope();

        if (ctx.suite() != null) {
            processSuite(ctx.suite(), ifNode);
        }

        symbolTable.exitScope();

        return ifNode;
    }

    private ASTNode visitForStatementHelper(PythonParser.ForStatementContext ctx) {
        String loopVar = ctx.loopVar.getText();
        int line = ctx.getStart().getLine();

        ForNode forNode = new ForNode(loopVar, line);

        ASTNode iterable = visit(ctx.iterable);
        if (iterable != null) {
            forNode.setIterable(iterable);
        }

        symbolTable.enterScope();
        symbolTable.insert(loopVar, "LOOP_VARIABLE", line);

        if (ctx.suite() != null) {
            processSuite(ctx.suite(), forNode);
        }

        symbolTable.exitScope();

        return forNode;
    }

    private ASTNode visitWithStatementHelper(PythonParser.WithStatementContext ctx) {
        int line = ctx.getStart().getLine();
        WithNode withNode = new WithNode(line);

        ASTNode expr = visit(ctx.expression());
        withNode.setContextExpression(expr);

        if (ctx.alias != null) {
            withNode.setAlias(ctx.alias.getText());
        }

        symbolTable.enterScope();

        if (ctx.suite() != null) {
            processSuite(ctx.suite(), withNode);
        }

        symbolTable.exitScope();

        return withNode;
    }

    private void addToParent(ASTNode parent, ASTNode child) {
        if (parent instanceof FunctionDefNode) {
            ((FunctionDefNode) parent).addBodyStatement(child);
        } else if (parent instanceof IfNode) {
            ((IfNode) parent).addToIfBody(child);
        } else if (parent instanceof ForNode) {
            ((ForNode) parent).addBodyStatement(child);
        } else if (parent instanceof ClassDefNode) {
            ((ClassDefNode) parent).addBodyStatement(child);
        } else if (parent instanceof WithNode) {
            ((WithNode) parent).addBodyStatement(child);
        }
    }

    @Override
    public ASTNode visitExpression(PythonParser.ExpressionContext ctx) {
        return visit(ctx.comparison());
    }

    @Override
    public ASTNode visitComparison(PythonParser.ComparisonContext ctx) {
        if (ctx.additive().size() == 1) {
            return visit(ctx.additive(0));
        }

        // Create comparison with children
        String expr = ctx.getText();
        int line = ctx.getStart().getLine();
        ExpressionNode compNode = new ExpressionNode(expr, "COMPARISON", line);

        // Add operands as children
        for (PythonParser.AdditiveContext addCtx : ctx.additive()) {
            ASTNode child = visit(addCtx);
            if (child != null) {
                compNode.addChild(child);
            }
        }

        return compNode;
    }

    @Override
    public ASTNode visitPostfix(PythonParser.PostfixContext ctx) {
        if (ctx.trailer().isEmpty()) {
            return visit(ctx.atom());
        }

        // This is a function call or attribute access
        String fullExpr = ctx.getText();
        int line = ctx.getStart().getLine();

        // Check if it's a function call
        boolean isFunctionCall = false;
        for (PythonParser.TrailerContext trailer : ctx.trailer()) {
            if (trailer instanceof PythonParser.CallTrailerContext) {
                isFunctionCall = true;
                break;
            }
        }

        if (isFunctionCall) {
            // Extract function name
            String funcName = ctx.atom().getText();

            // Check for method calls like obj.method()
            if (ctx.trailer().size() > 0) {
                StringBuilder nameBuilder = new StringBuilder(ctx.atom().getText());
                for (int i = 0; i < ctx.trailer().size(); i++) {
                    PythonParser.TrailerContext trailer = ctx.trailer(i);
                    if (trailer instanceof PythonParser.AttributeTrailerContext) {
                        nameBuilder.append(".").append(((PythonParser.AttributeTrailerContext) trailer).IDENTIFIER().getText());
                    } else if (trailer instanceof PythonParser.CallTrailerContext) {
                        funcName = nameBuilder.toString();
                        break;
                    }
                }
            }

            FunctionCallNode callNode = new FunctionCallNode(funcName, line);

            // Add arguments
            for (PythonParser.TrailerContext trailer : ctx.trailer()) {
                if (trailer instanceof PythonParser.CallTrailerContext) {
                    PythonParser.CallTrailerContext callTrailer = (PythonParser.CallTrailerContext) trailer;
                    if (callTrailer.argumentList() != null) {
                        for (PythonParser.ArgumentContext arg : callTrailer.argumentList().argument()) {
                            String argName = null;
                            if (arg.IDENTIFIER() != null) {
                                argName = arg.IDENTIFIER().getText();
                            }
                            ASTNode argValue = visit(arg.expression());
                            callNode.addArgument(argName, argValue);
                        }
                    }
                }
            }

            return callNode;
        }

        // Not a function call, return as expression
        return new ExpressionNode(fullExpr, "ATTRIBUTE_ACCESS", line);
    }

    @Override
    public ASTNode visitDictAtom(PythonParser.DictAtomContext ctx) {
        int line = ctx.getStart().getLine();
        DictNode dictNode = new DictNode(line);

        if (ctx.dictLiteral().dictItem() != null) {
            for (PythonParser.DictItemContext item : ctx.dictLiteral().dictItem()) {
                String key = item.key.getText();
                ASTNode value = visit(item.value);
                dictNode.addItem(key, value);
            }
        }

        return dictNode;
    }

    @Override
    public ASTNode visitListAtom(PythonParser.ListAtomContext ctx) {
        int line = ctx.getStart().getLine();
        ListNode listNode = new ListNode(line);

        if (ctx.listLiteral().expression() != null) {
            for (PythonParser.ExpressionContext expr : ctx.listLiteral().expression()) {
                ASTNode element = visit(expr);
                listNode.addElement(element);
            }
        }

        return listNode;
    }

    @Override
    public ASTNode visitListCompAtom(PythonParser.ListCompAtomContext ctx) {
        int line = ctx.getStart().getLine();
        String variable = ctx.listComprehension().IDENTIFIER().getText();

        ListComprehensionNode compNode = new ListComprehensionNode(variable, line);

        // Expression
        ASTNode expr = visit(ctx.listComprehension().expression(0));
        compNode.setExpression(expr);

        // Iterable
        ASTNode iterable = visit(ctx.listComprehension().expression(1));
        compNode.setIterable(iterable);

        // Condition (if exists)
        if (ctx.listComprehension().expression().size() > 2) {
            ASTNode condition = visit(ctx.listComprehension().expression(2));
            compNode.setCondition(condition);
        }

        return compNode;
    }

    @Override
    public ASTNode visitAdditive(PythonParser.AdditiveContext ctx) {
        if (ctx.multiplicative().size() == 1) {
            return visit(ctx.multiplicative(0));
        }

        String expr = ctx.getText();
        int line = ctx.getStart().getLine();
        return new ExpressionNode(expr, "ADDITIVE", line);
    }

    @Override
    public ASTNode visitMultiplicative(PythonParser.MultiplicativeContext ctx) {
        if (ctx.unary().size() == 1) {
            return visit(ctx.unary(0));
        }

        String expr = ctx.getText();
        int line = ctx.getStart().getLine();
        return new ExpressionNode(expr, "MULTIPLICATIVE", line);
    }

    @Override
    public ASTNode visitPowerExpr(PythonParser.PowerExprContext ctx) {
        return visit(ctx.power());
    }

    @Override
    public ASTNode visitPower(PythonParser.PowerContext ctx) {
        return visit(ctx.postfix());
    }

    @Override
    public ASTNode visitIdentifierAtom(PythonParser.IdentifierAtomContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        return new ExpressionNode(identifier, "IDENTIFIER", line);
    }

    @Override
    public ASTNode visitNumberAtom(PythonParser.NumberAtomContext ctx) {
        String number = ctx.NUMBER().getText();
        int line = ctx.getStart().getLine();
        return new ExpressionNode(number, "NUMBER", line);
    }

    @Override
    public ASTNode visitStringAtom(PythonParser.StringAtomContext ctx) {
        String string = ctx.STRING().getText();
        int line = ctx.getStart().getLine();
        return new ExpressionNode(string, "STRING", line);
    }

    @Override
    public ASTNode visitTrueAtom(PythonParser.TrueAtomContext ctx) {
        int line = ctx.getStart().getLine();
        return new ExpressionNode("True", "BOOLEAN", line);
    }

    @Override
    public ASTNode visitFalseAtom(PythonParser.FalseAtomContext ctx) {
        int line = ctx.getStart().getLine();
        return new ExpressionNode("False", "BOOLEAN", line);
    }

    @Override
    public ASTNode visitNoneAtom(PythonParser.NoneAtomContext ctx) {
        int line = ctx.getStart().getLine();
        return new ExpressionNode("None", "NONE", line);
    }

    @Override
    public ASTNode visitParenAtom(PythonParser.ParenAtomContext ctx) {
        return visit(ctx.expression());
    }
}