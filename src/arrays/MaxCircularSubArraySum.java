package arrays;

public class MaxCircularSubArraySum {

    // Naive Solution
    // Time : O(n^2)
    public static int maxCircularSumNaive(int[] arr) {
        int res = arr[0], n=arr.length;
        for(int i=0; i<n; i++) {
            int currMax = arr[i];
            int currSum = arr[i];
            for(int j=1; j<n; j++) {
                int index = (i+j) % n;
                currSum += arr[index];
                currMax = Math.max(currMax, currSum);
            }
            res = Math.max(res, currMax);
        }
        return res;
    }

    // Efficient Approach
    // Time : O(n)
    public static int maxCircularSumEff(int[] arr) {
        int maxNormal = MaximumSubArraySum.maxSumEff(arr);
        if(maxNormal < 0)
            return maxNormal;

        int arrSum = 0;
        for(int i=0; i<arr.length; i++) {
            arrSum += arr[i];
            arr[i] = -arr[i];
        }

        int maxCircular = arrSum + MaximumSubArraySum.maxSumEff(arr);
        return Math.max(maxNormal, maxCircular);
    }

    public static void main(String[] args) {
        System.out.println(maxCircularSumNaive(new int[] {5, -2, 3, 4}));
        System.out.println(maxCircularSumEff(new int[] {8, -4, 3, -5, 4}));
    }
}
