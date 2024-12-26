package Task.Nov.superkeyabstraction;

public class tesla extends engine {
    @Override
    void startengine() {
        System.out.println("starting at the electric engine");
    }

    @Override
    void stopengine() {
        System.out.println("stopping at the electric engine");

    }
    void drive(){
        startengine();
        stopengine();
    }
}
