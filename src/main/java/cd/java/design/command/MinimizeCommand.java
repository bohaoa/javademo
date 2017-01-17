package cd.java.design.command;

/**
 * 具体的命令，对应于命令对应的操作
 * Created by boge on 17/1/11.
 */
public class MinimizeCommand implements Command {

    private MinimizeHandler handler = new MinimizeHandler();

    @Override
    public void execute() {
        handler.minimize();
    }
}
