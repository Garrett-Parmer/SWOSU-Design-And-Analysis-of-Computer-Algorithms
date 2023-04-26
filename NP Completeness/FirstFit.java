import java.util.*;
import java.time.*;

public class FirstFit {
    public static void main(String[] args) {
        Instant firstStart = Instant.now();
        int[] items = arrayBuild(10000); // Example item sizes
        int binCapacity = 100; // Example bin capacity
        List<Integer> bins = firstFit(items, binCapacity);

        System.out.println("First Fit Bin Packing:");
        for (int i = 0; i < bins.size(); i++) {
            System.out.println("Bin " + (i + 1) + ": " + bins.get(i));
        }
        Instant firstStop = Instant.now();
        long firstTimeElapsed = Duration.between(firstStart, firstStop).toMillis();
        System.out.println(
                "The first fit algorithm took " + firstTimeElapsed + " milliseconds to solve the bin packing problem.");
    }

    public static List<Integer> firstFit(int[] items, int binCapacity) {
        List<Integer> bins = new ArrayList<>();
        for (int item : items) {
            boolean itemPlaced = false;
            for (int i = 0; i < bins.size(); i++) {
                int currentBin = bins.get(i);
                if (currentBin + item <= binCapacity) {
                    bins.set(i, currentBin + item);
                    itemPlaced = true;
                    break;
                }
            }
            if (!itemPlaced) {
                bins.add(item);
            }
        }
        return bins;
    }

    static int[] arrayBuild(int x) {
        Random rndnumb = new Random();
        int[] arr = new int[x];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndnumb.nextInt(50);
            if (arr[i] == 0) {
                arr[i] = 1;
            }
        }

        return arr;

    }
}
