package cd.java.design.state;

/**
 * Created by boge on 17/1/18.
 */
public class Client {

    public static void main(String[] args) {
        Account acc = new Account("liuhaibo", 0);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.computeInterest();


        Account acc1 = new Account("liuhaibo1", 0);
        acc1.deposit(1000);
        acc1.withdraw(2000);
        acc1.deposit(3000);
        acc1.withdraw(4000);
        acc1.withdraw(1000);
        acc1.computeInterest();
    }
}
