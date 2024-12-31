package Task.Nov.exceptionpart;

public class multicatch {
    public static void main(String[] args) {
        String s1="sam";
        try {
            s1.trim();//----Nullpointer exeption
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        try{
            String a=args[0];
            System.out.println("First arg->"+args[0]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        }

        try{
            int a=10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }

        try{
            String s2=null;
            s2.length();
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());

        }

    }
}
