import java.util.LinkedList;

/* LINKLIST - MANIPULATE DATA 


In searching, LinkedList is slow, and in data manipulation /change, ArrayList is slow.

Methods	                Description
names.addFirst();	    Add item at index 0.
names.addLast();	    Add item to last of list.
names.removeFirst();    Remove item at index 0.
names.removeLast();	    Remove item at end of list.
names.getFirst();	    Get first item of list.
names.getLast();	    Get last item of list.
names.size();	        Total number of items.
*/

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        // Adding elements
        list.add("Ram");
        list.add("Hari");
        list.add("Sarita");
        list.add("Umanga");

        // Adding last element

        list.addLast("Rupa");
        System.out.println(list);

        // Removing first element
        list.removeFirst();
        System.out.println(list);

        // Getting

        System.out.println(list.getFirst());

    }
}
