package bit_magic;

public class BitwiseOperators {
    public static void main(String[] args) {

        int x = 3;  // 0011
        int y = 6;  // 0110

        // Bitwise AND
        System.out.println("x & y : " + (x & y));   // 0010

        // Bitwise OR
        System.out.println("x | y : " + (x | y));   // 0111

        // Bitwise eXOR
        System.out.println("x ^ y : " + (x ^ y));   // 0101

        // Bitwise NOT
        // Flip the bits
        System.out.println("~x : " + ~x);   // 1......1100

        // Bitwise Left Shift
        // Move all the bits by specified number to the left append zeros at the end
        // x = 0011
        // x << 1 = 0...000110
        // x << 2 = 0...001100
        // x << 3 = 0...011000
        System.out.println("x << y : " + (x << y)); // 0...011000000

        // Bitwise Right Shift
        // Move all the bits by specified number to the right append zeros at the beginning
        // Two types of right shift :
        //                  1. Signed right shift
        //                  2. Unsigned right shift;
        // Suppose, y = 111...10
        // y >> 2 = 111...11    // Signed right shift
        // y >>> 2 = 00111..11  // Unsigned right shift
        System.out.println("y >> 2 : " + (y >> 2)); // 0...0001
    }
}
