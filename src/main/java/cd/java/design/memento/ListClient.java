package cd.java.design.memento;

/**
 * Created by boge on 17/1/18.
 */
public class ListClient {

    private static int index = -1;
    private static MementoCaretakerList mementoCaretaker = new MementoCaretakerList();

    public static void main(String[] args) {
        Chessman chessman = new Chessman("车", 1, 1);
        display(chessman);
        mementoCaretaker.setChessmanMemento(chessman.save());//保存备忘录
        index ++;

        chessman.setX(2);
        display(chessman);
        mementoCaretaker.setChessmanMemento(chessman.save());//保存备忘录
        index ++;

        chessman.setX(3);
        display(chessman);
        mementoCaretaker.setChessmanMemento(chessman.save());//保存备忘录
        index ++;

        System.out.println("悔棋开始。。。。");

        chessman.restore(mementoCaretaker.getChessmanMemento(index));
        display(chessman);
        index --;

        chessman.restore(mementoCaretaker.getChessmanMemento(index));
        display(chessman);
        index --;

        chessman.restore(mementoCaretaker.getChessmanMemento(index));
        display(chessman);
        index --;

    }

    private static void display(Chessman chessman){
        System.out.println("当前位置："+chessman.getLabel()+" x:"+chessman.getX()+" y:"+chessman.getY());
    }
}
