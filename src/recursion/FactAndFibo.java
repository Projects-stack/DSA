package recursion;

public class FactAndFibo {
    // factorial of n = n! = n * (n-1)!
    // returns factorial of given number
    public static int factorial(int n) {
        if(n == 0 || n == 1)
            return 1;
        return n * factorial(n-1);
    }

    // Tail recursive factorial
    public static int factorialTailRecursive(int n, int k) {
        if(n == 0 || n == 1)
            return k;
        else
            return factorialTailRecursive(n-1, k * n);
    }

    // fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
    // returns fibonacci number of given number
    public static int fibonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        // factorial
        System.out.println(factorial(5));

        // tail recursive factorial
        System.out.println(factorialTailRecursive(7, 1));

        // fibonacci
        for(int i=0; i<=10; i++)
            System.out.print(fibonacci(i) + " ");
    }
}
