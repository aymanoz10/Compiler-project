package frontend.AST;

import shared.ASTNode;

public class CSSPropertyNode extends ASTNode {
    private String property;
    private String value;

    public CSSPropertyNode(String property, String value, int lineNumber) {
        super("CSSProperty", lineNumber);
        this.property = property;
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + property + ": " + value);
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("CSSProperty " + property + ": " + value);
    }
}