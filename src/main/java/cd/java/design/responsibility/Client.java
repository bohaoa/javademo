package cd.java.design.responsibility;

/**
 * Created by boge on 17/1/11.
 */
public class Client {

    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest();
        request.setAmount(12000.00);
        request.setNumber(12);
        request.setPurpose("test");

        Approver a1 = new Director("a1");
        Approver a2 = new Congress("a2");

        a1.setSuccessor(a2);

        a1.processRequest(request);

    }
}
