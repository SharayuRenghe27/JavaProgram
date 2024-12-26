package Task.Nov.superkeyabstraction;

public class Super {
    public static void main(String[] args) {
        car c=new car();

    }
}
class car extends vehicle{
    private int maxspeed=281;
    car(){
//        super();
        super(10);
        System.out.println("DC car");
        System.out.println(this.maxspeed);
        System.out.println(super.maxspeed);
        this.display();
        super.display();
    }

    @Override
    void display() {
        super.display();
    }
}
class vehicle{

    public int maxspeed=180;
    void display(){
        System.out.println("Parent");
    }
    vehicle(){
        System.out.println("DC-vehicle");
    }
    vehicle (int a){
        System.out.println("PC vehicle");

    }
    void message(){
        System.out.println("Hello vehicle");
    }
    void message(int a){
        System.out.println("Hello vehicle");
    }
}
