package cd.java.design.composite;

public class Client {

	public static void main(String[] args) {
		Composite composite = new Composite();
		Composite composite1 = new Composite();
		Leaf l1 = new Leaf();
		composite.add(l1);
		
		Leaf l2 = new Leaf();
		composite1.add(l2);
		
		composite.add(composite1);
		composite.operation();
	}
}
