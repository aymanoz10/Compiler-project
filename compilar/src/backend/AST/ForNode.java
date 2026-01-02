package backend.AST;
import shared.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class ForNode extends ASTNode {
    private String loopVar;
    private ASTNode iterable;
    private List<ASTNode> body;

    public ForNode(String loopVar, int lineNumber) {
        super("For", lineNumber);
        this.loopVar = loopVar;
        this.body = new ArrayList<>();
    }

    public void setIterable(ASTNode iterable) {
        this.iterable = iterable;
        if (iterable != null) {
            addChild(iterable);
        }
    }

    public void addBodyStatement(ASTNode stmt) {
        body.add(stmt);
        addChild(stmt);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "For: " + loopVar);
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("ForStatement for " + loopVar + " in");
        if (iterable != null) {
            System.out.println(indent + "  Iterable:");
        }
        if (!body.isEmpty()) {
            System.out.println(indent + "  Body:");
        }
    }
}