package cd.java.design.factoyMethod;

public class HaierTVFactory implements TVFactory
{
    public TV produceTV()
    {
    	System.out.println("haier factory!");
    	return new HaierTV();
    }
}