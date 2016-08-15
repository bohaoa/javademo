package cd.java.design.cor;

public abstract class Leader {

	protected String name;
	protected Leader successer;
	
	public Leader (String name){
		this.name = name;
	}
	
	public void setSuccesser(Leader successer){
		this.successer = successer;
	}
	
	public abstract void handleRequest(LeaveRequest request);
}
