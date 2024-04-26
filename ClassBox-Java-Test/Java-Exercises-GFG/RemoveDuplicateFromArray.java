import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static int[] removeDuplicates(int[] arr) {
        // Convert array to set to remove duplicates
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        // Convert set back to array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6, 7, 7, 8, 9, 9};

        System.out.println("Original array: " + Arrays.toString(arr));

        // Remove duplicates from the array
        int[] uniqueArray = removeDuplicates(arr);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}

