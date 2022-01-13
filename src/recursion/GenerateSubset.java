package recursion;

public class GenerateSubset {
    /*
    * All characters in the input string are distinct.
    * For a string of length n, there are going to be 2^n subsets.
    *
    * Sample Input : s = "ab"
    * Expected Output : "", "a", "b", "ab"
    *
    * Sample Input : s = "abc"
    * Expected Output : "", "a", "b", "c", "ab", "ac", "bc", "abc"
    *
    * */

    public static void subSet(String str, String curr, int i) {
        if(i == str.length())
        {
            System.out.print(curr + " ");
            return;
        }
        subSet(str, curr, i+1);
        subSet(str, curr + str.charAt(i), i+1);
    }

    public static void main(String[] args) {
        subSet("abc", "",0);
    }
}
