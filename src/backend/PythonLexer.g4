lexer grammar PythonLexer;

@lexer::members {
    private java.util.Stack<Integer> indentStack = new java.util.Stack<>();
    private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
    private int lastTokenType = 0;

    @Override
    public Token nextToken() {
        if (!tokens.isEmpty()) {
            return tokens.poll();
        }
        return super.nextToken();
    }
}

FROM: 'from';
IMPORT: 'import';
DEF: 'def';
RETURN: 'return';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
FOR: 'for';
IN: 'in';
WITH: 'with';
AS: 'as';
PASS: 'pass';
CLASS: 'class';
BREAK: 'break';
CONTINUE: 'continue';

EQ: '==';
NE: '!=';
LE: '<=';
GE: '>=';
LT: '<';
GT: '>';

ASSIGN: '=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
ARROW: '->';

PLUS: '+';
MINUS: '-';
STAR: '*';
DOUBLE_STAR: '**';
SLASH: '/';
DOUBLE_SLASH: '//';
PERCENT: '%';

LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
COLON: ':';
SEMICOLON: ';';
DOT: '.';
AT: '@';

STRING:
    '"""' .*? '"""'
    | '\'\'\'' .*? '\'\'\''
    | '"' (~["\r\n\\] | '\\' .)* '"'
    | '\'' (~['\r\n\\] | '\\' .)* '\''
;

NUMBER: [0-9]+ ('.' [0-9]+)?;

TRUE: 'True';
FALSE: 'False';
NONE: 'None';

IDENTIFIER: [a-zA-Z_] [a-zA-Z0-9_]*;

COMMENT: '#' ~[\r\n]* -> channel(HIDDEN);


NEWLINE: ('\r'? '\n' | '\r');

WS: [ \t]+ -> channel(HIDDEN);