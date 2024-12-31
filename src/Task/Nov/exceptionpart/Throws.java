package Task.Nov.exceptionpart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {
    public static void main(String[] args) throws FileNotFoundException , Exception{
        //whenever we use Checked exception- throws
        FileInputStream fileInputStream = new FileInputStream("C://a.log");//---either use try catch or add throws Exception



    }
}
