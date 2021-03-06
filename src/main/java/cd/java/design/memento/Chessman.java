package cd.java.design.memento;

/**
 * 原发器
 * Created by boge on 17/1/18.
 */
public class Chessman {

    private String label;
    private int x;
    private int y;

    public Chessman(String label, int x, int y){
        this.label = label;
        this.x = x;
        this.y = y;
    }

    /**
     * 保存状态
     * @return
     */
    public ChessmanMemento save(){
        return new ChessmanMemento(label, x, y);
    }

    /**
     * 还原状态
     * @param memento
     */
    public void restore(ChessmanMemento memento){
        this.label = memento.getLabel();
        this.x = memento.getX();
        this.y = memento.getY();
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
