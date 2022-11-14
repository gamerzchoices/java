//Write a java program to create an enum class for gender [male, female, others] and print all values.

enum Gender {
    male, female, other
}

public class Qn3 {
    public static void main(String[] args) {

        for (Gender printDetails : Gender.values()) {
            System.out.println(printDetails);
        }

    }
}

class Human {
    Gender gender;
}