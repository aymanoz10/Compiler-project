lexer grammar WebLexer;

JINJA_COMMENT: '{#' .*? '#}';
JINJA_VAR_START: '{{' -> pushMode(JINJA_MODE);
JINJA_BLOCK_START: '{%' -> pushMode(JINJA_MODE);

HTML_COMMENT: '<!--' .*? '-->';
HTML_CONDITIONAL_COMMENT: '<![' .*? ']>';
XML_DECLARATION: '<?xml' .*? '?>';
CDATA: '<![CDATA[' .*? ']]>';
DOCTYPE: '<!DOCTYPE' .*? '>';

TAG_SLASH_CLOSE: '/>';
TAG_OPEN: '<';
TAG_CLOSE: '>';
TAG_SLASH: '/';

CSS_COMMENT: '/*' .*? '*/';
CSS_LBRACE: '{';
CSS_RBRACE: '}';

IMPORTANT: '!important';

STRING:
    '"' (~["\r\n\\] | '\\' .)* '"'
    | '\'' (~['\r\n\\] | '\\' .)* '\''
;

NUMBER: [0-9]+ ('.' [0-9]+)?;
CSS_VALUE: [0-9]+ ('.' [0-9]+)? ('px' | 'em' | 'rem' | '%' | 'vh' | 'vw' | 'pt' | 'cm' | 'mm' | 'in' | 's' | 'ms');
HEX_COLOR: '#' [0-9a-fA-F]+;

CSS_PSEUDO: ':' [a-zA-Z_-]+ ('(' ~[)]* ')')?;
CSS_CLASS_SELECTOR: '.' [a-zA-Z_-] [a-zA-Z0-9_-]*;
CSS_ID_SELECTOR: '#' [a-zA-Z_-] [a-zA-Z0-9_-]*;

EQ: '==';
NE: '!=';
LE: '<=';
GE: '>=';
LT: '<';
GT: '>';

EQUALS: '=';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
COLON: ':';
SEMICOLON: ';';
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';

IDENTIFIER: [a-zA-Z_] [a-zA-Z0-9_-]*;
HTML_TEXT: ~[<>{}()"'\r\n\t =,:;+*/#[\]]+;

WS: [ \t]+ -> channel(HIDDEN);
NEWLINE: [\r\n]+ -> channel(HIDDEN);
mode JINJA_MODE;
JINJA_VAR_END: '}}' -> popMode;
JINJA_BLOCK_END: '%}' -> popMode;

J_FOR: 'for';
J_IN: 'in';
J_ENDFOR: 'endfor';
J_IF: 'if';
J_ELIF: 'elif';
J_ELSE: 'else';
J_ENDIF: 'endif';
J_NOT: 'not';
J_AND: 'and';
J_OR: 'or';

J_EQ: '==';
J_NE: '!=';
J_LE: '<=';
J_GE: '>=';
J_LT: '<';
J_GT: '>';

J_PIPE: '|';
J_DOT: '.';
J_PERCENT: '%';

J_EQUALS: '=';
J_COMMA: ',';
J_LPAREN: '(';
J_RPAREN: ')';
J_LBRACKET: '[';
J_RBRACKET: ']';
J_COLON: ':';
J_PLUS: '+';
J_MINUS: '-';
J_STAR: '*';
J_SLASH: '/';

J_STRING:
    '"' (~["\r\n\\] | '\\' .)* '"'
    | '\'' (~['\r\n\\] | '\\' .)* '\''
;

J_NUMBER: [0-9]+ ('.' [0-9]+)?;
J_IDENTIFIER: [a-zA-Z_] [a-zA-Z0-9_]*;

J_WS: [ \t\r\n]+ -> channel(HIDDEN);