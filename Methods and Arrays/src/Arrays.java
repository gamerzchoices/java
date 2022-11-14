/* ARRAYS - Linear data structure where similar kinds of datas are stored.

Syntax:
datatype[] arrayName

 */

public class Arrays {

    public static void main(String[] args) {

        String[] familyMembers = { "Praways", "Aayush", "Sanu", "Jay" };

        // TO ACCESS SINGLE ITEM FROM AN ARRAY
        System.out.println(familyMembers[0]);

        // TO ACCESS ALL ITEMS FROM AN ARRAY

        for (int i = 0; i < familyMembers.length; i++) {

            System.out.println(familyMembers[i]);

        }

        // TO ACCESS ALL ITEMS FROM AN ARRAY USING FOREACH LOOP

        for (String names : familyMembers) {
            System.out.println(names);
        }

        // LENGTH
        System.out.println("Length is  " + familyMembers.length);

        // REPLACE ITEM

        familyMembers[0] = "Prabesh";
        System.out.println(familyMembers[0]);

    }

}
