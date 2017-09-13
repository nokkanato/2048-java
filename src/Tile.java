import java.io.Serializable;

public class Tile implements Serializable {
    private int label;
    private Cell position;

    public Tile(int label, Cell position) {
        this.label = label;
        this.position = position;
    }

}
