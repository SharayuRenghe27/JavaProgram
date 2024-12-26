package Task.Nov.polymorphism.methodoverloadingpac;

public class methodoverloading {
    public static void main(String[] args) {

        mathoverloading mo1 = new mathoverloading();
        mo1.addition();
        System.out.println(mo1.addition(3, 5));
        System.out.println(mo1.addition(3.9, 5.6));
        System.out.println(mo1.addition(356751179, 886271525));
        System.out.println(mo1.addition("ABC ", "xyz"));
    }
}


