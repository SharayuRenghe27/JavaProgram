package Task.Oct;

import java.util.Scanner;

public class casecalculator {
    public static void main(String[] args) {
        System.out.println("Enter two no ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter the symbol for the calculation for (Addition +, subtraction -, multiplication *, division /, modules % )");
        char cal=sc.next().charAt(0);

        switch (cal)
        {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/': {
                if (num1 == 0 || num2 == 0)
                    System.out.println("dont add 0");
                else
                System.out.println(num1 / num2);
            }break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid input");
                //           case1-> System.out.println("001");
//            case2-> System.out.println("002");
//            case3-> System.out.println("003");
//            default-> System.out.println("inva;id");
        }
        sc.close();
    }
}
