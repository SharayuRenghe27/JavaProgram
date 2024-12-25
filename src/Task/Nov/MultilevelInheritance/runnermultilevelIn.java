package Task.Nov.MultilevelInheritance;

public class runnermultilevelIn {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.home();
        c1.gf();
        c1.f();
        c1.c();
        System.out.println("-------------------");
        Father f1=new Father();
        f1.home();
        f1.f();
        f1.extra();
        f1.gf();
        System.out.println("-------------------");
        Grandfather gf1=new Grandfather();
        gf1.home();
        gf1.gf();


    }

}
