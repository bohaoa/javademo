package cd.java.design.adapter._class;

/**
 * 适配器模式：把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口原因不匹配而无法一起工作的两个类能够一起工作。
 * 适配类可以根据参数返还一个合适的实例给客户端。
 * @author Thinkpad
 *
 */
public class Client
{
	public static void main(String args[])
	{
		Robot robot = new BirdAdapter();
		robot.cry();
		robot.move();
	}
}