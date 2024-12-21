package Task.Dec;

import java.util.Scanner;

public class Stringpalindrome {
    public static void main(String[] args) {

        System.out.println("Enter the name ");
        Scanner sc =new Scanner(System.in);
        String name=sc.next();
        name.toLowerCase();
        boolean result=true;
        int length =name.length();
        for (int i=0;i<=name.length()/2;i++)
        {
            if (name.charAt(i)!=name.charAt(length-1-i))
                result=false;
            break;
        }
        if (result)
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
        sc.close();
    }
}
