package cd.java.design.visitor;

/**
 * Created by boge on 17/1/18.
 */
public interface Employee {

    public void accept(Department handler); //接受一个抽象访问者访问
}
