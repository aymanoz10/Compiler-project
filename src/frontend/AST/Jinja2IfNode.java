package frontend.AST;

import shared.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class Jinja2IfNode extends ASTNode {
    private String condition;
    private List<ASTNode> ifBody;
    private List<ASTNode> elseBody;

    public Jinja2IfNode(String condition, int lineNumber) {
        super("Jinja2If", lineNumber);
        this.condition = condition;
        this.ifBody = new ArrayList<>();
        this.elseBody = new ArrayList<>();
    }

    public void addToIfBody(ASTNode node) {
        ifBody.add(node);
        addChild(node);
    }

    public void addToElseBody(ASTNode node) {
        elseBody.add(node);
        addChild(node);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "{% if " + condition + " %}");
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("Jinja2If");
        System.out.println(indent + "  Condition: " + condition);
        if (!ifBody.isEmpty()) {
            System.out.println(indent + "  If Body:");
        }
        if (!elseBody.isEmpty()) {
            System.out.println(indent + "  Else Body:");
        }
    }
}