package backend.AST;
import shared.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class DictNode extends ASTNode {
    private List<DictItemNode> items;

    public DictNode(int lineNumber) {
        super("Dict", lineNumber);
        this.items = new ArrayList<>();
    }

    public void addItem(String key, ASTNode value) {
        DictItemNode item = new DictItemNode(key, value, lineNumber);
        items.add(item);
        addChild(item);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Dict");
    }

    @Override
    public void printJsonStyle(String indent) {
        System.out.println("DICT {");
        if (!items.isEmpty()) {
            System.out.println(indent + "  Items:");
        }
    }

    public static class DictItemNode extends ASTNode {
        private String key;
        private ASTNode value;

        public DictItemNode(String key, ASTNode value, int lineNumber) {
            super("DictItem", lineNumber);
            this.key = key;
            this.value = value;
            if (value != null) {
                addChild(value);
            }
        }

        @Override
        public void print(String indent) {
            System.out.println(indent + "DictItem: " + key);
        }

        @Override
        public void printJsonStyle(String indent) {
            System.out.println("DictItem " + key + ":");
        }
    }
}