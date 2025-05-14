package AST;

public class Url implements ASTNode {
    private final String value;
    private final boolean isStyleUrl;
    private final String prefix; // "STYLEURL" أو "TEMPLATEURL"

    public Url(String prefix, String value, boolean isStyleUrl) {
        this.prefix = prefix;
        this.value = value;
        this.isStyleUrl = isStyleUrl;
    }

    // Getter methods
    public String getValue() {
        return value;
    }

    public boolean isStyleUrl() {
        return isStyleUrl;
    }

    public String getPrefix() {
        return prefix;
    }

    @Override
    public String toString() {
        return "Url{" +
                "prefix='" + prefix + '\'' +
                ", value='" + value + '\'' +
                ", isStyleUrl=" + isStyleUrl +
                '}';
    }
}