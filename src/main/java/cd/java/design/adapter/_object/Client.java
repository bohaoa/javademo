package cd.java.design.adapter._object;

public class Client
{
	public static void main(String args[])
	{
		DataOperation dao= new NewCipherAdapter();
		dao.setPassword("liuhaibo");
		
		String ps=dao.getPassword();
		
		String es=dao.doEncrypt(6,ps);
		
		System.out.println("" + ps);
		System.out.println("" + es);
	}
}


