package cd.java.design.bridge.example;

/**
 * Created by boge on 17/1/10.
 */
public abstract class AbstactWrite {

    public Color color;

    public void setColor(Color color){
        this.color = color;
    }

    public abstract void write();

}
