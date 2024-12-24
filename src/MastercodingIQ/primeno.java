package MastercodingIQ;

public class primeno {
    public static void main(String[] args) {
    int num=3;
        System.out.println("Check if the num is prime-->"+num);
        boolean result=isprime(num);
        if (result==true)
            System.out.println("It's a prime no");
        else
            System.out.println("It's not a prime no");
    }
    public static boolean isprime(int n){
        if (n<=1)
            return false;

        for (int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;

        return true;
    }
}

