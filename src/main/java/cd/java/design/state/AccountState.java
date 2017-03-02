package cd.java.design.state;

/**
 * Created by boge on 17/1/18.
 */
public abstract class AccountState {

    protected Account acc;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();

}
