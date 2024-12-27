package Task.Nov.wapper_execption_part2;

public class execption_problem2 {
    public static void main(String[] args) {
        String s1=null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("It will give null pointer exception which is unchecked type ");
    }
}
