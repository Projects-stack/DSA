package mathematics;

public class LCM {

    // Naive Solution
    // Time : O(a * b - max(a, b))
    public static int lcmNaive(int n1, int n2) {
        int res = Math.max(n1, n2);
        while(true) {
            if((res % n1) == 0 && (res % n2) == 0) {
                return res;
            }
            res++;
        }
    }

    // lcm * hcf = n1 * n2;
    // Time : O(log(min(a,b)))
    public static int lcmEff(int n1, int n2) {
        return (n1 * n2) / GCD.gcdEfficient(n1, n2);
    }

    public static void main(String[] args) {
        System.out.println(lcmEff(6,4));
        System.out.println(lcmNaive(6,4));
    }
}
