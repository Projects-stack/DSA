package arrays;

public class MajorityElement {

    // Naive Solution
    // Time : O(n^2)
    public static int findMajorityNaive(int[] arr) {
        int n=arr.length;
        for(int i=0; i<n; i++) {
            int count = 1;
            for(int j=i+1; j<n; j++) {
                if(arr[i] == arr[j])
                    count++;
            }
            if(count > n/2)
                return i;
        }
        return -1;
    }

    // Efficient Solution
    // Time : O(n)
    public static int findMajorityEff(int[] arr) {
        int res = 0, count = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[res] == arr[i])
                count++;
            else
                count--;
            if(count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int j : arr) {
            if (arr[res] == j)
                count++;
        }
        if(count <= arr.length/2)
            res = -1;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findMajorityNaive(new int[] {8, 3, 4, 8, 8}));   // any index of 8
        System.out.println(findMajorityNaive(new int[] {20, 30, 40, 50, 50, 50, 50}));  // any index of 50
        System.out.println(findMajorityEff(new int[] {3, 7, 4, 7, 7, 5}));  // -1
    }
}
