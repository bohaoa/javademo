package cd.java.design.bridge;

public class Man extends People {
	
	@Override
	void who() {
		System.out.println("男人开着");
		road.selectRoad();
	}
	
}
