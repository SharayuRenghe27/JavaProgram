package Task.Nov.superkeyabstraction;

public class abclass2 {
    public static void main(String[] args) {
    wagonar wr=new wagonar();
    wr.drive();

    tesla t=new tesla();
    t.drive();
    }

}
class wagonar extends engine{
    void drive(){
        startengine();
        stopengine();
    }

    @Override
    void startengine() {
        System.out.println("Starting car");
    }

    @Override
    void stopengine() {
        System.out.println("Stopping car");

    }
}

abstract class engine{
    abstract void startengine();
    abstract void stopengine();

}
