package arrays;

public class FrequenciesInSortedArray {
    // Time : Theta(n)
    public static void printFreq(int[] arr) {
        int freq = 1, i = 1, n = arr.length;
        while(i < n) {
            while(arr[i] == arr[i-1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " " + freq);
            i++;
            freq = 1;
        }
        if(n == 1 || arr[n-1] != arr[n-2])
            System.out.println(arr[n-1] + " " + 1);
    }

    public static void main(String[] args) {
        printFreq(new int[] {10,10,10,25,30,30,40});
    }
}
