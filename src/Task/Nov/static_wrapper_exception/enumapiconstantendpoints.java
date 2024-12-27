package Task.Nov.static_wrapper_exception;

public  enum enumapiconstantendpoints {

    Base_URL("https;//app.vwo.com"),
    Login_page("https;//app.vwo.com/login"),
    Dashborad("https;//app.vwo.com/dashboard");


    private String name;
    enumapiconstantendpoints(String name){
        this.name=name;
    }
    String getvalue(){
        return name;
    }
}
