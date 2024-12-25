package Task.Oct;

public class Operator {

    public static void main(String[] args) {
        int a=101,b=10;
        System.out.println("A=101 \t B=10 \n **Arithmetic Operator** \n Addition a+b="+a+b);
        System.out.println(a-b);
        System.out.println("Multiplication a*b="+a*b);
        System.out.println("Division a/b="+a/b);
        System.out.println("Modulo a%b="+a%b);
        System.out.println(" **Relational Operator** \n");
        boolean c;
        System.out.println(c=a>b);
        System.out.println(c=a>=b);
        System.out.println(c=a<=b);
        System.out.println(c=a!=b);
        System.out.println(" **Unary Operator** \n");
        System.out.println(a=a+1);
        System.out.println(a=a-1);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println("Concatination String 1=aditi, String 2= Kapoor");
        String n1="aditi"; String n2= "Kapoor";
        int d=10,e=10;
        System.out.println("String 1 + 2="+n1+n2);
        System.out.println("1st concatination "+n1+n2+d+e); //aditikpoor1010
        System.out.println("1st calculation will start"+d+e+n1+n2);//20aditikapoor
        System.out.println(" **Logical Operator** \n");
        boolean x=true, y=true;
        boolean z=x||y;
        System.out.println(c);
        System.out.println(!x);
        System.out.println(!!!!y);
        System.out.println(!(10>20));
        //System.out.println((10>20)!);- we cant put ! at the end else it will iven an error
        System.out.println(true||false);
        System.out.println(true&&false);
        System.out.println(" **Compound Operator**");
        System.out.println(a+=10);
        System.out.println(a*=10);
        System.out.println(a-=10);
        System.out.println(a/=10);
        String name1= new String( "Adi");
        System.out.println("New oprator create object on heap area");
        System.out.println(name1 instanceof String);



    }
}

