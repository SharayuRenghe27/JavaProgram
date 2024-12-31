package Task.Nov.generic_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List l1=new ArrayList();// Arrays Format - need Continuous memory
        List l2=new LinkedList(); // Doubly Linked List.--> randomly placed in the memory

        List fruits=List.of("Orange","Apple");
        fruits.add("banana");// java.lang.UnsupportedOperationException


    }

//    public static Iterator iterator() {
//    }
}
