package Dec.MainMethod;

public class Lab009String {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Babu");
        s1.append(" moshai");
        System.out.println(s1);
        System.out.println(s1.reverse());
        System.out.println(s1.replace(1,3,"s"));
        StringBuilder s2=new StringBuilder("Bhaiya");
        s2.append(" sahab");
        System.out.println(s2);
        System.out.println(s2.reverse());

    }

}
