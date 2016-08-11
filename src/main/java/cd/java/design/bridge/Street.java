package cd.java.design.bridge;

/**
 * 街道
 * @author Thinkpad
 *
 */
public class Street extends AbstractRoad {

	@Override
	public void selectRoad() {
		car.run();
		System.out.println("在街道上行驶");
		
	}
}
