package frontend.AST;

import shared.ASTNode;

public class Jinja2VariableNode extends ASTNode {
    private String variableName;

    public Jinja2VariableNode(String variableName, int lineNumber) {
        super("Jinja2Variable", lineNumber);
        this.variableName = variableName;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "{{ " + variableName + " }}");
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("Jinja2Variable \"{{ " + variableName + " }}\"");
    }
}