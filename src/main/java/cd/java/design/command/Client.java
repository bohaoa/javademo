package cd.java.design.command;

/**
 * Created by boge on 17/1/11.
 */
public class Client {

    public static void main(String[] args) {
        FBsettingWindow window = new FBsettingWindow("window");

        FunctionButton button = new FunctionButton("button");
        CommandQueue commandQueue = new CommandQueue();
        commandQueue.addCommand(new HelpCommand());
        commandQueue.addCommand(new MinimizeCommand());
        button.setCommandQueue(commandQueue);
        window.addFunctionButton(button);

        window.display();

    }
}
