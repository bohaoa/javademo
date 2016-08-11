package cd.java.design.factoyMethod;

public class TCLTVFactory implements TVFactory
{
    public TV produceTV()
    {
    	System.out.println("TCL factory!");
    	return new TCLTV();
    }
}