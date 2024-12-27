package Task.Nov.static_wrapper_exception;

public class staticex2 {
    public static void main(String[] args) {
        automation t1=new automation();
        automation t2=new automation();
        System.out.println(t1.driver);
        System.out.println(t1.driver);
    }
}
class automation{
    static String driver="ABC";
}
