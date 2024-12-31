package Task.Nov.list_set_collection;

import java.util.ArrayList;
import java.util.List;

public class studentrunner {
    public static void main(String[] args) {
        student s1= new student("Stud1","1");
        student s2= new student("Stud2","2");
        student s3= new student("Stud3","3");
        student s4= new student("Stud4","4");

        List<student> mystudent=new ArrayList<>();
        mystudent.add(s1);
        mystudent.add(s2);
        mystudent.add(s3);
        mystudent.add(s4);

        s1.printdetails();
        s2.printdetails();
        s3.printdetails();
        s4.printdetails();
    }
}
