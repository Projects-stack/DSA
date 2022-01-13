package recursion;

public class RecursionBasics {
    /*
    *   Recursion : A function calls itself directly or indirectly.
    *
    *   1) Direct Recursion
    *   void fun1(...) {
    *       ....
    *       ....
    *       fun1(...);
    *       ....
    *   }
    *
    *   2) Indirect Recursion
    *   void fun1(...) {        void fun2(...) {
    *       ....                    ....
    *       ....                    ....
    *       fun2(...);              fun1(...);
    *       ....                    ....
    *   }
    *
    *   -> Typical structure of recursion function
    *   .... fun(...) {
    *       Base cases
    *       ......
    *       Recursive Call (i.e. call to fun(...))
    *       with at least one change in parameter
    *       ......
    *   }
    *
    *   -> Applications of Recursion
    *       1) Many algorithm techniques are based on recursion
    *           a) Dynamic Programming
    *           b) Backtracking
    *           c) Divide & Conquer Algorithms such as (Binary Search,
    *                          Quick Sort, Merge Sort)
    *
    *       2) Many problems inherently recursive
    *           a) Tower of Hanoi
    *           b) DFS based traversals (DFS of graph & Inorder, Preorder or Postorder
    *                           traversal of tree)
    *
    *   -> Tail Recursion
    *
    *       (*) A function is called tail recursive when the last thing happens
    *   in the function is recursive call.
    *       (*) This takes less time on modern compiler because it is tail recursive
    *
    *           // Print from n to 1
    *           // Tail recursive:
    *           void fun(int n) {
    *               start:
    *               if(n == 0)
    *                   return;
    *               print(n);
    *               fun(n-1);  // n = n-1;
    *                          // goto start;
    *           }
    *
    *           // print from 1 to n        // Equivalent tail recursion
    *           void fun(int n) {           void fun(int n, int k) {
    *               if(n == 0)                  if(n == 0)
    *                   return;                     return;
    *               fun(n-1);                   print(k);
    *               print(n);                   fun(n-1, k+1);
    *           }                           }
    *
    *
    *
    * */

    public static void main(String[] args) {

    }
}
