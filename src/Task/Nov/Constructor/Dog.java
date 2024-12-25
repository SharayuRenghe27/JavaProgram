package Task.Nov.Constructor;

public class Dog {
    int nose=1;
    double ears=2;
    String bark="Bowbow";

    public void eat (int e1)
    {
        System.out.printf("Eats %d a day",e1);
    }
    public void run()
    {
        System.out.println("Runs like a horse ");
    }
    public String returnbarks(String b1)
    {
        System.out.println("\nGiven bark-->"+b1);
        String s2="Baoooooowwww";
        return s2;
    }
}
