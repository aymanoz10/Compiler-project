parser grammar WebParser;

options {
    tokenVocab = WebLexer;
}

document
    : content* EOF
    ;

content
    : doctype                    #DoctypeContent
    | htmlComment                #HtmlCommentContent
    | xmlDeclaration             #XmlDeclContent
    | cdata                      #CdataContent
    | jinjaComment               #JinjaCommentContent
    | jinjaFor                   #JinjaForContent
    | jinjaIf                    #JinjaIfContent
    | jinjaVar                   #JinjaVarContent
    | htmlElement                #HtmlElementContent
    | cssBlock                   #CssBlockContent
    | cssComment                 #CssCommentContent
    | anyText                    #AnyTextContent
    ;

anyText
    : HTML_TEXT
    | IDENTIFIER
    | NUMBER
    | STRING
    | COMMA
    | COLON
    | SEMICOLON
    | LPAREN
    | RPAREN
    | LBRACKET
    | RBRACKET
    | PLUS
    | MINUS
    | STAR
    | SLASH
    | EQUALS
    | TAG_CLOSE
    ;

doctype: DOCTYPE;
htmlComment: HTML_COMMENT | HTML_CONDITIONAL_COMMENT;
xmlDeclaration: XML_DECLARATION;
cdata: CDATA;

htmlElement
    : TAG_OPEN tagName=IDENTIFIER attribute* TAG_SLASH_CLOSE           #SelfClosingHtmlElement
    | TAG_OPEN tagName=IDENTIFIER attribute* TAG_CLOSE
      htmlContent*
      TAG_OPEN TAG_SLASH closeTagName=IDENTIFIER TAG_CLOSE            #NormalHtmlElement
    | TAG_OPEN tagName=IDENTIFIER attribute* TAG_CLOSE                 #OpenHtmlElement
    ;

htmlContent
    : doctype                    #DoctypeHtmlContent
    | htmlComment                #HtmlCommentHtmlContent
    | xmlDeclaration             #XmlDeclHtmlContent
    | cdata                      #CdataHtmlContent
    | jinjaComment               #JinjaCommentHtmlContent
    | jinjaFor                   #JinjaForHtmlContent
    | jinjaIf                    #JinjaIfHtmlContent
    | jinjaVar                   #JinjaVarHtmlContent
    | htmlElement                #HtmlElementHtmlContent
    | anyText                    #AnyTextHtmlContent
    ;

attribute
    : attrName=IDENTIFIER (EQUALS attrValue=attributeValue)?
    ;

attributeValue
    : STRING                     #StringAttrValue
    | IDENTIFIER                 #IdentifierAttrValue
    | NUMBER                     #NumberAttrValue
    | jinjaVar                   #JinjaVarAttrValue
    ;

jinjaComment
    : JINJA_COMMENT
    ;

jinjaVar
    : JINJA_VAR_START jinjaExpression JINJA_VAR_END
    ;

jinjaFor
    : JINJA_BLOCK_START J_FOR J_IDENTIFIER J_IN jinjaExpression JINJA_BLOCK_END
      forContent*
      JINJA_BLOCK_START J_ENDFOR JINJA_BLOCK_END
    ;

forContent
    : doctype                    #DoctypeForContent
    | htmlComment                #HtmlCommentForContent
    | xmlDeclaration             #XmlDeclForContent
    | cdata                      #CdataForContent
    | jinjaComment               #JinjaCommentForContent
    | jinjaIf                    #JinjaIfForContent
    | jinjaVar                   #JinjaVarForContent
    | htmlElement                #HtmlElementForContent
    | anyText                    #AnyTextForContent
    ;

jinjaIf
    : JINJA_BLOCK_START J_IF condition=jinjaExpression JINJA_BLOCK_END
      ifContent*
      jinjaElif*
      jinjaElse?
      JINJA_BLOCK_START J_ENDIF JINJA_BLOCK_END
    ;

jinjaElif
    : JINJA_BLOCK_START J_ELIF condition=jinjaExpression JINJA_BLOCK_END
      ifContent*
    ;

