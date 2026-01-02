package backend.AST;
import shared.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class ClassDefNode extends ASTNode {
    private String className;
    private List<String> baseClasses;
    private List<ASTNode> body;

    public ClassDefNode(String className, int lineNumber) {
        super("ClassDef", lineNumber);
        this.className = className;
        this.baseClasses = new ArrayList<>();
        this.body = new ArrayList<>();
    }

    public void addBaseClass(String baseClass) {
        baseClasses.add(baseClass);
    }

    public void addBodyStatement(ASTNode stmt) {
        body.add(stmt);
        addChild(stmt);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ClassDef: " + className);
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.print("ClassDef class " + className);
        if (!baseClasses.isEmpty()) {
            System.out.print("(" + String.join(", ", baseClasses) + ")");
        }
        System.out.println();

        if (!body.isEmpty()) {
            System.out.println(indent + "  Body:");
        }
    }
}