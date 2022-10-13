/* RECURSION -  when method calls itself is called recursion */

// WAP TO FIND FACTORIAL
public class Recursion {

    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println(fact);

    }

    public static int factorial(int num) {
        if (num > 0) {
            return num * factorial(num - 1);
        } else {
            return 1;
        }
    }
}
// 5 * 4 * 3 * 2 * 1 * 1