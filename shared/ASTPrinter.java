package shared;

public class ASTPrinter {

    public static void printTree(ASTNode root) {
        if (root == null) {
            System.out.println("Empty AST");
            return;
        }

        System.out.println("\n=== AST (JSON STYLE) ===");
        printNode(root, "");
    }

    private static void printNode(ASTNode node, String indent) {
        if (node == null) return;

        System.out.print(indent + "(line " + node.getLineNumber() + ") ");

        node.printJsonStyle(indent);

        for (ASTNode child : node.getChildren()) {
            printNode(child, indent + "  ");
        }
    }

    public static void printStatistics(ASTNode root) {
        int totalNodes = countNodes(root);
        int maxDepth = calculateDepth(root);

        System.out.println("\n📊 AST Statistics:");
        System.out.println("   Total Nodes: " + totalNodes);
        System.out.println("   Maximum Depth: " + maxDepth);
    }

    private static int countNodes(ASTNode node) {
        if (node == null) return 0;

        int count = 1;
        for (ASTNode child : node.getChildren()) {
            count += countNodes(child);
        }
        return count;
    }

    private static int calculateDepth(ASTNode node) {
        if (node == null || node.getChildren().isEmpty()) {
            return 1;
        }

        int maxChildDepth = 0;
        for (ASTNode child : node.getChildren()) {
            maxChildDepth = Math.max(maxChildDepth, calculateDepth(child));
        }

        return 1 + maxChildDepth;
    }
}