package Task.Nov;

public class ATB {
    public static void main(String[] args) {

    ATBStudent []student=new ATBStudent[3];
    student[0]=new ATBStudent("Adi",20,"CS");
    student[1]=new ATBStudent("mahesh",28,"CS");
    student[2]=new ATBStudent("chhote",21,"CS");

    for (ATBStudent ATBstudent :student)
        System.out.println(ATBstudent);
    }
}

class ATBStudent{
      String name;
      int age;
      String coruse;

    ATBStudent(String name, int age, String coruse) {
        this.name=name;
        this.age=age;
        this.coruse=coruse;
    }

    public String toString(){
        return "ATBstudent [Name "+name+", Age "+age+", Course "+coruse+"]";

    }

    public int getAge(){
        return age;
    }

    public String getCoruse(){
        return coruse;
    }

    public String getName(){
        return name;
    }



}