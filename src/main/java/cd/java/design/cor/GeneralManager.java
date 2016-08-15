package cd.java.design.cor;

public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<30){
			System.out.println("總经理" + name + "审批员工" + request.getLeaveName() + "的请假条，请假天数为" + request.getLeaveDays() + "天。");
		} else {
			if(this.successer!=null)
			{
				this.successer.handleRequest(request);
			}
		}
		
	}
}