jinjaElse
    : JINJA_BLOCK_START J_ELSE JINJA_BLOCK_END
      ifContent*
    ;

ifContent
    : doctype                    #DoctypeIfContent
    | htmlComment                #HtmlCommentIfContent
    | xmlDeclaration             #XmlDeclIfContent
    | cdata                      #CdataIfContent
    | jinjaComment               #JinjaCommentIfContent
    | jinjaFor                   #JinjaForIfContent
    | jinjaVar                   #JinjaVarIfContent
    | htmlElement                #HtmlElementIfContent
    | anyText                    #AnyTextIfContent
    ;

jinjaExpression
    : jinjaTernary
    ;

jinjaTernary
    : jinjaLogical (J_IF jinjaLogical J_ELSE jinjaLogical)?
    ;

jinjaLogical
    : jinjaComparison ((J_AND | J_OR) jinjaComparison)*
    ;

jinjaComparison
    : jinjaAdditive ((J_EQ | J_NE | J_LE | J_GE | J_LT | J_GT) jinjaAdditive)*
    ;

jinjaAdditive
    : jinjaMultiplicative ((J_PLUS | J_MINUS) jinjaMultiplicative)*
    ;

jinjaMultiplicative
    : jinjaUnary ((J_STAR | J_SLASH | J_PERCENT) jinjaUnary)*
    ;

jinjaUnary
    : J_NOT jinjaUnary           #NotUnary
    | jinjaFilter                #FilterUnary
    ;

jinjaFilter
    : jinjaPostfix (J_PIPE filterName=J_IDENTIFIER (J_LPAREN jinjaArguments? J_RPAREN)?)*
    ;

jinjaPostfix
    : jinjaPrimary jinjaPostfixOp*
    ;

jinjaPostfixOp
    : J_DOT member=J_IDENTIFIER (J_LPAREN jinjaArguments? J_RPAREN)?    #MemberAccessOp
    | J_LBRACKET index=jinjaExpression J_RBRACKET                       #IndexAccessOp
    | J_LPAREN jinjaArguments? J_RPAREN                                 #FunctionCallOp
    ;

jinjaPrimary
    : J_IDENTIFIER               #IdentifierPrimary
    | J_STRING                   #StringPrimary
    | J_NUMBER                   #NumberPrimary
    | J_LPAREN jinjaExpression J_RPAREN                                 #ParenPrimary
    ;

jinjaArguments
    : jinjaExpression (J_COMMA jinjaExpression)*
    ;

cssBlock
    : cssSelector CSS_LBRACE cssDeclaration* CSS_RBRACE
    ;

cssSelector
    : cssSelectorPart (COMMA cssSelectorPart)*
    ;

cssSelectorPart
    : (IDENTIFIER | CSS_CLASS_SELECTOR | CSS_ID_SELECTOR | CSS_PSEUDO | TAG_OPEN | TAG_CLOSE | HTML_TEXT)+
    ;

cssDeclaration
    : cssProperty COLON cssValueList IMPORTANT? SEMICOLON?
    ;

cssProperty
    : IDENTIFIER (MINUS IDENTIFIER)*
    ;

cssValueList
    : cssValue+
    ;

cssValue
    : IDENTIFIER                 #IdentifierCssValue
    | NUMBER                     #NumberCssValue
    | STRING                     #StringCssValue
    | CSS_VALUE                  #CssValueToken
    | HEX_COLOR                  #HexColorValue
    | HTML_TEXT                  #TextCssValue
    | MINUS? NUMBER (IDENTIFIER | CSS_VALUE)?                           #NumericCssValue
    | LPAREN cssValueList RPAREN #ParenCssValue
    | COMMA                      #CommaCssValue
    | TAG_OPEN                   #TagOpenCssValue
    | TAG_CLOSE                  #TagCloseCssValue
    | COLON                      #ColonCssValue
    ;

cssComment
    : CSS_COMMENT
    ;