import java.util.*;
import java.time.*;

public class WorstCaseComparison {
    public static void main(String[] args) {
        System.out.println(
                "This program tests the worst case time complexities of linear search, binary search, bubble sort, and merge sort.");

        System.out.println(
                "Linear search worst case, O(n). We'll display this by having it search for something that is not in the list.");
        int[] arr = arrayBuild(200000000);
        Instant linearStart = Instant.now();
        System.out.println("Linear search found its target at index: " + LinearSearch.linearSearch(arr, 2023));
        Instant linearStop = Instant.now();
        long linearTimeElapsed = Duration.between(linearStart, linearStop).toMillis();
        System.out.println("It took " + linearTimeElapsed + " milliseconds to complete the search.");

        System.out.println(
                "\nThe binary search worst case is, O(log n). We'll display this by having it search for something that is not in the list.");
        Instant binaryStart = Instant.now();
        System.out.println("Binary search found its target at index: " + BinarySearch.binarySearch(arr, 2023));
        Instant binaryStop = Instant.now();
        long binaryTimeElapsed = Duration.between(binaryStart, binaryStop).toMillis();
        System.out.println("It took the binary search " + binaryTimeElapsed + " milliseconds to complete the search.");

        System.out.println(
                "\nThe bubble sort's worst case scenario occurs when the smallest element is in the last position, and is O(n^2). We'll demonstrate this by adding a zero at the end of the array.");
        arr = arrayBuild(40000);
        arr[arr.length - 1] = 0;
        Instant bubbleStart = Instant.now();
        BubbleSort.bubbleSort(arr);
        Instant bubbleStop = Instant.now();
        long bubbleTimeElapsed = Duration.between(bubbleStart, bubbleStop).toMillis();
        System.out.println("It took Bubble Sort " + bubbleTimeElapsed + " milliseconds to completely sort the array.");

        System.out.println(
                "\nMerge sort, in comparison to other sorting methods is stable, and has an average, worst, and best case time complexity of O(n log n). We'll generate a new array of the same size and have it sort it.");
        arr = arrayBuild(40000);
        Instant mergeStart = Instant.now();
        int o = arr.length;
        MergeSort.sort(arr, 0, o - 1);
        Instant mergeStop = Instant.now();
        long mergeTimeElapsed = Duration.between(mergeStart, mergeStop).toMillis();
        System.out.println("It took Merge Sort " + mergeTimeElapsed + " milliseconds to completely sort the array.");

    }

    static int[] arrayBuild(int x) {
        Random rndnumb = new Random();
        int[] arr = new int[x];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndnumb.nextInt(1000);
            if (arr[i] == 0) {
                arr[i] = 1;
            }
        }

        return arr;

    }
}
