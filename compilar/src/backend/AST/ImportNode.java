package backend.AST;
import shared.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class ImportNode extends ASTNode {
    private String moduleName;
    private List<String> importedNames;
    private boolean isFromImport;

    public ImportNode(String moduleName, int lineNumber, boolean isFromImport) {
        super("Import", lineNumber);
        this.moduleName = moduleName;
        this.isFromImport = isFromImport;
        this.importedNames = new ArrayList<>();
    }

    public void addImportedName(String name) {
        importedNames.add(name);
    }

    public List<String> getImportedNames() {
        return importedNames;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Import");
    }

    @Override
    public void printJsonStyle(String indent) {
        if (isFromImport) {
            System.out.print("ImportStatement from " + moduleName + " import ");
            System.out.println(String.join(", ", importedNames));
        } else {
            System.out.print("ImportStatement import ");
            System.out.println(String.join(", ", importedNames));
        }
    }
}