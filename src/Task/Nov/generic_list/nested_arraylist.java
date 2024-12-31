package Task.Nov.generic_list;

import Task.Nov.generic.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class nested_arraylist {
    public static void main(String[] args) {
        List flower=new ArrayList();
        flower.add("Rose");
        flower.add("Lily");
        flower.add("Mocka");
        flower.add("Juju");
        System.out.println(flower);

        List<String> cloths=new ArrayList();
        cloths.add("Jeans");
        cloths.add("Top");
        cloths.add("Tshirt");
        cloths.add("Shirt");
        System.out.println(cloths);

        List rollno=new ArrayList();
        rollno.add(1);
        rollno.add(2);
        rollno.add(3);
        rollno.add(4);
        System.out.println(rollno);

        List all_combo=new ArrayList();
        all_combo.add(rollno);
        all_combo.add(cloths);
        all_combo.add(flower);
        System.out.println(all_combo);



    }
}
