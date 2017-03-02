package cd.java.design.memento;

/**
 * 负责人
 * Created by boge on 17/1/18.
 */
public class MementoCaretaker {

    private ChessmanMemento chessmanMemento;

    public ChessmanMemento getChessmanMemento() {
        return chessmanMemento;
    }

    public void setChessmanMemento(ChessmanMemento chessmanMemento) {
        this.chessmanMemento = chessmanMemento;
    }
}
