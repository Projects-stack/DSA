package recursion;

public class TowerOfHanoi {
    public static void toh(int n, char a, char b, char c) {
        if(n == 1) {
            System.out.println("Move 1 from " + a + " to " + c);
            return;
        }
        toh(n-1, a, c, b);
        System.out.println("Move " + n + " from " + a + " to " + c);
        toh(n-1, b, a, c);
    }

    public static void main(String[] args) {
        toh(3, 'A', 'B', 'C');
    }
}
