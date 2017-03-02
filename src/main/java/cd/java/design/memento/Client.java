package cd.java.design.memento;

/**
 * 备忘录模式：
 * Created by boge on 17/1/18.
 */
public class Client {

    public static void main(String[] args) {
        Chessman chessman1 = new Chessman("车", 1, 1);
        display(chessman1);
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        mementoCaretaker.setChessmanMemento(chessman1.save());//保存

        chessman1.setX(2);
        display(chessman1);
        mementoCaretaker.setChessmanMemento(chessman1.save());//保存

        chessman1.setX(3);
        display(chessman1);

        System.out.println("悔棋。。。。。。");
        chessman1.restore(mementoCaretaker.getChessmanMemento());
        display(chessman1);
    }

    private static void display(Chessman chessman){
        System.out.println("当前位置："+chessman.getLabel()+" x:"+chessman.getX()+" y:"+chessman.getY());
    }
}
