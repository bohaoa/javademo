package cd.java.design.visitor;

/**
 * Created by boge on 17/1/18.
 */
public class HRDepartment extends Department {

    //实现人力资源部对全职员工的访问
    public void visit(FulltimeEmployee employee)
    {
        int workTime = employee.getWorkTime();
        System.out.println("正式员工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
        if(workTime > 40)
        {
            System.out.println("正式员工" + employee.getName() + "加班时间为：" + (workTime - 40) + "小时。");
        }
        else if(workTime < 40)
        {
            System.out.println("正式员工" + employee.getName() + "请假时间为：" + (40 - workTime) + "小时。");
        }
    }

    //实现人力资源部对兼职员工的访问
    public void visit(ParttimeEmployee employee)
    {
        int workTime = employee.getWorkTime();
        System.out.println("临时工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
    }
}