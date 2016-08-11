package cd.java.design.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

/**
 * 深拷贝  成员的对象拷贝
 * @author Thinkpad
 *
 */
public class Email2 implements Serializable {

	private Attachment attachment=null;
	
	public Email2()
	{
		this.attachment=new Attachment();
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException, OptionalDataException
	{
		//将对象写入流中
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		//将对象从流中取出
		ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return (ois.readObject());
	}
	
	public Attachment getAttachment()
	{
		return this.attachment;
	}
	
	public void display()
	{
		System.out.println("查看邮件");	
	}
}
