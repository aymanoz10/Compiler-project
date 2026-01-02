package frontend.AST;

import shared.ASTNode;

public class ProgramNode extends ASTNode {
    public ProgramNode(int lineNumber) {
        super("Program", lineNumber);
    }

    @Override
    public void print(String indent) {
        System.out.println("FrontendProgram");
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("FrontendProgram");
    }
}