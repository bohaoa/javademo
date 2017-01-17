package cd.java.design.command;

/**
 * Created by boge on 17/1/11.
 */
public class HelpCommand implements Command {

    private HelpHandler helpHandler = new HelpHandler();

    @Override
    public void execute() {
        helpHandler.help();
    }
}
