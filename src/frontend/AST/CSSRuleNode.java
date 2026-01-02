package frontend.AST;

import shared.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class CSSRuleNode extends ASTNode {
    private String selector;
    private List<CSSPropertyNode> declarations;

    public CSSRuleNode(String selector, int lineNumber) {
        super("CSSRule", lineNumber);
        this.selector = selector;
        this.declarations = new ArrayList<>();
    }

    public void addDeclaration(CSSPropertyNode property) {
        declarations.add(property);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "CSSRule: " + selector);
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("CSSRule selector=\"" + selector + "\"");
        if (!declarations.isEmpty()) {
            System.out.println(indent + "  Properties:");
            for (CSSPropertyNode prop : declarations) {
                System.out.print(indent + "    (line " + prop.getLineNumber() + ") ");
                prop.printJsonStyle(indent + "    ");
            }
        }
    }
}