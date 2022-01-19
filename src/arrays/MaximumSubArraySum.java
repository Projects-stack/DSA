package arrays;

public class MaximumSubArraySum {

    // Naive Solution
    // Time : O(n^2)
    public static int maxSumNaive(int[] arr) {
        int res = arr[0], n = arr.length;
        for(int i=0; i<n; i++) {
            int curr = 0;
            for(int j=i; j<n; j++) {
                curr = curr + arr[j];
                res = Math.max(curr, res);
            }
        }
        return res;
    }

    // Efficient Solution
    // Time : O(n)
    public static int maxSumEff(int[] arr) {
        int res = arr[0], maxEnding = arr[0];
        for(int i=1; i<arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxSumNaive(new int[] {-6, -1, -8, 2, -3}));
        System.out.println(maxSumEff(new int[] {-3, 8, -2, 4, -5, 6}));
    }
}
