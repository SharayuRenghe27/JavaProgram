package Task.Oct;

import java.util.Arrays;


public class arrayduplicates {
    public static void main(String[] args) {
        int []array1={22,89,33,67,33,22,77};
        for (int p=0;p<array1.length;p++)
            System.out.print(" "+array1[p]);
        Arrays.sort(array1);
        System.out.println("\n Below are duplicates value---->");

        for (int i=0;i<array1.length;i++){
           for (int j=i+1;j<(array1.length);j++){
             if(array1[i]==array1[j]) {
                 System.out.println (array1[j]+" ");

             }
             }
            }



        }



    }

//}
