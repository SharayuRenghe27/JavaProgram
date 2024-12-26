package Task.Nov.Encapsulation.Real;

public class Baseclass {
    private String browser;

    Baseclass(){
        System.out.println("DC-Baseclass");
    }
    Baseclass(String b){
        System.out.println("CC-Baseclass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAuth) {
        if (isAuth)
            this.browser = browser;
        else
            System.out.println("Not allowed");
    }
    void openbowser(){
        System.out.println("Opening browser !!!!");
    }
    void openbowser(String broswername){
        System.out.println("Opening browser !!!!");
    }

    void closebowser(){
        System.out.println("Closing browser !!!!");
    }

}



