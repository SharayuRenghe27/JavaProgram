package Task.Nov.map_collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapex {
    public static void main(String[] args) {
        Map m1=new HashMap();
        m1.put("name","sharayu");
        m1.put("Rollno",9);
        m1.put("phoneno",999999999);
        System.out.println(m1);

        Map m2=new HashMap();
        m2.put("name","Aditi");
        m2.put("Rollno",8);
        m2.put("phoneno",8888888);
        System.out.println(m2);

        List l1=new ArrayList();
        l1.add(m1);
        l1.add(m2);
        System.out.println(l1);
    }

}
