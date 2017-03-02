package cd.java.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 多次备忘
 * Created by boge on 17/1/18.
 */
public class MementoCaretakerList {

    private List list = new ArrayList();

    public ChessmanMemento getChessmanMemento(int i) {
        return (ChessmanMemento) list.get(i);
    }

    public void setChessmanMemento(ChessmanMemento chessmanMemento) {
        list.add(chessmanMemento);
    }
}
