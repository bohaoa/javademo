package cd.java.design.bridge.example;

/**
 * Created by boge on 17/1/10.
 */
public class BlueColor implements  Color {
    @Override
    public void colorImpl() {
        System.out.println("着色为蓝色！");
    }
}
