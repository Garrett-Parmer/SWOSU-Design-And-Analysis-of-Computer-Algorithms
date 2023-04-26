import java.util.*;

public class DepthFirst {

    private static class Node {
        int level;
        int profit;
        int weight;
        boolean[] included;

        Node(int level, int profit, int weight, boolean[] included) {
            this.level = level;
            this.profit = profit;
            this.weight = weight;
            this.included = included.clone();
        }
    }

    public static int depthFirstKnapsack(int capacity, Item[] items) {
        int n = items.length;
        int maxProfit = 0;

        // Initialize the root node
        Node root = new Node(0, 0, 0, new boolean[n]);

        // Create a stack to store nodes to be explored
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            Node node = stack.pop();

            // Check if the node is promising
            if (node.weight <= capacity && node.profit > maxProfit) {
                maxProfit = node.profit;
            }

            // Explore the left subtree (exclude the next item)
            if (node.level < n) {
                boolean[] excluded = node.included.clone();
                excluded[node.level] = true;
                int excludedProfit = node.profit;
                int excludedWeight = node.weight;
                for (int i = node.level; i < n; i++) {
                    if (!excluded[i]) {
                        excludedProfit += items[i].value;
                        excludedWeight += items[i].weight;
                    }
                }
                if (excludedWeight <= capacity && excludedProfit > maxProfit) {
                    Node excludedNode = new Node(node.level + 1, excludedProfit, excludedWeight, excluded);
                    stack.push(excludedNode);
                }
            }

            // Explore the right subtree (include the next item)
            if (node.level < n) {
                boolean[] included = node.included.clone();
                included[node.level] = true;
                int includedProfit = node.profit + items[node.level].value;
                int includedWeight = node.weight + items[node.level].weight;
                if (includedWeight <= capacity && includedProfit > maxProfit) {
                    Node includedNode = new Node(node.level + 1, includedProfit, includedWeight, included);
                    stack.push(includedNode);
                }
            }
        }

        return maxProfit;
    }
}
