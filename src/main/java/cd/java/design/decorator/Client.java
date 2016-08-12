package cd.java.design.decorator;

/**
 * 装饰模式： 对客户端透明的方式扩展对象的功能，是继承关系的一个替代方案，提供比继承更多的灵活性。
 * 使用原来被装饰的类的一个子类的实例，把客户端的调用委派到被装饰类。
 * @author Thinkpad
 *
 */
public class Client {

	public static void main(String[] args) {
		Component c = new ConcreteComponent();
		Decorator d = new ConcreteDecorator();
		d.setComponent(c);
		d.oper();
	}

}
