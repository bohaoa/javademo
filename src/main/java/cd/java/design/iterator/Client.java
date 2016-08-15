package cd.java.design.iterator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television t = new TCLTelevision();
		TVIterator tv = t.createIterator();
		System.out.println("电视机频道：");
		while(!tv.isLast())
		{
			System.out.println(tv.currentChannel().toString());
			tv.next();
		}
	}

}
