package arrays;

public class LargestElement {
    public static int getLargest(int[] arr) {
        int res = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > arr[res])
                res = i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(getLargest(arr));
        arr = new int[] {50, 10, 20, 15 , 30 , 45, 70, 15};
        System.out.println(getLargest(arr));
    }
}
