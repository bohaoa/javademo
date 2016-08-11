package cd.java.design.adapter._object.test;

public class Client {

	
	public static void main(String[] args) {
		Target t = new Adapter();
		System.out.println(t.has110v());
		System.out.println(t.has220v());
	}
}
