package cd.java.design.proxy;

public class Proxy implements Subject{

	
	private RealSubject subject = new RealSubject();
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		subject.request();
	}

	
}
