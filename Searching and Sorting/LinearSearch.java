public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return the index of the target element
            }
        }
        return -1; // return -1 if target not found in the array
    }
}
