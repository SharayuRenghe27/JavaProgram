package Task.Nov.exceptionpart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Unchecked_checked_exception {
    public static void main(String[] args) {
        try{
            int a=10/0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Unchecked");
        }
        try{
            FileReader f=new FileReader(new File("C://abc.txt"));
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
//            System.out.println(e.printStackTrace());  ----->in red error format it will show
        }
        finally {
            System.out.println("Finally checked exception");
        }

    }
}
