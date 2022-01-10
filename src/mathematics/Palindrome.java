package mathematics;

public class Palindrome {

    // Palindrome Check
    // Time : O(d)
    public static boolean isPal(int n) {
        int rev = 0;
        int temp = n;
        while(temp != 0) {
            int lastDigit = temp % 10;
            rev = (rev * 10) + lastDigit;
            temp /= 10;
        }

        return n == rev;
    }

    public static void main(String[] args) {
        System.out.println(isPal(12321));
    }
}
