package Task.Nov.list_set_collection;

import java.util.*;

public class set {
    public static void main(String[] args) {
        Set hs=new HashSet();
        Set lhs=new LinkedHashSet();
        Set ths=new TreeSet();

        hs.add("ABC");
        hs.add("XYZ");
        hs.add("PQR");
        hs.add("PQR");
        hs.add(null);
        hs.add(null);
        System.out.println(hs);//---> no order is maintaine and no duplicates are allow

        lhs.add("ABC");
        lhs.add("XYZ");
        lhs.add("PQR");
        lhs.add("PQR");
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);//---> order is maintaine and no duplicates are allow

        ths.add("ABC");
        ths.add("XYZ");
        ths.add("PQR");
        ths.add("PQR");
       // ths.add(null);-->sorting is done first and thats why we cant add null cause it canot be sorted(null pointer)
       // ths.add(123);--> no different daya type accpeted cause it cant be sorted(classcastexception)
        System.out.println(ths);//--->  no duplicates are allow


//        EnumSet es=new EnumSet();
    }
}
