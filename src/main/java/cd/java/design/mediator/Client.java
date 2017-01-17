package cd.java.design.mediator;

/**
 * 通过当前的一个操作 影响其他相关的所有操作，通过引入中介者角色。回旋调用执行
 * Created by boge on 17/1/12.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        List list = new List();
        Button button = new Button();
        Textbox textbox = new Textbox();

        mediator.button = button;
        mediator.list = list;
        mediator.textbox = textbox;

        list.setMediator(mediator);
        button.setMediator(mediator);
        textbox.setMediator(mediator);

        button.change();

        System.out.println(">>>>>>>>>>");

        list.change();
    }
}
