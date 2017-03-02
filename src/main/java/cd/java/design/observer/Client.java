package cd.java.design.observer;

/**
 * Created by boge on 17/1/18.
 */
public class Client {

    public static void main(String[] args) {
        Observer observer = new ConcreteObserver();
        Subject subject = new ConcreteSubject();
        subject.attach(observer);

        subject.notifyObserver();
    }
}
