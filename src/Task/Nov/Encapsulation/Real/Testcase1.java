package Task.Nov.Encapsulation.Real;

public class Testcase1 extends Baseclass{



    public Testcase1(){
        super();//parent constructor
        //this keyword is for the current object
        System.out.println("DC-TC1");
    }

    public void starttestcase(){
        openbowser("chrome");
        closebowser();
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own logic");
        super.setBrowser(browser, isAuth);
    }
}
