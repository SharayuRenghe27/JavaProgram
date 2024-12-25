package Task.Nov.SingleInheritance;

public class SingleInh {
    public static void main(String[] args) {
        Subclass1 sub1=new Subclass1();
        System.out.println("son accessing father's gold->"+sub1.gold);
        sub1.bhk2();
        sub1.bhk3();
        Superclass1 super1=new Superclass1();
        System.out.println("Father's gold->"+super1.gold);
        super1.bhk2();
    //  super1.bhk3(); not able to access cause its

    }
}
