package cd.java.design.adapter.example;

/**
 * Created by boge on 17/1/10.
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public String password(String name, String password) {
        return super.addPass(name + password);
    }
}
