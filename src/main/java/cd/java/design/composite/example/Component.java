package cd.java.design.composite.example;

/**
 * Created by boge on 17/1/10.
 */
public abstract class Component {

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract Component getChild(int i);
    public abstract void operator();

}
