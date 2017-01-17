package cd.java.design.prototype;

/**
 * 浅拷贝
 * @author Thinkpad
 *
 */
public class Email implements Cloneable 
{
	private Attachment attachment=null;
	private String name=null;
	
	public Email()
	{
		this.attachment=new Attachment();
		this.name = new String("123");
	}
	
	public Object clone()
	{
		Email clone=null;
		try
		{
			clone=(Email)super.clone();		
		}
        catch(CloneNotSupportedException e)
        {
        	System.out.println("Clone failure!");
        }
		return clone;
	}

	public Attachment getAttachment()
	{
		return this.attachment;
	}

	public String getName(){
		return this.name;
	}
	
	public void display()
	{
		System.out.println("Email");	
	}
	
}