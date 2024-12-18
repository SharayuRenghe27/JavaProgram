package Task;

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.printf("Name-%s,Age-%s,Salary-%s",args[0],args[1],args[2]);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name, age and salary");

        String Name=scanner.next();
        int age=scanner.nextInt();
        int salary=scanner.nextInt();
        System.out.printf("Entered Name=%s, Age=%d, Salary=%d \n",Name,age,salary);
        System.out.println("Now enter 2 digit no");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.printf("This no is max- %d",(num1>num2)?num1:num2);

        scanner.close();


    }
}
