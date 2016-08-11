package cd.java.design.prototype;

import java.io.IOException;
import java.io.OptionalDataException;

public class Client
{
	public static void main(String a[]) throws OptionalDataException, ClassNotFoundException, IOException
	{
		Email2 email,copyEmail;
		
		email=new Email2();
		
		copyEmail=(Email2)email.deepClone();
		
		System.out.println("email==copyEmail?");
		System.out.println(email==copyEmail);
		
		System.out.println("email.getAttachment==copyEmail.getAttachment?"); 
		System.out.println(email.getAttachment()==copyEmail.getAttachment());			
	}
}