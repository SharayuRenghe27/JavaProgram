package Task.Nov.wapper_execption_part2;

public class wrapper1 {
    public static void main(String[] args) {
        int a=10;
        Integer b=a;//boxing-int-> Integer
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        b.intValue();

        Integer a2=42;
        int value=a2;//unboxing-integer->int
        System.out.println(value);
    }
}
