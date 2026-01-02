package frontend.AST;

import shared.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class HTMLElementNode extends ASTNode {
    private String tagName;
    private List<HTMLAttributeNode> attributes;
    private boolean isSelfClosing;

    public HTMLElementNode(String tagName, int lineNumber, boolean isSelfClosing) {
        super("HTMLElement", lineNumber);
        this.tagName = tagName;
        this.isSelfClosing = isSelfClosing;
        this.attributes = new ArrayList<>();
    }

    public void addAttribute(HTMLAttributeNode attribute) {
        attributes.add(attribute);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "HTMLElement <" + tagName + ">");
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("HTMLElement <" + tagName + ">" + (isSelfClosing ? " />" : ""));
        if (!attributes.isEmpty()) {
            System.out.println(indent + "  Attributes:");
            for (HTMLAttributeNode attr : attributes) {
                System.out.print(indent + "    ");
                attr.printJsonStyle(indent + "    ");
            }
        }
    }
}