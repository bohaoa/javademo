package cd.java.design.memento;

/**
 * 备忘录
 * Created by boge on 17/1/18.
 */
public class ChessmanMemento {

    private String label;
    private int x;
    private int y;

    public ChessmanMemento(String label, int x, int y){
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
