package Dec.MainMethod;

public class Lab007for {
    public static void main(String[] args) {
        System.out.println("Age that you entered is = " +args[0]);
        int age= Integer.parseInt(args[0]);
        for (int i=age;i>0;i--)
            System.out.println(i);

        while (age>0)
            System.out.println(age--);

    }

}
