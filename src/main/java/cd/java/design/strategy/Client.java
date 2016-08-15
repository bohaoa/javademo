package cd.java.design.strategy;

public class Client {

	public static void main(String[] args) {
		int arr[]={1,4,6,2,5,3,7,10,9};
		ArrayHandler handler = new ArrayHandler();
		handler.setSort(new BubbleSort());
		handler.sort(arr);
	}

}
