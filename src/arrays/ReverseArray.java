package arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] arr,int low,int high) {
        while(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {30, 7, 6, 5, 10};
        reverse(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
