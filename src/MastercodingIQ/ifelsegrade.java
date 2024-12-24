package MastercodingIQ;

import java.util.Scanner;

public class ifelsegrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter score");
        int a=scanner.nextInt();
        if (a>=90&&a<=100)
            System.out.println("Grade is A");
        else if (a>=80&&a<=89)
            System.out.println("Grade is B");
        else if (a>=70&&a<=79)
            System.out.println("Grade is C");
        else if (a>=60&&a<=69)
            System.out.println("Grade is D");
        else if (a>=0&&a<=59)
            System.out.println("Grade is F");

        scanner.close();


    }
}
