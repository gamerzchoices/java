/*WAP TO REMOVE DUPLICATES FROM ARRAY AND STORE IN NEW ARRAY

Sorted array = {1,2,3,4,5};

*/
public class QnSelf1 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 2, 2, 3, 4, 5, 5, 6, 6, 7 };
        int[] temp = new int[array.length]; // CREATED NEW ARRAY

        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] != array[i + 1]) {
                temp[j] = array[i];
                j++;
            }
            // i= 0 1 2 3 4 5 6 7 8 9 10
            // j= 0 1 1 1 2 3 4 4 5 5 6
            // temp = 1 2 3 4 5 6
        }
        temp[j] = array[array.length - 1];
        // i= 0 1 2 3 4 5 6 7 8 9 10
        // j= 0 1 1 1 2 3 4 4 5 5 6
        // temp = 1 2 3 4 5 6 7 0 0 0 0

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

    }

}