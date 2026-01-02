package backend.AST;
import shared.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class FunctionDefNode extends ASTNode {
    private String functionName;
    private List<String> parameters;
    private List<ASTNode> body;
    private List<String> decorators;

    public FunctionDefNode(String functionName, int lineNumber) {
        super("FunctionDef", lineNumber);
        this.functionName = functionName;
        this.parameters = new ArrayList<>();
        this.body = new ArrayList<>();
        this.decorators = new ArrayList<>();
    }

    public void addParameter(String param) {
        parameters.add(param);
    }

    public void addBodyStatement(ASTNode stmt) {
        body.add(stmt);
        addChild(stmt);
    }

    public void addDecorator(String decorator) {
        decorators.add(decorator);
    }

    public List<String> getParameters() {
        return parameters;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "FunctionDef: " + functionName);
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.print("FunctionDef def " + functionName + "(");
        if (!parameters.isEmpty()) {
            System.out.print(String.join(", ", parameters));
        }
        System.out.println(")");

        if (!decorators.isEmpty()) {
            System.out.println(indent + "  Decorators:");
            for (String dec : decorators) {
                System.out.println(indent + "    " + dec);
            }
        }

        if (!body.isEmpty()) {
            System.out.println(indent + "  Body:");
        }
    }
}