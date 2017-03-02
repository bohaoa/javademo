package cd.java.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者集合
 * Created by boge on 17/1/18.
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObserver();

}
