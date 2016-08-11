package cd.java.design.factoyMethod;

import cd.java.design.XMLUtil;

public class Client
{
	public static void main(String args[])
	{
         try
         {
         	TV tv;
         	TVFactory factory;
         	factory=(TVFactory)XMLUtil.getBean("src/main/resources/design/factoryMethod/config.xml");
         	tv = factory.produceTV();
         	tv.play();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
