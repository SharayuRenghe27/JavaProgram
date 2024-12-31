package Task.Nov.generic;

public class ex {
    public static void main(String[] args) {

        temp_sum(23,45);
        temp_sum("dodo","Niky");
        temp_sum(true,false);

    }
    public static <T> T temp_sum(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return  null;
    }
}

