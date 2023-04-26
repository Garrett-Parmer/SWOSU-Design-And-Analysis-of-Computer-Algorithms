import java.util.*;
import java.time.*;

public class BestFit {
    public static void main(String[] args) {
        Instant bestStart = Instant.now();
        int[] items = arrayBuild(10000);
        int binCapacity = 100;

        List<List<Integer>> bins = bestFit(items, binCapacity);

        System.out.println("Best Fit Bin Packing:");
        for (int i = 0; i < bins.size(); i++) {
            System.out.println("Bin " + (i + 1) + ": " + bins.get(i));
        }
        Instant bestStop = Instant.now();
        long bestTimeElapsed = Duration.between(bestStart, bestStop).toMillis();
        System.out.println("Time elapsed for Best Fit algorithm to solve the bin packing algorithm was "
                + bestTimeElapsed + " milliseconds.");
    }

    public static List<List<Integer>> bestFit(int[] items, int binCapacity) {
        Arrays.sort(items); // sort the items in non-increasing order

        List<List<Integer>> bins = new ArrayList<>();
        bins.add(new ArrayList<>()); // add the first bin

        // iterate over the items
        for (int i = 0; i < items.length; i++) {
            boolean added = false;

            // try to add the item to the fullest bin that still has room
            for (int j = 0; j < bins.size(); j++) {
                List<Integer> bin = bins.get(j);
                int freeSpace = binCapacity - sum(bin);
                if (items[i] <= freeSpace) {
                    bin.add(items[i]);
                    added = true;
                    break;
                }
            }

            // if the item doesn't fit in any existing bin, create a new bin
            if (!added) {
                List<Integer> newBin = new ArrayList<>();
                newBin.add(items[i]);
                bins.add(newBin);
            }
        }

        return bins;
    }

    private static int sum(List<Integer> list) {
        int sum = 0;
        for (int n : list) {
            sum += n;
        }
        return sum;
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
