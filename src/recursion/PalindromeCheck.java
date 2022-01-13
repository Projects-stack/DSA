package recursion;

public class PalindromeCheck {
    public static boolean isPalindrome(String str, int start, int end) {
        if(start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end)
                && isPalindrome(str, start+1, end-1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abbcbba", 0, 6));
        System.out.println(isPalindrome("geeks", 0, 4));
    }
}
