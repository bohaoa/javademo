package cd.java.design.decorator;

public class ConcreteDecorator extends Decorator {

	public void addOtherBehavior(){
		System.out.println("装饰的功能！");
	}
	
	@Override
	public void oper() {
		super.oper();
		addOtherBehavior();
	}
}
