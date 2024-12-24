package MastercodingIQ;
public class pyramidpattern {
    public static void main(String[] args) {
        int mid = (5/2);
        int start = mid, end = mid;
        for(int i=0;i<mid+1;i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(start<=j && end >= j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            start = start-1;
            end = end + 1;
            System.out.println();
        }
    }
}

