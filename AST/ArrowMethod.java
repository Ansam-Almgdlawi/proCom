package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrowMethod implements ASTNode {
    private String modifier;
    private String name;
    private List<String> parameters = new ArrayList<>();
    private String returnType;
    private List<ASTNode> body = new ArrayList<>();
    private boolean hasArrow;

    public ArrowMethod() {}

    public ArrowMethod(Modifier modifier, String name, ParameterList parameters, String returnType) {
    }

    public void addParameter(String param) {
        if (param != null) {
            parameters.add(param);
        }
    }

    public void addBodyElement(ASTNode element) {
        if (element != null) {
            body.add(element);
        }
    }

    // --- Getters and Setters ---
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifier() {
        return modifier;
    }

    public boolean isAsync() {
        return "async".equals(modifier);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getReturnType() {
        return returnType;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public void setHasArrow(boolean hasArrow) {
        this.hasArrow = hasArrow;
    }

    public boolean hasArrow() {
        return hasArrow;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (modifier != null) {
            sb.append(modifier).append(" ");
        }

        if (name != null) {
            sb.append(name);
        }

        sb.append("(").append(String.join(", ", parameters)).append(")");

        if (returnType != null) {
            sb.append(": ").append(returnType);
        }

        if (hasArrow) {
            sb.append(" => ");
        } else {
            sb.append(" ");
        }

        if (body.size() == 1 && !hasArrow) {
            sb.append(body.get(0));
        } else {
            sb.append("{").append(body).append("}");
        }

        return sb.toString();
    }
}