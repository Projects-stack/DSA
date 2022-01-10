package mathematics;

public class ComputingPower {

    // Naive Solution
    // Time : O(n)
    public static int powerNaive(int x, int n) {
        int res = 1;
        for (int i = 0; i < n; i++)
            res = res * x;
        return res;
    }

    // Efficient Solution
    // Recursive approach
    // Time : O(log(n)) & Aux Space : O(log(n))
    public static int powerRecursive(int x, int n) {
        if (n == 0)
            return 1;
        int temp = powerRecursive(x, n / 2);
        temp = temp * temp;
        if ((n % 2) == 0)
            return temp;
        else
            return temp * x;
    }

    // Efficient Solution
    // Iterative approach
    // Time : O(log(n)) & Aux Space : O(1)
    // Every number can be written as sum of powers of 2 (Set Bits Logic)
    public static int powerIterative(int x, int n) {
        int res = 1;
        while(n > 0)
        {
            if(n%2 != 0)
                res = res * x;
            x = x * x;
            n = n/2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(powerNaive(2, 4));
        System.out.println(powerRecursive(4, 3));
        System.out.println(powerIterative(3, 5));
    }
}