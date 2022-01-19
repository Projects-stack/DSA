package arrays.prefix_sum;

public class EquilibriumPoint {

    public static boolean isEqPoint(int[] arr) {
        // Calculating prefix sum
        int sum = 0, n = arr.length;
        for(int j: arr)
            sum += j;

        // Performing window sliding
        int lSum =0;
        for (int j : arr) {
            if (lSum == sum - j)
                return true;
            lSum += j;
            sum -= j;
        }
        return false;
    }
}
