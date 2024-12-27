package Task.Nov.static_wrapper_exception;

public class SIB_IIB_ex2 {
//    A a1;- no object is created so nothing will be loaded(only ref creation doesn't call the SIB)
//    new A();- both blocks will execute cause the class loaded
}
class A{
    {
        System.out.println("IIB");
    }
    static {
        System.out.println("SBI");
    }
}
