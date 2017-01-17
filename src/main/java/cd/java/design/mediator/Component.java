package cd.java.design.mediator;

/**
 * Created by boge on 17/1/12.
 */
public abstract class Component {

    Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public void change(){
        mediator.componentChange(this);
    }

    public abstract void update();
}
