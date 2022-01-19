package arrays;

public class MinimumConsecutiveFlips {

    // Time : O(n)
    public static void printGroups(boolean[] arr) {
        int n=arr.length;
        for(int i=1; i<n; i++) {
            if(arr[i] != arr[i-1]) {
                if(arr[i] != arr[0])
                    System.out.print("From " + i + " to ");
                else {
                    System.out.print(i-1);
                    System.out.println();
                }
            }
        }
        if(arr[n-1] != arr[0])
            System.out.print(n-1);
    }

    public static void main(String[] args) {
        printGroups(new boolean[] {false, false, true, true, false, false, true, true, false});
    }
}
