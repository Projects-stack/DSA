package arrays;

public class LeadersInArray {

    // Naive Solution
    // Time : O(n^2)
    public static void leadersNaive(int[] arr) {
        System.out.print("Leaders in array are : ");
        for(int i=0; i<arr.length - 1; i++) {
            boolean flag = false;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.print(arr[i] + " ");
        }
        System.out.print(arr[arr.length-1] + "\n");
    }

    // Efficient Solution
    // Time : O(n)
    public static void leadersEff(int[] arr) {
        int n = arr.length;
        int currLeader = arr[n-1];
        System.out.print("Leaders in array are : " + arr[n-1] + " ");
        for(int i=n-2; i>=0; i--) {
            if(currLeader < arr[i]) {
                currLeader = arr[i];
                System.out.print(currLeader + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        leadersNaive(new int[] {7,10,4,3,6,5,2,5,4});
        leadersEff(new int[] {10,20,30});
        leadersEff(new int[] {30,20,10});
    }
}
