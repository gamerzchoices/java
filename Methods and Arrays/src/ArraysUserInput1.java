// WAP TO PRINT NAMES AND AGE OF PEOPLE
public class ArraysUserInput1 {
    public static void main(String[] args) {
        String[] names = { "Rajesh", "Suhsant", "Upahar", "Shraddha" };
        int[] ages = { 20, 32, 23, 12 };

        // CHECK FIRST IF NAMES AND AGES SIZE IS EQUAL
        System.out.println(names.length == ages.length);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "'s " + "age is " + ages[i]);
        }
    }
}