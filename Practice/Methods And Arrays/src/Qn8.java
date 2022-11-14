//Write a program in Java to check array contains a given value or not.

public class Qn8 {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 3, 5, 4, 4, 5, 5, 34, 56, 24, 54, 65 };
        int num = 35;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("Element found in array.");

        } else {
            System.out.println("Element not found in array.");
        }
    }
}
