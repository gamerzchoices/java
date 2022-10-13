/*ENUM-  is a class used to represents a group of constants

enum VariableName{constant1, constant2,.... ,constant n};


 */

enum Gender {
    male, female, other
}

public class Enum {
    public static void main(String[] args) {

        Human h1 = new Human();
        h1.gender = Gender.male;
        h1.name = "Ramesh";
        System.out.println(h1.name);
        System.out.println(h1.gender);

        System.out.println();

        // FOR PRINITING ALL ENUM VALUES
        for (Gender gV : Gender.values()) {
            System.out.println(gV);
        }
    }

}

class Human {
    String name;
    Gender gender;
}
