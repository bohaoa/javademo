package cd.java.design.iterator.my;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewCollection nc = new NewCollection();
		
		MyIterator i = nc.createIterator();
		
		while(!i.isLast())
		{
			System.out.println(i.currentItem().toString());
			i.next();
		}
	}

}
