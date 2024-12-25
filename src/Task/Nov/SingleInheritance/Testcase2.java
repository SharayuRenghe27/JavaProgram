package Task.Nov.SingleInheritance;

public class Testcase2 extends Common_base_test {
    Testcase2(){
        System.out.println("Test case2--> Child constructor");

    }
    void testcase2(){
        startbrowser();
        System.out.println("Tc2 execution");
        readexcelfile();
        endbrowser();
    }
}
