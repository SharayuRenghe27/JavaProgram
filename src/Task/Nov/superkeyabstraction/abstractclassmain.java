package Task.Nov.superkeyabstraction;

public class abstractclassmain {
}
class sharayu extends loan{
    @Override
    void loan50k() {
        System.out.println("Giving the loan!!");
    }

    @Override
    void loan30k() {
        System.out.println("30K given!!");
    }
}
abstract class loan{
    abstract void loan50k();
    abstract void loan30k();
    void  loan1L(){
        System.out.println("1L loan is there");
    }
}

