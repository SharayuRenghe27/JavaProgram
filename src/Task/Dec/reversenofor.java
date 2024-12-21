package Task.Dec;

public class reversenofor {
    public static void main(String[] args) {
        int no1=12345;
        int revno=0;
        for(int i=1;i<6;i++)
        {
            int temp=no1%10;
            no1=no1/10;
            revno=revno*10+temp;
        }
        System.out.println(revno);
    }
}
