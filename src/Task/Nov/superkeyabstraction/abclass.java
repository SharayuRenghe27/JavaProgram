package Task.Nov.superkeyabstraction;

public class abclass {
    public static void main(String[] args) {
        child c=new child();
        c.loan50k();
        c.loan25k();
    }
}
class child extends father{
    @Override
    void loan50k() {
        System.out.println("Child giving 50k loan ");
    }
}
abstract class father{
    abstract void loan50k();
void loan25k(){
    System.out.println("Done by father");
}
}
