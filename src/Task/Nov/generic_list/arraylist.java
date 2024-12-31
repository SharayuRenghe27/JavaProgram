package Task.Nov.generic_list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import Task.Nov.generic.Arraylist;

public class arraylist {
    public static void main(String[] args) {
        List l123=new ArrayList();
        l123.add("milk");
        l123.add("butter");
        l123.add("paneer");
        l123.add("coffee");
        l123.add("jam");
        l123.add(123);
        l123.add(true);
        System.out.println(l123);
        System.out.println(l123.size());
        System.out.println(l123.isEmpty());
        System.out.println(l123.contains("1"));

        System.out.println(" ------ default for loop ");

        for (int i=0;i<l123.size();i++){
            System.out.println(l123.get(i));
        }
        System.out.println(" ------ for each loop ");

        for (Object o: l123){
            System.out.println(o);
        }
        System.out.println(" - To Print Arraylist Iterator ");
        Iterator iterator = l123.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //  Selenium -  -> Store and Insertion and Deletion - DS - LL
        // API Testing - STORE, access it fast. -> AL


    }
}
