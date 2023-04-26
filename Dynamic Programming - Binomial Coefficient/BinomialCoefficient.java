import java.time.*;

public class BinomialCoefficient {
    public static void main(String[] args) {
        // Start of Divide and Conquer Recursive Tests
        int n = 10;
        int k = 5;

        System.out.println("Solving binomial coefficient for: C(" + n + ", " + k + ")");
        Instant divStart = Instant.now();
        System.out.println(
                "The binomial coefficient for C(" + n + ", " + k + ") is: " + DivNConqBinomial.calcBinomial(n, k));
        Instant divStop = Instant.now();
        long divTimeElapsed = Duration.between(divStart, divStop).toMillis();
        System.out.println(
                "To calculate this coefficient with Divide and Conquer, it took " + divTimeElapsed + " milliseconds.");

        n = 20;
        k = 10;
        divStart = Instant.now();
        System.out.println(
                "The binomial coefficient for C(" + n + ", " + k + ") is: " + DivNConqBinomial.calcBinomial(n, k));
        divStop = Instant.now();
        divTimeElapsed = Duration.between(divStart, divStop).toMillis();
        System.out.println(
                "To calculate this coefficient with Divide and Conquer, it took " + divTimeElapsed + " milliseconds.");

        n = 35;
        k = 10;
        divStart = Instant.now();
        System.out.println(
                "The binomial coefficient for C(" + n + ", " + k + ") is: " + DivNConqBinomial.calcBinomial(n, k));
        divStop = Instant.now();
        divTimeElapsed = Duration.between(divStart, divStop).toMillis();
        System.out.println(
                "To calculate this coefficient with Divide and Conquer, it took " + divTimeElapsed + " milliseconds.");

        n = 40;
        k = 10;
        divStart = Instant.now();
        System.out.println(
                "The binomial coefficient for C(" + n + ", " + k + ") is: " + DivNConqBinomial.calcBinomial(n, k));
        divStop = Instant.now();
        divTimeElapsed = Duration.between(divStart, divStop).toMillis();
        System.out.println(
                "To calculate this coefficient with Divide and Conquer, it took " + divTimeElapsed + " milliseconds.");

        // Start of Dynamic Algorithm Tests
        n = 10;
        k = 5;
        Instant dynStart = Instant.now();
        System.out.println(
                "The binomial coefficient for C(" + n + ", " + k + ") is: " + DynamicBinomial.calcBinomial(n, k));
        Instant dynStop = Instant.now();
        long dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
        System.out.println(
                "To calculate this coefficient with Dynamic Programming, it took " + dynTimeElapsed + " milliseconds.");

        n = 20;
        k = 10;
        dynStart = Instant.now();
        System.out.println(
                "The binomial coefficient for C(" + n + ", " + k + ") is: " + DynamicBinomial.calcBinomial(n, k));
        dynStop = Instant.now();
        dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
        System.out.println(
                "To calculate this coefficient with Dynamic Programming, it took " + dynTimeElapsed + " milliseconds.");

        n = 35;
        k = 10;
        dynStart = Instant.now();
        System.out.println(
                "The binomial coefficient for C(" + n + ", " + k + ") is: " + DynamicBinomial.calcBinomial(n, k));
        dynStop = Instant.now();
        dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
        System.out.println(
                "To calculate this coefficient with Dynamic Programming, it took " + dynTimeElapsed + " milliseconds.");

        n = 40;
        k = 10;
        dynStart = Instant.now();
        System.out.println(
                "The binomial coefficient for C(" + n + ", " + k + ") is: " + DynamicBinomial.calcBinomial(n, k));
        dynStop = Instant.now();
        dynTimeElapsed = Duration.between(dynStart, dynStop).toMillis();
        System.out.println(
                "To calculate this coefficient with Dynamic Programming, it took " + dynTimeElapsed + " milliseconds.");
    }
}
