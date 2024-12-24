package MastercodingIQ;

import java.util.Scanner;

public class rightstarpattern {
    public static void main(String[] args) {
        System.out.println("Enter the size for the star");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for (int i=0;i<size;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
