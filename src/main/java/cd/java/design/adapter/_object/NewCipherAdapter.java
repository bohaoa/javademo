package cd.java.design.adapter._object;

/**
 * adapter角色
 * @author Thinkpad
 *
 */
public class NewCipherAdapter extends DataOperation
{
	private NewCipher cipher;
	
	public NewCipherAdapter()
	{
		cipher=new NewCipher();
	}
	
	public String doEncrypt(int key,String ps)
	{
		return cipher.doEncrypt(key,ps);
	}
}


