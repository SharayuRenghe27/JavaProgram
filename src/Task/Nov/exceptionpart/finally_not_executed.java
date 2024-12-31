package Task.Nov.exceptionpart;

public class finally_not_executed {
    public static void main(String[] args) {
        try {
            int a=10/10;
            System.exit(0);//----> you have closed the JVM then how it will respond
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Not printed");
        }
    }
}
