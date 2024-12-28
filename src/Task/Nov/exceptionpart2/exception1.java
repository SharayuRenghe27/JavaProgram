package Task.Nov.exceptionpart2;

import java.util.Scanner;

public class exception1 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        Scanner sc=new Scanner(System.in);
        sc.nextInt();
        try {
            a=10/b;
            System.out.println(a);
//            String s1=null;
//            s1.trim();
        }
//        catch (ArithmeticException e) {
//            System.out.println(e.getMessage());   ---->multiple catch
//        }
        catch (Exception e) {
        System.out.println(e.getMessage());
        }
//        catch (Throwable e) {
//            System.out.println(e.getMessage());   ---->multiple catch
//        }
//        catch (ArithmeticException |NullPointerException|NegativeArraySizeException e ){
//            System.out.println(e.getMessage());   // -----> or all in one also you can do
//        }
        finally {
            sc.close();
            System.out.println("I will be always executed--sc closing");
        }
        }
}
