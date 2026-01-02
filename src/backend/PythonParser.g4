parser grammar PythonParser;

options {
    tokenVocab = PythonLexer;
}

program
    : (statement | NEWLINE)* EOF
    ;

statement
    : importStatement           #ImportStmt
    | functionDef               #FunctionDefStmt
    | classDeclaration          #ClassDeclStmt
    | assignment                #AssignmentStmt
    | expressionStatement       #ExpressionStmt
    | returnStatement           #ReturnStmt
    | ifStatement               #IfStmt
    | forStatement              #ForStmt
    | withStatement             #WithStmt
    | decoratorStatement        #DecoratorStmt
    | PASS                      #PassStmt
    ;

importStatement
    : FROM moduleName=dottedName IMPORT importList     #FromImport
    | IMPORT importList                                #SimpleImport
    ;

dottedName
    : IDENTIFIER (DOT IDENTIFIER)*
    ;

importList
    : NEWLINE* importItem (COMMA NEWLINE* importItem)* COMMA? NEWLINE*
    ;

importItem
    : IDENTIFIER (AS alias=IDENTIFIER)?
    ;

functionDef
    : DEF functionName=IDENTIFIER LPAREN parameters? RPAREN COLON suite
    ;

parameters
    : NEWLINE* parameter (COMMA NEWLINE* parameter)* COMMA? NEWLINE*
    ;

parameter
    : IDENTIFIER (ASSIGN expression)?
    ;

suite
    : simpleStatement           #SimpleSuite
    | NEWLINE statementBlock    #BlockSuite
    ;

simpleStatement
    : statement NEWLINE
    ;

statementBlock
    : statement+
    ;

classDeclaration
    : CLASS className=IDENTIFIER LPAREN baseClasses? RPAREN COLON suite
    ;

baseClasses
    : IDENTIFIER (COMMA IDENTIFIER)*
    ;

decoratorStatement
    : AT decoratorCall NEWLINE functionDef
    ;

decoratorCall
    : IDENTIFIER (DOT IDENTIFIER)* LPAREN argumentList? RPAREN
    ;

ifStatement
    : IF condition=expression COLON suite
    ;

forStatement
    : FOR loopVar=IDENTIFIER IN iterable=expression COLON suite
    ;

withStatement
    : WITH expression (AS alias=IDENTIFIER)? COLON suite
    ;

returnStatement
    : RETURN expression?
    ;

assignment
    : assignTarget assignOp value=expression
    ;

assignTarget
    : IDENTIFIER                                    #SimpleTarget
    | IDENTIFIER LBRACKET expression RBRACKET      #IndexTarget
    | IDENTIFIER DOT IDENTIFIER                    #AttributeTarget
    ;

assignOp
    : ASSIGN
    | PLUS_ASSIGN
    | MINUS_ASSIGN
    ;

expressionStatement
    : expression
    ;

expression
    : comparison
    ;

comparison
    : additive ((EQ | NE | LT | GT | LE | GE) additive)*
    ;

additive
    : multiplicative ((PLUS | MINUS) multiplicative)*
    ;

multiplicative
    : unary ((STAR | SLASH | DOUBLE_SLASH | PERCENT) unary)*
    ;

unary
    : (PLUS | MINUS) unary      #UnaryExpr
    | power                     #PowerExpr
    ;

power
    : postfix (DOUBLE_STAR unary)?
    ;

postfix
    : atom trailer*
    ;

trailer
    : LPAREN NEWLINE* argumentList? RPAREN                         #CallTrailer
    | LBRACKET NEWLINE* expression NEWLINE* RBRACKET              #IndexTrailer
    | DOT IDENTIFIER                                              #AttributeTrailer
    ;

atom
    : IDENTIFIER                                    #IdentifierAtom
    | NUMBER                                        #NumberAtom
    | STRING                                        #StringAtom
    | TRUE                                          #TrueAtom
    | FALSE                                         #FalseAtom
    | NONE                                          #NoneAtom
    | LPAREN NEWLINE* expression NEWLINE* RPAREN   #ParenAtom
    | listLiteral                                   #ListAtom
    | dictLiteral                                   #DictAtom
    | listComprehension                             #ListCompAtom
    ;

listLiteral
    : LBRACKET NEWLINE* (expression (COMMA NEWLINE* expression)* COMMA? NEWLINE*)? RBRACKET
    ;

dictLiteral
    : LBRACE NEWLINE* (dictItem (COMMA NEWLINE* dictItem)* COMMA? NEWLINE*)? RBRACE
    ;

dictItem
    : key=expression COLON value=expression
    ;

listComprehension
    : LBRACKET expression FOR IDENTIFIER IN expression (IF expression)? RBRACKET
    ;

argumentList
    : NEWLINE* argument (COMMA NEWLINE* argument)* COMMA? NEWLINE*
    ;

argument
    : (IDENTIFIER ASSIGN)? expression
    ;