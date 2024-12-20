package Dec.MainMethod;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("Enter no and I will tell you its even or odd");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if(a%2==0)
            System.out.println("Its-->Even");
        else
            System.out.println("Its -->Odd");
        scanner.close();


    }

}
