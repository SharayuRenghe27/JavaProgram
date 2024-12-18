package Dec.MainMethod;

public class Lab003 {
    public static void main(String[] args) {
        //type casting
        int a=10, b=12;

        System.out.println(a/b);
        System.out.println(a%b);
        byte x=10;
        int n1=x;//widening
       // int n1=(int)x;// narrow
        //byte b1=n1;// not correct
        byte b2=(byte)n1;
        byte y2=(byte)b;

    }
}
