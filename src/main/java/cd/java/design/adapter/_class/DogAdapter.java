package cd.java.design.adapter._class;

public class DogAdapter extends Dog implements Robot
{
	public void cry()
	{
		System.out.print("机器狗模仿：");
		super.wang();
	}
	
	public void move()
	{
		System.out.print("机器狗模仿：");
		super.run();
	}
}