package Task.Oct;

import java.util.Scanner;

public class casedegreeconvertor {
    public static void main(String[] args) {
        System.out.println("Enter 1 for kilometers to miles conversion, 2 for miles to kilometers");
        Scanner sc=new Scanner(System.in);
        int choice1 =sc.nextInt();
        System.out.println("Enter the value");
        int value1= sc.nextInt();
        if (value1<=0) System.out.println("Dont give 0");
        switch (choice1){
            case 1:
                System.out.println("km->m "+value1*1000);
                break;
            case 2:
                System.out.println("m → km "+value1/1000);
                break;

            default:
                System.out.println("Invalid input");
        }
        System.out.println("Enter 1 for Fahrenheit to Celsius conversion, 2 for Celsius to Fahrenheit");
        int choice2 =sc.nextInt();
        System.out.println("Enter the value");
        int value2= sc.nextInt();
        if (value2<=0) System.out.println("Dont give 0");

        switch (choice2){
            case 1:
                System.out.println("f->c "+((value2-32)*5)/9);
                break;
            case 2:
                System.out.println("c → f "+((value2*9)/5) + 32);
                break;

            default:
                System.out.println("Invalid input");
        }
        sc.close();
    }
}
