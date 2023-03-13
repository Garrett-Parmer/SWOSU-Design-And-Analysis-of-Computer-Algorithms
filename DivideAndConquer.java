import java.util.Random;
import java.time.*;

class DivideAndConquer {

    public static void main(String[] args) {

        // Build array
        int[] arr1 = arrayBuild(10);
        int n = arr1.length;
        Instant quickStart = Instant.now();
        // Quicksort call for first array
        QuickSort.sorter(arr1, 0, n - 1);
        Instant quickFinish = Instant.now();

        // Print sorted array from QuickSort
        System.out.println("QuickSort Sorted array: ");
        printArray(arr1, n);
        long quickTimeElapsed = Duration.between(quickStart, quickFinish).toMillis();
        System.out.println("Time elapsed for Quick Sort: " + quickTimeElapsed + "ms");

        // Build array
        arr1 = arrayBuild(100);
        n = arr1.length;
        quickStart = Instant.now();
        // Quicksort call for first array
        QuickSort.sorter(arr1, 0, n - 1);
        quickFinish = Instant.now();

        // Print sorted array from QuickSort
        System.out.println("QuickSort Sorted array: ");
        // printArray(arr1, n);
        quickTimeElapsed = Duration.between(quickStart, quickFinish).toMillis();
        System.out.println("Time elapsed for Quick Sort: " + quickTimeElapsed + "ms");

        // Build array
        arr1 = arrayBuild(1000);
        n = arr1.length;
        quickStart = Instant.now();
        // Quicksort call for first array
        QuickSort.sorter(arr1, 0, n - 1);
        quickFinish = Instant.now();

        // Print sorted array from QuickSort
        System.out.println("QuickSort Sorted array: ");
        // printArray(arr1, n);
        quickTimeElapsed = Duration.between(quickStart, quickFinish).toMillis();
        System.out.println("Time elapsed for Quick Sort: " + quickTimeElapsed + "ms");

        // Build array
        arr1 = arrayBuild(10000);
        n = arr1.length;
        quickStart = Instant.now();
        // Quicksort call for first array
        QuickSort.sorter(arr1, 0, n - 1);
        quickFinish = Instant.now();

        // Print sorted array from QuickSort
        System.out.println("QuickSort Sorted array: ");
        // printArray(arr1, n);
        quickTimeElapsed = Duration.between(quickStart, quickFinish).toMillis();
        System.out.println("Time elapsed for Quick Sort: " + quickTimeElapsed + "ms");

        // Build array
        arr1 = arrayBuild(100000);
        n = arr1.length;
        quickStart = Instant.now();
        // Quicksort call for first array
        QuickSort.sorter(arr1, 0, n - 1);
        quickFinish = Instant.now();

        // Print sorted array from QuickSort
        System.out.println("QuickSort Sorted array: ");
        // printArray(arr1, n);
        quickTimeElapsed = Duration.between(quickStart, quickFinish).toMillis();
        System.out.println("Time elapsed for Quick Sort: " + quickTimeElapsed + "ms");

        // Build array
        arr1 = arrayBuild(1000000);
        n = arr1.length;
        quickStart = Instant.now();
        // Quicksort call for first array
        QuickSort.sorter(arr1, 0, n - 1);
        quickFinish = Instant.now();

        // Print sorted array from QuickSort
        System.out.println("QuickSort Sorted array: ");
        // printArray(arr1, n);
        quickTimeElapsed = Duration.between(quickStart, quickFinish).toMillis();
        System.out.println("Time elapsed for Quick Sort: " + quickTimeElapsed + "ms");

        // Build array
        arr1 = arrayBuild(10000000);
        n = arr1.length;
        quickStart = Instant.now();
        // Quicksort call for first array
        QuickSort.sorter(arr1, 0, n - 1);
        quickFinish = Instant.now();

        // Print sorted array from QuickSort
        System.out.println("QuickSort Sorted array: ");
        // printArray(arr1, n);
        quickTimeElapsed = Duration.between(quickStart, quickFinish).toMillis();
        System.out.println("Time elapsed for Quick Sort: " + quickTimeElapsed + "ms");

        // Build array
        arr1 = arrayBuild(100000000);
        n = arr1.length;
        quickStart = Instant.now();
        // Quicksort call for first array
        QuickSort.sorter(arr1, 0, n - 1);
        quickFinish = Instant.now();

        // Print sorted array from QuickSort
        System.out.println("QuickSort Sorted array: ");
        // printArray(arr1, n);
        quickTimeElapsed = Duration.between(quickStart, quickFinish).toMillis();
        System.out.println("Time elapsed for Quick Sort: " + quickTimeElapsed + "ms");

        // MERGE SORTS START HERE

        // Build second array
        int[] arr2 = arrayBuild(10);
        int o = arr2.length;

        Instant mergeStart = Instant.now();
        // Merge sort call for second array
        MergeSort.sort(arr2, 0, o - 1);

        Instant mergeFinish = Instant.now();

        // Print sorted array from MergeSort
        System.out.println("MergeSort Sorted array: ");
        // printArray(arr2, o);
        long mergeTimeElapsed = Duration.between(mergeStart, mergeFinish).toMillis();
        System.out.println("Time elapsed for Merge Sort: " + mergeTimeElapsed + "ms");

        // Build second array
        arr2 = arrayBuild(100);
        o = arr2.length;

        mergeStart = Instant.now();
        // Merge sort call for second array
        MergeSort.sort(arr2, 0, o - 1);

        mergeFinish = Instant.now();

        // Print sorted array from MergeSort
        System.out.println("MergeSort Sorted array: ");
        // printArray(arr2, o);
        mergeTimeElapsed = Duration.between(mergeStart, mergeFinish).toMillis();
        System.out.println("Time elapsed for Merge Sort: " + mergeTimeElapsed + "ms");

        // Build second array
        arr2 = arrayBuild(1000);
        o = arr2.length;

        mergeStart = Instant.now();
        // Merge sort call for second array
        MergeSort.sort(arr2, 0, o - 1);

        mergeFinish = Instant.now();

        // Print sorted array from MergeSort
        System.out.println("MergeSort Sorted array: ");
        // printArray(arr2, o);
        mergeTimeElapsed = Duration.between(mergeStart, mergeFinish).toMillis();
        System.out.println("Time elapsed for Merge Sort: " + mergeTimeElapsed + "ms");

        // Build second array
        arr2 = arrayBuild(10000);
        o = arr2.length;

        mergeStart = Instant.now();
        // Merge sort call for second array
        MergeSort.sort(arr2, 0, o - 1);

        mergeFinish = Instant.now();

        // Print sorted array from MergeSort
        System.out.println("MergeSort Sorted array: ");
        // printArray(arr2, o);
        mergeTimeElapsed = Duration.between(mergeStart, mergeFinish).toMillis();
        System.out.println("Time elapsed for Merge Sort: " + mergeTimeElapsed + "ms");

        // Build second array
        arr2 = arrayBuild(100000);
        o = arr2.length;

        mergeStart = Instant.now();
        // Merge sort call for second array
        MergeSort.sort(arr2, 0, o - 1);

        mergeFinish = Instant.now();

        // Print sorted array from MergeSort
        System.out.println("MergeSort Sorted array: ");
        // printArray(arr2, o);
        mergeTimeElapsed = Duration.between(mergeStart, mergeFinish).toMillis();
        System.out.println("Time elapsed for Merge Sort: " + mergeTimeElapsed + "ms");

        // Build second array
        arr2 = arrayBuild(1000000);
        o = arr2.length;

        mergeStart = Instant.now();
        // Merge sort call for second array
        MergeSort.sort(arr2, 0, o - 1);

        mergeFinish = Instant.now();

        // Print sorted array from MergeSort
        System.out.println("MergeSort Sorted array: ");
        // printArray(arr2, o);
        mergeTimeElapsed = Duration.between(mergeStart, mergeFinish).toMillis();
        System.out.println("Time elapsed for Merge Sort: " + mergeTimeElapsed + "ms");

        // Build second array
        arr2 = arrayBuild(10000000);
        o = arr2.length;

        mergeStart = Instant.now();
        // Merge sort call for second array
        MergeSort.sort(arr2, 0, o - 1);

        mergeFinish = Instant.now();

        // Print sorted array from MergeSort
        System.out.println("MergeSort Sorted array: ");
        // printArray(arr2, o);
        mergeTimeElapsed = Duration.between(mergeStart, mergeFinish).toMillis();
        System.out.println("Time elapsed for Merge Sort: " + mergeTimeElapsed + "ms");

        // Build second array
        arr2 = arrayBuild(100000000);
        o = arr2.length;

        mergeStart = Instant.now();
        // Merge sort call for second array
        MergeSort.sort(arr2, 0, o - 1);

        mergeFinish = Instant.now();

        // Print sorted array from MergeSort
        System.out.println("MergeSort Sorted array: ");
        // printArray(arr2, o);
        mergeTimeElapsed = Duration.between(mergeStart, mergeFinish).toMillis();
        System.out.println("Time elapsed for Merge Sort: " + mergeTimeElapsed + "ms");
    }

    // Array Builder
    static int[] arrayBuild(int x) {
        Random rndnumb = new Random();
        int[] arr = new int[x];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndnumb.nextInt(214748364);
        }

        return arr;
    }

    // array print
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}