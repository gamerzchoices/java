//Write a program in Java to join two arrays.

public class Qn7 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 5, 6, 7, 8, 9, 0 };

        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
        int arr3Len = arr1Len + arr2Len;

        int[] arr3 = new int[arr3Len]; // CREATED NEW ARRAY

        for (int i = 0; i < arr1Len; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2Len; i++) {
            arr3[arr1Len + i] = arr2[i];
        }
        for (int i = 0; i < arr3Len; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
