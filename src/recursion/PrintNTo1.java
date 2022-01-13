package recursion;

public class PrintNTo1 {
    public static void printNTo1(int n) {
        if(n == 0)
            return;
        System.out.print(n + " ");
        printNTo1(n-1);
    }

    public static void print1ToN(int n) {
        if(n == 0)
            return;
        print1ToN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        print1ToN(5);
        System.out.println();
        printNTo1(5);
    }
}
