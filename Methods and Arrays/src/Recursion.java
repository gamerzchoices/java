/* RECURSION -  when method calls itself inside its body */

// WAP TO FIND FACTORIAL
public class Recursion {

    public static void main(String[] args) {
        int temp = fact(5);
        System.out.println("Factorial is " + temp);

    }

    public static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
}
// 5 * 4 * 3 * 2 * 1 * 1