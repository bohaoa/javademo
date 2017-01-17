package cd.java.design.mediator;

/**
 * Created by boge on 17/1/12.
 */
public class ConcreteMediator extends Mediator {

    Button button;
    List list;
    Textbox textbox;

    @Override
    public void componentChange(Component component) {
        if(component == button){
            list.update();
            textbox.update();
        } else if(component == list){
            button.update();
            textbox.update();
        } else if(component == textbox){
            button.update();
            list.update();
        }
    }
    
}
