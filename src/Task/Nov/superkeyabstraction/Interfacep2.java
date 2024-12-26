package Task.Nov.superkeyabstraction;

public class Interfacep2 {
    public static void main(String[] args) {
        p p1=new p();
        p1.f1();
//        I1 interfaceclassobject= new I1();--> cant create object of interface
    }

}

class p implements I1{
    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

interface I1{
    void f1();
    void f2();
    void f3();
}
