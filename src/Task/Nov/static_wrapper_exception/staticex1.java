package Task.Nov.static_wrapper_exception;

public class staticex1
{
    public static void main(String[] args) {

//    s1.age
        student s1=new student(23);
        student s2=new student(22);
        student s3=new student(21);
        System.out.println(student.school);
        student.school="XYZ";
        System.out.println(student.school);
        System.out.println(s1.school);
        System.out.println(s2.school);


    }

}
class student{
    int age=123;//non static/instants variable
    static String school="ABC";

    public student(int age) {
        this.age = age;
    }

    {
        System.out.println("IIB=Instance Initialization block");
        System.out.println("Here you can write down the code which you want to execute when the object is created-similar to constructor but the block does not have any name");
        System.out.println("Read mySQL DB-------");
    }

    static {
        System.out.println("SIB-Static  Initialization block");
        System.out.println("Load once when the class is loaded");
        System.out.println("Read the excel file");
    }

}


