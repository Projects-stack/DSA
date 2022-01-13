package recursion;

public class SumOfDigits {
    public static int getDigitSum(int n) {
        if(n == 0)
            return 0;
        else
            return (getDigitSum(n/10) + (n%10));
    }

    public static void main(String[] args) {
        System.out.println(getDigitSum(12345));
    }
}
