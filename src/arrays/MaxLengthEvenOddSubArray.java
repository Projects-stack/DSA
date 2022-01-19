package arrays;

public class MaxLengthEvenOddSubArray {
    // Naive Solution
    // Time : O(n^2)
    public static int maxEvenOddNaive(int[] arr) {
        int res = 1, n=arr.length;
        for(int i=0; i<n; i++) {
            int curr = 1;
            for(int j = i+1; j<n; j++) {
                if(((arr[j]%2 == 0) && (arr[j-1]%2 != 0)) || ((arr[j]%2 != 0) && (arr[j-1]%2 == 0))) {
                    curr++;
                }
                else
                    break;
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    // Efficient approach
    // Time : O(n)
    public static int maxEvenOddEff(int[] arr) {
        int res = 1, curr = 1;
        for(int i=1; i<arr.length; i++) {
            if(((arr[i]%2 == 0) && (arr[i-1]%2 != 0)) || ((arr[i]%2 != 0) && (arr[i-1]%2 == 0))) {
                curr++;
                res = Math.max(res, curr);
            }
            else
                curr = 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxEvenOddNaive(new int[] {10, 12, 14, 7, 8}));
        System.out.println(maxEvenOddNaive(new int[] {7, 10, 13, 14}));
    }
}
