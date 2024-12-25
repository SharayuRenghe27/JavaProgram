package Task.Nov.Constructor;

public class furniturerunner {
    public static void main(String[] args) {
        System.out.println("Chair constructor calling while creating the object c1 below ------>");
        chair c1=new chair();//default constructor
        System.out.println("Default legs of chair c1 const->"+c1.legs);
        System.out.println("Default legs of material c1 const->"+c1.material);
        c1.legs=5;
        System.out.println("Updated values-----------------");
        System.out.println("Updated value of legs -> chair c1 const->"+c1.legs);
        c1.material="Plastic";
        System.out.println("Updated legs of material c1 const->"+c1.material);

        System.out.println("------table constructor-----");
        table t1=new table(6,"steel"); //parameterized constructor 1(constructor overloading)
        System.out.println("Table t1 legs---->"+t1.leg1);
        System.out.println("Table t1 material---->"+t1.material1);
        t1.detailsdisplay2();
        table t2=new table(10); //parameterized constructor 2 (constructor overloading)

        t2.detailsdisplay1();



    }



}
