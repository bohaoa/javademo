package cd.java.design.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by boge on 17/1/10.
 */
public class Composite extends Component {

    private String name;

    private List<Component> list = new ArrayList<Component>();

    public Composite(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operator() {
        System.out.println("操作的是："+name);
        for(Component c : list){
            c.operator();
        }
    }
}
