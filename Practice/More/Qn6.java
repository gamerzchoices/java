//Write a java program to create LinkedList of 7 people’s names. Sort them in descending order and print all person’s details.

import java.util.LinkedList;
import java.util.Collections;

public class Qn6 {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();

        names.add("Ashish");
        names.add("Manish");
        names.add("Sunil");
        names.add("Bibash");
        names.add("Prabin");
        names.add("Pratyus");
        names.add("Sindhu");

        Collections.sort(names, Collections.reverseOrder());

        for (String i : names) {
            System.out.println(i);
        }

    }

}
