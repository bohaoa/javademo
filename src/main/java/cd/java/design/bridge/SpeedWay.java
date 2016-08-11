package cd.java.design.bridge;

/**
 * 高速
 * @author Thinkpad
 *
 */
public class SpeedWay extends AbstractRoad {

	@Override
	public void selectRoad() {
		car.run();
		System.out.println("在高速上行驶");
	}

}
