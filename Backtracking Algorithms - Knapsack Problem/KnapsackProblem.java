import java.time.*;
import java.util.Random;

public class KnapsackProblem {
    public static void main(String[] args) {
        int[] weights = arrayBuild(10000000);
        int[] values = arrayBuild(weights.length);
        // printArray(weights);
        int n = values.length;
        int W = 100;
        // Item[] items = itemGen();

        // Begin Backtracking algorithm testing
        Instant backStart = Instant.now();
        System.out.print("The maximum value of a knapsack with " + W + " capacity, is ");
        BackKnapsack.knapSack(W, weights, values, n);
        Instant backStop = Instant.now();
        long backTimeElapsed = Duration.between(backStart, backStop).toMillis();
        System.out.println("It took " + backTimeElapsed
                + " milliseconds to solve the knapsack problem with the backtracking algorithm.");

        weights = arrayBuild(10000000);
        values = arrayBuild(weights.length);
        backStart = Instant.now();
        System.out.print("The maximum value of a knapsack with " + W + " capacity, is ");
        BackKnapsack.knapSack(W, weights, values, n);
        backStop = Instant.now();
        backTimeElapsed = Duration.between(backStart, backStop).toMillis();
        System.out.println("It took " + backTimeElapsed
                + " milliseconds to solve the knapsack problem with the backtracking algorithm.");

        weights = arrayBuild(10000000);
        values = arrayBuild(weights.length);
        backStart = Instant.now();
        System.out.print("The maximum value of a knapsack with " + W + " capacity, is ");
        BackKnapsack.knapSack(W, weights, values, n);
        backStop = Instant.now();
        backTimeElapsed = Duration.between(backStart, backStop).toMillis();
        System.out.println("It took " + backTimeElapsed
                + " milliseconds to solve the knapsack problem with the backtracking algorithm.");

        weights = arrayBuild(10000000);
        values = arrayBuild(weights.length);
        backStart = Instant.now();
        System.out.print("The maximum value of a knapsack with " + W + " capacity, is ");
        BackKnapsack.knapSack(W, weights, values, n);
        backStop = Instant.now();
        backTimeElapsed = Duration.between(backStart, backStop).toMillis();
        System.out.println("It took " + backTimeElapsed
                + " milliseconds to solve the knapsack problem with the backtracking algorithm.");

        weights = arrayBuild(10000000);
        values = arrayBuild(weights.length);
        backStart = Instant.now();
        System.out.print("The maximum value of a knapsack with " + W + " capacity, is ");
        BackKnapsack.knapSack(W, weights, values, n);
        backStop = Instant.now();
        backTimeElapsed = Duration.between(backStart, backStop).toMillis();
        System.out.println("It took " + backTimeElapsed
                + " milliseconds to solve the knapsack problem with the backtracking algorithm.");

        weights = arrayBuild(10000000);
        values = arrayBuild(weights.length);
        backStart = Instant.now();
        System.out.print("The maximum value of a knapsack with " + W + " capacity, is ");
        BackKnapsack.knapSack(W, weights, values, n);
        backStop = Instant.now();
        backTimeElapsed = Duration.between(backStart, backStop).toMillis();
        System.out.println("It took " + backTimeElapsed
                + " milliseconds to solve the knapsack problem with the backtracking algorithm.");

        // End of Backtrack Testing

        // Start of Dynamic Testing

        Instant dynStart = Instant.now();
        System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                + DynamicKnapsack.knapsackDyn(W, weights, values, n));
        Instant dynStop = Instant.now();
        long dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
        System.out.println(
                "It took " + dynTimeElapsed
                        + " milliseconds to reach this conclusion with the dynamic algorithm.");

        values = arrayBuild(10000000);
        weights = arrayBuild(10000000);
        dynStart = Instant.now();
        System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                + DynamicKnapsack.knapsackDyn(W, weights, values, n));
        dynStop = Instant.now();
        dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
        System.out.println(
                "It took " + dynTimeElapsed
                        + " milliseconds to reach this conclusion with the dynamic algorithm.");

        values = arrayBuild(10000000);
        weights = arrayBuild(10000000);
        dynStart = Instant.now();
        System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                + DynamicKnapsack.knapsackDyn(W, weights, values, n));
        dynStop = Instant.now();
        dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
        System.out.println(
                "It took " + dynTimeElapsed
                        + " milliseconds to reach this conclusion with the dynamic algorithm.");

        values = arrayBuild(10000000);
        weights = arrayBuild(10000000);
        dynStart = Instant.now();
        System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                + DynamicKnapsack.knapsackDyn(W, weights, values, n));
        dynStop = Instant.now();
        dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
        System.out.println(
                "It took " + dynTimeElapsed
                        + " milliseconds to reach this conclusion with the dynamic algorithm.");

        values = arrayBuild(10000000);
        weights = arrayBuild(10000000);
        dynStart = Instant.now();
        System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                + DynamicKnapsack.knapsackDyn(W, weights, values, n));
        dynStop = Instant.now();
        dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
        System.out.println(
                "It took " + dynTimeElapsed
                        + " milliseconds to reach this conclusion with the dynamic algorithm.");

        values = arrayBuild(10000000);
        weights = arrayBuild(10000000);
        dynStart = Instant.now();
        System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                + DynamicKnapsack.knapsackDyn(W, weights, values, n));
        dynStop = Instant.now();
        dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
        System.out.println(
                "It took " + dynTimeElapsed
                        + " milliseconds to reach this conclusion with the dynamic algorithm.");
    }

    // Array Builder
    static int[] arrayBuild(int x) {
        Random rndnumb = new Random();
        int[] arr = new int[x];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndnumb.nextInt(10000);
            if (arr[i] == 0) {
                arr[i] = 1;
            }
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
