// Generated from C:/Users/MyPre/IdeaProjects/compilar/src/backend/PythonParser.g4 by ANTLR 4.13.2
package backend;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefStmt(PythonParser.FunctionDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefStmt(PythonParser.FunctionDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclStmt(PythonParser.ClassDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclStmt(PythonParser.ClassDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(PythonParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(PythonParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(PythonParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(PythonParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(PythonParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(PythonParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWithStmt(PythonParser.WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWithStmt(PythonParser.WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorStmt(PythonParser.DecoratorStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorStmt(PythonParser.DecoratorStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PassStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPassStmt(PythonParser.PassStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PassStmt}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPassStmt(PythonParser.PassStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImport}
	 * labeled alternative in {@link PythonParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterFromImport(PythonParser.FromImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImport}
	 * labeled alternative in {@link PythonParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitFromImport(PythonParser.FromImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleImport}
	 * labeled alternative in {@link PythonParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleImport(PythonParser.SimpleImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleImport}
	 * labeled alternative in {@link PythonParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleImport(PythonParser.SimpleImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(PythonParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(PythonParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItem(PythonParser.ImportItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItem(PythonParser.ImportItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(PythonParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(PythonParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PythonParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PythonParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PythonParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PythonParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSuite(PythonParser.SimpleSuiteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSuite(PythonParser.SimpleSuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterBlockSuite(PythonParser.BlockSuiteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockSuite}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitBlockSuite(PythonParser.BlockSuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PythonParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(PythonParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(PythonParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(PythonParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(PythonParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#baseClasses}.
	 * @param ctx the parse tree
	 */
	void enterBaseClasses(PythonParser.BaseClassesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#baseClasses}.
	 * @param ctx the parse tree
	 */
	void exitBaseClasses(PythonParser.BaseClassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#decoratorStatement}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorStatement(PythonParser.DecoratorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#decoratorStatement}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorStatement(PythonParser.DecoratorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#decoratorCall}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorCall(PythonParser.DecoratorCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#decoratorCall}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorCall(PythonParser.DecoratorCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(PythonParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(PythonParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleTarget}
	 * labeled alternative in {@link PythonParser#assignTarget}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTarget(PythonParser.SimpleTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleTarget}
	 * labeled alternative in {@link PythonParser#assignTarget}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTarget(PythonParser.SimpleTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexTarget}
	 * labeled alternative in {@link PythonParser#assignTarget}.
	 * @param ctx the parse tree
	 */
	void enterIndexTarget(PythonParser.IndexTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexTarget}
	 * labeled alternative in {@link PythonParser#assignTarget}.
	 * @param ctx the parse tree
	 */
	void exitIndexTarget(PythonParser.IndexTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeTarget}
	 * labeled alternative in {@link PythonParser#assignTarget}.
	 * @param ctx the parse tree
	 */
	void enterAttributeTarget(PythonParser.AttributeTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeTarget}
	 * labeled alternative in {@link PythonParser#assignTarget}.
	 * @param ctx the parse tree
	 */
	void exitAttributeTarget(PythonParser.AttributeTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignOp(PythonParser.AssignOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignOp(PythonParser.AssignOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(PythonParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(PythonParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PythonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PythonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(PythonParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(PythonParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(PythonParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(PythonParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link PythonParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(PythonParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link PythonParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(PythonParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link PythonParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(PythonParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link PythonParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(PythonParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(PythonParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(PythonParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(PythonParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(PythonParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterCallTrailer(PythonParser.CallTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitCallTrailer(PythonParser.CallTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterIndexTrailer(PythonParser.IndexTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitIndexTrailer(PythonParser.IndexTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterAttributeTrailer(PythonParser.AttributeTrailerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeTrailer}
	 * labeled alternative in {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitAttributeTrailer(PythonParser.AttributeTrailerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAtom(PythonParser.IdentifierAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAtom(PythonParser.IdentifierAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(PythonParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(PythonParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(PythonParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(PythonParser.TrueAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(PythonParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(PythonParser.FalseAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNoneAtom(PythonParser.NoneAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNoneAtom(PythonParser.NoneAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParenAtom(PythonParser.ParenAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParenAtom(PythonParser.ParenAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterListAtom(PythonParser.ListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitListAtom(PythonParser.ListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDictAtom(PythonParser.DictAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDictAtom(PythonParser.DictAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListCompAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterListCompAtom(PythonParser.ListCompAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListCompAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitListCompAtom(PythonParser.ListCompAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(PythonParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dictItem}.
	 * @param ctx the parse tree
	 */
	void enterDictItem(PythonParser.DictItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dictItem}.
	 * @param ctx the parse tree
	 */
	void exitDictItem(PythonParser.DictItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void enterListComprehension(PythonParser.ListComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void exitListComprehension(PythonParser.ListComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(PythonParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(PythonParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PythonParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PythonParser.ArgumentContext ctx);
}