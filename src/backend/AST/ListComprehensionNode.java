package backend.AST;
import shared.ASTNode;

public class ListComprehensionNode extends ASTNode {
    private ASTNode expression;
    private String variable;
    private ASTNode iterable;
    private ASTNode condition; // optional

    public ListComprehensionNode(String variable, int lineNumber) {
        super("ListComprehension", lineNumber);
        this.variable = variable;
    }

    public void setExpression(ASTNode expression) {
        this.expression = expression;
        if (expression != null) {
            addChild(expression);
        }
    }

    public void setIterable(ASTNode iterable) {
        this.iterable = iterable;
        if (iterable != null) {
            addChild(iterable);
        }
    }

    public void setCondition(ASTNode condition) {
        this.condition = condition;
        if (condition != null) {
            addChild(condition);
        }
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ListComprehension");
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("LIST_COMPREHENSION [");
        System.out.println(indent + "  Expression:");
        System.out.println(indent + "  For: " + variable);
        System.out.println(indent + "  In:");
        if (condition != null) {
            System.out.println(indent + "  If:");
        }
    }
}