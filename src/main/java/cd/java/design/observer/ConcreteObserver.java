package cd.java.design.observer;

/**
 * Created by boge on 17/1/18.
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        System.out.println("具体的监听者开始执行了。。。");
    }
}
