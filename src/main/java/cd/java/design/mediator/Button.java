package cd.java.design.mediator;

import cd.java.design.composite.example.*;

/**
 * Created by boge on 17/1/12.
 */
public class Button extends Component {

    @Override
    public void update() {
        System.out.println("button修改了！");
    }
}
