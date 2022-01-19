package arrays;

public class MaxConsecutive1s {

    // Naive Solution
    // Time : O(n^2)
    public static int maxConsecutive1sNaive(boolean[] arr) {
        int res = 0, n = arr.length;
        for(int i=0; i<n; i++) {
            int curr = 0;
            for(int j=i; j<n; j++) {
                if(arr[j])
                    curr++;
                else
                    break;
            }
            res = Math.max(curr, res);
        }
        return res;
    }

    // Efficient Solution
    // Time : O(n)
    public static int maxConsecutive1sEff(boolean[] arr) {
        int res = 0, curr = 0;
        for (boolean b : arr) {
            if (!b)
                curr = 0;
            else {
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxConsecutive1sNaive(new boolean[] {true, false, true, true, true, true, false, true, true}));
        System.out.println(maxConsecutive1sEff(new boolean[] {false, true, true, false, true, false}));
    }
}
