package backend.AST;
import shared.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class WithNode extends ASTNode {
    private ASTNode contextExpression;
    private String alias;
    private List<ASTNode> body;

    public WithNode(int lineNumber) {
        super("With", lineNumber);
        this.body = new ArrayList<>();
    }

    public void setContextExpression(ASTNode expr) {
        this.contextExpression = expr;
        if (expr != null) {
            addChild(expr);
        }
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void addBodyStatement(ASTNode stmt) {
        body.add(stmt);
        addChild(stmt);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "With");
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.print("WithStatement with");
        if (alias != null) {
            System.out.println(" as " + alias);
        } else {
            System.out.println();
        }
        if (contextExpression != null) {
            System.out.println(indent + "  Context:");
        }
        if (!body.isEmpty()) {
            System.out.println(indent + "  Body:");
        }
    }
}