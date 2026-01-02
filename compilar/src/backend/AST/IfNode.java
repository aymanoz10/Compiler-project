package backend.AST;
import shared.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class IfNode extends ASTNode {
    private ASTNode condition;
    private List<ASTNode> ifBody;
    private List<ASTNode> elseBody;

    public IfNode(int lineNumber) {
        super("If", lineNumber);
        this.ifBody = new ArrayList<>();
        this.elseBody = new ArrayList<>();
    }

    public void setCondition(ASTNode condition) {
        this.condition = condition;
        if (condition != null) {
            addChild(condition);
        }
    }

    public void addToIfBody(ASTNode stmt) {
        ifBody.add(stmt);
        addChild(stmt);
    }

    public void addToElseBody(ASTNode stmt) {
        elseBody.add(stmt);
        addChild(stmt);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "If");
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("IfStatement if");
        if (condition != null) {
            System.out.println(indent + "  Condition:");
        }
        if (!ifBody.isEmpty()) {
            System.out.println(indent + "  Body:");
        }
    }
}