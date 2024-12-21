package Task.Dec;

public class Ternaryop2 {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println(a>b?a:b);
        int max=a>b?a:b;
        System.out.println(max);
        int n1=30,n2=20,n3=10;
        System.out.println((n1>n2&&n1>n3)?n1:(n2>n3)?n2:n3);
        System.out.println((n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3));
    }
}
