package Task.Dec;

import java.util.Scanner;

public class binaryserachinarray {
    public static void main(String[] args) {

        int []arr1={78,45,33,90,21};
        for (int i=0;i<arr1.length;i++)
            System.out.print(" "+args[i]);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        String []arr2=new String[size];
        for (int j=0;j<size;j++)
        {
            System.out.println("Enter the no-->");
            arr2[j]=sc.next();
        }


    }
}
