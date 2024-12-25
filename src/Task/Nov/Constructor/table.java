package Task.Nov.Constructor;

public class table{

    int leg1=9;
    String material1="wood";

    table(int leg, String material) {
        this.leg1 = leg;
        this.material1 = material;
    }
    table(int leg) {
        this.leg1 = leg;
    }
    public void detailsdisplay1(){
        System.out.println("Details--->"+leg1);

    }
   public void detailsdisplay2(){
       System.out.println("Details--->"+leg1+"-->"+material1);

    }


}
