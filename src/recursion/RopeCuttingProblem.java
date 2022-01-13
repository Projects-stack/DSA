package recursion;

import java.sql.Time;

public class RopeCuttingProblem {
    /*
    * n = length of rope
    * a, b, c = length of pieces that we can cut from given rope
    * Find maximum cuts possible on rope of length n
    *
    * Sample Input1 : n=5, a=2, b=5, c=1
    * Expected Output : 5
    * (we can make 5 pieces of length 1 each)
    *
    * Sample Input2 : n=5, a=4, b=2, c=6
    * Expected Output : -1
    * (not possible)
    *
    */

    // Time : O(3 ^ n)
    public static int maxPieces(int n, int a, int b, int c) {
        if(n == 0)
            return 0;
        if(n < 0)
            return -1;
        int res = max(maxPieces((n-a), a, b, c), maxPieces((n-b), a, b, c),
                      maxPieces((n-c), a, b, c));
        if(res == -1)
            return -1;
        return (res+1);
    }

    private static int max(int x, int y, int z) {
        if(x > y && x > z)
            return x;
        else if(y > x && y > z)
            return y;
        else
            return z;
    }

    public static void main(String[] args) {
        System.out.println(maxPieces(5, 2, 5, 1));
        System.out.println(maxPieces(23, 12, 9, 11));
        System.out.println(maxPieces(5, 4, 2, 6));
    }
}
