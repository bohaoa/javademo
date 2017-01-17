package cd.java.design.adapter.example;

/**
 * Created by boge on 17/1/10.
 */
public class Client {

    public static void main(String[] args) {
        Target target = new Adapter();
        System.out.println(target.password("123", "123"));

    }
}
