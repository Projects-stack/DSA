package bit_magic;

public class PowerOf2 {

    // Time : O(log(n))
    public static boolean isPowerOf2Naive(int n) {
        if(n == 0)
            return false;
        while(n != 1) {
            if((n%2) != 0)
                return false;
            n /= 2;
        }
        return true;
    }

    // Time : O(1)
    public static boolean isPowerOf2Efficient(int n) {
        if(n == 0)
            return false;
        return ((n & (n-1)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOf2Naive(8));
        System.out.println(isPowerOf2Efficient(6));
    }
}
