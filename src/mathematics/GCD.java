package mathematics;

public class GCD {

    // Naive Solution
    // Time : O(min(a,b))
    public static int gcdNaive(int a, int b) {
        int res = Math.min(a, b);
        while(res > 0) {
            if((a % res == 0) && (b % res == 0))
                break;
            res--;
        }
        return res;
    }

    //Euclidean Algorithm
    public static int gcdEuclidean(int a, int b) {
        while(a != b) {
            if(a > b)
                a = a-b;
            else
                b = b-a;
        }
        return a;
    }

    // Efficient approach
    public static int gcdEfficient(int a, int b) {
        while(b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    // Recursive approach
    public static int gcdRecursive(int a, int b) {
        if(b == 0)
            return a;
        else
            return gcdRecursive(b, a%b);
    }

    public static void main(String[] args) {
        System.out.print("GCD of 100 & 175 is : ");
        System.out.println(gcdNaive(100, 175));
        System.out.println(gcdEuclidean(100, 175));
        System.out.println(gcdEfficient(100, 175));
        System.out.println(gcdRecursive(100, 175));
    }
}
