package Task.Nov.list_set_collection;

import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("dodo");
        s.push("nini");
        s.push("kuku");
        s.push("sooho");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());//---> top element
        System.out.println(s);
        System.out.println(s.pop());//-->remove the element top one
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.add(123));
        s.add(0,"Lucky");
        System.out.println(s.get(0));
        System.out.println(s.get(1));
        System.out.println(s);



    }
}
