package Task.Oct;

import java.util.Scanner;


public class funtioncalculator {
    public static void main(String[] args) {
        System.out.println("Enter 2 values");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Add->"+add(a,b));
        System.out.println("Sub->"+sub(a,b));
        System.out.println("Mul->"+mul(a,b));
        System.out.println("div->"+div(a,b));
        System.out.println("div->"+modules(a,b));
        sc.close();
    }

    private static int modules(int a, int b) {
        return a%b;
    }

    public static int add(int a, int b){
    return a+b;
}
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        if(a==0||b==0)
            System.out.println("dont add 0");
        return a/b;
    }


}
