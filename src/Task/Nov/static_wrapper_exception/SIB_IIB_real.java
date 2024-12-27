package Task.Nov.static_wrapper_exception;

public class SIB_IIB_real
{
    public static void main(String[] args) {
        ATB a1=new ATB("Sharayu");
        ATB a2=new ATB("Tushar");
        ATB a3=new ATB("Balaji");
        ATB a4;
        new ATB("dodo");
            a1.readdocument();
            a2.readdocument();
            //static
        ATB.doassignment();//static method
        System.out.println(ATB.class);//static variable
    }
}
class ATB{
    public ATB(String name) {
        this.name = name;
    }

    {
        System.out.println("IIB");
        System.out.println("Reading from scv file");
    }
    static {
        System.out.println("Load the class? I will execute");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name;
    private String phone;
    static String course="ATB9x";

    void readdocument(){
        System.out.println("Non static method");
        System.out.println(course);
    }
    static void doassignment(){
//        System.out.println(phone);
        System.out.println("Do Assignement");
    }
    static class AI{
// not useful
    }
}
