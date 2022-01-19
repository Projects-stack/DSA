package arrays.prefix_sum;

public class MultipleQueries {

    // precomputing prefix sum
    public static void preCompute(int[] arr, int[] prefixSum) {
        prefixSum[0] = arr[0];
        for(int i=1; i<arr.length; i++)
            prefixSum[i] = prefixSum[i-1] + arr[i];
    }

    // Returns sum of elements in arr[i..j]
    // It is assumed that i <= j
    public static int rangeSum(int l, int r, int[] pre) {
        if(l == 0)
            return pre[r];
        return pre[r] - pre[l-1];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        int[] pre = new int[n];

        preCompute(arr, pre);
        System.out.println(rangeSum(1, 3, pre));
        System.out.println(rangeSum(2, 4, pre));
    }
}
