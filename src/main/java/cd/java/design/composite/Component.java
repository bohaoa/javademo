package cd.java.design.composite;

/**
 * 抽象构建
 * @author Thinkpad
 *
 */
public abstract class Component {

	public abstract void add(Component c);
	public abstract void remove(Component c);
	public abstract Component getChild(int i);
	public abstract void operation(); 

}
