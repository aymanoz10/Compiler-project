package frontend.AST;

import shared.ASTNode;

public class Jinja2ForNode extends ASTNode {
    private String iterator;
    private String iterable;

    public Jinja2ForNode(String iterator, String iterable, int lineNumber) {
        super("Jinja2For", lineNumber);
        this.iterator = iterator;
        this.iterable = iterable;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "{% for " + iterator + " in " + iterable + " %}");
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("Jinja2For");
        System.out.println(indent + "  Iterator: " + iterator);
        System.out.println(indent + "  Iterable: " + iterable);
        if (!children.isEmpty()) {
            System.out.println(indent + "  Body:");
        }
    }
}