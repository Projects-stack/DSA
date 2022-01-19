package arrays;

import java.util.Arrays;

public class ArrayOperations {

    // Time : O(n)
    public static int search(int[] arr, int x) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    // Time : O(n)
    public static int insert(int[] arr, int x, int cap, int pos) {
        int n = arr.length;
        if(cap == 0)
            return n;
        int index = pos - 1;
        for(int i=n-2; i>=index; i--)
            arr[i+1] = arr[i];
        arr[index] = x;
        return n+1;
    }

    // Time : O(n)
    public static int deleteEle(int[] arr, int x) {
        int i, n = arr.length;
        for(i=0; i < n; i++) {
            if(arr[i] == x)
                break;
        }
        if(i == arr.length)
            return n;
        for(int j=i; j<n-1; j++)
            arr[j] = arr[j+1];
        return n-1;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        // Insertion
        insert(arr, 1, 9, 1);
        insert(arr, 2, 8, 2);
        insert(arr, 3, 7, 3);
        insert(arr, 4, 6, 4);
        insert(arr, 5, 5, 5);
        insert(arr, 10, 4, 2);

        System.out.println(Arrays.toString(arr));

        // Deletion
        deleteEle(arr, 10);
            System.out.println(Arrays.toString(arr));

        // Search
        System.out.print("Searching : " + search(arr, 5) + " " + search(arr, 11));
    }
}
