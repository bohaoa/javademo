package cd.java.design.bridge.example;

/**
 * Created by boge on 17/1/10.
 */
public class BigWrite extends AbstactWrite {

    public void write(){
        System.out.println("使用大毛笔>");
        color.colorImpl();
    }
}
