/*WAP TO REMOVE DUPLICATES FROM ARRAY AND STORE IN SAME ARRAY

Sorted array = {1,2,3,4,5};

*/

public class QnSelf2 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 3, 4, 4, 5 };
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j] = array[i];
                j++;

            }
            // i = 0 1 2 3 4 5 6
            // j = 0 1 2 2 3 3 4
            // a = 1 2 3 4

        }
        array[j] = array[array.length - 1];
        // i = 0 1 2 3 4 5 6
        // j = 0 1 2 2 3 3 4
        // a = 1 2 3 4 5

        for (int i = 0; i < j + 1; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
