package Task.Nov.Encapsulation;

import Task.Nov.Encapsulation.Real.Baseclass;
import Task.Nov.Encapsulation.Real.Testcase1;

public class runnerreal {
    public static void main(String[] args) {
        Testcase1 tc1=new Testcase1();//dynamic dispatch
        tc1.setBrowser("Chrome",true);
        tc1.starttestcase();

    }
}
