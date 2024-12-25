package Task.Oct;

import java.util.Arrays;
import java.util.Scanner;

public class binaryserachinarray {
    public static void main(String[] args) {
//        Binary search is an efficient algorithm for finding an element in a sorted array or list.
//        It works by repeatedly dividing the search interval in half
//        Start with two pointers: one at the beginning (low) and one at the end (high) of the array.
//        Find the middle element: mid = (low + high) / 2.
//        If the target element is equal to the middle element, you've found it!
//        If the target is smaller, search the left half: set high = mid - 1.
//        If the target is larger, search the right half: set low = mid + 1.
//        Repeat steps 2-5 until the target is found or the low pointer exceeds the high pointer, meaning the element is not present.


        int []arr1={78,45,33,90,21};
        for (int i=0;i<arr1.length;i++)
            System.out.print(" "+arr1[i]);
        System.out.println("  serach-->"+Arrays.binarySearch(arr1,33));

        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter the size");
        int size=sc.nextInt();
        String []arr2=new String[size];
        for (int j=0;j<size;j++)
        {
            System.out.println("Enter the name-->");
            arr2[j]=sc.next();
        }
        System.out.println("Serch for ?");
        String s1=sc.next();
        System.out.println(Arrays.binarySearch(arr2,s1));


    }
}
