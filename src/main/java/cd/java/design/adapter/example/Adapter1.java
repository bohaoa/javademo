package cd.java.design.adapter.example;

/**
 * Created by boge on 17/1/10.
 */
public class Adapter1 implements Target {

    public Adaptee adaptee;

    public Adapter1(){
        this.adaptee = new Adaptee();
    }

    @Override
    public String password(String name, String password) {
        return adaptee.addPass(name + password);
    }
}
