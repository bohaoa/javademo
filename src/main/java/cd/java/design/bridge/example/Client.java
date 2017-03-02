package cd.java.design.bridge.example;

/**
 * 将抽象和实现分离
 * Created by boge on 17/1/10.
 */
public class Client {

    public static void main(String[] args) {

        AbstactWrite write = new BigWrite();
        Color color = new RedColor();
        write.setColor(color);

        write.write();

    }
}
