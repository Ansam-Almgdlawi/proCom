package AST;

import java.util.List;

public class DataStructure implements ASTNode {

    private ListStructure structure1;
    private MapStructure structure2;
    public DataStructure() {
    }
    public ListStructure getStructure1() {
        return structure1;
    }

    public void setStructure1(ListStructure structure1) {
        this.structure1 = structure1;
    }



    public MapStructure getStructure2() {
        return structure2;
    }

    public void setStructure2(MapStructure structure2) {
        this.structure2 = structure2;
    }

    @Override
    public String toString() {
        return "\nDataStructure{" +
                structure1 + "\n"+
                structure2+
                "\n}";
    }
}
