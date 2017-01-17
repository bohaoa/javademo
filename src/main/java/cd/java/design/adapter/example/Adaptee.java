package cd.java.design.adapter.example;

/**
 * Created by boge on 17/1/10.
 * 设置的默认加密代码
 */
public class Adaptee {

    /**
     * 加密代码
     * @param pass
     * @return
     */
    public String addPass(String pass){
        return pass+"pass";
    }
}
