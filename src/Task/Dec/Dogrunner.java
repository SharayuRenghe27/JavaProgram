package Task.Dec;

public class Dogrunner {
    public static void main(String[] args) {
        Dog d1=new Dog();
        System.out.println("Nose value-->"+d1.nose);
        System.out.println("Eras value-->"+d1.ears);
        System.out.println("Bark value-->"+d1.bark);

        System.out.println("--------Below are the function calling--------");

        d1.eat(3);
        System.out.println("return bark from the funtion-->"+d1.returnbarks("woohuu"));
        d1.run();
    }
}
