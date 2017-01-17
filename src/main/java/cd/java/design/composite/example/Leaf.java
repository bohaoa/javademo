package cd.java.design.composite.example;

/**
 * Created by boge on 17/1/10.
 */
public class Leaf extends Component {

    private String name;

    public Leaf(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operator() {
        System.out.println("叶子节点"+name+"的操作！");
    }
}
