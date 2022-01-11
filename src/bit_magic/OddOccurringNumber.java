package bit_magic;

public class OddOccurringNumber {

    // Naive approach
    // Find only odd occurring element in an array
    // Time : O(n^2)
    public static int onlyOddOccurringNaive(int[] arr) {
        for (int i : arr) {
            int count = 0;
            for (int j : arr) {
                if (i == j)
                    count++;
            }
            if ((count % 2) != 0)
                return i;
        }
        return -1;
    }

    // Efficient Solution
    // Using exOr
    // Time : O(n)
    public static int onlyOddOccurringEff(int[] arr) {

        // x ^ 0 = x
        // x ^ x = 0
        // x ^ y = y ^ x
        // x ^ (y ^ z) = (x ^ y) ^ z

        int res = 0;
        for (int i : arr)
            res = res ^ i;
        return res;
    }

    public static void twoOddAppearingNumbers(int[] arr) {
        int xOr = 0, res1 = 0, res2 = 0;
        for(int i: arr)
            xOr = xOr ^ i;
        int sb = xOr & -xOr;

        for(int j: arr) {
            if((j & sb) != 0)
                res1 = res1 ^ j;
            else
                res2 = res2 ^ j;
        }

        System.out.println("Two odd appearing elements are : " + res1 + " & " + res2);
    }

    public static void main(String[] args) {
        // Only odd appearing
        System.out.println("Only odd appearing elements are : ");
        System.out.println(onlyOddOccurringNaive(new int[] {4, 3, 4, 4, 4, 5, 5}));
        System.out.println(onlyOddOccurringEff(new int[] {8, 7, 7, 8, 8}));

        // Two odd appearing
        twoOddAppearingNumbers(new int[] {3, 4, 3, 4, 5, 4, 4, 6, 6, 6, 7, 7});
    }
}
