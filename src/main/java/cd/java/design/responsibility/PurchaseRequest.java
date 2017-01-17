package cd.java.design.responsibility;

/**
 * Created by boge on 17/1/11.
 */
public class PurchaseRequest {

    private double amount;
    private int number;
    private String purpose;


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
