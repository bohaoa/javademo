package cd.java.design.responsibility;

/**
 * 职责链模式 －> 吧职责在整个链中传递
 * 分为： 纯职责链模式和不纯的职责链模式
 * Created by boge on 17/1/11.
 */
public abstract class Approver {

    private String name;
    public Approver successor;

    public Approver(String name){
        this.name = name;
    }

    public void setSuccessor(Approver successor){
        this.successor = successor;
    }

    public Approver getSuccessor(){
        return successor;
    }

    /**
     * 处理请求体
     * @param request
     */
    public abstract void processRequest(PurchaseRequest request);
}
