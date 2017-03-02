package cd.java.design.observer;

/**
 * Created by boge on 17/1/18.
 */
public class ConcreteSubject extends Subject {


    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update();
        }
    }
}
