package cd.java.design.cor;

/**
 * 职责链模式
 * @author Thinkpad
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Leader obj1, obj2;
		obj1 = new GeneralManager("張三");
		obj2 = new Manager("第四");
		
		obj1.setSuccesser(obj2);
		
		LeaveRequest lr = new LeaveRequest("張叁", 21);
		obj1.handleRequest(lr);
	}

}
