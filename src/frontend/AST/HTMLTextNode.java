package frontend.AST;

import shared.ASTNode;

public class HTMLTextNode extends ASTNode {
    private String text;

    public HTMLTextNode(String text, int lineNumber) {
        super("Text", lineNumber);
        this.text = text;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Text: \"" + text + "\"");
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("Text \"" + truncate(text, 50) + "\"");
    }

    private String truncate(String s, int len) {
        if (s.length() <= len) return s;
        return s.substring(0, len) + "...";
    }
}