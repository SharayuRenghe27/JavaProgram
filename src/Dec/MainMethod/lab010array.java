package Dec.MainMethod;

import java.util.Arrays;
import java.util.Scanner;

public class lab010array {
    public static void main(String[] args) {

        int []marks={90, 44, 55, 38, 29, 70, 29};
        System.out.println(marks[0]);
        System.out.println(marks[5]);
//        System.out.println(marks[10]); array out of bound exception
        System.out.println(marks.length);// will include args[0] as 1
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println("------------------------");
        for (int l=0;l<marks.length;l++)
        {
            System.out.println(marks[l]);
        }
        String[] frds=new String[3];
        frds[0]="surabhi";
        frds[1]="sneha";
        frds[2]="madiha";
//        frds[3]="poonam";
        System.out.println(frds[2]);
        int search=Arrays.binarySearch(frds,"sneha");
        System.out.println(search);

        System.out.println("-----------------------");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int []array2=new int[size];
        for (int s=0;s<size;s++){
            System.out.println("Enter the no -");
            array2[s]=sc.nextInt();
        }

        System.out.println("Entered array-->");
        for (int p=0;p<array2.length;p++)
            System.out.print(" "+array2[p]);

        System.out.println("------------------");

        System.out.println("maxi value-->"+givemax(marks));
        System.out.println("min value-->"+givemin(marks));

        for (String name:frds){
            System.out.println(name);
        }



    }
    public static int givemax(int []marks1)
    { int max=marks1[0];
        for(int i=0;i<marks1.length;i++)
            if (marks1[i]>max)
                max=marks1[i];
        return max;

    }
    public static int givemin(int []marks2)
    { int min=marks2[0];
        for(int i=0;i<marks2.length;i++)
            if (marks2[i]<min)
                min=marks2[i];
        return min;

    }
}
