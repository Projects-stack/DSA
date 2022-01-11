package bit_magic;

public class CountSetBits {

    // Time : O(total bits in n)
    public static int countSetBitsMod2Approach(int n) {
        int res = 0;
        while(n > 0) {
            if((n%2) != 0)
                res++;
            n /= 2;
        }
        return res;
    }

    // Time : O(total bits in n)
    public static int countSetBitsUsingBitwise(int n) {
        int res = 0;
        while(n > 0) {
            res = res + (n & 1);
            n = n >> 1;
        }
        return res;
    }

    // Time : O(set bits in n)
    public static int countSetBitsEfficientApproach(int n) {
        int res = 0;
        // loop will run set bit times;
        // for 40 it will run only 2 times;
        while(n > 0) {
            n = (n & (n-1));
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countSetBitsMod2Approach(40));
        System.out.println(countSetBitsUsingBitwise(7));
        System.out.println(countSetBitsEfficientApproach(51));
    }
}
