package MastercodingIQ;

import java.util.Scanner;

public class leftstarpattern {
    public static void main(String[] args) {
        System.out.println("Add the no for the start left pattern1 ->");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for (int i=0;i<size;i++) {
            for (int j=i;j<size;j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
