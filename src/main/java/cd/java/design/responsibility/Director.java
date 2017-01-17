package cd.java.design.responsibility;

/**
 * Created by boge on 17/1/11.
 */
public class Director extends Approver {

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() > 10000 && request.getAmount() < 50000) {
            System.out.println("Director 处理了");
        }
        //加上else就是纯的指责链模式
        if(getSuccessor()!=null){
            getSuccessor().processRequest(request);
        }
    }
}
