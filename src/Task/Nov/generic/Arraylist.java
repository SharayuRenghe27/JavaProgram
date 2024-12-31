package Task.Nov.generic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        list1.add("Pramod");
        list1.add("Niky");
        list1.add("Anil");
        list1.add("Anil");
        list1.add(123);
        list1.add(null);
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.isEmpty());
        System.out.println(list1.indexOf("123"));
        System.out.println(list1.contains("Anil"));
        System.out.println(list1.lastIndexOf("Anil"));
        //. Different data type is allowed. and Duplicate is allowed.
    }
}
