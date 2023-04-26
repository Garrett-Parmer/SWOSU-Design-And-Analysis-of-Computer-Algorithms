import java.util.Arrays;
import java.util.Comparator;

public class GreedyKnapsack {

    // Function to solve the fractional knapsack problem using a greedy algorithm
    static int knapsackGreed(int W, Item arr[], int n) {

        // Sort the items in decreasing order of value-to-weight ratio
        Arrays.sort(arr, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o2.value * o1.weight - o1.value * o2.weight;
            }
        });

        int curWeight = 0; // Current weight of the Knapsack
        double finalValue = 0.0; // Final value of the Knapsack

        // Loop through each item and add it to the Knapsack if there is enough capacity
        for (int i = 0; i < n; i++) {
            if (curWeight + arr[i].weight <= W) {
                curWeight += arr[i].weight;
                finalValue += arr[i].value;
            } else {
                // If the knapsack cannot hold the whole item, place a fraction of it inside.
                int remain = W - curWeight;
                finalValue += arr[i].value * ((double) remain / arr[i].weight);
                break;
            }
        }

        // Return the maximum value that can be obtained for the given capacity
        return (int) finalValue;
    }
}

// Object that represents the item to be compared.
class Item {
    int value, weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}