package arrays.window_sliding;

// This implementation is only valid for non-negative integers
public class SubArrayWithGivenSum {

    // Naive Solution
    // Time : O(n^2)
    public static boolean containsSubArrayNaive(int[] arr, int givenSum) {
        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=i; j<arr.length; j++) {
                sum += arr[j];
                if(sum == givenSum)
                    return true;
            }
        }
        return false;
    }

    // Efficient Solution - (Using WINDOW SLIDING TECHNIQUE)
    public static boolean containsSubArrayEff(int[] arr, int givenSum) {
        int currSum = arr[0], start = 0;
        for(int end=1; end<arr.length; end++) {

            // Clean the previous window
            while((currSum > givenSum) && (start < end-1)) {
                currSum -= arr[start];
                start++;
            }

            if(currSum == givenSum)
                return true;

            // Adding last element to the window
            currSum += arr[end];
        }
        return (currSum == givenSum);
    }

    public static void main(String[] args) {

    }
}
