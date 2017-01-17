package cd.java.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by boge on 17/1/11.
 */
public class FBsettingWindow {

    private String title;
    private List<FunctionButton> list = new ArrayList<FunctionButton>();

    public FBsettingWindow(String title){
        this.title = title;
    }

    public void addFunctionButton(FunctionButton fb){
        list.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb){
        list.remove(fb);
    }

    public void display(){
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键个数："+list.size());
        for (FunctionButton obj : list) {
            obj.onClick();
        }
        System.out.println("------------------------------");
    }

}
