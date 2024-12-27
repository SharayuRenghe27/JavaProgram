package Task.Nov.wapper_execption_part2;

public class execption_problem1 {
    public static void main(String[] args) {
        System.out.println("start the program");
        String ip=args[0];
        //if dont pass any value from terminal it will take 0 (or add string value )as default value
        // which will lead to arrayindexoutofbound or dividebyzero or arithmatic exception and will terminate the program
        int a=Integer.parseInt(ip);
        int b= 0;
        try {
            b = 1000/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("End of program");
    }
}
