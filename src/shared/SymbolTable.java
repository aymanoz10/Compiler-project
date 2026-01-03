package shared;

import java.util.*;

public class SymbolTable {

    private Stack<HashMap<String, Symbol>> scopes;
    private int currentScopeLevel;

    private List<Symbol> allInsertedSymbols;

    public SymbolTable() {
        scopes = new Stack<>();
        allInsertedSymbols = new ArrayList<>();
        currentScopeLevel = 0;
        enterScope();
    }

    public void enterScope() {
        scopes.push(new HashMap<>());
        currentScopeLevel++;
    }

    public void exitScope() {
        if (scopes.size() > 1) {
            currentScopeLevel--;
            scopes.pop();
        }
    }

    public boolean insert(String name, String type, int line) {
        if (name == null || name.isEmpty()) {
            return false;
        }

        HashMap<String, Symbol> currentScope = scopes.peek();

        String key = name + "_" + type + "_" + line;

        if (currentScope.containsKey(key)) {
            return false;
        }

        Symbol symbol = new Symbol(name, type, line, currentScopeLevel - 1);
        currentScope.put(key, symbol);

        allInsertedSymbols.add(symbol);

        return true;
    }

    public Symbol lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            HashMap<String, Symbol> scope = scopes.get(i);
            for (Symbol symbol : scope.values()) {
                if (symbol.name.equals(name)) {
                    return symbol;
                }
            }
        }
        return null;
    }

    public void printTable() {
        System.out.println("\n" + "=".repeat(80));
        System.out.println("SYMBOL TABLE");
        System.out.println("=".repeat(80));

        List<Symbol> symbols = new ArrayList<>(allInsertedSymbols);

        symbols.sort(Comparator.comparingInt(s -> s.line));

        System.out.println("\n📦 Scope Level 0:");
        System.out.println("-".repeat(80));

        if (symbols.isEmpty()) {
            System.out.println("  (empty)");
        } else {
            System.out.printf("%-30s %-25s %-10s%n", "Name", "Type", "Line");
            System.out.println("-".repeat(80));

            for (Symbol symbol : symbols) {
                System.out.printf("%-30s %-25s %-10d%n",
                        truncate(symbol.name, 30),
                        symbol.type,
                        symbol.line
                );
            }
        }

        System.out.println("\n" + "=".repeat(80));
        System.out.println("Total Symbols: " + symbols.size());
        System.out.println("=".repeat(80));
    }

    public int getTotalSymbols() {
        return allInsertedSymbols.size();
    }

    private String truncate(String text, int maxLength) {
        if (text.length() <= maxLength) {
            return text;
        }
        return text.substring(0, maxLength - 3) + "...";
    }

    public static class Symbol {
        public String name;
        public String type;
        public int line;
        public int scopeLevel;

        public Symbol(String name, String type, int line, int scopeLevel) {
            this.name = name;
            this.type = type;
            this.line = line;
            this.scopeLevel = scopeLevel;
        }
    }
}