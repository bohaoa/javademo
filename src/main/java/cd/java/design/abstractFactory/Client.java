package cd.java.design.abstractFactory;

public class Client
{
	public static void main(String args[])
	{
         try
         {
         	EFactory factory;
         	Television tv;
         	AirConditioner ac;
         	factory = new TCLFactory();
         	
         	tv=factory.produceTelevision();
         	tv.play();
         	
         	ac=factory.produceAirConditioner();
         	ac.changeTemperature();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
