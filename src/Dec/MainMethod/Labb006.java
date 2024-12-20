package Dec.MainMethod;

public class Labb006 {
    public static void main(String[] args) {
        int a=33,b=55,c=2;
        System.out.println((a>=b)?((a>=c)?a:c):((b>=c)?b:c));
        System.out.println((a>=b&&a>=c)?a:(b>=c?b:c));
    }
}
