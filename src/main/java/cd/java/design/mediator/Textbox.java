package cd.java.design.mediator;

/**
 * Created by boge on 17/1/12.
 */
public class Textbox extends Component {

    @Override
    public void update() {
        System.out.println("textbox修改了！");
    }

    public void clear(){
        System.out.println("textbox clear了！");
    }
}
