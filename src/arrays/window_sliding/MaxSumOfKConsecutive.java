package arrays.window_sliding;

public class MaxSumOfKConsecutive {

    // Naive Solution
    // Time : O((n-k)*k)
    public static int maxSumNaive(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; (i+k-1)<arr.length; i++) {
            int sum=0;
            for(int j=0; j<k;j++)
                sum += arr[i+j];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    // Efficient approach - (WINDOW-SLIDING TECHNIQUE)
    // Time O(n)
    public static int maxSumWindowSliding(int[] arr, int k) {
        int currSum = 0;
        for(int i=0; i<k; i++)
            currSum += arr[i];
        int maxSum = currSum;
        for(int i=k; i<arr.length; i++) {
            currSum += (arr[i] - arr[i-k]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSumNaive(new int[] {1, 8, 30, -5, 20, 7}, 3));
        System.out.println(maxSumWindowSliding(new int[] {5, -10, 6, 90, 3}, 2));
    }
}
