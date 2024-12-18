package Dec.MainMethod;

public class Lab004 {
    public static void main(String[] args) {
        int num=20;
        String s1=num>10? "True":"False";
        System.out.println(s1);
        System.out.println(num<11?"True":"false");
        int x=11,y=9,z=90;
        System.out.println((x>y)?((x>y)?x:y):((y>z)?y:z));
        System.out.println((x>y&&x>z)?x:((y>z)?y:z));
        int grade=60;
        System.out.println((grade>=90)?"A":(grade>=80)?"B":(grade>=70)?"C":(grade>=60)?"D":"F");
        int num1 = 20;
        System.out.println(num1);
        System.out.println(num1++);
        System.out.println(num1);



    }
}
