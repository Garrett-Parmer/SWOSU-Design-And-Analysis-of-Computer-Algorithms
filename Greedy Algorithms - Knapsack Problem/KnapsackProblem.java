import java.time.*;
import java.util.Random;

public class KnapsackProblem {
        public static void main(String[] args) {
                int wt[] = arrayBuild(10000000);
                int val[] = arrayBuild(wt.length);
                int W = 100;
                int n = val.length;

                Item[] items = greedyGen();

                // Begin Greedy Calls
                Instant greedyStart = Instant.now();
                System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                                + GreedyKnapsack.knapsackGreed(W, items, n));
                Instant greedyStop = Instant.now();
                long greedyTimeElapsed = Duration.between(greedyStart, greedyStop).toMillis();
                System.out.println(
                                "It took " + greedyTimeElapsed
                                                + " milliseconds to reach this conclusion with the greedy algorithm.");

                items = greedyGen();
                greedyStart = Instant.now();
                System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                                + GreedyKnapsack.knapsackGreed(W, items, n));
                greedyStop = Instant.now();
                greedyTimeElapsed = Duration.between(greedyStart, greedyStop).toMillis();
                System.out.println(
                                "It took " + greedyTimeElapsed
                                                + " milliseconds to reach this conclusion with the greedy algorithm.");

                items = greedyGen();
                greedyStart = Instant.now();
                System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                                + GreedyKnapsack.knapsackGreed(W, items, n));
                greedyStop = Instant.now();
                greedyTimeElapsed = Duration.between(greedyStart, greedyStop).toMillis();
                System.out.println(
                                "It took " + greedyTimeElapsed
                                                + " milliseconds to reach this conclusion with the greedy algorithm.");

                items = greedyGen();
                greedyStart = Instant.now();
                System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                                + GreedyKnapsack.knapsackGreed(W, items, n));
                greedyStop = Instant.now();
                greedyTimeElapsed = Duration.between(greedyStart, greedyStop).toMillis();
                System.out.println(
                                "It took " + greedyTimeElapsed
                                                + " milliseconds to reach this conclusion with the greedy algorithm.");

                items = greedyGen();
                greedyStart = Instant.now();
                System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                                + GreedyKnapsack.knapsackGreed(W, items, n));
                greedyStop = Instant.now();
                greedyTimeElapsed = Duration.between(greedyStart, greedyStop).toMillis();
                System.out.println(
                                "It took " + greedyTimeElapsed
                                                + " milliseconds to reach this conclusion with the greedy algorithm.");

                items = greedyGen();
                greedyStart = Instant.now();
                System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                                + GreedyKnapsack.knapsackGreed(W, items, n));
                greedyStop = Instant.now();
                greedyTimeElapsed = Duration.between(greedyStart, greedyStop).toMillis();
                System.out.println(
                                "It took " + greedyTimeElapsed
                                                + " milliseconds to reach this conclusion with the greedy algorithm.");

                // End of Greedy Testing.

                // Dynamic Programming testing begins
                Instant dynStart = Instant.now();
                System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                                + DynamicKnapsack.knapsackDyn(W, wt, val, n));
                Instant dynStop = Instant.now();
                long dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
                System.out.println(
                                "It took " + dynTimeElapsed
                                                + " milliseconds to reach this conclusion with the dynamic programming algorithm.");

                val = arrayBuild(10000000);
                wt = arrayBuild(10000000);
                dynStart = Instant.now();
                System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                                + DynamicKnapsack.knapsackDyn(W, wt, val, n));
                dynStop = Instant.now();
                dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
                System.out.println(
                                "It took " + dynTimeElapsed
                                                + " milliseconds to reach this conclusion with the dynamic programming algorithm.");

                val = arrayBuild(10000000);
                wt = arrayBuild(10000000);
                dynStart = Instant.now();
                System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                                + DynamicKnapsack.knapsackDyn(W, wt, val, n));
                dynStop = Instant.now();
                dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
                System.out.println(
                                "It took " + dynTimeElapsed
                                                + " milliseconds to reach this conclusion with the dynamic programming algorithm.");

                val = arrayBuild(10000000);
                wt = arrayBuild(10000000);
                dynStart = Instant.now();
                System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                                + DynamicKnapsack.knapsackDyn(W, wt, val, n));
                dynStop = Instant.now();
                dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
                System.out.println(
                                "It took " + dynTimeElapsed
                                                + " milliseconds to reach this conclusion with the dynamic programming algorithm.");

                val = arrayBuild(10000000);
                wt = arrayBuild(10000000);
                dynStart = Instant.now();
                System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                                + DynamicKnapsack.knapsackDyn(W, wt, val, n));
                dynStop = Instant.now();
                dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
                System.out.println(
                                "It took " + dynTimeElapsed
                                                + " milliseconds to reach this conclusion with the dynamic programming algorithm.");

                val = arrayBuild(10000000);
                wt = arrayBuild(10000000);
                dynStart = Instant.now();
                System.out.println("The final weight of a knapsack with " + W + " capacity, is "
                                + DynamicKnapsack.knapsackDyn(W, wt, val, n));
                dynStop = Instant.now();
                dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
                System.out.println(
                                "It took " + dynTimeElapsed
                                                + " milliseconds to reach this conclusion with the dynamic programming algorithm.");
        }

        // Array Builder
        static int[] arrayBuild(int x) {
                Random rndnumb = new Random();
                int[] arr = new int[x];

                for (int i = 0; i < arr.length; i++) {
                        arr[i] = rndnumb.nextInt(100);
                        if (arr[i] == 0) {
                                arr[i] = 1;
                        }
                }

                return arr;
        }

        static Item[] greedyGen() {
                int numItems = 5000000; // Number of items to generate
                int maxWeight = 100; // Maximum weight of an item
                int maxValue = 100; // Maximum value of an item
                Random rand = new Random(); // Random number generator

                // Create an array of items with random weights and values
                Item[] items = new Item[numItems];
                for (int i = 0; i < numItems; i++) {
                        int weight = rand.nextInt(maxWeight) + 1;
                        int value = rand.nextInt(maxValue) + 1;
                        items[i] = new Item(value, weight);
                }

                // Print the generated items to the console
                // for (Item item : items) {
                // System.out.println("Value: " + item.value + ", Weight: " + item.weight);
                // }

                return items;
        }
}
