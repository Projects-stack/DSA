package arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSorted {

    // Time : O(n)
    // Aux Space : O(n)
    public static int remDups(int[] arr) {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int res = 1;
        for(int i = 1; i < arr.length; i++) {
            if(temp[res-1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }
        if (res >= 0) System.arraycopy(temp, 0, arr, 0, res);
        return res;
    }

    // Time : O(n)
    // Aux Space : O(1)
    public static int remDupsEff(int[] arr) {
        int res = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[res-1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // Using temp array
        int[] arr = new int[] {10, 20, 20, 30, 30, 30, 30};
        int size = remDups(arr);
        for(int i=0; i<size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        // Efficient solution
        arr = new int[] {10, 10, 10};
        size = remDups(arr);
        for(int i=0; i<size; i++)
            System.out.print(arr[i] + " ");
    }
}
