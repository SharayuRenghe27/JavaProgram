package Task.Nov.superkeyabstraction;

public class Interfacep3multipleinh {
    public static void main(String[] args) {

    }
}
class Child implements Father,Mother{
    @Override
    public void same() {
        System.out.println("No confusion cause the defined methods are incomplete");

    }

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }

    @Override
    public void f4() {

    }
}

interface Father{
    void f1();
    void f2();
    void same();
//    Father(){
//        --------------> cant create constructor cause we don't crate object of interface that's why we will never call the constructor while creating the object
//    }

}
interface Mother{
    void f3();
    void f4();
    void same();

}
