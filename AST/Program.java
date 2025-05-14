package AST;

import java.util.ArrayList;
import java.util.List;

public class Program implements ASTNode {
    private final List<ASTNode> body = new ArrayList<>();

    public void addElement(ASTNode element) {
        if (element != null) {
            this.body.add(element);
        }
    }

    public List<ASTNode> getBody() {
        return body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Program{\n");
        for (ASTNode element : body) {
            sb.append("\t").append(element).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}