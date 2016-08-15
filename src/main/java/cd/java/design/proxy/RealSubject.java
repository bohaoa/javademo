package cd.java.design.proxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("實際上被代理的！！！");
	}

}
