package mathematics;

public class Divisors {

    // Naive Solution
    // Print all divisors of given number
    // Time : O(n)
    public static void printDivisorsNaive(int n) {
        for(int i=1; i<=n; i++) {
            if((n%i) == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // Efficient Solution
    // Print all divisors of given number
    // Time : O(sqrt(n))
    // Does not preserve order
    public static void printDivisorsEfficient(int n) {
        for(int i=1; (i * i)<=n; i++) {
            if((n%i) == 0) {
                System.out.print(i + " ");
                if (i != (n / i))
                    System.out.print((n / i) + " ");
            }
        }
        System.out.println();
    }

    // Print Divisors Efficient Solution (Preserving Order)
    // Time : O(sqrt(n))
    public static void printDivisorsEffWithOrder(int n) {
        int i;
        for(i=1; (i * i)<=n; i++) {
            if((n%i) == 0)
                System.out.print(i + " ");
        }
        for(; i >=1; i--) {
            if((n%i)==0)
                System.out.print((n/i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printDivisorsNaive(50);
        printDivisorsEfficient(50);
        printDivisorsEffWithOrder(50);
    }
}
