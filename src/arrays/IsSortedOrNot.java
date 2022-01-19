package arrays;

public class IsSortedOrNot {

    // Time : O(n^2)
    public static boolean isSortedNaive(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }

    // Time : O(n)
    public static boolean isSortedEff(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Naive
        System.out.println(isSortedNaive(new int[] {8, 10, 10, 12, 15}));
        System.out.println(isSortedNaive(new int[] {8, 10, 100, 12, 150}));

        // Efficient
        System.out.println(isSortedEff(new int[] {8, 10, 10, 12, 15}));
        System.out.println(isSortedEff(new int[] {8, 10, 100, 12, 150}));
    }
}
