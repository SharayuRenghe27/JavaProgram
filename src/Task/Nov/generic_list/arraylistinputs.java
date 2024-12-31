package Task.Nov.generic_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylistinputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List name=new ArrayList();
        List age=new ArrayList();

        String input="Y";
        while (input.equalsIgnoreCase("Y")){

            System.out.println("Enter name:");
            name.add(sc.next());

            System.out.println("Enter age");
            age.add(sc.nextInt());

            System.out.println("Do you want to add new record? Iy Yes press Y else N");
            input=sc.next();
        }

        System.out.println("Name->"+name);
        System.out.println("Age->"+age);


    }
}
