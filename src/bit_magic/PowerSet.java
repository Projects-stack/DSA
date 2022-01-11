package bit_magic;

public class PowerSet {

    // Using set bits logic to print power set
    // Time : O((2^n) * n)

    /*
        power set of abc :
            a           001
            b           010
            c           100
            a b         110
            a c         101
            b c         011
            a b c       111
    */
    public static void printPowerSet(String str) {
        int n = str.length();
        double powSize = Math.pow(2, n);
        for(int counter = 0; counter < powSize; counter++) {
            for(int j=0; j<n; j++) {
                if((counter & (1 << j)) != 0)
                    System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPowerSet("abc");
    }
}
