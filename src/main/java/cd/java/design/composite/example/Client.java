package cd.java.design.composite.example;

/**
 * Created by boge on 17/1/10.
 */
public class Client {

    public static void main(String[] args) {
        Component c1 = new Composite("文件夹1");
        Component c11 = new Leaf("文件夹1-文件1");
        Component c12 = new Leaf("文件夹1-文件2");
        c1.add(c11);
        c1.add(c12);

        Component c2 = new Composite("文件夹2");
        Component c21 = new Leaf("文件夹2-文件1");
        Component c22 = new Leaf("文件夹2-文件2");
        c2.add(c21);
        c2.add(c22);

        Component c3 = new Composite("文件夹3");
        Component c31 = new Leaf("文件夹3-文件1");
        Component c32 = new Leaf("文件夹3-文件2");
        c3.add(c31);
        c3.add(c32);

        Component root = new Composite("root");
        root.add(c1);

        c1.add(c2);
        c2.add(c3);

        root.operator();

    }
}
