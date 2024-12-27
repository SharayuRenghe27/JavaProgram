package Task.Nov.static_wrapper_exception;

public class conversion {
    public static void main(String[] args) {
        String num="10";
        //String-> Primitive
        Integer a=Integer.valueOf(num);
        int a2=a;//unboxing

        //String to primitive
        int a3=Integer.parseInt(num);

        Long l=10l;
        short s=23;
        Boolean bb=true;
    }
}
