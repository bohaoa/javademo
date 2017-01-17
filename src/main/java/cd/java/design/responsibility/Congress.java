package cd.java.design.responsibility;

/**
 * Created by boge on 17/1/11.
 */
public class Congress extends Approver {

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() > 10000 && request.getAmount() < 100000) {
            System.out.println("Congress 处理了");
        }

        if(getSuccessor()!=null){
            getSuccessor().processRequest(request);
        }
    }
}
