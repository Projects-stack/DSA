package recursion;

public class JosephusProblem {

    /*
    *   There are n people standing in a circle waiting to be executed. The counting out
    * begins at some point in the circle in a fixed direction. In each step, a certain
    * number of people are skipped and the next person is executed. The elimination proceeds
    * around the circle (which is becoming smaller and smalled as the executed people are
    * removed), until only the last person remains, who is given freedom.
    *   Given the total number of persons n and a number k which indicates that k-1 persons
    * are skipped and kth person is killed in a circle.
    *
    * 1) The task is to find last one standing if we start from 0
    *
    * Sample input : n=7, k=3
    * Expected output : 3
    *
    * Sample input : n=8, k=2
    * Expected output : 0
    *
    * */
    public static int josStartingFrom0(int n, int k) {
        if(n == 1)
            return 0;
        else
            /*  The position returned by josephus(n - 1, k)
                is adjusted because the recursive call
                josephus(n - 1, k) considers the
                original position k % n + 1 as position 1 */
            return ((josStartingFrom0(n-1, k) + k) % n);
    }

    public static void main(String[] args) {
        // Last one standing when starting point is 0
        System.out.println(josStartingFrom0(7,3));
        System.out.println(josStartingFrom0(5,2));

    }
}
