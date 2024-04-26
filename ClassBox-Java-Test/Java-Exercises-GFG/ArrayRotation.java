import java.util.Arrays;

public class ArrayRotation {
    // Function to rotate an array to the left by d positions
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        reverseArray(arr, 0, d - 1); // Reverse the first d elements
        reverseArray(arr, d, n - 1); // Reverse the remaining elements
        reverseArray(arr, 0, n - 1); // Reverse the entire array
    }

    // Function to reverse an array or a part of it
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        System.out.println("Original array: " + Arrays.toString(arr));

        // Rotate the array
        leftRotate(arr, d);

        System.out.println("Array after rotating by " + d + " positions to the left: " + Arrays.toString(arr));
    }
}

