import java.time.*;
import java.util.*;

public class BranchAndBound {
        public static void main(String[] args) {
                Item[] items = itemGen();
                int capacity = 500;
                // Start of Best First algorithm testing

                Instant bestStart = Instant.now();
                System.out.println("Maximum profit with a knapsack of " + capacity + " capacity, is "
                                + BestFirst.bestFirstKnapsack(capacity, items));
                Instant bestStop = Instant.now();
                long bestTimeElapsed = Duration.between(bestStart, bestStop).toMillis();
                System.out.println("This conclusion was reached in " + bestTimeElapsed
                                + " milliseconds by using the Best First Branch and Bound algorithm.");

                items = itemGen();
                bestStart = Instant.now();
                System.out.println("Maximum profit with a knapsack of " + capacity + " capacity, is "
                                + BestFirst.bestFirstKnapsack(capacity, items));
                bestStop = Instant.now();
                bestTimeElapsed = Duration.between(bestStart, bestStop).toMillis();
                System.out.println("This conclusion was reached in " + bestTimeElapsed
                                + " milliseconds by using the Best First Branch and Bound algorithm.");

                items = itemGen();
                bestStart = Instant.now();
                System.out.println("Maximum profit with a knapsack of " + capacity + " capacity, is "
                                + BestFirst.bestFirstKnapsack(capacity, items));
                bestStop = Instant.now();
                bestTimeElapsed = Duration.between(bestStart, bestStop).toMillis();
                System.out.println("This conclusion was reached in " + bestTimeElapsed
                                + " milliseconds by using the Best First Branch and Bound algorithm.");

                items = itemGen();
                bestStart = Instant.now();
                System.out.println("Maximum profit with a knapsack of " + capacity + " capacity, is "
                                + BestFirst.bestFirstKnapsack(capacity, items));
                bestStop = Instant.now();
                bestTimeElapsed = Duration.between(bestStart, bestStop).toMillis();
                System.out.println("This conclusion was reached in " + bestTimeElapsed
                                + " milliseconds by using the Best First Branch and Bound algorithm.");

                items = itemGen();
                bestStart = Instant.now();
                System.out.println("Maximum profit with a knapsack of " + capacity + " capacity, is "
                                + BestFirst.bestFirstKnapsack(capacity, items));
                bestStop = Instant.now();
                bestTimeElapsed = Duration.between(bestStart, bestStop).toMillis();
                System.out.println("This conclusion was reached in " + bestTimeElapsed
                                + " milliseconds by using the Best First Branch and Bound algorithm.");

                items = itemGen();
                bestStart = Instant.now();
                System.out.println("Maximum profit with a knapsack of " + capacity + " capacity, is "
                                + BestFirst.bestFirstKnapsack(capacity, items));
                bestStop = Instant.now();
                bestTimeElapsed = Duration.between(bestStart, bestStop).toMillis();
                System.out.println("This conclusion was reached in " + bestTimeElapsed
                                + " milliseconds by using the Best First Branch and Bound algorithm.");

                // End of Best First Testing

                // Start of Depth First Testing

                items = itemGen();
                Instant depthStart = Instant.now();
                System.out.println("Maximum profit with a knapsack of " + capacity + " capacity, is "
                                + DepthFirst.depthFirstKnapsack(capacity, items));
                Instant depthStop = Instant.now();
                long depthTimeElapsed = Duration.between(depthStart, depthStop).toMillis();
                System.out.println("This conclusion was reached in " + depthTimeElapsed
                                + " milliseconds by using the Depth Branch and Bound algorithm.");

                items = itemGen();
                depthStart = Instant.now();
                System.out.println("Maximum profit with a knapsack of " + capacity + " capacity, is "
                                + DepthFirst.depthFirstKnapsack(capacity, items));
                depthStop = Instant.now();
                depthTimeElapsed = Duration.between(depthStart, depthStop).toMillis();
                System.out.println("This conclusion was reached in " + depthTimeElapsed
                                + " milliseconds by using the Depth Branch and Bound algorithm.");

                items = itemGen();
                depthStart = Instant.now();
                System.out.println("Maximum profit with a knapsack of " + capacity + " capacity, is "
                                + DepthFirst.depthFirstKnapsack(capacity, items));
                depthStop = Instant.now();
                depthTimeElapsed = Duration.between(depthStart, depthStop).toMillis();
                System.out.println("This conclusion was reached in " + depthTimeElapsed
                                + " milliseconds by using the Depth Branch and Bound algorithm.");

                items = itemGen();
                depthStart = Instant.now();
                System.out.println("Maximum profit with a knapsack of " + capacity + " capacity, is "
                                + DepthFirst.depthFirstKnapsack(capacity, items));
                depthStop = Instant.now();
                depthTimeElapsed = Duration.between(depthStart, depthStop).toMillis();
                System.out.println("This conclusion was reached in " + depthTimeElapsed
                                + " milliseconds by using the Depth Branch and Bound algorithm.");

                items = itemGen();
                depthStart = Instant.now();
                System.out.println("Maximum profit with a knapsack of " + capacity + " capacity, is "
                                + DepthFirst.depthFirstKnapsack(capacity, items));
                depthStop = Instant.now();
                depthTimeElapsed = Duration.between(depthStart, depthStop).toMillis();
                System.out.println("This conclusion was reached in " + depthTimeElapsed
                                + " milliseconds by using the Depth Branch and Bound algorithm.");

                items = itemGen();
                depthStart = Instant.now();
                System.out.println("Maximum profit with a knapsack of " + capacity + " capacity, is "
                                + DepthFirst.depthFirstKnapsack(capacity, items));
                depthStop = Instant.now();
                depthTimeElapsed = Duration.between(depthStart, depthStop).toMillis();
                System.out.println("This conclusion was reached in " + depthTimeElapsed
                                + " milliseconds by using the Depth Branch and Bound algorithm.");

                // End test
        }

        static Item[] itemGen() {
                System.out.println("gen start");
                int numItems = 500000; // Number of items to generate
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
                System.out.println("gen stop");
                return items;
        }
}

// Define the items with their weights and values
class Item {
        int weight;
        int value;

        public Item(int weight, int value) {
                this.weight = weight;
                this.value = value;
        }
}