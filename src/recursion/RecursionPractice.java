package recursion;

public class RecursionPractice {

    public static void fun1(int n) {
        if(n == 0)
            return;
        System.out.print(n + " ");
        fun1(n-1);
        System.out.print(n + " ");
    }

    public static void fun2(int n) {
        if(n == 0)
            return;
        fun2(n-1);
        System.out.print(n + " ");
        fun2(n-1);
    }

    public static int fun3(int n) {
        if(n == 1)
            return 0;
        else
            return 1 + fun3(n/2);
    }

    public static void main(String[] args) {
        fun1(3);    // 3 2 1 1 2 3
        System.out.println();
        fun2(3);    // 1 2 1 3 1 2 1
        System.out.println();
        System.out.print(fun3(16));   // 4
        System.out.println();
    }
}
