package backend.AST;
import shared.ASTNode;

public class ExpressionNode extends ASTNode {
    private String value;
    private String expressionType;

    public ExpressionNode(String value, String expressionType, int lineNumber) {
        super("Expression", lineNumber);
        this.value = value;
        this.expressionType = expressionType;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + expressionType + ": " + value);
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println(expressionType + " " + truncate(value, 60));
    }

    private String truncate(String s, int len) {
        if (s.length() <= len) return s;
        return s.substring(0, len) + "...";
    }
}