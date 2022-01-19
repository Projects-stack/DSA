package arrays;

// Find maximum difference between pairs where : j > i
public class MaximumDifferenceWithOrder {

    // Naive Solution
    // Time : O(n^2)
    public static int maxDiffNaive(int[] arr) {
        int n = arr.length;
        int res = arr[1] - arr[0];
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++)
                res = Math.max(res, arr[j]-arr[i]);
        }
        return res;
    }

    // Efficient Solution
    // Time : O(n)
    public static int maxDiffEff(int[] arr) {
        int res = arr[1] - arr[0], minVal = arr[0];
        for(int j=1; j<arr.length; j++) {
            res = Math.max(res, arr[j] - minVal);
            minVal = Math.min(minVal, arr[j]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Maximum Difference (Naive) : " + maxDiffNaive(new int[] {2, 3, 10, 6, 4, 8, 1}));
        System.out.println("Maximum Difference (Efficient)  : " + maxDiffEff(new int[] {30, 10, 8, 2}));
    }
}
