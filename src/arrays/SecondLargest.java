package arrays;

public class SecondLargest {

    // Time : O(n)
    // Two traversals
    public static int getSecondLargestNaive(int[] arr) {
        int largest = LargestElement.getLargest(arr);
        int res = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != arr[largest]) {
                if(res == -1)
                    res = i;
                else if(arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }

    // Efficient Solution
    // Single Traversal
    // Time : O(n)
    public static int getSecondLargestEff(int[] arr) {
        int res = -1, largest = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            }

            else if(arr[i] != arr[largest]) {
                if(res == -1 || arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getSecondLargestNaive(new int[] {1, 2, 5, 8, 1000, 3, 500}));
        System.out.println(getSecondLargestEff(new int[] {10, 50, 100, 5, 25}));
    }
}
