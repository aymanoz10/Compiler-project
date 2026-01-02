package backend.AST;
import shared.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class ListNode extends ASTNode {
    private List<ASTNode> elements;

    public ListNode(int lineNumber) {
        super("List", lineNumber);
        this.elements = new ArrayList<>();
    }

    public void addElement(ASTNode element) {
        if (element != null) {
            elements.add(element);
            addChild(element);
        }
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "List");
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("LIST [");
        if (!elements.isEmpty()) {
            System.out.println(indent + "  Elements:");
        }
    }
}