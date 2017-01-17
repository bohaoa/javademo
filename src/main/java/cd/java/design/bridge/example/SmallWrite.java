package cd.java.design.bridge.example;

/**
 * Created by boge on 17/1/10.
 */
public class SmallWrite extends AbstactWrite {

    public void write(){
        System.out.println("使用小毛笔>");
        color.colorImpl();
    }
}
