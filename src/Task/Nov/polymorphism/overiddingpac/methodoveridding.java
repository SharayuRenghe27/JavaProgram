package Task.Nov.polymorphism.overiddingpac;

import Task.Nov.polymorphism.overiddingpac.methodoveridding;

public class methodoveridding {
    public static void main(String[] args) {

child c1=new child();
c1.home();
        System.out.println("calling home method will be decided runtime");
        // Dynamic disptach
        father  ex1=new child(); // here the child obj is getting created thats why it is posssible
        ex1.home();
        //child ex2=new father();----> child cant create father object cause it was not there when the father was born/created
        //ex2.home();--


    }
}
class father{
    void home(){
        System.out.println("Father home");
    }
}
class child extends father{
    @Override
    void home(){
        System.out.println("Child home");
    }
}
