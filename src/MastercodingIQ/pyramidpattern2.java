package MastercodingIQ;

public class pyramidpattern2 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<=n;i++){

            for (int p=0;p<=n-i;p++){
                System.out.print(" ");

            }
            for (int j=0;j<2*i-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
