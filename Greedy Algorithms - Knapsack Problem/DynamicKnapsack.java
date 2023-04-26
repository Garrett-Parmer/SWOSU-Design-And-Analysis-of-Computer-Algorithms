public class DynamicKnapsack {

    // Function to solve the Knapsack problem using dynamic programming
    static int knapsackDyn(int W, int wt[], int val[], int n) {
        int i, w;
        // Create a 2D array to store the maximum value that can be obtained for each
        // subproblem
        int K[][] = new int[n + 1][W + 1];

        // Fill the table in a bottom-up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        // Return the maximum value that can be obtained for the given capacity
        return K[n][W];
    }
}
