package cd.java.design.command;

/**
 * Created by boge on 17/1/11.
 */
public class FunctionButton {

    private String name;
    private CommandQueue commandQueue;

    public FunctionButton(String name){
        this.name = name;
    }

    public void onClick(){
        commandQueue.execute();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommandQueue(CommandQueue commandQueue){
        this.commandQueue = commandQueue;
    }

}
