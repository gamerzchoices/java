//Write a program in Java to check array contains a given value or not.

public class Qn8 {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 3, 5, 4, 4, 5, 5, 34, 56, 24, 54, 65 };
        int num = 65;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                temp = temp + 1;
                break;
            }

        }
        if (temp == 0) {
            System.out.println("Element not found in array.");

        } else {
            System.out.println("Element found in array.");
        }
    }
}
