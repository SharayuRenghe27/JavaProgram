package Task.Nov.SingleInheritance;

public class Testcase1 extends Common_base_test {
     Testcase1(){
        System.out.println("Test case1--> Child constructor");

    }
    void testcase(){
         startbrowser();
         readexcelfile();
         endbrowser();
    }

}
