public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid; // return the index of the target element
            } else if (arr[mid] < target) {
                low = mid + 1; // discard left half of the array
            } else {
                high = mid - 1; // discard right half of the array
            }
        }

        return -1; // return -1 if target not found in the array
    }
}
