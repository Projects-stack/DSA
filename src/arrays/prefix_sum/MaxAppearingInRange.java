package arrays.prefix_sum;

public class MaxAppearingInRange {

    static int MAX = 1000;

    // Return the maximum occurred element in all ranges.
    public static int maxOcc(int[] L, int[] R, int n) {
        // Initialising all element of array to 0.
        int[] arr = new int[MAX];

        // Adding +1 at Li index and
        // Subtracting 1 at Ri index.
        for (int i = 0; i < n; i++) {
            arr[L[i]] += 1;
            arr[R[i] + 1] -= 1;
        }

        // Finding prefix sum and index
        // having maximum prefix sum.
        int max = arr[0], res = 0;
        for (int i = 1; i < MAX; i++) {
            arr[i] += arr[i - 1];
            if (max < arr[i]) {
                max = arr[i];
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] L = {1, 2, 5, 15};
        int[] R = {5, 8, 7, 18};
        int res = maxOcc(L, R, 4);
        System.out.println("Maximum appearing element in given ranges is : " + res);
    }
}
