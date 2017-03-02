package cd.java.design.command;

/**
 * 将一个请求封装为一个对象，从而可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可取消的操作。
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
