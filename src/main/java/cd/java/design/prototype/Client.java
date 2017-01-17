package cd.java.design.prototype;

import java.io.IOException;
import java.io.OptionalDataException;

public class Client
{
	public static void main(String a[]) throws OptionalDataException, ClassNotFoundException, IOException
	{
		Email email,copyEmail;
		
		email=new Email();
		
		copyEmail=(Email)email.clone();
		
		System.out.println("email==copyEmail?");
		System.out.println(email==copyEmail);
		
		System.out.println("email.getAttachment==copyEmail.getAttachment?"); 
		System.out.println(email.getAttachment()==copyEmail.getAttachment());

		System.out.println("email.getName==copyEmail.getName?");
		System.out.println(email.getName() == copyEmail.getName());
	}
}