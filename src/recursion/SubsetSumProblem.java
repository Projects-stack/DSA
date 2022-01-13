package recursion;

/*
    * Subsets of {1, 2, 3} are :
    *   {}, {1}, {2}, {3}, {1,2}, {1,3}, {2,3}, {1,2,3}
    *
    * I/P : {10, 5, 2, 3, 6}
    *       sum = 8
    * O/P : 2
    *
    * I/P : {10, 2, 15}
    *       sum = 37
    * O/P : 0
    *
*/

public class SubsetSumProblem {
    public static int countSubSets(int[] arr, int n, int sum) {
        if(n == 0)
            return (sum == 0) ? 1 : 0;
        return countSubSets(arr, n-1, sum) + countSubSets(arr, n-1, sum-arr[n-1]);
    }

    public static void main(String[] args) {
        int res = countSubSets(new int[] {10, 20, 15}, 3, 25);
        System.out.println(res);

        System.out.println(countSubSets(new int[] {10, 5, 2, 3, 6}, 5, 8));
    }
}
