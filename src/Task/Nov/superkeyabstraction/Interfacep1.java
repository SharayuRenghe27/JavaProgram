package Task.Nov.superkeyabstraction;
public class Interfacep1 {

}


abstract class ABC{
    ABC(){

    }
    abstract void m1();
    void m2(){
        System.out.println("Complete method!!");
    }


}

interface I{
void m1();
void m2();
//void m3(){
//    cant have complete method
//}
    default void m4(){
        System.out.println("Default Method");
    }
    default void m5(){
        System.out.println("Default Method");
    }
    static void m6(){
        System.out.println("Static method is also allowed--> new feature added");
    }
        }

