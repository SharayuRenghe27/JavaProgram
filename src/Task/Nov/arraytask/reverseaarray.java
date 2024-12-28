package Task.Nov.arraytask;

public class reverseaarray {
    public static void main(String[] args) {

        int []array1={89,33,2,4,2,5,6,11,11,22,3,2,2};
        System.out.print("Given array-->");

        for(int i=0;i<array1.length;i++)
        {
            System.out.printf(" "+array1[i]);
        }
        System.out.println("\n");
        System.out.print("Reverse array-->");

        for(int i=array1.length-1;i>=0;i--)
        {
            System.out.printf(" "+array1[i]);
        }




    }
}
