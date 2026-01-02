package backend.AST;
import shared.ASTNode;

public class ReturnNode extends ASTNode {
    private ASTNode returnValue;

    public ReturnNode(int lineNumber) {
        super("Return", lineNumber);
    }

    public void setReturnValue(ASTNode value) {
        this.returnValue = value;
        if (value != null) {
            addChild(value);
        }
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Return");
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.print("ReturnStatement return");
        if (returnValue != null) {
            System.out.println();
            System.out.println(indent + "  Value:");
        } else {
            System.out.println(" None");
        }
    }
}