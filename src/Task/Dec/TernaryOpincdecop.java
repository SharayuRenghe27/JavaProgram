package Task.Dec;

public class TernaryOpincdecop {
    public static void main(String[] args) {
        int x=11,y=9,z=90;
        System.out.println((x>y)?((x>z)?x:z):((y>z)?y:z));
        System.out.println((x>=y&&x>=z)?x:((y>=z)?y:z));
        System.out.println((x>y&&x>z)?x:(y>x&&y>z)?y:z);

        int a=10;
        System.out.println(++a+a+++a++);
        System.out.println(a);

        int num1 = 20;
        System.out.println(num1);
        System.out.println(--num1 + num1++ + num1--);
    }
}
