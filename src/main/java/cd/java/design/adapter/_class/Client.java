package cd.java.design.adapter._class;

public class Client
{
	public static void main(String args[])
	{
		Robot robot = new BirdAdapter();
		robot.cry();
		robot.move();
	}
}