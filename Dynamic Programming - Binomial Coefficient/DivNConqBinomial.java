public class DivNConqBinomial {
    public static int count;

    public static int calcBinomial(int n, int k) {
        count++;
        // System.out.println("Number of recursive calls: " + count);
        if (k > n) {
            return 0;
        } else if (k == 0 || k == n) {
            return 1;
        } else {
            return calcBinomial(n - 1, k - 1) + calcBinomial(n - 1, k);
        }

    }
}
