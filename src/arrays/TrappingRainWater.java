package arrays;

public class TrappingRainWater {

    // Naive Solution
    // Time : O(n^2)
    public static int getWaterNaive(int[] arr) {
        int res = 0, n = arr.length;
        for(int i=1; i<n-1; i++) {
            // Finding left maximum pillar
            int lMax = arr[i];
            for(int j=0; j<i; j++)
                lMax = Math.max(lMax, arr[j]);

            // Finding right maximum pillar
            int rMax = arr[i];
            for(int j=i+1; j<n; j++)
                rMax = Math.max(rMax, arr[j]);

            // Get trapped water
            res += (Math.min(lMax, rMax) - arr[i]);
        }
        return res;
    }

    // Efficient Solution
    // Time : O(n)
    public static int getWaterEff(int[] arr) {
        int res = 0, n = arr.length;
        // Declaring left max and right max arrays
        int[] lMax = new int[n];
        int[] rMax = new int[n];

        // Setting up aux space (leftMax array)
        lMax[0] = arr[0];
        for(int i=1; i<n; i++)
            lMax[i] = Math.max(arr[i], lMax[i-1]);

        // Setting up aux space (rightMax array)
        rMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--)
            rMax[i] = Math.max(arr[i], rMax[i+1]);

        // Getting trapped water
        for(int i=1; i<n-1; i++)
            res += (Math.min(lMax[i], rMax[i]) - arr[i]);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getWaterNaive(new int[] {2,0,2}));
        System.out.println(getWaterEff(new int[] {3,0,1,2,5}));
    }
}
