package frontend.AST;

import shared.ASTNode;

public class HTMLAttributeNode extends ASTNode {
    private String name;
    private String value;

    public HTMLAttributeNode(String name, String value, int lineNumber) {
        super("Attribute", lineNumber);
        this.name = name;
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + name + "=\"" + value + "\"");
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println(name + "=\"" + value + "\"");
    }
}