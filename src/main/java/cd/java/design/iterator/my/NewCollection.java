package cd.java.design.iterator.my;

public class NewCollection implements MyCollection {


	public MyIterator createIterator() {
		return new NewIterator();
	}

	
}
