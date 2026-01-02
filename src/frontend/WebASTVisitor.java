package frontend;

import frontend.AST.*;
import shared.ASTNode;
import shared.SymbolTable;

public class WebASTVisitor extends WebParserBaseVisitor<ASTNode> {

    private ProgramNode root;
    private SymbolTable symbolTable;

    public WebASTVisitor() {
        symbolTable = new SymbolTable();
    }

    public ProgramNode getRoot() {
        return root;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public ASTNode visitDocument(WebParser.DocumentContext ctx) {
        root = new ProgramNode(1);

        for (WebParser.ContentContext content : ctx.content()) {
            ASTNode node = visit(content);
            if (node != null) {
                root.addChild(node);
            }
        }

        return root;
    }

    @Override
    public ASTNode visitNormalHtmlElement(WebParser.NormalHtmlElementContext ctx) {
        String tagName = ctx.tagName.getText();
        int line = ctx.getStart().getLine();

        HTMLElementNode element = new HTMLElementNode(tagName, line, false);

        for (WebParser.AttributeContext attr : ctx.attribute()) {
            HTMLAttributeNode attrNode = visitAttributeNode(attr);
            if (attrNode != null) {
                element.addAttribute(attrNode);
            }
        }

        for (WebParser.HtmlContentContext content : ctx.htmlContent()) {
            ASTNode child = visit(content);
            if (child != null) {
                element.addChild(child);
            }
        }

        symbolTable.insert(tagName, "HTML_TAG", line);
        return element;
    }

    @Override
    public ASTNode visitSelfClosingHtmlElement(WebParser.SelfClosingHtmlElementContext ctx) {
        String tagName = ctx.tagName.getText();
        int line = ctx.getStart().getLine();

        HTMLElementNode element = new HTMLElementNode(tagName, line, true);

        for (WebParser.AttributeContext attr : ctx.attribute()) {
            HTMLAttributeNode attrNode = visitAttributeNode(attr);
            if (attrNode != null) {
                element.addAttribute(attrNode);
            }
        }

        symbolTable.insert(tagName, "HTML_TAG_SELF_CLOSING", line);
        return element;
    }

    @Override
    public ASTNode visitOpenHtmlElement(WebParser.OpenHtmlElementContext ctx) {
        String tagName = ctx.tagName.getText();
        int line = ctx.getStart().getLine();

        HTMLElementNode element = new HTMLElementNode(tagName, line, false);

        for (WebParser.AttributeContext attr : ctx.attribute()) {
            HTMLAttributeNode attrNode = visitAttributeNode(attr);
            if (attrNode != null) {
                element.addAttribute(attrNode);
            }
        }

        symbolTable.insert(tagName, "HTML_TAG_OPEN", line);
        return element;
    }

    private HTMLAttributeNode visitAttributeNode(WebParser.AttributeContext ctx) {
        if (ctx.attrName != null) {
            String name = ctx.attrName.getText();
            String value = "";

            if (ctx.attrValue != null) {
                value = ctx.attrValue.getText();
                if (value.startsWith("\"") && value.endsWith("\"")) {
                    value = value.substring(1, value.length() - 1);
                } else if (value.startsWith("'") && value.endsWith("'")) {
                    value = value.substring(1, value.length() - 1);
                }
            }

            return new HTMLAttributeNode(name, value, ctx.getStart().getLine());
        }
        return null;
    }

    @Override
    public ASTNode visitCssBlockContent(WebParser.CssBlockContentContext ctx) {
        return visitCssBlock(ctx.cssBlock());
    }

    public ASTNode visitCssBlock(WebParser.CssBlockContext ctx) {
        if (ctx.cssSelector() != null) {
            String selector = ctx.cssSelector().getText();
            int line = ctx.getStart().getLine();

            CSSRuleNode rule = new CSSRuleNode(selector, line);

            for (WebParser.CssDeclarationContext decl : ctx.cssDeclaration()) {
                if (decl.cssProperty() != null && decl.cssValueList() != null) {
                    String property = decl.cssProperty().getText();
                    String value = decl.cssValueList().getText();

                    CSSPropertyNode prop = new CSSPropertyNode(
                            property, value, decl.getStart().getLine()
                    );
                    rule.addDeclaration(prop);
                }
            }

            symbolTable.insert(selector, "CSS_SELECTOR", line);
            return rule;
        }
        return null;
    }

    @Override
    public ASTNode visitJinjaForContent(WebParser.JinjaForContentContext ctx) {
        return visitJinjaFor(ctx.jinjaFor());
    }

    public ASTNode visitJinjaFor(WebParser.JinjaForContext ctx) {
        if (ctx.J_IDENTIFIER() != null && ctx.jinjaExpression() != null) {
            String iterator = ctx.J_IDENTIFIER().getText();
            String iterable = ctx.jinjaExpression().getText();
            int line = ctx.getStart().getLine();

            Jinja2ForNode forNode = new Jinja2ForNode(iterator, iterable, line);

            for (WebParser.ForContentContext content : ctx.forContent()) {
                ASTNode child = visit(content);
                if (child != null) {
                    forNode.addChild(child);
                }
            }

            symbolTable.insert(iterator, "JINJA_VARIABLE", line);
            return forNode;
        }
        return null;
    }

    @Override
    public ASTNode visitJinjaVarContent(WebParser.JinjaVarContentContext ctx) {
        return visitJinjaVar(ctx.jinjaVar());
    }

    public ASTNode visitJinjaVar(WebParser.JinjaVarContext ctx) {
        if (ctx.jinjaExpression() != null) {
            String varName = ctx.jinjaExpression().getText();
            int line = ctx.getStart().getLine();

            Jinja2VariableNode varNode = new Jinja2VariableNode(varName, line);

            symbolTable.insert(varName, "JINJA_VAR", line);
            return varNode;
        }
        return null;
    }

    @Override
    public ASTNode visitJinjaIfContent(WebParser.JinjaIfContentContext ctx) {
        return visitJinjaIf(ctx.jinjaIf());
    }

    public ASTNode visitJinjaIf(WebParser.JinjaIfContext ctx) {
        if (ctx.condition != null) {
            String condition = ctx.condition.getText();
            int line = ctx.getStart().getLine();

            Jinja2IfNode ifNode = new Jinja2IfNode(condition, line);

            for (WebParser.IfContentContext content : ctx.ifContent()) {
                ASTNode child = visit(content);
                if (child != null) {
                    ifNode.addToIfBody(child);
                }
            }

            if (ctx.jinjaElse() != null) {
                WebParser.JinjaElseContext elseCtx = ctx.jinjaElse();
                for (WebParser.IfContentContext content : elseCtx.ifContent()) {
                    ASTNode child = visit(content);
                    if (child != null) {
                        ifNode.addToElseBody(child);
                    }
                }
            }

            return ifNode;
        }
        return null;
    }

    @Override
    public ASTNode visitAnyTextContent(WebParser.AnyTextContentContext ctx) {
        String text = ctx.anyText().getText();
        int line = ctx.getStart().getLine();
        return new HTMLTextNode(text, line);
    }

    @Override
    public ASTNode visitAnyTextHtmlContent(WebParser.AnyTextHtmlContentContext ctx) {
        String text = ctx.anyText().getText();
        int line = ctx.getStart().getLine();
        return new HTMLTextNode(text, line);
    }

    private int countNodes(ASTNode node) {
        if (node == null) return 0;

        int count = 1;
        for (ASTNode child : node.getChildren()) {
            count += countNodes(child);
        }
        return count;
    }
}