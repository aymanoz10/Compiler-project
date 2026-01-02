package backend.AST;
import shared.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class FunctionCallNode extends ASTNode {
    private String functionName;
    private List<ArgumentNode> arguments;

    public FunctionCallNode(String functionName, int lineNumber) {
        super("FunctionCall", lineNumber);
        this.functionName = functionName;
        this.arguments = new ArrayList<>();
    }

    public void addArgument(String name, ASTNode value) {
        ArgumentNode arg = new ArgumentNode(name, value, lineNumber);
        arguments.add(arg);
        addChild(arg);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Call: " + functionName);
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.print("CALL " + functionName + "(");
        if (!arguments.isEmpty()) {
            System.out.println();
            System.out.println(indent + "  Arguments:");
        } else {
            System.out.println(")");
        }
    }

    public static class ArgumentNode extends ASTNode {
        private String name; // null for positional args
        private ASTNode value;

        public ArgumentNode(String name, ASTNode value, int lineNumber) {
            super("Argument", lineNumber);
            this.name = name;
            this.value = value;
            if (value != null) {
                addChild(value);
            }
        }

        @Override
        public void print(String indent) {
            if (name != null) {
                System.out.println(indent + "Arg " + name + "=");
            } else {
                System.out.println(indent + "Arg");
            }
        }

        @Override
        public void printJsonStyle(String indent) {
            if (name != null) {
                System.out.println("Argument " + name + "=");
            } else {
                System.out.println("Argument");
            }
        }
    }
}