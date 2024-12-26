package Task.Nov.Encapsulation;

public class part1 {
    public static void main(String[] args) {
        vwologin vw1=new vwologin("Sharayu","password123");
        System.out.println(vw1.password);
        vw1.password="uuu444";
        System.out.println(vw1.password);//not good thing hacker can change this
        System.out.println("---------------------");
        goodvwologin gvw1=new goodvwologin("Sharayugood","goodpassword123");
//        System.out.println(gvw1.password);--> not able to access cause it is private
//        vw1.password="uuu444";
//        System.out.println(gvw1.password);//--> not able to access cause it is private
//        System.out.println(gvw1.getPassword());
        String pass=gvw1.getPassword(true);
        gvw1.setPassword("Newpass123",true);
        System.out.println(pass);

    }


}
class vwologin{
    public  String username;
    public  String password;

    public vwologin(String username, String password){
        this.username=username;
        this.password=password;

    }

}
class goodvwologin{

    public goodvwologin(String username, String password){
        this.username=username;
        this.password=password;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAuth) {
        if(isAuth)
         return password;
        else
            return "None";
    }

    public void setPassword(String password,boolean isAdmin) {
        if (isAdmin)
            this.password = password;
        else
            System.out.println("Not Allowed");
    }

    private String username;
    private String password;


}
