package Task.Nov.arraytask;

import java.util.Arrays;

public class arrayduplicatecount {
    public static void main(String[] args) {
        int[] arr = {1, 12, 2, 3, 3, 3, 44, 4, 4,77};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            // Skip duplicate elements by checking if it's the first occurrence
            if (i == 0 || arr[i] != arr[i - 1]) {
                // Count the frequency of the current element
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                        count++;
                    else
                        break;

                }
                // Print the element and its frequency
                System.out.println("Element: " + arr[i] + " | Frequency: " + count);
            }
        }

    }
}
