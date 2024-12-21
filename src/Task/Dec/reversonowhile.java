package Task.Dec;

public class reversonowhile {
    public static void main(String[] args) {
        int no=12345;
         int temp=0,reverse=0;

         while (no!=0){
             temp=no%10;
             reverse=reverse*10+temp;

             no=no/10;
         }
        System.out.println(reverse);


    }
}
