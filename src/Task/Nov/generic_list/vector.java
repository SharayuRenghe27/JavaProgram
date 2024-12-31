package Task.Nov.generic_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("ABC");
        v.add("XYZ");
        v.add("PQR");
        System.out.println(v);
        v.remove("XYZ");
        System.out.println(v);
        v.contains("lucky");
        System.out.println(v);

        System.out.println("----------------vector IQ");
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);


        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
