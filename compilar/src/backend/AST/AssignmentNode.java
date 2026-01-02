package backend.AST;
import shared.ASTNode;

public class AssignmentNode extends ASTNode {
    private String target;
    private String operator;
    private ASTNode value;

    public AssignmentNode(String target, String operator, int lineNumber) {
        super("Assignment", lineNumber);
        this.target = target;
        this.operator = operator;
    }

    public void setValue(ASTNode value) {
        this.value = value;
        if (value != null) {
            addChild(value);
        }
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Assignment: " + target + " " + operator);
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("AssignmentStatement " + target + " " + operator);
        if (value != null) {
            System.out.println(indent + "  Value:");
        }
    }
}