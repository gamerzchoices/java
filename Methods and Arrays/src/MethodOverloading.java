/* METHOD OVERLAODING CAN DONE BY

 1 Changing number of parameters
 2 Changing datatype of parameter
 
 */

public class MethodOverloading {
    public static void main(String[] args) {
        // mul(10, 4, 8);
        mul(12.1, 14);

    }

    public static void mul(int num1, int num2) {
        System.out.println("Multiplication is " + (num1 * num2));
    }

    /*
     * WE CAN'T RE-WRITE SAME METHOD
     * 
     * public static void mul(int num1, int num2) {
     * System.out.println("Multiplication is " + (num1 * num2));
     * }
     * 
     */

    // Changing number of parameters
    public static void mul(int x, int y, int z) {
        System.out.println("Multiplication is " + (x * y * z));
    }

    // Changing datatype of parameter
    public static void mul(double num1, int num2) {
        System.out.println("Multiplication is " + (num1 * num2));
    }
}
