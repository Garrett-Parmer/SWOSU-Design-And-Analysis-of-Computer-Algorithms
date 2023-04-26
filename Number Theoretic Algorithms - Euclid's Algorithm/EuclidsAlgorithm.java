import java.util.*;
import java.time.*;

public class EuclidsAlgorithm {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 11208;
        int b = 8232;
        Instant gcdStart = Instant.now();
        int gcd = gcd(a, b);
        Instant gcdStop = Instant.now();
        long gcdTimeElapsed = Duration.between(gcdStart, gcdStop).toMillis();
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("It took " + gcdTimeElapsed + " milliseconds to solve for the greatest common divisor.");

        gcdStart = Instant.now();
        a = 12960;
        b = 29120;
        gcd = gcd(a, b);
        gcdStop = Instant.now();
        gcdTimeElapsed = Duration.between(gcdStart, gcdStop).toMillis();
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("It took " + gcdTimeElapsed + " milliseconds to solve for the greatest common divisor.");

        gcdStart = Instant.now();
        a = 40560;
        b = 54600;
        gcd = gcd(a, b);
        gcdStop = Instant.now();
        gcdTimeElapsed = Duration.between(gcdStart, gcdStop).toMillis();
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("It took " + gcdTimeElapsed + " milliseconds to solve for the greatest common divisor.");

        gcdStart = Instant.now();
        a = 20520;
        b = 26880;
        gcd = gcd(a, b);
        gcdStop = Instant.now();
        gcdTimeElapsed = Duration.between(gcdStart, gcdStop).toMillis();
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("It took " + gcdTimeElapsed + " milliseconds to solve for the greatest common divisor.");

        gcdStart = Instant.now();
        a = 60480;
        b = 82560;
        gcd = gcd(a, b);
        gcdStop = Instant.now();
        gcdTimeElapsed = Duration.between(gcdStart, gcdStop).toMillis();
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("It took " + gcdTimeElapsed + " milliseconds to solve for the greatest common divisor.");

        gcdStart = Instant.now();
        a = 31680;
        b = 43680;
        gcd = gcd(a, b);
        gcdStop = Instant.now();
        gcdTimeElapsed = Duration.between(gcdStart, gcdStop).toMillis();
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("It took " + gcdTimeElapsed + " milliseconds to solve for the greatest common divisor.");

        gcdStart = Instant.now();
        a = 30240;
        b = 39360;
        gcd = gcd(a, b);
        gcdStop = Instant.now();
        gcdTimeElapsed = Duration.between(gcdStart, gcdStop).toMillis();
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("It took " + gcdTimeElapsed + " milliseconds to solve for the greatest common divisor.");

        gcdStart = Instant.now();
        a = 13824;
        b = 15840;
        gcd = gcd(a, b);
        gcdStop = Instant.now();
        gcdTimeElapsed = Duration.between(gcdStart, gcdStop).toMillis();
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("It took " + gcdTimeElapsed + " milliseconds to solve for the greatest common divisor.");

        gcdStart = Instant.now();
        a = 15840;
        b = 25920;
        gcd = gcd(a, b);
        gcdStop = Instant.now();
        gcdTimeElapsed = Duration.between(gcdStart, gcdStop).toMillis();
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("It took " + gcdTimeElapsed + " milliseconds to solve for the greatest common divisor.");

        gcdStart = Instant.now();
        a = 2103345;
        b = 1342345;
        gcd = gcd(a, b);
        gcdStop = Instant.now();
        gcdTimeElapsed = Duration.between(gcdStart, gcdStop).toMillis();
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("It took " + gcdTimeElapsed + " milliseconds to solve for the greatest common divisor.");

    }
}