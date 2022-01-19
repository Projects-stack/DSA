package arrays;

import java.util.Arrays;

public class LeftRotateArray {

    // Rotate array by 1
    // Time : O(n)
    public static void leftRotateBy1(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        System.arraycopy(arr, 1, arr, 0, n - 1);
        arr[n-1] = temp;
    }

    // Rotate array by d-elements
    // Naive Solution
    // Time : O(nd)
    public static void leftRotateByDNaive(int[] arr, int d) {
        for(int i=0; i<d; i++)
            leftRotateBy1(arr);
    }

    // Rotate array by d-elements
    // Temporary array approach (Better solution)
    // Time : O(n) & Aux Space : O(d)
    public static void leftRotateByDTempArray(int[] arr, int d) {
        int[] temp = new int[d];
        for(int i=0; i<d; i++)
            temp[i] = arr[i];
        for(int i=d; i<arr.length; i++)
            arr[i-d] = arr[i];
        for(int i=0; i<d; i++)
            arr[arr.length-d+i] = temp[i];
    }

    // Efficient Solution
    // Reversal algorithm
    // Time : O(n) & Aux Space : O(1)
    public static void leftRotateByDEff(int[] arr, int d) {
        ReverseArray.reverse(arr, 0, d-1);
        ReverseArray.reverse(arr, d, arr.length-1);
        ReverseArray.reverse(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {

        // Left rotate by 1
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        leftRotateBy1(arr);
        System.out.println("Left rotate by 1 : " + Arrays.toString(arr));

        // Left rotate by d (Naive)
        arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        leftRotateByDNaive(arr, 3);
        System.out.println("Left rotate by d (Naive) : " + Arrays.toString(arr));

        // Left rotate by d (Using Temporary array)
        arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        leftRotateByDTempArray(arr, 5);
        System.out.println("Left rotate by d (Using Temporary array) : " + Arrays.toString(arr));

        // Left rotate by d (Reversal Algorithm)
        arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        leftRotateByDEff(arr, 7);
        System.out.println("Left rotate by d (Reversal Algorithm) : " + Arrays.toString(arr));
    }
}
