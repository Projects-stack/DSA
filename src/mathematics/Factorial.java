package mathematics;

public class Factorial {
    // Time : O(n)
    // Aux Space : O(1)
    public static long factIterative(int n) {
        long res = 1;
        for(int i=2; i<=n; i++)
            res *= i;
        return res;
    }

    // Time : O(n)
    // Aux Space : O(n)
    public static long factRecursive(int n) {
        if(n == 0 || n == 1)
            return 1;
        return n * factRecursive(n-1);
    }

    // Trailing zeros in factorial
    // Naive approach
    // Time : O(log(n))
    public static int countTrailingZerosEff(int n) {
        int res = 0;
        for(int i=5; i<=n; i *= 5)
            res = res + n/i;
        return res;
    }

    // Trailing zeros in factorial
    // Naive approach
    // Time : O(n)
    public static int countTrailingZerosNaive(int n) {
        long fact = factIterative(n);
        int res = 0;
        while(fact % 10 == 0) {
            res++;
            fact /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        // Calculate factorial
        System.out.println(factIterative(5));
        System.out.println(factRecursive(7));

        // Trailing zeros in factorial
        System.out.println(countTrailingZerosNaive(10));
        System.out.println(countTrailingZerosEff(100));

    }
}
