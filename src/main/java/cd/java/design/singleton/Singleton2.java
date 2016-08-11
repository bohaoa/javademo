package cd.java.design.singleton;

/**
 * 懒汉单例
 * @author Thinkpad
 *
 */
public class Singleton2
{
	private Singleton2() {	
	}
	
	public static final Singleton2 getInstance()
	{
		return inner.innerInstance;
	}
	
	private static class inner{
		static final Singleton2 innerInstance = new Singleton2();
	}
	
}