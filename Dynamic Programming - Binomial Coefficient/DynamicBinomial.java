public class DynamicBinomial {
    static int calcBinomial(int n, int k) {

        int C[][] = new int[n + 1][k + 1];
        int i, j;

        // Calculate value of Binomial coefficient in bottom up manner
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= Math.min(i, k); j++) {
                // Base Cases
                if (j == 0 || j == i)
                    C[i][j] = 1;

                // Calculate value using previously stored values
                else
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
            }
        }

        return C[n][k];
    }

    /*
     * public static void main(String[] args) {
     * int n = 43;
     * int k = 10;
     * System.out.println("Value of C(" + n + "," + k + ") is " + calcBinomial(n,
     * k));
     * }
     */
}
