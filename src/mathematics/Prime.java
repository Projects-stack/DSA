package mathematics;

import java.util.Arrays;

public class Prime {

    // Naive Solution
    // Time : O(n)
    public static boolean isPrimeNaive(int n) {
        if(n <= 1) return false;
        for(int i=2; i<n; i++) {
            if((n % i) == 0)
                return false;
        }
        return true;
    }

    // Efficient Solution
    // Time : O(sqrt(n))
    public static boolean isPrimeEfficient(int n) {
        if(n <= 1) return false;
        for(int i=2; (i * i)<=n; i++) {
            if((n%i) == 0)
                return false;
        }
        return true;
    }

    // More Efficient Solution
    // Time : O(log(n))
    public static boolean isPrimeMoreEff(int n) {
        if(n <= 1) return false;
        if(n == 2 || n == 3) return true;
        if((n % 2) == 0 || (n % 3) == 0) return false;

        for(int i=5; (i*i)<=n; i+=6) {
            if((n%i) == 0 || n%(i+2) == 0)
                return false;
        }
        return true;
    }
//-----------------------------------------------------------------------------------------

    // Prime Factors of given number
    // Naive Solution
    // O(n^2(log n))
    public static void primeFactorsNaive(int n) {
        for(int i=2; i<n; i++) {
            if(isPrimeMoreEff(i)) {
                int x = i;
                while((n % x) == 0) {
                    System.out.print(i + " ");
                    x = x * i;
                }
            }
        }
        System.out.println();
    }

    // Print Prime Factors
    // Efficient Solution
    // Time : O(sqrt(n))
    public static void primeFactorsEfficient(int n) {
        if(n <= 1) return;
        for(int i=2; (i * i) <= n; i++) {
            while((n%i) == 0) {
                System.out.print(i + " ");
                n = n/i;
            }
        }
        if(n > 1)
            System.out.print(n);
        System.out.println();
    }

    // Print Prime Factors
    // More Efficient Solution
    // Time : O(sqrt(n))
    public static void primeFactorsMoreEff(int n) {
        if(n <= 1) return;
        while((n%2) == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        while((n%3) == 0) {
            System.out.print(3 + " ");
            n /= 3;
        }

        for(int i=5; (i*i)<=n; i+=6) {
            while ((n%i) == 0) {
                System.out.print(i + " ");
                n /= i;
            }
            while(n % (i+2) == 0) {
                System.out.print(i + " ");
                n /= (i+2);
            }
        }
        if(n > 3)
            System.out.print(n);
        System.out.println();
    }
//------------------------------------------------------------------------------------------

    // Naive Solution
    // Print Prime numbers till given number
    // Time : O(n * sqrt(n))
    public static void printPrimeNaive(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrimeMoreEff(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // Sieve Of Eratosthenes
    // Print Prime numbers till given number
    // Time : O(n * log(log(n)))
    public static void printPrimeSieve(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i=2; i<=n; i++) {
            if(isPrime[i]) {
                for(int j=i*i; j<=n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        for(int i=2; i<=n; i++) {
            if(isPrime[i])
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // Optimized Sieve (Shorthand implementation)
    // Time : O(n * log(log(n)))
    public static void printPrimeSieveShorthand(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i=2; i<=n; i++) {
            if(isPrime[i]) {
                System.out.print(i + " ");
                for(int j=i*i; j<=n; j+=i)
                    isPrime[j] = false;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Check isPrime Or Not
        System.out.println(isPrimeNaive(7));
        System.out.println(isPrimeEfficient(10));
        System.out.println(isPrimeMoreEff(13));

        // Print All Prime Factors
        primeFactorsNaive(12);
        primeFactorsEfficient(16);
        primeFactorsMoreEff(100);

        // Print all prime numbers till given number
        printPrimeNaive(25);
        printPrimeSieve(50);
        printPrimeSieveShorthand(100);
    }
}
