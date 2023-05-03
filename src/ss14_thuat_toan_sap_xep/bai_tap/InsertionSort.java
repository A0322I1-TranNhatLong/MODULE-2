package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // Define an integer array to be sorted
        int[] arr = {5, 2, 8, 1, 7};

        // Iterate through the array from index 1
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to
            // one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Set the key value to its final position within the sorted
            // array
            arr[j + 1] = key;

            // Print the current state of the array after each iteration
            System.out.println("Step " + i + ": " + Arrays.toString(arr));
        }
    }
}
