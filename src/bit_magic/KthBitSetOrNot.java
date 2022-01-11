package bit_magic;

public class KthBitSetOrNot {

    // left shift approach
    public static void kthBitSetOrNotLeftShift(int n, int k) {
        // n :      0...1001
        // 1 << 3 : 0...1001
        // 1 & 1 == 1 otherwise it is 0;
        if((n & (1<<(k-1))) != 0)       // left shift one by k-1 and take & with n
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    // Right shift approach
    public static void kthBitSetOrNotRightShift(int n, int k) {
        // 7 :      0...0111
        // n >> 2 : 0...0000
        // 1 & 1 == 1;
        if((n >> (k-1) & 1) == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        kthBitSetOrNotLeftShift(9, 4);
        kthBitSetOrNotRightShift(7, 5);
    }
}
