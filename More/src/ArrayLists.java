/* ARRAYLIST-adding or removing items anytime


Methods	                                Description
names.get(0);	                        Get item at index 0.
names.set(0);	                        Set item at index 0.
names.remove(0);                        Removes item at index 0.
names.clear();	                        Clear all items of array.
names.size();	                        To get size of an array.
Collections.sort(names);                Sort ascending   
Collections.sort(names, Collections.    Sort decending
reverseOrder());                        
 */

import java.util.ArrayList;
import java.util.Collections; // FOR SORTING

public class ArrayLists {
    public static void main(String[] args) {

        // ARRAY LIST SYNTAX
        ArrayList<String> list = new ArrayList<String>();

        // Adding elements
        list.add("Ram");
        list.add("Hari");
        list.add("Sarita");
        list.add("Umanga");

        System.out.println(list);

        // Removing elements
        list.remove("Sarita");
        System.out.println(list);

        // Finding element
        System.out.println(list.get(2));

        // Replacing element
        list.set(1, "Upahar");
        System.out.println(list);

        // Size of array
        System.out.println(list.size());

        // Sorting ascending

        Collections.sort(list);

        for (String ascending : list) {
            System.out.println(ascending);
        }

        // Sorting decending

        Collections.sort(list, Collections.reverseOrder());

        for (String reverse : list) {
            System.out.println(reverse);
        }
    }

}
