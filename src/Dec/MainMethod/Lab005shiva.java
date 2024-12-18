package Dec.MainMethod;

public class Lab005shiva {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int result1 = (a > b) ? ( (a>c) ? a:c) : ((b>c) ? b : c);
        int result2 = (a > b && a > c) ? a : ((b>c)? b: c);
        System.out.printf("\nResult1=%d and Result2=%d",result1,result2);
//        System.out.println(result);
    }
}
