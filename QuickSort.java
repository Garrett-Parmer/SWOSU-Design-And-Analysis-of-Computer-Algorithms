import java.io.*;

public class QuickSort {

    // Utility function that swaps two elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Takes last element as pivot, places the pivot element at its correct position
    // in the sorted array, and places all smaller elements to the left of th
    // epivot, and all greater elements to the right.
    static int partition(int[] arr, int low, int high) {

        // Pivot point
        int pivot = arr[high];

        // Index of the smaller element and indicates the right position of pivot found
        // thus far.
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // Main quicksort function that implements the sort.
    // arr[] -> Array to be sorted
    // low -> starting index
    // high -> end index
    static void sorter(int[] arr, int low, int high) {
        if (low < high) {
            // pi = partitioning index, arr[p]
            int pi = partition(arr, low, high);

            // Separately sort elements before partition and after
            sorter(arr, low, pi - 1);
            sorter(arr, pi + 1, high);

        }
    }
}
