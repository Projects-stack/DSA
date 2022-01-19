package arrays;

import java.util.Arrays;

public class MoveAllZerosToEnd {

    // Naive Solution
    // Time : O(n^2)
    public static void moveToEndNaive(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            if(arr[i] == 0) {
                for(int j=i+1; j<n; j++) {
                    if(arr[j] != 0) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
        }
    }

    // Efficient Solution
    // Time : O(n)
    public static void moveToEndEff(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {

        // Naive Solution
        int[] arr = new int[] {8,5,0,10,0,20,4,0,6};
        moveToEndNaive(arr);
        System.out.println(Arrays.toString(arr));

        // Efficient Solution
        arr = new int[] {10,5,0,0,8,0,9,0,11,0,0,13};
        moveToEndEff(arr);
        System.out.println(Arrays.toString(arr));
    }
}
