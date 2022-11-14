import java.util.HashSet;

/* WAP TO REMOVE DUPLICATES FROM ARRAY

Unsorted array = {1,3,4,5,1,2,3,4,7,8,3}

*/
public class QnSelf3 {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        int[] array = { 1, 3, 4, 5, 1, 2, 3, 6, 9, 9, 5, 4, 7, 8, 3 };

        for (int i = 0; i < array.length; i++) {

            hs.add(array[i]);
        }

        for (int newArray : hs) {
            System.out.print(newArray + " ");
        }

    }

}
