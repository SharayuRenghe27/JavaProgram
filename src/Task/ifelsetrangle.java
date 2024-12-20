package Task;

import java.util.Scanner;

public class ifelsetrangle {
    public static void main(String[] args) {
        System.out.println("Method 1");
        int angle1=Integer.parseInt(args[0]);
        int angle2=Integer.parseInt(args[1]);
        int angle3=Integer.parseInt(args[2]);
        if (angle1==angle2 && angle2==angle3)
            System.out.println("Equilateral");
        else if (angle1==angle2||angle2==angle3||angle1==angle3)
            System.out.println("Isosceles");
        else
            System.out.println("scalene");
        System.out.println("Method 2");
        Scanner scanner=new Scanner(System.in);
        int side1,side2,side3;
        System.out.println("Enter side1");
        side1=scanner.nextInt();
        System.out.println("Enter side2");
        side2=scanner.nextInt();
        System.out.println("Enter side3");
        side3=scanner.nextInt();
        if (side1==side2 && side2==side3)
            System.out.println("Equilateral");
        else if (side1==side2||side2==side3||side1==side3)
            System.out.println("Isosceles");
        else
            System.out.println("scalene");

        scanner.close();


    }
}
