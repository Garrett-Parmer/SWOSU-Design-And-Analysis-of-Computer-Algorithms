import java.util.*;

public class BestFirst {

    public static int bestFirstKnapsack(int capacity, Item[] items) {
        int n = items.length; // Number of items
        boolean[] included = new boolean[n]; // A boolean array that indicates which items are included in the solution.
        Node root = new Node(-1, 0, 0, included);
        // Sorts the items into a priority queue according to their profit in decreasing
        // order.
        PriorityQueue<Node> queue = new PriorityQueue<Node>(new NodeComparator());
        queue.offer(root); // Add the root node
        int maxProfit = 0; // Initialize max profit to 0
        while (!queue.isEmpty()) {
            Node node = queue.poll(); // Get the most promising node.

            // If the node is a leaf node, and has a higher profit than the current maximum,
            // update the maximum profit.
            if (node.level == n - 1) {
                if (node.profit > maxProfit) {
                    maxProfit = node.profit;
                }
            } else { // If the node is not a leaf, then get the level of the next item.
                int nextLevel = node.level + 1;
                // Exclude the next item
                boolean[] excluded = node.included.clone(); // Create a copy of the included items.
                excluded[nextLevel] = false; // Exclude next item
                // Profit and weight not affected by excluding an item.
                int excludedProfit = node.profit;
                int excludedWeight = node.weight;
                // Update profit and weight for excluded items.
                for (int i = nextLevel; i < n; i++) {
                    if (excluded[i]) {
                        excludedProfit -= items[i].value;
                        excludedWeight -= items[i].weight;
                    }
                }

                // Check if excluding the next item gives a better profit and the weight is
                // within capacity
                if (excludedWeight <= capacity && excludedProfit > maxProfit) {
                    // Create new node for excluded item and add to priority queue
                    Node excludedNode = new Node(nextLevel, excludedProfit, excludedWeight, excluded);
                    queue.offer(excludedNode);
                }

                // Include the next item
                // Create a copy of the included array with the next item included.
                included = node.included.clone();
                included[nextLevel] = true;
                // Calculate new profit and weight after including next item.
                int includedProfit = node.profit + items[nextLevel].value;
                int includedWeight = node.weight + items[nextLevel].weight;
                // Check if including nexdt item gives a better profit and the weight is within
                // capacity.
                if (includedWeight <= capacity && includedProfit > maxProfit) {
                    // Create a new node representing the included item and add it to the priority
                    // queue.
                    Node includedNode = new Node(nextLevel, includedProfit, includedWeight, included);
                    queue.offer(includedNode);
                }
            }
        }
        return maxProfit;
    }
    // Test method for Best First
    /*
     * public static void main(String[] args) {
     * int capacity = 50;
     * Item[] items = new Item[] {
     * new Item(10, 60),
     * new Item(20, 100),
     * new Item(30, 120),
     * new Item(9, 120),
     * new Item(43, 120),
     * new Item(30, 120),
     * new Item(20, 450),
     * new Item(50, 120),
     * new Item(3, 120),
     * new Item(12, 120),
     * };
     * int maxProfit = knapsackBnBBF(capacity, items);
     * System.out.println("Maximum profit: " + maxProfit);
     * }
     */

}

class Node {
    int level;
    int profit;
    int weight;
    boolean[] included;

    public Node(int level, int profit, int weight, boolean[] included) {
        this.level = level;
        this.profit = profit;
        this.weight = weight;
        this.included = included.clone();
    }
}

// Define a comparator for the priority queue used in the best-first algorithm
class NodeComparator implements Comparator<Node> {
    public int compare(Node n1, Node n2) {
        return n2.profit - n1.profit; // Sort nodes by decreasing profit
    }
}